<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>携美程团酒店预订管理系统</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="stylesheet" href="statics/css/font.css">
    <link rel="stylesheet" href="statics/css/login.css">
    <link rel="stylesheet" href="statics/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="statics/lib/layui/layui.js" charset="utf-8"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message">携美程团酒店预订管理系统</div>
    <div id="darkbannerwrap"></div>

    <form method="post" class="layui-form" action="${pageContext.request.contextPath}/dologin.html">
        <div class="info">${error }</div>
        <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        <hr class="hr15">
        <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        <hr class="hr15">
        <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20">

        <a href="${pageContext.request.contextPath}/register.html">
<%--            <input type="button" value="注册">--%>
            <input value="注册" lay-submit style="width:100%;" type="button">
        </a>
        <hr class="hr20">
    </form>

</div>

<%--这里是原框架中用来进行json前后端分离的jsp语句，现在改为上面的表单提交，具体json方法有待查询--%>

<%--<script>--%>
<%--    $(function () {--%>
<%--        layui.use('form', function () {--%>
<%--            var form = layui.form;--%>
<%--            // layer.msg('玩命卖萌中', function(){--%>
<%--            //   //关闭后的操作--%>
<%--            //   });--%>
<%--            //监听提交--%>
<%--            form.on('submit(login)', function (data) {--%>
<%--                // alert(888)--%>
<%--                layer.msg(JSON.stringify(data.field), function () {--%>
<%--                    location.href = 'indexhotel.html'--%>
<%--                });--%>
<%--                return false;--%>
<%--            });--%>
<%--        });--%>
<%--    })--%>
<%--</script>--%>
<%--<!-- 底部结束 -->--%>
<%--<script>--%>
<%--    //百度统计可去掉--%>
<%--    var _hmt = _hmt || [];--%>
<%--    (function () {--%>
<%--        var hm = document.createElement("script");--%>
<%--        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";--%>
<%--        var s = document.getElementsByTagName("script")[0];--%>
<%--        s.parentNode.insertBefore(hm, s);--%>
<%--    })();--%>
<%--</script>--%>
</body>
</html>