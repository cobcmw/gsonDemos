package michael.jsonreaderexaple;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import michael.jsonreaderexaple.pojo.Message;
import michael.jsonreaderexaple.pojo.User;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 容休博客：https://www.rxblog.xyz
 * See more on Google Official site:https://google.github.io/gson/apidocs/com/google/gson/stream/JsonReader.html
 */
public class JsonReaderExample {
    public static void main(String[] args) {

        String jsonData = "[\n" + "   {\n" + "     \"id\": 912345678901,\n" + "     \"text\": \"How do I read a JSON stream in Java?\",\n" + "     \"geo\": null,\n" + "     \"user\": {\n" + "       \"name\": \"json_newb\",\n" + "       \"followers_count\": 41\n" + "      }\n" + "   },\n" + "   {\n" + "     \"id\": 912345678902,\n" + "     \"text\": \"@json_newb just use JsonReader!\",\n" + "     \"geo\": [50.454722, -104.606667],\n" + "     \"user\": {\n" + "       \"name\": \"jesse\",\n" + "       \"followers_count\": 2\n" + "     }\n" + "   }\n" + " ]";
        InputStream stream = new ByteArrayInputStream(jsonData.getBytes(StandardCharsets.UTF_8));
        try {
            List<Message> list = new JsonReaderExample().readJsonStream(stream);
            System.out.println(list.size());
            System.out.println(list.get(0).getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Message> readJsonStream(InputStream in) throws IOException {
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            return readMessagesArray(reader);
        } finally {
            reader.close();
        }
    }

    public List<Message> readMessagesArray(JsonReader reader) throws IOException {
        List<Message> messages = new ArrayList<Message>();

        reader.beginArray();
        while (reader.hasNext()) {
            messages.add(readMessage(reader));
        }
        reader.endArray();
        return messages;
    }

    public Message readMessage(JsonReader reader) throws IOException {
        long id = -1;
        String text = null;
        User user = null;
        List<Double> geo = null;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                id = reader.nextLong();
            } else if (name.equals("text")) {
                text = reader.nextString();
            } else if (name.equals("geo") && reader.peek() != JsonToken.NULL) {
                geo = readDoublesArray(reader);
            } else if (name.equals("user")) {
                user = readUser(reader);
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new Message(id, text, user, geo);
    }

    public List<Double> readDoublesArray(JsonReader reader) throws IOException {
        List<Double> doubles = new ArrayList<Double>();

        reader.beginArray();
        while (reader.hasNext()) {
            doubles.add(reader.nextDouble());
        }
        reader.endArray();
        return doubles;
    }


    public User readUser(JsonReader reader) throws IOException {
        String username = null;
        int followersCount = -1;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                username = reader.nextString();
            } else if (name.equals("followers_count")) {
                followersCount = reader.nextInt();
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new User(username, followersCount);
    }

}
