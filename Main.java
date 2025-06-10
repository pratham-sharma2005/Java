// public class Main{
//     public static void main(String[] args){

//         //This is my first java code

//         System.out.print("I love pizza\n");
//         System.out.print("Its really good\n");
//         System.out.print("Buy Me Pizza\n");
//         System.out.println("Lmao Sout is a good shortcut to print System print line");
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         int age=12;
//         float marks=36.5f;
//         double temp= -12.5;
//         char grade='A';
//         boolean is_Student=true;


//         System.out.println(age);
//         System.out.println(marks);
//         System.out.println(temp);
//         System.out.println(grade);
//         System.out.println(is_Student);
//     }
// }



// public class Main{
//     public static void main(String[] args){
//         boolean is_Student=false;
//         if(is_Student){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//         String name="Pratham";
//         System.out.println(name);
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         String name="Bro Code";
//         int gta=6;
//         double pi=3.145159;
//         char gender='M';
//         boolean isAdmin=true;


//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your Name:");
//         String name = scanner.nextLine();

//         System.out.println("Hello "+ name);
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner scanner= new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = scanner.nextLine();
//         System.out.println("Hello "+name);
//     }
// }



// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = scanner.nextLine();
//         System.out.println("Heya "+name);
//     }
// }


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner =new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name=scanner.nextLine();
//         System.out.println("Namaste "+name);
//     }
// }


// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Name:");
//         String name = scanner.nextLine();
//         System.out.println("Hola "+name);
//         Scanner.close();
//     }
// }


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your age:");
//         int age = scanner.nextInt();
//         if(age>18){
//             System.out.println("You are above 18");
//         }
//         else{
//             if(age==18){

//                 System.out.println("You are 18");
//             }

//             else{
//                 System.out.println("You are below 18");
//             }
//                 }
        
//         scanner.close();
//     }
// }


// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Name:");
//         String name = scanner.nextLine();

//         System.out.println("Age:");
//         int age = scanner.nextInt();




//         System.out.println("Heya "+ name + " you are "+age +" years old");
//         scanner.close();
//     }
// }


// import java.util.Scanner;  //This problem occurs when first taking an int value and the astring lue in java to solve this see th enext code
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);


//         System.out.println("Age:");
//         int age = scanner.nextInt();

//         System.out.println("Name:");
//         String name = scanner.nextLine();

//         System.out.println("Heya "+ name + " you are "+age +" years old");
//         scanner.close();
//     }
// }



// import java.util.Scanner;  
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);


//         System.out.println("Age:");
//         int age = scanner.nextInt();
//         scanner.nextLine();

//         System.out.println("Name:");
//         String name = scanner.nextLine();

//         System.out.println("Heya "+ name + " you are "+age +" years old");
//         scanner.close();
//     }
// }




//Calculating the area of a reactangle

// import java.util.Scanner;
//  class Main {
//      public static void main(String[] args)
//       {
        
//         double length = 0;
//         double breadth = 0;
//         double area = 0;

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Length:");

//         length =scanner.nextDouble();

//         System.out.print("Breadth:");

//         breadth = scanner.nextDouble();

//         area=length*breadth;

//         System.out.println("Area="+area);
//         scanner.close();

//      }
//  }

// //SHOPPIN CART
// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("What do u wanna buy?");
//         String item = scanner.nextLine() ;

//         System.out.println("How mnay do u wanna buy?");
//         int number = scanner.nextInt() ;

//         int price=0;

//         if(item.equals("Pizza"))
//         {
//             price=10;
//         }
//         if(item.equals("Burger"))
//         {
//             price=20;
//         }

//         if(item.equals("Taco"))
//         {
//             price = 30;
//         }
//         System.out.println("Your product is: "+item+" and your toatl is $:"+number*price);
//         scanner.close();
//     }
// }




//  import java.util.Random;

//  class Main {
//      public static void main(String[] args) {
//         Random random = new Random();

//         int number;

//         number = random.nextInt(6)+1;  // range is from 0 to 5 and adding 1 makes the range from 1 to 5

