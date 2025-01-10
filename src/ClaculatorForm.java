import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClaculatorForm {
    private JPanel JPanel1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button8;
    private JButton a0Button;
    private JButton a8Button;
    private JButton a7Button;
    private JTree tree1;
    private JButton devButton;
    private JButton multButton;
    private JButton subButton;
    private JButton addButton;
    private JTextArea textArea1;
    private JTextField textField1;

    public JPanel getJPanel1() {
        return JPanel1;
    }
    public ClaculatorForm() {

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var eight = e.getSource().toString();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = "1";
                textArea1.append(num);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setVisible(boolean b) {
    }
}
