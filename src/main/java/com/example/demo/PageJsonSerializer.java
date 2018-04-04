package com.example.demo;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.data.domain.Page;

@JsonComponent
public class PageJsonSerializer {

        public static class Serializer extends JsonSerializer<Page<?>> {

                @Override
                public void serialize(Page<?> value, JsonGenerator gen, SerializerProvider serializers)
                                throws IOException {
                        gen.writeStartObject();
                        // gen.
                        gen.writeNumberField("total", value.getTotalElements());
                        gen.writeArrayFieldStart("items");
                        value.getContent().iterator().forEachRemaining(o -> {
                                try {
                                        gen.writeObject(o);
                                } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                        });
                        gen.writeEndArray();
                        gen.writeEndObject();
                        gen.close();
                }

                // ...

        }
}
