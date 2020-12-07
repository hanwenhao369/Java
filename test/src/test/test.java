package test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class test extends Frame implements Runnable,KeyListener {

    /**
     * 绘制方块x坐标
     */
    private int x = 375;

    /**
     * 绘制方块y坐标
     */
    private int y = 375;

    /**
     * 构造函数
     */
    public test() {
//        this.setBounds(100, 100, 800, 800); // 设置窗体的位置、大小
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体右上角那个叉关闭程序
//
//        this.setVisible(true); // 设置窗体可见

        this.addKeyListener(this); // 添加键盘监听器

        Thread thread = new Thread(this); // 创建线程
        thread.start(); // 启动线程
    }

    /**
     * 绘制方法
     */
    public void paint(Graphics gr) {
        BufferedImage image = new BufferedImage(800, 800,
                BufferedImage.TYPE_3BYTE_BGR); // 创建一张500＊500的缓冲图片
        Graphics g2 = image.getGraphics(); // 获取缓冲图片的画笔
        g2.setColor(Color.blue); // 设置画笔颜色
        g2.fillRect(x, y, 50, 50);
        gr.drawImage(image, 0, 0, this); // 将缓冲图片画到窗体上
    }

    /**
     * 线程执行方法
     */
    public void run() {
        try {
            while (true) {
                this.repaint();
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 按下时调用
     */
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == 38) { // 上按键
            y=y-5;
        }
        if (keyCode == 40) { // 下按键
            y=y+5;
        }
        if (keyCode == 37) { // 左按键
            x=x-5;
        }
        if (keyCode == 39) { // 右按键
            x=x+5;
        }
//        if (keyCode == 65) {
//
//            JTextArea text = new JTextArea("hello");
//            JScrollPane scrollPane =new JScrollPane(text);
//            text.setEditable(false);
//            this.setLayout(new BorderLayout());
//            this.add(scrollPane,BorderLayout.PAGE_END);
//        }
    }

    /**
     * 释放按键时调用
     */
    public void keyReleased(KeyEvent e) {

    }

    /**
     * 不解释
     */
    public void keyTyped(KeyEvent e) {

    }


    public static void main(String[] args) {

       test t1 = new test();
        t1.setBounds(100, 100, 800, 800);
//        t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);k
        t1.setVisible(true);
        t1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(t1.x == 380 && t1.y == 380 && e.getKeyCode() == 65){
//                    JFrame jf = new JFrame();
//                    jf.setVisible(true);
                    JTextArea text = new JTextArea("hello");
                    text.setBackground(Color.white);
                    text.setForeground(Color.BLACK);
                    JScrollPane scrollPane =new JScrollPane(text);
                    text.setEditable(false);
                    t1.setLayout(new BorderLayout());
                    t1.add(scrollPane,BorderLayout.PAGE_END);
                }
            }
        });
    }


        }

