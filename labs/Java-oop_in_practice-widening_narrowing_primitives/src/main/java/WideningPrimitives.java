public class WideningPrimitives {

  public static void main(String[] args) {
    byte a = 64;
    short b = a;
    int c = a;
    long d = a;
    float e = a;
    double f = a;
    System.out.println(a + " is of byte datatype");
    System.out.println(b + " is of short datatype");
    System.out.println(c + " is of int datatype");
    System.out.println(d + " is of long datatype");
    System.out.println(e + " is of float datatype");
    System.out.println(f + " is of double datatype");
  }

  private final byte smallNumber;

  public WideningPrimitives(byte smallNumber) {
    double y = Double.MIN_VALUE;
    System.out.println("As Double: " + y);

    float f = (float) y;
    System.out.println("As Float: " + f);

    long l = (long) f;
    System.out.println("As Long: " + l);

    int x = (int) l;
    System.out.println("As Int: " + x);

    short s = (short) x;
    System.out.println("As Short: " + s);

    byte b = (byte) s;
    System.out.println("As Byte: " + b);
    this.smallNumber = 64;

  }
}
