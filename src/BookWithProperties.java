import java.util.Objects;

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

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof BookWithProperties)) {
      throw new IllegalArgumentException("BookWithProperties ტიპის ობიექტი გადმოეცი ოე");
    }

    BookWithProperties w = (BookWithProperties) obj;

    return
     this.book.getTitle().equals(w.book.getTitle()) && this.book.getAuthor().equals(w.getBook().getAuthor())
        && this.book.getPages() == w.book.getPages() && this.book.getLanguage().equals(w.getBook().getLanguage())
        && this.book.getGenre().equals(w.getBook().getGenre())
        && this.book.getYear() == w.book.getYear();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.book.getTitle(),this.book.getAuthor(),this.book.getPages(), this.book.getLanguage(),
      this.book.getGenre(), this.book.getPublisher());

    //return super.hashCode();
  }

}
