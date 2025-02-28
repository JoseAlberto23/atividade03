public class contaInvestimentoAltoRisco extends contaInvestimento {
    private static final double TAXA_RETIRADA_ALTO_RISCO = 0.05;
    private static final double SALDO_MINIMO = 10000.0;

    public contaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() < SALDO_MINIMO) {
            System.out.println("Saldo insuficiente para realizar o saque. O saldo mínimo exigido é de R$ " + SALDO_MINIMO);
        } else {
            double taxa = valor * TAXA_RETIRADA_ALTO_RISCO;
            double totalSaque = valor + taxa;

            if (getSaldo() >= totalSaque) {
                setSaldo(getSaldo() - totalSaque);
                System.out.println("Saque de R$" + valor + " realizado. Taxa de R$" + taxa + " aplicada. Saldo atual: R$" + getSaldo());
            } else {
                System.out.println("Saldo insuficiente para realizar o saque considerando a taxa.");
            }
        }
    }
}
