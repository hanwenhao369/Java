package qqq.Game2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StartGame extends JPanel {
    //位置
    int x = 50;
    int y = 50;


    //将背景图片与飞机图片定义为成员变量
    Image bgImg = GameUtil.getImage("image/BJ.jpg");
    Image rwImg = GameUtil.getImage("image/plane.png");

    //创建人物对象
    Character c1 = new Character(rwImg,x,y,5);



    //paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
    @Override
    public void paint(Graphics g) {
        g.drawImage(bgImg, 0, 0, null);
        c1.drawMySelf(g);
    }

    public StartGame(){
        //在游戏窗口打印标题
//        this.setTitle("韩文豪作品");
        //窗口大小：宽度800，高度500
        this.setSize(800, 500);
        //窗口左上角顶点的坐标位置
        this.setLocation(400, 50);
        //窗口默认不可见，设为可见
        this.setVisible(true);

        //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new PaintThread().start();  //启动重画线程

        addKeyListener(new KeyMonitor()); //增加键盘的监听,实现移动

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (c1.x == 55 && c1.y == 55 && keyCode == 65) {
                    new TextJFrame();
                }
            }
        });


    }

    //定义为内部类，可以方便的使用外部类的普通属性
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
          c1.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            c1.minusDirection(e);
        }
    }
    class PaintThread extends Thread {
        public void run(){
            while(true){
                repaint();
                try {
                    Thread.sleep(40); //1s = 1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame jf2 = new JFrame();
        StartGame startGame = new StartGame();
        jf2.add(startGame);
        jf2.setBounds(100,100,800,500);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == 65) {
                    jf2.add(new Map1());
                }
            }
        });
        jf2.setVisible(true);
    }
}
