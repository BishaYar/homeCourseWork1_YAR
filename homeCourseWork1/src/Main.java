//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee_1 = new Employee("Иванов", "Иван", "Иванович", 1, 150);
        Employee employee_2 = new Employee("Петров", "Петр", "Петрович", 2, 250);

        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("1 rez add = " + employeeBook.addEmployeeInBook(employee_1));
        System.out.println("2 rez add = " + employeeBook.addEmployeeInBook(employee_2));
        System.out.println("3 rez add = " + employeeBook.addEmployeeInBook(new Employee("Семенов", "Семен", "Семенович", 2, 170)));
        System.out.println("4 rez add = " + employeeBook.addEmployeeInBook(new Employee("Кузнецов", "Иван", "Владимирович", 2, 300)));
        System.out.println("5 rez add = " + employeeBook.addEmployeeInBook(new Employee("Павлов", "Павел", "Павлович", 5, 350)));
        System.out.println("6 rez add = " + employeeBook.addEmployeeInBook(new Employee("Смирнов", "Олег", "Антонович", 5, 450)));
        System.out.println("7 rez add = " + employeeBook.addEmployeeInBook(new Employee("Пайгин", "Олег", "Антонович", 5, 450)));
        System.out.println("8 rez add = " + employeeBook.addEmployeeInBook(new Employee("Кирсанов", "Ильдар", "Ринатович", 3, 330)));
        System.out.println("9 rez add = " + employeeBook.addEmployeeInBook(new Employee("Кирсанов", "Ильдар", "Ринатович", 3, 330)));
        System.out.println("10 rez add = " + employeeBook.addEmployeeInBook(new Employee("Мухин", "Анатолий", "Олегович", 4, 335)));
        System.out.println("11 rez add = " + employeeBook.addEmployeeInBook(new Employee("Калинин", "Максим", "Викторович", 4, 330)));

        //System.out.println(employee_1.equals(employee_2));
        //System.out.println(employee_1.toString());
        //employee_1.printShortInfo();

        //employeeBook.printListEmployee();
        System.out.println("Средняя зарплата: " + employeeBook.calcMiddleSalary());
        //employeeBook.printTaxForSalary("PROPORTIONAL");
        employeeBook.indexSalaryOnNumDep(5, 13.0f);
        //employeeBook.printSalaryOneEmp(2, 200);
        //employeeBook.printSalaryForEmpNumber(250, 4);

        //System.out.println(employeeBook.equals(employee_5));
        //employeeBook.printListEmployee();
        employeeBook.getEmployee(5).printShortInfo();
    }
}