package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.event.UltimateUIDragEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIHoverEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIKeyEvent;
import java.util.Locale;
import org.bukkit.event.Event;

public final class Xqedii_33kiggy extends SimpleExpression<String> {
   public static final String Xqedii_3a6t4at3h34z9 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public int Xqedii_2nklj0r;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((470327756 * 470327756 - 470327756 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2nklj0r = var2;
         return (Xqedii_1hmu1s7.Xqedii_3adxuzwxymmol(870289770, 22) != 0);
      }
   }

   public String[] get(Event var1) {
      if ((-1172906947 * (-1172906947 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = switch (this.Xqedii_2nklj0r) {
            case 0 -> var1 instanceof UltimateUIDragEvent var9 ? var9.getDropBlockId() : null;
            case 1 -> var1 instanceof UltimateUIHoverEvent var8 ? var8.getPreviousBlockId() : null;
            case 2 -> var1 instanceof UltimateUIHoverEvent var7 ? var7.getNextBlockId() : null;
            case 3 -> var1 instanceof UltimateUIKeyEvent var6 ? var6.getKey() : null;
            case 4 -> var1 instanceof UltimateUIDragEvent var5 ? var5.getPhase().name().toLowerCase(Locale.ROOT) : null;
            case 5 -> var1 instanceof UltimateUIHoverEvent var4 ? var4.getAction().name().toLowerCase(Locale.ROOT) : null;
            case 6 -> var1 instanceof UltimateUIDragEvent var3 ? var3.getDropContainerId() : null;
            default -> null;
         };
         String[] var10;
         if (var2 == null) {
            var10 = null;
         } else {
            var10 = new String[Xqedii_1hmu1s7.Xqedii_3adxuzwxymmol(866095978, 9)];
            var10[Xqedii_1hmu1s7.Xqedii_3adxuzwxymmol(866095466, 6)] = var2;
         }

         return var10;
      }
   }

   public boolean isSingle() {
      if ((-1421983267 * -1421983267 + -1421983267 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1hmu1s7.Xqedii_3adxuzwxymmol(866103658, 13) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if ((703161857 * (703161857 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((-1086232945 * (-1086232945 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1773b8u0twvl0(this.Xqedii_2nklj0r);
      }
   }

   private static /* synthetic */ String Xqedii_1773b8u0twvl0(int n) {
        return Xqedii_1hmu1s7.Xqedii_1qda0ogt3lgcu("hrWlbGNQshwi7vvtbci6rvqbf5wwO4bYHSk7m36wuvMPDqqkm8U3a7VjjXvqOBPYxaj0bPwhKBWDVfpShvL8eXVTPtPvox7D") + n;
    }
}
