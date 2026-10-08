public class Hierarchicle {
    public static void main(String[] args) {
        Car c = new Car();
        Airplane a = new Airplane();
        c.onAc();
        c.run();

        a.fly();
        a.run();
    }
    
}
