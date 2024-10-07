package com.romandev.datastructure;

public class Task {
    private String name;
    private int priority;
    private TaskState state;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public int getPriority(){
        return this.priority;
    }

    public void setState(TaskState state){
        this.state = state;
    }

    public TaskState getState(){
        return this.state;
    }

    public enum TaskState {
        PENDING,
        COMPLETED
    }
}

