package patterns.a_creational.builder.example2;

public class Person {

    //everybody have
    private final String firstName;
    private final String lastName;
    private final int age;
    private final long idNumber;
    private final Nationality nationality;

    //optional
    private final boolean isSingle;
    private final boolean believeGood;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.idNumber = builder.idNumber;;
        this.nationality = builder.nationality;
        this.isSingle = builder.isSingle;
        this.believeGood = builder.believeGood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public boolean isBelieveGood() {
        return believeGood;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", nationality=" + nationality +
                ", isSingle=" + isSingle +
                ", believeGood=" + believeGood +
                '}';
    }

    public static class PersonBuilder {

        //everybody have
        private final String firstName;
        private final String lastName;
        private int age;
        private long idNumber;
        private Nationality nationality;

        //optional
        private boolean isSingle;
        private boolean believeGood;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder idNumber(long idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public PersonBuilder nationality(Nationality nationality) {
            this.nationality = nationality;
            return this;
        }

        public PersonBuilder isSingle(boolean isSingle) {
            this.isSingle = isSingle;
            return this;
        }

        public PersonBuilder believeGood(boolean believeGood) {
            this.believeGood = believeGood;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
