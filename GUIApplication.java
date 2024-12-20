import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

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
        JLabel LabelledAge = new JLabel("Age Will Appear Here ");

        //creates an action listener that will return the age using the current date and the birthday that was entered.
        myButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent button1){
                //try and catch is added to prevent errors
                try{
                    LocalDate birthDay = LocalDate.parse(input1.getText());
                    LocalDate now = LocalDate.now();
                    Period period = Period.between(birthDay, now);
                    LabelledAge.setText("You are " + period.getYears() + " years old.");
                }catch(Exception ex){
                    LabelledAge.setText("Please enter valid date");
                }
            }
        });
        
        //make the panel and frame visible after adding all components
        myPanel.add(myLabel);
        myPanel.add(input1);
        myPanel.add(myButton);
        myPanel.add(LabelledAge);
        
        ageFrame.add(myPanel);
        ageFrame.setVisible(true);
    }
}