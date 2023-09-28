package home.game;

public class Monster extends Creature {
    public Monster(String name, int attack, int defense, int damage) {
        super(name, attack, defense, damage);
    }

    @Override
    public String toString() {
        return "Monster{ " + super.toString() + "}";
    }

    /**
     * Метод проверяет жизнеспособность монстра по наличию у него здоровья
     * @return возвращает булево значение, которое в дальнейшем определяет остановить бой или продолжать дальше
     */
    public boolean isDeath() {
        if (this.getHealth() < 1) {
            System.out.println(this.getName() + " dead");
            return false;
        } else {
            return true;
        }
    }
}

