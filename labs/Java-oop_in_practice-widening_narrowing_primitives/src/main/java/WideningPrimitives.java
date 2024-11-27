public class WideningPrimitives {

    private final byte smallNumber;

  public WideningPrimitives( byte smallNumber){
      this.smallNumber = smallNumber;
    }
  //simply return our number as a byte
  public byte getSmallNumber(){
    return (byte) smallNumber;
  }
    //simply return our number as a short
    public short toShort () {

    return (short) smallNumber;
    }
    //simply return our number as an int
    public int toInt () {

    return (int) smallNumber;
    }
    //simply return our number as a long
    public long toLong () {

    return (long) smallNumber;
    }
    //simply return our number as a float
    public float toFloat () {
      return (float) smallNumber;
    }
    //simply return our number as a double
    public double toDouble () {

    return (double) smallNumber;
    }
  }

