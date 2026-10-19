package dev.xqedii.ultimateUI.service.gui.model;

import dev.xqedii.ultimateUI.Xqedii_1f8qxj7;

public final class EditorRect {
   public static final String Xqedii_2r3x3bpact43i = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final double x;
   public final double y;
   public final double width;
   public final double height;

   public EditorRect(double var1, double var3, double var5, double var7) {
      this.x = var1;
      this.y = var3;
      this.width = Math.max(Double.longBitsToDouble(Xqedii_1f8qxj7.Xqedii_28mqj4cpjqta4(8334761444833190429L, 11)), var5);
      this.height = Math.max(Double.longBitsToDouble(Xqedii_1f8qxj7.Xqedii_10xxrry392ksy(-9016536239148760336L, 58)), var7);
   }

   public double maxX() {
      if ((-221829158 * (-221829158 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.x + this.width;
      }
   }

   public double maxY() {
      if ((-350856233 ^ -350856233) != 0) {
         throw new IllegalStateException();
      } else {
         return this.y + this.height;
      }
   }

   public boolean contains(double var1, double var3) {
      if ((1227999275 ^ 1227999275) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 >= this.x && var1 <= this.maxX() && var3 >= this.y && var3 <= this.maxY()
            ? Xqedii_1f8qxj7.Xqedii_smyk2liunors(348727740, 0)
            : Xqedii_1f8qxj7.Xqedii_t4czll9zbup6(1785715845, 25)) != 0);
      }
   }
}
