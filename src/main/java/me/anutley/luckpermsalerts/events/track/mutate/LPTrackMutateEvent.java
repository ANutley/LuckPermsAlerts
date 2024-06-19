package me.anutley.luckpermsalerts.events.track.mutate;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.mutate.TrackMutateEvent;

public class LPTrackMutateEvent extends LPEvent<TrackMutateEvent> {

    public LPTrackMutateEvent(TrackMutateEvent event) {
        super(event);
    }

    @Override
    public TrackMutateEvent getEvent() {
        return event;
    }
}
