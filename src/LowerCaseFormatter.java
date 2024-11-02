import java.util.Locale;

public class LowerCaseFormatter implements MessageFormatter{
    @Override
    public String formatMessage(String message) {
        return message.toLowerCase();
    }
}
