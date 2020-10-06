package LAB8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class WindowShape extends JFrame {

    Graphics g;
    final Random random = new Random();
    Container container = getContentPane();

    public void GetShape() {
        JLayeredPane lp = getLayeredPane();
        JPanel panel = new JPanel();


        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(5);
            int c1 = random.nextInt(255);
            int c2 = random.nextInt(255);
            int c3 = random.nextInt(255);
            Color color = new Color(c1, c2, c3);

            int y = 5;
            int x = 105*i;

            if (i > 9) {
                y = 110;
                x = 105*(i%10);
            }

            if (num == 0 || num == 1 || num == 2) {
                Rectangle rectangle = new Rectangle(color, num, 0, 0);
                rectangle.setBounds(x, y, 100, 100);
                lp.add(rectangle, JLayeredPane.PALETTE_LAYER);
            } else {
                Circle circle = new Circle(color, num, 0, 0);
                circle.setBounds(x, y, 100, 100);
                lp.add(circle, JLayeredPane.PALETTE_LAYER);
            }
        }
    }

    public WindowShape() {
        JFrame frame = new JFrame("Фигуры");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container.setLayout(new FlowLayout());
        Action action = new SimpleAction();

        JButton button = new JButton(action);
        button.setName("BUTTON");
        button.setText("Press me");
        button.setPreferredSize(new Dimension(300, 100));
        container.add(button);

        setSize(1050, 550);
        setVisible(true);
    }

    class SimpleAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            container.remove(button);
            GetShape();

        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new WindowShape();
    }
}
