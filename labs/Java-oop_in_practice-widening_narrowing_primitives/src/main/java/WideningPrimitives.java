public class WideningPrimitives {

    private final byte smallNumber;

    public WideningPrimitives(byte smallNumber) {
    this.smallNumber = smallNumber;
  }

    public byte getSmallNumber() {
      return smallNumber;
    }

    public short toShort() {
        return Short.valueOf(this.smallNumber);
    }

    public int toInt() {
        return Integer.valueOf(this.smallNumber);
    }

    public long toLong() {
        return Long.valueOf(this.smallNumber);
    }

    public float toFloat() {
        return Float.valueOf(this.smallNumber);
    }

    public double toDouble() {
        return Double.valueOf(this.smallNumber);
    }
}
