public abstract class Tabby extends Cat{
	public Tabby(String n){
        super(n);
    }

	@Override
    public String feed(Player p){
        if(getHunger() != 10){
            incrementHunger(1);
            return getName() + " is pretty hungry, and starts chomping down the food right away.";
        }
        else{
            p.takeDamage(2);
            return getName() + " is already full and scratches you.";
        }
    }

	@Override
	public String play(Player p){
        if(getHunger() == 1){
            p.takeDamage(2);
            return getName() + " is too hungry and scratches you.";
        }
        else{
            incrementHunger(-1);
            return getName() + " happily plays with you.";
        }
    }

	@Override
    public String pet(Player p){
        if(getHunger() == 1){
            p.takeDamage(2);
            return getName() + " is too hungry and scratches you.";
        }
        else{
            return getName()+  " happily allows you to pet them.";
        }
    }
}
