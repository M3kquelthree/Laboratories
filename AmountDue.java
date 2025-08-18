class AmountDue {

    // Single parameter: price only
    public double computeAmountDue(double price) {
        return price * 0.12;
    }

    // Two parameters: price and quantity
    public double computeAmountDue(double price, double quantity) {
        return price * quantity * 0.12;
    }

    // Three parameters: price, quantity, and discount
    public double computeAmountDue(double price, double quantity, double discount) {
        double total = (price * quantity) - discount;
        return total * 0.12;
    }
}
