# 📚 Projeto Atividades - Práticas e Exercícios em Java

Repositório dedicado ao aprendizado, desenvolvimento e consolidação de conceitos de **Lógica de Programação**, **Estruturas de Dados** e **Programação Orientada a Objetos (POO)** em Java.

---

## 🎯 Sobre o Projeto

Este projeto foi concebido como um ambiente prático e modular para resolução de desafios acadêmicos e exercícios práticos em Java. Cada módulo representa uma atividade independente, abordando desde operações básicas e estruturas de controle até padrões de projeto como **DAO Genérico**, polimorfismo, interfaces e encapsulamento.

A estrutura do projeto é **modular e extensível**, permitindo que novas implementações sejam adicionadas de forma isolada e organizada.

---

## 🏗️ Estrutura do Projeto

O código-fonte está localizado no diretório [`src/`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src), organizado em pacotes modulares:

```text
Atividades/
├── .idea/                     # Configurações do ambiente IntelliJ IDEA
├── out/                       # Binários compilados (.class)
├── src/                       # Código-fonte do projeto
│   ├── Main.java              # Rascunho / testes rápidos de coleções (ArrayList)
│   ├── atividade1/            # Simulação Bancária (Conta Corrente & Cheque Especial)
│   ├── atividade2/            # Simulação de Veículo (Carro e Direção)
│   ├── atividade3/            # Sistema de Ingressos (Herança e Polimorfismo)
│   ├── atividade4/            # Gestão de Funcionários e Acessos (POO & Perfis)
│   ├── atividade5/            # Sistema de Notificações Multicanal (Interfaces)
│   ├── atividade6/            # Cálculo Tributário de Produtos (Interfaces & Estratégia)
│   ├── atividade7/            # Algoritmos com Matrizes e Números Negativos
│   ├── atividade8/            # Calculadora Interativa de Terminal
│   └── atividade9/            # Padrão DAO Genérico em Memória (Generics & CRUD)
│       ├── dao/               # Interfaces e implementações de Data Access Object
│       └── domain/            # Classes de domínio e entidades base
├── Atividades.iml             # Definição do módulo no IntelliJ IDEA
└── README.md                  # Documentação do repositório
```

---

## 📋 Catálogo de Atividades

Abaixo estão detalhados o objetivo, conceitos aplicados e classes de cada atividade implementada:

| Atividade | Tema Principal | Conceitos Aplicados | Classes Principais |
| :--- | :--- | :--- | :--- |
| **[Atividade 1](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade1)** | Sistema Bancário | Encapsulamento, validação de regras de negócio, saldo, depósitos, saques, cheque especial e pagamento de boletos. | [`Conta.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade1/Conta.java), [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade1/Main.java) |
| **[Atividade 2](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade2)** | Controle de Veículo | Modelagem de estados e ações (ligar/desligar, acelerar, desacelerar, câmbio de marchas e controle de direção). | [`Carro.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade2/Carro.java), [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade2/Main.java) |
| **[Atividade 3](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade3)** | Bilheteria e Ingressos | Herança e sobrescrita de métodos (`@Override`). Cálculo de descontos para Meia-Entrada e pacotes Família. | [`Ingresso.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade3/Ingresso.java), [`MeiaEntrada.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade3/MeiaEntrada.java), [`Familia.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade3/Familia.java) |
| **[Atividade 4](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade4)** | Gestão Comercial & Cargos | Herança de classes de usuário, controle de autenticação (login/logoff), perfis de acesso para Vendedor, Operador de Caixa e Gerente. | [`Funcionario.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade4/Funcionario.java), [`Gerente.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade4/Gerente.java), [`Vendedor.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade4/Vendedor.java), [`OperadoDeCaixa.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade4/OperadoDeCaixa.java) |
| **[Atividade 5](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade5)** | Notificações Multicanal | Polimorfismo por interface (`ServicoNotificacao`). Disparo unificado via SMS, E-mail, WhatsApp e Redes Sociais. | [`ServicoNotificacao.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade5/ServicoNotificacao.java), [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade5/Main.java) |
| **[Atividade 6](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade6)** | Alíquotas e Impostos | Contratos via interface (`Produto`), cálculo individualizado de impostos por categoria (Alimentação, Saúde, Vestuário, Cultura). | [`Produto.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade6/Produto.java), [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade6/Main.java) |
| **[Atividade 7](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade7)** | Matrizes e Vetores | Manipulação de matrizes bidimensionais (`n x n`), identificação da diagonal principal e contagem de números negativos. | [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade7/Main.java) |
| **[Atividade 8](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade8)** | Calculadora no Terminal | Estruturas de repetição (`while`), menu interativo (`switch-case`) e operações aritméticas fundamentais. | [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade8/Main.java) |
| **[Atividade 9](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade9)** | Padrão Generic DAO | Arquitetura em camadas (DAO / Domain), Generics em Java (`<ID, T>`), filtros com `Predicate<T>` e operações CRUD em memória. | [`GenericDAO.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade9/dao/GenericDAO.java), [`userDAO.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade9/dao/userDAO.java), [`GenericDomein.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade9/domain/GenericDomein.java), [`UserDomain.java`](file:///C:/Users/rodrigo/IdeaProjects/Atividades/src/atividade9/domain/UserDomain.java) |

---

## 🛠️ Tecnologias e Requisitos

- **Linguagem**: Java (versão 17 ou superior recomendada; compatível com versões mais recentes como Java 21 / 26)
- **IDE Recomendada**: IntelliJ IDEA, Eclipse, VS Code ou qualquer editor de sua preferência
- **Build / Estrutura**: Projeto padrão Java (sem dependências externas pesadas, facilitando a execução limpa)

---



## 👤 Autor

Desenvolvido por **Rodrigo** como parte dos estudos práticos em desenvolvimento de software e ecossistema Java.
