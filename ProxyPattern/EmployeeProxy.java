package ProxyPattern;

import java.util.Objects;

public class EmployeeProxy implements EmployeeCRUDInterface {

    EmployeeCRUD employeeCRUD;

    EmployeeProxy() {
        employeeCRUD = new EmployeeCRUD();
    }

    @Override
    public void create(String auth, Employee employee) throws Exception {
        if (Objects.equals(auth, "ADMIN")) {
            employeeCRUD.create(auth, employee);
        } else {
            throw new Exception("CREATE :: Access Denied.");
        }
    }

    @Override
    public Employee read(String auth, int emp_id) throws Exception {
        if (Objects.equals(auth, "ADMIN") || Objects.equals(auth, "USER")) {
            return employeeCRUD.read(auth, emp_id);
        } else {
            throw new Exception("READ :: Access Denied.");
        }
    }

    @Override
    public void update(String auth, int emp_id, Employee employee) throws Exception {
        if (Objects.equals(auth, "ADMIN") || Objects.equals(auth, "USER")) {
            employeeCRUD.update(auth, emp_id, employee);
        } else {
            throw new Exception("UPDATE :: Access Denied.");
        }
    }

    @Override
    public void delete(String auth, int emp_id) throws Exception {
        if (Objects.equals(auth, "ADMIN") || Objects.equals(auth, "USER")) {
            employeeCRUD.delete(auth, emp_id);
        } else {
            throw new Exception("DELETE :: Access Denied.");
        }
    }

}
