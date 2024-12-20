import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIApplication{
    public static void main(String args[]){

        //creates JFrame called ageFrame and inializes size,name, and close operation
        JFrame ageFrame = new JFrame("Age Calculator");
        ageFrame.setSize(300,300);
        ageFrame.setTitle("Age Calculator");
        ageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ageFrame.pack();

        //creates the JPanel which holds the labels, textFields, and buttons
        JPanel myPanel = new JPanel();
        JLabel myLabel = new JLabel("Enter Birthday in yyyy-mm-dd Format:");
        JTextField input1 = new JTextField(10);
        JButton myButton = new JButton("Calculate Age");
        JLabel LabelledAge = new JLabel("Age: ");
    }
}