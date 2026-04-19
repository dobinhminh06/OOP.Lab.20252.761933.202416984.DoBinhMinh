package Lab03.OtherProjects.Lab01.hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                                            "Do you want to change t othe first class ticket?");
                 
        JOptionPane.showMessageDialog(null, "You've chosen: " 
                                                    + (option == JOptionPane.YES_OPTION?"YES" : "NO"));

        System.exit(0);
    }
}