package no.husbanken.test.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by honj on 14.09.2017.
 */
@Component
@Path("/")
public class Greeter {

    @GET
    @Path("/hello/{msg}")
    public String hello(@PathParam("msg") String msg){

        return "Hello, " + msg;

    }


}
