import java.util.*;

public class javanew {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       /*  // Average of the numbers
        double sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        System.out.println("Average: " + (sum / n));

        // AREA OF SQUARE
        double side = sc.nextDouble();
        System.out.println("Area of square: " + (side * side));

        // cost of the bill
        double cost = sc.nextDouble();
        double tip = sc.nextDouble();
        System.out.println("Total cost: " + (cost + (cost * tip / 100)));

        // operators in java
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 1st - Binary done
        // 2nd uniary
        // pre incriment
        a = 10;
        b = ++a;
        System.out.println(b);
        System.out.println(a);
        // post incriment
        a = 10;
        b = a++;
        System.out.println(b);
        System.out.println(a);
        // pre decriment
        a = 10;
        b = --a;
        System.out.println(b);
        System.out.println(a);
        // RELATIONAL OPERATORS
        a = 10;
        b = 5;
        System.out.println("a <= b = " + (a <= b));
        // LOGICAL OPERATORS
        // logical and
        System.out.println("(3 < 2) && (5 > 0) = " + ((3 < 2) && (5 > 0)));
        //  System.out.println((3<
        //  2) || (5<0));
        // LOGICAL NOT
        System.out.println("!(1 > 2) = " + (!(1 > 2)));
        // ASSIIGNMENT OPERATORS
        a = 10;
        a = a * 5;
        System.out.println("a = " + a);

        // CONDITIONAL STATEMENTS
        a = 1;
        b = 5;
        if (a >= b) {
            System.out.println("A is largest of 2");
        } else {
            System.out.println("B is largest of 2");
        }

        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        int age = 13;
        if (age > 18) {
            System.out.println("adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }*/

       /*  int income = sc.nextInt();
        int tax;
        if (income == 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("your tav is : " + tax);*/    

     // BUILD A CALCULATOR


                                       /*    int C = 1, B = 2, A = 6;
                           

                                if ((A >=B ) && (A >=C) ){
                                  System.out.println("largest is A");

                                } else if(B >=C)   {
                                  System.out.println("largest is B");
                                }   

                                else {
                                  System.out.println("largest is C");

                                } */
// TERNARY OPERATER

                             //   int number = 4;
                         //   String type =  ((number %2 == 0 )) ? "EVEN" : "ODD";
                          //  System.out.println(type);
                          
                     //     int marks = 32;
                        //  String reportCard = marks >= 33  ? "PASS "  : "FAIL";
                             //  System.out.println(reportCard);
                                   
                           // SWITCH STATEMENT
                           //int number = 50;
/*switch (number) {
    case 52:
        System.out.println("samosha");
        break;
    case 25:
        System.out.println("momos");
        break;
    case 50:
        System.out.println("mango shake");
        break;
    default:
        System.out.println("we wake up");
}*/                                                           
                                           /*   System.out.println("enter a : ");
                                               int a = sc.nextInt();
                                               System.out.println("enter b : ");
                                               int b = sc.nextInt();
                                               System.out.println("enter operator : ");
                                               char operator = sc.next(). charAt(0);
                                           
                                               switch (operator) {
                                                case '+'  :
                                                    System.out.println(a+b);
                                                    break;
                                                 case '-'  :
                                                 System.out.println(a-b);
                                                 break;
                                                 case '*'  :
                                                 System.out.println(a*b);
                                                 break;
                                                 case '/'  :
                                                 System.out.println(a/b);
                                                 break;
                                                 case '%'  :
                                                 System.out.println(a%b);
                                                    break;
                                                    default :
                                                     System.out.println("invalid operator");
                                               }*/ 
                                               //QUESTION NO. 1

                                          // int number = sc.nextInt();
                                          // if ((number >= 0)) {
                                           // System.out.println("positive number ");
//} else {
                                         //   System.out.println("negative number ");
                                         //  }

                                                 //QUESTION NO. 2


                                            /*      double temp = 103.5;


                                                 if (temp > 100) {
                                                    System.out.println("you have fever");
                                                 } else {
                                                    System.out.println("you dont have fever");
                                                 }*/

                                                 // QUESTION NO. 3

