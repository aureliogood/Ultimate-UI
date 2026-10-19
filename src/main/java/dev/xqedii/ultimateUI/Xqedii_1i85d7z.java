package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import dev.xqedii.ultimateUI.api.event.UltimateUIHoverEvent;
import org.bukkit.event.Event;

public final class Xqedii_1i85d7z extends SkriptEvent {
   public static final String Xqedii_9maeaf7wwryj = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public boolean Xqedii_3pts0wp;

   public boolean init(Literal<?>[] var1, int var2, ParseResult var3) {
      if ((1107533983 ^ 1107533983) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3pts0wp = ((var2 == Xqedii_2idgzm2.Xqedii_iggw2fdw2t4s(2003614388, 16)
            ? Xqedii_2idgzm2.Xqedii_2ajyjxnb9vv9e(-1574624642, 19)
            : Xqedii_2idgzm2.Xqedii_1lzj2b0v0drd8(1460270721, 22)) != 0);
         return (Xqedii_2idgzm2.Xqedii_iggw2fdw2t4s(1993059143, 20) != 0);
      }
   }

   public boolean check(Event var1) {
      if ((-644389500 * -644389500 + -644389500 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 instanceof UltimateUIHoverEvent var2 && var2.isLeave() == this.Xqedii_3pts0wp
            ? Xqedii_2idgzm2.Xqedii_2ajyjxnb9vv9e(-1574624642, 0)
            : Xqedii_2idgzm2.Xqedii_v35v98otl0fn(1602469744, 12)) != 0);
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((414369916 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3pts0wp
            ? Xqedii_2idgzm2.Xqedii_2p4m9txv96mi9("358mpD8/0080A6JGNQxaHyBM5jOS2lfSoLnM7pb71dT/1ebEHq93JtnUt+1QA4InnO9bSeUuZgu156cUX3YwJw==")
            : Xqedii_2idgzm2.Xqedii_2p4m9txv96mi9("020PUjpFlvoLxMuepoaSjGol5oUIe+pcU+9nNqDEHxd+lk+zc0LTbLFiuIVTZ/jU6DgmNcLE2BtGr+P/");
      }
   }
}
