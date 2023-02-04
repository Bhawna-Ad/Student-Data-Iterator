import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Iterator itr = new Iterator();
        itr.insert(4110521, new Data("John Doe", 21, "9981195615", new String[]{"Java", "Cpp", "Python"}));
        itr.insert(4110522, new Data("Jane Doe", 22, "9981195616", new String[]{"Java", "Cpp", "Kotlin"}));
        itr.insert(4110523, new Data("John Doe", 23, "9981195617",new String[]{"Cpp", "Python", "JavaScript"}));
        itr.insert(4110523, new Data("John Doe", 23, "9981195618", new String[]{"Cpp", "Python", "JavaScript"}));
        itr.insert(4110524, new Data("John Doe", 23, "9981195617", new String[]{"Cpp", "Python", "JavaScript"}));

        itr.display();
        System.out.println();
        System.out.println(itr.hasNext());
        itr.next().display();
        System.out.println(itr.hasNext());
        itr.next().display();
        System.out.println(itr.hasNext());
        itr.next().display();
        System.out.println(itr.hasNext());
    }
}
