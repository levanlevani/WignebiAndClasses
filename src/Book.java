import java.util.Objects;

public class Book {


  //region ცვლადები
  private String title;
  private Author author;
  private Genre genre;
  private Language language;
  private int pages;
  private int year;
  private isTranslation isTranslation;
  private String translator;
  private Publisher publisher;
//endregion

  public Book(String title, Author author, Genre genre, Language language, int pages, int year,
              isTranslation isTranslation, String translator, Publisher publisher) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.language = language;
    this.pages = pages;
    this.year = year;
    this.isTranslation = isTranslation;
    this.translator = translator;
    this.publisher = publisher;
  }

  //region getters and setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAvtori() {
    return author;
  }

  public void setAvtori(Author author) {
    this.author = author;
  }

  public Genre getJanri() {
    return genre;
  }

  public void setJanri(Genre genre) {
    this.genre = genre;
  }

  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public isTranslation getIsTranslation() {
    return isTranslation;
  }

  public void setIsTranslation(isTranslation isTranslation) {
    this.isTranslation = isTranslation;
  }

  public String getTranslator() {
    return translator;
  }

  public void setTranslator(String translator) {
    this.translator = translator;
  }

  public Publisher getGamomcemloba() {
    return publisher;
  }

  public void setGamomcemloba(Publisher publisher) {
    this.publisher = publisher;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Book)) {
      throw new IllegalArgumentException("asdasd");
    }

    Book w = (Book) obj;

    return
      this.title.equals(w.title) && this.author.equals(w.author)
      && this.pages == w.pages && this.language.equals(w.language)
      && this.genre.equals(w.genre) && this.isTranslation.equals(w.isTranslation)
      && this.year == w.year;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.title,this.author,this.pages, this.language, this.genre,
      this.isTranslation,this.year,this.publisher,this.translator);

    //return super.hashCode();
  }
}


