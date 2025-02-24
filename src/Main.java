public class Main {
    public static void main(String[] args) {
        Calculator gcdCalculator = (a, b) -> {
          while (b != 0){
              int oldB = b;
              b = a % b;
              a = oldB;
          }

          return a;
        };
    }
}
