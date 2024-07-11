package br.com.dheldev.planner.link;

import br.com.dheldev.planner.trip.Trip;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip) {
        // Link newLink = new Link(payload.title(), payload.url(), trip);
        Link newLink = new Link(payload.title(), payload.url(), trip);
        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());
    }

    /**
     * public List<ActivityData> getAllActivitiesFromId(UUID tripId) { return
     * new ArrayList<>(); }
     */
}
