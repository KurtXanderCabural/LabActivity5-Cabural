package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalc(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result = 0;
                if(cbOperations.getSelectedItem().equals("+")){
                    result = num1 + num2;
                }
                if(cbOperations.getSelectedItem().equals("-")){
                    result = num1 - num2;
                }
                if(cbOperations.getSelectedItem().equals("/")){
                    result = num1 / num2;
                }
                if(cbOperations.getSelectedItem().equals("*")){
                    result = num1 * num2;
                }
                String str = String.valueOf(result);
                lblResult.setText(str);
            }
        });
    }



    public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc();
        calc.setTitle("Simple Calculator");
        calc.setContentPane(calc.panel1);
        calc.setSize(600, 300);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
