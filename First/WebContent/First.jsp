

<%@ taglib prefix="s" uri="/struts-tags" %>  
   <s:textfield name="username" label=" User Name" size="15"/>
    <s:password name="password" label="Password" size="15"/>
    <s:textfield label="Address" name="address" cols="40" rows="10"/>
     <s:checkboxlist name="skill" label="Your Interest" list="{'Java','C'}"/>
     <s:submit value="submit"/>
    
   
 