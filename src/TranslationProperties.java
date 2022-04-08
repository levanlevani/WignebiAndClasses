public class TranslationProperties {

  private Language originalLanguage;
  private Language translationLanguage;
  private String translator;

  public TranslationProperties(Language originalLanguage, Language translationLanguage, String translator) {
    this.originalLanguage = originalLanguage;
    this.translationLanguage = translationLanguage;
    this.translator = translator;
  }

  public Language getOriginalLanguage() {
    return originalLanguage;
  }

  public void setOriginalLanguage(Language originalLanguage) {
    this.originalLanguage = originalLanguage;
  }

  public Language getTranslationLanguage() {
    return translationLanguage;
  }

  public void setTranslationLanguage(Language translationLanguage) {
    this.translationLanguage = translationLanguage;
  }

  public String getTranslator() {
    return translator;
  }

  public void setTranslator(String translator) {
    this.translator = translator;
  }
}
