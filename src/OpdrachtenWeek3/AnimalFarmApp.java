package OpdrachtenWeek3;

import java.util.ArrayList;

public class AnimalFarmApp {
    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        //Creeer in de main() method van elk dier een instance
        //Voeg elk dieren toe in de ArrayList

        Animal cat = new Cat();
        animalList.add(cat);
        Animal dog = new Dog();
        animalList.add(dog);
        Animal duck = new Duck();
        animalList.add(duck);
        Animal lion = new Lion();
        animalList.add(lion);
        Animal whale = new Whale();
        animalList.add(whale);
        Animal olifant = new Olifant();
        animalList.add(olifant);

        letTheAnimalsSpeak(animalList);
    }
    //Creeer in de klasse AnimalFarmApp een method om de dieren te laten spreken.
    //Creeer in deze methode een loop die alle elementen in de ArrayList afloopt en de speak() methode aanroept.
    private static void letTheAnimalsSpeak(ArrayList<Animal> animalList) {

        for (Animal animal : animalList) {
            animal.speak();

        }
    }
}