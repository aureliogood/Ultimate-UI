package dev.xqedii.ultimateUI.service.bossbar;

import dev.xqedii.ultimateUI.Xqedii_s7u76or;

public final class BossbarEntityRect {
   public static final String Xqedii_29stqn4qps3af = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final double left;
   public final double top;
   public final double right;
   public final double bottom;
   public final double layer;

   public BossbarEntityRect(double var1, double var3, double var5, double var7, double var9) {
      this.left = var1;
      this.top = var3;
      this.right = var5;
      this.bottom = var7;
      this.layer = var9;
   }

   public boolean Xqedii_2m8wxtt(double var1, double var3, double var5, double var7) {
      if ((1832927303 ^ 1832927303) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.left < var5 && var1 < this.right && this.top < var7 && var3 < this.bottom
            ? Xqedii_s7u76or.Xqedii_1qbzm9yq5tm0m(1829421772, 18)
            : Xqedii_s7u76or.Xqedii_2xjw54uuwzmbp(-2084671605, 2)) != 0);
      }
   }

   public long Xqedii_1v4u8on() {
      if (((1229453676 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         long var1 = Double.doubleToLongBits(this.left);
         var1 = Xqedii_s7u76or.Xqedii_15truuz7xbmu1(2329709826535980438L, 23) * var1 + Double.doubleToLongBits(this.top);
         var1 = Xqedii_s7u76or.Xqedii_15truuz7xbmu1(-1391327896450923697L, 10) * var1 + Double.doubleToLongBits(this.right);
         var1 = Xqedii_s7u76or.Xqedii_l9ueflghz60f(-1741639664863769169L, 15) * var1 + Double.doubleToLongBits(this.bottom);
         return Xqedii_s7u76or.Xqedii_1urewgg9suikz(-4363693000612145606L, 31) * var1 + Double.doubleToLongBits(this.layer);
      }
   }
}
