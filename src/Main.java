public class Main {
    public static void main(String[] args) {
        Coffee c = new Espresso(Coffee.Size.TALL);
        System.out.println(c.getDescription());
        System.out.println(c.cost());
        c= new Mocha(c);
        System.out.println(c.getDescription());
        System.out.println(c.cost());
        c = new Whip(c);
        System.out.println(c.getDescription());
        System.out.println(c.cost());

    }
}