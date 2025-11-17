public class PriceCalculatorTest {

  public static void main(String[] args) {
    boolean allOk = testCalculatePrice();

    if (allOk) {
      System.out.println("Alle Tests ok.");
    } else {
      System.out.println("Mindestens ein Test fehlgeschlagen.");
    }
  }

  public static boolean testCalculatePrice() {
    boolean testOk = true;

    double price;
    double expected;
    double tolerance = 0.0001;

    price = PriceCalculator.calculatePrice(30000, 0, 0, 0, 0);
    expected = 30000;
    if (Math.abs(price - expected) > tolerance) testOk = false;

    price = PriceCalculator.calculatePrice(30000, 0, 0, 0, 10);
    expected = 27000;
    if (Math.abs(price - expected) > tolerance) testOk = false;

    price = PriceCalculator.calculatePrice(30000, 0, 10000, 3, 0);
    expected = 30000 + 10000 * 0.9;
    if (Math.abs(price - expected) > tolerance) testOk = false;

    price = PriceCalculator.calculatePrice(30000, 0, 10000, 5, 0);
    expected = 30000 + 10000 * 0.85;
    if (Math.abs(price - expected) > tolerance) testOk = false;

    price = PriceCalculator.calculatePrice(30000, 2000, 8000, 3, 5);
    expected = 30000 * 0.95 + 2000 + 8000 * 0.9;
    if (Math.abs(price - expected) > tolerance) testOk = false;

    return testOk;
  }
}