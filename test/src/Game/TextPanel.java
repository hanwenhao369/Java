package Game;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    int i = 0;
    //    对话内容
    String[] DiaLogue = {"你好", "吃了没", "吃了", "再见"};

    public TextPanel() {

        //  创建文本域，并获取对话信息
        JTextArea text = new JTextArea();
        text.setEditable(false);
        text.setBackground(Color.blue);
        text.setForeground(Color.black);
        text.setText(DiaLogue[i]);

        this.setBorder(null);
        this.setBounds(0, 400, 800, 100);
        this.add(text);
        this.setVisible(true);
    }
}
