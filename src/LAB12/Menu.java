package LAB12;

import javax.swing.*;
import java.awt.*;


public class Menu extends JFrame
{
    private JLabel text;


    Menu() {
        super("Гравитация планет");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createPlanet());

        Container container = getContentPane();
        text = new JLabel("<html> Фото солнечной системы <p> правила </html>");
        container.add(text);

        setJMenuBar(menuBar);
        setBounds(600, 400, 200, 100);
        setVisible(true);
    }

    private JMenu createPlanet() {
        JMenu menu = new JMenu("List of planets");

        JMenuItem mercury = new JMenuItem("MERCURY");
        mercury.addActionListener(e -> {
            Planets mercury1 = Planets.MERCURY;
            text.setText(String.format("<html> The gravity on the planet <b> MERCURY </b> is %.5f m/s&#178 </html>", mercury1.getG()));
        });
        menu.add(mercury);


        JMenuItem venus = new JMenuItem("VENUS");
        venus.addActionListener(e -> {
            Planets venus1 = Planets.VENUS;
            text.setText(String.format("<html> The gravity on the planet <b> VENUS </b> is %.5f m/s&#178 </html>", venus1.getG()));
        });
        menu.add(venus);

        JMenuItem earth = new JMenuItem("EARTH");
        earth.addActionListener(e -> {
            Planets earth1 = Planets.EARTH;
            text.setText(String.format("<html> The gravity on the planet <b> EARTH </b> is %.5f m/s&#178 </html>", earth1.getG()));
        });
        menu.add(earth);

        JMenuItem mars = new JMenuItem("MARS");
        mars.addActionListener(e -> {
            Planets mars1 = Planets.MARS;
            text.setText(String.format("<html> The gravity on the planet <b> MARS </b> is %.5f m/s&#178 </html>", mars1.getG()));
        });
        menu.add(mars);

        JMenuItem jupiter = new JMenuItem("JUPITER");
        jupiter.addActionListener(e -> {
            Planets jupiter1 = Planets.VENUS;
            text.setText(String.format("<html> The gravity on the planet <b> Jupiter </b> is %.5f m/s&#178 </html>", jupiter1.getG()));
        });
        menu.add(jupiter);

        JMenuItem saturn = new JMenuItem("SATURN");
        saturn.addActionListener(e -> {
            Planets saturn1 = Planets.SATURN;
            text.setText(String.format("<html> The gravity on the planet <b> SATURN </b> is %.5f m/s&#178 </html>", saturn1.getG()));
        });
        menu.add(saturn);

        JMenuItem uranus = new JMenuItem("URANUS");
        uranus.addActionListener(e -> {
            Planets uranus1 = Planets.URANUS;
            text.setText(String.format("<html> The gravity on the planet <b> URANUS </b> is %.5f m/s&#178 </html>", uranus1.getG()));
        });
        menu.add(uranus);

        JMenuItem neptune = new JMenuItem("NEPTUNE");
        neptune.addActionListener(e -> {
            Planets neptune1 = Planets.NEPTUNE;
            text.setText(String.format("<html> The gravity on the planet <b> NEPTUNE </b> is %.5f m/s&#178 </html>", neptune1.getG()));
        });
        menu.add(neptune);

        menu.addSeparator();
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> {
            dispose();
            System.exit(0);
        });
        menu.add(exit);

        return menu;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}

