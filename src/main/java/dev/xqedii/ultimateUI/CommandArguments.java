package dev.xqedii.ultimateUI;

import java.util.List;
import java.util.Locale;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class CommandArguments extends UiCommandRegistry {
   public static final String Xqedii_3gyhxbidyjkne = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public boolean handleUuiConsoleOpenCommand(CommandSender var1, String[] var2) {
      if ((-1578274088 ^ -1578274088) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasCommandPermission(
         var1,
         Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("Iz9QBSJeMQl2C5enYdo0ig6CWG4V27hqVtKVvpisl3MMHjsujrzNE2VyL3n5kPFE8ZsvEEN54m9eEn+eakrUwAD3HhAvQdGhuZk="),
         Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jWLAGxI3vyjmKEdwqq3AkJ8ZPHCTjXZwwEkRswqOJjWZi2IbTe7ZEfGgUeXxWw==")
      )) {
         return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 11) != 0);
      } else if (var2.length < Xqedii_290gplq.Xqedii_14nvwuxrup67g(2104789878, 9)) {
         this.sendUuiUsage(
            var1,
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jWLAGxI3vyjmKEdwqq3AkJ8ZPHCTjXZwwEkRswqOJjWZi2IbTe7ZEfGgUeXxWw=="),
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "2a0OgmX9VG9/rKOvQPv0QR5SRtY48eGU9Byzhf957qNFBa9kJ7TKzoIulP8UvWDKNIoR8n+ki4L0mseRe08Y0qgbseScdw8cAB9EfPNZDAej49Ux8axv+pDScdeG0g=="
            )
         );
         return (Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-568373072, 18) != 0);
      } else if (var2.length > Xqedii_290gplq.Xqedii_14nvwuxrup67g(-767174155, 19)) {
         this.sendUuiUsage(
            var1,
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jWLAGxI3vyjmKEdwqq3AkJ8ZPHCTjXZwwEkRswqOJjWZi2IbTe7ZEfGgUeXxWw=="),
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "2a0OgmX9VG9/rKOvQPv0QR5SRtY48eGU9Byzhf957qNFBa9kJ7TKzoIulP8UvWDKNIoR8n+ki4L0mseRe08Y0qgbseScdw8cAB9EfPNZDAej49Ux8axv+pDScdeG0g=="
            )
         );
         return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 11) != 0);
      } else {
         String[] var10001 = new String[Xqedii_290gplq.Xqedii_14nvwuxrup67g(1955165821, 17)];
         var10001[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415262, 22)] = var2[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(262690927, 25)];
         String var3 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (!var3.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("i/Zhryi4xnnfrF5Vk7UYj2SPQ7dt31LhET+AX4PX0LHwTtUnJ/yHkQ=="))
            && !var3.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("wdpdN3O6G4YxI5wosJM/8IF9cXEX512M5h56XG2BNGIaIqrPyDV9QoPYbzhhXs7jT18="))) {
            Xqedii_g4i3bi9 var4 = this.parseOpenCommandOptions(var1, var2);
            if (var4 == null) {
               return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 5) != 0);
            } else {
               boolean var5 = this.openUiForPlayer(
                  var4.targetPlayer(), var2[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(741836756, 8)], var4.hudMode(), var4.autoClose()
               );
               if (!var5) {
                  String var6 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                     "KLgg7J6S1HqZ64tm2S0AX8hGp2JhvPws7QFQixsgcbt0050omlt+zy02EES8I+C/kx7b4uCSfgrWSJN/hMQEmn29CM35D2fvu4c7nKA/QJtIow=="
                  );
                  Object[] var7 = new Object[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-1033234917, 23)];
                  var7[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-85389588, 10)] = var2[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 30)];
                  var7[Xqedii_290gplq.Xqedii_14nvwuxrup67g(1270082468, 28)] = var4.targetPlayer().getName();
                  this.sendUuiCommandError(var1, var6, var7);
               }

               return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 7) != 0);
            }
         } else {
            String var10002 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "NLLoWLnbBc1p44NPe/eojGcJO6mDSedDoEN0od33zOBx9ru0IKSPIQ02fk9LENHqogEE0jiNz7YkIkin8qltgUN0mnNKqct3"
            );
            Object[] var10003 = new Object[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073284190, 17)];
            var10003[Xqedii_290gplq.Xqedii_2unhrdsaseonv(1967954897, 2)] = var2[Xqedii_290gplq.Xqedii_14nvwuxrup67g(576560989, 23)];
            this.sendUuiCommandError(var1, var10002, var10003);
            return (Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1072366686, 20) != 0);
         }
      }
   }

   public boolean handleUuiConsoleCloseCommand(CommandSender var1, String[] var2) {
      if (((957874019 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.hasCommandPermission(
         var1,
         Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("BHZdUkJSi/te2Bp4cKSNvU0jRPqg3VAACKA9lA444PwcsfIJgcg6SeXpNRWlJ5xG+4DCMU8eM5/RbDao/fAIgNk6pDH9+qLuZdPeFA=="),
         Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("IG7gtu2PXU05R0UTELOlGRqvLnszb7UCiTc60/l9Jx/jBoXaqh8irYZd1sRgzeCM")
      )) {
         return (Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1072890974, 19) != 0);
      } else if (var2.length != Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-939197534, 26)) {
         this.sendUuiUsage(
            var1,
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("IG7gtu2PXU05R0UTELOlGRqvLnszb7UCiTc60/l9Jx/jBoXaqh8irYZd1sRgzeCM"),
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("G9cDUHSSFW3NFZczQnpWt1ssyI6rvYXxwx0b1xQOs44TUGPARtCSlHzmJp4=")
         );
         return (Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1153516988, 0) != 0);
      } else {
         Player var3 = this.findOnlinePlayerByName(var2[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073419358, 12)]);
         if (var3 == null) {
            String var4 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "WnehsGvdP8ta3rCYHZ88jxGBPBIiHOhemA7mhjmTSXWIs7TZCsyd+0cFAcbTCnh1OToAXT8gUmdBXeXZyr53ZMWGQ9uOw8IK"
            );
            Object[] var5 = new Object[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-939197534, 27)];
            var5[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-85389588, 10)] = var2[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-769271307, 19)];
            this.sendUuiCommandError(var1, var4, var5);
            return (Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-536544350, 29) != 0);
         } else if (this.Xqedii_2k1vujp != null && this.Xqedii_2k1vujp.hasOpenSession(var3)) {
            this.closeUiForPlayer(var3);
            return (Xqedii_290gplq.Xqedii_14nvwuxrup67g(-810643154, 6) != 0);
         } else {
            String var10002 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "Vj6QisY/+aYGfEIRgZnmkqPBF9rQofUh9E0UdurW6+lRSHE1o8UJjK0VHbVQH/xsq6WALlWM5T4pKisguT5jjxi0LSv0YiVhw8O+n6bczrA="
            );
            Object[] var10003 = new Object[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(262690927, 25)];
            var10003[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1621286435, 7)] = var3.getName();
            this.sendUuiCommandError(var1, var10002, var10003);
            return (Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415390, 7) != 0);
         }
      }
   }

   public Xqedii_g4i3bi9 parseOpenCommandOptions(CommandSender var1, String[] var2) {
      if ((886211772 * 886211772 - 886211772 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.length >= Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954834, 6)) {
         int var3 = Xqedii_290gplq.Xqedii_3nxxzrf937kk8(465791510, 15);
         int var4 = Xqedii_290gplq.Xqedii_2unhrdsaseonv(1967954897, 21);
         Player var5 = var1 instanceof Player var6 ? var6 : null;
         int var11 = Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1169966274, 16);

         for (int var7 = Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073419358, 11); var7 < var2.length; var7++) {
            String[] var10001 = new String[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-91912464, 29)];
            var10001[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1483673000, 9)] = var2[var7];
            String var8 = this.firstNonBlank(var10001).trim();
            if (!var8.isBlank()) {
               String var9 = var8.toLowerCase(Locale.ROOT);
               if (var9.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("o/bhmTM6JPZW2dHZa5c6/w8sErlMdjc/K4sDxbv6Ber8aw=="))) {
                  if (var3 != 0) {
                     String var10002 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                        "QICFk+l5tOSXgy2VifdK71U6yzI7Nr6wmUHkzGTXpYodI7Cie+IYmi/v8EyDdXDjYttkMKNZdM2Z7Y7UHQ/exyML5jnMI+3uON4XYar3beNcNc7tj6WlYscoT83VYU+2ECc5IZMu"
                     );
                     Object[] var10003 = new Object[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 12)];
                     var10003[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-170779175, 11)] = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                        "o/bhmTM6JPZW2dHZa5c6/w8sErlMdjc/K4sDxbv6Ber8aw=="
                     );
                     this.sendUuiCommandError(var1, var10002, var10003);
                     return null;
                  }

                  var3 = Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 26);
               } else if (var9.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("n/O2HNsiSz1CAFf733cS5IR+AicqaulTLfTtPgMDgPZUFSKmsVikjJffNgVCYg=="))) {
                  if (var4 != 0) {
                     String var12 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                        "QICFk+l5tOSXgy2VifdK71U6yzI7Nr6wmUHkzGTXpYodI7Cie+IYmi/v8EyDdXDjYttkMKNZdM2Z7Y7UHQ/exyML5jnMI+3uON4XYar3beNcNc7tj6WlYscoT83VYU+2ECc5IZMu"
                     );
                     Object[] var14 = new Object[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1353768479, 2)];
                     var14[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1366233393, 14)] = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                        "n/O2HNsiSz1CAFf733cS5IR+AicqaulTLfTtPgMDgPZUFSKmsVikjJffNgVCYg=="
                     );
                     this.sendUuiCommandError(var1, var12, var14);
                     return null;
                  }

                  var4 = Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1006306398, 26);
               } else {
                  Player var10 = this.findOnlinePlayerByName(var8);
                  if (var10 == null) {
                     String var13 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                        "xVXQtSmuahZ96EMuGGLcloLbsJ+CrhsRL6wxIoH138BfzJ2NDZNbX8GCCKk8amBlEPmZeA8cf3E5p6r1FkBt4VgwQnPwmxocg0D04/u7Y3OpGJlac4Y="
                     );
                     Object[] var15 = new Object[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-2054754054, 5)];
                     var15[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415262, 13)] = var8;
                     this.sendUuiCommandError(var1, var13, var15);
                     return null;
                  }

                  if (var11 != 0) {
                     this.sendUuiCommandError(
                        var1,
                        Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                           "uLLrmOi+pXUI7WjZG0BNG6B/29/n84H2f00Emd9LTNCWZzWIDBxeRb1TtQPkwB49HR8gW2tKayKGUDXf96xo/eq2D9c0uW3+kmzbqyIIwdCVVjyjjO439AtZszYprmWJD/E+5Q=="
                        ),
                        new Object[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-735299706, 0)]
                     );
                     return null;
                  }

                  var5 = var10;
                  var11 = Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1006306398, 26);
               }
            }
         }

         if (var5 == null) {
            this.sendUuiUsage(
               var1,
               Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jWLAGxI3vyjmKEdwqq3AkJ8ZPHCTjXZwwEkRswqOJjWZi2IbTe7ZEfGgUeXxWw=="),
               Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                  "2a0OgmX9VG9/rKOvQPv0QR5SRtY48eGU9Byzhf957qNFBa9kJ7TKzoIulP8UvWDKNIoR8n+ki4L0mseRe08Y0qgbseScdw8cAB9EfPNZDAej49Ux8axv+pDScdeG0g=="
               )
            );
            return null;
         } else {
            return new Xqedii_g4i3bi9(var5, (var3 != 0), (var4 != 0));
         }
      } else {
         return null;
      }
   }

   public boolean handleUuiShadersCommand(CommandSender var1, String[] var2) {
      if (((-492260839 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.handleUuiPlayerToggleCommand(var1, var2, Xqedii_16ud823.SHADERS);
      }
   }

   public boolean handleUuiCursorCommand(CommandSender var1, String[] var2) {
      if ((-2007500758 * -2007500758 - -2007500758 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleUuiPlayerToggleCommand(var1, var2, Xqedii_16ud823.CURSOR);
      }
   }

   public boolean handleUuiPlayerToggleCommand(CommandSender var1, String[] var2, Xqedii_16ud823 var3) {
      if ((543659504 * 543659504 - 543659504 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasCommandPermission(var1, var3.permission, Xqedii_ipklhefu2b6a(var3.label))) {
         return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 29) != 0);
      } else if (this.Xqedii_2k1vujp != null && this.Xqedii_1fwpabk != null && this.Xqedii_1tuq2ol != null) {
         if (var2.length > Xqedii_290gplq.Xqedii_14nvwuxrup67g(-319100646, 2)) {
            this.sendUuiUsage(
               var1,
               Xqedii_mnvbc1kug2v0(var3.label),
               Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                  "8rPtqc4YgxN5jyQV2Dun+9KErWSb6kK/OmLx0j6dbdICW0Pmwm2/Es0mgMDmqPh/PzMX4BjDsnlR6OnXIsG7LuaovFct2K8sEKnUhrKciKHXB+vHnOuS5g=="
               )
            );
            return (Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1050763708, 27) != 0);
         } else {
            String var10000;
            if (var2.length >= Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1296221048, 28)) {
               String[] var10001 = new String[Xqedii_290gplq.Xqedii_14nvwuxrup67g(635041234, 27)];
               var10001[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(465791510, 15)] = var2[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 28)];
               var10000 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
            } else {
               var10000 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("JkwoCw7ld7utbpv3XrE6UjiNWmB3FX0m8gPtJ+p4dp3TCyWhU6eW/w==");
            }

            String var4 = var10000;
            Player var5 = var1 instanceof Player var6 ? var6 : null;
            if (var2.length == Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1863034968, 17)) {
               var5 = this.findOnlinePlayerByName(var2[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-258308730, 21)]);
               if (var5 == null) {
                  String var10002 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                     "WnehsGvdP8ta3rCYHZ88jxGBPBIiHOhemA7mhjmTSXWIs7TZCsyd+0cFAcbTCnh1OToAXT8gUmdBXeXZyr53ZMWGQ9uOw8IK"
                  );
                  Object[] var10003 = new Object[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-319100654, 2)];
                  var10003[Xqedii_290gplq.Xqedii_2unhrdsaseonv(1967954897, 30)] = var2[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1056638046, 23)];
                  this.sendUuiCommandError(var1, var10002, var10003);
                  return (Xqedii_290gplq.Xqedii_3nxxzrf937kk8(262690927, 25) != 0);
               }
            } else if (var2.length == Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415246, 3) && !this.isPlayerToggleCommandAction(var4)) {
               Player var8 = this.findOnlinePlayerByName(var2[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(262690927, 25)]);
               if (var8 == null) {
                  this.sendUuiUsage(
                     var1,
                     Xqedii_2jignzir33d6k(var3.label),
                     Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                        "8rPtqc4YgxN5jyQV2Dun+9KErWSb6kK/OmLx0j6dbdICW0Pmwm2/Es0mgMDmqPh/PzMX4BjDsnlR6OnXIsG7LuaovFct2K8sEKnUhrKciKHXB+vHnOuS5g=="
                     )
                  );
                  return (Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-735299705, 0) != 0);
               }

               var5 = var8;
               var4 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("JkwoCw7ld7utbpv3XrE6UjiNWmB3FX0m8gPtJ+p4dp3TCyWhU6eW/w==");
            }

            if (var5 == null) {
               this.sendUuiUsage(
                  var1,
                  Xqedii_rfaay4m7slu1(var3.label),
                  Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                     "8rPtqc4YgxN5jyQV2Dun+9KErWSb6kK/OmLx0j6dbdICW0Pmwm2/Es0mgMDmqPh/PzMX4BjDsnlR6OnXIsG7LuaovFct2K8sEKnUhrKciKHXB+vHnOuS5g=="
                  )
               );
               return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 20) != 0);
            } else if (!var5.equals(var1) && !this.hasCommandPermissionSilent(var1, var3.othersPermission)) {
               this.sendUuiCommandError(
                  var1,
                  Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                     "73VzdodTm2+ZLD/f2454NcpsvTf10iIkHSC60vOKyG/TuPaEopNY0WC9SL+4jjP6SjBFyjnS12ytp1QeY9YOEFzjzoe4wVLMxwQTlWflyd9MM620CDP72X/nFArQQ+m3ZMUI2m4o/mkemIMql8o46n5qD7zaNpoP"
                  ),
                  new Object[Xqedii_290gplq.Xqedii_2unhrdsaseonv(1967954897, 11)]
               );
               return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 17) != 0);
            } else {
               if (!var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("JkwoCw7ld7utbpv3XrE6UjiNWmB3FX0m8gPtJ+p4dp3TCyWhU6eW/w=="))) {
                  boolean var9 = this.isPlayerToggleEffective(var5, var3);
                  Boolean var7;
                  if (var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("TXSAUjl2rAuUsi9XIZ+ft+dSvfxDj2YuVrEqI1iJQ3k="))
                     || var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("1Ce1cdt19fStvYQ9LB8hOfsF4nUPgoUQ0O8Ri3U7UPANwLFR"))
                     || var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("DE42/iYBZ5X0JbHVnmwKdmL2itZ2y3qH8XqiTUYwkmFpg7ejjyg2cg=="))) {
                     var7 = Boolean.TRUE;
                  } else if (var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("ocanXlTgpw1q7dLmjsPG6+V+cLtine3jL9ECAqQcTWma7g=="))
                     || var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("s0GTSHXFEwxneF16tQ56TywxkE+ZQUFJI5+87Hek1CchpyYWAww="))
                     || var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("t6Rdhp7QGtGJUYLQ35CvTEVAFzAxCdWrECb7vlm6qYevI+hggd6nFqI3"))) {
                     var7 = Boolean.FALSE;
                  } else if (!var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("OMcxsax+KJEr/55zwuZIwIHpzcJV9OKRyCIQj4gMx1+VTszUZ+Qgkw=="))
                     && !var4.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("Bj2dzOzJcCsnRyDYW+vN+Hx0PSZApx2GsQGnlAEcGeaR0tvN34DF7A=="))) {
                     var7 = null;
                  } else {
                     var7 = Boolean.valueOf(
                        ((!var9 ? Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1621286307, 7) : Xqedii_290gplq.Xqedii_14nvwuxrup67g(2003294024, 29)) != 0)
                     );
                  }

                  if (var3 == Xqedii_16ud823.CURSOR) {
                     this.Xqedii_2k1vujp.setPlayerInstantCursorOverride(var5, var7);
                  } else {
                     this.Xqedii_2k1vujp.setPlayerFixShadersOverride(var5, var7);
                  }

                  if (this.Xqedii_2k1vujp.hasOpenSession(var5) && this.isPlayerToggleEffective(var5, var3) != var9) {
                     Xqedii_3ul4hqj.Xqedii_1o0kice(
                        var1,
                        Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                           "mU4LI9yV/sRcVePQDKsMlwjZ3RVyJzoP8SlJdrBdXWGJAWhATIbLqdc9TDdfudJo10Wp/sXxuUpDMNSbko0pjno7jFnOy8jYOyUOf+PKcWharFtWAvo48Bf8ruOzXVAopBnSObdcQBgw4xXpavdf9LZdTtgzdllFjCJdcA=="
                        )
                     );
                  }

                  if (!var5.equals(var1)) {
                     this.sendPlayerToggleState(var5, var5, (Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1276402613, 4) != 0), var3);
                  }
               }

               this.sendPlayerToggleState(var1, var5, var5.equals(var1), var3);
               return (Xqedii_290gplq.Xqedii_14nvwuxrup67g(-1988723340, 25) != 0);
            }
         }
      } else {
         this.sendUuiServicesError(var1);
         return (Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 18) != 0);
      }
   }

   public boolean isPlayerToggleEffective(Player var1, Xqedii_16ud823 var2) {
      if (((-257547947 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var2 == Xqedii_16ud823.CURSOR ? this.Xqedii_2k1vujp.isInstantCursorEffective(var1) : this.Xqedii_2k1vujp.isFixShadersEffective(var1);
      }
   }

   public boolean isPlayerToggleCommandAction(String var1) {
      if ((363376885 ^ 363376885) != 0) {
         throw new IllegalStateException();
      } else {
         return ((!var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("JkwoCw7ld7utbpv3XrE6UjiNWmB3FX0m8gPtJ+p4dp3TCyWhU6eW/w=="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("TXSAUjl2rAuUsi9XIZ+ft+dSvfxDj2YuVrEqI1iJQ3k="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("1Ce1cdt19fStvYQ9LB8hOfsF4nUPgoUQ0O8Ri3U7UPANwLFR"))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("DE42/iYBZ5X0JbHVnmwKdmL2itZ2y3qH8XqiTUYwkmFpg7ejjyg2cg=="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("ocanXlTgpw1q7dLmjsPG6+V+cLtine3jL9ECAqQcTWma7g=="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("s0GTSHXFEwxneF16tQ56TywxkE+ZQUFJI5+87Hek1CchpyYWAww="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("t6Rdhp7QGtGJUYLQ35CvTEVAFzAxCdWrECb7vlm6qYevI+hggd6nFqI3"))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("OMcxsax+KJEr/55zwuZIwIHpzcJV9OKRyCIQj4gMx1+VTszUZ+Qgkw=="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("Bj2dzOzJcCsnRyDYW+vN+Hx0PSZApx2GsQGnlAEcGeaR0tvN34DF7A=="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("nJ1k5iEQnthNVoLasRskK7F+hMn0l12B/4sMH+D+d6J6ltP4tLI="))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("WQNl9Bcb0/iuI3oZj0KUoTZomw+NG09DqrjWTT9wdZX0G2edi85I9Bfo"))
               && !var1.equals(Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("H2X2l8m8DxRezAwkRTPzDx51t9fkdHK2604waDZi+6zprA2UZWU="))
            ? Xqedii_290gplq.Xqedii_14nvwuxrup67g(500823506, 27)
            : Xqedii_290gplq.Xqedii_14nvwuxrup67g(1987933321, 1)) != 0);
      }
   }

   public void sendPlayerToggleState(CommandSender var1, Player var2, boolean var3, Xqedii_16ud823 var4) {
      if ((-244302603 * -244302603 - -244302603 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Boolean var5 = var4 == Xqedii_16ud823.CURSOR
            ? this.Xqedii_2k1vujp.resolvePlayerInstantCursorOverride(var2)
            : this.Xqedii_2k1vujp.resolvePlayerFixShadersOverride(var2);
         boolean var6 = var4 == Xqedii_16ud823.CURSOR
            ? this.Xqedii_2k1vujp.isInstantCursorEnabledGlobally()
            : this.Xqedii_2k1vujp.isFixShadersEnabledGlobally();
         boolean var7 = var5 != null ? var5 : var6;
         String var8 = var7
            ? Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("oGun0slP3mQk/n2Ftv8bm3lSToz5hHe9chBa0WrmV3ad6asaSr2VDOBb")
            : Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("81KejDn+NM7wo+f2XOTg4B611Dfms2/el1pHJxhhl1rFbt+Qnc/ZaHuJXS0=");
         String var11;
         if (var3) {
            var11 = Xqedii_25x2bu1bkixb3(var4.displayName);
            Object[] var10001 = new Object[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 29)];
            var10001[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415262, 18)] = var8;
            var11 = Xqedii_3ul4hqj.Xqedii_2d5sc5r(var11, var10001);
         } else {
            var11 = Xqedii_3gsqs72mya3v3(var4.displayName);
            Object[] var15 = new Object[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(2018329283, 20)];
            var15[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1483673000, 9)] = var2.getName();
            var15[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-367649853, 31)] = var8;
            var11 = Xqedii_3ul4hqj.Xqedii_2d5sc5r(var11, var15);
         }

         String var9 = var11;
         if (var5 == null) {
            var11 = Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "G5Kf0nrKCQ1uCHTeLgGBvCNmJzoimTcPmCyla/PYVEfJj9e0A7zETkS8ZWvTrO9VMJvFis6fNzfSwy1oVuCccBOc0q1wdJMgzQUS3fst1ipDe6EKLfAkuw=="
            );
            Object[] var16 = new Object[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1006306398, 26)];
            var16[Xqedii_290gplq.Xqedii_14nvwuxrup67g(1001647012, 28)] = var6
               ? Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("TXSAUjl2rAuUsi9XIZ+ft+dSvfxDj2YuVrEqI1iJQ3k=")
               : Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("ocanXlTgpw1q7dLmjsPG6+V+cLtine3jL9ECAqQcTWma7g==");
            var11 = Xqedii_3ul4hqj.Xqedii_2d5sc5r(var11, var16);
         } else {
            var11 = Xqedii_3ul4hqj.Xqedii_2d5sc5r(
               var3
                  ? Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("Ayy9SAj+vT58cPL07ExqCyqCZ+wAYEAxFdTjQ7Wh5d8nsaEn3NFQJq0eavt0w9TGkKYwks4mPyOaovq7")
                  : Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
                     "N/Yx5yX1CfrG8hFdWBIFuNxsvTL4Co6XX3bFsvLLc7XjsuraqlR4iljfQh/VPdO+bF5iYn1FnXcc2+2Nvcy0yspO2LjXFEoWdknk2w=="
                  )
            );
         }

         String var10 = var11;
         Xqedii_3ul4hqj.Xqedii_2g7xq9b(var1, var7, var9, List.of(var10));
      }
   }

   public Player findOnlinePlayerByName(String var1) {
      if ((596410430 * 596410430 - 596410430 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954898, 15)];
         var10001[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-638201315, 3)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            return null;
         } else {
            Player var3 = Bukkit.getPlayerExact(var2);
            if (var3 != null) {
               return var3;
            } else {
               for (Player var5 : Bukkit.getOnlinePlayers()) {
                  if (var5 != null && var5.getName().equalsIgnoreCase(var2)) {
                     return var5;
                  }
               }

               return null;
            }
         }
      }
   }

   public String resolveExistingUiName(String var1) {
      if ((-1062497620 * -1062497620 + -1062497620 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_2k1vujp == null) {
         return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("0xP13d7pdQz4llwH1HwHfVF3hVvAAAmaC8diGQ==");
      } else {
         String[] var10001 = new String[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-1470599409, 1)];
         var10001[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-1470599411, 1)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("0xP13d7pdQz4llwH1HwHfVF3hVvAAAmaC8diGQ==");
         } else {
            String var3 = this.normalizeUiNameToken(var2);
            if (var3.isBlank()) {
               return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("0xP13d7pdQz4llwH1HwHfVF3hVvAAAmaC8diGQ==");
            } else {
               for (String var5 : this.Xqedii_2k1vujp.getGuiNames()) {
                  String var6 = this.normalizeUiNameToken(var5);
                  if (!var6.isBlank() && var6.equalsIgnoreCase(var3)) {
                     return var5;
                  }
               }

               return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("0xP13d7pdQz4llwH1HwHfVF3hVvAAAmaC8diGQ==");
            }
         }
      }
   }

   public List<String> filterByPrefix(List<String> var1, String var2) {
      if ((-869906300 * -869906300 - -869906300 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var2.toLowerCase();
         return var1.stream().filter(var1x -> {
            if (((-1075610519 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return var1x.toLowerCase().startsWith(var3);
            }
         }).toList();
      }
   }

   public void sendUuiHelp(Player var1) {
      if ((-1726866498 * -1726866498 + -1726866498 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         Component[] var10001 = new Component[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-491559890, 27)];
         var10001[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-1327621296, 10)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "vHXZcFvaHnrLb+PuDVYDyjalf1OsVA13tISw9IQWfCYVumtQqavLcPjh//ktGgni6lma1pFih9hAat/AuMhWUpkHEZFe36eSgXaqwbz1yLg2X+N13IirLeJ6fWGXTfOY+FoP1J4G4Xss+dK/mZm7k+Yv7+wVzMeZ7P6AvVbMMH5As7AKbAuS7TjuFNGBoVgZnx3fhUu0xOBsnSynzOgelOJB2Y4="
            )
         );
         var10001[Xqedii_290gplq.Xqedii_14nvwuxrup67g(-384635654, 18)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "pA/hDcbwaj7GthyKcqRouFRxS0ugxtdie+UwOlj57Ajj+0yyRMAafJAPSiKh+TcxDjRzS1Bx8IB2g9VKj08MRjyA0ccTsVjeor5sVwq/HRPGzCVVioquVdutA6T1UykSVaJWB7DF/WUqeDGLvYA5CwLBBxTPypouT/53o/vKXETG74r3U1vHyQZcXAteb+T9y84076O13OP4V1YvxIsmK9k4Z+3/xwUUbrI="
            )
         );
         var10001[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415774, 8)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "+H1trLRX/wl0rFSSVrWegNk2QLboY+wKz3LHhCgn0vehPqXEkBTSN6kjZb6yE6yKShR9/Mr101OduSDkIUdVYs2j2rVIbKr29FE+51luVyvWY2iOaXLnOcr7Bq4Y7hR4yzNxfSWjvxNi9Gl7cU4+gNzw9tQCVB4u1lNockDsDFWyweqDUyztp73qn4oDTjic98sLISeDdnA9Tly6jC+MlXMX3+uKJ05U4PK9sEB1FOvVUHzF9OPk62XTWHty6R8Fmy/BDSXItlDalWL19au1By9kcX4YdH6AisF0yXI6"
            )
         );
         var10001[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1967954906, 2)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "ufqXn7oPu5Fu8WWtnkq3lr0GqEaYH6q3S4G+KOLYTV2vk0SoBh7mZBB3Vi0p+cjTmm57a09aL5YC+0NKUOkLS+3STcxgJ/WGl45v8y5cJbPLOwwwBj8pwmJp2lUuUMyiAeGFtI/fYNmXI6gHn6W5xPq+j8SlunCzFaQCLIdGJb0m0qoTFseKRwTDcG+8YfUpQ8Rk3r3MBeI/W6UHuMLqPD3ekR3a0R3vuAm5MwZexMYFLnGS6VsULg1Q8Fj+PKW+smtvj+06hU9PCw=="
            )
         );
         var10001[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-262503034, 21)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "IvIVYfSmTAMyFa18Bi1fHxqVRoUUZjI67PP0ZT66YK/fYX2meSVX1aCD9c0m2EWkoaw5PPgEBG9UeM4uBo9hHKRsi+vg3dgwf0Lt+vtMyFxz2brK1a1L7XXMn82kMYmIGMzYtT+b99/V1G8WnHFkmxyU4pYOHBparMF1qPL0fGmVZxMYfugNXdgyaZDLjmWUpFjgFvsIopZxCsJXEWEMlnvqyDDvjSUmaIvLX3CvSCNleYnpf6rJvqDULSm3zspFx5pn8iq2u4KhecGJk3CFB+IX"
            )
         );
         var10001[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-1431083986, 27)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "yZxpe6msqKyWs7vDSxHXv8bqGRSV+2SHa5aJGXuCkYfZn4BuxZrYLxRYSErOYmsNtjD7lp2iU4KtpslCPoonfcN61jWVUOS4GRYxbhtftbWCmCPIrMl+TZFlYzmx4nM13GLmY93uQX6mJlGM5QU7h1QTiw7dGaKX/7Hxtsw4+xZYSBAYIQMPgvVoLU4mlY53PSVp9Yl2E97FIz10ANKq326iCOPpavASwT4Y/BLcUTQ75qUOas8C3yyQuld8ex3Em5cRTlVziAmLdQEPDSGEtMQ6RtBTvw=="
            )
         );
         var10001[Xqedii_290gplq.Xqedii_14nvwuxrup67g(1859104402, 30)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "t+OpnOhuOCIC1MpmoD4BjOff0upc7WRaFv2xT+4bZr2PerfczBV0+V+ZHQ5U+s17FthbXdbop2kt3YtC7nDnOBHptbvQcKfBcW0aG6YVVls0va/zgYRGD0XK3tlNlOEF5SjtJWkcpK1mnKl435l0cA004g+6R1CHIMOCfTlZEHjOjXggBmVT/PTwEPFW2zob1egdH/BNv30MvjV0UF+q/0SJGiYfA5ydfqH7Ex5NnHg5pvKd0RFIVncjFQUznpHNVr7u6unbVe+EPHlnJdWkyJceTxZvluKW"
            )
         );
         var10001[Xqedii_290gplq.Xqedii_3nxxzrf937kk8(1963658720, 30)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "HhvFbRSsd73cJYn805g7xMW8f8L6g8jfcHvE4xCcgxnXfV7dH5VkYmkAj7TH5ERHWRsy3vcJklzb7Aq9adRzfReeHAqCAC5CiaNxVelGwbeB9MGSKRYPuZPOfVMJcjsXnHPUfd2InMJigyc8zlk+PGnbG8uGHZBMpbsXOXDn0gFAo52nwQqkcvYfjGzRlnTxE/C6xKxUdDfIVZM5z9ZcmRV7in0cSvPJ70T4oTvMXUTy4A=="
            )
         );
         var10001[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1006306398, 23)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "bU+vhA9xHQDGBRS3N5VkbetU2t0IqoPz4vPEASIPM8S/sSbPJJzDHeYdEVOr95Vh395yXdd7CzQDStvMugIonaZIaduCmeSPFxgJuy3tGdtOt/CYLvOAtJR0MHy1YGBHPk+Qkm9KLlEiqn+Gp3YgYbrpS/6Ty7zdx+JLS5xCs1QG3mrAaE8YpmIB3m9HXZixec/Sma9UtEMlFNVR0ru4blhB"
            )
         );
         var10001[Xqedii_290gplq.Xqedii_2unhrdsaseonv(-894213074, 27)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "zbIQvCcUEh9yPZqO9iyrFVpRuQnT31NHmyysmySFuOXaAb6StEtWRUk+EIFFYyRWquIHlQCj7yKEBl5Ch8DbGZuME24yANVCWBRlhKYXpxaKR5Sp806AmSxyowgeBowj3vn4UQFOehUoDc/HnvO8e7JITDteGIz0ZQsg9qu1bVwJK/ZZCRQXAB5M"
            )
         );
         var10001[Xqedii_290gplq.Xqedii_14nvwuxrup67g(1859104403, 30)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "BR8czOA8cFWRRGqYA2KW3Uoi15ShKFP6GEDexB5a8DEtmwJoDJFcrcCOICXrL7IlV9hECyUQ2G7P8aR7nWqf6u1Bu72sam1KpVKrJ3BLGP94lBEHwZYlbN+2xhlyvlQhunp5E8mqIxR4zFOSQu572CH7VxDnUWFLJiuWRr25OBp3+h7U9Nx1TvYffYdM2TpqrONeARGQKUq7BrHKvR18qIxfj/g+jcVmdQr+JsF5zV0F+DDkhmnku7H4nmoMlFV0CrePHQtFkNZHsKWsHeLxwtqBVOAWmn5Q/DkbgUzCg8dyACgDnxGoZUStoLr31rMM"
            )
         );
         var10001[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073374302, 13)] = Component.empty();
         var10001[Xqedii_290gplq.Xqedii_1smf3ilrfaawk(-1073415250, 0)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "Xe94J9VRpv/SqucjqAkSkcXViOv4V+W8gEJx0OcxITc8/GchnoUlbBXEPCLEPTFryKNR9qRGe91lEIkntS59rgwu+RSZW9FsFzZ7STgstnW8OLVMB84vemmv+INKrBJ80CV4bBY6rvGii/dgaypswl+WXjzn+aN5qYw="
            )
         );
         var10001[Xqedii_290gplq.Xqedii_2unhrdsaseonv(1253270574, 28)] = Xqedii_1df0pdx.deserialize(
            Xqedii_290gplq.Xqedii_1j0zabi8wuwrv(
               "2E+LILWL+xKgvsC4FIWXeBupyyt/dYjLR8+bcFCTJ0Qw+0njH6cxcc3Z+lNbEPUZz9sW+2mt97zM4JyeIR8r5cv0byYM53OpCFAsnSQ0uBAwn711FrdT3zBqxH0vu2fr3Nep0dEzkf97ZlN5LDMa7K3fvbmbRptUBbFHgBAOgoupjNUg9Q6whr+U9ZvXXXQA917DTJ17/EcuDD4lONHbv42A2AT3y7wR23rRkoq0TIU4/i5ZaZC67f770vrEvBPP+F8NwskRHl2gtgKrztKLCIQcRov3oKdrejHqzj6V9ANFgzUeOwjAU2osasBfC99Uih6rTVtf5rltXr4lmYx6brAEt2KO0juBOCvUGXYzXtWCrRBI1baKkcnqO1KnwTG3soYgudYyxpbCF4Zo7+kiJ0YAvMkk+B+Elmi8GUUNNi0XpPeBFEWeJur0eoPfHIzjvtHYKgR7buLKM6QROIcH+Vuz/B6MyfpuAcxq3w=="
            )
         );
         Xqedii_3ul4hqj.send(var1, List.of(var10001));

         try {
            var1.playSound(
               var1.getLocation(),
               Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("+1RPrzcTg1tkv1J2z4eOrvo2F8pSR/wmrdJb98bT+spwAzgabMUimEZBluP+FelfjxdR7tddVkUePMaQcyU="),
               Float.intBitsToFloat(Xqedii_290gplq.Xqedii_14nvwuxrup67g(-352655089, 2)),
               Float.intBitsToFloat(Xqedii_290gplq.Xqedii_3nxxzrf937kk8(-253921914, 21))
            );
         } catch (Throwable var3) {
         }
      }
   }

   private static /* synthetic */ String Xqedii_ipklhefu2b6a(String string) {
        return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jveKjQ6qg/Xh7QpksQ7yCGJkZTAAAFdJ1wGfYnRDH0y86vwO2rc=") + string;
    }

    private static /* synthetic */ String Xqedii_mnvbc1kug2v0(String string) {
        return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jveKjQ6qg/Xh7QpksQ7yCGJkZTAAAFdJ1wGfYnRDH0y86vwO2rc=") + string;
    }

    private static /* synthetic */ String Xqedii_2jignzir33d6k(String string) {
        return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jveKjQ6qg/Xh7QpksQ7yCGJkZTAAAFdJ1wGfYnRDH0y86vwO2rc=") + string;
    }

    private static /* synthetic */ String Xqedii_rfaay4m7slu1(String string) {
        return Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("jveKjQ6qg/Xh7QpksQ7yCGJkZTAAAFdJ1wGfYnRDH0y86vwO2rc=") + string;
    }

    private static /* synthetic */ String Xqedii_25x2bu1bkixb3(String string) {
        return string + Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("nP9T43mAROcGhyjsEcMPYThbZx4ARlxSVV4IRk5RwUmM4vJ04dTQo4a4sN0=");
    }

    private static /* synthetic */ String Xqedii_3gsqs72mya3v3(String string) {
        return string + Xqedii_290gplq.Xqedii_1j0zabi8wuwrv("1defGW6FFaYsrOU0tyAegMdAfbOon7xt6E6tTetdJRrCigIW9SDhXp43gECw0LwrVz8S1iYFq9HGKyEe");
    }
}
