package core.domain.contractCreationComponent;

public class SupervisorFactory extends JobTitleFactory{
    @Override
    public JobTitle createJobTitle(String department, String jobName){
        return new Supervisor(department, jobName);
    }
}
