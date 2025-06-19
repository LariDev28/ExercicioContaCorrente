/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioconta;

/**
 *
 * @author Usuario
 */
public class ContaCorrente2 {
    private int numero;
    private String nome;
    private double saldo;
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
        
        
    public void depositar(double valor){
        this.saldo = this.saldo + valor*1.1;
        
    }
    
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
        
                
    }
     public double getSaldo(){
        return this.saldo;
     }
    
    
}
