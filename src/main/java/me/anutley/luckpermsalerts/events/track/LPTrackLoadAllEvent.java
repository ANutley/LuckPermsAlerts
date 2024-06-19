package me.anutley.luckpermsalerts.events.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.TrackLoadAllEvent;

public class LPTrackLoadAllEvent extends LPEvent<TrackLoadAllEvent> {

    public LPTrackLoadAllEvent(TrackLoadAllEvent event) {
        super(event);
    }

    @Override
    public TrackLoadAllEvent getEvent() {
        return event;
    }
}
