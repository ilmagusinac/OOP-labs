package lab3;

import java.util.ArrayList;
import java.util.List;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private TaskStatus taskStatus;

    public enum TaskStatus {
        TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
    }

    public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
}
/*
public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks.add(new TaskItem(1, "Push lab code to the github", TaskItem.TaskStatus.TO_DO));
        tasks.add(new TaskItem(2, "Prepare for the quiz", TaskItem.TaskStatus.IN_PROGRESS));
        tasks.add(new TaskItem(3, "Go over tasks from lab2", TaskItem.TaskStatus.COMPLETED));
    }

    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(TaskItem.TaskStatus status) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public List<TaskItem> getTasksWithIdGreaterThanOrEqual(int id) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= id) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public void printTaskDescriptions() {
        for (TaskItem task : tasks) {
            System.out.println(task.getTaskDescription());
        }
    }

    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();
        System.out.println("All Tasks:");
        dataStructures.printTaskDescriptions();

        System.out.println("\nTasks with status IN_PROGRESS:");
        List<TaskItem> inProgressTasks = dataStructures.getByStatus(TaskItem.TaskStatus.IN_PROGRESS);
        for (TaskItem task : inProgressTasks) {
            System.out.println(task.getTaskDescription());
        }

        System.out.println("\nTasks with ID >= 2:");
        List<TaskItem> tasksWithId2OrGreater = dataStructures.getTasksWithIdGreaterThanOrEqual(2);
        for (TaskItem task : tasksWithId2OrGreater) {
            System.out.println(task.getTaskDescription());
        }
    }


}
        */
