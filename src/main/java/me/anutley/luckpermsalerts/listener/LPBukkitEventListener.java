package me.anutley.luckpermsalerts.listener;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.LuckPermsEvent;

public class LPBukkitEventListener<T extends LuckPermsEvent> {

    private final LPEvent<T> lpEvent;

    public LPBukkitEventListener(LPEvent<T> lpEvent) {
        this.lpEvent = lpEvent;
    }

    public void onEvent() {
        lpEvent.callEvent();
    }
}