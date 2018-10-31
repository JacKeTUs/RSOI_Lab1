package com.jacketus.rsoi_lab1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {
    @Autowired

    @Test
    public void testHashing() {
        assertEquals("Error!", Worker.getSHA256Hash("NULL"), "FB329000228CC5A24C264C57139DE8BF854FC86FC18BF1C04AB61A2B5CB4B921");
        assertEquals("Error!", Worker.getSHA256Hash(""), "No string");
    }
}
