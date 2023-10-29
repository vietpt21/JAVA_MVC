<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
<jsp:include page="header.jsp"/>
</head>
<body>
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                     class="img-fluid" alt="Phone image">
            </div>

            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <button class="active" id="dangnhap">Login</button> <button id="dangky" class="active">Register</button>
                <br><br>
                <div class="dn">
                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <input id="tendangnhap" name="tendangnhap" type="text"  class="form-control form-control-lg"  />
                        <label class="form-label" for="tendangnhap">Username</label>
                    </div>
                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <input id="matkhau"  name="matkhau" type="password" class="form-control form-control-lg" />
                        <label class="form-label" for="matkhau">Password</label>
                    </div>
                    <div class="d-flex justify-content-around align-items-center mb-4">
                        <!-- Checkbox -->
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="" id="form1Example3" checked />
                            <label class="form-check-label" for="form1Example3"> Remember me </label>
                        </div>
                        <a href="#">Forgot password?</a>
                    </div>
                    <!-- Submit button -->
                <button  type="submit" class="btn btn-primary btn-lg btn-block login">Login</button>
                    <span id="kq"></span>
                    <span>${user}</span>

                <div class="divider d-flex align-items-center my-4">
                        <p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
                </div>
                    <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" href="#!"
                       role="button">
                        <i class="fab fa-facebook-f me-2"></i>Continue with Facebook
                    </a>
                    <a class="btn btn-primary btn-lg btn-block" style="background-color: #55acee" href="#!"
                       role="button">
                        <i class="fab fa-twitter me-2"></i>Continue with Twitter</a>
                </div>


                <%--Phan Dang Ky--%>
                <form action="dangky" method="post">
                    <div class="dk" style="display: none">
                        <div  class="form-outline mb-3">
                            <label  class="form-label" >Chức Vụ</label>
                            <select  name = "machucvu"  class="form-select" aria-label="Default select example">
                                <c:forEach items="${cv}" var="cv">
                                  <option value=${cv.machucvu}>${cv.tenchucvu}</option>
                                </c:forEach>
                        </div>

                    <div class="form-outline mb-3">
                        <input id="dkten" name="tendangnhap" type="text"  class="form-control form-control-lg"  />
                        <label class="form-label" for="tendangnhap">Username</label>
                    </div>
                       <%--Show chuc vu--%>
                    <!-- Password input -->
                    <div class="form-outline mb-3">
                        <input id="dkmatkhau" name="matkhau" type="password" class="form-control form-control-lg" />
                        <label class="form-label" for="matkhau">Password</label>
                    </div>
                    <div class="form-outline mb-3">
                        <input id="nhaplaimatkhau" name="nhaplaimatkhau" type="password" class="form-control form-control-lg" />
                        <label class="form-label" for="nhaplaimatkhau">Enter the password</label>
                    </div>

                    <div class="d-flex justify-content-around align-items-center mb-4">
                        <!-- Checkbox -->
                    </div>
                    <!-- Submit button -->
                    <button  type="submit" class="btn btn-primary btn-lg btn-block login">Register</button>
                    <span>${ketqua}</span>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<script  type="text/javascript" src="<c:url value="/resources/Js/jquery.js" />"></script>
<script  type="text/javascript" src="<c:url value="/resources/Js/jquery.waypoints.min.js" />"></script>
<script  type="text/javascript" src="<c:url value="/resources/Js/custom.js" />"></script>
</body>
</html>