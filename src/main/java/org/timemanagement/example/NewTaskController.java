package org.timemanagement.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.timemanagement.dao.taskdao.ITaskDAO;
import org.timemanagement.domain.task.SingleTask;
import org.timemanagement.domain.task.Task;

/**
 * WHERE SITUATE THIS CLASS ?
 *
 * Controls process of new task creation.
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
@Controller
public class NewTaskController {
    private final static Logger LOGGER = LoggerFactory.getLogger(NewTaskController.class.getName());
    private Task task = new SingleTask();

    @Autowired
    @Qualifier("taskDAO2")
    private ITaskDAO taskDAO2;

    public String createNewTask() {
        taskDAO2.save(task);
        LOGGER.info("New task created!\n" + task.toString());

        task = new SingleTask();
        return "index";
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
