package com.example.summit_power_company_.ReanaManagingDirector;

import java.time.LocalDate;

public class Task {
    private String assignedTo;
    private LocalDate dueDate;
    private String taskDetails;

    public Task(String assignedTo, LocalDate dueDate, String taskDetails) {
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.taskDetails = taskDetails;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    @Override
    public String toString() {
        return "Task{" +
                "assignedTo='" + assignedTo + '\'' +
                ", dueDate=" + dueDate +
                ", taskDetails='" + taskDetails + '\'' +
                '}';
    }
}
