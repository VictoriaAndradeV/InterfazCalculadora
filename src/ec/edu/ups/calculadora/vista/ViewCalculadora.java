package ec.edu.ups.calculadora.vista;

import ec.edu.ups.calculadora.modelo.Operacion;

import java.awt.*;
import java.awt.event.ItemEvent;

public class VentanaCalculadora extends Frame{

    private Panel panelGeneral;
    private Panel panelSuperior;
    private Panel panelIntermedio;
    private Panel panelInferior;

    private Label labelNum1;
    private Label labelNum2;
    private Label labelResultado;
    
    private TextField textFieldNum1;
    private TextField textFieldNum2;
    private TextField textFieldResultado;
    
    private Checkbox checkBoxSuma;
    private Checkbox checkBoxResta;
    private Checkbox checkBoxMultiplicacion;
    private Checkbox checkBoxDivision;

    private Button botonCalcular;
    private Button botonLimpiar;

    private Operacion calculadora;


    public VentanaCalculadora() {
        setTitle("Calculadora Operaciones elementales");
        setSize(500, 500);
        setLocationRelativeTo(null);

        //instanciasr calculadora
        calculadora = new Operacion();

        panelGeneral = new Panel(new BorderLayout());

        panelSuperior = new Panel(new GridLayout(3,2));
        panelIntermedio = new Panel(new GridLayout(2,2));
        panelInferior = new Panel(new GridLayout(2,2));

        panelGeneral.add(panelSuperior, BorderLayout.NORTH);
        panelGeneral.add(panelIntermedio, BorderLayout.CENTER);
        panelGeneral.add(panelInferior, BorderLayout.SOUTH);

        labelNum1 = new Label("Numero 1");
        labelNum2 = new Label("Numero 2");
        labelResultado = new Label("Resultado");

        //creamos cajas de texto
        textFieldNum1 = new TextField("0.00", 10);
        textFieldNum2 = new TextField("0.00", 10);
        textFieldResultado = new TextField("0.00", 10);

        textFieldResultado.setEditable(false);


        panelSuperior.add(labelNum1);
        panelSuperior.add(textFieldNum1);

        panelSuperior.add(labelNum2);
        panelSuperior.add(textFieldNum2);

        panelSuperior.add(labelResultado);
        panelSuperior.add(textFieldResultado);

        checkBoxSuma =  new Checkbox("Suma");
        checkBoxResta =  new Checkbox("Resta");
        checkBoxMultiplicacion =  new Checkbox("Multiplicacion");
        checkBoxDivision =  new Checkbox("Division");

        panelIntermedio.add(checkBoxSuma);
        panelIntermedio.add(checkBoxResta);
        panelIntermedio.add(checkBoxMultiplicacion);
        panelIntermedio.add(checkBoxDivision);

        botonCalcular = new Button("Calcular");
        botonLimpiar = new Button("Limpiar");

        panelInferior.add(botonCalcular);
        panelInferior.add(botonLimpiar);

        add(panelGeneral);
        setVisible(true);
        /*
        checkBoxSuma.addItemListener({
            @Override
            public void itemStateChanged(ItemEvent){

            }

        });*/

    }



    public Panel getPanelGeneral() {
        return panelGeneral;
    }

    public void setPanelGeneral(Panel panelGeneral) {
        this.panelGeneral = panelGeneral;
    }

    public Panel getPanelSuperior() {
        return panelSuperior;
    }

    public void setPanelSuperior(Panel panelSuperior) {
        this.panelSuperior = panelSuperior;
    }

    public Panel getPanelIntermedio() {
        return panelIntermedio;
    }

    public void setPanelIntermedio(Panel panelIntermedio) {
        this.panelIntermedio = panelIntermedio;
    }

    public Panel getPanelInferior() {
        return panelInferior;
    }

    public void setPanelInferior(Panel panelInferior) {
        this.panelInferior = panelInferior;
    }

    public Label getLabelNum1() {
        return labelNum1;
    }

    public void setLabelNum1(Label labelNum1) {
        this.labelNum1 = labelNum1;
    }

    public Label getLabelNum2() {
        return labelNum2;
    }

    public void setLabelNum2(Label labelNum2) {
        this.labelNum2 = labelNum2;
    }

    public Label getLabelResultado() {
        return labelResultado;
    }

    public void setLabelResultado(Label labelResultado) {
        this.labelResultado = labelResultado;
    }

    public TextField getTextFieldNum1() {
        return textFieldNum1;
    }

    public void setTextFieldNum1(TextField textFieldNum1) {
        this.textFieldNum1 = textFieldNum1;
    }

    public TextField getTextFieldNum2() {
        return textFieldNum2;
    }

    public void setTextFieldNum2(TextField textFieldNum2) {
        this.textFieldNum2 = textFieldNum2;
    }

    public TextField getTextFieldResultado() {
        return textFieldResultado;
    }

    public void setTextFieldResultado(TextField textFieldResultado) {
        this.textFieldResultado = textFieldResultado;
    }

    public Checkbox getCheckBoxSuma() {
        return checkBoxSuma;
    }

    public void setCheckBoxSuma(Checkbox checkBoxSuma) {
        this.checkBoxSuma = checkBoxSuma;
    }

    public Checkbox getCheckBoxResta() {
        return checkBoxResta;
    }

    public void setCheckBoxResta(Checkbox checkBoxResta) {
        this.checkBoxResta = checkBoxResta;
    }

    public Checkbox getCheckBoxMultiplicacion() {
        return checkBoxMultiplicacion;
    }

    public void setCheckBoxMultiplicacion(Checkbox checkBoxMultiplicacion) {
        this.checkBoxMultiplicacion = checkBoxMultiplicacion;
    }

    public Checkbox getCheckBoxDivision() {
        return checkBoxDivision;
    }

    public void setCheckBoxDivision(Checkbox checkBoxDivision) {
        this.checkBoxDivision = checkBoxDivision;
    }

    public Button getBotonCalcular() {
        return botonCalcular;
    }

    public void setBotonCalcular(Button botonCalcular) {
        this.botonCalcular = botonCalcular;
    }

    public Button getBotonLimpiar() {
        return botonLimpiar;
    }

    public void setBotonLimpiar(Button botonLimpiar) {
        this.botonLimpiar = botonLimpiar;
    }

    public void sumar(){
        //wrappers, convertir cadena de texto a double
        //el textFied siempre devuelve string, no int, double, etc.
        double numero1 = Double.parseDouble(textFieldNum1.getText());
        double numero2 = Double.parseDouble(textFieldNum2.getText());

        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);

        double resultado = calculadora.sumar();
        //convertir de double a cadena de texto
        textFieldResultado.setText(String.valueOf(resultado));

    }



}
