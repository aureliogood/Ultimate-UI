package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import dev.xqedii.ultimateUI.api.event.UltimateUIBlockClickEvent;
import org.bukkit.event.Event;

public final class Xqedii_13uoh9q extends SkriptEvent {
   public static final String Xqedii_190796f0d8g7a = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public int Xqedii_aiu6lsz;

   public boolean init(Literal<?>[] var1, int var2, ParseResult var3) {
      if ((2067115123 * 2067115123 + 2067115123 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_aiu6lsz = var2;
         return (Xqedii_321waiy.Xqedii_134r7h1hqphku(-427772917, 7) != 0);
      }
   }

   public boolean check(Event var1) {
      if (((-1946222793 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof UltimateUIBlockClickEvent var2) {
         return switch (this.Xqedii_aiu6lsz) {
             case 3 -> var2.isLeftClick();
             case 4 -> var2.isRightClick();
             case 5 -> var2.isScroll();
             case 6 -> var2.getClickType() == UltimateUIBlockClickEvent.ClickType.SCROLL_UP;
             case 7 -> var2.getClickType() == UltimateUIBlockClickEvent.ClickType.SCROLL_DOWN;
             default -> false;
          };
      } else {
         return (Xqedii_321waiy.Xqedii_3scuoq033m1k0(587568986, 21) != 0);
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((2117762150 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_321waiy.Xqedii_2j11vc74vnld9("qx8s6UIl61uKGp0ObmAhK97/fP0eEKRG3jAh2un5J/WFgnq1nnBRjwyVhza14vmhgKj7hktwhnVQcLtDDbbOUsydRLwGxFCy");
      }
   }
}
