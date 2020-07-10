import pojos.Conta;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(10);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        System.out.println(contaDaMarcela.transfere(300, contaDoPaulo) ? "transferencia realizada com sucesso" : "saldo insuficiente");
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }
}
