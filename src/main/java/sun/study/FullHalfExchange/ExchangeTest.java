package sun.study.FullHalfExchange;

import java.io.UnsupportedEncodingException;

public class ExchangeTest {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String input = "アｱあぁナタＡＢＣdefブギｱﾀｼﾋﾞ123１２３";

        ASCIIExchange.showAscii(input);

        //System.out.println("Half：" + JapaneseEnglishExchange.exchangeToHalf(input));

        //System.out.println("Full：" + JapaneseEnglishExchange.exchangeToFull(input));
    }
}
