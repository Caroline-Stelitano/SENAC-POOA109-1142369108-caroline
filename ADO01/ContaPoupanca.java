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
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta 
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo 
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho
 */

package ADO01;

public class ContaPoupanca extends Conta {

    private String dataAniversario;


    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }


    public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dataAniversario){
        super(saldoInicial, num, tit, ag);
        tipoConta = "Conta Poupança";
        setDataAniversario(dataAniversario);    // this.dataAniversario = dataAniversario;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Data de Aniversário: " + getDataAniversario());
    }
}
