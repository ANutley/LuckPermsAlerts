package me.anutley.luckpermsalerts.events.track.mutate;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.track.mutate.TrackRemoveGroupEvent;

public class LPTrackRemoveGroupEvent extends LPEvent<TrackRemoveGroupEvent> {

        public LPTrackRemoveGroupEvent(TrackRemoveGroupEvent event) {
            super(event);
        }

        @Override
        public TrackRemoveGroupEvent getEvent() {
            return event;
        }
}
