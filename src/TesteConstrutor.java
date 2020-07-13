import pojos.ContaConstrutor;

public class TesteConstrutor {
    public static void main(String[] args) {
        ContaConstrutor  conta = new ContaConstrutor(2683, 20009);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        ContaConstrutor  conta2 = new ContaConstrutor(2983, 20001);

        System.out.println(conta.getTotalContas());
    }
}
