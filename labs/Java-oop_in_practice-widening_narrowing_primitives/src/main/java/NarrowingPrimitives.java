public class NarrowingPrimitives {

  private final long bigNumber;

  public NarrowingPrimitives(long bigNumber) {
    this.bigNumber = bigNumber;
  }

  public long getBigNumber(){
    return this.bigNumber;
  }

  //simply return our number as a double
  public double toDouble(){
    return (double) this.bigNumber;
  }

  //divide our number by 1_000 and return it as a float
  public float toFloat(){
    return (float)  (this.bigNumber / 1_000);
  }

  //divide our number by 1_000_000 and return it as an int
  public int toInt(){
    return (int) (this.bigNumber / 1_000_000);
  }

  //divide our number by 1_000_000_000 and return it as a short
  public short toShort(){
    return (short) (this.bigNumber / 1_000_000_000);
  }

  //divide our number by 10_000_000_000L and return it as a byte
  public byte toByte(){
    return (byte) (this.bigNumber / 10_000_000_000L);
  }
}
