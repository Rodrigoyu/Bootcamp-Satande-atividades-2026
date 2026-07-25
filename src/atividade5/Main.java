package atividade5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String marketing = "Temos um cumpom de desconto para você acesse o link aqui em baixo e saiba mais";

        List<ServicoNotificacao> servicos = List.of(
                new ServicoSMS(),
                new ServicoEmail(),
                new ServicoWhatsapp(),
                new ServicoRedeSocias()
        );

        for (ServicoNotificacao servico : servicos) {
            servico.enviarNortificacao(marketing);
        }

    }

    public static class ServicoSMS implements ServicoNotificacao {
        @Override
        public void enviarNortificacao(String mensagem) {
            System.out.println("Enviado via SMS: "+mensagem);
        }
    }
    public static class ServicoWhatsapp implements ServicoNotificacao {
        @Override
        public void enviarNortificacao(String mensagem) {
            System.out.println("Enviado via Whatsapp: "+mensagem);
        }
    }

    public static class ServicoEmail implements ServicoNotificacao {
        @Override
        public void enviarNortificacao(String mensagem) {
            System.out.println("Enviado via E-mail: "+mensagem);
        }
    }

    public static class ServicoRedeSocias implements ServicoNotificacao {
        @Override
        public void enviarNortificacao(String mensagem) {
            System.out.println("Enviado via RedeSocias: "+ mensagem);
        }
    }
}
