public class NarrowingPrimitives {

    private final long bigNumber;

    public NarrowingPrimitives(long bigNumber) {
    this.bigNumber = bigNumber;
  }

    public long getBigNumber() {
        return Long.valueOf(this.bigNumber);
    }

    public double toDouble() {
        return Double.valueOf(this.bigNumber);
    }

    public float toFloat() {
        return Float.valueOf(this.bigNumber/1_000);
    }

    public int toInt() {
        return Integer.valueOf((int) (this.bigNumber/1_000_000));
    }

    public short toShort() {
        return Short.valueOf((short) (this.bigNumber/1_000_000_000));
    }

    public byte toByte() {
        return Byte.valueOf((byte) (this.bigNumber/10_000_000_000L));
    }
}
