package LAB22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Logic extends JPanel {

    private JButton outputButton = new JButton("Show list of students");
    private JButton sortGPAButton = new JButton("Sort students by GPA");
    private JButton sortIDButton = new JButton("Sort students by ID");
    private JButton findButton = new JButton("Find student");
    private JTextField findText = new JTextField("Enter name of student",40);
    private JLabel listStudents = new JLabel();
    private JLabel title = new JLabel();
    private TestClass test = new TestClass();

    Logic() {
        findText.setFont(new Font("Dialog", Font.PLAIN, 14));
        String defaultList = test.output();

        findText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                findText.setText("");
            }
        });
        findText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = findText.getText();
                findText.setText("");
                try {
                    String answer = test.FindStudent(name);
                    if(answer == null)
                        throw new MyException();
                    title.setText("<html><div style='text-align: center; font-weight: bold;'>"+ answer +"</div></html>");
                } catch (MyException ex) {
                    title.setText("<html><div style='text-align: center; font-weight: bold;'>"+ ex.getText() +"</div></html>");
                }
            }
        });
        outputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listStudents.setText(defaultList);
                title.setText("");
                findText.setVisible(false);
            }
        });
        sortGPAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findText.setVisible(false);
                test.SortByGPA();
                title.setText("<html><div style='text-align: center; font-weight: bold;'> Sort by GPA </div></html>");
                listStudents.setText(test.output());
            }
        });
        sortIDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findText.setVisible(false);
                test.SortByID();
                title.setText("<html><div style='text-align: center; font-weight: bold;'> Sort by ID </div></html>");
                listStudents.setText(test.output());
            }
        });
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                title.setText("");
                listStudents.setText("");
                findText.setVisible(true);
                findText.repaint();
            }
        });

        add(outputButton);
        add(sortGPAButton);
        add(sortIDButton);
        add(findButton);
        add(listStudents);
        add(findText);
        add(title);
        findText.setVisible(false);
    }
}
