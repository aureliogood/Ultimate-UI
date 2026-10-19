package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import dev.xqedii.ultimateUI.api.event.UltimateUIDragEvent;
import org.bukkit.event.Event;

public final class Xqedii_v41lyqg extends SkriptEvent {
   public static final String Xqedii_3dai94ocor684 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public UltimateUIDragEvent.Phase Xqedii_1l0qniq;

   public boolean init(Literal<?>[] var1, int var2, ParseResult var3) {
      if (((-1328343660 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1l0qniq = switch (var2) {
            case 0 -> UltimateUIDragEvent.Phase.START;
            case 2 -> UltimateUIDragEvent.Phase.END;
            default -> UltimateUIDragEvent.Phase.MOVE;
         };
         return (Xqedii_3tzr4xm.Xqedii_2zt0xnm6r3v11(-900185757, 16) != 0);
      }
   }

   public boolean check(Event var1) {
      if ((1395178218 * (1395178218 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 instanceof UltimateUIDragEvent var2 && var2.getPhase() == this.Xqedii_1l0qniq
            ? Xqedii_3tzr4xm.Xqedii_117ooe60tme8x(-910045803, 30)
            : Xqedii_3tzr4xm.Xqedii_2na3d58targxk(1398992179, 16)) != 0);
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((-755616820 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3mgvlmj96v95a(this.Xqedii_1l0qniq.name().toLowerCase());
      }
   }

   private static /* synthetic */ String Xqedii_3mgvlmj96v95a(String string) {
        return Xqedii_3tzr4xm.Xqedii_1umz40h707b5e("qSASKER8zyq4Hd3X3uQeajiU2q/sZup1jRNHb4lPprDjC3Lf9xMlIw6Dx5wkn6fa/gadnDPCyBVSoQP8") + string;
    }
}
