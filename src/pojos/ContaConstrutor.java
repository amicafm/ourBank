package pojos;

public class ContaConstrutor {
    //private para q n se leia e nem modifique o atributo em outras classes
    private double saldo;
    private int agencia;
    private int numero;
    private ClientePrivate titular;
    //static pois esse atributo n pertence ao objeto conta e sim a classe
    private static int totalContas;

    public ContaConstrutor(int agencia, int numero){
        totalContas++;
        System.out.println("o total de contas criadas é:" + totalContas);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta" + this.numero);
    }

    //void pq n vai retornar nada
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(ClientePrivate titular) {
        this.titular = titular;
    }

    public ClientePrivate getTitular() {
        return titular;
    }

    public static int getTotalContas() {
        return totalContas;
    }
}
