package me.anutley.luckpermsalerts.events.user.track;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.track.UserDemoteEvent;

public class LPUserDemoteEvent extends LPEvent<UserDemoteEvent> {

    public LPUserDemoteEvent(UserDemoteEvent event) {
        super(event);
    }

    @Override
    public UserDemoteEvent getEvent() {
        return event;
    }
}
