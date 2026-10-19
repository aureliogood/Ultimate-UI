package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_1nj7p3b extends SimpleExpression<String> {
   public static final String Xqedii_wxyvuuzmma9q = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<Player> Xqedii_14tsbbk;
   public int Xqedii_7ay35r1;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((-77684003 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_7ay35r1 = var2;
         if (var2 == 0) {
            this.Xqedii_14tsbbk = (Expression) var1[Xqedii_1ltv0ia.Xqedii_zmfn2i7mtvj9(-1272627210, 13)];
         }

         return (Xqedii_1ltv0ia.Xqedii_rhwkqee3zvb(1586583894, 13) != 0);
      }
   }

   public String[] get(Event var1) {
      if (((-1674574699 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         if (var2 == null) {
            return null;
         } else {
            List var3;
            if (this.Xqedii_7ay35r1 == 0) {
               Player var4 = this.Xqedii_14tsbbk == null ? null : (Player)this.Xqedii_14tsbbk.getSingle(var1);
               if (var4 == null) {
                  return null;
               }

               var3 = var2.getElementIds(var4);
            } else {
               var3 = var2.listGuis();
            }

            return (String[]) var3.toArray(new String[Xqedii_1ltv0ia.Xqedii_rhwkqee3zvb(1501185509, 7)]);
         }
      }
   }

   public boolean isSingle() {
      if (((1916205609 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1ltv0ia.Xqedii_zmfn2i7mtvj9(-1272627210, 14) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if ((-362398146 * -362398146 - -362398146 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((458829937 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_7ay35r1 == 0
            ? Xqedii_1ltv0ia.Xqedii_1f4ixkr3jov2p("4DKwWFOHM697OoUl82FZGJWdJIuu/33AzhZL/UoWkk7ASH2jBhJCJ4K9U6STLCMhxu+JVvskmtw2XE16flk4FzLVYXTwqDAX")
            : Xqedii_1ltv0ia.Xqedii_1f4ixkr3jov2p("kDN0dMXMLEVfS2FXLFfd+gIHDpJOcVU4935dNnBGU3qbg+qv7jZ0/glSMZ+Ncdoj3q423j5JvH5PmZs/");
      }
   }
}
