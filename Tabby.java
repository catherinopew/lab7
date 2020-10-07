/**represents cat type Tabby*/
public class Tabby extends Cat{
	/**initializes Tabby with given name
	 * @param n tabby's name
	 * */
	public Tabby(String n){
                super(n);
        }

	/**Feed the tabby
	 * @param p player to interact with Tabby
	 * @return result of feeding
	 * */
	@Override
        public String feed(Player p){
                if(getHunger()!=10){
                        incrementHunger(1);
                        return getName()+" is pretty hungry, and starts chomping down the food right away.";
                }
                else{
                        p.takeDamage(2);
                        return getName()+" is already full and mauls you.";
                }
        }

	/**Play with the Tabby
	 * @param p player to interact with Tabby
	 * @return result from play time
	 * */
	@Override
	public String play(Player p){
                if(getHunger()==1){
                        p.takeDamage(2);
                        return getName()+" is too hungry and mauls you.";
                }
                else{
                        incrementHunger(-1);
                        return getName()+" happily plays with you.";
                }
        }

	/**Pet the Tabby
	 * @param p player to pet Tabby
	 * @return result from petting Tabby
	 * */
	@Override
        public String pet(Player p){
                if(getHunger()==1){
                        p.takeDamage(2);
                        return getName()+" is too hungry and mauls you.";
                }
                else{
                        return getName()+" happily allows you to pet them.";
                }
        }
}
