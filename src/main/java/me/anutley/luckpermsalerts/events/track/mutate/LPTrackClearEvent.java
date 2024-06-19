package me.anutley.luckpermsalerts.events.track.mutate;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.mutate.TrackClearEvent;

public class LPTrackClearEvent extends LPEvent<TrackClearEvent> {

    public LPTrackClearEvent(TrackClearEvent event) {
        super(event);
    }

    @Override
    public TrackClearEvent getEvent() {
        return event;
    }
}
