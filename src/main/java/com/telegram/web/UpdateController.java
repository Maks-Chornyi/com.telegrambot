package com.telegram.web;

import com.telegram.core.Update;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


@Path("api")

public class UpdateController {

    private UpdateHandler updateHandler;

    @Path("update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
     public  void processUpdate(Update update) {
        updateHandler.onUpdate(update);

     }
}
