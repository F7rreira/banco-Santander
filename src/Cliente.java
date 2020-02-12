public class Cliente {
    private Double numConta;
    private String sobrenome;
    private double rg;
    private double cpf;

    public Double getNumConta() {
        return numConta;
    }

    public void setNumConta(Double numConta) {
        this.numConta = numConta;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public Cliente(double numConta, String sobrenome, double rg, double cpf) {
        this.numConta = numConta;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }


}

//ok
