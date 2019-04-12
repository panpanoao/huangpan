
/*
/*"+contextPath
var basePaths= protocol +"//"+host+"/";
*/


(function() {
    // trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
    if (!String.prototype.trim) {
        (function() {
            // Make sure we trim BOM and NBSP
            var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
            String.prototype.trim = function() {
                return this.replace(rtrim, '');
            };
        })();
    }

    [].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
        // in case the input is already filled..
        if( inputEl.value.trim() !== '' ) {
            classie.add( inputEl.parentNode, 'input--filled' );
        }

        // events:
        inputEl.addEventListener( 'focus', onInputFocus );
        inputEl.addEventListener( 'blur', onInputBlur );
    } );

    function onInputFocus( ev ) {
        classie.add( ev.target.parentNode, 'input--filled' );
    }

    function onInputBlur( ev ) {
        if( ev.target.value.trim() === '' ) {
            classie.remove( ev.target.parentNode, 'input--filled' );
        }
    }
})();

$(function() {
    $('#login #login-password').focus(function() {
        $('.login-owl').addClass('password');
    }).blur(function() {
        $('.login-owl').removeClass('password');
    });
    $('#login #register-password').focus(function() {
        $('.register-owl').addClass('password');
    }).blur(function() {
        $('.register-owl').removeClass('password');
    });
    $('#login #register-repassword').focus(function() {
        $('.register-owl').addClass('password');
    }).blur(function() {
        $('.register-owl').removeClass('password');
    });
    $('#login #forget-password').focus(function() {
        $('.forget-owl').addClass('password');
    }).blur(function() {
        $('.forget-owl').removeClass('password');
    });

    $('#numbtn').click(function () {
        var obj = $("#numbtn");
        if(obj.html()=="免费获取验证码") {
            var username = $("#forget-username").val();
            var password = $("#forget-password").val();
            var code = $("#code").val();
            if (username == null || username == "") {
                $("#message2").html("* 请输入手机号！");
                $("#forget-username").focus();
                return false;
            }
            if (password == null || password == "") {
                $("#message2").html("*　请输入密码！");
                $("#forget-password").focus();
                return false;
            } else {
                $.ajax({
                    type: "post",//请求方式
                    processData: true,//序列化
                    data: {userName: username},//参数
                    dataType: 'json', //接受数据格式
                    url: basePath + "/duanxin.json", //地址
                    success: function (data) {
                        if (data == 1) {
                            $("#message2").html("*　不存在该用户！");
                        } else {
                            $("#message2").html("");
                            settime(obj);
                        }

                    },
                    error: function () {
                        alert("错误");
                    }
                });
            }
        }else{
            alert("已发送验证码");
        }
    });


    //登陆
    $("#loginFrm").submit(function(){
        var userName = $("#login-username").val();
        password = $("#login-password").val();
        if(userName == null || userName == ""){
            $("#message").html("* 请输入用户名！");
            $("#login-username").focus();
            return false;
        }
        if(password == null || password == ""){
            $("#message").html("*　请输入密码！");
            $("#login-password").focus();
            return false;
        }
    });
    //注册
    $("#zhuce").click(function(){
        var username = $("#register-username").val();
         var   password = $("#register-password").val();
        var   repassword = $("#register-repassword").val();
        var    phone = $("#register-phone").val();
        if(username == null || username == ""){
            $("#message3").html("* 请输入用户名！");
            $("#register-username").focus();
            return false;
        }
        if(/[\u4E00-\u9FA5]/g.test(username)){
            $("#message3").html("* 用户名不能有汉字！");
            $("#register-username").focus();
            return false;
        }
        if(password == null || password == ""){
            $("#message3").html("*　请输入密码！");
            $("#register-password").focus();
            return false;
        }
        if(repassword == null || repassword == ""){
            $("#message3").html("*　请输入密码！");
            $("#register-repassword").focus();
            return false;
        }
        if(password!=repassword){
            $("#message3").html("*　两次密码不一致！");
            $("#register-repassword").focus();
            return false;
        }
        if(phone == null || phone == ""){
            $("#message3").html("*　请输入手机号！");
            $("#register-phone").focus();
            return false;
        }
        if(!myreg.test(phone)){
            $("#register-phone").focus();
            $("#message3").html("*　手机号格式不正确！");
            return false;
        } else {
            $("#message3").html("");
            var formData = $("#zhuceFrm").serialize();
            $.ajax({
                type: "get",//请求方式
                data: formData,//参数
                dataType: 'json', //接受数据格式
                url: basePath + "/zhuce.json", //地址
                traditional: true,//接收数组类型
                success: function (data) {
                    if (data == 1) {
                        $("#message3").html("*　该手机号已经注册过");
                        $("#register-phone").focus();
                    } else {
                        $("#message3").html("");
                        alert("注册成功");
                        goto_login();
                    }
                },
                error: function () {
                    alert("错误")
                }
            });
        }
    });

    //重置
    $("#resetbtn").click(function(){
        var username = $("#forget-username").val();
        var password = $("#forget-password").val();
        var   code = $("#code").val();
        if(username == null || username == ""){
            $("#message2").html("* 请输入手机号！");
            $("#forget-username").focus();
            return false;
        }
        if(password == null || password == ""){
            $("#message2").html("*　请输入密码！");
            $("#forget-password").focus();
            return false;
        }
        if(code == null || code == ""){
            $("#message2").html("*　请输入验证码！");
            $("#code").focus();
            return false;
        }
        if(a==true){
            $("#message2").html("*　请发送验证码在输入！");
            return false;
        }
        var formData=$("#resetFrm").serialize();
        $.ajax({
            type: "get",//请求方式
            data: formData,//参数
            dataType: 'json', //接受数据格式
            url: basePath+"/reset.json", //地址
            traditional: true,//接收数组类型
            success: function (data) {
             if(data==1){
                 $("#message2").html("*　验证码不正确");
             }else {
                 $("#numbtn").html("免费获取验证码");
                 $("#message2").html("");
                 alert("重置成功");
                 goto_login();
             }
            },
            error: function () {
                alert("错误")
            }
        });

    });





});

/**
 * 注册
 */
function goto_register(){
    $("#register-username").val("");
    $("#register-password").val("");
    $("#register-repassword").val("");
    $("#register-phone").val("");
    $("#message3").html("");
    $("#tab-2").prop("checked",true);
}
/**
 * 登陆
 */
function goto_login(){
    $("#login-username").val("");
    $("#login-password").val("");

    $("#message").html("");
    $("#tab-1").prop("checked",true);
}

/**
 * 重置
 */
function goto_forget(){
    $("#forget-username").val("");
    $("#forget-password").val("");
    $("#code").val("");
    $("#message2").html("");
    countdown = 0;
    $("#tab-3").prop("checked",true);
}
function settime(obj) {

    a=false;

    if (countdown == 0) {

        obj.attr('disabled', false);

        obj.html("免费获取验证码");

        countdown = 60;

        return;

    } else {

        obj.attr('disabled', true);

        obj.html("重新发送(" + countdown + ")");

        countdown--;

    }

    setTimeout(function () {

            settime(obj)

        }

        , 1000)

}