//         System.out.println(number);
//      }
//  }



// //Random Head/Tails
// import java.util.Random;

// class Main {
//     public static void main(String[] args) {
//         Random random = new Random();
//         boolean is_heads;
//         is_heads =random.nextBoolean();
//         if(is_heads){
//             System.out.println("Heads");
//         }
//         else{
//             System.out.println("Tails");
//         }
//     }
// }





// import java.util.Scanner;
// import java.util.Random;

// class Main {
//     public static void main(String[] args) {
//         Random random =new Random();
//         Scanner scanner = new Scanner(System.in);
//         int age = random.nextInt(9)+1;
//         System.out.print("Enter your age:");
//         int age_check=scanner.nextInt();
//         if(age==(age_check)){
//             System.out.println("Equal");
//             System.out.println(age);
//             System.out.println(age_check);
//         }
//         else{
//             System.out.println("Not Equal");
//             System.out.println(age);
//             System.out.println(age_check);
//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         System.out.println(Math.PI);
//         System.out.println(Math.E);
//         System.out.println(Math.pow(2,3));
//         System.out.println(Math.abs(-10));
//         System.out.println(Math.sqrt(16));
//         System.out.println(Math.round(3.14));
//         System.out.println(Math.ceil(4.3));
//         System.out.println(Math.floor(3.99));
//         System.out.println(Math.max(12,20));
//         System.out.println(Math.min(12,20));
//     }
// }


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int height;
//         int perpendicular;
//         float hypotenuse;

//         System.out.print("Enter the height:");
//         height=scanner.nextInt();

//         System.out.print("Enter the perpendicular:");
//         perpendicular=scanner.nextInt();

//         hypotenuse =(float) Math.sqrt(Math.pow(height,2)+Math.pow(perpendicular,2));
//         System.out.println("Hypotenuse is:"+hypotenuse);
//         scanner.close();
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         String name ="Pratham";
//         System.out.printf("Hey %s",name);
//     }
// }






// // adding , after % give us a a , after every thousands value 
// // after adding .3 gives us a number rouning to 3 digits after the deciamls
// // after adding ( after % puts all the negative values in a ()
// // after adding 04 after % zero padsour numbers till we get 4 digits in total

// class Main {
//     public static void main(String[] args) {
//         double number = 11987.654321;
        
//         System.out.printf("%.2f\n", number);
//         System.out.printf("%.3f\n", number);
//         System.out.printf("%.4f\n", number);
//         System.out.printf("%,.5f\n", number);
//         System.out.printf("%,.6f\n", number);
//         System.out.printf("%f\n", number);
//         int number = 123;
//         System.out.printf("%06d",number);

//     }
// }


// class Main {
//     public static void main(String[] args) {
//         String name="  PrAtHaM  ";
//         int length = name.length();
//         char letter = name.charAt(1);
//         int index = name.indexOf("P");
//         String name1 = name.toUpperCase();
//         String name2 = name.toLowerCase();
//         String name_without_space=name1.trim();
//         String new_name = name.replace("M", "N");
 

//         System.out.println(length);
//         System.out.println(letter);
//         System.out.println(index);
//         System.out.println(name1);
//         System.out.println(name2);
//         System.out.println(name_without_space);
//         System.out.println(new_name);
//         System.out.println(name.isEmpty());

//     }
// }



// class Main {
//     public static void main(String[] args) {
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// }



// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         int a;
//         int b;
//         int sum;

//         System.out.print("Enter the first number:");
//         a = scanner.nextInt();

//         System.out.print("Enter the second number:");
//         b=scanner.nextInt();

//         sum = a + b;
//         System.out.printf("Sum:%d",sum);

//     }
// }


// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number:");
//         int number = scanner.nextInt();

//         if(number%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }


// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter a number:");
//         Scanner scanner = new Scanner(System.in);

//         int button = scanner.nextInt();

//         switch(button){

//             case 1: System.out.println("One");
//             break;

//             case 2: System.out.println("TWo");
//             break;

//             case 3: System.out.println("Three");
//             break;

