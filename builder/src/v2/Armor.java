package v2;


public enum Armor implements Describable {
    PLATE {
        @Override
        public String getDescription() {
            return "plate";
        }
    }, LEATHER {
        @Override
        public String getDescription() {
            return "leather";
        }
    }
}
