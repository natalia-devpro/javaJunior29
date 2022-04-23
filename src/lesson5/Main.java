package lesson5;

public class Main {
    public static void main(String[] args) {
        int count = StringUtils.countCharsFromText("wueuewuewetwibe", 'w');
        System.out.println(count);

        String a = "dghsdfgksdf's sdflasdme0";
        int b = StringUtils.countCharsFromText(a, 'f');


        StringUtils.printReverse("qwerty");
        StringUtils.printReverse("asdfgh");
        StringUtils.printReverse("uyuyuyuyu!!!");

    }
}
