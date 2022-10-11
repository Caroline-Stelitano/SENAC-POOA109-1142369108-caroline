package PraticaPolimorfismo;

public class Horista extends Colaborador{
    double valorHora;
    double cargaHoraria;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Horista(String idfunc, String nome, String end, String dti, double vh, double carga) {
        super(idfunc, nome, end, dti);
        setValorHora(vh);
        setCargaHoraria(carga);
    }
}
