public class NarrowingPrimitives {

  private final long bigNumber;

  public NarrowingPrimitives(long bigNumber) {
    this.bigNumber = bigNumber;
  }

    // Return the number as a long (no narrowing needed)
    public long getBigNumber() {
      return bigNumber;
    }

    // Return the number as a double
    public double toDouble() {
      return (double) bigNumber;  // Narrowing: explicit cast to double
    }

    // Divide by 1_000 and return as a float
    public float toFloat() {
      return (float) (bigNumber / 1_000);  // Narrowing: cast to float after division
    }

    // Divide by 1_000_000 and return as an int
    public int toInt() {
      return (int) (bigNumber / 1_000_000);  // Narrowing: cast to int after division
    }

    // Divide by 1_000_000_000 and return as a short
    public short toShort() {
      return (short) (bigNumber / 1_000_000_000);  // Narrowing: cast to short after division
    }

    // Divide by 10_000_000_000L and return as a byte
    public byte toByte() {
      return (byte) (bigNumber / 10_000_000_000L);  // Narrowing: cast to byte after division
    }
}