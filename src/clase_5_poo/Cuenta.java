/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5_poo;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int global;
    
    public Cuenta(int numeo,int clave, String dueno,double saldo){
        this.numero = numero;
        this.clave = clave;
        this.dueno = dueno;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }       
    public boolean consignar(double valor){
        if (0 < valor) {
            this.saldo = this.saldo + valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean retirar (double valor){
        if(this.saldo < valor && valor > 0 ){
            return false;
        }else{ 
            this.saldo-=valor;
            return true;
        }
    }
    public double ConsultarSaldo(){
        return this.saldo;
    }
    public boolean CambiarClave(int clave){
        this.clave = clave;
        return true;
    }
}
