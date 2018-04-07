package com.lgt.springboot.test.videoServet.utils;

import org.apache.tomcat.jni.FileInfo;

import java.io.File;
import java.io.FileFilter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @autor lgt
 * @date 2017/12/17 3:01
 */
public class FileUtils {

    private final static List<String> VIDEO_SUFFIX = Arrays.asList("mp4", "flv", "rm", "rmvb", "mkv", "avi", "wmv");

    public static List<String> getAllFileOrderByCreateTimeDesc(String filePath) {
        if(StringUtils.isBlank(filePath)) {
            return null;
        }
        File file = new File(filePath);
        if(!file.isDirectory()) {
            System.out.println("非文件夹");
        }

        String[] files = file.list();

        List<String> subFilePath = Arrays.asList(files).stream()
                .filter(f -> new File(filePath + File.separator + f).isDirectory())
                .collect(Collectors.toList());
        List<String> res = new ArrayList<>();
        subFilePath.forEach(f -> getAllFileOrderByCreateTimeDesc(filePath + File.separator + f)
            .forEach(ff -> res.add(f + File.separator + ff)));

        res.addAll(Arrays.asList(files).stream()
                .filter(f -> isVideo(f))
                .map(f ->  new File(filePath + File.separator + f))
                .sorted((File f1, File f2) -> {
                    if(f1.lastModified()==f2.lastModified()) return 0;
                    return f1.lastModified()>f2.lastModified()?-1:1;
                })
                .map(f -> f.getName())
                .collect(Collectors.toList()));
        return res;
    }

    /**
     * Get the Mime Type from a File
     * @param fileName 文件名
     * @return 返回MIME类型
     */
    private static String getMimeType(String fileName) {
        String[] split = fileName.split("\\.");
        return split[split.length-1];
    }

    public static Boolean isVideo(String fileName) {
        String mimeType = getMimeType(fileName);
        if (VIDEO_SUFFIX.contains(mimeType)){
            return true;
        }
        return false;
    }

}
