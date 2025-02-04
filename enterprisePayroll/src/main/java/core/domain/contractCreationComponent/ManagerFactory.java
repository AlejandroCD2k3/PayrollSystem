package core.domain.contractCreationComponent;

public class ManagerFactory extends JobTitleFactory {

    @Override
    public JobTitle createJobTitle(String department, String jobName){
        return new Manager(department, jobName);
    }

}
