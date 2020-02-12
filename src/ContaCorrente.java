public class ContaCorrente {

    private Cliente Cliente;
    private double saldo;

    private double saldoEspecial;


    public ContaCorrente(Cliente cliente, double saldo, double saldoEspecial) {
        Cliente = cliente;
        this.saldo = saldo;
        this.saldoEspecial=saldoEspecial;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoEspecial() {
        return saldoEspecial;
    }

    public void setSaldoEspecial(double saldoEspecial) {
        this.saldoEspecial = saldoEspecial;
    }

    public void deposito(double valor) {        // deposito
        if (saldo > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado");
        }

    }

    public void contaSaque(double sacar) {
        if (sacar <= this.saldo + this.saldoEspecial) {
            if (sacar <= this.saldo && sacar > 0) {
                this.saldo -= sacar;
                System.out.println("Saque realizado com sucesso");
            } else {

                var flag = sacar - this.saldo;   // pegando diferença para retirar do cheque especial.
                this.saldo = 0;
                this.saldoEspecial -= flag;
                System.out.println("saque realizado do cheque especial com sucesso");
                System.out.println(this.saldoEspecial);
            }
            }else{

            System.out.println("Sem saldo suficiente");
        }
    }

        public void depositarCheques ( double cheque, String BancoEmissor, String data){
            if (cheque > 0) {
                this.saldo += cheque;

            }

        }

    public double getsaldo() {
        return this.saldo;
    }
    }
