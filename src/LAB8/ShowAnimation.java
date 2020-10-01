package LAB8;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class ShowAnimation extends JPanel {

    int num;
    Image image;

    public ShowAnimation() {
        JFrame frame = new JFrame("LAB8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 340);
        frame.add(this);
        frame.setVisible(true);

        image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk0.png").getImage();
        num = 0;
        Timer timer = new Timer();
        timer.schedule(animation, 0, 120);
    }

    TimerTask animation = new TimerTask() {
        @Override
        public void run() {
            switch (num) {
                case 0:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk0.png").getImage();
                    break;

                case 1:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk1.png").getImage();
                    break;

                case 2:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk2.png").getImage();
                    break;

                case 3:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk3.png").getImage();
                    break;

                case 4:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk4.png").getImage();
                    break;

                case 5:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk5.png").getImage();
                    break;

                case 6:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk6.png").getImage();
                    break;

                case 7:
                    image = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB8/character_zombie_walk7.png").getImage();
                    break;

                default:
                    break;
            }
            num++;
            if (num == 7) num = 0;
            repaint();
        }
    };

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        ShowAnimation obj = new ShowAnimation();
    }
}
