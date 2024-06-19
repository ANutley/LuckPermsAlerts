package me.anutley.luckpermsalerts.events.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.TrackDeleteEvent;

public class LPTrackDeleteEvent extends LPEvent<TrackDeleteEvent> {

    public LPTrackDeleteEvent(TrackDeleteEvent event) {
        super(event);
    }

    @Override
    public TrackDeleteEvent getEvent() {
        return event;
    }
}
