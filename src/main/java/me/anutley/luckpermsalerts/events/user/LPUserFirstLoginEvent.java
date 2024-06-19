package me.anutley.luckpermsalerts.events.user;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.UserFirstLoginEvent;

public class LPUserFirstLoginEvent extends LPEvent<UserFirstLoginEvent> {

    public LPUserFirstLoginEvent(UserFirstLoginEvent event) {
        super(event);
    }

    @Override
    public UserFirstLoginEvent getEvent() {
        return event;
    }
}
