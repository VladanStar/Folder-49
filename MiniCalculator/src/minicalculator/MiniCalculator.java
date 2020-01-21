package minicalculator;

import javax.swing.JOptionPane;

public class MiniCalculator {

    public static void main(String[] args) {
        while (true) {
            double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Unesite prvi broj: "));
            double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Unesite drugi broj: "));
            String ch;
            double rezultat;

            ch = JOptionPane.showInputDialog(null, "Unesite zeljenu matematicku operaciju:\n"
                    + "+ - sabiranje\n"
                    + "- - oduzimanje\n"
                    + "* - mnozenje \n "
                    + "/ - deljenje\n"
            );

            if (y == 0 && ch.equals("/")) {
                JOptionPane.showMessageDialog(null, "Deljenje nulom nije moguce");
                break;
            } else {
                switch (ch) {
                    case " +":
                        JOptionPane.showMessageDialog(null, (x + y));
                        break;
                    case "-":
                        JOptionPane.showMessageDialog(null, (x - y));
                        break;
                    case "*":
                        JOptionPane.showMessageDialog(null, (x * y));
                        break;
                    case "/":
                        JOptionPane.showMessageDialog(null, (x / y));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Uneli ste pogresan znak");
                        break;

                }

            }

        }
    }

}
