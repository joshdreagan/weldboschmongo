package com.honda.hna.bigdata.weldboschmongo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class BsonDateSerializer extends JsonSerializer<Date> {

  @Override
  public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
    jgen.writeStartObject();
    serializeContents(value, jgen, provider);
    jgen.writeEndObject();
  }

  private void serializeContents(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
    jgen.writeFieldName("$date");
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    //Need to set time zone in order for the hour to be correctly stored
    formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
    String formattedDate = formatter.format(value);
    jgen.writeString(formattedDate);
  }
}
