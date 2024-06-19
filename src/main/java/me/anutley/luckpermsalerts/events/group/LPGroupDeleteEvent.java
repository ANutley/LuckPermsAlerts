package me.anutley.luckpermsalerts.events.group;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.group.GroupDeleteEvent;

public class LPGroupDeleteEvent extends LPEvent<GroupDeleteEvent> {

    public LPGroupDeleteEvent(GroupDeleteEvent event) {
        super(event);
    }

    @Override
    public GroupDeleteEvent getEvent() {
        return null;
    }
}
