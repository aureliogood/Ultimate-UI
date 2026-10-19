package dev.xqedii.ultimateUI;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class CommandFeedback extends UiImageLookup {
   public static final String Xqedii_10gndi5ua9f4d = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public boolean hasCommandPermission(CommandSender var1, String var2, String var3) {
      if ((-1003297056 * -1003297056 + -1003297056 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_9dztc8s.Xqedii_2i5q18x8yfpcw(-54870961, 27) != 0);
      } else if (this.hasCommandPermissionSilent(var1, var2)) {
         return (Xqedii_9dztc8s.Xqedii_3bl0ghjduh23j(1057212660, 17) != 0);
      } else {
         this.sendUuiCommandError(
            var1,
            Xqedii_9dztc8s.Xqedii_451fkyhm49pa(
               "uFqbknpe6bY8kgTZ5f5DnLB3kJdZbIhI4bVUwdXV96vVDx8viaxTJGPRd8oVvj6y9b3szI3pTUp9Qx9HPH1yJ7sRa3OAvq1vZxzSq5W2ZYDXXBjXY0/A01lOWRKxCbwg39uEq/ViDxG1eeCFaM9DQ5e1rtjgMfmw"
            )
         );
         return (Xqedii_9dztc8s.Xqedii_x847wclk7za(-1957903349, 7) != 0);
      }
   }

   public boolean hasCommandPermissionSilent(CommandSender var1, String var2) {
      if ((-610062498 * -610062498 + -610062498 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_9dztc8s.Xqedii_2i5q18x8yfpcw(2023750005, 12) != 0);
      } else {
         String[] var10001 = new String[Xqedii_9dztc8s.Xqedii_x847wclk7za(-1974680565, 24)];
         var10001[Xqedii_9dztc8s.Xqedii_3bl0ghjduh23j(-461758592, 0)] = var2;
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return (Xqedii_9dztc8s.Xqedii_2i5q18x8yfpcw(1468661399, 8) != 0);
         } else if (!(var1 instanceof Player)) {
            return (Xqedii_9dztc8s.Xqedii_2i5q18x8yfpcw(-189088689, 27) != 0);
         } else {
            return ((!var1.hasPermission(
                     Xqedii_9dztc8s.Xqedii_451fkyhm49pa("7/z9ch2+o3lk+5iAaJ+hZaRoiCg6y5Qx3U6BPLEeVqDco6jKsVBtPBk74cYHnKXoFpopLsgqFPFYcCP3")
                  )
                  && !var1.hasPermission(var3)
               ? Xqedii_9dztc8s.Xqedii_3bl0ghjduh23j(-461758592, 0)
               : Xqedii_9dztc8s.Xqedii_3bl0ghjduh23j(-66116656, 19)) != 0);
         }
      }
   }

   public void sendUuiCommandError(CommandSender var1, String var2, Object... var3) {
      if ((-1070897992 * -1070897992 + -1070897992 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String var4 = var2 == null ? Xqedii_9dztc8s.Xqedii_451fkyhm49pa("r5SdV1Td+0Wpj+pgK/QG+8xUHFowKP+Snu0sHw==") : var2.trim();
         Xqedii_3ul4hqj.Xqedii_2dtmver(
            var1,
            var4.isEmpty()
               ? Xqedii_9dztc8s.Xqedii_451fkyhm49pa("Z8RE0M7oGLb2uLBC86jrdfQIpFA7zug5lUyK4TEtIGQweFVPo4BZrgHXb47TI4UJHxLO7L0P2yLd1a3RWMhABIlRztXh9A==")
               : var4,
            var3
         );
      }
   }

   public void sendUuiUsage(CommandSender var1, String var2, String var3) {
      if ((602669510 * 602669510 + 602669510 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3ul4hqj.Xqedii_2olsc6h(var1, var2, var3);
      }
   }

   public void sendUuiServicesError(CommandSender var1) {
      if ((265217342 * (265217342 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var10002 = Xqedii_9dztc8s.Xqedii_451fkyhm49pa(
            "+MQelyf/phWyZTbHuhCbzgtT1gtntE98cJVxqveK9+zw18N7o/hfsb9AKK7QbK7wotW3mPHYr4HlaKHtRAVmLoXB1I3O7/M4wTqpFIC1zHSxyYvemZSw/0STeIq1hrrPLRsuvCCmNKgGfnfuooLZ5s7MRdGIrRhnvVNrHSjo"
         );
         Object[] var10003 = new Object[Xqedii_9dztc8s.Xqedii_2i5q18x8yfpcw(-378177377, 28)];
         var10003[Xqedii_9dztc8s.Xqedii_17dscnqrnhi4h(-744457656, 13)] = Xqedii_9dztc8s.Xqedii_451fkyhm49pa(
            "7LsnD/VqT25vOmVhwqNDyBZOHVijMSuCHu5cLnV6IU+Iyeakb/7SRcN3Pxl/+6YMFa4="
         );
         this.sendUuiCommandError(var1, var10002, var10003);
      }
   }
}
