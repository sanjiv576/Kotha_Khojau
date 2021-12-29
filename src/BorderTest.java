import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

class BorderTest extends JFrame{

    ImageIcon backgroundImage;
    Image img, temp;
    JLabel backImg;
    public BorderTest(){
        setTitle("test");
        setBounds(40, 60, 700, 800);



        Image backgroundImage = ImageIO.read(new File("background.jpg"));
        public void paint( Graphics ) {
            super.paint();
            drawImage(backgroundImage, 0, 0, null);
        }


//        backImg = new JLabel(new ImageIcon("log_cover.png"));
//        backImg.setBounds(50, 30, 500, 500);
//        add(backImg);

//
//        backgroundImage = new ImageIcon("log_cover.png");
//        img = backgroundImage.getImage();
//        temp = img.getScaledInstance(500, 600, Image.SCALE_SMOOTH);
//        backgroundImage = new ImageIcon(temp);
//        backImg = new JLabel(backgroundImage);
//        backImg.setLayout(null);
//        backImg.setBounds(0,0, 500, 600);
//        add(backImg);



        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderTest().setVisible(true);
    }
}