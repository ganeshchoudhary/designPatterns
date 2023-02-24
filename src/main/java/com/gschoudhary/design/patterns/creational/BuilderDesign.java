package com.gschoudhary.design.patterns.creational;

class Person {
    private String name;

    private String college;
    private Person(String name, String college) {
        this.name = name;
        this.college = college;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;

        private String college;



        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setCollege(String college) {
            this.college = college;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.college);
        }
    }

}
public class BuilderDesign {
    public static void main(String[] args) {
        Person person = Person.builder()
                .setName("ganesh")
                .build();
        System.out.println(person.toString());
    }
}
