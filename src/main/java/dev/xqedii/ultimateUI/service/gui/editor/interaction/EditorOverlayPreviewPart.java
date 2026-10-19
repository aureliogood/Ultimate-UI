package dev.xqedii.ultimateUI.service.gui.editor.interaction;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_14y6uzm;
import dev.xqedii.ultimateUI.Xqedii_2j3b4yz;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3uxgwyg;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.editor.GuiServiceEditorShellSupport;
import dev.xqedii.ultimateUI.service.gui.editor.shell.managers.EditorTimelineKeyframePart.HoverEffectRuntimeConfig;
import dev.xqedii.ultimateUI.service.gui.model.EditorPropertyField;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.gui.model.PreviewViewport;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator.Placement;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.util.Vector;

public abstract class EditorOverlayPreviewPart extends GuiServiceEditorShellSupport {
   public static final String Xqedii_gp60bj9knac2 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final Map<String, EditorOverlayPreviewPart.HoverEffectState> Xqedii_25w26wj = new HashMap<>();
   public final Map<String, EditorOverlayPreviewPart.HoverEffectState> Xqedii_298sov1 = new HashMap<>();
   public final Map<String, Integer> Xqedii_3ipjthg = new HashMap<>();
   public final Set<String> Xqedii_22tk2a1 = new HashSet<>();
   public int Xqedii_ya1winh;
   public static final String[] Xqedii_2jjpxmd;

