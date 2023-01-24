import javax.swing.*;

public class kontakt extends JDialog {
    private JPanel panel2;
    public static void main(String[] args) {
        kontakt dialog = new kontakt();
        dialog.setVisible(true);
    }

    public kontakt() {

        this.setContentPane(this.panel2);
        this.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(1000, 900);
}}
