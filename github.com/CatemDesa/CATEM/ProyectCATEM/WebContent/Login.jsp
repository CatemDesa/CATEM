<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="LoginAction">     
	<s:textfield name="username" label="Username" />
    <s:password name="password" label="Password" />
    <s:submit value="Enviar" />       
</s:form>