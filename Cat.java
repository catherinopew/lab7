/**class to simulate a cat*/
public abstract class Cat extends Player{

	/**name of player's cat*/
	private String name;
	/**level of cat's hunger*/
	private int hunger;
	
	/**intializes cat with given name
	 * @param n name to be given to cat
	 */
	public Cat(String n){
		name=n;
	}

	/**Calls upon the cat's name
	 * @return cat's name
	 */
	public String getName(){
		return name;
	}

	/**Measures the cat's hunger level
	 *@return hunger level
	 */
	int getHunger(){
		return hunger;
	}

	/**Increment/decrement hunger level
	 *@return hunger level
	 */
	protected int incrementHunger(int val){
		hunger+=val;
		if(hunger<1){
			hunger=1;
		}
		else if(hunger>10){
			hunger=10;
		}
		return hunger;
	}

	/**Prints the cat's status
	 *@return cat's status based on hunger level
	 */
	@Override
	public String toString(){
		if(hunger==10){
			return getName()+" is currently full";
		}
		else if(hunger>5 && hunger<10){
			return getName()+" is satisfied.";
		}
		else{
			return getName()+" is hungry.";
		}	
	}

	/**feed the cat
	 * @param p player interacting with cat*/
	public abstract String feed(Player p);
	/**play with the cat
	 * @param p player interacting with cat*/
	public abstract String play(Player p);
	/**pet the cat
	 * @param p player petting cat*/
	public abstract String pet(Player p);
}
