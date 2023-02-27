import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    private JPanel MainPanel;
    private JButton έξοδοςButton;
    private JButton buttonShow;
    private JButton buttonCategories;
    private JButton στατιστικάΓευμάτωνButton;
    private JTextPane notesMeals;
    private JLabel mealsLogo;
    private JLabel mealsTitle;

    public MainScreen() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,400));
        setContentPane(MainPanel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);


        buttonShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowMealsScreen showMealsScreen = new ShowMealsScreen();
                showMealsScreen.setVisible(true);


            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
