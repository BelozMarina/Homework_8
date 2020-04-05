package homework8;

public class Teachers extends Human{
    private String gender;

    public Teachers(String name, String surname, int age, int height, int weight, String gender) {
        super(name, surname, age, height, weight);
        this.gender = gender;
    }

    @Override
    public void eat() {
        System.out.println("I like chocolate");
    }

    @Override
    public void move() {
        System.out.println("I like walking");
    }

    public void toDo() {
        System.out.println("I am teaching");
    }
}
