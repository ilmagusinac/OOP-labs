package lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3307/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "maliprinc";
    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<TaskItem> fetchAllTaskEntities() {
        List<TaskItem> taskEntities = new ArrayList<>();

        try {
            String query = "SELECT taskId, taskDescription, taskStatus FROM tasks";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int taskId = resultSet.getInt("taskId");
                String taskDescription = resultSet.getString("taskDescription");
                TaskItem.TaskStatus taskStatus = TaskItem.TaskStatus.valueOf(resultSet.getString("taskStatus"));

                TaskItem taskEntity = new TaskItem(taskId, taskDescription, taskStatus);
                taskEntities.add(taskEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return taskEntities;
    }

    public TaskItem fetchTaskEntityById(int taskId) {
        TaskItem taskEntity = null;

        try {
            String query = "SELECT taskId, taskDescription, taskStatus FROM tasks WHERE taskId = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, taskId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String taskDescription = resultSet.getString("taskDescription");
                TaskItem.TaskStatus taskStatus = TaskItem.TaskStatus.valueOf(resultSet.getString("taskStatus"));

                taskEntity = new TaskItem(taskId, taskDescription, taskStatus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return taskEntity;
    }
}
