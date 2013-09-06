package org.timemanagement.domain.task;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Represents single task.
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
@Entity
public class SingleTask extends AbstractTask {
    private Date startDate;
    private Date endDate;
    private long minutesSpentOnThisTask;

    public SingleTask() {
    }

    public SingleTask(String shortDescription, TaskPriority priority) {
        super(shortDescription, priority);
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getMinutesSpentOnThisTask() {
        return minutesSpentOnThisTask;
    }

    public void setMinutesSpentOnThisTask(long minutesSpentOnThisTask) {
        this.minutesSpentOnThisTask = minutesSpentOnThisTask;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleTask)) return false;
        if (!super.equals(o)) return false;

        SingleTask that = (SingleTask) o;

        if (minutesSpentOnThisTask != that.minutesSpentOnThisTask) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (int) (minutesSpentOnThisTask ^ (minutesSpentOnThisTask >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SingleTask{" +
                " shortDescription = " + super.getShortDescription() +
                ", detailedDescription=" + super.getDetailDescription() +
                ", priority = " + super.getPriority() +
                ", endDate = " + endDate +
                ", startDate = " + startDate +
                ", minutesSpentOnThisTask = " + minutesSpentOnThisTask +
                '}';
    }
}
