package com.github.wglanzer.common;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * Deserializing events in Kafka
 *
 * @author w.glanzer, 23.06.2019
 */
public class EventDeserializer implements Deserializer<JsonObject>
{

  @Override
  public void configure(Map<String, ?> configs, boolean isKey)
  {
    // nothing
  }

  @Override
  public JsonObject deserialize(String topic, byte[] data)
  {
    if (data == null)
      return null;

    return Buffer.buffer(data).toJsonObject();
  }

  @Override
  public void close()
  {
    // nothing
  }

}
