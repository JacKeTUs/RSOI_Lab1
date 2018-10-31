package com.jacketus.rsoi_lab1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Test
    public void testHashing() {
        assertEquals("Error!", Worker.getSHA256Hash("NULL"), "FB329000228CC5A24C264C57139DE8BF854FC86FC18BF1C04AB61A2B5CB4B921");
        assertEquals("Error!", Worker.getSHA256Hash(""), "E3B0C44298FC1C149AFBF4C8996FB92427AE41E4649B934CA495991B7852B855");
        assertEquals("Error!", Worker.getSHA256Hash("some_string"), "539A374FF43DCE2E894FD4061AA545E6F7F5972D40EE9A1676901FB92125FFEE");
    }
}
