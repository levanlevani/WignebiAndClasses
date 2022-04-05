import java.util.ArrayList;

public class Store {

  private ArrayList<Book> bookList = new ArrayList<Book>();

  private String name;

  private double price;
  private Currency currency;
  private int quantity;

  public Store(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public double getPrice(Book book) {
    if (bookList.contains(book))
      return getPrice(book);
    return price;
  }
  public Currency getCurrency() {
    return currency;
  }
  public int getQuantity() {
    return quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }


  public void addBook(Book book, double price, Currency currency, int quantity) {
    bookList.add(book);
    setPrice(price);
    setCurrency(currency);
    setQuantity(quantity);
  }

  public void removeBook(Book book, int quantity) {
   if (bookList.contains(book)) {
     bookList.remove(book);
   }
  }

//region printbooks
//  public void printBooks () {
//    for (int i = 0; i < bookList.size(); i++) {
//      System.out.println("სათაური: " + bookList.get(i).getTitle());
//      System.out.println("ფასი: " + getPrice(i) + bookList.get(i).valuta);
//      System.out.println("რაოდენობა: " + bookList.get(i).raodenoba);
//      System.out.println();
//    }
//
//  }
//endregion

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}