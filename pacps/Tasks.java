/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopiers.pacps;

import java.io.IOException;
public class Tasks {
    private String taskType;
    private String deadline;
    private int priority;
    private boolean status;

    public Tasks(String taskType, String deadline, int priority, boolean status) {
        this.taskType = taskType;
        this.deadline = deadline;
        this.priority = priority;
        this.status = status;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }

    public boolean getStatus() {
        return status;
    }
    
    public boolean validateTaskType(String taskType){
        boolean validate;
        switch (taskType.toLowerCase().trim()) 
        {
            case "assignment":
            case "class test":
            case "web test":
            case "quiz":
            case "exam": validate = true;
                         break;
            default: validate = false;
                     break;   
        }
        return validate;
    }
    public boolean validateDeadline(String deadline){
        boolean validate = false;
        try{
        String day = deadline.substring(0,2);
        String month = deadline.substring(3,5);
        String year = deadline.substring(6);
        try{
        if (Integer.parseInt(day) <= 31 && Integer.parseInt(day)>0)
        {
            if (Integer.parseInt(month)<=12 && Integer.parseInt(month)>0){
                if(Integer.parseInt(year)==2025){
                    validate = true;
                }
            }
        }
        }catch(NumberFormatException x){
            x.printStackTrace();
        }
        }catch(StringIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        return validate;
    }
    
}
