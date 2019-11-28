import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import unint.MyDigestUtils;

import static org.junit.Assert.*;

public class MyDigestUtilsTest extends MyDigestUtils {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void md5Hex1() {
        MyDigestUtilsTest tes=new MyDigestUtilsTest();
        assertEquals("ce356c9af7dc5afbc8b22685edade098",tes.md5Hex("123456abc+"));
    }
}