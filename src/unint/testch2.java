import org.junit.Test;
import unint.textEx;

import static org.junit.Assert.assertEquals;

public class testch2 extends textEx {
    @Test
    public void testch2()
    {
        textEx tes= new textEx();
        assertEquals("7ac66c0f148de9519b8bd264312c4d64",tes.str_ch2("abcdefg"));
    }
}
