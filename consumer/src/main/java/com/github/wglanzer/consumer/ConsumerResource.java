package com.github.wglanzer.consumer;

import io.smallrye.reactive.messaging.annotations.*;
import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;

/**
 * @author w.glanzer, 23.06.2019
 */
@Path("/")
@ApplicationScoped
public class ConsumerResource
{

  @Stream("TEST_TOPIC_OUT")
  Emitter<JsonObject> testEmitter;

  @GET
  @Path("/doTest")
  public void sendMessage()
  {
    testEmitter.send(new JsonObject()
                         .put("key", "value")
                         .put("key2", "value2"));
  }

}
