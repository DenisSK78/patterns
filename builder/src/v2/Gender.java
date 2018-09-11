package v2;


public enum Gender implements Describable {
    MALE {
        @Override
        public String getDescription() {
            return "Male";
        }
    }, FEMALE {
        @Override
        public String getDescription() {
            return "Female";
        }
    }
}
