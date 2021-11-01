package maxim.kim;

public class Lesson3 {
    public static void main(String[] args) {
        Peron maxim = new Peron(23, "male", true, "Maxim", "Kim");
        Peron stas = new Peron(20, "male", false, "Stanislav", "Voronin");
        Peron vlad = new Peron(28, "male",false, "Vladislav", "Ivanov");
        Peron lena = new Peron(30, "female",true, "Elena", "Mikhailova");

        maxim.hireToWork("no");
        maxim.toString();
        stas.hireToWork("yes");
        stas.toString();
        vlad.hireToWork("no");
        vlad.toString();
        lena.hireToWork("yes");
        lena.toString();

    }
}
