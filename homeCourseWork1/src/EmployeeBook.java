public class EmployeeBook {
    public Employee[] employees = new Employee[10];

    public void setEmployees(Employee[] employees) {
        int i = 0;
        for (Employee emp : employees) {
            this.employees[i] = emp;
            i++;
        }
    }

    public void printListEmployee() {
        for (Employee emp : this.employees) {
            if (emp != null)
                System.out.println(emp.toString());
            else continue;
        }
    }

    public int calcMiddleSalary() {
        int middleSalary = 0;
        int i = 0;
        for (Employee emp : this.employees) {
            if (emp == null) break;
            else {
                i++;
                middleSalary += emp.getSalary();
            }
        }
        middleSalary = middleSalary / i;
        return middleSalary;
    }

    public void printTaxForSalary(String shema) {
        boolean bSh;
        float taxForSalary = 0;
        switch (shema) {
            case "PROPORTIONAL":
                bSh = true;
                break;
            case "PROGRESSIVE":
                bSh = false;
                break;
            default:
                bSh = true;
                break;
        }
        for (Employee emp : this.employees) {
            if (emp != null) {
                if (bSh) {
                    taxForSalary = (float) (emp.getSalary() * 0.13);
                } else {
                    if (emp.getSalary() < 150) {
                        taxForSalary = (float) (emp.getSalary() * 0.13);
                    } else if (emp.getSalary() < 350) {
                        taxForSalary = (float) (emp.getSalary() * 0.17);
                    } else if (emp.getSalary() >= 350) {
                        taxForSalary = (float) (emp.getSalary() * 0.21);
                    }
                }
                emp.printShortInfo();
                System.out.println("налог = " + String.format("%.2f", taxForSalary));
            }
        }
    }

    public void indexSalaryOnNumDep(int numDep, float proc) {
        float indexSalary;
        for (Employee emp : this.employees) {
            if (emp != null) {
                if (emp.getNumDepart() == numDep) {
                    indexSalary = (emp.getSalary() * proc / 100 + emp.getSalary());
                } else {
                    indexSalary = emp.getSalary();
                    continue;
                }
                emp.printShortInfo();
                System.out.println("индексированная зарплата " + String.format("%.2f", indexSalary));
            }
        }
    }

    public void printSalaryOneEmp(int numDep, int salary) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getNumDepart() == numDep && emp.getSalary() > salary) {
                    emp.printShortInfo();
                    break;
                }
            }
        }
    }

    public void printSalaryForEmpNumber(int wage, int countEmp) {
        int i = 0;
        for (Employee emp : this.employees) {
            if (emp != null) {
                while (emp.getSalary() < wage && i <= countEmp) {
                    emp.printShortInfo();
                    i++;
                    break;
                }
            }
        }
    }

    @Override
    public boolean equals(Object Obj) {
        boolean flag = false;
        for (Employee emp : this.employees) {
            if (emp == Obj) return true;

            if (Obj == null) {
                return false;
            }
            flag = Obj.equals(emp);
        }
        return flag;
    }

    public boolean addEmployeeInBook(Employee obj) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = obj;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployee(int id) {
        for (Employee emp : this.employees) {
            if (emp != null) {
                if (emp.getId() == id) {
                    return emp;
                }
            }
        }
        return null;
    }
}
