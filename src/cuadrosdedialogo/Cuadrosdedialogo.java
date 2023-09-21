package paty
import javax.swing.JOptionPane;
public class Cuadrosdedialogo {
public static void main(String[] args) {
    double[] num= new double [5];
    double r=0;
    int a;
    String op;
    JOptionPane.showMessageDialog("Suma");
    for(a=0;a<=4;a++)
    {
        op=JOptionPane.showInputDialog("Ingresa un numero a sumar");
        num[a]=Double.parseDouble(op);
        
        r=r+num[a];
    }
    JOptionPane.showMessageDialog("Suma = " +r);
        
    }
    
}
