package OOPS.Inheritences;

public class Box {
    double l;
    double w;
    double b;
    Box(){
        this.l = 0;
        this.b  = 0;
        this.w = 0;
    }

    Box(double l){     // if the box is square
        this.l = l;
        this.b = l;
        this.w = w;
    }

    Box(double l , double b,double w){
        this.l = l;
        this.b = b;
        this.w = w;
    }


    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.w = old.w;
    }
}
