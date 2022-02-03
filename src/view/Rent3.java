package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Rent3 extends JFrame implements ActionListener {
    JPanel panel, panel1,panel2;

    JLabel propertytype,city, bedroom, offertype, Bathroom;
    JLabel detail, detail1, price, detail3, houseowner_name, contact;

    //Button for Back
    JButton backbtn;

    ImageIcon s[];
    JLabel l;
    JButton b1,b2;
    int i,l1;





    public Rent3() {

        setTitle("Home - Rent3");
        setBounds(300, 20, 700, 815);
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
        panel.setBounds(50, 200, 450, 120);
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

        //back button
        backbtn = new JButton("Back");
        backbtn.setBounds(30,10,80,30);
        add(backbtn);
        backbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Renter_userprofile().setVisible(true);
            }
        });



        //label for home detail in panel1

        propertytype = new JLabel("Property Type: Room");
        propertytype.setForeground(Color.BLACK);
        propertytype.setFont(new Font("times", Font.PLAIN,20));
        propertytype.setBounds(40,360,200,30);
        add(propertytype);

        city = new JLabel("City: Kathmandu");
        city.setForeground(Color.BLACK);
        city.setFont(new Font("times", Font.PLAIN,20));
        city.setBounds(40,390,160,30);
        add(city);

        bedroom = new JLabel("Bedroom: 2");
        bedroom.setForeground(Color.BLACK);
        bedroom.setFont(new Font("times", Font.PLAIN,20));
        bedroom.setBounds(40,420,120,30);
        add(bedroom);

        offertype = new JLabel("Offer Type: For Rent");
        offertype.setForeground(Color.BLACK);
        offertype.setFont(new Font("times", Font.PLAIN,20));
        offertype.setBounds(400,360,200,30);
        add(offertype);

        Bathroom = new JLabel("Bathroom: 1");
        Bathroom.setForeground(Color.BLACK);
        Bathroom.setFont(new Font("times", Font.PLAIN,20));
        Bathroom.setBounds(400,390,130,30);
        add(Bathroom);


        // label on panel2
        detail = new JLabel("DETAILS");
        detail.setForeground(Color.BLACK);
        detail.setFont(new Font("times", Font.BOLD,20));
        detail.setBounds(280,520,160,30);
        add(detail);

        detail1 = new JLabel("There is a room available for rent in Satdobato, lalitpur near Anfa.");
        detail1.setForeground(Color.BLACK);
        detail1.setFont(new Font("times", Font.PLAIN,20));
        detail1.setBounds(40,550,700,30);
        add(detail1);

        price = new JLabel("Price : Rs 10,000 ");
        price.setForeground(Color.BLACK);
        price.setFont(new Font("times", Font.PLAIN,20));
        price.setBounds(40,580,200,30);
        add(price);

        detail3 = new JLabel("2 bedrooms including Kitchen bathroom is available ");
        detail3.setForeground(Color.BLACK);
        detail3.setFont(new Font("times", Font.PLAIN,20));
        detail3.setBounds(40,610,500,30);
        add(detail3);


        houseowner_name = new JLabel("Deepak Adhikari ");
        houseowner_name.setForeground(Color.BLACK);
        houseowner_name.setFont(new Font("times", Font.PLAIN,20));
        houseowner_name.setBounds(40,640,150,30);
        add(houseowner_name);

        contact = new JLabel("9800562061");
        contact.setForeground(Color.BLACK);
        contact.setFont(new Font("times", Font.PLAIN,20));
        contact.setBounds(40,670,150,30);
        add(contact);













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






