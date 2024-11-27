import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NarrowingPrimitivesTest {

  private Long bigNumber;
  private NarrowingPrimitives narrowingPrimitives;

  @BeforeEach
  public void setUp() {
    bigNumber = 600_000_000_000L;
    narrowingPrimitives = new NarrowingPrimitives(bigNumber);
  }

  @Test
  public void givenALong_whenAskingForLong_thenReturn() {
    Long expected = bigNumber.longValue();
    long result = narrowingPrimitives.getBigNumber();
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
  public void givenALong_whenAskingForDouble_thenReturn() {
    Double expected = bigNumber.doubleValue();
    double result = narrowingPrimitives.toDouble();

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
  public void givenALong_whenAskingForFloat_thenReturn() {
    Float expected = 600_000_000f;
    float result = narrowingPrimitives.toFloat();

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
  public void givenALong_whenAskingForInt_thenReturn() {
    Integer expected = 600000;
    int result = narrowingPrimitives.toInt();

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
  public void givenALong_whenAskingForShort_thenReturn() {
    Short expected = 600;
    short result = narrowingPrimitives.toShort();

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
  public void givenALong_whenAskingForByte_thenReturn() {
    Byte expected = 60;
    byte result = narrowingPrimitives.toByte();

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
  public void givenADifferentLong_whenNarrowing_thenNarrowIt() {
    Long bigNumber = 700_000_000_000L;
    narrowingPrimitives = new NarrowingPrimitives(bigNumber);
    assertEquals(bigNumber, narrowingPrimitives.getBigNumber());
    assertEquals(bigNumber.doubleValue(), narrowingPrimitives.toDouble());
    assertEquals(bigNumber / 1_000, narrowingPrimitives.toFloat());
    assertEquals(bigNumber / 1_000_000, narrowingPrimitives.toInt());
    assertEquals(bigNumber / 1_000_000_000, narrowingPrimitives.toShort());
    assertEquals(bigNumber / 10_000_000_000L, narrowingPrimitives.toByte());
  }
}
