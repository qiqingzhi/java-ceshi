import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import unint.text;

import static org.junit.Assert.*;

public class textTest extends text {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMD51() {
        text tes=new text();
        String a="123456abc+";
        assertEquals("ce356c9af7dc5afbc8b22685edade098",tes.testMD5(a));
    }

    @Test
    public void str_long1() {
        text tes=new text();
        String a="asfsdfvs";
        assertEquals(8,tes.str_long(a));
    }

    @Test
    public void str_add1() {
        text tes=new text();
        String a="asfsdfvs";
        String b="12345";
        assertEquals("asfsdfvs12345",tes.str_add(a,b));
    }
}