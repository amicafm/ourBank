import pojos.Cliente;
import pojos.Conta;

public class TesteTitular {
    public static void main(String[] args) {
        Cliente cassia = new Cliente();
        cassia.nome = "Cassia de Assis";
        cassia.cpf = "48967123365";
        cassia.profissao = "Médica";

        Conta contaDaCassia = new Conta();
        contaDaCassia.titular = cassia;
        contaDaCassia.deposita(100);

        System.out.println(contaDaCassia.titular.nome);
    }
}
