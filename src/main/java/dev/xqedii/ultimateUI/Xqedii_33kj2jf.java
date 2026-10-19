package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_33kj2jf extends Effect {
   public static final String Xqedii_1e3k5gip090fv = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_2iq8412;
   public Expression<Player> Xqedii_2ertb3c;
   public int Xqedii_2zi86wf;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((565054715 ^ 565054715) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2iq8412 = (Expression) var1[Xqedii_2oui423.Xqedii_1ejremg5pu4od(1758730997, 20)];
         this.Xqedii_2ertb3c = (Expression) var1[Xqedii_2oui423.Xqedii_1ejremg5pu4od(1758730869, 7)];
         this.Xqedii_2zi86wf = var2;
         return (Xqedii_2oui423.Xqedii_1lna8y53054hm(-2040631851, 4) != 0);
      }
   }

   public void execute(Event var1) {
      if (((-684727068 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         String var3 = this.Xqedii_2iq8412 == null ? null : (String)this.Xqedii_2iq8412.getSingle(var1);
         if (var2 != null && var3 != null && !var3.isBlank() && this.Xqedii_2ertb3c != null) {
            Player[] var4 = (Player[])this.Xqedii_2ertb3c.getArray(var1);
            int var5 = var4.length;

            for (int var6 = Xqedii_2oui423.Xqedii_1lna8y53054hm(2040631850, 31); var6 < var5; var6++) {
               Player var7 = var4[var6];
               if (var7 != null && var7.isOnline()) {
                  switch (this.Xqedii_2zi86wf) {
                     case 0:
                        var2.showElement(var7, var3);
                        break;
                     case 1:
                        var2.hideElement(var7, var3);
                        break;
                     case 2:
                        var2.setElementDraggable(var7, var3, (Xqedii_2oui423.Xqedii_1ejremg5pu4od(1758730993, 2) != 0));
                        break;
                     case 3:
                        var2.setElementDraggable(var7, var3, (Xqedii_2oui423.Xqedii_1ejremg5pu4od(1758730997, 27) != 0));
                        break;
                     case 4:
                        var2.clickElement(var7, var3);
                  }
               }
            }
         }
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((-376856856 * -376856856 + -376856856 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_12i7o833bb92(this.Xqedii_2zi86wf);
      }
   }

   private static /* synthetic */ String Xqedii_12i7o833bb92(int n) {
        return Xqedii_2oui423.Xqedii_2oejzutgubf3h("C2ZaDHwCshfjf9e2fv75SeoF9unrWJpx+6uDOVj6pY7xCifpna4r9pfvun8Kjzf4Wd6JyIkRa7eCFTsHcv/+lV1sDFZTtGk/KPwOZq6KLLlUaQ==") + n;
    }
}
