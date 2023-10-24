
$(document).ready(function () {

    $(".login").click(function(e) {
       var ten =$("#tendangnhap").val();
       var  matkhau=$("#matkhau").val();

       $.ajax({
           url:"http://localhost:8089/shopbaby/api/KiemTraDangNhap",
           type:"GET",
           data:{
               tendangnhap:ten,
               matkhau: matkhau
           },
           success:function (value){
            if(value == "true"){
                $("#kq").append("Thanh cong")
            }
            else {
                $("#kq").append("That bai")
            }
           }
       })
    });
})
