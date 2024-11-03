public class Main {
    public static void main(String[] args) {
        // height in meters
        double height = 1.87;
        // body mass in kg
        int bodyMass = 98;
        // new object of BmiService class
        BmiService bmi = new BmiService();
        // calling "calculate" method of bmi object
        int myBmi = bmi.calculate(bodyMass, height);
        System.out.println();
        // printing result in console with type conversion from double to int
        System.out.println("Calculated body mass index is: " + myBmi);
    }
}