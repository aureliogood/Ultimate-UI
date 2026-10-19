package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.api.event.UltimateUIOpenEvent;
import dev.xqedii.ultimateUI.bedrock.BedrockUiService;
import dev.xqedii.ultimateUI.service.keybind.KeybindService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class UiOpenClose extends CommandFeedback {
   public static final String Xqedii_3en8jsevhqwjm = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public boolean handleUuiBedrockCommand(CommandSender var1, String[] var2) {
      if ((-1995899497 ^ -1995899497) != 0) {
         throw new IllegalStateException();
      } else if (!var1.hasPermission(Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("ActXeC9UwGVOEX/F9YBf6h7CVBVFxifOrQ1R4T0eUUUTO6EirfpQMCo8ndQl3bFvGUxawycZankMWt29"))
         && !var1.hasPermission(
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("rX/b35BdWk8gjDFcUs7icsmgcF5fVyxbEV+sR065+/AUKDBjF7CIyLAOM0PkZOJptNvgPDMK/cBZHxwEPTLVVja4RC9WwjMDl6mpGn3o")
         )) {
         this.sendUuiCommandError(
            var1,
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
               "afstDWc3Rj1uctXY/QEKh0najvscG6eUJVcO+upDb3tZPnytcOh/nnw4Dkr+HRrDZEikFXhP1s75qxViG5zpCXnpeZipOpqqN2CL+z8OBx+cgDLMaIpLSEFeccXvjKISZDIE2+XC5oE1jlOxtmoT9tyyi/oPg6Sm"
            ),
            new Object[Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-69315603, 7)]
         );
         return (Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1681788647, 18) != 0);
      } else if (this.Xqedii_1yufpo0 == null) {
         String var10002 = Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
            "jKyxKZvu7HtxF2Stp2csYINErPu702jT+J6iBOqgmIxfXMAfXlRdoSaxxpb2yYJaPO1Qvy0TcVGcyw+u0h0czzwfpMVjNY07UFmg1ENOKR1jZAyGEXIsxO2GRuPbqnd968B45CC84er1mdWLPIj8YSUrygpd5yxT3UP+zADJULOzj35lU5wPrrygGPSa2UuRK6dJQ2YRiDstKA=="
         );
         Object[] var10003 = new Object[Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-1916830774, 28)];
         var10003[Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-224432162, 18)] = Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
            "cyxLffC8ZPLoj5aR6udJEbHEkl1Pfw8AvvINgzczeTE0f+2MIJHXDY73pF8RxwNHndE="
         );
         this.sendUuiCommandError(var1, var10002, var10003);
         return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-909601846, 22) != 0);
      } else {
         String var3 = var2.length >= Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(2076876223, 12)
            ? var2[Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(1718552516, 12)].toLowerCase(Locale.ROOT)
            : Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("3mBh1Itkgdyvn8/BKTPCfjvL0C3HBnUtEX0s/w==");
         int var5 = Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-224694306, 18);
         switch (var3.hashCode()) {
            case -892481550:
               if (var3.equals(Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("IWw6wJoei0ROpeP80DuxXzeX9gi67Nn8VCL0vxk0eflb0ccGt2rH/w=="))) {
                  var5 = Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(295288031, 6);
               }
               break;
            case 94094958:
               if (var3.equals(Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("/Qhym76+cdFrKsWGrZMIjYxtvRnDXZiRFqaORzDJwq8+zxkDJW0="))) {
                  var5 = Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(-1506548012, 19);
               }
               break;
            case 106426308:
               if (var3.equals(Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("7rOxkd9OUBKJds9vQ5MlWe+nF5lcKN9T98Lj3/uFId4u0lLgtgk="))) {
                  var5 = Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(2130154779, 5);
               }
         }

         switch (var5) {
            case 0:
               Xqedii_3ul4hqj.Xqedii_3m0zjou(
                  var1,
                  Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
                     "QcDuioahx2GFdS3J1qPm1iHod+LQPIEtqRkMXCIB/vexp2Mjm8K8StEdLTxgN4cKL6hXsPqtLkQYWFfsRfEq3yZa569VG1hF+Zq1LK8gEw2RUdln"
                  )
               );
               this.Xqedii_1yufpo0.buildPackAsync(var1x -> {
                  if ((-1251477784 * -1251477784 + -1251477784 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     ArrayList var2x = new ArrayList();

                     for (String var4 : var1x.warnings()) {
                        var2x.add(Xqedii_3ul4hqj.Xqedii_1u4gly2(var4));
                     }

                     String var5x = Xqedii_3ul4hqj.Xqedii_1u4gly2(Xqedii_3ul4hqj.Xqedii_2qnwa4c(var1x.message()));
                     if (var1x.success()) {
                        Xqedii_3ul4hqj.Xqedii_2g7xq9b(var1, (Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1932664584, 9) != 0), var5x, var2x);
                     } else {
                        Xqedii_3ul4hqj.Xqedii_wmipi15(var1, var5x, var2x);
                     }
                  }
               });
               break;
            case 1:
               List var10 = this.Xqedii_1yufpo0.pageNames();
               ArrayList var11 = new ArrayList();

               for (String var13 : (Iterable<String>) (var10)) {

                  var11.add(Xqedii_3ul4hqj.Xqedii_2133eaa(Xqedii_3ul4hqj.Xqedii_1u4gly2(var13)));
               }

               Xqedii_3ul4hqj.Xqedii_3crurrx(var1, Xqedii_1hoyqbtsoi0u(var10.size()), var11);
               break;
            case 2:
               ArrayList var6 = new ArrayList();

               for (String var8 : this.Xqedii_1yufpo0.status()) {
                  int var9 = var8.indexOf(Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("E9a32eodUUCH4a3++0LIgfeXL59p89m7Ay2UpyLlCKE="));
                  var6.add(
                     var9 > 0
                        ? Xqedii_3ul4hqj.Xqedii_1oxsv35(
                           var8.substring(Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(1876882079, 2), var9).trim(),
                           Xqedii_3ul4hqj.Xqedii_1u4gly2(var8.substring(var9 + Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1999839633, 5)).trim())
                        )
                        : Xqedii_3ul4hqj.Xqedii_2133eaa(Xqedii_3ul4hqj.Xqedii_1u4gly2(var8))
                  );
               }

               Xqedii_3ul4hqj.Xqedii_3crurrx(var1, Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("S8bWjikI7BUb2wsjmQ/YRAuYDKSZdjXDJoFJ1tkSoi3ftmZkzs1Bgjv8"), var6);
               break;
            default:
               Xqedii_3ul4hqj.Xqedii_3crurrx(
                  var1,
                  Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("S8bWjikI7BUb2wsjmQ/YRAuYDKSZdjXDJoFJ1tkSoi3ftmZkzs1Bgjv8"),
                  List.of(
                     Xqedii_3ul4hqj.Xqedii_15zzeiq(
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("7cMShQFxtVb3icQ7OoF1rBXF/DaFzgR1184oCCV7+tePcOF/Al2NaY9cDATj6qAitjLtow=="),
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("/Qhym76+cdFrKsWGrZMIjYxtvRnDXZiRFqaORzDJwq8+zxkDJW0="),
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
                           "kgdXItXx6Q76Yf7RsPnD2qMmHcZFHzkCtTrVwABIa42E5xok2TN9SMzh0Jt98hP4v0H2Rmd8bbGjUZLTUgoQNzETG+dIvwYuq482T3iEPlCgXd+7tpYUhANvNR8="
                        )
                     ),
                     Xqedii_3ul4hqj.Xqedii_15zzeiq(
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("7cMShQFxtVb3icQ7OoF1rBXF/DaFzgR1184oCCV7+tePcOF/Al2NaY9cDATj6qAitjLtow=="),
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("7rOxkd9OUBKJds9vQ5MlWe+nF5lcKN9T98Lj3/uFId4u0lLgtgk="),
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
                           "eBt0mOfsDweMq9sXcYhxzbnh/lngvZKxJetH7ZtdLwkeUGLfEDi+92JpjDvWSb1qhU+zhHh/IkymRYCA5Lg255KprWu5l+JYsd3nesfFejERux3NQ/mUKZ/xNXrHNrr4ibrSdQ=="
                        )
                     ),
                     Xqedii_3ul4hqj.Xqedii_15zzeiq(
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("7cMShQFxtVb3icQ7OoF1rBXF/DaFzgR1184oCCV7+tePcOF/Al2NaY9cDATj6qAitjLtow=="),
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("IWw6wJoei0ROpeP80DuxXzeX9gi67Nn8VCL0vxk0eflb0ccGt2rH/w=="),
                        Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z(
                           "qmBvk8SxP1EpxZED10KKkzN8rHKQZxPke2zTPDq/fWOBVcBv9enwM9LITdEN4UEc0pi2TsuJ5svAq2Z346neVl4kkpu12OcIAgq6Ie8vPjowbuOO5locbiaBwON7SrN2"
                        )
                     )
                  )
               );
         }

         return (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-554523793, 10) != 0);
      }
   }

   public KeybindService getKeybindService() {
      if ((-96589244 * -96589244 - -96589244 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_f3ftqgq;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean openUiForPlayer(Player var1, String var2, boolean var3, boolean var4) {
      if ((-344057681 ^ -344057681) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && this.Xqedii_2k1vujp != null) {
         UltimateUIOpenEvent var5 = new UltimateUIOpenEvent(var1, var2.trim(), var3, var4);
         this.getServer().getPluginManager().callEvent(var5);
         if (var5.isCancelled()) {
            return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 12) != 0);
         } else {
            if (this.Xqedii_1yufpo0 != null) {
               BedrockUiService.OpenResult var6 = this.Xqedii_1yufpo0.tryOpen(var1, var2, var3);
               switch (dev.xqedii.ultimateUI.Xqedii_os41zqy.Xqedii_359kwn6[var6.ordinal()]) {
                  case 1:
                     return (Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(1506548011, 14) != 0);
                  case 2:
                     return (Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(-1506548012, 24) != 0);
                  case 3:
                     return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 11) != 0);
                  case 4:
               }
            }

            List var10 = var3 ? Collections.emptyList() : this.Xqedii_2k1vujp.getKeepOpenPageKeys(var1);
            List var7 = this.Xqedii_2k1vujp.getReopenPageKeys(var1);
            if (!var7.isEmpty()) {
               this.Xqedii_yy2ps2m.put(var1.getUniqueId(), new ArrayList<>(var7));
            }

            boolean var8 = this.Xqedii_2k1vujp.isEditorOpen(var1);
            Location var9 = var8 && !var3 ? this.resolvePreferredReturnLocation(var1) : null;
            if (var3) {
               if (var8) {
                  this.closeUiForPlayer(var1);
               } else {
                  this.closeUiForPlayer(var1, var2);
               }
            } else if (var8) {
               this.closeUiForPlayer(var1);
            }

            if (var8) {
               Xqedii_38o2zes.Xqedii_2sj63w1(this, var1, () -> {
                  if ((-1993618799 * -1993618799 - -1993618799 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     if (var1.isOnline()) {
                        this.restorePreservedReturnLocation(var1, var9);
                        this.startUiForPlayer(var1, var2, var3, var4, var10, Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 27), var9);
                     }
                  }
               }, Xqedii_3kpvqee.Xqedii_1pnbq026ph38d(-4026109377150437398L, 32));
               return (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-34657738, 6) != 0);
            } else {
               return this.startUiForPlayer(var1, var2, var3, var4, var10, Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-564924933, 15));
            }
         }
      } else {
         return (Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(-1506548012, 20) != 0);
      }
   }

   public boolean startUiForPlayer(Player var1, String var2, boolean var3, boolean var4, List<String> var5, int var6) {
      if ((-74686140 * -74686140 + -74686140 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.startUiForPlayer(var1, var2, var3, var4, var5, var6, null);
      }
   }

   public void restorePreservedReturnLocation(Player var1, Location var2) {
      if (((1363319323 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.getWorld() != null) {
         if (var1.isInsideVehicle()) {
            var1.leaveVehicle();
         }

         Location var3 = var1.getLocation();
         if (!var2.getWorld().equals(var3.getWorld())
            || var3.distanceSquared(var2) > Double.longBitsToDouble(Xqedii_3kpvqee.Xqedii_2t5wok0w0zjda(8763427357951457756L, 39))) {
            this.suppressEditorTeleportClose(var1, Xqedii_3kpvqee.Xqedii_exxsiao2o613(2152474290360643589L, 27));
            Xqedii_38o2zes.Xqedii_2pl8m41(var1, var2);
         }
      }
   }

   public boolean startUiForPlayer(Player var1, String var2, boolean var3, boolean var4, List<String> var5, int var6, Location var7) {
      if ((884929484 ^ 884929484) != 0) {
         throw new IllegalStateException();
      } else if (this.shouldLevelPitchBeforeOpen(var1, var3, var6)) {
         Location var11 = var1.getLocation();
         var11.setPitch(Float.intBitsToFloat(Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 28)));
         Xqedii_38o2zes.Xqedii_fxq2htx(var1, var11);
         int var12 = var6 + Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(1506548011, 29);
         Xqedii_38o2zes.Xqedii_2sj63w1(this, var1, () -> {
            if ((61120236 * (61120236 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               if (var1.isOnline()) {
                  this.startUiForPlayer(var1, var2, var3, var4, var5, var12, var7);
               }
            }
         }, Xqedii_3kpvqee.Xqedii_exxsiao2o613(-9063810865479925780L, 60));
         return (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(708247023, 22) != 0);
      } else {
         Location var8 = var7 != null && !var3 ? var7.clone() : this.resolveReturnLocationBeforeOpen(var1, var3);
         boolean var9 = var3 ? this.Xqedii_2k1vujp.startGuiHud(var1, var2, var4) : this.Xqedii_2k1vujp.startGui(var1, var2, var4);
         this.updateReturnLocationAfterOpen(var1, var9, var3, var8);
         if (!var3 && var9 && !var5.isEmpty()) {
            ArrayList var10 = new ArrayList(var5);
            Xqedii_38o2zes.Xqedii_2sj63w1(this, var1, () -> {
               if ((-814096581 * -814096581 - -814096581 & 1) != 0) {
                  throw new IllegalStateException();
               } else if (var1.isOnline()) {
                  for (String var4x : (Iterable<String>) (var10)) {

                     this.Xqedii_2k1vujp.startGuiHud(var1, var4x, (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-1109049633, 11) != 0));
                  }
               }
            }, Xqedii_3kpvqee.Xqedii_exxsiao2o613(7236651370390781913L, 61));
         }

         return var9;
      }
   }

   public boolean shouldLevelPitchBeforeOpen(Player var1, boolean var2, int var3) {
      if (((393164886 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 || this.Xqedii_1fwpabk == null || !this.Xqedii_1fwpabk.isFixShadersEnabled(var1)) {
         return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 4) != 0);
      } else if (this.Xqedii_1tuq2ol != null && this.Xqedii_1tuq2ol.isCameraActive(var1)) {
         return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 0) != 0);
      } else if (var3 >= Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913795638, 9)) {
         return (Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(-1506548012, 12) != 0);
      } else {
         return ((Math.abs(var1.getLocation().getPitch()) > Float.intBitsToFloat(Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(1795107294, 10))
            ? Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1041163877, 26)
            : Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 22)) != 0);
      }
   }

   public void closeUiForPlayer(Player var1) {
      if (((1356764618 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (this.Xqedii_1yufpo0 != null && this.Xqedii_1yufpo0.hasOpenScreen(var1)) {
            this.Xqedii_1yufpo0.closeScreen(var1);
         } else {
            if (this.Xqedii_2k1vujp != null && this.Xqedii_2k1vujp.hasOpenSession(var1)) {
               this.Xqedii_2k1vujp.closeGui(var1);
               if (this.Xqedii_2k1vujp.hasOpenSession(var1)) {
                  return;
               }
            }

            this.closeUiForPlayerImmediate(var1);
         }
      }
   }

   public void closeUiForPlayerImmediate(Player var1) {
      if (((2028171803 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         List var2 = this.Xqedii_yy2ps2m.remove(var1.getUniqueId());
         Location var3 = this.resolvePreferredReturnLocation(var1);
         this.cleanupPlayerRuntime(var1);
         if (var3 != null) {
            Xqedii_38o2zes.Xqedii_fxq2htx(var1, var3);
         }

         if (var2 != null && !var2.isEmpty() && var1.isOnline()) {
            ArrayList var4 = new ArrayList(var2);
            Xqedii_38o2zes.Xqedii_2sj63w1(
               this,
               var1,
               () -> {
                  if ((-1480262463 * -1480262463 - -1480262463 & 1) != 0) {
                     throw new IllegalStateException();
                  } else if (var1.isOnline()) {
                     for (String var4x : (Iterable<String>) (var4)) {

                        this.openUiForPlayer(
                           var1,
                           var4x,
                           (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-1552949518, 26) != 0),
                           (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-75565164, 29) != 0)
                        );
                     }
                  }
               },
               Xqedii_3kpvqee.Xqedii_1pnbq026ph38d(-4026109381445371926L, 14)
            );
         }
      }
   }

   public void closeUiForPlayerAndTeleport(Player var1, Location var2) {
      if (((1687004746 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.Xqedii_yy2ps2m.remove(var1.getUniqueId());
         this.Xqedii_1hpn9ga.remove(var1.getUniqueId());
         this.cleanupPlayerRuntime(var1);
         if (var2 != null) {
            Xqedii_38o2zes.Xqedii_2sj63w1(this, var1, () -> {
               if (((479803279 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else if (var1.isOnline()) {
                  Xqedii_38o2zes.Xqedii_fxq2htx(var1, var2);
               }
            }, Xqedii_3kpvqee.Xqedii_y75r82kpdbxx(8457046513621662793L, 33));
         }
      }
   }

   public boolean closeUiForPlayer(Player var1, String var2) {
      if ((-1022917693 * (-1022917693 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         String[] var10001 = new String[Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1138814567, 22)];
         var10001[Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1932664072, 9)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isBlank()) {
            this.closeUiForPlayer(var1);
            return (Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-896680069, 20) != 0);
         } else {
            String var4 = this.normalizeUiNameToken(var3);
            if (var4.isBlank()) {
               return (Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(-1506548012, 5) != 0);
            } else {
               UUID var5 = var1.getUniqueId();
               Location var6 = this.resolvePreferredReturnLocation(var1);
               boolean var7 = this.Xqedii_2k1vujp.closeGui(var1, var3);
               if (!var7) {
                  var10001 = new String[Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1041163877, 26)];
                  var10001[Xqedii_3kpvqee.Xqedii_25ft6lmir3fes(-1506548012, 6)] = this.Xqedii_2k1vujp.getActiveGuiName(var1);
                  String var8 = this.firstNonBlank(var10001).trim();
                  if (!var8.isBlank()) {
                     String var9 = this.normalizeUiNameToken(var8);
                     if (!var9.isBlank() && var9.equalsIgnoreCase(var4)) {
                        this.closeUiForPlayer(var1);
                        return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-909601846, 22) != 0);
                     }
                  }

                  return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 6) != 0);
               } else {
                  if (!this.Xqedii_2k1vujp.hasOpenSession(var1)) {
                     this.Xqedii_1hpn9ga.remove(var5);
                     if (var6 != null) {
                        Xqedii_38o2zes.Xqedii_fxq2htx(var1, var6);
                     }
                  }

                  return (Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-1987537974, 30) != 0);
               }
            }
         }
      } else {
         return (Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(1863828582, 20) != 0);
      }
   }

   public String normalizeUiNameToken(String var1) {
      if ((-1296640784 ^ -1296640784) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-909601846, 22)];
         var10001[Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(1863828582, 20)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.toLowerCase(Locale.ROOT).endsWith(Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("sWr075m7oQXOMtKerqPb+/CZ82PSas4uBmzahSG75OgZBLUv"))) {
            var2 = var2.substring(Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-913796150, 30), var2.length() - Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-1987537974, 28));
         }

         var2 = var2.replace((char)Xqedii_3kpvqee.Xqedii_tbcmkr56nltf(-1104989354, 31), (char)Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-911797302, 15))
            .replace((char)Xqedii_3kpvqee.Xqedii_1fsxc10ivrk0q(-604521258, 0), (char)Xqedii_3kpvqee.Xqedii_3pcmpk7l79w3h(-1033333814, 21));
         var2 = var2.replaceAll(
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("q0QtqKMGP/r69tiI7g//0X5i647Iyh9fxJuD5v2ClSyxmg=="),
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("iyem8mgbV0Jm8WgWlY/roXBYdxB4/iBH7FviI9le")
         );
         var2 = var2.replaceAll(
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("cW4hCREp6sMBU74rYvWACD0j8CYSwOQAsFeA6JfllxPyUpDb9jIYf2B7CTAPfd7CLQyMiL65FeY="),
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("3mBh1Itkgdyvn8/BKTPCfjvL0C3HBnUtEX0s/w==")
         );
         var2 = var2.replaceAll(
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("yHPJ0ZX1pLFOGwSk09R80bSYwFOWLlnnl7f1he9oKNs="),
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("iyem8mgbV0Jm8WgWlY/roXBYdxB4/iBH7FviI9le")
         );
         var2 = var2.replaceAll(
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("xbup+/KgRvrmBsVdLPZqcXLlOfAV0Y0CuGV/+pWsd/wrMw=="),
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("3mBh1Itkgdyvn8/BKTPCfjvL0C3HBnUtEX0s/w==")
         );
         var2 = var2.replaceAll(
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("JJ+KsiA0cJrPwszLxfCbSk3zclk9Fnc1P5jFKGz/Ynms0g=="),
            Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("3mBh1Itkgdyvn8/BKTPCfjvL0C3HBnUtEX0s/w==")
         );
         return var2.isBlank() ? Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("3mBh1Itkgdyvn8/BKTPCfjvL0C3HBnUtEX0s/w==") : var2.toLowerCase(Locale.ROOT);
      }
   }

   private static /* synthetic */ String Xqedii_1hoyqbtsoi0u(int n) {
        return Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("ry1nXLgtNVbnog+PVAT30KEHnEEbmJ9eB8zB+sAebMMRpUQlnOCVKtK4UQGRv/sVdx+BZdtIeBcsvQ==") + n + Xqedii_3kpvqee.Xqedii_3pl8o3140hd1z("I6VIJ/dkoCvq3IY3LmaCiHnWaTvpHOl9VJoOoM+A");
    }
}
