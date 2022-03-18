package ch.m242.morse.controller;

import ch.m242.morse.domain.Entry;
import ch.m242.morse.service.EntryService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/entries")
@Tag(name = "Entries", description = "Handling of entries")
public class EntryController {
    @Inject
    EntryService entryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get the latest entry", description = "Returns the latest entry.")
    public Entry getLatestEntry() {
        return entryService.findLatest();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    @Operation(summary = "Gets ones entry", description = "A single entry matching the given ID is returned.")
    public Entry getSingleEntry(@PathParam("id") Long id){
        return entryService.getSingleEntry(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Add a new Entry", description = "The newly created entry is returned. The id may not be passed.")
    public Entry add(Entry entry) {
        return entryService.createEntry(entry);
    }
}
