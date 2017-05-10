package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletRedirectResult;

@Result(name = "profile", value = "profile.action", type = ServletRedirectResult.class)

public class MainAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	public String userId;
	public String sendDate;
	public String comment;

	private String getDefaultDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd k:m:s");
		return sdf.format(date);
	}

	private String getDefaultMessage(){
		return "Hello !\nMy Name is " + this.userId;
	}

	public String execute() throws Exception {
		this.userId = (String)this.sessionMap.get("userId");
		this.sendDate = getDefaultDate();
		this.comment = getDefaultMessage();
		return "success";
	}

	public String resetDate() throws Exception {
		this.sendDate = getDefaultDate();
		return "success";
	}

	public String resetComment() throws Exception {
		this.comment = getDefaultMessage();
		return "success";
	}

	public String send() throws Exception{
		this.userId = "User is [ " + this.userId + " ]";
		this.sendDate = "Date is [ " + this.sendDate + " ]";
		this.comment = "Comment is [ " + this.comment + " ]";
		return "send";
	}

	public String gotoProfile() throws Exception{
		return "profile";
	}

}
