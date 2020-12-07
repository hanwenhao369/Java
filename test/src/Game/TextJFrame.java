package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextJFrame extends JFrame{
    int i = 0;
//    对话内容
    String[] DiaLogue = {"你好","吃了没","吃了","再见","0"};

    public TextJFrame(){

        //  创建文本域，并获取对话信息
        JTextArea text = new JTextArea();
        text.setEditable(false);
             text.setBackground(Color.white);
             text.setForeground(Color.black);
             text.setText(DiaLogue[i]);

             this.setBounds(407,513,786,100);
             this.setUndecorated(true);
             this.add(text);
             this.setVisible(true);
                 text.addKeyListener(new KeyAdapter() {
                     @Override
                     public void keyPressed(KeyEvent e) {
                         int keyCode = e.getKeyCode();
                         if (i < DiaLogue.length - 2 && keyCode == 65) {  // 按下a键时，进行下一个对话
                             i++;
                             text.setText(DiaLogue[i]);

                         }
                         if (i >=DiaLogue.length - 2 && keyCode == 65)
                             dispose();
                     }
                 });

    }
}
