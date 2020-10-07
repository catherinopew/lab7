/**Class representation for cat type Tiger**/
public class Tiger extends Cat{
    public Tiger(String n) {
        super(n);
    }
    /**Method to feed Tiger
    *@param p player to feed tiger
    *@return result from feeding
    **/
    @Override
    public String feed(Player p) {
        if(getHunger() != 10) {
            incrementHunger(2);
            return getName() + "is pretty hungry, and starts chomping down on the food right away.";
        }
        else {
            p.takeDamage(4);
            return getName() + "is already full and mauls you.";
        }
    }
    /**Method to play with tiger
    *@param p player to play with tiger
    *@return result from playing with Tiger
    **/
    @Override
    public String play(Player p) {
        if(getHunger() <= 3) {
            p.takeDamage(4);
            return getName() + "is pretty hungry and mauls you.";
        }
        else {
            incrementHunger(-2);
            return getName() + "happily plays with you.";
        }
    }
    /**Method to pet tiger
    *@param p player to pet tiger
    @return result from petting
    **/
    @Override
    public String pet(Player p) {
        if (getHunger() <= 3) {
            p.takeDamage(4);
            return getName() + "is pretty hungry and mauls you.";
        }
        else {
            return getName() + "happily allows you to pet them.";
        }
    }
}
