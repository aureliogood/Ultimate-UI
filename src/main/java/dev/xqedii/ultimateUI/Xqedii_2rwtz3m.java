package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Condition;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_2rwtz3m extends Condition {
   public static final String Xqedii_3dvld1qmqtzic = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<Player> Xqedii_julas6i;
   public Expression<String> Xqedii_2d43alw;
   public int Xqedii_30waat9;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((1643490141 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_julas6i = (Expression) var1[Xqedii_3f05is8.Xqedii_21bkyqfmjwf4w(2055834573, 0)];
         this.Xqedii_30waat9 = var2 / Xqedii_3f05is8.Xqedii_21bkyqfmjwf4w(-2055834570, 2);
         if (var1.length > Xqedii_3f05is8.Xqedii_28nmqasd4oszu(1950030184, 29)) {
            this.Xqedii_2d43alw = (Expression) var1[Xqedii_3f05is8.Xqedii_21bkyqfmjwf4w(-2055834574, 4)];
         }

         this.setNegated(
            ((var2 % Xqedii_3f05is8.Xqedii_3b3s9esvcpfzi(-1000173265, 10) == Xqedii_3f05is8.Xqedii_3b3s9esvcpfzi(1602798874, 3)
               ? Xqedii_3f05is8.Xqedii_28nmqasd4oszu(-2025606762, 25)
               : Xqedii_3f05is8.Xqedii_21bkyqfmjwf4w(2055834573, 12)) != 0)
         );
         return (Xqedii_3f05is8.Xqedii_21bkyqfmjwf4w(-2055834574, 13) != 0);
      }
   }

   public boolean check(Event var1) {
      if ((460121402 ^ 460121402) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         if (var2 != null && this.Xqedii_julas6i != null) {
            String var3 = this.Xqedii_2d43alw == null ? null : (String)this.Xqedii_2d43alw.getSingle(var1);
            return this.Xqedii_julas6i
               .check(
                  var1,
                  var3x -> {
                     if ((-1907907506 ^ -1907907506) != 0) {
                        throw new IllegalStateException();
                     } else if (var3x != null && var3x.isOnline()) {
                        return switch (this.Xqedii_30waat9) {
                            case 0 -> var3 != null && var2.isHovering(var3x, var3);
                            case 1 -> var2.getHoveredElement(var3x) != null;
                            case 2 -> var3 != null && var2.isDragging(var3x) && var3.equals(var2.getDraggedElement(var3x));
                            case 3 -> var2.isDragging(var3x);
                            case 4 -> var2.isLeftMouseHeld(var3x);
                            default -> false;
                         };
                     } else {
                        return (Xqedii_3f05is8.Xqedii_2ms0b87za5mgh(38872948, 6) != 0);
                     }
                  },
                  this.isNegated()
               );
         } else {
            return this.isNegated();
         }
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((1101909620 ^ 1101909620) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2j9l3epve9r77(this.Xqedii_30waat9);
      }
   }

   private static /* synthetic */ String Xqedii_2j9l3epve9r77(int n) {
        return Xqedii_3f05is8.Xqedii_6e396ruxyg4o("EvNndkBBDP14765Pg55l60VH+lRCPfjJq87a7RMLpyYH3vnuhKO4EteiBKUg990Ms7xT2XXJqDsBnWezvnz3XXveFXr5l4l06/9yrEmm8BKbVaXrGYU=") + n;
    }
}
