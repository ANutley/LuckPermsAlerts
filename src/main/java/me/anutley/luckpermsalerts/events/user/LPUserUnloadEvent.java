package me.anutley.luckpermsalerts.events.user;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.UserUnloadEvent;

public class LPUserUnloadEvent extends LPEvent<UserUnloadEvent> {

    public LPUserUnloadEvent(UserUnloadEvent event) {
        super(event);
    }

    @Override
    public UserUnloadEvent getEvent() {
        return event;
    }
}
