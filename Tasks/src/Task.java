public class Task {
    public enum Status{
        Open, In_Progress, Done
    }
    int id;
    String taskName;
    int hoursBudget;
    int hoursSpent;
    Status status;

    public Task(int id, String taskName, int hoursSpent, int hoursBudget, Status status){
        this.id = id;
        this.hoursSpent = hoursSpent;
        this.hoursBudget = hoursBudget;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getHoursBudget() {
        return hoursBudget;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setHoursBudget(int hoursBudget) {
        this.hoursBudget = hoursBudget;
    }

    public void setHoursSpent(int hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "ID" + id +
                " "+ "Hours Spent" + hoursSpent +
                " "+ "Hours Budget" + hoursBudget +
                " "+ "Status" + status;
    }
}
