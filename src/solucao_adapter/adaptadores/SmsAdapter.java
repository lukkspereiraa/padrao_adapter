package solucao_adapter.adaptadores;


import solucao_adapter.interfaces.Notificador;
import solucao_adapter.libs_externas.BibliotecaSuperSMS;

public class SmsAdapter implements Notificador {
    
    private BibliotecaSuperSMS smsService;

    // Injetamos a biblioteca complexa aqui dentro
    public SmsAdapter(BibliotecaSuperSMS smsService) {
        this.smsService = smsService;
    }

    @Override
    public void enviar(String destino, String assunto, String mensagem) {
        // LÓGICA DE ADAPTAÇÃO:
        // 1. O SMS não tem campo "assunto", então juntamos tudo na mensagem.
        String textoCompleto = assunto.toUpperCase() + ": " + mensagem;
        
        // 2. Chamamos o método estranho da biblioteca (dispararTorpedo)
        // usando os dados adaptados.
        this.smsService.dispararTorpedo(destino, textoCompleto);
    }
}