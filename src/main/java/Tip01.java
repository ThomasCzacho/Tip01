public class Tip01 {
    public static void main(String[] args) {
        
       double person10,person20,person30,person40,person50,person60,person70,person80;
        int person1=10;
        int person2=12;
        int person3=9;
        int person4=8;
        int person5=7;
        int person6=15;
        int person7=11;
        int person8=30;
double tax=0.05,tip=0.15;
        person10=person1*tax+person1*tip+person1;
        person20=person2*tax+person2*tip+person2;
        person30=person3*tax+person3*tip+person3;
        person40=person4*tax+person4*tip+person4;
        person50=person5*tax+person5*tip+person5;
        person60=person6*tax+person6*tip+person6;
        person70=person7*tax+person7*tip+person7;
        person80=person8*tax+person8*tip+person8;

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        System.out.println("Person 1: $"+person10);
        System.out.println("Person 2: $"+person20);
        System.out.println("Person 3: $"+person30);
        System.out.println("Person 4: $"+person40);
        System.out.println("Person 5: $"+person50);
        System.out.println("Person 6: $"+person60);
        System.out.println("Person 7: $"+person70);
        System.out.println("Person 8: $"+person80);
    }
}

// money*tax+money*tip+money