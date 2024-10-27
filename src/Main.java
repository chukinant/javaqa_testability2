public class Main {
    public static void main(String[] args) {
        // height in meters
        double height = 1.87;
        // mass in kg
        int mass = 98;
        // new object of BmiService class
        BmiService bmi = new BmiService();
        // calling "calculate" method of bmi object
        double myBmi = bmi.calculate(mass,height);
        System.out.println();
        // printing result in console with type conversion from double to int
        System.out.println("Calculated body mass index is: " + (int) myBmi);
    }
}