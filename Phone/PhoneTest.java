public class PhoneTest {
    public static void main(String[] args){
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring");
        IPhone iphoneTen = new IPhone("X", 100,"AT&T","Zzzz zzz");

        s9.displayInfo();

        iphoneTen.displayInfo();
    }
}