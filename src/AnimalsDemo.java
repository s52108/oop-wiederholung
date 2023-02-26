public class AnimalsDemo {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green",2,"Quaxi");
        Animal quaxiAsAnimal = (Animal) quaxi;
        Frog quaxiAsFrog = (Frog) quaxiAsAnimal;
    }
}
