public class Main {

  public static void main(String[] args) {


//    Book ვეფხისტყაოსანი = new Book("ვეფხისტყაოსანი", Author.Astrid_Lindgren, Language.SWE,
//      232, 1200, isTranslation.Originali, "არ ყავს", Publisher.sulakauri);
//

    Book ჯაყო = new Book("ჯაყოს ხიზნები", Author.Mikheil_Javakhishvili, Genre.novel,
      Language.GEO, 452, 1925,
      isTranslation.Originali, "NO", Publisher.diogene);


    Book კარლსონი = new Book("ბიჭუნა და სახურავის ბინადარი კარლსონი", Author.Astrid_Lindgren, Genre.story,
      Language.SWE, 124, 1955,
      isTranslation.Targmani, "ვიღაცა ვიღაციშვილი", Publisher.sulakauri);


//       Book ჯაყო2 = new Book("ჯაყოს მიზნები", Author.Mikheil_Javakhishvili, Genre.story, Language.GEO,
//         452, 2030,
//      isTranslation.Originali, "NO", Publisher.diogene);

    Store ახალიმაღაზია = new Store("ახალი მაღაზია");
    ახალიმაღაზია.addBookToList(ჯაყო, 2, 300, Currency.GEL);
    ახალიმაღაზია.addBookToList(კარლსონი, 23, 0.2, Currency.GEL);
    ახალიმაღაზია.addBookToList(ჯაყო, 3, 300, Currency.GEL);

    Book mistBorn = new Book("mistBorn", Author.J_D_Salinger, Genre.novel,
      Language.ENG, 452, 1925,
      isTranslation.Originali, "NO", Publisher.diogene);

    var gaiyidaTuAra = ახალიმაღაზია.gaiyida(ჯაყო, 5);


    var dasamatebeliWignebi = ახალიმაღაზია.getDasamatebeliSakaifoWignebi();

    ახალიმაღაზია.printBooks();

    //დავალება:

    /*
    * 1. მოცემული ავტორის ყველა წიგნის სიის დაბრუნება
    * 2. შექმენი კლასი Translation, რომელსაც ექნება ორიგინალი ენა, თარგმანის ენა, მთარგმნელის სახელი და გვარი.
    * ეს კლასი გამოიყენე Store კლასში
    * 3. ასევე მაღაზიაში გქონდეს boolean ტიპის isTranslation
    * 4. წიგნის ძებნის მეთოდი წიგნის სათაურით: "ტყა"-მ უნდა იპოვოს "ვეფხისტყაოსანი". თუ საძიებო სიტყვის/სიტყვების
    * სიმბოლოების რაოდენობა 3-ზე ნაკლებია, ერორი ამოაგდე
    * */

//
//    Store კაიმაღაზია = new Store("კაი მაღაზია");
//    კაიმაღაზია.addBook(ჯაყო, 2,200,Currency.GEL);
//
//
//
//    კაიმაღაზია.addBook(ჯაყო,3,300,Currency.GEL);
//    კაიმაღაზია.printBooks();

//    Store კაიმაღაზია = new Store("კაი მაღაზია");
//    კაიმაღაზია.addBook(ჯაყო,200,Currency.GEL,3);


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
