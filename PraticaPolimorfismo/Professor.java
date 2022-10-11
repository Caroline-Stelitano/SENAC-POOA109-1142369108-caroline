package PraticaPolimorfismo;

public class Professor extends Colaborador{
    double valorDaHoraAula;
    int quantidadeDeAula;
    double salarioProf;

    public double getValorDaHoraAula() {
        return valorDaHoraAula;
    }

    public void setValorDaHoraAula(double valorDaHoraAula) {
        this.valorDaHoraAula = valorDaHoraAula;
    }

    public int getQuantidadeDeAula() {
        return quantidadeDeAula;
    }

    public void setQuantidadeDeAula(int quantidadeDeAula) {
        this.quantidadeDeAula = quantidadeDeAula;
    }

    public double getSalarioProf() {
        return salarioProf;
    }

    public void setSalarioProf(double salarioProf) {
        this.salarioProf = salarioProf;
    }


    public Professor(String idfunc, String nome, String end, String dti, double vh, int quantidadeDeAula) {
        super(idfunc, nome, end, dti);
        setQuantidadeDeAula(quantidadeDeAula);
        setValorDaHoraAula(vh);
        setSalarioProf(calculoSalarioProfessor(vh, quantidadeDeAula));
    }

    public double calculoSalarioProfessor(double vh, int quantidadeDeAula){
        return (vh * quantidadeDeAula);
    }

    @Override
    public String toString() {
        return "Professor{" +
                " nomeColab='" + nomeColab + '\'' +
                ", funcional='" + funcional + '\'' +
                ", enderecoColab='" + enderecoColab + '\'' +
                ", dataAdmissaoColab='" + dataAdmissaoColab + '\'' +
                ", valorDaHoraAula=" + valorDaHoraAula +
                ", quantidadeDeAula=" + quantidadeDeAula +
                ", salarioProf=" + salarioProf +
                '}';
    }
}
