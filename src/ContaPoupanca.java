public class ContaPoupanca {
    private Cliente Cliente;
    private double saldo;
    private double saldoJuros;

    public ContaPoupanca(Cliente cliente,double saldo) {
        this.Cliente=cliente;
        this.saldo = saldo;                                     //construtor

    }

    public double getSaldo() {
        return saldo;
    }
                                                    //get para eu conseguir consultar meu saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoJuros() {
        return saldoJuros;
    }

    public void setSaldoJuros(double saldoJuros) {
        this.saldoJuros = saldoJuros;
    }

    public void deposito(double valor) {        // deposito
        if (valor > 0) {
            var juros = valor * 0.09;         //retorno dos juros
            this.saldo += valor;
            System.out.println("Deposito realizado");
            this.saldoJuros += juros;
        }

    }

    public void saque(double sacar) {
        if (saldo >= sacar) {                   // saque
            this.saldo -= sacar;
            System.out.println("seu saldo " +  saldo);
        } else {
            System.out.println("Sem saldo disponivel");
        }

    }

    public double getsaldo() {
        return this.saldo;              // retorno do saldo !
    }
}