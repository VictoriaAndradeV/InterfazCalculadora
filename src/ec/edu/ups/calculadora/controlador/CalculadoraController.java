package ec.edu.ups.calculadora.controlador;

import java.awt.*;
import java.awt.event.*;

public class CalculadoraController implements ActionListener, ItemListener, WindowListener {

    public CalculadoraController(Calc) {
        this.calculadoraView =
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox checkbox = (Checkbox) e.getSource();

        if(checkbox.getState() == true && checkbox.getLabel().equals("Sumar")){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
