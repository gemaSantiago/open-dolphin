package com.canoo.dolphin.core.server.comm;

import com.canoo.dolphin.core.comm.Command;

import java.util.List;

public interface CommandHandler<T> {
    public void handleCommand(T command, List<Command> response);
}