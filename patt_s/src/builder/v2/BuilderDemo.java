package builder.v2;


public class BuilderDemo {

    public static void main(String[] args) {
        CharacterDescriptionBuilder builder = new CharacterDescriptionBuilder(Gender.FEMALE)
                .name("Arwen")
                .armor(Armor.PLATE)
                .weapon(Weapon.SWORD);
        // TODO: some logic
//        if (...) {
//            builder.armor(Armor.LEATHER);
//        }
        String description = builder.build();
        System.out.println(description);
    }
}
