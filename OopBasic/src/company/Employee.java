package company;

public class Employee {

       protected final String name;
        private final Department department;
        private final String position;
       private final int employeeId;
        
        
        
        public Employee(String name, Department department, String position, int employeeId) {
            this.name = name;
            this.department = department;
            this.position = position; 
            this.employeeId = employeeId;
        }
        
  public void report(int times) {
      System.out.println(times+"回目の報告をします。役職："+ position + "、名前：" + name );
  }
  
  public void report() {
      report(1);
  }
  }
