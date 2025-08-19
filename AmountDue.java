class AmountDue {

    public double computeAmountDue(double price) {
        return price + price * 0.12;
    
    }

    public double computeAmountDue(double price, double quantity) {
        return price * quantity + price * quantity * 0.12;
    }

    public double computeAmountDue(double price, double quantity, double discount) {
        double total1 = (price * quantity) - discount;
        double total = total1 + (total1 * 0.12);
        return total;
    }
}
