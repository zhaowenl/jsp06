<%@page import="com.sc.bean.Goods"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goodsselect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
       <h1>商品列表</h1>
       <h2>
         <a href="goods.jsp">添加商品</a>
       </h2>
       
       <table border="1" width="80%" style="text-align: center;">
          <tr>
             <th>商品编号</th>
             <th>商品图片</th>
             <th>商品名称</th>
             <th>购买数量</th>
             <th>商品单价</th>
             <th>库存数量</th>
             <th>操作</th>
          </tr> 
          
          <%
            ArrayList<Goods> list= (ArrayList<Goods>)request.getAttribute("list");
            for(int i=0;i<list.size();i++){
               Goods g=list.get(i);
           %>
               <tr>
                  <td>
                     <%=g.getGid() %>
                  </td>
                  <td>
                     <img src="images/<%=g.getGimg() %>" width="88px" height="88px">
                  </td>
                  <td>
                     <%=g.getGname() %>
                  </td>
                  <td>
                     <%=g.getGnum() %>
                  </td>
                  <td>
                     <%=g.getGprice() %>
                  </td>
                  <td>
                     <%=g.getGstock() %>
                  </td>
                  <td>
                     <a href="GoodsDelete?gid=<%=g.getGid() %>" onclick="return window.confirm('是否确定删除？')">删除</a>
                  </td>
               </tr>
          <%} %>
       </table>
    </center>
  </body>
</html>
