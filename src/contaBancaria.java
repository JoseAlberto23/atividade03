abstract class contaBancaria {
    private int numeroConta;

    private String titular;

    private double saldo;

    public contaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

     public void depositar(double valor){
        this.saldo = this.saldo + valor;
         System.out.println("Depósito realizado com sucesso!");
    }

    public abstract void sacar(double valor);

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
