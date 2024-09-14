
import java.util.*;
public class Am_array2d {
      public static void main(String[] ankit){
        int arr[][] = {{2,3,3,3,4,3,4},{33,5,7,4,4,3,76,4},{34,3},{2,3,3,3,4,3,4},{33,5,7,4,4,3,76,4},{34,3}};
        System.out.println("Number of rows of this 2d array : "+arr.length+"\nNumber of colums of 4th array : "+arr[3].length);
        
        /*
WAP which prompts the user to enter the number of subjects and for every
subject, the number Academic Tasks [different number of academic tasks
can be there for subjects.]
Read the marks of every CA of all the subjects and store then in a 2-D Array.

implement a method
char[] findGrades (double [][] arr)
which returns the grades of all the subjects based on following grading
criteria:
% marks >= 90 A
% marks >= 80 B
% marks >= 70 C
% marks >= 60 D
% marks < 60 F
        */
       Scanner sc = new Scanner(System.in); //System.in is used to take input from the console
       System.out.print("\nEnter the number of Subjects: ");
       int sub = sc.nextInt();  // it will read a integer value
       double [][] marks = new double [sub][]; // when we take float then it will automatically convert it into double then we need to do typecast
       
       String [] sub_name = new String[sub];

       for(int i = 0 ;i < sub; i++)
        {  
           System.out.print("\nEnter the name of the subject "+(i+1)+" :");
        //    sc.nextLine(); if we don't use nextLine and directly input from nextLine() then it will skip the user input that's why we have only written next().
           String x = sc.next();
           sub_name[i] = x;

           System.out.print("\n\tSUBJECT :"+(i+1)+" "+sub_name[i]+" How many CAs? : ");
           int ca = sc.nextInt();
           marks[i] = new double[ca];
           
           //Reading the marks of CAs
           for(int j=0; j<ca; j++)
            {
               System.out.print("\nEnter the Marks of CA"+(j+1)+" :");
               marks[i][j] = sc.nextDouble();       
            }
        }
        
        //calling print marks
        Am_array2d obj = new Am_array2d(); // bcos it is non static and main function is static that's why we are making obj reference of the class
        // obj.printMarks(marks, sub_name);
        obj.per_grade(marks,sub_name);
    }  
    void printMarks(double [][] arr, String [] subject)
    { 
        System.out.println("\n\t***Result Term [21222]***");
        for(int i =0;i<arr.length;i++)
        {   
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
                
            }
            System.out.println();
        }
    }
    void per_grade(double [][] ak_vish , String [] sub)
    {
        double per = 0;      // if we will just write double per; then it will show erro if we use this without enitializing any value

        for(int i =0;i<ak_vish.length;i++)
        {   
            System.out.print("\nthe percentage and grade of the subject :"+sub[i]);
            for(int j = 0;j<ak_vish[i].length;j++)
            {
                per += ak_vish[i][j];  
            }

            per =(per/(100*(ak_vish[i].length)))*100 ;
            System.out.print(" is :"+per+" :");
            grade(per);         // bcos we calling non-static to non-static so i don't need any type of object
            
            per = 0;
            System.out.println();
        }
    }
    void grade(double prcntg)
    {
        if(prcntg>90){
            System.out.print("Grade :O");
        }else if(prcntg>80 && prcntg<=90){
            System.out.print("Grade :A+");
        }else if(prcntg>70 && prcntg<=80){
            System.out.print("Grade :A");
        }else if(prcntg>60 && prcntg<=70){
            System.out.print("Grade :B+");
        }else if(prcntg>50 && prcntg<=60){
            System.out.print("Grade :B");
        }else if(prcntg>40 && prcntg<=50){
            System.out.print("Grade :A");
        }else if(prcntg<33){
            System.out.print("Reapear:");
        }else{
            System.out.print("Improvement:");
        }
    }
}
/*

*/
