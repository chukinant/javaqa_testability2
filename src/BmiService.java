public class BmiService {
    public double calculate(int bodyMass, double height) {
        double result = bodyMass / Math.pow(height, 2);
        return result;
    }
}
