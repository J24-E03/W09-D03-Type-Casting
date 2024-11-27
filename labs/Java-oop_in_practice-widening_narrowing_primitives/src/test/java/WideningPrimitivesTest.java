import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WideningPrimitivesTest {

  private byte smallNumber;
  private WideningPrimitives wideningPrimitives;

  @BeforeEach
  public void setUp() {
    smallNumber = 64;
    wideningPrimitives = new WideningPrimitives(smallNumber);
  }

  @Test
  public void givenAByte_whenAskingForByte_thenReturn() {
    Byte expected = Byte.valueOf(smallNumber);
    byte result = wideningPrimitives.getSmallNumber();
    System.out.println(
        "Expected "
            + Colors.ANSI_PURPLE
            + "BYTE "
            + Colors.ANSI_RESET
            + "value: "
            + Colors.ANSI_GREEN
            + expected
            + Colors.ANSI_RESET
            + ", got: "
            + Colors.ANSI_GREEN
            + result
            + Colors.ANSI_RESET
            + ".");
    assertEquals(expected, result);
  }

  @Test
  public void givenAByte_whenAskingForShort_thenReturn() {
    Short expected = Short.valueOf(smallNumber);
    short result = wideningPrimitives.toShort();
    System.out.println(
        "Expected "
            + Colors.ANSI_PURPLE
            + "SHORT "
            + Colors.ANSI_RESET
            + "value: "
            + Colors.ANSI_GREEN
            + expected
            + Colors.ANSI_RESET
            + ", got: "
            + Colors.ANSI_GREEN
            + result
            + Colors.ANSI_RESET
            + ".");
    assertEquals(expected, result);
  }

  @Test
  public void givenAByte_whenAskingForInt_thenReturn() {
    Integer expected = Integer.valueOf(smallNumber);
    int result = wideningPrimitives.toInt();
    System.out.println(
        "Expected "
            + Colors.ANSI_PURPLE
            + "INT "
            + Colors.ANSI_RESET
            + "value: "
            + Colors.ANSI_GREEN
            + expected
            + Colors.ANSI_RESET
            + ", got: "
            + Colors.ANSI_GREEN
            + result
            + Colors.ANSI_RESET
            + ".");
    assertEquals(expected, result);
  }

  @Test
  public void givenAByte_whenAskingForLong_thenReturn() {
    Long expected = Long.valueOf(smallNumber);
    long result = wideningPrimitives.toLong();
    System.out.println(
        "Expected "
            + Colors.ANSI_PURPLE
            + "LONG "
            + Colors.ANSI_RESET
            + "value: "
            + Colors.ANSI_GREEN
            + expected
            + Colors.ANSI_RESET
            + ", got: "
            + Colors.ANSI_GREEN
            + result
            + Colors.ANSI_RESET
            + ".");
    assertEquals(expected, result);
  }

  @Test
  public void givenAByte_whenAskingForFloat_thenReturn() {
    Float expected = Float.valueOf(smallNumber);
    float result = wideningPrimitives.toFloat();
    System.out.println(
        "Expected "
            + Colors.ANSI_PURPLE
            + "FLOAT "
            + Colors.ANSI_RESET
            + "value: "
            + Colors.ANSI_GREEN
            + expected
            + Colors.ANSI_RESET
            + ", got: "
            + Colors.ANSI_GREEN
            + result
            + Colors.ANSI_RESET
            + ".");
    assertEquals(expected, result);
  }

  @Test
  public void givenAByte_whenAskingForDouble_thenReturn() {
    Double expected = Double.valueOf(smallNumber);
    double result = wideningPrimitives.toDouble();
    System.out.println(
        "Expected "
            + Colors.ANSI_PURPLE
            + "DOUBLE "
            + Colors.ANSI_RESET
            + "value: "
            + Colors.ANSI_GREEN
            + expected
            + Colors.ANSI_RESET
            + ", got: "
            + Colors.ANSI_GREEN
            + result
            + Colors.ANSI_RESET
            + ".");
    assertEquals(expected, result);
  }

  @Test
  public void givenADifferentByte_whenWidening_thenWideIt() {
    wideningPrimitives = new WideningPrimitives((byte) 30);
    assertEquals((byte) 30, wideningPrimitives.getSmallNumber());
    assertEquals((short) 30, wideningPrimitives.toShort());
    assertEquals(30, wideningPrimitives.toInt());
    assertEquals(30, wideningPrimitives.toLong());
    assertEquals(30, wideningPrimitives.toFloat());
    assertEquals(30, wideningPrimitives.toDouble());
  }
}
