package org.timemanagement.domain.task;

/**
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
public interface Task {

    String getDetailDescription();

    void setDetailDescription(String detailDescription);

    TaskPriority getPriority();

    void setPriority(TaskPriority priority);

    String getShortDescription();

    void setShortDescription(String shortDescription);

    TaskState getState();

    void setState(TaskState state);
}
