package Game;

import Game2.GameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener,Runnable {

    int x = 100;

    int y = 100;


    public GamePanel(){
        this.setBorder(null);
        this.setBounds(0,0,800,400);


        this.setFocusable(true);
        this.addKeyListener(this);
        Thread thread = new Thread(this); // 创建线程
        thread.start(); // 启动线程
    }

    @Override
    protected void paintComponent(Graphics g) {  // 画出人物
        super.paintComponent(g);
        this.setBackground(Color.white);

        Data.charecter.paintIcon(this,g,x,y);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {  //控制移动

        int keyCode = e.getKeyCode();
//        if(keyCode == 65) {
//            this.add(new TextPanel());
//        }

        if (x==120 && y ==120 && keyCode == 65) {  // 当在某个位置并且按下a键时，触发对话
            TextJFrame textJFrame = new TextJFrame();
        }
        if (keyCode == 38) { // 上按键
            y=y-20;
        }
        if (keyCode == 40) { // 下按键
            y=y+20;
        }
        if (keyCode == 37) { // 左按键
            x=x-20;
        }
        if (keyCode == 39) { // 右按键
            x=x+20;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
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
}
