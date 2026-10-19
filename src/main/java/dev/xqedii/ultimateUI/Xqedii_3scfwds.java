package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_3scfwds extends SimpleExpression<Number> {
   public static final String Xqedii_1knsxyrwr2nw = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<Player> Xqedii_sqfwmf2;
   public int Xqedii_1cwed3e;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((1990868648 ^ 1990868648) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_sqfwmf2 = (Expression) var1[Xqedii_2iapszy.Xqedii_230ajyhmx64zr(1660965908, 27)];
         this.Xqedii_1cwed3e = var2;
         return (Xqedii_2iapszy.Xqedii_1sgsr59085m2c(840333400, 4) != 0);
      }
   }

   public Number[] get(Event var1) {
      if (((-1839006742 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         Player var3 = this.Xqedii_sqfwmf2 == null ? null : (Player)this.Xqedii_sqfwmf2.getSingle(var1);
         if (var2 != null && var3 != null && var2.isGuiOpen(var3)) {
            double var4 = switch (this.Xqedii_1cwed3e) {
               case 0 -> var2.getCursorX(var3);
               case 1 -> var2.getCursorY(var3);
               case 2 -> var2.getCursorPageX(var3);
               case 3 -> var2.getCursorPageY(var3);
               default -> Double.longBitsToDouble(Xqedii_2iapszy.Xqedii_1t8zn5ycrceks(8983669045866564271L, 49));
            };
            Number[] var6;
            if (Double.isFinite(var4)) {
               var6 = new Number[Xqedii_2iapszy.Xqedii_230ajyhmx64zr(1095151621, 15)];
               var6[Xqedii_2iapszy.Xqedii_230ajyhmx64zr(-1599924222, 14)] = var4;
            } else {
               var6 = null;
            }

            return var6;
         } else {
            return null;
         }
      }
   }

   public boolean isSingle() {
      if (((-291897566 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_2iapszy.Xqedii_3pcgzpvdrciqp(-1527568799, 28) != 0);
      }
   }

   public Class<? extends Number> getReturnType() {
      if ((-485828550 * -485828550 - -485828550 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Number.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((179900364 * 179900364 - 179900364 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_si37cfnvhzcu(this.Xqedii_1cwed3e);
      }
   }

   private static /* synthetic */ String Xqedii_si37cfnvhzcu(int n) {
        return Xqedii_2iapszy.Xqedii_2bjzsz33wwtnk("38ilSk9LKloTVCYPE9l+k5BAgqDfZyA8GdmliOzvRoQXDj70YJ8LdKuZmqEe3mWkt5pulP2AQ0bUE7TIGTG1GlBeqk1LYN0xaTP4LPcN") + n;
    }
}
