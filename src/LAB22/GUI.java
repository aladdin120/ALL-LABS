package LAB22;

import javax.swing.*;

public class GUI extends JFrame {

    GUI() {
        super("GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(410, 100, 650, 300);
        add(new Logic());
        setVisible(true);
    }
}
