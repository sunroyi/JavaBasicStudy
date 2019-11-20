package junit;

import org.junit.Test;
import sun.study.JUnit.MyFunction;

import static org.junit.jupiter.api.Assertions.*;

public class MyFunctionTest {

    // 注意@Test需要的Junit是org.junit.Test，不是org.junit.jupiter.api.Test
    @Test
    public void add2() throws Exception{
        MyFunction mf = new MyFunction();
        assertEquals(3, mf.add(1,2));
    }

    @Test
    public void add1() throws Exception{
        MyFunction mf = new MyFunction();
        assertEquals(2, mf.add(1,2));
    }
}