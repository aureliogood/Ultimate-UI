package dev.xqedii.ultimateUI.api;

import dev.xqedii.ultimateUI.Xqedii_2qq6n25;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public record UiElementCreate(String containerId, Map<String, Object> element, int index) {
   public static final String Xqedii_fvzcz9t9sslg = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public UiElementCreate(String var1, Map<String, Object> var2) {
      this(var1, var2, Xqedii_2qq6n25.Xqedii_1tz5uc6b50ub9(266781176, 15));
   }

   public String elementId() {
      if ((646678781 ^ 646678781) != 0) {
         throw new IllegalStateException();
      } else {
         Object var1 = this.element == null ? null : this.element.get(Xqedii_2qq6n25.Xqedii_3b8qtadi3pbdy("vOaiB4WjtatMuqwiY0q20x2CJrPMATzomKvEBuNHYJw="));
         return var1 == null ? Xqedii_2qq6n25.Xqedii_3b8qtadi3pbdy("QhZBpWWWJ/cQUE0x5gUwW1l+8L7QCiTCsduzug==") : String.valueOf(var1).trim();
      }
   }

   @Override

   public Map<String, Object> element() {
      if ((-368932159 * -368932159 - -368932159 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.element;
      }
   }

   public int index() {
      if ((-640878602 * (-640878602 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.index;
      }
   }
}
