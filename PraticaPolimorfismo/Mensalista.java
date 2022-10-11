package PraticaPolimorfismo;

public class Mensalista extends Colaborador{
    double valorSalarioMensal;

    public double getValorSalarioMensal() {
        return valorSalarioMensal;
    }

    public void setValorSalarioMensal(double valorSalarioMensal) {
        this.valorSalarioMensal = valorSalarioMensal;
    }

    public Mensalista(String idfunc, String nome, String end, String dti, double vh, double carga) {
        super(idfunc, nome, end, dti);
        setValorSalarioMensal(calcularSalario(vh,carga));
    }


    public double calcularSalario(double vh, double carga){
        return (22 * vh * carga);
    }

    @Override
    public String toString() {
        return "Mensalista{" +
                " nomeColab='" + nomeColab + '\'' +
                ", funcional='" + funcional + '\'' +
                ", enderecoColab='" + enderecoColab + '\'' +
                ", dataAdmissaoColab='" + dataAdmissaoColab + '\'' +
                ", valorSalarioMensal=" + valorSalarioMensal +
                '}';
    }
}
