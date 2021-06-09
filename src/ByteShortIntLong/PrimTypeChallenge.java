package ByteShortIntLong;

public class PrimTypeChallenge {

    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 50;

    public long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
    public short shortTotal =  (short)(1000 + 10 * (byteValue + shortValue + intValue));
}
