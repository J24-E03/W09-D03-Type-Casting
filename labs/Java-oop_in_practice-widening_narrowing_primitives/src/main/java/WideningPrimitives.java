public class WideningPrimitives {

  private final byte smallNumber;

  public WideningPrimitives(byte smallNumber) {
    this.smallNumber = smallNumber;
  }

    // Return the number as a byte (smaller size)
     public byte getSmallNumber() {
       return smallNumber;  // Widening: smallNumber fits into byte implicitly
     }

    // Return the number as a short
    public short toShort() {
      return smallNumber;  // No change, it’s already short
    }

    // Return the number as an int
    public int toInt() {
      return smallNumber;  // Widening: short fits into int implicitly
    }

    // Return the number as a long
    public long toLong() {
      return smallNumber;  // Widening: short fits into long implicitly
    }

    // Return the number as a float
    public float toFloat() {
      return smallNumber;  // Widening: short fits into float implicitly
    }

    // Return the number as a double
    public double toDouble() {
      return smallNumber;  // Widening: short fits into double implicitly
    }
}

