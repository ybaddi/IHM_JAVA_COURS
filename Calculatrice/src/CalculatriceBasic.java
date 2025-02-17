import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatriceBasic extends JPanel implements ActionListener {

    JTextField operationText ;
    Double operand1, operand2;
    CalculatriceBasic(){
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




        this.add(buttonsPAnel, BorderLayout.CENTER);

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
            case "=":
                operand2=Double.parseDouble(operationText.getText());
                operationText.setText(String.valueOf(operand2+operand1));
            default:
                operationText.setText(operationText.getText()+textButton);
        }
    }
}
