public class Player {
    private int hp;

    public Player() {
        hp = 10;
    }

    public int getHp() {
        return hp;
    }

    public void takeDamage(int d) {
        hp -= d;
    }

    public boolean isDead() {
        boolean dead = false;
        if (hp == 0) {
            return true;
        }
        return dead;
    }

    public String toString() {
        return "You have" + getHp() + "/" + hp + "HP";
    }
}
