package me.anutley.luckpermsalerts.events.user;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.UserCacheLoadEvent;

public class LPUserCacheLoadEvent extends LPEvent<UserCacheLoadEvent> {

    public LPUserCacheLoadEvent(UserCacheLoadEvent event) {
        super(event);
    }

    @Override
    public UserCacheLoadEvent getEvent() {
        return event;
    }
}
