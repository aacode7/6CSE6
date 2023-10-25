interface Vechicle{
    void start();
}
interface MusicPlayer{
    void playMusic();
}
class Car implements Vechicle, MusicPlayer{
    public void start(){
        System.out.println("Car Started");
    }
    public void playMusic(){
        System.out.println("Music is playing in the car.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args){
        Car car = new Car();
        car.start();
        car.playMusic();
    }
}
