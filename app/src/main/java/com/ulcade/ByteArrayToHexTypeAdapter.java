package com.ulcade;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.ulcade.util.Util;
import java.lang.reflect.Type;

public class ByteArrayToHexTypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
	public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		return Util.hexToBytes(json.getAsString());
	}

	public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
		return new JsonPrimitive(Util.bytesToHex(src));
	}
}
