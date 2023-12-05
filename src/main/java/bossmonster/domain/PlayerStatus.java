package bossmonster.domain;

public class PlayerStatus {

    private boolean alive;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;

    public PlayerStatus(int maxHP, int maxMP) {
        this.alive = true;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.maxMP = maxMP;
        this.currentMP = maxMP;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    private void setAlive(boolean status) {
        alive = status;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = Math.min(maxHP, currentHP);
        if (currentHP < 0) {
            this.currentHP = 0;
        }
        setAlive(currentHP > 0);
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = Math.min(maxMP, currentMP);
        if (currentMP < 0) {
            this.currentMP = 0;
        }
    }
}