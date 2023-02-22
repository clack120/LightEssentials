package io.github.itsk1mlot.lessentials.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import java.util.UUID

/*
PLEASE SIBAL NO THIS CLASS NAME

SORRY F***

 */
class Vanish: CommandExecutor {

    companion object {
        val vanished = listOf<UUID>()
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if(command.name == "ev") {
            val p = sender as Player
            if(vanished.contains(p.uniqueId)) {
                // 이미 vanished에 있음 -> 해제
            } else {
                p.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 255, true, false, false))
                p.sendMessage("§3${p}§6님의 투명화 모드가 §a활성화§6되었습니다!")
            }
        }
        return true
    }

}