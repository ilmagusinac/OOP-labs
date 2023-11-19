public class Test {

    abstract class Car{
        private int horsepower;
        private String carName;

        public Car(int horsepower, String carName){
            this.horsepower=horsepower;
            this.carName=carName;
        }
        public int getHorsepower() {

            return horsepower;
        }

        public void setHorsepower(int horsepower) {

            this.horsepower = horsepower;
        }

        public String getCarName() {

            return carName;
        }

        public void setCarName(String carName) {

            this.carName = carName;
        }

        public abstract void printInfo();


    }

    class Mercedes extends Car {
        public Mercedes(int horsepower, String carName){
            super(horsepower, carName);
        }

        @Override
        public void printInfo(){
            System.out.println("Car names: " + getCarName() + ", Horsepower" + getHorsepower());
        }
    }

    class Audi extends Car{
        // Constructor
        public Audi(int horsepower, String carName) {
            super(horsepower, carName);
        }

        // Override printInfo method
        @Override
        public void printInfo() {
            System.out.println("Audi, Car name: " + getCarName() + ", Horsepower: " + getHorsepower());
        }

    }

    class GenericCat<T> extends Car{
        private T key;
        public GenericCat(int horsepower, String carName){
            super(horsepower, carName);
        }

        public T getHorsepowers(){
            return key;
        }

        public void setKey(T newKey){
            key=newKey;
        }
        @Override
        public void printInfo() {
            System.out.println("Audi, Car name: " + getCarName() + ", Horsepower: " + getHorsepower());
        }


    }

    /*
    interface Drivable{
        public abstract String drive();
    }
    class Car implements Drivable{
        private String motorSound;

        public Car(String motorSound){
            this.motorSound=motorSound;
        }

        public void setMotorSound(String newMotorSound){
            motorSound=newMotorSound;
        }

        public String getMotorSound(){
            return motorSound;
        }

        @Override
        public String drive(){
            return this.motorSound + " is the sound";
        }

    }
    class Scooter implements Drivable{
        private String sound;
        public Scooter(String sound){
            this.sound=sound;
        }

        public void setSound(String newSound) {

            sound = newSound;
        }

        public String getSound() {

            return this.sound;
        }

        @Override
        public String drive(){
            return this.sound + " is the sound.";
        }

    }

    public static void main(String[] args) {
        // Creating a Car instance
        Car myCar = new Test().new Car("Vroom");
        System.out.println("Car motor sound: " + myCar.getMotorSound());
        System.out.println("Car drive: " + myCar.drive());

        // Creating a Scooter instance
        Scooter myScooter = new Test().new Scooter("Beep");
        System.out.println("Scooter sound: " + myScooter.getSound());
        System.out.println("Scooter drive: " + myScooter.drive());
    }
     */

}
