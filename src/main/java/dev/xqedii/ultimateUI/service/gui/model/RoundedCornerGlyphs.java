package dev.xqedii.ultimateUI.service.gui.model;

import dev.xqedii.ultimateUI.Xqedii_2bhd6x9;
import java.lang.runtime.ObjectMethods;

public record RoundedCornerGlyphs(String all, String topLeft, String topRight, String bottomRight, String bottomLeft) {
   public static final String Xqedii_2qfl3gc08wzlw = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public static RoundedCornerGlyphs uniform(String var0) {
      if ((1535615028 ^ 1535615028) != 0) {
         throw new IllegalStateException();
      } else {
         return new RoundedCornerGlyphs(
            var0,
            Xqedii_2bhd6x9.Xqedii_1inp6d4af5fkm("/7yEBGOihm+KSUinuzFnB6qjrNmLC/1U9WSzqw=="),
            Xqedii_2bhd6x9.Xqedii_1inp6d4af5fkm("/7yEBGOihm+KSUinuzFnB6qjrNmLC/1U9WSzqw=="),
            Xqedii_2bhd6x9.Xqedii_1inp6d4af5fkm("/7yEBGOihm+KSUinuzFnB6qjrNmLC/1U9WSzqw=="),
            Xqedii_2bhd6x9.Xqedii_1inp6d4af5fkm("/7yEBGOihm+KSUinuzFnB6qjrNmLC/1U9WSzqw==")
         );
      }
   }

   @Override

   public String topLeft() {
      if ((-83370522 * -83370522 + -83370522 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.topLeft;
      }
   }

   public String topRight() {
      if (((-2076615277 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.topRight;
      }
   }

   public String bottomRight() {
      if ((986342119 * 986342119 - 986342119 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.bottomRight;
      }
   }

   public String bottomLeft() {
      if ((-1565377053 * (-1565377053 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.bottomLeft;
      }
   }
}
