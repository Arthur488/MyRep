package RegEx;
//192.168.0.105
public class CheckIP {
    public static void main(String[] args) {
        String ipString = "192.201.01.";

        //boolean result = ipString.matches("\\d{3}\\.\\d{3}\\.\\d{1}\\.\\d{3}");
        //boolean result = ipString.matches("((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}");
        boolean result = ipString.matches("((\\d+)(\\.)){3}");
        System.out.println(result);
    }
}
