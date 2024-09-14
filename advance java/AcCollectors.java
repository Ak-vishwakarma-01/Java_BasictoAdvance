// import java.util.*;
// import java.util.stream.*;

// class AcCollectors {
//     public static void main(String... rk) {
//         ArrayList<Employee> al = new ArrayList<>();
//         al.add(new Employee("Ravi Kant Sahu", 'M', "LPU"));
//         al.add(new Employee("Suraj Singh", 'M', "JP Morgan"));
//         al.add(new Employee("Abhishek", 'M', "Amazon"));
//         al.add(new Employee("Ankita", 'F', "Amazon"));
//         al.add(new Employee("Kulwinder", 'F', "LPU"));


//         Map<Boolean, List<Employee>> partitionedMap = al.stream().collect(Collectors.partitioningBy(e -> e.gender == 'M'));

// System.out.println("-------------------------------------------");

// 	  List<Employee> femaleEmployees = partitionedMap.get(false);
//         for (Employee e : femaleEmployees)
//             System.out.println(e.name + "\t" + e.gender + "\t" + e.company);

// System.out.println("-------------------------------------------");

//         List<Employee> maleEmployees = partitionedMap.get(true);
//         for (Employee e : maleEmployees)
//             System.out.println(e.name + "\t" + e.gender + "\t" + e.company);


      
//     }
// }

// class Employee {
//     String name, company;
//     char gender;

//     Employee(String name, char gen, String comp) {
//         this.name = name;
//         gender = gen;
//         company = comp;
//     }
// }











import java.util.*;
import java.util.stream.*;


// In this code you need to change the class name after compiling this java file otherwise it will give older class output 
// PS C:\All codes\java code\advanced java> javac AcCollectors.java
// PS C:\All codes\java code\advanced java> java CollectorDemo

class AcCollectors {
    static public void main(String... rk) {
        ArrayList<Mobile> al = new ArrayList<>();
        al.add(new Mobile("Redme 8", 8, "Android"));
        al.add(new Mobile("Nokia N2", 16, "Windows"));
        al.add(new Mobile("Realme 5i", 8, "Android"));
        al.add(new Mobile("I Phone 14", 8, "ios"));
        al.add(new Mobile("I Phone 13", 4, "ios"));

        Map <Boolean, List<Mobile>> mp= al.stream().sorted((m1, m2) ->m2.ram.compareTo(m1.ram)).collect(Collectors.partitioningBy(a -> a.OS.equals("Android")));
        
        List<Mobile> l = mp.get(false);
        for (Mobile m : l)
        System.out.println(m.model + "\t" + m.ram + "\t" + m.OS);
        
        System.out.println("--------------------After partitioning By-----------------------------------");

        // Print all the non-android mobiles
        Map<Integer, List<Mobile>> mp1 = al.stream().sorted((m1, m2) -> m2.ram.compareTo(m1.ram)).collect(Collectors.groupingBy(x -> x.ram));
        List<Mobile> l2 = mp1.get(8);
        for (Mobile m : l2)
        System.out.println(m.model + "\t" + m.ram + "\t" + m.OS);

    }
}

class Mobile {
    Integer ram;
    String OS, model;

    Mobile(String mod, int ram, String os) {
        model = mod;
        this.ram = ram;
        OS = os;
    }
}


