package ProxyPattern;

public class Main {

    public static void main(String args[]) {
        try {
            EmployeeProxy employeeProxy = new EmployeeProxy();
            employeeProxy.create("ADMIN", new Employee(
                    "user-name",
                    "43",
                    Employee.Gender.FEMALE
            ));

            System.out.println("Operation successful.");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

}

