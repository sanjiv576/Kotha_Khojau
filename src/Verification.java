import javax.swing.*;

public class Verification extends JFrame {

    JLabel verifyLbl;

    public Verification(){
        setTitle("Verification Window");
        setBounds(200, 100, 400, 400);
        setResizable(false);
        setLayout(null);

        verifyLbl = new JLabel("<html>OTP code has been sent to the email.<br>" +
                "Please, enter the code to verify.</html>", SwingConstants.CENTER);
        verifyLbl.setBounds(50, 50, 300, 100);
        add(verifyLbl);

        setVisible(true);



    }
    public static void main(String[] args) {

        new Verification().setVisible(true);
    }
}
