package lecture_nr_10.lambda1;

import lecture_nr_10.lambda1.Employee;
import lecture_nr_10.lambda1.Testable;

public class TestCanConductInterview implements Testable {

    @Override
    public boolean test(Employee employee) {return employee.canConductInterview;}
}
