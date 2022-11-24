package GUI;

import javax.swing.*;
import java.awt.*;
import boton.*;

public class GUI {

    //Panel declaration!
    private JPanel redPanel; //header panel

    private JPanel pinkPanel; // footer panel

    private JPanel greenPanel; //navigation panel

    private JPanel bluePanel; //data panel

    private JPanel yellowPanel; //scrollBar

    private JLabel label;
    private JFrame frame;

    private boton boton_izq_1;
    private boton boton_izq_2;
    private boton boton_izq_3;

    public GUI(){

        frame = new JFrame();

        redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setPreferredSize(new Dimension(100,100));

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setPreferredSize(new Dimension(100,100));

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setPreferredSize(new Dimension(150,100));

        boton_izq_1 = new boton();
        boton_izq_2 = new boton();
        boton_izq_3 = new boton();

        boton_izq_1.setText("Modificar");
        boton_izq_2.setText("Expensas");
        boton_izq_3.setText("Edificios");

        greenPanel.add(boton_izq_1.getBoton());
        greenPanel.add(boton_izq_2.getBoton());
        greenPanel.add(boton_izq_3.getBoton());

        pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setPreferredSize(new Dimension(100,100));

        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setPreferredSize(new Dimension(100,100));



        //Starting window!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setTitle("Consorcio");
        frame.setSize(1280,720);
        frame.setVisible(true);

        frame.add(redPanel, BorderLayout.NORTH);
        frame.add(bluePanel,BorderLayout.CENTER);
        frame.add(greenPanel, BorderLayout.WEST);
        frame.add(pinkPanel, BorderLayout.SOUTH);
        frame.add(yellowPanel, BorderLayout.EAST);



    }

    public static void main(String[] args){

        new GUI();

    }



}
