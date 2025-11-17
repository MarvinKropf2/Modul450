public class PriceCalculator {

  public static double calculatePrice(
    double baseprice,
    double specialprice,
    double extraprice,
    int extras,
    double discount
  ) {
    double addonDiscount;
    double result;

    if (extras >= 5) {
      addonDiscount = 15;
    } else if (extras >= 3) {
      addonDiscount = 10;
    } else {
      addonDiscount = 0;
    }

    if (discount > addonDiscount) {
      addonDiscount = discount;
    }

    result = baseprice / 100.0 * (100 - discount)
      + specialprice
      + extraprice / 100.0 * (100 - addonDiscount);

    return result;
  }
}