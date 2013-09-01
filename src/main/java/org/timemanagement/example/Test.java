package org.timemanagement.example;

import org.springframework.stereotype.Component;
import org.timemanagement.domain.DummyString;

/**
 * @author Michal Partyka
 */
@Component
public class Test {
    private DummyString dummyString = new DummyString("Test String!");

    public String getTest() {
        return "Test String!";
    }

    public String getDomainString() {
        return dummyString.getString();
    }


    public void setDummyString(org.timemanagement.domain.DummyString dummyString) {
        this.dummyString = dummyString;
    }
}
