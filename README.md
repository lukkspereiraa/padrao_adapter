# 📦 Estudo de Caso: Padrão Adapter - Logística Rápida Ltda.

Este projeto demonstra a aplicação prática do padrão de projeto **Adapter** (Estrutural) em Java. O cenário simula a evolução do sistema de uma empresa de logística, saindo de uma arquitetura legada e rígida para uma solução flexível e desacoplada.

---

## 🌍 O Mini Mundo (Cenário)

A **Logística Rápida Ltda** possui um sistema central de entregas.

1.  **O Passado (Legado):** O sistema original notificava os clientes apenas por **E-mail**. O código era "amarrado": a classe de entrega chamava diretamente a classe de e-mail.
2.  **O Problema (Mudança):** A empresa contratou um serviço externo de **SMS** (chamado `BibliotecaSuperSMS`) para avisar os clientes via celular.
3.  **O Conflito:** A nova biblioteca de SMS é incompatível com o sistema atual.
    * O sistema espera: `enviar(destino, assunto, mensagem)`
    * A biblioteca exige: `dispararTorpedo(numero, texto)`
4.  **A Solução:** Usar um **Adapter** para traduzir as chamadas do sistema para a biblioteca nova, sem quebrar a regra de negócio.

---

## 📂 Estrutura do Projeto

O código foi organizado em dois pacotes principais para comparação: `monolito` (o jeito errado) e `adapter` (o jeito certo).

```text
src
├── 📂 monolito                    # ❌ IMPLEMENTAÇÃO LEGADA (Acoplada)
│   ├── LegacyEmailService.java    # Serviço antigo de e-mail
│   ├── ServicoEntrega.java        # Regra de negócio (depende do e-mail)
│   └── MainMonolito.java          # Executor do cenário legado
│
└── 📂 adapter                     # ✅ IMPLEMENTAÇÃO COM PADRÃO ADAPTER
    ├── 📂 interfaces
    │   └── Notificador.java       # (Target) O contrato que o sistema espera
    │
    ├── 📂 libs
    │   └── BibliotecaSuperSMS.java # (Adaptee) A biblioteca incompatível
    │
    ├── 📂 adaptadores
    │   └── SmsAdapter.java        # (Adapter) A ponte que faz a tradução
    │
    ├── ServicoEntregaRefatorado.java # (Client) Regra de negócio flexível
    └── MainAdapter.java              # Executor do cenário novo