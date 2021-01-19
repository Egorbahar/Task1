package eu.senla.task1;

public class Main {
   static byte a;
   static Byte aByte;
   static short b;
   static Short aShort;
   static int c;
   static Integer aInt;
   static long d;
   static Long aLong;
   static char e;
   static Character character;
   static float f;
   static Float aFloat;
   static double g;
   static Double aDouble;
   static boolean bool;
   static Boolean aBoolean;
    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.setA((byte) 15);
        System.out.println(variables.getA());
        variables.setaBoolean(true);
        System.out.println(variables.getaBoolean());
        variables.setC(1500);
        System.out.println(variables.getC());
        variables.setaLong(1000000000000000000l);
        System.out.println(variables.getaLong());
        variables.setE('W');
        char buf = variables.getE();
        System.out.println(buf);
        System.out.println(variables.getE());
        variables.setaInt(variables.getC());
        System.out.println(variables.getaInt());
        variables.setCharacter(variables.getE());
        System.out.println(variables.getCharacter());
        variables.setG(21345.545454);
        System.out.println(variables.getG());
        String buf1 = "Hello";
        String buf2 = "Bye";
        String string = buf1+" "+buf2;
        System.out.println(string);
        byte local_byte = 23;
        Byte local_Byte = 11;
        short local_short = 1;
        Short local_Short = 10011;
        int local_int1 = 100;
        int local_int2 = 200;
        Integer local_Int = local_int1;
        Integer second = 0;
        long d = 10000005555l;
        Long aLong = new Long(1000000000);
        char e = 'Y';
        Character character = new Character('N');
        float f = 3.14f;
        Float aFloat = f;
        second = (int) (local_int1);
        double g = -1234456666.666666666d;
        Double aDouble = 13434434.656565;
        //incompatible types float buf_float = g;
        boolean b = true;
        Boolean aBoolean = false;
        System.out.println(local_byte);
        System.out.println(local_Byte);
        System.out.println("Первоначальное значение было 0//Результат приведения :" + second);
        System.out.println(local_short);
        System.out.println(local_Short);
        System.out.println(local_int1);
        System.out.println(local_int2);
        System.out.println(local_Int);
        System.out.println(d);
        System.out.println(aLong);
        System.out.println(e == character);
        System.out.println(e != character);
        System.out.println(f == aFloat);
        System.out.println(g > aDouble);
        if (b != false) {
            System.out.println(b + "+" + aBoolean);
        }


    }
}
