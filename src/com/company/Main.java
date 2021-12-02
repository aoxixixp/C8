package com.company;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

    JLabel jl;
    JButton jbt1;
    JButton jbt2;

    public Main(){
        super("这是IJ！");
        this.setBounds(100, 200, 400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl = new JLabel("倒计时", SwingConstants.CENTER);
        Font f = new Font("宋体", 45, 80);
        jl.setFont(f);
        jbt1 = new JButton("开始");
        jbt2 = new JButton("结束");
        jbt2.setVisible(false);
        this.add(jbt1, BorderLayout.NORTH);
        this.add(jbt2, BorderLayout.SOUTH);
        this.add(jl, BorderLayout.CENTER);


        this.setVisible(true);

    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
