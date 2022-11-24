package GUI;

import javax.swing.*;
import java.awt.*;
import boton.*;

public class GUI {

    //Panel declaration!
    private JPanel redPanel;

    private JPanel pinkPanel;

    private JPanel greenPanel;

    private JPanel bluePanel;

    private JLabel label;
    private JFrame frame;

    private boton Myboton;

    public GUI(){

        frame = new JFrame();

        redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        Myboton = new boton();

        //Starting window!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("Consorcio");
        frame.setSize(1280,720);
        frame.setVisible(true);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        Myboton.setLocation(100,100,250,250);

        greenPanel.add(Myboton.getBoton());
        //frame.add(Myboton.getBoton());

    }

    public static void main(String[] args){

        new GUI();

    }



}
