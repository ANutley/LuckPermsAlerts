package me.anutley.luckpermsalerts.events.user;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.user.UserDataRecalculateEvent;

public class LPUserDataRecalculateEvent extends LPEvent<UserDataRecalculateEvent> {

    public LPUserDataRecalculateEvent(UserDataRecalculateEvent event) {
        super(event);
    }

    @Override
    public UserDataRecalculateEvent getEvent() {
        return event;
    }
}
