/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioconta;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioConta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente2 objConta = new ContaCorrente2();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta: ");
        int numero = entrada.nextInt();
        objConta.setNumero(numero);
        
        entrada.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        objConta.setNome(nome);
        
        System.out.println("Saldo: " + objConta.getSaldo());
        System.out.println("Digite o valor do saque: ");
        double valor = entrada.nextDouble();
        objConta.sacar(valor);
        
        System.out.println("Digite o valor do deposito: ");
        double deposito = entrada.nextDouble();
        objConta.depositar(deposito);
        System.out.println("Saldo: " + objConta.getSaldo());
        System.out.println("Digite o valor do saque: ");
        valor = entrada.nextDouble();
        objConta.sacar(valor);
        System.out.println("Saldo: " + objConta.getSaldo());
        
        
        
        
        
    }
    
}
