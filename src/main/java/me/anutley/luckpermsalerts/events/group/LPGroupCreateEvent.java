package me.anutley.luckpermsalerts.events.group;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.group.GroupCreateEvent;

public class LPGroupCreateEvent extends LPEvent<GroupCreateEvent> {

    public LPGroupCreateEvent(GroupCreateEvent event) {
        super(event);
    }

    @Override
    public GroupCreateEvent getEvent() {
        return event;
    }
}
