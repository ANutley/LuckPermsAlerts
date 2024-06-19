package me.anutley.luckpermsalerts.events.sync;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.sync.PostSyncEvent;

public class LPPostSyncEvent extends LPEvent<PostSyncEvent> {

        public LPPostSyncEvent(PostSyncEvent event) {
            super(event);
        }

        @Override
        public PostSyncEvent getEvent() {
            return event;
        }
}