//             case 4: System.out.println("Four");
//             break;

//             case 5: System.out.println("Five");
//             break;

//             case 6: System.out.println("Six");
//             break;

//             default:System.out.println("None");

//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
        
//         for(int i=0;i<20;i++){
//             System.out.println(i+1);
//         }
//     }
// }


// class Main {
//     public static void main(String[] args) {
        
//         int x=10;
//         while(x>0){
//             System.out.println(x);
//             x--;
//         }
//     }
// }


// public class Main{
//     public static void main(String[] arg){
//         int i=0;
//         do{
//             System.out.println(i++);
//         }while(i<10);
//     }
// }


// import java.util.*;
// class Main {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n = scanner.nextInt();

//         for(int i=1;i<n+1;i++){
//             System.out.println(i);
//         }
//     }
// }




// import java.util.*;

// class Main {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number:");

//         int number =scanner.nextInt();

//         for(int i=1;i<11;i++){
//             System.out.printf("%d * %d = %d\n",i,number,i*number);
//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         for(int i=0;i<4;i++){
//             for(int j=0;j<5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         for(int i=0 ; i<4 ; i++){

//             for(int j=0 ; j<5 ; j++){

//                 if(i==0 || j==0 || i==3 || j==4){

//                     System.out.print("*");
//                 }else{

//                     System.out.print(" ");

//                 }
//             }
//             System.out.println("\n");
//         }
//     }
// }




// class Main {
//     public static void main(String[] args) {
        
//         for(int i=0 ; i<4 ; i++){
//             for(int j=0 ; j<4 ; j++){

//                 if(i>=j){
//                     System.out.print("x");
//                 }else{
//                     System.out.print(" ");
//                 }
            
//             }System.out.print("\n");
//         }
//     }
// }






// class Main {
//     public static void main(String[] args) {
        
//         for (int i=0 ; i<4 ;i++){
//             for (int j=0 ; j<4 ;j++){

//                 if( i + j <= 3){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }

            
//             }System.out.printf("\n");
//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
        
//         for(int i=0 ; i<4 ;i++){
//             for(int j=0 ; j<4 ;j++){

//                 if( i + j>=3){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }

            
//             }System.out.print("\n");


//         }
//     }
// }


// class Main {
//     public static void main(String[] args) {
        
//         for(int i=0; i<5 ; i++){
//             for(int j=0; j<5 ; j++){
            
//                 if(i >= j){
//                     System.out.print(j+1);

//                 }else{
//                     System.out.print(" ");
//                 }
//             } System.out.print("\n");
//         }
//     }
// }




// class Main {
//     public static void main(String[] args) {
        
//         for(int i=0; i<5 ; i++){
//             for(int j=0; j<5 ; j++){
            
//                 if(i + j  <=4 ){
//                     System.out.print(j+1);

//                 }else{
//                     System.out.print(" ");
//                 }
//             } System.out.print("\n");
//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
//      int count = 0;
//         for(int i=0; i<5 ; i++){
//             for(int j=0; j<5 ; j++){
            
//                 if(i >= j  ){

//                     System.out.print(count+1+" ");
//                     count++;

//                 }else{
//                     System.out.print(" ");
//                 }
//             } System.out.print("\n");
//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         for(int i=0; i<5 ; i++){
//             for(int j=0; j<5 ; j++){
            
//                 if(i >= j  ){

//                     if( (( i + j )%2)==0){
//                         System.out.print("1");
//                     }else{
//                         System.out.print("0");
//                     }
                    

//                 }else{
//                     System.out.print(" ");
//                 }
//             } System.out.print("\n");
//         }
//     }
// }



// import java.util.*;

// public class Main {

//     public static void printMyName(String name){

//         System.out.println("Heya my name is "+name);
//     }
//     public static void main(String[] args) {
        

//        String name1="Pratham";
//        printMyName(name1);

//     }

// }


// import java.util.*;
// class Main {

// public static void addition(int number1,int number2,int number3){
//     int answer = number1 + number2 + number3 ;
//     System.out.print(answer);
// }
//     public static void main(String[] args) {

