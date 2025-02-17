import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatriceScientific extends JPanel implements ActionListener {

    JTextField operationText ;
    Double operand1, operand2;
    CalculatriceScientific(){
        this.setLayout(new BorderLayout());
        operationText = new JTextField();
        this.add(operationText, BorderLayout.NORTH);



        JPanel buttonsPAnel = new JPanel();



        buttonsPAnel.setLayout(new GridLayout(4,4,10,10));

        String[] buttons = {"7", "8", "9", "/",
                "6", "5", "4", "*",
                "3", "2", "1", "-",
                "C", "0", ".", "+"};

        for (String button : buttons){
            JButton currentButton = new JButton(button);
            currentButton.addActionListener(this);
            buttonsPAnel.add(currentButton);
        }




        this.add(buttonsPAnel, BorderLayout.EAST);



        JPanel buttonsLeftPAnel = new JPanel();
        buttonsLeftPAnel.setLayout(new GridLayout(4,4,10,10));

        String[] buttonsLeft = {"cos", "sin", "tan", "/",
                "6", "5", "4", "*",
                "3", "2", "1", "-",
                "C", "0", ".", "+"};

        for (String button : buttonsLeft){
            JButton currentButton = new JButton(button);
            currentButton.addActionListener(this);
            buttonsLeftPAnel.add(currentButton);
        }




        this.add(buttonsLeftPAnel, BorderLayout.WEST);

        JSeparator jSeparator = new JSeparator(SwingConstants.VERTICAL);
        jSeparator.setPreferredSize(new Dimension(2,getHeight()));


        this.add(jSeparator,BorderLayout.CENTER);


        JButton equalButton = new JButton("=");
        equalButton.addActionListener(this);
        equalButton.setBackground(Color.BLUE);
        this.add(equalButton, BorderLayout.SOUTH);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
       String textButton =  ((JButton)e.getSource()).getText();
        System.out.println(textButton);
        switch (textButton){
            case "+":
                operand1=Double.parseDouble(operationText.getText());
            case "-":
                operand1=Double.parseDouble(operationText.getText());
            case "/":
                operand1=Double.parseDouble(operationText.getText());
            case "*":
                operand1=Double.parseDouble(operationText.getText());
            case "C":
                operationText.setText("");
            case ",":
                operand1=Double.parseDouble(operationText.getText());
            case "cos":
                Double value = Double.parseDouble(operationText.getText());
                Double cosValue = Math.cos(Math.toRadians(value));
                System.out.println(value);
                System.out.println(cosValue);
                operationText.setText(String.valueOf(cosValue));
                break;
            case "=":
                operand2=Double.parseDouble(operationText.getText());
                operationText.setText(String.valueOf(operand2+operand1));
            default:
                operationText.setText(operationText.getText()+textButton);
        }
    }
}
