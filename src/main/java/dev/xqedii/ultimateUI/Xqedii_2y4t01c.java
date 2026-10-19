package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Condition;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_2y4t01c extends Condition {
   public static final String Xqedii_1bjecw4czmfoc = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_w9yhq25;
   public Expression<Player> Xqedii_3c8f0fi;
   public int Xqedii_57zvwdi;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((1439955832 * (1439955832 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_w9yhq25 = (Expression) var1[Xqedii_kqeqdps.Xqedii_1i68g3hfo6u12(1381501888, 12)];
         this.Xqedii_3c8f0fi = (Expression) var1[Xqedii_kqeqdps.Xqedii_1ct2nulntom26(-1932711652, 9)];
         this.Xqedii_57zvwdi = var2 / Xqedii_kqeqdps.Xqedii_1zctiekm4l771(-847060092, 14);
         this.setNegated(
            ((var2 % Xqedii_kqeqdps.Xqedii_2vfxigeyrtt74(-1263513762, 28) == Xqedii_kqeqdps.Xqedii_1zctiekm4l771(322308750, 8)
               ? Xqedii_kqeqdps.Xqedii_2vfxigeyrtt74(-1531949218, 19)
               : Xqedii_kqeqdps.Xqedii_1i68g3hfo6u12(1381501888, 31)) != 0)
         );
         return (Xqedii_kqeqdps.Xqedii_1i68g3hfo6u12(1380977600, 19) != 0);
      }
   }

   public boolean check(Event var1) {
      if ((-1451738500 * -1451738500 - -1451738500 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         String var3 = this.Xqedii_w9yhq25 == null ? null : (String)this.Xqedii_w9yhq25.getSingle(var1);
         return var2 != null && var3 != null && this.Xqedii_3c8f0fi != null ? this.Xqedii_3c8f0fi.check(var1, var3x -> {
            if ((196905814 * 196905814 + 196905814 & 1) != 0) {
               throw new IllegalStateException();
            } else if (var3x != null && var3x.isOnline()) {
               return (switch (this.Xqedii_57zvwdi) {
                  case 0 -> var2.isElementVisible(var3x, var3);
                  case 1 -> var2.hasElement(var3x, var3);
                  case 2 -> var2.isElementDraggable(var3x, var3);
                  default -> false;
               });
            } else {
               return (Xqedii_kqeqdps.Xqedii_1ct2nulntom26(-1717214319, 14) != 0);
            }
         }, this.isNegated()) : this.isNegated();
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((873921585 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_5aiiafvuj0wj(this.Xqedii_57zvwdi);
      }
   }

   private static /* synthetic */ String Xqedii_5aiiafvuj0wj(int n) {
        return Xqedii_kqeqdps.Xqedii_1kli4tch65sxa("pnWB6xH6tpe9MzqFzr9A6D4j9Q7vogIGzt6EZ/LmkvGZJwkQIHXVFCGEd9fI/qLWifgmJBu9+VVIe4o2hnHKsNBGib/TLTRKxSL31OyUxyTFCpwA32c=") + n;
    }
}
