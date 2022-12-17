package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LeapYear extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;


    public LeapYear(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText());

                if(isLeap(year)){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }
            }
        });
    }

    private boolean isLeap(int year){
        if( (year %4==0) && (year % 100 != 0) || (year%400==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
