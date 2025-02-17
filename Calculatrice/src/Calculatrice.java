import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice extends JPanel implements ActionListener {

    JTextField operationText ;
    Double operand1, operand2;
    Calculatrice(){
        this.setLayout(new BorderLayout());
        operationText = new JTextField();
        this.add(operationText, BorderLayout.NORTH);



        JPanel buttonsPAnel = new JPanel();



        buttonsPAnel.setLayout(new GridLayout(4,4,10,10));
        JButton oneButton = new JButton("1");
        oneButton.addActionListener(this);
        buttonsPAnel.add(oneButton);
        JButton twoButton = new JButton("2");
        twoButton.addActionListener(this);
        buttonsPAnel.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.addActionListener(this);
        buttonsPAnel.add(threeButton);

        JButton divButton = new JButton("/");
        divButton.addActionListener(this);
        buttonsPAnel.add(divButton);

        JButton fourButton = new JButton("4");
        fourButton.addActionListener(this);
        buttonsPAnel.add(fourButton);

        JButton fiveButton = new JButton("5");
        fiveButton.addActionListener(this);
        buttonsPAnel.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.addActionListener(this);
        buttonsPAnel.add(sixButton);

        JButton prodButton = new JButton("*");
        prodButton.addActionListener(this);
        buttonsPAnel.add(prodButton);

        JButton sevenButton = new JButton("7");
        sevenButton.addActionListener(this);
        buttonsPAnel.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.addActionListener(this);
        buttonsPAnel.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.addActionListener(this);
        buttonsPAnel.add(nineButton);

        JButton minisButton = new JButton("-");
        minisButton.addActionListener(this);
        buttonsPAnel.add(minisButton);

        JButton cleanButton = new JButton("C");
        cleanButton.addActionListener(this);
        buttonsPAnel.add(cleanButton);

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        buttonsPAnel.add(zeroButton);

        JButton virguleButton = new JButton(",");
        virguleButton.addActionListener(this);
        buttonsPAnel.add(virguleButton);

        JButton plusButton = new JButton("+");
        plusButton.addActionListener(this);
        buttonsPAnel.add(plusButton);
        this.add(buttonsPAnel, BorderLayout.CENTER);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(this);
        equalButton.setBackground(Color.BLUE);
        this.add(equalButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame calculatrice = new JFrame("Calculatrice");
        JMenuBar menuBar = new JMenuBar();
        JMenu menuMode = new JMenu("Mode");
        JMenuItem basicItem = new JMenuItem("Basic");
        JMenuItem scientificItem = new JMenuItem("scientific");

        menuMode.add(basicItem);
        menuMode.add(scientificItem);
        menuBar.add(menuMode);
        calculatrice.setJMenuBar(menuBar);
        calculatrice.setSize(300, 400);
        calculatrice.add(new Calculatrice());
        calculatrice.setVisible(true);
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
