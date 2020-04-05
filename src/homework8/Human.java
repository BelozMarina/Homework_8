package homework8;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int height;  // вес
    private int weight;  // рост

public Human(String name, String surname, int age, int height, int weight) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.height = height;
    this.weight = weight;
}


    public void whoAmI() {
        if (age <= 23) {
            System.out.println("I am a student");
        } else {
            System.out.println("I am a teacher");
        }
    }

    public void eat() {
        System.out.println("Human is eating");
    }

    public void move(){
        System.out.println("Human is moving");
    }



}
