package helpers;

public class Config {
    private static final String EMAIL = "ringbearer@yandex.ru";
    private static final String PASSWORD = "123456";
    private static final String ACTIVE_SECTION = "tab_tab_type_current__2BEPc";

    public static String getEmail() {
        return EMAIL;
    }

    public static String getPassword() {
        return PASSWORD;
    }
    public static String getActiveSection() {return ACTIVE_SECTION; };
}
