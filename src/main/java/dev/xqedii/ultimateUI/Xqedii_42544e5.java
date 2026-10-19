package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_42544e5 extends Effect {
   public static final String Xqedii_w2kmajl2ky0z = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_2jov3kg;
   public Expression<Player> Xqedii_1m1u24g;
   public boolean Xqedii_26fdiph;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((-1838597553 ^ -1838597553) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1.length == Xqedii_2upqc2k.Xqedii_3hq56qbwfl24s(-176983461, 23)) {
            this.Xqedii_1m1u24g = (Expression) var1[Xqedii_2upqc2k.Xqedii_2eeaocq0um97l(-1829364015, 11)];
            this.Xqedii_26fdiph = (Xqedii_2upqc2k.Xqedii_ymfvks3ceucd(1319546505, 31) != 0);
         } else {
            this.Xqedii_2jov3kg = (Expression) var1[Xqedii_2upqc2k.Xqedii_35oxk96h3iqps(161139105, 23)];
            this.Xqedii_1m1u24g = (Expression) var1[Xqedii_2upqc2k.Xqedii_3hq56qbwfl24s(-176983461, 0)];
            this.Xqedii_26fdiph = (Xqedii_2upqc2k.Xqedii_3hq56qbwfl24s(-176983461, 7) != 0);
         }

         return (Xqedii_2upqc2k.Xqedii_3hq56qbwfl24s(-176983461, 18) != 0);
      }
   }

   public void execute(Event var1) {
      if ((-970129778 * (-970129778 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_1m1u24g != null && Xqedii_1uy3j6u.api() != null) {
         String var2 = null;
         if (this.Xqedii_26fdiph && this.Xqedii_2jov3kg != null) {
            var2 = (String)this.Xqedii_2jov3kg.getSingle(var1);
         }

         Player[] var3 = (Player[])this.Xqedii_1m1u24g.getArray(var1);
         int var4 = var3.length;

         for (int var5 = Xqedii_2upqc2k.Xqedii_ymfvks3ceucd(1951036725, 18); var5 < var4; var5++) {
            Player var6 = var3[var5];
            if (var6 != null && var6.isOnline()) {
               if (this.Xqedii_26fdiph && var2 != null && !var2.isBlank()) {
                  Xqedii_1uy3j6u.api().closeGui(var6, var2);
               } else {
                  Xqedii_1uy3j6u.api().closeGui(var6);
               }
            }
         }
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((1787832305 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2upqc2k.Xqedii_3nh7c9jfcm3ga("ba2aanFCiCDUTOWf+9YhW/uwMeXJsTdGTpCtNx/Y/2jqnIGrn2wrHs99k7s5DFoo0l+fDJX/dxkIPQ==");
      }
   }
}
