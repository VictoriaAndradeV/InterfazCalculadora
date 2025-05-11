package ec.edu.ups.calculadora.modelo;

import java.util.Objects;

public class Operacion implements IOperacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Operacion operacion = (Operacion) o;
        return Double.compare(numero1, operacion.numero1) == 0 && Double.compare(numero2, operacion.numero2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2);
    }

    @Override
    public double sumar(){
        return numero1 + numero2;
    }

    @Override
    public double restar(){
        return numero1 - numero2;
    }

    @Override
    public double multiplicar(){
        return numero1 * numero2;
    }

    @Override
    public double dividir(){
        return numero1 / numero2;
    }
}
