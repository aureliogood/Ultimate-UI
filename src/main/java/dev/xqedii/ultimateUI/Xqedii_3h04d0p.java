package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_3h04d0p extends Effect {
   public static final String Xqedii_2i7kt8p9sbqxt = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_3nnevpb;
   public Expression<Player> Xqedii_3esd7br;
   public boolean Xqedii_1k1m95i;
   public boolean Xqedii_3hn3nj0;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((727023598 * (727023598 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3nnevpb = (Expression) var1[Xqedii_x1kuiej.Xqedii_3gi9jln5bgc2o(-983401405, 18)];
         this.Xqedii_3esd7br = (Expression) var1[Xqedii_x1kuiej.Xqedii_e9bgqqxv3cw5(-1065196520, 4)];
         switch (var2) {
            case 1:
               this.Xqedii_1k1m95i = (Xqedii_x1kuiej.Xqedii_2ts11ydlox4d6(663340383, 23) != 0);
               break;
            case 2:
               this.Xqedii_3hn3nj0 = (Xqedii_x1kuiej.Xqedii_e9bgqqxv3cw5(103817369, 26) != 0);
               break;
            case 3:
            case 4:
               this.Xqedii_3hn3nj0 = (Xqedii_x1kuiej.Xqedii_37plutzfbkecn(2054488790, 7) != 0);
               this.Xqedii_1k1m95i = (Xqedii_x1kuiej.Xqedii_2ts11ydlox4d6(-226976683, 19) != 0);
               break;
            default:
               this.Xqedii_1k1m95i = (Xqedii_x1kuiej.Xqedii_3gi9jln5bgc2o(-983401405, 0) != 0);
               this.Xqedii_3hn3nj0 = (Xqedii_x1kuiej.Xqedii_37plutzfbkecn(-2054488791, 30) != 0);
         }

         return (Xqedii_x1kuiej.Xqedii_e9bgqqxv3cw5(839671873, 19) != 0);
      }
   }

   public void execute(Event var1) {
      if ((1800993226 * (1800993226 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3nnevpb != null && this.Xqedii_3esd7br != null) {
         String var2 = (String)this.Xqedii_3nnevpb.getSingle(var1);
         if (var2 != null && !var2.isBlank()) {
            Player[] var3 = (Player[])this.Xqedii_3esd7br.getArray(var1);
            int var4 = var3.length;

            for (int var5 = Xqedii_x1kuiej.Xqedii_37plutzfbkecn(-2054488791, 20); var5 < var4; var5++) {
               Player var6 = var3[var5];
               if (var6 != null && var6.isOnline() && Xqedii_1uy3j6u.api() != null) {
                  Xqedii_1uy3j6u.api().openGui(var6, var2, this.Xqedii_1k1m95i, this.Xqedii_3hn3nj0);
               }
            }
         }
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((794400124 * 794400124 - 794400124 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_x1kuiej.Xqedii_257ehj7e8qw7x("FMjJlBdICdByCjRUXSwnsbgP8meJ7V3VzDLJXTgKLB/A+eK5fasu1iYDWjKHEwqnuRE3t5XBSZE=");
      }
   }
}
