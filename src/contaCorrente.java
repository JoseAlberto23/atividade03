public class contaCorrente extends contaBancaria {
    private static final double CHEQUE_ESPECIAL = 1000.0;

    public contaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double limiteDisponivel = getSaldo() + CHEQUE_ESPECIAL;

        if (getSaldo() >= valor) {

            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else if (limiteDisponivel >= valor) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Saque de R$" + valor + " realizado! Cheque especial utilizado. Saldo atual: R$" + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente, mesmo com o cheque especial. Operação negada.");
        }
    }
}
