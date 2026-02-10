package solucao_adapter.libs_externas;

public class BibliotecaSuperSMS {
    public void dispararTorpedo(String numero, String texto) {
        System.out.println(">>> [SMS SERVER] Enviando para: " + numero);
        System.out.println(">>> Texto: " + texto);
    }
}