// Importing all classes from java.time package 
import java.time.LocalDateTime; 
import java.time.format.*; 
  
// Main class 
class TestDateTime { 
    // Main method 
    public static void main(String[] args) 
    { 
        // กําหนดรูปแบบของวันทีและเวลาให้แสดงผลตามทีกําหนดรูปแบบ 
        DateTimeFormatter formatter 
            = DateTimeFormatter.ofPattern( 
                "yyyy-MM-dd HH:mm:ss a"); 
 
        // สร้าง Object now จาก คลาส LocalDateTime ซึงเป็นคลาสระบบของ Java 
        // คลาส LocalDateTime จะเป็นการดึงวันทีและเวลาปัจจุบัน 
        LocalDateTime now = LocalDateTime.now(); 
  
        // กําหนดรูปแบบวันทีและเวลา สําหรับการแสดงวันทีและเวลาปัจจุบัน 
        String dateTimeString = now.format(formatter); 
  
        // Print and Display 
        System.out.println(dateTimeString); 
    } 
}