   public EditorOverlayPreviewPart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public static double imageGroupSingleTilePartialShiftX(double var0, double var2) {
      if ((1265030343 ^ 1265030343) != 0) {
         throw new IllegalStateException();
      } else if (var0 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 38))
         && var2 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 55))) {
         double var4 = var0 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3064121833062032729L, 60)) / var2;
         double var6 = Math.min(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6059897403810720450L, 63)),
            Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8832723085512251551L, 19)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855951678L, 20))
                  * (Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-2684247403524329446L, 21)) - var4)
            )
         );
         return var6 * var2 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-7690688687512877572L, 5));
      } else {
         return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 25));
      }
   }

   public abstract void renderResolvedContent(Player var1, EditorSession var2);

   public abstract void renderEditorTransparencyOverlay(Player var1, EditorSession var2);

   public abstract void startMoveDrag(EditorSession var1, double var2, double var4);

   public abstract void stopCursorToolDrag(EditorSession var1);

   public String applyHoverColorToText(String var1, String var2) {
      if ((601881387 * 601881387 - 601881387 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var3 = this.normalizeHexColor(var2);
         if (var3.isBlank()) {
            return var1;
         } else {
            String var4 = Xqedii_3p1t8np4e16jv(var3.toLowerCase(Locale.ROOT));
            Matcher var5 = Pattern.compile(
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SzVbcZui7KCpn7s80CKaeP02KJjfW8kNUukGKUK5ml52PZvC0PqUpgtziNCtZAYi08jSCNJGs1KlFVnE5uE=")
               )
               .matcher(var1);
            if (!var5.find()) {
               Matcher var6 = Pattern.compile(
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RdYXTo7i0VITWysigV0UJes3HoDTw2zdqqz1U3yHfgQkVTKbb1U+QjlfaOFCMBXPYa1yVgqbT9TJXR3ij83EgaiDKi8=")
                  )
                  .matcher(var1);
               return var6.find()
                  ? Xqedii_277azecfieibg(var1.substring(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1496727844, 17), var6.end()), var4, var1.substring(var6.end()))
                  : Xqedii_wojhrm39gyt7(var4, var1);
            } else {
               return Xqedii_cfh2jjosbyoa(var1.substring(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-264802543, 27), var5.start()), var4, var1.substring(var5.end()));
            }
         }
      } else {
         return var1;
      }
   }

   public String brightenOrDarken(String var1) {
      if ((1040836643 ^ 1040836643) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Matcher var2 = Pattern.compile(
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SzVbcZui7KCpn7s80CKaeP02KJjfW8kNUukGKUK5ml52PZvC0PqUpgtziNCtZAYi08jSCNJGs1KlFVnE5uE=")
            )
            .matcher(var1);
         if (!var2.find()) {
            return var1;
         } else {
            String var3 = var2.group();
            String var4 = var3.substring(Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904113624, 9), Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904145368, 12));
            int var5 = Integer.parseInt(
               var4.substring(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 20), Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112632, 4)),
               Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(830370776, 26)
            );
            int var6 = Integer.parseInt(
               var4.substring(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1136131875, 13), Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(2038330328, 25)),
               Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670516211, 12)
            );
            int var7 = Integer.parseInt(
               var4.substring(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670532595, 12), Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609827393, 9)),
               Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960799700, 24)
            );
            int var8 = (var5 + var6 + var7) / Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(136612646, 30);
            if (var8 < Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670141427, 11)) {
               var5 = this.clampColor(
                  (int)Math.round(
                     var5
                        + (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670551283, 7) - var5)
                           * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(5797852720553342680L, 35))
                  )
               );
               var6 = this.clampColor(
                  (int)Math.round(
                     var6
                        + (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1870509903, 26) - var6)
                           * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-480116516502465704L, 62))
                  )
               );
               var7 = this.clampColor(
                  (int)Math.round(
                     var7
                        + (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(136612633, 30) - var7)
                           * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-5011131750535382542L, 31))
                  )
               );
            } else {
               var5 = this.clampColor((int)Math.round(var5 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3923009979102994224L, 27))));
               var6 = this.clampColor((int)Math.round(var6 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6139144819379522973L, 41))));
               var7 = this.clampColor((int)Math.round(var7 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-196549818909746062L, 59))));
            }

            String var10000 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/kOzP7AKFCJTv/D5vCZX0jBlip4q/7HXYWOpsJLz5o2oUw9jjsJNGtIecFCc9SE2vaGeus/zrSSQ5A==");
            Object[] var10001 = new Object[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1056665244, 27)];
            var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960392668, 14)] = var5;
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1996743753, 18)] = var6;
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112584, 3)] = var7;
            String var9 = String.format(var10000, var10001);
            return Xqedii_2o79oob63hhnp(var1.substring(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 31), var2.start()), var9, var1.substring(var2.end()));
         }
      } else {
         return var1;
      }
   }

   public int clampColor(int var1) {
      if (((-1810100169 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Math.max(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(374181961, 15), Math.min(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1937501627, 21), var1));
      }
   }

   public EditorRect resizeRect(EditorSession var1, EditorRect var2, String var3, double var4, double var6, boolean var8) {
      if ((245713088 * 245713088 - 245713088 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         String var9 = this.normalizeCornerHandleAlias(var3);
         double var10 = var4 - var1.resizeStartCursorX;
         double var12 = var6 - var1.resizeStartCursorY;
         int var14 = !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k=").equals(var9)
            ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 17)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301773752, 18);
         int var15 = !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ujDWiVo1I0hCGh4H8kgva3DXqMOz8YV7Au21Aax6").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY=").equals(var9)
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 12)
            : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112344, 8);
         int var16 = !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/74s3wCxJXnV7/75LZAinDvaAm7Gjnj8TR15T0/n").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k=").equals(var9)
            ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1059210169, 29)
            : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 6);
         int var17 = !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("dwPmh5p1Np0ePnoR+jj8WwCr7s5vzkVooNw6ZtSF").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0=").equals(var9)
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 7)
            : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022687163, 14);
         int var18 = !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ucDvW3k84iQNWTef9dnwjHxUOtLTiit7/stKE3vd").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY=").equals(var9)
               && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k=").equals(var9)
            ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2118420337, 30)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198288, 7);
         double var19 = var2.x;
         double var21 = var2.y;
         double var23 = var2.width;
         double var25 = var2.height;
         double var27 = var19;
         double var29 = var21;
         double var31 = var19 + var23;
         double var33 = var21 + var25;
         int var36 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(116253245, 0);
         switch (var9.hashCode()) {
            case 101:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/74s3wCxJXnV7/75LZAinDvaAm7Gjnj8TR15T0/n"))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1874740360, 22);
               }
               break;
            case 110:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("dwPmh5p1Np0ePnoR+jj8WwCr7s5vzkVooNw6ZtSF"))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 18);
               }
               break;
            case 115:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ucDvW3k84iQNWTef9dnwjHxUOtLTiit7/stKE3vd"))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112601, 0);
               }
               break;
            case 119:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ujDWiVo1I0hCGh4H8kgva3DXqMOz8YV7Au21Aax6"))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544867, 4);
               }
               break;
            case 3146:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY="))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(583651849, 12);
               }
               break;
            case 3152:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k="))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-910030558, 20);
               }
               break;
            case 3704:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw="))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465013000, 2);
               }
               break;
            case 3710:
               if (var9.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0="))) {
                  var36 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1866351752, 22);
               }
         }

         switch (var36) {
            case 0:
               var21 += var12;
               var25 -= var12;
               break;
            case 1:
               var25 += var12;
               break;
            case 2:
               var19 += var10;
               var23 -= var10;
               break;
            case 3:
               var23 += var10;
               break;
            case 4:
               var19 += var10;
               var23 -= var10;
               var21 += var12;
               var25 -= var12;
               break;
            case 5:
               var23 += var10;
               var21 += var12;
               var25 -= var12;
               break;
            case 6:
               var19 += var10;
               var23 -= var10;
               var25 += var12;
               break;
            case 7:
               var23 += var10;
               var25 += var12;
         }

         if (var23 < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-418868104291273900L, 57))) {
            if (var15 != 0) {
               var19 += var23;
            }

            var23 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 51));
         }

         if (var25 < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 16))) {
            if (var17 != 0) {
               var21 += var25;
            }

            var25 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 44));
         }

         if (var8 && var14 != 0) {
            EditorRect var35 = this.createProportionalCornerRect(
               var1, var2, var9, var27, var29, var31, var33, var23, var25, (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198416, 7) != 0)
            );
            var19 = var35.x;
            var21 = var35.y;
            var23 = var35.width;
            var25 = var35.height;
         }

         if (var15 != 0) {
            var19 = this.snapToGrid(var1, var19);
            var23 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 31)), this.snapToGrid(var1, var31) - var19);
         } else if (var16 != 0) {
            var19 = this.snapToGrid(var1, var27);
            var23 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(9171134923493094837L, 30)), this.snapToGrid(var1, var19 + var23) - var19
            );
         } else {
            var19 = this.snapToGrid(var1, var19);
            var23 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7709754459610151019L, 23)), this.snapToGrid(var1, var23));
         }

         if (var17 != 0) {
            var21 = this.snapToGrid(var1, var21);
            var25 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 57)), this.snapToGrid(var1, var33) - var21);
         } else if (var18 != 0) {
            var21 = this.snapToGrid(var1, var29);
            var25 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5337166449285550013L, 26)), this.snapToGrid(var1, var21 + var25) - var21
            );
         } else {
            var21 = this.snapToGrid(var1, var21);
            var25 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 47)), this.snapToGrid(var1, var25));
         }

         if (var8 && var14 != 0) {
            EditorRect var41 = this.createProportionalCornerRect(
               var1, var2, var9, var27, var29, var31, var33, var23, var25, (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904108504, 12) != 0)
            );
            var19 = var41.x;
            var21 = var41.y;
            var23 = var41.width;
            var25 = var41.height;
         }

         return new EditorRect(var19, var21, var23, var25);
      } else {
         return var2;
      }
   }

   public EditorRect createProportionalCornerRect(
      EditorSession var1, EditorRect var2, String var3, double var4, double var6, double var8, double var10, double var12, double var14, boolean var16
   ) {
      if ((-822877042 * -822877042 - -822877042 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var17 = this.normalizeCornerHandleAlias(var3);
         double var18 = this.resolveProportionalScaleFactor(var2, var12, var14);
         double var20 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-2684247403524850150L, 21)), var2.width * var18);
         double var22 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 53)), var2.height * var18);
         if (var16) {
            var20 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 10)), this.snapToGrid(var1, var20));
            var22 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5022198250375935272L, 36)), this.snapToGrid(var1, var22));
         }

         double var24;
         double var26;
         if (var16) {
            double var28 = this.snapToGrid(var1, var4);
            double var30 = this.snapToGrid(var1, var6);
            double var32 = this.snapToGrid(var1, var8);
            double var34 = this.snapToGrid(var1, var10);
            int var37 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303940346, 8);
            switch (var17.hashCode()) {
               case 3146:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY="))) {
                     var37 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-662156275, 23);
                  }
                  break;
               case 3152:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k="))) {
                     var37 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(68306323, 29);
                  }
                  break;
               case 3704:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw="))) {
                     var37 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 30);
                  }
                  break;
               case 3710:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0="))) {
                     var37 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 4);
                  }
            }

            switch (var37) {
               case 0:
                  var24 = var32 - var20;
                  var26 = var34 - var22;
                  break;
               case 1:
                  var24 = var28;
                  var26 = var34 - var22;
                  break;
               case 2:
                  var24 = var32 - var20;
                  var26 = var30;
                  break;
               case 3:
                  var24 = var28;
                  var26 = var30;
                  break;
               default:
                  var24 = var28;
                  var26 = var30;
            }
         } else {
            int var29 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544818, 6);
            switch (var17.hashCode()) {
               case 3146:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY="))) {
                     var29 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1844895031, 28);
                  }
                  break;
               case 3152:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k="))) {
                     var29 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-653767667, 23);
                  }
                  break;
               case 3704:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw="))) {
                     var29 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-654012060, 27);
                  }
                  break;
               case 3710:
                  if (var17.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0="))) {
                     var29 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112584, 4);
                  }
            }

            switch (var29) {
               case 0:
                  var24 = var8 - var20;
                  var26 = var10 - var22;
                  break;
               case 1:
                  var24 = var4;
                  var26 = var10 - var22;
                  break;
               case 2:
                  var24 = var8 - var20;
                  var26 = var6;
                  break;
               case 3:
                  var24 = var4;
                  var26 = var6;
                  break;
               default:
                  var24 = var4;
                  var26 = var6;
            }
         }

         return new EditorRect(var24, var26, var20, var22);
      }
   }

   public String normalizeCornerHandleAlias(String var1) {
      if ((937667566 * (937667566 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         int var3 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1820477619, 26);
         switch (var1.hashCode()) {
            case 3511:
               if (var1.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("C1xz0Q9EjyNNpBq9WpkRiNNMyr0cR9KmwFvoYnPP5XM="))) {
                  var3 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904096216, 14);
               }
               break;
            case 3529:
               if (var1.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BchCsucYNRWUwBji92zcaPjRTQc3WcTJ2yevvpVopSg="))) {
                  var3 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(306549604, 5);
               }
               break;
            case 3666:
               if (var1.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("idWkgZW15qtZxODfHRjFBKgzYyWrWkvdbKPlbwmuAjE="))) {
                  var3 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(930025992, 3);
               }
               break;
            case 3684:
               if (var1.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("WwM+DbjnGq9N74EAsjCcewrjnWlBjq1fZkYmV27F5rM="))) {
                  var3 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1844895031, 28);
               }
         }
         return switch (var3) {
            case 0 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw=");
            case 1 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0=");
            case 2 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY=");
            case 3 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k=");
            default -> var1;
         };
      } else {
         return var1;
      }
   }

   public double resolveProportionalScaleFactor(EditorRect var1, double var2, double var4) {
      if ((-81962160 * -81962160 + -81962160 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var6 = var1.width <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(3160302708160181218L, 29))
            ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-8523010669133105859L, 4))
            : var2 / var1.width;
         double var8 = var1.height <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(3190440000231410456L, 58))
            ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(8883120891163969003L, 61))
            : var4 / var1.height;
         double var10 = Math.abs(var6 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153456884399080939L, 50)));
         double var12 = Math.abs(var8 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175683227583979L, 32)));
         double var14 = var10 >= var12 ? var6 : var8;
         return !Double.isFinite(var14)
            ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(9073152958914195040L, 13))
            : Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 1)), var14);
      }
   }

   public EditorRect transformBounds(EditorSession var1, EditorRect var2, EditorRect var3, EditorRect var4) {
      if ((-928774140 * -928774140 + -928774140 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && var4 != null) {
         double var5;
         double var7;
         if (var3.width <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(9222260156305874835L, 5))) {
            var5 = var4.x;
            var7 = var4.x + var2.width;
         } else {
            double var9 = (var2.x - var3.x) / var3.width;
            double var11 = (var2.maxX() - var3.x) / var3.width;
            var5 = var4.x + var9 * var4.width;
            var7 = var4.x + var11 * var4.width;
         }

         double var21;
         double var22;
         if (var3.height <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(5638071920593809640L, 41))) {
            var21 = var4.y;
            var22 = var4.y + var2.height;
         } else {
            double var13 = (var2.y - var3.y) / var3.height;
            double var15 = (var2.maxY() - var3.y) / var3.height;
            var21 = var4.y + var13 * var4.height;
            var22 = var4.y + var15 * var4.height;
         }

         double var23 = this.snapToGrid(var1, var5);
         double var24 = this.snapToGrid(var1, var21);
         double var17 = this.snapToGrid(var1, var7);
         double var19 = this.snapToGrid(var1, var22);
         return new EditorRect(
            var23,
            var24,
            Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 34)), var17 - var23),
            Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-1092450576556720873L, 8)), var19 - var24)
         );
      } else {
         return var2;
      }
   }

   public void updateCursorPositionReadout(Player var1, EditorSession var2, double var3, double var5) {
      if (((573369052 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode) {
         Entity var7 = this.hudService
            .getHud(
               var1,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                  "/MyvIXkakjpVksJryDYnlsv91Cpk78C+m5R9WuoYhQKFEBvLufX8XaTqLO1BlBkqH0JrSeCGpeETfNCk46dAbK2T+7oIqgP2hRTFZ14LTlErX0EK"
               )
            );
         if (var7 != null) {
            double var8 = this.toLogicalCursorX(var2, var3);
            double var10 = this.toLogicalCursorY(var2, var5);
            double var12 = var2.previewViewport == null
               ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-5243563302851333522L, 60))
               : var2.previewViewport.pageWidth;
            double var14 = var2.previewViewport == null
               ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-2322397931687246058L, 10))
               : var2.previewViewport.pageHeight;
            int var16 = !(var8 < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 58)))
                  && !(var8 > var12)
                  && !(var10 < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 7)))
                  && !(var10 > var14)
               ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 31)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 19);
            String var17 = var16 != 0
               ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("dLNnGqcHuccrUSqZUw/ih6QVRIzDsL1fsc7a0pq9315DbaJXRxx8j95D9K/IeA==")
               : Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("t+5lBiqzB7BVqAt7DKZ+Gv7rngGuO05XSlMo5zmDaN3N3xCEiSuw3MNatntSog==");
            String var18 = Xqedii_bkxx2rzuhmkr(var17, Math.round(var8), Math.round(var10));
            ConfigurationSection var19 = this.findShellBlockSection(
               var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("axU1XbN0HZNSweWE4X7Pir57HSJzKhTBgci/4wgbasn4DlapGQ3Ejl36QiWyBunmjefg1ANQlQyXNA==")
            );
            String var20 = this.applyPreferredFont(var18, var19, (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 22) != 0));
            if (!var20.equals(this.hudService.getHudText(var7, null))) {
               this.hudService.setHudText(var7, var20, null, (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(650650763, 22) != 0));
            }
         }
      }
   }

   public void updatePageInfoReadout(Player var1, EditorSession var2) {
      if ((-1353831819 * -1353831819 + -1353831819 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode) {
         this.updatePreviewSizeToastAnchor(var1, var2);
         this.updatePreviewUiAddonsAnchor(var1, var2);
         this.updatePreviewEmptyInfoOverlay(var1, var2);
         Entity var3 = this.hudService
            .getHud(
               var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("rB+dI/fjpOereflUzJnTtLbofTSCR5dbQ4WQzf2FxUMFRgnbXZURdchvzotoMmELoDc7RO1R6WQTE8P8B4BAA3lPMDvubZhJ")
            );
         if (var3 != null) {
            int var4 = var2.previewViewport == null
               ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-246348938, 15)
               : (int)Math.round(
                  Math.max(
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175134007592427L, 41)),
                     var2.previewViewport.zoom * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-6250383221478279561L, 23))
                  )
               );
            int[] var10000 = new int[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167270930, 13)];
            var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 18)] = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 16);
            var10000[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 28)] = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1092901174, 1);
            int[] var5 = var10000;
            this.countLayerAndGroupStats(var2.rawBlocks, var5);
            ConfigurationSection var6 = this.findShellBlockSection(
               var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("X3euyBtNHOP2Y+QwkD1FwjmL9+wfs0iZIuPJEXYsh1+Lv4HwfuVQExT3q/rc8g==")
            );
            String var7 = this.normalizeHexColor(
               var6 == null ? null : var6.getString(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("UebDV6blIlMOdrD183AYVPTZ6v7+DqpIJYxwDoYCN5DaDwPaKJ8="))
            );
            if (var7.isBlank()) {
               var7 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("OOsA/PeTdrDSxeMlfn1EwBIVDE7m7r0yKl5SrQc2vgOTVCU5vw5+7Q==");
            }

            String var8 = Xqedii_2wfkhpd4pkrl7(
               var7, var4, var5[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 7)], var5[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 2)]
            );
            String var9 = this.applyPreferredFont(var8, var6, (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 24) != 0));
            if (!var9.equals(this.hudService.getHudText(var3, null))) {
               this.hudService.setHudText(var3, var9, null, (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12) != 0));
            }

            Entity var10 = this.hudService
               .getHud(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "6j1QiSKnHLBedaXilOE83OXgA8zrf8G5jRLgGneBjSk6yeaIaOOPMXMqRgY2O3TpeO6eNtpk28OSp/F5RqBi+PDzrQfagHMyCRiZhxMsHtW26w=="
                  )
               );
            if (var10 != null) {
               int var11 = Math.max(
                  Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 27),
                  (int)Math.round(
                     var2.previewViewport == null
                        ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3125191610739135365L, 22))
                        : var2.previewViewport.pageWidth
                  )
               );
               int var12 = Math.max(
                  Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1709141460, 24),
                  (int)Math.round(
                     var2.previewViewport == null
                        ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6601474936708192567L, 59))
                        : var2.previewViewport.pageHeight
                  )
               );
               String var13 = Xqedii_27qfa24iozy97(var11, var12);
               ConfigurationSection var14 = this.findShellBlockSection(
                  var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Dw7auWkBGn64lme1APSo+sg1mCBQLX3M8lv/KqIShL5wkY0ySqfD1kNoM/SmhW+mdqts9rRUIfE=")
               );
               String var15 = this.normalizeHexColor(
                  var14 == null ? null : var14.getString(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("UebDV6blIlMOdrD183AYVPTZ6v7+DqpIJYxwDoYCN5DaDwPaKJ8="))
               );
               String var16 = var15.isBlank() ? var13 : Xqedii_3t45wtmugs64f(var15, var13);
               String var17 = this.applyPreferredFont(var16, var14, (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1301301526, 23) != 0));
               if (!var17.equals(this.hudService.getHudText(var10, null))) {
                  this.hudService.setHudText(var10, var17, null, (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274802, 4) != 0));
               }
            }
         }
      }
   }

   public void updatePreviewSizeToastAnchor(Player var1, EditorSession var2) {
      if ((-155819558 * -155819558 - -155819558 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode && (var2.previewSizeToastVisible || var2.previewSizeToastPendingReveal)) {
         PreviewViewport var3 = var2.previewViewport;
         if (var3 != null) {
            ConfigurationSection var4 = this.findShellBlockSection(
               var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0mRgr3uMEsShhM89+b73D7YP5MJs1S1SUjGkERjQBKZAENdx849I2cSxJgakY2bu0A6nfw==")
            );
            EditorRect var5 = this.findShellBlockRect(
               var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0mRgr3uMEsShhM89+b73D7YP5MJs1S1SUjGkERjQBKZAENdx849I2cSxJgakY2bu0A6nfw==")
            );
            if (var4 != null && var5 != null) {
               double var6 = var3.previewX
                  + (var3.previewWidth - var5.width) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-2070196352554498582L, 1));
               double var8 = var3.previewY
                  + var3.previewHeight
                  - var5.height
                  - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3910570544871464682L, 46));
               double var10 = var6 - var5.x;
               double var12 = var8 - var5.y;
               if (!(Math.abs(var10) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(5454120754708743735L, 19)))
                  || !(Math.abs(var12) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-8973160651572187095L, 63)))) {
                  String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112472, 7)];
                  var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 15)] = var4.getString(
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                  );
                  String var14 = this.firstNonBlank(var10001);
                  if (var14.isBlank()) {
                     this.moveShellElement(
                        var1,
                        var2,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0mRgr3uMEsShhM89+b73D7YP5MJs1S1SUjGkERjQBKZAENdx849I2cSxJgakY2bu0A6nfw=="),
                        var6,
                        var8,
                        var5.width,
                        var5.height
                     );
                  } else {
                     HashMap var15 = new HashMap();
                     int var16 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1692364244, 24);

                     for (Map var18 : var2.shellBlocks) {
                        var16++;
                        ConfigurationSection var19 = this.mapToSection(var18);
                        if (var19 != null) {
                           var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-574863392, 5)];
                           var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 29)] = var19.getString(
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                                 "O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI="
                              )
                           );
                           String var20 = this.firstNonBlank(var10001);
                           if (this.belongsToSidebarPanel(var14, var20)) {
                              String var21 = this.resolveElementId(var19, var16, var15);
                              if (!var21.isBlank()) {
                                 EditorRect var22 = this.findShellBlockRect(var2, var21);
                                 if (var22 != null) {
                                    this.moveShellElement(var1, var2, var21, var22.x + var10, var22.y + var12, var22.width, var22.height);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void updatePreviewUiAddonsAnchor(Player var1, EditorSession var2) {
      if (((73901508 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         PreviewViewport var3 = var2.previewViewport;
         if (var3 != null) {
            ConfigurationSection var4 = this.findShellBlockSection(
               var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ELD0Qvu8Gz80gDss+U8yeHsZaTtecBVF3MfqUxIr8YDioqik6O3RhouRcJ3ijp5bQYGBSmMmz0XP4lDYX0w=")
            );
            if (var4 != null) {
               this.ensureShellBlockCache(var2);
               double var5 = var2.previewDefaultZoom;
               if (!Double.isFinite(var5) || var5 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(1376614652939352343L, 15))) {
                  var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7821141210002013651L, 47));
               }

               double var7 = var3.baseScale * var5;
               if (Double.isFinite(var7) && !(var7 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6619687296843876749L, 30)))) {
                  double var9 = this.getPreviewScale(var2);
                  if (Double.isFinite(var9) && !(var9 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(2252080477419345703L, 59)))) {
                     double var11 = var9 / var7;
                     if (Double.isFinite(var11) && !(var11 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 55)))) {
                        double var13 = var3.pageWidth * var7;
                        double var15 = var3.pageHeight * var7;
                        double var17 = var3.previewX
                           + (var3.previewWidth - var13) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(3988949705690456793L, 51));
                        double var19 = var3.previewY
                           + (var3.previewHeight - var15) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684302374379L, 23));
                        double var21 = this.toRenderX(var2, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3350944834330191193L, 60)));
                        double var23 = this.toRenderY(var2, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 54)));
                        String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 4)];
                        var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1203822012, 21)] = var4.getString(
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                        );
                        String var25 = this.firstNonBlank(var10001);
                        if (var25.isBlank()) {
                           EditorRect var42 = (EditorRect)var2.shellStaticRectCache
                              .get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ELD0Qvu8Gz80gDss+U8yeHsZaTtecBVF3MfqUxIr8YDioqik6O3RhouRcJ3ijp5bQYGBSmMmz0XP4lDYX0w="));
                           if (var42 == null) {
                              var42 = this.findShellBlockRect(
                                 var2,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ELD0Qvu8Gz80gDss+U8yeHsZaTtecBVF3MfqUxIr8YDioqik6O3RhouRcJ3ijp5bQYGBSmMmz0XP4lDYX0w=")
                              );
                           }

                           if (var42 != null) {
                              double var43 = var21 + (var42.x - var17) * var11;
                              double var44 = var23 + (var42.y - var19) * var11;
                              double var45 = Math.max(
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855804110L, 16)), var42.width * var11
                              );
                              double var46 = Math.max(
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300375499L, 17)), var42.height * var11
                              );
                              this.moveShellElement(
                                 var1,
                                 var2,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ELD0Qvu8Gz80gDss+U8yeHsZaTtecBVF3MfqUxIr8YDioqik6O3RhouRcJ3ijp5bQYGBSmMmz0XP4lDYX0w="),
                                 var43,
                                 var44,
                                 var45,
                                 var46
                              );
                           }
                        } else {
                           HashMap var26 = new HashMap();
                           int var27 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 29);

                           for (Map var29 : var2.shellBlocks) {
                              var27++;
                              ConfigurationSection var30 = this.mapToSection(var29);
                              if (var30 != null) {
                                 var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904145368, 15)];
                                 var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 26)] = var30.getString(
                                    Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                                       "O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI="
                                    )
                                 );
                                 String var31 = this.firstNonBlank(var10001);
                                 if (this.belongsToSidebarPanel(var25, var31)) {
                                    String var32 = this.resolveElementId(var30, var27, var26);
                                    if (!var32.isBlank()) {
                                       EditorRect var33 = (EditorRect)var2.shellStaticRectCache.get(var32);
                                       if (var33 != null) {
                                          double var34 = var21 + (var33.x - var17) * var11;
                                          double var36 = var23 + (var33.y - var19) * var11;
                                          double var38 = Math.max(
                                             Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7228897458887454356L, 50)), var33.width * var11
                                          );
                                          double var40 = Math.max(
                                             Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4540802010935870756L, 6)), var33.height * var11
                                          );
                                          this.moveShellElement(var1, var2, var32, var34, var36, var38, var40);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void updatePreviewEmptyInfoOverlay(Player var1, EditorSession var2) {
      if (((442000078 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         PreviewViewport var3 = var2.previewViewport;
         if (var3 != null) {
            ConfigurationSection var4 = this.findShellBlockSection(
               var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O9qB3qbi8OfhFP66JU2xkZk5u/QxegPopS/vijk4f303sJPWDjkCD0guGkeMXhC65SzMCk02Gv5QW0Mx")
            );
            if (var4 != null) {
               boolean var5 = this.shouldShowPreviewEmptyInfo(var2);
               this.setShellOpacity(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O9qB3qbi8OfhFP66JU2xkZk5u/QxegPopS/vijk4f303sJPWDjkCD0guGkeMXhC65SzMCk02Gv5QW0Mx"),
                  var5 ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2089356898, 31) : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112594, 1)
               );
               if (var5) {
                  this.ensureShellBlockCache(var2);
                  double var6 = var2.previewDefaultZoom;
                  if (!Double.isFinite(var6) || var6 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-4214953274874611699L, 30))) {
                     var6 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855815361L, 12));
                  }

                  double var8 = var3.baseScale * var6;
                  if (Double.isFinite(var8) && !(var8 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(2513680767196242311L, 4)))) {
                     double var10 = this.getPreviewScale(var2);
                     if (Double.isFinite(var10) && !(var10 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-8429906549749223397L, 31)))) {
                        double var12 = var10 / var8;
                        if (Double.isFinite(var12) && !(var12 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5608782707361646774L, 49)))) {
                           double var14 = var3.pageWidth * var8;
                           double var16 = var3.pageHeight * var8;
                           double var18 = var3.previewX
                              + (var3.previewWidth - var14) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639120003298622L, 33));
                           double var20 = var3.previewY
                              + (var3.previewHeight - var16) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(3870139395208074748L, 14));
                           double var22 = this.toRenderX(var2, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 18)));
                           double var24 = this.toRenderY(var2, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-8360814600931977922L, 63)));
                           double var26 = var3.pageWidth * var10;
                           double var28 = var3.pageHeight * var10;
                           EditorRect var30 = (EditorRect)var2.shellStaticRectCache
                              .get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O9qB3qbi8OfhFP66JU2xkZk5u/QxegPopS/vijk4f303sJPWDjkCD0guGkeMXhC65SzMCk02Gv5QW0Mx"));
                           if (var30 == null) {
                              var30 = this.findShellBlockRect(
                                 var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O9qB3qbi8OfhFP66JU2xkZk5u/QxegPopS/vijk4f303sJPWDjkCD0guGkeMXhC65SzMCk02Gv5QW0Mx")
                              );
                           }

                           if (var30 != null) {
                              double var31 = var22 + (var30.x - var18) * var12;
                              double var33 = var24 + (var30.y - var20) * var12;
                              double var35 = Math.max(
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(4536576479457097520L, 12)), var30.width * var12
                              );
                              double var37 = Math.max(
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684299490539L, 20)), var30.height * var12
                              );
                              var31 += var26 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(8434533784647209447L, 61));
                              var33 += var28 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(3486656278472468206L, 45));
                              this.moveShellElement(
                                 var1,
                                 var2,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O9qB3qbi8OfhFP66JU2xkZk5u/QxegPopS/vijk4f303sJPWDjkCD0guGkeMXhC65SzMCk02Gv5QW0Mx"),
                                 var31,
                                 var33,
                                 var35,
                                 var37
                              );
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void countLayerAndGroupStats(List<Map<String, Object>> var1, int[] var2) {
      if ((-203742437 * (-203742437 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.length >= Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544627, 8)) {
         for (Map var4 : var1) {
            if (var4 != null) {
               if (var4.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var6
                  && !var6.isEmpty()) {
                  var2[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1902015448, 21)] += Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 8);
                  ArrayList var7 = new ArrayList();

                  for (Object var9 : var6) {
                     if (var9 instanceof Map var10) {
                        var7.add(var10);
                     }
                  }

                  this.countLayerAndGroupStats(var7, var2);
               } else {
                  var2[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1059210169, 29)] += Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301773752, 18);
               }
            }
         }
      }
   }

   public void upsertOverlayHud(Player var1, String var2, Vector var3, Vector var4, String var5) {
      if ((-942615510 * -942615510 - -942615510 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var6 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         int var7 = this.resolveEditorHudTransitionTicks(var6);
         String var8 = this.ensureRoundedCornerEditorFont(var5);
         Entity var9 = this.hudService.getHud(var1, var2);
         if (var9 == null) {
            this.hudService
               .addHud(
                  var1,
                  var2,
                  var3,
                  var4,
                  var8,
                  TextAlignment.CENTER,
                  TextAlignment.CENTER,
                  (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 13) != 0),
                  Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(-1904315432, 24)
               );
         } else {
            Vector var10 = this.hudService.getHudLocation(var9);
            if (!this.sameVector(var10, var3)) {
               this.hudService.moveHud(var9, var3, var7, var7);
            }

            Vector var11 = this.hudService.getHudScale(var9);
            if (!this.sameVector(var11, var4)) {
               this.hudService.setHudScale(var9, var4, var7, (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(930025968, 3) != 0));
            }

            String var12 = this.hudService.getHudText(var9, null);
            if (!this.equalsNullable(var12, var8)) {
               this.hudService.setHudText(var9, var8, null, (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 3) != 0));
            }
         }
      }
   }

   public void removeOverlayHud(Player var1, String var2) {
      if ((-1075401761 * (-1075401761 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Entity var3 = this.hudService.getHud(var1, var2);
         if (var3 != null) {
            this.hudService.removeHudX(Collections.singletonList(var3), (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 2) != 0));
         }

         var1.removeMetadata(Xqedii_31cw52u1hvuys(var2), this.plugin);
      }
   }

   public void renderAnimationPreviewMotionPath(Player var1, EditorSession var2) {
      if (((-1475411379 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         if (var1 != null && var2.previewMode && var2.activeTool == EditorTool.ANIMATION && var2.selectionOutlineVisible) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607879667, 9)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1059210169, 29)] = this.resolveTimelineEditableTargetId(var2);
            String var3 = this.firstNonBlank(var10001);
            if (var3.isBlank()) {
               this.clearAnimationPreviewMotionPath(var1, var2);
            } else {
               TreeSet var4 = new TreeSet();
               var4.addAll(
                  this.readAnimationTimelineTicks(
                     var2, var3, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8=")
                  )
               );
               if (var4.isEmpty()) {
                  this.clearAnimationPreviewMotionPath(var1, var2);
               } else {
                  var4.add(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609826369, 9));
                  double var5 = this.resolveAnimationPreviewZoom(var2);
                  double var7 = this.resolvePreviewPathDotSpacing(var5);
                  double var9 = this.isImagePositionOffsetTarget(var2, var3)
                     ? this.resolveSidebarImagePositionOffset(EditorPropertyField.POSITION_X)
                     : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 44));
                  double var11 = this.isImagePositionOffsetTarget(var2, var3)
                     ? this.resolveSidebarImagePositionOffset(EditorPropertyField.POSITION_Y)
                     : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 20));
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903981528, 17)];
                  var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(520320753, 23)] = var2.animationTimelineSelectedTargetId;
                  String var13 = this.firstNonBlank(var10001);
                  int var14 = this.equalsNullable(var13, var3)
                     ? this.clampAnimationTimelineTick(var2.animationTimelineSelectedTick)
                     : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670413810, 17);
                  LinkedHashSet var15 = new LinkedHashSet();
                  ArrayList var16 = new ArrayList(var4);

                  for (int var17 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 0);
                     var17 < var16.size() - Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1863448631, 11);
                     var17++
                  ) {
                     int var18 = this.clampAnimationTimelineTick((Integer)var16.get(var17));
                     int var19 = this.clampAnimationTimelineTick((Integer)var16.get(var17 + Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167279122, 13)));
                     if (var19 > var18) {
                        List var20 = this.buildAnimationPreviewPathSamples(var2, var3, var18, var19);
                        double var21 = this.resolveAnimationPreviewPathLength(var20);
                        int var23 = this.resolvePreviewPathDotCount(var19 - var18, var21, var5, var7);
                        int var24 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 4);

                        for (int var25 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903981528, 17);
                           var25 < var23 - Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301773752, 18);
                           var25++
                        ) {
                           double var26 = var25 * var7;
                           if (var26 >= var21 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(7910954800683051699L, 15))) {
                              break;
                           }

                           double[] var28 = this.resolvePreviewPathCenterAtDistance(var20, var26);
                           if (var28 != null && var28.length >= Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112088, 8)) {
                              String var29 = Xqedii_24i1z40c9kkri(var18, var25);
                              this.upsertPreviewMotionGlyphAtCenter(
                                 var1,
                                 var2,
                                 var29,
                                 var28[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 30)] - var9,
                                 var28[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(116253247, 0)] - var11,
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-496844292259229782L, 5)),
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-1215488743151667681L, 25)),
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("f4ILqMsU/nFM2xMDPLF28YknPbO0/Fu5hB5zbpvr"),
                                 var5
                              );
                              var15.add(var29);
                              var24 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2114837444, 25);
                           }
                        }

                        if (var24 == 0
                           && var21 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-8801396735751052554L, 51))
                           && var23 > Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1902015448, 20)) {
                           double[] var35 = this.resolvePreviewPathCenterAtDistance(
                              var20, var21 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554632606685394238L, 45))
                           );
                           if (var35 != null && var35.length >= Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112344, 7)) {
                              String var36 = Xqedii_xkhorzsnpv0t(var18);
                              this.upsertPreviewMotionGlyphAtCenter(
                                 var1,
                                 var2,
                                 var36,
                                 var35[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 24)] - var9,
                                 var35[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 17)] - var11,
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(4847332675086583572L, 10)),
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8836381571108321770L, 4)),
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("f4ILqMsU/nFM2xMDPLF28YknPbO0/Fu5hB5zbpvr"),
                                 var5
                              );
                              var15.add(var36);
                           }
                        }
                     }
                  }

                  for (int var31 : (Iterable<Integer>) (var4)) {

                     double[] var32 = this.resolveTimelinePreviewState(var2, var3, var31);
                     if (var32 != null && var32.length >= Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-468564589, 29)) {
                        String var33 = Xqedii_3huuvavewcht7(var31);
                        String var34 = var31 == var14
                           ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IY4LMaGEfk8qXA5EUnIM2omSMF8mKi8GQEV9KGwG")
                           : Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Hu5QKqB/J0fYq18LFUg6X/W/oxYp9eGulLOdkR3v");
                        double[] var22 = (double[])var32.clone();
                        var22[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 4)] -= var9;
                        var22[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112592, 3)] -= var11;
                        this.upsertAnimationPreviewMotionGlyph(
                           var1,
                           var2,
                           var33,
                           var22,
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153170435850241515L, 43)),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7480107769389435136L, 49)),
                           var34,
                           var5
                        );
                        var15.add(var33);
                     }
                  }

                  this.clearStalePreviewMotionPathHuds(var1, var2, var15);
               }
            }
         } else {
            this.clearAnimationPreviewMotionPath(var1, var2);
         }
      }
   }

   public double calculatePreviewPathLength(EditorSession var1, String var2, int var3) {
      if ((1194299661 * (1194299661 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.resolveAnimationPreviewPathLength(this.buildAnimationPreviewPathSamples(var1, var2, var3));
      }
   }

   public List<double[]> buildAnimationPreviewPathSamples(EditorSession var1, String var2, int var3) {
      if (((588484528 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.buildAnimationPreviewPathSamples(var1, var2, Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022670779, 14), var3);
      }
   }

   public List<double[]> buildAnimationPreviewPathSamples(EditorSession var1, String var2, int var3, int var4) {
      if ((511052000 ^ 511052000) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         int var5 = this.clampAnimationTimelineTick(var3);
         int var6 = this.clampAnimationTimelineTick(var4);
         if (var6 < var5) {
            return Collections.emptyList();
         } else {
            ArrayList var7 = new ArrayList();
            Double var8 = null;
            Double var9 = null;
            double var10 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 61));

            for (int var12 = var5; var12 <= var6; var12++) {
               double[] var13 = this.resolveTimelinePreviewState(var1, var2, var12);
               if (var13 != null && var13.length >= Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1497252132, 17)) {
                  double var14 = var13[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 17)]
                     + var13[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1219650690, 10)]
                        / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(4768629714288506793L, 31));
                  double var16 = var13[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(301479791, 19)]
                     + var13[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022719931, 14)]
                        / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6353032003689918054L, 52));
                  if (Double.isFinite(var14) && Double.isFinite(var16)) {
                     if (var8 != null && var9 != null) {
                        var10 += Math.hypot(var14 - var8, var16 - var9);
                     }

                     double[] var10001 = new double[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(303052655, 19)];
                     var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-937129178, 30)] = var12;
                     var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-788229788, 27)] = var14;
                     var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670479347, 16)] = var16;
                     var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2113020988, 25)] = var10;
                     var7.add(var10001);
                     var8 = var14;
                     var9 = var16;
                  }
               }
            }

            return var7;
         }
      } else {
         return Collections.emptyList();
      }
   }

   public double resolveAnimationPreviewPathLength(List<double[]> var1) {
      if ((1947067312 * 1947067312 - 1947067312 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         double[] var2 = (double[])var1.get(var1.size() - Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904114648, 11));
         if (var2 != null && var2.length >= Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465013000, 2)) {
            double var3 = var2[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544891, 2)];
            return Double.isFinite(var3)
               ? Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 51)), var3)
               : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 54));
         } else {
            return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 60));
         }
      } else {
         return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-4645825098944785432L, 3));
      }
   }

   public double[] resolvePreviewPathCenterAtDistance(List<double[]> var1, double var2) {
      if ((448410896 * 448410896 + 448410896 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         double[] var4 = (double[])var1.get(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12));
         if (var4 != null && var4.length >= Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(-243371048, 29)) {
            double var5 = this.resolveAnimationPreviewPathLength(var1);
            double var7 = Double.isFinite(var2)
               ? Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3691548903882700358L, 62)), Math.min(var5, var2))
               : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 11));
            if (!(var7 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(2252080477419345703L, 59)))
               && !(var5 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(3340043225152176681L, 35)))) {
               double[] var9 = var4;

               for (int var10 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903588312, 19); var10 < var1.size(); var10++) {
                  double[] var11 = (double[])var1.get(var10);
                  if (var11 != null && var11.length >= Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1995957321, 18)) {
                     double var12 = var9[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1276135702, 23)];
                     double var14 = var11[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(136612646, 30)];
                     if (Double.isFinite(var12) && Double.isFinite(var14)) {
                        if (!(var7 > var14 + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-2700439540928259107L, 46)))) {
                           double var16 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(6282153663779930288L, 47)), var14 - var12);
                           double var18 = Math.max(
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-1675472417165095597L, 59)),
                              Math.min(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-1562595805369573251L, 21)), (var7 - var12) / var16)
                           );
                           double var20 = var9[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960409052, 14)]
                              + (var11[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904178136, 16)] - var9[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(273225293, 31)]) * var18;
                           double var22 = var9[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(613099080, 6)]
                              + (var11[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544627, 8)] - var9[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1912501208, 22)]) * var18;
                           double[] var25 = new double[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-653767667, 24)];
                           var25[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 14)] = var20;
                           var25[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112604, 2)] = var22;
                           return var25;
                        }

                        var9 = var11;
                     } else {
                        var9 = var11;
                     }
                  }
               }

               double[] var24 = (double[])var1.get(var1.size() - Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-912127710, 20));
               double[] var26;
               if (var24 != null && var24.length >= Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1878934664, 22)) {
                  var26 = new double[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1860051968, 4)];
                  var26[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 31)] = var24[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1092901172, 1)];
                  var26[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 31)] = var24[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903064024, 19)];
               } else {
                  var26 = null;
               }

               return var26;
            } else {
               double[] var10000 = new double[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1995513859, 7)];
               var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 2)] = var4[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 13)];
               var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903981528, 17)] = var4[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903588312, 18)];
               return var10000;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int resolvePreviewPathDotCount(int var1, double var2, double var4) {
      if ((-715978998 ^ -715978998) != 0) {
         throw new IllegalStateException();
      } else {
         double var6 = this.resolvePreviewPathDotSpacing(var4);
         return this.resolvePreviewPathDotCount(var1, var2, var4, var6);
      }
   }

   public int resolvePreviewPathDotCount(int var1, double var2, double var4, double var6) {
      if ((185960116 * 185960116 + 185960116 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 <= 0) {
         return Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 12);
      } else if (Double.isFinite(var2) && !(var2 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-837287788891256088L, 10)))) {
         double var8 = Double.isFinite(var6) && var6 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-2700439540928259107L, 46))
            ? var6
            : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554638981220070718L, 39));
         int var10 = (int)Math.floor(var2 / var8) + Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 20);
         var10 = Math.max(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1995513859, 7), var10);
         return Math.max(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(551402568, 29), Math.min(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149712767, 6), var10));
      } else {
         return Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-669496307, 20);
      }
   }

   public double resolvePreviewPathDotSpacing(double var1) {
      if ((-1107211759 * (-1107211759 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(2882539976079813245L, 0));
         if (Double.isFinite(var1)
            && var1 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 47))
            && var1 < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(5765079952159626490L, 1))) {
            double var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-1201752623524646141L, 16)) - var1;
            var3 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-5932372985754529791L, 17))
               + var5 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-1217144607713956697L, 52));
            var3 = Math.min(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(2660284980729364234L, 26)), var3);
         }

         if (Double.isFinite(var1) && var1 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6282478112854723592L, 60))) {
            double var11 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-5874627687959540784L, 52)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-4674506849109985918L, 3))
            );
            double var7 = Math.min(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153172386839135723L, 42)),
               (var1 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(5797852706879923680L, 15))) / var11
            );
            var3 += var7 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(5523405500956501781L, 47));
         }

         if (Double.isFinite(var1)) {
            double var12 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5027361534392484622L, 5)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-5011131751916568846L, 23))
            );
            double var13 = Math.min(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(6937073270930671083L, 58)),
               Math.max(
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5945977630748775407L, 24)),
                  (var1 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(370402535909385101L, 48))) / var12
               )
            );
            var3 += var13 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7310050074049116527L, 52));
         }

         var3 = Math.max(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-1215459606144389977L, 51)),
            Math.min(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-934824587140733217L, 46)), var3)
         );
         return Math.max(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117851612478L, 24)),
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7964029147731516782L, 5)) / var3
         );
      }
   }

   public double resolveAnimationPreviewZoom(EditorSession var1) {
      if ((297075802 * 297075802 - 297075802 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.previewViewport != null) {
         double var2 = var1.previewViewport.zoom;
         return !Double.isFinite(var2)
            ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7772411175104929926L, 27))
            : Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(8999609505986416646L, 53)),
               Math.min(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6353032553445731942L, 52)), var2)
            );
      } else {
         return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(5738993415492707125L, 53));
      }
   }

   public void upsertAnimationPreviewMotionGlyph(
      Player var1, EditorSession var2, String var3, double[] var4, double var5, double var7, String var9, double var10
   ) {
      if ((50977306 ^ 50977306) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var2 != null
         && var3 != null
         && !var3.isBlank()
         && var4 != null
         && var4.length >= Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903588312, 17)) {
         double var12 = var4[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 18)]
            + var4[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1092901170, 1)] / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-1201752623524646125L, 16));
         double var14 = var4[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 5)]
            + var4[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(638067851, 22)] / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117721597246L, 29));
         this.upsertPreviewMotionGlyphAtCenter(var1, var2, var3, var12, var14, var5, var7, var9, var10);
      }
   }

   public void upsertPreviewMotionGlyphAtCenter(
      Player var1, EditorSession var2, String var3, double var4, double var6, double var8, double var10, String var12, double var13
   ) {
      if ((-939848451 * -939848451 - -939848451 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && Double.isFinite(var4) && Double.isFinite(var6)) {
         double var15 = this.toRenderX(var2, var4);
         double var17 = this.toRenderY(var2, var6);
         double var19 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300375499L, 17));
         if (Double.isFinite(var13) && var13 > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175680009504235L, 34))) {
            var19 += (var13 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814336L, 13)))
               * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3744396303981319629L, 32));
         }

         double var21 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(1849428207755253245L, 40)), var8) * var19;
         double var23 = var15 - var21 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300276843L, 9));
         double var25 = var17 - var21 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-136556322069590102L, 5));
         Placement var27 = this.positionCalculator.calculateBoxPlacement(var23, var25, var10, var21, var21);
         Vector var10003 = var27.location();
         Vector var10004 = var27.scale();
         String[] var10006 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(302004079, 19)];
         var10006[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748363922, 16)] = var12;
         var10006[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1367241688, 29)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("f4ILqMsU/nFM2xMDPLF28YknPbO0/Fu5hB5zbpvr");
         this.upsertOverlayHud(var1, var3, var10003, var10004, Xqedii_28erhsh4jpdzt(this.firstNonBlank(var10006)));
      }
   }

   public void clearStalePreviewMotionPathHuds(Player var1, EditorSession var2, Set<String> var3) {
      if ((825084637 * 825084637 + 825084637 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         LinkedHashSet var4 = new LinkedHashSet(var2.runtimeAnimationPreviewPathIds);
         if (var3 != null && !var3.isEmpty()) {
            var4.removeAll(var3);
         }

         if (var1 != null) {
            for (String var6 : (Iterable<String>) (var4)) {

               this.removeOverlayHud(var1, var6);
            }
         }

         var2.runtimeAnimationPreviewPathIds.clear();
         if (var3 != null && !var3.isEmpty()) {
            var2.runtimeAnimationPreviewPathIds.addAll(var3);
         }
      }
   }

   public void clearAnimationPreviewMotionPath(Player var1, EditorSession var2) {
      if ((-2085965966 * -2085965966 + -2085965966 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         if (var1 != null && !var2.runtimeAnimationPreviewPathIds.isEmpty()) {
            for (String var4 : (Iterable<String>) (new ArrayList(var2.runtimeAnimationPreviewPathIds))) {

               this.removeOverlayHud(var1, var4);
            }
         }

         var2.runtimeAnimationPreviewPathIds.clear();
      }
   }

   public boolean isLeftHeld(EditorSession var1) {
      if ((-90072646 ^ -90072646) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 19) != 0);
      } else {
         long var2 = Xqedii_38o2zes.Xqedii_316oplq() - var1.lastLeftClickTick;
         if (var2 <= Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-7153316421788632556L, 47)) {
            return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112604, 2) != 0);
         } else {
            int var4 = !var1.animationTimelineSliderDragActive && !var1.timelineKeyframeDragActive
               ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 7)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1902015448, 21);
            return ((var4 != 0 && var2 <= Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855815102L, 6)
               ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1902015448, 21)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 22)) != 0);
         }
      }
   }

   public boolean isTransformDragInProgress(EditorSession var1) {
      if ((-121867428 * -121867428 + -121867428 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 0) != 0);
      } else if (var1.moveDragActive) {
         return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-130584815, 27) != 0);
      } else {
         return ((this.isEffectiveScaleTool(var1) && var1.activeHandle != null && this.isLeftHeld(var1)
            ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1996743753, 18)
            : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12)) != 0);
      }
   }

   public boolean isEffectiveScaleTool(EditorSession var1) {
      if ((-1441948854 * -1441948854 - -1441948854 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1820477618, 26) != 0);
      } else {
         return ((var1.activeTool != EditorTool.SCALE && (var1.activeTool != EditorTool.ANIMATION || !this.isTimelineScaleKeyframeSelected(var1))
            ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(583643657, 12)
            : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 26)) != 0);
      }
   }

   public boolean isSidebarFieldDragInProgress(EditorSession var1) {
      if ((1435031829 ^ 1435031829) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.sidebarFieldDragActive && this.isLeftHeld(var1)
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112604, 2)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1678919059, 29)) != 0);
      }
   }

   public void restoreElementText(Player var1, EditorSession var2, String var3) {
      if ((-1988082264 * -1988082264 - -1988082264 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null) {
         for (HoverElement var5 : this.findTargetElements(var2, var3)) {
            this.setElementText(var1, var5, var5.text);
         }
      }
   }

   public HoverElement findHoveredElement(EditorSession var1, double var2, double var4) {
      if ((1634920383 * (1634920383 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.previewMode && this.isInsideEditorChromeBlock(var1, var2, var4)) {
         return null;
      } else if (var1.previewMode && !this.isInsidePreviewArea(var1, var2, var4)) {
         return null;
      } else {
         HoverElement var6 = null;

         for (HoverElement var8 : var1.elements) {
            String var9 = this.targetIdOf(var8);
            if (this.isTargetInteractable(var1, var9)) {
               EditorRect var10 = this.getHoverBounds(var1, var8);
               if (var10 != null && var10.contains(var2, var4) && (var6 == null || var8.runtimeZ >= var6.runtimeZ)) {
                  var6 = var8;
               }
            }
         }

         return var6;
      }
   }

   public String targetIdOf(HoverElement var1) {
      if ((1843258065 ^ 1843258065) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903064024, 19)];
         var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 11)] = var1.targetId;
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112602, 1)] = var1.id;
         String var2 = this.firstNonBlank(var10001);
         return var2.isBlank() ? var1.id : var2;
      }
   }

   public HoverElement findFirstByTargetId(EditorSession var1, String var2) {
      if (((230115526 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1899918296, 22)];
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1692364244, 24)] = this.resolveAnimationBaseTargetId(var2);
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return null;
         } else {
            for (HoverElement var5 : var1.elements) {
               if (var3.equals(this.targetIdOf(var5))) {
                  String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112536, 6)];
                  var10003[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 28)] = var5 == null ? null : var5.targetPath;
                  if (this.doesTargetPathMatchAnimationScope(var1, this.firstNonBlank(var10003), var2)) {
                     return var5;
                  }
               }
            }

            return null;
         }
      }
   }

   public EditorRect getHoverBounds(EditorSession var1, HoverElement var2) {
      if ((-2130865516 * -2130865516 + -2130865516 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = this.targetIdOf(var2);
         String var4 = this.resolveInheritedTargetRootPath(var1, var3);
         if (this.isImageGroupRootPath(var1, var4)) {
            EditorRect var5 = this.resolveGroupVisualBoundsForRootPath(var1, var4);
            if (var5 != null) {
               Map var6 = this.resolveRawMapAtPath(var1.rawBlocks, var4);
               double var20 = var6 != null
                  ? this.readMapPathDouble(
                     var6,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("I/VlMRMXI7xrjlOP2+ABuKHfMMzg+LSOu9/Wov8dTCxc8Vd75D34l5udLx4="),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(3870139395208070652L, 14))
                  )
                  : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-6250383221480388105L, 23));
               double var21 = var6 != null
                  ? this.readMapPathDouble(
                     var6,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y736GojWMSeLJYcpiiPVgoFvevG5v2+09az59wavJriNpBmBnGpAIIlpPh4="),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 54))
                  )
                  : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 2));
               double var22 = this.toRenderX(var1, var5.x + var20 + var1.runtimeHitboxOffsetX);
               double var13 = this.toRenderY(var1, var5.y + var21 + var1.runtimeHitboxOffsetY);
               double var15 = this.toRenderSize(var1, var5.width);
               double var17 = this.toRenderSize(var1, var5.height);
               return new EditorRect(var22, var13, var15, var17);
            }
         }

         double var19 = this.toRenderX(var1, this.getInteractiveLeftX(var2) + var1.runtimeHitboxOffsetX);
         double var7 = this.toRenderY(var1, this.getInteractiveTopY(var2) + var1.runtimeHitboxOffsetY);
         double var9 = this.toRenderSize(var1, this.getInteractiveWidth(var2));
         double var11 = this.toRenderSize(var1, this.getInteractiveHeight(var2));
         return new EditorRect(var19, var7, var9, var11);
      } else {
         return null;
      }
   }

   public List<HoverElement> findTargetElements(EditorSession var1, String var2) {
      if ((-413665975 * -413665975 - -413665975 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112632, 5)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 1)] = this.resolveAnimationBaseTargetId(var2);
         String var4 = this.firstNonBlank(var10001);
         if (var4.isBlank()) {
            return var3;
         } else {
            for (HoverElement var6 : var1.elements) {
               if (var4.equals(this.targetIdOf(var6))) {
                  String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-499185939, 16)];
                  var10003[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 8)] = var6 == null ? null : var6.targetPath;
                  if (this.doesTargetPathMatchAnimationScope(var1, this.firstNonBlank(var10003), var2)) {
                     var3.add(var6);
                  }
               }
            }

            return var3;
         }
      }
   }

   public List<String> getSelectedTargetIds(EditorSession var1) {
      if ((1151766051 * 1151766051 - 1151766051 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else {
            if (var1.selectedElementId != null && !var1.selectedElementId.isBlank() && this.isKnownTargetId(var1, var1.selectedElementId)) {
               var2.add(var1.selectedElementId);
            }

            for (String var4 : var1.additionalSelectedElementIds) {
               if (var4 != null && !var4.isBlank() && !var4.equals(var1.selectedElementId) && this.isKnownTargetId(var1, var4)) {
                  var2.add(var4);
               }
            }

            return var2;
         }
      }
   }

   public EditorRect resolveGroupVisualBoundsFromElements(EditorSession var1) {
      if (((1403781068 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         for (String var3 : this.getSelectedTargetIds(var1)) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(602959582, 20)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1887323272, 22)] = this.resolveInheritedTargetRootPath(var1, var3);
            String var4 = this.firstNonBlank(var10001);
            if (!var4.isBlank() && this.isImageGroupRootPath(var1, var4)) {
               EditorRect var5 = this.resolveGroupVisualBoundsForRootPath(var1, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public EditorRect resolveGroupVisualBoundsForRootPath(EditorSession var1, String var2) {
      if ((-941077763 ^ -941077763) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         HoverElement var3 = null;

         for (HoverElement var5 : (Iterable<HoverElement>) (var1.elements == null ? List.of() : var1.elements)) {

            if (var5 != null && var5.baseLocation != null && var5.baseScale != null) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 24)];
               var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 18)] = var5.targetPath;
               String var6 = this.firstNonBlank(var10001);
               boolean var7 = this.isImageGroupMemberPath(var1, var2, var6);
               if (var7 && this.isBetterImageGroupRootCandidate(var5, var3)) {
                  var3 = var5;
               }
            }
         }

         if (var3 == null) {
            EditorRect var13 = this.resolveGroupRootBoundsFromRaw(var1, var2);
            return var13 == null
               ? null
               : new EditorRect(
                  var13.x
                     - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7709754459612243691L, 23))
                     + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 8)),
                  var13.y
                     - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-2070196352554477021L, 15))
                     + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 9)),
                  Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-8450953075095177935L, 6)), var13.width),
                  Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7189204481319241197L, 3)), var13.height)
               );
         } else {
            double var12 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175958909748715L, 40)), var3.baseScale.getX());
            double var14 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8287730876978767595L, 0)), var3.baseScale.getY());
            double var8 = var3.baseLocation.getX()
               - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-8402347538470016432L, 37))
               + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6354157903596760678L, 52));
            double var10 = var3.baseLocation.getY()
               - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639152133764414L, 37))
               + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 36));
            return new EditorRect(var8, var10, var12, var14);
         }
      } else {
         return null;
      }
   }

   public boolean hasSelectedImageGroupTarget(EditorSession var1) {
      if ((1855633450 ^ 1855633450) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(613099208, 6) != 0);
      } else {
         for (String var3 : this.getSelectedTargetIds(var1)) {
            String var4 = this.resolveInheritedTargetRootPath(var1, var3);
            if (this.isImageGroupRootPath(var1, var4)) {
               return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112584, 4) != 0);
            }
         }

         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198416, 7) != 0);
      }
   }

   public double[] resolveSelectedGroupHitboxOffset(EditorSession var1) {
      if ((2018453614 * 2018453614 + 2018453614 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         double[] var11 = new double[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-998240805, 17)];
         var11[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-998502949, 17)] = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(3284097855588378946L, 39));
         var11[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(273225293, 31)] = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 59));
         return var11;
      } else {
         for (String var3 : this.getSelectedTargetIds(var1)) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(613099144, 6)];
            var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 11)] = this.resolveInheritedTargetRootPath(var1, var3);
            String var4 = this.firstNonBlank(var10001);
            if (!var4.isBlank() && this.isImageGroupRootPath(var1, var4)) {
               Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4);
               if (var5 != null) {
                  double var6 = this.readMapPathDouble(
                     var5,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("I/VlMRMXI7xrjlOP2+ABuKHfMMzg+LSOu9/Wov8dTCxc8Vd75D34l5udLx4="),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-600876311762331255L, 15))
                  );
                  double var8 = this.readMapPathDouble(
                     var5,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y736GojWMSeLJYcpiiPVgoFvevG5v2+09az59wavJriNpBmBnGpAIIlpPh4="),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-136556322069590110L, 5))
                  );
                  double[] var10000 = new double[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670540787, 12)];
                  var10000[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1860051936, 4)] = var6;
                  var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-788229788, 27)] = var8;
                  return var10000;
               }
            }
         }

         double[] var10 = new double[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1855665916, 11)];
         var10[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1678919059, 29)] = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(3698856277534682106L, 41));
         var10[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1863448631, 11)] = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 57));
         return var10;
      }
   }

   public boolean isKnownTargetId(EditorSession var1, String var2) {
      if (((-410024819 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var2.isBlank()) {
         return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 8) != 0);
      } else if (this.findFirstByTargetId(var1, var2) != null) {
         return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022687163, 14) != 0);
      } else {
         return (this.resolveRawMapAtPath(var1.rawBlocks, var2) != null
            ? (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903064024, 20) != 0)
            : this.hasLayerEntryTargetId(var1, var2));
      }
   }

   public boolean isSelectedTarget(EditorSession var1, String var2) {
      if (((-1702164558 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         return ((!var2.equals(var1.selectedElementId) && !var1.additionalSelectedElementIds.contains(var2)
            ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 6)
            : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112602, 1)) != 0);
      } else {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 14) != 0);
      }
   }

   public void toggleSelectedTarget(EditorSession var1, String var2) {
      if (((1005447264 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         if (this.isTargetInteractable(var1, var2)) {
            this.appendSelectionTarget(var1, var2);
         }
      }
   }

   public void normalizeSelectionState(EditorSession var1) {
      if (((1339553201 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (!this.isKnownTargetId(var1, var1.selectedElementId)) {
            var1.selectedElementId = null;
         }

         LinkedHashSet var2 = new LinkedHashSet();

         for (String var4 : var1.additionalSelectedElementIds) {
            if (var4 != null && !var4.isBlank() && !this.equalsNullable(var4, var1.selectedElementId) && this.isKnownTargetId(var1, var4)) {
               var2.add(var4);
            }
         }

         var1.additionalSelectedElementIds.clear();
         var1.additionalSelectedElementIds.addAll(var2);
         if (var1.selectedElementId != null && !this.isKnownTargetId(var1, var1.selectedElementId)) {
            var1.selectedElementId = null;
         }

         if (var1.selectedElementId == null && !var1.additionalSelectedElementIds.isEmpty()) {
            String var5 = (String)var1.additionalSelectedElementIds.iterator().next();
            var1.additionalSelectedElementIds.remove(var5);
            var1.selectedElementId = var5;
         }

         if (this.findFirstByTargetId(var1, var1.hoveredElementId) == null) {
            var1.hoveredElementId = null;
         }

         if (var1.selectedElementId == null) {
            var1.activeHandle = null;
            var1.resizeAnchorValid = (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 21) != 0);
            var1.handlesCollapsed = (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(650650763, 22) != 0);
         }
      }
   }

   public EditorRect getElementBounds(HoverElement var1) {
      if ((58562725 ^ 58562725) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         double var2 = var1.itemDisplay ? this.getSelectionOutlineLeftX(var1) : this.getInteractiveLeftX(var1);
         double var4 = var1.itemDisplay ? this.getSelectionOutlineTopY(var1) : this.getInteractiveTopY(var1);
         return new EditorRect(var2, var4, this.getInteractiveWidth(var1), this.getInteractiveHeight(var1));
      }
   }

   public double getSelectionOutlineLeftX(HoverElement var1) {
      if (((-1518696057 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.baseLocation != null && var1.baseScale != null && var1.itemDisplay) {
         double var2 = var1.baseLocation.getX();
         if (var1.itemDisplayBlock) {
            double var4 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-5280418937426348607L, 10)), var1.baseScale.getX());
            double var6 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5022198267539027240L, 36)),
               var4 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(2364581474755766624L, 38))
            );
            var2 -= (var6 - var4) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684283500011L, 26));
            var2 -= var6 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-1479660089180642831L, 18));
         }

         return var2;
      } else {
         return this.getInteractiveLeftX(var1);
      }
   }

   public double getSelectionOutlineTopY(HoverElement var1) {
      if (((1600809756 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.baseLocation != null && var1.baseScale != null && var1.itemDisplay) {
         double var2 = var1.baseLocation.getY();
         if (var1.itemDisplayBlock) {
            double var4 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7166682085135877611L, 54)), var1.baseScale.getY());
            double var6 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6952971031386840430L, 5)),
               var4 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-2539726277584931783L, 62))
            );
            var2 -= (var6 - var4) / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300283371L, 13));
            var2 -= var6 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6539517145721621933L, 31));
            var2 -= var6 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(4047393162215382049L, 31));
         }

         return var2;
      } else {
         return this.getInteractiveTopY(var1);
      }
   }

   public EditorRect mergeBounds(EditorRect var1, EditorRect var2) {
      if (((1164902487 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else if (var2 == null) {
         return var1;
      } else {
         double var3 = Math.min(var1.x, var2.x);
         double var5 = Math.min(var1.y, var2.y);
         double var7 = Math.max(var1.maxX(), var2.maxX());
         double var9 = Math.max(var1.maxY(), var2.maxY());
         return new EditorRect(var3, var5, var7 - var3, var9 - var5);
      }
   }

   public void updateHoveredHighlight(Player var1, EditorSession var2, String var3, String var4) {
      if (((1101484710 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var3 != null) {
            this.restoreElementText(var1, var2, var3);
            this.restoreHoverEffectForTarget(var1, var2, var3);
         }

         if (var4 != null && !this.isSelectedTarget(var2, var4)) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 19)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1887323272, 22)] = this.readTargetHoverColor(var2, var4);
            String var5 = this.firstNonBlank(var10001);
            int var6 = !var5.equalsIgnoreCase(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe"))
                  && !var5.equalsIgnoreCase(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("LCGYYvN3Jfx4k8JgOy4Tc/j+JslmD6rNPPhXLHfnf4SBX+CB"))
                  && (!var5.isBlank() || this.isEditorContextSession(var2))
               ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-529605085, 28)
               : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164952, 2);
            String var7 = this.normalizeHexColor(var5);

            for (HoverElement var9 : this.findTargetElements(var2, var4)) {
               int var10 = var9.hoverText != null && !var9.hoverText.isBlank()
                  ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 9)
                  : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607880179, 9);
               String var11 = var10 != 0 ? var9.hoverText : var9.text;
               if (var6 == 0) {
                  if (var7.isBlank()) {
                     this.setElementText(var1, var9, this.brightenOrDarken(var11), (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 11) != 0));
                  } else {
                     this.setElementText(var1, var9, this.applyHoverColorToText(var11, var7), (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(528709361, 23) != 0));
                  }
               } else if (var10 != 0) {
                  this.setElementText(var1, var9, var9.hoverText, (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 28) != 0));
               }
            }

            this.applyHoverEffectForTarget(var1, var2, var4);
         }
      }
   }

   public void applyHoverEffectForTarget(Player var1, EditorSession var2, String var3) {
      if ((217433767 * (217433767 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && !var2.editMode) {
         HoverEffectRuntimeConfig var4 = this.resolveHoverEffectRuntimeConfig(this.readTargetHoverEffect(var2, var3));
         this.applyHoverEffectForTargetWithConfig(var1, var2, var3, var4);
      }
   }

   public List<String> Xqedii_wnskbyc(Player var1, String var2) {
      if ((-240963426 ^ -240963426) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         String[] var4 = Xqedii_2jjpxmd;
         int var5 = var4.length;

         for (int var6 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 1); var6 < var5; var6++) {
            String var7 = var4[var6];
            if (this.hudService.getHud(var1, Xqedii_3i4za66ezya8e(var2, var7)) != null) {
               var3.add(Xqedii_39vszqugfvb8e(var2, var7));
            }
         }

         String var9 = Xqedii_3j0o7nbo4ra1l(var2);
         String[] var10 = Xqedii_2jjpxmd;
         int var11 = var10.length;

         for (int var12 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1842570464, 8); var12 < var11; var12++) {
            String var8 = var10[var12];
            if (this.hudService.getHud(var1, Xqedii_3r1kn7z7rmvve(var9, var8)) != null) {
               var3.add(Xqedii_28fb8cadlu5bc(var9, var8));
            }
         }

         return var3;
      }
   }

   public void applyHoverEffectForTargetWithConfig(Player var1, EditorSession var2, String var3, HoverEffectRuntimeConfig var4) {
      if (((-2078397224 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var4 != null) {
         List var5 = this.findTargetElements(var2, var3);
         LinkedHashMap var6 = new LinkedHashMap();
         double var7 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-8298657967471105282L, 39));
         double var9 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3125191610740194053L, 22));
         int var11 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609826369, 9);

         for (HoverElement var13 : (Iterable<HoverElement>) (var5)) {

            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1057418722, 24)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022670779, 14)] = var13 == null ? null : var13.id;
            String var14 = this.firstNonBlank(var10001);
            if (!var14.isBlank()) {
               Entity var15 = this.hudService.getHud(var1, var14);
               if (var15 != null) {
                  this.Xqedii_22tk2a1.remove(var14);
                  EditorOverlayPreviewPart.HoverEffectState var27 = this.Xqedii_25w26wj.computeIfAbsent(var14, var3x -> {
                     if ((-1563479831 * -1563479831 - -1563479831 & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        return this.resolveHoverEffectBaseState(var13, var15);
                     }
                  });
                  var6.put(var14, var27);
                  if (var13 != null
                     && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("KMQvb7Akt+FzowE55ff5MVn70bEcNLb8CC7odba4sB8NRGU4pBiUXg==").equals(var13.type)
                     && var27.location() != null) {
                     var7 += var27.location().getX();
                     var9 += var27.location().getY();
                     var11++;
                  }
               } else {
                  List var16 = this.Xqedii_wnskbyc(var1, var14);
                  if (!var16.isEmpty()) {
                     for (String var18 : (Iterable<String>) (var16)) {

                        Entity var19 = this.hudService.getHud(var1, var18);
                        if (var19 != null) {
                           this.Xqedii_22tk2a1.remove(var18);
                           EditorOverlayPreviewPart.HoverEffectState var20 = this.Xqedii_25w26wj.computeIfAbsent(var18, var3x -> {
                              if ((547623289 * 547623289 - 547623289 & 1) != 0) {
                                 throw new IllegalStateException();
                              } else {
                                 return this.resolveHoverEffectBaseState(var13, var19);
                              }
                           });
                           var6.put(var18, var20);
                           if (var13 != null
                              && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("KMQvb7Akt+FzowE55ff5MVn70bEcNLb8CC7odba4sB8NRGU4pBiUXg==").equals(var13.type)
                              && var20.location() != null) {
                              var7 += var20.location().getX();
                              var9 += var20.location().getY();
                              var11++;
                           }
                        }
                     }
                  }

                  this.Xqedii_25w26wj.remove(var14);
                  this.Xqedii_298sov1.remove(var14);
                  this.Xqedii_3ipjthg.remove(var14);
                  this.Xqedii_22tk2a1.remove(var14);
               }
            }
         }

         int var24 = var11 <= Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 27)
               || !(
                     Math.abs(var4.scaleXMultiplier() - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8450774851449582910L, 60)))
                        > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8156488948056638353L, 11))
                  )
                  && !(
                     Math.abs(var4.scaleYMultiplier() - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7297431609864488427L, 59)))
                        > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7235991069135201141L, 3))
                  )
            ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149726847, 6)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1142048147, 29);
         double var25 = var24 != 0 ? var7 / var11 : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(1935069697604035326L, 13));
         double var26 = var24 != 0 ? var9 / var11 : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 48));

         for (Entry var29 : (Iterable<Entry>) (var6.entrySet())) {

            String var30 = (String)var29.getKey();
            EditorOverlayPreviewPart.HoverEffectState var31 = (EditorOverlayPreviewPart.HoverEffectState)var29.getValue();
            Entity var21 = this.hudService.getHud(var1, var30);
            if (var21 != null) {
               EditorOverlayPreviewPart.HoverEffectState var22 = this.resolveCurrentHoverEffectState(var1, var30, var31);
               EditorOverlayPreviewPart.HoverEffectState var23 = var24 != 0
                  ? this.buildHoverEffectTargetStateWithPivot(var31, var4, var25, var26)
                  : this.buildHoverEffectTargetState(var31, var4);
               this.animateHoverHudEffect(var1, var2, var30, var22, var23, var4.durationTicks(), var4.interpolationMode());
            }
         }
      }
   }

   public void applyHoverEffectForTargetWithStartPosition(Player var1, EditorSession var2, String var3) {
      if ((1410473190 * 1410473190 - 1410473190 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && !var2.editMode) {
         HoverEffectRuntimeConfig var4 = this.resolveHoverEffectRuntimeConfig(this.readTargetHoverEffect(var2, var3));
         if (var4 != null) {
            int var5 = !(Math.abs(var4.startOffsetX()) > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-5610487778353837154L, 17)))
                  && !(Math.abs(var4.startOffsetY()) > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(2489649168613063571L, 11)))
                  && !(
                     Math.abs(var4.startScaleXMultiplier() - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6557211530631105201L, 61)))
                        > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(1875033243929486917L, 20))
                  )
                  && !(
                     Math.abs(var4.startScaleYMultiplier() - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117853066558L, 24)))
                        > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8585625717691436302L, 60))
                  )
               ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 25)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 27);
            if (var5 != 0) {
               HoverEffectRuntimeConfig var6 = this.buildStartPositionConfig(var4);
               this.applyHoverEffectForTargetWithConfig(var1, var2, var3, var6);
            }
         }
      }
   }

   public void applyOpenAnimationForTarget(Player var1, EditorSession var2, String var3) {
      if (((1236181739 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && !var2.editMode) {
         HoverEffectRuntimeConfig var4 = this.resolveHoverEffectRuntimeConfig(this.readTargetHoverEffect(var2, var3));
         if (var4 != null) {
            List var5 = this.findTargetElements(var2, var3);

            for (HoverElement var7 : (Iterable<HoverElement>) (var5)) {

               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 13)];
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1136148259, 13)] = var7 == null ? null : var7.id;
               String var8 = this.firstNonBlank(var10001);
               if (!var8.isBlank()) {
                  this.Xqedii_25w26wj.remove(var8);
                  String[][] var10000 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607879155, 9)][];
                  int var10002 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167287314, 13);
                  String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303939834, 8)];
                  var10003[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 1)] = var8;
                  var10000[var10002] = var10003;
                  var10002 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 16);
                  var10003 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(306549572, 5)];
                  var10003[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1822158267, 21)] = Xqedii_slxf0vqddks7(var8);
                  var10000[var10002] = var10003;
                  String[][] var9 = var10000;
                  int var10 = var9.length;

                  for (int var11 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 14); var11 < var10; var11++) {
                     String[] var12 = var9[var11];
                     String[] var13 = Xqedii_2jjpxmd;
                     int var14 = var13.length;

                     for (int var15 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1842570464, 8); var15 < var14; var15++) {
                        String var16 = var13[var15];
                        this.Xqedii_25w26wj.remove(Xqedii_19l1kzn40ysva(var12[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10)], var16));
                     }
                  }
               }
            }

            this.applyHoverEffectForTargetWithConfig(var1, var2, var3, var4);

            for (HoverElement var21 : (Iterable<HoverElement>) (var5)) {

               String[] var32 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1860051952, 4)];
               var32[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 16)] = var21 == null ? null : var21.id;
               String var22 = this.firstNonBlank(var32);
               if (!var22.isBlank()) {
                  EditorOverlayPreviewPart.HoverEffectState var23 = this.Xqedii_25w26wj.get(var22);
                  if (var23 != null) {
                     this.Xqedii_25w26wj.put(var22, this.buildHoverEffectTargetState(var23, var4));
                  }

                  String[][] var31 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(2038330328, 26)][];
                  int var34 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 7);
                  String[] var37 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112584, 4)];
                  var37[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 11)] = var22;
                  var31[var34] = var37;
                  var34 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022687163, 14);
                  var37 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(2038330328, 27)];
                  var37[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 6)] = Xqedii_1vx7fp46hrypk(var22);
                  var31[var34] = var37;
                  String[][] var24 = var31;
                  int var25 = var24.length;

                  for (int var26 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-264802543, 27); var26 < var25; var26++) {
                     String[] var27 = var24[var26];
                     String[] var28 = Xqedii_2jjpxmd;
                     int var29 = var28.length;

                     for (int var30 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748363922, 16); var30 < var29; var30++) {
                        String var17 = var28[var30];
                        String var18 = Xqedii_3n3u6ja0fvxe8(var27[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 12)], var17);
                        EditorOverlayPreviewPart.HoverEffectState var19 = this.Xqedii_25w26wj.get(var18);
                        if (var19 != null) {
                           this.Xqedii_25w26wj.put(var18, this.buildHoverEffectTargetState(var19, var4));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void restoreHoverEffectForTarget(Player var1, EditorSession var2, String var3) {
      if (((-356242413 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         HoverEffectRuntimeConfig var4 = this.resolveHoverEffectRuntimeConfig(this.readTargetHoverEffect(var2, var3));
         int var5 = var4 == null ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-912127710, 20) : var4.durationTicks();
         String var6 = var4 == null
            ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("HnlCg6FiZwy5yl7yzrCIVto+zqqN++z3fsS0olkMTObFcdjNy/gT6Q==")
            : var4.interpolationMode();

         for (HoverElement var8 : this.findTargetElements(var2, var3)) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 1)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(58126623, 31)] = var8 == null ? null : var8.id;
            String var9 = this.firstNonBlank(var10001);
            if (!var9.isBlank()) {
               EditorOverlayPreviewPart.HoverEffectState var10 = this.Xqedii_25w26wj.get(var9);
               if (var10 == null) {
                  for (String var13 : this.Xqedii_wnskbyc(var1, var9)) {
                     EditorOverlayPreviewPart.HoverEffectState var14 = this.Xqedii_25w26wj.get(var13);
                     if (var14 != null) {
                        Entity var15 = this.hudService.getHud(var1, var13);
                        if (var15 == null) {
                           this.Xqedii_25w26wj.remove(var13);
                        } else {
                           this.Xqedii_22tk2a1.add(var13);
                           EditorOverlayPreviewPart.HoverEffectState var16 = this.resolveCurrentHoverEffectState(var1, var13, var14);
                           this.animateHoverHudEffect(var1, var2, var13, var16, var14, var5, var6);
                        }
                     }
                  }

                  this.Xqedii_298sov1.remove(var9);
                  this.Xqedii_3ipjthg.remove(var9);
               } else {
                  Entity var11 = this.hudService.getHud(var1, var9);
                  if (var11 == null) {
                     this.Xqedii_25w26wj.remove(var9);
                     this.Xqedii_298sov1.remove(var9);
                     this.Xqedii_3ipjthg.remove(var9);
                     this.Xqedii_22tk2a1.remove(var9);
                  } else {
                     this.Xqedii_22tk2a1.add(var9);
                     EditorOverlayPreviewPart.HoverEffectState var12 = this.resolveCurrentHoverEffectState(var1, var9, var10);
                     this.animateHoverHudEffect(var1, var2, var9, var12, var10, var5, var6);
                  }
               }
            }
         }
      }
   }

   public EditorOverlayPreviewPart.HoverEffectState resolveHoverEffectBaseState(HoverElement var1, Entity var2) {
      if (((-116297710 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Vector var3 = this.hudService.getHudLocation(var2);
         if (var3 == null && var1 != null && var1.baseLocation != null) {
            var3 = var1.baseLocation.clone();
         }

         if (var3 == null) {
            var3 = new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7383097807765400715L, 63)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 28)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 33))
            );
         }

         Vector var4 = this.hudService.getHudScale(var2);
         if (var4 == null && var1 != null && var1.baseScale != null) {
            var4 = var1.baseScale.clone();
         }

         if (var4 == null) {
            var4 = new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814336L, 13)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(483767424401008960L, 11)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-1562595805369573251L, 21))
            );
         }

         int var5 = var4.getX() < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 23))
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904145368, 15)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1301301526, 23);
         int var6 = var4.getY() < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(1935069697604035326L, 13))
            ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1576459575, 28)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1855661820, 11);
         if (var1 != null && var1.baseScale != null) {
            var5 = var1.baseScale.getX() < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7361096916357500374L, 1))
               ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1292912918, 23)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 22);
            var6 = var1.baseScale.getY() < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8832723085512251551L, 19))
               ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 10)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 17);
         }

         int var7 = this.clampHoverEffectOpacity(this.hudService.getHudOpacity(var2));
         if (var7 <= 0 && var1 != null && var1.opacity > 0) {
            var7 = this.clampHoverEffectOpacity(var1.opacity);
         }

         double var8 = var1 != null && Double.isFinite(var1.rotationDeg)
            ? var1.rotationDeg
            : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 50));
         return new EditorOverlayPreviewPart.HoverEffectState(var3.clone(), var4.clone(), var7, var8, (var5 != 0), (var6 != 0));
      }
   }

   public EditorOverlayPreviewPart.HoverEffectState buildHoverEffectTargetState(EditorOverlayPreviewPart.HoverEffectState var1, HoverEffectRuntimeConfig var2) {
      if (((-860605684 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         Vector var3 = var1.location() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7397712555069364212L, 42)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(5738428266516030261L, 53)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 45))
            )
            : var1.location();
         Vector var4 = var1.scale() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7171207674995803627L, 56)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(3841470427039448995L, 45)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-8523010669133105859L, 4))
            )
            : var1.scale();
         Vector var5 = var3.clone()
            .add(new Vector(var2.offsetX(), var2.offsetY(), Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 3))));
         Vector var6 = new Vector(var4.getX() * var2.scaleXMultiplier(), var4.getY() * var2.scaleYMultiplier(), var4.getZ());
         int var7 = var2.opacityAbsolute() ? var2.opacityAbsoluteValue() : var1.opacity();
         var7 += var2.opacityDelta();
         var7 += (int)Math.round(
            var1.opacity() * (var2.opacityPercentDelta() / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(1348879714063021119L, 10)))
         );
         var7 = this.clampHoverEffectOpacity(var7);
         double var8 = var1.rotationDeg() + var2.rotationDeltaDeg();
         return new EditorOverlayPreviewPart.HoverEffectState(var5, var6, var7, var8, var1.mirrorX(), var1.mirrorY());
      } else {
         return var1;
      }
   }

   public EditorOverlayPreviewPart.HoverEffectState buildHoverEffectTargetStateWithPivot(
      EditorOverlayPreviewPart.HoverEffectState var1, HoverEffectRuntimeConfig var2, double var3, double var5
   ) {
      if (((-2098929427 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         Vector var7 = var1.location() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 61)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(9013937984709138858L, 56)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 39))
            )
            : var1.location();
         Vector var8 = var1.scale() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-8541025067642587842L, 2)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(1134144119864274380L, 10)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(5765079952159626490L, 1))
            )
            : var1.scale();
         double var9 = (var7.getX() - var3)
            * (var2.scaleXMultiplier() - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117941142846L, 29)));
         double var11 = (var7.getY() - var5)
            * (var2.scaleYMultiplier() - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554537962786059582L, 54)));
         Vector var13 = var7.clone()
            .add(
               new Vector(var2.offsetX() + var9, var2.offsetY() + var11, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 50)))
            );
         Vector var14 = new Vector(var8.getX() * var2.scaleXMultiplier(), var8.getY() * var2.scaleYMultiplier(), var8.getZ());
         int var15 = var2.opacityAbsolute() ? var2.opacityAbsoluteValue() : var1.opacity();
         var15 += var2.opacityDelta();
         var15 += (int)Math.round(
            var1.opacity() * (var2.opacityPercentDelta() / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(3262065606252168340L, 9)))
         );
         var15 = this.clampHoverEffectOpacity(var15);
         double var16 = var1.rotationDeg() + var2.rotationDeltaDeg();
         return new EditorOverlayPreviewPart.HoverEffectState(var13, var14, var15, var16, var1.mirrorX(), var1.mirrorY());
      } else {
         return var1;
      }
   }

   public EditorOverlayPreviewPart.HoverEffectState resolveCurrentHoverEffectState(Player var1, String var2, EditorOverlayPreviewPart.HoverEffectState var3) {
      if ((969541399 * 969541399 - 969541399 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var4 = this.hudService.getHud(var1, var2);
         if (var4 == null) {
            return var3;
         } else {
            Vector var5 = this.hudService.getHudLocation(var4);
            Vector var6 = this.hudService.getHudScale(var4);
            int var7 = this.clampHoverEffectOpacity(this.hudService.getHudOpacity(var4));
            EditorOverlayPreviewPart.HoverEffectState var8 = this.Xqedii_298sov1.get(var2);
            Vector var9 = var5 != null ? var5 : (var8 != null && var8.location() != null ? var8.location() : (var3 == null ? null : var3.location()));
            Vector var10 = var6 != null ? var6 : (var8 != null && var8.scale() != null ? var8.scale() : (var3 == null ? null : var3.scale()));
            if (var9 == null) {
               var9 = new Vector(
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 5)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 2)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 3))
               );
            }

            if (var10 == null) {
               var10 = new Vector(
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855951422L, 20)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5608923307411048630L, 49)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6600059865243244855L, 59))
               );
            }

            double var11 = var8 == null
               ? (var3 == null ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7397712555069364212L, 42)) : var3.rotationDeg())
               : var8.rotationDeg();
            int var13 = var3 != null && var3.mirrorX()
               ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506494, 1)
               : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022670779, 14);
            int var14 = var3 != null && var3.mirrorY()
               ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022687163, 14)
               : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1995513603, 7);
            return new EditorOverlayPreviewPart.HoverEffectState(var9.clone(), var10.clone(), var7, var11, (var13 != 0), (var14 != 0));
         }
      } else {
         return var3;
      }
   }

   public void capturePreOpenBaseStates(Player var1, EditorSession var2, double var3, double var5) {
      if ((1622129411 * (1622129411 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.elements != null) {
         HashSet var7 = new HashSet();

         for (HoverElement var9 : var2.elements) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 25)];
            var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301511608, 18)] = var9 == null ? null : var9.id;
            String var10 = this.firstNonBlank(var10001);
            if (!var10.isBlank() && var7.add(var10)) {
               Entity var11 = this.hudService.getHud(var1, var10);
               if (var11 != null) {
                  EditorOverlayPreviewPart.HoverEffectState var17 = this.resolveHoverEffectBaseState(var9, var11);
                  Vector var18 = var17.location()
                     .clone()
                     .subtract(new Vector(var3, var5, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6161742392009032423L, 48))));
                  this.Xqedii_25w26wj
                     .put(
                        var10,
                        new EditorOverlayPreviewPart.HoverEffectState(
                           var18, var17.scale(), var17.opacity(), var17.rotationDeg(), var17.mirrorX(), var17.mirrorY()
                        )
                     );
                  this.Xqedii_22tk2a1.remove(var10);
               } else {
                  this.Xqedii_25w26wj.remove(var10);

                  for (String var13 : this.Xqedii_wnskbyc(var1, var10)) {
                     Entity var14 = this.hudService.getHud(var1, var13);
                     if (var14 != null) {
                        EditorOverlayPreviewPart.HoverEffectState var15 = this.resolveHoverEffectBaseState(var9, var14);
                        Vector var16 = var15.location()
                           .clone()
                           .subtract(new Vector(var3, var5, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 59))));
                        this.Xqedii_25w26wj
                           .put(
                              var13,
                              new EditorOverlayPreviewPart.HoverEffectState(
                                 var16, var15.scale(), var15.opacity(), var15.rotationDeg(), var15.mirrorX(), var15.mirrorY()
                              )
                           );
                        this.Xqedii_22tk2a1.remove(var13);
                     }
                  }
               }
            }
         }
      }
   }

   public void animateHoverHudEffect(
      Player var1,
      EditorSession var2,
      String var3,
      EditorOverlayPreviewPart.HoverEffectState var4,
      EditorOverlayPreviewPart.HoverEffectState var5,
      int var6,
      String var7
   ) {
      if ((580689706 * 580689706 - 580689706 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && var4 != null && var5 != null) {
         int var8 = this.Xqedii_ya1winh = this.Xqedii_ya1winh + Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1092901172, 1);
         this.Xqedii_3ipjthg.put(var3, var8);
         if (var6 <= Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1205919164, 21)) {
            Entity var13 = this.hudService.getHud(var1, var3);
            if (var13 != null) {
               this.applyHoverEffectState(var13, var5, Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10));
               this.Xqedii_298sov1.put(var3, var5.copy());
            }

            if (this.Xqedii_22tk2a1.remove(var3)) {
               this.Xqedii_25w26wj.remove(var3);
            }
         } else {
            int var9 = Math.max(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 7), var6);
            EditorOverlayPreviewPart.HoverEffectState var10 = var4.copy();
            EditorOverlayPreviewPart.HoverEffectState var11 = var5.copy();
            int[] var10000 = new int[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303939834, 8)];
            var10000[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2081283012, 25)] = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12);
            int[] var12 = var10000;
            Xqedii_38o2zes.Xqedii_j3mggbv(
               this.plugin,
               var1,
               Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3125191610740194053L, 22),
               Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-7153175684300277228L, 39),
               var10x -> {
                  if ((543434053 ^ 543434053) != 0) {
                     throw new IllegalStateException();
                  } else if (!var1.isOnline()) {
                     var10x.cancel();
                  } else {
                     EditorSession var11x = (EditorSession)this.editorSessions.get(var1.getUniqueId());
                     if (var11x != var2) {
                        var10x.cancel();
                     } else {
                        Integer var12x = this.Xqedii_3ipjthg.get(var3);
                        if (var12x != null && var12x == var8) {
                           Entity var13x = this.hudService.getHud(var1, var3);
                           if (var13x == null) {
                              this.Xqedii_3ipjthg.remove(var3);
                              this.Xqedii_298sov1.remove(var3);
                              if (this.Xqedii_22tk2a1.remove(var3)) {
                                 this.Xqedii_25w26wj.remove(var3);
                              }

                              var10x.cancel();
                           } else {
                              var12[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 6)] += Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506494, 1);
                              double var14 = Math.min(
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4807010494098584561L, 18)),
                                 (double)var12[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 30)] / var9
                              );
                              double var16 = this.applyTimelineInterp(var7, var14);
                              EditorOverlayPreviewPart.HoverEffectState var18 = this.interpolateHoverEffectState(var10, var11, var16);
                              this.applyHoverEffectState(var13x, var18, Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 18));
                              this.Xqedii_298sov1.put(var3, var18);
                              if (var12[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(374181961, 15)] >= var9) {
                                 this.applyHoverEffectState(var13x, var11, Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(306549604, 5));
                                 this.Xqedii_298sov1.put(var3, var11);
                                 if (this.Xqedii_22tk2a1.remove(var3)) {
                                    this.Xqedii_25w26wj.remove(var3);
                                 }

                                 var10x.cancel();
                              }
                           }
                        } else {
                           var10x.cancel();
                        }
                     }
                  }
               }
            );
         }
      }
   }

   public EditorOverlayPreviewPart.HoverEffectState interpolateHoverEffectState(
      EditorOverlayPreviewPart.HoverEffectState var1, EditorOverlayPreviewPart.HoverEffectState var2, double var3
   ) {
      if ((-1279894082 * (-1279894082 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         double var5 = Math.max(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7449100481989101735L, 3)),
            Math.min(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7397712831021012980L, 42)), var3)
         );
         Vector var7 = var1.location() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5745830138291662028L, 10)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7361096916357500374L, 1)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5803843446865296874L, 29))
            )
            : var1.location();
         Vector var8 = var2.location() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(2804391353680823387L, 48)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6200225494326578074L, 50)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3027235154489249578L, 24))
            )
            : var2.location();
         Vector var9 = var1.scale() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7397712831021012980L, 42)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(283536029966068595L, 8)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855689534L, 21))
            )
            : var1.scale();
         Vector var10 = var2.scale() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7189204481319241197L, 3)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7081118090262349287L, 4)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153172386839135723L, 42))
            )
            : var2.scale();
         Vector var11 = new Vector(
            var7.getX() + (var8.getX() - var7.getX()) * var5,
            var7.getY() + (var8.getY() - var7.getY()) * var5,
            var7.getZ() + (var8.getZ() - var7.getZ()) * var5
         );
         Vector var12 = new Vector(
            var9.getX() + (var10.getX() - var9.getX()) * var5,
            var9.getY() + (var10.getY() - var9.getY()) * var5,
            var9.getZ() + (var10.getZ() - var9.getZ()) * var5
         );
         int var13 = this.clampHoverEffectOpacity((int)Math.round(var1.opacity() + (var2.opacity() - var1.opacity()) * var5));
         double var14 = var1.rotationDeg() + (var2.rotationDeg() - var1.rotationDeg()) * var5;
         return new EditorOverlayPreviewPart.HoverEffectState(var11, var12, var13, var14, var2.mirrorX(), var2.mirrorY());
      } else {
         return var1;
      }
   }

   public void applyHoverEffectState(Entity var1, EditorOverlayPreviewPart.HoverEffectState var2, int var3) {
      if (((-1517142812 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         Vector var4 = var2.location() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-1092450576556720873L, 8)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(627774781296991909L, 33)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7682936438852517702L, 46))
            )
            : var2.location();
         Vector var5 = var2.scale() == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4540802010935870756L, 6)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300211627L, 18)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175787345937899L, 37))
            )
            : var2.scale();
         int var6 = Math.max(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198416, 7), var3);
         this.hudService.setHudScale(var1, var5, var6, (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 30) != 0));
         this.hudService.moveHud(var1, var4, var6, Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301773752, 18));
         this.hudService.setOpacity(var1, this.clampHoverEffectOpacity(var2.opacity()));
         this.applyElementTransform(var1, var2.rotationDeg(), var2.mirrorX(), var2.mirrorY());
      }
   }

   public EditorRect resolveGroupOutlineBoundsFromFrames(EditorSession var1, String var2) {
      if ((1988439940 ^ 1988439940) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Map var3 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         if (var3 != null && !var3.isEmpty()) {
            if (var3.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var5
               && !var5.isEmpty()) {
               Vector var6 = this.resolveParentAbsoluteOffset(var1, var2);
               double var7 = this.readMapPathDouble(
                     var3,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                     this.readMapPathDouble(
                        var3,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 37))
                     )
                  )
                  + var6.getX();
               double var9 = this.readMapPathDouble(
                     var3,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                     this.readMapPathDouble(
                        var3,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6904469749300661613L, 28))
                     )
                  )
                  + var6.getY();
               double var11 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684266739179L, 26));
               HashSet var13 = new HashSet();
               HashSet var14 = new HashSet();

               for (Object var16 : var5) {
                  if (var16 instanceof Map var17 && !var17.isEmpty()) {
                     double var19 = this.readMapPathDouble(
                        var17,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                        this.readMapPathDouble(
                           var17,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8832723085512513631L, 19))
                        )
                     );
                     double var21 = this.readMapPathDouble(
                        var17,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                        this.readMapPathDouble(
                           var17,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(5945977630757161967L, 24))
                        )
                     );
                     if (Double.isFinite(var19) && Double.isFinite(var21)) {
                        double var23 = this.readMapPathDouble(
                           var17,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                              "YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i"
                           ),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 51))
                        );
                        if (!Double.isFinite(var23)) {
                           var23 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(967534848802017663L, 12));
                        }

                        double var25 = var21 - var23;
                        var11 = Math.min(var11, var19);
                        var13.add(this.normalizeGroupFrameCoordinate(var19));
                        var14.add(this.normalizeGroupFrameCoordinate(var25));
                     }
                  }
               }

               if (Double.isFinite(var11) && !var13.isEmpty() && !var14.isEmpty()) {
                  int var45 = Math.max(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 29), var13.size());
                  int var46 = Math.max(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 9), var14.size());
                  double var47 = var45 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153247462330598891L, 47));
                  double var48 = var46 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(8789176406096127957L, 4));
                  double var49 = Math.abs(
                     this.readMapPathDouble(
                        var3,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                        this.readMapPathDouble(var3, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="), var47)
                     )
                  );
                  double var50 = Math.abs(
                     this.readMapPathDouble(
                        var3,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                        this.readMapPathDouble(var3, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="), var48)
                     )
                  );
                  double var51 = Double.isFinite(var49) && !(var47 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(4816013908642017088L, 9)))
                     ? Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-360125022993401096L, 14)), var49 / var47)
                     : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3278605765315552601L, 60));
                  double var27 = Double.isFinite(var50) && !(var48 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(2115573495923288581L, 5)))
                     ? Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-6656066813261137608L, 0)), var50 / var48)
                     : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(5332321012447341215L, 62));
                  double var29 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3910570468367359722L, 46)) * var51;
                  double var31 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-5061597752972176523L, 63)) * var27;
                  double var33 = Math.max(var29, var45 * var29);
                  double var35 = Math.max(var31, var46 * var31);
                  double var37 = var7 + var11;
                  double var39 = Math.max(
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3080871196004516212L, 47)),
                     (var46 - Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 10)) * var31
                  );
                  double var41 = var9 + var39 + var31;
                  double var43 = var41 - var35 - var31;
                  return new EditorRect(var37, var43, var33, var35);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public double normalizeGroupFrameCoordinate(double var1) {
      if ((-1990207509 * -1990207509 + -1990207509 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return !Double.isFinite(var1)
            ? var1
            : Math.rint(var1 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7682953736277557062L, 46)))
               / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6353050868394241638L, 52));
      }
   }

   public EditorRect removeGroupOutlineOffset(EditorRect var1) {
      if ((-1153383597 * -1153383597 - -1153383597 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? null
            : new EditorRect(var1.x, var1.y + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(8017866812755414546L, 12)), var1.width, var1.height);
      }
   }

   public EditorRect convertGroupOutlineToRootBounds(Map<String, Object> var1, EditorRect var2) {
      if (((-2147438876 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 == null) {
         return null;
      } else {
         double var3 = this.resolveGroupOutlineToRootYOffset(var1, var2.height);
         return new EditorRect(var2.x, var2.y + var3, var2.width, var2.height);
      }
   }

   public EditorRect resolveSidebarEditableBounds(EditorSession var1, String var2) {
      if ((2063030388 * 2063030388 - 2063030388 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorRect var3 = super.resolveSidebarEditableBounds(var1, var2);
         if (var1 != null && var2 != null && !var2.isBlank()) {
            String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506496, 1)];
            var10003[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1691944081, 19)] = this.resolveTimelineHierarchyTargetPath(var1, var2);
            var10003[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-912127710, 20)] = var2;
            String var4 = this.resolveImageGroupMemberRootPath(var1, this.firstNonBlank(var10003));
            if (var4.isBlank()) {
               return var3;
            } else {
               EditorRect var5 = this.resolveGroupRootBoundsFromRaw(var1, var4);
               return var5 != null ? var5 : var3;
            }
         } else {
            return var3;
         }
      }
   }

   public double resolveGroupOutlineToRootYOffset(Map<String, Object> var1, double var2) {
      if ((-1166634570 * -1166634570 - -1166634570 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 33));
      }
   }

   public boolean isCompactGlyphMatrixImageGroup(Map<String, Object> var1) {
      if ((-170821423 * -170821423 + -170821423 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-998240805, 17)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 7)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("NaWcwAVBknTMgGWSEmJ2NAKCT+80HBun/yBAn2Zj2/NnDw7HGneeOOcyMODZcwKOeZBORQ=="))
         );
         var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-522339257, 29)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("QgkA093O0+ye4MlORBLZVAHD9iS8sQOE6bOxQ5/PA7P5CKSB5kGXQHCKF4UwdZKm15w="))
         );
         String var2 = this.firstNonBlank(var10001).trim();
         if (!var2.isBlank()) {
            return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 7) != 0);
         } else {
            var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 6)];
            var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12)] = this.stringValue(
               this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
            );
            String var3 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
            if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("7uRKlOYqUEe6EJl7MvDb0cL3hrZzuULkgIttdx1WNxgbH9Jhaxk=").equals(var3)) {
               var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-568070034, 12)];
               var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 6)] = this.stringValue(
                  this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("7uRKlOYqUEe6EJl7MvDb0cL3hrZzuULkgIttdx1WNxgbH9Jhaxk="))
               );
               String var4 = this.firstNonBlank(var10001).trim();
               return ((!var4.isBlank() ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 17) : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 13)) != 0);
            } else {
               return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(520320753, 23) != 0);
            }
         }
      } else {
         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301511608, 18) != 0);
      }
   }

   public boolean hasImageGroupFrameShiftMetadata(Map<String, Object> var1) {
      if ((933436276 ^ 933436276) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (var1.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var3
            && !var3.isEmpty()) {
            for (Object var5 : var3) {
               if (var5 instanceof Map var6
                  && var6.containsKey(
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i")
                  )) {
                  return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2089357025, 31) != 0);
               }
            }

            return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465012984, 2) != 0);
         } else {
            return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(520320753, 23) != 0);
         }
      } else {
         return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 19) != 0);
      }
   }

   public String resolveInheritedTargetRootPath(EditorSession var1, String var2) {
      if ((-798673447 ^ -798673447) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         HoverElement var3 = this.findFirstByTargetId(var1, var2);
         String var4 = this.resolveInheritedTargetRootPathByPath(var1, var3 == null ? null : var3.targetPath);
         if (var4 != null && !var4.isBlank()) {
            return var4;
         } else {
            for (HoverElement var6 : this.findTargetElements(var1, var2)) {
               String var7 = this.resolveInheritedTargetRootPathByPath(var1, var6 == null ? null : var6.targetPath);
               if (var7 != null && !var7.isBlank()) {
                  return var7;
               }
            }

            if (var3 == null) {
               String var8 = this.resolveInheritedTargetRootPathByPath(var1, this.resolveRenderBlockTargetPath(var1, var2));
               if (var8 != null && !var8.isBlank()) {
                  return var8;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public String resolveRenderBlockTargetPath(EditorSession var1, String var2) {
      if ((-1506727682 * (-1506727682 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.renderBlocks != null && var2 != null && !var2.isBlank()) {
         for (Map var4 : var1.renderBlocks) {
            if (var4 != null && !var4.isEmpty()) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 17)];
               var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748363922, 16)] = this.stringValue(
                  this.readMapPathValue(
                     var4, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("tTZOK2iGig75Q0PwHscFlR9FbLabxADCtF+6tRIUBYIum3SVUAJpU/lHGJkaHngS1hTkwROjNxRLHfzwxsSu6g==")
                  )
               );
               String var5 = this.firstNonBlank(var10001);
               if (var2.equals(var5)) {
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1142048147, 29)];
                  var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1874258355, 31)] = this.stringValue(
                     this.readMapPathValue(
                        var4,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                     )
                  );
                  return this.firstNonBlank(var10001);
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public String resolveInheritedTargetRootPathByPath(EditorSession var1, String var2) {
      if (((6421043 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = var2;

         while (var3 != null && !var3.isBlank()) {
            Map var4 = this.resolveRawMapAtPath(var1.rawBlocks, var3);
            if (this.shouldInheritTargetToChildren(var4)) {
               return var3;
            }

            if (var4 != null && !this.isRawUiImageGlyphBlock(var4)) {
               break;
            }

            int var5 = var3.lastIndexOf(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj"));
            if (var5 < 0) {
               break;
            }

            var3 = var3.substring(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 13), var5);
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean shouldInheritTargetToChildren(Map<String, Object> var1) {
      if ((1555052001 * (1555052001 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         Object var2 = this.readMapPathValue(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "BeJIgIr/G6prkIAGsxuixhiYIYSyQSKbKtrLa3GK4svmYPZ0n4CRicZeCBskeQvOtynQURNplHPuw2CzVhUURsWxCR+5eiu94qSFVJO823GRvbv5pcduBH0+3UpdGxHeHvc="
            )
         );
         return !this.parseBooleanFlag(var2, false) && this.isImageGroupRoot(var1);
      } else {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 1) != 0);
      }
   }

   public boolean isImageGroupRootPath(EditorSession var1, String var2) {
      if ((2091255990 * 2091255990 - 2091255990 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Map var3 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         return this.isImageGroupRoot(var3);
      } else {
         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-937129178, 30) != 0);
      }
   }

   public boolean hasDirectImageGroupGlyphChild(Map<String, Object> var1) {
      if ((-1681092448 * (-1681092448 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var3
            && !var3.isEmpty()) {
            for (Object var5 : var3) {
               if (var5 instanceof Map var6 && !var6.isEmpty()) {
                  String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1971221464, 26)];
                  var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 2)] = this.stringValue(
                     this.readMapPathValue(var6, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL"))
                  );
                  String var8 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 5)];
                  var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164948, 2)] = this.stringValue(
                     this.readMapPathValue(var6, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("GpYghunc62BAVDDEeulVGkRjmMe6LqRTZzxznJMqg9A="))
                  );
                  String var9 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-998371877, 17)];
                  var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960392668, 14)] = this.stringValue(
                     this.readMapPathValue(var6, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
                  );
                  String var10 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  if (!var8.isBlank()
                        && (
                           var8.contains(
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("wsnZyHc0kLIIP9UPa8v7hAEIHGS7X09NRzchxeNd9fi7EU8+V7xyWfTyoIj5dLULg7D4tQ+zg4RzFw==")
                              )
                              || var8.contains(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("a7+3IICU8oldQIxuhvuiyqo+6p6o5FsTT8sVWSgKlPTCtWXgALM="))
                        )
                     || !var9.isBlank()
                        && var9.startsWith(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("nmstevRJsSHRi8P5IF4MYvyfYHQBj5v9AY+6KXHzavJNEPMW"))
                        && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("KMQvb7Akt+FzowE55ff5MVn70bEcNLb8CC7odba4sB8NRGU4pBiUXg==").equals(var10)) {
                     return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-499185939, 16) != 0);
                  }
               }
            }

            return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 31) != 0);
         } else {
            return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 17) != 0);
         }
      } else {
         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1822158267, 21) != 0);
      }
   }

   public boolean isImageGroupRoot(Map<String, Object> var1) {
      if ((-733601092 * (-733601092 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1855663868, 11)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 24)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("GpYghunc62BAVDDEeulVGkRjmMe6LqRTZzxznJMqg9A="))
         );
         String var2 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         int var4 = this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var5
               && !var5.isEmpty()
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1367241688, 29)
            : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(613099208, 6);
         if (var4 == 0) {
            return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1691944081, 19) != 0);
         } else if (var2.startsWith(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("nmstevRJsSHRi8P5IF4MYvyfYHQBj5v9AY+6KXHzavJNEPMW"))) {
            return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1971221464, 26) != 0);
         } else {
            var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112088, 9)];
            var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274802, 4)] = this.stringValue(
               this.readMapPathValue(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
            );
            String var6 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            return (!Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("KMQvb7Akt+FzowE55ff5MVn70bEcNLb8CC7odba4sB8NRGU4pBiUXg==").equals(var6)
               ? (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(910238809, 25) != 0)
               : this.hasDirectImageGroupGlyphChild(var1));
         }
      } else {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 14) != 0);
      }
   }

   public Vector resolveParentAbsoluteOffset(EditorSession var1, String var2) {
      if ((-1610027922 * (-1610027922 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         double var3 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 44));
         double var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 33));
         String var7 = var2;

         while (true) {
            int var8 = var7.lastIndexOf(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj"));
            if (var8 < 0) {
               break;
            }

            String var9 = var7.substring(Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 15), var8);
            if (var9.isBlank()) {
               break;
            }

            double[] var10 = this.resolveLaidOutBlockPosition(var1, var9);
            if (var10 != null) {
               var3 += var10[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 0)];
               var5 += var10[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904114648, 11)];
               break;
            }

            Map var11 = this.resolveRawMapAtPath(var1.rawBlocks, var9);
            if (var11 != null) {
               var3 += this.readMapPathDouble(
                  var11,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                  this.readMapPathDouble(
                     var11,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 49))
                  )
               );
               var5 += this.readMapPathDouble(
                  var11,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                  this.readMapPathDouble(
                     var11,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 3))
                  )
               );
            }

            double[] var12 = this.resolveScrollContentShift(var1, var9);
            if (var12 != null) {
               var3 -= var12[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1040641506, 24)];
               var5 -= var12[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1496596772, 17)];
            }

            var7 = var9;
         }

         return new Vector(var3, var5, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 27)));
      } else {
         return new Vector(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-1498832332381725914L, 56)),
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 38)),
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7397712555069364212L, 42))
         );
      }
   }

   public String formatAnimationOutlineDebugNumber(double var1) {
      if ((-1931149171 ^ -1931149171) != 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O2XGN7u1pJ9JyvZBRuWDg+OBT+L6Gnqk1/E7elewj79Qxw==");
      } else {
         Locale var10000 = Locale.ROOT;
         String var10001 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("aY1EprYOfg8lKa8dPw7a6nDFZAMgrJe8z3BK3p/Sfb2h0Cez");
         Object[] var10002 = new Object[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112602, 1)];
         var10002[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(374181961, 15)] = var1;
         return String.format(var10000, var10001, var10002);
      }
   }

   public String formatAnimationOutlineDebugBounds(EditorRect var1) {
      if ((1405140439 ^ 1405140439) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("8eh32TR0cAImW+Wmk1BsDuYUFh/fLAParm6kcCJ4k8/hOSGo")
            : Xqedii_2el7phmxcyk4(
               this.formatAnimationOutlineDebugNumber(var1.x),
               this.formatAnimationOutlineDebugNumber(var1.y),
               this.formatAnimationOutlineDebugNumber(var1.width),
               this.formatAnimationOutlineDebugNumber(var1.height)
            );
      }
   }

   public boolean shouldLogAnimationOutlineDebug(EditorSession var1, String var2, String var3) {
      if (((1205136769 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1215760357, 10) != 0);
      }
   }

   public EditorRect resolveTimelineOutlinePreviewLogicalFallback(EditorSession var1, String var2) {
      if ((246335057 * 246335057 + 246335057 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         LinkedHashSet var3 = new LinkedHashSet();
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904104408, 13)];
         var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 28)] = var2;
         String var4 = this.firstNonBlank(var10001);
         if (!var4.isBlank()) {
            var3.add(var4);
         }

         var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 17)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 21)] = this.resolveSidebarGroupRootTarget(var1, var4);
         String var5 = this.firstNonBlank(var10001);
         if (!var5.isBlank()) {
            var3.add(var5);
         }

         var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 4)];
         var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 1)] = this.resolveTimelineHierarchyTargetPath(var1, var4);
         String var6 = this.firstNonBlank(var10001);
         if (!var6.isBlank()) {
            var3.add(var6);
            var3.add(this.resolveImageGroupMemberRootPath(var1, var6));
         }

         var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 15)];
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-937129178, 30)] = this.resolveInheritedTargetRootPath(var1, var4);
         String var7 = this.firstNonBlank(var10001);
         if (!var7.isBlank()) {
            var3.add(var7);
         }

         for (String var9 : (Iterable<String>) (var3)) {

            EditorRect var10 = this.resolveTimelineGroupPreviewLogicalBounds(var1, var9);
            if (var10 != null) {
               return new EditorRect(var10.x, var10.y, var10.width, var10.height);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public void logAnimationOutlineDebug(
      EditorSession var1, String var2, String var3, String var4, EditorRect var5, EditorRect var6, double var7, double var9, double var11, double var13
   ) {
      if ((1125119037 ^ 1125119037) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin != null && var1 != null) {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-668447731, 21)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 21)] = var4;
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748298386, 16)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
         );
         String var15 = this.firstNonBlank(var10001);
         var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903850456, 17)];
         var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 30)] = var3;
         var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 13)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
         );
         String var16 = this.firstNonBlank(var10001);
         String var17 = this.formatAnimationOutlineDebugNumber(this.clampAnimationTimelineTick(var1.animationTimelineTick));
         String var18 = this.formatAnimationOutlineDebugNumber(
            var1.animationTimelineSliderDragTick == null
               ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684031907307L, 29))
               : var1.animationTimelineSliderDragTick
         );
         Logger var10000 = this.plugin.getLogger();
         String[] var10002 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-666350579, 22)];
         var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 23)] = var2;
         var10002[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(273225293, 31)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "wn5L/pqRqjt/CcOxNUzooxg2tKpSb4+fEMlO9N4sboXyXAN/38sIvC40BiFQ9pEQ1R5me0pOZkU="
         );
         var10000.info(
            Xqedii_iauefkj776ll(
               this.firstNonBlank(var10002),
               var16,
               var15,
               var17,
               var18,
               this.formatAnimationOutlineDebugBounds(var5),
               this.formatAnimationOutlineDebugBounds(var6),
               this.formatAnimationOutlineDebugNumber(var7),
               this.formatAnimationOutlineDebugNumber(var9),
               this.formatAnimationOutlineDebugNumber(var11),
               this.formatAnimationOutlineDebugNumber(var13)
            )
         );
      }
   }

   public void logAnimationOutlineLineHeights(EditorSession var1, String var2, boolean var3, boolean var4, boolean var5, boolean var6, double var7) {
      if ((-1774021172 * -1774021172 + -1774021172 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin != null && var1 != null) {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167270930, 13)];
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1820477618, 26)] = var2;
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112632, 5)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
         );
         String var9 = this.firstNonBlank(var10001);
         String var10 = this.formatAnimationOutlineDebugNumber(this.clampAnimationTimelineTick(var1.animationTimelineTick));
         String var11 = this.formatAnimationOutlineDebugNumber(
            var1.animationTimelineSliderDragTick == null
               ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8559045960459941182L, 56))
               : var1.animationTimelineSliderDragTick
         );
         double var12 = Math.max(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4807010494098584561L, 18)),
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684301061099L, 21))
         );
         double var14 = Math.max(
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-9219592603851642926L, 4)),
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-600876311762323055L, 15))
         );
         double var16 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6337803455756763995L, 26)), var7);
         double var18 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(1255549566884756810L, 34)), var7);
         this.plugin
            .getLogger()
            .info(
               Xqedii_1h0saf229kqdl(
                  var9,
                  var10,
                  var11,
                  var3
                     ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Wy0rnQAINDSbVNgZoAwO5XjA67PdYsU2DPN8CJA+HpQ6nCQIlmEW7Q==")
                     : this.formatAnimationOutlineDebugNumber(var12),
                  var4
                     ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Wy0rnQAINDSbVNgZoAwO5XjA67PdYsU2DPN8CJA+HpQ6nCQIlmEW7Q==")
                     : this.formatAnimationOutlineDebugNumber(var14),
                  var5
                     ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Wy0rnQAINDSbVNgZoAwO5XjA67PdYsU2DPN8CJA+HpQ6nCQIlmEW7Q==")
                     : this.formatAnimationOutlineDebugNumber(var16),
                  var6
                     ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Wy0rnQAINDSbVNgZoAwO5XjA67PdYsU2DPN8CJA+HpQ6nCQIlmEW7Q==")
                     : this.formatAnimationOutlineDebugNumber(var18),
                  this.formatAnimationOutlineDebugNumber(var7)
               )
            );
      }
   }

   public void logAnimationOutlineBoundsSource(EditorSession var1, String var2, String var3, EditorRect var4) {
      if (((-160204698 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var4 != null) {
         String var5 = this.resolveInheritedTargetRootPath(var1, var2);
         if (this.shouldLogAnimationOutlineDebug(var1, var2, var5)) {
            this.logAnimationOutlineDebug(
               var1,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("grKGtTwyyk9L46dMBbBJ56DzVy8MYqtkWJfUB5LWyMgk3ZkGQ0KftWE9SjtS5BYUjpH10HAjFxVin+vGOU2H/FulY9XO/w=="),
               var3,
               var2,
               var4,
               null,
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-300438155881157438L, 14)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153176233921873387L, 40)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8162685212786226494L, 60)),
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4977389101291333943L, 54))
            );
         }
      }
   }

   public String formatAnimationOutlineHudSnapshot(Player var1, String var2) {
      if (((-958169436 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var3 = this.hudService.getHud(var1, var2);
         if (var3 == null) {
            return Xqedii_15bhszhhkpo75(var2);
         } else {
            Vector var4 = this.hudService.getHudScale(var3);
            Vector var5 = this.hudService.getHudLocation(var3);
            return Xqedii_2bhme51mezgvy(
               var2,
               this.formatAnimationOutlineDebugNumber(
                  var4 == null ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-8550032266897328833L, 2)) : var4.getY()
               ),
               this.formatAnimationOutlineDebugNumber(
                  var5 == null ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(4847895625040004587L, 62)) : var5.getY()
               )
            );
         }
      } else {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-574863360, 5)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 5)] = var2;
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274786, 4)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
         );
         return Xqedii_1g2fzgdtq4yt1(this.firstNonBlank(var10001));
      }
   }

   public void logAnimationSelectionOverlayHudHeights(Player var1, EditorSession var2, String var3) {
      if ((-547290813 * -547290813 + -547290813 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin != null && var2 != null && var1 != null) {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(537097969, 23)];
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1691944081, 19)] = var3;
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112632, 5)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
         );
         String var4 = this.firstNonBlank(var10001);
         String var5 = this.formatAnimationOutlineDebugNumber(this.clampAnimationTimelineTick(var2.animationTimelineTick));
         String var6 = this.formatAnimationOutlineDebugNumber(
            var2.animationTimelineSliderDragTick == null
               ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(6879974258155937176L, 11))
               : var2.animationTimelineSliderDragTick
         );
         this.plugin
            .getLogger()
            .info(
               Xqedii_i00lh7bq4s1y(
                  var4,
                  var5,
                  var6,
                  this.formatAnimationOutlineHudSnapshot(
                     var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("M97JNh5Zjf4E1HTgO41f/oLWYLyqlvqsuaAGR7ELTi/DFGtTeVH2bkfboSHJKVn1")
                  ),
                  this.formatAnimationOutlineHudSnapshot(
                     var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("88ziweV7CjFAUGh6wBLdZ5Nu8iSN3BxaXJrpisOPewIzbovY+5P0G3fF7u+zx7bd1ygvhVR9")
                  ),
                  this.formatAnimationOutlineHudSnapshot(
                     var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("QUswJ9BN6DkasklTSDJjtNas4fsnVDC3B33hFMKpcUSIK+l0iAgYRjufchi+N5ebLwU=")
                  ),
                  this.formatAnimationOutlineHudSnapshot(
                     var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("WMK5NhunA+cTzogZAjfmqcM5F5RltmQN8PMz6WJhpsCkI4xaKhtNAv5PYZFXmBEuFfb2tA==")
                  )
               )
            );
      }
   }

   public void applyBoundsToTarget(EditorSession var1, String var2, EditorRect var3) {
      if (((1606426959 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var4 = this.findFirstByTargetId(var1, var2);
         if (var4 != null && var4.targetPath != null && !var4.targetPath.isBlank() && var3 != null) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 9)];
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 18)] = this.resolveInheritedTargetRootPath(var1, var2);
            String var5 = this.firstNonBlank(var10001);
            var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544851, 5)];
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 8)] = var5;
            var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301773752, 18)] = var4.targetPath;
            String var6 = this.firstNonBlank(var10001);
            int var7 = var1 != null && var1.activeTool == EditorTool.ANIMATION
               ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1044678513, 30)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 6);
            EditorRect var8 = var3;
            Map var9 = this.resolveRawMapAtPath(var1.rawBlocks, var6);
            if (var9 != null) {
               boolean var10 = this.isImageGroupRoot(var9);
               if (var7 != 0) {
                  var8 = new EditorRect(
                     this.snap1(var3.x),
                     this.snap1(var3.y),
                     Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 7)), var3.width),
                     Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 35)), var3.height)
                  );
               }

               EditorRect var11 = var10 ? this.convertGroupOutlineToRootBounds(var9, var8) : var8;
               Vector var12 = this.resolveParentAbsoluteOffset(var1, var6);
               double var13 = var11.x - var12.getX();
               double var15 = var11.y - var12.getY();
               if (var7 != 0) {
                  var13 = this.snap1(var13);
                  var15 = this.snap1(var15);
               }

               if (this.shouldInheritTargetToChildren(var9)) {
                  String[] var71 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1844895031, 28)];
                  var71[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1301301526, 23)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"
                  );
                  var71[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609825857, 9)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="
                  );
                  double var52 = this.resolveStoredSign(var9, var71);
                  var71 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670545907, 10)];
                  var71[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 25)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="
                  );
                  var71[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 9)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="
                  );
                  double var54 = this.resolveStoredSign(var9, var71);
                  double var56 = var11.width;
                  double var58 = var11.height;
                  if (var10) {
                     var56 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-5589328651960899515L, 44)), var56);
                     var58 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(9028993086253606869L, 4)), var58);
                  } else {
                     var56 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153184471803364843L, 45)), var56);
                     var58 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(4613575734928954345L, 3)), var58);
                  }

                  if (var10) {
                     double var25 = this.resolveGroupOutlineToRootYOffset(var9, var58);
                     var11 = new EditorRect(var11.x, var8.y + var25, var56, var58);
                     var13 = var11.x - var12.getX();
                     var15 = var11.y - var12.getY();
                     if (var7 != 0) {
                        var13 = this.snap1(var13);
                        var15 = this.snap1(var15);
                     }
                  }

                  int var60 = var1 != null && var1.resizeAnchorValid && var1.activeHandle != null
                     ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748298386, 16)
                     : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 15);
                  EditorRect var26 = var60 != 0 ? (EditorRect)var1.resizeInheritedRootStartBounds.get(var6) : null;
                  Object var27 = var60 != 0 ? var1.resizeInheritedChildrenSnapshot.get(var6) : null;
                  double var28 = var10
                     ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-4478450528934511416L, 29))
                     : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554638945788687678L, 40));
                  double var30;
                  double var32;
                  if (var26 != null && var27 != null) {
                     var30 = Math.max(var28, var26.width);
                     var32 = Math.max(var28, var26.height);
                  } else {
                     EditorRect var34 = this.resolveSidebarEditableBounds(var1, var2);
                     var30 = var34 == null
                        ? Math.max(
                           var28,
                           Math.abs(
                              this.readMapPathDouble(
                                 var9,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                                 this.readMapPathDouble(
                                    var9, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="), var28
                                 )
                              )
                           )
                        )
                        : Math.max(var28, var34.width);
                     var32 = var34 == null
                        ? Math.max(
                           var28,
                           Math.abs(
                              this.readMapPathDouble(
                                 var9,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                                 this.readMapPathDouble(
                                    var9, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="), var28
                                 )
                              )
                           )
                        )
                        : Math.max(var28, var34.height);
                  }

                  double var61 = var56 / var30;
                  double var36 = var58 / var32;
                  if (Double.isFinite(var61)
                     && Double.isFinite(var36)
                     && (
                        Math.abs(var61 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-819651441328888151L, 58)))
                              > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-8647666192052103597L, 43))
                           || Math.abs(var36 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(3284097992893114690L, 39)))
                              > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-5563745936036427420L, 31))
                     )) {
                     int var38 = var7 != 0 && !var10 ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-249592970, 15) : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 25);
                     Object var39 = var9.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI="));
                     if (var26 != null && var27 != null) {
                        Object var40 = this.deepCopyValue(var27);
                        var9.put(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI="), var40);
                        var39 = var40;
                     }

                     if (var10) {
                        this.unshiftImageGroupFramesVertically(var39);
                     }

                     this.scaleChildBoundsRecursively(var39, var61, var36, (var38 != 0));
                     if (var10) {
                        double[] var63 = this.resolveImageGroupTopTile(
                           var9.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI="))
                        );
                        if (var63 != null) {
                           double var41 = var63[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12)];
                           double var43 = var63[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1863448631, 11)];
                           double var45 = Double.isFinite(var43)
                              ? Xqedii_14y6uzm.Xqedii_2j0x561
                                 * (var43 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554634706924401982L, 44)))
                              : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 46));
                           double var47 = var45 - var41;
                           if (Double.isFinite(var47)
                              && Math.abs(var47) > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8198771923525892671L, 58))) {
                              this.shiftImageGroupFramesVertically(
                                 var9.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")),
                                 var47,
                                 (var7 != 0)
                              );
                           }
                        }

                        double[] var65 = this.resolveImageGroupLeftTile(
                           var9.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI="))
                        );
                        if (var65 != null) {
                           double var42 = var65[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-911079134, 20)];
                           double var44 = var65[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-568070034, 12)];
                           double var46 = var44 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-7494010628674494140L, 44))
                              - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153124212338460139L, 46));
                           var46 -= this.resolveGroupSingleTilePartialShiftX(var56, var44);
                           double var48 = var46 - var42;
                           if (Double.isFinite(var48)
                              && Math.abs(var48) > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(1019885581212091530L, 55))) {
                              this.shiftImageGroupFramesHorizontally(
                                 var9.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")),
                                 var48,
                                 (var7 != 0)
                              );
                           }
                        }
                     }
                  }

                  this.setNested(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     var13
                  );
                  this.setNested(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     var15
                  );
                  double var62 = var56 * var52;
                  double var64 = var58 * var54;
                  if (var7 != 0 && !var10) {
                     var62 = this.snap1(var62);
                     var64 = this.snap1(var64);
                  }

                  this.setNested(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                     var62
                  );
                  this.setNested(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                     var64
                  );
                  var9.put(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("r3lQbYuzN+9JzL+UQiwSjrZFjIdqdq4/5A5vDy/B10pg7w3B9w8="), var4.z);
               } else if (!Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("lazZ40HvKTdv0QS/fH9yNPQxDBuSHByzxkS0nYS/UancA0BDC8Urvf3uABplJg==")
                  .equalsIgnoreCase(var4.targetKind)) {
                  String[] var69 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904104408, 12)];
                  var69[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960392668, 14)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"
                  );
                  var69[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1215759333, 10)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="
                  );
                  double var51 = this.resolveStoredSign(var9, var69);
                  var69 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198160, 7)];
                  var69[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-264802543, 27)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="
                  );
                  var69[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2010871002, 30)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="
                  );
                  double var53 = this.resolveStoredSign(var9, var69);
                  this.setNested(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     var13
                  );
                  if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL").equals(var4.type)) {
                     double var55 = Math.max(
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-6408840329877939002L, 11)),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7768049556656656106L, 10))
                     );
                     double var23 = var8.height / var55;
                     if (var7 != 0) {
                        var23 = this.snap1(var23);
                     }

                     this.setNested(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                        var15
                     );
                     this.setNested(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                        var7 != 0 ? this.snap1(var8.width * var51) : var8.width * var51
                     );
                     if (!var4.playerHeadText) {
                        this.setNested(
                           var9,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                           var7 != 0 ? this.snap1(var23 * var53) : var23 * var53
                        );
                     }
                  } else {
                     this.setNested(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                        var15
                     );
                     this.setNested(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                        var7 != 0 ? this.snap1(var8.width * var51) : var8.width * var51
                     );
                     this.setNested(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                        var7 != 0 ? this.snap1(var8.height * var53) : var8.height * var53
                     );
                  }

                  var9.put(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("r3lQbYuzN+9JzL+UQiwSjrZFjIdqdq4/5A5vDy/B10pg7w3B9w8="), var4.z);
               } else {
                  String[] var10002 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 4)];
                  var10002[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(300955503, 19)] = var4.bindingWidth;
                  double var17 = this.resolveStoredSign(var9, var10002);
                  var10002 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112088, 9)];
                  var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 5)] = var4.bindingHeight;
                  double var19 = this.resolveStoredSign(var9, var10002);
                  int var21 = var4.bindingX != null && !var4.bindingX.isBlank()
                     ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-261169629, 28)
                     : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506492, 1);
                  int var22 = var4.bindingY != null && !var4.bindingY.isBlank()
                     ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112602, 1)
                     : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 20);
                  this.setBindingValue(var9, var4.bindingX, var13);
                  this.setBindingValue(var9, var4.bindingY, var15);
                  this.setBindingValue(var9, var4.bindingWidth, var7 != 0 ? this.snap1(var8.width * var17) : var8.width * var17);
                  this.setBindingValue(var9, var4.bindingHeight, var7 != 0 ? this.snap1(var8.height * var19) : var8.height * var19);
                  if (var21 == 0) {
                     var9.put(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/TpiBAG2GgvdMlZvNQT31/TZob1YVmhwNW2MWO6VRLVa7nC5/q96fW7oOVsMsCnDOjAc4lZHk86c/w=="), var8.x);
                  }

                  if (var22 == 0) {
                     var9.put(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("OYfD56pOLJHSUgXYFZU/njKwpl4alVRgbh/5i8fhUshdKkKJYdNhZrKsTAJGl9Asy0CyJywNrrfjHw=="), var8.y);
                  }
               }
            }
         }
      }
   }

   public void scaleChildBoundsRecursively(Object var1, double var2, double var4, boolean var6) {
      if (((-163659053 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var7 && !var7.isEmpty()) {
         for (Object var9 : var7) {
            if (var9 instanceof Map var10 && !var10.isEmpty()) {
               double var12 = this.readMapPathDouble(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                  this.readMapPathDouble(
                     var10,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(967534848802017663L, 12))
                  )
               );
               double var14 = this.readMapPathDouble(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                  this.readMapPathDouble(
                     var10,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(967534848802017663L, 12))
                  )
               );
               double var16 = this.readMapPathDouble(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                  this.readMapPathDouble(
                     var10,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                     this.readMapPathDouble(
                        var10,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PUc7+WMHBNFNCvD8WyYhOZ//FaEVQvJxXJOKZHb9qKwWJTkDxvT9hovGRkjqnJ9s8zQ="),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153158109294101995L, 46))
                     )
                  )
               );
               double var18 = this.readMapPathDouble(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                  this.readMapPathDouble(
                     var10,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                     this.readMapPathDouble(
                        var10,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("cHiYPt1N7OVAhECZ9NrL/Vr0P3lBEHaouX6u7pdke+Y5aqQnp0M0fKHMFENAzveyPNe4cA=="),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6200154850704493466L, 50))
                     )
                  )
               );
               String[] var10002 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903064024, 19)];
               var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 5)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                  "zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"
               );
               var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(830370776, 30)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                  "SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="
               );
               double var20 = this.resolveStoredSign(var10, var10002);
               var10002 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(3632914, 27)];
               var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 13)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                  "vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="
               );
               var10002[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164952, 2)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                  "ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="
               );
               double var22 = this.resolveStoredSign(var10, var10002);
               double var24 = var12 * var2;
               double var26 = var14 * var4;
               double var28 = Math.max(
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-4562989950135859658L, 17)), Math.abs(var16) * Math.abs(var2)
               );
               double var30 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(8001383328317239548L, 23)), Math.abs(var18) * Math.abs(var4));
               if (var6) {
                  var24 = this.snap1(var24);
                  var26 = this.snap1(var26);
               }

               this.setNested(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                  var24
               );
               this.setNested(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                  var26
               );
               this.setNested(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                  var6 ? this.snap1(var28 * var20) : var28 * var20
               );
               this.setNested(
                  var10,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("suzubs5RJgYwo+i7XaTBlTNVIAMZntZPJnwmerCLkgPIHYP9"),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                  var6 ? this.snap1(var30 * var22) : var30 * var22
               );
               Object var32 = var10.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI="));
               if (var32 instanceof List) {
                  this.scaleChildBoundsRecursively(var32, var2, var4, var6);
               }
            }
         }
      }
   }

   public void shiftImageGroupFramesVertically(Object var1, double var2, boolean var4) {
      if ((368407578 ^ 368407578) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var5 && !var5.isEmpty()) {
         for (Object var7 : var5) {
            if (var7 instanceof Map var8 && !var8.isEmpty()) {
               double var10 = this.readMapPathDouble(
                  var8,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                  this.readMapPathDouble(
                     var8,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-837736208582547799L, 58))
                  )
               );
               double var12 = this.readMapPathDouble(
                  var8,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i"),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7449100481989101735L, 3))
               );
               if (!Double.isFinite(var12)) {
                  var12 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-6839057179978957868L, 30));
               }

               double var14 = var10 + var2;
               double var16 = var12 + var2;
               if (var4) {
                  var14 = this.snap1(var14);
                  var16 = this.snap1(var16);
               }

               this.setNested(
                  var8,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                  var14
               );
               var8.put(
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i"),
                  var16
               );
            }
         }
      }
   }

   public double[] resolveImageGroupBottomTile(Object var1) {
      if ((-1418221762 * -1418221762 + -1418221762 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var2 && !var2.isEmpty()) {
         double var3 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(2804391284961346651L, 48));
         double var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(2804532056809440347L, 48));

         for (Object var8 : var2) {
            if (var8 instanceof Map var9 && !var9.isEmpty()) {
               double var11 = this.readMapPathDouble(
                  var9,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                  this.readMapPathDouble(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-3125191610738097413L, 22))
                  )
               );
               if (Double.isFinite(var11)) {
                  double var13 = Math.abs(
                     this.readMapPathDouble(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                        this.readMapPathDouble(
                           var9,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855816385L, 13))
                        )
                     )
                  );
                  if (var11 > var3) {
                     var3 = var11;
                     var5 = var13;
                  }
               }
            }
         }

         if (Double.isFinite(var3) && Double.isFinite(var5)) {
            double[] var10000 = new double[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1826352571, 21)];
            var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 17)] = var3;
            var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1496596772, 17)] = var5;
            return var10000;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int countImageGroupGlyphTiles(Object var1) {
      if (((-1420111480 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var2 && !var2.isEmpty()) {
         int var3 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1040641506, 24);

         for (Object var5 : var2) {
            if (var5 instanceof Map var6) {
               Object var7 = var6.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL"));
               if (var7 != null
                  && var7.toString().contains(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("JhbNZKiJuYdd6MOBGmjtYFTcHg7p9og39/T3JUrOxOFPRp+frQzrQwsd4wM="))) {
                  var3++;
               }
            }
         }

         return var3;
      } else {
         return Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(583643657, 12);
      }
   }

   public double resolveGroupSingleTilePartialShiftX(double var1, double var3) {
      if ((-1451621447 * (-1451621447 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return imageGroupSingleTilePartialShiftX(var1, var3);
      }
   }

   public void applyGroupSingleTilePartialCorrection(Object var1, double var2, double var4) {
      if ((-533816400 * -533816400 - -533816400 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var6) {
         double var7 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8550034363158689086L, 54));
         double var9 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7009060496224421323L, 6));
         int var11 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 4);

         for (Object var13 : var6) {
            if (var13 instanceof Map var14) {
               Object var15 = var14.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL"));
               if (var15 != null
                  && var15.toString().contains(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("JhbNZKiJuYdd6MOBGmjtYFTcHg7p9og39/T3JUrOxOFPRp+frQzrQwsd4wM="))) {
                  double var17 = this.readMapPathDouble(
                     var14,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                     this.readMapPathDouble(
                        var14,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300285417L, 14))
                     )
                  );
                  if (Double.isFinite(var17)) {
                     if (var17 < var7) {
                        var7 = var17;
                        var9 = Math.abs(
                           this.readMapPathDouble(
                              var14,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                              this.readMapPathDouble(
                                 var14,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-5589328643907835835L, 44))
                              )
                           )
                        );
                     }

                     var11 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198288, 7);
                  }
               }
            }
         }

         if (var11 != 0 && Double.isFinite(var9)) {
            double var21 = this.resolveGroupSingleTilePartialShiftX(var2, var9);
            if (!(Math.abs(var21) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7754377433705004437L, 3)))) {
               for (Object var23 : var6) {
                  if (var23 instanceof Map var16) {
                     Object var18 = var16.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL"));
                     if (var18 != null
                        && var18.toString().contains(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("JhbNZKiJuYdd6MOBGmjtYFTcHg7p9og39/T3JUrOxOFPRp+frQzrQwsd4wM="))) {
                        double var19 = this.readMapPathDouble(
                           var16,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                           this.readMapPathDouble(
                              var16,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554817307458991422L, 49))
                           )
                        );
                        if (Double.isFinite(var19)) {
                           this.setNested(
                              var16,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                              var19 - var21
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public double[] resolveImageGroupTopTile(Object var1) {
      if ((626478911 * 626478911 - 626478911 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var2 && !var2.isEmpty()) {
         double var3 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-5368494807048388555L, 22));
         double var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-2488694550645666972L, 53));

         for (Object var8 : var2) {
            if (var8 instanceof Map var9 && !var9.isEmpty()) {
               double var11 = this.readMapPathDouble(
                  var9,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                  this.readMapPathDouble(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6046997597131892941L, 51))
                  )
               );
               if (Double.isFinite(var11)) {
                  double var13 = Math.abs(
                     this.readMapPathDouble(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                        this.readMapPathDouble(
                           var9,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-373779331459435692L, 57))
                        )
                     )
                  );
                  if (var11 < var3) {
                     var3 = var11;
                     var5 = var13;
                  }
               }
            }
         }

         if (!Double.isFinite(var3)) {
            return null;
         } else {
            double[] var10000 = new double[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465012992, 2)];
            var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-911079134, 20)] = var3;
            var10000[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1044678513, 30)] = var5;
            return var10000;
         }
      } else {
         return null;
      }
   }

   public double[] resolveImageGroupLeftTile(Object var1) {
      if ((1278126073 * 1278126073 + 1278126073 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var2 && !var2.isEmpty()) {
         double var3 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-8298657795538195714L, 39));
         double var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-8255837188052756864L, 12));

         for (Object var8 : var2) {
            if (var8 instanceof Map var9 && !var9.isEmpty()) {
               double var11 = this.readMapPathDouble(
                  var9,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                  this.readMapPathDouble(
                     var9,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-5589324269483644859L, 44))
                  )
               );
               if (Double.isFinite(var11)) {
                  double var13 = Math.abs(
                     this.readMapPathDouble(
                        var9,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                        this.readMapPathDouble(
                           var9,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855812288L, 14))
                        )
                     )
                  );
                  if (var11 < var3) {
                     var3 = var11;
                     var5 = var13;
                  }
               }
            }
         }

         if (Double.isFinite(var3) && Double.isFinite(var5)) {
            double[] var10000 = new double[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-938980339, 28)];
            var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274802, 4)] = var3;
            var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1753368754, 26)] = var5;
            return var10000;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public double readImageGroupChildrenShiftY(Object var1) {
      if ((-344449976 * -344449976 + -344449976 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var2 && !var2.isEmpty()) {
         for (Object var4 : var2) {
            if (var4 instanceof Map var5
               && !var5.isEmpty()
               && var5.containsKey(
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i")
               )) {
               double var7 = this.readMapPathDouble(
                  var5,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i"),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(967534848802017663L, 12))
               );
               if (Double.isFinite(var7)) {
                  return var7;
               }
            }
         }

         return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 17));
      } else {
         return Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 42));
      }
   }

   public void unshiftImageGroupFramesVertically(Object var1) {
      if (((-761817505 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var2 && !var2.isEmpty()) {
         for (Object var4 : var2) {
            if (var4 instanceof Map var5 && !var5.isEmpty()) {
               double var7 = this.readMapPathDouble(
                  var5,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i"),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-835793813786895529L, 34))
               );
               if (Double.isFinite(var7) && !(Math.abs(var7) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(3289524949362763010L, 29)))) {
                  double var9 = this.readMapPathDouble(
                     var5,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                     this.readMapPathDouble(
                        var5,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 32))
                     )
                  );
                  this.setNested(
                     var5,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     var9 - var7
                  );
                  var5.remove(
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i")
                  );
               } else {
                  var5.remove(
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i")
                  );
               }
            }
         }
      }
   }

   public void shiftImageGroupFramesHorizontally(Object var1, double var2, boolean var4) {
      if (((-992503473 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var5 && !var5.isEmpty()) {
         for (Object var7 : var5) {
            if (var7 instanceof Map var8 && !var8.isEmpty()) {
               double var10 = this.readMapPathDouble(
                  var8,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                  this.readMapPathDouble(
                     var8,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4986394101522819383L, 54))
                  )
               );
               double var12 = var10 + var2;
               if (var4) {
                  var12 = this.snap1(var12);
               }

               this.setNested(
                  var8,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0Fkz6kxM2V6K8FcoTuBhalGI4rN8w12esOTAtgKn+PBns2adLiKXC+4iNf8="),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                  var12
               );
            }
         }
      }
   }

   public EditorRect resolveGroupChildrenVisualBounds(Map<String, Object> var1, double var2, double var4) {
      if ((-403809694 ^ -403809694) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (var1.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var7
            && !var7.isEmpty()) {
            EditorRect var8 = null;

            for (Object var10 : var7) {
               if (var10 instanceof Map var11 && !var11.isEmpty()) {
                  double var13 = this.readMapPathDouble(
                     var11,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                     this.readMapPathDouble(
                        var11,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-8523010669133105871L, 5))
                     )
                  );
                  double var15 = this.readMapPathDouble(
                     var11,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                     this.readMapPathDouble(
                        var11,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639126129079614L, 34))
                     )
                  );
                  if (Double.isFinite(var13) && Double.isFinite(var15)) {
                     double var17 = this.readMapPathDouble(
                        var11,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                        this.readMapPathDouble(
                           var11,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                           this.readMapPathDouble(
                              var11,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PUc7+WMHBNFNCvD8WyYhOZ//FaEVQvJxXJOKZHb9qKwWJTkDxvT9hovGRkjqnJ9s8zQ="),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(5795776247138811606L, 40))
                           )
                        )
                     );
                     double var19 = this.readMapPathDouble(
                        var11,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                        this.readMapPathDouble(
                           var11,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                           this.readMapPathDouble(
                              var11,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("cHiYPt1N7OVAhECZ9NrL/Vr0P3lBEHaouX6u7pdke+Y5aqQnp0M0fKHMFENAzveyPNe4cA=="),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(8682438177327102474L, 6))
                           )
                        )
                     );
                     double var21 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(286823973176130777L, 41)), Math.abs(var17));
                     double var23 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-1376533943340234083L, 19)), Math.abs(var19));
                     EditorRect var25 = new EditorRect(var2 + var13, var4 + var15, var21, var23);
                     var8 = this.mergeBounds(var8, var25);
                  }
               }
            }

            return var8;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int countImageGroupFrameRows(Map<String, Object> var1) {
      if ((-561204878 * -561204878 + -561204878 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (var1.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")) instanceof List var3
            && !var3.isEmpty()) {
            HashSet var4 = new HashSet();

            for (Object var6 : var3) {
               if (var6 instanceof Map var7 && !var7.isEmpty()) {
                  double var9 = this.readMapPathDouble(
                     var7,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                     this.readMapPathDouble(
                        var7,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7826040969483864593L, 42))
                     )
                  );
                  if (Double.isFinite(var9)) {
                     double var11 = this.readMapPathDouble(
                        var7,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YdA0kYDizrXVFzrbDQZ/rUJHeNLKbrhcDS8Z5kr4h3AmZoUzMZ5SiCypia0lDDT2NncigWEmWImMkSB9mf+Cr417LqlLT18i"),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 14))
                     );
                     if (!Double.isFinite(var11)) {
                        var11 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 30));
                     }

                     double var13 = var9 - var11;
                     if (Double.isFinite(var13)) {
                        var4.add(this.normalizeGroupFrameCoordinate(var13));
                     }
                  }
               }
            }

            return Math.max(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-499185939, 16), var4.size());
         } else {
            return Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 6);
         }
      } else {
         return Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-574863392, 5);
      }
   }

   public void logAnimationTargetOutlineHudHeights(Player var1, EditorSession var2, String var3) {
      if ((1954263753 * (1954263753 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin != null && var2 != null && var1 != null && var3 != null && !var3.isBlank()) {
         LinkedHashSet var4 = new LinkedHashSet();

         for (HoverElement var6 : this.findTargetElements(var2, var3)) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(76637393, 3)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2081283012, 25)] = var6 == null ? null : var6.id;
            String var7 = this.firstNonBlank(var10001);
            if (!var7.isBlank()) {
               String var8 = Xqedii_2gpq665dotsb2(var7);
               var4.add(var8);
               if (this.isRoundedType(var6 == null ? null : var6.type)) {
                  var4.add(Xqedii_1dakhuqttubw(var8));
                  var4.add(Xqedii_wk58b3231ytm(var8));
                  var4.add(Xqedii_3tahu0prutciw(var8));
                  var4.add(Xqedii_1mqgt9n4chxkh(var8));
                  var4.add(Xqedii_13ursycqcsrww(var8));
                  var4.add(Xqedii_3bkm64hiaql0q(var8));
                  var4.add(Xqedii_23ylby2cxy489(var8));
                  var4.add(Xqedii_3i58xj5gbgry4(var8));
                  var4.add(Xqedii_1w32esd5hviry(var8));
               }
            }
         }

         if (!var4.isEmpty()) {
            int var10 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1040641506, 24);
            ArrayList var11 = new ArrayList();

            for (String var14 : (Iterable<String>) (var4)) {

               Entity var9 = this.hudService.getHud(var1, var14);
               if (var9 != null) {
                  var10++;
                  if (var11.size() < Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904115672, 8)) {
                     var11.add(this.formatAnimationOutlineHudSnapshot(var1, var14));
                  }
               }
            }

            String[] var17 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(930025984, 3)];
            var17[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303940090, 8)] = var3;
            var17[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(306549572, 5)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
            );
            String var13 = this.firstNonBlank(var17);
            String var15 = this.formatAnimationOutlineDebugNumber(this.clampAnimationTimelineTick(var2.animationTimelineTick));
            String var16 = this.formatAnimationOutlineDebugNumber(
               var2.animationTimelineSliderDragTick == null
                  ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6054470308968001107L, 25))
                  : var2.animationTimelineSliderDragTick
            );
            this.plugin
               .getLogger()
               .info(
                  Xqedii_39pl2trwp63mu(
                     var13,
                     var15,
                     var16,
                     var10,
                     var11.isEmpty()
                        ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe")
                        : String.join(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mssx5iDHKJ/X5hpdTNbncrKYW3UAZdZ61SMNYKZO"), var11)
                  )
               );
         }
      }
   }

   public EditorRect resolveTimelineLiveOutlineBoundsForTarget(EditorSession var1, String var2) {
      if ((-1641758351 ^ -1641758351) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         LinkedHashSet var3 = new LinkedHashSet();
         this.addTimelineOutlineRootPath(var1, var3, this.resolveInheritedTargetRootPath(var1, var2));
         this.addTimelineOutlineRootPath(var1, var3, this.resolveRawTargetPathByTargetId(var1, var2));
         this.addTimelineOutlineRootPath(var1, var3, this.resolveTimelineHierarchyTargetPath(var1, var2));

         for (String var6 : this.collectRawTargetCandidatePathsByTargetId(var1, var2)) {
            this.addTimelineOutlineRootPath(var1, var3, this.resolveRawTargetInheritedRootPath(var1, var6));
            this.addTimelineOutlineRootPath(var1, var3, var6);
         }

         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1576459575, 28)];
         var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1215760357, 10)] = this.resolveSidebarGroupRootTarget(var1, var2);
         String var17 = this.firstNonBlank(var10001);
         if (var17.isBlank() && this.isAnimationTimelineImageGroupRoot(var1, var2)) {
            var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 28)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(930025968, 3)] = var2;
            var17 = this.firstNonBlank(var10001);
         }

         if (!var17.isBlank()) {
            this.addTimelineOutlineRootPath(var1, var3, this.resolveRawTargetPathByTargetId(var1, var17));
            this.addTimelineOutlineRootPath(var1, var3, this.resolveTimelineHierarchyTargetPath(var1, var17));
            this.addTimelineOutlineRootPath(var1, var3, var17);
         }

         if (var3.isEmpty()) {
            this.logTimelineLiveOutlineResolver(
               var1, var2, var17, Collections.emptyList(), null, null, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe")
            );
            return null;
         } else {
            String var18 = null;
            String var7 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe");
            EditorRect var8 = null;
            ArrayList var9 = new ArrayList();

            for (String var11 : (Iterable<String>) (var3)) {

               int var12 = this.countTimelineLiveOutlineElements(var1, var11);
               EditorRect var13 = this.resolveTimelineGroupLiveOutlineBoundsFromElements(var1, var11);
               String var14 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("DC0PmKLFnYVi6NRg/KChFmnGFRgaTqh9dAa/ichJcXMKxGr5");
               int var15 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 9);
               if (var13 == null) {
                  var15 = this.countTimelineLiveOutlineElementsByChildTargetIds(var1, var11);
                  var13 = this.resolveTimelineLiveOutlineBoundsByChildTargetIds(var1, var11);
                  if (var13 != null) {
                     var14 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("5/LVw/3fKtCZWWJzPD0F4zcbxu6N6XWd29cxZ/cB+gJJfuXMJZ3vVOWd16APIypCWNnlx8FRJPNH1qW3Y05lhSnXhBc=");
                  }
               }

               var9.add(
                  Xqedii_1wus3bs38l2bl(
                     var11,
                     var12,
                     var15,
                     var13 == null
                        ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("gjB2FBjhoUwq/HIDzDJY7S1ADdz2S5lAJUlx1X8aGsY=")
                        : Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e5xuS/5nV3u+hjCO72grGNaUgr1H/rOwd5k4qGSnP9H2SA=="),
                     var14
                  )
               );
               if (var8 == null && var13 != null) {
                  var8 = var13;
                  var18 = var11;
                  var7 = var14;
               }
            }

            if (var8 == null) {
               var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1496465700, 17)];
               var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 30)] = var17;
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149726783, 6)] = var2;
               String var19 = this.firstNonBlank(var10001);
               EditorRect var21 = this.resolveTimelineLiveOutlineBoundsFromPreviewElements(var1, var19, var9);
               if (var21 != null) {
                  var8 = var21;
                  var18 = var19;
                  var7 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("67e8z0/Fap2aqUUI5Ro1vu2bbeOPlu042MJCR2+BQC0c76KtmSBL0QAGTnrzkowIQ90yCIgnd3sxLohk");
               }
            }

            if (var8 != null && !var17.isBlank()) {
               for (String var22 : (Iterable<String>) (var3)) {

                  EditorRect var23 = this.resolveTimelineGroupLiveRootBoundsFromElements(var1, var17, var22);
                  if (var23 != null) {
                     double var24 = Math.min(var8.x, var23.x);
                     double var25 = Math.max(var8.maxX(), var23.maxX());
                     if (var25 - var24 > var8.width + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(252527724799209448L, 48))) {
                        var8 = new EditorRect(var24, var8.y, var25 - var24, var8.height);
                     }
                     break;
                  }
               }
            }

            this.logTimelineLiveOutlineResolver(var1, var2, var17, var9, var18, var8, var7);
            return var8;
         }
      } else {
         return null;
      }
   }

   public void addTimelineOutlineRootPath(EditorSession var1, Set<String> var2, String var3) {
      if ((1778197382 * 1778197382 + 1778197382 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         String var4 = this.findImageGroupOwnerPath(var1, var3);
         if (var4.isBlank()) {
            var4 = var3;
            int var5 = var3.indexOf(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj"));
            if (var5 > 0) {
               String var6 = var3.substring(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607880179, 9), var5);
               Map var7 = var1 == null ? null : this.resolveRawMapAtPath(var1.rawBlocks, var6);
               if (!this.isRawImageGroupOwner(var7)) {
                  var4 = var6;
               }
            }
         }

         if (!var4.isBlank()) {
            var2.add(var4);
         }
      }
   }

   public int countTimelineLiveOutlineElements(EditorSession var1, String var2) {
      if ((95512615 ^ 95512615) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var1.elements != null && !var1.elements.isEmpty()) {
         int var3 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1136148259, 13);
         String var4 = Xqedii_2pei66ypozvph(var2);

         for (HoverElement var6 : var1.elements) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1496596772, 17)];
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10)] = var6 == null ? null : var6.targetPath;
            String var7 = this.firstNonBlank(var10001);
            if (!var7.isBlank() && var7.startsWith(var4) && this.isImageGroupMemberPath(var1, var2, var7)) {
               var3++;
            }
         }

         return var3;
      } else {
         return Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506492, 1);
      }
   }

   public int countTimelineLiveOutlineElementsByChildTargetIds(EditorSession var1, String var2) {
      if (((1977211058 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var3 = this.collectTimelineChildTargetIds(var1, var2);
         if (!var3.isEmpty() && var1 != null && var1.elements != null && !var1.elements.isEmpty()) {
            int var4 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164948, 2);

            for (HoverElement var6 : var1.elements) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1208016316, 21)];
               var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(910238809, 25)] = this.targetIdOf(var6);
               var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112536, 6)] = var6 == null ? null : var6.targetId;
               String var7 = this.firstNonBlank(var10001);
               if (!var7.isBlank()) {
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1367241688, 28)];
                  var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 14)] = this.resolveAnimationBaseTargetId(var7);
                  var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-130584815, 27)] = var7;
                  String var8 = this.firstNonBlank(var10001);
                  if (var3.contains(var7) || var3.contains(var8)) {
                     var4++;
                  }
               }
            }

            return var4;
         } else {
            return Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 5);
         }
      }
   }

   public EditorRect resolveTimelineLiveOutlineBoundsByChildTargetIds(EditorSession var1, String var2) {
      if ((-727703172 ^ -727703172) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var1.elements != null && !var1.elements.isEmpty()) {
         LinkedHashSet var3 = this.collectTimelineChildTargetIds(var1, var2);
         if (var3.isEmpty()) {
            return null;
         } else {
            EditorRect var4 = null;

            for (HoverElement var6 : var1.elements) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-804762611, 27)];
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1203822012, 21)] = this.targetIdOf(var6);
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2089357025, 31)] = var6 == null ? null : var6.targetId;
               String var7 = this.firstNonBlank(var10001);
               if (!var7.isBlank()) {
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112344, 7)];
                  var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 26)] = this.resolveAnimationBaseTargetId(var7);
                  var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167279122, 13)] = var7;
                  String var8 = this.firstNonBlank(var10001);
                  if (var3.contains(var7) || var3.contains(var8)) {
                     var4 = this.mergeBounds(var4, this.getElementBounds(var6));
                  }
               }
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public EditorRect resolveTimelineLiveOutlineBoundsFromPreviewElements(EditorSession var1, String var2, List<String> var3) {
      if ((1488954048 ^ 1488954048) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         List var4 = this.resolveTimelinePreviewTransformElements(var1, var2);
         if (var4 != null && !var4.isEmpty()) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-574863328, 5)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(601911006, 20)] = this.resolveTimelineHierarchyTargetPath(var1, var2);
            var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(374149193, 15)] = this.resolveRawTargetPathByTargetId(var1, var2);
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112344, 7)] = var2;
            String var5 = this.firstNonBlank(var10001);
            EditorRect var6 = null;
            int var7 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164948, 2);

            for (HoverElement var9 : (Iterable<HoverElement>) (var4)) {

               if (var9 != null) {
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904108504, 12)];
                  var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2081283012, 25)] = var9.type;
                  String var10 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  if (!Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("KMQvb7Akt+FzowE55ff5MVn70bEcNLb8CC7odba4sB8NRGU4pBiUXg==").equals(var10)) {
                     EditorRect var11 = this.getElementBounds(var9);
                     if (var11 != null) {
                        var6 = this.mergeBounds(var6, var11);
                        var7++;
                     }
                  }
               }
            }

            if (var6 != null) {
               if (var3 != null) {
                  var3.add(Xqedii_28fuyekpfff35(var4.size(), var7));
               }

               return var6;
            } else {
               EditorRect var20 = null;
               int var21 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 24);
               var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960409052, 14)];
               var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(306549604, 5)] = var5;
               String var22 = this.firstNonBlank(var10001);

               for (HoverElement var12 : (Iterable<HoverElement>) (var4)) {

                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-261169629, 28)];
                  var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1887323272, 22)] = var12 == null ? null : var12.targetPath;
                  String var13 = this.firstNonBlank(var10001);
                  if (!var13.isBlank() && !this.equalsNullable(var13, var22)) {
                     EditorRect var14 = this.getElementBounds(var12);
                     if (var14 != null) {
                        var20 = this.mergeBounds(var20, var14);
                        var21++;
                     }
                  }
               }

               if (var20 != null) {
                  if (var3 != null) {
                     var3.add(Xqedii_1bfxrcphmpwtr(var4.size(), var21));
                  }

                  return var20;
               } else {
                  ArrayList var24 = new ArrayList();
                  double var25 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153176234056091115L, 51));
                  int var26 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(-1904112601, 5);

                  for (HoverElement var16 : (Iterable<HoverElement>) (var4)) {

                     EditorRect var17 = this.getElementBounds(var16);
                     if (var17 != null) {
                        var24.add(var17);
                        double var18 = Math.abs(var17.width) * Math.abs(var17.height);
                        if (var18 > var25) {
                           var25 = var18;
                           var26 = var24.size() - Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 15);
                        }
                     }
                  }

                  if (var24.size() > Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-261169629, 28) && var26 >= 0) {
                     EditorRect var27 = null;

                     for (int var28 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 20); var28 < var24.size(); var28++) {
                        if (var28 != var26) {
                           var27 = this.mergeBounds(var27, (EditorRect)var24.get(var28));
                        }
                     }

                     if (var27 != null) {
                        if (var3 != null) {
                           var3.add(Xqedii_26nb7xmdpbj(var4.size(), var24.size()));
                        }

                        return var27;
                     }
                  }

                  if (var3 != null) {
                     var3.add(Xqedii_3evtqfwoszc7t(var4.size(), var24.size()));
                  }

                  return null;
               }
            }
         } else {
            if (var3 != null) {
               var3.add(
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "3OvPBoSP2saZeKYuzhb6a7alYV1axGxspCFoQM/yvWhrfz2y9ADSzeOZDsCWAhVTwkUGUsUlHAyr1ctQx7B3qbJbzGiATSOvYGfmGTasrhH4yvlkjUnShT9k9ZjcrKGnCCD0jK/Qh5/CcVmtzEQX+POByzV5tR+JBwDRlIbN"
                  )
               );
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public LinkedHashSet<String> collectTimelineChildTargetIds(EditorSession var1, String var2) {
      if ((-1796016305 * -1796016305 + -1796016305 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         if (var1 != null && var2 != null && !var2.isBlank()) {
            List var4 = var1.renderBlocks;
            if ((var4 == null || var4.isEmpty()) && var1.rawBlocks != null && !var1.rawBlocks.isEmpty()) {
               var4 = this.resolveRenderableBlocks(var1.rawBlocks, var1.components, var1);
            }

            if (var4 != null && !var4.isEmpty()) {
               String var5 = Xqedii_3s731rmihpc9s(var2);

               for (Map var7 : (Iterable<Map>) (var4)) {

                  if (var7 != null && !var7.isEmpty()) {
                     String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 3)];
                     var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 27)] = this.stringValue(
                        this.readMapPathValue(
                           var7,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                        )
                     );
                     String var8 = this.firstNonBlank(var10001);
                     if (!var8.isBlank() && var8.startsWith(var5) && this.isImageGroupMemberPath(var1, var2, var8)) {
                        var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1753368754, 26)];
                        var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10)] = this.stringValue(
                           this.readMapPathValue(
                              var7,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("tTZOK2iGig75Q0PwHscFlR9FbLabxADCtF+6tRIUBYIum3SVUAJpU/lHGJkaHngS1hTkwROjNxRLHfzwxsSu6g==")
                           )
                        );
                        String var9 = this.firstNonBlank(var10001);
                        if (!var9.isBlank()) {
                           var3.add(var9);
                           var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-912127710, 20)];
                           var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 14)] = this.resolveAnimationBaseTargetId(var9);
                           String var10 = this.firstNonBlank(var10001);
                           if (!var10.isBlank()) {
                              var3.add(var10);
                           }
                        }
                     }
                  }
               }

               return var3;
            } else {
               return var3;
            }
         } else {
            return var3;
         }
      }
   }

   public void logTimelineLiveOutlineResolver(EditorSession var1, String var2, String var3, List<String> var4, String var5, EditorRect var6, String var7) {
      if ((-1332508845 * -1332508845 + -1332508845 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin != null && var1 != null) {
         String var8 = this.resolveInheritedTargetRootPath(var1, var2);
         if (this.shouldLogAnimationOutlineDebug(var1, var2, var8)) {
            String var9 = this.formatAnimationOutlineDebugNumber(this.clampAnimationTimelineTick(var1.animationTimelineTick));
            String var10 = this.formatAnimationOutlineDebugNumber(
               var1.animationTimelineSliderDragTick == null
                  ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(8306097188907123947L, 9))
                  : var1.animationTimelineSliderDragTick
            );
            Logger var10000 = this.plugin.getLogger();
            String[] var10002 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274770, 4)];
            var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 5)] = var2;
            var10002[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-912127710, 20)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "vkT2ZRxLfZlnPW8lABRJ47ucLMJ6mO3j+TeUh4AqE259DEs/ReEf+W8r"
            );
            String var10001 = this.firstNonBlank(var10002);
            String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544371, 9)];
            var10003[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149726847, 6)] = var3;
            var10003[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 11)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe"
            );
            String var11 = this.firstNonBlank(var10003);
            String[] var10004 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-671069171, 19)];
            var10004[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301511608, 18)] = var8;
            var10004[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112088, 9)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe"
            );
            String var12 = this.firstNonBlank(var10004);
            String[] var10005 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670561267, 14)];
            var10005[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1860051936, 4)] = var5;
            var10005[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274786, 4)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe");
            String var13 = this.firstNonBlank(var10005);
            String[] var10006 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903850456, 17)];
            var10006[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1215760357, 10)] = var7;
            var10006[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1136140067, 13)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe"
            );
            var10000.info(
               Xqedii_3n61m4k4qg297(
                  var10001,
                  var11,
                  var12,
                  var13,
                  this.firstNonBlank(var10006),
                  var9,
                  var10,
                  this.formatAnimationOutlineDebugBounds(var6),
                  var4 != null && !var4.isEmpty()
                     ? String.join(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Mj7qoPZ/KRqPCrCJU+UGr6pdY9h20FNNSK5tCCcNfhcJfA=="), var4)
                     : Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("FDSJkhlKA9mSHJ4v86iTbFMP/Ss8P7H+zaFlqKl4xX38daYe")
               )
            );
         }
      }
   }

   public EditorRect resolveTimelineGroupPreviewOutlineBounds(EditorSession var1, String var2) {
      if (((853925745 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var2.isBlank()) {
         return null;
      } else if (var1.activeTool != EditorTool.ANIMATION || !var1.animationTimelinePanelVisible) {
         return null;
      } else if (this.isTimelineTransformInteractionActive(var1)) {
         return null;
      } else {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1215759333, 10)];
         var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(374181961, 15)] = this.resolveInheritedTargetRootPath(var1, var2);
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return null;
         } else {
            EditorRect var4 = this.resolveTimelineGroupLiveOutlineBoundsFromElements(var1, var3);
            if (var4 != null) {
               return var4;
            } else {
               EditorRect var5 = null;
               if (this.equalsNullable(var2, var1.animationPreviewTargetId)) {
                  var5 = var1.animationPreviewAppliedBounds;
               }

               if (var5 == null) {
                  var5 = (EditorRect)var1.previewExtraAppliedBoundsByTarget.get(var2);
               }

               if (var5 == null && this.equalsNullable(var3, var1.animationPreviewTargetId)) {
                  var5 = var1.animationPreviewAppliedBounds;
               }

               if (var5 == null) {
                  var5 = (EditorRect)var1.previewExtraAppliedBoundsByTarget.get(var3);
               }

               if (var5 == null) {
                  String var6 = this.resolveImageGroupMemberRootPath(var1, var2);
                  if (!var6.equals(var2)) {
                     if (this.equalsNullable(var6, var1.animationPreviewTargetId)) {
                        var5 = var1.animationPreviewAppliedBounds;
                     }

                     if (var5 == null) {
                        var5 = (EditorRect)var1.previewExtraAppliedBoundsByTarget.get(var6);
                     }
                  }
               }

               return var5 == null ? null : new EditorRect(var5.x, var5.y, var5.width, var5.height);
            }
         }
      }
   }

   public EditorRect resolveTimelineGroupLiveOutlineBoundsFromElements(EditorSession var1, String var2) {
      if ((-294667613 * -294667613 + -294667613 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var1.elements != null && !var1.elements.isEmpty()) {
         EditorRect var3 = null;
         String var4 = Xqedii_hg29zr5s4nbv(var2);

         for (HoverElement var6 : var1.elements) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167279122, 13)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(930025968, 3)] = var6 == null ? null : var6.targetPath;
            String var7 = this.firstNonBlank(var10001);
            if (!var7.isBlank() && var7.startsWith(var4) && this.isImageGroupMemberPath(var1, var2, var7)) {
               var3 = this.mergeBounds(var3, this.getElementBounds(var6));
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   public EditorRect getTargetBounds(EditorSession var1, String var2) {
      if ((1008080398 * (1008080398 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.resolveInheritedTargetRootPath(var1, var2);
         boolean var4 = this.shouldLogAnimationOutlineDebug(var1, var2, var3);
         EditorRect var5 = null;

         for (HoverElement var7 : this.findTargetElements(var1, var2)) {
            var5 = this.mergeBounds(var5, this.getElementBounds(var7));
         }

         int var12 = var1 != null && var1.activeTool == EditorTool.ANIMATION && var1.animationTimelinePanelVisible
            ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(583639561, 12)
            : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 12);
         if (var12 != 0) {
            EditorRect var13 = this.resolveTimelineLiveOutlineBoundsForTarget(var1, var2);
            if (var13 != null) {
               this.logAnimationOutlineBoundsSource(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("xE+LIw4Y9QqpintQ4BWHzFIY2I5ELJBYKCyFbs7h+n0/SQIjKQX9tWJDc22QPW9foDyyQXxLY+NQ6rcmuMhBPQxBgsAvTA=="),
                  var13
               );
               return var13;
            }

            EditorRect var8 = this.resolveTimelineGroupLogicalBounds(var1, var2);
            if (var8 != null) {
               this.logAnimationOutlineBoundsSource(
                  var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("g6RuCnv+/8kk/ffFOLeV+ye9gwUJzVDJSrIKNEhTGTXSNujfT6bjIZDEyvf+O0QSc1ypIK0p1eNyBg7I"), var8
               );
               return var8;
            }

            EditorRect var9 = this.resolveTimelineOutlinePreviewLogicalFallback(var1, var2);
            if (var9 != null) {
               if (var4) {
                  this.logAnimationOutlineDebug(
                     var1,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BSsLw6CM9kXY/DsQMmWUyQtlgpsBUCrv4KBk8bJu2vQxMoxK81BkQ2677IYnhF6woANWWsKpQ64IMhxamJsiqItIHIoZoGRp1qA="),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                        "rBRKmAcOWeiEXHh3DsNe8D7RDhg6lQbD/tjjnWeZ3iPMfKGu7USMn77POUzAq9magAxRNbgjuDCUTJ7JhGv2bCXE8T9hFwhzb2IykA=="
                     ),
                     var2,
                     var9,
                     var9,
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-2070196352554496533L, 12)),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6904469749384645997L, 28)),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(4631590133438436331L, 3)),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855812288L, 14))
                  );
               }

               this.logAnimationOutlineBoundsSource(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "rBRKmAcOWeiEXHh3DsNe8D7RDhg6lQbD/tjjnWeZ3iPMfKGu7USMn77POUzAq9magAxRNbgjuDCUTJ7JhGv2bCXE8T9hFwhzb2IykA=="
                  ),
                  var9
               );
               return var9;
            }

            if (var4) {
               this.logAnimationOutlineDebug(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BSsLw6CM9kXY/DsQMmWUyQtlgpsBUCrv4KBk8bJu2vQxMoxK81BkQ2677IYnhF6woANWWsKpQ64IMhxamJsiqItIHIoZoGRp1qA="),
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("UNpbyJqtGzGXjDBvohLzgdP22AJWk7Z79chlCqkDlOhgz3vj7HmaZpSeta/c+xbH6MHGY7/Kf6hsUnKsVXvokYja"),
                  var2,
                  var5,
                  null,
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-2067944552740813333L, 0)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554638670776563006L, 40)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7268095534742261899L, 45)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554637020838032702L, 43))
               );
            }

            if (var5 != null) {
               if (var4) {
                  this.logAnimationOutlineDebug(
                     var1,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BSsLw6CM9kXY/DsQMmWUyQtlgpsBUCrv4KBk8bJu2vQxMoxK81BkQ2677IYnhF6woANWWsKpQ64IMhxamJsiqItIHIoZoGRp1qA="),
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Qqe1Apc1UY9OPO5uhysODs9mTPZkdlvrQelUEjdt3E36ETYYiLUMQEa8xQ3SpNTFX1i56ATs9LpRRg=="),
                     var2,
                     var5,
                     null,
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175688596293099L, 33)),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175701484340715L, 35)),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-1562595805369048707L, 21)),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(79616460044193709L, 5))
                  );
               }

               this.logAnimationOutlineBoundsSource(
                  var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Qqe1Apc1UY9OPO5uhysODs9mTPZkdlvrQelUEjdt3E36ETYYiLUMQEa8xQ3SpNTFX1i56ATs9LpRRg=="), var5
               );
               return var5;
            }
         }

         if (var3 != null && !var3.isBlank()) {
            if (var12 == 0) {
               EditorRect var14 = this.resolveTimelineGroupPreviewOutlineBounds(var1, var2);
               if (var14 != null) {
                  if (var4) {
                     EditorRect var18 = this.resolveTimelineGroupPreviewLogicalBounds(var1, var2);
                     if (var18 == null && var3 != null && !var3.isBlank()) {
                        var18 = this.resolveTimelineGroupPreviewLogicalBounds(var1, var3);
                     }

                     this.logAnimationOutlineDebug(
                        var1,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                           "BSsLw6CM9kXY/DsQMmWUyQtlgpsBUCrv4KBk8bJu2vQxMoxK81BkQ2677IYnhF6woANWWsKpQ64IMhxamJsiqItIHIoZoGRp1qA="
                        ),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("E+an6bJBqVume+xp2kA2eFEVXQGpp2auABpwqWs/6sU9l8bI4W0t62KthahcuXlp3jhiQrJ/rHjvCw=="),
                        var2,
                        var14,
                        var18,
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300281322L, 13)),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300309987L, 16)),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-5932372985754497007L, 17)),
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6581998102200557603L, 18))
                     );
                  }

                  this.logAnimationOutlineBoundsSource(
                     var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("E+an6bJBqVume+xp2kA2eFEVXQGpp2auABpwqWs/6sU9l8bI4W0t62KthahcuXlp3jhiQrJ/rHjvCw=="), var14
                  );
                  return var14;
               }
            }

            EditorRect var15 = this.resolveGroupRootBoundsFromRaw(var1, var3);
            if (var15 != null) {
               this.logAnimationOutlineBoundsSource(
                  var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qP5RyGbMY0zbIK6P+VMr33SCACpY3uizF3mdLr55ZUSn8MfiMmL4jk+lIllvNkeGymE4NYU+WRt9Dhbv"), var15
               );
               return var15;
            }

            EditorRect var17 = null;
            if (var1 != null && var1.elements != null) {
               for (HoverElement var10 : var1.elements) {
                  String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1971221464, 26)];
                  var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609826369, 9)] = var10 == null ? null : var10.targetPath;
                  String var11 = this.firstNonBlank(var10001);
                  if (!var11.isBlank() && this.isImageGroupMemberPath(var1, var3, var11)) {
                     var17 = this.mergeBounds(var17, this.getElementBounds(var10));
                  }
               }
            }

            if (var17 != null) {
               this.logAnimationOutlineBoundsSource(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mFOzYnIyrSXQ4Wa1VWQKBQtANyLxoaewlzpqtxmM7jTrRt2Dy2JimsVe2hxhtCj4xdVcyTjbuOHixVXhwu2rgA=="),
                  var17
               );
               return var17;
            }

            EditorRect var20 = this.resolveTargetBoundsFromRawByPathPrefix(var1, var3);
            if (var20 != null) {
               this.logAnimationOutlineBoundsSource(
                  var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("NM8j4rPC0scMLtmx78/M8fpOWjM3GwoIRDCEabOBdtUKE5lFxvG8o9tX1KwkyC8BULrhZV9v"), var20
               );
               return var20;
            }
         }

         if (var5 != null) {
            this.logAnimationOutlineBoundsSource(
               var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Qqe1Apc1UY9OPO5uhysODs9mTPZkdlvrQelUEjdt3E36ETYYiLUMQEa8xQ3SpNTFX1i56ATs9LpRRg=="), var5
            );
            return var5;
         } else {
            EditorRect var16 = this.resolveTargetBoundsFromRaw(var1, var2);
            this.logAnimationOutlineBoundsSource(
               var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("tUbU3fL6qqp8DzGmZ8BtGwQs2Cy4nm4f9GqKhC8Ed1Vy/aSBL9opB7IrmmmWaBX0"), var16
            );
            return var16;
         }
      }
   }

   public EditorRect resolveGroupRootBoundsFromRaw(EditorSession var1, String var2) {
      if ((1307006019 * (1307006019 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Map var3 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         if (var3 != null && !var3.isEmpty() && this.isImageGroupRoot(var3)) {
            double var4 = this.readMapPathDouble(
               var3,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
               this.readMapPathDouble(
                  var3,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7729777174092056043L, 60))
               )
            );
            double var6 = this.readMapPathDouble(
               var3,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
               this.readMapPathDouble(
                  var3,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7268095534742261899L, 45))
               )
            );
            if (Double.isFinite(var4)
               && Double.isFinite(var6)
               && !(var4 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 19)))
               && !(var6 <= Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6337803455752553307L, 26)))) {
               double var8 = Math.abs(var4);
               double var10 = Math.abs(var6);
               Vector var12 = this.resolveParentAbsoluteOffset(var1, var2);
               double var13 = this.readMapPathDouble(
                  var3,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                  this.readMapPathDouble(
                     var3,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6123259289691486771L, 49))
                  )
               );
               double var15 = this.readMapPathDouble(
                  var3,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                  this.readMapPathDouble(
                     var3,
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                     Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 25))
                  )
               );
               double var17 = var12.getX() + var13;
               double var19 = var12.getY() + var15;
               return new EditorRect(var17, var19, var8, var10);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public EditorRect resolveTargetBoundsFromRaw(EditorSession var1, String var2) {
      if ((-1373696668 ^ -1373696668) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var1.renderBlocks != null && !var1.renderBlocks.isEmpty()) {
         EditorRect var3 = null;

         for (Map var5 : var1.renderBlocks) {
            if (var5 != null && !var5.isEmpty()) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(273225293, 31)];
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1997005897, 18)] = this.stringValue(
                  this.readMapPathValue(
                     var5, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("tTZOK2iGig75Q0PwHscFlR9FbLabxADCtF+6tRIUBYIum3SVUAJpU/lHGJkaHngS1hTkwROjNxRLHfzwxsSu6g==")
                  )
               );
               String var6 = this.firstNonBlank(var10001);
               if (var2.equals(var6)) {
                  var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-130584815, 27)];
                  var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 24)] = this.stringValue(
                     this.readMapPathValue(
                        var5,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                     )
                  );
                  String var7 = this.firstNonBlank(var10001);
                  if (!var7.isBlank()) {
                     Map var8 = this.resolveRawMapAtPath(var1.rawBlocks, var7);
                     if (var8 != null && !var8.isEmpty()) {
                        double var9 = this.readMapPathDouble(
                           var8,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                           this.readMapPathDouble(
                              var8,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 34))
                           )
                        );
                        double var11 = this.readMapPathDouble(
                           var8,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                           this.readMapPathDouble(
                              var8,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3027235154489249578L, 24))
                           )
                        );
                        Vector var13 = this.resolveParentAbsoluteOffset(var1, var7);
                        var9 += var13.getX();
                        var11 += var13.getY();
                        double var14 = this.readMapPathDouble(
                           var8,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                           this.readMapPathDouble(
                              var8,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                              this.readMapPathDouble(
                                 var8,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PUc7+WMHBNFNCvD8WyYhOZ//FaEVQvJxXJOKZHb9qKwWJTkDxvT9hovGRkjqnJ9s8zQ="),
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7171207674995803627L, 56))
                              )
                           )
                        );
                        double var16 = this.readMapPathDouble(
                           var8,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                           this.readMapPathDouble(
                              var8,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                              this.readMapPathDouble(
                                 var8,
                                 Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("cHiYPt1N7OVAhECZ9NrL/Vr0P3lBEHaouX6u7pdke+Y5aqQnp0M0fKHMFENAzveyPNe4cA=="),
                                 Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175271849199083L, 39))
                              )
                           )
                        );
                        double var18 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(8306097188907124011L, 8)), Math.abs(var14));
                        double var20 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684283516395L, 26)), Math.abs(var16));
                        var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903064024, 19)];
                        var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(601911006, 20)] = this.stringValue(
                           this.readMapPathValue(var8, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
                        );
                        var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(-243371048, 31)] = this.stringValue(
                           this.readMapPathValue(var5, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
                        );
                        String var22 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                        if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL").equals(var22)) {
                           double var23 = Math.max(
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117941142846L, 29)),
                              var20 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-1455174595884184221L, 50))
                           );
                           var11 += var20 - var23;
                           var20 = var23;
                        }

                        var3 = this.mergeBounds(var3, new EditorRect(var9, var11, var18, var20));
                     }
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   public EditorRect resolveTargetBoundsFromRawByPathPrefix(EditorSession var1, String var2) {
      if ((1988397907 * 1988397907 - 1988397907 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var1.renderBlocks != null && !var1.renderBlocks.isEmpty()) {
         EditorRect var3 = null;

         for (Map var5 : var1.renderBlocks) {
            if (var5 != null && !var5.isEmpty()) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112601, 0)];
               var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10)] = this.stringValue(
                  this.readMapPathValue(
                     var5, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                  )
               );
               String var6 = this.firstNonBlank(var10001);
               if (!var6.isBlank() && this.isImageGroupMemberPath(var1, var2, var6)) {
                  Map var7 = this.resolveRawMapAtPath(var1.rawBlocks, var6);
                  if (var7 != null && !var7.isEmpty()) {
                     double var8 = this.readMapPathDouble(
                        var7,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RmIizOUiEzXiQvRNjzwxNuDPIdfqqkxY/VErE2pBD6FcVonqMA9EkHQ7SSizRzKx"),
                        this.readMapPathDouble(
                           var7,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG"),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 4))
                        )
                     );
                     double var10 = this.readMapPathDouble(
                        var7,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ikKBx4ARLCMm2c99thUiAuWiqbOtc0IpnuJ9fEEIMMZI9cINsAmUasf41g1muD1C"),
                        this.readMapPathDouble(
                           var7,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2eH9zqWKxy1on19rickmvhkqox07H4YVi1IMs48A"),
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6354157903596760678L, 52))
                        )
                     );
                     Vector var12 = this.resolveParentAbsoluteOffset(var1, var6);
                     var8 += var12.getX();
                     var10 += var12.getY();
                     double var13 = this.readMapPathDouble(
                        var7,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                        this.readMapPathDouble(
                           var7,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="),
                           this.readMapPathDouble(
                              var7,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PUc7+WMHBNFNCvD8WyYhOZ//FaEVQvJxXJOKZHb9qKwWJTkDxvT9hovGRkjqnJ9s8zQ="),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175271849199083L, 39))
                           )
                        )
                     );
                     double var15 = this.readMapPathDouble(
                        var7,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                        this.readMapPathDouble(
                           var7,
                           Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="),
                           this.readMapPathDouble(
                              var7,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("cHiYPt1N7OVAhECZ9NrL/Vr0P3lBEHaouX6u7pdke+Y5aqQnp0M0fKHMFENAzveyPNe4cA=="),
                              Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(4768629714287982505L, 31))
                           )
                        )
                     );
                     double var17 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7441406060451988955L, 6)), Math.abs(var13));
                     double var19 = Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-2966186492877264896L, 16)), Math.abs(var15));
                     var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022703547, 14)];
                     var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303940090, 8)] = this.stringValue(
                        this.readMapPathValue(var7, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
                     );
                     var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 25)] = this.stringValue(
                        this.readMapPathValue(var5, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa"))
                     );
                     String var21 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                     if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bY/vJpcC/ChLR13AeOvk7/ss6t9Q8Yh3/XPbt4gu4GfLXHxL").equals(var21)) {
                        double var22 = Math.max(
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175680009504235L, 34)),
                           var19 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-6316650205553223135L, 7))
                        );
                        var10 += var19 - var22;
                        var19 = var22;
                     }

                     var3 = this.mergeBounds(var3, new EditorRect(var8, var10, var17, var19));
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   public EditorRect getSelectedBounds(EditorSession var1) {
      if ((-155762078 * -155762078 + -155762078 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorRect var2 = null;
         String var3 = null;

         for (String var5 : this.getSelectedTargetIds(var1)) {
            EditorRect var6 = this.getTargetBounds(var1, var5);
            if (var3 == null && var5 != null && !var5.isBlank()) {
               var3 = var5;
            }

            this.logAnimationOutlineBoundsSource(
               var1, var5, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("i0me58Bjwa9eD1VCQntVQ8DKDBuFR5uS1ADYaAozBofO2SrsFl31Xos0r5UvXF59ZL9z4dapL2W57w=="), var6
            );
            var2 = this.mergeBounds(var2, var6);
         }

         String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164952, 2)];
         var10003[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1692364244, 24)] = var3;
         this.logAnimationOutlineBoundsSource(
            var1,
            this.firstNonBlank(var10003),
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("pGDJT6cD6LtGyN+GVnb/XmSySjy/NaQ3dPPId7Cpt5U3OlsPPr0HOpnxywCUJDfW3NIt2t9zjD8+cA=="),
            var2
         );
         return var2;
      }
   }

   public void showSelectionOverlay(Player var1, EditorSession var2) {
      if ((698550473 * 698550473 + 698550473 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         var2.selectionOutlineVisible = (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198288, 7) != 0);
         this.renderSelectionOverlay(var1, var2);
      }
   }

   public void hideSelectionOverlay(Player var1, EditorSession var2) {
      if ((-903726077 * (-903726077 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         var2.selectionOutlineVisible = (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1219652738, 10) != 0);
         this.clearEditorOverlaysOnly(var1, var2);
      }
   }

   public void renderSelectionOverlay(Player var1, EditorSession var2) {
      if (((1652658669 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var2.selectionOutlineVisible) {
         EditorRect var3 = this.getSelectedBounds(var2);
         if (var3 == null) {
            this.clearAnimationPreviewMotionPath(var1, var2);
         } else {
            var2.handleCenters.clear();
            double var4 = this.toRenderX(var2, var3.x);
            double var6 = this.toRenderY(var2, var3.y);
            double var8 = this.toRenderSize(var2, var3.width);
            double var10 = this.toRenderSize(var2, var3.height);
            if (this.hasSelectedImageGroupTarget(var2)) {
               EditorRect var12 = this.resolveGroupVisualBoundsFromElements(var2);
               if (var12 != null) {
                  var4 = this.toRenderX(var2, var12.x);
                  var6 = this.toRenderY(var2, var12.y);
                  var8 = this.toRenderSize(var2, var12.width);
                  var10 = this.toRenderSize(var2, var12.height);
               }
            }

            String var25 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2fCvYocmNVBPKiZsEwyc4hL/dZeey1MjSyU9Bw==");
            boolean var13 = false;
            if (var2.activeTool == EditorTool.ANIMATION && var2.animationTimelinePanelVisible) {
               String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607879155, 9)];
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1203822012, 21)] = this.resolveTimelineEditableTargetId(var2);
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-522339257, 29)] = var2.selectedElementId;
               var25 = this.firstNonBlank(var10001);
               String var14 = this.resolveInheritedTargetRootPath(var2, var25);
               var13 = this.shouldLogAnimationOutlineDebug(var2, var25, var14);
               if (var13) {
                  EditorRect var15 = null;
                  if (this.equalsNullable(var25, var2.animationPreviewTargetId)) {
                     var15 = var2.animationPreviewAppliedBounds;
                  }

                  if (var15 == null) {
                     var15 = (EditorRect)var2.previewExtraAppliedBoundsByTarget.get(var25);
                  }

                  int var16 = var15 == null
                        || !(Math.abs(var3.width - var15.width) > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(2802617352728606301L, 29)))
                           && !(Math.abs(var3.height - var15.height) > Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(5641736439319337049L, 32)))
                     ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10)
                     : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303939834, 8);
                  if (var16 != 0) {
                     this.logAnimationOutlineDebug(
                        var2,
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                           "h3DivqP18kUZXRNjDvyobF2qI35HH8mdG+tEPuQj4QlcK0xDNqCkVwa78dZstp150UJzptjwGWzxfqsorO2rzABzbqA8YIF6Iho="
                        ),
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                           "zSrbSkWcnSsHoCYUB97qLpwWHWj/3fyLbTmKe6DQA/2VlHn9/v0fIHWvPZsKB2AL9lv0O8a6jxGHT5VJWBTrGRKszjtRZcIns8C3Ibr0swcu6i0u"
                        ),
                        var25,
                        var3,
                        var15,
                        var4,
                        var6,
                        var8,
                        var10
                     );
                  }
               }
            }

            double var26 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-255949390165965388L, 7));
            double var27 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8627534256286266686L, 58));
            String var18 = this.resolveSelectionOutlineColor(var2);
            boolean var19 = this.hasSelectedImageGroupTarget(var2);
            int var20 = !var19 && this.shouldFreezeOverlaySide(var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("iL8dAGBEG93+h4kLkEwsuFY+WTow9Sojn9l/4sZZ+dSD1w=="))
               ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(830370776, 30)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 4);
            int var21 = !var19
                  && this.shouldFreezeOverlaySide(var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("J5OD+IooIXvMi5IytLEBpA2jXVnhf7FZYBmtC1aOtzu4Yi4Fbmyhsw=="))
               ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904113624, 10)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 8);
            int var22 = !var19 && this.shouldFreezeOverlaySide(var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("5K/fapfjTRo0daC/wy+KluwIrDGejVO5suKwhU7C4Jd1zluk"))
               ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1092901172, 1)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 10);
            int var23 = !var19
                  && this.shouldFreezeOverlaySide(var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0zyXKY/xq2czzP6x4KmMCM6Zg77BvO4uguVVpbOZyZyZfbDQ2/Q="))
               ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1167279122, 13)
               : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 20);
            if (var20 == 0) {
               this.addOverlayBar(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("M97JNh5Zjf4E1HTgO41f/oLWYLyqlvqsuaAGR7ELTi/DFGtTeVH2bkfboSHJKVn1"),
                  var4 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-765748983288797527L, 58)),
                  var6
                     - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(7954621287170270429L, 61))
                     + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639126135371070L, 35)),
                  var8 + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639049002120510L, 38)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6332297290645613181L, 0)),
                  var26,
                  var18
               );
            }

            if (var21 == 0) {
               this.addOverlayBar(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("88ziweV7CjFAUGh6wBLdZ5Nu8iSN3BxaXJrpisOPewIzbovY+5P0G3fF7u+zx7bd1ygvhVR9"),
                  var4 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(3841477006929346467L, 45)),
                  var6 + var10,
                  var8 + Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(9073152958914195046L, 13)),
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7682954013858692934L, 46)),
                  var26,
                  var18
               );
            }

            if (var22 == 0) {
               this.addOverlayBar(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("QUswJ9BN6DkasklTSDJjtNas4fsnVDC3B33hFMKpcUSIK+l0iAgYRjufchi+N5ebLwU="),
                  var4 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117922989374L, 28)),
                  var6,
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639100659168574L, 36)),
                  var10,
                  var26,
                  var18
               );
            }

            if (var23 == 0) {
               this.addOverlayBar(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("WMK5NhunA+cTzogZAjfmqcM5F5RltmQN8PMz6WJhpsCkI4xaKhtNAv5PYZFXmBEuFfb2tA=="),
                  var4 + var8,
                  var6,
                  Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-7168271130737900055L, 2)),
                  var10,
                  var26,
                  var18
               );
            }

            if (var13) {
               this.logAnimationOutlineLineHeights(var2, var25, (var20 != 0), (var21 != 0), (var22 != 0), (var23 != 0), var10);
               this.logAnimationSelectionOverlayHudHeights(var1, var2, var25);
               this.logAnimationTargetOutlineHudHeights(var1, var2, var25);
            }

            this.renderAnimationPreviewMotionPath(var1, var2);
            if (!this.isEffectiveScaleTool(var2)) {
               this.clearHandleOverlays(var1, var2);
            } else {
               String var24 = this.resolveSelectionHandleColor(var2);
               this.addHandle(var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw="), var4, var6, var27, var24);
               this.addHandle(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("dwPmh5p1Np0ePnoR+jj8WwCr7s5vzkVooNw6ZtSF"),
                  var4 + var8 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-4637804574974010662L, 29)),
                  var6,
                  var27,
                  var24
               );
               this.addHandle(var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0="), var4 + var8, var6, var27, var24);
               this.addHandle(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ujDWiVo1I0hCGh4H8kgva3DXqMOz8YV7Au21Aax6"),
                  var4,
                  var6 + var10 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-4252571634784159012L, 6)),
                  var27,
                  var24
               );
               this.addHandle(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/74s3wCxJXnV7/75LZAinDvaAm7Gjnj8TR15T0/n"),
                  var4 + var8,
                  var6 + var10 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175134544463339L, 41)),
                  var27,
                  var24
               );
               this.addHandle(var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY="), var4, var6 + var10, var27, var24);
               this.addHandle(
                  var1,
                  var2,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ucDvW3k84iQNWTef9dnwjHxUOtLTiit7/stKE3vd"),
                  var4 + var8 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814718L, 10)),
                  var6 + var10,
                  var27,
                  var24
               );
               this.addHandle(
                  var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k="), var4 + var8, var6 + var10, var27, var24
               );
               this.addMoveCenterHandle(
                  var1,
                  var2,
                  var4 + var8 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-600876311762323063L, 15)),
                  var6 + var10 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855806782L, 15)),
                  var27,
                  var24
               );
               this.updateHandleHover(var1, var2, var2.hoveredHandle);
            }
         }
      } else {
         this.clearAnimationPreviewMotionPath(var1, var2);
      }
   }

   public boolean shouldFreezeOverlaySide(EditorSession var1, String var2) {
      if ((784271346 * (784271346 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.activeHandle == null) {
         return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(520320753, 23) != 0);
      } else if (this.hasSelectedItemDisplayBlock(var1)) {
         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198416, 7) != 0);
      } else {
         String var3 = var1.activeHandle;
         int var4 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1301301527, 23);
         switch (var3.hashCode()) {
            case 101:
               if (var3.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/74s3wCxJXnV7/75LZAinDvaAm7Gjnj8TR15T0/n"))) {
                  var4 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(302528367, 19);
               }
               break;
            case 110:
               if (var3.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("dwPmh5p1Np0ePnoR+jj8WwCr7s5vzkVooNw6ZtSF"))) {
                  var4 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 30);
               }
               break;
            case 115:
               if (var3.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ucDvW3k84iQNWTef9dnwjHxUOtLTiit7/stKE3vd"))) {
                  var4 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2010871002, 30);
               }
               break;
            case 119:
               if (var3.equals(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ujDWiVo1I0hCGh4H8kgva3DXqMOz8YV7Au21Aax6"))) {
                  var4 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1092901170, 1);
               }
         }
         return (switch (var4) {
            case 0 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("J5OD+IooIXvMi5IytLEBpA2jXVnhf7FZYBmtC1aOtzu4Yi4Fbmyhsw==").equals(var2);
            case 1 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("iL8dAGBEG93+h4kLkEwsuFY+WTow9Sojn9l/4sZZ+dSD1w==").equals(var2);
            case 2 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0zyXKY/xq2czzP6x4KmMCM6Zg77BvO4uguVVpbOZyZyZfbDQ2/Q=").equals(var2);
            case 3 -> Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("5K/fapfjTRo0daC/wy+KluwIrDGejVO5suKwhU7C4Jd1zluk").equals(var2);
            default -> (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 30) != 0);
         });
      }
   }

   public boolean hasSelectedItemDisplayBlock(EditorSession var1) {
      if ((1206668520 * (1206668520 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 17) != 0);
      } else {
         for (String var3 : this.getSelectedTargetIds(var1)) {
            for (HoverElement var5 : this.findTargetElements(var1, var3)) {
               if (var5 != null && var5.itemDisplayBlock) {
                  return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 22) != 0);
               }
            }
         }

         return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(374181961, 15) != 0);
      }
   }

   public void restoreHandlesOnly(Player var1, EditorSession var2) {
      if ((791136526 * 791136526 + 791136526 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.isEffectiveScaleTool(var2)) {
         this.clearHandleOverlays(var1, var2);
      } else {
         EditorRect var3 = this.getSelectedBounds(var2);
         if (var3 != null) {
            var2.handleCenters.clear();
            double var4 = this.toRenderX(var2, var3.x);
            double var6 = this.toRenderY(var2, var3.y);
            double var8 = this.toRenderSize(var2, var3.width);
            double var10 = this.toRenderSize(var2, var3.height);
            if (this.hasSelectedImageGroupTarget(var2)) {
               EditorRect var12 = this.resolveGroupVisualBoundsFromElements(var2);
               if (var12 != null) {
                  var4 = this.toRenderX(var2, var12.x);
                  var6 = this.toRenderY(var2, var12.y);
                  var8 = this.toRenderSize(var2, var12.width);
                  var10 = this.toRenderSize(var2, var12.height);
               }
            }

            double var15 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554656505554859326L, 46));
            String var14 = this.resolveSelectionHandleColor(var2);
            this.addHandle(var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/1IchlJ8ZPIZVccKyyuMJh/W92PB1dG0w3g9o7Xvglw="), var4, var6, var15, var14);
            this.addHandle(
               var1,
               var2,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("dwPmh5p1Np0ePnoR+jj8WwCr7s5vzkVooNw6ZtSF"),
               var4 + var8 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-5923271735488975717L, 58)),
               var6,
               var15,
               var14
            );
            this.addHandle(var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ERonQt6vFKvSLBmjDSbgPE0sT+FzG7j6GWKFJ/FxKC0="), var4 + var8, var6, var15, var14);
            this.addHandle(
               var1,
               var2,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ujDWiVo1I0hCGh4H8kgva3DXqMOz8YV7Au21Aax6"),
               var4,
               var6 + var10 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153386790532810219L, 48)),
               var15,
               var14
            );
            this.addHandle(
               var1,
               var2,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/74s3wCxJXnV7/75LZAinDvaAm7Gjnj8TR15T0/n"),
               var4 + var8,
               var6 + var10 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175615580800491L, 38)),
               var15,
               var14
            );
            this.addHandle(var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IbUumyWpWiVSUexNGGuEHYQ1STExUFA3asRe1PB1saY="), var4, var6 + var10, var15, var14);
            this.addHandle(
               var1,
               var2,
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ucDvW3k84iQNWTef9dnwjHxUOtLTiit7/stKE3vd"),
               var4 + var8 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6900459487382383093L, 2)),
               var6 + var10,
               var15,
               var14
            );
            this.addHandle(
               var1, var2, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e1HQNOm9oC28C02ehu+VNrEMPu9azmQYFBdH70Z5X7k="), var4 + var8, var6 + var10, var15, var14
            );
            this.addMoveCenterHandle(
               var1,
               var2,
               var4 + var8 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554630321762792766L, 45)),
               var6 + var10 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-6250383221478290953L, 23)),
               var15,
               var14
            );
            this.updateHandleHover(var1, var2, var2.hoveredHandle);
         }
      }
   }

   public String resolveSelectionOutlineColor(EditorSession var1) {
      if ((2113457112 * 2113457112 - 2113457112 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw==");
      } else {
         int var2 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2118420337, 30);
         int var3 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(930025968, 3);
         int var4 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(300955503, 19);

         for (String var6 : this.getSelectedTargetIds(var1)) {
            if (var6 != null && !var6.isBlank()) {
               boolean var7 = this.isTargetVisible(var1, var6);
               boolean var8 = this.isTargetLocked(var1, var6);
               if (!var7 && var8) {
                  var4 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2010871002, 30);
                  break;
               }

               if (!var7) {
                  var2 = Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904108504, 12);
               }

               if (var8) {
                  var3 = Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198288, 7);
               }
            }
         }

         if (var4 != 0) {
            return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("MUGh2ZI1E9W7kDvQeF3HeGQiaNpeNQq/Zy8QO4FOiZbKKkSpYZGx1lQ/4liliQ==");
         } else if (var2 != 0) {
            return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Ei4RwqJU1TNJbJY+PFgFC4xIRPKsO/wHVsP0ZEzv142ZsAB9Jxx6Xm/r5UH6ug==");
         } else {
            return var3 != 0
               ? Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RV3KNGSOTBi9F/msv4hU/TudR4h3z263EqP5W5temSkwYLavOvBU4v6PpLK9BQ==")
               : Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw==");
         }
      }
   }

   public void refreshSelectionOutlineColorOnly(Player var1, EditorSession var2) {
      if ((342789889 * 342789889 - 342789889 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.selectionOutlineVisible && var2.selectedElementId != null) {
         String var3 = this.resolveSelectionOutlineColor(var2);
         this.recolorExistingOutlineHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("M97JNh5Zjf4E1HTgO41f/oLWYLyqlvqsuaAGR7ELTi/DFGtTeVH2bkfboSHJKVn1"), var3);
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("88ziweV7CjFAUGh6wBLdZ5Nu8iSN3BxaXJrpisOPewIzbovY+5P0G3fF7u+zx7bd1ygvhVR9"), var3
         );
         this.recolorExistingOutlineHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("QUswJ9BN6DkasklTSDJjtNas4fsnVDC3B33hFMKpcUSIK+l0iAgYRjufchi+N5ebLwU="), var3);
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("WMK5NhunA+cTzogZAjfmqcM5F5RltmQN8PMz6WJhpsCkI4xaKhtNAv5PYZFXmBEuFfb2tA=="), var3
         );
         String var4 = this.resolveSelectionHandleColor(var2);
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("hpPHiSLvZJVUaNegDZaoEfMloRteFjb9MMFahhN95aowuKGFBUeHvCmyos+cmYxunJKfIVimR5HdLkm5"), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("3bnxYB50/qz0gFlxtzhPAQTFEHTBmMwV99yb789VaYQUCroQO4A6auhH8B2X238VjSaYi/vij7vUfQ=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("i4ZYdGQDiq1DCrbw5p7MkIXeVUK2qEn3PPktO9pV9eear1EasA5XVHIQQwl73iajQ5gGKjaEDhXsyncE"), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PbvTVjVEh2G7g5wHfngcIVmNq2ybvAcBAF64kgd/ZUidAL0zJ0FU1UnjrMElh4QWGDNwfgb2tFuINA=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("hos51K/AqA910gOOE4FBB2EzgojxLuUJtV+Wz6LiyqN/NFEtblUTp+sCg7ctL6Me9JHR2Q1+N0pjWw=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CG2FIy/uRcEOrP8eT1t8ZU48uU0a6eO+XvplyimLJXfZ0CgRu7jH8nYCewARRvnFmFgB8PcAWI3xRjtU"), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ROKrXNQWSCIQde+Ztikw0NtoPgZToMLvuR2Tdgb9pvTE/eVfH3CagJESQ6+CVYMRMijVwomqTmeZ8A=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("6h8uB5wwRTWolnYOCpLLY/aXnlExBQbyaBRfhUMiptUgXUeG55S/8mspsL1GFa6aFtKMnyswuH+6hyf1"), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CCiXhMNOl9cvMaICVG8PCQI7O969K4L6LG2mBuCWyxhifhcjeLaVrLh+HPHDjGObATliQCnordisbclRSxbx3uxAcnwEyQ=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y7cL/PK8YyoHPpIbYZKjqoCsBdeWJ6gE1onU550JbCAR4KHgRP1jjq/n2UqvtkyO1TTkAxyCJWUW2JsDjqLcBrNRebTrQw=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AJLoetpVugmWOnlVU+lpMrvSsh0Wi1/Y/coHHEtGBvfYgjqvg7AxuRJ97rKsYcmw9vozokllr44DJ8DhuMh8iBUUC1CdWQ=="), var4
         );
         this.recolorExistingOutlineHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qtitruonUYY75uZOUzGRSEV+gYuPi8Uo8rf+Ltz1S9yWHiEM+L4f2mQu4gWXjgoJW7D84xrWuSnJBNZKHb7Wc0PVyKsWnQ=="), var4
         );
      }
   }

   public String resolveSelectionHandleColor(EditorSession var1) {
      if ((305555226 ^ 305555226) != 0) {
         throw new IllegalStateException();
      } else {
         return this.resolveSelectionOutlineColor(var1);
      }
   }

   public String resolveSelectionHandleHoverColor(EditorSession var1) {
      if ((615373836 * 615373836 + 615373836 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.adjustHexColor(
            this.resolveSelectionHandleColor(var1), Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-2555439252954997489L, 51))
         );
      }
   }

   public String adjustHexColor(String var1, double var2) {
      if ((487143739 ^ 487143739) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-938980339, 28)];
         var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607880179, 9)] = var1;
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903064024, 20)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw=="
         );
         String var4 = this.firstNonBlank(var10001).trim();
         if (var4.startsWith(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("n/B9Y0suZ+7uIMNhR0gam58BEfZk3+b8FUViopf0hHE="))
            && var4.length() >= Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2010871004, 30)
            && var4.charAt(Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112604, 31)) == Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1860052928, 4)) {
            String var5 = var4.substring(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748232850, 16), Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2118420335, 30));
            int var6 = Integer.parseInt(
               var5.substring(Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 6), Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(1476938765, 31)),
               Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149725823, 6)
            );
            int var7 = Integer.parseInt(
               var5.substring(Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544867, 4), Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-303939066, 8)),
               Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(618688222, 20)
            );
            int var8 = Integer.parseInt(
               var5.substring(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(667427979, 22), Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1960359900, 14)),
               Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-972534771, 25)
            );
            double var9 = Math.max(
               Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 21)),
               Math.min(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6581998102200492035L, 18)), var2)
            );
            var6 = this.clampColor((int)Math.round(var6 + (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(839928086, 23) - var6) * var9));
            var7 = this.clampColor((int)Math.round(var7 + (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-410498035, 22) - var7) * var9));
            var8 = this.clampColor((int)Math.round(var8 + (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(869297886, 20) - var8) * var9));
            String var10000 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/kOzP7AKFCJTv/D5vCZX0jBlip4q/7HXYWOpsJLz5o2oUw9jjsJNGtIecFCc9SE2vaGeus/zrSSQ5A==");
            Object[] var15 = new Object[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(302528367, 19)];
            var15[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 14)] = var6;
            var15[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2114837444, 25)] = var7;
            var15[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1210354470, 30)] = var8;
            return String.format(var10000, var15);
         } else {
            var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1226198160, 7)];
            var10001[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 24)] = var1;
            var10001[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609825857, 9)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw=="
            );
            return this.firstNonBlank(var10001);
         }
      }
   }

   public void recolorExistingOutlineHud(Player var1, String var2, String var3) {
      if ((369776338 * (369776338 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Entity var4 = this.hudService.getHud(var1, var2);
         if (var4 != null) {
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1044678513, 30)];
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 16)] = this.hudService.getHudText(var4, null);
            String var5 = this.firstNonBlank(var10001);
            String[] var10003 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903850456, 17)];
            var10003[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 11)] = var3;
            var10003[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 12)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
               "gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw=="
            );
            String var6 = this.recolorHudText(
               var5, this.firstNonBlank(var10003), Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL")
            );
            if (!this.equalsNullable(var5, var6)) {
               this.hudService.setHudText(var4, var6, null, (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12) != 0));
            }
         }
      }
   }

   public String recolorHudText(String var1, String var2, String var3) {
      if (((1211788738 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506494, 1)];
         var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 19)] = var1;
         String var4 = this.firstNonBlank(var10001).trim();
         if (var4.startsWith(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("IBxu5to8Ps4xK3R7urCelhpwrQUeC/cJKWO9m1LGGUzJFNhnpf4zsQ=="))
            && var4.endsWith(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("l3/wkkvhm0nyvYbcgGpptoGI6/lxgk0P0bkp8YZagZloD+SDPaavQAx5"))) {
            int var5 = var4.indexOf(Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609831489, 9));
            if (var5 > 0) {
               var4 = var4.substring(
                     var5 + Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(-243371048, 31), var4.length() - Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(748429458, 16)
                  )
                  .trim();
            }
         }

         while (
            var4.startsWith(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("n/B9Y0suZ+7uIMNhR0gam58BEfZk3+b8FUViopf0hHE="))
               && var4.length() >= Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544627, 5)
               && var4.charAt(Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903850456, 15)) == Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-133309500, 25)
         ) {
            var4 = var4.substring(Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-249330826, 15)).trim();
         }

         if (var4.isBlank()) {
            var10001 = new String[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1899918296, 22)];
            var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2118420337, 30)] = var3;
            var4 = this.firstNonBlank(var10001);
         }

         String[] var10002 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1208016316, 21)];
         var10002[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 29)] = var2;
         var10002[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2089357025, 31)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw=="
         );
         return this.ensureRoundedCornerEditorFont(Xqedii_2xkd0cf0kve0n(this.firstNonBlank(var10002), var4));
      }
   }

   public void addOverlayBar(Player var1, String var2, double var3, double var5, double var7, double var9, double var11, String var13) {
      if ((912738301 * 912738301 + 912738301 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Placement var14 = this.positionCalculator
            .calculateBoxPlacement(
               var3,
               var5,
               var11,
               Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(241883712200504480L, 10)), var7),
               Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855812294L, 15)), var9)
            );
         Vector var10003 = var14.location();
         Vector var10004 = var14.scale();
         String[] var10006 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(537097969, 23)];
         var10006[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465012984, 2)] = var13;
         var10006[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 15)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw=="
         );
         this.upsertOverlayHud(var1, var2, var10003, var10004, Xqedii_1m3mdwpwy44co(this.firstNonBlank(var10006)));
      }
   }

   public void addHandle(Player var1, EditorSession var2, String var3, double var4, double var6, double var8, String var10) {
      if ((1578020045 * (1578020045 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2.handlesCollapsed && var2.activeHandle != null && !var2.activeHandle.equals(var3)) {
         this.removeOverlayHud(var1, Xqedii_bjxhcpq5o1kj(var3));
      } else {
         double var11 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(6123399872561019443L, 49));
         double var13 = var4 - var11 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(2804461722425001051L, 48));
         double var15 = var6 - var11 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814966L, 5));
         String var17 = Xqedii_2nr8syuc4djim(var3);
         Placement var18 = this.positionCalculator.calculateBoxPlacement(var13, var15, var8, var11, var11);
         Vector var10003 = var18.location();
         Vector var10004 = var18.scale();
         String[] var10006 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544819, 6)];
         var10006[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1997005897, 18)] = var10;
         var10006[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(876684377, 25)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "bfg8aYqf3enT6naUxy6M/2DJiuYA6rRgh1hT9BCpNmHeG0oNGUvHRbEE60bnrg=="
         );
         this.upsertOverlayHud(var1, var17, var10003, var10004, Xqedii_2x30h60rmugzq(this.firstNonBlank(var10006)));
         var2.handleCenters.put(var3, new Vector(var4, var6, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 19))));
      }
   }

   public void addMoveCenterHandle(Player var1, EditorSession var2, double var3, double var5, double var7, String var9) {
      if ((1091591375 * (1091591375 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2.handlesCollapsed
         && var2.activeHandle != null
         && !Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz").equals(var2.activeHandle)) {
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CCiXhMNOl9cvMaICVG8PCQI7O969K4L6LG2mBuCWyxhifhcjeLaVrLh+HPHDjGObATliQCnordisbclRSxbx3uxAcnwEyQ==")
         );
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y7cL/PK8YyoHPpIbYZKjqoCsBdeWJ6gE1onU550JbCAR4KHgRP1jjq/n2UqvtkyO1TTkAxyCJWUW2JsDjqLcBrNRebTrQw==")
         );
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AJLoetpVugmWOnlVU+lpMrvSsh0Wi1/Y/coHHEtGBvfYgjqvg7AxuRJ97rKsYcmw9vozokllr44DJ8DhuMh8iBUUC1CdWQ==")
         );
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qtitruonUYY75uZOUzGRSEV+gYuPi8Uo8rf+Ltz1S9yWHiEM+L4f2mQu4gWXjgoJW7D84xrWuSnJBNZKHb7Wc0PVyKsWnQ==")
         );
      } else {
         double var10 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-8402347538547611056L, 37));
         double var12 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-8981488324654271137L, 10));
         double var14 = var12 / Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7709754459612248171L, 23));
         this.addMoveHandleCell(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CCiXhMNOl9cvMaICVG8PCQI7O969K4L6LG2mBuCWyxhifhcjeLaVrLh+HPHDjGObATliQCnordisbclRSxbx3uxAcnwEyQ=="),
            var3 - var14 - var10,
            var5 - var14 - var10,
            var10,
            var7,
            var9
         );
         this.addMoveHandleCell(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y7cL/PK8YyoHPpIbYZKjqoCsBdeWJ6gE1onU550JbCAR4KHgRP1jjq/n2UqvtkyO1TTkAxyCJWUW2JsDjqLcBrNRebTrQw=="),
            var3 + var14,
            var5 - var14 - var10,
            var10,
            var7,
            var9
         );
         this.addMoveHandleCell(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AJLoetpVugmWOnlVU+lpMrvSsh0Wi1/Y/coHHEtGBvfYgjqvg7AxuRJ97rKsYcmw9vozokllr44DJ8DhuMh8iBUUC1CdWQ=="),
            var3 - var14 - var10,
            var5 + var14,
            var10,
            var7,
            var9
         );
         this.addMoveHandleCell(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qtitruonUYY75uZOUzGRSEV+gYuPi8Uo8rf+Ltz1S9yWHiEM+L4f2mQu4gWXjgoJW7D84xrWuSnJBNZKHb7Wc0PVyKsWnQ=="),
            var3 + var14,
            var5 + var14,
            var10,
            var7,
            var9
         );
         var2.handleCenters
            .put(
               Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz"),
               new Vector(var3, var5, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-3080871196004516212L, 47)))
            );
      }
   }

   public void addMoveHandleCell(Player var1, String var2, double var3, double var5, double var7, double var9, String var11) {
      if ((-502069624 * -502069624 + -502069624 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Placement var12 = this.positionCalculator.calculateBoxPlacement(var3, var5, var9, var7, var7);
         Vector var10003 = var12.location();
         Vector var10004 = var12.scale();
         String[] var10006 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1863450679, 11)];
         var10006[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1308024119, 28)] = var11;
         var10006[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1367241688, 29)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "bfg8aYqf3enT6naUxy6M/2DJiuYA6rRgh1hT9BCpNmHeG0oNGUvHRbEE60bnrg=="
         );
         this.upsertOverlayHud(var1, var2, var10003, var10004, Xqedii_116svtrk4hoiw(this.firstNonBlank(var10006)));
      }
   }

   public void clearHandleOverlays(Player var1, EditorSession var2) {
      if (((2324914 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("hpPHiSLvZJVUaNegDZaoEfMloRteFjb9MMFahhN95aowuKGFBUeHvCmyos+cmYxunJKfIVimR5HdLkm5"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("i4ZYdGQDiq1DCrbw5p7MkIXeVUK2qEn3PPktO9pV9eear1EasA5XVHIQQwl73iajQ5gGKjaEDhXsyncE"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CG2FIy/uRcEOrP8eT1t8ZU48uU0a6eO+XvplyimLJXfZ0CgRu7jH8nYCewARRvnFmFgB8PcAWI3xRjtU"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("6h8uB5wwRTWolnYOCpLLY/aXnlExBQbyaBRfhUMiptUgXUeG55S/8mspsL1GFa6aFtKMnyswuH+6hyf1"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bCUAloNThFpr3/7cY5sHtF/ST4bIC6Zdgd5MgfayRxYbXBeibQOD9870RgNG4Lf+xUwN2TTpx9a6H2Fo"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("3bnxYB50/qz0gFlxtzhPAQTFEHTBmMwV99yb789VaYQUCroQO4A6auhH8B2X238VjSaYi/vij7vUfQ=="));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("kDbVC4PP2lMmKrasih6o5EBk/BtwDDFoWoBQ9pJIaQjmu20tP8gkdr98aXC2EqGhTDxNt9tAu0GAYYnn"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PbvTVjVEh2G7g5wHfngcIVmNq2ybvAcBAF64kgd/ZUidAL0zJ0FU1UnjrMElh4QWGDNwfgb2tFuINA=="));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("hos51K/AqA910gOOE4FBB2EzgojxLuUJtV+Wz6LiyqN/NFEtblUTp+sCg7ctL6Me9JHR2Q1+N0pjWw=="));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ywtZCj5JV6GtTOlETyN1N/yAGOvMkZCToJYsdZzg7couM//ZnMaNr52oEo70qfMSaC6qf4TqBCJ14DBQ"));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ROKrXNQWSCIQde+Ztikw0NtoPgZToMLvuR2Tdgb9pvTE/eVfH3CagJESQ6+CVYMRMijVwomqTmeZ8A=="));
         this.removeOverlayHud(var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("b8Ci1uOmYlytsZfb/nQTtMeJcNVTnwMWZ/h98xb1jkNQVS+ifQkEgEIk1Jd7GlcpUuBxetbfla9fI4IV"));
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CCiXhMNOl9cvMaICVG8PCQI7O969K4L6LG2mBuCWyxhifhcjeLaVrLh+HPHDjGObATliQCnordisbclRSxbx3uxAcnwEyQ==")
         );
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y7cL/PK8YyoHPpIbYZKjqoCsBdeWJ6gE1onU550JbCAR4KHgRP1jjq/n2UqvtkyO1TTkAxyCJWUW2JsDjqLcBrNRebTrQw==")
         );
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AJLoetpVugmWOnlVU+lpMrvSsh0Wi1/Y/coHHEtGBvfYgjqvg7AxuRJ97rKsYcmw9vozokllr44DJ8DhuMh8iBUUC1CdWQ==")
         );
         this.removeOverlayHud(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qtitruonUYY75uZOUzGRSEV+gYuPi8Uo8rf+Ltz1S9yWHiEM+L4f2mQu4gWXjgoJW7D84xrWuSnJBNZKHb7Wc0PVyKsWnQ==")
         );
         if (var2 != null) {
            var2.handleCenters.clear();
            var2.hoveredHandle = null;
         }
      }
   }

   public void updateHandleHover(Player var1, EditorSession var2, String var3) {
      if ((-198778249 * -198778249 - -198778249 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var4 = var2.hoveredHandle;
         String var5 = this.resolveSelectionHandleColor(var2);
         String var6 = this.resolveSelectionHandleHoverColor(var2);
         if (var4 != null && !var4.equals(var3)) {
            if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz").equals(var4)) {
               this.setMoveHandleClusterColor(var1, var5);
            } else {
               Entity var7 = this.hudService.getHud(var1, Xqedii_2pxa22luznjqb(var4));
               if (var7 != null) {
                  this.hudService
                     .setHudText(
                        var7, this.ensureRoundedCornerEditorFont(Xqedii_oelmhf3s954m(var5)), null, (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 31) != 0)
                     );
               }
            }
         }

         if (var3 != null) {
            if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz").equals(var3)) {
               this.setMoveHandleClusterColor(var1, var6);
            } else {
               Entity var8 = this.hudService.getHud(var1, Xqedii_2umr6a5o1ttnm(var3));
               if (var8 != null) {
                  this.hudService
                     .setHudText(
                        var8,
                        this.ensureRoundedCornerEditorFont(Xqedii_2ms7lbfx4ykhq(var6)),
                        null,
                        (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1040641506, 24) != 0)
                     );
               }
            }
         }
      }
   }

   public void setMoveHandleClusterColor(Player var1, String var2) {
      if (((-380148988 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.ensureRoundedCornerEditorFont(Xqedii_201vqmnpl9si5(var2));
         this.setHudTextIfExists(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CCiXhMNOl9cvMaICVG8PCQI7O969K4L6LG2mBuCWyxhifhcjeLaVrLh+HPHDjGObATliQCnordisbclRSxbx3uxAcnwEyQ=="), var3
         );
         this.setHudTextIfExists(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y7cL/PK8YyoHPpIbYZKjqoCsBdeWJ6gE1onU550JbCAR4KHgRP1jjq/n2UqvtkyO1TTkAxyCJWUW2JsDjqLcBrNRebTrQw=="), var3
         );
         this.setHudTextIfExists(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AJLoetpVugmWOnlVU+lpMrvSsh0Wi1/Y/coHHEtGBvfYgjqvg7AxuRJ97rKsYcmw9vozokllr44DJ8DhuMh8iBUUC1CdWQ=="), var3
         );
         this.setHudTextIfExists(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qtitruonUYY75uZOUzGRSEV+gYuPi8Uo8rf+Ltz1S9yWHiEM+L4f2mQu4gWXjgoJW7D84xrWuSnJBNZKHb7Wc0PVyKsWnQ=="), var3
         );
      }
   }

   public String findHoveredHandle(EditorSession var1, double var2, double var4) {
      if ((1835222726 * (1835222726 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.isEffectiveScaleTool(var1)) {
         return null;
      } else if (this.isInsideMoveHandleCell(var1, var2, var4)) {
         return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz");
      } else {
         String var6 = null;
         double var7 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7502760764636550530L, 0));

         for (Entry var10 : var1.handleCenters.entrySet()) {
            if (!Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz").equals(var10.getKey())) {
               Vector var11 = (Vector)var10.getValue();
               if (var11 != null) {
                  double var12 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8572655715388552510L, 56));
                  if (var2 >= var11.getX() - var12 && var2 <= var11.getX() + var12 && var4 >= var11.getY() - var12 && var4 <= var11.getY() + var12) {
                     double var14 = var2 - var11.getX();
                     double var16 = var4 - var11.getY();
                     double var18 = var14 * var14 + var16 * var16;
                     if (var6 == null || var18 < var7) {
                        var6 = (String)var10.getKey();
                        var7 = var18;
                     }
                  }
               }
            }
         }

         return var6;
      }
   }

   public boolean isInsideMoveHandleCell(EditorSession var1, double var2, double var4) {
      if ((-1951579435 ^ -1951579435) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 21) != 0);
      } else {
         Vector var6 = (Vector)var1.handleCenters.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz"));
         if (var6 == null) {
            return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 1) != 0);
         } else {
            double var7 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-7821141124102667731L, 47));
            double var9 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855880510L, 18));
            double var11 = var6.getX();
            double var13 = var6.getY();
            double var15 = var7 + var9;
            double var17 = var15 * Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277483L, 10));
            return this.isInsideRect(var2, var4, var11 - var15, var13 - var15, var17, var17);
         }
      }
   }

   public boolean isInsideRect(double var1, double var3, double var5, double var7, double var9, double var11) {
      if ((615349685 * 615349685 + 615349685 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 >= var5 && var1 <= var5 + var9 && var3 >= var7 && var3 <= var7 + var11
            ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1044678513, 30)
            : Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(1203822012, 21)) != 0);
      }
   }

   public void clearEditorOverlays(Player var1) {
      if ((1602407867 * 1602407867 + 1602407867 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var2 = Xqedii_3uxgwyg.Xqedii_3mtt67t;
         int var3 = var2.length;

         for (int var4 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 8); var4 < var3; var4++) {
            String var5 = var2[var4];
            this.removeOverlayHud(var1, var5);
         }

         EditorSession var6 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         if (var6 != null) {
            this.clearAnimationPreviewMotionPath(var1, var6);

            for (String var8 : this.getSelectedTargetIds(var6)) {
               this.restoreElementLayer(var1, var6, var8);
            }

            var6.handleCenters.clear();
            var6.hoveredHandle = null;
            var6.handlesCollapsed = (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465012984, 2) != 0);
         }
      }
   }

   public void clearEditorOverlaysOnly(Player var1, EditorSession var2) {
      if (((821615682 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var3 = Xqedii_3uxgwyg.Xqedii_3mtt67t;
         int var4 = var3.length;

         for (int var5 = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 13); var5 < var4; var5++) {
            String var6 = var3[var5];
            this.removeOverlayHud(var1, var6);
         }

         if (var2 != null) {
            this.clearAnimationPreviewMotionPath(var1, var2);
            var2.handleCenters.clear();
            var2.hoveredHandle = null;
         }
      }
   }

   public void bringElementToFront(Player var1, EditorSession var2, String var3) {
      if ((-997717529 * -997717529 + -997717529 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null) {
         List var4 = this.findTargetElements(var2, var3);
         if (!var4.isEmpty()) {
            double var5 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-8054354357423046638L, 11));
            double var7 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300285419L, 25));

            for (HoverElement var10 : (Iterable<HoverElement>) (var4)) {

               var7 = Math.max(var7, this.defaultRuntimeLayer(var2, var10));
            }

            for (HoverElement var14 : (Iterable<HoverElement>) (var4)) {

               double var11 = var5 + (this.defaultRuntimeLayer(var2, var14) - var7);
               if (Double.compare(var14.runtimeZ, var11) != 0) {
                  var14.runtimeZ = var11;
                  this.updateElementHud(var1, var14);
               }
            }
         }
      }
   }

   public void restoreElementLayer(Player var1, EditorSession var2, String var3) {
      if ((-1059677771 ^ -1059677771) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null) {
         for (HoverElement var5 : this.findTargetElements(var2, var3)) {
            double var6 = this.defaultRuntimeLayer(var2, var5);
            if (Double.compare(var5.runtimeZ, var6) != 0) {
               var5.runtimeZ = var6;
               this.updateElementHud(var1, var5);
            }
         }
      }
   }

   public void renderPreviewPageOutline(Player var1, EditorSession var2) {
      if (((596128400 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2.previewMode && var2.previewViewport != null) {
         PreviewViewport var3 = var2.previewViewport;
         double var4 = this.toRenderX(var2, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7153175684300277227L, 31)));
         double var6 = this.toRenderY(var2, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7397712555069364212L, 42)));
         double var8 = this.toRenderSize(var2, var3.pageWidth);
         double var10 = this.toRenderSize(var2, var3.pageHeight);
         double var12 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(3963053557730675815L, 33));
         this.upsertPreviewOutlineBar(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("81xUgQuev7eSqvnpaP6mm1u54d+z8jupoFphb3fpr/KjxpgEgl8a+qHcOq1ppB1vhDHQ3/dkZwlnvf0UQ0UKeBhqVSHEK1+EklY="),
            var4,
            var6,
            var8,
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-819651441328888151L, 58)),
            var12
         );
         this.upsertPreviewOutlineBar(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Gz7G8hrWoYb6zJECWpuuHwdbZK/RIWayrHqyiIErvfgAZzpcTQlXmNY6lc2BrtZKPfMtilUDkLY/ZwBWK+zv7RRaZY+uX0CLYgZtORZouhg="),
            var4,
            var6 + var10 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(8306097188907124011L, 8)),
            var8,
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(-2961671052116576691L, 57)),
            var12
         );
         this.upsertPreviewOutlineBar(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("UafSNaYSWtOyZfMhCArxmFmwJSeeFofIqTK2F4jK7FTUAhzPf7JTPX4tANm7ry2zOGNclz3yN2G+X2BBVp6hPejXHDalAFPoCFu+zw=="),
            var4,
            var6,
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8550038761205200190L, 55)),
            var10,
            var12
         );
         this.upsertPreviewOutlineBar(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YQlMJfoXfzysOXj/Al4Bplcsg4v4K83PPm4yTAJPYieBktiLVTPs2suSBljrTYYjXOAgXVn05qF+djQMqLI5I9Jck4A59rVtnLT3bkoK"),
            var4 + var8 - Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-417896906354479701L, 33)),
            var6,
            Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-2684247403524718566L, 21)),
            var10,
            var12
         );
      } else {
         this.removeHudById(
            var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("81xUgQuev7eSqvnpaP6mm1u54d+z8jupoFphb3fpr/KjxpgEgl8a+qHcOq1ppB1vhDHQ3/dkZwlnvf0UQ0UKeBhqVSHEK1+EklY=")
         );
         this.removeHudById(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Gz7G8hrWoYb6zJECWpuuHwdbZK/RIWayrHqyiIErvfgAZzpcTQlXmNY6lc2BrtZKPfMtilUDkLY/ZwBWK+zv7RRaZY+uX0CLYgZtORZouhg=")
         );
         this.removeHudById(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("UafSNaYSWtOyZfMhCArxmFmwJSeeFofIqTK2F4jK7FTUAhzPf7JTPX4tANm7ry2zOGNclz3yN2G+X2BBVp6hPejXHDalAFPoCFu+zw==")
         );
         this.removeHudById(
            var1,
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YQlMJfoXfzysOXj/Al4Bplcsg4v4K83PPm4yTAJPYieBktiLVTPs2suSBljrTYYjXOAgXVn05qF+djQMqLI5I9Jck4A59rVtnLT3bkoK")
         );
      }
   }

   public void upsertPreviewOutlineBar(Player var1, String var2, double var3, double var5, double var7, double var9, double var11) {
      if ((547589799 * (547589799 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Placement var13 = this.positionCalculator
            .calculateBoxPlacement(
               var3,
               var5,
               var11,
               Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-1639302882657776301L, 59)), var7),
               Math.max(Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117941142846L, 29)), var9)
            );
         this.upsertOverlayHud(
            var1,
            var2,
            var13.location(),
            var13.scale(),
            Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("nVT9eg2faOMTPrDGCdaYOHMOmWMMfQvHt6f+2+2HxOsRfMEQQhhROJu8BtQ4adz+")
         );
      }
   }

   public void updatePreviewPan(Player var1, EditorSession var2, double var3, double var5) {
      if ((1555013609 * (1555013609 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var2.previewViewport != null) {
         double var7 = var2.previewPanStartX + (var3 - var2.previewPanStartCursorX);
         double var9 = var2.previewPanStartY + (var5 - var2.previewPanStartCursorY);
         double[] var11 = this.clampPreviewPanToVisibleRange(var2, var7, var9);
         double var12 = var2.editMode ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-58427358108791187L, 42)) : var2.runtimeZoomPanRubber;
         var7 = this.softClampToBounds(var7, var11[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1219652738, 10)], var12);
         var9 = this.softClampToBounds(var9, var11[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 4)], var12);
         if (!(Math.abs(var7 - var2.previewViewport.panX) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(5552313567279619052L, 11)))
            || !(Math.abs(var9 - var2.previewViewport.panY) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(2115573495923288581L, 5)))) {
            var2.previewViewport.panX = var7;
            var2.previewViewport.panY = var9;
            this.refreshPreviewProjection(var1, var2);
            this.updateCursorPositionReadout(var1, var2, var3, var5);
         }
      } else {
         this.stopCursorToolDrag(var2);
      }
   }

   public void animatePreviewPanBackToBounds(Player var1, EditorSession var2, double var3, double var5) {
      if ((-1934894580 * -1934894580 - -1934894580 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.previewViewport != null) {
         double var7 = var2.previewViewport.panX;
         double var9 = var2.previewViewport.panY;
         double[] var11 = this.clampPreviewPanToVisibleRange(var2, var7, var9);
         double var12 = var11[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 25)];
         double var14 = var11[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-998371877, 17)];
         if (!(Math.abs(var12 - var7) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-8367069614635930717L, 27)))
            || !(Math.abs(var14 - var9) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(7861524304596682967L, 4)))) {
            int[] var10000 = new int[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1883128968, 22)];
            var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1820477618, 26)] = Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 31);
            int[] var16 = var10000;
            int var17 = var2.editMode
               ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1898869720, 20)
               : Math.max(Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1635677144, 28), var2.runtimeZoomPanSnapTicks);
            Xqedii_38o2zes.Xqedii_j3mggbv(
               this.plugin,
               var1,
               Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554638842977908030L, 38),
               Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-7153175684300277228L, 16),
               var17x -> {
                  if ((-1051490281 * -1051490281 - -1051490281 & 1) != 0) {
                     throw new IllegalStateException();
                  } else if (var1.isOnline() && !var2.previewPanActive) {
                     var16[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1678919059, 29)] += Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(613099144, 6);
                     double var18 = Math.min(
                        Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117874099518L, 28)),
                        (double)var16[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(601911006, 20)] / var17
                     );
                     double var20 = Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-6054470308976393811L, 25))
                        - Math.pow(
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639118611838270L, 32)) - var18,
                           Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554638980416861502L, 39))
                        );
                     var2.previewViewport.panX = var7 + (var12 - var7) * var20;
                     var2.previewViewport.panY = var9 + (var14 - var9) * var20;
                     this.refreshPreviewProjection(var1, var2);
                     this.updateCursorPositionReadout(var1, var2, var3, var5);
                     if (var16[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022670779, 14)] >= var17) {
                        var17x.cancel();
                     }
                  } else {
                     var17x.cancel();
                  }
               }
            );
         }
      }
   }

   public void refreshPreviewProjection(Player var1, EditorSession var2) {
      if ((1059751211 * (1059751211 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!var2.editMode) {
         this.refreshRuntimeZoomProjection(var1, var2);
      } else if (var2.previewMode) {
         this.renderPreviewPageOutline(var1, var2);
         this.renderEditorTransparencyOverlay(var1, var2);

         for (HoverElement var4 : var2.elements) {
            this.updateElementHud(var1, var4);
         }

         if (var2.selectedElementId != null && var2.selectionOutlineVisible) {
            this.renderSelectionOverlay(var1, var2);
         } else {
            this.clearEditorOverlays(var1);
         }

         this.updatePageInfoReadout(var1, var2);
      }
   }

   public void refreshRuntimeZoomProjection(Player var1, EditorSession var2) {
      if (((-1657180413 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.isRuntimeZoomActive(var2)) {
         for (HoverElement var4 : var2.elements) {
            this.updateElementHud(var1, var4);
         }
      }
   }

   public void translateTargetElements(Player var1, EditorSession var2, String var3, double var4, double var6) {
      if ((-549834994 * -549834994 - -549834994 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         if (!(Math.abs(var4) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(368551929158090026L, 61)))
            || !(Math.abs(var6) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(8227555580197693976L, 0)))) {
            for (HoverElement var9 : this.findTargetElements(var2, var3)) {
               if (var9.baseLocation != null) {
                  var9.baseLocation.setX(var9.baseLocation.getX() + var4);
                  var9.baseLocation.setY(var9.baseLocation.getY() + var6);
                  var9.centerX += var4;
                  var9.centerY += var6;
                  this.updateElementHud(var1, var9);
               }
            }
         }
      }
   }

   public void translateSelectionOutline(Player var1, EditorSession var2, double var3, double var5) {
      if (((1588847902 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var2.selectedElementId != null) {
         double var7 = this.toRenderSize(var2, var3);
         double var9 = this.toRenderSize(var2, var5);
         if (!(Math.abs(var7) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_c96sr5k8o0jj(1925213751992719123L, 23)))
            || !(Math.abs(var9) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-8326628650658479917L, 46)))) {
            boolean var11 = false;
            var11 |= this.moveOverlayHudBy(
               var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("M97JNh5Zjf4E1HTgO41f/oLWYLyqlvqsuaAGR7ELTi/DFGtTeVH2bkfboSHJKVn1"), var7, var9
            );
            var11 |= this.moveOverlayHudBy(
               var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("88ziweV7CjFAUGh6wBLdZ5Nu8iSN3BxaXJrpisOPewIzbovY+5P0G3fF7u+zx7bd1ygvhVR9"), var7, var9
            );
            var11 |= this.moveOverlayHudBy(
               var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("QUswJ9BN6DkasklTSDJjtNas4fsnVDC3B33hFMKpcUSIK+l0iAgYRjufchi+N5ebLwU="), var7, var9
            );
            var11 |= this.moveOverlayHudBy(
               var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("WMK5NhunA+cTzogZAjfmqcM5F5RltmQN8PMz6WJhpsCkI4xaKhtNAv5PYZFXmBEuFfb2tA=="), var7, var9
            );
            if (this.isEffectiveScaleTool(var2)) {
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("hpPHiSLvZJVUaNegDZaoEfMloRteFjb9MMFahhN95aowuKGFBUeHvCmyos+cmYxunJKfIVimR5HdLkm5"), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("3bnxYB50/qz0gFlxtzhPAQTFEHTBmMwV99yb789VaYQUCroQO4A6auhH8B2X238VjSaYi/vij7vUfQ=="), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("i4ZYdGQDiq1DCrbw5p7MkIXeVUK2qEn3PPktO9pV9eear1EasA5XVHIQQwl73iajQ5gGKjaEDhXsyncE"), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PbvTVjVEh2G7g5wHfngcIVmNq2ybvAcBAF64kgd/ZUidAL0zJ0FU1UnjrMElh4QWGDNwfgb2tFuINA=="), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("hos51K/AqA910gOOE4FBB2EzgojxLuUJtV+Wz6LiyqN/NFEtblUTp+sCg7ctL6Me9JHR2Q1+N0pjWw=="), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CG2FIy/uRcEOrP8eT1t8ZU48uU0a6eO+XvplyimLJXfZ0CgRu7jH8nYCewARRvnFmFgB8PcAWI3xRjtU"), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ROKrXNQWSCIQde+Ztikw0NtoPgZToMLvuR2Tdgb9pvTE/eVfH3CagJESQ6+CVYMRMijVwomqTmeZ8A=="), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("6h8uB5wwRTWolnYOCpLLY/aXnlExBQbyaBRfhUMiptUgXUeG55S/8mspsL1GFa6aFtKMnyswuH+6hyf1"), var7, var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("CCiXhMNOl9cvMaICVG8PCQI7O969K4L6LG2mBuCWyxhifhcjeLaVrLh+HPHDjGObATliQCnordisbclRSxbx3uxAcnwEyQ=="),
                  var7,
                  var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Y7cL/PK8YyoHPpIbYZKjqoCsBdeWJ6gE1onU550JbCAR4KHgRP1jjq/n2UqvtkyO1TTkAxyCJWUW2JsDjqLcBrNRebTrQw=="),
                  var7,
                  var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AJLoetpVugmWOnlVU+lpMrvSsh0Wi1/Y/coHHEtGBvfYgjqvg7AxuRJ97rKsYcmw9vozokllr44DJ8DhuMh8iBUUC1CdWQ=="),
                  var7,
                  var9
               );
               var11 |= this.moveOverlayHudBy(
                  var1,
                  Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qtitruonUYY75uZOUzGRSEV+gYuPi8Uo8rf+Ltz1S9yWHiEM+L4f2mQu4gWXjgoJW7D84xrWuSnJBNZKHb7Wc0PVyKsWnQ=="),
                  var7,
                  var9
               );

               for (Vector var13 : var2.handleCenters.values()) {
                  if (var13 != null) {
                     var13.setX(var13.getX() + var7);
                     var13.setY(var13.getY() + var9);
                  }
               }
            }

            if (!var11) {
               this.renderSelectionOverlay(var1, var2);
            }
         }
      }
   }

   public boolean moveOverlayHudBy(Player var1, String var2, double var3, double var5) {
      if (((-1749402891 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Entity var7 = this.hudService.getHud(var1, var2);
         if (var7 == null) {
            return (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1820477618, 26) != 0);
         } else {
            Vector var8 = this.hudService.getHudLocation(var7);
            if (var8 == null) {
               return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022670779, 14) != 0);
            } else {
               EditorSession var9 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
               int var10 = this.resolveEditorHudTransitionTicks(var9);
               this.hudService
                  .moveHud(
                     var7,
                     var8.clone().add(new Vector(var3, var5, Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(8554639117855814974L, 0)))),
                     var10,
                     var10
                  );
               return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1883128968, 22) != 0);
            }
         }
      }
   }

   public boolean sameRect(EditorRect var1, EditorRect var2) {
      if ((582916826 * 582916826 + 582916826 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         return ((Math.abs(var1.x - var2.x) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(-81758485009094563L, 45))
               && Math.abs(var1.y - var2.y) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2go5qbd1l639t(615941130521703268L, 1))
               && Math.abs(var1.width - var2.width) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(1663694760556991183L, 26))
               && Math.abs(var1.height - var2.height) < Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(6605122119650788014L, 38))
            ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 17)
            : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 19)) != 0);
      } else {
         return ((var1 == null && var2 == null
            ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-2109164952, 2)
            : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 29)) != 0);
      }
   }

   public void toggleScalingHandle(Player var1, EditorSession var2, String var3, long var4) {
      if ((2143526340 * 2143526340 - 2143526340 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.isEffectiveScaleTool(var2)) {
         if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz").equals(var3)) {
            var2.activeHandle = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz");
            var2.resizeAnchorValid = (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 26) != 0);
            var2.handlesCollapsed = (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 24) != 0);
            this.startMoveDrag(var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
            var2.lastScaleToggleTick = var4;
            this.renderSelectionOverlay(var1, var2);
         } else if (var4 - var2.lastScaleToggleTick >= Xqedii_2j3b4yz.Xqedii_2418xixoyw8k4(-7153175684301325804L, 19)) {
            if (var3.equals(var2.activeHandle)) {
               var2.activeHandle = null;
               var2.resizeAnchorValid = (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-499251475, 16) != 0);
               var2.handlesCollapsed = (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 8) != 0);
               this.stopCursorToolDrag(var2);

               for (String var7 : this.getSelectedTargetIds(var2)) {
                  this.restoreElementLayer(var1, var2, var7);
               }
            } else {
               var2.activeHandle = var3;
               if (Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2IQ3CgfshU6RHa2wAHIYOOldUcdiLMxuN3DQQ7Z3pgFIaDKz").equals(var3)) {
                  var2.handlesCollapsed = (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-1822158267, 21) != 0);
                  var2.resizeAnchorValid = (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 15) != 0);
                  this.startMoveDrag(var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
               } else {
                  this.captureResizeAnchor(var2);
                  var2.handlesCollapsed = (Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1219651714, 10) != 0);
                  this.stopCursorToolDrag(var2);

                  for (String var9 : this.getSelectedTargetIds(var2)) {
                     this.bringElementToFront(var1, var2, var9);
                  }
               }
            }

            var2.lastScaleToggleTick = var4;
            this.renderSelectionOverlay(var1, var2);
         }
      }
   }

   public void captureResizeAnchor(EditorSession var1) {
      if ((1304223770 * (1304223770 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.resizeStartBounds.clear();
         var1.resizeInheritedRootStartBounds.clear();
         var1.resizeInheritedChildrenSnapshot.clear();
         EditorRect var2 = null;

         for (String var4 : this.resolveResizeScaleTargetIds(var1)) {
            int var6 = var1.activeTool == EditorTool.ANIMATION && this.isTimelineScaleKeyframeSelected(var1)
               ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903588312, 19)
               : Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(-654012060, 27);
            String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(465012988, 2)];
            var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 31)] = this.resolveInheritedTargetRootPath(var1, var4);
            String var7 = this.firstNonBlank(var10001);
            int var8 = !var7.isBlank() && this.isImageGroupRootPath(var1, var7)
               ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 22)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 12);
            EditorRect var5;
            if (var6 != 0 && var8 == 0) {
               var5 = this.resolveTimelineLiveOutlineBoundsForTarget(var1, var4);
               if (var5 == null) {
                  var5 = this.resolveTimelineGroupLogicalBounds(var1, var4);
               }

               if (var5 == null) {
                  var5 = this.getTargetBounds(var1, var4);
               }

               if (var5 == null) {
                  var5 = this.resolveSidebarEditableBounds(var1, var4);
               }
            } else {
               var5 = this.resolveSidebarEditableBounds(var1, var4);
            }

            if (var5 != null) {
               var1.resizeStartBounds.put(var4, var5);
               HoverElement var9 = this.findFirstByTargetId(var1, var4);
               var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 20)];
               var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 5)] = this.resolveInheritedTargetRootPath(var1, var4);
               String var10 = this.firstNonBlank(var10001);
               var10001 = new String[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(76637385, 3)];
               var10001[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2022670779, 14)] = var10;
               var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904178136, 16)] = var9 == null ? null : var9.targetPath;
               String var11 = this.firstNonBlank(var10001);
               if (!var11.isBlank()) {
                  Map var12 = this.resolveRawMapAtPath(var1.rawBlocks, var11);
                  if (this.shouldInheritTargetToChildren(var12)) {
                     boolean var13 = this.isImageGroupRoot(var12);
                     double var14 = var13
                        ? Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(7938733242408097216L, 25))
                        : Double.longBitsToDouble(Xqedii_2j3b4yz.Xqedii_2gkxiqnev8pnb(-409825720664444076L, 57));
                     double var16;
                     double var18;
                     if (var13) {
                        var16 = Math.max(var14, var5.width);
                        var18 = Math.max(var14, var5.height);
                     } else {
                        double var20 = Math.abs(
                           this.readMapPathDouble(
                              var12,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("zB3EUnFB01EvrAmjyKF34V09hzn5XCx9+ODEGa/JdqXah0O1/bgVbwxU8Z/ztdy5"),
                              this.readMapPathDouble(
                                 var12, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("SbWCOOjSfpvaZMfO0UniNTlVJCKcvDvI1Clzyzg2jFl30e4Un5Q="), var5.width
                              )
                           )
                        );
                        double var22 = Math.abs(
                           this.readMapPathDouble(
                              var12,
                              Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vQf/LCDh+ztWuwyqKaPkmX0+XH5GojGtmfSGpm6S7EUonGb3FaZCuqRurdJV6LQzkDc="),
                              this.readMapPathDouble(
                                 var12, Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ed+VOVrx+lSiFICZGHFOGBSXFa97ujkUTnY+v3LsR2GbI7fYtUbRyQ=="), var5.height
                              )
                           )
                        );
                        var16 = Double.isFinite(var20) ? Math.max(var14, var20) : Math.max(var14, var5.width);
                        var18 = Double.isFinite(var22) ? Math.max(var14, var22) : Math.max(var14, var5.height);
                     }

                     var1.resizeInheritedRootStartBounds.put(var11, new EditorRect(var5.x, var5.y, var16, var18));
                     var1.resizeInheritedChildrenSnapshot
                        .put(
                           var11,
                           this.deepCopyValue(var12.get(Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mbH18w17FP66gJuh3Rw03spHTqn3U8Y+Vccl8Sqmj0Jm9imQwqeNBi0WuPI=")))
                        );
                  }
               }

               var2 = this.mergeBounds(var2, var5);
            }
         }

         if (var2 == null) {
            var2 = this.getSelectedBounds(var1);
         }

         if (var2 == null) {
            var1.resizeAnchorValid = (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 23) != 0);
         } else {
            var1.resizeSelectionStartX = var2.x;
            var1.resizeSelectionStartY = var2.y;
            var1.resizeSelectionStartW = var2.width;
            var1.resizeSelectionStartH = var2.height;
            var1.resizeStartCursorX = this.toLogicalCursorX(var1, var1.cursorX + var1.hitboxOffsetX);
            var1.resizeStartCursorY = this.toLogicalCursorY(var1, var1.cursorY + var1.hitboxOffsetY);
            var1.resizeLastCursorX = var1.resizeStartCursorX;
            var1.resizeLastCursorY = var1.resizeStartCursorY;
            var1.resizeStepReady = (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 21) != 0);
            var1.resizeAnchorValid = (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 19) != 0);
         }
      }
   }

   public LinkedHashSet<String> resolveResizeScaleTargetIds(EditorSession var1) {
      if (((-520301767 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1 == null) {
            return var2;
         } else {
            var2.addAll(this.getSelectedTargetIds(var1));
            if (!var2.isEmpty() && this.isEffectiveScaleTool(var1)) {
               for (String var5 : (Iterable<String>) (new LinkedHashSet(var2))) {

                  if (var5 != null && !var5.isBlank()) {
                     Map var6 = this.resolveRawTargetByTargetId(var1, var5);
                     if (!this.shouldInheritTargetToChildren(var6)) {
                        var2.addAll(this.resolveDescendantLayerTargetIds(var1, var5));
                     }
                  }
               }

               return var2;
            } else {
               return var2;
            }
         }
      }
   }

   public void rerenderEditableContent(Player var1, EditorSession var2) {
      if ((1935632895 * (1935632895 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         int var3 = !this.isTransformDragInProgress(var2)
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(-243371048, 31)
            : Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 0);
         boolean var4 = this.isSidebarFieldDragInProgress(var2);
         var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
         this.renderResolvedContent(var1, var2);
         if (var2.activeHandle != null) {
            if (var2.selectedElementId != null && var2.selectionOutlineVisible) {
               this.renderSelectionOverlay(var1, var2);
            }

            if (var3 != 0) {
               this.updateEditorPropertiesSidebar(var1, var2);
            }
         } else {
            if (!var4 || var2.selectedElementId == null || !var2.selectionOutlineVisible) {
               this.clearEditorOverlaysOnly(var1, var2);
            }

            if (var2.selectedElementId != null && var2.selectionOutlineVisible) {
               this.renderSelectionOverlay(var1, var2);
            }

            if (var3 != 0) {
               this.updateEditorPropertiesSidebar(var1, var2);
            }

            this.updatePageInfoReadout(var1, var2);
         }
      }
   }

   public void rerenderEditableSelection(Player var1, EditorSession var2) {
      if ((612057346 * (612057346 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         int var3 = !this.isTransformDragInProgress(var2)
            ? Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1903588312, 19)
            : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 20);
         boolean var4 = this.isSidebarFieldDragInProgress(var2);
         EditorRect var5 = this.getSelectedBounds(var2);
         String var6 = this.resolveSelectionOutlineColor(var2);
         List var7 = this.getSelectedTargetIds(var2);
         if (var7.isEmpty()) {
            this.rerenderEditableContent(var1, var2);
         } else {
            var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
            ArrayList var8 = new ArrayList(var2.elements);
            HashMap var9 = new HashMap();

            for (HoverElement var11 : (Iterable<HoverElement>) (var8)) {

               var9.put(var11.id, var11);
            }

            LinkedHashSet var25 = new LinkedHashSet(var7);
            LinkedHashSet var26 = new LinkedHashSet();

            for (String var13 : (Iterable<String>) (var7)) {

               HoverElement var14 = this.findFirstByTargetId(var2, var13);
               String var10000;
               if (var14 == null) {
                  var10000 = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2fCvYocmNVBPKiZsEwyc4hL/dZeey1MjSyU9Bw==");
               } else {
                  String[] var10001 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 2)];
                  var10001[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 21)] = var14.targetPath;
                  var10000 = this.firstNonBlank(var10001);
               }

               String var15 = var10000;
               if (!var15.isBlank()) {
                  var26.add(var15);
               }

               var25.addAll(this.resolveDescendantLayerTargetIds(var2, var13));
            }

            HashSet var27 = new HashSet();
            ArrayList var28 = new ArrayList();
            HashMap var29 = new HashMap();
            int var30 = Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(300955503, 19);

            for (Map var17 : var2.renderBlocks) {
               var30++;
               ConfigurationSection var18 = this.mapToSection(var17);
               if (var18 != null) {
                  String[] var39 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149726719, 6)];
                  var39[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 20)] = var18.getString(
                     Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oREMxVfWZLpMxpbGGGfBRRz9mBDtgF7pJCCgY3uqlWTHpnfa")
                  );
                  var39[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1937667032, 25)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
                     "62C+83f+QCrnnoAZViwqdl0IjUMqn0dF9do58aG4zAn0bVD1S4Q="
                  );
                  String var19 = this.firstNonBlank(var39).toLowerCase(Locale.ROOT);
                  if (this.isRenderableBlockType(var19)) {
                     String var20 = this.resolveElementId(var18, var30, var29);
                     String var21 = this.runtimeElementId(var2, var20);
                     var39 = new String[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(232506496, 1)];
                     var39[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 6)] = var18.getString(
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("tTZOK2iGig75Q0PwHscFlR9FbLabxADCtF+6tRIUBYIum3SVUAJpU/lHGJkaHngS1hTkwROjNxRLHfzwxsSu6g==")
                     );
                     var39[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904104408, 13)] = var21;
                     String var22 = this.firstNonBlank(var39);
                     var39 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 19)];
                     var39[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1496727844, 17)] = var18.getString(
                        Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("O7wBLqb1MsDcX9U7UX4ScbjL5IcwIVh3rw/D2sdPyYW3XnwJJvgabov0MzaDL31mePQ9PfXW5cPTV1AzdiK0s9e+ANI=")
                     );
                     String var23 = this.firstNonBlank(var39);
                     if (!this.isTargetVisible(var2, var22)) {
                        HoverElement var38 = (HoverElement)var9.get(var21);
                        if (var38 != null) {
                           this.removeRenderedElementHud(var1, var38);
                        }
                     } else {
                        var27.add(var21);
                        if (!var25.contains(var22) && !this.isDescendantOfAnyTargetPath(var23, var26)) {
                           HoverElement var24 = (HoverElement)var9.get(var21);
                           if (var24 != null) {
                              var28.add(var24);
                           } else {
                              var28.add(this.renderResolvedElement(var1, var2, var18, var21, var19));
                           }
                        } else {
                           var28.add(this.renderResolvedElement(var1, var2, var18, var21, var19));
                        }
                     }
                  }
               }
            }

            for (HoverElement var33 : (Iterable<HoverElement>) (var8)) {

               if (var33 != null && var33.id != null && !var27.contains(var33.id)) {
                  this.removeRenderedElementHud(var1, var33);
               }
            }

            var2.elements.clear();
            var2.elements.addAll(var28);
            this.normalizeSelectionState(var2);
            EditorRect var32 = this.getSelectedBounds(var2);
            String var34 = this.resolveSelectionOutlineColor(var2);
            int var35 = var5 != null && var32 != null && this.sameRect(var5, var32)
               ? Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(2114837444, 25)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 17);
            int var36 = !var6.equals(var34) ? Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(76637393, 3) : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 23);
            if (var2.selectedElementId != null && var2.selectionOutlineVisible && var35 != 0 && var36 != 0) {
               this.refreshSelectionOutlineColorOnly(var1, var2);
            }

            int var37 = var2.selectedElementId != null && var2.selectionOutlineVisible && var35 != 0
               ? Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 27)
               : Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(670544882, 22);
            if (var2.activeHandle != null) {
               if (var2.selectedElementId != null && var2.selectionOutlineVisible) {
                  this.renderSelectionOverlay(var1, var2);
               }

               if (var3 != 0) {
                  this.updateEditorPropertiesSidebar(var1, var2);
               }
            } else {
               if ((!var4 || var2.selectedElementId == null || !var2.selectionOutlineVisible) && var37 == 0) {
                  this.clearEditorOverlaysOnly(var1, var2);
               }

               if (var2.selectedElementId != null && var2.selectionOutlineVisible && var37 == 0) {
                  this.renderSelectionOverlay(var1, var2);
               }

               if (var3 != 0) {
                  this.updateEditorPropertiesSidebar(var1, var2);
               }

               this.updatePageInfoReadout(var1, var2);
            }
         }
      }
   }

   public boolean isDescendantOfAnyTargetPath(String var1, Set<String> var2) {
      if ((-98404102 ^ -98404102) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var2 != null && !var2.isEmpty()) {
         for (String var4 : var2) {
            if (var4 != null && !var4.isBlank() && var1.startsWith(Xqedii_2gj6b2j53lky2(var4))) {
               return (Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544883, 7) != 0);
            }
         }

         return (Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-607880179, 9) != 0);
      } else {
         return (Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 28) != 0);
      }
   }

   static {
      if (((-934444666 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544819, 3)];
         var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904112600, 26)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "PGI2I55CGPglFD+mrJ5K5ju7NtGh7TGCJRmX/IOzMiHsvG3WgAxyCnK0"
         );
         var10000[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-2089357025, 31)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "R9FKyy5KB2iJ+dUSYVqVtbqMaSjgsftMvAFtuTqY8nIwONMLe6r8Cw=="
         );
         var10000[Xqedii_2j3b4yz.Xqedii_2uggl4atld1dc(-670544851, 5)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "qAclT0hTA61nQ4rW7P5JsSl8AZeRg0RS4CsD2p4IcRTjm8RIo+HiJ7q2vxkyZQ=="
         );
         var10000[Xqedii_2j3b4yz.Xqedii_1mfdrl5h0r4np(-1149726655, 6)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "ygqBPVry4czpwrOMtzCShqatD5CWnoXZ0dB7/yROHCwPOkX7Q3fq4B1S"
         );
         var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(609828417, 9)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "ztBHsQouh/ksanVEe4g4xmwWwKQYc292rZ1t6HMuIchdzhOcbT4r+UWHBEk="
         );
         var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1904111960, 7)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "fPXkhpmpud1NWj1R9zBTMLkQt1xk/Un6/3evacXsFIiOUtoK40U="
         );
         var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(1219654786, 10)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "TDfQu3d90wj3+SukovFN3yEdcRrOk5jJQoVCkxPcrgaao4qHVdo="
         );
         var10000[Xqedii_2j3b4yz.Xqedii_5exqlg7jb2fr(153274818, 4)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "/5S+9khhuYbXEnq+EQr0/L8Va6BX5V0Um6PbgozyE+CQXSTzESk="
         );
         var10000[Xqedii_2j3b4yz.Xqedii_qsruujqux2pw(1912501208, 20)] = Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs(
            "eOKbYFNu9ExsExOJdYeq+32LwTxRS2+uigsGK0IaQnD1OzeLH3s="
         );
         Xqedii_2jjpxmd = var10000;
      }
   }

   public record HoverEffectState(Vector location, Vector scale, int opacity, double rotationDeg, boolean mirrorX, boolean mirrorY) {
      public static final String Xqedii_30i24ge3gj6xn = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

      public EditorOverlayPreviewPart.HoverEffectState copy() {
         if ((930044360 * (930044360 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            Vector var1 = this.location == null ? null : this.location.clone();
            Vector var2 = this.scale == null ? null : this.scale.clone();
            return new EditorOverlayPreviewPart.HoverEffectState(var1, var2, this.opacity, this.rotationDeg, this.mirrorX, this.mirrorY);
         }
      }

      @Override
      public Vector location() {
         if ((-1115416810 * -1115416810 - -1115416810 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.location;
         }
      }

      public Vector scale() {
         if (((-1389081425 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.scale;
         }
      }

      public int opacity() {
         if (((-1616686804 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.opacity;
         }
      }

      public double rotationDeg() {
         if ((1748268603 * 1748268603 + 1748268603 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.rotationDeg;
         }
      }

      public boolean mirrorX() {
         if (((2103703971 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.mirrorX;
         }
      }

      public boolean mirrorY() {
         if ((1804686529 ^ 1804686529) != 0) {
            throw new IllegalStateException();
         } else {
            return this.mirrorY;
         }
      }
   }

   private static /* synthetic */ String Xqedii_3p1t8np4e16jv(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("n/B9Y0suZ+7uIMNhR0gam58BEfZk3+b8FUViopf0hHE=") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/SB1fjlKrjePoYgeI5heLHGKO9B/jYj+VWGc+iVy");
    }

    private static /* synthetic */ String Xqedii_277azecfieibg(String string, String string2, String string3) {
        return string + string2 + string3;
    }

    private static /* synthetic */ String Xqedii_wojhrm39gyt7(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_cfh2jjosbyoa(String string, String string2, String string3) {
        return string + string2 + string3;
    }

    private static /* synthetic */ String Xqedii_2o79oob63hhnp(String string, String string2, String string3) {
        return string + string2 + string3;
    }

    private static /* synthetic */ String Xqedii_bkxx2rzuhmkr(String string, long l, long l2) {
        return string + l + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/0pF7+OGOYFcCh58HV5+5O0VUvwIZlbsGnydtt/jTSo=") + l2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/KpVgCglL7wVXLfIJosF7RCvCk/TaoAsz7FStnLzsQg=");
    }

    private static /* synthetic */ String Xqedii_2wfkhpd4pkrl7(String string, int n, int n2, int n3) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("n/B9Y0suZ+7uIMNhR0gam58BEfZk3+b8FUViopf0hHE=") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/SB1fjlKrjePoYgeI5heLHGKO9B/jYj+VWGc+iVy") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("cJdA6dN2q3vPDvqKcIipD8nklPxq0qdIEQgmYV9E4qQxsgqnHHIf2Q==") + n2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ynGzBtDvXSlfpQmg4ho12sMpP82b1kn5WPSbg35oMCKzVFbK1vvP+d/cG4Ryaw==") + n3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("i/3FSYKnuIMa0geImSd53FEfaXM77iPYk/F+y2/JpAcXDK2+mfOrtAdA");
    }

    private static /* synthetic */ String Xqedii_27qfa24iozy97(int n, int n2) {
        return n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("0X/huWUFWd1YdkSJ/H4DwB/BmjY5z16WHLcKGYoG") + n2;
    }

    private static /* synthetic */ String Xqedii_3t45wtmugs64f(String string, String string2) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("n/B9Y0suZ+7uIMNhR0gam58BEfZk3+b8FUViopf0hHE=") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/SB1fjlKrjePoYgeI5heLHGKO9B/jYj+VWGc+iVy") + string2;
    }

    private static /* synthetic */ String Xqedii_31cw52u1hvuys(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("55ekjHn3gulE9Xj00xTVfTtDMh5Qws6pXcIZTJ5AbCpxheeX") + string;
    }

    private static /* synthetic */ String Xqedii_24i1z40c9kkri(int n, int n2) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("jzD7D8TnGYSTuMrxSC9Ai3CE/nWEUriwNAN81T6yOxzh5vB6IiBncy8EZX9AxEcGA1x/+L5ntthoHnQnxKgzYOGzhfTAXvPdtPXQ+gkhqVHyjprGdHCtAOV0UCIrB8G2") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2G5ZD6AjLbEoMvuBXjJhkT+CwvrwasLOqggfuD2q") + n2;
    }

    private static /* synthetic */ String Xqedii_xkhorzsnpv0t(int n) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("jzD7D8TnGYSTuMrxSC9Ai3CE/nWEUriwNAN81T6yOxzh5vB6IiBncy8EZX9AxEcGA1x/+L5ntthoHnQnxKgzYOGzhfTAXvPdtPXQ+gkhqVHyjprGdHCtAOV0UCIrB8G2") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("tlBITVGBkEkKIrNzFz+OqxjuYu7y4DZQPObV8IBWif6Gm/n5");
    }

    private static /* synthetic */ String Xqedii_3huuvavewcht7(int n) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("twAa/IyD/V1mI2q6RBLXZVVx1qdiHMWAiPdp/bKL7wVPLU+McZCTdYklhg6str5TIIYQRDvmBaW+4lelZvT4PMRuLaj5V+XsrRFA+6MRpE+f7qBxIBWG+Uhg+HmUXMgS") + n;
    }

    private static /* synthetic */ String Xqedii_28erhsh4jpdzt(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("gS6v2D09m2hyN2B/yUm/cUfkHF+w1PrUXmn6CGvlvP6ZJmqvL0jvMMiFI5ytxw==") + string;
    }

    private static /* synthetic */ String Xqedii_3i4za66ezya8e(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_39vszqugfvb8e(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_3j0o7nbo4ra1l(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("MweHQfwJwhxe6zHyyQWQJJR0jN6w/ptwoHZNDF5C40xpNnqv+kyoSegJ4PQ=");
    }

    private static /* synthetic */ String Xqedii_3r1kn7z7rmvve(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_28fb8cadlu5bc(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_slxf0vqddks7(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("MweHQfwJwhxe6zHyyQWQJJR0jN6w/ptwoHZNDF5C40xpNnqv+kyoSegJ4PQ=");
    }

    private static /* synthetic */ String Xqedii_19l1kzn40ysva(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_1vx7fp46hrypk(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("MweHQfwJwhxe6zHyyQWQJJR0jN6w/ptwoHZNDF5C40xpNnqv+kyoSegJ4PQ=");
    }

    private static /* synthetic */ String Xqedii_3n3u6ja0fvxe8(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_2el7phmxcyk4(String string, String string2, String string3, String string4) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("R0RdEJVPvNfd2xSwxDGNAPbO4VcHdKFZecofSqWPUZJN5g==") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BC/u3wEtPVND0nxlHpQDLQYCbJe6Cl+3OlCzDkO1SNcfSw==") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("rhqWl1zgIML8vJW04mJJce30icgUsdhRKiENNHbMoVj6LQ==") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Hn0hhU33fXYgO+NzkQk1c8yNmf8tfAhpyw16LMqwn+32Cg==") + string4 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("xcbIJwp9jfHlPVe5k/d2x2QAOus60XqYon4fOe3s");
    }

    private static /* synthetic */ String Xqedii_iauefkj776ll(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("gpGesaXepoKgTMnR4UX6hdq+hQ5WiEWvGujTJVk5aQWM3c3BeGuquWw+5zMIEJ51NXszd0nXg3SGFFFkPx2n6FijYrRwEsTMBQ8JbHoHLJTIs8hScsX/ZiKokEyYNDbBF80=") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bIGf5GnKtQRVtVjQwit+JbK+OrcGC9+ytdUokGZoEOe50HZNqCDWYT8J9Qg=") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("e5nLNsXbkxSR1j6EvYMmdPxUV0+HZVQE+rN7D3PVC57X2MJ5TLUVtcay9fP3gse4") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("H+uFIcHO73nORWWkAjl7W9nUZMfxvzWLsp9IrmWBXQPg/n0dCiXLAbyGjR5qqSybvB/xUE4s") + string4 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("l1pj7AcqeKysmXMOp7JkJjczgL8YenOFuzADwtK0/ubAo8BI/q1kLLWoAcSU38zkMltG8w==") + string5 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("lSsAJjSIrd8RRQD4iUxcR8+ZNIS/TjOZ0byqYjpKmxlt1GjhqLTw6upLFYx/xMxT") + string6 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("sHjMgATxycIG9qsywYGO1IhI/2ygJbheEuCPycgVpvjTxaSUykBas/klqWlMcu5+veNGzPZLD4ZFYpFU") + string7 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("9/uXVcDiv5mrtqsPAOoogwZzzeLz2SQeTXDsNEM2mGxQz7BH+6IUgDN04z3AuUYBdg8=") + string8 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BC/u3wEtPVND0nxlHpQDLQYCbJe6Cl+3OlCzDkO1SNcfSw==") + string9 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("rhqWl1zgIML8vJW04mJJce30icgUsdhRKiENNHbMoVj6LQ==") + string10 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Hn0hhU33fXYgO+NzkQk1c8yNmf8tfAhpyw16LMqwn+32Cg==") + string11 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("xcbIJwp9jfHlPVe5k/d2x2QAOus60XqYon4fOe3s");
    }

    private static /* synthetic */ String Xqedii_1h0saf229kqdl(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bPBozjhrBaWR4uf9o2yGqDavKqq+2Vvp7Mlafy1SpZnHdAXjk3mdCUDo3fAFn/4fJVaJrHzFm1u7ym+25uLKBPsRolDmKwSMg4wsSaamT4QSfmglR0kmkH7DvJYDEFCaSszCmOToA1taFxoXzYFuJSsF1PRnGj+wNUBvwmGQXXEfnhqLzBo8OXphV10jtA5QH3CjsxpCG+C142Bufe3QjO81ud0QutVenO39UA==") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("H+uFIcHO73nORWWkAjl7W9nUZMfxvzWLsp9IrmWBXQPg/n0dCiXLAbyGjR5qqSybvB/xUE4s") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("l1pj7AcqeKysmXMOp7JkJjczgL8YenOFuzADwtK0/ubAo8BI/q1kLLWoAcSU38zkMltG8w==") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("TAEL6KldEFFfpNBqvtlsl+D1FO8cT4vm0XNDTRdBfXL8lSYc5j9FUg==") + string4 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YxwnDQj92xEqgK6lJwWkQAIt5Dmts7xEsJ5rj0ublgGOHqVOK/Z51Jz65EO5fg==") + string5 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ffzm0tpMc+25XQwqX+Vn4F5GGX1sTUuABKXzhyznX1I2yNBHYcM+8HYz") + string6 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("n1ZygWjqcgC4ohP1GvCwvupQovKySrYOFUbeFJ0GvwmhnAZxNFYYN9ehPNM=") + string7 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("kriMc/ykB/pkqb0JcxHcQOiyKXmSkOFyYFMaX/9basqcXH3+mL9ubH372kKMfA==") + string8;
    }

    private static /* synthetic */ String Xqedii_1g2fzgdtq4yt1(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("HMPvijcTPIxpW9Ywt2AYQGnl0HZv2hsGHhXvV4nyIMjCabjbCbfVV3Vig3RlLg==");
    }

    private static /* synthetic */ String Xqedii_15bhszhhkpo75(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("HMPvijcTPIxpW9Ywt2AYQGnl0HZv2hsGHhXvV4nyIMjCabjbCbfVV3Vig3RlLg==");
    }

    private static /* synthetic */ String Xqedii_2bhme51mezgvy(String string, String string2, String string3) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("rqMIHftDz8MuzfoOp5QoKw6T5AecSgj4rqcTywXH1R/kqg==") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("BC/u3wEtPVND0nxlHpQDLQYCbJe6Cl+3OlCzDkO1SNcfSw==") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("xcbIJwp9jfHlPVe5k/d2x2QAOus60XqYon4fOe3s");
    }

    private static /* synthetic */ String Xqedii_i00lh7bq4s1y(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("5xgUurK4p3C040E/VmthMNIglMY98LM9FlzCRMRqwZAPVoV/iIJiXK+5QBxVYRfTXIUT4115iguTZPWX8hBcCGTe6FRRct51lqxh0X4tEFEdyG0hud1xIYJA9N0Zx/7n9E6zg6D2B9L4+6T+UdKqUiq967536T5XOzV7idSZuIGK9+ToylB847ULI0cghm0KqhDS+1p7i8qeX1G0tKYlkKp7mbj6OSbqCPGlIg==") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("H+uFIcHO73nORWWkAjl7W9nUZMfxvzWLsp9IrmWBXQPg/n0dCiXLAbyGjR5qqSybvB/xUE4s") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("l1pj7AcqeKysmXMOp7JkJjczgL8YenOFuzADwtK0/ubAo8BI/q1kLLWoAcSU38zkMltG8w==") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("7OwxjSVGiWXHg7L6FakJtJvj4SUKr4+4At6RjF94iu4MaQj3AYM=") + string4 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("HL1eJim5vS7VGb8cyDuJPZWypRJiS7yDkSUA8eg2KhdyUXQkbBdzXyKTUzE=") + string5 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("EpazeG8vHWroKimVOhfpZf7y17EC3iHzHRRmiTpIXVIB9G5irRLGKQ==") + string6 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ij8rqN2vG59qPQdMaifcHvgYqePnpLyMTzEIK+AR8Vg9FZ+9WmcM6Jsn") + string7;
    }

    private static /* synthetic */ String Xqedii_2gpq665dotsb2(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("MweHQfwJwhxe6zHyyQWQJJR0jN6w/ptwoHZNDF5C40xpNnqv+kyoSegJ4PQ=");
    }

    private static /* synthetic */ String Xqedii_1dakhuqttubw(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("PGI2I55CGPglFD+mrJ5K5ju7NtGh7TGCJRmX/IOzMiHsvG3WgAxyCnK0");
    }

    private static /* synthetic */ String Xqedii_wk58b3231ytm(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("R9FKyy5KB2iJ+dUSYVqVtbqMaSjgsftMvAFtuTqY8nIwONMLe6r8Cw==");
    }

    private static /* synthetic */ String Xqedii_3tahu0prutciw(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qAclT0hTA61nQ4rW7P5JsSl8AZeRg0RS4CsD2p4IcRTjm8RIo+HiJ7q2vxkyZQ==");
    }

    private static /* synthetic */ String Xqedii_1mqgt9n4chxkh(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ygqBPVry4czpwrOMtzCShqatD5CWnoXZ0dB7/yROHCwPOkX7Q3fq4B1S");
    }

    private static /* synthetic */ String Xqedii_13ursycqcsrww(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("ztBHsQouh/ksanVEe4g4xmwWwKQYc292rZ1t6HMuIchdzhOcbT4r+UWHBEk=");
    }

    private static /* synthetic */ String Xqedii_3bkm64hiaql0q(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("fPXkhpmpud1NWj1R9zBTMLkQt1xk/Un6/3evacXsFIiOUtoK40U=");
    }

    private static /* synthetic */ String Xqedii_23ylby2cxy489(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("TDfQu3d90wj3+SukovFN3yEdcRrOk5jJQoVCkxPcrgaao4qHVdo=");
    }

    private static /* synthetic */ String Xqedii_3i58xj5gbgry4(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("/5S+9khhuYbXEnq+EQr0/L8Va6BX5V0Um6PbgozyE+CQXSTzESk=");
    }

    private static /* synthetic */ String Xqedii_1w32esd5hviry(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("eOKbYFNu9ExsExOJdYeq+32LwTxRS2+uigsGK0IaQnD1OzeLH3s=");
    }

    private static /* synthetic */ String Xqedii_39pl2trwp63mu(String string, String string2, String string3, int n, String string4) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("LsvX2G9rtZo2EwcV6rQu1mO5W3OZUjNxpFYiFSDNRuorrXgLnlk/ZdwiAX+Oiz0W0bUaXcpthVBLRkoFzm22AhNuXetrWbE7Mcrb1BKPTtK4niI5gjDbnjVcGUCSz0lJ+QFvop1gpx0/h5DNppQ9yuyCSOspOyx2a9EgL4kpiOiPAIRctZChzHPkxgayr3OV7hqQ3zR2UZK6pBOTGYVMS1ijYWAhuXvuKHhispwRo08wSNjMwXrqGLE+") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("H+uFIcHO73nORWWkAjl7W9nUZMfxvzWLsp9IrmWBXQPg/n0dCiXLAbyGjR5qqSybvB/xUE4s") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("l1pj7AcqeKysmXMOp7JkJjczgL8YenOFuzADwtK0/ubAo8BI/q1kLLWoAcSU38zkMltG8w==") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("Cd3B6lRJ9hhXwlXQzwowwv2WP3BpRBgOMe7OdyBc1WwldgPziEvV+2nmdi3PER5t") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("fOOSHVVbTwtolnCdrwl9H1onA4jnkLD0rsSd3DOwTEP4boLxFCWDnTd9UTo=") + string4;
    }

    private static /* synthetic */ String Xqedii_1wus3bs38l2bl(String string, int n, int n2, String string2, String string3) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("shNRnnWBV6MGyHHX6FGGKi8Sdfw/oCOkNBriXKPIL6rbglR+5Z3qOcyqxvisVkF2Fc73Jtt4") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("YjlyRgWWLA8qPOW7pWb+mWrQtsgoZZHvsKufrnAq+yLqgSKbSJtBss4qwpgp98fLNqo6d9Qfz7fEP1Tq5tQSlCvEMXzzWw==") + n2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("uJ8D8pLMqY6WZH4JJImIC04yWUEjWg/HRnlIYTsd4g/PZcYkmF8jTyD7YX70gdTb") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bIGf5GnKtQRVtVjQwit+JbK+OrcGC9+ytdUokGZoEOe50HZNqCDWYT8J9Qg=") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("rvx9gPWhEhQVEQb8ojK2c79QcPZJo2sDulOxv7GD");
    }

    private static /* synthetic */ String Xqedii_2pei66ypozvph(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj");
    }

    private static /* synthetic */ String Xqedii_28fuyekpfff35(int n, int n2) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("G5UG/OsyiLJLmdlrLn6g34MBdr2YajI2Yn81OpTrdVMwR15J6fnD35LcRE9tdoOE/cVXglBL4WOQR9j+V/p5+0cuyEnxD8LW73A=") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("bfvcJm2QEWfkULd/dt6qNYVeVTcM0u37KM5HWbaoFBaJymjZMFYrkneVPecKUWAzSMs=") + n2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("lR9N34KgNJrkjl7xcZ9YZYbk/JhSs7x4zrmpRqH25LaVhGfcWJ9vHE0Nbj9BQbDnGmLE5CR+/ONOMV0fzhWZgQFJi8mOaIzM4UdQ3wqSHxlFqW/XMaQQdbBUNho=");
    }

    private static /* synthetic */ String Xqedii_1bfxrcphmpwtr(int n, int n2) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("G5UG/OsyiLJLmdlrLn6g34MBdr2YajI2Yn81OpTrdVMwR15J6fnD35LcRE9tdoOE/cVXglBL4WOQR9j+V/p5+0cuyEnxD8LW73A=") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("qCB2z40NRn7xnvYcslg11pFa3hBFp+FdroBRe2bhgKaUAv2HEHdiK32BW/Rbv6oQ0NlpSoGk") + n2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("vw6lgfj+E1hIUQYmbm5924tgDw776tp3iQocm9N+9faKSxs8kgKLP3CfcobAZkoU6lY8XD+huh8Cg0u0Vlryda8qDiO5Hj0DNexGA/wnGS3RZ5y/2llMLX7Ghh5TAsKtRew=");
    }

    private static /* synthetic */ String Xqedii_26nb7xmdpbj(int n, int n2) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("G5UG/OsyiLJLmdlrLn6g34MBdr2YajI2Yn81OpTrdVMwR15J6fnD35LcRE9tdoOE/cVXglBL4WOQR9j+V/p5+0cuyEnxD8LW73A=") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("q9umkJyXg0B+NWBX4zj8QfkpZvtbmB99Jwjlz1GNZXieBt8Gn/4hmZCKCyI=") + n2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RB5SgUpr7YMp4D1dNb8gBc6ZK0ygG4N2QZVKrTxewJggZKm4Rq4ke3GcRz3KSiWe9zDRLqALsRNvokqwWSJlItOeQqB/KjQnWk06dln51H46U+Qc6skcuU5Ql3LuYUgbXso0+mwa");
    }

    private static /* synthetic */ String Xqedii_3evtqfwoszc7t(int n, int n2) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("G5UG/OsyiLJLmdlrLn6g34MBdr2YajI2Yn81OpTrdVMwR15J6fnD35LcRE9tdoOE/cVXglBL4WOQR9j+V/p5+0cuyEnxD8LW73A=") + n + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("q9umkJyXg0B+NWBX4zj8QfkpZvtbmB99Jwjlz1GNZXieBt8Gn/4hmZCKCyI=") + n2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("DcTZzi3ifY86tIWxvx/Kou9jrAAiKV2IZJy232O1ch3vUrhyqrirvFJG8vfNfWyzzwU6OeJOk0vyNQ518CzQpMiajTgOYvCFn7HFCmsY");
    }

    private static /* synthetic */ String Xqedii_3s731rmihpc9s(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj");
    }

    private static /* synthetic */ String Xqedii_3n61m4k4qg297(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("lvSA9GNsK/RPVOqO/j5g72Od8QsMWpZ2EtUg7HkchZdB/0Yc0dVLCZztjGI7P9yYuFt14pxgFMHE2m774Il9i1+jL83sXai98mR1XICWhyOL7UgZWH0iYjjoa6zIOdMblkXVPRQ6Lp1On9qEnbjhvk5AU1Ki9mWS1JZi9GCPUAZ7TF7uAL5ZQusCZRW1VubuKrLlLNhpc93kjd5SXuAXgqx1RCio4hmuJrwG1Qs+") + string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("AwFy/zqzEMoHFHzteraBnyzHPlgbndGTaUwbG3+AxGfs2yUu0H61FLR3GyF788gmq8WdP7FEx+A=") + string2 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("jc971yIFhZkQw9oX1MSGUXPtrz0bo1iSrLZKZY6YlD+yCLXSHGYIM0L+vfEG0fAq3V2AWHAc55zIEoOKDtNTlade") + string3 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("2VmYdrnRW9I0/9LOM7pJR9BhEAS2fZ+OZtHtTXhz8GK9kXkNJUgKf4u6fvt/IcA+5Rgm3vE1gZZdIP0lCOELWQ==") + string4 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("oKkSkRLKhE00Ua+KoJ3wlJJ7pIXfZenu1PrFoNmqfYSmxFhBjARndLUGk8APFGk242RfoDw33c6+KXr4") + string5 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("H+uFIcHO73nORWWkAjl7W9nUZMfxvzWLsp9IrmWBXQPg/n0dCiXLAbyGjR5qqSybvB/xUE4s") + string6 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("l1pj7AcqeKysmXMOp7JkJjczgL8YenOFuzADwtK0/ubAo8BI/q1kLLWoAcSU38zkMltG8w==") + string7 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("lSsAJjSIrd8RRQD4iUxcR8+ZNIS/TjOZ0byqYjpKmxlt1GjhqLTw6upLFYx/xMxT") + string8 + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("yoIT0dcp696y93pGKWKkt2Xs9oWWVHeX1JgMVuZWHjo6c8FOfmLf9tfyDE+/uWrM3uPvOg==") + string9;
    }

    private static /* synthetic */ String Xqedii_hg29zr5s4nbv(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj");
    }

    private static /* synthetic */ String Xqedii_2xkd0cf0kve0n(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_1m3mdwpwy44co(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL");
    }

    private static /* synthetic */ String Xqedii_bjxhcpq5o1kj(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("TtIqFXNPWqVAX6um1oVLl09UolbuEC933NzdSEUARz0xzp8HZ+4MVZVgeGlZjzgQg1jDyIHHAWs=") + string;
    }

    private static /* synthetic */ String Xqedii_2nr8syuc4djim(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("TtIqFXNPWqVAX6um1oVLl09UolbuEC933NzdSEUARz0xzp8HZ+4MVZVgeGlZjzgQg1jDyIHHAWs=") + string;
    }

    private static /* synthetic */ String Xqedii_2x30h60rmugzq(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL");
    }

    private static /* synthetic */ String Xqedii_116svtrk4hoiw(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL");
    }

    private static /* synthetic */ String Xqedii_2pxa22luznjqb(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("TtIqFXNPWqVAX6um1oVLl09UolbuEC933NzdSEUARz0xzp8HZ+4MVZVgeGlZjzgQg1jDyIHHAWs=") + string;
    }

    private static /* synthetic */ String Xqedii_oelmhf3s954m(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL");
    }

    private static /* synthetic */ String Xqedii_2umr6a5o1ttnm(String string) {
        return Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("TtIqFXNPWqVAX6um1oVLl09UolbuEC933NzdSEUARz0xzp8HZ+4MVZVgeGlZjzgQg1jDyIHHAWs=") + string;
    }

    private static /* synthetic */ String Xqedii_2ms7lbfx4ykhq(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL");
    }

    private static /* synthetic */ String Xqedii_201vqmnpl9si5(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("RrEqXEsUbKiIW2sKKlkAOQHajvwgMMmiNHiYfrkL");
    }

    private static /* synthetic */ String Xqedii_2gj6b2j53lky2(String string) {
        return string + Xqedii_2j3b4yz.Xqedii_2s06c5b6ujpcs("mkYsqqLe/An1DSDFtDu+a40FmE0Qm8hAhVwC2vzDsytV3uyOEmq2z4lx/A0dOBCj");
    }
}
