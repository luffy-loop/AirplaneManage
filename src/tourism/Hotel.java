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
        "%-22s | ₹%-6.0f | %.1f Stars",
        name,
        price,
        rating
    );
}
}
