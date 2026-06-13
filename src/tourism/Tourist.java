package tourism;

public class Tourist {

    private String travelId;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private double budget;
    private String category;

    public Tourist(String travelId, String name, int age, String gender,
                   String phone, double budget, String category) {

        this.travelId = travelId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.budget = budget;
        this.category = category;
    }

    public String getTravelId() {
        return travelId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public double getBudget() {
        return budget;
    }

    public String getCategory() {
        return category;
    }
}