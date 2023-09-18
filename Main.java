
public class Main
{
      private static Employee retriveEmployeeFromDatabase(){  
          Employee Employee = new Employee();  
          Employee.setEmployeeName("Anu");  
          Employee.setEmployeeId("11");  
          Employee.setEmployeeDepartment("Salesforce");  
          return Employee;  
       }  
	public static void main(String[] args) {
	    
	    Employee model = retriveEmployeeFromDatabase();  
	    EmployeeView view = new EmployeeView();  
		EmployeeController controller=new EmployeeController(model,view);
		
		controller.updateView();
		
		controller.setEmployeeName("CSS");
		
		controller.updateView();
	}
}
