import pojos.ContaPrivate;

public class TesteSaqueNegativo {
    public static void main(String[] args) {
        ContaPrivate conta = new ContaPrivate();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.getSaldo());

        //proibido
        //conta.saldo = conta.saldo - 200;
        //System.out.println(conta.saldo);
    }
}
