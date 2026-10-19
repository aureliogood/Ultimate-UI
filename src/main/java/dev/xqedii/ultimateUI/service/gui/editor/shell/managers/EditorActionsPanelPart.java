package dev.xqedii.ultimateUI.service.gui.editor.shell.managers;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1ks01f9;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3gdqlgv;
import dev.xqedii.ultimateUI.Xqedii_ghjfcat;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.model.EditorPropertyField;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorSidebarTab;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay.TextAlignment;

public abstract class EditorActionsPanelPart extends EditorSidebarShellPart {
   public static final String Xqedii_1nlouxbvbhpbz = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public EditorActionsPanelPart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean setTargetRotation(EditorSession var1, String var2, double var3) {
      if (((-1128163450 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var5 = this.resolveRawTargetByTargetId(var1, var2);
         if (var5 == null) {
            return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 18) != 0);
         } else if (this.isRoundedRawTarget(var5, this.findFirstByTargetId(var1, var2))) {
            return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(746251228, 1) != 0);
         } else {
            var3 = this.snap1(this.normalizeSidebarRotation(var3));
            String var6 = var5.containsKey(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fhn17ihLvGupNdqi09fujHYT/BVFhWcaqRUI3FAk0nDiG1SV3QDFJhE9PnU="))
               ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fhn17ihLvGupNdqi09fujHYT/BVFhWcaqRUI3FAk0nDiG1SV3QDFJhE9PnU=")
               : (
                  var5.containsKey(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Z10ZgQce2Lc1i8DS11VxVH/SLFj/DhVJjPHfkZNGuYXdrLGjPK9+3A=="))
                     ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Z10ZgQce2Lc1i8DS11VxVH/SLFj/DhVJjPHfkZNGuYXdrLGjPK9+3A==")
                     : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fhn17ihLvGupNdqi09fujHYT/BVFhWcaqRUI3FAk0nDiG1SV3QDFJhE9PnU=")
               );
            double var7 = this.readMapPathDouble(var5, var6, Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 10)));
            if (Math.abs(var7 - var3) < Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(491874758395532689L, 52))) {
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 11) != 0);
            } else {
               this.setMapPathValue(var5, var6, var3);
               return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 8) != 0);
            }
         }
      }
   }

   @Override
   public boolean setTargetOpacity(EditorSession var1, String var2, int var3) {
      if ((714782474 ^ 714782474) != 0) {
         throw new IllegalStateException();
      } else {
         String var4 = this.resolveRawTargetPathByTargetId(var1, var2);
         if (var4.isBlank()) {
            return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1492502456, 2) != 0);
         } else {
            Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4);
            if (var5 == null) {
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 19) != 0);
            } else {
               LinkedHashSet var6 = new LinkedHashSet();
               if (this.isRawTargetInheritedRoot(var5)) {
                  this.collectImageGroupLayerTargets(var5, var6);
               } else {
                  var6.add(var5);
               }

               if (var6.isEmpty()) {
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1202129465, 26) != 0);
               } else {
                  int var7 = Math.max(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 1), Math.min(Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704214533, 3), var3));
                  int var8 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 17);

                  for (Object var10_obj : var6) {
                  Map var10 = (Map)var10_obj;
                     if (var10 != null && !var10.isEmpty()) {
                        int var11 = (int)Math.round(
                           this.readMapPathDouble(
                              var10,
                              Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("UwkZWa2fvqmSGfURV9N74DBYxNt85Wot057zkpIdUbq1JWzeTvJhzdq9"),
                              Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3819390446229726293L, 58))
                           )
                        );
                        if (var11 != var7) {
                           this.setMapPathValue(var10, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("UwkZWa2fvqmSGfURV9N74DBYxNt85Wot057zkpIdUbq1JWzeTvJhzdq9"), var7);
                           var8 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1091181189, 23);
                        }
                     }
                  }

                  return (var8 != 0);
               }
            }
         }
      }
   }

   @Override
   public boolean setTargetColor(EditorSession var1, String var2, String var3) {
      if ((1779511159 * 1779511159 + 1779511159 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var4 = this.findFirstByTargetId(var1, var2);
         if (var4 != null && var4.targetPath != null && !var4.targetPath.isBlank()) {
            Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4.targetPath);
            if (var5 == null) {
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 14) != 0);
            } else {
               String var6 = this.normalizeHexColor(var3);
               if (var6.isBlank()) {
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 23) != 0);
               } else {
                  String var7;
                  if (this.hasMapPath(var5, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7Ivi7kLBNlMNy9fQKgh4I5gg+NFI00vF7Uevt1gRN4/1jHBt+f8="))) {
                     var7 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7Ivi7kLBNlMNy9fQKgh4I5gg+NFI00vF7Uevt1gRN4/1jHBt+f8=");
                  } else if (this.hasMapPath(var5, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XgleY9mDnu7oX+lkDH/Dd1RwDLUc+83//87qjE354Sn9w4KQmnOLUQC93fUxxRNEn0E="))
                     )
                   {
                     var7 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XgleY9mDnu7oX+lkDH/Dd1RwDLUc+83//87qjE354Sn9w4KQmnOLUQC93fUxxRNEn0E=");
                  } else if (this.hasMapPath(
                     var5, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("x+G0paRjwtc9E7HdWvnFJpMB5XLTJJtRDkfXZALiHOtRHWz7BpTcOgYYkVepB8DPUgzzvg==")
                  )) {
                     var7 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("x+G0paRjwtc9E7HdWvnFJpMB5XLTJJtRDkfXZALiHOtRHWz7BpTcOgYYkVepB8DPUgzzvg==");
                  } else if (this.hasMapPath(
                     var5, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Iby4VsPqUCLlkcT5OlsS7SxAaVmqbcJ9SeO0JVAAxq0o0sYOyW6pJx2erZoIaZHRjfy2CgKMQUbGAFYzDqOfMg==")
                  )) {
                     var7 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Iby4VsPqUCLlkcT5OlsS7SxAaVmqbcJ9SeO0JVAAxq0o0sYOyW6pJx2erZoIaZHRjfy2CgKMQUbGAFYzDqOfMg==");
                  } else {
                     var7 = var5.containsKey(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("n6oK8IrIqJNztPmSLV63etgyjiOm7WQL9EX3VQQKjFZWC3D5HTS9+g=="))
                        ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("x+G0paRjwtc9E7HdWvnFJpMB5XLTJJtRDkfXZALiHOtRHWz7BpTcOgYYkVepB8DPUgzzvg==")
                        : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7Ivi7kLBNlMNy9fQKgh4I5gg+NFI00vF7Uevt1gRN4/1jHBt+f8=");
                  }

                  String var8 = this.normalizeHexColor(this.stringValue(this.readMapPathValue(var5, var7)));
                  if (var8.isBlank()) {
                     var8 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Ng9hJMqddFLI7ZB0m73+974eMBvbZJkx6+VuFKlzBwWeYOXBCzd3Og==");
                  }

                  if (var8.equalsIgnoreCase(var6)) {
                     return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 16) != 0);
                  } else {
                     this.setMapPathValue(var5, var7, var6);
                     if (this.isRawTargetOutlineColorAuto(var5)) {
                        this.applyRoundedCornerUnicodeColor(var5, var6);
                     }

                     return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 9) != 0);
                  }
               }
            }
         } else {
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 6) != 0);
         }
      }
   }

   @Override
   public boolean setTargetHoverColor(EditorSession var1, String var2, String var3) {
      if ((2066995607 * 2066995607 + 2066995607 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var4 = this.findFirstByTargetId(var1, var2);
         if (var4 != null && var4.targetPath != null && !var4.targetPath.isBlank()) {
            Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4.targetPath);
            if (var5 == null) {
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 25) != 0);
            } else {
               String var6 = this.normalizeHoverColorSettingToken(var3);
               String var7 = this.resolveTargetHoverColorWritePath(var5);
               String var8 = this.stringValue(this.readMapPathValue(var5, var7));
               String var9 = this.normalizeHoverColorSettingToken(var8);
               if (this.equalsNullable(var9, var6)) {
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 7) != 0);
               } else {
                  this.setMapPathValue(var5, var7, var6);
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1960920841, 31) != 0);
               }
            }
         } else {
            return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1889764475, 6) != 0);
         }
      }
   }

   public boolean setTargetHoverEffect(EditorSession var1, String var2, String var3) {
      if ((1678796550 * 1678796550 - 1678796550 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var4 = this.findFirstByTargetId(var1, var2);
         if (var4 != null && var4.targetPath != null && !var4.targetPath.isBlank()) {
            Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4.targetPath);
            if (var5 == null) {
               return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2036248478, 5) != 0);
            } else {
               String var6 = this.normalizeHoverEffectId(var3);
               String var7 = this.resolveTargetHoverEffectWritePath(var5);
               String var8 = this.stringValue(this.readMapPathValue(var5, var7));
               String var9 = this.normalizeHoverEffectId(var8);
               if (this.equalsNullable(var9, var6)) {
                  return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1582803944, 3) != 0);
               } else {
                  this.setMapPathValue(var5, var7, var6);
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 31) != 0);
               }
            }
         } else {
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 11) != 0);
         }
      }
   }

   public boolean setTargetBorderRadiusMode(EditorSession var1, String var2, String var3) {
      if ((1857480276 * (1857480276 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var4 = this.findFirstByTargetId(var1, var2);
         if (var4 != null && var4.targetPath != null && !var4.targetPath.isBlank()) {
            Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4.targetPath);
            if (var5 == null) {
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(373125614, 0) != 0);
            } else {
               String var6 = this.resolveRawTargetType(var5, var4);
               if (!this.isBorderRadiusApplicableType(var6)) {
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 15) != 0);
               } else {
                  boolean var7 = this.isInputType(var6);
                  String var8 = this.normalizeSidebarBorderRadiusMode(var3);
                  boolean var9 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(518087639, 20) != 0;
                  if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF").equals(var8)) {
                     if (!var7) {
                        var9 |= this.setMapPathStringValue(
                           var5,
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"),
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("yU7TBTjzAq2Us/SdmAhdOuH0sIcCFhkXxieJYxUlAIHX9rgJF/Q=")
                        );
                     }

                     return var9
                        | this.setMapPathStringValue(
                           var5,
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("y/ZtrB1oR0MVo3CExvSXL8gzSJH70pFSTE9hb9EDsN97T+Eim7Jwel20OaE="),
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wepO7mch9W2D8+bF1tR78S+vI2xQFvpTjWz/e5nDl11t+wYh")
                        );
                  } else {
                     if (!var7) {
                        var9 |= this.setMapPathStringValue(
                           var5,
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"),
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("l79k1Z+CO4oMPuEHMuAkn93hz6+mtw2RxIXVsBn4ro0q/4dPChXJglqP")
                        );
                     }

                     var9 |= this.setMapPathStringValue(
                        var5,
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("y/ZtrB1oR0MVo3CExvSXL8gzSJH70pFSTE9hb9EDsN97T+Eim7Jwel20OaE="),
                        this.serializeSidebarBorderRadiusMode(var8)
                     );
                     String var10 = this.readRawTargetOutlineColor(var5);
                     String[] var11 = this.resolveBorderRadiusGlyphSet(var8);

                     for (int var12 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1099569797, 23); var12 < Xqedii_3gdqlgv.Xqedii_219lyve.length; var12++) {
                        String var13 = Xqedii_3gdqlgv.Xqedii_219lyve[var12];
                        String var10000;
                        if (var11 != null && var12 < var11.length) {
                           String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216061, 9)];
                           var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 1)] = var11[var12];
                           var10000 = this.firstNonBlank(var10001);
                        } else {
                           var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
                        }

                        String var14 = var10000;
                        if (var14.isBlank()) {
                           var14 = this.stripRoundedCornerColorTags(this.readRoundedCornerUnicodeByKey(var5, var13));
                        }

                        if (!var14.isBlank()) {
                           String var15 = this.formatRoundedCornerUnicodeWithColor(var10, var14);
                           var9 |= this.setMapPathStringValue(var5, this.resolveRoundedCornerUnicodeWritePath(var13), var15);
                        }
                     }

                     return var9;
                  }
               }
            }
         } else {
            return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 30) != 0);
         }
      }
   }

   @Override
   public void updateEditorDesignSidebar(Player var1, EditorSession var2) {
      if ((-371393651 * (-371393651 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.syncDesignSidebarPanelVisibility(var1, var2);
         if (this.isItemDesignSidebarMode(var2)) {
            this.syncDesignTextAlignControlsVisibility(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4) != 0));
            this.updateEditorItemDesignSidebar(var1, var2);
         } else {
            boolean var3 = this.isTextDesignSidebarMode(var2);
            this.syncDesignTextAlignControlsVisibility(var1, var2, var3);
            List<String> var4 = this.getSelectedTargetIds(var2);
            if (var4.isEmpty()) {
               this.setDesignSidebarValues(
                  var1,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
               );
               this.setDesignTextAlignSidebarValue(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="));
               this.setDesignTextWrapSidebarValue(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="));
            } else {
               String var5 = null;
               String var6 = null;
               Integer var7 = null;
               String var8 = null;
               String var9 = null;
               String var10 = null;
               String var11 = null;
               int var12 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 10);
               int var13 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 6);
               int var14 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944219915, 18);
               int var15 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1675042529, 4);
               int var16 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4);
               int var17 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 9);
               int var18 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1492502456, 2);

               for (String var20 : var4) {
                  String var21 = this.formatSidebarHexValue(this.readTargetColor(var2, var20));
                  if (var5 == null) {
                     var5 = var21;
                  } else if (!this.equalsNullable(var5, var21)) {
                     var12 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 0);
                  }

                  String var22 = this.readTargetRadiusLabel(var2, var20);
                  String var23 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF").equals(var22)
                     ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("J+2HJvIvT+IJkQTwQVcz4yjkt/MhbgavmFVF9CbCMiymwpsU1XI=")
                     : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Tve1I5BbNx1e5T/g0GT7BdsVxm9bpOIRrJKUltwLGHXIxfW2loVDygci");
                  if (var6 == null) {
                     var6 = var23;
                  } else if (!this.equalsNullable(var6, var23)) {
                     var13 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-980460421, 30);
                  }

                  int var24 = this.readTargetOpacity(var2, var20);
                  if (var7 == null) {
                     var7 = var24;
                  } else if (var7 != var24) {
                     var14 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703167997, 20);
                  }

                  if (var8 == null) {
                     var8 = var22;
                  } else if (!this.equalsNullable(var8, var22)) {
                     var15 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1474215088, 20);
                  }

                  String var25 = this.readTargetOutlineSidebarValue(var2, var20);
                  if (var9 == null) {
                     var9 = var25;
                  } else if (!this.equalsNullable(var9, var25)) {
                     var16 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-735442864, 10);
                  }

                  String var26 = this.formatSidebarHoverColorValue(this.readTargetHoverColor(var2, var20));
                  if (var10 == null) {
                     var10 = var26;
                  } else if (!this.equalsNullable(var10, var26)) {
                     var17 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 27);
                  }

                  String var27 = this.formatSidebarHoverEffectValue(this.readTargetHoverEffect(var2, var20));
                  if (var11 == null) {
                     var11 = var27;
                  } else if (!this.equalsNullable(var11, var27)) {
                     var18 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1889764411, 6);
                  }
               }

               String var10000;
               if (var12 != 0) {
                  var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else {
                  String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1972652029, 27)];
                  var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1652990288, 29)] = var5;
                  var10001[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342918991, 11)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
                  );
                  var10000 = this.firstNonBlank(var10001);
               }

               String var36 = var10000;
               if (var13 != 0) {
                  var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else {
                  String[] var50 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(339020417, 0)];
                  var50[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 16)] = var6;
                  var50[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 13)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
                  );
                  var10000 = this.firstNonBlank(var50);
               }

               String var37 = var10000;
               String var38;
               if (var14 != 0) {
                  var38 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else if (var7 == null) {
                  var38 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               } else {
                  var38 = Xqedii_d58q5t4hwc7u(Math.round(this.opacityRawToPercent(var7.intValue())));
               }

               if (var15 != 0) {
                  var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else {
                  String[] var51 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(93281404, 30)];
                  var51[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-735441840, 10)] = var8;
                  var51[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 31)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF"
                  );
                  var10000 = this.firstNonBlank(var51);
               }

               String var39 = var10000;
               if (var16 != 0) {
                  var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else {
                  String[] var52 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(23320351, 28)];
                  var52[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1911428669, 16)] = var9;
                  var52[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2036248510, 5)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
                  );
                  var10000 = this.firstNonBlank(var52);
               }

               String var40 = var10000;
               if (var17 != 0) {
                  var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else {
                  String[] var53 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1911559741, 16)];
                  var53[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(186562807, 31)] = var10;
                  var53[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216061, 9)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF"
                  );
                  var10000 = this.firstNonBlank(var53);
               }

               String var41 = var10000;
               if (var18 != 0) {
                  var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
               } else {
                  String[] var54 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1737771005, 24)];
                  var54[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-150266184, 23)] = var11;
                  var54[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1706313725, 21)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF"
                  );
                  var10000 = this.firstNonBlank(var54);
               }

               String var42 = var10000;
               String var43 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               String var44 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               if (var3) {
                  TextAlignment var28 = null;
                  int var29 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 26);
                  Integer var30 = null;
                  int var31 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 11);

                  for (String var33 : var4) {
                     if (this.isSidebarTextDesignTarget(var2, var33)) {
                        TextAlignment var34 = this.readTargetTextAlignment(var2, var33);
                        if (var28 == null) {
                           var28 = var34;
                        } else if (var28 != var34) {
                           var29 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1356081672, 2);
                        }

                        int var35 = this.readTargetTextWrapLineWidth(var2, var33);
                        if (var30 == null) {
                           var30 = var35;
                        } else if (var30 != var35) {
                           var31 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216574, 0);
                        }
                     }
                  }

                  if (var29 != 0) {
                     var43 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
                  } else {
                     var43 = this.formatSidebarTextAlignment(var28);
                  }

                  if (var31 != 0) {
                     var44 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
                  } else if (var30 != null) {
                     var44 = String.valueOf(var30);
                  }
               }

               this.setDesignSidebarValues(var1, var36, var37, var38, var39, var40, var41, var42);
               this.setDesignTextAlignSidebarValue(var1, var43);
               this.setDesignTextWrapSidebarValue(var1, var44);
            }
         }
      }
   }

   public void updateEditorItemDesignSidebar(Player var1, EditorSession var2) {
      if (((-321945717 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List<String> var3 = this.getSelectedTargetIds(var2);
         if (var3.isEmpty()) {
            this.setItemDesignSidebarValues(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
            );
         } else {
            String var4 = null;
            Boolean var5 = null;
            String var6 = null;
            int var7 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 16);
            int var8 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 16);
            int var9 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-513550562, 28);

            for (String var11 : var3) {
               if (!this.isSidebarItemDesignTarget(var2, var11)) {
                  var7 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1470885727, 11);
                  var8 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2024926095, 27);
                  var9 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1353195843, 12);
               } else {
                  String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812948603, 15)];
                  var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 3)] = this.readTargetItemToken(var2, var11);
                  var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704224765, 13)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
                  );
                  String var12 = this.firstNonBlank(var10001);
                  if (var4 == null) {
                     var4 = var12;
                  } else if (!this.equalsNullable(var4, var12)) {
                     var7 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 16);
                  }

                  boolean var13 = this.readTargetItemGlowing(var2, var11);
                  if (var5 == null) {
                     var5 = var13;
                  } else if (var5 != var13) {
                     var8 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-735442864, 10);
                  }

                  String var14 = this.formatSidebarHoverEffectValue(this.readTargetHoverEffect(var2, var11));
                  if (var6 == null) {
                     var6 = var14;
                  } else if (!this.equalsNullable(var6, var14)) {
                     var9 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704224765, 13);
                  }
               }
            }

            String var10000;
            if (var7 != 0) {
               var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
            } else {
               String[] var19 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703954429, 17)];
               var19[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 10)] = var4;
               var19[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216541, 5)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
               );
               var10000 = this.firstNonBlank(var19);
            }

            String var15 = var10000;
            String var16;
            if (var8 != 0) {
               var16 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
            } else if (var5 == null) {
               var16 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
            } else {
               var16 = var5
                  ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("PhOjJ3AJOfKW27J2htLlX3MnYW1/97cy5q+aTwUlk2CRvboKwTexzSQM")
                  : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("uASvlek793g2SLAM9u4Ighd2Rlmkh9Hj5COdQbnoY7jDixDt+oKtSiOCyG8=");
            }

            if (var9 != 0) {
               var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
            } else {
               String[] var20 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191703778, 15)];
               var20[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1977973439, 31)] = var6;
               var20[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1091181189, 23)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF"
               );
               var10000 = this.firstNonBlank(var20);
            }

            String var17 = var10000;
            this.setItemDesignSidebarValues(var1, var15, var16, var17);
         }
      }
   }

   public void syncDesignSidebarPanelVisibility(Player var1, EditorSession var2) {
      if ((-958571401 * -958571401 - -958571401 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.rightSidebarTab == EditorSidebarTab.DESIGN) {
         String var3 = this.resolveDesignTabPanelId(var2);
         this.setSidebarPanelVisible(
            var1,
            var2,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("AE/8KJZRY6aqOcejv8ydkk0bdIYFw6uToAyt69qsF6Ucsj0eIKwEtg=="),
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("AE/8KJZRY6aqOcejv8ydkk0bdIYFw6uToAyt69qsF6Ucsj0eIKwEtg==").equals(var3)
         );
         this.setSidebarPanelVisible(
            var1,
            var2,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("OJmYWBx6OPWSgxh8mGXuBwaXwzFWJrxoMX6n/CUIpDi8rriX1tMLQ/bU6wHegMpXbpg="),
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("OJmYWBx6OPWSgxh8mGXuBwaXwzFWJrxoMX6n/CUIpDi8rriX1tMLQ/bU6wHegMpXbpg=").equals(var3)
         );
      }
   }

   public String formatSidebarHoverEffectValue(String var1) {
      if ((1829754974 ^ 1829754974) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.normalizeHoverEffectId(var1);
         if (!var2.isBlank() && !Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wepO7mch9W2D8+bF1tR78S+vI2xQFvpTjWz/e5nDl11t+wYh").equals(var2)) {
            YamlConfiguration var3 = this.resolveHoverEffectConfiguration(var2);
            String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-2001605745, 27)];
            var10001[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1888439829, 19)] = var3 == null
               ? null
               : var3.getString(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF"));
            var10001[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1911494205, 16)] = var3 == null
               ? null
               : var3.getString(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qr0am2h8Y62sXExkKhd4OsUAwSP/RBQLadMxcX7EOihgm6WdsCArRZ1e"));
            var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1838434301, 26)] = var2;
            String var4 = this.firstNonBlank(var10001);
            String[] var5 = var4.replace((char)Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216530, 0), (char)Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981147, 5))
               .replace((char)Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1167023251, 30), (char)Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216575, 28))
               .trim()
               .split(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("PCGqhcF8wXcUUaQpywoBFRCv6jrFlBH4FvT7Bhx6wzTvuA=="));
            StringBuilder var6 = new StringBuilder();
            String[] var7 = var5;
            int var8 = var5.length;

            for (int var9 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 17); var9 < var8; var9++) {
               String var10 = var7[var9];
               if (var10 != null && !var10.isBlank()) {
                  if (!var6.isEmpty()) {
                     var6.append((char)Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704215549, 5));
                  }

                  String var11 = var10.toLowerCase(Locale.ROOT);
                  var6.append(Character.toUpperCase(var11.charAt(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 27))))
                     .append(var11.substring(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-490230211, 29)));
               }
            }

            return var6.isEmpty() ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF") : var6.toString();
         } else {
            return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF");
         }
      }
   }

   public void setDesignSidebarValues(Player var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      if ((-1091542401 * -1091542401 - -1091542401 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "0M80P6rGlQ95c7FgewOWr14bIVW8U/XdRB9l6ac4ElasviuisJYQnzyNtLGkyod1JyEj6MN2BDHgyPNYBPwiD6eBJQnvR10Whwx/1OL+/bF3UhBa"
         );
         String[] var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(72406058, 26)];
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 9)] = var2;
         var10004[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1346537121, 21)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "734OyDgJcm0KvV4u+HspMLibFfOKxg18ZbCN9S6nyhs68IqW36SEmfl2dDq+24XmV93pPg6yxWmnA4GJx2c1ZyEFn4EdsnU3/ie1unuyMB7vsY7n"
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1353191747, 12)];
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 15)] = var3;
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1675042545, 4)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "9r1vS49nG0ruq2Zql5wkYmft18U2zx5GL8nwhKxMakbFPheJRY7JBsdCEAfQgMMrW/gl3kCWGiGMG9AHUPe827iSIGA1KXicvQxJjhsrKRLlBpki5kHNcg=="
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1821369979, 23)];
         var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 25)] = var4;
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944882206, 5)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "npXdRgV9jthpod6E0Z/T68tZB4wZtbKY1i96PcQmfoii53skifJZgvcSRMK3fI/Nhcrws0Oe5nImKahncwViq/386Fl1IjHhGyc3AXbZZvChjVtrawTsGsOP"
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(36203029, 25)];
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 16)] = var5;
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-283755151, 24)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "L3E1gzlzKOCOQVcidBNwmMZF21+Pt1JPRX/aIYlowyR6IP1BJFHGoik5aLF7t0N2TUHJGTE0IoaEQpZQ7Mm05dSVIJQmzoDvuGCC5WDPtOy4EgAdnnzlhA=="
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812973179, 13)];
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1202129465, 26)] = var6;
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-141877576, 23)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "sLRPxuO45XDA+zdpB3p/S9kYsaFRXmaOI4NUw7gJlNatqUFQneYL/z6WsQcDb6iqfnauU55PdthW02KT+hvxa5aw0weF1R1I4e3IIxjVHYKt3QGuOI0="
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1309962368, 3)];
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 16)] = var7;
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 11)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "4Q6LOK6qrxMLFBLFS9y8VoVwfxQUrhg+wdQNP9bGzlZOmQr/S9MBJrllpQwWI0Dl4rw/N9vkaXkXRsVgt5J3xpbeavqYeQz1HzYsM1hBYVAIffDviV8LFw=="
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(889880852, 8)];
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1202129465, 26)] = var8;
         var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216445, 7)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
      }
   }

   public void setItemDesignSidebarValues(Player var1, String var2, String var3, String var4) {
      if ((1779135869 * 1779135869 - 1779135869 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "LhCxNN5rme1GNiDtN7FELaMXZj/du82IGt2+CRCV9jVSQJdMBmLoT5Ue8ix60jDcOgRIny1GDGh1NyirAOvRjUOvkAv+bRL6i2Pds/5EabnqAQ=="
         );
         String[] var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1117799693, 14)];
         var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1036175278, 21)] = var2;
         var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704249341, 15)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
         );
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "rpHyrP0XrVIO1NwH8MXW3PlR0aEPJFmTGSFf4LsTHJoAzQihnIH+Md12o9vuNuI/rAeziAM67mK/Q5w+xaICELnadI9phD+CXwu5LLoZnu5HXA/RM+OYRA=="
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812983419, 11)];
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 31)] = var3;
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 21)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
         var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "kMRBzmpgfb6uWbPXlN7BV55clC+r+YB5e2LhBNip7tgiWTuX9fArYdJWtNXDN80PQRlECBie8FlFldL6RGdoCTjy3N8hXL1knP8wwWqUH9hohrz0kLQ1SpONzLGdmknJ"
         );
         var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(339020417, 0)];
         var10004[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-735441840, 10)] = var4;
         var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1695827965, 23)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF"
         );
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
      }
   }

   public void setDesignTextAlignSidebarValue(Player var1, String var2) {
      if ((829952243 * 829952243 - 829952243 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "z73wkO8j8mQ7NwSbHjAuomosg5eWVNdmFga3sGF3WCU8aTZQ8bRDdaqLW1WznphsfKPv5Lb8a06gVFlowdRWxEUXIRCnKsRPNN1Ps4ttG9bt06Yk"
         );
         String[] var10004 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2080739164, 22)];
         var10004[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 4)] = var2;
         var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216541, 5)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
      }
   }

   public void setDesignTextWrapSidebarValue(Player var1, String var2) {
      if (((959132135 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "+hdxIZYD6tzvtczAMYcMKTpT65HRUSsfD8R6mKdx19mP2y6XbyOwSuAxek7GN9uya8KC7Yzl/3WcLabfTS0/NNmbuCAN8+TccWlhIseswombcNGMeCOwWEwu"
         );
         String[] var10004 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812985467, 12)];
         var10004[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(705450196, 18)] = var2;
         var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703167997, 20)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
            "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
         );
         this.setSidebarValueText(var1, var10002, this.firstNonBlank(var10004));
      }
   }

   @Override
   public void syncDesignTextAlignControlsVisibility(Player var1, EditorSession var2, boolean var3) {
      if ((-1275318725 * -1275318725 - -1275318725 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.beginShellOpacityBatch(var2);

         try {
            this.setSidebarPanelVisible(
               var1, var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("F0W0ppnuSpi8zh68olY8sTNuUF8SrWrMBohm65TmPU73B2YVHoE1S8T36zMp9XwKJQlIp3k7"), var3
            );
         } finally {
            this.endShellOpacityBatch(var1, var2);
         }
      }
   }

   @Override
   public void updateEditorPropertiesSidebar(Player var1, EditorSession var2) {
      if (((1773776847 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         this.beginShellOpacityBatch(var2);

         try {
            this.syncAnimationTimelineUi(var1, var2);
            boolean var3 = this.hasLegacySidebarUi(var2);
            if (var3 && var2.rightSidebarTab == EditorSidebarTab.LAYERS) {
               this.clearActionsRuntimeHud(var1, var2);
               this.setShellOpacity(
                  var1,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4GNqMsj6n8OEAeh3vnIwpdjTgjr1i82OBz1CJzyGmsRI6H2pVVafTXgmfTPhsSS/"),
                  Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2105106097, 29)
               );
               this.updateSelectionPanelVisibility(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(176362549, 16) != 0));
               this.renderLayersPanel(var1, var2);
               return;
            }

            if (var3 && var2.rightSidebarTab == EditorSidebarTab.PROPERTIES && this.isActionsSidebarMode(var2)) {
               this.clearLayersRuntimeHud(var1, var2);
               this.setShellOpacity(
                  var1,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4GNqMsj6n8OEAeh3vnIwpdjTgjr1i82OBz1CJzyGmsRI6H2pVVafTXgmfTPhsSS/"),
                  Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-2054202245, 30)
               );
               this.renderActionsPanel(var1, var2);
               return;
            }

            if (!var3 || var2.rightSidebarTab != EditorSidebarTab.PROPERTIES || !this.isKeyframePropertiesSidebarMode(var2)) {
               if (!var3 || var2.rightSidebarTab != EditorSidebarTab.DESIGN) {
                  this.clearActionsRuntimeHud(var1, var2);
                  this.clearLayersRuntimeHud(var1);
                  this.setShellOpacity(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4GNqMsj6n8OEAeh3vnIwpdjTgjr1i82OBz1CJzyGmsRI6H2pVVafTXgmfTPhsSS/"),
                     Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 11)
                  );
                  List<String> var4 = this.getSelectedTargetIds(var2);
                  int var5 = !var4.isEmpty() ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 25) : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 27);
                  if (var5 != 0) {
                     String var6 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var7 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var8 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var9 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var10 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var11 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var12 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var13 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var14 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var15 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var16 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var17 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     String var18 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                     double var19 = Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783505773653L, 47));
                     String var21 = null;
                     int var22 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 24);
                     Double var23 = null;
                     Double var24 = null;
                     Double var25 = null;
                     Double var26 = null;
                     Double var27 = null;
                     Double var28 = null;
                     String var29 = null;
                     Double var30 = null;
                     String var31 = null;
                     Boolean var32 = null;
                     Boolean var33 = null;
                     TextAlignment var34 = null;
                     int var35 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588567418, 13);
                     int var36 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342921039, 11);
                     int var37 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1652990288, 29);
                     int var38 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1348634273, 21);
                     int var39 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342921039, 11);
                     int var40 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1977973439, 31);
                     int var41 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2061753388, 9);
                     int var42 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(705450196, 18);
                     int var43 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 31);
                     int var44 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-685842077, 12);
                     int var45 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 5);
                     int var46 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191769314, 15);
                     int var47 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 28);

                     for (String var49 : var4) {
                        HoverElement var50 = this.findFirstByTargetId(var2, var49);
                        if (var50 != null) {
                           String var51 = var50.type;
                           if (var21 == null) {
                              var21 = var51;
                           } else if (!this.equalsNullable(var21, var51)) {
                              var22 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 1);
                           }
                        }

                        EditorRect var65 = this.resolveSidebarEditableBounds(var2, var49);
                        if (var65 != null) {
                           var47++;
                           double var52 = this.toSidebarDisplayPositionValue(var2, var49, EditorPropertyField.POSITION_X, var65.x);
                           double var54 = this.toSidebarDisplayPositionValue(var2, var49, EditorPropertyField.POSITION_Y, var65.y);
                           if (var23 == null) {
                              var23 = var65.width;
                           } else if (Math.abs(var23 - var65.width) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-5447519984962120108L, 33))) {
                              var35 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1117816077, 14);
                           }

                           if (var24 == null) {
                              var24 = var65.height;
                           } else if (Math.abs(var24 - var65.height) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(6690949864157057193L, 10))) {
                              var36 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1117816077, 14);
                           }

                           if (var25 == null) {
                              var25 = var52;
                           } else if (Math.abs(var25 - var52) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(7387433451623175348L, 41))) {
                              var37 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216565, 3);
                           }

                           if (var26 == null) {
                              var26 = var54;
                           } else if (Math.abs(var26 - var54) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(2901340572364949182L, 40))) {
                              var38 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704218621, 11);
                           }
                        }

                        double var66 = this.readTargetRotation(var2, var49);
                        if (var27 == null) {
                           var27 = var66;
                        } else if (Math.abs(var27 - var66) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(-5034714044178606816L, 39))) {
                           var39 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 18);
                        }

                        int var67 = this.readTargetOpacity(var2, var49);
                        if (var28 == null) {
                           var28 = (double)var67;
                        } else if (Math.abs(var28 - var67) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-7508385368815807603L, 0))) {
                           var40 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 4);
                        }

                        String var55 = this.readTargetName(var2, var49);
                        if (var29 == null) {
                           var29 = var55;
                        } else if (!this.equalsNullable(var29, var55)) {
                           var41 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(169510209, 31);
                        }

                        double var56 = this.readTargetLayer(var2, var49);
                        if (var30 == null) {
                           var30 = var56;
                        } else if (Math.abs(var30 - var56) > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(7387433451623175348L, 41))) {
                           var42 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 14);
                        }

                        String var58 = this.readTargetLogicalId(var2, var49);
                        if (var31 == null) {
                           var31 = var58;
                        } else if (!this.equalsNullable(var31, var58)) {
                           var43 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-171459496, 10);
                        }

                        boolean var59 = this.isTargetVisible(var2, var49);
                        if (var32 == null) {
                           var32 = var59;
                        } else if (var32 != var59) {
                           var44 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 27);
                        }

                        boolean var60 = this.isTargetLocked(var2, var49);
                        if (var33 == null) {
                           var33 = var60;
                        } else if (var33 != var60) {
                           var45 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1309962376, 3);
                        }

                        TextAlignment var61 = this.readTargetHudAlignment(var2, var49);
                        if (var34 == null) {
                           var34 = var61;
                        } else if (var34 != var61) {
                           var46 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-490230211, 29);
                        }
                     }

                     if (var4.size() > Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 13)) {
                        var6 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
                     } else if (var22 == 0 && var21 != null) {
                        var6 = this.toSidebarTypeLabel(var21);
                     } else if (var22 != 0) {
                        var6 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
                     }

                     if (var47 > 0) {
                        var7 = var35 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : this.formatPx(var23 == null ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(1198143141944438242L, 48)) : var23);
                        var8 = var36 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : this.formatPx(var24 == null ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-6288631172244082696L, 60)) : var24);
                        var9 = var37 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : this.formatPx(var25 == null ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 21)) : var25);
                        var10 = var38 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : this.formatPx(var26 == null ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783505773653L, 2)) : var26);
                     }

                     if (var27 != null) {
                        String var10000;
                        if (var39 != 0) {
                           var10000 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=");
                        } else {
                           Locale var68 = Locale.ROOT;
                           String var10001 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("P1PeEpIB1xGM8NkAxSvVCZb2ZEpLyz2nvGBS0+hnvAIlPGBum/0=");
                           Object[] var10002 = new Object[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(519136215, 20)];
                           var10002[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1675042529, 4)] = var27;
                           var10000 = String.format(var68, var10001, var10002);
                        }

                        var11 = var10000;
                     }

                     if (var28 != null) {
                        var19 = var28;
                        var12 = var40 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : Xqedii_maeeg3xobl79(Math.round(this.opacityRawToPercent(var28)));
                     }

                     if (var29 != null && !var29.isBlank()) {
                        var13 = var41 != 0 ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=") : var29;
                     }

                     if (var30 != null) {
                        var14 = var42 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : this.formatLayerValue(var30);
                     }

                     if (var31 != null && !var31.isBlank()) {
                        var15 = var43 != 0 ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=") : var31;
                     }

                     if (var32 != null) {
                        var16 = var44 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : (
                              var32
                                 ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("LwzDPYJL33U+wHn4xMUT/p1SW9COid6HCU6vEcoSykNxMVUxnEIIB7Vu")
                                 : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("uuziFC61IoF6HTPn9NOXKPTVStpEmqsXMbdVmq2A36U/oCcZnmaM2hQ+eYGB3w==")
                           );
                     }

                     if (var33 != null) {
                        var17 = var45 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : (
                              var33
                                 ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cTYLAmM6ftDEbQa/A9LdAaXVWgQPN8Kfz8tgldrLL1aXopO7")
                                 : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("t7QBTEXyD5g3sXJbj2AWfiBED/wwXmSiNvE8UTBcLeU3NhuHz2I=")
                           );
                     }

                     if (var34 != null) {
                        var18 = var46 != 0
                           ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3nr65aRw/QfrtZ8rXyqD47yEGyYnpx9rkHSOZz8abNShR9AlxhA=")
                           : this.formatSidebarHudAlignment(var34);
                     }

                     this.setShellText(
                        var1,
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                           "fxYh8FhsRvYSAcZK1oz64l7bupvE+jbwKpfpP9Zwr/oSTtu/ou2aHuBRzTIF59P1YNNy5h5LdHu3gSmcRdYnOV3oWz0mG96T9v2cvQ=="
                        ),
                        this.toSidebarDisplayValue(var6)
                     );
                     this.setSidebarValueText(
                        var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("EFmlVc1tILjgjyetHZ5q4h3vZKYxNkp0JDFe/b/Qxb8dAae46m/v6l11G8L063yoS+TIZA=="), var7
                     );
                     this.setSidebarValueText(
                        var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6roBMysygC1I4zVCVSeeR2leuSjR/ttcpihJATVddmX6q5RFIPUOzxq/4twYbUAQ85tziQ=="), var8
                     );
                     this.setSidebarValueText(
                        var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Aqm2gH1YgG0PUMhlyPTLpg+Sp52y81F6b0zc0FcwjGv5EtV7FxYfUZlIMhEyZX9X+5w7pQ=="), var9
                     );
                     this.setSidebarValueText(
                        var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gc1hSDa/AfKKF2YKJhzvAfDuOPkSri1PDnqAWl04SRntf1WZAPPxLzFpUQc/+iEKnNkL9g=="), var10
                     );
                     this.setSidebarValueText(
                        var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qaVviMN/tVVdaM7d4mkTe/ns0qXV22jxCFyWoQHd3Sa12oce/EcmhLRHp+FGxST4+kvxTw=="), var11
                     );
                     this.setSidebarValueText(
                        var1,
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("zoCcM37tP8yjfInJAPLEGXKEmu5NlBWPyv0FeT99Wd9hJiR9niUfrkCev3IYJ/ls2IFtp/knKTMliaOcgkeZBg=="),
                        var12
                     );
                     this.setSidebarInfoValues(var1, var9, var10, var7, var8, var11, var13, var14, var15, var16, var17, var18);
                     this.applySidebarPendingInputIndicator(var1, var2);
                     this.updateSidebarOpacitySliderVisual(var1, var2, var19);
                     this.updateSelectionPanelVisibility(var1, var2, (var5 != 0));
                     return;
                  }

                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "fxYh8FhsRvYSAcZK1oz64l7bupvE+jbwKpfpP9Zwr/oSTtu/ou2aHuBRzTIF59P1YNNy5h5LdHu3gSmcRdYnOV3oWz0mG96T9v2cvQ=="
                     ),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("EFmlVc1tILjgjyetHZ5q4h3vZKYxNkp0JDFe/b/Qxb8dAae46m/v6l11G8L063yoS+TIZA=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6roBMysygC1I4zVCVSeeR2leuSjR/ttcpihJATVddmX6q5RFIPUOzxq/4twYbUAQ85tziQ=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Aqm2gH1YgG0PUMhlyPTLpg+Sp52y81F6b0zc0FcwjGv5EtV7FxYfUZlIMhEyZX9X+5w7pQ=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gc1hSDa/AfKKF2YKJhzvAfDuOPkSri1PDnqAWl04SRntf1WZAPPxLzFpUQc/+iEKnNkL9g=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qaVviMN/tVVdaM7d4mkTe/ns0qXV22jxCFyWoQHd3Sa12oce/EcmhLRHp+FGxST4+kvxTw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setShellText(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("zoCcM37tP8yjfInJAPLEGXKEmu5NlBWPyv0FeT99Wd9hJiR9niUfrkCev3IYJ/ls2IFtp/knKTMliaOcgkeZBg=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.setSidebarInfoValues(
                     var1,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==")
                  );
                  this.updateSelectionPanelVisibility(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762728, 9) != 0));
                  return;
               }

               this.clearActionsRuntimeHud(var1, var2);
               this.clearLayersRuntimeHud(var1);
               this.setShellOpacity(
                  var1,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4GNqMsj6n8OEAeh3vnIwpdjTgjr1i82OBz1CJzyGmsRI6H2pVVafTXgmfTPhsSS/"),
                  Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 23)
               );
               this.updateEditorDesignSidebar(var1, var2);
               this.applySidebarPendingInputIndicator(var1, var2);
               return;
            }

            this.clearActionsRuntimeHud(var1, var2);
            this.clearLayersRuntimeHud(var1, var2);
            this.setShellOpacity(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4GNqMsj6n8OEAeh3vnIwpdjTgjr1i82OBz1CJzyGmsRI6H2pVVafTXgmfTPhsSS/"),
               Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 27)
            );
            this.updateEditorKeyframeSidebar(var1, var2);
            this.applySidebarPendingInputIndicator(var1, var2);
         } finally {
            this.endShellOpacityBatch(var1, var2);
         }
      }
   }

   @Override
   public void updateEditorKeyframeSidebar(Player var1, EditorSession var2) {
      if (((-1685670681 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var4 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var5 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var6 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var7 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var8 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var9 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         String var10 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("btAQ/QxoIATuuy/Mw250yyNwU/s1thNFjfg0x3NM14hk0tRapUsdVg==");
         if (this.isTimelineKeyframeSelected(var2)) {
            String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703954429, 18)];
            var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 24)] = var2.animationTimelineSelectedTargetId;
            String var11 = this.firstNonBlank(var10001);
            var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-245115106, 28)];
            var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 10)] = var2.animationTimelineSelectedRow;
            String var12 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            int var13 = this.clampAnimationTimelineTick(var2.animationTimelineSelectedTick);
            Map var14 = this.resolveRawTargetByTargetId(var2, var11);
            Map var15 = this.readAnimationTimelineRowMap(var14, var12);
            Object var16 = this.readAnimationTimelineTickValue(var15, var13);
            Map var17 = var16 instanceof Map var18 ? var18 : null;
            var10 = this.formatTimelineInterpMode(this.resolveTimelineKeyframeInterpMode(var15, var13));
            if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("e0pnuVNJQCcMPJhPnU8VjQL++JTz79CPWxt2AJ0mSXosLknW/XAUhiBMzBM=").equals(var12)) {
               var3 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("OrXK+usQE1/ek2AlSFvsewjs/a9m5xhEmRAt6hH1");
               var4 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("kHsUEIStSx6Bd64AAX0cuc5lHPdz/Ing/npd16Xu/pnrT9gqXwaSMeaNswZMTJJh");
               var5 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("KFDDSAOCSn4oy1FswnY5fspLEiHWueZgC/etn8C0rgCgGHNpuZvOrBsWYF7qePIj");
               if (var17 != null) {
                  double var22 = this.readMapPathDouble(
                     var17,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("C0czulqFW6fNMUwRD0p4dB3siZSnHC+SGKTm9w4M"),
                     Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-5882304374322749119L, 1))
                  );
                  double var20 = this.readMapPathDouble(
                     var17,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wrkJr0cdjOLgvjc1qNRoez+uVFrqlxPfutVqZO7C"),
                     Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469911938747L, 27))
                  );
                  if (Double.isFinite(var22)) {
                     var22 = this.toSidebarDisplayPositionValue(var2, var11, EditorPropertyField.POSITION_X, var22);
                  }

                  if (Double.isFinite(var20)) {
                     var20 = this.toSidebarDisplayPositionValue(var2, var11, EditorPropertyField.POSITION_Y, var20);
                  }

                  var6 = Double.isFinite(var22)
                     ? this.formatPx(var22)
                     : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                  var7 = Double.isFinite(var20)
                     ? this.formatPx(var20)
                     : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               }
            } else if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vZHqQpFT+iIPMaDVQ+SioROnJmbU4VjTSya6Gph37EyjNnTv+r0=").equals(var12)) {
               var3 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Xddj3DUyS77CIGoXX/JvhMKbCvTtXzUx7ToP4JIn");
               var4 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("iXdKn7HF8V0lv9Pr4FEqramvyHYVCVHBWa9HzHKQK8jJyyEnwNw=");
               var5 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("A+R1SFaJ2FUD05PUfgQl+0o70kQqs0QAzDaEsURe/ZtHyxOWXnFpPA==");
               if (var17 != null) {
                  double var23 = this.readMapPathDouble(
                     var17,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("rBaSFVKVDmmWyc0CcYpl9Gczvihn6h4/sKpzdi1pR/ycW0yFR5M="),
                     Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-5283646466953093957L, 18))
                  );
                  double var26 = this.readMapPathDouble(
                     var17,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("CfE+Yy0vtbQng+URtAE4UHI24gTvSdV9IkWCSjnw/MqoDSvWBLNl3g=="),
                     Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783505771433L, 15))
                  );
                  var6 = Double.isFinite(var23)
                     ? this.formatPx(var23)
                     : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
                  var7 = Double.isFinite(var26)
                     ? this.formatPx(var26)
                     : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               }
            } else if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fhn17ihLvGupNdqi09fujHYT/BVFhWcaqRUI3FAk0nDiG1SV3QDFJhE9PnU=").equals(var12)) {
               var3 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cUzNlIzC0uJc9BPshgZp5GkBYdNqZsbNvtz+U8SZ");
               var4 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("yQgrmH2bMNT0+zdQo0/YxehVy2pWFyaL1WBFcMjGiv4Xs/xhboHjKQ1gInI=");
               var5 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               double var24 = var16 instanceof Number var27
                  ? var27.doubleValue()
                  : this.readMapPathDouble(
                     var17,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ouXJHrvO6RmfDX9FSKCV//UDwZce63Dzl4uaWicLVnYg/BgesS0="),
                     this.readMapPathDouble(
                        var17,
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fhn17ihLvGupNdqi09fujHYT/BVFhWcaqRUI3FAk0nDiG1SV3QDFJhE9PnU="),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(4933395905045903819L, 20))
                     )
                  );
               String var31;
               if (Double.isFinite(var24)) {
                  Locale var30 = Locale.ROOT;
                  String var34 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("P1PeEpIB1xGM8NkAxSvVCZb2ZEpLyz2nvGBS0+hnvAIlPGBum/0=");
                  Object[] var10002 = new Object[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 14)];
                  var10002[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1356081676, 2)] = this.normalizeSidebarRotation(var24);
                  var31 = String.format(var30, var34, var10002);
               } else {
                  var31 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               }

               var8 = var31;
            } else if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("UwkZWa2fvqmSGfURV9N74DBYxNt85Wot057zkpIdUbq1JWzeTvJhzdq9").equals(var12)) {
               var3 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("bSocOMaPM+hzmhhccAa12vYJWPhBuDLsgeKDdMUb");
               var4 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("I5su6H2HDbj2YbpurhtrbxJFHhKYPDiiZceZZfqyoQxv++7Z9SQGLMtl");
               var5 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
               double var25 = var16 instanceof Number var28
                  ? var28.doubleValue()
                  : this.readMapPathDouble(
                     var17,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ouXJHrvO6RmfDX9FSKCV//UDwZce63Dzl4uaWicLVnYg/BgesS0="),
                     this.readMapPathDouble(
                        var17,
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("UwkZWa2fvqmSGfURV9N74DBYxNt85Wot057zkpIdUbq1JWzeTvJhzdq9"),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-1883149620616227814L, 5))
                     )
                  );
               var9 = Double.isFinite(var25)
                  ? Xqedii_2bjmnc78ttdn2(Math.round(this.opacityRawToAnimationPercent(this.clampAnimationTimelineOpacityRaw(var25))))
                  : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
            }
         }

         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VaKVhb/NoISQQIVpB4H7UeFq0yKEGvkOGVC4qC1GtVJYUgSDVIa8NYsnE2kx1WAIIi6jC6dAhUMx9CQg7XWql03+T9+P+dnBqfi67Q=="),
            this.toSidebarDisplayValue(var3)
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("nOyUmaP27ISj3/X+6mlf1MZKnHDKhgGgc6M1E0pQBEd5YggYRybgCNS/ojTbkCcJp+dUeyu02Waf0OSI"),
            this.toSidebarDisplayValue(var4)
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("BEF8SVoG2l9rMkw7jCf6Z3V6g+BwxaL5aeT5JH/22SaLbc3tYJeokGSv6HJJoBj8T+ihSUOtRs0ZtrXl"),
            this.toSidebarDisplayValue(var5)
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("R86Nqd7Qb04g94xQ9NxoOyGHT6ZaHQGsyMj2+S9psG7g/30D7V9iuXnCJQqTJT2jnj37qea+311mw9MghN9LOq1MZg5Y4w=="), var6
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sZMcWz0fZk0/UGmmjSKku8GpafMbCMBhlgXJNgpXgI5UUz3noJ3KF8WigP6xyAM8EbkCtophs3jDJeRmpNpTeu0QoPxU4Q=="), var7
         );
         this.setShellText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MtBQE94SSEpSc8VQzNfv0znpn9fw94Nvxw8NL/GgbO5eAyMzC40u/WXM5RPVF41c"), this.toSidebarDisplayValue(var6)
         );
         this.setShellText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cyYID65xB1AHu1B6bFiywE+cr8dynP7ZoCssyVJ+DJsVgaMxHNzBNCqOJTjQL6eS"), this.toSidebarDisplayValue(var7)
         );
         this.setSidebarValueText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "QSx7gWPQw464fAvjf048711u2NxkTgRTltsgBxb/At3BPOztZlx+7NeAMq4A7oNhg4ZGP0t9Xu1jA15PsGYhAsmSw/qgPERri3m92sHwChLmh4p/"
            ),
            var8
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+/ua2DtRRZbyUpOF0oBoSKFrumIXY2GGIu+qtQWMg4tpTQQ62P0/NM9VQNvCmVSzjD0e8IdQlcE8BUaqEgo="),
            this.toSidebarDisplayValue(var8)
         );
         this.setSidebarValueText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "JGW8Txz+GllGLEjU7bwYtSdkzxBeKpC2eP8NZgSaK8V4FM6Aj41V77scNP5V6AhlnOtjnV2P+eQLAcxl88myJ5BV3rMA2xN9Kxd4zoaCAqk6sQ=="
            ),
            var9
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Y1LCLhRJOBjyIFFzXmdovaTERaT0seLUo6CRgTpFO+HDgNog7crZiSJUSdmj2Z5a5MxNCCjnBmmnXFSM"),
            this.toSidebarDisplayValue(var9)
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "lvDX+6CH5BAIJYXGzN9l+pXQ6EfezpzIa6R0nmzYXUvaBf37vP8bbN/H/T5XBTJIXQxY8NUDaMP5fikfcFYRoRusNatTTegE1DtMXW1KQwGeVZjj"
            ),
            this.toSidebarDisplayValue(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("OEtNi/WquqMYzLxxauWCB8tVFEt25nV7LyGjBdC726Wrk43NIKdDZMdczKwaoUl6fUsGS0uS"))
         );
         this.setSidebarValueText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "atXByKzF7lg/dHbpEt2Yd3r71GDiYfl1ivx7ofuGaLhCXf5N1Y8H7mDlR3/WfXnyInYBUykpTHvOYWd2a05zqECzJnpSehjA6nizvmCUyk75fQPoTSQSPzw4V6DbqQ=="
            ),
            var10
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("8Jqtzhyg7soUq8bYQDCeTErIEjYIVi6/vmvniAZ2LoqRvZUAOD3Yio4QYvOTXKoYnKjLovis+9ZX+YcOgvDNpuWGUshhqA7j"),
            this.toSidebarDisplayValue(var10)
         );
         this.setSidebarValueText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "fI6E5WkSCvZ3dZw4BIAxx7JGrpLTkdIXl0RDIl9citquotc6VPgdzM8wi6i3GxtK8goOkgu7xsOo3GgF1QaEaoxl7caCR0oes8ahN7CLLteHbtHWbTUwG+N4NVcvH1KklrPoorcVGIOxkGJewRLNDQ=="
            ),
            var10
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "2PL8XNwSZRsS/0B7W8ScdxyOnBCAygYGpLLGSFWQbNf03LEk4EFD0PS+rzNNeGepaUHFocYhjH6u97ifuBPwDVT52qTjKaZ+e+euJnP/tGTxpERWheWpKdsP"
            ),
            this.toSidebarDisplayValue(var10)
         );
         this.setSidebarValueText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "EeN/R3HxNZgm1oXURoazE4lNqk4gr8j1gBGM6Cdl0RxJ9LYnJMwFkPRwVYBdtcPbWsRa4cYkPJTNlYS5WvG75uEDvKQvm9O2wQdNI87Oc8VANK5t5Jr4GIHN7yV21/u6tDK2DKla+JSbLB//EFI="
            ),
            var10
         );
         this.setShellText(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "3mtTrSuOv/fVnX2oEqIiUQG3l+GrnAHm5rtn6VywWNiki//wXOLj9+0ylEXm7T/BrLAU6EY68FekRv54LkFmbPlgrRNJNZBuNJWCAn+TLP4VSpNGYpyCPA=="
            ),
            this.toSidebarDisplayValue(var10)
         );
      }
   }

   public void setSidebarInfoValues(
      Player var1,
      String var2,
      String var3,
      String var4,
      String var5,
      String var6,
      String var7,
      String var8,
      String var9,
      String var10,
      String var11,
      String var12
   ) {
      if (((-1419328752 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.setSidebarValueText(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("BvmaYXhvOyzWjxEEr/uDVGK70Md1WynzsVf7XnJv6Y8Af8FiIhB5T0nAKyghR0fyQOsNag=="), var2);
         this.setSidebarValueText(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("N9Gqim8dZiLoxm+swFFUoHI6R5vqTsBfe8fZXVCWZBUvT3vqoBbnPBYPsLnzg/td3RIkJw=="), var3);
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gtcbYXKocvxsP7+kXOZgeNRK5kiGON34M1OjeeLuUD0pfCxwytwwvzm3yNkdSy+c8UAO4ACR/JHnCtv2"), var4
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("2Jskf1fQ/h6yWi3NWGYEa59Lr3Xp0wKwXfebhQB63Jg+RNGRpZStEAamBB0asUHumBLWXBvRb682hVeJ52M="), var5
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("BUH2eNO5HeUNvc18tv4D8jMJQe0r7AFKCX65eXsWjmDff3nxvhRlLtanzqNE5u221VzXKcVToeFXevDusBli91TI"), var6
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("pjaFvcuo7MWLV3f5fX8FMBL3neiAXrnDHxVIoe15RN9Hxj97MIEqG6NuOQtaKbcgSU3HP/BSlvK41Q=="), var7
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("meW3FLquA4LICzpOUzeIKcxeKDMIKthlD0NWn0vjIH3W8FoGoy+pw/iditlcktWkYYox+FY/708cuqQY"), var8
         );
         this.setSidebarValueText(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ttH7a6kuHzlWE4FHyjdJ0C2fb7w+Hud2LRoWZl3tji2UUfejagmAkq5/Cfed1KqtQMMLa5zx"), var9);
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4fsMILXE7RHT/h2+a2RtzTgirIA4D/eZk8CUtgLx6ORHEFxtKePFOAPj/F0r7IVp1r0sB8oxgz2IbkYWvdhzmg=="), var10
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("r3D3+LNrTRuqKjJh8t7SpQyHdh5woiS8iGuOZL/R6LA071JtmmNgNdBICd9BDgOnrWprXpH1qeo0+JH5dJ4="), var11
         );
         this.setSidebarValueText(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("EihJNLcsUoEVfd7aM79cvwp9o52fYC/BLdZB9Zsb091Pl3zyFIWZyyykJq9u28+gTaXkrfcb+lWKFeWM8q0="), var12
         );
      }
   }

   @Override
   public void cycleSidebarBorderRadiusMode(Player var1, EditorSession var2) {
      if ((870376936 * 870376936 + 870376936 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List<String> var3 = this.getSidebarEditableTargetIds(var2);
         if (var3.isEmpty()) {
            this.updateEditorPropertiesSidebar(var1, var2);
         } else {
            String var4 = null;
            int var5 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 7);
            int var6 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-735441840, 10);

            for (String var8 : var3) {
               String var9 = this.readTargetRawType(var2, var8);
               if (this.isBorderRadiusApplicableType(var9)) {
                  var6 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 24);
                  String var10 = this.readTargetBorderRadiusMode(var2, var8);
                  if (var4 == null) {
                     var4 = var10;
                  } else if (!this.equalsNullable(var4, var10)) {
                     var5 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1887915541, 19);
                  }
               }
            }

            if (var6 == 0) {
               this.updateEditorPropertiesSidebar(var1, var2);
            } else {
               String var14 = this.nextSidebarBorderRadiusMode(
                  var5 != 0 ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5noCkvzbnzSgWzdU29MPteIvSIJgZQQFVq4RyeYSnfsyxQDF") : var4
               );
               int var15 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1890708367, 27);
               int var16 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 18);

               for (String var11 : var3) {
                  String var12 = this.readTargetRawType(var2, var11);
                  if (this.isBorderRadiusApplicableType(var12)) {
                     boolean var13 = this.setTargetBorderRadiusMode(var2, var11, var14);
                     if (var13 && var16 == 0) {
                        this.recordMutationForInteraction(var2);
                        var16 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-171459496, 10);
                     }

                     if (var13) var15 = 1;
                  }
               }

               if (var15 == 0) {
                  this.updateEditorPropertiesSidebar(var1, var2);
               } else {
                  this.rerenderEditableSelection(var1, var2);
               }
            }
         }
      }
   }

   @Override
   public void cycleSidebarHoverEffect(Player var1, EditorSession var2, boolean var3) {
      if ((-349638336 * -349638336 - -349638336 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List<String> var4 = this.getSidebarEditableTargetIds(var2);
         if (var4.isEmpty()) {
            this.updateEditorPropertiesSidebar(var1, var2);
         } else {
            String var5 = null;
            int var6 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(518087639, 20);
            int var7 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 16);

            for (String var9 : var4) {
               if (!var3 || this.isSidebarItemDesignTarget(var2, var9)) {
                  var7 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1470885727, 11);
                  String var10 = this.normalizeHoverEffectId(this.readTargetHoverEffect(var2, var9));
                  if (var5 == null) {
                     var5 = var10;
                  } else if (!this.equalsNullable(var5, var10)) {
                     var6 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1601893054, 22);
                  }
               }
            }

            if (var7 == 0) {
               this.updateEditorPropertiesSidebar(var1, var2);
            } else {
               List var15 = this.resolveHoverEffectOptionIds();
               String var16 = this.nextSidebarHoverEffect(
                  var6 != 0 ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wepO7mch9W2D8+bF1tR78S+vI2xQFvpTjWz/e5nDl11t+wYh") : var5, var15
               );
               int var17 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 3);
               int var11 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 30);

               for (String var13 : var4) {
                  if (!var3 || this.isSidebarItemDesignTarget(var2, var13)) {
                     boolean var14 = this.setTargetHoverEffect(var2, var13, var16);
                     if (var14 && var11 == 0) {
                        this.recordMutationForInteraction(var2);
                        var11 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(705188052, 18);
                     }

                     if (var14) var17 = 1;
                  }
               }

               if (var17 == 0) {
                  this.updateEditorPropertiesSidebar(var1, var2);
               } else {
                  this.rerenderEditableSelection(var1, var2);
               }
            }
         }
      }
   }

   @Override
   public boolean isActionsSidebarMode(EditorSession var1) {
      if ((1837701732 * (1837701732 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.activeTool == EditorTool.COMMANDS
            ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371675961, 13)
            : Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2061753388, 9)) != 0);
      }
   }

   @Override
   public boolean isActionsShellBlockId(String var1) {
      if (((1461205532 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         return ((!var1.startsWith(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1GL439nAs7x19wZCXcmCgtpfqgMrJK9YZp0i/WBvBJPoXvlhAlvCGuvT1RZsg5C2TsYKsrzqrgYD7/gv")
               )
               && !var1.startsWith(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("pjz8LNEiYWDDAJZ98j2Ngu8lpxH/GgyAX/zNVIIrOp+iB/JtJ5A6WbdtfK512xD5TrPA5A=="))
            ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 4)
            : Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(373125615, 0)) != 0);
      } else {
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 0) != 0);
      }
   }

   @Override
   public boolean isCursorActionsCachedPanelBlock(EditorSession var1, ConfigurationSection var2) {
      if (((-1403748126 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2036248510, 5)];
         var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 27)] = var2.getString(
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
         );
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 0) != 0);
         } else {
            ConfigurationSection var4 = this.findShellBlockSection(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY=")
            );
            var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1129359393, 4)];
            var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 17)] = var4 == null
               ? null
               : var4.getString(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
               );
            String var5 = this.firstNonBlank(var10001);
            if (!var5.isBlank() && this.belongsToSidebarPanel(var5, var3)) {
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1030876950, 8) != 0);
            } else {
               ConfigurationSection var6 = this.findShellBlockSection(
                  var1,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
                  )
               );
               var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(69757461, 25)];
               var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 15)] = var6 == null
                  ? null
                  : var6.getString(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
                  );
               String var7 = this.firstNonBlank(var10001);
               return ((!var7.isBlank() && this.belongsToSidebarPanel(var7, var3)
                  ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216557, 4)
                  : Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(889881364, 8)) != 0);
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191769314, 15) != 0);
      }
   }

   @Override
   public String actionRuntimeLogicalId(String var1) {
      if ((-763666620 * -763666620 - -763666620 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-490230211, 29)];
         var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 14)] = var1;
         String var2 = this.firstNonBlank(var10001);
         return var2.startsWith(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1GL439nAs7x19wZCXcmCgtpfqgMrJK9YZp0i/WBvBJPoXvlhAlvCGuvT1RZsg5C2TsYKsrzqrgYD7/gv"))
            ? var2
            : Xqedii_1x36qrmj16bfo(var2);
      }
   }

   @Override
   public String actionSlotBaseId(int var1) {
      if ((-935927314 * -935927314 - -935927314 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1xdhkrkz8xx4o(var1);
      }
   }

   @Override
   public String actionSlotId(int var1) {
      if ((-247082484 * -247082484 + -247082484 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_20ngh8saht3c5(this.actionSlotBaseId(var1));
      }
   }

   @Override
   public String actionNameId(int var1) {
      if ((-1314719327 * -1314719327 + -1314719327 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2v1i08w1cjqg5(this.actionSlotBaseId(var1));
      }
   }

   @Override
   public String actionIconId(int var1) {
      if ((-565901262 * -565901262 - -565901262 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_sp4lxy26uufg(this.actionSlotBaseId(var1));
      }
   }

   @Override
   public boolean isValidActionsSecondClickEditAttempt(EditorSession var1, double var2, double var4, long var6) {
      if ((729983907 * (729983907 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var6 <= Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-7570260357526358315L, 31)) {
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 27) != 0);
      } else if (var1.rightSidebarTab == EditorSidebarTab.PROPERTIES && this.isActionsSidebarMode(var1)) {
         String var8 = this.resolveSelectedActionsTargetId(var1);
         if (var8.isBlank()) {
            return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 6) != 0);
         } else {
            int var9 = var1.actionsRenderedRawIndexes.size();
            int var10 = this.resolveActionSlotByHit(var1, var2, var4, var9);
            if (var10 >= Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 18) && var10 <= var9) {
               int var11 = (Integer)var1.actionsRenderedRawIndexes.get(var10 - Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(352594026, 17));
               long var12 = var6 - var1.actionsLastClickTick;
               if (var11 < 0
                  || var11 != var1.actionsSelectedIndex
                  || var11 != var1.actionsLastClickIndex
                  || var12 < Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3751653383133144149L, 51)
                  || var12 > Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149778137064533L, 29)) {
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 25) != 0);
               } else if (!this.isActionsReorderActive(var1) && !this.hasActionsEditMovementExceeded(var1, var11, var2, var4)) {
                  List var14 = this.resolveTargetActionsRawList(var1, var8, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1597698750, 22) != 0));
                  if (var14 != null && var11 < var14.size()) {
                     String var15 = this.normalizeActionType(
                        this.stringValue(((Map)var14.get(var11)).get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt")))
                     );
                     return this.isEditableActionType(var15);
                  } else {
                     return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 14) != 0);
                  }
               } else {
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 7) != 0);
               }
            } else {
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 11) != 0);
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 10) != 0);
      }
   }

   @Override
   public boolean hasActionsEditMovementExceeded(EditorSession var1, int var2, double var3, double var5) {
      if (((1886023546 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 >= 0 && var1.actionsReorderArmedIndex == var2) {
         double var7 = Math.hypot(var3 - var1.actionsReorderStartHitX, var5 - var1.actionsReorderStartHitY);
         return ((var7 >= Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(8068388649634658033L, 44))
            ? Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1410376104, 19)
            : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 30)) != 0);
      } else {
         return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 2) != 0);
      }
   }

   @Override
   public boolean isActionsReorderDragStartSatisfied(EditorSession var1, double var2, double var4) {
      if ((-1312703193 ^ -1312703193) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(444940682, 7) != 0);
      } else {
         double var6 = var2 - var1.actionsReorderStartHitX;
         double var8 = var4 - var1.actionsReorderStartHitY;
         double var10 = Math.hypot(var6, var8);
         if (var10 < Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3927293768600593501L, 5))) {
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 25) != 0);
         } else {
            double var12 = Math.abs(var8);
            double var14 = Math.abs(var6);
            return ((var12 >= Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-5553733210753089566L, 62)) && var12 >= var14
               ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-685837981, 12)
               : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 11)) != 0);
         }
      }
   }

   @Override
   public void resetActionsEditClickTracker(EditorSession var1) {
      if ((-625397881 * -625397881 - -625397881 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.actionsLastClickIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 16);
         var1.actionsLastClickTick = Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3810200178288960597L, 56);
      }
   }

   @Override
   public boolean handleCursorActionsDropdownAction(Player var1, EditorSession var2, String var3) {
      if ((-982684228 * (-982684228 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         String var4 = this.resolveSelectedActionsTargetId(var2);
         if (var4.isBlank()) {
            this.sendEditorError(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qRnttbEgSajoIZry5wGW7l5K35qxRzQ6uqdg7uaV0wfkKkK32Z0ZAfo7Gd2FPAHicv5suIj5Ny6xgjatGq5aUeVZO8kgnAaG2b2ATg=="),
               new Object[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1410900392, 19)]
            );
            return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(186562807, 31) != 0);
         } else {
            String var5 = this.resolveCursorActionsTypeByDropdownId(var3);
            if (var5.isBlank()) {
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1309962384, 3) != 0);
            } else {
               List var6 = this.resolveTargetActionsRawList(var2, var4, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216557, 4) != 0));
               if (var6 == null) {
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191769314, 15) != 0);
               } else {
                  this.recordEditorMutation(var2);
                  var6.add(this.buildDefaultActionMap(var5));
                  var2.actionsSelectedIndex = Math.max(
                     Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1202129465, 26), var6.size() - Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 13)
                  );
                  var2.pendingActionTargetId = null;
                  var2.pendingActionIndex = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(517039063, 20);
                  this.clearActionsReorderState(var2);
                  this.updateEditorPropertiesSidebar(var1, var2);
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342918991, 11) != 0);
               }
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 3) != 0);
      }
   }

   @Override
   public boolean handleCursorActionsEditDropdownAction(Player var1, EditorSession var2, String var3) {
      if ((-1326339837 * (-1326339837 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588575610, 13)];
         var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2059302374, 15)] = var3;
         String var4 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         int var6 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191802082, 15);
         switch (var4.hashCode()) {
            case 318202365:
               if (var4.equals(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "4sd9/kJ6uIUaMifvNmELmIOTeuLWgZDh2wztTKGnzYlmfsqzT3+ptNd8xzG+9kKeawelukH6vmy3bwORwbTddsCZl4sTzUwwzxJORv4q"
                  )
               )) {
                  var6 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(373125614, 0);
               }
               break;
            case 861207438:
               if (var4.equals(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "JoSk0P9LlW756nmfP3nciCwyvFp089oNOT8EirODM2XrVzq6T9mOCowFEDMFBpa7bNvDt0v/wnDLPVeG4syd8rzkZKu9WOOG9k3u7k5XvPA2rQ=="
                  )
               )) {
                  var6 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(515438603, 7);
               }
               break;
            case 1274332954:
               if (var4.equals(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "fhwStVth1unaVwLj+rI+gTE8s/J0eNtYXORiozrTq4y7KWcZu5ZkdsEMYY1StknHutyTol5gd241GyOKnvsjnlWlslxK97kxCZhz4IhAYwk="
                  )
               )) {
                  var6 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 20);
               }
         }
         return switch (var6) {
            case 0 -> this.handleActionsEditCut(var1, var2);
            case 1 -> this.handleActionsEditCopy(var2);
            case 2 -> this.handleActionsEditPaste(var1, var2);
            default -> Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 2) != 0;
         };
      } else {
         return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(889881364, 8) != 0);
      }
   }

   @Override
   public boolean handleActionsEditCopy(EditorSession var1) {
      if ((-1131535319 ^ -1131535319) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2061753388, 9) != 0);
      } else {
         String var2 = this.resolveSelectedActionsTargetId(var1);
         if (var2.isBlank()) {
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 31) != 0);
         } else {
            List var3 = this.resolveTargetActionsRawList(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 20) != 0));
            int var4 = this.resolveSelectedActionRawIndex(var1, var3);
            if (var4 >= 0 && var3 != null && var4 < var3.size()) {
               Map var5 = this.toStringObjectMap(var3.get(var4));
               if (var5 != null && !var5.isEmpty()) {
                  Map var6 = this.deepCopyMap(var5);
                  this.normalizeActionMapForEditor(var6);
                  var1.actionsClipboardAction = var6;
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-980460421, 30) != 0);
               } else {
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 3) != 0);
               }
            } else {
               return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 31) != 0);
            }
         }
      }
   }

   @Override
   public boolean handleActionsEditCut(Player var1, EditorSession var2) {
      if (((120251804 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = this.resolveSelectedActionsTargetId(var2);
         if (var3.isBlank()) {
            return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(746251228, 1) != 0);
         } else {
            List var4 = this.resolveTargetActionsRawList(var2, var3, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 24) != 0));
            int var5 = this.resolveSelectedActionRawIndex(var2, var4);
            if (var5 >= 0 && var4 != null && var5 < var4.size()) {
               Map var6 = this.toStringObjectMap(var4.get(var5));
               if (var6 != null && !var6.isEmpty()) {
                  Map var7 = this.deepCopyMap(var6);
                  this.normalizeActionMapForEditor(var7);
                  var2.actionsClipboardAction = var7;
                  this.recordEditorMutation(var2);
                  var4.remove(var5);
                  if (var4.isEmpty()) {
                     var2.actionsSelectedIndex = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812964988, 14);
                  } else {
                     var2.actionsSelectedIndex = Math.max(
                        Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 5), Math.min(var5, var4.size() - Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(352594026, 17))
                     );
                  }

                  var2.pendingActionTargetId = null;
                  var2.pendingActionIndex = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981500, 7);
                  this.clearActionsReorderState(var2);
                  this.updateEditorPropertiesSidebar(var1, var2);
                  return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(69757461, 25) != 0);
               } else {
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 27) != 0);
               }
            } else {
               return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1348634273, 21) != 0);
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 7) != 0);
      }
   }

   @Override
   public boolean handleActionsEditPaste(Player var1, EditorSession var2) {
      if ((-1713364592 * -1713364592 - -1713364592 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.actionsClipboardAction != null && !var2.actionsClipboardAction.isEmpty()) {
         String var3 = this.resolveSelectedActionsTargetId(var2);
         if (var3.isBlank()) {
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 19) != 0);
         } else {
            List var4 = this.resolveTargetActionsRawList(var2, var3, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1972652029, 28) != 0));
            if (var4 == null) {
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1551598991, 14) != 0);
            } else {
               Map var5 = this.deepCopyMap(var2.actionsClipboardAction);
               this.normalizeActionMapForEditor(var5);
               int var6 = this.resolveSelectedActionRawIndex(var2, var4);
               int var7 = var6 >= 0 ? Math.min(var4.size(), var6 + Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704224765, 13)) : var4.size();
               this.recordEditorMutation(var2);
               var4.add(var7, var5);
               var2.actionsSelectedIndex = var7;
               var2.pendingActionTargetId = null;
               var2.pendingActionIndex = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812915836, 16);
               this.clearActionsReorderState(var2);
               this.updateEditorPropertiesSidebar(var1, var2);
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1960920841, 31) != 0);
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1099569797, 23) != 0);
      }
   }

   @Override
   public int resolveSelectedActionRawIndex(EditorSession var1, List<Map<String, Object>> var2) {
      if (((732192572 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         return var1.actionsSelectedIndex >= 0 && var1.actionsSelectedIndex < var2.size()
            ? var1.actionsSelectedIndex
            : var2.size() - Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1675042545, 4);
      } else {
         return Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812719228, 18);
      }
   }

   @Override
   public String resolveCursorActionsTypeByDropdownId(String var1) {
      if (((-1633960147 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 4)];
         var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1977973439, 31)] = var1;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (var2.isBlank()) {
            return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
         } else {
            int var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981371, 0);
            switch (var2.hashCode()) {
               case -2060300468:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "jt3Hcc12e0X/RlQ5rWBjB03SnTaZjwGW4hznYec2GYTGT+jYpDSVpJlaXMR96AjWY/qvM9RdhdMZzpOsL2Epz0TooNQDOTw6bKjqzcY8"
                     )
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-630474750, 30);
                  }
                  break;
               case -266979114:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("hHNEZYRhk4vg7ippm9M+IOBzauZsQx992rr7PuR4HANQhbtA799yOD67V8ARwC/xh5rjrBzVsrpRYDA8VmvVhA==")
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371602233, 13);
                  }
                  break;
               case -137544568:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("9zlHfCpNll9kbpcMTco0DhTB8Qe/KfgTEsY6nculG23ARWzQ4cPv+tbU7j8Stw8RgZAQzxjn5Hw2rEGTUzcSd9JfS9/y+b8V")
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1094930600, 28);
                  }
                  break;
               case -136833005:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vBH/mA+BqyNkSd5n/ADHjxYUxcY6kgPBwS2M3qs7vArsqgVk/EwpLNr5hmi7wikYkKOZKXw7AoBAtEpApS5sguseSFbHSeSM")
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1353220419, 12);
                  }
                  break;
               case -122673249:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("CCJFO+zS0cGsTJmAn/JA2WmfTJ65pXMspsu5KYFiBXkIVYAIL2aI50h66VGsJYvgd9K9YvcaRqWV6TmnCaBP/q8LF7D3pcfn")
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1371702945, 21);
                  }
                  break;
               case -35605996:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "T898ZXbZCOhqC0UiSzvdicR2b5yu+OLy++Nn/hhyH/P/wWBeg6ikH9vSrNWB1bn52tmwU93pBlIJcUqFGwx16gFQLzKvZooAiueOIUIp/O8="
                     )
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216285, 5);
                  }
                  break;
               case 42807081:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("BLfWl3fOKqAz37bCLdfo8SaAHPTdibXdvP9va/a2IwIHt+QoqycQGTIxHORyyfVnF9UkUgp8vW2pI3B7"))) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216575, 0);
                  }
                  break;
               case 46221785:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("E79+eeAEAUZ5LaTpPtiLqQHjPT/0sRF2vNVGujw96NsMTnoFtPM/OvulOa/T/I8auR1fbhxT9uc5LeSd"))) {
                     var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1580921534, 22);
                  }
                  break;
               case 475228522:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vPOgWHyKzFvR/GIPG1bGSySkQs4aZ1gLtPF6WelT79eGiuEBsKAypqaMEtRYJLbC1Mk="))) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704218493, 7);
                  }
                  break;
               case 534767513:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("q/EF695AJbeiRhHBMifiMJeKk+gcFQVwruz4j9hH6JUEfX2iYEn55GvT2zLZPizWOdZk4tc3qUpdsa0lxeY="))) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704740861, 15);
                  }
                  break;
               case 1047517659:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "5QPv/p+zJVkmHGt9e0Hi9TiwjOnxdFS7ql9ZwXevqUwpGhAXmaGaaYwbq+Jc+pzon65SlPgqwKXD3UxjDs2W5C48c02mebG2eZiSWA=="
                     )
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 31);
                  }
                  break;
               case 1048633319:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "/duVXUhX7YncRab874noabNGFRbbn1jvSms7NaK+D1ieU+z0U1VGGPJ/P18EdTmUbvXcFnRFJXl06sjSnpxisIaeeWEieN6eCYmcOQ=="
                     )
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1353195843, 12);
                  }
                  break;
               case 1052048023:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "KjXgQ2BwPXPnTa5vqxgmfCgRl2PrCsbL9iANgPzD+5tpt1d/jYZ+2SGUHZ6wnvFMac26fU/6uozF9F9MUApAc543MRJTo4nAIS6XeQ=="
                     )
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216477, 5);
                  }
                  break;
               case 1118824522:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VrFI1NfMdaLE41uwcybinKmOhuMrHTvLTF2StJHDjfsGi8Ta5mcstszzaEUMi3cdqw41g7EUlSttZM5DPHI="))) {
                     var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704208381, 12);
                  }
                  break;
               case 1304982602:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ThDW0q6AUAPM8NFxEW9P3ik/qTVClZ7/9dFjzBQrPutKgX/HANRDoLj39GCYH6KhYSVh+FpQeMc="))) {
                     var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1330517105, 27);
                  }
                  break;
               case 1305694165:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("aZZYAg2uw8b6wQhKuMj6anZrlV5kQr7tx4i9gbq30uaxlF/rpsPz5RdO6bcacfubDR2g0S+ajyU="))) {
                     var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981335, 2);
                  }
                  break;
               case 1319853921:
                  if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("JveS+/YGNulU0x8Qazlt6h6QygZIHok/v9qk0hC4jt5Nlac3ZUJ2zMcLytYMnm1Y3peZMnC3ZR0="))) {
                     var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1551828367, 14);
                  }
                  break;
               case 1650609819:
                  if (var2.equals(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "Kx1Y29ggjbSg3Djd8fPBS9iOOeDStedlHlROEClIVg2qoCS36qYvTKwL3M0ltOHCdmjwF6pJz/7STqvMQg7uLnjMvsAp3NUxmUBDTTpN"
                     )
                  )) {
                     var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981315, 2);
                  }
            }
            return switch (var4) {
               case 0 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3");
               case 1, 2 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ZWO/wkfEs0pZ4ffYLLwNQF/izIdFXcu6tW35ksigru84cGYJoYrWY1Vq");
               case 3, 4 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("KqbTsmkYJ8dYvbSLJWxcKi+3wYuGTCjrWvIEceYSnkRXLe6cfZSn2q8E");
               case 5, 6 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("QtBpd2sOHj0mmLBYpNQyAC6Jz+Jhxga1VGjYDK4v5u4zDBlCVKnd2FaBu6U=");
               case 7, 8 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6G1y6NrhqLB3hMi/buU6OYKJwhBYb5v68feUF7bEcymNK+/G9kg=");
               case 9, 10 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("lV90BoR5Y9k3bqG6/SL0DRt+NU4wIcq9Bb6xxO1co3BgKWgHzkrUm2NvaypP5w==");
               case 11, 12 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6Qc+4r68yOPYZQo3Fa1ZqVhb1XXj4GzRiuf3olpwDBw7wo71G0A=");
               case 13, 14 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gFfJ0ethgBjZrBd1lLSlp5p9Lp25GCe9LKBTbP16Q27+x/9kKf4=");
               case 15, 16, 17 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mNJy5I+l3cC2406NygDMpcdsgFbJvrxDCH8NGZYN3DT9ROwVp1fd59Wl9nI=");
               default -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
            };
         }
      }
   }

   @Override
   public String resolveSelectedActionsTargetId(EditorSession var1) {
      if (((940703134 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
      } else {
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-471978886, 17)];
         var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1470883679, 11)] = var1.selectedElementId;
         return this.firstNonBlank(var10001).trim();
      }
   }

   @Override
   public List<Map<String, Object>> resolveTargetActionsRawList(EditorSession var1, String var2, boolean var3) {
      if ((-1005555411 * -1005555411 - -1005555411 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Map var4 = this.resolveRawTargetByTargetId(var1, var2);
         if (var4 == null) {
            return null;
         } else if (var4.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA")) instanceof List var6) {
            ArrayList var11 = new ArrayList();

            for (Object var9 : var6) {
               Map var10 = this.toStringObjectMap(var9);
               if (var10 != null && !var10.isEmpty()) {
                  this.normalizeActionMapForEditor(var10);
                  var11.add(var10);
               }
            }

            var4.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA"), var11);
            return var11;
         } else if (!var3) {
            return new ArrayList<>();
         } else {
            ArrayList var7 = new ArrayList();
            var4.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA"), var7);
            return var7;
         }
      } else {
         return null;
      }
   }

   @Override
   public void normalizeActionMapForEditor(Map<String, Object> var1) {
      if ((769261043 * (769261043 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String var2 = this.normalizeActionType(
            this.stringValue(var1.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt")))
         );
         var1.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"), var2);
         if (!Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=").equals(var2)) {
            String var3 = this.resolveActionDisplayValue(var1, var2);
            var1.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ouXJHrvO6RmfDX9FSKCV//UDwZce63Dzl4uaWicLVnYg/BgesS0="), var3);
            var1.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF"), var3);
         }
      }
   }

   @Override
   public Map<String, Object> buildDefaultActionMap(String var1) {
      if ((-1562688462 * (-1562688462 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var2 = new LinkedHashMap();
         String var3 = this.normalizeActionType(var1);
         var2.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"), var3);
         if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=").equals(var3)) {
            var2.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GcujQXuEzqVWNW5jm4xAu4UkRzphZTnGrExLSyx8jtE="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=")
            );
            return var2;
         } else {
            String var4 = this.resolveDefaultActionValue(var3);
            var2.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ouXJHrvO6RmfDX9FSKCV//UDwZce63Dzl4uaWicLVnYg/BgesS0="), var4);
            var2.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF"), var4);
            return var2;
         }
      }
   }

   @Override
   public String normalizeActionType(String var1) {
      if ((-21908575 * (-21908575 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216541, 5)];
         var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 28)] = var1;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         int var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1276110460, 29);
         switch (var2.hashCode()) {
            case -2109822408:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("8V/xRcKxqnZcNtEgTLo6Ved1JF5PhrqEglij/sO9xS5dzpbDWOTQXPFVJVQd3g6z"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704215901, 5);
               }
               break;
            case -2105990045:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Bdtzy7iE6GTb7u2EpUrA7a+zyhdoQMwr3kfFpWaTONclbIo09iY1KfwQErCoOyBchQjPRXzIjaug1w=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-898910207, 28);
               }
               break;
            case -1859183013:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ehSLZtrOw6asI6DRi8EdigtSZaPwBH+XFhvyYGix3b9vBHdZ08ez04Wbcafcxw=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1686390781, 19);
               }
               break;
            case -1821614103:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("55dqlUrJPV2tUJHVpVot57n5IbcgQLQKdEdvtFcRYGr47EBwveiFFdUttd2/+iOdcT9QPEgF"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(713576660, 18);
               }
               break;
            case -1360201941:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mNJy5I+l3cC2406NygDMpcdsgFbJvrxDCH8NGZYN3DT9ROwVp1fd59Wl9nI="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1564144318, 22);
               }
               break;
            case -1349119146:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ND2AEcKPkTWcXV2/1ieUTNzNQejpzj6cc68imVwv4IApuxan5Tz64A=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(2039473787, 23);
               }
               break;
            case -1310539880:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("q32jzip02RA9tNwBkQrnSOS21//yN6YYPQ/saP5knkuQClBQB2tP7ZsmFPdmrKHlqvEhnLAM"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1817306747, 17);
               }
               break;
            case -1258505356:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ZNtOwaDP02GbkG4vN/rQE4h3ISi4qWDefv1lzbGZm9ckGPGyJ3q6TuJ8rD3dqml1pzUZot+fppQ="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704036349, 13);
               }
               break;
            case -1249586564:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("P11NWSfl576ge1h8JeCNsWB59U9HK0CGvwtebpW9++NioSYYWPrnoSQ9Rhc="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812969083, 11);
               }
               break;
            case -1034809482:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+VfQbNjX1Mm8CTztQoeRHmC+cR/+3zbaig6Y1X+57EBA6l48gJTE6skeuX8L3tT+nvE="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812980987, 4);
               }
               break;
            case -1028503875:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("N9X/BtSfI2rGfkceDdERN3KiZbsPUzHtvQJmiZtCIGR2mcce9/n3tu+jXF9hZg=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703036925, 16);
               }
               break;
            case -905826493:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("h5fvIPqZHuRzXSfZ7bQw7xHgoqAXKeXREde+RchrQD5zHtNXJp4bsA=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(178721845, 16);
               }
               break;
            case -903579675:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("IGs/fhVoaZ1vgQGLEuQudUwxfPZrnPN5L/dBUWmdVB+VdcYyL1bP6Q=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704218109, 6);
               }
               break;
            case -880688561:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Tpft/SvrQIJbkd8sl5DUnzrYrZvSbyhMOMVAoVO6IpBlQMbiayk1c1PVUtdYQAR0MzBaRHNadPk="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-93603839, 28);
               }
               break;
            case -868304044:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("C/HXS6MUziRh2rrexflF61j//RP42veCJZv0JUcNFQ+8V5AFUyqlAA=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216559, 1);
               }
               break;
            case -861311717:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cTR6wGGqR52UEDjT9LdPCyr4by1JfmzwblKIY++4bBeLUTcEsavjOULry1YSgw=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1817699963, 19);
               }
               break;
            case -776144932:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("QtBpd2sOHj0mmLBYpNQyAC6Jz+Jhxga1VGjYDK4v5u4zDBlCVKnd2FaBu6U="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704413181, 16);
               }
               break;
            case -517618225:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("2jgVIP/VTue/9LQHxM1QeaXEqMt01k1J5w78+oOdKWURnhPVDdrofzz3OiWBYW0Z"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-390993009, 27);
               }
               break;
            case 3357:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("H4hDDfcr+BHrZ/h7NM9JjFzgCYRcuFBuD8/PU6WlU0E="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-630474748, 30);
               }
               break;
            case 3708:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("zZwS72m19+Bc6Zc5jj2ILXkAs2WykMzJl5hvtO5TfEY="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1129359873, 4);
               }
               break;
            case 113291:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("pbt7dklFjOCZXNwtAZxF5goYNbfTZXsIB5kmUc5ppvtosA=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1492841150, 22);
               }
               break;
            case 113762:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sKqyK/vRWaEQdbkuqHM/z4TzUz/sRyNxgMvuN/mSPg+Oyg=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(746251284, 1);
               }
               break;
            case 116519:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("uYf2rJiNQG39bulePoofNWY9FuEzFAjsy1DJpKrk7JIL1A=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1582803776, 3);
               }
               break;
            case 3045982:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("eCfM8u/qoB++QmaSZNUQAb4OsFF50RFcugHpjOYb6I63ER+a"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1800398459, 22);
               }
               break;
            case 3173137:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Syvdvwc37Zy20MIhdypcSpji3fB2yHPCesk8+dCl/AJZOBlB"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981345, 1);
               }
               break;
            case 3202370:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("m20/+TAGdtgxNx16mGDE1Jzf9qlkRVomo9WdBjyx8cMBrja0"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1248573443, 27);
               }
               break;
            case 3437296:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("5NqPSsFQOIPQDg0VZD/cE5V/aka9E/3bhqQU/LawVlDBRnTB"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1871662613, 19);
               }
               break;
            case 3529469:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("OPIxEkJu6GIge/Gcb8npfQ6FBJ+084ya1muAPeceiG96Z+oB"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216550, 0);
               }
               break;
            case 92975308:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("lNhFXfqoY9yTTgkIfB1OQPg9vQG8d1nxZMw3x9V8aoRoTrJoPBw="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1492502548, 2);
               }
               break;
            case 94756344:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6G1y6NrhqLB3hMi/buU6OYKJwhBYb5v68feUF7bEcymNK+/G9kg="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1825564283, 22);
               }
               break;
            case 95467907:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6Qc+4r68yOPYZQo3Fa1ZqVhb1XXj4GzRiuf3olpwDBw7wo71G0A="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(176493621, 16);
               }
               break;
            case 100358090:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342888271, 11);
               }
               break;
            case 109627663:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gFfJ0ethgBjZrBd1lLSlp5p9Lp25GCe9LKBTbP16Q27+x/9kKf4="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812956795, 12);
               }
               break;
            case 114971210:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("tHTx4dt6gOE2Llf34SRnBstdHJj+T9SYmKYTpqQkqDkrVT3z1TZL3bgDS/TKnE4dGETmdQG+"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-931374859, 18);
               }
               break;
            case 206361348:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fN3UWqjvTdCPZvE4aNdPkiFf/sAu74QaC424kMLD1uxM/sNqCm32822qG04ULPRmlho="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(980137985, 28);
               }
               break;
            case 466743410:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+OqJuogys3xv+KuqJ1B51irrSVI5Neh0PTpvK1BcVnsWMf4sphQEhWzn"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(543253463, 20);
               }
               break;
            case 470718913:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("/GeYOC903OAc6q6RXXTALIX4vk2eN6ZQNgjNr/nItxPNz2Csowahtq+CcJE="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1706182653, 17);
               }
               break;
            case 753687338:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("m+fAIV2UEB2c/9o0WRLyW4eVHDXty7o9NasmBBeN/lq0wcpoZdGl2H8Vn62pJJBK"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1078118318, 21);
               }
               break;
            case 783191159:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MC9bE79uyPfqBEESVlPCAwcFY7wM10252pXjKb7vomXcayq9pCyaIJv8t+T39vyzuODKQaTq"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1945115015, 28);
               }
               break;
            case 950394699:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2072350556, 22);
               }
               break;
            case 951510359:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ZWO/wkfEs0pZ4ffYLLwNQF/izIdFXcu6tW35ksigru84cGYJoYrWY1Vq"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191736546, 15);
               }
               break;
            case 954925063:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("KqbTsmkYJ8dYvbSLJWxcKi+3wYuGTCjrWvIEceYSnkRXLe6cfZSn2q8E"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1551631759, 14);
               }
               break;
            case 1118509956:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("lV90BoR5Y9k3bqG6/SL0DRt+NU4wIcq9Bb6xxO1co3BgKWgHzkrUm2NvaypP5w=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1697925117, 21);
               }
               break;
            case 1363945337:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ry7kZ58AtaqtyZ60JemH0VyYsg/Qn/svaxNo5bO3amUVx5KQfJ4RkYwBtUDtMAfY"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1084336213, 27);
               }
               break;
            case 1380938712:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("jVKdoMqNeZaDkCZhmNLJ9VFMcKBDrIsV4HlMQH7mamEUNj+RrAXk4/cMy00="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(944821290, 26);
               }
               break;
            case 1610950850:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("WI5y6WGWpyQkC8xQkbc30hne0VaXaqktynEYf7c2aunxmYCM3zgsJy8Ee1HH8eVcjbvp8Dhl0bI="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371315513, 13);
               }
               break;
            case 1705792840:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("34wMlPh9u2uJvs6VQQgbaYHmsbW9LsE0fgPh9GcwXAjZp/9Zo0wX9UXU7q+3wg=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(169510217, 31);
               }
               break;
            case 1707282390:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gYk20/7i+btd1B2w8syMnOogtgAeUAKtvlljJvMqp/c/O4FBEGpieY+RN9lQDQ=="))) {
                  var4 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(354560106, 17);
               }
               break;
            case 1941332754:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("2WY7eR/izHvQd2hXxr9cfwAS1QiSNwvCzxGjrw/qA/Y49lsTDDDYvl2hcHOVbOi3"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812391547, 16);
               }
               break;
            case 2053801262:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("k5Eie1Z+NPoi2YoCmP7gZ5t28GwbSusAuy8l777FWjNF/MimXbuZY+Mj"))) {
                  var4 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1913984573, 16);
               }
         }
         return switch (var4) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> var2;
            case 11, 12, 13, 14, 15, 16 -> var2;
            case 17, 18, 19, 20, 21, 22, 23 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=");
            case 24, 25, 26 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("2WY7eR/izHvQd2hXxr9cfwAS1QiSNwvCzxGjrw/qA/Y49lsTDDDYvl2hcHOVbOi3");
            case 27, 28 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("P11NWSfl576ge1h8JeCNsWB59U9HK0CGvwtebpW9++NioSYYWPrnoSQ9Rhc=");
            case 29 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cTR6wGGqR52UEDjT9LdPCyr4by1JfmzwblKIY++4bBeLUTcEsavjOULry1YSgw==");
            case 30, 31 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("jVKdoMqNeZaDkCZhmNLJ9VFMcKBDrIsV4HlMQH7mamEUNj+RrAXk4/cMy00=");
            case 32, 33 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("2jgVIP/VTue/9LQHxM1QeaXEqMt01k1J5w78+oOdKWURnhPVDdrofzz3OiWBYW0Z");
            case 34 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gFfJ0ethgBjZrBd1lLSlp5p9Lp25GCe9LKBTbP16Q27+x/9kKf4=");
            case 35 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mNJy5I+l3cC2406NygDMpcdsgFbJvrxDCH8NGZYN3DT9ROwVp1fd59Wl9nI=");
            case 36, 37, 38 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ZWO/wkfEs0pZ4ffYLLwNQF/izIdFXcu6tW35ksigru84cGYJoYrWY1Vq");
            case 39, 40, 41, 42, 43 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("k5Eie1Z+NPoi2YoCmP7gZ5t28GwbSusAuy8l777FWjNF/MimXbuZY+Mj");
            case 44, 45, 46, 47, 48, 49 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ND2AEcKPkTWcXV2/1ieUTNzNQejpzj6cc68imVwv4IApuxan5Tz64A==");
            default -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3");
         };
      }
   }

   @Override
   public String resolveDefaultActionValue(String var1) {
      if ((1427617392 * (1427617392 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.normalizeActionType(var1);
         int var3 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 29);
         switch (var2.hashCode()) {
            case -1360201941:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mNJy5I+l3cC2406NygDMpcdsgFbJvrxDCH8NGZYN3DT9ROwVp1fd59Wl9nI="))) {
                  var3 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1695827965, 21);
               }
               break;
            case 94756344:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6G1y6NrhqLB3hMi/buU6OYKJwhBYb5v68feUF7bEcymNK+/G9kg="))) {
                  var3 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1695827965, 23);
               }
               break;
            case 95467907:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6Qc+4r68yOPYZQo3Fa1ZqVhb1XXj4GzRiuf3olpwDBw7wo71G0A="))) {
                  var3 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703167997, 19);
               }
               break;
            case 100358090:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw="))) {
                  var3 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(678040844, 1);
               }
               break;
            case 109627663:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gFfJ0ethgBjZrBd1lLSlp5p9Lp25GCe9LKBTbP16Q27+x/9kKf4="))) {
                  var3 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981363, 2);
               }
               break;
            case 951510359:
               if (var2.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ZWO/wkfEs0pZ4ffYLLwNQF/izIdFXcu6tW35ksigru84cGYJoYrWY1Vq"))) {
                  var3 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 7);
               }
         }
         return switch (var3) {
            case 0 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("NxKO1SFPJ9QLAxNYGl20+W1fjyxqjXI3LNw4piJ1bEvDW+Kbwat0NGd2oICGeA==");
            case 1 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("nnR4tFJdl+L45USCSsSxys5055DJsW9Bmqmg7pLQGL+A1tzgbxM=");
            case 2 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cWjUWektHWHejWC/5T6jLfra63vtGvkNh6VirP7mSSzbUY3BJYgMHQ==");
            case 3 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "k43K056mLUa7+RMRUBmfBBPTLBNgIbmySDkjiw5SnxZKAhei++h2JItTaCbfQMnZeOXQnrSleOlX6hsVKuFv2wRtB+8uVwetsa6Q5ImK"
            );
            case 4 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("dVBio7vhe7KsERA+o9T4NTZ1GNhaNObP2Id7JnvmH/i4JAAEsnHC7A==");
            case 5 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=");
            default -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
         };
      }
   }

   @Override
   public String resolveActionDisplayValue(Map<String, Object> var1, String var2) {
      if (((299547267 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=").equals(this.normalizeActionType(var2))) {
            String[] var4 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(746251234, 1)];
            var4[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1652990288, 29)] = this.stringValue(
               var1.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GcujQXuEzqVWNW5jm4xAu4UkRzphZTnGrExLSyx8jtE="))
            );
            var4[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1601893054, 22)] = this.stringValue(
               var1.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("P11NWSfl576ge1h8JeCNsWB59U9HK0CGvwtebpW9++NioSYYWPrnoSQ9Rhc="))
            );
            var4[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1344439969, 21)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw="
            );
            return this.firstNonBlank(var4).trim();
         } else {
            String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(21188776, 28)];
            var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 22)] = this.stringValue(
               var1.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ouXJHrvO6RmfDX9FSKCV//UDwZce63Dzl4uaWicLVnYg/BgesS0="))
            );
            var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 21)] = this.stringValue(
               var1.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF"))
            );
            var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216569, 1)] = this.stringValue(
               var1.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("9F+P/P+UHnDfMXZcQs0tgIvvA7kP4LGI1OFQz8FZNldFC4+V"))
            );
            String var3 = this.firstNonBlank(var10001).trim();
            return var3.isBlank() ? this.resolveDefaultActionValue(var2) : var3;
         }
      } else {
         return this.resolveDefaultActionValue(var2);
      }
   }

   @Override
   public boolean isEditableActionType(String var1) {
      if ((-420662897 * -420662897 + -420662897 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.normalizeActionType(var1);
         return ((!Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6G1y6NrhqLB3hMi/buU6OYKJwhBYb5v68feUF7bEcymNK+/G9kg=").equals(var2)
               && !Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XYgkpHlZ9Ei4zthBA+P0KqzePX4d3uIqrGbGNBE08ZG+VVwVmJw=").equals(var2)
            ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-980460421, 30)
            : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 14)) != 0);
      }
   }

   @Override
   public void startSidebarActionInputPrompt(Player var1, EditorSession var2, String var3, int var4, String var5, String var6) {
      if ((1717029269 * 1717029269 - 1717029269 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && var4 >= 0 && !this.isEditorTextPromptCoolingDown(var2)) {
         String var7 = this.normalizeActionType(var5);
         if (this.isEditableActionType(var7)) {
            int var10 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-705450197, 18);
            switch (var7.hashCode()) {
               case -1360201941:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mNJy5I+l3cC2406NygDMpcdsgFbJvrxDCH8NGZYN3DT9ROwVp1fd59Wl9nI="))) {
                     var10 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588559226, 13);
                  }
                  break;
               case -776144932:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("QtBpd2sOHj0mmLBYpNQyAC6Jz+Jhxga1VGjYDK4v5u4zDBlCVKnd2FaBu6U="))) {
                     var10 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1353187651, 12);
                  }
                  break;
               case 95467907:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("6Qc+4r68yOPYZQo3Fa1ZqVhb1XXj4GzRiuf3olpwDBw7wo71G0A="))) {
                     var10 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1117881613, 14);
                  }
                  break;
               case 109627663:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gFfJ0ethgBjZrBd1lLSlp5p9Lp25GCe9LKBTbP16Q27+x/9kKf4="))) {
                     var10 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1097062175, 28);
                  }
                  break;
               case 950394699:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3"))) {
                     var10 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 20);
                  }
                  break;
               case 951510359:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("ZWO/wkfEs0pZ4ffYLLwNQF/izIdFXcu6tW35ksigru84cGYJoYrWY1Vq"))) {
                     var10 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 31);
                  }
                  break;
               case 954925063:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("KqbTsmkYJ8dYvbSLJWxcKi+3wYuGTCjrWvIEceYSnkRXLe6cfZSn2q8E"))) {
                     var10 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(443267075, 30);
                  }
                  break;
               case 1118509956:
                  if (var7.equals(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("lV90BoR5Y9k3bqG6/SL0DRt+NU4wIcq9Bb6xxO1co3BgKWgHzkrUm2NvaypP5w=="))) {
                     var10 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1972652029, 26);
                  }
            }
            String var8 = switch (var10) {
               case 0 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("3ikV61/186uKZWTuB5yOPVqqSKejOBta8QsId+tnTsLHCgyOHQyy3CWsZwx+WSiI");
               case 1 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("M620kZ7z/roAiRLaCAwGnk0BOAp5V84gahd0hfrxQFnhbbkiC9JGqyvd2RaUSXbCwgk3ioZzezTzfLs76G2dxCrvnCICrSNi");
               case 2 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("gkunD+O265uD88JYmNe392nNuxPlVkbPAUDag8ziwu1PashSzA9XES3nkPkNRtate+MaDw==");
               case 3 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("RwbFb2As35NDwCZwO7+/IE4QNRj4gJY12Iy3lmWBQgfLVXlueiTy3baB5DzJC5/o+JfFDA==");
               case 4 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("kT/s80+3PNe1eIsU/nCaK80hyeg1Ng8snY8HHvQd8uU75eOUZTA6HAwx");
               case 5 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("cWjUWektHWHejWC/5T6jLfra63vtGvkNh6VirP7mSSzbUY3BJYgMHQ==");
               case 6 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "k43K056mLUa7+RMRUBmfBBPTLBNgIbmySDkjiw5SnxZKAhei++h2JItTaCbfQMnZeOXQnrSleOlX6hsVKuFv2wRtB+8uVwetsa6Q5ImK"
               );
               case 7 -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fOXlByz/RsuEhnr30oJ+fUrxdpDUlKpCdyaDolAtvYig7OydjXk=");
               default -> Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw==");
            };
            String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(186562808, 31)];
            var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(206623786, 26)] = var6;
            var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216557, 4)] = this.resolveDefaultActionValue(var7);
            String var9 = this.firstNonBlank(var10001);
            var2.pendingPropertyField = null;
            var2.pendingActionTargetId = var3;
            var2.pendingActionIndex = var4;
            this.updateEditorPropertiesSidebar(var1, var2);
            if (!this.openEditorTextPrompt(var1, var2, Xqedii_2uhkpc7qn7vbi(var7), var9)) {
               String var10002 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "Sqcgo4wMWeCEJKSjkdo5IlZ1CKmZv6r1cUzoIiIeuV4os/XOoVsjWila3dF8kfYPzLiT8Qa0upSJ32SC94ITpWKPITL0Ku8unDEKTElpnUATknSIlHHgvAz4W4IF/EpyZDY4hMab9y/eoV/RFzOW9Y+6TWkR2idEPhbhono+66b3Cor0LmqL6orTWzVCpIu5dd/pZI5A9isGHA=="
               );
               Object[] var10003 = new Object[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(522281943, 20)];
               var10003[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(373125614, 0)] = var7;
               var10003[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1116119376, 29)] = var8;
               var10003[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2036248542, 5)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "n0cHDgAnZb0sgbq0dtH9dk6BputU0Y9q0bPYjVm4Kbp0mAWuRJdelg=="
               );
               var10003[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371659577, 13)] = var9;
               this.sendEditorInfo(var1, var10002, var10003);
            }
         }
      }
   }

   @Override
   public void armActionsReorder(EditorSession var1, int var2, double var3, double var5) {
      if (((-675369428 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 >= 0) {
         var1.actionsReorderArmedIndex = var2;
         var1.actionsReorderCurrentIndex = var2;
         var1.actionsReorderStartHitX = var3;
         var1.actionsReorderStartHitY = var5;
         var1.actionsReorderActive = (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1977973439, 31) != 0);
         var1.actionsReorderHistoryRecorded = (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(746251228, 1) != 0);
      } else {
         this.clearActionsReorderState(var1);
      }
   }

   @Override
   public void clearActionsReorderState(EditorSession var1) {
      if ((-1939834593 * (-1939834593 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.actionsReorderArmedIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 2);
         var1.actionsReorderCurrentIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 24);
         var1.actionsReorderStartHitX = Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783505773653L, 1));
         var1.actionsReorderStartHitY = Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(3041543190713238568L, 62));
         var1.actionsReorderActive = (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(186562807, 31) != 0);
         var1.actionsReorderHistoryRecorded = (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762728, 9) != 0);
      }
   }

   @Override
   public boolean isActionsReorderLeftHeld(EditorSession var1) {
      if (((-1668611255 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-988986720, 30) != 0);
      } else {
         long var2 = Math.max(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(5423590630598691002L, 12), Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149781358290005L, 30));
         return ((Xqedii_38o2zes.Xqedii_316oplq() - var1.lastLeftClickTick <= var2
            ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216061, 9)
            : Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1889764475, 6)) != 0);
      }
   }

   @Override
   public boolean isActionsReorderActive(EditorSession var1) {
      if ((-1388254728 * -1388254728 + -1388254728 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.actionsReorderActive && var1.actionsReorderArmedIndex >= 0
            ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 13)
            : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 0)) != 0);
      }
   }

   @Override
   public boolean handleActionsReorderCursorMove(Player var1, EditorSession var2, double var3, double var5) {
      if (((1163793433 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null) {
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 6) != 0);
      } else if (var2.rightSidebarTab != EditorSidebarTab.PROPERTIES || !this.isActionsSidebarMode(var2)) {
         this.clearActionsReorderState(var2);
         this.clearActionsReorderGhostHud(var1, var2);
         return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 3) != 0);
      } else if (var2.actionsReorderArmedIndex < 0) {
         this.clearActionsReorderGhostHud(var1, var2);
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 21) != 0);
      } else if (!this.isActionsReorderLeftHeld(var2)) {
         boolean var14 = this.isActionsReorderActive(var2);
         this.clearActionsReorderState(var2);
         this.clearActionsReorderGhostHud(var1, var2);
         if (var14) {
            this.updateEditorPropertiesSidebar(var1, var2);
         }

         return var14;
      } else {
         if (!this.isActionsReorderActive(var2)) {
            if (!this.isActionsReorderDragStartSatisfied(var2, var3, var5)) {
               this.clearActionsReorderGhostHud(var1, var2);
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 17) != 0);
            }

            int var7 = var2.actionsRenderedRawIndexes.size();
            int var8 = this.resolveActionSlotByHit(var2, var3, var5, var7);
            if (var8 < Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216509, 6) || var8 > var7) {
               this.clearActionsReorderGhostHud(var1, var2);
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 21) != 0);
            }

            int var9 = var2.actionsReorderArmedIndex;
            int var10 = (Integer)var2.actionsRenderedRawIndexes.get(var8 - Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1038272430, 21));
            if (var10 < 0 || var10 == var9) {
               this.clearActionsReorderGhostHud(var1, var2);
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4) != 0);
            }

            var2.actionsReorderActive = (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 10) != 0);
            this.updateEditorPropertiesSidebar(var1, var2);
         }

         String var13 = this.resolveSelectedActionsTargetId(var2);
         if (var13.isBlank()) {
            this.clearActionsReorderState(var2);
            this.clearActionsReorderGhostHud(var1, var2);
            return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 8) != 0);
         } else {
            List var15 = this.resolveTargetActionsRawList(var2, var13, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 23) != 0));
            if (var15 != null && var15.size() > Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2061753900, 9)) {
               int var16 = var2.actionsRenderedRawIndexes.size();
               int var17 = this.resolveActionSlotByHit(var2, var3, var5, var16);
               if (var17 >= Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-141877576, 23) && var17 <= var16) {
                  int var11 = (Integer)var2.actionsRenderedRawIndexes.get(var17 - Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 29));
                  int var12 = var2.actionsReorderCurrentIndex < 0 ? var2.actionsReorderArmedIndex : var2.actionsReorderCurrentIndex;
                  if (var12 < 0 || var12 >= var15.size() || var11 < 0 || var11 >= var15.size()) {
                     this.clearActionsReorderState(var2);
                     this.clearActionsReorderGhostHud(var1, var2);
                     return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1889764475, 6) != 0);
                  } else if (var12 == var11) {
                     this.renderActionsReorderGhostHud(var1, var2, var3, var5);
                     return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 31) != 0);
                  } else {
                     if (!var2.actionsReorderHistoryRecorded) {
                        this.recordEditorMutation(var2);
                        var2.actionsReorderHistoryRecorded = (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1356081672, 2) != 0);
                     }

                     this.moveActionInRawList(var15, var12, var11);
                     var2.actionsReorderCurrentIndex = var11;
                     var2.actionsSelectedIndex = var11;
                     var2.actionsReorderStartHitX = var3;
                     var2.actionsReorderStartHitY = var5;
                     this.updateEditorPropertiesSidebar(var1, var2);
                     this.renderActionsReorderGhostHud(var1, var2, var3, var5);
                     return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1135020601, 26) != 0);
                  }
               } else {
                  this.renderActionsReorderGhostHud(var1, var2, var3, var5);
                  return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1091181189, 23) != 0);
               }
            } else {
               this.clearActionsReorderState(var2);
               this.clearActionsReorderGhostHud(var1, var2);
               return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 14) != 0);
            }
         }
      }
   }

   @Override
   public void moveActionInRawList(List<Map<String, Object>> var1, int var2, int var3) {
      if ((179920938 * 179920938 - 179920938 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != var3) {
         int var4 = Math.max(
            Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-300532367, 24), Math.min(var1.size() - Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1167345661, 29), var2)
         );
         int var5 = Math.max(
            Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(352725098, 17), Math.min(var1.size() - Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 13), var3)
         );
         Map var6 = (Map)var1.remove(var4);
         var1.add(var5, var6);
      }
   }

   @Override
   public boolean handleActionsPanelClick(Player var1, EditorSession var2, double var3, double var5) {
      if ((1796065646 * 1796065646 + 1796065646 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         long var7 = Xqedii_38o2zes.Xqedii_316oplq();
         String var9 = this.resolveSelectedActionsTargetId(var2);
         if (var2.cursorActionsEditDropdownVisible) {
            String var10 = this.resolveHoveredCursorActionsEditDropdownTargetId(var2, var3, var5);
            if (!var10.isBlank()) {
               this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 23) != 0));
               this.playEditorSfx(
                  var1,
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Mm+BFqg2eKsUmTOp1evmiNayvcSeMCLYpxktq+L50crX3kKpx3haPvgOhR6O5AuC67/HgGjYhsMHK2mbmHUDdDBhrWn19w==")
               );
               this.handleCursorActionsEditDropdownAction(var1, var2, var10);
               return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-735442864, 10) != 0);
            }

            double var11 = var2.shellHitX(var3);
            double var13 = var2.shellHitY(var5);
            if (this.isInsideShellBlock(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
               ),
               var11,
               var13
            )) {
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-980460421, 30) != 0);
            }

            this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(413247572, 27) != 0));
         }

         if (var2.cursorActionsDropdownVisible) {
            String var24 = this.resolveHoveredCursorActionsDropdownTargetId(var2, var3, var5);
            if (!var24.isBlank()) {
               this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2095827702, 24) != 0));
               this.playEditorSfx(
                  var1,
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Mm+BFqg2eKsUmTOp1evmiNayvcSeMCLYpxktq+L50crX3kKpx3haPvgOhR6O5AuC67/HgGjYhsMHK2mbmHUDdDBhrWn19w==")
               );
               this.handleCursorActionsDropdownAction(var1, var2, var24);
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704200189, 14) != 0);
            }

            double var27 = var2.shellHitX(var3);
            double var29 = var2.shellHitY(var5);
            if (this.isInsideShellBlock(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY="),
               var27,
               var29
            )) {
               return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1960920841, 31) != 0);
            }

            this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 26) != 0));
         }

         if (!var9.isBlank()
            && this.isInsideShellBlock(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("he9A8vhAAObUbP0nn8dMzCjY5Rgk6bgAVcHs6pl5mtkxj5BllITxJ0KrH9KlYdea3BLkCmJDRN6omFV946P3Hw=="),
               var3,
               var5
            )) {
            int var26 = !var2.cursorActionsDropdownVisible
               ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 8)
               : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 31);
            if (var26 != 0) {
               this.setFileDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 7) != 0));
               this.setEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 29) != 0));
               this.setSelectionDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 11) != 0));
               this.setLayerDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1309962384, 3) != 0));
               this.setWindowDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 12) != 0));
            }

            if (var2.cursorActionsEditDropdownVisible) {
               this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 3) != 0));
            }

            if (var26 == 0) {
               this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 13) != 0));
               return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 27) != 0);
            } else {
               this.moveCursorActionsDropdownTo(var1, var2, var3, var5);
               this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 15) != 0));
               this.moveCursorActionsDropdownTo(var1, var2, var3, var5);
               this.updateCursorActionsDropdownHover(var1, var2, var3, var5);
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(443267075, 31) != 0);
            }
         } else {
            int var25 = var2.actionsRenderedRawIndexes.size();
            int var28 = this.resolveActionSlotByHit(var2, var3, var5, var25);
            EditorRect var12 = this.resolveActionsListRect(var2, var25);
            if (var28 < Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704282109, 16) || var28 > var25) {
               boolean var31 = this.isInsideRect(var12, var3, var5);
               boolean var32 = this.isInsideShellBlock(
                  var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA"), var3, var5
               );
               if (!var31 && !var32) {
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 2) != 0);
               } else {
                  int var33 = var2.actionsSelectedIndex < 0 && var2.pendingActionIndex < 0 && !var2.cursorActionsEditDropdownVisible
                     ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 28)
                     : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1838434301, 27);
                  this.clearActionsReorderState(var2);
                  this.clearActionsReorderGhostHud(var1, var2);
                  if (var33 != 0) {
                     var2.actionsSelectedIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 2);
                     var2.pendingActionTargetId = null;
                     var2.pendingActionIndex = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981628, 8);
                     this.resetActionsEditClickTracker(var2);
                     if (var2.cursorActionsEditDropdownVisible) {
                        this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 7) != 0));
                     }

                     this.updateEditorPropertiesSidebar(var1, var2);
                  }

                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 24) != 0);
               }
            } else if (var9.isBlank()) {
               return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1582803952, 3) != 0);
            } else {
               List var30 = this.resolveTargetActionsRawList(var2, var9, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 12) != 0));
               int var14 = (Integer)var2.actionsRenderedRawIndexes.get(var28 - Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1038272430, 21));
               if (var30 != null && var14 >= 0 && var14 < var30.size()) {
                  Map var15 = (Map)var30.get(var14);
                  String var16 = this.normalizeActionType(
                     this.stringValue(var15.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt")))
                  );
                  int var17 = var2.actionsSelectedIndex == var14
                     ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1637107709, 26)
                     : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 0);
                  boolean var18 = this.isEditableActionType(var16);
                  long var19 = var7 - var2.actionsLastClickTick;
                  int var21 = var19 >= Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(-4430467451551676092L, 62)
                        && var19 <= Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3769667781642626133L, 51)
                     ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191736546, 15)
                     : Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(373125614, 0);
                  boolean var22 = this.hasActionsEditMovementExceeded(var2, var14, var3, var5);
                  int var23 = var18 && var17 != 0 && var2.actionsLastClickIndex == var14 && var21 != 0 && !this.isActionsReorderActive(var2) && !var22
                     ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1309962376, 3)
                     : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 11);
                  if (var23 != 0) {
                     this.clearActionsReorderState(var2);
                     this.clearActionsReorderGhostHud(var1, var2);
                     this.resetActionsEditClickTracker(var2);
                     this.startSidebarActionInputPrompt(var1, var2, var9, var14, var16, this.resolveActionDisplayValue(var15, var16));
                     return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216574, 0) != 0);
                  } else {
                     var2.actionsSelectedIndex = var14;
                     var2.pendingActionTargetId = null;
                     var2.pendingActionIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 8);
                     if (var2.cursorActionsEditDropdownVisible) {
                        this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 0) != 0));
                     }

                     var2.actionsLastClickIndex = var14;
                     var2.actionsLastClickTick = var7;
                     this.armActionsReorder(var2, var14, var3, var5);
                     this.clearActionsReorderGhostHud(var1, var2);
                     this.updateEditorPropertiesSidebar(var1, var2);
                     return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(889881108, 8) != 0);
                  }
               } else {
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1030876950, 8) != 0);
               }
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 16) != 0);
      }
   }

   @Override
   public boolean handleActionsPanelRightClick(Player var1, EditorSession var2, double var3, double var5) {
      if (((-1737730379 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null) {
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 29) != 0);
      } else if (var2.rightSidebarTab == EditorSidebarTab.PROPERTIES && this.isActionsSidebarMode(var2)) {
         String var7 = this.resolveSelectedActionsTargetId(var2);
         if (!var7.isBlank()
            && this.isInsideShellBlock(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("he9A8vhAAObUbP0nn8dMzCjY5Rgk6bgAVcHs6pl5mtkxj5BllITxJ0KrH9KlYdea3BLkCmJDRN6omFV946P3Hw=="),
               var3,
               var5
            )) {
            this.setFileDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1889764475, 6) != 0));
            this.setEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 12) != 0));
            this.setSelectionDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 1) != 0));
            this.setLayerDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1027101123, 29) != 0));
            this.setWindowDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4) != 0));
            this.moveCursorActionsDropdownTo(var1, var2, var3, var5);
            this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 4) != 0));
            this.moveCursorActionsDropdownTo(var1, var2, var3, var5);
            this.updateCursorActionsDropdownHover(var1, var2, var3, var5);
            return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1706313725, 21) != 0);
         } else {
            if (var2.cursorActionsEditDropdownVisible) {
               String var8 = this.resolveHoveredCursorActionsEditDropdownTargetId(var2, var3, var5);
               if (!var8.isBlank()) {
                  this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1117832461, 14) != 0));
                  this.playEditorSfx(
                     var1,
                     var2,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Mm+BFqg2eKsUmTOp1evmiNayvcSeMCLYpxktq+L50crX3kKpx3haPvgOhR6O5AuC67/HgGjYhsMHK2mbmHUDdDBhrWn19w==")
                  );
                  this.handleCursorActionsEditDropdownAction(var1, var2, var8);
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1637107709, 26) != 0);
               }

               double var9 = var2.shellHitX(var3);
               double var11 = var2.shellHitY(var5);
               if (this.isInsideShellBlock(
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
                  ),
                  var9,
                  var11
               )) {
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 16) != 0);
               }

               this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 31) != 0));
            }

            int var13 = var2.actionsRenderedRawIndexes.size();
            int var14 = this.resolveActionSlotByHit(var2, var3, var5, var13);
            EditorRect var10 = this.resolveActionsListRect(var2, var13);
            if (var14 < Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(139514922, 26) || var14 > var13) {
               return this.isInsideRect(var10, var3, var5);
            } else if (var7.isBlank()) {
               return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-630474749, 30) != 0);
            } else {
               List var15 = this.resolveTargetActionsRawList(var2, var7, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 26) != 0));
               int var12 = (Integer)var2.actionsRenderedRawIndexes.get(var14 - Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(339020418, 0));
               if (var15 != null && var12 >= 0 && var12 < var15.size()) {
                  var2.actionsSelectedIndex = var12;
                  var2.pendingActionTargetId = null;
                  var2.pendingActionIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 21);
                  this.clearActionsReorderState(var2);
                  this.setFileDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4) != 0));
                  this.setEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(444940682, 7) != 0));
                  this.setSelectionDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1977973439, 31) != 0));
                  this.setLayerDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2061753388, 9) != 0));
                  this.setWindowDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2036248478, 5) != 0));
                  if (var2.cursorActionsDropdownVisible) {
                     this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1202129465, 26) != 0));
                  }

                  this.updateEditorPropertiesSidebar(var1, var2);
                  this.moveCursorActionsEditDropdownTo(var1, var2, var3, var5);
                  this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762216, 9) != 0));
                  this.moveCursorActionsEditDropdownTo(var1, var2, var3, var5);
                  this.updateCursorActionsEditDropdownHover(var1, var2, var3, var5);
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 14) != 0);
               } else {
                  return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704215549, 10) != 0);
               }
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1675042529, 4) != 0);
      }
   }

   @Override
   public boolean handleActionsScroll(Player var1, EditorSession var2, double var3, double var5, int var7) {
      if ((-985747857 ^ -985747857) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var7 != 0 && var2.rightSidebarTab == EditorSidebarTab.PROPERTIES && this.isActionsSidebarMode(var2)) {
         String var8 = this.resolveSelectedActionsTargetId(var2);
         List var9 = this.resolveTargetActionsRawList(var2, var8, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1470883679, 11) != 0));
         int var10 = var9 == null ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 17) : var9.size();
         int var11 = Math.max(
            Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 9),
            Math.min(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1846535803, 21), Math.max(Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(279029844, 27), var10))
         );
         EditorRect var12 = this.resolveActionsListRect(var2, var11);
         if (!this.isInsideRect(var12, var3, var5)) {
            return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1309962384, 3) != 0);
         } else {
            int var13 = var7 > 0 ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1030876950, 8) : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1678763644, 27);
            int var14 = Math.max(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-472109958, 17), var10 - Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588444538, 13));
            if (var14 <= 0) {
               var2.actionsScrollOffset = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 17);
               this.flashActionsScrollEdge(
                  var1, var2, ((var13 < 0 ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-980460421, 30) : Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588567418, 13)) != 0)
               );
               return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2062728544, 30) != 0);
            } else {
               int var15 = (int)Math.floor(
                  this.clampLayersScrollValue(var2.actionsScrollOffset, var14)
                     + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(5013379794106626558L, 38))
               );
               int var16 = (int)Math.floor(
                  this.clampLayersScrollValue(var15 + var13, var14) + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(5883794141813819357L, 53))
               );
               if (var16 == var15) {
                  this.flashActionsScrollEdge(
                     var1,
                     var2,
                     ((var13 < 0 ? Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588575610, 13) : Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762728, 9)) != 0)
                  );
                  return (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1030876950, 8) != 0);
               } else {
                  var2.actionsScrollOffset = var16;
                  this.renderActionsPanel(var1, var2);
                  return (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 22) != 0);
               }
            }
         }
      } else {
         return (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 25) != 0);
      }
   }

   @Override
   public void flashActionsScrollEdge(Player var1, EditorSession var2, boolean var3) {
      if (((1950047004 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var4 = var3
            ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("BIxaL08l/3Ub+99Y8OF7QWaOkz/lR2lNTD7oTv9TgobL0F3A1lRpG9AehXqH2/liZ502pEUfuu+RYUdDC3WQhw==")
            : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VmS0AmcxMKeyongqXv3Vz79kBCChx/zQTXPwz1aFjSa93HsVkb0J5aRNVwP4hbRWxiKTjbSJsfCcUnvs666KCJ6j1QhJIw==");
         int var5 = this.getShellOpacity(var1, var2, var4, Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944219915, 18));
         int var6 = var3
            ? (var2.actionsScrollTopFlashToken = var2.actionsScrollTopFlashToken + Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2024926095, 27))
            : (var2.actionsScrollBottomFlashToken = var2.actionsScrollBottomFlashToken + Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1703167997, 20));
         int[] var10000 = new int[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1091181189, 23)];
         var10000[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(515438347, 7)] = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 22);
         int[] var7 = var10000;
         Xqedii_38o2zes.Xqedii_j3mggbv(
            this.plugin,
            var1,
            Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 11),
            Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-1320911616738219818L, 16),
            var8 -> {
               if (((421747044 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else if (!var1.isOnline()) {
                  var8.cancel();
               } else {
                  EditorSession var9 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
                  if (var9 != var2) {
                     var8.cancel();
                  } else {
                     int var10 = var3 ? var2.actionsScrollTopFlashToken : var2.actionsScrollBottomFlashToken;
                     if (var10 != var6) {
                        var8.cancel();
                     } else if (var2.rightSidebarTab == EditorSidebarTab.PROPERTIES && this.isActionsSidebarMode(var2)) {
                        var7[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 28)] += Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(373125615, 0);
                        int var11;
                        if (var7[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-300532367, 24)] <= Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371659577, 13)) {
                           double var12 = var7[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371684153, 13)]
                              / Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3756156982760514644L, 2));
                           var11 = (int)Math.round(
                              var5 + (Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149507082265685L, 40)) - var5) * var12
                           );
                        } else {
                           int var14 = var7[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 22)] - Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216561, 2);
                           var11 = (int)Math.round(
                              Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783509978037L, 24))
                                 * (
                                    Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-2111373293547436609L, 54))
                                       - var14 / Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(8358835801933162069L, 11))
                                 )
                           );
                        }

                        this.setShellOpacity(
                           var1,
                           var4,
                           Math.max(Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 11), Math.min(Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(351807594, 17), var11))
                        );
                        if (var7[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 17)] >= Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1710508029, 20)) {
                           this.setShellOpacity(var1, var4, Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 5));
                           var8.cancel();
                        }
                     } else {
                        this.setShellOpacity(var1, var4, Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 4));
                        var8.cancel();
                     }
                  }
               }
            }
         );
      }
   }

   @Override
   public void setCursorActionsEditDropdownVisible(Player var1, EditorSession var2, boolean var3) {
      if ((338439554 ^ 338439554) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (var2.cursorActionsEditDropdownVisible == var3) {
            if (var3) {
               double var12 = var2.cursorX + var2.hitboxOffsetX;
               double var13 = var2.cursorY + var2.hitboxOffsetY;
               this.moveCursorActionsEditDropdownTo(var1, var2, var12, var13);
               this.updateCursorActionsEditDropdownHover(var1, var2, var12, var13);
            }
         } else {
            double var4 = var2.cursorX + var2.hitboxOffsetX;
            double var6 = var2.cursorY + var2.hitboxOffsetY;
            var2.cursorActionsEditDropdownVisible = var3;
            if (!var3) {
               var2.cursorActionsEditDropdownHoverTargetId = null;
            } else {
               this.playEditorSfx(
                  var1, var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("N74lYY/MfHPVIlI8xV0wF7xw0tF97ybAUWRWWkbftO9vDXOWpSUTlY329M3y2PbGL+Yll9XjsResGQ==")
               );
            }

            this.beginShellOpacityBatch(var2);

            try {
               this.setSidebarPanelVisible(
                  var1,
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
                  ),
                  var3
               );
               this.updateSidebarTabVisualState(
                  var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 20) != 0), (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 23) != 0)
               );
            } finally {
               this.endShellOpacityBatch(var1, var2);
            }

            if (var3) {
               this.updateCursorActionsEditDropdownHover(var1, var2, var4, var6);
            } else {
               for (String var9 : Xqedii_1ks01f9.Xqedii_2z29p1g) {
                  this.setCursorActionsEditDropdownItemVisual(var1, var2, var9, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-988986720, 30) != 0));
               }
            }
         }
      }
   }

   @Override
   public void updateCursorActionsEditDropdownHover(Player var1, EditorSession var2, double var3, double var5) {
      if ((775338588 * 775338588 - 775338588 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var7 = var2.cursorActionsEditDropdownVisible ? this.resolveHoveredCursorActionsEditDropdownTargetId(var2, var3, var5) : null;
         if (!this.equalsNullable(var2.cursorActionsEditDropdownHoverTargetId, var7)) {
            var2.cursorActionsEditDropdownHoverTargetId = var7;

            for (String var9 : Xqedii_1ks01f9.Xqedii_2z29p1g) {
               this.setCursorActionsEditDropdownItemVisual(var1, var2, var9, this.equalsNullable(var9, var7));
            }
         }
      }
   }

   @Override
   public void setCursorActionsEditDropdownItemVisual(Player var1, EditorSession var2, String var3, boolean var4) {
      if ((851486292 * 851486292 - 851486292 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         String[] var5 = (String[])Xqedii_1ks01f9.Xqedii_33b37z4.get(var3);
         if (var5 != null && var5.length >= Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1030877206, 8)) {
            this.setShellText(
               var1,
               Xqedii_2liqczhp3twlk(var3),
               var4 ? var5[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944882206, 5)] : var5[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 19)]
            );
         }

         this.setShellColor(
            var1,
            var2,
            var3,
            var4
               ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("X4pfpnffhHe5il+OkOEcs9uX/+zoaoH08rmJYOLciRtsu62CEz0iTA==")
               : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XE8nds1HxclAHa901ys65Z+K/YJ/6EF7Quu9hrVHg4R+qomPzxEzuQ==")
         );
      }
   }

   @Override
   public String resolveHoveredCursorActionsEditDropdownTargetId(EditorSession var1, double var2, double var4) {
      if ((955021954 ^ 955021954) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.cursorActionsEditDropdownVisible) {
         double var6 = var1.shellHitX(var2);
         double var8 = var1.shellHitY(var4);
         int var10 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1473166512, 20);

         for (String var12 : Xqedii_1ks01f9.Xqedii_2z29p1g) {
            String var13 = Xqedii_35sjuav3cn67d(var12);
            EditorRect var14 = this.findShellBlockRect(var1, var13);
            if (var14 != null) {
               var10++;
               if (var14.contains(var6, var8)) {
                  return var12;
               }
            }
         }

         if (var10 == Xqedii_1ks01f9.Xqedii_2z29p1g.size()) {
            return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
         } else {
            EditorRect var15 = this.findShellBlockRect(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
               )
            );
            if (var15 != null && var15.contains(var6, var8)) {
               double var16 = Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(-8251669099123640684L, 6));
               int var19 = (int)Math.floor((var8 - var15.y) / Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-3055990279112471690L, 23)));
               if (var19 >= 0 && var19 < Xqedii_1ks01f9.Xqedii_2z29p1g.size()) {
                  return (String)Xqedii_1ks01f9.Xqedii_2z29p1g.get(var19);
               }
            }

            for (String var18 : Xqedii_1ks01f9.Xqedii_2z29p1g) {
               if (this.isInsideShellBlock(var1, var18, var6, var8)) {
                  return var18;
               }
            }

            return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
         }
      } else {
         return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
      }
   }

   @Override
   public void moveCursorActionsEditDropdownTo(Player var1, EditorSession var2, double var3, double var5) {
      if ((-915080968 * -915080968 - -915080968 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.shellBlocks != null && !var2.shellBlocks.isEmpty()) {
         ConfigurationSection var7 = this.findShellBlockSection(
            var2,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
            )
         );
         EditorRect var8 = this.findShellBlockRect(
            var2,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
            )
         );
         if (var7 != null && var8 != null) {
            double var9 = var2.shellHitX(var3);
            double var11 = var2.shellHitY(var5);
            double var13 = var9;
            double var15 = var11;
            boolean var17 = this.isInsidePreviewArea(var2, var3, var5);
            if (var17) {
               EditorRect var18 = this.findShellBlockRect(var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Tp794hH//CGkDyRs3a49O8ICklcZaQfnDxPLNyN5k5pPmorRMNHC+doN"));
               if (var18 != null) {
                  double var19 = var18.maxX() - var8.width;
                  int var21 = var9 > var19 ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 12) : Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1888439829, 19);
                  var13 = Math.max(var18.x, Math.min(var19, var9));
                  var15 = Math.max(var18.y, Math.min(var18.maxY() - var8.height, var11));
                  if (var21 != 0) {
                     var13 = Math.max(var18.x, var13 - Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979044182L, 15)));
                  }
               }
            } else {
               double var31 = var2.yaml == null
                  ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149748873405525L, 37))
                  : var2.yaml
                     .getDouble(
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4VEriEywPMG+dx6o7eGlfJnuDB2KDJ7CB2M3ztbgx2s277YjhOkmd/tA3s54y2EMfz3u6g=="),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-5189177691367916680L, 43))
                     );
               double var20 = var2.yaml == null
                  ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(1286839546477219173L, 22))
                  : var2.yaml
                     .getDouble(
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("eycoEpSnICyIb6HgO7mCnhd6meBsmPUYSQjUzNOrU/86YQ2mP3WiPJJ/ed5R30Aipcq7LsL8"),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(8003042804059106649L, 35))
                     );
               double var22 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(5147358185904645300L, 24)), var31 - var8.width);
               double var24 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(1519764112683183615L, 57)), var20 - var8.height);
               int var26 = var9 > var22 ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 20) : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 28);
               var13 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(5095661734275876101L, 3)), Math.min(var22, var9));
               var15 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783505773653L, 24)), Math.min(var24, var11));
               if (var26 != 0) {
                  var13 = Math.max(
                     Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(9206841782986585995L, 47)),
                     var13 - Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-7680732079574805097L, 9))
                  );
               }
            }

            double var32 = var13 - var8.x;
            double var33 = var15 - var8.y;
            if (!(Math.abs(var32) < Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(5883794141813819357L, 53)))
               || !(Math.abs(var33) < Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(9163073495908590819L, 39)))) {
               String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 26)];
               var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 0)] = var7.getString(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
               );
               String var34 = this.firstNonBlank(var10001);
               if (var34.isBlank()) {
                  this.moveShellElement(
                     var1,
                     var2,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "XCYrD5B5hQ8BfQjiGMnUBSP7p98sPebNgITK+PP5xcGUBMF3MMXGYMDXNpkY9UlB6FvserQLgT1+m3/whlH20pSZtRcGC3LCuVWFvJ+cdO6bu1tJ"
                     ),
                     var13,
                     var15,
                     var8.width,
                     var8.height
                  );
               } else {
                  HashMap var23 = new HashMap();
                  int var35 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 8);

                  for (Map var36 : var2.shellBlocks) {
                     var35++;
                     ConfigurationSection var27 = this.mapToSection(var36);
                     if (var27 != null) {
                        var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1346537121, 21)];
                        var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 25)] = var27.getString(
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
                        );
                        String var28 = this.firstNonBlank(var10001);
                        if (this.belongsToSidebarPanel(var34, var28)) {
                           String var29 = this.resolveElementId(var27, var35, var23);
                           if (!var29.isBlank()) {
                              EditorRect var30 = this.findShellBlockRect(var2, var29);
                              if (var30 != null) {
                                 this.moveShellElement(var1, var2, var29, var30.x + var32, var30.y + var33, var30.width, var30.height);
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

   @Override
   public void moveCursorActionsDropdownTo(Player var1, EditorSession var2, double var3, double var5) {
      if (((-1943843023 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.shellBlocks != null && !var2.shellBlocks.isEmpty()) {
         ConfigurationSection var7 = this.findShellBlockSection(
            var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY=")
         );
         EditorRect var8 = this.findShellBlockRect(
            var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY=")
         );
         if (var7 != null && var8 != null) {
            double var9 = var2.shellHitX(var3);
            double var11 = var2.shellHitY(var5);
            double var13 = var9;
            double var15 = var11;
            boolean var17 = this.isInsidePreviewArea(var2, var3, var5);
            if (var17) {
               EditorRect var18 = this.findShellBlockRect(var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Tp794hH//CGkDyRs3a49O8ICklcZaQfnDxPLNyN5k5pPmorRMNHC+doN"));
               if (var18 != null) {
                  double var19 = var18.maxX() - var8.width;
                  int var21 = var9 > var19 ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 23) : Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944882238, 5);
                  var13 = Math.max(var18.x, Math.min(var19, var9));
                  var15 = Math.max(var18.y, Math.min(var18.maxY() - var8.height, var11));
                  if (var21 != 0) {
                     var13 = Math.max(var18.x, var13 - Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(6170559829119882846L, 11)));
                  }
               }
            } else {
               double var31 = var2.yaml == null
                  ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(3314391595585408734L, 41))
                  : var2.yaml
                     .getDouble(
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4VEriEywPMG+dx6o7eGlfJnuDB2KDJ7CB2M3ztbgx2s277YjhOkmd/tA3s54y2EMfz3u6g=="),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153472693040827L, 33))
                     );
               double var20 = var2.yaml == null
                  ? Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(2380731314742145758L, 44))
                  : var2.yaml
                     .getDouble(
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("eycoEpSnICyIb6HgO7mCnhd6meBsmPUYSQjUzNOrU/86YQ2mP3WiPJJ/ed5R30Aipcq7LsL8"),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-3419327959360331455L, 1))
                     );
               double var22 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 3)), var31 - var8.width);
               double var24 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-2157047574489617619L, 40)), var20 - var8.height);
               int var26 = var9 > var22 ? Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1346537121, 21) : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 20);
               var13 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 22)), Math.min(var22, var9));
               var15 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-2959521166557929304L, 8)), Math.min(var24, var11));
               if (var26 != 0) {
                  var13 = Math.max(
                     Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 52)),
                     var13 - Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(8570754679703382852L, 28))
                  );
               }
            }

            double var32 = var13 - var8.x;
            double var33 = var15 - var8.y;
            if (!(Math.abs(var32) < Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(783392120607697101L, 50)))
               || !(Math.abs(var33) < Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(3759235391856747939L, 44)))) {
               String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-141877576, 23)];
               var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1410900392, 19)] = var7.getString(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
               );
               String var34 = this.firstNonBlank(var10001);
               if (var34.isBlank()) {
                  this.moveShellElement(
                     var1,
                     var2,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY="),
                     var13,
                     var15,
                     var8.width,
                     var8.height
                  );
               } else {
                  HashMap var23 = new HashMap();
                  int var35 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1675042529, 4);

                  for (Map var36 : var2.shellBlocks) {
                     var35++;
                     ConfigurationSection var27 = this.mapToSection(var36);
                     if (var27 != null) {
                        var10001 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 22)];
                        var10001[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-601064733, 25)] = var27.getString(
                           Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
                        );
                        String var28 = this.firstNonBlank(var10001);
                        if (this.belongsToSidebarPanel(var34, var28)) {
                           String var29 = this.resolveElementId(var27, var35, var23);
                           if (!var29.isBlank()) {
                              EditorRect var30 = this.findShellBlockRect(var2, var29);
                              if (var30 != null) {
                                 this.moveShellElement(var1, var2, var29, var30.x + var32, var30.y + var33, var30.width, var30.height);
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

   @Override
   public void setCursorActionsDropdownVisible(Player var1, EditorSession var2, boolean var3) {
      if (((-1263963728 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (var3 && var2.cursorActionsEditDropdownVisible) {
            this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 11) != 0));
         }

         if (var2.cursorActionsDropdownVisible == var3) {
            if (var3) {
               this.updateCursorActionsDropdownHover(var1, var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
            }
         } else {
            var2.cursorActionsDropdownVisible = var3;
            if (!var3) {
               var2.cursorActionsDropdownHoverTargetId = null;
            } else {
               this.playEditorSfx(
                  var1, var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("N74lYY/MfHPVIlI8xV0wF7xw0tF97ybAUWRWWkbftO9vDXOWpSUTlY329M3y2PbGL+Yll9XjsResGQ==")
               );
            }

            this.beginShellOpacityBatch(var2);

            try {
               this.setSidebarPanelVisible(
                  var1,
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY="),
                  var3
               );
               this.updateSidebarTabVisualState(
                  var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4) != 0), (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 28) != 0)
               );
            } finally {
               this.endShellOpacityBatch(var1, var2);
            }

            if (var3) {
               this.updateCursorActionsDropdownHover(var1, var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
            } else {
               for (String var5 : Xqedii_1ks01f9.Xqedii_2csgy8p) {
                  this.setCursorActionsDropdownItemVisual(var1, var2, var5, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(889881364, 8) != 0));
               }
            }
         }
      }
   }

   @Override
   public void updateCursorActionsDropdownHover(Player var1, EditorSession var2, double var3, double var5) {
      if ((426421883 * 426421883 - 426421883 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var7 = var2.cursorActionsDropdownVisible ? this.resolveHoveredCursorActionsDropdownTargetId(var2, var3, var5) : null;
         if (!this.equalsNullable(var2.cursorActionsDropdownHoverTargetId, var7)) {
            var2.cursorActionsDropdownHoverTargetId = var7;

            for (String var9 : Xqedii_1ks01f9.Xqedii_2csgy8p) {
               this.setCursorActionsDropdownItemVisual(var1, var2, var9, this.equalsNullable(var9, var7));
            }
         }
      }
   }

   @Override
   public void setCursorActionsDropdownItemVisual(Player var1, EditorSession var2, String var3, boolean var4) {
      if (((-175806889 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         String[] var5 = (String[])Xqedii_1ks01f9.Xqedii_zl53nom.get(var3);
         if (var5 != null && var5.length >= Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191703778, 15)) {
            this.setShellText(
               var1,
               Xqedii_3aqyolsowua3a(var3),
               var4 ? var5[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 18)] : var5[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1911428669, 16)]
            );
         }

         this.setShellColor(
            var1,
            var2,
            var3,
            var4
               ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("X4pfpnffhHe5il+OkOEcs9uX/+zoaoH08rmJYOLciRtsu62CEz0iTA==")
               : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XE8nds1HxclAHa901ys65Z+K/YJ/6EF7Quu9hrVHg4R+qomPzxEzuQ==")
         );
      }
   }

   @Override
   public String resolveHoveredCursorActionsDropdownTargetId(EditorSession var1, double var2, double var4) {
      if ((-1972754740 * (-1972754740 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.cursorActionsDropdownVisible) {
         double var6 = var1.shellHitX(var2);
         double var8 = var1.shellHitY(var4);
         int var10 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 10);

         for (String var12 : Xqedii_1ks01f9.Xqedii_2csgy8p) {
            String var13 = Xqedii_2as6w0kj39tai(var12);
            EditorRect var14 = this.findShellBlockRect(var1, var13);
            if (var14 != null) {
               var10++;
               if (var14.contains(var6, var8)) {
                  return var12;
               }
            }
         }

         if (var10 == Xqedii_1ks01f9.Xqedii_2csgy8p.size()) {
            return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
         } else {
            EditorRect var15 = this.findShellBlockRect(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7V7u1lVI1pgVZGuYkPiRmXm1JXmXkU+0Bift/VDNTeapMrRGflVQkRZcJ4F8X4EuRn3MSo6FYJJ/1v8vsr1HH6I2xbG4WTheWIY=")
            );
            if (var15 != null && var15.contains(var6, var8)) {
               double var16 = Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(2718884222181058618L, 6));
               int var19 = (int)Math.floor((var8 - var15.y) / Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149782436226133L, 32)));
               if (var19 >= 0 && var19 < Xqedii_1ks01f9.Xqedii_2csgy8p.size()) {
                  return (String)Xqedii_1ks01f9.Xqedii_2csgy8p.get(var19);
               }
            }

            for (String var18 : Xqedii_1ks01f9.Xqedii_2csgy8p) {
               if (this.isInsideShellBlock(var1, var18, var6, var8)) {
                  return var18;
               }
            }

            return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
         }
      } else {
         return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==");
      }
   }

   @Override
   public void renderActionsPanel(Player var1, EditorSession var2) {
      if (((-1915036094 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (this.isActionsPanelRuntimeAvailable(var2) && var2.rightSidebarTab == EditorSidebarTab.PROPERTIES && this.isActionsSidebarMode(var2)) {
            String var3 = this.resolveSelectedActionsTargetId(var2);
            int var4 = !var3.isBlank() ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1191736546, 15) : Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1977973439, 31);
            this.setActionsNewButtonVisible(var1, var2, (var4 != 0));
            if (var4 == 0 && var2.cursorActionsDropdownVisible) {
               this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 30) != 0));
            }

            if (var4 == 0 && var2.cursorActionsEditDropdownVisible) {
               this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(413247572, 27) != 0));
            }

            if (var4 == 0) {
               var2.actionsScrollOffset = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 14);
            }

            List var5 = (List)this.resolveTargetActionsRawList(var2, var3, Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(176362549, 16) != 0);
            if (var5 == null) {
               var5 = new ArrayList();
            }

            ArrayList var6 = new ArrayList();
            int var7 = this.isActionsReorderActive(var2) && this.isActionsReorderLeftHeld(var2)
               ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216061, 9)
               : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 23);
            int var8 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1960920842, 31);
            if (var7 != 0) {
               var8 = var2.actionsReorderCurrentIndex >= 0 ? var2.actionsReorderCurrentIndex : var2.actionsReorderArmedIndex;
               if (var8 < 0 || var8 >= var5.size()) {
                  var7 = Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 12);
               }
            }

            for (int var9 = Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1348634273, 21); var9 < var5.size(); var9++) {
               Map var10;
               String var11;
               int var10000;
               label111: {
                  var10 = (Map)var5.get(var9);
                  var11 = this.normalizeActionType(
                     this.stringValue(var10.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt")))
                  );
                  if (var2.pendingPropertyField == null && var9 == var2.pendingActionIndex) {
                     String[] var10003 = new String[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 4)];
                     var10003[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 31)] = var2.pendingActionTargetId;
                     if (this.equalsNullable(var3, this.firstNonBlank(var10003).trim())) {
                        var10000 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(515438475, 7);
                        break label111;
                     }
                  }

                  var10000 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 19);
               }

               int var12 = var10000;
               String var13 = var12 != 0
                  ? this.resolveEditorPromptDraft(var2, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vR4ma4Fun3EjTb0Ia/Q8q/pWT0Fwxy80WmrSSwvRjMBixg=="))
                  : this.resolveActionDisplayValue(var10, var11);
               int var14 = var7 != 0 && var9 == var8
                  ? Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-567510301, 25)
                  : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 7);
               var6.add(new EditorSidebarShellPart.ActionRowEntry(var9, var11, var13, (var14 != 0)));
            }

            if (var6.isEmpty()) {
               var2.actionsSelectedIndex = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 17);
            } else if (var2.actionsSelectedIndex < 0 || var2.actionsSelectedIndex >= var6.size()) {
               var2.actionsSelectedIndex = Math.max(
                  Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 4), var6.size() - Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216445, 7)
               );
            }

            int var15 = Math.max(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 9), var6.size() - Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944881694, 5));
            int var16 = (int)Math.floor(
               this.clampLayersScrollValue(var2.actionsScrollOffset, var15)
                  + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(-7442985941425838725L, 8))
            );
            int var17 = Math.min(var6.size(), var16 + Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812980347, 6));
            var2.actionsScrollOffset = var16;
            List var18 = var17 <= var16 ? Collections.emptyList() : var6.subList(var16, var17);
            this.renderActionsRuntimeRows(var1, var2, var18);
            if (var2.actionsReorderArmedIndex >= 0 && !this.isActionsReorderLeftHeld(var2)) {
               this.clearActionsReorderState(var2);
            }

            if (var2.actionsReorderArmedIndex < 0 || !this.isActionsReorderLeftHeld(var2)) {
               this.clearActionsReorderGhostHud(var1, var2);
            }
         } else {
            this.setShellOpacity(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("BIxaL08l/3Ub+99Y8OF7QWaOkz/lR2lNTD7oTv9TgobL0F3A1lRpG9AehXqH2/liZ502pEUfuu+RYUdDC3WQhw=="),
               Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 3)
            );
            this.setShellOpacity(
               var1,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VmS0AmcxMKeyongqXv3Vz79kBCChx/zQTXPwz1aFjSa93HsVkb0J5aRNVwP4hbRWxiKTjbSJsfCcUnvs666KCJ6j1QhJIw=="),
               Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2095827702, 24)
            );
            if (var2.cursorActionsDropdownVisible) {
               this.setCursorActionsDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 31) != 0));
            }

            if (var2.cursorActionsEditDropdownVisible) {
               this.setCursorActionsEditDropdownVisible(var1, var2, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 18) != 0));
            }

            this.clearActionsRuntimeHud(var1, var2);
         }
      }
   }

   @Override
   public void setActionsNewButtonVisible(Player var1, EditorSession var2, boolean var3) {
      if ((-338074428 * -338074428 + -338074428 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.setShellOpacity(
            var1,
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("17vbKHOIU7AdZJuq2fScQt1LrC6rHEwP7QOojMIbS1gtLMvjEHAztpjEQYNXXMs4cFjcfVjbEl2T2TrpoczVIg=="),
            var3 ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1676666491, 20) : Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 22)
         );
      }
   }

   @Override
   public boolean isActionsPanelRuntimeAvailable(EditorSession var1) {
      if ((-1118680347 * -1118680347 - -1118680347 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1582803944, 3) != 0);
      } else {
         return ((this.findShellBlockSection(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA"))
               != null
            ? Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216317, 8)
            : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 3)) != 0);
      }
   }

   @Override
   public void renderActionsRuntimeRows(Player var1, EditorSession var2, List<EditorSidebarShellPart.ActionRowEntry> var3) {
      if ((710424984 * (710424984 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var4 = this.buildActionsRuntimeGridBlocks(var2, var3);
         List<Map<String, Object>> var5 = this.resolveRenderableBlocksNoCopy(var4, var2.components);
         HashMap var6 = new HashMap();
         LinkedHashSet var7 = new LinkedHashSet();
         int var8 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 26);

         for (Map var10 : var5) {
            var8++;
            String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-133488968, 23)];
            var10001[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-472109958, 17)] = this.stringValue(
               this.readMapPathValue(var10, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"))
            );
            var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 14)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "yU7TBTjzAq2Us/SdmAhdOuH0sIcCFhkXxieJYxUlAIHX9rgJF/Q="
            );
            String var11 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            if (this.isRenderableBlockType(var11)) {
               String var12 = this.resolveElementId(var10, var8, var6);
               String var13 = this.actionRuntimeLogicalId(var12);
               if (this.canUseFastLayerRuntimeRender(var10, var11)) {
                  this.renderLayerShellElementFast(var1, var2, var10, var13, var11, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 8) != 0));
               } else {
                  ConfigurationSection var14 = this.mapToSection(var10);
                  if (var14 == null) {
                     continue;
                  }

                  this.renderLayerRuntimeShellElement(var1, var2, var14, var13, var11, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(444940682, 7) != 0));
               }

               var7.add(var13);
            }
         }

         this.clearStaleActionRuntimeShellIds(var1, var2, var7);
         var2.runtimeActionShellIds.clear();
         var2.runtimeActionShellIds.addAll(var7);
         var2.actionsRenderedRawIndexes.clear();
         if (var3 != null && !var3.isEmpty()) {
            for (EditorSidebarShellPart.ActionRowEntry var16 : var3) {
               var2.actionsRenderedRawIndexes.add(var16.rawIndex);
            }
         }
      }
   }

   @Override
   public List<Map<String, Object>> buildActionsRuntimeGridBlocks(EditorSession var1, List<EditorSidebarShellPart.ActionRowEntry> var2) {
      if ((462462374 * (462462374 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         if (var2 != null) {
            for (int var4 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216061, 9); var4 <= var2.size(); var4++) {
               EditorSidebarShellPart.ActionRowEntry var5 = (EditorSidebarShellPart.ActionRowEntry)var2.get(
                  var4 - Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-171459496, 10)
               );
               int var6 = var1 != null && var5.rawIndex == var1.actionsSelectedIndex
                  ? Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 12)
                  : Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 11);
               boolean var7 = var5.dragPlaceholder;
               LinkedHashMap var8 = new LinkedHashMap();
               var8.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GcujQXuEzqVWNW5jm4xAu4UkRzphZTnGrExLSyx8jtE="), this.actionSlotBaseId(var4));
               var8.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("CUgFMfNutRDO93bViQTyIIMLAlH5IeQ+TNYMksrFEaE2/eGK"), this.actionSlotBaseId(var4));
               String var10001 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF");
               String[] var10004 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(289624232, 28)];
               var10004[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1027101123, 29)] = var5.displayValue;
               var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1737771005, 25)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                  "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
               );
               var8.put(var10001, this.truncateLayerDisplayNameForDepth(this.firstNonBlank(var10004), Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1348634273, 21)));
               var8.put(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qD2yelL6pBSTRaAmyXuG9Fa7kC90SabDAhMBhtV9Z5QnURPi2Iaqc2ufzPUQAWbbOkk="),
                  Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 28)
               );
               if (var7) {
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF"),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("TCZj2Y1JpyS5tWcgyNwyT/XvBgWXEJE+Tv5EZH4C")
                  );
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("uJf7lKNNoqCtDc7+8AFB8Zszp6Lpk4gBbKpClJ8Bgah9Sq25NW+wOxu+Y8Lbr/VR"),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Cntt/wUO663TFV+bSfz2SnJY513fxBTzy/xeCq2FYSHkPO9/yg7FYQ==")
                  );
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XGIXPWi6UArxdODFsS4IlZKUBSNbwoe+lG1IrQEb9++tYuS0YaxosNoEVPEuOQ=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==")
                  );
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+KA/Gafe69Yyo+sSeLoexWLBCT0jzWocimMKjvGkLytU5L8fGCovMS7a/+dH7A=="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==")
                  );
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("e1kzLnzWp/Qs4+wbv591U1DUjB2TMqOFHpyVm0+lRHOUBpVzjTK4Cqoj0fJHqI2oc8A="),
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("7cZ1mZ9Ks2erOTxtuuwWNJa79aHdI6UH/MhNWQ==")
                  );
               } else {
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("uJf7lKNNoqCtDc7+8AFB8Zszp6Lpk4gBbKpClJ8Bgah9Sq25NW+wOxu+Y8Lbr/VR"),
                     var6 != 0
                        ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Ng9hJMqddFLI7ZB0m73+974eMBvbZJkx6+VuFKlzBwWeYOXBCzd3Og==")
                        : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Cntt/wUO663TFV+bSfz2SnJY513fxBTzy/xeCq2FYSHkPO9/yg7FYQ==")
                  );
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XGIXPWi6UArxdODFsS4IlZKUBSNbwoe+lG1IrQEb9++tYuS0YaxosNoEVPEuOQ=="),
                     var6 != 0
                        ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vxmUSISZKCZigcoLG8lySOcyrkR7wL/C5xMk4v/i")
                        : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("nIVHaC8fv625wT/zvGZ05UtYuUCSQoH+nqkJfrmB")
                  );
                  var8.put(
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+KA/Gafe69Yyo+sSeLoexWLBCT0jzWocimMKjvGkLytU5L8fGCovMS7a/+dH7A=="),
                     var6 != 0
                        ? Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xX3vN3zAyI+ZWqd4rGexXKAT9Joc+VaU914HiSln")
                        : Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Zwt1Vo+GxDr/3IkZr6b1dGjUjVeA9YCLCykgYG6y")
                  );
                  String var10000;
                  if (var6 != 0) {
                     String[] var18 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1342342817, 21)];
                     var18[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 3)] = (String)Xqedii_1ks01f9.Xqedii_1upy6vh.get(var5.actionType);
                     var18[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 19)] = (String)Xqedii_1ks01f9.Xqedii_1upy6vh
                        .get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3"));
                     var18[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704282109, 15)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                        "qdrRneEi2BGgmlXWP74JR9yv61JnfXHm4jqW+fNW"
                     );
                     var10000 = this.firstNonBlank(var18);
                  } else {
                     String[] var19 = new String[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-250200719, 24)];
                     var19[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1371684153, 13)] = (String)Xqedii_1ks01f9.Xqedii_2sy3jrf.get(var5.actionType);
                     var19[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(2024926095, 27)] = (String)Xqedii_1ks01f9.Xqedii_2sy3jrf
                        .get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3"));
                     var19[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(36203029, 25)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("k/4KgmclulI7thsjhbNqhV7MyC34GPQdBFGzbtyq");
                     var10000 = this.firstNonBlank(var19);
                  }

                  String var9 = var10000;
                  var8.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("e1kzLnzWp/Qs4+wbv591U1DUjB2TMqOFHpyVm0+lRHOUBpVzjTK4Cqoj0fJHqI2oc8A="), var9);
               }

               LinkedHashMap var17 = new LinkedHashMap();
               var17.put(
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GjeF7OeUrtkqX66L2I9RcZFej3nBE4tDg0MTBILrFDxBrZR9I+v56Hy3d5Vyqw=="),
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xd/xtOzlzFbpAXLtU1SaPgDzWS41mKZ4ZNO4MpHDI10HsBhIu5bD4NAdBeLrl1e5nCyDfXqR")
               );
               var17.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("n6oK8IrIqJNztPmSLV63etgyjiOm7WQL9EX3VQQKjFZWC3D5HTS9+g=="), var8);
               var3.add(var17);
            }
         }

         double var14 = this.resolveActionsGridStartX(var1);
         double var15 = this.resolveActionsGridStartY(var1);
         double var16 = this.resolveActionsGridGap(var1);
         Double var10 = this.resolveActionsGridElementHeight(var1);
         LinkedHashMap var11 = new LinkedHashMap();
         var11.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("C0czulqFW6fNMUwRD0p4dB3siZSnHC+SGKTm9w4M"), var14);
         var11.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wrkJr0cdjOLgvjc1qNRoez+uVFrqlxPfutVqZO7C"), var15);
         LinkedHashMap var12 = new LinkedHashMap();
         var12.put(
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"),
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+cEGd4ma0Wi5tj7CejMPkP/lTktKqtTaWdsYBwSM726f6Vd0TOFBP6ZK5AGPHkcb")
         );
         var12.put(
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("bP4Bc7VY0BOxUsIxdSt0i7LoVjV6RtnfdWwjpPYSPTvPyb/BCOaA0mDVAt+ggw=="),
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vq9VrKIlVp4HchB2195n2N08SsGq4El5DnUkSKYN4MTLAld7HRl7uA==")
         );
         var12.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("HHfQUBPbFebgSwOuJFVinMe9+DX+ETxjRJXRUS00irgxaA=="), var16);
         if (var10 != null) {
            var12.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4WI3lC3bXKVuq2WETzrllfQa/SmegbD/37iFNJKAbh68V6ixOUkYiJi9BVFKnA=="), var10);
         }

         var12.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("e0pnuVNJQCcMPJhPnU8VjQL++JTz79CPWxt2AJ0mSXosLknW/XAUhiBMzBM="), var11);
         var12.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Kn2uClEd/VKGRoBekS40V2HXqBC9QQMcWlkzUip8EOUG5M84OS5pfdYGYJ0="), var3);
         ArrayList var13 = new ArrayList();
         var13.add(var12);
         return var13;
      }
   }

   @Override
   public double resolveActionsGridStartX(EditorSession var1) {
      if ((1448881164 ^ 1448881164) != 0) {
         throw new IllegalStateException();
      } else {
         Map var2 = this.findActionsGridBlockMap(var1);
         if (var2 != null) {
            return this.readMapPathDouble(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("dFuNjKB2nBaiGOV+OiegPmGgToYBkZfdgL8Z9pjq+mOIipBeWBXfsHiilSZSYgTq"),
               this.readMapPathDouble(
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("C0czulqFW6fNMUwRD0p4dB3siZSnHC+SGKTm9w4M"),
                  Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042143181384906427L, 44))
               )
            );
         } else {
            EditorRect var3 = this.findShellBlockRect(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA"));
            if (var3 != null) {
               return var3.x + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(8003042804147645785L, 35));
            } else {
               EditorRect var4 = this.findShellBlockRect(
                  var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("26ETYm0lw2JgxBpv/rsvrmovUjcL7pgVYGZg+1qOVoe5J7nkXL8oMsB4w5fOj8MD0HaKwz47")
               );
               return var4 != null
                  ? var4.x + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-1899890703128045986L, 11))
                  : Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(8936195733433546427L, 57));
            }
         }
      }
   }

   @Override
   public double resolveActionsGridStartY(EditorSession var1) {
      if (((-1215878838 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var2 = this.findActionsGridBlockMap(var1);
         if (var2 != null) {
            return this.readMapPathDouble(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Vg059UjcYXJ55VIJG7R38IHiCFu0RQH34AyJ93maKON6ENdwRheLjuE2O3CD94kX"),
               this.readMapPathDouble(
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wrkJr0cdjOLgvjc1qNRoez+uVFrqlxPfutVqZO7C"),
                  Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042165234565576379L, 45))
               )
            );
         } else {
            EditorRect var3 = this.findShellBlockRect(var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA"));
            if (var3 != null) {
               return var3.y + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042143201316239035L, 44));
            } else {
               EditorRect var4 = this.findShellBlockRect(
                  var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("26ETYm0lw2JgxBpv/rsvrmovUjcL7pgVYGZg+1qOVoe5J7nkXL8oMsB4w5fOj8MD0HaKwz47")
               );
               return var4 != null
                  ? var4.y + Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-1078523650076387946L, 39))
                  : Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783639731285L, 29));
            }
         }
      }
   }

   @Override
   public double resolveActionsGridGap(EditorSession var1) {
      if (((1283658370 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var2 = this.findActionsGridBlockMap(var1);
         return var2 != null
            ? this.readMapPathDouble(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("HHfQUBPbFebgSwOuJFVinMe9+DX+ETxjRJXRUS00irgxaA=="),
               this.readMapPathDouble(
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("YTR9mX0m1ntBnOR+NVmuVr0v7e98YAuqA6zaMoZfnKPJOfBjr8s9pHNC"),
                  Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(-5221850643391727956L, 34))
               )
            )
            : Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-530088972807376529L, 52));
      }
   }

   @Override
   public Double resolveActionsGridElementHeight(EditorSession var1) {
      if ((-689690465 * (-689690465 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var2 = this.findActionsGridBlockMap(var1);
         if (var2 == null) {
            return null;
         } else {
            double var3 = this.readMapPathDouble(
               var2,
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("4WI3lC3bXKVuq2WETzrllfQa/SmegbD/37iFNJKAbh68V6ixOUkYiJi9BVFKnA=="),
               this.readMapPathDouble(
                  var2,
                  Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("0bN5d2f56MlzJqdbHCMbROfK7KutCNdtofQdvqr9jq4kpo4lGFPH6dN7RTlTgqo8t3RjCk8X"),
                  this.readMapPathDouble(
                     var2,
                     Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("JSEwK8fgY+3MW0YD3MS7Rg+h4VBN0B5QtMaJYF34YSU406mjWM/KztHltW9tPwr7dyyx7S5g2QI="),
                     this.readMapPathDouble(
                        var2,
                        Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("/UUNUUtUGu12zq3lXi6Muw04GcZStruS3wJiS7hKn8+tFfC0rBzWt3714nRc2JHrIaRi+bseFQk="),
                        Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(8465692717675640379L, 8))
                     )
                  )
               )
            );
            return !Double.isFinite(var3) ? null : Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(1447092394802920514L, 53)), var3);
         }
      }
   }

   @Override
   public Map<String, Object> findActionsGridBlockMap(EditorSession var1) {
      if ((-1846516348 * (-1846516348 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.shellBlocks != null && !var1.shellBlocks.isEmpty()) {
         ConfigurationSection var2 = this.findShellBlockSection(
            var1, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("U4VZruEszYrS/9aMHzRSG65eedmTxjL33zqe4CocGGHoAnQoiSFyaHyA")
         );
         String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-630474749, 30)];
         var10001[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-944219915, 18)] = var2 == null
            ? null
            : var2.getString(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs=")
            );
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return null;
         } else {
            for (Map var5 : var1.shellBlocks) {
               if (var5 != null && !var5.isEmpty()) {
                  var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216445, 6)];
                  var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762728, 9)] = this.stringValue(
                     this.readMapPathValue(var5, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"))
                  );
                  var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762216, 9)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                     "yU7TBTjzAq2Us/SdmAhdOuH0sIcCFhkXxieJYxUlAIHX9rgJF/Q="
                  );
                  String var6 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+cEGd4ma0Wi5tj7CejMPkP/lTktKqtTaWdsYBwSM726f6Vd0TOFBP6ZK5AGPHkcb").equals(var6)) {
                     var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704200189, 14)];
                     var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 1)] = this.stringValue(
                        this.readMapPathValue(var5, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GcujQXuEzqVWNW5jm4xAu4UkRzphZTnGrExLSyx8jtE="))
                     );
                     String var7 = this.firstNonBlank(var10001);
                     if (Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vyx4u80XoXsOy/JmqriSoL1P9Pxvs0QuwzlkREAb7zpI2Pc1Eedqvc+kGFqQbYoDT8N7oA==").equals(var7)) {
                        var10001 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588575610, 13)];
                        var10001[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1779762728, 9)] = this.stringValue(
                           this.readMapPathValue(
                              var5,
                              Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                                 "mzZhH8mMsaJSFpVYdoj/zxf6VEy/0VFF6o8VNwySdWpIT4EXWaivadXKLz2lEvlvnJF4VPBwooWqwwr4cdH4JiBSIQs="
                              )
                           )
                        );
                        String var8 = this.firstNonBlank(var10001);
                        if (this.belongsToSidebarPanel(var3, var8)) {
                           return var5;
                        }
                     }
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public EditorRect resolveActionsListRect(EditorSession var1, int var2) {
      if (((-264525260 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         EditorRect var3 = this.findShellBlockRect(var1, this.actionSlotId(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(515438475, 7)));
         if (var3 != null) {
            double var11 = this.resolveActionsRowStep(var1);
            int var12 = Math.max(Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(705188052, 18), var2);
            double var7 = var3.height
               + var11 * Math.max(Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 0), var12 - Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-685837981, 12));
            return new EditorRect(var3.x, var3.y, var3.width, Math.max(var3.height, var7));
         } else {
            double var4 = this.resolveActionsRowStep(var1);
            double var6 = this.resolveActionsGridStartX(var1);
            double var8 = this.resolveActionsGridStartY(var1);
            int var10 = Math.max(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342918991, 11), var2);
            return new EditorRect(var6, var8, Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(-9145774362645039426L, 3)), var4 * var10);
         }
      }
   }

   @Override
   public int resolveActionSlotByHit(EditorSession var1, double var2, double var4, int var6) {
      if (((-507787516 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var6 > 0) {
         int var7 = Math.max(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 2), Math.min(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-334502277, 27), var6));
         if (var7 <= 0) {
            return Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(515438219, 7);
         } else {
            for (int var8 = Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-630474749, 30); var8 <= var7; var8++) {
               if (this.isInsideShellBlock(var1, this.actionSlotId(var8), var2, var4)) {
                  EditorRect var9 = this.findShellBlockRect(var1, this.actionSlotId(var8));
                  if (var9 != null && var4 >= var9.y && var4 <= var9.maxY()) {
                     return var8;
                  }
               }
            }

            EditorRect var14 = this.findShellBlockRect(var1, this.actionSlotId(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-980460421, 30)));
            if (var14 == null) {
               return Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(1704216572, 6);
            } else {
               double var15 = this.resolveActionsRowStep(var1);
               if (var15 <= Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(9042153469979063995L, 50))) {
                  var15 = var14.height;
               }

               double var11 = var4 - var14.y;
               int var13 = (int)Math.floor(var11 / var15) + Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 20);
               return var13 >= Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216565, 3) && var13 <= var7
                  ? var13
                  : Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-339020420, 0);
            }
         }
      } else {
         return Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1563972035, 29);
      }
   }

   @Override
   public double resolveActionsRowStep(EditorSession var1) {
      if ((1835711052 * 1835711052 - 1835711052 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorRect var2 = this.findShellBlockRect(var1, this.actionSlotId(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(1911494205, 16)));
         EditorRect var3 = this.findShellBlockRect(var1, this.actionSlotId(Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981375, 2)));
         if (var2 != null && var3 != null) {
            double var4 = Math.abs(var3.y - var2.y);
            if (Double.isFinite(var4) && var4 > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(7346275694650823907L, 62))) {
               return var4;
            }
         }

         Double var7 = this.resolveActionsGridElementHeight(var1);
         if (var7 != null) {
            double var5 = Math.abs(var7 + this.resolveActionsGridGap(var1));
            if (Double.isFinite(var5) && var5 > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_3229p96t0nyw(2818120106165351277L, 26))) {
               return var5;
            }

            if (var7 > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(-4005855848739231519L, 2))) {
               return var7;
            }
         }

         return var2 != null
               && Double.isFinite(var2.height)
               && var2.height > Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(6947027897000006514L, 24))
            ? var2.height
            : Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2flro44ddnau7(3747149783505806552L, 17));
      }
   }

   @Override
   public void clearStaleActionRuntimeShellIds(Player var1, EditorSession var2, LinkedHashSet<String> var3) {
      if ((-181215685 ^ -181215685) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.runtimeActionShellIds.isEmpty()) {
         LinkedHashSet<String> var4 = new LinkedHashSet<>(var2.runtimeActionShellIds);
         var4.removeAll(var3);

         for (String var6 : var4) {
            this.removeActionRuntimeShellElement(var1, var6);
            var2.shellRuntimeRects.remove(var6);
         }
      }
   }

   @Override
   public void removeActionRuntimeShellElement(Player var1, String var2) {
      if ((-999043311 * -999043311 + -999043311 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = Xqedii_ipjkbfavu1yz(var2);
         this.clearOutlineHud(var1, var3);
         this.removeBaseHud(var1, var3);
         this.removeRoundedParts(var1, var3);
      }
   }

   @Override
   public void clearActionsRuntimeHud(Player var1) {
      if (((-735763121 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = var1 == null ? null : (EditorSession)this.editorSessions.get(var1.getUniqueId());
         this.clearActionsRuntimeHud(var1, var2);
      }
   }

   @Override
   public void clearActionsRuntimeHud(Player var1, EditorSession var2) {
      if ((-1056798971 ^ -1056798971) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (var2.runtimeActionShellIds.isEmpty()) {
            var2.actionsRenderedRawIndexes.clear();
            this.clearActionsReorderGhostHud(var1, var2);
         } else {
            for (String var5 : new ArrayList<String>(var2.runtimeActionShellIds)) {
               this.removeActionRuntimeShellElement(var1, var5);
               var2.shellRuntimeRects.remove(var5);
            }

            var2.runtimeActionShellIds.clear();
            var2.actionsRenderedRawIndexes.clear();
            this.clearActionsReorderGhostHud(var1, var2);
         }
      }
   }

   @Override
   public void renderActionsReorderGhostHud(Player var1, EditorSession var2, double var3, double var5) {
      if ((673722662 * 673722662 + 673722662 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.actionsReorderArmedIndex >= 0) {
         String var7 = this.resolveSelectedActionsTargetId(var2);
         if (var7.isBlank()) {
            this.clearActionsReorderGhostHud(var1, var2);
         } else {
            List var8 = this.resolveTargetActionsRawList(var2, var7, (Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-300532367, 24) != 0));
            if (var8 != null && !var8.isEmpty()) {
               int var9 = var2.actionsReorderCurrentIndex >= 0 ? var2.actionsReorderCurrentIndex : var2.actionsReorderArmedIndex;
               if (var9 >= 0 && var9 < var8.size()) {
                  Map var10 = (Map)var8.get(var9);
                  String var11 = this.normalizeActionType(
                     this.stringValue(var10.get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt")))
                  );
                  String var12 = this.resolveActionDisplayValue(var10, var11);
                  EditorSidebarShellPart.ActionRowEntry var13 = new EditorSidebarShellPart.ActionRowEntry(var9, var11, var12);
                  int var14 = Math.max(var2.actionsRenderedRawIndexes.size(), Math.min(Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-122557553, 27), var8.size()));
                  if (var14 <= 0) {
                     this.clearActionsReorderGhostHud(var1, var2);
                  } else {
                     EditorRect var15 = this.resolveActionsListRect(var2, var14);
                     if (var15 == null) {
                        this.clearActionsReorderGhostHud(var1, var2);
                     } else {
                        double var16 = Math.max(
                           Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(6628783179493875132L, 42)), this.resolveActionsRowStep(var2)
                        );
                        double var18 = Math.max(Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-5220938857212913117L, 31)), var16);
                        double var20 = var5 - var18 / Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-7599562812512183948L, 13));
                        double var22 = var15.y - var18 * Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(1379396074107314454L, 45));
                        double var24 = var15.maxY() - var18 * Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_2lh9yt7b9y6em(5642761364303365512L, 36));
                        var20 = Math.max(var22, Math.min(var24, var20));
                        List var26 = this.buildActionsReorderGhostBlocks(var2, var13, var15.x, var20);
                        List<Map<String, Object>> var27 = this.resolveRenderableBlocksNoCopy(var26, var2.components);
                        HashMap var28 = new HashMap();
                        LinkedHashSet var29 = new LinkedHashSet();
                        int var30 = Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-342921039, 11);

                        for (Map var32 : var27) {
                           var30++;
                           String[] var10001 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1706313725, 20)];
                           var10001[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704216573, 2)] = this.stringValue(
                              this.readMapPathValue(var32, Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"))
                           );
                           var10001[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981371, 21)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
                              "yU7TBTjzAq2Us/SdmAhdOuH0sIcCFhkXxieJYxUlAIHX9rgJF/Q="
                           );
                           String var33 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                           if (this.isRenderableBlockType(var33)) {
                              String var34 = this.resolveElementId(var32, var30, var28);
                              String var35 = this.actionRuntimeLogicalId(Xqedii_29vlxc12yn1tc(var34));
                              if (this.canUseFastLayerRuntimeRender(var32, var33)) {
                                 this.renderLayerShellElementFast(var1, var2, var32, var35, var33, (Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 2) != 0));
                              } else {
                                 ConfigurationSection var36 = this.mapToSection(var32);
                                 if (var36 == null) {
                                    continue;
                                 }

                                 this.renderLayerRuntimeShellElement(
                                    var1, var2, var36, var35, var33, (Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(1348634273, 21) != 0)
                                 );
                              }

                              var29.add(var35);
                           }
                        }

                        this.clearStaleActionsReorderGhostShellIds(var1, var2, var29);
                        var2.runtimeActionReorderGhostShellIds.clear();
                        var2.runtimeActionReorderGhostShellIds.addAll(var29);
                     }
                  }
               } else {
                  this.clearActionsReorderGhostHud(var1, var2);
               }
            } else {
               this.clearActionsReorderGhostHud(var1, var2);
            }
         }
      } else {
         this.clearActionsReorderGhostHud(var1, var2);
      }
   }

   @Override
   public List<Map<String, Object>> buildActionsReorderGhostBlocks(EditorSession var1, EditorSidebarShellPart.ActionRowEntry var2, double var3, double var5) {
      if (((-1920153069 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var7 = new ArrayList();
         if (var2 != null) {
            LinkedHashMap var8 = new LinkedHashMap();
            var8.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GcujQXuEzqVWNW5jm4xAu4UkRzphZTnGrExLSyx8jtE="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("I0OhdqJvKcD+K71m740MSzJaiRO3YpRrFVUfoAYliNdjUZBo3iOqpgN9z9pqB5ovLxVrXYqsSWOAldod")
            );
            var8.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("CUgFMfNutRDO93bViQTyIIMLAlH5IeQ+TNYMksrFEaE2/eGK"),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("I0OhdqJvKcD+K71m740MSzJaiRO3YpRrFVUfoAYliNdjUZBo3iOqpgN9z9pqB5ovLxVrXYqsSWOAldod")
            );
            String var10001 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("VBxiugQqWc37UqL2jD1fOOMpCXIi7Gou6clBIsdWvkTl+tlF");
            String[] var10004 = new String[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1704249341, 14)];
            var10004[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-2036248478, 5)] = var2.displayValue;
            var10004[Xqedii_ghjfcat.Xqedii_31bh56qvl79rl(-1708410877, 22)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi(
               "MS8Trj5v5eLFSJiOFIcUExSkFpB74/lA3J0tz6oMPCH1Qw=="
            );
            var8.put(var10001, this.truncateLayerDisplayNameForDepth(this.firstNonBlank(var10004), Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(444940682, 7)));
            var8.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("uJf7lKNNoqCtDc7+8AFB8Zszp6Lpk4gBbKpClJ8Bgah9Sq25NW+wOxu+Y8Lbr/VR"),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Ng9hJMqddFLI7ZB0m73+974eMBvbZJkx6+VuFKlzBwWeYOXBCzd3Og==")
            );
            var8.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qD2yelL6pBSTRaAmyXuG9Fa7kC90SabDAhMBhtV9Z5QnURPi2Iaqc2ufzPUQAWbbOkk="),
               Xqedii_ghjfcat.Xqedii_3011vjbfor69k(-1812981372, 26)
            );
            var8.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("XGIXPWi6UArxdODFsS4IlZKUBSNbwoe+lG1IrQEb9++tYuS0YaxosNoEVPEuOQ=="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vxmUSISZKCZigcoLG8lySOcyrkR7wL/C5xMk4v/i")
            );
            var8.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+KA/Gafe69Yyo+sSeLoexWLBCT0jzWocimMKjvGkLytU5L8fGCovMS7a/+dH7A=="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xX3vN3zAyI+ZWqd4rGexXKAT9Joc+VaU914HiSln")
            );
            var10001 = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("e1kzLnzWp/Qs4+wbv591U1DUjB2TMqOFHpyVm0+lRHOUBpVzjTK4Cqoj0fJHqI2oc8A=");
            String[] var10003 = new String[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(-1588591994, 13)];
            var10003[Xqedii_ghjfcat.Xqedii_3ae8jkqwbika3(-1888439829, 19)] = (String)Xqedii_1ks01f9.Xqedii_1upy6vh.get(var2.actionType);
            var10003[Xqedii_ghjfcat.Xqedii_26vxbbc6sldlk(222470277, 6)] = (String)Xqedii_1ks01f9.Xqedii_1upy6vh
               .get(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("sGiexB3n1xVfw5mycs06cC1Js2WokvTIAcJU+S61lP4r+FRSoOcZp8L3"));
            var10003[Xqedii_ghjfcat.Xqedii_3011vjbfor69k(1812981307, 6)] = Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("qdrRneEi2BGgmlXWP74JR9yv61JnfXHm4jqW+fNW");
            var8.put(var10001, this.firstNonBlank(var10003));
            LinkedHashMap var9 = new LinkedHashMap();
            var9.put(
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("GjeF7OeUrtkqX66L2I9RcZFej3nBE4tDg0MTBILrFDxBrZR9I+v56Hy3d5Vyqw=="),
               Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xd/xtOzlzFbpAXLtU1SaPgDzWS41mKZ4ZNO4MpHDI10HsBhIu5bD4NAdBeLrl1e5nCyDfXqR")
            );
            var9.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("n6oK8IrIqJNztPmSLV63etgyjiOm7WQL9EX3VQQKjFZWC3D5HTS9+g=="), var8);
            var7.add(var9);
         }

         LinkedHashMap var11 = new LinkedHashMap();
         var11.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("C0czulqFW6fNMUwRD0p4dB3siZSnHC+SGKTm9w4M"), var3);
         var11.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("wrkJr0cdjOLgvjc1qNRoez+uVFrqlxPfutVqZO7C"), var5);
         LinkedHashMap var12 = new LinkedHashMap();
         var12.put(
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1bQOxiNZ6v7r2khDCXUmH84RjaX34XL+bfCmSyfVd18qxiVt"),
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("+cEGd4ma0Wi5tj7CejMPkP/lTktKqtTaWdsYBwSM726f6Vd0TOFBP6ZK5AGPHkcb")
         );
         var12.put(
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("bP4Bc7VY0BOxUsIxdSt0i7LoVjV6RtnfdWwjpPYSPTvPyb/BCOaA0mDVAt+ggw=="),
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("vq9VrKIlVp4HchB2195n2N08SsGq4El5DnUkSKYN4MTLAld7HRl7uA==")
         );
         var12.put(
            Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("HHfQUBPbFebgSwOuJFVinMe9+DX+ETxjRJXRUS00irgxaA=="),
            Double.longBitsToDouble(Xqedii_ghjfcat.Xqedii_29mgezs5tllti(-2070399149345823554L, 12))
         );
         var12.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("e0pnuVNJQCcMPJhPnU8VjQL++JTz79CPWxt2AJ0mSXosLknW/XAUhiBMzBM="), var11);
         var12.put(Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Kn2uClEd/VKGRoBekS40V2HXqBC9QQMcWlkzUip8EOUG5M84OS5pfdYGYJ0="), var7);
         ArrayList var10 = new ArrayList();
         var10.add(var12);
         return var10;
      }
   }

   @Override
   public void clearActionsReorderGhostHud(Player var1) {
      if (((-1490202696 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = var1 == null ? null : (EditorSession)this.editorSessions.get(var1.getUniqueId());
         this.clearActionsReorderGhostHud(var1, var2);
      }
   }

   @Override
   public void clearActionsReorderGhostHud(Player var1, EditorSession var2) {
      if ((-596102717 * (-596102717 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.runtimeActionReorderGhostShellIds.isEmpty()) {
         for (String var5 : new ArrayList<String>(var2.runtimeActionReorderGhostShellIds)) {
            this.removeActionRuntimeShellElement(var1, var5);
            var2.shellRuntimeRects.remove(var5);
         }

         var2.runtimeActionReorderGhostShellIds.clear();
      }
   }

   @Override
   public void clearStaleActionsReorderGhostShellIds(Player var1, EditorSession var2, LinkedHashSet<String> var3) {
      if ((786368369 * 786368369 - 786368369 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.runtimeActionReorderGhostShellIds.isEmpty()) {
         LinkedHashSet<String> var4 = new LinkedHashSet<>(var2.runtimeActionReorderGhostShellIds);
         var4.removeAll(var3);

         for (String var6 : var4) {
            this.removeActionRuntimeShellElement(var1, var6);
            var2.shellRuntimeRects.remove(var6);
         }
      }
   }

   private static /* synthetic */ String Xqedii_d58q5t4hwc7u(long l) {
        return l + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xQRx1FcWgU1NBUU7hTOZr/6+UnsxBUi4DWzdn5mO");
    }

    private static /* synthetic */ String Xqedii_maeeg3xobl79(long l) {
        return l + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xQRx1FcWgU1NBUU7hTOZr/6+UnsxBUi4DWzdn5mO");
    }

    private static /* synthetic */ String Xqedii_2bjmnc78ttdn2(long l) {
        return l + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xQRx1FcWgU1NBUU7hTOZr/6+UnsxBUi4DWzdn5mO");
    }

    private static /* synthetic */ String Xqedii_1x36qrmj16bfo(String string) {
        return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("1GL439nAs7x19wZCXcmCgtpfqgMrJK9YZp0i/WBvBJPoXvlhAlvCGuvT1RZsg5C2TsYKsrzqrgYD7/gv") + string;
    }

    private static /* synthetic */ String Xqedii_1xdhkrkz8xx4o(int n) {
        return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("lfN+wL4SC18Qv6o5Vz/Jav+9vRc6fuhF7Yvo76ZJcVwx410eWoS2g+PvXRuiRfT0BQsB9LJTchvue+eMBqbrxX5LDevES5lIUS28bOSjzgPWnmYz") + n;
    }

    private static /* synthetic */ String Xqedii_20ngh8saht3c5(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("40xr8UalmMblZlVucSJF/SZ1cLMHLKKZSDZD+NXA6VV8hdx5");
    }

    private static /* synthetic */ String Xqedii_2v1i08w1cjqg5(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("hj1wUVVByvGVCu3nbsty+f1cqOjnAmdYc3VY+ciF6a11WKEWwmw=");
    }

    private static /* synthetic */ String Xqedii_sp4lxy26uufg(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Ms01y9flOIINaxq9IyMPf0WZI9/l9WqC52EvuSvgpDMaQO3QIB9Xv4QhX3E=");
    }

    private static /* synthetic */ String Xqedii_2uhkpc7qn7vbi(String string) {
        return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("g3QmD35jGvMaqb4yDeCpbPIszgP44i7qTPoOPrKT3MQirCKCG1lax8J3") + string;
    }

    private static /* synthetic */ String Xqedii_2liqczhp3twlk(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Ri/V400uIXUOKM6XdLcShBPXhK+3XtxuaSN2JEXeMjecBcADg70=");
    }

    private static /* synthetic */ String Xqedii_35sjuav3cn67d(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("15RMJJPweUigho2x/2J33WdN5IyF/NSS1RkKtNHW7SNrrht+k+kumQgd");
    }

    private static /* synthetic */ String Xqedii_3aqyolsowua3a(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("Ri/V400uIXUOKM6XdLcShBPXhK+3XtxuaSN2JEXeMjecBcADg70=");
    }

    private static /* synthetic */ String Xqedii_2as6w0kj39tai(String string) {
        return string + Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("15RMJJPweUigho2x/2J33WdN5IyF/NSS1RkKtNHW7SNrrht+k+kumQgd");
    }

    private static /* synthetic */ String Xqedii_ipjkbfavu1yz(String string) {
        return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("xP2csjXD/vL2Jnd74srWLXyZy/aN42A/2/vCv/N2JhBfUrCgW6OaTs7Fz2/fp+D0a1U7wxoK") + string;
    }

    private static /* synthetic */ String Xqedii_29vlxc12yn1tc(String string) {
        return Xqedii_ghjfcat.Xqedii_2z6rcdtjougfi("fDyvuF6Ax9nEl+9IZx/iQVzWq8CeeW15xdx898sFyw6OKp8LkCD8N0JUDDEy8jWJiWVnvYNUAMsSzqw5iG8AT2nbrW0lkA==") + string;
    }
}
