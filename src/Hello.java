import ByteShortIntLong.Numbers;
import ByteShortIntLong.PrimTypeChallenge;
import FloatsDoubles.FloatsDoubles;
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Neel");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber *2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("myFirstNumber: " + myFirstNumber);
        System.out.println("myTotal: " + myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println("myLastOne: " + myLastOne);
        Numbers obj = new Numbers();
        PrimTypeChallenge obj1 = new PrimTypeChallenge();

        System.out.println("32 bit Integer Minimum Value: " + obj.myMinIntValue);
        System.out.println("32 bit Integer Maximum Value: " + obj.myMaxIntValue);
        System.out.println("Overflow MAX value + 1: " + (obj.myMaxIntValue + 1));
        System.out.println("Underflow MIN value - 1: " + (obj.myMinIntValue -1 ));
        System.out.println("8 bit Byte Maximum Value: " + obj.myMaxByteValue);
        System.out.println("8 bit Byte Minimum Value: " + obj.myMinByteValue);
        System.out.println("16 bit Short Maximum Value: " + obj.myMaxShortValue);
        System.out.println("16 bit Short Minimum Value: " + obj.myMinShortValue);
        System.out.println("64 bit Long Maximum Value: " + obj.myMaxLongValue);
        System.out.println("64 bit Long Minimum Value: " + obj.myMinLongValue);
        System.out.println("Casting an 8 bit Byte: " + obj.myNewByteValue);
        System.out.println("Casting a 16 bit Short Minimum Value" + obj.myNewShortValue);
        System.out.println("Long Total: " + obj1.longTotal);
        System.out.println(("Short Total: " + obj1.shortTotal));

    }
}
