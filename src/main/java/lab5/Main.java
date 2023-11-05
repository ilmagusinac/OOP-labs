package lab5;

public class Main {
    public static void main(String[] args){
        /*
        //1-a)
        CivilService civilService = new CivilService();
        System.out.println("Civil Service has " + civilService.getDaysLeft() + " days left");

        for(int i=0; i<100; i++){
            civilService.work();
        }
        System.out.println("After working for 100 days, civil service has " + civilService.getDaysLeft() + " days left" );


        //1-b)
        MilitaryService militaryService = new MilitaryService(200);
        System.out.println("Military Service has " + militaryService.getDaysLeft() + " days left");

        for(int i=0; i<100; i++){
            militaryService.work();
        }
        System.out.println("After working for 100 days, military service has " + militaryService.getDaysLeft() + " days left" );


        //2-a)
        Book book1 = new Book("Fedor Dostojevsjki", "Crime and Punishment",2);
        Book book2 = new Book("Robert Martin", "Clean Code",1);
        Book book3 = new Book("Kent Beck", "Test Driven Development",0.5);

        CD cd1 = new CD("Pink Floyd", "Dart Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to being here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
         */
        Box box = new Box(10);

        box.add(new Book("Fedor Dostojevsjki", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to being here", 2012));

        System.out.println(box);

    }
}
