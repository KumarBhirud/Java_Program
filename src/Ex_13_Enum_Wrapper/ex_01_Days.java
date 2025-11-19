package Ex_13_Enum_Wrapper;

public enum ex_01_Days
{
    SUNDAY("this is Weekend"), MONDAY("this is WeekDay"), TUESDAY("this is WeekDay"), WEDNESDAY("this is WeekDay"), THURSDAY("this is WeekDay"), FRIDAY("this is WeekDay"), SATURDAY("this is Weekend");
    private final String dis;

    ex_01_Days(String dis) {
        this.dis = dis;
    }

    public String getDis() {
        return dis;
    }
}

