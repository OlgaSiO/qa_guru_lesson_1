package qury.qa.lesson_4;

public class Main {

    public static void main(String[] arg) {

        Cats kittyOne = new Cats();

        kittyOne.name = "Lyly";
        kittyOne.sex = "female";
        kittyOne.age = 1;
        kittyOne.favoriteFood = "salad";
        kittyOne.ownerPresence = false;

        kittyOne.sayName();
        kittyOne.saySex();
        kittyOne.sayAge();
        kittyOne.sayYourFavoriteFood();
        kittyOne.doYouHaveAMaster(false);

        Cats kittyTwo = new Cats();

        kittyTwo.name = "Hehe";
        kittyTwo.sex = "male";
        kittyTwo.age = 7;
        kittyTwo.favoriteFood = "cake";
        kittyTwo.ownerPresence = true;

        kittyTwo.sayName();
        kittyTwo.saySex();
        kittyTwo.sayAge();
        kittyTwo.sayYourFavoriteFood();
        kittyTwo.doYouHaveAMaster(true);
    }
}
