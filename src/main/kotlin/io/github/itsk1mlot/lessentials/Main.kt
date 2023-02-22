package io.github.itsk1mlot.lessentials

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    override fun onEnable() {
        println("Load!")
    }

    override fun onDisable() {
        println("unload!")
    }
}