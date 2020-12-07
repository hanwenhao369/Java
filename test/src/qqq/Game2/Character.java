package qqq.Game2;


import java.awt.*;
import java.awt.event.KeyEvent;

public class Character extends GameObject {

    boolean left, up, right, down;
    boolean live = true;

    public Character(Image img, double x, double y, int speed) {
        super(img, x, y);
        this.speed = speed;
    }

    // 按下上下左右键，则改变方向值。
    // 比如：按下上键，则e.getKeyCode()的值就是VK_UP，那么置：up=true;
    public void addDirection(KeyEvent e) {
        int keyCode = e.getKeyCode();
            if (keyCode == 37) {
                left = true;
            }
            if (keyCode == 38) {
                up = true;
            }
            if (keyCode == 39) {
                right = true;
            }
            if (keyCode == 40) {
                down = true;
            }

        }

    // 松开上下左右键，则改变方向值。
    // 比如：松开上键，则e.getKeyCode()的值就是VK_UP，那么置：up=false;
    public void minusDirection(KeyEvent e) {
        int keyCode = e.getKeyCode();
            if (keyCode == 37) {
                left = false;
            }
            if (keyCode == 38) {
                up = false;
            }
            if (keyCode == 39) {
                right = false;
            }
            if (keyCode == 40) {
                down = false;
            }
        }

    @Override
    public void drawMySelf(Graphics g) {
        super.drawMySelf(g);
        // 根据方向，计算飞机新的坐标
        if (left && x > 11) {
            x -= speed;
        }
        if (right && x <780) {
            x += speed;
        }
        if (up && x > 50) {
            y -= speed;
        }
        if (down && y < 484) {
            y += speed;
        }

    }


}