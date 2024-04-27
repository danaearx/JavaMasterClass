
    class Employee{
        public String emp_name;
        public int emp_id;
        public String address;

    }

    public class Exercise2 {
        public static void main(String[] args){
            System.out.println(printDetails());
        }
        public static String printDetails(){
            // TODO : Return the result here [ex: return "hello";]
            Employee james = new Employee();
            james.emp_name = "James";
            james.emp_id = 1001;
            james.address = "13th St, New York";
            return "Employee Name is " + james.emp_name + " and Employee ID is " + james.emp_id + " and Employee Address is " + james.address;
        }
    }

