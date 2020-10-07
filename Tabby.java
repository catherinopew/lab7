/**class representation for cat type Tabby**/
public class Tabby extends Cat{
	/**Initialize Tabby with given name
	*@param n name given to Tabby
	**/
	public Tabby(String n){
        super(n);
    }
	/**Method to feed Tabby
	*@param p player to feed Tabby
	*@return result of feeding
	**/
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
	/**Method to play with Tabby
	*@param p player to feed Tabby
	*@return result of playing with Tabby
	**/
	@Override
	public String play(Player p){
        if(getHunger() <= 3){
            p.takeDamage(2);
            return getName() + " is too hungry and scratches you.";
        }
        else{
            incrementHunger(-1);
            return getName() + " happily plays with you.";
        }
    }
	/**Method to pet Tabby
	*@param p player to pet Tabby
	*@return result from petting
	**/
	@Override
    public String pet(Player p){
        if(getHunger() <= 3){
            p.takeDamage(2);
            return getName() + " is too hungry and scratches you.";
        }
        else{
            return getName() + " happily allows you to pet them.";
        }
    }
}
