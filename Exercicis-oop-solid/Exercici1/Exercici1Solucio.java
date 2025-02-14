public class Exercici1Solucio {
    
    public static class Employee {
        
        // Personal Employee data
        private String name;
        private String position;
        private int hoursWorked;
        private double hourlyRate;

        
        public Employee(String name, String position, int hoursWorked, double hourlyRate) {
            this.name = name;
            this.position = position;
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }

        public String getName(){
            return name;
        }
        
        public String getPosition(){
            return position;
        }
        
        public int getHoursWorked(){
            return hoursWorked;
        }
        
        public double getHourlyRate(){
            return hourlyRate;
        }

    }
    
    public static class SalaryCalculator {
    }
    
    public static class ReportGenerator {
        private Employee employee;
        
        public ReportGenerator(Employee employee){
            this.employee = employee;
        }
        
        
        public void generateReport() {
            double salary = employee.calculateSalary();

            // Capçalera de l'informe
            System.out.println("============================================");
            System.out.println("           INFORME DE SALARI                ");
            System.out.println("============================================");
            System.out.println("Nom de l'empleat  . . . . . : " + employee.getName());
            System.out.println("Lloc de treball . . . . . . : " + employee.getPosition());
            System.out.println("Hores treballades . . . . . : " + employee.getHoursWorked());
            System.out.println("Tipus de salari per hora  . : " + employee.getHourlyRate() + "E");
            System.out.println("--------------------------------------------");
            System.out.println("Total salari  . . . . . . . : " + salary + "E");
            System.out.println("============================================");
        }
            
    }
    
    public static void main(String[] args) {
        // Create the employee with his data
        Employee employee = new Employee("Guillem Porta", "Desenvolupador", 160, 15.50);

        // Generar el report a partir del treballador.
        ReportGenerator generator = new ReportGenerator(employee);
        generator.generateReport();
    }
}
