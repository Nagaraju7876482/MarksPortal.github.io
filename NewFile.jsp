<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
#u{
position:relative;
left:-263px;
top: 280px;
}
#r{

position:relative;
left:660px;
top: 280px;
}
#ri{

position:relative;
left:390px;
}
table, th, td {
  border: 1px solid black;
  text-decoration: blink;
}
table {
position:relative;
	margin-left: 270px

	
}
th {
	color: navy;
}
td {
	color: purple;
}

</style>
</head>
<body>
<img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe1RuAJaYVEh0BNmzR5G6etAri6MkM4PBD_g&usqp=CAU">
<img id="u" alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe1RuAJaYVEh0BNmzR5G6etAri6MkM4PBD_g&usqp=CAU">
<img id="r" alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe1RuAJaYVEh0BNmzR5G6etAri6MkM4PBD_g&usqp=CAU">
<img id="ri" alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe1RuAJaYVEh0BNmzR5G6etAri6MkM4PBD_g&usqp=CAU">

<%Cookie [] c1=request.getCookies();
String name=null;
String telugu=null;
String hindhi=null;
String maths=null;
String science=null;
String social=null;
String id=null;
for(Cookie cc:c1)
{
	if(cc.getName().equals("telugu"))
	{
		telugu= cc.getValue();
	}
	else if(cc.getName().equals("hindhi"))
	{
		hindhi= cc.getValue();
	}
	else if(cc.getName().equals("maths"))
	{
		maths=cc.getValue();
	}
	else if(cc.getName().equals("science"))
	{
		science=cc.getValue();
	}
	else if(cc.getName().equals("social"))
	{
		social=cc.getValue();
	}
	else if(cc.getName().equals("name"))
	{
		name=cc.getValue();
	}
	else if(cc.getName().equals("id"))
	{
		id=cc.getValue();
	}

}


%>
<table>
  <tr>
    <th colspan="15">Knowledge Institute Of Technology Science And Technology ,Kadapa<br><br>
    Name=<%=name%>.....................................................Id =<%=id%> </th>
  </tr>
  <tr>
  <td colspan="14">Telugu</td>
    <td style="text-align: right"><%=telugu%></td>
    </tr>
    <tr>
  <td colspan="14">hindhi</td>
    <td style="text-align: right"><%=hindhi%></td>
    </tr>
    <tr>
  <td colspan="14">maths</td>
    <td style="text-align: right"><%=maths%></td>
    </tr>
     <tr>
  <td colspan="14">science</td>
    <td style="text-align: right"><%=science%></td>
    </tr>
     <tr>
  <td colspan="14">social</td>
    <td style="text-align: right"><%=social%></td>
    </tr>
   <tr>
    <td colspan="15">Chusthunna anni chusthunna nuvvu em chesthunnavo chusthunna,single sheet of paper can change your future doesn't change your future                                  </td>
  </tr>
  
 
</table>


</body>
</html>