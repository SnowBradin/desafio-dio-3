package Banco;

public class ContaPoupanca extends Conta {
    private double interestRate;

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    public ContaPoupanca() {
        super();
    }

    @Override
    public void imprimirExtrato() {

    }

    @Override
    public void imprimirTransacao() {

    }

    public void adicionarJuros() {

    }

    private void addTransaction(String interest, double juros1) {
    }
}
