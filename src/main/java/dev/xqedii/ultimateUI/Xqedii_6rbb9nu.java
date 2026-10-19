package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.world.clock.ClockNetworkState;
import java.lang.runtime.ObjectMethods;

public record Xqedii_6rbb9nu(ClockNetworkState state, long gameTime) {
   public static final String Xqedii_huomeq2tyvbr = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   @Override

   public long gameTime() {
      if (((842137018 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.gameTime;
      }
   }
}
