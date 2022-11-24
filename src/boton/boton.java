package boton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class boton implements ActionListener {

    private JButton boton;

    public boton(){

        boton = new JButton();
        boton.addActionListener(this);
        boton.setText("error");
        boton.setFont(new Font("Comic Sans", Font.BOLD,25));


    }

    public JButton getBoton(){

        return boton;
    }

    public void setLocation(int x, int y, int width, int height){

        boton.setBounds(x,y,width,height);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            System.out.println("correcto");
            //boton.setEnabled(false); // para poder desactivar el boton

        }

    }
}
