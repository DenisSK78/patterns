package v3;

import java.util.Date;

public class Employee {
    private String name;
    private Date birthday;
    private String profession;

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", profession='" + profession + '\'' +
                '}';
    }

    private Employee(Builder builder ) {
        this.name = builder.name;
        this.birthday = builder.birthday;
        this.profession = builder.profession;
    }

    static class Builder {
        private String name;
        private Date birthday;
        private String profession;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
