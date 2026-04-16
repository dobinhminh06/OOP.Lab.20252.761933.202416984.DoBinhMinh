package Lab03.OtherProjects.hust.soict.globalict.garbage.ConcatenationInLoops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        // Thay thế bằng đường dẫn tới một file dung lượng khá lớn (ví dụ vài MB)
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
        String outputString = "";
        
        // Sử dụng toán tử + tạo ra rất nhiều rác bộ nhớ
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian chạy (String +): " + (endTime - startTime) + " ms");
    }
}