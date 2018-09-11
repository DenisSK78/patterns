package v2;


public enum Weapon implements Describable {
    SWORD {
        @Override
        public String getDescription() {
            return "sword";
        }
    }, BOW {
        @Override
        public String getDescription() {
            return "bow";
        }
    }, STAFF {
        @Override
        public String getDescription() {
            return "staff";
        }
    }
}
