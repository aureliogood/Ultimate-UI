package dev.xqedii.ultimateUI.service.gui.base;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1yyog1o;
import dev.xqedii.ultimateUI.gui.parser.GuiTemplateResolver;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.head.PlayerHeadFontService;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;

public abstract class GuiServiceBaseSupport {
   public static final String Xqedii_hfu2qyheuwmo = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final UltimateUI plugin;
   public final HudService hudService;
   public final CameraService cameraService;
   public final GuiTemplateResolver templateResolver = new GuiTemplateResolver();
   public final HudPositionCalculator positionCalculator = new HudPositionCalculator();
   public final Map<UUID, EditorSession> editorSessions = new HashMap<>();
   public final Map<UUID, Map<String, String>> persistentVariables = new HashMap<>();
   public PlayerHeadFontService Xqedii_30r8g41;

   public GuiServiceBaseSupport(UltimateUI var1, HudService var2, CameraService var3) {
      this.plugin = var1;
      this.hudService = var2;
      this.cameraService = var3;
   }

   public PlayerHeadFontService playerHeadFontService() {
      if ((-167980802 ^ -167980802) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_30r8g41 == null) {
            this.Xqedii_30r8g41 = new PlayerHeadFontService(this.plugin, this::refreshRenderedPageForHeadSkin);
         }

         return this.Xqedii_30r8g41;
      }
   }

   public void refreshRenderedPageForHeadSkin(Player var1) {
      if (((1018583416 | 1) & 1) == 0) {
         throw new IllegalStateException();
      }
   }

   public void forgetPlayerHeadCache(Player var1) {
      if (((-23055281 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_30r8g41 != null) {
            this.Xqedii_30r8g41.forget(var1);
         }
      }
   }

   public int resolveCursorInterpDurationTicks() {
      if ((-985093671 * (-985093671 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1yyog1o.Xqedii_9w4szztik3zy(-2002485174, 11);
      }
   }

   public int resolveCursorTeleportDurationTicks() {
      if (((161045715 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.resolveCursorInterpDurationTicks();
      }
   }

   public int resolveEditorHudTransitionTicks(EditorSession var1) {
      if ((958584725 * 958584725 + 958584725 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var1.editMode && var1.previewMode
            ? this.resolveCursorInterpDurationTicks()
            : Xqedii_1yyog1o.Xqedii_1awbx0qsqgh3n(-1707181781, 8);
      }
   }

   public void playEditorSfx(Player var1, String var2) {
      if (((1354794325 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.playEditorSfx(var1, this.editorSessions.get(var1.getUniqueId()), var2);
      }
   }

   public void playEditorSfx(Player var1, EditorSession var2, String var3) {
      if ((-147131291 ^ -147131291) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var3 != null && !var3.isBlank()) {
         if (this.plugin
            .getConfig()
            .getBoolean(
               Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("1lXvIhZIutkMDUlqZolvCfOjwvdi9rvIvWCk3XK21pyAhADruadMgTpv/4YlErwiDF/Uq0kI+JGgX5opL0o+9AP/c6lQhg=="),
               (Xqedii_1yyog1o.Xqedii_350loa8x6zuyv(-2043944280, 1) != 0)
            )) {
            if (var2 == null || var2.editorSounds) {
               String var4 = this.plugin
                  .getConfig()
                  .getString(
                     Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("SCZ0mEKRunfJ5n17Dod5PIsCktGarNEf/DuccobMvovyvANgzjRtUo2+7H6Qs9ICWoKvWi9k0e0mZilNU4jWanRQ"),
                     Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("iUfAHkWlWE2NgWWpquqsCRcWIeMXzlBB2rNNpw==")
                  );
               if (var4 == null || var4.isBlank()) {
                  var4 = this.defaultEditorSfxName(var3);
               }

               if (var4 != null && !var4.isBlank()) {
                  float var5 = (float)Math.max(
                     Double.longBitsToDouble(Xqedii_1yyog1o.Xqedii_29lgpfcqqcid7(-4099648341517549257L, 1)),
                     this.plugin
                        .getConfig()
                        .getDouble(
                           Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("tNAEhOWDSGk4Vn63L/uFbyyTCtoqW41wzFrmUfBTxOgFZny/dxyAVc4tXAesOv2JVBx1Ed3kEMtXwKfyOxq8fBAXTtQ="),
                           Double.longBitsToDouble(Xqedii_1yyog1o.Xqedii_2fn8d3pf37m0d(4910123159187451252L, 18))
                        )
                  );
                  float var6 = Float.intBitsToFloat(Xqedii_1yyog1o.Xqedii_9w4szztik3zy(1218742357, 7));

                  try {
                     var1.playSound(var1.getLocation(), var4, SoundCategory.MASTER, var5, var6);
                  } catch (RuntimeException var8) {
                  }
               }
            }
         }
      }
   }

   public String defaultEditorSfxName(String var1) {
      if ((-1689794003 ^ -1689794003) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("iUfAHkWlWE2NgWWpquqsCRcWIeMXzlBB2rNNpw==");
      } else {
         int var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(2002483125, 11);
         switch (var1.hashCode()) {
            case -876608705:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("TU9+E+YcZKyXyk2lhicaGdIPHVkP2aka+EoWOkgLjdIU5qxObBxz6U+9AXm9/QMh/9jB3j6fIjg="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_350loa8x6zuyv(-245611755, 16);
               }
               break;
            case -718861975:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("wLQq339za/XYbTsIxV/+2WF3cN/wnuFITTRy+CdOjfpe3pnI0S+CYumunQ7xqPB9XDSsyP8rGJ1dVw=="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_1awbx0qsqgh3n(1204757875, 13);
               }
               break;
            case -437522519:
               if (var1.equals(
                  Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("NRkFFu0WwbkwnnN8XRM5/bVo5xTBULJHOJUCQknubHPO9EnAOsZOA6U3fF+RdbvtJRB+80AkpdQBsAw4Mm68HjdQJ+Bx2w==")
               )) {
                  var3 = Xqedii_1yyog1o.Xqedii_16il13xo4zjsk(2097745523, 12);
               }
               break;
            case 3208415:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("sLLY1xsQqlW1WV3HGXEfhCim/iATWVIXopDwgZ6tE0TOAX8L"))) {
                  var3 = Xqedii_1yyog1o.Xqedii_350loa8x6zuyv(-1104451486, 13);
               }
               break;
            case 3496446:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("yYrfRaKDKEUvsZ88E7a4SRnVymwcf+UH8Zm5ulHT4fg1Yjpx"))) {
                  var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(-2002270134, 14);
               }
               break;
            case 3522941:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("kAoNaX+gEqIBbFlqMuv0DjE87x9U694s1zaRkgO+MnTkQ//y"))) {
                  var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(-1985705910, 23);
               }
               break;
            case 3594468:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("NS/khFKjL6d2jnV9e5WqEBT83Hfuey3mtgYVq2erTm1430S7"))) {
                  var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(145000523, 29);
               }
               break;
            case 707398551:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("ZF2OR7wa297Zy5Bws2CBfmeEzIYKQxLatHcAsKmozgoJI2mTMK1fVYj85nWlFT4QZP55kdvKrSk="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_1awbx0qsqgh3n(-772531876, 11);
               }
               break;
            case 721185189:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("b7y2SkPrLVwBkV53MWkSVTXwvcDiESUEFzWJYJ14WLen/qbHtAf1rHqEVo6OtYdBAbsVQ39nl4ACug=="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_350loa8x6zuyv(-1978093686, 27);
               }
               break;
            case 894942762:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("7Ix7xHdz1HlOHXMaskID6myYvcuAz0wdgIA4+/qhd3qX8ssF8YDFB9HIWSjkYN+/pwrhGg=="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_350loa8x6zuyv(1125511506, 0);
               }
               break;
            case 1356794010:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("ocaShF5eATiDu5AAphrpLUHR0bL2vb3AcZ6v9gzD2kP/eSouRRxI/HtRExReWiaufSoJo0bQWkQ="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(-2002482870, 5);
               }
               break;
            case 1587042096:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("dNhpvCV9nJZyBK1aXJTocPm1Uk3gNDhh+I+cNbF8KN1s8VGw02EH1xZ2mngEfA+V/3Pankys"))) {
                  var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(-2002474934, 13);
               }
               break;
            case 1789895450:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("rrknxlo0X59eVaZN3djRj/6oftifHbWFaPkVbnM4oSdqMJMHNz/1WuEEjO9oBp0IPtiWJa60SnHH0k+9LEY="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_350loa8x6zuyv(1125511507, 0);
               }
               break;
            case 1983267339:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("BkSPh/jyX3ZtPHeXjhSQKbCxwDhSAfDE+s55n+YMd1BXi8EhTi/HRAPNnoHMGrvvvCpygw=="))) {
                  var3 = Xqedii_1yyog1o.Xqedii_1awbx0qsqgh3n(182882209, 30);
               }
               break;
            case 2052656329:
               if (var1.equals(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("Pzg6pcLJJs809xl1mQKuSLPLp6uvjBeiITxqZBURuEmryLpsGXRmFuHG64V/4ahZqzcv221K"))) {
                  var3 = Xqedii_1yyog1o.Xqedii_9w4szztik3zy(-1868265398, 27);
               }
         }
         return switch (var3) {
            case 0 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("LGdDg2Ydkn0T3Uw5puAD5f48tofS7+y8+dPa/7LlTkhf/0Wha8vPqVZ3xL77GONRTBYaHTi+tqeTPYns");
            case 1 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("d+8bWF+zAeIhzJpgXTIVwWUsij6uV5YjBWDCdq9J+mlWbT2Ncw6NNM9nS0muQQgx3RMeHI+Japyf/KeD3+AVnvQ1rH10mQ==");
            case 2 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("KG9AZAlbyX/FgypaFNqiefc9Fs/ia84FugVUAQp/ChMtgyiIotkdm1iDLGj3J6eB73CT5wLDU/AubneZvlE=");
            case 3 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("dXlAbh4qam1spyAYydyR69QPkwgEKfAQ2zRRdzwpNP3644n8EugPbFTTwaYPPx9amgxd6nzf6LIvbW9yXdY=");
            case 4 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("DyYtzo2PUcf/v+ODC7xgpZka2lDkK3vbO73UkBSQHsWDF1cWiCDeQvwvdKaVCVNUZk+DrgMfpyHXdldyccs=");
            case 5 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("nnWnz9KP6K/hU01VIBAmZT/QLxlNcFJXRhIi5rtRh2L+7BqZI0kJKZkYkKPj2IlduyNkxumlIIx8acCFJuM=");
            case 6 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("LGdDg2Ydkn0T3Uw5puAD5f48tofS7+y8+dPa/7LlTkhf/0Wha8vPqVZ3xL77GONRTBYaHTi+tqeTPYns");
            case 7 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("dXlAbh4qam1spyAYydyR69QPkwgEKfAQ2zRRdzwpNP3644n8EugPbFTTwaYPPx9amgxd6nzf6LIvbW9yXdY=");
            case 8 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("JKZEGgqfsort2enHXiD7ZvGMEeGUslIjtpe595HNqpsPICeNLyB6Wsw7wtk0C1Q7Ejattv3RdNAK8l/rVWc=");
            case 9 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("DyYtzo2PUcf/v+ODC7xgpZka2lDkK3vbO73UkBSQHsWDF1cWiCDeQvwvdKaVCVNUZk+DrgMfpyHXdldyccs=");
            case 10 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("LGdDg2Ydkn0T3Uw5puAD5f48tofS7+y8+dPa/7LlTkhf/0Wha8vPqVZ3xL77GONRTBYaHTi+tqeTPYns");
            case 11 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("LGdDg2Ydkn0T3Uw5puAD5f48tofS7+y8+dPa/7LlTkhf/0Wha8vPqVZ3xL77GONRTBYaHTi+tqeTPYns");
            case 12 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("DyYtzo2PUcf/v+ODC7xgpZka2lDkK3vbO73UkBSQHsWDF1cWiCDeQvwvdKaVCVNUZk+DrgMfpyHXdldyccs=");
            case 13 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("nnWnz9KP6K/hU01VIBAmZT/QLxlNcFJXRhIi5rtRh2L+7BqZI0kJKZkYkKPj2IlduyNkxumlIIx8acCFJuM=");
            case 14 -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("KG9AZAlbyX/FgypaFNqiefc9Fs/ia84FugVUAQp/ChMtgyiIotkdm1iDLGj3J6eB73CT5wLDU/AubneZvlE=");
            default -> Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("iUfAHkWlWE2NgWWpquqsCRcWIeMXzlBB2rNNpw==");
         };
      }
   }

   public List<Map<String, Object>> childBlocksOf(Map<String, Object> var1) {
      if (((2094433484 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1.get(Xqedii_1yyog1o.Xqedii_1nhp1t5pudt9d("p6O5f0qGZtnrmJ2jBJnjOhkQBr0g49zTbJEe3MUmnx478gmEhKTre9hM6lg=")) instanceof List var2
         && !var2.isEmpty()) {
         ArrayList var7 = new ArrayList(var2.size());

         for (Object var5 : var2) {
            if (var5 instanceof Map var6) {
               var7.add(var6);
            }
         }

         return var7;
      } else {
         return null;
      }
   }
}
