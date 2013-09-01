package org.timemanagement.example;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.timemanagement.domain.DummyString;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author Michal Partyka
 */
@RunWith(MockitoJUnitRunner.class)
public class TestTest {
    private Test instance;

    @Mock
    private DummyString dummyStringMock;

    private static final String MOCK = "mock";

    @Before
    public void setUp() throws Exception {
        this.instance = new Test();
        this.instance.setDummyString(dummyStringMock);
    }

    @org.junit.Test
    public void testMethodShouldReturnTestString() {
        String string = this.instance.getTest();

        assertThat(string).isEqualTo("Test String!");
    }

    @org.junit.Test
    public void dummyStringShouldCallDummyString () {
        when(dummyStringMock.getString()).thenReturn(MOCK);

        String retString = this.instance.getTest();

        assertThat(retString).isEqualTo(MOCK);
    }
}
