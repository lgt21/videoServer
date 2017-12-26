package com.lgt.springboot.test.videoServet.controller;

import com.lgt.springboot.test.videoServet.utils.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
     * 视频播放
     * @return
     */
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    private ModelAndView play(@PathVariable(value="name") String name) {
//        ModelAndView modelAndView = new ModelAndView("videoPlay.jsp");
//        modelAndView.addObject("video", name);
//        return modelAndView;
//    }

//    /**
//     * 视频播放
//     * @return
//     */
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    private void play(HttpServletRequest request, HttpServletResponse response,
//                              @PathVariable(value="name") String name) {
//        File file = new File("e:/" + name);
//
//        InputStream in = null;
//        ServletOutputStream out = null;
//        try {
//            in = new FileInputStream(file);
//            out = response.getOutputStream();
//            byte[] buffer = new byte[4 * 1024];
//            int length;
//            while ((length = in.read(buffer)) > 0) {
//                out.write(buffer, 0, length);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("文件读取失败,文件不存在");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("文件流输出异常");
//            e.printStackTrace();
//        } finally {
//            try {
//                in.close();
//                out.close();
//            } catch (IOException e) {
//                System.out.println("文件流关闭异常");
//                e.printStackTrace();
//            }
//        }
//    }



}
