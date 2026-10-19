package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1bdl6f3;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.PacketWrapper;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerSetPassengers;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public abstract class HudPackets extends HudTextFormat {
   public static final String Xqedii_1n7g8092ygq6p = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudPackets(UltimateUI var1) {
      super(var1);
   }

   public void clearPassengerQueue(Player var1) {
      if ((1656733284 ^ 1656733284) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.Xqedii_2ruo9yk.remove(var1.getUniqueId());
         this.Xqedii_v8ssh03.remove(var1.getUniqueId());
         this.Xqedii_52xxigy.remove(var1.getUniqueId());
      }
   }

   @Override
   public void Xqedii_2ebi45u(Player var1) {
      if ((357868489 * (357868489 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         UUID var2 = var1.getUniqueId();
         if (this.Xqedii_2ruo9yk.add(var2)) {
            Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_rrdyomu, var1, () -> {
               if ((-1482406263 ^ -1482406263) != 0) {
                  throw new IllegalStateException();
               } else {
                  this.Xqedii_2ruo9yk.remove(var2);
                  Player var2x = Bukkit.getPlayer(var2);
                  if (var2x != null && var2x.isOnline()) {
                     this.Xqedii_2w0ej97(var2x);
                  }
               }
            });
         }
      }
   }

   public void Xqedii_2w0ej97(Player var1) {
      if (((-954240329 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         LinkedHashSet var2 = new LinkedHashSet();

         for (Entity var4 : var1.getPassengers()) {
            if (var4 != null && var4.isValid() && !var4.isDead()) {
               var2.add(var4.getEntityId());
            }
         }

         int[] var8 = this.Xqedii_v8ssh03.get(var1.getUniqueId());
         if (var8 != null) {
            int[] var9 = var8;
            int var5 = var8.length;

            for (int var6 = Xqedii_1bdl6f3.Xqedii_3lhuwsr18sxx8(1657607401, 11); var6 < var5; var6++) {
               int var7 = var9[var6];
               var2.add(var7);
            }
         }

         Map var10 = this.Xqedii_7rxyqib.get(var1.getUniqueId());
         if (!this.isFixShadersEnabled(var1) && var10 != null) {
            for (Xqedii_2t8d8j4 var12 : (Iterable<Xqedii_2t8d8j4>) (var10.values())) {

               var2.add(var12.Xqedii_1qxgv1w);
            }
         }

         this.Xqedii_2tx2x1f(var1.getUniqueId(), var2);
         this.Xqedii_202hfuk(var1, new WrapperPlayServerSetPassengers(var1.getEntityId(), Xqedii_14vespo(var2)));
      }
   }

   public static int[] Xqedii_14vespo(Collection<Integer> var0) {
      if ((-1068316748 * -1068316748 - -1068316748 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int[] var1 = new int[var0.size()];
         int var2 = Xqedii_1bdl6f3.Xqedii_3lhuwsr18sxx8(1657607401, 30);

         for (Integer var4 : var0) {
            var1[var2++] = var4;
         }

         return var1;
      }
   }

   public void Xqedii_202hfuk(Player var1, PacketWrapper<?> var2) {
      if (((-1997347973 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline() && var2 != null) {
         try {
            PacketEvents.getAPI().getPlayerManager().sendPacket(var1, var2);
         } catch (Throwable var4) {
            Logger var10000 = this.Xqedii_rrdyomu.getLogger();
            Locale var10001 = Locale.ROOT;
            String var10002 = Xqedii_1bdl6f3.Xqedii_13iwsqckxr9qc(
               "D9jBRnrISc15/iscAqlaVLZMQnQIVtKL+wv0blf/UcMKpTsG2QBup49OYq6fikIbeutBrgcARJqrbm3LFyrj2tCSyCPvZsS2+RmNAPyqrUSHv7POkjTAELB43wzVEX2HWfCcExePBbbUelAkWaqZMwJxKeUsELYRSQMp1Q6FaUtxH+K3eJoLYGJkXTLMm8bhd8YB5Q=="
            );
            Object[] var10003 = new Object[Xqedii_1bdl6f3.Xqedii_3lhuwsr18sxx8(1657631977, 13)];
            var10003[Xqedii_1bdl6f3.Xqedii_a5ttosnl9ckw(422982134, 6)] = var2.getClass().getSimpleName();
            var10003[Xqedii_1bdl6f3.Xqedii_75sie4njtcaq(-101585778, 9)] = var1.getName();
            var10003[Xqedii_1bdl6f3.Xqedii_a5ttosnl9ckw(1818553394, 15)] = var4.getMessage();
            var10000.warning(String.format(var10001, var10002, var10003));
         }
      }
   }
}
