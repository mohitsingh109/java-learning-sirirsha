package com.javalearning;

public class BookTest {

    public static void main(String[] args) {
        Book book=new Book();
        book.setTitle("Ricardo");
        book.setAuthor("Svetlana");
        book.setPrice(200.56);
        book.setYearPublished(1997);

        book.printDetails();
        System.out.println("Discounted Price : "+ book.discountedPrice(10.0));


    }

}
