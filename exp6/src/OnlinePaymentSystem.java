interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentProcessor {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing Credit Card payment of $%.2f using card: %s\n", amount, cardNumber);
        System.out.println("Status: Transaction Successful!");
    }
}

class UPIPayment implements PaymentProcessor {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing UPI payment of $%.2f via VPA: %s\n", amount, upiId);
        System.out.println("Status: Transaction Successful!");
    }
}

class NetBankingPayment implements PaymentProcessor {
    private String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.printf("Redirecting to %s Net Banking gateway for $%.2f payment...\n", bankName, amount);
        System.out.println("Status: Transaction Successful!");
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor payment;

        payment = new CreditCardPayment("4321-8899-2345-6789");
        payment.processPayment(2500.50);
        System.out.println();

        payment = new UPIPayment("user@okaxis");
        payment.processPayment(450.00);
        System.out.println();

        payment = new NetBankingPayment("HDFC Bank");
        payment.processPayment(12500.00);
    }
}