import Facade.PaymentFacade;
import Singleton.Configuration;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
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
    }
}
