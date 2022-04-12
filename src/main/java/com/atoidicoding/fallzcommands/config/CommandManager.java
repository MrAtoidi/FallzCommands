package com.atoidicoding.fallzcommands.config;

import com.atoidicoding.fallzcommands.FallzCommands;

public class CommandManager {

    private FallzCommands main;
    private RunCommand runCommand;

    public CommandManager(FallzCommands fallzCommands){
        this.main = fallzCommands;
        runCommand = new RunCommand(main);
    }


}
