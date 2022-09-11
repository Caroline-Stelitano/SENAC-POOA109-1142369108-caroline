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
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */

package ADO01;

public class ContaEspecial extends Conta {
    private double limite;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Overload da ContaEspecial que antes não tinha saldoInicial
    public ContaEspecial(double limite, double saldoInicial, String num, Cliente tit, Agencia ag){
        super(saldoInicial, num, tit, ag);
        tipoConta = "Conta Especial";
        setLimite(limite);
    }

    public ContaEspecial(double limite, String num, Cliente tit, Agencia ag){
        this(limite, 0, num, tit, ag);
    }

    //interpretando que o limite é o LIS
    @Override
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());
        if (valor > 0) {
            if(limite + getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                acumularCPMF(valor);
            } else {
                System.out.println("Limite indisponivel");
            }
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Limite da conta: " + limite);
    }

    // Meu Teste
//    public static void main(String[] args){
//        Cliente cliente = new Cliente("Caroline", "33344455667");
//        Banco bc = new Banco("itau", 010);
//        Agencia agencia = new Agencia("001", bc);
//        ContaEspecial ce = new ContaEspecial(1000, 500, "001", cliente, agencia);
//
//        ce.imprimeDados();
//        ce.saque(800);
//        ce.imprimeDados();
//    }
}
