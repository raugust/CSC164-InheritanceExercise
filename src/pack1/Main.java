package pack1;

public class Main {

    public static void main(String[] args) {
        Pet[] things = new Pet[5];

	    Pet cat1 = new Cat();
        cat1.name = "Fluffy";
        cat1.breed = "Short Hair";
        cat1.weight = 6.0;
        cat1.age = 1;
        System.out.println(cat1);

        Pet bird1 = new Bird();
        bird1.name = "tweety";
        bird1.breed = "conure";
        bird1.weight = 1.0;
        bird1.age = 2;
        System.out.println("\n\n" + bird1);
    }
}

abstract class Pet { //abstract keeps you from building new types of pets
    String name;
    String breed;
    Double weight;
    int age;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}

class Bird extends Pet {
    String vocalize = "Tweet";
    int legs = 2;
    boolean canTalk = false;
    boolean canFly = false;

    @Override
    public String toString() {
        return super.toString() + "\nBird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", canTalk=" + canTalk +
                ", canFly=" + canFly +
                '}';
    }
}

class Cat extends Pet {
    String vocalize = "Meow";
    int legs = 4;
    boolean isNeutered = false;
    boolean isHouseTrained = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 =  "Cat{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", isNeutered=" + isNeutered +
                ", isHouseTrained=" + isHouseTrained +
                '}';
        return (s1 + "\n" + s2);
    }
}