package com.tasneem.recyclerview;

public class Product {
    private final String name;
    private final String price;
    private final String emoji;
    private final String badge;

    public Product(String name, String price, String emoji, String badge) {
        this.name = name;
        this.price = price;
        this.emoji = emoji;
        this.badge = badge;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public String getEmoji() { return emoji; }
    public String getBadge() { return badge; }
}
