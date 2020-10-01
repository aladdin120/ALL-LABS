package LAB8;

import javax.swing.*;
import java.awt.*;

public class ShowPicture extends JPanel {
    Image image;

    ShowPicture(String path) {
        JFrame frame = new JFrame("LAB8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        image = new ImageIcon(path).getImage();
        frame.add(this);
        frame.setSize(500, 598);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        String path = args[0];
        ShowPicture pic = new ShowPicture(path);
    }
}
