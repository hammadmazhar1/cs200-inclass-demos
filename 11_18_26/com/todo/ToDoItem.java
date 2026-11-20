package com.todo;

public class ToDoItem{
    String taskID;
    String task;

    public ToDoItem(String id, String task){
        this.taskID = id;
        this.task = task;
    }
    public String getID(){
        return taskID;
    }
}