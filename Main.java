public class Main {
    public static void main (String [] args) {
        int choice = 0;
        while (choice != -1) {
            System.out.println("Choose a kitty:");
            System.out.println("1. Tabby Cat");
            System.out.println("2. Ocelot");
            System.out.println("3. Tiger");

            choice = CheckInput.getIntRange(1, 3);
            String name = "";
            Player p = new Player();
            switch(choice) {
                case 1:
                    if (choice == 1) {
                        System.out.println("Name your kitty: ");
                        name = CheckInput.getString();
                        Cat c = new Tabby(name);
                        interactCat(c, p);
                    }
                    break;
                case 2:
                    if (choice == 2) {
                        System.out.println("Name your kitty: ");
                        name = CheckInput.getString();
                        Cat c = new Ocelot(name);
                        interactCat(c, p);
                    }
                    break;
                case 3: 
                    if (choice == 3) {
                        System.out.println("Name your kitty: ");
                        name = CheckInput.getString();
                        Cat c = newTiger(name);
                        interactCat(c, p);
                    }
                    break;
                default:
                    System.out.println("Bye!");
            }
        }
    }

    public static void interactCat(Cat c, Player p) {
        int choice = 0;
        while(p.isDead() == false) {
            System.out.println(c. //status of cat's hunger
            System.out.println("1. Feed your cat");
            System.out.println("2. Play with your cat");
            System.out.println("3. Pet your cat");

            choice = CheckInput.getIntRange(1, 3);
            
            switch(choice) {
                case 1:
                    if (choice == 1) {
                        c.feed(p);
                    }
                    break;
                case 2:
                    if (choice == 2) {
                        c.play(p);
                    }
                    break;
                case 3:
                    if (choice == 3) {
                        c.pet(p);
                    }
                    break;
                default:
                    
                

            }
        }
    }
}
