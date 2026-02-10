package monolito_problematico;

public class MainMonolito {
    public static void main(String[] args) {
        ServicoEntrega entrega = new ServicoEntrega();
        entrega.finalizarPedido("Lucas", "lucas@exemplo.com");
    }
}