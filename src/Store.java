import java.util.ArrayList;

public class Store {

  private ArrayList<BookWithProperties> bookList = new ArrayList<BookWithProperties>();

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

    var foundBook = siaSheicavsWigns(book);

    if (foundBook == null) {
      bookList.add(b);
    } else {
      if (foundBook.getPrice() != price) {
        throw new IllegalArgumentException("წიგნი " + foundBook.getBook() + " მარტო " + foundBook.getPrice() +
          " " + foundBook.getCurrency() + " ფასში გვაქვს!");
      }

      foundBook.setQuantity(foundBook.getQuantity() + quantity);
    }

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

  private BookWithProperties siaSheicavsWigns(Book book) {
    BookWithProperties ret = null;

    for (BookWithProperties b: bookList) {
      if (b.getBook().equals(book)) {
        ret = b;
        break;
      }
    }

    return ret;
  }

  public void findBook() {

  }


  //region printbooks
  public void printBooks() {
    for (int i = 0; i < bookList.size(); i++) {
      System.out.println("სათაური: " + bookList.get(i).getBook().getTitle());
      System.out.println("ფასი: " + bookList.get(i).getPrice() + " " + bookList.get(i).getCurrency());
      System.out.println("რაოდენობა: " + bookList.get(i).getQuantity());
      System.out.println();
    }

  }
//endregion

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}