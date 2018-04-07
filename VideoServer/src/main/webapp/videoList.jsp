<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>videos</title>

    <link href="videojs/video-6.4.0.css" rel="stylesheet">
    <script src="videojs/video-6.4.0.js"></script>
</head>
<script type="text/javascript">
    console.log("${videos}");
</script>
<body>
<ul>
    <c:forEach items="${videos}" var="video">
        <li><a href="http://192.168.1.88:81/sda1/video/${video}">${video}</a> </li>
    </c:forEach>
  <%--  mp4:
    <video src="/video/大鱼.mp4" controls="controls">
        your browser does not support the video tag
    </video>
</p>
    avi:
    <video src="/video/大鱼.avi" controls="controls">
        your browser does not support the video tag
    </video>
    </p>
    flv:
    <video src="/video/大鱼.flv" controls="controls">
        your browser does not support the video tag
    </video>
    </p>
    mkv:
    <video src="/video/大鱼.mkv" controls="controls">
        your browser does not support the video tag
    </video>
    </p>
    webm:
    <video src="/video/大鱼.webm" controls="controls">
        your browser does not support the video tag
    </video>
    </p>
    wmv:
    <video src="/video/大鱼.wmv" controls="controls">
        your browser does not support the video tag
    </video>
    rmvb:
    <video src="/video/大鱼.rmvb" controls="controls">
        your browser does not support the video tag
    </video>--%>

<%--
    mp4:
    <video id="my-video" class="video-js" controls preload="auto" width="640" height="264">
        mp4: <source src="/video/大鱼.mp4" type='video/mp4'>
        <p class="vjs-no-js">
            To view this video please enable JavaScript, and consider upgrading to a web browser that
            <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
        </p>
    </video>
    mp4:
    <video id="my-video" class="video-js" controls preload="auto" width="640" height="264">
        mp4: <source src="/video/大鱼.rmvb" type='video/'>
        <p class="vjs-no-js">
            To view this video please enable JavaScript, and consider upgrading to a web browser that
            <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
        </p>
    </video>
--%>


</ul>
</body>
</html>