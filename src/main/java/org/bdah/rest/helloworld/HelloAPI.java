package org.bdah.rest.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloAPI {

  @GET
  @Produces(MediaType.TEXT_HTML)
  public String helloMsg() {
    return "<h1>Hello World. Message from REST API</h1>";
  }
  
}