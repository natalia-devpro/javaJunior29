package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Мышка", 2000);
        Proizvoditel lg = new Proizvoditel("LG");
        lg.setDescription("Это Корейский производитель");
        lg.setPathToImage("https://c.dns-shop.ru/thumb/st4/fit_width/110/110/e9e86ab05926b7d7b727d18893304acd/386b5bf73118e7dcbf82e544a865005b9d39ac4f6093192aac7570f83dd8a6aa.jpg");

        tovar.setProizvoditel(lg);

        User user = new User("vasya_pupkin", "Вася Пупкин", 100);
        user.setPathToAvatar("C://downloads//image.jpg");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRating(5);
        otziv.setMainText("Покупал, все отлично! Все работает");

        tovar.addOtzivToTovar(otziv);

        System.out.println();

        // Создать типы: Круг, Треугольник, Прямоугольник, Квадрат, Овал
        // Прописать в них нужные поля класса (сами определяем где какие)
        // Создать get-set и конструкторы
        // Создать в Main по одному объекту каждого класса и установить все характеристики
    }
}
