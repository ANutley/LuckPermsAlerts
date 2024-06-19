package me.anutley.luckpermsalerts.events.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.TrackLoadEvent;

public class LPTrackLoadEvent extends LPEvent<TrackLoadEvent> {

        public LPTrackLoadEvent(TrackLoadEvent event) {
            super(event);
        }

        @Override
        public TrackLoadEvent getEvent() {
            return event;
        }
}
