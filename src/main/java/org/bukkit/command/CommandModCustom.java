package org.bukkit.command;

import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;


public class CommandModCustom extends Command {

    public CommandModCustom(String name)
    {
        super(name);
    }

    public CommandModCustom(String name, String description, String usageMessage, List<String> aliases)
    {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        // TODO Auto-generated method stub
        return false;
    }
}
