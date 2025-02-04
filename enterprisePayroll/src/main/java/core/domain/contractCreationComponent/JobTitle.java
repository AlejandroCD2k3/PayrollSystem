package core.domain.contractCreationComponent;

public abstract class JobTitle {

    private String department;
    private String jobName;

    public JobTitle(String department, String jobName){
        this.department = department;
        this.jobName = jobName;
    }

    public abstract void getDetails();
}
