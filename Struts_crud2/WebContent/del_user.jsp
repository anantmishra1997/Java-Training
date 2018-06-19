<%@taglib prefix="s" uri="/struts-tags"%>
<center>
<h1>List of Users</h1>
<table border="10">
<tr>
<th>Username</th>
<th>Password</th>
</tr>
<s:iterator id="u" value="#request['mydata']">
<tr>
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
<td><s:url id="v" action="deluser1">
<s:param name="u">
<s:property value="id"></s:property>
</s:param>
</s:url>
<s:a href="%{v}">Delete</s:a></td></tr>
</s:iterator>
</table>
</center>