package pojos;

public class ContaPrivate {
    //private para q n se leia e nem modifique o atributo em outras classes
    private double saldo;
    private int agencia;
    private int numero;
    private ClientePrivate titular;

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
}
