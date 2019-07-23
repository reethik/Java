import javax.swing.*;
 
public class decToBinary {
 
 
    public static void main(String[] args) {
 
 
        int n;
        String numInput;
        String binary;
        numInput = JOptionPane.showInputDialog(null, "Enter a number:");
		n = Integer.parseInt(numInput);
 
         binary  = Integer.toBinaryString(n);
        JOptionPane.showMessageDialog(null, "Binary equivalent is: " +binary);
    }
 
}
