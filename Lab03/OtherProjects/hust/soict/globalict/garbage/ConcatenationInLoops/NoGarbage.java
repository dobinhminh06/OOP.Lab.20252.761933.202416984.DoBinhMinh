package Lab03.OtherProjects.hust.soict.globalict.garbage.ConcatenationInLoops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "test.exe"; 
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("Không thể đọc file. Vui lòng kiểm tra lại đường dẫn!");
            return;
        }

        startTime = System.currentTimeMillis();
        
        // Sử dụng StringBuilder (hoặc StringBuffer) để tối ưu
        StringBuilder outputStringBuilder = new StringBuilder(); 
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian chạy (StringBuilder): " + (endTime - startTime) + " ms");
    }
}