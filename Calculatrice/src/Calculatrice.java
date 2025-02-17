import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice extends JFrame {


    private CalculatriceBasic calculatriceBasic;
    private CalculatriceScientific calculatriceScientific;

    Calculatrice(){
        setTitle("Calculatrice Basic");
        setSize(300, 400);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuMode = new JMenu("Mode");
        JMenuItem basicItem = new JMenuItem("Basic");
        JMenuItem scientificItem = new JMenuItem("scientific");

        menuMode.add(basicItem);
        menuMode.add(scientificItem);
        menuBar.add(menuMode);
        setJMenuBar(menuBar);

        calculatriceBasic = new CalculatriceBasic();
        add(calculatriceBasic,BorderLayout.CENTER);
        calculatriceScientific = new CalculatriceScientific();

        basicItem.addActionListener(event -> switchMode("Basic"));
        scientificItem.addActionListener(event -> switchMode("Scientific"));

    }

    private void switchMode(String mode) {
        getContentPane().removeAll();
        if(mode == "Basic"){
            System.out.println("basic");
            add(calculatriceBasic,BorderLayout.CENTER);
        }else{
            System.out.println("not basic");
            add(calculatriceScientific,BorderLayout.CENTER);
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        calculatrice.setVisible(true);
    }


}
