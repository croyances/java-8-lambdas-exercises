package com.insightfullogic.java8.mycroyances;

/**
 * @Author: croyances
 * @Date: 2020/4/27 21:23
 * @version: 1.0
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

class MyJDialog extends JDialog { //创建新类继承 JDialog 类
    public MyJDialog(MyFrame frame) {
        super(frame, "第一个 JDialog 窗体", true); //实例化一个 JDialog 类对象，指定对话框的父窗体、窗体标题和类型
        Container container = getContentPane(); //创建一个容器
        container.add(new JLabel("这是一个对话框")); //在容器中添加标签
        setBounds(120, 120, 100, 100); //设置对话框窗体大小
    }
}

public class MyFrame extends JFrame { //创建新类

    public static void main(String[] args) {
        new MyFrame(); //实例化 MyJDialog 类对象
    }

    public MyFrame() {
        Container container = getContentPane(); //创建一个容器
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个 JFrame 窗体"); //在窗体中设置标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);//将标签的文字居中
        container.add(jl);
        JButton jButton = new JButton("弹出对话框"); //定义一个按钮
        jButton.setBounds(10, 10, 100, 21);
//     jButton.addActionListener(new ActionListener() { //为按钮添加鼠标点击事件
//      @Override
//      public void actionPerformed(ActionEvent e) {
//       new MyJDialog(MyFrame.this).setVisible(true); //使 MyJDialog 可见
//      }

//       jButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent event) {
//         System.out.println("button clicked");
//      }
//
//        });

        ActionListener oneArgument = event -> System.out.println("button clicked");
        jButton.addActionListener(oneArgument);
        jButton.addActionListener(e -> System.out.println(21212));
        A();
        container.add(jButton); //将按钮添加到容器中
        container.setBackground(Color.white);
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }


    private void A() {
        Runnable noArguments = () -> System.out.println("Hello World");
        noArguments.run();

        Runnable noArguments1 = new Runnable() {
            @Override
            public void run() {
                System.err.print("boolean");
            }
        };


        Runnable multiStatement = () -> {

            System.out.print("Hello");
            System.out.println(" World");
        };
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }


}
