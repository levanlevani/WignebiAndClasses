import java.util.HashSet;
import java.util.Objects;

public class Store {

  private HashSet<BookWithProperties> bookSet = new HashSet<>();

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

  public HashSet<Book> authorBooks(Author author) {
    HashSet<Book> tempHashSet = new HashSet<>();
    int counter = 0;
    for (BookWithProperties b: bookSet) {
      if (b.getBook().getAuthor().equals(author)) {
        tempHashSet.add(b.getBook());
        counter++;
      }
    }
    if (counter == 0) {
      throw new IllegalArgumentException(author.getName()+ "ს წიგნები არ გვაქვს");
    }
    return tempHashSet;
  }

  public HashSet<BookWithProperties> authorBooksWithPriceAndQuantity(Author author) {
    HashSet<BookWithProperties> tempHashSet = new HashSet<>();
    int counter = 0;
    for (BookWithProperties b: bookSet) {
      if (b.getBook().getAuthor().equals(author)) {
        tempHashSet.add(b);
        counter++;
      }
    }
    if (counter == 0) {
      throw new IllegalArgumentException(author.getName()+ "ს წიგნები არ გვაქვს");
    }
    return tempHashSet;

  }

  public HashSet<BookWithProperties> findBookBySearchword(String searchword) {
    if (searchword.length() < 3) {
      throw new IllegalArgumentException("საძიებო სიტყვის ასოების რაოდენობა ძალიან მცირეა");
    }
    HashSet<BookWithProperties> tempHashSet = new HashSet<>();
    int counter = 0;
    for (BookWithProperties b: bookSet) {
      if (b.getBook().getTitle().contains(searchword)) {
        tempHashSet.add(b);
        counter++;
      }
    }
    if (counter == 0) {
      System.out.println("ვერაფერი იპოვა");
    }
    return tempHashSet;
  }





  public void printBooks() {
    for (BookWithProperties b : bookSet) {
      System.out.println("სათაური: " + b.getBook().getTitle());
      System.out.println("ფასი: " + b.getPrice() + " " + b.getCurrency());
      System.out.println("რაოდენობა: " + b.getQuantity());
      System.out.println();
    }

  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}