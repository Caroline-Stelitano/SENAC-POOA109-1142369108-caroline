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
 * Alterar o modificador de acesso do atributo saldo para protected
 * Alterar o modificador de acesso do metodo acumularCPMF para protected
 */

package ADO01;

public class Conta {

    protected double saldo;
    private String numero;
    private Cliente titular;
    private Agencia agencia;
    private double acumuladorCPMF;
    private static double taxaCPMF = 0.038;
    protected String tipoConta = "Comum";


    //    @return saldo da conta
    public double getSaldo() {
        return saldo;
    }

    //   @return agencia numero da agencia da conta
    public Agencia getAgencia() {
        return agencia;
    }

    //   @return numero numero da conta
    public String getNumero() {
        return numero;
    }

    //    @return Nome do titular da conta
    public Cliente getTitular() {
        return titular;
    }

    public static double getTaxaCPMF() {
        return taxaCPMF;
    }

    public double getCPMFAcumulado() {
        return getAcumuladorCPMF();
    }

    public double getAcumuladorCPMF() {
        return acumuladorCPMF;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAcumuladorCPMF(double acumuladorCPMF) {
        this.acumuladorCPMF = acumuladorCPMF;
    }

    //   @param titular   Nome do titular da conta
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static void setTaxaCPMF(double taxaCPMF) {
        Conta.taxaCPMF = taxaCPMF;
    }


//    @param saldoInicial   Saldo Inicial da conta
//    @param num    numero da conta
//    @param tit    titular da conta
//    @param ag    agencia ao qual a agencia pertence
//    @param bc    banco ao qual a agencia pertence
    //Overload do construtor Conta abaixo, onde antes nao tinha saldoInicial
    public Conta(double saldoInicial, String num, Cliente tit, Agencia ag) {
        setSaldo(saldoInicial);
        setNumero(num);
        titular = tit;
        setAgencia(ag);
    }


//    @param num    numero da conta
//    @param tit    titular da conta
//    @param ag    agencia ao qual a agencia pertence
//    @param bc    banco ao qual a agencia pertence
    public Conta(String num, Cliente tit, Agencia ag) {
        this(0, num, tit, ag);
    }

    protected void acumularCPMF(double valorSaque) {
        setAcumuladorCPMF(getAcumuladorCPMF() + taxaCPMF * valorSaque);
    }

//    @param valor    valor a ser sacado da conta
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());
        if (valor > 0) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                acumularCPMF(valor);
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }


//    @param valor    valor a ser depositado na conta
    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + getNumero());
        if (valor >= 0) {
            this.setSaldo(this.getSaldo() + valor);
        } else
            System.out.println("O valor do deposito deve ser positivo");
    }

//    Este metodo deve imprimir todos os dados da conta corrente
    public void imprimeDados() {
        System.out.println("======================================");
        System.out.println("Tipo de conta: " + tipoConta);
        getAgencia().imprimeDados();
        System.out.println("Numero da conta: " + getNumero());
        titular.imprimeDados();
        System.out.println("Saldo  : R$" + getSaldo());
        System.out.println("CPMF devido: R$" + getAcumuladorCPMF());
        System.out.println("========================================");
    }

}
