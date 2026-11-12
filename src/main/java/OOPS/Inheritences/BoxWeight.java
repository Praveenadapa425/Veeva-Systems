package OOPS.Inheritences;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight =0;
    }
    BoxWeight(double l,double b,double w,double weight){
        super(l,b,w);  //it is accessing the parent constructor
        //it is also example of constructor chaining

        this.weight = weight;
    }


}
