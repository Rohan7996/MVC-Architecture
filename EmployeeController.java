//CONTROLLER LAYER
public class EmployeeController{
    private Employee model;
    private EmployeeView view;
    
    
      public EmployeeController(Employee model, EmployeeView view) {  
          this.model = model;  
          this.view = view;  
       }  
        public void setEmployeeName(String name){  
          model.setEmployeeName(name);        
       }  
   
       public String getEmployeeName(){  
          return model.getEmployeeName();         
       }  
   
       public void setEmployeeId(String id){  
          model.setEmployeeId(id);        
       }  
   
       public String getEmployeeId(){  
          return model.getEmployeeId();       
       }  
   
       public void setEmployeeDepartment(String Department){  
              model.setEmployeeDepartment(Department);        
       }  
   
           public String getEmployeeDepartment(){  
              return model.getEmployeeDepartment();         
       }  
       
       
        public void updateView() {                  
          view.printEmployeeDetails(model.getEmployeeName(), model.getEmployeeId(), model.getEmployeeDepartment());  
       } 
    
}