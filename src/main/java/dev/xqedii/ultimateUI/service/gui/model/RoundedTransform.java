package dev.xqedii.ultimateUI.service.gui.model;

import java.lang.runtime.ObjectMethods;

public record RoundedTransform(double rotationDeg, boolean mirrorX, boolean mirrorY, double pivotX, double pivotY) {
   public static final String Xqedii_xwa4266ffpoy = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   @Override

   public boolean mirrorX() {
      if (((817962637 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.mirrorX;
      }
   }

   public boolean mirrorY() {
      if (((-1843056853 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.mirrorY;
      }
   }

   public double pivotX() {
      if ((-1274534599 ^ -1274534599) != 0) {
         throw new IllegalStateException();
      } else {
         return this.pivotX;
      }
   }

   public double pivotY() {
      if ((118579356 * (118579356 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.pivotY;
      }
   }
}
