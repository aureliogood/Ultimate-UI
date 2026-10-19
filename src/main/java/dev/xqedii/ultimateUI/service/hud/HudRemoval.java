package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_d6qzzis;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Vector;

public abstract class HudRemoval extends VirtualHuds {
   public static final String Xqedii_1fkrcq4g6q60s = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudRemoval(UltimateUI var1) {
      super(var1);
   }

   public void removeHudX(List<Entity> var1, boolean var2) {
      if ((-1403937469 * -1403937469 + -1403937469 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (Entity var4 : var1) {
            if (var4 != null) {
               Xqedii_2t8d8j4 var5 = this.Xqedii_2jnbe8d(var4);
               if (var5 != null) {
                  Player var6 = this.Xqedii_3u2qg5l(var4);
                  if (var6 != null) {
                     if (var2) {
                        Vector var7 = var5.Xqedii_1pjv5dx;
                        this.animScale(var4, var7.getX(), var7.getY(), var7.getZ(), (Xqedii_d6qzzis.Xqedii_g4dpcuk22bl4(275289476, 28) != 0));
                     } else {
                        this.Xqedii_32sczwk(var6, var5.Xqedii_26svack, (Xqedii_d6qzzis.Xqedii_1h64epctuw5ra(1413324273, 25) != 0));
                     }
                  } else if (var4.isValid() && !var4.isDead()) {
                     var4.remove();
                  }
               } else if (var2) {
                  Vector var8 = (Vector)((MetadataValue)var4.getMetadata(
                           Xqedii_d6qzzis.Xqedii_1c6g1qg9x1qx5("ONTJQJzvy/cn4kR/b/QTn95dGaJso5MXfl0byEGXwIbkUVuhhXo=")
                        )
                        .get(Xqedii_d6qzzis.Xqedii_1h64epctuw5ra(-1413324274, 25)))
                     .value();
                  this.animScale(var4, var8.getX(), var8.getY(), var8.getZ(), (Xqedii_d6qzzis.Xqedii_294scnhjbfkf7(1323361739, 4) != 0));
               } else {
                  String var9 = this.Xqedii_1qvlp81(var4);
                  Player var10 = this.Xqedii_20ozntw(var4);
                  if (var10 != null && !var9.isBlank()) {
                     var10.removeMetadata(Xqedii_287duv65464du(var9), this.Xqedii_rrdyomu);
                  }

                  this.Xqedii_3ijxsfp(var10, var4);
                  this.Xqedii_2u2fnvh(var10, var4);
                  var4.remove();
                  if (var10 != null) {
                     this.Xqedii_2ebi45u(var10);
                  }
               }
            }
         }
      }
   }

   public void clearHuds(Player var1) {
      if ((-1386592100 ^ -1386592100) != 0) {
         throw new IllegalStateException();
      } else {
         this.removeHudX(this.getAllHuds(var1), (Xqedii_d6qzzis.Xqedii_1h64epctuw5ra(-1413324274, 26) != 0));
         Map var2 = this.Xqedii_7rxyqib.get(var1.getUniqueId());
         if (var2 != null && !var2.isEmpty()) {
            for (String var5 : (Iterable<String>) (new ArrayList(var2.keySet()))) {

               this.Xqedii_32sczwk(var1, var5, (Xqedii_d6qzzis.Xqedii_g4dpcuk22bl4(6854016, 2) != 0));
            }
         }

         this.Xqedii_2apkuy1.remove(var1.getUniqueId());
         this.Xqedii_52xxigy.remove(var1.getUniqueId());
         this.Xqedii_2e9emiq.remove(var1.getUniqueId());
         this.Xqedii_28kfl6q.remove(var1.getUniqueId());
         this.endBossbarSession(var1);
         this.Xqedii_2ebi45u(var1);
      }
   }

   public void clearHudsKeepCursor(Player var1) {
      if ((-231513534 * (-231513534 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         ArrayList var2 = new ArrayList();

         for (Entity var4 : this.getAllHuds(var1)) {
            if (var4 != null && var4.hasMetadata(Xqedii_d6qzzis.Xqedii_1c6g1qg9x1qx5("ZltliFZ1n3Ai1rox6Z6WBaaq4u/Wz/eFXo/I0UYHaA0="))) {
               String var5 = ((MetadataValue)var4.getMetadata(Xqedii_d6qzzis.Xqedii_1c6g1qg9x1qx5("ZltliFZ1n3Ai1rox6Z6WBaaq4u/Wz/eFXo/I0UYHaA0="))
                     .get(Xqedii_d6qzzis.Xqedii_294scnhjbfkf7(-615587611, 28)))
                  .asString();
               if (!Xqedii_d6qzzis.Xqedii_1c6g1qg9x1qx5("YPGCYx1dpGAQE9AtuNNJXOvEyBzOuSwou2NjdzTB8Fm8o2JQWZ0NQw==").equalsIgnoreCase(var5)) {
                  var2.add(var4);
               }
            } else {
               var2.add(var4);
            }
         }

         this.removeHudX(var2, (Xqedii_d6qzzis.Xqedii_294scnhjbfkf7(-629733586, 31) != 0));
         Map var7 = this.Xqedii_7rxyqib.get(var1.getUniqueId());
         if (var7 != null && !var7.isEmpty()) {
            for (String var6 : (Iterable<String>) (new ArrayList(var7.keySet()))) {

               if (!Xqedii_d6qzzis.Xqedii_1c6g1qg9x1qx5("YPGCYx1dpGAQE9AtuNNJXOvEyBzOuSwou2NjdzTB8Fm8o2JQWZ0NQw==").equalsIgnoreCase(var6)) {
                  this.Xqedii_32sczwk(var1, var6, (Xqedii_d6qzzis.Xqedii_1h64epctuw5ra(1413324273, 11) != 0));
               }
            }
         }

         this.Xqedii_2ebi45u(var1);
      }
   }

   private static /* synthetic */ String Xqedii_287duv65464du(String string) {
        return Xqedii_d6qzzis.Xqedii_1c6g1qg9x1qx5("X6qUvXiwm9dQ/i3BwiQnaKTdfFslugknxn0Ic4VW6JVEnldn") + string;
    }
}
