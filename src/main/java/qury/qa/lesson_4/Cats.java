package qury.qa.lesson_4;

public class Cats {

    public String name;
    public String sex;
    public int age;
    public String favoriteFood;
    public boolean ownerPresence;

    //Methods
    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void saySex() {
        System.out.println("My sex is " + sex);
    }

    public void sayAge() {
        System.out.println("My age is " + age + " years old");
    }

    public void sayYourFavoriteFood() {
        System.out.println("My favorite food is " + favoriteFood);
    }

    public void doYouHaveAMaster(boolean master) {
        master = ownerPresence;
        if (master == false) {
            System.out.println("I don't have a master. Will you take me with you?");
        } else System.out.println("I have a master. Sorry...");
    }
}
