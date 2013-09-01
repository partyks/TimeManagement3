package org.timemanagement.domain;

/**
 * @author Michal Partyka
 */
public class DummyString {
    private String string = "";

    public DummyString(String string) {
        this.string = string;
    }

    public String getString( ) {
        return string + "DUMMY";
    }
}
