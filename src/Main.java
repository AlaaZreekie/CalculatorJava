import javax.swing.*;
import java.text.Normalizer;

public class Main {

    public static ClaculatorForm getForm() {
        return new ClaculatorForm();
    }

    public static void main(String[] args) {
        ClaculatorForm form = new ClaculatorForm();
        JFrame frame = new JFrame("Your window name");
        frame.setContentPane(form.getJPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); frame.setVisible(true);

    }
}