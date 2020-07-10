import pojos.Cliente;
import pojos.Conta;

public class CriarConta {
    public static void main(String[] args) {
        System.out.println("to funcionando minha fia calma");
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.titular = new Cliente();
        segundaConta.titular.nome = "Marcia";
        System.out.println(segundaConta.titular.nome);

        System.out.println(primeiraConta == segundaConta ? "São a mesmissima conta" : "São contas diferentes");

        //analisando referencias
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
