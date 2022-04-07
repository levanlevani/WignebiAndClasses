import java.util.HashSet;

public class Store {

  private HashSet<BookWithProperties> bookSet = new HashSet<BookWithProperties>();

  public HashSet<Book> getDasamatebeliSakaifoWignebi() {
    return dasamatebeliSakaifoWignebi;
  }

  private HashSet<Book> dasamatebeliSakaifoWignebi = new HashSet<>();
  //private HashSet<BookWithProperties> bookSet = new HashSet<>();

  private String name;

  public Store(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addBookToList(Book book, int quantity, double price, Currency currency) {
    int t = 0;

    BookWithProperties b = new BookWithProperties(book, quantity, price, currency);

    var foundBook = ipoveWigni(book);

    if (foundBook != null) {
      if (foundBook.getPrice() != price) {
        throw new IllegalArgumentException("წიგნი " + foundBook.getBook() + " მარტო " + foundBook.getPrice() +
          " " + foundBook.getCurrency() + " ფასში გვაქვს!");
      }

      foundBook.setQuantity(foundBook.getQuantity() + quantity);
    }

    bookSet.add(b);

    //    for (int i = 0; i < 5; i++) {
//      if (bookList.get(i).getBook().getTitle().equals(book.getTitle())) {
//        t++;
//        bookList.get(i).setQuantity(bookList.get(i).getQuantity() + quantity);
//        break;
//      }
//    }
//    if (t != 0) {
//
//      bookList.add(b);
//    }
  }

  private BookWithProperties ipoveWigni(Book book) {
    BookWithProperties ret = null;

    for (BookWithProperties b : bookSet) {
      if (b.getBook().equals(book)) {
        ret = b;
        break;
      }
    }

    return ret;
  }

  public boolean gaiyida(Book book, int quantity) {

    if (quantity <= 0) {
      throw new IllegalArgumentException("დადებითი რაოდენობა გადმოეცი არამზადავ!");
    }

    boolean ret = false;
    BookWithProperties napovniWigni = ipoveWigni(book);

    if (napovniWigni != null) {
      var ramdeniCaliGvaqvs = napovniWigni.getQuantity();

      if (ramdeniCaliGvaqvs < quantity) {
        throw new IllegalArgumentException("მარტო " + ramdeniCaliGvaqvs + " გვაქვს");
      } else if (ramdeniCaliGvaqvs == quantity) {
        bookSet.remove(napovniWigni);
        ret = true;
      } else {
        napovniWigni.setQuantity(ramdeniCaliGvaqvs - quantity);
        ret = true;
      }
    }
    else {
      dasamatebeliSakaifoWignebi.add(book);
      ret = false;
    }

    return ret;
  }

  public void findBook() {

  }


  //region printbooks
  public void printBooks() {
    for (BookWithProperties b : bookSet) {
      System.out.println("სათაური: " + b.getBook().getTitle());
      System.out.println("ფასი: " + b.getPrice() + " " + b.getCurrency());
      System.out.println("რაოდენობა: " + b.getQuantity());
      System.out.println();
    }

  }
//endregion

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}