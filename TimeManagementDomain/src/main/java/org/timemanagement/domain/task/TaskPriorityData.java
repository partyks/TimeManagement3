package org.timemanagement.domain.task;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * This bean provide data for view rendering.
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
@ManagedBean
@ApplicationScoped
public class TaskPriorityData {

    public TaskPriority[] getTaskPriorities() {
        return TaskPriority.values();
    }
}
