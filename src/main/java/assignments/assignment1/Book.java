package assignments.assignment1;

public class Book {
    private String title;
    private String author;
    private Double price;
    private Integer yearPublished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    private String formatPrice() {
        String s = "$" + getPrice();
        return s;
    }

    public Double discountedPrice(Double discountPercentage) {
        Double discount = (discountPercentage * getPrice()) / 100.00;
        discount = getPrice() - discount;
        return discount;
    }

    public void printDetails() {
        System.out.println("Title : "+ getTitle());
        System.out.println("Author : "+ getAuthor());
        System.out.println("Price : "+ formatPrice());
        System.out.println("Published Year : "+ getYearPublished());
    }

}
