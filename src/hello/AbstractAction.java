package hello;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AbstractAction extends ActionSupport implements ServletResponseAware,SessionAware {

	private static final long serialVersionUID = 1L;

	public HttpServletResponse response;

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@SuppressWarnings("rawtypes")
	public Map sessionMap;

	@SuppressWarnings("rawtypes")
	public void setSession(Map sessionMap) {
		this.sessionMap = sessionMap;
	}
}
