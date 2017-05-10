<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"/>

<s:form cssClass="form-horizontal">
	<div class="form-group">
		<label class="col-sm-2 control-label">USER:<br/>
			<s:submit method="gotoProfile" value="PROFILE" cssClass="btn btn-primary btn-xs"/>
		</label>
		<div class="col-sm-10">
			<s:textfield name="userId" cssClass="form-control"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">DATE:<br/>
			<s:submit method="resetDate" value="RESET" cssClass="btn btn-success btn-xs"/>
		</label>
		<div class="col-sm-10">
			<s:textfield name="sendDate" cssClass="form-control" rows="10"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">COMMENT:<br/>
			<s:submit method="resetComment" value="RESET" cssClass="btn btn-success btn-xs"/>
		</label>
		<div class="col-sm-10">
			<s:textarea name="comment" cssClass="form-control" rows="10"/>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<s:submit method="send" value="SEND" cssClass="btn btn-primary"/>
		</div>
	</div>
</s:form>
<jsp:include page="footer.jsp"/>