                                             /*  System.out.println(" enter number of day : ");
                                                int week = sc.nextInt();
                                    
                                                   switch (week) {
                                                    case 1:
                                                    
                                                        System.out.println("Monday");
                                                        
                                                        break;

                                                        case 2:
                                                        
                                                        System.out.println("Tuesday");
                                                        
                                                        break;
                                                        
                                                        case 3:
                                                        
                                                        System.out.println("Wednesday");
                                                        
                                                        break;
                                                        
                                                        case 4:
                                                        
                                                        System.out.println("Thursday");
                                                        
                                                        break;
                                                        
                                                        case 5:
                                                        
                                                        System.out.println("Friday");
                                                        
                                                        break;
                                                        
                                                        case 6:
                                                        
                                                        System.out.println("Saturday");

                                                        break;
                                                        
                                                        case 7:
                                                        
                                                        System.out.println("Sunday");
                                                        
                                                        break;
                                                   
                                                    default:
                                                        
                                                        System.out.println("invalid day : enter number between (1-7) ");
                                                        
                                                    }*/
                                                   // QUESTION NO. 4
                                                                     
                                                 /*   System.out.println("Enter number of the year : ");
                                                   int year = sc.nextInt();
                                                   if ((year % 4 == 0) && (year % 100!= 0) || (year % 400 == 0)) {
                                                       System.out.println("Leap year");
                                                   } else {
                                                       System.out.println("Not a leap year");
                                                   } */


                                                   // live class of the chapter : variable and data type



                                            /*  int number = 10;
                                              System.out.println(number);
                                             System.out.println(number++);
                                             System.out.println(number);
                                             System.out.println(++number);*/
                                                   
                                            /*long C = 9999999999L;
                                            int  D = (int) C;
                                            
                                            System.out.println(D);
                                            
                                            System.out.println(C);*/
                                            // operator precedenvce
                                         //   / , *  same precedence 
                                         //  + , - same precedence

                                          /* 
                                          int x = 9 , y = 12;

                                           int a = 2 , b = 4 , c = 6;

                                           int exp = 4/3 * ( x + 34) + 9 * ( a + b * c) + ( 3 + y * ( 2 + a)) / ( a + b * y);

                                           System.out.println(exp);*/

                                           /*int  a = 10;
                                           int b = ++a;
                                           System.out.println(b);
                                           System.out.println(a);

                                           int c = 10;
                                           int d = ++c;
                                           System.out.println(d);
                                           System.out.println(c);*/
                                             
                                          //  CONCEPTS OF LOOPS IN JAVA 

                                          // 1 . WHILE LOOP


                                         /*  int counter = 0;

                                          while (counter < 10) {
                                             System.out.println(" hello world ");
                                             counter++;
                                          }
                                           
                                          System.out.println( " PRINTED HW 10X ");*/


                                          // PRINT NUMBERS FROOM 1 TO 10
                                            // int counter = 1;
                                            // while (counter <= 100) {
                                              //   System.out.println(counter);
                                                // counter++;
                                           //  }

                                           // PRINT NUMBERS FROOM 1 TO n

                                         /*   int range = sc.nextInt();
                                           int counter = 1;
                                           while (counter <= range) {
                                             System.out.println(counter + " ");
                                             counter++;
                                           }
                                           System.out.println();*/
                                           // PRINT SUM OF FIRST N NATURAL NUMBER
                                
                                            /*int n = sc.nextInt();
                                             int sum = 0;
                                             int i = 1;
                                             while (i <= n) {
                                               sum += i;
                                               i++;
                                             }
                                             System.out.println(sum);*/


                                             // FOR LOOOP IN JAVA

                                            // for (int i = 1; i <= 10; i++) {
                                                     //  System.out.println(" HELLO WORLD");
      
                                           //PRINT SQUARE PATTERN
                                        //  for (int line = 1; line <= 4; line++) {
                                           // System.out.println( "* * * * ");
                                        //  }

                                        // PRINT REVERSE OF A  NUMBER
                                         //int n = 10899;
                                           
                                        /* while (n > 0) {
                                            int lastdigit = n % 10;
                                             System.out.print(lastdigit + " ");
                                             n = n / 10; // n/= 10
                                         }
                                             System.out.println();*/

                                             //  DO-WHILE LOOP
                                             // PRONT HELLO WORLD 10X

                                               //int counter = 1;
                                              // do { 
                                              //  System.out.println(" HELLO WORLD ");
                                                //counter++;
                                             //  } while (counter <= 10);
                                            //   System.out.println();

                                            // BREAK STATEMENTS
                                         /*for ( int i = 1; i <= 5; i++ ) {
                                                
                                                 if (i == 3) {
                                                    break;
                                                 }
                                                    System.out.println(i);
                                          }
                                                  System.out.println(" I AM OUT OF THE LOOP");*/
                                                  // keep entering numbers till user enters A MULTIPLE OF 10
                                                 


