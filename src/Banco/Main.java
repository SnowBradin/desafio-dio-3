package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente dan = new Cliente();
        dan.setNome("Dan");

        Conta cc = new ContaCorrente(dan);
        Conta poupanca = new ContaPoupanca(dan, 1.5);

        cc.transferir(100, poupanca);
        cc.depositar(100);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();

        cc.imprimirTransacao();
        poupanca.imprimirTransacao();
    }
}
