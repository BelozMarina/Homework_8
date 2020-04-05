package homework8;

public class Students extends Human{
    private String gender;

    public Students(String name, String surname, int age, int height, int weight, String gender) {
        super(name, surname, age, height, weight);
        this.gender = gender;
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("I like sweet");
    }


    @Override
    public void move() {
        super.move();
        System.out.println("I like running");
    }

    public void toDo() {
        System.out.println("I am learning");
    }
}
