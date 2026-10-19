package dev.xqedii.ultimateUI;

import java.util.Locale;

public enum Xqedii_hme1l2t {
   ITEMSADDER(Xqedii_xfnc0gf.Xqedii_5drd2vu3cxl0("K7Vj0s342GegZ0+kDaGfJOuDA5jkzbPZ7hnkRnaUlqcoCWzWP9gbER5ote2AD+8J")),
   NEXO(Xqedii_xfnc0gf.Xqedii_5drd2vu3cxl0("c1cC5BvlqV9SFq2h8r138iN+UxMyajK5liuH9Iueq5/hVUqm")),
   ORAXEN(Xqedii_xfnc0gf.Xqedii_5drd2vu3cxl0("c92LTsxe1JC9/oyA6zKfZ2u+GJ4Wz5lpQ+qEamVHUNYXImRQATMTJw=="));

   public static final String Xqedii_17q2nmrill1po = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final String pluginName;

   Xqedii_hme1l2t(String var3) {
      this.pluginName = var3;
   }

   public String Xqedii_lho1nuv() {
      if ((45531672 * 45531672 - 45531672 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.pluginName;
      }
   }

   public static Xqedii_hme1l2t Xqedii_3mduzsu(String var0) {
      if ((-40264605 ^ -40264605) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim().toLowerCase(Locale.ROOT);
         Xqedii_hme1l2t[] var2 = values();
         int var3 = var2.length;

         for (int var4 = Xqedii_xfnc0gf.Xqedii_14zs0qfhk0coj(833239686, 27); var4 < var3; var4++) {
            Xqedii_hme1l2t var5 = var2[var4];
            if (var5.pluginName.toLowerCase(Locale.ROOT).equals(var1)) {
               return var5;
            }
         }

         return null;
      }
   }

}
