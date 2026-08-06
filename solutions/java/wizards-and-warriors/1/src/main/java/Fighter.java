class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    public String toString() {
        return "Fighter is a Wizard";
    }

    boolean isSpellPrepared = false;
    
    public void prepareSpell() {
        isSpellPrepared = true;
    }
    
    @Override
    public boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter warrior) {
        return isSpellPrepared ? 12 : 3;
    }
    
}