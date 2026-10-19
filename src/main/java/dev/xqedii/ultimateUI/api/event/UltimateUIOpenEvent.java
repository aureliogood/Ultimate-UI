package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_1v15wt0;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public final class UltimateUIOpenEvent extends UltimateUIEvent implements Cancellable {
   public static final String Xqedii_u477nyr9ryo8 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_1ncxpyj;
   public final boolean Xqedii_25pmirb;
   public final boolean Xqedii_1021bnd;
   public boolean Xqedii_mdyzdlm;

   public UltimateUIOpenEvent(Player var1, String var2, boolean var3, boolean var4) {
      super(
         var1,
         var2,
         Xqedii_1v15wt0.Xqedii_202trwmha0pne("AAzZxetdxGYCawndwhd5Vkr+c4+PsE1r2ktqzQ=="),
         Double.longBitsToDouble(Xqedii_1v15wt0.Xqedii_3f6w6bu4hhlge(-5377588016662115765L, 11)),
         Double.longBitsToDouble(Xqedii_1v15wt0.Xqedii_2mdq2faarb02c(-2000822351707779266L, 19)),
         Double.longBitsToDouble(Xqedii_1v15wt0.Xqedii_1d9jb7rgdp1zd(408169993077502363L, 15)),
         Double.longBitsToDouble(Xqedii_1v15wt0.Xqedii_3f6w6bu4hhlge(-5377588016662115765L, 50))
      );
      this.Xqedii_25pmirb = var3;
      this.Xqedii_1021bnd = var4;
   }

   public boolean isHudMode() {
      if (((776493995 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_25pmirb;
      }
   }

   public boolean isAutoClose() {
      if ((387629962 * 387629962 + 387629962 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1021bnd;
      }
   }

   public boolean isCancelled() {
      if (((1189808812 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_mdyzdlm;
      }
   }

   public void setCancelled(boolean var1) {
      if ((-795014948 * -795014948 - -795014948 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_mdyzdlm = var1;
      }
   }

   public HandlerList getHandlers() {
      if ((-624650377 * (-624650377 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1ncxpyj;
      }
   }

   public static HandlerList getHandlerList() {
      if ((-1072464120 * -1072464120 + -1072464120 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1ncxpyj;
      }
   }

   static {
      if (((-1464611766 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1ncxpyj = new HandlerList();
      }
   }
}
