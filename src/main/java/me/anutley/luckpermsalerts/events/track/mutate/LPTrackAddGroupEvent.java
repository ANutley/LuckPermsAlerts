package me.anutley.luckpermsalerts.events.track.mutate;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.mutate.TrackAddGroupEvent;

public class LPTrackAddGroupEvent extends LPEvent<TrackAddGroupEvent> {

    public LPTrackAddGroupEvent(TrackAddGroupEvent event) {
        super(event);
    }

    @Override
    public TrackAddGroupEvent getEvent() {
        return event;
    }
}
