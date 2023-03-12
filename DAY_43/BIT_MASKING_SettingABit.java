package DataStructuresAlgorithm.DAY_43;

public class BIT_MASKING_SettingABit {
    public static void main(String[] args) {
        int n=5; //0101
        int pos = 3;
        int bitMask = 1<<pos;
        int setNo = (bitMask | n);
        System.out.println(setNo);
    }
}
