package com.romandev.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import com.romandev.datastructure.Task.TaskState;

public class TaskHandler {

    private Deque<Task> doneTasks = new ArrayDeque<Task>();
    private Queue<Task> pendingTasks = new LinkedList<Task>();
    private LinkedList<Task> allTasks = new LinkedList<Task>();

    public void addTask(Task task){
        task.setState(TaskState.PENDING);
        pendingTasks.add(task);
        System.out.println("Task \"" + task.getName() + "\" added");
    }

    public void completeTask(){
        if(!pendingTasks.isEmpty()){
            Task task = pendingTasks.poll();
            task.setState(TaskState.COMPLETED);
            doneTasks.push(task);
            System.out.println("Task \"" + task.getName() + "\" completed");
        }else{
            System.out.println("There are not pending tasks");
        }
    }

    public void seeLastCompletedTask(){
        if(!doneTasks.isEmpty()){
        Task task = doneTasks.peekFirst();
        System.out.println("Task \"" + task.getName() + "\" state: " + task.getState());
        }else{
            System.out.println("There are no completed tasks");
        }
    }

    public void undoCompletedTask(){
        if(!doneTasks.isEmpty()){
            Task task = doneTasks.pop();
            task.setState(TaskState.PENDING);
            pendingTasks.add(task);
            System.out.println("undone task \"" + task.getName() + "\" added to pending tasks");
            }else{
                System.out.println("There are no completed tasks");
            }
    }

    public void seeAllTasks(){
        allTasks.clear();
        if(!doneTasks.isEmpty()){
            allTasks.addAll(doneTasks);
        }
        if(!pendingTasks.isEmpty()){
            allTasks.addAll(pendingTasks);
        }
    
        if(!allTasks.isEmpty()){
            for(Task task : allTasks){
                System.out.println("Task: \"" + task.getName() + "\", state: " + task.getState());
            }
        }
    }
}
