public class NarrowingPrimitives {


    public static void main(String[] args) {
        double a = Math.PI;
        float b = (float) a;
        long c = (long) a;
        int d = (int) a;
        short e = (short) a;
        byte f = (byte) a;
        System.out.println(a + " is of double datatype");
        System.out.println(b + " is of float datatype");
        System.out.println(c + " is of long datatype");
        System.out.println(d + " is of int datatype");
        System.out.println(e + " is of short datatype");
        System.out.println(f + " is of byte datatype");
    }

  private final long bigNumber;

  public NarrowingPrimitives(long bigNumber) {
    double y = Double.MIN_VALUE;
    System.out.println("As Double: " + y);

    float f = (float)y;
    System.out.println("As Float: " + f);

    long l = (long)f;
    System.out.println("As Long: " + l);

    int x = (int)l;
    System.out.println("As Int: " + x);

    short s = (short)x;
    System.out.println("As Short: " + s);

    byte b = (byte)s;
    System.out.println("As Byte: " + b);
      this.bigNumber = 600_000_000_000L;

  }
}
