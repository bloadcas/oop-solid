public class Employee {
    private String idEmployee;
    private String name;
    private String role;
    private Double salary;
    private int workedHours;

    public Employee(String idEmployee, String name, String role, Double salary){
        this.idEmployee = idEmployee;
        this.name = name;
        this.role = role;
        this.setSalary(salary);
        this.workedHours = 0;
    }

    public void setSalary(int salary){
        if( salary < 0)
            throw Exception("E001: No negative salary");
        
        this.salary = salary;
    }
    public Double getSalary() {
        return salary;  // Devuelve el salario del empleado
    }
    
    public void setWorkedHours(int hours){
        if( hours< 0)
            throw Exception("E002: No negative work hours");
        
        this.workedHours = hours;
    }

    public int getWorkedHours() {
        return workedHours;  // Devuelve las horas trabajadas del empleado
    }
}


public class Journal {
    
    private Employee employee;
    
    public Journal(Employee employee){
        this.employee = employee;
    }
    
    public Double getSalary() {
        return employee.getSalary() / 30.0 * employee.getWorkedHours();  // Obtiene el salario del empleado basico
    }
}


public class Report {
    
    private Journal employee;
    
    public Journal(){
    }
    
    public void printJournal() {
        // Lógica para imprimir el informe (dependiendo de lo que se espera imprimir)
        System.out.println("
    }
}

public class Main{
    public void main(){
        Employee e = new Employee("1", "Josep", "Programador", 1000.0);
        e.setWorkedHours(8 * 2 * 5);
        
        Journal journal = new Journal(e);
        Report report = new Report(journal);
        report.printJournal();
        
    }
}
