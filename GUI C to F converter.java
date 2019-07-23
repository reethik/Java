import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class myGUIClass<FahrenheitButtonHandler> extends JFrame{

    private JLabel msgCelsius;
    private JLabel msgFahrenheit;
    private JButton btnCelsius;
    private JButton btnFahrenheit;
    private static JTextField fldCelsius;
    private static JTextField fldFahrenheit;
    Container contain;


    public myGUIClass(String myGUIWindow){
        super("myGui");
        contain = getContentPane();
        contain.setLayout(new FlowLayout());

        msgCelsius = new JLabel("Degrees in Celsius");
        btnCelsius = new JButton("Convert From Celsius to Fahrenheit");
        fldCelsius = new JTextField(15);

        msgFahrenheit = new JLabel("Degrees in Fahrenheit  ");
        btnFahrenheit = new JButton("Convert From Fahrenheit to Celsius");
        fldFahrenheit = new JTextField(15);

        contain.add(msgCelsius);
        contain.add(fldCelsius);
        contain.add(btnCelsius);

        contain.add(msgFahrenheit);
        contain.add(fldFahrenheit);
        contain.add(btnFahrenheit);

        CelsiusButtonHandler btnHandlerCelsius = new CelsiusButtonHandler();
        btnCelsius.addActionListener(btnHandlerCelsius);

        FahrenheitButtonHandler btnHandlerFahrenheit = new FahrenheitButtonHandler();
        btnFahrenheit.addActionListener(btnHandlerFahrenheit);

        setSize(400,200);   
        setVisible(true);


    }//end method

    private class CelsiusButtonHandler implements ActionListener{
        //@Override

        //implement the listener interface methods to process the events
        public void actionPerformed(ActionEvent ae){

            Integer celsius;
            Integer fahrenheit;

            try{
                if (ae.getSource() == btnCelsius){
                    celsius = Integer.parseInt(fldCelsius.getText());
                    fahrenheit = Math.round((9 /(float)5)) * (celsius + 32);
                    fldFahrenheit.setText(fahrenheit.toString());
                }//end if
            }//end try

            catch (Exception e){
                fldFahrenheit.setText("");
            }//end catch
    }//end inner class

        }//end class

    private class FahrenheitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent a){
            Integer fahrenheit1;
            Integer celsius1;

            try{
                if(a.getSource()== btnFahrenheit){
                    fahrenheit1 = Integer.parseInt(fldFahrenheit.getText());
                    celsius1 = Math.round((5 / (float)9)) * (fahrenheit1 - 32);
                    fldCelsius.setText(celsius1.toString());
                    }//end if
            }//end try

            catch (Exception e){
                fldCelsius.setText("");
            }//end catch

        }//end method
        }//end private class


    public static void main (String[] args){
        @SuppressWarnings("rawtypes")
        myGUIClass guiClass = new myGUIClass(null);
        guiClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end main
    }//end outer class
