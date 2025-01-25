package student;

/**
 * The Greeting class handles greetings based on locality.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {
    /** int value of locality ID. */
    private int localityID;
    /** String value of locality name. */
    private String localityName;
    /** String value of ASCII greeting. */
    private String asciiGreeting;
    /** String value of Unicode greeting. */
    private String unicodeGreeting;
    /** String value of format string. */
    private String formatStr;

    /** int value of Hawaii greeting. */
    private static final int HAWAII = 1;
    /** int value of china greeting. */
    private static final int CHINA = 3;
    /** int value of Italy greeting. */
    private static final int ITALY = 4;
    /** int value of the DEFAULT locality. */
    private static final int DEFAULT_LOCALITY = 2;

    /**
     * Constructor that initializes with locality ID, name, and default greetings.
     * @param localityID the locality ID
     * @param localityName the locality name
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "Hello, %s!");
    }

    /**
     * Constructor that initializes with locality ID, name, and a specified greeting.
     * @param localityID the locality ID
     * @param localityName the locality name
     * @param greeting the greeting message
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Full constructor that initializes all fields.
     * @param localityID the locality ID
     * @param localityName the locality name
     * @param asciiGreeting ASCII greeting
     * @param unicodeGreeting Unicode greeting
     * @param formatStr format string
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting,
                    String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Getter for locality ID.
     * @return locality ID
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Getter for locality name.
     * @return locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Getter for ASCII greeting, which changes based on the locality ID.
     * @return ASCII greeting
     */
    public String getAsciiGreeting() {
        switch (localityID) {
            case HAWAII:
                asciiGreeting = "Aloha";
                break;
            case CHINA:
                asciiGreeting = "Ni Hao";
                break;
            case ITALY:
                asciiGreeting = "Ciao";
                break;
            default:
                asciiGreeting = "Hello";
        }
        return asciiGreeting;
    }

    /**
     * Getter for Unicode greeting, which changes based on the locality ID.
     * @return Unicode greeting
     */
    public String getUnicodeGreeting() {
        switch (localityID) {
            case HAWAII:
                unicodeGreeting = "Aloha";
                break;
            case CHINA:
                unicodeGreeting = "你好";
                break;
            case ITALY:
                unicodeGreeting = "Ciao";
                break;
            default:
                unicodeGreeting = "Hello";
        }
        return unicodeGreeting;
    }

    /**
     * Getter for the format string, returning the Unicode version.
     * @return format string
     */
    public String getFormatStr() {
        return getFormatStr(false);
    }

    /**
     * Getter for the format string, with an option to specify ASCII-only.
     * @param asciiOnly boolean value to specify ASCII-only
     * @return format string
     */
    public String getFormatStr(boolean asciiOnly) {
        switch (localityID) {
            case HAWAII:
                formatStr = "Aloha, %s!";
                break;
            case CHINA:
                if (asciiOnly) {
                    formatStr = "%s, Ni Hao!";
                } else {
                    formatStr = "%s, 你好!";
                }
                break;
            case ITALY:
                formatStr = "Ciao, %s!";
                break;
            default:
                formatStr = "Hello, %s!";
        }
        return formatStr;
    }

    /**
     * Override the toString method to provide a string representation of the object.
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "{"
                + "localityID:" + localityID
                + ", localityName:\"" + localityName + '\"'
                + ", asciiGreeting:\"" + asciiGreeting + '\"'
                + ", unicodeGreeting:\"" + unicodeGreeting + '\"'
                + '}';
    }
}
