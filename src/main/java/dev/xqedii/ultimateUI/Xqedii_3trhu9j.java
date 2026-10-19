package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_3trhu9j extends SimpleExpression<Object> {
   public static final String Xqedii_qhyrt8ef5us2 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_22fmk7q;
   public Expression<Player> Xqedii_3lhpczu;
   public int Xqedii_20muzvm;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((311787413 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_20muzvm = var2;
         this.Xqedii_22fmk7q = (Expression) var1[Xqedii_y2ppbml.Xqedii_2fo5np48jvfg9(-134537283, 21)];
         this.Xqedii_3lhpczu = (Expression) var1[Xqedii_y2ppbml.Xqedii_3dijhofxpppgn(-1854168732, 14)];
         return (Xqedii_y2ppbml.Xqedii_4h58vvmrupdl(-1390548852, 27) != 0);
      }
   }

   public Object[] get(Event var1) {
      if ((-1081002528 ^ -1081002528) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         String var3 = this.Xqedii_22fmk7q == null ? null : (String)this.Xqedii_22fmk7q.getSingle(var1);
         Player var4 = this.Xqedii_3lhpczu == null ? null : (Player)this.Xqedii_3lhpczu.getSingle(var1);
         if (var2 != null && var3 != null && var4 != null) {
            Object[] var10000;
            switch (this.Xqedii_20muzvm) {
               case 0:
                  String var7 = var2.getElementParent(var4, var3);
                  if (var7 == null) {
                     var10000 = null;
                  } else {
                     var10000 = new Object[Xqedii_y2ppbml.Xqedii_2fo5np48jvfg9(-2119042081, 25)];
                     var10000[Xqedii_y2ppbml.Xqedii_2fo5np48jvfg9(-1076298257, 24)] = var7;
                  }
                  break;
               case 1:
                  var10000 = var2.getElementChildren(var4, var3).toArray(new Object[Xqedii_y2ppbml.Xqedii_3dijhofxpppgn(-1854152348, 14)]);
                  break;
               case 2:
                  int var6 = var2.getElementIndex(var4, var3);
                  if (var6 < 0) {
                     var10000 = null;
                  } else {
                     var10000 = new Object[Xqedii_y2ppbml.Xqedii_2fo5np48jvfg9(-940605946, 3)];
                     var10000[Xqedii_y2ppbml.Xqedii_2fo5np48jvfg9(2113849327, 19)] = var6 + Xqedii_y2ppbml.Xqedii_pcozdfc95hjb(-512529210, 2);
                  }
                  break;
               case 3:
                  String var5 = var2.getListContainer(var4, var3);
                  if (var5 == null) {
                     var10000 = null;
                  } else {
                     var10000 = new Object[Xqedii_y2ppbml.Xqedii_3dijhofxpppgn(-1854168732, 14)];
                     var10000[Xqedii_y2ppbml.Xqedii_3dijhofxpppgn(-1854152348, 31)] = var5;
                  }
                  break;
               default:
                  var10000 = null;
            }

            return var10000;
         } else {
            return null;
         }
      }
   }

   public boolean isSingle() {
      if ((-1630397742 * -1630397742 + -1630397742 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_20muzvm != Xqedii_y2ppbml.Xqedii_3dijhofxpppgn(-1853890204, 18)
            ? Xqedii_y2ppbml.Xqedii_4h58vvmrupdl(-1390548852, 9)
            : Xqedii_y2ppbml.Xqedii_pcozdfc95hjb(1634777526, 25)) != 0);
      }
   }

   public Class<?> getReturnType() {
      if (((1832973992 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_20muzvm == Xqedii_y2ppbml.Xqedii_2fo5np48jvfg9(-34618920, 8) ? Number.class : String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((450358632 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2lwdsoun71iyz(this.Xqedii_20muzvm);
      }
   }

   private static /* synthetic */ String Xqedii_2lwdsoun71iyz(int n) {
        return Xqedii_y2ppbml.Xqedii_1td2rpphnibmm("5T53SSRnPsP9DrTWVfbMMPCZhP3GqG0netIrd3LeXOkMYLqNwbqzpNdJcr64QUHlBUCkxrODCKWriGeonKDW1o6/4Qp5zZBy4at4jw==") + n;
    }
}
