//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        contaBancaria contaJose = new contaCorrente(15078, "José Alberto", 5000);

        contaBancaria poupancaJose = new contaPoupanca(17620, "José", 3000);

        contaBancaria contaInvestimento = new contaInvestimento(18360, "Capixaba", 4000);

        contaBancaria contaSal = new contaCorrente(17546, "Pedro", 4000);

        contaBancaria contaAltoInvestimento = new contaInvestimento(14328, "Snoop", 20000);

        System.out.println(contaJose.toString()); //Dados da Conta Corrente
        contaJose.sacar(6000);

        System.out.println("Poupança José:");
        System.out.println(poupancaJose.toString());//Dados poupança
        poupancaJose.sacar(4000);

        System.out.println("Conta investimento");
        contaInvestimento.sacar(2000);     //Conta investimento

        System.out.println("Conta Salário ");
        contaSal.sacar(100);
        contaSal.sacar(500);                          //Conta Salário

        System.out.println("Conta Investimento alto risco");  //Conta Alto Risco
        contaAltoInvestimento.sacar(15000);




    }
}