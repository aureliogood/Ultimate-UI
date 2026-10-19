package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_2p9kytx extends Effect {
   public static final String Xqedii_2r6s3qne73bca = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_37nfx5h;
   public Expression<Player> Xqedii_2eyb9im;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((-974061584 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_37nfx5h = (Expression) var1[Xqedii_861modu.Xqedii_1b0oqqhonwju0(729037926, 31)];
         this.Xqedii_2eyb9im = (Expression) var1[Xqedii_861modu.Xqedii_htn4szvorld0(-431533002, 19)];
         return (Xqedii_861modu.Xqedii_2zlxa5tfkxedf(1114617882, 29) != 0);
      }
   }

   public void execute(Event var1) {
      if ((-555398583 * (-555398583 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_2eyb9im != null && this.Xqedii_37nfx5h != null && Xqedii_1uy3j6u.api() != null) {
         String var2 = (String)this.Xqedii_37nfx5h.getSingle(var1);
         if (var2 != null && !var2.isBlank()) {
            Player[] var3 = (Player[])this.Xqedii_2eyb9im.getArray(var1);
            int var4 = var3.length;

            for (int var5 = Xqedii_861modu.Xqedii_1gs47dj4farm0(1376344316, 13); var5 < var4; var5++) {
               Player var6 = var3[var5];
               if (var6 != null && var6.isOnline()) {
                  Xqedii_1uy3j6u.api().openInput(var6, var2);
               }
            }
         }
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((1048771840 * 1048771840 - 1048771840 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_861modu.Xqedii_25bq6ccf6dbna("2SBn8VBjzapUBM0/5qq5yXps4mc5DiPkRgzd10q/yh6zA8xSoKu1ka5p3yNRSdcHx9p1jPAd4/Hv/tM2O2W5yHw5EF4=");
      }
   }
}
