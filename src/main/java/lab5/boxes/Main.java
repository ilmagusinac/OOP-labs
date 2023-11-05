package lab5.boxes;

public class Main {
    public static void main(String[] args) {
        // Define the Thing instances
        Thing thing1 = new Thing("Saludo", 5);
        Thing thing2 = new Thing("Pirkka", 5);
        Thing thing3 = new Thing("Kopi Luwak", 5);

        // Create and test the MaxWeightBox
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(thing1);
        coffeeBox.add(thing2);
        coffeeBox.add(thing3);

        System.out.println(coffeeBox.isInTheBox(thing1));  // true
        System.out.println(coffeeBox.isInTheBox(thing2));  // true
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak", 0)));  // false

        // Create and test the OneThingBox
        OneThingBox oneThingBox = new OneThingBox();
        oneThingBox.add(new Thing("Saludo", 5));
        oneThingBox.add(new Thing("Pirkka", 5));

        System.out.println(oneThingBox.isInTheBox(new Thing("Saludo")));  // true
        System.out.println(oneThingBox.isInTheBox(new Thing("Pirkka")));  // false

        // Create and test the BlackHoleBox
        BlackHoleBox blackHoleBox = new BlackHoleBox();
        blackHoleBox.add(new Thing("Saludo", 5));
        blackHoleBox.add(new Thing("Pirkka", 5));

        System.out.println(blackHoleBox.isInTheBox(new Thing("Saludo")));  // false
        System.out.println(blackHoleBox.isInTheBox(new Thing("Pirkka")));  // false
// Upcasting: Creating objects and assigning them to variables of type Box
        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox();
        Box box3 = new BlackHoleBox();
        Box box4 = new MaxWeightBox(5);

        // Adding things to the boxes
        Thing thing4 = new Thing("Thing1", 3);
        Thing thing5 = new Thing("Thing2", 2);
        Thing thing6 = new Thing("Thing3", 1);
        box1.add(thing4);
        box2.add(thing5);
        box3.add(thing6);
        box4.add(thing4);

        // Downcasting cautiously using the instanceof operator
        if (box1 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox1 = (MaxWeightBox) box1;
            System.out.println("Downcasted to MaxWeightBox: " + maxWeightBox1.isInTheBox(thing1));
        }

        if (box2 instanceof OneThingBox) {
            OneThingBox OneThingBox = (OneThingBox) box2;
            System.out.println("Downcasted to OneThingBox: " + oneThingBox.isInTheBox(thing2));
        }

        if (box3 instanceof BlackHoleBox) {
            BlackHoleBox BlackHoleBox = (BlackHoleBox) box3;
            System.out.println("Downcasted to BlackHoleBox: " + blackHoleBox.isInTheBox(thing3));
        }

        if (box4 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox2 = (MaxWeightBox) box4;
            System.out.println("Downcasted to MaxWeightBox: " + maxWeightBox2.isInTheBox(thing1));
        }



    }
}
