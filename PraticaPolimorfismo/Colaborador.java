package PraticaPolimorfismo;

public class Colaborador {
    String funcional;
    String nomeColab;
    String enderecoColab;
    String dataAdmissaoColab;

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public String getNomeColab() {
        return nomeColab;
    }

    public void setNomeColab(String nomeColab) {
        this.nomeColab = nomeColab;
    }

    public String getEnderecoColab() {
        return enderecoColab;
    }

    public void setEnderecoColab(String enderecoColab) {
        this.enderecoColab = enderecoColab;
    }

    public String getDataAdmissaoColab() {
        return dataAdmissaoColab;
    }

    public void setDataAdmissaoColab(String dataAdmissaoColab) {
        this.dataAdmissaoColab = dataAdmissaoColab;
    }

    public Colaborador(String func, String nome, String ender, String dtadm) {
        this.funcional = func;
        this.nomeColab = nome;
        this.enderecoColab = ender;
        this.dataAdmissaoColab = dtadm;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "funcional='" + funcional + '\'' +
                ", nomeColab='" + nomeColab + '\'' +
                ", enderecoColab='" + enderecoColab + '\'' +
                ", dataAdmissaoColab='" + dataAdmissaoColab + '\'' +
                '}';
    }
}
