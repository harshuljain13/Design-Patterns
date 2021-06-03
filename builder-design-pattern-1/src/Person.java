package src;

public class Person {
    private String firstName;
    private String lastName;
    protected int age;
    protected String email;

    public Person(PersonBuilder pb){
        this.firstName = pb.firstName;
        this.lastName = pb.lastName;
        this.email = pb.email;
        this.age = pb.age;
    }

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge(){return this.age;}
    public String getEmail(){return this.email;}

    public String toString(){return "Name: " + this.firstName+ " " + this.lastName+ "\nEmail: " + this.email + "\nAge: " + this.age;}

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        protected int age;
        protected String email;

        public PersonBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder age(int a){
            this.age = a;
            return this;
        }

        public PersonBuilder email(String e){
            this.email = e;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
