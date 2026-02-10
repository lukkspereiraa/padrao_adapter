package solucao_adapter;


import solucao_adapter.interfaces.Notificador;

public class ServicoEntregaRefatorado {
    
    // Agora dependemos da ABSTRAÇÃO, não da implementação concreta
    private Notificador notificador;

    // Injeção de dependência via construtor
    public ServicoEntregaRefatorado(Notificador notificador) {
        this.notificador = notificador;
    }

    public void finalizarPedido(String cliente, String contato) {
        System.out.println("Separando pacote para: " + cliente + "...");
        
        // O sistema só sabe chamar "enviar". 
        // Ele não sabe se vai sair um SMS, E-mail ou Sinal de Fumaça.
        notificador.enviar(contato, "Status Entrega", "Saiu para entrega com sucesso.");
    }
}