                                                /*   do {
                                                       System.out.println("Enter your number: ");
                                                          int n = sc.nextInt();

                                                          if( n % 10 == 0)  {
                                                               break;
                                                 }
                                                          System.out.println(n);

                                                   } while (true); */
                                                      //  continue STATEMENTS

                                                     /* for (int i = 1; i <= 5 ; i++) {
                                                        
                                                         if (i == 3) {
                                                            continue;
                                                         }
                                                        System.out.println(i);*/
                                                         /*   do {
                                                            System.out.println("Enter your number: ");
                                                            int n = sc.nextInt();
                                                           
                                                            if( n % 10 == 0)  {
                                                               continue;
                                                            }
                                                           
                                                            System.out.println("number was : " + n);
                                                           } while (true);*/

                                                            // CHECK IOF A NUMBER IS PRIME OR NOT   
                                                               /*  int n = sc.nextInt();

                                                            if ( n == 2) {
                                                                System.out.println(  "n is a prime number");
                                                             }
                                                             else {
                                        
                                                                 boolean isPrime = true;
                                                                 for ( int i = 2; i <=Math.sqrt(n); i++ ) {
                                                                 if ( n % i == 0) {
                                                                     isPrime = false;  // ( where n is the multiple of i ( i is not equal to 1 or n) )
                                                                     
                                                                }
                                                            } 

                                                              if ( isPrime == true ) {
                                                                 System.out.println(n + " is a prime number");
                                                              } else {
                                                                 System.out.println(n + " is not a prime number");
                                                              }

                                                             }*/
                                                            


                                                             // PRINT STAR PATTERN

//                                                              for ( int l = 1; l<= 4; l++) {
// // one line
//                                                                  for( int st = 1; st <= l; st++){
//                                                                     System.out.print("* ");
//                                                                  }
//                                                                  System.out.println(

                                                                // );
                                                            // } 
                                                    // for 1 line
//                                                             int line = 1;  
                                                   
//                                                             while(line<=4){

//                                                                 // print star
//                                                                 for(int st = 1; st <= line; st++){
//                                                                     System.out.print("* ");
// // print spaces
                                                              
                                                            
//                                                              }
//                                                                line++;
//                                                                System.out.println();
//                                                             } 
                                                        // PRINT INVERTED SATAR PATTERN 
                                                        // FOR ONE LINE  
                                                        // int n = 5;
                                                        // int line = 1;
                                                        // while(line <= n){
                                                        // for (int st = 1; st<=(n-line+1); st++){ 
                                                        //     System.out.print("* ");
                                                        // }
                                                        //     line++;
                                                        //        System.out.println();
                                        
                                                        // }
                                                         //    PRINT HALF-PYRAMID PATTERN
                                                         
                                                    //     int n = 4;
                                                    //     for (int line = 1; line <=n; line++){
                                                    // // NUMBERS PRINT
                                                    // for(int number = 1; number<= line; number++){
                                                    //        System.out.print(number);
                                                    //     }
                                                        
                                                    //     System.out.println();
                                                    // }
                                                    // PRINT CHARACTER PATTERN
                                                    // int n = 4;
                                                    // char ch = 'A';
                                                    // // OUTER LOOP
                                                    // for(int line = 1; line <= n; line++){
                                                    //     // INNER LOOP
                                                    //     for(int chars = 1; chars <=line; chars++){

                                                    //         System.out.print(ch);
                                                    //          ch++;
                                                    //     }
                                                    //         System.out.println();
                                                    // }
      //  int n = sc.nextInt();
       
      //  int st = 1;
      //  int sp = n-1;
      //  for(int number_of_line = 1; number_of_line <= n; number_of_line++){
      //         // print spaces
      //         for(int i = 0; i<=sp ; i++) {
      //            System.out.print("  ");
      //         }
      //         // print stars
      //         for( int i = 0; i <= st; i++) {
      //           System.err.print("* ");
      //         }

            
      //         // next line 
      //         if(number_of_line<n) {
      //            st = st + 2;
      //            sp--;
      //         } else {
      //           st = st - 2;
      //           sp++;
      //         }
      //              System.out.println();
    
      //  }






























      























                                                             


                                                            



























                                                
                                                   


                                                         


                                                
                                            
                                            
                                                
                                             


























































                                        

                                             
                                              


































                                        
                                        
                                
                                             
                                            
                                            


























































































                                                  
                                           
















































































































































































































































































    }
}