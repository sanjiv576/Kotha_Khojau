package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Advertisement extends JFrame implements ActionListener {

    JLabel ads, header;
    JButton backBtn, advertiseBtn;
    JLabel type;
    JComboBox propertyType;
    public Advertisement(){

        setTitle("Advertisement !!");
        setBounds(130, 80, 700, 800);
        setLayout(null);
        setBackground(Color.darkGray);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,700,800);
        panel.setBackground(Color.darkGray);
        add(panel);


        backBtn = new JButton();
        backBtn.setBounds(10, 10, 64, 64);
        backBtn.setBackground(Color.darkGray);
        backBtn.setOpaque(true);
        backBtn.setBorderPainted(false);
        backBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/colorfulBackButton64x64.png"))));
        backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(backBtn);

        header = new JLabel("Advertisement");
        header.setBounds(280, 10, 164, 25);
        header.setFont(new Font("arial", Font.BOLD,25));
//        header.setForeground(Color.WHITE);
//        header.setBackground(Color.darkGray);
//        header.setOpaque(true);
        add(header);


        type = new JLabel("Name :");
        type.setBounds(500, 160, 100, 23);
        type.setFont(new Font("Serif", Font.BOLD, 23));
        type.setForeground(Color.WHITE);
        add(type);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Advertisement().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }




}
