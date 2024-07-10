package br.com.dheldev.planner.participant;

import br.com.dheldev.planner.trip.Trip;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository repository;
    
    public void registerParticipantsToEvent(List<String> participantsToInvite, Trip trip) {
        
        List<Participant> participants = participantsToInvite.stream().map(email -> new Participant(email, trip)).toList();
        this.repository.saveAll(participants);
        
        //deletar apenas teste
        System.out.println(participants.get(0).getId());
    }

    public void triggerConfirmationEmailToParticipanst(UUID tripId) {
    }
}
