package Ex_16_Generics;

public class Lab224 {

    public static void main(String[] args) {
        temp_sum(2.5,55.8);
        temp_sum(20,91);
        temp_sum_t(10,10);


    }
    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }
    static Double temp_sum (Double a, Double b){
        return a+b;
    }
    static <T> T temp_sum_t(T a, T b) {
        return null;
    }
    //    static <MODI> MODI temp_sum1(MODI a, MODI b){
//        return null;

}
