package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IvaForm {
    private JTextPane pricePane;
    private JTextPane ivaPane;
    private JTextPane totalPane;
    private JButton btnCalculate;
    private JPanel taxPanel;

    public IvaForm() {
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new IvaForm().taxPanel);
        frame.setVisible(true);
    }
}
