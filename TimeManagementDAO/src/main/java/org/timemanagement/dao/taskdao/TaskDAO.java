package org.timemanagement.dao.taskdao;

import org.springframework.stereotype.Repository;
import org.timemanagement.dao.genericdao.TransactionalGenericDAO;
import org.timemanagement.domain.task.Task;

import java.io.Serializable;

/**
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
@Repository
public class TaskDAO<T, ID extends Serializable> extends TransactionalGenericDAO implements ITaskDAO {

    public TaskDAO() {
        super();
    }

    @Override
    public boolean save(Task task) {
        return super.save(task);
    }
}
