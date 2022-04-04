public enum Genre {
  novel("რომანი"),
  story("მოთხრობა"),
  satire("სატირა"),
  tragedy("ტრაგედია");

  private String name;

  Genre(String name) {
    this.name = name;
  }
}
