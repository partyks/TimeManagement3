package org.timemanagement.example;

import org.springframework.stereotype.Component;
import org.timemanagement.domain.DummyString;
import org.timemanagement.domain.DummyString;
/**
 * @author Michal Partyka
 */
@Component
public class Test {
    private DummyString dummyString = new DummyString("Test String!");
    private String text;
    private String appName = "Time management";

    public String getText() {
        return text;
    }

    public String getDomainString() {
        return dummyString.getString();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDummyString(org.timemanagement.domain.DummyString dummyString) {
        this.dummyString = dummyString;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
