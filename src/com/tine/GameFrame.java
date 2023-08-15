package com.tine;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){

        //GamePanel panel = new GamePanel();
        //Shorter version of the above since the "panel" is not used anywhere
        this.add(new GamePanel());

        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); //appears in the middle of the screen
    }
}
