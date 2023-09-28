package home.game;

import java.util.Random;

public class Battle {

    private final Creature attacking;
    private final Creature defending;
    private Random random;
    private final int CONSTANTA = 1;

    public Battle(Creature attacking, Creature defending) {
        this.attacking = attacking;
        this.defending = defending;
        actionBattle();
    }

    /**
     * Рассчитываем модификатор атаки
     */
    private int getAttackModifier() {
        int attackModifier = attacking.getAttack() - defending.getDefense() + CONSTANTA;
        return attackModifier <= 0 ? CONSTANTA : attackModifier;
    }

    /**
     * Метод определяет успешный или неудачный исход битвы
     *
     * @return возвращаем булеву значение
     */
    private boolean isResultBattle() {
        random = new Random();
        int numRendom;
        for (int i = 0; i < getAttackModifier(); i++) {
            numRendom = random.nextInt(1, 7);
            if (numRendom == 5 || numRendom == 6) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод отнимает здоровье у защищающегося персонажа, при положительном исходе битвы
     */
    private void actionBattle() {

        while (isResultBattle()) {
            int lostHealth = random.nextInt(CONSTANTA, attacking.getDamage());
            defending.setHealth(defending.getHealth() - lostHealth);
            System.out.println("The character " + defending.getName() + " lost " + lostHealth + " health units");
            if (defending.getHealth() < defending.getMIN_HEALTH()) {
                break;
            }
        }
        System.out.println("The characters decided to avoid each other");
    }
}




