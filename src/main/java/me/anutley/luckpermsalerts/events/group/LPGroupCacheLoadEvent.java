package me.anutley.luckpermsalerts.events.group;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.group.GroupCacheLoadEvent;

public class LPGroupCacheLoadEvent extends LPEvent<GroupCacheLoadEvent> {

    public LPGroupCacheLoadEvent(GroupCacheLoadEvent event) {
        super(event);
    }

    @Override
    public GroupCacheLoadEvent getEvent() {
        return event;
    }
}
