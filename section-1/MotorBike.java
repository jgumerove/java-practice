public class MotorBike {
//state below 

private int speed;

//behavior below  
    void adjustSpeed() {
        System.out.println("adjusting speed");
    }

    void start(){
        System.out.println("Bike Started");
    }

    void stateSpeed(int speed){
        System.out.println("traveling at " + speed);
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    int getSpeed(){
        return this.speed;
    }

    public int increaseSpeed(int increase){
        this.speed += increase;
        return this.speed;
    }


    public static void main(String[] args){
        MotorBike first = new MotorBike();
        MotorBike ducati = new MotorBike();
        ducati.speed = 100;
        System.out.println(ducati.speed);
        ducati.stateSpeed(ducati.speed);
        first.adjustSpeed();
    }
}