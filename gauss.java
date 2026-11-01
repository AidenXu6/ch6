public class Main {
    public static void main(String[] args){
        System.out.print(gauss(3, 2));
    }

    public static double gauss(double x, int n) {
        double term = 1.0;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + term;
            term = term * (-x * x) / i;
        }
        return sum;
    }
}
