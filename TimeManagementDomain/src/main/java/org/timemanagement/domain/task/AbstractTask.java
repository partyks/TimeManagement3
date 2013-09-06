package org.timemanagement.domain.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Abstract task contains basic data about task.
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
@Entity
abstract class AbstractTask implements Task {
    private String shortDescription;
    private String detailDescription;
    private TaskPriority priority;
    private TaskState state;

    @Id
    @GeneratedValue
    private long id;

    protected AbstractTask() {
    }

    protected AbstractTask(String shortDescription, TaskPriority priority) {
        this.shortDescription = shortDescription;
        this.priority = priority;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String getDetailDescription() {
        return detailDescription;
    }

    @Override
    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    @Override
    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    @Override
    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public TaskState getState() {
        return state;
    }

    @Override
    public void setState(TaskState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractTask)) {
            return false;
        }

        AbstractTask that = (AbstractTask) o;

        if (id != that.id) {
            return false;
        }
        if (!detailDescription.equals(that.detailDescription)) {
            return false;
        }
        if (priority != that.priority) {
            return false;
        }
        if (!shortDescription.equals(that.shortDescription)) {
            return false;
        }
        if (state != that.state) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = shortDescription.hashCode();
        result = 31 * result + detailDescription.hashCode();
        result = 31 * result + priority.hashCode();
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "detailDescription = '" + detailDescription + '\'' +
                ", shortDescription = '" + shortDescription + '\'' +
                ", priority = " + priority +
                ", state = " + state +
                '}';
    }
}
