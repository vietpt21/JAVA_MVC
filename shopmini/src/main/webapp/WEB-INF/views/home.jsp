<%@ page import="vietpt.entity.Lop" %>
<%@ page import="java.util.List" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<div class="container fluid">
    <div class="row">
        <table class="tableLop">
            <thead>
            <tr>
                <th scope="col">Ma Lop</th>
                <th scope="col">Ten Lop</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <%
                        List<Lop> list = (List<Lop>) request.getAttribute("listl");
                        for (Lop l :list){
                    %>
                    <%=l.getMalop()%><br/>


                    <% }%></td>
                <td><%
                    List<Lop> listt = (List<Lop>) request.getAttribute("listl");
                    for (Lop l :listt){
                %>
                    <%=l.getTenlop()%><br/>

                    <% }%></td>
            </tr>
            </tbody>

        </table>
     </div>
    </div>

</body>
</html>