//         int a = 12;
//         int b= 13;
//         int c= 14;
//         addition(a, b, c);
//     }
// }

// class Main {

//     public static void factorial(int n){
//         int answer=1;
//         for( int i=1 ; i<n+1 ; i++){
//             answer=answer*i;
//         }
//         System.out.println("Answer is : "+answer);
//     }
//     public static void main(String[] args) {
//         factorial(6);
//     }
// }

// import java.util.*;
// class Main {

//     public static void average(int a , int b, int c){
//         int average = (a + b + c)/3;
//         System.out.println("Average : "+average);
//     }
//     public static void main(String[] args) {
//         Scanner scanner =new Scanner(System.in);
        
//         System.out.print("Enter first number :");
//         int number1 = scanner.nextInt();

//         System.out.print("Enter first number :");
//         int number2 = scanner.nextInt();

//         System.out.print("Enter first number :");
//         int number3 = scanner.nextInt();

//         average(number1,number2,number3);

//         scanner.close();
//         }
//     }



// class Main {

//     public static void sum_odd_numbers(int n){
//         int sum = 0;
//         for( int i=1 ; i<n+1 ; i++){
//             if(i%2==1){
//                 sum=sum+i;
//             }
//         }
//         System.out.println("Answer is:"+sum);
//     }
//     public static void main(String[] args) {
//         sum_odd_numbers((15));
//     }
// }


// class Main {

//     public static void greater_number(int a,int b){
//         if(a>b){
//             System.out.println(a);
//         }else{
//             System.out.println(b);
//         }
//     }
//     public static void main(String[] args) {
//         greater_number(30, 20);
//     }
// }




// class Main {
//     public static void main(String[] args) {

//         int[] marks = new int[3];
//         marks[0]=97;
//         marks[1]=93;
//         marks[2]=98;
        
//         for (int i=0 ; i<3 ;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         int[] array = {1,2,3,4,5,6,7,8,9,10};
        
//         int target=8;

        

//         for ( int i =0 ;i < 10; i++){
//             for ( int j =0 ;j < 10; j++){

//                 if((array[i]+array[j])==target){
//                     System.out.printf("%d,%d\n",array[i],array[j]);
//                 }

//             }
//         }
//     }
// }



// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         // int[] marks ={1,2,3,4,5}; // One method of directly assigning the array
//         Scanner scanner = new Scanner(System.in);

//         int size;
//         System.out.print("Enter the size of the array:");
//         size=scanner.nextInt(); 

//         int[] number = new int[size];

//         for(int i=0; i< size ;i++){
//             System.out.printf("Enter the %d number:",i+1);
//             number[i] = scanner.nextInt();
//         }

//         System.out.println();

//         for(int i=0; i< size ;i++){
//             System.out.printf("Numbers are::%d\n",number[i]);
//         }
//         scanner.close();
//     }
// }




// import java.util.*;
// class Main {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         int size;
//         System.out.print("Enter the size of the array:");
//         size=scanner.nextInt(); 

//         int[] number = new int[size];

//         for(int i=0; i< size ;i++){
//             System.out.printf("Enter the %d number:",i+1);
//             number[i] = scanner.nextInt();
//         }

//         System.out.println();

//         int target;
//         System.out.print("Enter the target number:");
//         target =scanner.nextInt();

//         for( int j =0 ;j < size ; j++){
//             if(number[j]==target){

//                 System.out.printf("\nAnswer Index is:%d",j);

//             }
//         }

        
//         scanner.close();
//     }
// }





// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the length of the matrix:");
//         int length = scanner.nextInt();

//         System.out.print("Enter the breadth of the matrix:");
//         int breadth = scanner.nextInt();

//         int[][] matrix = new int[breadth][length];

//         for(int i = 0 ;i<breadth ;i++){
//             for(int j = 0 ;j<length ;j++){
//                 System.out.printf("\nEnter the %d elemnet of %d row:",j+1,i+1);
//                 matrix[i][j]=scanner.nextInt();
            
//             }
//         }

