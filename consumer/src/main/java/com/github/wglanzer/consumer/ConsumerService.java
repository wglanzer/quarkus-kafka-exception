package com.github.wglanzer.consumer;

import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jetbrains.annotations.Nullable;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author w.glanzer, 23.06.2019
 */
@ApplicationScoped
public class ConsumerService
{

  @Incoming("TEST_TOPIC_IN")
  public void testtopicIncoming(@Nullable JsonObject pJsonObject)
  {
    if(pJsonObject == null)
      return;

    System.out.println(pJsonObject);
  }

}
