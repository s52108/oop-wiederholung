public class Bird extends Animal {


    public Bird(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("flying");
    }

    public void makeNoise() {
        System.out.println("chirp chirp");
    }
}
