public abstract class Cat{
    private String name;
    private int hunger;

    public Cat(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    protected int incrementHunger(int val) {
        hunger += val;
        if (hunger < 1) {
            hunger = 1;
        }
        else if (hunger > 10) {
            hunger = 10;
        }
        return hunger;
    }

    @Override
    public String toString() {
        if (hunger >= 1 && hunger <= 4) {
            return getName() + "is pretty hungry.";
        }
        else if (hunger >= 5 && hunger <= 9) {
            return getName() + "is satisfied.";
        }
    }
    
    public abstract String feed(Player p);

    public abstract String play(Player p);

    public abstract String pet(Player p);
}
