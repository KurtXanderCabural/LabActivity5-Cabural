package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrabFoodOrder extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public GrabFoodOrder(){
        ButtonGroup discount = new ButtonGroup();
        discount.add(rbNone);
        discount.add(rb5);
        discount.add(rb10);
        discount.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = computedCost(total(), discount());
                JOptionPane.showMessageDialog(null, "The total price is Php" +total);
            }
        });
    }

    private double total (){
        double total = 0;
        if(cPizza.isSelected()){
            total += 100;
        }
        if(cBurger.isSelected()){
            total += 80;
        }
        if(cFries.isSelected()){
            total += 65;
        }
        if(cSoftDrinks.isSelected()){
            total += 55;
        }
        if(cTea.isSelected()){
            total += 50;
        }
        if(cSundae.isSelected()){
            total += 40;
        }
        return total;
    }

    private double discount(){
        double discount = 0;
        if(rb5.isSelected()){
            discount = 0.05;
        }
        else if (rb10.isSelected()){
            discount = 0.1;
        }
        else if (rb15.isSelected()){
            discount = 0.15;
        }
        return discount;
    }

    private double computedCost(double total, double discount){
        return total - (total * discount);
    }
    public static void main(String[] args) {
        GrabFoodOrder grab = new GrabFoodOrder();
        grab.setTitle("Simple Calculator");
        grab.setContentPane(grab.panel1);
        grab.setSize(650, 500);
        grab.setDefaultCloseOperation(EXIT_ON_CLOSE);
        grab.setVisible(true);
    }
}
