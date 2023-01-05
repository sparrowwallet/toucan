package com.sparrowwallet.toucan;

import org.junit.Assert;
import org.junit.Test;

public class LifeHashTest {
    @Test
    public void testHello() {
        LifeHash.Image image = LifeHash.makeFromUTF8("Hello", LifeHashVersion.VERSION2, 1, false);
        Assert.assertEquals(32, image.width());
        Assert.assertEquals(32, image.height());
        byte[] expected = new byte[] { -110, 126, -126, -78, 104, 92, -74, 101, 87, -54, 88, 64, -57, 89, 66, -59, 90, 69, -74, 101, 87, -76, 102, 89, -97, 117, 114, -46, 82, 54 };
        for(int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], image.colors().get(i).byteValue());
        }
    }

    @Test
    public void testHelloAlpha() {
        LifeHash.Image image = LifeHash.makeFromUTF8("Hello", LifeHashVersion.VERSION2, 1, true);
        Assert.assertEquals(32, image.width());
        Assert.assertEquals(32, image.height());
        byte[] expected = new byte[] { -110, 126, -126, -1, -78, 104, 92, -1, -74, 101, 87, -1, -54, 88, 64, -1, -57, 89, 66, -1, -59, 90, 69, -1, -74, 101, 87, -1, -76, 102, 89, -1, -97, 117, 114, -1, -46, 82, 54, -1 };
        for(int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], image.colors().get(i).byteValue());
        }
    }
}
