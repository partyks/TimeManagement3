package org.timemanagement.dao.taskdao;

import org.springframework.transaction.annotation.Transactional;
import org.timemanagement.domain.task.Task;

/**
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
public interface ITaskDAO {

    @Transactional
    boolean save(Task task);
}
