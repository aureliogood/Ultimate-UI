package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.event.UltimateUICursorMoveEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIDragEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIEvent;
import org.bukkit.event.Event;

public final class Xqedii_3gtkd0c extends SimpleExpression<Number> {
   public static final String Xqedii_1i4wtdm747oce = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public int Xqedii_355fqh9;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((-1480961219 * -1480961219 - -1480961219 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_355fqh9 = var2;
         return (Xqedii_2pab8ho.Xqedii_22rlgs07eh9ms(1602879244, 14) != 0);
      }
   }

   public Number[] get(Event var1) {
      if ((-537308219 * -537308219 + -537308219 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof UltimateUIEvent var2) {
         Double var3 = switch (this.Xqedii_355fqh9) {
            case 0 -> var2.getPageX();
            case 1 -> var2.getPageY();
            case 2 -> var1 instanceof UltimateUIDragEvent var10 ? var10.getStartX() : null;
            case 3 -> var1 instanceof UltimateUIDragEvent var9 ? var9.getStartY() : null;
            case 4 -> var1 instanceof UltimateUIDragEvent var8 ? var8.getOffsetX() : null;
            case 5 -> var1 instanceof UltimateUIDragEvent var7 ? var7.getOffsetY() : null;
            case 6 -> var1 instanceof UltimateUIDragEvent var11 ? var11.getStepX() : (var1 instanceof UltimateUICursorMoveEvent var6 ? var6.getDeltaX() : null);
            case 7 -> var1 instanceof UltimateUIDragEvent var5 ? var5.getStepY() : (var1 instanceof UltimateUICursorMoveEvent var4 ? var4.getDeltaY() : null);
            default -> null;
         };
         Number[] var12;
         if (var3 == null) {
            var12 = null;
         } else {
            var12 = new Number[Xqedii_2pab8ho.Xqedii_2rnuq2zbdzcui(156171337, 0)];
            var12[Xqedii_2pab8ho.Xqedii_3eyf9xk13z3v1(-2054706217, 31)] = var3;
         }

         return var12;
      } else {
         return null;
      }
   }

   public boolean isSingle() {
      if ((-1954001751 * -1954001751 + -1954001751 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_2pab8ho.Xqedii_2rnuq2zbdzcui(156170312, 10) != 0);
      }
   }

   public Class<? extends Number> getReturnType() {
      if ((1676416388 * 1676416388 - 1676416388 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Number.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((758536759 * 758536759 - 758536759 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1jyj1wpf9fj3i(this.Xqedii_355fqh9);
      }
   }

   private static /* synthetic */ String Xqedii_1jyj1wpf9fj3i(int n) {
        return Xqedii_2pab8ho.Xqedii_tsyp0lpd84oz("UWyi7tqArrTuA+U7UOb00ABgxtvkPHUgHiE20S7Un/BT6udZsP5+Nqz2lsgb5MGWtRZcAQWEy6NKkeAFSog7amnL0b7Nmrb3fXcjcA==") + n;
    }
}
