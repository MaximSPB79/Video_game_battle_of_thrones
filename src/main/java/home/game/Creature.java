package home.game;

public abstract class Creature {

    private int attack;
    private int defense;
    private int health;
    private int damage;

    private final int MAX_HEALTH = 100;
    private final int MIN_HEALTH = 0;

    private final String name;

    public Creature(String name, int attack, int defense, int damage) {
        this.name = name;
        this.attack = valueValidation(attack);
        this.defense = valueValidation(defense);
        this.health = MAX_HEALTH;
        this.damage = damage;

    }

    /**
     * Метод проверяет корректность значений
     *
     * @param number значение
     * @return возвращает значение если условие выполнено
     */
    private int valueValidation(int number) {
        if (number < 0 || number > 30) {
            throw new RuntimeException("Invalid values");
        } else {
            return number;
        }
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (this.health < MIN_HEALTH) {
            return "attack=" + attack +
                    ", defense=" + defense +
                    ", health=" + MIN_HEALTH +
                    ", damage=" + damage +
                    ", name='" + name + '\'' +
                    '}';
        }
        return "attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public int getMIN_HEALTH() {
        return MIN_HEALTH;
    }

    abstract boolean isDeath();
}
