public class NarrowingPrimitives {

  private final long bigNumber;

  public NarrowingPrimitives(long bigNumber) {
    this.bigNumber = bigNumber;
  }
  ///simply return our number as a long
  public long getBigNumber(){
    return (long) bigNumber;
  }

  //simply return our number as a double
  public double toDouble(){
    return (double) bigNumber;
  }

  //divide our number by 1_000 and return it as a float
  public float toFloat(){
    return (float) bigNumber;
  }

  //divide our number by 1_000_000 and return it as an int
  public int toInt(){
    return (int) bigNumber;
  }

  //divide our number by 1_000_000_000 and return it as a short
  public short toShort(){
    return (short) bigNumber;
  }

  //divide our number by 10_000_000_000L and return it as a byte
  public byte toByte(){
    return (byte) bigNumber;
  }

}
