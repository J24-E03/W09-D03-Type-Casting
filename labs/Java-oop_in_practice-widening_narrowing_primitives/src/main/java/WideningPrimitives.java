public class WideningPrimitives {

  private final byte smallNumber;

  public WideningPrimitives(byte smallNumber) {
    this.smallNumber = smallNumber;
  }

  //simply return our number as a byte
  public byte getSmallNumber(){
    return this.smallNumber;
  }

  //simply return our number as a short
  public short toShort(){
    return (short) this.smallNumber;
  }

  //simply return our number as an int
  public int toInt(){
    return (int) this.smallNumber;
  }

  //simply return our number as a long
  public long toLong(){
    return (long) this.smallNumber;
  }

  //simply return our number as a float
  public float toFloat(){
    return (float) this.smallNumber;
  }

  //simply return our number as a double
  public double toDouble(){
    return (double) this.smallNumber;
  }
}
