package me.anutley.luckpermsalerts.events.group;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.group.GroupLoadEvent;

public class LPGroupLoadEvent extends LPEvent<GroupLoadEvent> {

    public LPGroupLoadEvent(GroupLoadEvent event) {
        super(event);
    }

    @Override
    public GroupLoadEvent getEvent() {
        return event;
    }
}
