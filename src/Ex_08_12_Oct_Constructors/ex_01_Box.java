package Ex_08_12_Oct_Constructors;

public class ex_01_Box {

    double width,height,depth;

    ex_01_Box()
    {
        width=0;
        height=0;
        depth=0;
//        width=height=depth=0;
    }
    ex_01_Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    ex_01_Box (double l)
    {
        width=height=depth=l;
    }
    double volume ()
    {
      return (width*height*depth);
    }
}
