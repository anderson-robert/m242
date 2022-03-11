package ch.m242.morse.controller;

import ch.m242.morse.domain.Entry;
import ch.m242.morse.service.EntryService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/entries")
@Tag(name = "Entries", description = "Handling of entries")
public class EntryController {
    @Inject
    EntryService entryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Entry getLatestEntry() {
        long latest = entryService.findLatest();
        return entryService.getSingleEntry(latest);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Add a new Entry", description = "The newly created entry is returned. The id may not be passed.")
    public Entry add(Entry entry) {
        return entryService.createEntry(entry);
    }
}
