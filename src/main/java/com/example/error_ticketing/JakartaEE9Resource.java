package com.example.error_ticketing;

import business.TOKEN;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.json.JSONObject;

import java.util.Objects;

@Path("jakartaee9")
public class JakartaEE9Resource {
    @GET
    public Response ping(@HeaderParam("X-Auth-Token") String token)
    {
        JSONObject resp = new JSONObject();
        if(!Objects.equals(new TOKEN().getTOKEN(), token))
        {
            resp.put("error","No Token");
            return Response
                    .status(Response.Status.UNAUTHORIZED)
                    .type(MediaType.APPLICATION_JSON)
                    .entity(resp)
                    .build();
        }
        resp.put("keres","rendben");
        resp.put("username","JaniHegedus");
        return Response
                .ok(resp.toString())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}