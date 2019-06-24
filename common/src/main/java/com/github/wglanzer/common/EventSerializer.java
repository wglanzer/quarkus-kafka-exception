package com.github.wglanzer.common;

import io.vertx.core.json.JsonObject;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * Serializing events in Kafka
 *
 * @author w.glanzer, 23.06.2019
 */
public class EventSerializer implements Serializer<JsonObject>
{

  @Override
  public void configure(Map<String, ?> configs, boolean isKey)
  {
    // nothing
  }

  @Override
  public byte[] serialize(String topic, JsonObject data)
  {
    if (data == null)
      return null;

    return data.encode().getBytes();
  }

  @Override
  public void close()
  {
    // nothing
  }

}
