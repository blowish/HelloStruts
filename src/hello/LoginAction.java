package hello;


import org.apache.struts2.config.Result; //アノテーション用 (@result)
//import org.apache.struts2.config.Results; //アノテーション用 (@results)
import org.apache.struts2.dispatcher.ServletRedirectResult;

/*
 * [アノテーション]
 * このクラスのメソッドが実行された際、 return値によって対応したアクションに振り分ける
 * 今回はmainだった場合、main.actionに飛ぶように設定している。
 */
@Result(name = "main", value = "main.action", type = ServletRedirectResult.class)

/*
 * [アノテーション]
 * 下記は、遷移先が複数の場合の書き方
 * returnがmainの場合は、main.actionに飛ぶ(MainAction.java)
 * returnがresetの場合は、reset.actionに飛ぶ(ResetAction.java)
 * success,errorなどはなくても大丈夫。
 *
 */
/*
@Results({
	@Result(name = "main", value = "main.action", type = ServletRedirectResult.class),
	@Result(name = "reset", value = "reset.action", type = ServletRedirectResult.class)
})
*/

public class LoginAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	// このアクションの変数とjspのname属性はリンクしている。
	// 同じ名前にしないと値を受け取れないしJSPに返せない。
	public String errmsg;
	public String userId;
	public String password;

	/*
	 * このアクションのアクション名.actionでアクセスした時に実行さる。
	 * 例) http://localhost:8080/login.action
	 * ユーザー名に"Struts2"を設定する。
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		this.sessionMap.put("userId", null);
		this.userId = "Struts2";

		// "アクション名" + return値-.jsp(login-success.jsp) を探すが、見つからないのでlogin.jsp の呼び出される。
		return "success";

	}

	/*
	 * LOGINボタンが押下された時に呼び出される。
	 * パスワードのテキストボックスに"pass"の文字列が入力されいる場合に
	 * アノテーション設定されたアクションに遷移する。※今回は(main.action)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings("unchecked")
	public String login() throws Exception {

		//パスワードのテキストボックスに"pass"以外の文字列が入力されいる場合は
		//このクラスのexecuteメソッドが呼び出され、
		if(this.password == null || !this.password.equals("pass")){
			this.password = null;
			this.errmsg = "PASSWORDは「pass」と入力してください";
			return "error";
		}
		this.sessionMap.put("userId", this.userId);
		return "main";
	}

}