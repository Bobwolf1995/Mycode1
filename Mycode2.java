package mycode2;

import java.util.Scanner;
import java.util.Arrays;

public class Mycode2 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        
        System.out.println("الرجاء ادخال عشرين عدد صحيح هنا ");
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Number" + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        
        // حساب مجموع الأعداد
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum =+ numbers[i];
            
        }
        
        // حساب متوسط الأعداد
       double average = (double) sum / 20;
       
        // العثور على أكبر وأصغر قيمة في المصفوفة
        int max = numbers[0];
        int min = numbers[0];
        
        for (int i = 1; i < 20; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        // العثور على ثاني أكبر قيمة في المصفوفة
        int secondMax = numbers[0];
        
        for (int i = 1; i < 20; i++) {
            if (numbers[i] < max && numbers[i] > secondMax) {
                secondMax = numbers[i];
            }
        }
        
        // ترتيب المصفوفة تصاعدياً
        Arrays.sort(numbers);
        
        // البحث عن محتوى في المصفوفة
        System.out.print("البحث عن محتوى في المصفوفة، الرجاء إدخال القيمة المراد البحث عنها: ");
        int searchValue = scanner.nextInt();
        int searchIndex = Arrays.binarySearch(numbers, searchValue);
        
        if (searchIndex >= 0) {
            System.out.println("تم العثور على القيمة " + searchValue + " في المصفوفة بالفهرس " + searchIndex);
        } else {
            System.out.println("القيمة " + searchValue + " لم تُجد في المصفوفة.");
        }
        
        // طباعة محتويات المصفوفة بشكل معكوس
        System.out.println("محتويات المصفوفة بشكل معكوس:");
        for (int i = 19; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // سطر فارغ
        
        // مضاعفة قيمة كل محتوى في المصفوفة
        for (int i = 0; i < 20; i++) {
            numbers[i] *= 2;
        }
        
        // العثور على الأعداد الفردية وتخزينها في مصفوفة أخرى
        int[] oddNumbers = new int[20];
        int oddCount = 0;
        
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers[oddCount] = numbers[i];
                oddCount++;
            }
        }
        
        // طباعة محتويات مصفوفة الأعداد الفردية
        System.out.println("الأعداد الفردية في المصفوفة:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println(); // سطر فارغ
    }
}
