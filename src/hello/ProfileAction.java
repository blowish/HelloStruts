package hello;

public class ProfileAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	public String userId;

	public String execute() throws Exception {
		this.userId = (String)this.sessionMap.get("userId");
		return "success";
	}

}
