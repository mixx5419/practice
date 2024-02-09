public class Book extends TangibleAsset {
  String isbn;
  public Boovimk(String name, int price, String color, String isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }
  public String getIsbn() { return this.isbn; }
}

