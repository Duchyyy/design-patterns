package com.duchyyy.creational.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User (UserBuilder builder) {
        setFirstName(builder.firstName);
        setLastName(builder.lastName);
        setAge(builder.age);
    }

    public static UserBuilder newUser() {
        return new UserBuilder();
    }


    public void sayHello() {
        System.out.println("Hello world: " + firstName);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;

        private UserBuilder () {
        }
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
