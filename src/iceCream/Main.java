package iceCream;

public class Main {
    public static void main(String[] args) {
        IceCream c1= new IceCream();
        IceCream c2= new IceCream("Butter Scotch");
        IceCream c3= new IceCream("Oreo", "Chocolate Chips");
        IceCream c4= new IceCream("Mango", "sprinkles" ,250);

        System.out.println(c1.PrintDetails());
        System.out.println(c2.PrintDetails());
        System.out.println(c3.PrintDetails());
        System.out.println(c4.PrintDetails());

        c1.changeFlavor("Chocolate");
        System.out.println(c1.PrintDetails());

        c1.changeTopping("Wafer");
        System.out.println(c1.PrintDetails());

        c2.changeTopping("Chocolate Sauce");
        System.out.println(c1.PrintDetails());
        c2.PrintDetails2(c3);
    }
}
