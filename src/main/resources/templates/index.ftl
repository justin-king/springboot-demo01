<html>
<head>
    <title>Title</title>
    <style>
        .bt-0{
            color: darkgray;
            font-size: 18px;
        }

    </style>
    <script language=javascript>
        function printpreview(){
            window.print(window.document.body.innerHTML);
        }
    </script>
</head>
<body>
    <div class="noprint" style="width:640px;height:20px;margin:100px auto 0 auto;font-size:12px;text-align:right;">
        <input value="打印" type="button" onclick="printpreview();" />
    </div>

    <h1 class="bt-0">This is index page !</h1>
    <form action="test/register" method="post">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="number" name="age"><br>
        <input type="submit" value="注册">
    </form>

    <hr>

    <form action="test/find" method="post">
        姓名：<input type="text" name="name"><br>
        <input type="submit" value="查询">
    </form>

    <hr>

    <a href="test/userCount" >查询学生总人数</a>


    <span>预览/下载</span>
</body>
</html>
