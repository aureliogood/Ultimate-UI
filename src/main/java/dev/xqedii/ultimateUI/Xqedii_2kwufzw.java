package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_2kwufzw extends SimpleExpression<String> {
   public static final String Xqedii_3dc3hqaarkhoh = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<Player> Xqedii_2sifsf7;
   public int Xqedii_178b1yk;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((530254763 ^ 530254763) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2sifsf7 = (Expression) var1[Xqedii_1gx18br.Xqedii_3l820b3waue73(-456953411, 17)];
         this.Xqedii_178b1yk = var2;
         return (Xqedii_1gx18br.Xqedii_1t65y1k4hdmnv(18610193, 10) != 0);
      }
   }

   public String[] get(Event var1) {
      if ((830759858 ^ 830759858) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         Player var3 = this.Xqedii_2sifsf7 == null ? null : (Player)this.Xqedii_2sifsf7.getSingle(var1);
         if (var2 != null && var3 != null) {
            String var4 = switch (this.Xqedii_178b1yk) {
               case 0 -> var2.getHoveredElement(var3);
               case 1 -> var2.getDraggedElement(var3);
               case 2 -> var2.getOpenGuiName(var3);
               default -> null;
            };
            String[] var5;
            if (var4 != null && !var4.isEmpty()) {
               var5 = new String[Xqedii_1gx18br.Xqedii_3l820b3waue73(-456952899, 9)];
               var5[Xqedii_1gx18br.Xqedii_342dnqmpb4kt3(-405362130, 18)] = var4;
            } else {
               var5 = null;
            }

            return var5;
         } else {
            return null;
         }
      }
   }

   public boolean isSingle() {
      if ((1858608885 * 1858608885 - 1858608885 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1gx18br.Xqedii_3p8u4saeaf16z(-1414282755, 25) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if ((1239244926 * 1239244926 - 1239244926 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((787721081 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_18jpqerdl7411(this.Xqedii_178b1yk);
      }
   }

   private static /* synthetic */ String Xqedii_18jpqerdl7411(int n) {
        return Xqedii_1gx18br.Xqedii_1s2bd8c1j2wal("DOgknKdCiRvazhxJXsv10Vbwa7SaVIt3v5Ax1QEvoJUZgcuZjPIQ7peDpBlSV2FxUKySmohSnbmwkllAmt5A8HfTpkUCBfWtuQ4=") + n;
    }
}
