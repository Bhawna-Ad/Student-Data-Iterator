public class Main {
    public static void main(String[] args) {
        Iterator itr = new Iterator();
        itr.insert(1, new Data("A", 21, new String[]{"Java", "Cpp", "Python"}));
        itr.insert(2, new Data("B", 22, new String[]{"Java", "Cpp"}));
        itr.insert(3, new Data("C", 23, new String[]{"Cpp", "Python"}));

        itr.display();
        System.out.println(itr.hasNext());
        itr.next().display();
        System.out.println(itr.hasNext());
        itr.next().display();
        System.out.println(itr.hasNext());
        itr.next().display();
        System.out.println(itr.hasNext());
    }
}
