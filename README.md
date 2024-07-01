# Payment System Design Patterns

Este repositório contém um exemplo prático de um sistema de pagamento em Java que utiliza os padrões de projeto Singleton, Strategy e Facade. Este exemplo demonstra como aplicar esses padrões de forma integrada para criar um sistema flexível e de fácil manutenção.

## Padrões de Projeto Utilizados

- **Singleton**: Garantia de que apenas uma instância da classe de configuração seja criada.
- **Strategy**: Implementação de diferentes estratégias de pagamento (Cartão de Crédito, PayPal, Bitcoin).
- **Facade**: Simplificação da interface de pagamento para o cliente, escondendo a complexidade interna.

## Estrutura do Projeto

- `PaymentStrategy`: Interface para as estratégias de pagamento.
- `CreditCardStrategy`, `PayPalStrategy`, `BitcoinStrategy`: Implementações da interface `PaymentStrategy`.
- `Configuration`: Classe Singleton para gerenciar configurações.
- `PaymentFacade`: Classe Facade que simplifica a interface de pagamento.
- `Main`: Classe principal para testar o sistema de pagamento.

## Como Executar

1. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/payment-system-design-patterns.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd payment-system-design-patterns
    ```
3. Compile o código:
    ```bash
    javac *.java
    ```
4. Execute o programa:
    ```bash
    java Main
    ```

## Exemplo de Uso

```java
// Configuração Singleton
Configuration config = Configuration.getInstance();
System.out.println("Config Value: " + config.getConfigValue());

// Mudando a configuração
config.setConfigValue("Updated configuration value");
System.out.println("Updated Config Value: " + Configuration.getInstance().getConfigValue());

// Pagamentos usando Facade e Strategy
PaymentFacade paymentFacade = new PaymentFacade();

paymentFacade.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456", "John Doe"));
paymentFacade.pay(100.00);

paymentFacade.setPaymentStrategy(new PayPalStrategy("john.doe@example.com"));
paymentFacade.pay(200.00);

paymentFacade.setPaymentStrategy(new BitcoinStrategy("wallet12345"));
paymentFacade.pay(300.00);

```

## Com essas informações, você pode criar um repositório no GitHub e adicionar os arquivos necessários. Aqui estão os passos para criar o repositório:

1. Acesse [GitHub](https://github.com/) e faça login.
2. Clique no botão `New` para criar um novo repositório.
3. Preencha o nome do repositório (`payment-system-design-patterns`), a descrição e marque a opção `Initialize this repository with a README`.
4. Clique em `Create repository`.

## Depois disso, você pode adicionar os arquivos de código (`PaymentStrategy.java`, `CreditCardStrategy.java`, `PayPalStrategy.java`, `BitcoinStrategy.java`, `Configuration.java`, `PaymentFacade.java`, `Main.java`) ao repositório.
