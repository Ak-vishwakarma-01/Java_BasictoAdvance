
/*
EMUM = it is a keyword id shoulf be the first statement
1-to ensure type safty
2-when we want to create a collection of fix concept or fix set of object
3-object can not created outside of the enum
4-compiler will provide a defaluet constructor if the is no any constructor
5-and every constructor is private by default 
6-constructor can not be public and protected in enum 
7-method can be pulic private protected 
*/

import javax.lang.model.util.ElementScanner14;

//Every java class by default inherits the object class
//enum cannot inherit any other class but it can inherit the interfaces
// interface A{}
// interface B{}
// enum Doctors implements A,B 


enum Doctors 
{
    // first method is predefind object of the enum
   Dr_Batra("Hair"), Dr_Sharma("Ent",200),Dr_Pankaj_Kumar,Dr_Ravi_kumar("Orthopadic",50); // it always represent predefind object
   //values() is a static method which returns all the enum constants in the form of an array
   //attributes= properites of objects
   String specialization;
   int fee;
   Doctors(){} //if we want to delete this no argumented const then we have to give argument in all the objects on behalf of the argumented constructors
   Doctors(String spc){specialization = spc;}
   Doctors(String spc , int fee)
   {
       specialization =spc;
       this.fee = fee;
   }
   void getAppointment()
   {
       System.out.println("Appointment booked with"+this); //this holds the reference of the current object
   }
}
//Doctors doc = Doctors.Dr_Batra; we can also assign like this

public class Av_enum1 {
    public static void main(String [] ak){
        Doctors [] d = Doctors.values(); //Doctors.valuees() will return an array type that's why we are puttinhg it into an array
        // here we are not creating an arrya we are just making reference variable
   
        for(Doctors p: Doctors.values()) // we can also print like this 
        {
            // System.out.println("\n"+p);
        
            p.getAppointment(); //here this will print reference of the corrnet object and d is holding refernce of the current object
            

            if(p.specialization.equals("Ent")&&p.fee<250)
            {
                p.getAppointment();
                break;
            }
            else if(p.specialization.equals("Ent")&&p.fee>250)
            {
                System.out.println("Fee is High");
                break;
            }else 
            {
                System.out.println("No Doctors availa");
                break;
            }
        }
    }
}
//java.lang.Enum it is a predefined class

