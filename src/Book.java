import java.util.Objects;

public class Book {


  //region ცვლადები
  private String title;
  private Author author;
  private Genre genre;
  private Language language;
  private int pages;
  private int year;
  private boolean isTranslation;
  private Publisher publisher;
  private TranslationProperties translationProperties;
//endregion

  public Book(String title, Author author, Genre genre, Language language, int pages, int year, boolean isTranslation,
              TranslationProperties translationProperties, Publisher publisher) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.language = language;
    this.pages = pages;
    this.year = year;
    this.isTranslation = isTranslation;
    this.publisher = publisher;
    this.translationProperties = translationProperties;

    if (!isTranslation) {                                   //TODO ??????????????????????????
      translationProperties = null;
    }
  }

  //region getters and setters


  public boolean isTranslation() {
    return isTranslation;
  }

  public void setTranslation(boolean translation) {
    isTranslation = translation;
  }

  public TranslationProperties getTranslationProperties() {
    return translationProperties;
  }

  public void setTranslationProperties(TranslationProperties translationProperties) {
    this.translationProperties = translationProperties;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
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


  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }
//endregion
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Book)) {
      throw new IllegalArgumentException("asdasd");
    }

    Book w = (Book) obj;

    return
      this.title.equals(w.title) && this.author.equals(w.author)
      && this.pages == w.pages && this.language.equals(w.language)
      && this.genre.equals(w.genre)  && this.year == w.year;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.title,this.author,this.pages, this.language, this.genre,
      this.isTranslation,this.year,this.publisher);

    //return super.hashCode();
  }
}


