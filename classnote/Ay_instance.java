

class Politician 
{

}

class MLA extends Politician
{

}

class CM extends MLA
{

}

class Ay_instance
{
    void chiefGuest(Politician P) // we can only pass the object of politican mla or cm not from another class
    {
        //here we have passed the object of pollitician but how can we find that is it a politician or mla or cm for that purpose we use instance of operator
        // if(P instanceof MLA) // if p holds the objects of MLA of it's subclass then it's give true otherwise false
        if(P instanceof CM) System.out.println("Welcom CM");
        else if(P instanceof MLA) System.out.println("Welcome MLA");
        else System.out.println("Welcome neta ji");
    }  
    
    Ay_instance pt = new Ay_instance();
    // CM ob = new CM();
    MLA ob = new MLA();  //NOW IT WILL RETURN FALSE for(instanceof CM) bcos mla is not subclass of cm
    pt.chiefGuest(ob);
}




/*
ref instance of CLASS
if the reference varable holding the address of the CLASS

A <-----D <-----E
^                  
|               
B                    
^                 
|               A ob = new C();
C               A ob4 = new E(); ob4 is a reference of A
                B ob2 = new C();
                B ob3 = new d(); this is wrong

if ob4(instance of E) Syout("E");
else if( ob4 instanceof D) syout("D");
else if( ob4 instanceof C) syout("C");
else if( ob4 instanceof B) syout("B");
else syout("A");

Inctance operators just check whether this reference variable holds the address of this class or subclass of this class 
*/

