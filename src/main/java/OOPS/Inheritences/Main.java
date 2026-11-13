package OOPS.Inheritences;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(4.1);

//        System.out.println(b1.l + " " +b1.b+" "+b1.w);

        Box b2 = new Box(2,4,5.3);
        System.out.println(b2.l + " " +b2.b+" "+b2.w);

        BoxWeight b3 = new BoxWeight(2,3,5,6);

        System.out.println(b3.l +" "+b3.weight);


        Box b4 = new BoxWeight(1,33,5,45);
        System.out.println(b4.w);     // we can access parent class variables
   //   System.out.println(b4.weight);  // we can't  (X)
        //when parent class is refering to child class

    }
}
