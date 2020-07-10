import pojos.Conta;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Saldo primeira conta:" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo segunda conta:" + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        System.out.println(primeiraConta == segundaConta ? "São a mesmissima conta" : "São contas diferentes");

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta na agencia:" + segundaConta.agencia);

        //analisando referencias
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
