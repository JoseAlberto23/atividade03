public class contaPoupanca extends contaBancaria{

    public contaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public void sacar(double valor){
            if (getSaldo() < valor){
                System.out.println(" Impossivel realizar saque (saldo insuficiente) ");
            } else{
                setSaldo(getSaldo() - valor);
            }
    }
}