//         for(int i = 0 ;i<breadth ;i++){
//             for(int j = 0 ;j<length ;j++){
//                 System.out.print(matrix[i][j]);
//                 System.out.print(" ");
            
//             }
//             System.out.print("\n");
//         }


//         scanner.close();
//     }
// }

// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String name = "212343212";
//         String reversed="";


//         String new_name = name.toLowerCase();

//         for( int i=new_name.length()-1; i>=0 ; i--){

//             System.out.print(new_name.charAt((i)));
//             reversed += name.charAt(i); // append each char
//         }

//         System.out.println();

//         if(name.equals(reversed)){
//             System.out.println("Equal");
//         }else
//         System.out.println("Not equal");
//         scanner.close();
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         String name1 = "bello";
//         String name2 = "bello";

//         if(name1.compareTo(name2)==0){
//             System.out.println("Equal");
//         }
//         else{System.out.println("Not Equal");}
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         String name = "Pratham Sharma";
//         String name2 = name.substring(8,name.length());
//         String name3 = name.substring(8);
//         System.out.println(name2);
//         System.out.println(name3);

//     }
// }


// class Main {
//     public static void main(String[] args) {
//         String str = "123";
//         int number = Integer.valueOf(str); // returns Integer object, auto-unboxed to int
//         System.out.println(number);

//     }
// }


// class Main {
//     public static void main(String[] args) {
//         int number = 123;
//         String str = String.valueOf(number); 
//         System.out.println(str);

//     }
// }





// class Main {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Pony");

//         // Char at index 0
//         System.out.println(sb.charAt(0));

//         //Set char at index 0
//         sb.setCharAt(0,'T');
//         System.out.println(sb);


//         //Insert a char
//         sb.insert(2,'n');
//         System.out.println(sb);


//         //Delete a character
//         sb.delete(2,4);
//         System.out.println(sb);

//         //Append in a string
//         sb.append('s');
//         System.out.println(sb);


//     }
// }


// class Main {
//     public static void main(String[] args) {
//         String string = "hello";
//         String reversed="";

//         for( int i =string.length()-1; i>=0 ; i--){
//             System.out.print(string.charAt(i));
//             reversed += string.charAt(i);
//         } System.out.println();
//         System.out.println(reversed);
//     }
// }



// //Swapping Numbers
// class Main {
//     public static void main(String[] args) {
//         int a=12;
        
//         int b=15;

//         int c;

//         c=a;
//         a=b;
//         b=c;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// //Swapping Numbers
// class Main {
//     public static void main(String[] args) {
//         int a=12;
        
//         int b=15;

//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// //Swapping Numbers
// class Main {
//     public static void main(String[] args) {
//         int a=12;
        
//         int b=15;

//         a=a*b;
//         b=a/b;
//         a=a/b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// //Swapping Numbers
// class Main {
//     public static void main(String[] args) {
//         int a=12;
        
//         int b=15;

//         a=a^b;
//         b=a^b;
//         a=a^b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }




// //Swapping Numbers
// class Main {
//     public static void main(String[] args) {
//         int a=12;
        
//         int b=15;

//         b=a+b-(a=b);
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// //Reversing  a string
// import java.util.*;
// class Main {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number:");
//         String number = scanner.nextLine();

//         int digits = number.length();

//         for(int i = digits-1 ; i>=0 ; i--){

//             System.out.print(number.charAt(i));
//         }

//         scanner.close();
//     }
// }


// //Reversing the numbers
// class Main {
//     public static void main(String[] args) {
//         int number = 1234567890;
//         int temp; 
//         int size = String.valueOf((number)).length();

//         for(int i=0 ;i < size ;i++){
//             temp=number%10;
//             System.out.print(temp);
//             number/=10;
//         }
//     }
// }





// //Reversing the numbers
// class Main {
//     public static void main(String[] args) {
//         int number = 1234567890;
//         int rev = 0;  // initialize reversed number

//         while (number != 0) {
//             int digit = number % 10;     // get last digit
//             rev = rev * 10 + digit;      // add to reversed number
//             number /= 10;                // remove last digit
//         }

