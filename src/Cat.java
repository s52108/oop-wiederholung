public class Cat extends Animal{
    public Cat(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("walking graciuously");
    }

    public void makeNoise(){
        System.out.println("miouw");
    }
}
