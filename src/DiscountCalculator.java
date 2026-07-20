public class DiscountCalculator {
    public static void main(String[] args) {

        float purchaseAmount = 6500F;

        float discountRate = (purchaseAmount > 5000F) ? 0.10F : 0.0F;

        float discountAmount = purchaseAmount * discountRate;
        float finalPrice = purchaseAmount - discountAmount;


        System.out.println("Original Purchase Amount: Rs. " + purchaseAmount);
        System.out.println("Discount Applied (" + (discountRate * 100F) + "%): Rs. " + discountAmount);
        System.out.println("Final Price to Pay: Rs. " + finalPrice);
    }
}