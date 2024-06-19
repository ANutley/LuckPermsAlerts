package me.anutley.luckpermsalerts.events.group;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.group.GroupLoadAllEvent;

public class LPGroupLoadAllEvent extends LPEvent<GroupLoadAllEvent> {

    public LPGroupLoadAllEvent(GroupLoadAllEvent event) {
        super(event);
    }

    @Override
    public GroupLoadAllEvent getEvent() {
        return event;
    }
}
