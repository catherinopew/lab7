/** This class represents cat type Ocelot */
public class Ocelot extends Cat{
	/** Initializes ocelot with given name
	 * @param n ocelot's name
         */
	public Ocelot(String n){
		super(n);
	}
	
	/** Feeds the ocelot
	 * @param p player feeding the ocelot
	 * @return feeding result 
         */
	@Override
	public String feed(Player p){
		if(getHunger() != 10){
			incrementHunger(2);
			return getName() + " is pretty hungry, and starts chomping down the food right away.";
		}
		else{
			p.takeDamage(3);
			return getName() + " is already full and mauls you.";
		}
	}
	
	/** Play with the ocelot (do not do this at home)
	 * @param p player playing with ocelot
	 * @return play result
         */
	@Override
	public String play(Player p){
		if(getHunger() == 1){
			p.takeDamage(3);
			return getName() + " is too hungry and mauls you.";
		}
		else{
			incrementHunger(-1);
			return getName() + " happily plays with you.";
		}
	}

	/** Pet the ocelot
	 * @param p player interacting with ocelot
	 * @return pet result
	 */
	@Override
	public String pet(Player p){
		if(getHunger() == 1){
			p.takeDamage(3);
			return getName() + " is too hungry and mauls you.";
		}
		else{
			return getName() + " happily allows you to pet them.";
		}
	}
}
