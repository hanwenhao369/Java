package test;

import java.awt.*;

import javax.swing.*;

public class zhuce {

    public static void main(String[] args) {
        JFrame f=new JFrame("信息注册");
        f.setBounds(300, 300, 500, 600);
        f.setLayout(null);
        //创建面板
        JPanel panelname=new JPanel();
        panelname.setBounds(0, 0, 500,40);
        panelname.setLayout(null);
        panelname.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        //创建标签
        JLabel labelname=new JLabel("姓名");
        labelname.setBounds(5, 0, 40, 40);
        //创建输入框
        JTextField textname=new JTextField();
        textname.setBounds(45, 5, 200, 30);
        panelname.add(labelname);
        panelname.add(textname);
        f.add(panelname);
        //创建性别面板
        JPanel panelsex=new JPanel();
        panelsex.setBounds(0, 40, 500,40);
        panelsex.setLayout(null);
        panelsex.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JLabel labelsex=new JLabel("性别:");
        labelsex.setBounds(5, 0, 40, 40);
        ButtonGroup group=new ButtonGroup();
        JRadioButton female=new JRadioButton("女");
        JRadioButton male=new JRadioButton("男",true);
        female.setBounds(50, 5,60,30);
        male.setBounds(100,5,60,30);
        group.add(male);
        group.add(female);
        panelsex.add(male);
        panelsex.add(female);
        panelsex.add(labelsex);
        f.add(panelsex);
        //创建爱好
        JPanel panelhobby=new JPanel();
        panelhobby.setBounds(0, 80, 500,40);
        panelhobby.setLayout(null);
        panelhobby.setBorder(BorderFactory.createLineBorder(Color.orange));
        JLabel labelhobby=new JLabel("兴趣爱好:");
        labelhobby.setBounds(5, 0, 60, 40);
        JCheckBox Jhobby1=new JCheckBox("打球",true);
        JCheckBox Jhobby2=new JCheckBox("唱歌");
        JCheckBox Jhobby3=new JCheckBox("跳舞");
        Jhobby1.setBounds(70, 5,60, 30);
        Jhobby2.setBounds(130, 5,60, 30);
        Jhobby3.setBounds(190, 5,60, 30);
        panelhobby.add(Jhobby1);
        panelhobby.add(Jhobby2);
        panelhobby.add(Jhobby3);
        panelhobby.add(labelhobby);
        f.add(panelhobby);
        //参加社团
        JPanel panelshe=new JPanel();
        panelshe.setBounds(0, 120, 500,40);
        panelshe.setBorder(BorderFactory.createLineBorder(Color.RED));
        JLabel labelshe=new JLabel("社团:");
        JComboBox<String> Jshe=new JComboBox<String>();
        Jshe.addItem("篮球社");
        Jshe.addItem("舞蹈社");
        Jshe.addItem("音乐社");
        panelshe.add(labelshe);
        panelshe.add(Jshe);
        f.add(panelshe);
        //创建文本框
        JPanel panelxin=new JPanel();
        panelxin.setBounds(0, 160, 500,300);
        panelxin.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel labelxin=new JLabel("注册信息:");
        JTextArea Jxin=new JTextArea(12,34);
        JScrollPane jsp =new JScrollPane(Jxin);
        Jxin.setEditable(false);
        panelxin.add(labelxin);
        panelxin.add(Jxin,BorderLayout.CENTER);
        f.add(panelxin);
        //创建按钮
        JButton btn =new JButton("注册");
        btn.setBounds(200, 470, 60, 40);
        btn.addActionListener(e->{
            if(textname.getText()!=null&&!textname.getText().trim().equals("")){
                Jxin.setText("姓名："+textname.getText()+"\n");
                if(female.isSelected())
                    Jxin.append("性别："+female.getText()+"\n");
                if(male.isSelected())
                    Jxin.append("性别："+male.getText()+"\n");
                Jxin.append("兴趣爱好：");
                if(Jhobby1.isSelected())
                    Jxin.append(Jhobby1.getText()+"  ");
                if(Jhobby3.isSelected())
                    Jxin.append(Jhobby3.getText()+"  ");
                if(Jhobby2.isSelected())
                    Jxin.append(Jhobby2.getText()+"  ");
                Jxin.append("\n");
                Jxin.append("你参加的社团是："+Jshe.getSelectedItem()+"\n");
                Jxin.append("恭喜你注册成功！！！\r\n");
                textname.setText("");}
            else {
                JOptionPane.showMessageDialog(null, "你输入的姓名为空，错误！");
            }
        });
        f.add(btn);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
