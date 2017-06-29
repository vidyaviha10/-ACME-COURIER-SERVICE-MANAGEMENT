import javax.swing.JOptionPane;

import utils.GenerateInvoice;
import utils.LoadUsers;
import utils.ManageClients;
import utils.ManageEmployees;
import utils.ManageTickets;

public class Start {


    public static void main(final String arg[]) {
        try {

            new LoadUsers();
            new ManageEmployees();
            new ManageTickets();
            new ManageClients();
            new GenerateInvoice();

            Login frame = new Login();

            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}