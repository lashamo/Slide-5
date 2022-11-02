package com.learn.slide5.object;

public class Runner {

    public static void main(String[] args) {
        User user1 = new User("test", "pass");
        User user2 = new User("test", "pass");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1);
    }
}
