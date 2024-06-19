package me.anutley.luckpermsalerts.events;

import net.luckperms.api.event.LuckPermsEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public abstract class LPEvent <T extends LuckPermsEvent> extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    protected final T event;

    public abstract T getEvent();

    public LPEvent(T event) {
        this.event = event;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

}
