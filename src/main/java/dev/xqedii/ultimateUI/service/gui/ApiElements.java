package dev.xqedii.ultimateUI.service.gui;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1sferc6;
import dev.xqedii.ultimateUI.api.UiElementCreate;
import dev.xqedii.ultimateUI.api.UiElementWrite;
import dev.xqedii.ultimateUI.api.event.UltimateUICloseEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIOpenedEvent;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.bukkit.entity.Player;

public abstract class ApiElements extends ApiPointer {
   public static final String Xqedii_1e8lu3txbf30q = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public ApiElements(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean openGui(Player var1, String var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if ((313200026 * 313200026 + 313200026 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var7 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         String var10000;
         if (var7 == null) {
            var10000 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("n/ld4hKvl15O2DTMGkLXo+01d1Ysu8+tWPGSLw==");
         } else {
            String[] var10001 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(387749919, 12)];
            var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 18)] = var7.pageName;
            var10000 = this.firstNonBlank(var10001);
         }

         String var8 = var10000;
         int var9 = this.isApiRuntimeSession(var7) && !var7.apiCloseFired
            ? Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1057441564, 31)
            : Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(827338151, 25);
         boolean var10 = super.openGui(var1, var2, var3, var4, var5, var6);
         if (var10 && var1 != null && !var3) {
            String var12;
            EditorSession var11 = this.editorSessions.get(var1.getUniqueId());
            String[] var14 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-429259340, 22)];
            var14[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1862016285, 25)] = var2;
            var12 = this.firstNonBlank(var14).trim();
            label45:
            if (var9 != 0 && !var5 && !var8.isBlank()) {
               if (var11 == var7) {
                  String[] var10002 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2104118724, 19)];
                  var10002[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1141869454, 27)] = var11 == null ? null : var11.pageName;
                  if (var8.equalsIgnoreCase(this.firstNonBlank(var10002))) {
                     break label45;
                  }
               }

               var7.apiCloseFired = (Xqedii_1sferc6.Xqedii_168376gc4etq6(-1835158980, 28) != 0);
               this.callApiEvent(new UltimateUICloseEvent(var1, var8, (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1775031307, 15) != 0)));
            }

            var11 = this.editorSessions.get(var1.getUniqueId());
            if (this.isApiRuntimeSession(var11)) {
               var11.apiCloseFired = (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 9) != 0);
               this.callApiEvent(new UltimateUIOpenedEvent(var1, var12, var5, var6));
            }

            return var10;
         } else {
            return var10;
         }
      }
   }

   @Override
   public void closeGui(Player var1) {
      if (((-640433841 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         String var3 = null;
         if (this.isApiRuntimeSession(var2) && !var2.apiCloseFired) {
            var2.apiCloseFired = (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-429259340, 22) != 0);
            String[] var10001 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-244201087, 8)];
            var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 18)] = var2.pageName;
            var3 = this.firstNonBlank(var10001);
         }

         super.closeGui(var1);
         if (var3 != null) {
            this.callApiEvent(new UltimateUICloseEvent(var1, var3, (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(959462958, 21) != 0)));
         }
      }
   }

   @Override
   public boolean closeGui(Player var1, String var2) {
      if (((436573532 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         boolean var4 = this.isApiRuntimeSession(var3);
         boolean var5 = super.closeGui(var1, var2);
         if (var5 && var4 && this.isApiSessionAlive(var1, var3) && !var3.apiCloseFired) {
            String[] var10005 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(521608344, 4)];
            var10005[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 18)] = var2;
            this.callApiEvent(
               new UltimateUICloseEvent(var1, this.firstNonBlank(var10005).trim(), (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 29) != 0))
            );
         }

         return var5;
      }
   }

   public double getApiCursorX(Player var1) {
      if (((-1487786392 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         return var2 == null ? Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_11tohtz09dlz9(-7598985847630278897L, 34)) : var2.cursorX;
      }
   }

   public double getApiCursorY(Player var1) {
      if ((-2101528279 * (-2101528279 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         return var2 == null ? Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_11tohtz09dlz9(-7743136211486191857L, 58)) : var2.cursorY;
      }
   }

   public double getApiCursorPageX(Player var1) {
      if ((1175657589 * 1175657589 + 1175657589 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         return var2 == null
            ? Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_3tyc9v1qjhrf3(-8641437683135904973L, 13))
            : this.apiPageX(var2, this.apiHitX(var2));
      }
   }

   public double getApiCursorPageY(Player var1) {
      if (((19956585 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         return var2 == null
            ? Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_3tyc9v1qjhrf3(-8641437680049943348L, 33))
            : this.apiPageY(var2, this.apiHitY(var2));
      }
   }

   public String getApiHoveredElement(Player var1) {
      if (((-404638987 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         if (var2 == null) {
            return null;
         } else {
            String var3 = this.apiBlockIdOf(this.findHoveredRuntimeElement(var2, this.apiHitX(var2), this.apiHitY(var2)));
            return var3.isEmpty() ? null : var3;
         }
      }
   }

   public boolean isApiLeftMouseHeld(Player var1) {
      if (((-2121096906 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         return ((var2 != null && var2.apiPressActive && this.isApiLeftHeld(var2)
            ? Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 6)
            : Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 2)) != 0);
      }
   }

   public boolean isApiDragging(Player var1) {
      if (((-1547572577 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         return ((var2 != null && var2.apiDragActive && this.isApiLeftHeld(var2)
            ? Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(889379443, 29)
            : Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 13)) != 0);
      }
   }

   public String getApiDraggedElement(Player var1) {
      if ((-240619539 * -240619539 + -240619539 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         if (var2 != null && var2.apiDragActive) {
            String[] var10001 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1489809363, 17)];
            var10001[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 13)] = var2.apiPressBlockId;
            String var3 = this.firstNonBlank(var10001);
            return var3.isEmpty() ? null : var3;
         } else {
            return null;
         }
      }
   }

   public boolean setApiElementDraggable(Player var1, String var2, boolean var3) {
      if ((1341806101 * (1341806101 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var4 = this.apiRuntimeSession(var1);
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(47870773, 5)];
         var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 30)] = var2;
         String var5 = this.firstNonBlank(var10001).trim();
         if (var4 != null && !var5.isEmpty()) {
            return var3 ? var4.apiDraggableElements.add(var5) : var4.apiDraggableElements.remove(var5);
         } else {
            return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 10) != 0);
         }
      }
   }

   public boolean isApiElementDraggable(Player var1, String var2) {
      if ((148904951 * 148904951 + 148904951 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.isApiElementDraggable(this.apiRuntimeSession(var1), var2);
      }
   }

   public boolean setApiElementVisible(Player var1, String var2, boolean var3) {
      if ((1113869681 * 1113869681 - 1113869681 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var4 = this.apiRuntimeSession(var1);
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103463364, 17)];
         var10001[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 0)] = var2;
         String var5 = this.firstNonBlank(var10001).trim();
         if (var4 != null && !var5.isEmpty() && this.resolveApiRawTarget(var4, var5) != null) {
            String var6 = var3
               ? Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("Opt/HybHibJUI464BqnTOMuTq1zzkU0lJMjWuTvh+fv33K0v")
               : Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("yrNm3dp4x6dsXbj18xVIVwr88FfKmSCvOlCETzbOX8F0zKMb");
            LinkedHashMap var7 = new LinkedHashMap();
            var7.put(
               Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("BiZ3PVWJgcAFQ0QryuRzFKfsLI6ZTYed9TMXnd4h5wGp3fwb"),
               Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("CbEIFBmsEbPUqn6nkzqqg63My9seu3WSO+Q5ZZVrR2fwZhsmETUm2gV9/banYtSh")
            );
            var7.put(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("EsLL/M/Z5vacjJEqHzEnYnusOV3xADSQwyhEuLdxweMlHor1zTkXxv9V"), var5);
            var7.put(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("ChSXBlQtDTcZC8pn2TbVYZUaE1/gHqW2urZwQn11xA2+ReC/eyw="), var6);
            this.executeRuntimeVisibilityAction(var1, var7, var6);
            return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 27) != 0);
         } else {
            return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(478682903, 20) != 0);
         }
      }
   }

   public boolean isApiElementVisible(Player var1, String var2) {
      if (((-971749015 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2086817220, 24)];
         var10001[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-244201343, 8)] = var2;
         String var4 = this.firstNonBlank(var10001).trim();
         if (var3 == null || var4.isEmpty() || this.resolveApiRawTarget(var3, var4) == null) {
            return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 17) != 0);
         } else if (var3.hiddenLayerTargetIds.contains(var4)) {
            return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 13) != 0);
         } else {
            String var5 = this.resolveOpenUiElementTargetPath(var3, var4);
            String var10000;
            if (var5.isBlank()) {
               var10000 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("n/ld4hKvl15O2DTMGkLXo+01d1Ysu8+tWPGSLw==");
            } else {
               var10001 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(260804172, 3)];
               var10001[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-931008143, 24)] = this.findTargetIdByPath(var3, var5);
               var10000 = this.firstNonBlank(var10001);
            }

            String var6 = var10000;
            return ((!var6.isEmpty() && var3.hiddenLayerTargetIds.contains(var6)
               ? Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 5)
               : Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(889379443, 29)) != 0);
         }
      }
   }

   public boolean hasApiElement(Player var1, String var2) {
      if ((-326912489 * -326912489 - -326912489 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.resolveApiRawTarget(this.apiRuntimeSession(var1), var2) != null
            ? Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(521608344, 4)
            : Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 11)) != 0);
      }
   }

   public Object getApiElementValue(Player var1, String var2, String var3) {
      if ((-1926076397 * -1926076397 + -1926076397 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1043216688, 5)];
         var10001[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 6)] = var3;
         String var4 = this.firstNonBlank(var10001).trim();
         Map var5 = this.resolveApiRawTarget(this.apiRuntimeSession(var1), var2);
         if (var5 != null && !var4.isEmpty()) {
            Object var6 = this.readMapPathValue(var5, var4);
            if (var6 == null) {
               var6 = this.readMapPathValue(var5, this.resolveApiAliasPath(var5, var4));
            }

            return this.copyApiValue(var6);
         } else {
            return null;
         }
      }
   }

   public String resolveApiAliasPath(Map<String, Object> var1, String var2) {
      if ((-998278315 * -998278315 - -998278315 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var4 = Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(465504071, 23);
         switch (var2.hashCode()) {
            case -1221029593:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("A11BDi2uEG8oQ+lpd/69PADpfbvF9YXTn0en3BNh56DrXN2t7TnDGw=="))) {
                  var4 = Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(963657262, 21);
               }
               break;
            case 120:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("ttEwd6oeLuScGCYnv1WyI7ec29bveWBDn2LzSnfa"))) {
                  var4 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-744970218, 16);
               }
               break;
            case 121:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("3lQQJx851mp3stvmNCeh1BFfYhb9c2K4fFDXbgfy"))) {
                  var4 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1085709517, 3);
               }
               break;
            case 3242771:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("EMsvb4wLgaT8eph11BCQpLylMcVYi1Ui+ww1m/h+QX3PFc4Y"))) {
                  var4 = Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127365733, 11);
               }
               break;
            case 3556653:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("fZ/P/wXIb7YvdyBVPzVtWKd3DQ9CnFAvn29cAfld7hzsxzdB"))) {
                  var4 = Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594435, 30);
               }
               break;
            case 94842723:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("tWADuMs1xQI768KR3Oi2jyGhPUldIWVQbRpzkbJLKwhtPGf9keQ="))) {
                  var4 = Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103496132, 15);
               }
               break;
            case 113126854:
               if (var2.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("DRajSbyqL0EUvko60tM9aw3ImeCPpzpaRF3hlLuLx+U0HNbzouY="))) {
                  var4 = Xqedii_1sferc6.Xqedii_168376gc4etq6(-2111983044, 22);
               }
         }
         return switch (var4) {
            case 0 -> {
               String var10 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("5FJKpItsvOi1UTF6bZTspE+M+kB8geOWo/4ezBiZ9iTuyL1/MMIZc/7fzhyAkjK2");
               String[] var16 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2107788740, 22)];
               var16[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1550983292, 14)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "5FJKpItsvOi1UTF6bZTspE+M+kB8geOWo/4ezBiZ9iTuyL1/MMIZc/7fzhyAkjK2"
               );
               var16[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103602628, 13)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "SlQp72HnWYWHSWGV5nVVIFTL5EYMv4aL5ixd81VHD/6+r74Mhe+8nR9V7ylsYVPNt6Z9hmxBwYm8Q6sR1kc="
               );
               var16[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-1993158245, 27)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "f/d8b9KEYO7GvSiol687TnIg5+ldyhyu43neg4h9eHZxmfNyhW9HSIX6v90="
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var10, var16);
            }
            case 1 -> {
               String var9 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("qD9r9Lyv1N5MrUCEilGJUEbHEiydCH1NaaU/P82BbMcN83beCNWLKSOsZ9wijh8E");
               String[] var15 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-476642334, 17)];
               var15[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1953610737, 11)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "qD9r9Lyv1N5MrUCEilGJUEbHEiydCH1NaaU/P82BbMcN83beCNWLKSOsZ9wijh8E"
               );
               var15[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-629983998, 13)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "Ihx2cttOkmeQXrbJpjzVPh17f8FsiMy4Au8A5K6H6Fb35TMIjuL7GpSEOHXw2HR0yCicSbtMV7dlTkvQcY4="
               );
               var15[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1700260141, 24)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "5f5TMY2ZvzeqlZbz7iv0q2ovGK/qqbF2Ksgo4uYZhIFEoQxCtqnNqV5cRxU="
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var9, var15);
            }
            case 2 -> {
               String var8 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("aqA938vMSpvvoIn4oADpOYA0VDE8icVvAIYSf/m8DtkDeL0Jm1yYER29XRHiQROv");
               String[] var14 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1043216784, 5)];
               var14[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 10)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "aqA938vMSpvvoIn4oADpOYA0VDE8icVvAIYSf/m8DtkDeL0Jm1yYER29XRHiQROv"
               );
               var14[Xqedii_1sferc6.Xqedii_168376gc4etq6(-1835158980, 28)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "OC8gp3TRTD/yo8it8JrOBqjNYfHG2fZKWCm4YskZjn1BMH0gUJvjkJCdGQ1fAZRfcNk="
               );
               var14[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-1858940517, 28)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "3mYbt9gNqtjQmTenVbe4GkXz0liqqtOQ79ti5AGrxWsns7vTw4yoPJp30Ds4fHAOECGNn5MR2VuMrBhbFfQ="
               );
               var14[Xqedii_1sferc6.Xqedii_168376gc4etq6(1117631036, 30)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "B6lg0PQg5AgJ+AwNHJBQP9tBP7SPAlJtIS/KK3/vwkrLaoDg3YB10WdDdlSkVjF+PHtn4A=="
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var8, var14);
            }
            case 3 -> {
               String var7 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("5WV8fX8fac3UsvZhMP9ypwc6KUAjO+B2gdyLvli7QOcRcjuwJvv2cQI7A95/SWYRRHw=");
               String[] var13 = new String[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127441509, 16)];
               var13[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 28)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "5WV8fX8fac3UsvZhMP9ypwc6KUAjO+B2gdyLvli7QOcRcjuwJvv2cQI7A95/SWYRRHw="
               );
               var13[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 1)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "piN11jOBMw99FGfb8uPPZVzCnSHrkyJSe0WlRjJFOYsRyclYywwIFN72JWOXQmnFYjmtNg=="
               );
               var13[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127376229, 8)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "/h/4IsZiDiLaoUT+OksK9AtHtzqXR3tuyUHBAT6Fc5yQSttNHctztZX25zNWkTgXXWqrvXPALT5kNBME+A4/KQ=="
               );
               var13[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-2123548230, 4)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "MWDxzrndZWW7y4Sd/LcVq3ewuIZe0asYriHpobLxoLVu/kBkWjPTPG+bywI+P4y9CcF7ZcC8"
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var7, var13);
            }
            case 4 -> {
               String var6 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("o+fxmR8yW7D9EAl9s3cbx/5BnhnSHhmJzde0iuPNr4nEKypTXsIa3tMkFq2Blo9/Who=");
               String[] var12 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(191483348, 7)];
               var12[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 6)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "o+fxmR8yW7D9EAl9s3cbx/5BnhnSHhmJzde0iuPNr4nEKypTXsIa3tMkFq2Blo9/Who="
               );
               var12[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594435, 0)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "8ruz2a5fBU8q+pr/9fHMpOhys4lqH52vELMybnfQ5QrDMQ9mZOtzvSSY"
               );
               var12[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2104118724, 18)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "a3tQiZ0gBh3JtfAJuvjznJeyqPQpbruaHJVCPookd5PLveR8MZI4uKoI23fOFd/tvCO3jUz2is0="
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var6, var12);
            }
            case 5 -> {
               String var5 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("XF3DMF8Q7LZXZPPtJXBgG4f+OVVHNZGIrQEoftuYBO4n2KD6Ti6CmrYV5/PuRGSJeho=");
               String[] var11 = new String[Xqedii_1sferc6.Xqedii_11gats66w6uvt(20107675, 30)];
               var11[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 29)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "XF3DMF8Q7LZXZPPtJXBgG4f+OVVHNZGIrQEoftuYBO4n2KD6Ti6CmrYV5/PuRGSJeho="
               );
               var11[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1345169203, 1)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "1vm3V8m18zFW8af2fJw2dujKaf6AZenapAzSucA/nfTZSJwhzHVRRQywM0rG9IvkZzWRxQ=="
               );
               var11[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127408741, 15)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "DfurG8L77HXqB9s18o1t6eKLX0ZjNeY4mkBmEZqoBmBaN/wIWtIfWqwHB+HGrwjdQA41UOvTOsWSY+fuBiRieQ=="
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var5, var11);
            }
            case 6 -> {
               String var10002 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("bKunHcryOEhsl4GXC2rU3TTJsz2iAjqjTclblzXR0fZoC/4AJ+zxVlC8yuIV31IXqPk/g2+H");
               String[] var10003 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103659972, 14)];
               var10003[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 6)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "bKunHcryOEhsl4GXC2rU3TTJsz2iAjqjTclblzXR0fZoC/4AJ+zxVlC8yuIV31IXqPk/g2+H"
               );
               var10003[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-744904682, 16)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "/MCAR3w6T/McQ7hfse7wt2d9zPG9HgntbOcsgkg5sDhxfLA04kNMvF7AcQM="
               );
               var10003[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375941, 5)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "zfwu0OXPHDN+aY8Qo7KdnoDhF+uDYeqDWU8bM/MAjyJX5+uoUH6GBVtUIR2xfUxxM7k="
               );
               var10003[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1761352989, 25)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "iyji1j6Xhv9Tdv68AxdIbYdU5qXrtILKZWmvV852vf7r4BjKeqYSEwScUXyqTiLoNxnd+y/rFNYjNg=="
               );
               yield this.resolvePreferredOpenUiWritePath(var1, var10002, var10003);
            }
            default -> var2;
         };
      }
   }

   public Object copyApiValue(Object var1) {
      if ((-970195314 ^ -970195314) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Map var6) {
         LinkedHashMap var7 = new LinkedHashMap();

         for (Entry var9 : (Iterable<Entry>) (var6.entrySet())) {

            var7.put(String.valueOf(var9.getKey()), this.copyApiValue(var9.getValue()));
         }

         return var7;
      } else if (!(var1 instanceof List var2)) {
         return var1;
      } else {
         ArrayList var3 = new ArrayList(var2.size());

         for (Object var5 : var2) {
            var3.add(this.copyApiValue(var5));
         }

         return var3;
      }
   }

   public double[] getApiElementPosition(Player var1, String var2) {
      if (((1233662559 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.readApiElementPosition(this.apiRuntimeSession(var1), var2);
      }
   }

   public double[] getApiElementAbsolutePosition(Player var1, String var2) {
      if ((2010283186 ^ 2010283186) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 == null) {
            return null;
         } else {
            String[] var10003 = new String[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 15)];
            var10003[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1654676302, 26)] = var2;
            String var4 = this.resolveOpenUiElementTargetPath(var3, this.firstNonBlank(var10003).trim());
            return var4.isBlank() ? null : this.apiAbsolutePosition(var3, var4);
         }
      }
   }

   public String resolveApiPlaceholders(Player var1, String var2) {
      if ((-1200887395 * -1200887395 - -1200887395 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.indexOf(Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(47871925, 5)) >= 0) {
         try {
            String[] var10001 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-1969376708, 26)];
            var10001[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(478682903, 20)] = this.resolvePlaceholders(
               var1, var2, (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(545021042, 30) != 0)
            );
            var10001[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1489809363, 17)] = var2;
            return this.firstNonBlank(var10001);
         } catch (Exception var4) {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public boolean applyApiElementWrites(Player var1, List<UiElementWrite> var2) {
      if ((-404340442 ^ -404340442) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 != null && var2 != null && !var2.isEmpty() && var3.rawBlocks != null && this.hasActiveRuntimeHudSession(var1)) {
            boolean var4 = this.isApiHudSneakShifted(var3);
            if (var4) {
               this.applyRuntimeHudSneakVisualOffset(var1, var3, Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_zaqjui4e59aa(-973584495019874228L, 47)));
            }

            LinkedHashSet var5 = new LinkedHashSet();
            int var6 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(965378413, 20);

            for (UiElementWrite var8 : var2) {
               if (var8 != null) {
                  String[] var10003 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(47870773, 5)];
                  var10003[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 10)] = var8.elementId();
                  String var9 = this.resolveOpenUiElementTargetPath(var3, this.firstNonBlank(var10003).trim());
                  Map var10 = var9.isBlank() ? null : this.resolveRawMapAtPath(var3.rawBlocks, var9);
                  if (var10 != null && this.applyApiElementWrite(var10, var8)) {
                     var5.add(var9);
                     if (var6 == 0 && (this.apiIsListLayoutContainer(var3, var9) || this.apiIsInListLayout(var3, var9))) {
                        var6 = Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(521608344, 4);
                     }
                  }
               }
            }

            if (!var5.isEmpty()) {
               if (var6 != 0) {
                  this.apiRebuild(var1, var3);
               } else {
                  var3.renderBlocks = this.resolveRenderableBlocks(var3.rawBlocks, var3.components, var3);
                  ArrayList var11 = new ArrayList(var5.size());

                  for (String var13 : (Iterable<String>) (var5)) {

                     String[] var10002 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594372, 5)];
                     var10002[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 2)] = this.findTargetIdByPath(var3, var13);
                     var10002[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 31)] = var13;
                     var11.add(this.firstNonBlank(var10002));
                  }

                  this.rerenderEditableContentForTargets(
                     var1,
                     var3,
                     var11,
                     (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(521608344, 4) != 0),
                     (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 25) != 0)
                  );
               }
            }

            if (this.editorSessions.get(var1.getUniqueId()) == var3) {
               if (var4) {
                  this.syncRuntimeHudSneakVisualOffset(var1, var3);
               }

               if (!var5.isEmpty()) {
                  this.scheduleHudTextPlaceholderRefresh(var1, var3);
               }
            }

            return ((!var5.isEmpty() ? Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1918925916, 22) : Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 26)) != 0);
         } else {
            return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 24) != 0);
         }
      }
   }

   public boolean applyApiElementWrite(Map<String, Object> var1, UiElementWrite var2) {
      if (((-703694535 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-122100544, 7)];
         var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 7)] = var2.property();
         String var3 = this.firstNonBlank(var10001).trim();
         int var5 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(765931344, 9);
         switch (var3.hashCode()) {
            case -1221029593:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("A11BDi2uEG8oQ+lpd/69PADpfbvF9YXTn0en3BNh56DrXN2t7TnDGw=="))) {
                  var5 = Xqedii_1sferc6.Xqedii_168376gc4etq6(-1633832388, 26);
               }
               break;
            case 120:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("ttEwd6oeLuScGCYnv1WyI7ec29bveWBDn2LzSnfa"))) {
                  var5 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1474899045, 0);
               }
               break;
            case 121:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("3lQQJx851mp3stvmNCeh1BFfYhb9c2K4fFDXbgfy"))) {
                  var5 = Xqedii_1sferc6.Xqedii_168376gc4etq6(-2104118724, 17);
               }
               break;
            case 3530753:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("q7y0llizdytG7m9Rzp9yqDIKkBfC2abJSQ7J/PA4LBp/cC2y"))) {
                  var5 = Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-669051108, 28);
               }
               break;
            case 3556653:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("fZ/P/wXIb7YvdyBVPzVtWKd3DQ9CnFAvn29cAfld7hzsxzdB"))) {
                  var5 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(827338151, 25);
               }
               break;
            case 94842723:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("tWADuMs1xQI768KR3Oi2jyGhPUldIWVQbRpzkbJLKwhtPGf9keQ="))) {
                  var5 = Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 4);
               }
               break;
            case 113126854:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("DRajSbyqL0EUvko60tM9aw3ImeCPpzpaRF3hlLuLx+U0HNbzouY="))) {
                  var5 = Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-952498235, 18);
               }
               break;
            case 747804969:
               if (var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("zXNCuQTX8LAXPblEsB9Vfvw4SKJgS7+D4VKcxPcJGcpPXJN3SB+U/AZCLfY="))) {
                  var5 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1775064075, 15);
               }
         }

         switch (var5) {
            case 0:
               String var12 = var2.value() == null
                  ? Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("n/ld4hKvl15O2DTMGkLXo+01d1Ysu8+tWPGSLw==")
                  : String.valueOf(var2.value());
               String var19 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("fZ/P/wXIb7YvdyBVPzVtWKd3DQ9CnFAvn29cAfld7hzsxzdB");
               String[] var20 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(65201049, 1)];
               var20[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 31)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "fZ/P/wXIb7YvdyBVPzVtWKd3DQ9CnFAvn29cAfld7hzsxzdB"
               );
               var20[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-122100544, 7)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "o+fxmR8yW7D9EAl9s3cbx/5BnhnSHhmJzde0iuPNr4nEKypTXsIa3tMkFq2Blo9/Who="
               );
               var20[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1434358471, 28)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "8ruz2a5fBU8q+pr/9fHMpOhys4lqH52vELMybnfQ5QrDMQ9mZOtzvSSY"
               );
               var20[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(191483348, 7)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                  "a3tQiZ0gBh3JtfAJuvjznJeyqPQpbruaHJVCPookd5PLveR8MZI4uKoI23fOFd/tvCO3jUz2is0="
               );
               String var17 = this.resolvePreferredOpenUiWritePath(var1, var19, var20);
               var10001 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1775031307, 15)];
               var10001[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 22)] = this.stringValue(this.readMapPathValue(var1, var17));
               if (this.firstNonBlank(var10001).equals(var12)) {
                  return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 22) != 0);
               }

               this.setMapPathValue(var1, var17, var12);
               return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 8) != 0);
            case 1:
               String var11 = this.normalizeHexColor(
                  var2.value() == null ? Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("n/ld4hKvl15O2DTMGkLXo+01d1Ysu8+tWPGSLw==") : String.valueOf(var2.value())
               );
               if (var11.isBlank()) {
                  return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 31) != 0);
               } else {
                  String var10002 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("tWADuMs1xQI768KR3Oi2jyGhPUldIWVQbRpzkbJLKwhtPGf9keQ=");
                  String[] var10003 = new String[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127376357, 7)];
                  var10003[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(521608328, 4)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                     "tWADuMs1xQI768KR3Oi2jyGhPUldIWVQbRpzkbJLKwhtPGf9keQ="
                  );
                  var10003[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1085709517, 3)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                     "XF3DMF8Q7LZXZPPtJXBgG4f+OVVHNZGIrQEoftuYBO4n2KD6Ti6CmrYV5/PuRGSJeho="
                  );
                  var10003[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594440, 1)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                     "1vm3V8m18zFW8af2fJw2dujKaf6AZenapAzSucA/nfTZSJwhzHVRRQywM0rG9IvkZzWRxQ=="
                  );
                  var10003[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103528900, 16)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                     "DfurG8L77HXqB9s18o1t6eKLX0ZjNeY4mkBmEZqoBmBaN/wIWtIfWqwHB+HGrwjdQA41UOvTOsWSY+fuBiRieQ=="
                  );
                  String var16 = this.resolvePreferredOpenUiWritePath(var1, var10002, var10003);
                  if (var11.equalsIgnoreCase(this.normalizeHexColor(this.stringValue(this.readMapPathValue(var1, var16))))) {
                     return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 3) != 0);
                  }

                  this.setMapPathValue(var1, var16, var11);
                  return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2104643012, 20) != 0);
               }
            case 2:
            case 3:
            case 4:
               boolean var10 = false;
               if (!var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("3lQQJx851mp3stvmNCeh1BFfYhb9c2K4fFDXbgfy"))) {
                  double var14 = this.parseDouble(var2.value(), Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(-8958405857612615568L, 46)));
                  if (Double.isFinite(var14)) {
                     String var22 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("5FJKpItsvOi1UTF6bZTspE+M+kB8geOWo/4ezBiZ9iTuyL1/MMIZc/7fzhyAkjK2");
                     String[] var25 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1090042086, 31)];
                     var25[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 27)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "5FJKpItsvOi1UTF6bZTspE+M+kB8geOWo/4ezBiZ9iTuyL1/MMIZc/7fzhyAkjK2"
                     );
                     var25[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103593412, 10)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "ttEwd6oeLuScGCYnv1WyI7ec29bveWBDn2LzSnfa"
                     );
                     var25[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127373925, 11)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "SlQp72HnWYWHSWGV5nVVIFTL5EYMv4aL5ixd81VHD/6+r74Mhe+8nR9V7ylsYVPNt6Z9hmxBwYm8Q6sR1kc="
                     );
                     var25[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594692, 8)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "f/d8b9KEYO7GvSiol687TnIg5+ldyhyu43neg4h9eHZxmfNyhW9HSIX6v90="
                     );
                     var10 |= this.writeOpenUiDoubleIfChanged(var1, this.resolvePreferredOpenUiWritePath(var1, var22, var25), var14);
                  }
               }

               if (!var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("ttEwd6oeLuScGCYnv1WyI7ec29bveWBDn2LzSnfa"))) {
                  double var15 = this.parseDouble(
                     var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("3lQQJx851mp3stvmNCeh1BFfYhb9c2K4fFDXbgfy")) ? var2.value() : var2.secondValue(),
                     Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_11tohtz09dlz9(-7580971440528765173L, 3))
                  );
                  if (Double.isFinite(var15)) {
                     String var23 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("qD9r9Lyv1N5MrUCEilGJUEbHEiydCH1NaaU/P82BbMcN83beCNWLKSOsZ9wijh8E");
                     String[] var26 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-863899279, 24)];
                     var26[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(272510521, 29)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "qD9r9Lyv1N5MrUCEilGJUEbHEiydCH1NaaU/P82BbMcN83beCNWLKSOsZ9wijh8E"
                     );
                     var26[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1742792932, 28)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "3lQQJx851mp3stvmNCeh1BFfYhb9c2K4fFDXbgfy"
                     );
                     var26[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-717179236, 27)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "Ihx2cttOkmeQXrbJpjzVPh17f8FsiMy4Au8A5K6H6Fb35TMIjuL7GpSEOHXw2HR0yCicSbtMV7dlTkvQcY4="
                     );
                     var26[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103586244, 13)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "5f5TMY2ZvzeqlZbz7iv0q2ovGK/qqbF2Ksgo4uYZhIFEoQxCtqnNqV5cRxU="
                     );
                     var10 |= this.writeOpenUiDoubleIfChanged(var1, this.resolvePreferredOpenUiWritePath(var1, var23, var26), var15);
                  }
               }

               return var10;
            case 5:
            case 6:
            case 7:
               boolean var9 = false;
               if (!var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("A11BDi2uEG8oQ+lpd/69PADpfbvF9YXTn0en3BNh56DrXN2t7TnDGw=="))) {
                  double var7 = this.parseDouble(var2.value(), Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(1013439294175569686L, 35)));
                  if (Double.isFinite(var7)) {
                     String var10005 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("aqA938vMSpvvoIn4oADpOYA0VDE8icVvAIYSf/m8DtkDeL0Jm1yYER29XRHiQROv");
                     String[] var10006 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-2114883122, 0)];
                     var10006[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 9)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "aqA938vMSpvvoIn4oADpOYA0VDE8icVvAIYSf/m8DtkDeL0Jm1yYER29XRHiQROv"
                     );
                     var10006[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 30)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "DRajSbyqL0EUvko60tM9aw3ImeCPpzpaRF3hlLuLx+U0HNbzouY="
                     );
                     var10006[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1231235776, 11)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "OC8gp3TRTD/yo8it8JrOBqjNYfHG2fZKWCm4YskZjn1BMH0gUJvjkJCdGQ1fAZRfcNk="
                     );
                     var10006[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103586244, 13)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "3mYbt9gNqtjQmTenVbe4GkXz0liqqtOQ79ti5AGrxWsns7vTw4yoPJp30Ds4fHAOECGNn5MR2VuMrBhbFfQ="
                     );
                     var10006[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375976, 0)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "B6lg0PQg5AgJ+AwNHJBQP9tBP7SPAlJtIS/KK3/vwkrLaoDg3YB10WdDdlSkVjF+PHtn4A=="
                     );
                     var10006[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103592900, 9)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "jQnpNT3s++MEB6DgXvSfFVUUg7KD/EBCFexCYVuMdvLMs1rjdnPuzsV660kfso5Sascd6aMvQDl6XKkSwxJCmA=="
                     );
                     var9 |= this.writeOpenUiDoubleIfChanged(var1, this.resolvePreferredOpenUiWritePath(var1, var10005, var10006), var7);
                  }
               }

               if (!var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("DRajSbyqL0EUvko60tM9aw3ImeCPpzpaRF3hlLuLx+U0HNbzouY="))) {
                  double var13 = this.parseDouble(
                     var3.equals(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("A11BDi2uEG8oQ+lpd/69PADpfbvF9YXTn0en3BNh56DrXN2t7TnDGw=="))
                        ? var2.value()
                        : var2.secondValue(),
                     Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_zaqjui4e59aa(5741035556840999326L, 52))
                  );
                  if (Double.isFinite(var13)) {
                     String var21 = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("5WV8fX8fac3UsvZhMP9ypwc6KUAjO+B2gdyLvli7QOcRcjuwJvv2cQI7A95/SWYRRHw=");
                     String[] var24 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-2123548182, 4)];
                     var24[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 16)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "5WV8fX8fac3UsvZhMP9ypwc6KUAjO+B2gdyLvli7QOcRcjuwJvv2cQI7A95/SWYRRHw="
                     );
                     var24[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(765932368, 9)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "A11BDi2uEG8oQ+lpd/69PADpfbvF9YXTn0en3BNh56DrXN2t7TnDGw=="
                     );
                     var24[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1259951611, 14)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "piN11jOBMw99FGfb8uPPZVzCnSHrkyJSe0WlRjJFOYsRyclYywwIFN72JWOXQmnFYjmtNg=="
                     );
                     var24[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(772261319, 26)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "/h/4IsZiDiLaoUT+OksK9AtHtzqXR3tuyUHBAT6Fc5yQSttNHctztZX25zNWkTgXXWqrvXPALT5kNBME+A4/KQ=="
                     );
                     var24[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-1926049381, 26)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "MWDxzrndZWW7y4Sd/LcVq3ewuIZe0asYriHpobLxoLVu/kBkWjPTPG+bywI+P4y9CcF7ZcC8"
                     );
                     var24[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1775162379, 15)] = Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb(
                        "9gLWX2OiUvexx2J3CMqqb3A+PQDWfS8iigzbSoo7dmOWI+AdXfO7uUVYWckyHZtnd2SkHBb136csxzvOyvGdzgCI"
                     );
                     var9 |= this.writeOpenUiDoubleIfChanged(var1, this.resolvePreferredOpenUiWritePath(var1, var21, var24), var13);
                  }
               }

               return var9;
            default:
               if (var3.isBlank()) {
                  return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-744970218, 16) != 0);
               } else {
                  Object var6 = this.normalizeOpenUiElementValue(var2.value());
                  if (var6 != null && !this.areOpenUiMutationValuesEqual(this.readMapPathValue(var1, var3), var6)) {
                     this.setMapPathValue(var1, var3, var6);
                     return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1775031307, 15) != 0);
                  } else {
                     return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1141869454, 27) != 0);
                  }
               }
         }
      }
   }

   public double[] getApiElementSize(Player var1, String var2) {
      if ((-1648011612 * -1648011612 + -1648011612 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var3 = this.resolveApiRawTarget(this.apiRuntimeSession(var1), var2);
         if (var3 == null) {
            return null;
         } else {
            double var4 = this.parseDouble(
               this.readMapPathValue(
                  var3, this.resolveApiAliasPath(var3, Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("DRajSbyqL0EUvko60tM9aw3ImeCPpzpaRF3hlLuLx+U0HNbzouY="))
               ),
               Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_zaqjui4e59aa(-1508605836367075437L, 58))
            );
            double var6 = this.parseDouble(
               this.readMapPathValue(
                  var3, this.resolveApiAliasPath(var3, Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("A11BDi2uEG8oQ+lpd/69PADpfbvF9YXTn0en3BNh56DrXN2t7TnDGw=="))
               ),
               Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_zaqjui4e59aa(-7039218295573027575L, 44))
            );
            if (Double.isFinite(var4) && Double.isFinite(var6)) {
               double[] var10000 = new double[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2118987365, 23)];
               var10000[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 1)] = var4;
               var10000[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-429259340, 22)] = var6;
               return var10000;
            } else {
               return null;
            }
         }
      }
   }

   public List<String> getApiElementIds(Player var1) {
      if ((-1945190280 * -1945190280 - -1945190280 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.apiRuntimeSession(var1);
         if (var2 == null) {
            return Collections.emptyList();
         } else {
            List var3 = var2.renderBlocks;
            if (var3 == null || var3.isEmpty()) {
               var3 = var2.rawBlocks == null ? Collections.emptyList() : this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
            }

            LinkedHashSet var4 = new LinkedHashSet();
            HashMap var5 = new HashMap();
            int var6 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1474899048, 0);

            for (Map var8 : (Iterable<Map>) (var3)) {

               var6++;
               if (var8 != null) {
                  String[] var10001 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1550999676, 14)];
                  var10001[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-744970218, 16)] = this.resolveElementId(var8, var6, var5);
                  String var9 = this.firstNonBlank(var10001);
                  if (!var9.isEmpty()) {
                     var4.add(var9);
                  }
               }
            }

            return new ArrayList<>(var4);
         }
      }
   }

   public boolean clickApiElement(Player var1, String var2) {
      if ((1897515726 * (1897515726 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1231237824, 11)];
         var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 23)] = var2;
         String var4 = this.firstNonBlank(var10001).trim();
         if (var3 != null && !var4.isEmpty()) {
            List var5 = null;
            String var6 = this.resolveOpenUiElementTargetPath(var3, var4);
            if (!var6.isBlank()) {
               var5 = this.resolveRuntimeActionsByTargetPath(var3, var6);
            }

            if (var5 == null || var5.isEmpty()) {
               var5 = this.resolveTargetActionsRawList(var3, var4, (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1604628894, 2) != 0));
            }

            if (var5 != null && !var5.isEmpty()) {
               this.executeRuntimeTargetActions(
                  var1, var3, this.beginApiActionChain(var3), this.copyBlocks(var5), Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1315086427, 18)
               );
               return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2137148868, 25) != 0);
            } else {
               return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 27) != 0);
            }
         } else {
            return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-629992190, 13) != 0);
         }
      }
   }

   public boolean runApiActions(Player var1, List<Map<String, Object>> var2) {
      if (((820167231 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 != null && var2 != null && !var2.isEmpty()) {
            List var4 = this.copyBlocks(var2);
            if (var4 != null && !var4.isEmpty()) {
               this.executeRuntimeTargetActions(var1, var3, this.beginApiActionChain(var3), var4, Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 10));
               return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(775499838, 13) != 0);
            } else {
               return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-465504072, 23) != 0);
            }
         } else {
            return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 23) != 0);
         }
      }
   }

   public long beginApiActionChain(EditorSession var1) {
      if ((-61865105 * (-61865105 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         long var2 = var1.apiActionTokenSeq - Xqedii_1sferc6.Xqedii_9revsfl9ntnk(6356903263615584156L, 29);
         if (var2 >= Xqedii_1sferc6.Xqedii_9revsfl9ntnk(1918600385870827189L, 0)) {
            var2 = Xqedii_1sferc6.Xqedii_9revsfl9ntnk(-5091336114895094702L, 62);
         }

         var1.apiActionTokenSeq = var2;
         var1.apiActionTokens.add(var2);
         return var2;
      }
   }

   @Override
   public boolean isRuntimeActionChainActive(EditorSession var1, long var2) {
      if ((363872038 ^ 363872038) != 0) {
         throw new IllegalStateException();
      } else if (var2 >= Xqedii_1sferc6.Xqedii_zaqjui4e59aa(4750154548736053156L, 4)) {
         return super.isRuntimeActionChainActive(var1, var2);
      } else {
         return ((var1 != null && var1.apiActionTokens.contains(var2)
            ? Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 22)
            : Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(130402082, 2)) != 0);
      }
   }

   @Override
   public void finishRuntimeActionChain(EditorSession var1, long var2) {
      if ((1784923706 * 1784923706 - 1784923706 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 < Xqedii_1sferc6.Xqedii_11tohtz09dlz9(-7598985839038247153L, 56)) {
         if (var1 != null) {
            var1.apiActionTokens.remove(var2);
         }
      } else {
         super.finishRuntimeActionChain(var1, var2);
      }
   }

   public boolean pressApiKey(Player var1, String var2) {
      if ((604179584 * (604179584 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.apiRuntimeSession(var1) != null && this.handleRuntimeKeybind(var1, var2)
            ? Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-737449524, 31)
            : Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(260804164, 3)) != 0);
      }
   }

   public void markApiDragHandled(EditorSession var1, String var2) {
      if ((-621710667 ^ -621710667) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && var1.apiDragDetachedFrom != null) {
            String[] var10001 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1717037357, 24)];
            var10001[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1085709509, 3)] = var2;
            String var10000 = this.firstNonBlank(var10001).trim();
            String[] var10002 = new String[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 5)];
            var10002[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 15)] = var1.apiPressBlockId;
            if (var10000.equals(this.firstNonBlank(var10002))) {
               var1.apiDragHandled = (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1550999676, 14) != 0);
            }
         }
      }
   }

   public boolean removeApiElement(Player var1, String var2) {
      if ((1699562333 * 1699562333 - 1699562333 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 == null) {
            return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1908142197, 19) != 0);
         } else {
            String[] var10003 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1909031409, 16)];
            var10003[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-244201343, 8)] = var2;
            String var4 = this.resolveOpenUiElementTargetPath(var3, this.firstNonBlank(var10003).trim());
            if (!var4.isBlank() && this.apiRemoveRaw(var3, var4) != null) {
               this.markApiDragHandled(var3, var2);
               Set var10000 = var3.apiDraggableElements;
               String[] var10002 = new String[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 11)];
               var10002[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1085709509, 3)] = var2;
               var10000.remove(this.firstNonBlank(var10002).trim());
               this.apiRebuild(var1, var3);
               return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1315348571, 18) != 0);
            } else {
               return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 5) != 0);
            }
         }
      }
   }

   public boolean addApiElement(Player var1, String var2, Map<String, Object> var3, int var4) {
      if ((-451186130 * -451186130 + -451186130 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var5 = this.apiRuntimeSession(var1);
         if (var5 != null && var3 != null && !var3.isEmpty()) {
            String var6 = this.apiContainerPath(var5, var2);
            if (var6 == null) {
               return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(478682903, 20) != 0);
            } else {
               Map var7 = (Map)this.apiDeepCopy(var3);
               if (this.containsCompactImageBlock(List.of(var7))) {
                  var7 = this.expandCompactImageBlock(var7);
                  this.applyImageLayoutOffsetToBlock(
                     var7,
                     Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(6027958528973592235L, 5)),
                     Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(-3590463875208336141L, 20))
                  );
               }

               if (!this.apiInsertRaw(var5, var6, var4, var7)) {
                  return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 24) != 0);
               } else {
                  this.apiRebuild(var1, var5);
                  return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 5) != 0);
               }
            }
         } else {
            return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(272510521, 29) != 0);
         }
      }
   }

   public boolean applyApiStructure(Player var1, List<String> var2, List<UiElementCreate> var3) {
      if ((-452307954 * -452307954 - -452307954 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var4 = this.apiRuntimeSession(var1);
         if (var4 == null) {
            return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 31) != 0);
         } else {
            boolean var5 = false;

            for (String var7 : var2) {
               var5 |= this.apiRemoveById(var4, var7);
            }

            double var15 = Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(593021138506058503L, 42));

            for (UiElementCreate var9 : var3) {
               if (var9 != null && var9.element() != null && !var9.element().isEmpty()) {
                  Map var10 = (Map)this.apiDeepCopy(var9.element());
                  String var11 = var9.elementId();
                  if (!var11.isEmpty()) {
                     var5 |= this.apiRemoveById(var4, var11);
                  }

                  String var12 = this.apiContainerPath(var4, var9.containerId());
                  if (var12 != null) {
                     if (var10.get(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("McBza36bojUOfHHQOUqrd2c9/FleKuHgXvF84xtSuO9+CIWfpOc=")) == null) {
                        if (Double.isNaN(var15)) {
                           var15 = this.apiTopLayer(var4.rawBlocks);
                        }

                        var15 += Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(-4214379564416458631L, 25));
                        var10.put(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("McBza36bojUOfHHQOUqrd2c9/FleKuHgXvF84xtSuO9+CIWfpOc="), var15);
                     }

                     Object var13 = var10.get(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("tWADuMs1xQI768KR3Oi2jyGhPUldIWVQbRpzkbJLKwhtPGf9keQ="));
                     if (var13 != null) {
                        String var14 = this.normalizeHexColor(String.valueOf(var13));
                        if (!var14.isBlank()) {
                           var10.put(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("tWADuMs1xQI768KR3Oi2jyGhPUldIWVQbRpzkbJLKwhtPGf9keQ="), var14);
                        }
                     }

                     if (this.containsCompactImageBlock(List.of(var10))) {
                        var10 = this.expandCompactImageBlock(var10);
                        this.applyImageLayoutOffsetToBlock(
                           var10,
                           Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_3tyc9v1qjhrf3(-8641437683119130420L, 26)),
                           Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_9revsfl9ntnk(-3590463875208336141L, 20))
                        );
                     }

                     var5 |= this.apiInsertRaw(var4, var12, var9.index(), var10);
                  }
               }
            }

            if (var5) {
               this.apiRebuild(var1, var4);
            }

            return var5;
         }
      }
   }

   public boolean apiRemoveById(EditorSession var1, String var2) {
      if (((-884717992 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594948, 9)];
         var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 26)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isEmpty()) {
            return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-866907287, 23) != 0);
         } else {
            String var4 = this.apiFindRawPathById(var1, var3);
            if (!var4.isBlank() && this.apiRemoveRaw(var1, var4) != null) {
               this.markApiDragHandled(var1, var3);
               var1.apiDraggableElements.remove(var3);
               return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 10) != 0);
            } else {
               return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(130402082, 2) != 0);
            }
         }
      }
   }

   public double apiTopLayer(List<?> var1) {
      if ((1633873141 * 1633873141 - 1633873141 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = Double.longBitsToDouble(Xqedii_1sferc6.Xqedii_zaqjui4e59aa(2903962479003393923L, 31));
         if (var1 == null) {
            return var2;
         } else {
            for (Object var5 : var1) {
               if (var5 instanceof Map var6
                  && var6.get(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("McBza36bojUOfHHQOUqrd2c9/FleKuHgXvF84xtSuO9+CIWfpOc=")) instanceof Number var7) {
                  var2 = Math.max(var2, var7.doubleValue());
               }
            }

            return var2;
         }
      }
   }

   public boolean cloneApiElement(Player var1, String var2, String var3, String var4, int var5) {
      if (((55429402 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var6 = this.apiRuntimeSession(var1);
         String[] var10001 = new String[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594444, 3)];
         var10001[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 1)] = var3;
         String var7 = this.firstNonBlank(var10001).trim();
         if (var6 != null && !var7.isEmpty() && this.apiFindRawPathById(var6, var7).isEmpty()) {
            String[] var10003 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(1043216688, 5)];
            var10003[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 15)] = var2;
            String var8 = this.resolveOpenUiElementTargetPath(var6, this.firstNonBlank(var10003).trim());
            Map var9 = var8.isBlank() ? null : this.resolveRawMapAtPath(var6.rawBlocks, var8);
            if (var9 == null) {
               return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 20) != 0);
            } else {
               int var11 = var5;
               String var10;
               if (var4 == null) {
                  ApiTree.ApiRawLocation var12 = this.apiLocationOf(var8);
                  if (var12 == null) {
                     return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 12) != 0);
                  }

                  var10 = var12.containerPath();
                  if (var5 < 0) {
                     var11 = var12.index() + Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103627204, 15);
                  }
               } else {
                  var10 = this.apiContainerPath(var6, var4);
                  if (var10 == null) {
                     return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 20) != 0);
                  }
               }

               Map var13 = (Map)this.apiDeepCopy(var9);
               var13.put(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("SXvGH7eqHLfvf0Yzsq5u++VK+ih6pATXS1qNNIdx22o="), var7);
               if (!this.apiInsertRaw(var6, var10, var11, var13)) {
                  return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-477035550, 17) != 0);
               } else {
                  this.apiRebuild(var1, var6);
                  return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1702793927, 28) != 0);
               }
            }
         } else {
            return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1971229383, 28) != 0);
         }
      }
   }

   public boolean moveApiElement(Player var1, String var2, String var3, int var4) {
      if ((-1871966769 * -1871966769 + -1871966769 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var5 = this.apiRuntimeSession(var1);
         if (var5 == null) {
            return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1315086427, 18) != 0);
         } else {
            String[] var10003 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-737449524, 31)];
            var10003[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 17)] = var2;
            String var6 = this.resolveOpenUiElementTargetPath(var5, this.firstNonBlank(var10003).trim());
            ApiTree.ApiRawLocation var7 = var6.isBlank() ? null : this.apiLocationOf(var6);
            String var8 = this.apiContainerPath(var5, var3);
            if (var7 == null || var8 == null) {
               return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-244201343, 8) != 0);
            } else if (!var8.equals(var6) && !var8.startsWith(Xqedii_283l08jvhkmbk(var6))) {
               double[] var9 = this.apiAbsolutePosition(var5, var6);
               double[] var10 = this.apiAbsolutePosition(var5, var8);
               Map var11 = this.apiRemoveRaw(var5, var6);
               if (var11 == null) {
                  return (Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(775491646, 13) != 0);
               } else {
                  String var12 = this.apiAdjustPathAfterRemoval(var8, var7);
                  if (var9 != null && var10 != null) {
                     this.apiWritePosition(
                        var11,
                        var9[Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594436, 16)] - var10[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1474899048, 0)],
                        var9[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-2114883127, 0)] - var10[Xqedii_1sferc6.Xqedii_11gats66w6uvt(-2127375973, 28)]
                     );
                  }

                  if (!this.apiInsertRaw(var5, var12, var4, var11)) {
                     this.apiInsertRaw(var5, var7.containerPath(), var7.index(), var11);
                     this.apiRebuild(var1, var5);
                     return (Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-985614692, 27) != 0);
                  } else {
                     this.markApiDragHandled(var5, var2);
                     this.apiRebuild(var1, var5);
                     return (Xqedii_1sferc6.Xqedii_168376gc4etq6(-2103594308, 7) != 0);
                  }
               }
            } else {
               return (Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 2) != 0);
            }
         }
      }
   }

   public String getApiElementParent(Player var1, String var2) {
      if ((-1571716159 * -1571716159 + -1571716159 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 == null) {
            return null;
         } else {
            String[] var10003 = new String[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1085709517, 3)];
            var10003[Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(-1474899048, 0)] = var2;
            String var4 = this.resolveOpenUiElementTargetPath(var3, this.firstNonBlank(var10003).trim());
            ApiTree.ApiRawLocation var5 = var4.isBlank() ? null : this.apiLocationOf(var4);
            return var5 != null && !var5.containerPath().isEmpty() ? this.apiIdAtPath(var3, var5.containerPath()) : null;
         }
      }
   }

   public int getApiElementIndex(Player var1, String var2) {
      if ((-799642858 ^ -799642858) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 == null) {
            return Xqedii_1sferc6.Xqedii_11gats66w6uvt(2118987364, 23);
         } else {
            String[] var10003 = new String[Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-1742792932, 28)];
            var10003[Xqedii_1sferc6.Xqedii_11gats66w6uvt(2127375972, 31)] = var2;
            String var4 = this.resolveOpenUiElementTargetPath(var3, this.firstNonBlank(var10003).trim());
            ApiTree.ApiRawLocation var5 = var4.isBlank() ? null : this.apiLocationOf(var4);
            return var5 == null ? Xqedii_1sferc6.Xqedii_2f791tc4pqv9y(-130402083, 2) : var5.index();
         }
      }
   }

   public List<String> getApiElementChildren(Player var1, String var2) {
      if (((574671541 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 == null) {
            return Collections.emptyList();
         } else {
            String var4 = this.apiContainerPath(var3, var2);
            if (var4 == null) {
               return Collections.emptyList();
            } else {
               List var5 = var4.isEmpty()
                  ? var3.rawBlocks
                  : (
                     this.resolveRawMapAtPath(var3.rawBlocks, var4)
                           .get(Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("wcbR7SKasarGsStbKQAsFZ42bV/8BMPsFKYZAute+fT0ZH4Z51DNDMz3KHc=")) instanceof List var6
                        ? var6
                        : null
                  );
               if (var5 == null) {
                  return Collections.emptyList();
               } else {
                  ArrayList var8 = new ArrayList();

                  for (int var9 = Xqedii_1sferc6.Xqedii_f4e8gk4njqkg(1832487553, 12); var9 < var5.size(); var9++) {
                     if (var5.get(var9) instanceof Map) {
                        var8.add(this.apiIdAtPath(var3, this.apiChildPath(var4, var9)));
                     }
                  }

                  return var8;
               }
            }
         }
      }
   }

   public String getApiListContainer(Player var1, String var2) {
      if (((352381738 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = this.apiRuntimeSession(var1);
         if (var3 == null) {
            return null;
         } else {
            String var4 = this.apiListContainerIdOf(var3, var2);
            return var4.isEmpty() ? null : var4;
         }
      }
   }

   private static /* synthetic */ String Xqedii_283l08jvhkmbk(String string) {
        return string + Xqedii_1sferc6.Xqedii_3lcpe2x71pjjb("PKlVYK7EEBRmk5Ro3pEDSQfRH+5nHCik2dWHnpaJ");
    }
}
