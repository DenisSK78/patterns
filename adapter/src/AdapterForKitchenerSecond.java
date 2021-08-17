/***
 * wrapper adapter
 */

public class AdapterForKitchenerSecond implements MealCook{
    KitchenerSecond kitchenerSecond;

    public AdapterForKitchenerSecond(KitchenerSecond kitchenerSecond) {
        this.kitchenerSecond = kitchenerSecond;
    }

    @Override
    public void cook() {
        kitchenerSecond.prepare();
    }
}
