package ProxyPattern;

public interface EmployeeCRUDInterface {

    void create(String auth, Employee employee) throws Exception;

    Employee read(String auth, int emp_id) throws Exception;

    void update(String auth, int emp_id, Employee employee) throws Exception;

    void delete(String auth, int emp_id) throws Exception;

}
