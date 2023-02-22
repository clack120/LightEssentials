package io.github.itsk1mlot.lessentials
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
  override fun onEnable() {
    logger.info("Plugin is being enabled!")
  }
  
  override fun onDisable() {
    logger.info("Plugin is being disabled!")
  }
}
