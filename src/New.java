import javax.swing.*;
import java.awt.*;

public class New extends JFrame {
    JTabbedPane tp;
    JPanel panel, panel1, panel2;



    public New() {
        setTitle("Dashboard");
        setBounds(3, 40, 1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.decode("#DFDFDF"));
        setLayout(null);
        setResizable(false);

        tp = new JTabbedPane();
        tp.setBounds(0,0,104,720);
       // tp = new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);
        add(tp);

        panel = new JPanel();

        panel1 = new JPanel();
        panel2= new JPanel();

        panel2.add(new JButton("Update PROFILE"));


        tp.add("Home", panel);
        tp.add("profile", panel1);
        tp.add("setting", panel2);






    }
    public static void main(String[] args) {
        new New().setVisible(true);
    }

}
