package domain.exercise.bms.handler;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomTimestampDeserializer extends JsonDeserializer<Timestamp> {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy hh:mm:ss.SSSSSSSSS a");

    @Override
    public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        try {
            String timestampValue = jsonParser.getText();
            return new Timestamp(dateFormat.parse(timestampValue).getTime());
        } catch (ParseException e) {
            throw new RuntimeException("Error parsing timestamp value", e);
        }
    }
}
