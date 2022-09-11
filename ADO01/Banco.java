/*-----------------------------------------------*
 *SENAC - TADS - Programação Orientada a Objetos *
 *      Autor: 1142369108 - Caroline Stelitano   *
 *-----------------------------------------------*
 *Objetivo: ADO1 #Herança                        *
 *                                               *
 *Descrição: aplicação para gestão de conta      *
 * 			corrente de um determinado banco     *
 * ----------------------------------------------*/

package ADO01;

public class Banco {

    private String nome;
    private int numero;


//    @param nome   nome do banco
//    @param numero    numero do banco
    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


//    @return nome do banco
    public String getNome() {
        return nome;
    }


//    @return numero do banco
    public int getNumero() {
        return numero;
    }


//    @param nome    nome do banco
    public void setNome(String nome) {
        this.nome = nome;
    }

//    @param num    numero do banco
    public void setNumero(int num) {
        numero = num;
    }


//    Metodo para impressao de todos os dados da classe
    public void imprimeDados() {
        System.out.println("Banco: " + nome + "\tNumero do banco " + numero);
    }

}