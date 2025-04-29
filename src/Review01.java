
public class Review01 {

	public static void main(String[] args) {
		int priceExcludingTax = 2000;
		double consumptionTax = taxMethod(
				priceExcludingTax);
		double priceIncludingTax = priceExcludingTax + consumptionTax;

		String str1 = "円の商品の税込価格は";
		String str2 = "円（消費税は";
		String str3 = "円）です。";

		System.out.println(priceExcludingTax + str1 +
		(int)priceIncludingTax + str2 +
		(int)consumptionTax + str3);
	}

	public static double taxMethod(
			double priceExcludingTax) {
		double num = priceExcludingTax * 0.1;
		return num;

	}
}

