package solucao_adapter;

import solucao_adapter.adaptadores.SmsAdapter;
import solucao_adapter.interfaces.Notificador;
import solucao_adapter.libs_externas.BibliotecaSuperSMS;

public class MainAdapter {
    public static void main(String[] args) {
        // 1. Criamos a biblioteca complexa (O objeto incompatível)
        BibliotecaSuperSMS sistemaSms = new BibliotecaSuperSMS();

        // 2. Criamos o adaptador e passamos o sistema complexo para ele
        Notificador adaptador = new SmsAdapter(sistemaSms);

        // 3. O sistema de entrega usa o adaptador como se fosse um notificador comum
        ServicoEntregaRefatorado entrega = new ServicoEntregaRefatorado(adaptador);

        // 4. Executamos
        entrega.finalizarPedido("Maria Silva", "11-99999-0000");
    }
}