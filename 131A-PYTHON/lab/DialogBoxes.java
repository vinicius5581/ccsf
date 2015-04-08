import javax.swing.JOptionPane;

class DialogBoxes
{
    public static void main(String[] args)
    {
        String name;
        JOptionPane.showMessageDialog(null, "Hello World");
        name = JOptionPane.showInputDialog("Enter your name.");//Always return a string.
        JOptionPane.showMessageDialog(null, "Your name is " + name);

        System.exit(0); //Required when using JOptionPane as JOptionPane class causes an additional task to run in the JVM.
    }
}
