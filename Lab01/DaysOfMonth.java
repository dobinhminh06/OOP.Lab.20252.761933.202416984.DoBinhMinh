package Lab03.OtherProjects.Lab01.hust.soict.dsai.lab01;
// Nhập dữ liệu:
// Tháng: Phải xử lý được 4 định dạng đầu vào khác nhau: Tên đầy đủ, tên viết tắt có dấu chấm, 
// 3 chữ cái đầu, hoặc số thứ tự (Ví dụ: January, Jan., Jan, 1).
// Năm: Phải là số nguyên không âm và 
// nhập đầy đủ các chữ số (Ví dụ: 1999).
// Kiểm tra hợp lệ (Validation): Dùng vòng lặp kiểm tra, 
// nếu người dùng nhập sai định dạng của tháng hoặc năm, phải yêu cầu nhập lại cho đến khi đúng.
// Xử lý logic: Cài đặt thuật toán kiểm tra năm nhuận 
// (chia hết cho 4, ngoại trừ các năm chia hết cho 100 nhưng không chia hết cho 400) để xác định tháng 2 có 28 hay 29 ngày. 
// Các tháng còn lại lấy số ngày mặc định theo bảng.

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int monthIndex = -1; 

        String[] fullNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] abbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] threeLetters = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.print("Enter a month: ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Enter a year: ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            monthIndex = -1;
            for (int i = 0; i < 12; i++) {
                if (monthInput.equals(fullNames[i]) || monthInput.equals(abbreviations[i]) ||
                    monthInput.equals(threeLetters[i]) || monthInput.equals(numbers[i])) {
                    monthIndex = i;
                    break;
                }
            }

            if (monthIndex == -1) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            break; 
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = daysInMonth[monthIndex];
        
        if (monthIndex == 1 && isLeapYear) { 
            days = 29;
        }

        System.out.println("Number of days: " + days);
        scanner.close();
    }
}