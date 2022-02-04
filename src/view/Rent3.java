package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Rent3 extends JFrame implements ActionListener {
    JPanel panel, panel1,panel2;

    JLabel propertytype,city, bedroom, offertype, Bathroom, ZipCode;
    JLabel detail, detail1, price, detail3, houseowner_name, contact;

    //Button for Back
    JButton backbtn;

    ImageIcon s[];
    JLabel l;
    JButton b1,b2;
    int i,l1;

    public Rent3() {

        setTitle("Home - Rent3");
        //setLayout(new BorderLayout());
        setBounds(100, 80, 750, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new GridLayout(2,1, 0, 10));
        setLayout(null);
        setVisible(true);
        setResizable(false);





        s = new ImageIcon[4];

        s[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/17.png")));
        s[1] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/18.png")));
        s[2] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/19.png")));
        s[3] = new ImageIcon(Objects.requireNonNull(getClass().getResource("rentImage/20.png")));


        l = new JLabel("");
        l.setBounds(50,20,640,250);

        add(l);
        l.setIcon(s[0]);
        //    add(p);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(null);
        lowerPanel.setBounds(50,300,640,350);
        lowerPanel.setBackground(Color.decode("#9F9391"));

        b1 = new JButton("<<");

        b1.setBounds(150, 10, 50, 20);
        b2 = new JButton(">>");
        b2.setBounds(200, 10, 50, 20);

        lowerPanel.add(b1);
        lowerPanel.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);


        //label for home detail in panel1

        detail = new JLabel("DETAILS");
        detail.setForeground(Color.BLACK);
        detail.setFont(new Font("times", Font.BOLD,20));
        detail.setBounds(280,40,160,30);
        lowerPanel.add(detail);



        propertytype = new JLabel("Property Type: Room");
        propertytype.setForeground(Color.BLACK);
        propertytype.setFont(new Font("times", Font.PLAIN,20));
        propertytype.setBounds(30,80,200,30);
        lowerPanel.add(propertytype);

        city = new JLabel("City: Lalitpur");
        city.setForeground(Color.BLACK);
        city.setFont(new Font("times", Font.PLAIN,20));
        city.setBounds(30,120,160,30);
        lowerPanel.add(city);

        Bathroom = new JLabel("Bathroom: 1");
        Bathroom.setForeground(Color.BLACK);
        Bathroom.setFont(new Font("times", Font.PLAIN,20));
        Bathroom.setBounds(30,150,130,30);
        lowerPanel.add(Bathroom);


        bedroom = new JLabel("Bedroom: 1");
        bedroom.setForeground(Color.BLACK);
        bedroom.setFont(new Font("times", Font.PLAIN,20));
        bedroom.setBounds(400,80,120,30);
        lowerPanel.add(bedroom);

        offertype = new JLabel("Offer Type: For Rent");
        offertype.setForeground(Color.BLACK);
        offertype.setFont(new Font("times", Font.PLAIN,20));
        offertype.setBounds(400,120,200,30);
        lowerPanel.add(offertype);

        ZipCode = new JLabel("ZipCode: 85397");
        ZipCode.setForeground(Color.BLACK);
        ZipCode.setFont(new Font("times", Font.PLAIN,20));
        ZipCode.setBounds(400,150,200,30);
        lowerPanel.add(ZipCode);




        detail1 = new JLabel("There is 1 room available at koteshwor.");
        detail1.setForeground(Color.BLACK);
        detail1.setFont(new Font("times", Font.PLAIN,20));
        detail1.setBounds(30,190,700,30);
        lowerPanel.add(detail1);

        price = new JLabel("Price : Rs 5000 ");
        price.setForeground(Color.BLACK);
        price.setFont(new Font("times", Font.PLAIN,20));
        price.setBounds(30,220,200,30);
        lowerPanel.add(price);

        detail3 = new JLabel("Parking and water available. ");
        detail3.setForeground(Color.BLACK);
        detail3.setFont(new Font("times", Font.PLAIN,20));
        detail3.setBounds(30,250,500,30);
        lowerPanel.add(detail3);


        houseowner_name = new JLabel("House Owner : Binaya Karki ");
        houseowner_name.setForeground(Color.BLACK);
        houseowner_name.setFont(new Font("times", Font.PLAIN,20));
        houseowner_name.setBounds(30,280,350,30);
        lowerPanel.add(houseowner_name);

        contact = new JLabel("Contact Number: 9800459329");
        contact.setForeground(Color.BLACK);
        contact.setFont(new Font("times", Font.PLAIN,20));
        contact.setBounds(30,310,350,30);
        lowerPanel.add(contact);

        //back button
        backbtn = new JButton("Back");
        backbtn.setBounds(560,15,80,30);
        lowerPanel.add(backbtn);
        backbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Home().setVisible(true);
            }
        });




        add(lowerPanel);

    }

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

    public static void main(String[] args) {
        new Rent3().setVisible(true);
    }
}
