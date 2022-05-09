package PrimitiveTypes1;

public class Q1 {

    //https://stackoverflow.com/questions/3170412/why-is-132-1
    //https://stackoverflow.com/questions/20805547/what-does-greater-than-3-times-in-java-do-exactly
    //https://programmerbay.com/difference-between-right-shift-and-unsigned-right-shift-or-zero-filled-right-shift/
    public static int countBits(int n){
        int count =0;
        while(n>0){
            count += (n & 1);

            //The left operands value is moved right by the number of bits specified
            // by the right operand and shifted values are filled up with zeros.
            n >>>=1;
        }
        return count;
    }
}
