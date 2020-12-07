package Game2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Map1 extends JFrame{
    //飞机位置
    int x = 50;
    int y =400;

    Image bgImg1 = GameUtil.getImage("image/无标题.png");
    Image rwImg = GameUtil.getImage("image/plane.png");

    Character c2 = new Character(rwImg,x,y,5);


    public void paint(Graphics g) {
        g.drawImage(bgImg1, 0, 0, null);
        c2.drawMySelf(g);
    }
    public Map1(){
        this.setLayout(null);
        //在游戏窗口打印标题
        this.setTitle("韩文豪作品");
        //窗口大小：宽度800，高度500
        this.setSize(800, 500);
        //窗口左上角顶点的坐标位置
        this.setLocation(400, 50);
        //窗口默认不可见，设为可见
        this.setVisible(true);

        //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new PaintThread().start();  //启动重画线程

        this.addKeyListener(new KeyMonitor());//增加键盘的监听
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == 65) {
                    new TextJFrame();
                }
            }
        });


    }

    //定义为内部类，可以方便的使用外部类的普通属性
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            c2.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            c2.minusDirection(e);
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
}
