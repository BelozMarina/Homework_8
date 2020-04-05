package homework8;

public class Main {
    public static void main(String[] args) {
        Students students = new Students("Manya", "Odona", 18, 45, 175, "male");
        students.whoAmI();
        students.toDo();
        students.move();
        students.eat();
        System.out.println("------------------");

        Teachers teachers = new Teachers("Anna", "Ivanivna", 26, 60, 168, "female");
        teachers.whoAmI();
        teachers.toDo();
        teachers.move();

    }
}
