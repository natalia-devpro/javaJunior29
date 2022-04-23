package lesson7;

public class Main1 {
    public static void main(String[] args) {

        Student student1 = new Student(12, "Вася", "Пупкин");
        Student student2 = new Student();

        System.out.println(student1.getAge());
        System.out.println(student2.getAge());


    }
}
