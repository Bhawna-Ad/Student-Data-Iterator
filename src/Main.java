public class Main {
    public static void main(String[] args) {
        Iterator itr = new Iterator();
        itr.insert(4110521, new Data("John Doe", 21, new String[]{"Java", "Cpp", "Python"}));
        itr.insert(4110522, new Data("Jane Doe", 22, new String[]{"Java", "Cpp"}));
        itr.insert(4110523, new Data("John Doe", 23, new String[]{"Cpp", "Python"}));

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
