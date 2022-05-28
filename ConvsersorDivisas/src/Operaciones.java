
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andres
 */
public class Operaciones {
    private double valor;
    private int divisa1;
    private int divisa2;
    private double resultado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Operaciones() {
    }
    
    public double convertir(){
        if(divisa1 == 0 && divisa2 == 1){
            resultado = valor * 0.93;
        }else if(divisa1 == 0 && divisa2 == 2){
            resultado = valor * 3924;
        }else if(divisa1 == 1 && divisa2 == 0){
            resultado = valor * 1.07;
        }else if(divisa1 == 1 && divisa2 == 2){
            resultado = valor * 4211;
        }else if(divisa1 == 2 && divisa2 == 0){
            resultado = valor * 0.00026;
        }else if(divisa1 == 2 && divisa2 == 1){
            resultado = Math.round(valor * 0.00024);
        }else if(divisa1 == 0 && divisa2 == 0){
             JOptionPane.showMessageDialog(null, "No es posible convertir divisas iguales");
        }else if(divisa1 == 1 && divisa2 == 1){
             JOptionPane.showMessageDialog(null, "No es posible convertir divisas iguales");
        }else if(divisa1 == 2 && divisa2 == 2){
             JOptionPane.showMessageDialog(null, "No es posible convertir divisas iguales");
        }
        return resultado;
    }
 
}
