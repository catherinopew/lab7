/**Player to interact in game*/
public class Player {
    /**Player's health point value*/
    private int hp;
    
    /**Initializes player with full 10 health points*/
    public Player() {
        hp = 10;
    }
    /**return player's health points
    *@return player health points
    **/
    public int getHp() {
        return hp;
    }
    /**player takes damage from their pet
    *@param d damge amount
    **/
    public void takeDamage(int d) {
        hp -= d;
    }
    /**shows if player is dead
    *@return true if player dies. False otherwise
    **/
    public boolean isDead() {
        boolean dead = false;
        if (hp <= 0) {
            dead = true;
        }
        return dead;
    }
    /**Print player's HP level
    *@return player's HP level
    **/
    public String toString() {
        return "You have " + getHp() + "/" + hp + " HP";
    }
}
