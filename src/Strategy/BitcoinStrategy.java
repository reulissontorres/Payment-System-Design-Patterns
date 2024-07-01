package Strategy;

public class BitcoinStrategy implements PaymentStrategy{
    private String walletId;

    public BitcoinStrategy(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Bitcoin");
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

}
