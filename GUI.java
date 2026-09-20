import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "HELLO"+name);
    }
}
