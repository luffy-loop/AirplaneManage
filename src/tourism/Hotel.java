package tourism;

public class Hotel {

private String name;
private double price;
private double rating;

public Hotel(String name, double price, double rating) {

    this.name = name;
    this.price = price;
    this.rating = rating;
}

public String getName() {
    return name;
}

public double getPrice() {
    return price;
}

public double getRating() {
    return rating;
}

@Override
public String toString() {

    return String.format(
        "%-15s | Price: ₹%-8.0f | Rating: %.1f",
        name,
        price,
        rating
    );
}
}
