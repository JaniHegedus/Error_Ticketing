package com.example.error_ticketing;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloApp{
    @GET
    public String HelloWorld()
    {
        return "Hello World";
    }
}
