public class Ocelot extends Cat{
	public Ocelot(String n){
		super(n);
	}
	@Override
	public String feed(Player p){
		if(getHunger()!=10){
			incrementHunger(2);
			return getName()+" is pretty hungry, and starts chomping down the food right away.";
		}
		else{
			p.takeDamage(3);
			return getName()+" is already full and mauls you.";
		}
	}
	@Override
	public String play(Player p){
		if(getHunger()==1){
			p.takeDamage(3);
			return getName()+" is too hungry and mauls you.";
		}
		else{
			incrementHunger(-1);
			return getName()+" happily plays with you.";
		}
	}
	@Override
	public String pet(Player p){
		if(getHunger()==1){
			p.takeDamage(3);
			return getName()+" is too hungry and mauls you.";
		}
		else{
			return getName()+" happily allows you to pet them.";
		}
	}
}
