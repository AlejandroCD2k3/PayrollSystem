package core.domain.contractCreationComponent;

public class ConsultantFactory extends JobTitleFactory{
    @Override
    public JobTitle createJobTitle(String department, String jobName){
        return new Consultant(department, jobName);
    }
}
