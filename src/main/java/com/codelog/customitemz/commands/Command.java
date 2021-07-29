package com.codelog.customitemz.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Command {

    public Command() {

    }

    public void playerExecute(Player sender, String[] args) {

    }

    public void consoleExecute(ConsoleCommandSender sender, String[] args) {
        sender.sendMessage("This is a player-only command!");
    }
}
