package me.anutley.luckpermsalerts.events.user.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.track.UserTrackEvent;

public class LPUserTrackEvent extends LPEvent<UserTrackEvent> {

    public LPUserTrackEvent(UserTrackEvent event) {
        super(event);
    }

    @Override
    public UserTrackEvent getEvent() {
        return event;
    }
}
