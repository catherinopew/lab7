/** Player class to represent the player in the game */
public class Player {
    /** Player's health point value */
    private int hp;
    
    /** Initializes player with full 10 health points */
    public Player() {
        hp = 10;
    }

    /** Return player's health points
     * @return player health points
     */
    public int getHp() {
        return hp;
    }

    /** Player takes damage from their pet
     * @param d damage amount
     */
    public void takeDamage(int d) {
        hp -= d;
    }

    /** Determine if player is dead
     * @return true if player dies and false otherwise
     */
    public boolean isDead() {
        boolean dead = false;
        if (hp <= 0) {
            dead = true;
        }
        return dead;
    }

    /** Print player's HP level
     * @return player's HP level
     */
    public String toString() {
        return "You have " + getHp() + "/10 HP";
    }
}
