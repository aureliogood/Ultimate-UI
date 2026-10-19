package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_6i046kj;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public final class UltimateUIOpenedEvent extends UltimateUIEvent {
   public static final String Xqedii_25y4j346nq1iw = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_3nfqc8s;
   public final boolean Xqedii_xmmg12i;
   public final boolean Xqedii_2amyfyb;

   public UltimateUIOpenedEvent(Player var1, String var2, boolean var3, boolean var4) {
      super(
         var1,
         var2,
         Xqedii_6i046kj.Xqedii_2vhr03cpmx0ud("4FdIPXoAY2BpbBeerh/szgV7HRqIGgFtEo1gnA=="),
         Double.longBitsToDouble(Xqedii_6i046kj.Xqedii_1dn0q93gmbznh(8089823228003571120L, 35)),
         Double.longBitsToDouble(Xqedii_6i046kj.Xqedii_d5t0hgbm1xva(-2983835268002703765L, 40)),
         Double.longBitsToDouble(Xqedii_6i046kj.Xqedii_2prwj7tkrnudw(-6777050738584424462L, 8)),
         Double.longBitsToDouble(Xqedii_6i046kj.Xqedii_d5t0hgbm1xva(7598867933085394621L, 44))
      );
      this.Xqedii_xmmg12i = var3;
      this.Xqedii_2amyfyb = var4;
   }

   public boolean isHudMode() {
      if (((-2120917326 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_xmmg12i;
      }
   }

   public boolean isAutoClose() {
      if ((1566064861 * 1566064861 - 1566064861 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2amyfyb;
      }
   }

   public HandlerList getHandlers() {
      if (((-406888720 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3nfqc8s;
      }
   }

   public static HandlerList getHandlerList() {
      if ((1387935431 * (1387935431 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3nfqc8s;
      }
   }

   static {
      if ((-263000969 * -263000969 + -263000969 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3nfqc8s = new HandlerList();
      }
   }
}
