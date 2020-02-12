public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(12345, "Vini Ferreira", 20201, 10203040);

        Conta conta = new Conta(3000);

        ContaPoupanca contaP = new ContaPoupanca(cliente1, 300);
        ContaCorrente contaC = new ContaCorrente(cliente1 , 100, 100 );

        contaC.depositarCheques(300);
        System.out.println(contaC.getSaldo());


    }
}
