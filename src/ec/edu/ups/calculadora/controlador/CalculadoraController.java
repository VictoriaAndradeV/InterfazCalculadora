package ec.edu.ups.calculadora.controlador;

import ec.edu.ups.calculadora.modelo.Operacion;
import ec.edu.ups.calculadora.vista.ViewCalculadora;

import java.awt.*;
import java.awt.event.*;

public class CalculadoraController implements ActionListener, ItemListener, WindowListener {

    private ViewCalculadora calculadoraView;
    private Operacion calculadora;

    public CalculadoraController(ViewCalculadora calculadoraview, Operacion calculadora) {
        this.calculadoraView = calculadoraview;
        this.calculadora = new Operacion();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox checkbox = (Checkbox) e.getSource();

        if(checkbox.getState() == true && checkbox.getLabel().equals("Sumar")){
            calculadoraView.getCheckBoxResta().setEnabled(false);
            calculadoraView.getCheckBoxMultiplicacion().setEnabled(false);
            calculadoraView.getCheckBoxDivision().setEnabled(false);
        }

        if(checkbox.getState() == true && checkbox.getLabel().equals("Restar")){
            calculadoraView.getCheckBoxSuma().setEnabled(false);
            calculadoraView.getCheckBoxMultiplicacion().setEnabled(false);
            calculadoraView.getCheckBoxDivision().setEnabled(false);
        }

        if(checkbox.getState() == true && checkbox.getLabel().equals("Multiplicar")){
            calculadoraView.getCheckBoxSuma().setEnabled(false);
            calculadoraView.getCheckBoxResta().setEnabled(false);
            calculadoraView.getCheckBoxDivision().setEnabled(false);
        }

        if(checkbox.getState() == true && checkbox.getLabel().equals("Dividir")){
            calculadoraView.getCheckBoxSuma().setEnabled(false);
            calculadoraView.getCheckBoxResta().setEnabled(false);
            calculadoraView.getCheckBoxMultiplicacion().setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


}
