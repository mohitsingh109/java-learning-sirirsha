package com.javalearning.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Product {

    private String name;

    private Double price;

    private String category;

    public Product(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Headphone", 100.0, "Electronics"),
                new Product("Shirt", 100.0, "Clothing"),
                new Product("TV", 50.0, "Electronics"),
                new Product("Watch", null, "Accessories")
        );

        /**
         * Task 1: You are given a list of products sold, each with a price. Some of the prices are null due to data errors.
         * Clean the data by filtering out the null values and collecting the valid prices into a list.
         */

        List<Double> result = products.stream()
                .map(Product::getPrice)
                .filter(Objects::nonNull)
                .toList();

        System.out.println(result);

        /**
         * Task 2: Find the most expensive product sold.
         */

        Product product = products.stream()
                .filter(p -> p.getPrice() != null)
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println(product);

        /**
         * Task 3: Find the total revenue generated from products priced over $50.
         */

        double revenueOver50DollarProduct = products.stream()
                .filter(p -> p.getPrice() != null)
                .filter(p -> p.getPrice() > 50.0)
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println(revenueOver50DollarProduct);

        /**
         * Task 4: Get a list of unique product categories from the product list.
         */

        Set<String> category = products.stream()
                .map(Product::getCategory)
                .collect(Collectors.toSet());

        System.out.println(category);

        /**
         * Task 5: Group products by their category and find the average price for each category.
         *
         * Electronics --> 45.67
         * Clothing --> 34.42
         * Accessories -> 31.34
         */

        Map<String, Double> averagePriceByCategory = products.stream()
                .filter(p -> p.getPrice() != null)
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));

        System.out.println(averagePriceByCategory);
    }
}
