package sun.study.FullHalfExchange;

public class ExchangeTest {

    public static void main(String[] args){

        String input = "アナタＡＢＣdefブギｱﾀｼﾋﾞ";

        System.out.println("Half：" + JapaneseEnglishExchange.exchangeToHalf(input));

        System.out.println("Full：" + JapaneseEnglishExchange.exchangeToFull(input));
    }
}
