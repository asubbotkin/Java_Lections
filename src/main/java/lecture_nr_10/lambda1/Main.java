package lecture_nr_10.lambda1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee object1 = new Employee("Alex", 30, true, true);
        Employee object2 = new Employee("Andrew", 40, false, true);
        Employee object3 = new Employee("Vasea", 35, true, false);
        Employee object4 = new Employee("Nikolai", 20, false, false);

        List<Employee> employeeList = List.of(object1, object2, object3, object4);

        Testable canConductInterviewAlgorithm = new TestCanConductInterview();
        Testable canConductTrainingAlgorithm = new TestCanConductTraining();
        Testable nameStartsWithA = new TestNameStartsWithA();

        testEmployee(employeeList, canConductInterviewAlgorithm);
        testEmployee(employeeList, nameStartsWithA);
        testEmployee(employeeList, canConductTrainingAlgorithm);

        Testable test = (Employee e) -> {
            return e.canConductInterview;
        };
        testEmployee(employeeList, (Employee e) -> {
            return e.canConductTraining;
        });
    }
    public static void testEmployee(List<Employee> employeeList, Testable algorithm) {
        for(int index = 0; index != employeeList.size(); index++){
            System.out.println(employeeList.get(index));
            if(algorithm.test(employeeList.get(index))){
                System.out.println(employeeList.get(index));
            }
        }
    }
}
