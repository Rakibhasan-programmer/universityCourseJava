package iceCream;

public class IceCream {
    String flavour1, flavour2;
    int cost;

    IceCream(){
        flavour1 = "Vanilla";
        flavour2 = "Nothing";
        cost = 100;
    }
    IceCream(String a){
        flavour1 = a;
        flavour2 = "Nothing";
        cost = 100;
    }
    IceCream(String a, String b){
        flavour1 = a;
        flavour2 = b;
        cost = 100;
    }
    IceCream(String a, String b, int c){
        flavour1 = a;
        flavour2 = b;
        cost = c;
    }

    // returning info
    public String PrintDetails(){
        String res = flavour1 + " ice cream costs " + cost + "TK with additional " + flavour2;
        return res;
    }

    public void changeFlavor(String f){
        flavour1 = f;
    }

    public void changeTopping(String f){
        flavour2 = f;
    }

    public void PrintDetails2(IceCream c3){
        System.out.println(c3.flavour1 + " ice cream costs " + c3.cost + "TK with additional " + c3.flavour2);
        System.out.println(flavour1 + " ice cream costs " + cost + "TK with additional Chocolate\n" +
                "Sauce");
    }


}
