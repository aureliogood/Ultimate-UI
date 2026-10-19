package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import ch.njol.util.coll.CollectionUtils;
import dev.xqedii.ultimateUI.api.event.UltimateUIEvent;
import org.bukkit.event.Event;

public final class Xqedii_jd5mxl2 extends SimpleExpression<String> {
   public static final String Xqedii_3mbfpdgc7yep2 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((-799083007 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1nos6ee.Xqedii_2l30t0nsm6zp9(-1157291208, 6) != 0);
      }
   }

   public String[] get(Event var1) {
      if (((-1701736956 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!(var1 instanceof UltimateUIEvent var2)) {
         return null;
      } else {
         String[] var10000 = new String[Xqedii_1nos6ee.Xqedii_1jd7j2gnk1get(-1138773314, 4)];
         var10000[Xqedii_1nos6ee.Xqedii_1jd7j2gnk1get(-40536608, 15)] = var2.getPageName();
         return (String[])CollectionUtils.array(var10000);
      }
   }

   public boolean isSingle() {
      if ((1595288842 ^ 1595288842) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1nos6ee.Xqedii_1jd7j2gnk1get(736870907, 24) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if ((68555249 ^ 68555249) != 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((750157565 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1nos6ee.Xqedii_36tikklulfrw3("/+bXH8ogofwxN6PpPxpbYpOiQQIGIweYG9NS7iMvsH6gTmceiXCFbT8ISoUQJsCWtXxaAuFWv8b2Dsq1wfR59a0AskOapA==");
      }
   }
}
