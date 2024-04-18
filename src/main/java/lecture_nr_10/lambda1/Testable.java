package lecture_nr_10.lambda1;

import lecture_nr_10.lambda1.Employee;

@FunctionalInterface
public interface Testable {
    boolean test(Employee employee);
}
