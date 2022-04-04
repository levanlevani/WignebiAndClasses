public class Main {

  public static void main(String[] args) {



    Book ჯაყო = new Book("ჯაყოს ხიზნები", Author.Mikheil_Javakhishvili, Genre.novel,
      Language.GEO, 452, 1925,
      isTranslation.Originali, "NO", Publisher.diogene);

    Store კაიმაღაზია = new Store("კაი მაღაზია");
    კაიმაღაზია.addBook(ჯაყო,200,Currency.GEL,3);


     //region ძველი წიგნები (დაკომენტარებული)
//    Book კარლსონი = new Book("ბიჭუნა და სახურავის ბინადარი კარლსონი", Author.Astrid_Lindgren, Genre.motkhroba, "შვედური", 124, 1955,
//      isTranslation.Targmani, "ვიღაცა ვიღაციშვილი", Publisher.sulakauri);
//
//    Book ჯაყო2 = new Book("ჯაყოს მიზნები", Author.Mikheil_Javakhishvili, Genre.romani, "kartuli", 452, 2030,
//      isTranslation.Originali, "NO", Publisher.diogene);
//
//
//
//
//
//
//    Store კაი_მაღაზია = new Store("კაი მაღაზია");
//    კაი_მაღაზია.addWigni(ჯაყო, 24, Valuta.GEL, 3);
//    კაი_მაღაზია.addWigni(კარლსონი, 12, Valuta.EUR, 2);
//    კაი_მაღაზია.addWigni(ჯაყო2, 45, Valuta.EUR, 24);
//    კაი_მაღაზია.addWigni(ჯაყო, 24, Valuta.GEL, 1);
//    //კაი_მაღაზია.printBooks();
//    კაი_მაღაზია.printBooks(Author.Mikheil_Javakhishvili);

    //endregion d  დაკომენტარებული

//
//    System.out.println();
//
//    System.out.println(ჯაყო.getAvtori());
//
//    System.out.println();
//
//    კაი_მაღაზია.removeWigni(კარლსონი);
//
//    კაი_მაღაზია.printBooks();
//
//    კაი_მაღაზია.printBooks(Avtori.Astrid_Lindgreni);

  }
}
