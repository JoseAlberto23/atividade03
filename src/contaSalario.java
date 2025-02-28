public class contaSalario extends contaCorrente {
    private boolean saqueGratisRealizado;

    public contaSalario(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.saqueGratisRealizado = false;
    }

    @Override
    public void sacar(double valor) {
        if (!saqueGratisRealizado) {
            super.sacar(valor);
            saqueGratisRealizado = true;
        } else {
            if (getSaldo() >= valor + 5.0) {
                setSaldo(getSaldo() - valor - 5.0);
                System.out.println("Saque de R$" + valor + " realizado com sucesso! Taxa de R$5,00 cobrada. Saldo atual: R$" + getSaldo());
            } else {
                System.out.println("Saldo insuficiente para realizar o saque com a taxa de R$5,00. Operação negada.");
            }
        }
    }
}
