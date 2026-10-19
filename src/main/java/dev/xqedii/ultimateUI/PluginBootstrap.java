package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEventsAPI;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerAbstract;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerPriority;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketReceiveEvent;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketTypeCommon;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketType.Play.Client;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.player.InteractionHand;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.client.WrapperPlayClientPlayerBlockPlacement;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.client.WrapperPlayClientUseItem;
import java.io.File;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public abstract class PluginBootstrap extends PluginState {
   public static final String Xqedii_nthwl80ioc1b = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_mpg1fa3 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
      "Ts3+QA1I8MwG8bQa+2TiYqBsICtN7CjEjx9Pa5GlebW/Q/Z3Nq0cKjQAqiQM1F0RnTKtQ5/mfrOOZgwqM4e6I/sIR+dZer6M"
   );
   public static final long Xqedii_1noaw2v = 67108864L;

   public void preloadDeepHierarchies() {
      if ((205518351 * 205518351 - 205518351 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         List var1 = this.Xqedii_30hq54i();
         if (!var1.isEmpty()) {
            ClassLoader var2 = this.getClass().getClassLoader();
            AtomicReference var3 = new AtomicReference();
            Runnable var4 = () -> {
               if ((1099272943 ^ 1099272943) != 0) {
                  throw new IllegalStateException();
               } else {
                  for (String var4x : (Iterable<String>) (var1)) {

                     try {
                        Class.forName(var4x, (Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(2116599848, 12) != 0), var2);
                     } catch (StackOverflowError var6x) {
                        var3.set(var6x);
                        return;
                     } catch (Throwable var7x) {
                     }
                  }
               }
            };
            Thread var5 = new Thread(
               null,
               var4,
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("ExE/dnpBpe1L72WZELM4qbomMmiJLV2mPPIUGVYo7zEQO3I80yjSjUIUR9FLiEESt/uZ5YFm4ol3G6rJSc9j8g=="),
               Xqedii_hh1t3jt.Xqedii_37wczzubqqnj0(-2711992602922829726L, 54)
            );
            var5.setContextClassLoader(var2);
            var5.setDaemon((Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(-2116599849, 19) != 0));
            var5.start();

            try {
               var5.join();
            } catch (InterruptedException var7) {
               Thread.currentThread().interrupt();
               throw new IllegalStateException(
                  Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                     "kKafQ/HXV1GHCbEd9zGQR/AnD+YAZWTJz0lnGQwsBWiBjmRWNAY261XuBJsPUKD3gidTpKKTixKY0b5OJC0ueALKJ42TqwrEA6adpzr9H9b1z5rjtqRcovt9mycIy99Kshkr4X5NRKA3J3rq2wPkWnvdRbNs3/W1gpY="
                  ),
                  var7
               );
            }

            Throwable var6 = (Throwable)var3.get();
            if (var6 != null) {
               throw new IllegalStateException(
                  Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                     "SFEbrWEz3LbACHehNaKtOwNaYhalbgtn28QGwM5YvoIHgUaGIVnB5p2cHQ1DIojF3cdapsbLDQXDSrk14E+trmVoCb5kST/cCbwUPdybfYyasHniHl0jivWEZt3S7qW13OT7os0uqIptCkxYqq9402lNOPh5RXdvb1Lad4Ph5yMTO6QhEDjZ4oE/"
                  ),
                  var6
               );
            }
         }
      }
   }

   public void Xqedii_14r1vgf(File var1, File var2, List<String> var3) {
      if ((-1006459453 * (-1006459453 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File[] var4 = var2.listFiles();
         if (var4 != null) {
            File[] var5 = var4;
            int var6 = var4.length;

            for (int var7 = Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(-2133717075, 22); var7 < var6; var7++) {
               File var8 = var5[var7];
               if (var8.isDirectory()) {
                  this.Xqedii_14r1vgf(var1, var8, var3);
               } else if (var8.getName().endsWith(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rOjdOu2kS32WNhsgfnrsfOldkqpH6/V0VuViyi6UxXZRPLBplomTDQ=="))) {
                  String var9 = var1.toPath()
                     .relativize(var8.toPath())
                     .toString()
                     .replace(File.separatorChar, (char)Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(-2116599872, 31));
                  if (var9.startsWith(
                     Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("Ts3+QA1I8MwG8bQa+2TiYqBsICtN7CjEjx9Pa5GlebW/Q/Z3Nq0cKjQAqiQM1F0RnTKtQ5/mfrOOZgwqM4e6I/sIR+dZer6M")
                  )) {
                     var3.add(
                        var9.substring(
                              Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(263028946, 6),
                              var9.length() - Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rOjdOu2kS32WNhsgfnrsfOldkqpH6/V0VuViyi6UxXZRPLBplomTDQ==").length()
                           )
                           .replace((char)Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2145176932, 21), (char)Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(-2116600129, 3))
                     );
                  }
               }
            }
         }
      }
   }

   public List<String> Xqedii_30hq54i() {
      if ((291402549 * (291402549 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var1 = new ArrayList();

         try {
            CodeSource var2 = this.getClass().getProtectionDomain().getCodeSource();
            if (var2 == null || var2.getLocation() == null) {
               return var1;
            }

            File var3 = new File(var2.getLocation().toURI());
            if (var3.isDirectory()) {
               this.Xqedii_14r1vgf(var3, var3, var1);
               return var1;
            }

            try (ZipFile var4 = new ZipFile(var3)) {
               Enumeration var5 = var4.entries();

               while (var5.hasMoreElements()) {
                  String var6 = ((ZipEntry)var5.nextElement()).getName();
                  if (var6.startsWith(
                        Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("Ts3+QA1I8MwG8bQa+2TiYqBsICtN7CjEjx9Pa5GlebW/Q/Z3Nq0cKjQAqiQM1F0RnTKtQ5/mfrOOZgwqM4e6I/sIR+dZer6M")
                     )
                     && var6.endsWith(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rOjdOu2kS32WNhsgfnrsfOldkqpH6/V0VuViyi6UxXZRPLBplomTDQ=="))) {
                     var1.add(
                        var6.substring(
                              Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(2116599848, 17),
                              var6.length() - Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rOjdOu2kS32WNhsgfnrsfOldkqpH6/V0VuViyi6UxXZRPLBplomTDQ==").length()
                           )
                           .replace((char)Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(-2116599953, 2), (char)Xqedii_hh1t3jt.Xqedii_1r6lbp4zblm4b(-1939540140, 0))
                     );
                  }
               }
            }
         } catch (Throwable var9) {
            this.getLogger().warning(Xqedii_ejt86r99uggv(String.valueOf(var9)));
         }

         return var1;
      }
   }

   public void preloadLibClasses() {
      if ((1283682294 * 1283682294 - 1283682294 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            CodeSource var1 = this.getClass().getProtectionDomain().getCodeSource();
            if (var1 == null) {
               return;
            }

            URL var2 = var1.getLocation();
            if (var2 == null) {
               return;
            }

            File var3 = new File(var2.toURI());
            if (!var3.exists()) {
               return;
            }

            ClassLoader var4 = this.getClass().getClassLoader();

            try (ZipFile var5 = new ZipFile(var3)) {
               Enumeration var6 = var5.entries();

               while (var6.hasMoreElements()) {
                  ZipEntry var7 = (ZipEntry)var6.nextElement();
                  String var8 = var7.getName();
                  if (var8.startsWith(
                        Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                           "ARtNKblQjHl0A4+Hh86v/10qZBErjMysNPYPNc5TnTYFa4W9UEUPXCDUQNLUktPCv5x2GsspRuNlPUfmGyISXWOX+PxhgiQTawktyoB498hHZA=="
                        )
                     )
                     && var8.endsWith(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rOjdOu2kS32WNhsgfnrsfOldkqpH6/V0VuViyi6UxXZRPLBplomTDQ=="))) {
                     String var9 = var8.replace(
                           (char)Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2050805652, 4), (char)Xqedii_hh1t3jt.Xqedii_1r6lbp4zblm4b(-719120067, 22)
                        )
                        .replace(
                           Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rOjdOu2kS32WNhsgfnrsfOldkqpH6/V0VuViyi6UxXZRPLBplomTDQ=="),
                           Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("KqXcwDS45BJVTRdOgFpQGhhQYtcP/GB56ZYRHw==")
                        );

                     try {
                        Class.forName(var9, (Xqedii_hh1t3jt.Xqedii_1r6lbp4zblm4b(2072798455, 24) != 0), var4);
                     } catch (Throwable var12) {
                     }
                  }
               }
            }
         } catch (Throwable var14) {
            this.getLogger().warning(Xqedii_3tja43875epd6(var14.getMessage()));
         }
      }
   }

   public void printStartupBanner(String var1, String var2) {
      if ((564223524 ^ 564223524) != 0) {
         throw new IllegalStateException();
      } else {
         ConsoleCommandSender var3 = Bukkit.getConsoleSender();
         Xqedii_nd6rkr3.Xqedii_3s7zz34(var3, Component.empty());
         Xqedii_nd6rkr3.Xqedii_3s7zz34(
            var3,
            Xqedii_1df0pdx.deserialize(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "55dB9FLDvJrPsbsGEdu+f/g7e4zzybzRYbY74u30RqJTvblmKdmkSgO76PJq9OEXuV8TP0xpIupzMPB1hcCn41TZlP1mvPsw4bJr7bufCQ1hsHtbdHHgAvCXX9+P2hv1Pyoy0m0WkVjMhz6+Y7ljAQ0ojTY/zgNDZlbryMfgI6dORhUQwUpxiG1OVYH/ZNTTQq8NeQ=="
               )
            )
         );
         Xqedii_nd6rkr3.Xqedii_3s7zz34(
            var3,
            Xqedii_1df0pdx.deserialize(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "0idfmFQaryBMrwRSxXxWhd+juToPbo85RLl3zEY4XyeNhjJqKEKCerJt2+b33xuCtP/elnl5w7Gx+gwQ7t+sHkDXyRGwSafUDm2ZtR7ALRlfBHvKoYJK16pi/hvlATnHuZX7AiO2F5EiiBPy1zGvTEPC1biE7GM1FUuryGEKVpkKh7OKijlKz6F8Bethz5LoomyY4eRW"
               )
            )
         );
         Xqedii_nd6rkr3.Xqedii_3s7zz34(
            var3,
            Xqedii_1df0pdx.deserialize(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "PfZYqhPYWCHv4Wmde2udDshrJ2+ECHn0a4Lxr2kJ/R0UlXSB80cmk4CacqLJk4Mp/4I42xa7L/LAvHKWrEb3/G1sXI0bR+HbJZ9h3d33TOTRGlj7P+vxH223Sqds30SwvFxgIHM7TWdYaHC7MuFT2uV3tvy4e9Y1UvkeFzpCSm7tSyQ2w7t4xzuIbLpfPi18rgsb5w=="
               )
            )
         );
         Xqedii_nd6rkr3.Xqedii_3s7zz34(
            var3,
            Xqedii_1df0pdx.deserialize(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "7UonubeFqMT2HbnmDHyz/3tKD45JbEsfziqR+vvsnMqjQMsI0o9KcPipfXVDNwdLIp76WyIy4NmhdeOeij+sfobeE6pEQ4zyV/gxlTrQe3IgAjV+Pgz/EC6glm6rmw+wfL1CDwXpG91RnPF6iE5ZG1o9c74lqZSFvDYLFEii4VbcPI9BI3iSp5x6JbS5Paq4+uSv+Q=="
               )
            )
         );
         Xqedii_nd6rkr3.Xqedii_3s7zz34(
            var3,
            Xqedii_1df0pdx.deserialize(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "Bos3RLUk+TwoMvcpkiMTy6s7vEhzhRo1H3xBJMK2FPQ6ganxwokit4jWAMgLvAmp5N/rjHFJn2O6w8wv5mFmanQAprG1WCIuBtFD/BuKRp0cMOdWynfiZir3NcoIJaa9du6GMNQAsr5YuFWUOSbZvfqpxZ2rmFGK8UtsW1zp33W+3YrD/J+K/TZjs7NDVjFRG9iIchiL"
               )
            )
         );
         Xqedii_nd6rkr3.Xqedii_3s7zz34(var3, Component.empty());
         Xqedii_nd6rkr3.Xqedii_3s7zz34(
            var3,
            Xqedii_1df0pdx.deserialize(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "b5kAr/DRpFUiS9h07y/jJ6NLzL/v3eWi2966Rb0/mhJPEE4jTM1bb5HuOftCsdOW49RxPDEk7RcK+uQjRc5x6a70b/vnKJ43wghCsXyxsdtD85JI3ZbyhxGHvjsDXLKeuDF9HfT+LJCeInwPHNLQhOXd9JVd8VrXFr/hf10+V1KkgLAZbw28389Y3G3StoMfkaODcA=="
               )
            )
         );
         Xqedii_nd6rkr3.Xqedii_3s7zz34(var3, Xqedii_1df0pdx.deserialize(Xqedii_118mpvc7w2fyj(var1)));
         Xqedii_nd6rkr3.Xqedii_3s7zz34(var3, Xqedii_1df0pdx.deserialize(Xqedii_2alypice9advc(var2)));
         Xqedii_nd6rkr3.Xqedii_3s7zz34(var3, Component.empty());
      }
   }

   public String computeResourcePackBannerStatus() {
      if ((598804792 * (598804792 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.getConfig()
         .getBoolean(
            Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
               "zwZG15QyIatcAeXYSZz/aAvgkDLVFhCcBaxqRTINGaXlufn9jxFQhkcsog7SdXFAMnbLHyh+0K+nEbFNWDoLxveCE2VafGHA8p69ogWptAtgjCyrCFKNCPgNAcWTGzPj4VTeo7zXxPGFpg=="
            ),
            (Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2050805092, 19) != 0)
         )) {
         return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("83Vh+JVjcX6IxEA9vTUd37Zcy0xP4l5CNLD2CzykpfvLPFAzCq9mG6dc/XdphZs264Ej4GXvFj2YzWdA5kjzmA==");
      } else if (this.getConfig()
         .getBoolean(
            Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
               "XgOAHEtarro1dgeimbKd5K1uRozq+U71dhhpgZAKtBcN0aF6Aavxlg0K13aiYj/Gp0IiBwxKJhd/f2pqKij3EK9U6y80kFC1HDWhlSWQAWOWBuLVKhcICCTvbUdE4IVE5WXC5huo7N808ArLxBMjy/e9"
            ),
            (Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(440530352, 27) != 0)
         )) {
         return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("MksgZ2XbSyB9wYWVsUmUbP50YyILwmsS3HdMzBbv/RPcsoQp/HVICpVyVmcuKKJIWEzJdcmXd3uW+xp0SOASYV4NII8rrSzq");
      } else if (this.getConfig()
         .getBoolean(
            Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
               "HQaqTK0SWPHaYPKlfuUET9Yjcyy56xtRHoz9eRM/tze5OxKEL0z6Z2yf30KjoE4OcaeBlazX/hJtE1m6CwU2VoNk/ly8MB5BkYZemww3heeaVSAAywYIvdvIY2s9FGZjajr5HXbOZo/qO92vry/hA9/U"
            ),
            (Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(2116599848, 15) != 0)
         )) {
         String var2 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("zZQCTz9sI2zZvUlCPBVQnJi3uhZuFTTEyEfcSuDbq3rfjSSqB1qRgYJl");
         if (this.getServer()
            .getPluginManager()
            .isPluginEnabled(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rlMkMQiqaP3P+diTlc+NtxBwsl5huKqZOUVpRb1C3TJAcEiB4Mu0RDy+Gzje8bkO"))) {
            var2 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("rlMkMQiqaP3P+diTlc+NtxBwsl5huKqZOUVpRb1C3TJAcEiB4Mu0RDy+Gzje8bkO");
         } else if (this.getServer()
            .getPluginManager()
            .isPluginEnabled(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("2vbpau975emmzII/J/PrkcOmIBT/B08H73sqTwJpUjTr16YSIj6Xjg=="))) {
            var2 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("2vbpau975emmzII/J/PrkcOmIBT/B08H73sqTwJpUjTr16YSIj6Xjg==");
         } else if (this.getServer()
            .getPluginManager()
            .isPluginEnabled(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("XHtCUfRpLHYjAjqwareWJFrY3KT+Am1cr0RPsjc3Xok+rktF"))) {
            var2 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("XHtCUfRpLHYjAjqwareWJFrY3KT+Am1cr0RPsjc3Xok+rktF");
         } else if (this.getServer()
            .getPluginManager()
            .isPluginEnabled(Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("oYN6KXNkaAa3aA+1TraTHcRZetOCaXWVZpRf38zd6QpungENaKZuuomHFtPo3+gQQUA="))) {
            var2 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("oYN6KXNkaAa3aA+1TraTHcRZetOCaXWVZpRf38zd6QpungENaKZuuomHFtPo3+gQQUA=");
         }

         return Xqedii_2624cyhs0gejw(var2);
      } else {
         if (this.getConfig()
            .getBoolean(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "rH2e83GIPDEIkYY5kwCavASmfl6ImwmAMOCBITKA6rnmQp48KMu//eLLgZ3w2ryDCwPjbxUSGBOI17nINtdWxp895BJzh5EHKC+/dTMSRJiCAqHLncQ5kyBCsm8exTVfo0UPv0aKl+a4gQfthatcyuXZ"
               ),
               (Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(553310221, 2) != 0)
            )) {
            File var1 = new File(
               this.getDataFolder().getParentFile(),
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("8K0JjLIZJHcEFp0DcERXuqrlnIgRUJI+qq6Z0xURXUMxOVMIMH+fEo7ZsoE2WST1/w80BA==")
            );
            if (var1.exists() && var1.isDirectory()) {
               return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("JqArrhbqG6tPy4KyLGICMU0LhiSH95bKIMXujwMCz/gr635Iys4iJvJB915u7CxYV6mI28yreTKauhMB3E/eJloMyuoiBw==");
            }
         }

         return this.getConfig()
               .getBoolean(
                  Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                     "13dwkBgyVHWINBclGMbYGp9aovUknGiC5lScA47+32c6SvHgWzi/Lisgz2QsjMbNIypV4T4UUipBQ5xh5xo9Hky31uNcLIQH5WjDWpq265u/jPbVuxBljWECsZvz3n7b0llP6C/pxe1BKUZuJHKr3Q=="
                  ),
                  (Xqedii_hh1t3jt.Xqedii_1r6lbp4zblm4b(2007549519, 20) != 0)
               )
            ? Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("kpBH8OLqztkodYsrbpQTDVs+vn+vPRpmb35iE6JynyZELxc0A47r6S5++87hrTV4hoT6qDQCJCQvq/THIHyLKqcUblgsTA==")
            : Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("zG41NvRCxW5dzz3mgis61bWG6CoomRcWXnG043zyZy6u0M4tIO97YmTiIn3hBrxuLgp0BK2ytWLk9v6XTX2jCDmsSoRPPZFn59Wolw==");
      }
   }

   public void scheduleLicenseRecheck() {
      if (((1922671955 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_38o2zes.Xqedii_uplb4zf(
            this, Xqedii_hh1t3jt.Xqedii_3tdod7lbk2je8(3200840768913367727L, 2), Xqedii_hh1t3jt.Xqedii_2lokc7flqd0o2(1344242176454631548L, 18), () -> {
               if (((-842009288 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  this.Xqedii_1zavo1k.Xqedii_2fgtzsf();
               }
            }
         );
      }
   }

   public void sendLicenseInvalidMessage(CommandSender var1) {
      if ((1534049126 * 1534049126 + 1534049126 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var10001 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
            "paOfdQkAyTIGHS7HqEWG1YjJnr7F1VP1bE+clxDw6jXKVRL8w+tCUD4ugoJYdttVq7gdlZ6LieiW9ZxrhzP+0EpKsFqL4M9ixPGGL7ejKdc="
         );
         String var10002 = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
            "1HD7nKlqp8GMDJuWwQDcDxMK4p0wdOpNDK5b176rEofwDl7q7y1iCIJsGhrsK3G3gVLadklP3di57zzveRvecQVkMBcM6DCDbAeT/nVtCKel4UhK/nt6lJ+bJRAyKNjfPA8IWxku"
         );
         Object[] var10003 = new Object[Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2059193700, 23)];
         var10003[Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(-2081726412, 4)] = Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
            "SMIc/v5nFwn0cAMCO6Sejp1hZ9iGn2sGJLgxsvK7lyFkkKJnYKNtUkwZ7QjYu9U3"
         );
         Xqedii_3ul4hqj.Xqedii_wmipi15(
            var1,
            var10001,
            List.of(
               Xqedii_3ul4hqj.Xqedii_l0arb10(var10002, var10003),
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "fDoht9JTyrrOHvuh9XvdIDQp6g4LPougdA72coMJIK+E0kzmAYCfK4vJVV0I2IpQ3grK/Oc9SCrczCemyUocCIRbkfy5l6vMWlrkU/BjHhK/j2qKrP59O5T7XhttlWGN+Thlpn9oAzJoiR37pdD0vDCu9wWIshs5BFlG1CP5hGyQ99wtodoFbpyQ3NlGtfqhMLBqJsNkpOc34uyzoP2bOkIazlCuGM8gsprkviCiV0oHPIFwA66kiuSBmjgp6po11V8MGtMvGPuMW6owLPpzp64nxuzoUNMQ+5cvmcsE+ewwG/+2gfCRvn8qlOAsoyA5MdRYhYTNvnWgppme6ZVVNaNvU4xuzPqj3GVEDKn8BV5pigiYToiRUL+NxG6SZcd9KhKaVQ=="
               )
            )
         );
         if (var1 instanceof Player var2) {
            try {
               var2.playSound(
                  var2.getLocation(),
                  Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("YReSPnmZQ0Xm+dZcYY7r5gWABsF64+J8U5oVMsGHIwQbskQIb8C/8QYiI45w00u2XdfeEX3ckf9rnz4Gt04="),
                  Float.intBitsToFloat(Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(1977404772, 30)),
                  Float.intBitsToFloat(Xqedii_hh1t3jt.Xqedii_1r6lbp4zblm4b(1045395371, 4))
               );
            } catch (Throwable var4) {
            }
         }
      }
   }

   public void scheduleRuntimeWatchdog() {
      if (((1039790823 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_38o2zes.Xqedii_uplb4zf(
            this,
            Xqedii_hh1t3jt.Xqedii_3tdod7lbk2je8(-6237278012582207018L, 44),
            Xqedii_hh1t3jt.Xqedii_37wczzubqqnj0(2710341348430997661L, 8),
            () -> {
               if ((-1495940959 * (-1495940959 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  if (!Xqedii_3omh7nb.Xqedii_2wauvzv().Xqedii_1u155gu()) {
                     Xqedii_38o2zes.Xqedii_34mipix(
                        this,
                        () -> {
                           if ((809110303 * 809110303 - 809110303 & 1) != 0) {
                              throw new IllegalStateException();
                           } else {
                              this.getLogger()
                                 .severe(
                                    Xqedii_1ikuwc112pzo7(
                                       Integer.toHexString(
                                          (int)(
                                             Xqedii_3omh7nb.Xqedii_2wauvzv().Xqedii_1ost86l() & Xqedii_hh1t3jt.Xqedii_3tdod7lbk2je8(-2978808254883254543L, 36)
                                          )
                                       )
                                    )
                                 );
                              this.getServer().getPluginManager().disablePlugin(this);
                           }
                        }
                     );
                  }
               }
            }
         );
         Xqedii_38o2zes.Xqedii_3rvp96a(this, () -> {
            if ((-929967699 * (-929967699 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               if (!Xqedii_3omh7nb.Xqedii_2wauvzv().Xqedii_2gxnzda() || !Xqedii_3omh7nb.Xqedii_2wauvzv().Xqedii_1u155gu()) {
                  Xqedii_38o2zes.Xqedii_34mipix(this, () -> {
                     if (((1614255956 | 1) & 1) == 0) {
                        throw new IllegalStateException();
                     } else {
                        this.getLogger().severe(Xqedii_2uqo0j7h1a54q(Integer.toHexString(System.identityHashCode(this.Xqedii_1zavo1k))));
                        this.getServer().getPluginManager().disablePlugin(this);
                     }
                  });
               }
            }
         }, Xqedii_hh1t3jt.Xqedii_26bb6vr3fxj4y(7077836913624706889L, 10));
      }
   }

   public boolean isPacketEventsAvailable() {
      if ((1698020990 ^ 1698020990) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Class.forName(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "cCM6bKGi7GuudClTa5gAwc8MxuBx74KHCjJN3kWf1dDCh/cUIcuDft1bx03WbTN9t9SGs7KCc13WM07NvjG+RlBBcZUKJ5IRp33ULu2fYbHH4IvHdvhov4FZGhp37C+wSVgKsw3Bx7DQ0hWgCv0Y6G9IXFyf4JJfv0llf8ErDB0iSu/k9Y6Y7HjOLcmYG+2hF7CdUIZNemP5OBtcbL+wakjFvK5CwA3zCRsZAK5sMcw="
               ),
               (Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(1106620442, 3) != 0),
               this.getClassLoader()
            );
            return (Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2050804068, 10) != 0);
         } catch (ClassNotFoundException var2) {
            return (Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(2116599848, 25) != 0);
         }
      }
   }

   public boolean verifyPacketEventsRuntime() {
      if ((-442394099 * -442394099 + -442394099 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Class.forName(
               Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                  "W2BbfAiiKpVuD2Vi0M9xy2X5lnfm/HcC+cJApZggpNSgt2fTuU39pxnWjLEFjyMDfiGfHT1m9yQGIa4iCOdluO4iIsMU6k68QMy/rTq24wxME1CpARZZAcB/g+cJkXdEavRXn+HJxOSLbVjcFNAaYFbjVTwImCyNu2Q6dQ4i7h8AmcaPcM+hUAlKIyX1qdj72q3KlPLI4lR2UrjLg6UXQdRT89ek51rdY6kSm5lmeEhaRi+zMKlg51uvVhFJvXt71dqq5DKNzunGjny5Irf0kwxwOyiu7EuivcEG5A=="
               ),
               (Xqedii_hh1t3jt.Xqedii_1r6lbp4zblm4b(-571592301, 18) != 0),
               this.getClassLoader()
            );
            return (Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(-2116599849, 10) != 0);
         } catch (Throwable var2) {
            this.getLogger()
               .severe(
                  Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn(
                     "cMEIdTaANtM4ppwyXJKrDEV1kJbZE1XT+77382GbcW6J8vIg+WhyMHPINkb1HB+PDffwQppeaikST229S0SL/r4UuJwXPWS/Opf4ByUaI5QmjrnQmqAPVQxMpwgojJZRovCmrDEKObNKC54CUYa0vkrfQ+0gboO1HNeBC4OnlbdtXtT1Xk3huTadyXBVQF5W4k8HR0Iu6NSVagVsOvXS0w7RleszTL8zeP9CA5+bNbRF/2M0GhZ7v8zGZsFkakkvmYn7PrIS5cQ="
                  )
               );
            var2.printStackTrace();
            return (Xqedii_hh1t3jt.Xqedii_20dgjsenbino3(2116599848, 24) != 0);
         }
      }
   }

   public void registerSelfInteractPacketGuard() {
      if (((-1511785105 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         PacketEventsAPI var1 = PacketEvents.getAPI();
         if (var1 != null) {
            this.unregisterSelfInteractPacketGuard();
            this.Xqedii_1pe76p2 = new PacketListenerAbstract(PacketListenerPriority.HIGHEST) {
               public static final String Xqedii_1h6jasgbir7up = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

               public void onPacketReceive(PacketReceiveEvent var1) {
                  if (((126497337 << 1 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else if (var1 != null && var1.getPacketType() == Client.INTERACT_ENTITY) {
                     if (var1.getPlayer() instanceof Player var3) {
                        WrapperPlayClientInteractEntity var4 = new WrapperPlayClientInteractEntity(var1);
                        if (var4.getEntityId() == var3.getEntityId()) {
                           var1.setCancelled((Xqedii_voo3zj9.Xqedii_2ogp6qa8eoarl(204576444, 2) != 0));
                        }
                     }
                  }
               }
            };
            var1.getEventManager().registerListener(this.Xqedii_1pe76p2);
         }
      }
   }

   public void suppressEditorTeleportClose(Player var1, long var2) {
      if (((2127881673 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var4 = var1.getUniqueId();
         this.Xqedii_12cf6tq.add(var4);
         Xqedii_38o2zes.Xqedii_2sj63w1(this, var1, () -> {
            if (((1478520135 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               this.Xqedii_12cf6tq.remove(var4);
            }
         }, Math.max(Xqedii_hh1t3jt.Xqedii_3tdod7lbk2je8(-7393963505915964853L, 61), var2));
      }
   }

   public boolean isEditorTeleportCloseSuppressed(Player var1) {
      if (((-31830284 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_12cf6tq.contains(var1.getUniqueId())
            ? Xqedii_hh1t3jt.Xqedii_1by2frulmlaf6(131514505, 5)
            : Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2050805092, 5)) != 0);
      }
   }

   public void registerShaderCursorUsePacketGuard() {
      if ((1080690219 * 1080690219 - 1080690219 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         PacketEventsAPI var1 = PacketEvents.getAPI();
         if (var1 != null) {
            this.unregisterShaderCursorUsePacketGuard();
            this.Xqedii_3bx8dfb = new PacketListenerAbstract(PacketListenerPriority.HIGHEST) {
               public static final String Xqedii_3cic0w92dsav8 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

               public void onPacketReceive(PacketReceiveEvent var1) {
                  if (((-1271530872 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else if (var1 != null) {
                     PacketTypeCommon var2 = var1.getPacketType();
                     int var3 = var2 == Client.PLAYER_BLOCK_PLACEMENT
                        ? Xqedii_1ad21jv.Xqedii_3okz3tv90j087(2061595012, 23)
                        : Xqedii_1ad21jv.Xqedii_3tmh54o84be9z(-80484834, 16);
                     if (var3 != 0 || var2 == Client.USE_ITEM) {
                        if (var1.getPlayer() instanceof Player var4) {
                           if (PluginBootstrap.this.Xqedii_1tuq2ol != null
                              && PluginBootstrap.this.Xqedii_2k1vujp != null
                              && PluginBootstrap.this.Xqedii_1tuq2ol.isShaderCursorActive(var4)) {
                              InteractionHand var6 = var3 != 0
                                 ? new WrapperPlayClientPlayerBlockPlacement(var1).getHand()
                                 : new WrapperPlayClientUseItem(var1).getHand();
                              if (var6 != InteractionHand.MAIN_HAND) {
                                 var1.setCancelled((Xqedii_1ad21jv.Xqedii_3tmh54o84be9z(80484833, 8) != 0));
                              } else {
                                 var1.setCancelled((Xqedii_1ad21jv.Xqedii_3okz3tv90j087(1549868728, 5) != 0));
                                 Xqedii_38o2zes.Xqedii_1avvt9e(PluginBootstrap.this, var4, () -> {
                                    if ((300367198 * 300367198 + 300367198 & 1) != 0) {
                                       throw new IllegalStateException();
                                    } else if (var4.isOnline() && PluginBootstrap.this.Xqedii_1tuq2ol != null && PluginBootstrap.this.Xqedii_2k1vujp != null) {
                                       if (PluginBootstrap.this.Xqedii_1tuq2ol.isShaderCursorActive(var4)) {
                                          PluginBootstrap.this.Xqedii_1tuq2ol.refreshClientBarrierCube(var4);
                                          PluginBootstrap.this.Xqedii_1tuq2ol.resampleShaderCursor(var4);
                                          PluginBootstrap.this.Xqedii_2k1vujp.setPlayerHeldToolAir(var4);
                                          PluginBootstrap.this.Xqedii_2k1vujp.clickHoveredElement(var4, GuiService.ClickType.RIGHT);
                                       }
                                    }
                                 });
                              }
                           }
                        }
                     }
                  }
               }
            };
            var1.getEventManager().registerListener(this.Xqedii_3bx8dfb);
         }
      }
   }

   public void unregisterShaderCursorUsePacketGuard() {
      if (((-1172670422 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3bx8dfb != null) {
         PacketEventsAPI var1 = PacketEvents.getAPI();
         if (var1 != null) {
            try {
               var1.getEventManager().unregisterListener(this.Xqedii_3bx8dfb);
            } catch (Throwable var3) {
            }
         }

         this.Xqedii_3bx8dfb = null;
      }
   }

   public void unregisterSelfInteractPacketGuard() {
      if ((909914903 * (909914903 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_1pe76p2 != null) {
         PacketEventsAPI var1 = PacketEvents.getAPI();
         if (var1 != null) {
            try {
               var1.getEventManager().unregisterListener(this.Xqedii_1pe76p2);
            } catch (Throwable var3) {
            }
         }

         this.Xqedii_1pe76p2 = null;
      }
   }

   public String resolveClassSource(Class<?> var1) {
      if ((1838801156 * (1838801156 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("7n7VQMT2GMe7UVlMNcCyAQ0adQ5q73zReBzaXv8Q7/dJ4rm1b6YIyg6T");
      } else {
         try {
            CodeSource var2 = var1.getProtectionDomain() == null ? null : var1.getProtectionDomain().getCodeSource();
            URL var3 = var2 == null ? null : var2.getLocation();
            return var3 == null ? Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("7n7VQMT2GMe7UVlMNcCyAQ0adQ5q73zReBzaXv8Q7/dJ4rm1b6YIyg6T") : var3.toString();
         } catch (Throwable var4) {
            return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("7n7VQMT2GMe7UVlMNcCyAQ0adQ5q73zReBzaXv8Q7/dJ4rm1b6YIyg6T");
         }
      }
   }

   public Class<?> resolveClassIfAvailable(String var1) {
      if ((1370136463 * (1370136463 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         try {
            return Class.forName(var1, (Xqedii_hh1t3jt.Xqedii_182qcz32dk3av(2050805092, 3) != 0), this.getClassLoader());
         } catch (Throwable var3) {
            return null;
         }
      } else {
         return null;
      }
   }

   public String resolveLocalPluginJarName() {
      if (((-1444686444 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            File var1 = this.getFile();
            return var1 == null ? Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("7n7VQMT2GMe7UVlMNcCyAQ0adQ5q73zReBzaXv8Q7/dJ4rm1b6YIyg6T") : var1.getName();
         } catch (Throwable var2) {
            return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("7n7VQMT2GMe7UVlMNcCyAQ0adQ5q73zReBzaXv8Q7/dJ4rm1b6YIyg6T");
         }
      }
   }

   private static /* synthetic */ String Xqedii_ejt86r99uggv(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("u4BtrilZnW3dWkE+YBOPxrk/kPekIoK9L+GXwPJ82zT8El/GzG2RdXx5q/fOE/f7iVUgy9ZabhTQhcVDxaaZM65U7Az3WuHbIcwbKy6+41rzi/5//BsdtI8n/647mxN8UttXjmVxFzyB0JK5Fxe0jGIFW3ipRGyZ7ST4+5HPschuMYab") + string;
    }

    private static /* synthetic */ String Xqedii_3tja43875epd6(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("LOelQ/9tJ/HknxVqRAdbgVlw8HNgn2M8rZYlG+KG2tV0fJmEv44NvKz46LLJExVTZi3EE/yLYcpX4KHuH4dG1OoJi6Dj936O0/9bZ+5ZbqfQ0IxY1/sOdafuiCJpZ++ehENV2L+u") + string;
    }

    private static /* synthetic */ String Xqedii_118mpvc7w2fyj(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("qUFIfmIo3r9Fneu9CRWpjMqiEVp6/t53kDUDofE+MPJItnmRCRxoxgAbDqLoWub6lPaOAIZC7iuUv4WXv+7o4hC3B5QNtQ==") + string;
    }

    private static /* synthetic */ String Xqedii_2alypice9advc(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("Vu4KGXjCrDDLuAL/a3J4BduOb+Hz0aeoFu2AtsurBfMa1kykPsR1zT+yY+jffHuFZoY4Y3qq0YUnqjdOPJ6ZoGvmFigHwAwrzJ7y7ufnh9uIgA==") + string;
    }

    private static /* synthetic */ String Xqedii_2624cyhs0gejw(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("2hLR5MScOekNOVL+lMpXlTa6w6W4RmG60mZnjPtF+yD/wxwBPkUaASCT3CPU6vabDNNeKc+3xLovAjzoRPwsYO1Ux1c3LIFtNc/vx58VC/K+pgUPrwKfU2+kviNxcYE6KFM=") + string + Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("BFpEnhxRTOxSJlP6Xaz9nIDDN5EItau6vCmGcqHV");
    }

    private static /* synthetic */ String Xqedii_2uqo0j7h1a54q(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("dDmRcd3mUamLyjYyJ51BGknJIL49iIUGw3EfLsY9KCFpGYjsFiMqiNLJ+W73ynpdXS/V+OoLNi8ELM7MUnimfq0XeCF+/I0/KyESZBjEtA7I5SxLkzEjr7ct2/Rcjg==") + string + Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("3s3ZP9k0K74gKZVWHzkaVkvREDOvxWQoqKc7YxujcQQ=");
    }

    private static /* synthetic */ String Xqedii_1ikuwc112pzo7(String string) {
        return Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("2UEobOAu2nvXrXnL6ODwWRUW4XPYNP/CJNzRY0Gv16/dyHtVPIONtkFQw1r0vw9S/PyCBCBewHEalLzcG9SO8R/3hcLa+tVpnJLxe53dB5QD0PKfx5KL+htG1mSAceAr4yngIh301WdlNQkClfg=") + string + Xqedii_hh1t3jt.Xqedii_2s7jjys5aojrn("mc7ozcrxDlUZ7vLNodCDoG3For2juwmrHS1Esh5V8wP7i8maoWoscRFf2K5SUKOY+FPbFJqbtDPJbO1WsUU=");
    }
}
