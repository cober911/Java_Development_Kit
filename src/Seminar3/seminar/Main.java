package Homeworks.ls3;

public class Main {
    public static void main(String[] args) {
//        String t = "GB";
//        DataInputStream v = new DataInputStream(System.in);
//        Integer k = 5;
//        MegaClass<String, DataInputStream, Integer> megaObject = new MegaClass<>(t, v, k);
//        megaObject.printTypes();

        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 248546165478L;
        MyList<Number> myList = new MyList<>(numArray);
        myList.printList();
        System.out.println(myList.getArrayLength());
//
//        Integer num = 5;
//        myList.addElement(num);
//        myList.printList();
//        System.out.println(myList.getArrayLength());
//
//        myList.removeElement(2);
//        myList.printList();
//        System.out.println(myList.getArrayLength());

        System.out.println(Calculator.sum(2, 4.5));
        System.out.println(Calculator.multi(7 , 3.1f));
        Pair<String, Integer> pair = new Pair<>("Hello, Worl", 1100100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
