package me.anutley.luckpermsalerts.events.user.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.track.UserPromoteEvent;

public class LPUserPromoteEvent extends LPEvent<UserPromoteEvent> {

    public LPUserPromoteEvent(UserPromoteEvent event) {
        super(event);
    }

    @Override
    public UserPromoteEvent getEvent() {
        return event;
    }
}
