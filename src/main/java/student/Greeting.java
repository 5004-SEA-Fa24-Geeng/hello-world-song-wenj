package student;

/**
 * The Greeting class handles greetings based on locality.
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID; // ID of the localit
    private String localityName; // Name of the locality
    private String asciiGreeting; // ASCII greeting
    private String unicodeGreeting; // Unicode greeting
    private String formatStr; // Format string for constructing the greeting message

    // Constants for specific localities
    private static final int HAWAII = 1;
    private static final int CHINA = 3;
    private static final int ITALY = 4;
    // Default locality ID if none is specified
    private static final int DEFAULT_LOCALITY = 2;

    // Constructor that initializes with locality ID, name, and default greetings
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "Hello, %s!");
    }

    // Constructor that initializes with locality ID, name, and a specified greeting
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    // Full constructor that initializes all fields
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    // Getter for locality ID
    public int getLocalityID() {
        return localityID;
    }

    // Getter for locality name
    public String getLocalityName() {
        return localityName;
    }

    // Getter for ASCII greeting, which changes based on the locality ID
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

    // Getter for Unicode greeting, which changes based on the locality ID
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

    // Getter for the format string, returning the Unicode version
    public String getFormatStr() {
        return getFormatStr(false);
    }

    // Getter for the format string, with an option to specify ASCII-only
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

    // Override the toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "{" +
                "localityID:" + localityID +
                ", localityName:\"" + localityName + '\"' +
                ", asciiGreeting:\"" + asciiGreeting + '\"' +
                ", unicodeGreeting:\"" + unicodeGreeting + '\"' +
                '}';
    }
}
