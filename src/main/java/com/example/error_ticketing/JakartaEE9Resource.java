package com.example.error_ticketing;

import business.Token;
import jakarta.ws.rs.*;
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

        if(token!=null && !token.equals("") &&!Objects.equals(new Token().getToken(), token))
        {
            return Response
                    .status(Response.Status.UNAUTHORIZED)
                    .type(MediaType.APPLICATION_JSON)
                    .entity(resp)
                    .build();
        }
        else {
            resp.put("error","No Token");
        }
        resp.put("keres","rendben");
        resp.put("username","JaniHegedus");
        return Response
                .ok(resp.toString())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    public Response sendRecieveDemoData(Object o)
    {
        JSONObject jsonObject = new JSONObject(o);
        return null;
    }
}