public class Exercici1 {
    
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

        
        public void generateReport() {
            double salary = calculateSalary();

            // Capçalera de l'informe
            System.out.println("============================================");
            System.out.println("           INFORME DE SALARI                ");
            System.out.println("============================================");
            System.out.println("Nom de l'empleat  . . . . . : " + name);
            System.out.println("Lloc de treball . . . . . . : " + position);
            System.out.println("Hores treballades . . . . . : " + hoursWorked);
            System.out.println("Tipus de salari per hora  . : " + hourlyRate + "E");
            System.out.println("--------------------------------------------");
            System.out.println("Total salari  . . . . . . . : " + salary + "E");
            System.out.println("============================================");
        }

    }
    
    public static void main(String[] args) {
        // Create the employee with his data
        Employee employee = new Employee("Guillem Porta", "Desenvolupador", 160, 15.50);

        // Generar el report a partir del treballador.
        employee.generateReport();
    }
}
