package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import java.util.List;
import java.util.Map;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_15m5y32 extends SimpleExpression<Object> {
   public static final String Xqedii_37oaccxhr7wci = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_3mgpmev;
   public Expression<String> Xqedii_13yuvza;
   public Expression<Player> Xqedii_2yqihnm;
   public int Xqedii_7d1kq2t;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((179021848 ^ 179021848) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_7d1kq2t = var2;
         this.Xqedii_3mgpmev = (Expression) var1[Xqedii_2rxmnaj.Xqedii_5b0xjhoqu4vm(-371782655, 27)];
         if (var2 == 0) {
            this.Xqedii_13yuvza = (Expression) var1[Xqedii_2rxmnaj.Xqedii_5b0xjhoqu4vm(505245888, 23)];
            this.Xqedii_2yqihnm = (Expression) var1[Xqedii_2rxmnaj.Xqedii_5b0xjhoqu4vm(-51673600, 26)];
         } else {
            this.Xqedii_2yqihnm = (Expression) var1[Xqedii_2rxmnaj.Xqedii_3q77qbgjau90r(1558537688, 2)];
         }

         return (Xqedii_2rxmnaj.Xqedii_1lulb3nx8to77(747628734, 29) != 0);
      }
   }

   public Object[] get(Event var1) {
      if (((116646671 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         String var3 = this.Xqedii_3mgpmev == null ? null : (String)this.Xqedii_3mgpmev.getSingle(var1);
         Player var4 = this.Xqedii_2yqihnm == null ? null : (Player)this.Xqedii_2yqihnm.getSingle(var1);
         if (var2 != null && var3 != null && var4 != null) {
            Object var5 = switch (this.Xqedii_7d1kq2t) {
               case 0 -> {
                  String var6 = this.Xqedii_13yuvza == null ? null : (String)this.Xqedii_13yuvza.getSingle(var1);
                  yield var6 == null ? null : var2.getElementValue(var4, var3, var6);
               }
               case 1 -> var2.getElementText(var4, var3);
               case 2 -> Xqedii_2d7x8df(var2.getElementPosition(var4, var3), Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(1137646691, 25));
               case 3 -> Xqedii_2d7x8df(var2.getElementPosition(var4, var3), Xqedii_2rxmnaj.Xqedii_5b0xjhoqu4vm(246964239, 30));
               case 4 -> Xqedii_2d7x8df(var2.getElementSize(var4, var3), Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(1137646691, 30));
               case 5 -> Xqedii_2d7x8df(var2.getElementSize(var4, var3), Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(1406082147, 28));
               default -> null;
            };
            if (var5 != null && !(var5 instanceof Map) && !(var5 instanceof List)) {
               Object[] var8 = new Object[Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(63904867, 30)];
               var8[Xqedii_2rxmnaj.Xqedii_1lulb3nx8to77(-922842144, 1)] = var5;
               return var8;
            } else {
               Object[] var7;
               if (var5 == null) {
                  var7 = null;
               } else {
                  var7 = new Object[Xqedii_2rxmnaj.Xqedii_3q77qbgjau90r(1558537688, 6)];
                  var7[Xqedii_2rxmnaj.Xqedii_5b0xjhoqu4vm(1320706063, 30)] = String.valueOf(var5);
               }

               return var7;
            }
         } else {
            return null;
         }
      }
   }

   public static Object Xqedii_2d7x8df(double[] var0, int var1) {
      if ((-1509966898 * -1509966898 - -1509966898 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 != null && var0.length > var1 ? var0[var1] : null;
      }
   }

   public boolean isSingle() {
      if ((507278155 * (507278155 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(1137663075, 14) != 0);
      }
   }

   public Class<?> getReturnType() {
      if ((623339395 * 623339395 + 623339395 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_7d1kq2t == Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(1137646659, 5)
            ? String.class
            : (this.Xqedii_7d1kq2t >= Xqedii_2rxmnaj.Xqedii_1dmx7s2wrloia(1674517603, 28) ? Number.class : Object.class);
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((950391280 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_370wm483a2umo(this.Xqedii_7d1kq2t);
      }
   }

   private static /* synthetic */ String Xqedii_370wm483a2umo(int n) {
        return Xqedii_2rxmnaj.Xqedii_2ev1il4podre("dnZ9NOes1HgZXQxdFyijomaJ0uAXWM3dy+nBZ6T12f6HVkXyAQQySk4d/I5uXzu59dwLB7fAEx2Vv0fHRptlAmi4PsbalHpZm5Z9Anze") + n;
    }
}
