public class BmiService {
    public int calculate(int bodyMass, double height) {
        int result = (int) (bodyMass / Math.pow(height, 2));
        return result;
    }
}
