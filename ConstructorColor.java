import java.util.Scanner;

class PaintColor {
    int price = 0;
    float price2 = 0.0f;
    String color = "";

    PaintColor(int i, String s) {
        price = i;
        color = s;
        System.out.println("Default Price:" + price);
        System.out.println("Default color:" + color);
    }

    PaintColor(PaintColor r, PaintColor g, PaintColor b) {

        if (r.color == g.color && r.color == b.color) {
            price = (r.price + g.price + b.price) / 3;
        } else if (r.color == "Red" && g.color == "Green" && b.color == "Blue") {
            price = (r.price + g.price) - b.price;
        } else if (r.color == "Green" && g.color == "Red" && b.color == "Blue") {
            price = (g.price + r.price) - b.price;
        } else if (r.color == "Blue" && g.color == "Red" && b.color == "Green") {
            price = (b.price + r.price) - g.price;

        }

    }

}

public class ConstructorColor {
    public static void main(String[] args) {

        PaintColor r = new PaintColor(2000, "Red"); // Parameterized Constructor
        PaintColor g = new PaintColor(4000, "Green"); // Parameterized Constructor
        PaintColor b = new PaintColor(5000, "Blue"); // Parameterized Constructor
        PaintColor o = new PaintColor(r, g, b);
        System.out.println(o.price);

    }

}
