<%@ page language="java" pageEncoding="gbk"%>
<%@ page contentType="application/msword" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- 
Wordֻ��Ҫ��contentType="application/msexcel"��ΪcontentType="application/msword" 
--%>
<%   
  //������excel���   
 response.setHeader("Content-disposition","attachment; filename=MyExcel.xls");   
  
//Ƕ����ie���excel   
  
//response.setHeader("Content-disposition","inline; filename=MyExcel.xls");   
  
//response.setHeader("Content-disposition","inline; filename=MyExcel.doc"); 
%>  
<html>  
<head>  
	<title>���Ե���Excel��Word</title>
</head>  
<body>
  <table width="500" border="1" align="center">
  <tr>  
    <td colspan="7" align="center">�û���Ϣ</td>  
  </tr>  
 	<tr>
         <td>���</td>
         <td>��  ��  ��</td>
         <td>��  ��</td>
         <td>�� �� �� ��</td>
         <td>�û�״̬</td>
         <td>��  ��  ʱ  ��</td>
         <td>��  ע</td>
     </tr>
     <c:forEach items="${data }" var="user">
     	<tr>
     		<td class="userId">${user.userId }</td>
     		<td class="userCode">${user.userCode }</td>
     		<td class="groupId">${user.userGroup.groupName }</td>
     		<td class="userType">${user.role.roleName }</td>
     		<td class="userState">${user.userState==1?"<font color='green'>��  ��</font>":"<font color='red'>��  ��</font>" }</td>
     		<td><fmt:formatDate value="${user.createTime }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
          <td class="caozuo"></td>
     	</tr>
     </c:forEach>
 </table>
 <script>
 	
 
 
 </script>
</body>  
</html>  
