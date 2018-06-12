 <%@ taglib prefix="s" uri="/struts-tags" %>
    
   <s:form action="abcs"/>
   <s:combobox name="platform" label="Select Platform" list="{'Select option','Windows','Linux'}" headerKey="-1"/>
   <s:submit value="Submit"/>
   