package monolito_problematico;

public class ServicoEntrega {
    // PROBLEMA: Dependência direta (Acoplamento Forte)
    private LegacyEmailService emailService;

    public ServicoEntrega() {
        // O código está "preso" a essa implementação específica
        this.emailService = new LegacyEmailService();
    }

    public void finalizarPedido(String cliente, String email) {
        System.out.println("Processando pedido de: " + cliente);
        
        // Chamada direta ao método específico do e-mail
        emailService.enviarEmail(email, "Pedido Enviado", "Seu pacote está a caminho!");
    }
}