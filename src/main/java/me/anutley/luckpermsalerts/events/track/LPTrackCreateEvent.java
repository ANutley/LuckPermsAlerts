package me.anutley.luckpermsalerts.events.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.TrackCreateEvent;

public class LPTrackCreateEvent extends LPEvent<TrackCreateEvent> {

    public LPTrackCreateEvent(TrackCreateEvent event) {
        super(event);
    }

    @Override
    public TrackCreateEvent getEvent() {
        return event;
    }
}
