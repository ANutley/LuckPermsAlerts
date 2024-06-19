package me.anutley.luckpermsalerts.events.user;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.UserLoadEvent;

public class LPUserLoadEvent extends LPEvent<UserLoadEvent> {

    public LPUserLoadEvent(UserLoadEvent event) {
        super(event);
    }

    @Override
    public UserLoadEvent getEvent() {
        return event;
    }
}
