package Lab03.OtherProjects.Lab01.hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String[] option = {"First Degree Equation", 
        "System Of First-degree Equations" , "Second Degree Equation"}; 

        int choice = JOptionPane.showOptionDialog(null, "Please select the type of equation you want to solve: ", 
        "Equation Solver", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        
        switch (choice) {
            case 0:
                solveFirstDegreeEquation();
                break;
            case 1:
                solveSystemOfFirstDegreeEquations();
                break;
            case 2:
                solveSecondDegreeEquation();
                break;
            default:
                break;
        }
    } 

    private static void solveFirstDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient b:"));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is: " + solution);
        }
    }

    private static void solveSystemOfFirstDegreeEquations() {
        
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b2:"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x = D1 / D;
            double y = D2 / D;
            JOptionPane.showMessageDialog(null, "The solution is: x1 = " + x + ", x2 = " + y);
        }
    }

    private static void solveSecondDegreeEquation() {
        String inputA = JOptionPane.showInputDialog(null, "Enter coefficient a:");
        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.");
                else JOptionPane.showMessageDialog(null, "No solution.");
            } else {
                JOptionPane.showMessageDialog(null, "Linear solution: x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Two real roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "One double root: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "No real roots.");
            }
        }
    }
}