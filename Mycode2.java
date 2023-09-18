package mycode2;

import java.util.Scanner;
import java.util.Arrays;

public class Mycode2 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int Number[] = new int[20];
        
        System.out.println("The correct numbers");
        
        for(int i = 1; i < Number.length; i++){
            
            Number[i] = input.nextInt();
        }
        
      
        int sum = 0;
        
        for(int i = 0; i < Number.length; i++){
            
            
            System.out.println("Calculate all numbers");
            sum = sum += Number[i];
           
        }
        System.out.println(sum);
        
        // حساب متوسط الاعداد 
        double average = (double) sum / 20;

int arr [] = {10 , 40 , -3 , 90};
int max = arr[0];
int min = arr[0];

for(int i = 1; i < arr.length; i++){
    
    if(arr[i] > max){
    
    max = arr[i];
}
    if(arr[i] < min){
        min = arr[i];
    }
    
}
         System.out.println("Max is = "  + max);
         System.out.println("Min is = " + min);
  


         for (int x = 0; x < Number.length; ++x){
             x++;
             System.out.println(x);
            
         }
          
             for(int i = 1; i < Number.length; i++){
                 i++;
                 System.out.print(i);
             }
         
             
             int Secondbigernumber = arr[0];
             
             for(int i = 0; i < arr.length; i++){
                 
                 if(arr[i] < max && arr[i] > Secondbigernumber ){
                     
                     Secondbigernumber = arr[i];
                 }
             }
             
             System.out.println("print the secound max number : " + Secondbigernumber);
             
             
            System.out.println("Arrenge the []");
           
            
             Arrays.sort(arr);
             Arrays.sort(Number);
             
          // ===========================================================  
             
int Tar[] = {45 , 70 , 50 , 1 , 96};

int target = 50;

boolean found = false;
boolean Sfound = false;

for(int i = 0; i < Tar.length; i++){
    if(Tar[i] == target){
        found = true;
        break;
    }
    
}
        
if(found){
    System.out.println("The Target is = " + target);
}
else{
    System.out.println("The Target hasn't been found " + target);
}



for(int i = 96; i > Tar.length; i--){
    System.out.println(i);
}


// ملاحظة لم يتم الضرب هنا:( 
int fac [] = {4,5,2,1,7};

int Factor = 2;

for(int i = 0; i<fac.length; i++){
    
    fac[i] = fac[i] * Factor;
}

      
int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // حساب عدد الأعداد الفردية لتحديد حجم المصفوفة الجديدة
        int oddCount = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 != 0) {
                oddCount++;
            }
        }

        // إنشاء مصفوفة جديدة لتخزين الأعداد الفردية
        int[] oddNumbers = new int[oddCount];
        
        // متغير لتتبع مؤشر المصفوفة الجديدة
        int newIndex = 0;

        // استخدام حلقة for لاختيار وتخزين الأعداد الفردية
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 != 0) {
                oddNumbers[newIndex] = originalArray[i];
                        newIndex++;
            }
        }

        // طباعة المصفوفة الجديدة
        System.out.print("الأعداد الفردية في المصفوفة الأصلية: ");
        for (int odd : oddNumbers) {
            System.out.print(odd + " ");
        }
    }
       

    }

  