//         System.out.println("Reversed number: " + rev);
//     }
// }

// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name:");
//         String name = scanner.nextLine();
//         System.out.println("Hello "+name);
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         int number = 9;
//         for ( int i=1; i< number+1 ; i++){
//             System.out.printf("%d ",i);
//         }
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         int number =6;
//         int product =1;
//         for (int i=1 ; i <= number ;i++ )
//         {
//             product=product*i;
//         }System.out.println(product);
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         int number = 137;
//         if (isPrime(number)) {
//             System.out.println("PRIME");
//         } else {
//             System.out.println("NOT PRIME");
//         }
//     }

//     public static boolean isPrime(int number) {
//         if (number <= 1) return false;
//         if (number == 2 || number == 3) return true;
//         if (number % 2 == 0 || number % 3 == 0) return false;

//         int limit = (int) Math.sqrt(number);
//         for (int i = 5; i <= limit; i += 6) {
//             if (number % i == 0 || number % (i + 2) == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         String name ="abcba";
//         String reversed ="";

//         for (int i =name.length()-1 ; i>=0 ; i-- ){
//             System.out.print(name.charAt(i));
//             reversed =reversed + name.charAt(i);
//         }System.out.println();

//         if(name.compareTo(reversed)==0 ){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not a Palindrome");
//         }
//     }
// }



// class Main {
//     public static void main(String[] args) {
//        int array[]= {1,2,33,45,50,10,77,88,9};
//        int temp1=  0;
//        int temp2 = 0;
//        int temp3 = 0;

//        for(int i =0 ; i<array.length-1 ;i++ ){

//         if(array[i] >= temp1){
//             temp1=array[i];
//             temp2 = i;
//         }
            
//        } 
//        System.out.println(temp1);
//        array[temp2]=0;
//        for(int j =0 ; j<array.length-1 ;j++ ){

//         if(array[j] >= temp3){
//             temp3=array[j];
//         }
      
//     } System.out.println(temp3);

// }
// }



// class Main {
//     public static void main(String[] args) {
//         String string1 ="abcdefg";
//         String string2 ="abcdef";
//     if(string1.length() == string2.length() ){
//         System.out.println("Equal");
//     }
//     else System.out.println("Not Equal");
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         int Array[]={1,2,3,4,5,6,7};
//         int target = 10;
//         boolean found = false;
//         for(int i=0 ; i<Array.length-1 ; i++){
//             for(int j=i+1 ; j<Array.length ; j++){
//                 if(Array[i]+Array[j]==target){
//                     System.out.printf("Pair found: %d + %d = %d\n", Array[i], Array[j], target);
//                     found = true;
//                 }
//             }
//         }
//     }
// }


// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         Random random = new Random();
//         Scanner scanner = new Scanner(System.in);
//         int number_to_guess = random.nextInt(10)+1;

//         int guess=-1;

//         while( guess != number_to_guess)
//         {
//             System.out.print("Enter a number:");
//             guess = scanner.nextInt();
//         } System.out.println("Your guess is correct");
//         System.out.println(number_to_guess);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int number=10;
//         int temp0 =0;
//         int temp1 = 1;
        
        
//         for(int i = 0 ;i < number-1 ;i++){
//             System.out.println( temp0 + " ");
//             int temp2 = temp0 +temp1;
//             temp0 = temp1;
//             temp1=temp2; 
//         }

//     }
// }


// class Main {

//      static int Fibonacci(int n){
//         if(n<=1) return n;



//     return Fibonacci(n-1)+Fibonacci(n-2);
//     }
//     public static void main(String[] args) {

//         int n =10;
//         for(int i = 0 ;i < n-1 ;i++){

//             System.out.print(Fibonacci(i)+ " ");
            
//     }
// }
// }


// class Main {
//     public static void main(String[] args) {
//         for( int i =0 ; i < 4; i++){
//             for( int j =0 ; j < 4; j++){
//              if( i >= j){
//                 System.out.print(j+1);
//              }
//             }
//             System.out.println();
//         }
//     }
// }


