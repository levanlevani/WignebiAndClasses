public class BookWithProperties {

  private Book book;
  private double price;
  private Currency currency;
  private int quantity;


  public BookWithProperties(Book book, int quantity, double price, Currency currency) {
    this.book = book;
    this.price = price;
    this.currency = currency;
    this.quantity = quantity;

  }

  public double getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public Book getBook() {
    return book;
  }
  public void setBook(Book book) {
    this.book = book;
  }

}
