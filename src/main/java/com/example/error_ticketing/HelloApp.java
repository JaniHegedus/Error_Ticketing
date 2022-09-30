package com.example.error_ticketing;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloApp{
    @GET
    public String HelloWorld()
    {
        return "Hello World";
    }
}
