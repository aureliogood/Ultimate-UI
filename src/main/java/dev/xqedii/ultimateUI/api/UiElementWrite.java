package dev.xqedii.ultimateUI.api;

import dev.xqedii.ultimateUI.Xqedii_3skp8nf;
import java.lang.runtime.ObjectMethods;

public record UiElementWrite(String elementId, String property, Object value, Object secondValue) {
   public static final String Xqedii_10wda9sq50yir = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public static UiElementWrite text(String var0, String var1) {
      if ((5927949 ^ 5927949) != 0) {
         throw new IllegalStateException();
      } else {
         return new UiElementWrite(var0, Xqedii_3skp8nf.Xqedii_2swdnlsluteda("3RJ3sa0UYAfraLmzcs/iaX48A2KQNs8DeLQR8f85nwhx+TTT"), var1, null);
      }
   }

   public static UiElementWrite color(String var0, String var1) {
      if (((181214747 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return new UiElementWrite(var0, Xqedii_3skp8nf.Xqedii_2swdnlsluteda("BbCrg5ISn8V25QirXLZsIsAm993ngiljv/qtFXTy/UFWfiZ3P4A="), var1, null);
      }
   }

   public static UiElementWrite position(String var0, double var1, double var3) {
      if (((-632426392 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return new UiElementWrite(var0, Xqedii_3skp8nf.Xqedii_2swdnlsluteda("yLhWNOKSqVEk/JZJvx9pIXWagvQkcmEL0lN0pIe+qm5z9zB6eEyJEcCzqXc="), var1, var3);
      }
   }

   public static UiElementWrite size(String var0, double var1, double var3) {
      if ((232021417 * 232021417 - 232021417 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new UiElementWrite(var0, Xqedii_3skp8nf.Xqedii_2swdnlsluteda("Gg0XYYXfq+9BG3x3a8Gpp8kesyz+PuZpvw/StGp5IdSkbUMC"), var1, var3);
      }
   }

   public static UiElementWrite value(String var0, String var1, Object var2) {
      if (((-1397162879 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return new UiElementWrite(var0, var1, var2, null);
      }
   }

   @Override

   public String property() {
      if ((-1197330089 * -1197330089 + -1197330089 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.property;
      }
   }

   public Object value() {
      if ((-1542684598 * -1542684598 - -1542684598 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.value;
      }
   }

   public Object secondValue() {
      if ((-186876509 ^ -186876509) != 0) {
         throw new IllegalStateException();
      } else {
         return this.secondValue;
      }
   }
}
