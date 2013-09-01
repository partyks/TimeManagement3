package org.timemanagement.domain;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author Michal Partyka
 */
public class DummyStringTest {
    private DummyString instance;
    public static final String STRING_TEST_VALUE = "testvalue";

    @Before
    public void setUp() throws Exception {
        this.instance = new DummyString(STRING_TEST_VALUE);
    }

    @Test
    public void testGetMethod() {
        String retValue = this.instance.getString();

        assertThat(retValue).isEqualTo(STRING_TEST_VALUE+"DUMMY");
    }
}
