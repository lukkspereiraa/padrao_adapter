package monolito_problematico;

public class LegacyEmailService {
    public void enviarEmail(String email, String titulo, String corpo) {
        System.out.println("--- E-MAIL LEGADO ---");
        System.out.println("Para: " + email);
        System.out.println("Assunto: " + titulo);
        System.out.println("Mensagem: " + corpo);
        System.out.println("---------------------");
    }
}