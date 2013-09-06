package org.timemanagement.domain.task;

/** Defines state of task.
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
public enum TaskState {
    CREATED,
    APPROVED,
    STARTED,
    WITHHELD,
    FINISHED,
    ABANDONED;

    @Override
    public String toString() {
        return "This task's state is : " + this.name() ;
    }
}
