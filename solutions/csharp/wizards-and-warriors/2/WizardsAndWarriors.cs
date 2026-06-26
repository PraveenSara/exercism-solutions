abstract class Character
{
    string characterType {get; set;}
    protected Character(string characterType)
    {
        this.characterType = characterType;
    }

    public abstract int DamagePoints(Character target);

    public virtual bool Vulnerable()
    {
        return false;
    }

    public override string ToString()
    {
        return $"Character is a {characterType}";
    }
}

class Warrior : Character
{
    public Warrior() : base("Warrior")
    {
        
    }

    public override int DamagePoints(Character target) => target.Vulnerable() ? 10 : 6;

}

class Wizard : Character
{
    bool spellPrepared = false;
    public Wizard() : base("Wizard")
    {
    }

    public override int DamagePoints(Character target) => spellPrepared ? 12 : 3;

    public void PrepareSpell()
    {
        spellPrepared = true;
    }

    public override bool Vulnerable() => !spellPrepared;
    
    
}
