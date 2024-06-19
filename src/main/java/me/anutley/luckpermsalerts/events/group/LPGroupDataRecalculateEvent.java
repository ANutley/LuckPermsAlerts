package me.anutley.luckpermsalerts.events.group;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.group.GroupDataRecalculateEvent;

public class LPGroupDataRecalculateEvent extends LPEvent<GroupDataRecalculateEvent> {

    public LPGroupDataRecalculateEvent(GroupDataRecalculateEvent event) {
        super(event);
    }

    @Override
    public GroupDataRecalculateEvent getEvent() {
        return event;
    }
}
