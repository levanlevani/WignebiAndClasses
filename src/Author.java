public enum Author {
  J_D_Salinger("ჯ.დ. სელინჯერი"),
  Astrid_Lindgren("ასტრიდ ლინდგრენი"),
  Vazha_Pshavela("ვაჟა-ფშაველა"),
  Mikheil_Javakhishvili("მიხეილ ჯავახიშვილი"),
  Erich_Maria_Remarque("ერიხ მარია რემარკი");

  private String name;

  public String getName() {
    return name;
  }

  Author(String name) {
    this.name = name;
  }




}
