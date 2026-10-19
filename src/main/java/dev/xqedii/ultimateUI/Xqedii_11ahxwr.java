package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.PacketWrapper;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerActionBar;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerBossBar;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerBossBar.Action;
import java.util.EnumSet;
import java.util.UUID;
import net.kyori.adventure.bossbar.BossBar.Color;
import net.kyori.adventure.bossbar.BossBar.Flag;
import net.kyori.adventure.bossbar.BossBar.Overlay;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class Xqedii_11ahxwr implements Xqedii_1o1cvf4 {
   public final Xqedii_148dm0t Xqedii_3rh6pb3;
   public static final String Xqedii_20wxug0e6shte = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public Xqedii_11ahxwr(Xqedii_148dm0t var1) {
      this.Xqedii_3rh6pb3 = var1;
   }

   @Override
   public void Xqedii_3p9z9ee(Player var1, UUID var2, Xqedii_fwiw7cd var3, Component var4) {
      if (((581683032 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         WrapperPlayServerBossBar var5 = new WrapperPlayServerBossBar(var2, this.Xqedii_x2agdnc(var3));
         if (var3 != Xqedii_fwiw7cd.REMOVE) {
            var5.setTitle((Component)(var4 == null ? Component.empty() : var4));
            var5.setHealth(Float.intBitsToFloat(Xqedii_6pzg5gm.Xqedii_9u3lnutfw1ir(-420471287, 5)));
            var5.setColor(Color.YELLOW);
            var5.setOverlay(Overlay.PROGRESS);
            var5.setFlags(EnumSet.noneOf(Flag.class));
         }

         try {
            PacketEvents.getAPI().getPlayerManager().sendPacket(var1, var5);
         } catch (Throwable var7) {
            this.Xqedii_g93sz97(
               Xqedii_6pzg5gm.Xqedii_2mb5ncu7h4pfr(
                  "+dW+frC53Y3+A9aT7nhUnvnM7b5Ve3G8thy/IBAMjKwpP4cSajdnw3p6op0w9Kl+eMNtpb6oobrPn4406zbd2trgLu26/IGvUEiUazJuPx2BL2aY8EVmxA=="
               ),
               var7
            );
         }
      }
   }

   @Override
   public void Xqedii_s6fwnzl(Player var1, UUID var2, Xqedii_fwiw7cd var3, Xqedii_38cw7ku var4) {
      if (((-763375989 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         WrapperPlayServerBossBar var5 = new WrapperPlayServerBossBar(var2, this.Xqedii_x2agdnc(var3));
         if (var3 != Xqedii_fwiw7cd.REMOVE && var4 != null) {
            var5.setTitle((Component)(var4.title == null ? Component.empty() : var4.title));
            var5.setHealth(var4.Xqedii_lpfdzop);
            var5.setColor(var4.Xqedii_2gslzsd);
            var5.setOverlay(var4.Xqedii_2g8wahp);
            var5.setFlags(Xqedii_148dm0t.Xqedii_y6qqz46(var4.Xqedii_28ahbkr));
         }

         this.Xqedii_152ldpa(var1, var5);
      }
   }

   @Override
   public void Xqedii_2pg3xb4(Player var1, Component var2) {
      if ((-1879620355 * -1879620355 + -1879620355 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_152ldpa(var1, new WrapperPlayServerActionBar(var2));
      }
   }

   public void Xqedii_152ldpa(Player var1, PacketWrapper<?> var2) {
      if ((335523378 * (335523378 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            PacketEvents.getAPI().getPlayerManager().sendPacketSilently(var1, var2);
         } catch (Throwable var4) {
            this.Xqedii_g93sz97(
               Xqedii_6pzg5gm.Xqedii_2mb5ncu7h4pfr(
                  "PsL9tXyU67cAmQ9qIm3hng951lSaSVrRipvTbTNkqVeCah//35XP42vGbOiYKrQHpRi/ZqyEznI49+ILlQ2RIIO6LP0bwCUK72S6HH46UTF+ur0st2B5bA=="
               ),
               var4
            );
         }
      }
   }

   public Action Xqedii_x2agdnc(Xqedii_fwiw7cd var1) {
      if (((-1863186844 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return switch (var1) {
            case ADD -> Action.ADD;
            case REMOVE -> Action.REMOVE;
            case UPDATE_HEALTH -> Action.UPDATE_HEALTH;
            case UPDATE_TITLE -> Action.UPDATE_TITLE;
            case UPDATE_STYLE -> Action.UPDATE_STYLE;
            case UPDATE_FLAGS -> Action.UPDATE_FLAGS;
         };
      }
   }

   public void Xqedii_g93sz97(String var1, Throwable var2) {
      if ((-992395035 * -992395035 - -992395035 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_3rh6pb3.Xqedii_22nea49 != null) {
            this.Xqedii_3rh6pb3.Xqedii_22nea49.getLogger().warning(Xqedii_1gz5c338ewaq1(var1, var2.getMessage()));
         }
      }
   }

   private static /* synthetic */ String Xqedii_1gz5c338ewaq1(String string, String string2) {
        return Xqedii_6pzg5gm.Xqedii_2mb5ncu7h4pfr((String)"HbW76XJu1P5TgTSjmsLsqzXfygn/JCtemdHPK+PLkSN4jqzmwTkSJIkzymJADLRpKNzXJ6e6dsFnMgRkOVUWs1aBCizGpA5EUs7/5/yMZ6HfN13H0NWKAjwWChc=") + string + Xqedii_6pzg5gm.Xqedii_2mb5ncu7h4pfr((String)"24m8d86IXINAtbWQ4f4VMqPVYJIjVKFnP6/iFTKAk10=") + string2;
    }
}
