package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_nmobld0;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public final class UltimateUIHoverEvent extends UltimateUIEvent {
   public static final String Xqedii_2tyn86uv47xay = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_2yeeqgu;
   public final UltimateUIHoverEvent.Action Xqedii_33yj8ye;
   public final String Xqedii_165402k;

   public UltimateUIHoverEvent(
      Player var1, String var2, String var3, String var4, UltimateUIHoverEvent.Action var5, double var6, double var8, double var10, double var12
   ) {
      super(var1, var2, var3, var6, var8, var10, var12);
      this.Xqedii_33yj8ye = var5 == null ? UltimateUIHoverEvent.Action.ENTER : var5;
      this.Xqedii_165402k = var4 == null ? Xqedii_nmobld0.Xqedii_3an818njlvhm8("rFG1nXr/NrhUPvBma8kxKU764HWWgJY48C5oCw==") : var4;
   }

   public UltimateUIHoverEvent.Action getAction() {
      if ((-1504816217 * -1504816217 - -1504816217 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_33yj8ye;
      }
   }

   public boolean isEnter() {
      if (((-128130163 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_33yj8ye == UltimateUIHoverEvent.Action.ENTER
            ? Xqedii_nmobld0.Xqedii_109t7q357urhc(-1740110710, 3)
            : Xqedii_nmobld0.Xqedii_nscxbdzt34d6(1050632368, 27)) != 0);
      }
   }

   public boolean isLeave() {
      if (((308725570 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_33yj8ye == UltimateUIHoverEvent.Action.LEAVE
            ? Xqedii_nmobld0.Xqedii_nscxbdzt34d6(-1050632369, 3)
            : Xqedii_nmobld0.Xqedii_3629ve2ou1w32(294158446, 23)) != 0);
      }
   }

   public String getPreviousBlockId() {
      if ((1618828753 * 1618828753 + 1618828753 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_33yj8ye == UltimateUIHoverEvent.Action.ENTER ? this.Xqedii_165402k : this.getBlockId();
      }
   }

   public String getNextBlockId() {
      if ((166574147 * (166574147 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_33yj8ye == UltimateUIHoverEvent.Action.LEAVE ? this.Xqedii_165402k : this.getBlockId();
      }
   }

   public HandlerList getHandlers() {
      if ((-1583419436 * (-1583419436 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2yeeqgu;
      }
   }

   public static HandlerList getHandlerList() {
      if ((-145346937 * -145346937 + -145346937 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2yeeqgu;
      }
   }

   static {
      if ((-1195724793 * -1195724793 - -1195724793 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2yeeqgu = new HandlerList();
      }
   }

   public static enum Action {
      ENTER,
      LEAVE;
      public static final String Xqedii_8o2etc4z4bnx = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   }
}
