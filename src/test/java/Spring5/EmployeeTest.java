//package Spring5;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//
//interface A{
//    default void show(){
//        System.out.println("abc");
//    }
//}
//
//interface B{
//    default void show(){
//        System.out.println("abc");
//    }
//}
//
//class EmployeeTest implements A, B{
//
//    @Test
//    public void aVoid(){
//        Employee employee = mock(Employee.class);
//    }
//
//    public static void main(String[] args) {
//        EmployeeTest employeeTest = new EmployeeTest();
//
//    }
//
//}