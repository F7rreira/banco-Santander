public class Conta {


    private double saldo;


    public Conta(double saldo) {
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if (saldo > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado");
        }
    }

    public void tirar(double sacar) {
        if (saldo >= sacar) {
            this.saldo -= sacar;
            System.out.println("Saldo atual" + saldo);
        } else {
            System.out.println("Sem saldo suficiente");
        }

    }
    public double getsaldo() {
        return this.saldo;
    }

}