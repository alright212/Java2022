package reflection.serializer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Serializer {

    public String serialize(Object instance) {
        Field[] fields = instance.getClass().getDeclaredFields();

        List<String> pairs = new ArrayList<>();
        for (Field field : fields) {
            // create key value pair
        }

        return String.join("|", pairs);
    }

    public <T> T deserialize(String inputString,
                            Class<T> clazz) {

        return null;
    }

}
