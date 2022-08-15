package com.example.demoSpringRest.controller;

import com.example.demoSpringRest.model.Bootcamper;
import com.example.demoSpringRest.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    /*@GET
    public String hola(){
        return "hello";
    }*/
    private final BootcamperService bootcamperService;
    public BootcampersController(BootcamperService bservice){
        this.bootcamperService = bservice;
        this.bootcamperService.add(new Bootcamper("Dereck"));
    }
    @GET
    @Path("/bootcampers")
    @Produces("application/json") //convierte la lista a json, un tipo de medio
    public List<Bootcamper> listar(){
        return bootcamperService.getBootcamper();
    }

    /*@GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("name") String name) {
        return bootcamperService.getOneBootcamper(name);
    }*/

    @POST
    @Path("/bootcampers")
    @Produces("application/json") // Tipo de medio que va a devolver
    @Consumes("application/json") //Tipo de medio que va a recibir
    public Response addBootcamper(Bootcamper b){
        bootcamperService.add(b);
        return Response.created(
                URI.create("/bootcampers/" + b.getName())
        ).build();
    }

}
