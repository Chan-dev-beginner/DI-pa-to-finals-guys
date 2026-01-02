import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class registrationGUI extends JFrame {

    private JLabel registrationForm;
    private JLabel StudentID;
    private JTextField tfStdID;
    private JLabel StdName;
    private JTextField tfStdName;
    private JPanel mainPanel;
    private JLabel cntctNum;
    private JTextField tfcntctNum;
    private JLabel courseYR;
    private JTextField tfcourseYR;
    private JButton Submit;


    public registrationGUI() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = tfStdID.getText();
                String name = tfStdName.getText();
                String cntctNum = tfcntctNum.getText();
                String courseYR = tfcourseYR.getText();


            }
        });
    }




    public static void main(String[] args) {
        registrationGUI myFrame = new registrationGUI();
    }
}