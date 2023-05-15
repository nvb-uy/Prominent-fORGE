package elocindev.prominent.forge.events;

import elocindev.prominent.forge.ProminentLoader;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CombatEvents {
    @SubscribeEvent
    public void onPlayerAttack(LivingHurtEvent event) {
        LivingEntity victim = event.getEntity();
        DamageSource source = event.getSource();
        float amount = event.getAmount();
        if (victim == null || source.getEntity() == null) return;
        
        if (ProminentLoader.Config.enablePvpFactor)
        if (source.getEntity() instanceof Player attacker) {
            if (amount > (victim.getMaxHealth() * ProminentLoader.Config.combatFactorPvp)) {
                event.setAmount((victim.getMaxHealth() * ProminentLoader.Config.combatFactorPvp));
            }
        }
    }
    
    @SubscribeEvent
    public void entityDamage(LivingHurtEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity == null) return;
        
        if (ProminentLoader.Config.enableDamageLimit) {
            if (event.getAmount() > ProminentLoader.Config.damageLimit) {
                event.setAmount(ProminentLoader.Config.damageLimit);
            }
        }
    }
}
