package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_1rsl7ax;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

public abstract class UltimateUIEvent extends PlayerEvent {
   public static final String Xqedii_1cgioylppeysf = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final String Xqedii_mdqxjid;
   public final String Xqedii_dgx823c;
   public final double Xqedii_2g02juh;
   public final double Xqedii_j7yng1x;
   public final double Xqedii_30r4mdz;
   public final double Xqedii_2kdig41;

   public UltimateUIEvent(Player var1, String var2, String var3, double var4, double var6, double var8, double var10) {
      super(var1);
      this.Xqedii_mdqxjid = var2 == null ? Xqedii_1rsl7ax.Xqedii_30h87jyj24la4("J9seAh+iSrGgBM7HzoEWUOS5y82UV9tmFUuMGw==") : var2;
      this.Xqedii_dgx823c = var3 == null ? Xqedii_1rsl7ax.Xqedii_30h87jyj24la4("J9seAh+iSrGgBM7HzoEWUOS5y82UV9tmFUuMGw==") : var3;
      this.Xqedii_2g02juh = finite(var4);
      this.Xqedii_j7yng1x = finite(var6);
      this.Xqedii_30r4mdz = finite(var8);
      this.Xqedii_2kdig41 = finite(var10);
   }

   public String getPageName() {
      if ((1377662566 * 1377662566 + 1377662566 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_mdqxjid;
      }
   }

   public String getBlockId() {
      if (((1593736017 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_dgx823c;
      }
   }

   public boolean hasBlock() {
      if ((361344467 * 361344467 + 361344467 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((!this.Xqedii_dgx823c.isEmpty()
            ? Xqedii_1rsl7ax.Xqedii_1z0lt00opc16v(884882771, 26)
            : Xqedii_1rsl7ax.Xqedii_71rfpatvahv2(-1411146995, 24)) != 0);
      }
   }

   public double getCursorX() {
      if ((-1292218964 * -1292218964 + -1292218964 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2g02juh;
      }
   }

   public double getCursorY() {
      if ((1494304227 * 1494304227 - 1494304227 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_j7yng1x;
      }
   }

   public double getPageX() {
      if ((472822895 * 472822895 + 472822895 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_30r4mdz;
      }
   }

   public double getPageY() {
      if ((-635637062 * (-635637062 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2kdig41;
      }
   }

   public static double finite(double var0) {
      if ((-1452330890 ^ -1452330890) != 0) {
         throw new IllegalStateException();
      } else {
         return Double.isFinite(var0) ? var0 : Double.longBitsToDouble(Xqedii_1rsl7ax.Xqedii_blv3146z405t(-1071700253024879029L, 8));
      }
   }
}
