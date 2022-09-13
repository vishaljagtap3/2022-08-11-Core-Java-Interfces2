public class Card implements Loggable {
    private String cardNumber;
    private int limit;

    public Card(String cardNumber, int limit) {
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void info() {
        System.out.println("M2 : Author");
    }

    @Override
    public void log(String text) {
        System.out.println("Log of " + cardNumber + " ## " + text);
    }
}
