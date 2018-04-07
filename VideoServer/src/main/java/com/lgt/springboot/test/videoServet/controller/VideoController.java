package com.lgt.springboot.test.videoServet.controller;

import com.lgt.springboot.test.videoServet.utils.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

/**
 * 视频 controller
 * @autor lgt
 * @date 2017/12/17 2:57
 */
@Controller
@RequestMapping("/")
public class VideoController {

    @Value("${video.rootPath}")
    private String videoRootPath;
//    private String videoRootPath = "/mnt/sda1/video";

    /**
     * 视频列表
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    private ModelAndView index() {
        List<String> videos = FileUtils.getAllFileOrderByCreateTimeDesc(videoRootPath);
        ModelAndView modelAndView = new ModelAndView("videoList.jsp");
        modelAndView.addObject("videos", videos);
        return modelAndView;
    }

    /**
     * 子文件夹
     * @return
     */
    @RequestMapping(value = "/{subFilePath}", method = RequestMethod.GET)
    private ModelAndView play(@PathVariable(value="name") String name) {
        List<String> videos = FileUtils.getAllFileOrderByCreateTimeDesc(videoRootPath);
        ModelAndView modelAndView = new ModelAndView("videoList.jsp");
        modelAndView.addObject("videos", videos);
        return modelAndView;
    }





}
