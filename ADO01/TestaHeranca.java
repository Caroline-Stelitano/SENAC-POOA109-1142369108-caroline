/*-----------------------------------------------*
 *SENAC - TADS - Programação Orientada a Objetos *
 *      Autor: 1142369108 - Caroline Stelitano   *
 *-----------------------------------------------*
 *Objetivo: ADO1 #Herança                        *
 *                                               *
 *Descrição: aplicação para gestão de conta      *
 * 			corrente de um determinado banco     *
 * ----------------------------------------------*/
 /*
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. 
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
 * Realize 1 saque na conta poupanca que exceda o saldo.
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */

package ADO01;


import java.util.Date;

public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("POO Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("José", "1232323");
        Cliente cliente2 = new Cliente("Maria", "987789");
        
        Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
        conta.saque(560);
        conta.imprimeDados();
        System.out.println();

        // 1a. conta especial
        ContaEspecial contaEsp1 = new ContaEspecial(2000, 500, "1234", cliente1, ag1);
        contaEsp1.saque(800);
        contaEsp1.imprimeDados();
        System.out.println();

        // 2a. conta especial
//        ContaEspecial contaEsp2 = null;
        ContaEspecial contaEsp2 = new ContaEspecial(1200, 800, "4573", cliente2, ag1);
        contaEsp2.saque(3000);
        contaEsp2.imprimeDados();
        System.out.println();

        // conta poupanca
        String strData = new Date().toString();
        ContaPoupanca contaPoup = new ContaPoupanca(1000, "001" , cliente1, ag1, strData);
        contaPoup.saque(1500);
        contaPoup.imprimeDados();
        System.out.println();
    }
}
