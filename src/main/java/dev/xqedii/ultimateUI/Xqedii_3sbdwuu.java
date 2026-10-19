package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import ch.njol.util.coll.CollectionUtils;
import dev.xqedii.ultimateUI.api.event.UltimateUIBlockClickEvent;
import org.bukkit.event.Event;

public final class Xqedii_3sbdwuu extends SimpleExpression<String> {
   public static final String Xqedii_wpv6yoetgw68 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((791583353 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1i3f212.Xqedii_kw24jje291zn(1762873407, 13) != 0);
      }
   }

   public String[] get(Event var1) {
      if ((1109660122 * 1109660122 - 1109660122 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof UltimateUIBlockClickEvent var2) {
         String[] var10000 = new String[Xqedii_1i3f212.Xqedii_24ljicv1g0g11(-539485853, 26)];
         var10000[Xqedii_1i3f212.Xqedii_2rn9pe42rfd8o(-72626074, 30)] = var2.getClickType().name().toLowerCase();
         return (String[])CollectionUtils.array(var10000);
      } else {
         return null;
      }
   }

   public boolean isSingle() {
      if ((1683010226 * 1683010226 + 1683010226 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1i3f212.Xqedii_2rn9pe42rfd8o(1585657309, 9) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if (((-813148328 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((-362200819 * -362200819 - -362200819 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1i3f212.Xqedii_1h80rfyddyrrq(
            "q/+1iLIoYWNeE8BQA1PiT/ZLtlh5eyy3RdhGp+Mref/UEfV65ymBB65POoH/8+qEPxgNj3mr3gbn0FDbgwXWSpVlUvL4yhrtzbpAwHXmbZRISAtUe1LQrNgjXMriHg=="
         );
      }
   }
}
