import pojos.Cliente;
import pojos.ClientePrivate;
import pojos.ContaPrivate;

public class TesteGetESet {
    public static void main(String[] args) {
        ContaPrivate conta = new ContaPrivate();
        //conta.numero = 1337;
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        ClientePrivate sabrina = new ClientePrivate();
        sabrina.setNome("Sabrina");
        conta.setTitular(sabrina);

        System.out.println(sabrina.getNome());
    }
}
