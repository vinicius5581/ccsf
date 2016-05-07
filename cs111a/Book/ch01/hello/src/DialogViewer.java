/**
 * Created by vinicius on 3/3/16.
 */
import javax.swing.JOptionPane;

public class DialogViewer {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, World!");

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
    }
}
