package com.mmartin.authms.application.command;

import com.mmartin.authms.cqrs.command.Command;
import com.mmartin.authms.cqrs.command.CommandRequest;
import lombok.Builder;

@Builder
@Command("sing-up-command")
public record SingUpCommand(
        String username,
        String password
) implements CommandRequest<Void> { }
