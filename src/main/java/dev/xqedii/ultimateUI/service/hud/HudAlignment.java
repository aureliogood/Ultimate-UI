package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_gyzqgcs;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Vector;

public abstract class HudAlignment extends HudMovement {
   public static final String Xqedii_3jre2hwlj26rn = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudAlignment(UltimateUI var1) {
      super(var1);
   }

   public TextAlignment getTextAlignment(Entity var1) {
      if (((-2000036431 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         if (var2 != null) {
            return var2.Xqedii_1xdxr33;
         } else if (!(var1 instanceof TextDisplay)) {
            return TextAlignment.CENTER;
         } else if (!var1.hasMetadata(Xqedii_gyzqgcs.Xqedii_32jpmuayeotlk("1OZdD+KFXGcWFg4nWLfO8CJO8IXK6Nyh6Oa8F4fJMLfss+/3ItPijhS387cjFzSfLSCljn+SIos="))) {
            return TextAlignment.CENTER;
         } else {
            String var3 = ((MetadataValue)var1.getMetadata(
                     Xqedii_gyzqgcs.Xqedii_32jpmuayeotlk("1OZdD+KFXGcWFg4nWLfO8CJO8IXK6Nyh6Oa8F4fJMLfss+/3ItPijhS387cjFzSfLSCljn+SIos=")
                  )
                  .get(Xqedii_gyzqgcs.Xqedii_109dovchhx6k2(1004709349, 16)))
               .asString();

            try {
               return TextAlignment.valueOf(var3);
            } catch (IllegalArgumentException var5) {
               return TextAlignment.CENTER;
            }
         }
      }
   }

   public boolean setHudAligned(Entity var1, TextAlignment var2) {
      if ((343648997 * 343648997 + 343648997 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_gyzqgcs.Xqedii_51sh4l8s5asx(611337973, 19) != 0);
      } else {
         int var3 = this.Xqedii_189lv5i(var2);
         int var4 = this.Xqedii_2vu4y2r(var1);
         if (var4 == var3) {
            return (Xqedii_gyzqgcs.Xqedii_51sh4l8s5asx(-1849615404, 21) != 0);
         } else {
            var1.setMetadata(
               Xqedii_gyzqgcs.Xqedii_32jpmuayeotlk("8vW38lUAHvCEPP3+USppZl8s2xXtCDULtGWkC4qnqRB6W50TQMlcLhaF"),
               new FixedMetadataValue(this.Xqedii_rrdyomu, var3)
            );
            Xqedii_2t8d8j4 var5 = this.Xqedii_2jnbe8d(var1);
            if (var5 != null) {
               var5.Xqedii_1wwp4eo = var3;
            }

            Vector var6 = this.getHudLocation(var1);
            if (var6 != null) {
               this.moveHud(var1, var6, Xqedii_gyzqgcs.Xqedii_51sh4l8s5asx(74404423, 31), Xqedii_gyzqgcs.Xqedii_109dovchhx6k2(1004709349, 3));
            }

            return (Xqedii_gyzqgcs.Xqedii_2555tk8gpqvc(622793429, 3) != 0);
         }
      }
   }

   public boolean setTextAlignment(Entity var1, TextAlignment var2) {
      if ((1131897309 * (1131897309 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TextAlignment var3 = this.Xqedii_3r2d8xo(var2);
         Xqedii_2t8d8j4 var4 = this.Xqedii_2jnbe8d(var1);
         if (var4 != null) {
            if (var4.Xqedii_1xdxr33 == var3) {
               return (Xqedii_gyzqgcs.Xqedii_109dovchhx6k2(1004709349, 23) != 0);
            } else {
               var4.Xqedii_1xdxr33 = var3;
               var1.setMetadata(
                  Xqedii_gyzqgcs.Xqedii_32jpmuayeotlk("1OZdD+KFXGcWFg4nWLfO8CJO8IXK6Nyh6Oa8F4fJMLfss+/3ItPijhS387cjFzSfLSCljn+SIos="),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var3.name())
               );
               Player var6 = this.Xqedii_3u2qg5l(var1);
               if (var6 != null) {
                  this.Xqedii_31dtdwb(var6, var4);
               }

               return (Xqedii_gyzqgcs.Xqedii_109dovchhx6k2(1004709093, 8) != 0);
            }
         } else if (var1 instanceof TextDisplay var5) {
            if (this.getTextAlignment(var1) == var3) {
               return (Xqedii_gyzqgcs.Xqedii_t0m4o5qq5pti(-1733936107, 8) != 0);
            } else {
               var5.setAlignment(var3);
               var1.setMetadata(
                  Xqedii_gyzqgcs.Xqedii_32jpmuayeotlk("1OZdD+KFXGcWFg4nWLfO8CJO8IXK6Nyh6Oa8F4fJMLfss+/3ItPijhS387cjFzSfLSCljn+SIos="),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var3.name())
               );
               return (Xqedii_gyzqgcs.Xqedii_2555tk8gpqvc(-1886819694, 10) != 0);
            }
         } else {
            return (Xqedii_gyzqgcs.Xqedii_51sh4l8s5asx(933831554, 6) != 0);
         }
      }
   }
}
