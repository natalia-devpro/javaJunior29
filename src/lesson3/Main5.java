package lesson3;

public class Main5 {
    public static void main(String[] args) {
        String email = "skkhdfs@kdjldjf";

        // 1 - содержится ли собачка
        // 2 - а она только одна?
        // 3 - начало и конеч не можем быть с символа
        // 4 - ...

        // split - разрезать - вернется массив кусочков стринг
        String[] partsOfEmail = email.split("@");
        if(partsOfEmail.length == 1){
            System.out.println("Email не содержит собачки!!!");
        }

        if(partsOfEmail.length > 2){
            System.out.println("Email содержит более 1 собачки!!!");
        }
    }
}
