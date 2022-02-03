package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Rent3 extends JFrame implements ActionListener {
    JPanel panel, panel1,panel2;

    JLabel propertytype,city, bedroom, offertype, Bathroom;

    ImageIcon s[];
    JLabel l;
    JButton b1,b2;
    int i,l1;
    JPanel p;


    public Rent3() {

        setTitle("Home - Rent3");
        setBounds(30, 20, 700, 815);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setLayout(null);
        setResizable(false);


        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(20, 330, 650, 150);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);


        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10,10,10,10));
        panel2.setBounds(20, 510, 650, 250);
        panel2.setBackground(Color.decode("#9F9391"));
        panel2.setOpaque(true);


        // for displaying image
        panel =new JPanel(new FlowLayout());
        panel.setBounds(20, 200, 450, 120);
        panel.setOpaque(true);

        b1=new JButton("<<");

        b2=new JButton(">>");

        panel.add(b1);
        panel.add(b2);
        add(panel,BorderLayout.SOUTH);


        b1.addActionListener(this);
        b2.addActionListener(this);
        s = new ImageIcon[4];

        s[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/9.png")));
        s[1] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/10.png")));
        s[2] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/11.png")));
        s[3] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/12.png")));



        l = new JLabel("",JLabel.CENTER);
        add(l,BorderLayout.CENTER);
        l.setIcon(s[0]);


        //label for home detail

        propertytype = new JLabel("Property Type:");
        propertytype.setForeground(Color.BLACK);
        propertytype.setFont(new Font("times", Font.PLAIN,20));
        propertytype.setBounds(40,360,160,30);
        add(propertytype);

        city = new JLabel("City:");
        city.setForeground(Color.BLACK);
        city.setFont(new Font("times", Font.PLAIN,20));
        city.setBounds(40,390,80,30);
        add(city);

        bedroom = new JLabel("Bedroom:");
        bedroom.setForeground(Color.BLACK);
        bedroom.setFont(new Font("times", Font.PLAIN,20));
        bedroom.setBounds(40,420,120,30);
        add(bedroom);

        offertype = new JLabel("Offer Type:");
        offertype.setForeground(Color.BLACK);
        offertype.setFont(new Font("times", Font.PLAIN,20));
        offertype.setBounds(400,360,130,30);
        add(offertype);

        Bathroom = new JLabel("Bathroom:");
        Bathroom.setForeground(Color.BLACK);
        Bathroom.setFont(new Font("times", Font.PLAIN,20));
        Bathroom.setBounds(400,390,130,30);
        add(Bathroom);











        add(panel1);
        add(panel2);


    }







    public static void main(String[] args) {
        new Rent3().setVisible(true);
    }

    //  event handling
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            if(i==0)
            {
                JOptionPane.showMessageDialog(null,"This is First Image");
            }
            else
            {
                i=i-1;
                l.setIcon(s[i]);
            }
        }
        if(e.getSource()==b2)
        {
            if(i==s.length-1)
            {
                JOptionPane.showMessageDialog(null,"This is LastImage");
            }
            else
            {
                i=i+1;
                l.setIcon(s[i]);
            }
        }
    }



}






