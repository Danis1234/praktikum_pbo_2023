package tugas53pbo;

public class Main {
    public static void main(String[] args) {
        Rabbit peter = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("run:");
        System.out.println("Hello, His name is " + peter.getName());
        System.out.println(peter.getName() + " is Vegetarian? " + peter.isVegetarian());
        System.out.println(peter.getName() + " eats " + peter.getFood() + " " + peter.getName() + " has " + peter.getNoOfLegs() + " legs.");
        System.out.println(peter.getName() + " color is " + peter.getColor());
    }
}