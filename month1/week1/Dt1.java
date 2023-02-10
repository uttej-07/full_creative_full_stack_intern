    class Dt1 {
 
    public static void main(String args[])
    {
        char a = 'U';

        int i = 89;
 
        // use byte and short
        // if memory is a constraint
        byte b = 4;
 
        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
 
        short s = 56;
 
        // this will give error as number is
        // larger than short range
        // short s1 =989898989;
 
        double d = 4.355453532;

        float f = 4.7333434f;
      
          long l = 121212121;
            
          System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
          System.out.println("long: " + l);
    }
}