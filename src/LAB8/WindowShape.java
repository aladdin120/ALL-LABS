package LAB8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class WindowShape extends JFrame {

    Graphics g;
    final Random random = new Random();

    public Color randomColor() {
        int num = random.nextInt(8);

        switch (num) {
            case 0: {
                return Color.blue;
            }

            case 1: {
                return Color.PINK;
            }

            case 2: {
                return Color.magenta;
            }

            case 3: {
                return Color.orange;
            }

            case 4: {
                return Color.YELLOW;
            }

            case 5: {
                return Color.cyan;
            }

            case 6: {
                return Color.green;
            }

            case 7: {
                return Color.lightGray;
            }

            default: {
                return Color.red;
            }
        }
    }

    public WindowShape() {
        JFrame frame = new JFrame("Фигуры");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();


        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(5);
            System.out.println(num);
            int y = 5;
            int x = 105*i;

            if (i > 9) {
                y = 110;
                x = 105*(i%10);
            }

            if (num == 0 || num == 1 || num == 2) {
                Rectangle rectangle = new Rectangle(randomColor(), num, 0, 0);
                rectangle.setBounds(x, y, 100, 100);
                lp.add(rectangle, JLayeredPane.PALETTE_LAYER);
            } else {
                Circle circle = new Circle(randomColor(), num, 0, 0);
                circle.setBounds(x, y, 100, 100);
                lp.add(circle, JLayeredPane.PALETTE_LAYER);
            }
        }

        setSize(1050, 550);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new WindowShape();
    }
}
