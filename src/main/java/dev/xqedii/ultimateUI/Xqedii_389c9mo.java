package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Condition;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_389c9mo extends Condition {
   public static final String Xqedii_1hilta232bgkk = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<Player> Xqedii_12ixhnj;
   public Expression<String> Xqedii_2k49jsl;
   public boolean Xqedii_307e12p;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((2144215335 * (2144215335 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_12ixhnj = (Expression) var1[Xqedii_2mwaltz.Xqedii_mrbkfc692jho(-457583680, 25)];
         boolean var5 = this.Xqedii_307e12p = var2 >= Xqedii_2mwaltz.Xqedii_2zppoj3l6mf1b(-1138116030, 13);
         if (this.Xqedii_307e12p) {
            this.Xqedii_2k49jsl = (Expression) var1[Xqedii_2mwaltz.Xqedii_20l5vxmfrdzrs(-1348214722, 27)];
         }

         this.setNegated(
            ((var2 != Xqedii_2mwaltz.Xqedii_2zppoj3l6mf1b(1989193482, 27) && var2 != Xqedii_2mwaltz.Xqedii_2zppoj3l6mf1b(1468347208, 10)
               ? Xqedii_2mwaltz.Xqedii_20l5vxmfrdzrs(1348214721, 10)
               : Xqedii_2mwaltz.Xqedii_mrbkfc692jho(-848058495, 26)) != 0)
         );
         return (Xqedii_2mwaltz.Xqedii_mrbkfc692jho(-1058620973, 17) != 0);
      }
   }

   public boolean check(Event var1) {
      if (((852195344 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_12ixhnj != null && Xqedii_1uy3j6u.Xqedii_1xlslkp() != null) {
         String var2 = this.Xqedii_307e12p && this.Xqedii_2k49jsl != null ? (String)this.Xqedii_2k49jsl.getSingle(var1) : null;
         Player[] var3 = (Player[])this.Xqedii_12ixhnj.getArray(var1);
         int var4 = var3.length;

         for (int var5 = Xqedii_2mwaltz.Xqedii_mrbkfc692jho(1268595726, 29); var5 < var4; var5++) {
            Player var6 = var3[var5];
            if (var6 != null && var6.isOnline()) {
               int var7;
               if (this.Xqedii_307e12p) {
                  if (var2 != null && !var2.isBlank()) {
                     String var8 = Xqedii_1uy3j6u.Xqedii_1xlslkp().getGuiService() != null
                        ? Xqedii_1uy3j6u.Xqedii_1xlslkp().getGuiService().getActiveGuiName(var6)
                        : null;
                     var7 = var8 != null && var8.equalsIgnoreCase(var2.trim())
                        ? Xqedii_2mwaltz.Xqedii_2taj75zsyer90(841414612, 29)
                        : Xqedii_2mwaltz.Xqedii_2taj75zsyer90(304543700, 21);
                  } else {
                     var7 = Xqedii_2mwaltz.Xqedii_2zppoj3l6mf1b(-192579501, 30);
                  }
               } else {
                  var7 = Xqedii_1uy3j6u.Xqedii_1xlslkp().getGuiService() != null && Xqedii_1uy3j6u.Xqedii_1xlslkp().getGuiService().hasOpenSession(var6)
                     ? Xqedii_2mwaltz.Xqedii_2zppoj3l6mf1b(-316580332, 28)
                     : Xqedii_2mwaltz.Xqedii_2zppoj3l6mf1b(-48144876, 28);
               }

               if (this.isNegated() != (var7 != 0)) {
                  return (Xqedii_2mwaltz.Xqedii_2taj75zsyer90(270989268, 25) != 0);
               }
            }
         }

         return (Xqedii_2mwaltz.Xqedii_20l5vxmfrdzrs(1348214721, 10) != 0);
      } else {
         return this.isNegated();
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((-1395646466 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2mwaltz.Xqedii_3qca2wiljiggi(
            "mbabJ1WJgDqPNrV0kOwBr73JYgqSKFEaf2glqw3A33MXViONFvuRi5l8POndV5uFfcAC4PYxOm70IVfNvoC2XzmvdyFdva2LOKQ4G1pUFIEGYr+K"
         );
      }
   }
}
