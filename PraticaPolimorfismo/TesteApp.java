package PraticaPolimorfismo;

/*-----------------------------------------------*
 *SENAC - TADS - Programação Orientada a Objetos *
 *      Autor: 1142369108 - Caroline Stelitano   *
 *-----------------------------------------------*
 *Objetivo: Prática Polimorfismo                 *
 *                                               *
 *Descrição: atividade prática conforme          *
 *            diagrama de classe dado            *
 *-----------------------------------------------*

 * ----------------------------------------------*/

import javax.swing.*;

public class TesteApp {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite o nome do colaborador: ");
        String contratoHora = JOptionPane.showInputDialog("Digite o tipo de contrato: ");

        if(contratoHora .equalsIgnoreCase("mensalista")){
            double vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora do colaborador: "));
            double carga = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas do colaborador: "));
            Mensalista m1 = new Mensalista("1", nome, "rua", "10", vh, carga);
            System.out.println(m1);
        } else if(contratoHora .equalsIgnoreCase("professor")) {
            double vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora do professor: "));
            int quantidadeDeAula = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aulas: "));
            Professor p1 = new Professor("1", nome, "rua 2", "25", vh, quantidadeDeAula);
            System.out.println(p1);
        } else {
            System.out.println("nao existe este tipo de contrato.");
        }
    }
}
