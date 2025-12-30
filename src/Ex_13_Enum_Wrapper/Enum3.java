package Ex_13_Enum_Wrapper;

public class Enum3 {
    static void main(String[] args) {
        System.out.println(Hexcolour.BLUE.getHexcode());
        System.out.println(Hexcolour.RED.getHexcode());
        System.out.println(Hexcolour.GREEN.getHexcode());


    }
    enum Hexcolour{
        RED("#FF0000"),
        GREEN("#61FF33"),
        BLUE("#3377FF"),
        YELLOW("#4477FF");

        private String Hexcode;

        Hexcolour(String hexcode) {
            Hexcode = hexcode;
        }

        public String getHexcode() {
            return Hexcode;
        }
    }
}
