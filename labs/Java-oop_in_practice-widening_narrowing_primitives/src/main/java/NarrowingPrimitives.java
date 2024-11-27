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
        return (float) this.bigNumber/1_000;
    }

    public int toInt() {
        return (int) (this.bigNumber/1_000_000);
    }

    public short toShort() {
        return (short) (this.bigNumber/1_000_000_000);
    }

    public byte toByte() {
        return (byte) (this.bigNumber/10_000_000_000L);
    }
}
