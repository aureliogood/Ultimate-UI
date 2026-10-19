package dev.xqedii.ultimateUI.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public final class UltimateUICursorMoveEvent extends UltimateUIEvent {
   public static final String Xqedii_3iqpd4fcxzn9a = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_33hm8p4;
   public final double Xqedii_1ss6n8k;
   public final double Xqedii_2ur6nvf;

   public UltimateUICursorMoveEvent(Player var1, String var2, String var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      super(var1, var2, var3, var4, var6, var8, var10);
      this.Xqedii_1ss6n8k = Double.isFinite(var12) ? var12 : var8;
      this.Xqedii_2ur6nvf = Double.isFinite(var14) ? var14 : var10;
   }

   public double getPreviousPageX() {
      if ((-295693635 * -295693635 + -295693635 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1ss6n8k;
      }
   }

   public double getPreviousPageY() {
      if (((-288036495 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2ur6nvf;
      }
   }

   public double getDeltaX() {
      if ((1447199627 * 1447199627 + 1447199627 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.getPageX() - this.Xqedii_1ss6n8k;
      }
   }

   public double getDeltaY() {
      if (((-291057979 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.getPageY() - this.Xqedii_2ur6nvf;
      }
   }

   public HandlerList getHandlers() {
      if (((-1586854306 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_33hm8p4;
      }
   }

   public static HandlerList getHandlerList() {
      if ((625827352 ^ 625827352) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_33hm8p4;
      }
   }

   static {
      if ((26053755 * (26053755 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_33hm8p4 = new HandlerList();
      }
   }
}
