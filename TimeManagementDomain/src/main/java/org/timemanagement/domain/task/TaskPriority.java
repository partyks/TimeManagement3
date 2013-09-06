package org.timemanagement.domain.task;

/**
 * Defines how important is signed task.
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
public enum  TaskPriority {
    CRITICAL(4),
    URGENT(3),
    NORMAL(2),
    INSIGNIFICANT(1);

    private final int potency;
    private final int MAXIMUM_POTENCY = 4; //TODO make automatic (values().length() doesn't work)
    private String description = this.name();

    private TaskPriority(int potency) {
        this.potency = potency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "This task priority is:" + this.name() + '(' + this.potency + '/' + this.MAXIMUM_POTENCY + ')';
    }
}
