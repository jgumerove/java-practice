public class MotorBikeRunner {
    public static void main(String[] args){
        MotorBike ducati = new MotorBike();
        ducati.adjustSpeed();
        ducati.setSpeed(140);
        ducati.increaseSpeed(200);
        System.out.println(ducati.getSpeed());
    }
}