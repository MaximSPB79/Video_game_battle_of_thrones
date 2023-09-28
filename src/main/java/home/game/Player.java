package home.game;

public class Player extends Creature {

    private int life;
    private final int HEALING_PERCENTAGE = 30;

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                ", " + super.toString();
    }

    public Player(String name, int attack, int defense, int damage) {
        super(name, attack, defense, damage);
        life = 4;
    }

    /**
     * Метод производит процесс исцеления
     */
    void healingProcess() {
        int health = this.getHealth() + this.getMAX_HEALTH() * HEALING_PERCENTAGE / 100;
        if (health > this.getMAX_HEALTH()) {
            throw new RuntimeException("you can't be that healthy");
        } else {
            this.setHealth(health);
            life--;
        }
    }

    public int getLife() {
        return life;
    }

    /**
     * Метод проверяет жизнеспособность игрока по наличию у него жизней и здоровья, и если жизней хватает, но мало здоровья проводит процесс исцеления
     * @return возвращает булево значение, которое в дальнейшем определяет остановить бой или продолжать дальше
     */
    public boolean isDeath() {
        if (this.getHealth() < 1 && this.getLife() < 1) {
            System.out.println(this.getName() + " dead");
            return false;
        }
        if (this.getHealth() < 1) {
            healingProcess();
        }
        return true;
    }
}


