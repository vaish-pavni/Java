import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name:");
        JOptionPane.showMessageDialog(null, "HELLO"+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        JOptionPane.showMessageDialog(null,"You are "+age+ "years old");
    }
}
