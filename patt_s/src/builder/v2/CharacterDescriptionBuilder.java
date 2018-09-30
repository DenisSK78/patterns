package builder.v2;


public class CharacterDescriptionBuilder {

    private Gender gender;
    private Weapon weapon;
    private Armor armor;
    private String name;

    public CharacterDescriptionBuilder(Gender gender) {
        this.gender = gender;
    }

    public CharacterDescriptionBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CharacterDescriptionBuilder weapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public CharacterDescriptionBuilder armor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public String build() {
        String result = gender.getDescription() + " hero ";
        result += name != null ? "named " + name + " " : "without name ";
        result += armor != null
                ? "equipped with " + armor.getDescription() + " armor "
                : "without armor ";
        result += weapon != null
                ? "and armed with " + weapon.getDescription()
                : "and without weapon";
        return result;
    }
}
