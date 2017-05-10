<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"/>
<div class="result">
	<div class="col-sm-6">
		<h3>Result</h3>
		<dl class="result">
			<dt>USER:</dt>
			<dd><s:property value="userId" /></dd>
			<dt>DATE:</dt>
			<dd><s:property value="sendDate" /></dd>
			<dt>COMMENT:</dt>
			<dd><s:property value="comment" /></dd>
		</dl>
	</div>
	<div class="col-sm-6">
		<h3>Reference Method</h3>
		<dl>
			<dt>s:property value="comment"</dt>
			<dd><s:property value="comment" /></dd>
			<dt>s:property value="%{comment}"</dt>
			<dd><s:property value="%{comment}" /></dd>
			<dt>request.getAttribute("comment")</dt>
			<dd><%=request.getAttribute("comment") %></dd>
			<dt>request.getParameter("comment")</dt>
			<dd><%=request.getParameter("comment") %></dd>
		</dl>
	</div>
	<p><a href="main.action">Back</a></p>


</div>
<jsp:include page="footer.jsp"/>
