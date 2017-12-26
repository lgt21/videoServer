//package com.lgt.springboot.test.videoServet.controller;
//
//
//import javax.swing.*;
//import java.awt.*;
//
///**
// * @autor lgt
// * @date 2017/12/23 16:45
// */
//public class SimpleVideo extends JFrame {
//
//    private Player player;
//
//    private SimpleVideo() {
//        JPanel panel = (JPanel) this.getContentPane();
//        panel.setLayout(new BorderLayout());
//
//        String mediaFile = "file:///F://Music//001.avi";
//        try {
//            // 确定视频文件的位置
//            MediaLocator mlr = new MediaLocator(mediaFile);
//            // 创建一个播放器对象
//            this.player = Manager.createRealizedPlayer(mlr);
//            this.player.addControllerListener(new ControllerListener() {
//
//                public void controllerUpdate(ControllerEvent event) {
//                    if (event instanceof javax.media.RealizeCompleteEvent) {
//
//                    }
//
//                }
//            });
//            if (this.player.getVisualComponent() != null) {
//                panel.add("Center", player.getVisualComponent());
//            }
//            if (this.player.getControlPanelComponent() != null) {
//                panel.add("South", player.getControlPanelComponent());
//            }
//
//        } catch (Exception e) {
//            System.err.println("Got exception " + e);
//        }
//
//        this.addWindowListener(new WindowAdapter() {
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//                player.stop();
//                player.deallocate();
//                player.close();
//                dispose();
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//                System.exit(0);
//            }
//
//        });
//        this.setSize(320, 260);
//    }
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        SimpleVideo frame = new SimpleVideo();
//        frame.setVisible(true);
//    }
//}
