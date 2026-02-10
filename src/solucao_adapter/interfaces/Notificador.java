package solucao_adapter.interfaces;

public interface Notificador {
    // O método padrão que nosso sistema entende
    void enviar(String destino, String assunto, String mensagem);
}