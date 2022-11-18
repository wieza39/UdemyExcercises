package udemy.collections.priorityQueue;

public class Tasks implements Comparable<Tasks> {
    private int taskId;
    private String task;

    public Tasks(int taskId, String task) {
        this.taskId = taskId;
        this.task = task;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "taskId=" + taskId +
                ", task='" + task + '\'' +
                '}';
    }

    @Override
    public int compareTo(Tasks o) {
        int a = this.taskId;
        int b = o.taskId;

        if(a == b)
            return 0;
        else if(a > b)
            return 1;
        else
            return -1;
    }
}
