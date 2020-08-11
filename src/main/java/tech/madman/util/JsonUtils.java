package tech.madman.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.StringUtils;

public class JsonUtils {
    public static String obj2Str(Object o) {
        if (null == o) {
            return null;
        }

        ObjectMapper mp = new ObjectMapper();
        mp.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mp.configure(SerializationFeature.INDENT_OUTPUT, true);
        try {
            return mp.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static <T> T json2Obj(String json, T t) {
        if (StringUtils.isEmpty(json) || null == t) {
            return null;
        }
        ObjectMapper mp = new ObjectMapper();
        mp.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mp.configure(SerializationFeature.INDENT_OUTPUT, true);
        try {
            return (T) mp.readValue(json, t.getClass());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
