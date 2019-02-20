import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inventoryForm {
    private JPanel inventoryPanel;
    private JButton bt_back;
    private JLabel lbl_nom;
    private JLabel lbl_prenom;
    private JLabel lbl_role;
    private JScrollBar scrollBar1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;

    private static JFrame frame;
    private static String userMatricule;

    public inventoryForm() {
        lbl_nom.setText(Agents.getNomAgent(Integer.valueOf(userMatricule)));
        lbl_prenom.setText(Agents.getPrenomAgent(Integer.valueOf(userMatricule)));
        lbl_role.setText("Agent");

        bt_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                loginForm.main(null);

            }
        });
    }

    public static void main(String[] args, String matricule) {
        userMatricule = matricule;
        frame = new JFrame("inventoryForm");
        frame.setContentPane(new inventoryForm().inventoryPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }

}
