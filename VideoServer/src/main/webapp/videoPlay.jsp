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
<body>

<video src="http://pi:81/video/${video}" controls="controls">
    your browser does not support the video tag
</video>

<video id="my-video" class="video-js" controls preload="auto" width="640" height="264">
    <source src="http://pi:81/video/${video}" type='video/mp4'>
    <p class="vjs-no-js">
        To view this video please enable JavaScript, and consider upgrading to a web browser that
        <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
    </p>
</video>

</body>
</html>