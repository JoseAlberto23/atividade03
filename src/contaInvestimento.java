class contaInvestimento extends contaBancaria {
    private static final double TAXA_RETIRADA = 0.02;

    public contaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * TAXA_RETIRADA;
        double totalSaque = valor + taxa;

        if (getSaldo() >= totalSaque) {
            setSaldo(getSaldo() - totalSaque);
            System.out.println("Saque de R$" + valor + " realizado. Taxa de R$" + taxa + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}
