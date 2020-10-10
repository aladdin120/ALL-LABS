package LAB11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private String health = " ❤ ❤ ❤";

    public Game() {
        super("Игра-угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        Container container = getContentPane();
        int rndm = (int) (Math.random() * 20);


        JTextField input = new JTextField("", 1);
        JLabel text = new JLabel("<html> <h4> Осталось попыток: "+ health + " </h4> <p> Введите число в поле");

        JButton button = new JButton("Ввести число");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int data = Integer.parseInt(input.getText());
                ImageIcon yes = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB11/yes.png");
                ImageIcon no = new ImageIcon("/Users/Fedor/IdeaProjects/practic/src/LAB11/no.png");
                if (data == rndm) {
                    JOptionPane.showMessageDialog(null, "<html> <h2> Вы угадали число! </h2> </html>", "Все верно!", JOptionPane.INFORMATION_MESSAGE, yes);
                    dispose();
                    System.exit(0);
                } else {
                    if (health.length() == 2) {
                        JOptionPane.showMessageDialog(null, "<html> <h2> Вы не угадали число! </h2> <p>Больше попыток не осталось :( </html>", "Игра окончена", JOptionPane.INFORMATION_MESSAGE, no);
                        dispose();
                        System.exit(0);
                    }

                    health = health.substring(0, health.length() - 2);
                    text.setText("<html> <h4> Осталось попыток: "+ health + " </h4> <p> Введите число в поле");
                    input.setText("");

                    if (data > rndm)
                        JOptionPane.showMessageDialog(null, "<html> <h2> Вы не угадали число! </h2> <p>Я загадал число меньше, чем ваше </html>", "Попробуйте еще раз!", JOptionPane.INFORMATION_MESSAGE, no);
                    else
                        JOptionPane.showMessageDialog(null, "<html> <h2> Вы не угадали число! </h2> <p>Я загадал число больше, чем ваше </html>", "Попробуйте еще раз!", JOptionPane.INFORMATION_MESSAGE, no);

                }
            }
        });

        container.add(text, "North");
        container.add(input);
        container.add(button, "South");
        setBounds(600, 400, 300, 140);
        setVisible(true);
    }

    public static void main(String[] args) {
        Game test = new Game();
    }
}
