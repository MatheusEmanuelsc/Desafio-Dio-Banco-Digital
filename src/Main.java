public class Main {

    public static void main(String[] args) {

        Cliente jao = new Cliente("jao");


        Conta cc = new ContaCorrente(jao);
        Conta poupanca = new ContaPoupanca(jao);

        cc.depositar(1000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
