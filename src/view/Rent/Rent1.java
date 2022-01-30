package view.Rent;

import view.Home;
import view.New_updateprofile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rent1 extends JFrame  {

    JButton backBtn;



    public Rent1() {

        setTitle("View details");
        setBounds(100, 80, 1280, 745);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setLayout(null);
        setResizable(false);


        backBtn = new JButton("Back");
        backBtn.setBounds(130,100,100,30);
        add(backBtn);

        backBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Home().setVisible(true);
            }
        });









    }

    public static void main(String[] args) {
        new Rent1().setVisible(true);
    }
    //  event handling

}






