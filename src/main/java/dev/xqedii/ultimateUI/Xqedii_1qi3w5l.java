package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.event.UltimateUIInputSubmitEvent;
import org.bukkit.event.Event;

public final class Xqedii_1qi3w5l extends SimpleExpression<String> {
   public static final String Xqedii_ayrklw5tpvxc = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public int Xqedii_qssm567;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((776272831 * 776272831 - 776272831 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_qssm567 = var2;
         return (Xqedii_1qgti9q.Xqedii_1ydwke2xmunls(310137017, 0) != 0);
      }
   }

   public String[] get(Event var1) {
      if (((-140440013 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof UltimateUIInputSubmitEvent var2) {
         String var3 = switch (this.Xqedii_qssm567) {
            case 0 -> var2.getValue();
            case 1 -> var2.getInputId();
            case 2 -> var2.getPreviousValue();
            case 3 -> var2.getVariable();
            default -> null;
         };
         String[] var4;
         if (var3 == null) {
            var4 = null;
         } else {
            var4 = new String[Xqedii_1qgti9q.Xqedii_1ydwke2xmunls(310137008, 3)];
            var4[Xqedii_1qgti9q.Xqedii_1g4nphcpew4li(-1564283795, 1)] = var3;
         }

         return var4;
      } else {
         return null;
      }
   }

   public boolean isSingle() {
      if ((-1543205238 * -1543205238 - -1543205238 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1qgti9q.Xqedii_3sj5mjeoo345d(1283496193, 14) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if (((-1356778723 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((-607302095 ^ -607302095) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1x7gt2gutd1yn(this.Xqedii_qssm567);
      }
   }

   private static /* synthetic */ String Xqedii_1x7gt2gutd1yn(int n) {
        return Xqedii_1qgti9q.Xqedii_2wpr66arhax4r("PKhbvUwLJfN60GLTxZOHYYHS1IF8ZCyDmlC1CHhyDIQYByG7lQ4B5ZWesQ9roDO+xawEbYN/aUtX1/dmiaalXx/nkalQSWcyGTr8zclXhneS3QLMJQI=") + n;
    }
}
