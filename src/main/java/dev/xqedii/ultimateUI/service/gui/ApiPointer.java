package dev.xqedii.ultimateUI.service.gui;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1vnt7ty;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.api.event.UltimateUIBlockClickEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUICursorMoveEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIDragEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIHoverEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIKeyEvent;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.gui.parser.ScrollViewState;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class ApiPointer extends ApiTree {
   public static final String Xqedii_4mf4d20z6b11 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final double Xqedii_29r4zjk = 3.0;
   public static final double Xqedii_2jqw2el = 1.0E-4;
   public static final double Xqedii_3qwanvo = 0.5;

   public ApiPointer(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public boolean isApiRuntimeSession(EditorSession var1) {
      if ((134669953 * 134669953 - 134669953 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && !var1.editMode && !this.isEditorMenuSession(var1)
            ? Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151493, 8)
            : Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 13)) != 0);
      }
   }

   public EditorSession apiRuntimeSession(Player var1) {
      if ((340017540 * 340017540 - 340017540 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         return this.isApiRuntimeSession(var2) ? var2 : null;
      }
   }

   public boolean isApiSessionAlive(Player var1, EditorSession var2) {
      if ((-951113893 * (-951113893 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var2 != null && this.editorSessions.get(var1.getUniqueId()) == var2
            ? Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1000756067, 19)
            : Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(699506127, 2)) != 0);
      }
   }

   public static boolean hasApiListeners(HandlerList var0) {
      if (((2049805384 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var0 != null && var0.getRegisteredListeners().length > 0
            ? Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 12)
            : Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-1315057879, 10)) != 0);
      }
   }

   public void callApiEvent(Event var1) {
      if ((-539815484 * (-539815484 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Bukkit.getPluginManager().callEvent(var1);
      }
   }

   public String apiBlockIdOf(HoverElement var1) {
      if (((-161497244 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var10000;
         if (var1 == null) {
            var10000 = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw==");
         } else {
            String[] var10001 = new String[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-1315054807, 10)];
            var10001[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-1530242317, 3)] = var1.id;
            var10001[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-900007004, 11)] = var1.targetId;
            var10001[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943463, 2)] = this.targetIdOf(var1);
            var10000 = this.firstNonBlank(var10001);
         }

         return var10000;
      }
   }

   public double apiHitX(EditorSession var1) {
      if (((-1175466371 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1.cursorX + var1.hitboxOffsetX;
      }
   }

   public double apiHitY(EditorSession var1) {
      if ((-320523684 * -320523684 + -320523684 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1.cursorY + var1.hitboxOffsetY;
      }
   }

   public double apiPageX(EditorSession var1, double var2) {
      if ((1026123561 * 1026123561 - 1026123561 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.toLogicalCursorX(var1, var2);
      }
   }

   public double apiPageY(EditorSession var1, double var2) {
      if (((1022419586 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.toLogicalCursorY(var1, var2);
      }
   }

   public boolean isApiLeftHeld(EditorSession var1) {
      if ((-1177476979 * -1177476979 - -1177476979 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && Xqedii_38o2zes.Xqedii_316oplq() - var1.apiLeftLastTick <= Xqedii_1vnt7ty.Xqedii_1lxgnzillacm4(8952210012359677244L, 26)
            ? Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1246762629, 23)
            : Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 23)) != 0);
      }
   }

   public String findApiBlockIdExcluding(EditorSession var1, double var2, double var4, String var6) {
      if ((734266096 * (734266096 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.elements != null && !var1.elements.isEmpty()) {
         String[] var10001 = new String[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255675525, 19)];
         var10001[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-677566894, 22)] = var6;
         String var7 = this.firstNonBlank(var10001);
         HoverElement var8 = null;

         for (HoverElement var10 : var1.elements) {
            if (var10 != null
               && var10.baseLocation != null
               && !var10.disableHitbox
               && (var7.isEmpty() || !var7.equals(this.apiBlockIdOf(var10)) && !var7.equals(var10.targetId))) {
               EditorRect var11 = this.getHoverBounds(var1, var10);
               if (var11 != null
                  && var2 >= var11.x
                  && var2 <= var11.maxX()
                  && var4 >= var11.y
                  && var4 <= var11.maxY()
                  && (var8 == null || var10.runtimeZ >= var8.runtimeZ)) {
                  var8 = var10;
               }
            }
         }

         return this.apiBlockIdOf(var8);
      } else {
         return Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw==");
      }
   }

   public Map<String, Object> resolveApiRawTarget(EditorSession var1, String var2) {
      if ((1187275624 * (1187275624 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.rawBlocks != null && !var1.rawBlocks.isEmpty()) {
         String[] var10003 = new String[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(867853622, 15)];
         var10003[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 10)] = var2;
         String var3 = this.resolveOpenUiElementTargetPath(var1, this.firstNonBlank(var10003).trim());
         return var3.isBlank() ? null : this.resolveRawMapAtPath(var1.rawBlocks, var3);
      } else {
         return null;
      }
   }

   public double[] readApiElementPosition(EditorSession var1, String var2) {
      if ((852934854 * 852934854 + 852934854 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var3 = this.resolveApiRawTarget(var1, var2);
         if (var3 == null) {
            return null;
         } else {
            String var10002 = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("f2mM3rToWrPzQhn2w9Moc6Ft02W4yqOrtLfDzEQ3FzjBLsMwBkD/6i4U/8WYdxf/");
            String[] var10003 = new String[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-1826002098, 5)];
            var10003[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-224716324, 30)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp(
               "f2mM3rToWrPzQhn2w9Moc6Ft02W4yqOrtLfDzEQ3FzjBLsMwBkD/6i4U/8WYdxf/"
            );
            var10003[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 2)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("/U2vLtPGF8ZZ9Jj17rg3W9kSTit7xBgl/mBbYdWW");
            var10003[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(909359845, 7)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp(
               "PX22ahfrMLe6U9L4G//oiPkJ4RS/j/UQsZpSion6LRQsaugU0/xJLeOMMavIuuOr4O9/GuZGUHXNyD5O5DM="
            );
            var10003[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(1285926586, 7)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp(
               "YUnaN8dkNH2SAKflA0a+OKhJz9IQbGlOVsirx4FiiciDmDGxy/uFGNLE3GA="
            );
            String var4 = this.resolvePreferredOpenUiWritePath(var3, var10002, var10003);
            var10002 = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FbNgS93R7Kilh+vinrJcdgtKLIwiGAYZHBvwrMtgVnUCKhs2M2EWgPYqcEiSi+zE");
            var10003 = new String[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255413381, 16)];
            var10003[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 0)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp(
               "FbNgS93R7Kilh+vinrJcdgtKLIwiGAYZHBvwrMtgVnUCKhs2M2EWgPYqcEiSi+zE"
            );
            var10003[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-1723113612, 8)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("LAxKSX6ssxOUvt91/8ul99pOiWsuJpPeXzJa2pJ5");
            var10003[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(2002560710, 20)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp(
               "yCrieRg/yh25Gh27VF6wqcYhh/gBoU6VVcC+zqKjEEnRFf5A7JVzy+e44ASOQMIDARchrTplIW3fnz8gshg="
            );
            var10003[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(2060457605, 28)] = Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp(
               "RvJAXaLFNtcXObnFp/nhC56qBfNwc5fIZ+4B2HCJ+3UBt20Bl6QyXbwx7Kk="
            );
            String var5 = this.resolvePreferredOpenUiWritePath(var3, var10002, var10003);
            double var6 = this.parseDouble(
               this.readMapPathValue(var3, var4), Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_13gwbz29c38ip(-3249326982028000940L, 55))
            );
            double var8 = this.parseDouble(
               this.readMapPathValue(var3, var5), Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_3lgkr7t1ru4tz(5702918231868886501L, 12))
            );
            if (Double.isFinite(var6) && Double.isFinite(var8)) {
               double[] var10000 = new double[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-1826002034, 5)];
               var10000[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(1956203358, 0)] = var6;
               var10000[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 11)] = var8;
               return var10000;
            } else {
               return null;
            }
         }
      }
   }

   public boolean isApiElementDraggable(EditorSession var1, String var2) {
      if ((-1248035429 * -1248035429 - -1248035429 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 15)];
         var10001[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 19)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var1 == null || var3.isEmpty()) {
            return (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 19) != 0);
         } else if (var1.apiDraggableElements.contains(var3)) {
            return (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 29) != 0);
         } else {
            Map var4 = this.resolveApiRawTarget(var1, var3);
            if (var4 == null) {
               return (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 9) != 0);
            } else {
               Object var5 = this.readMapPathValue(
                  var4, Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("EN6ZWx+tLGiFNjhkcXRhGKJKiKqFMnQPcYm2rv9YB8FVex+UXpORvu72g9mgeg==")
               );
               return ((!Boolean.TRUE.equals(var5)
                     && !Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("lJIusk1OwZ3yNwMeZbV+9tZyWHgFYwA3k/Bg8offAqNsFuIx").equalsIgnoreCase(this.stringValue(var5))
                  ? Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-588080359, 22)
                  : Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1250956933, 22)) != 0);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean clickHoveredElement(Player var1, GuiService.ClickType var2) {
      if ((1564510214 * 1564510214 - 1564510214 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(694931091, 13) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var2 == GuiService.ClickType.LEFT && this.isEditorScrollbarSession(var3) && this.handleEditorScrollbarClick(var1, var3)) {
            return (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151301, 6) != 0);
         } else {
            if (var2 == GuiService.ClickType.LEFT && this.isApiRuntimeSession(var3)) {
               long var4 = Xqedii_38o2zes.Xqedii_316oplq();
               int var6 = var4 - var3.apiLeftLastTick <= Xqedii_1vnt7ty.Xqedii_3lgkr7t1ru4tz(3520454904497519130L, 40)
                  ? Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 29)
                  : Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(1389862182, 14);
               var3.apiLeftLastTick = var4;
               var3.apiLeftRepeat = (var6 != 0);
               if (var6 != 0 && var3.scrollbarDragContainer != null) {
                  var3.apiLeftRepeat = (Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1664851539, 11) != 0);
                  this.updateScrollbarDrag(var1, var3);
                  return (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-146172747, 28) != 0);
               }

               if (var6 == 0) {
                  if (var3.apiPressActive) {
                     this.finishApiDrag(var1, var3);
                     if (!this.isApiSessionAlive(var1, var3)) {
                        return (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 8) != 0);
                     }
                  }

                  if (this.beginScrollbarDrag(var1, var3)) {
                     var3.apiLeftRepeat = (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 31) != 0);
                     return (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 27) != 0);
                  }

                  this.beginApiPress(var3);
               }
            }

            boolean var9 = false /* VF: Semaphore variable */;

            boolean var11;
            try {
               var9 = true;
               var11 = super.clickHoveredElement(var1, var2);
               var9 = false;
            } finally {
               if (var9) {
                  if (var3 != null) {
                     var3.apiLeftRepeat = (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 24) != 0);
                  }
               }
            }

            if (var3 != null) {
               var3.apiLeftRepeat = (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 12) != 0);
            }

            return var11;
         }
      }
   }

   public boolean isEditorScrollbarSession(EditorSession var1) {
      if ((617804717 ^ 617804717) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.editMode && var1.previewMode && !this.isEditorMenuSession(var1)
            ? Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151493, 8)
            : Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(762958437, 18)) != 0);
      }
   }

   public boolean handleEditorScrollbarClick(Player var1, EditorSession var2) {
      if ((285376485 * 285376485 - 285376485 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         long var3 = Xqedii_38o2zes.Xqedii_316oplq();
         int var5 = var3 - var2.apiLeftLastTick <= Xqedii_1vnt7ty.Xqedii_3aak23l8rw2kx(-6933454019872671934L, 59)
            ? Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(-892332411, 31)
            : Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(1697479122, 10);
         var2.apiLeftLastTick = var3;
         if (var5 != 0 && var2.scrollbarDragContainer != null) {
            this.updateScrollbarDrag(var1, var2);
            return (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(2110940461, 26) != 0);
         } else if (var5 != 0) {
            return (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 13) != 0);
         } else if (!this.isAnyEditorPopupVisible(var2)
            && !this.isAnyEditorDropdownVisible(var2)
            && this.isInsidePreviewArea(var2, this.apiHitX(var2), this.apiHitY(var2))) {
            return this.beginScrollbarDrag(var1, var2);
         } else {
            var2.scrollbarDragContainer = null;
            return (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 27) != 0);
         }
      }
   }

   public boolean beginScrollbarDrag(Player var1, EditorSession var2) {
      if ((1338570252 * 1338570252 + 1338570252 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         var2.scrollbarDragContainer = null;
         double var3 = this.apiPageX(var2, this.apiHitX(var2));
         double var5 = this.apiPageY(var2, this.apiHitY(var2));

         for (ScrollViewState.Metrics var8 : var2.scrollViewState.allMetrics().values()) {
            ScrollViewState.Bar var9 = this.hitScrollbar(var8, var3, var5);
            if (var9 != null) {
               double var10 = var9.vertical ? var5 : var3;
               boolean var12 = var9.onThumb(var10);
               var2.scrollbarDragContainer = var8.containerId;
               var2.scrollbarDragVertical = var9.vertical;
               var2.scrollbarDragGrab = var12
                  ? var10 - var9.thumbStart
                  : var9.thumbLength / Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_3aak23l8rw2kx(4319195078323974455L, 29));
               var2.scrollbarDragLastPosition = var10;
               if (!var12) {
                  double var13 = var9.offsetForThumbStart(var10 - var2.scrollbarDragGrab, var9.vertical ? var8.maxOffsetY : var8.maxOffsetX);
                  double[] var15 = this.currentScrollOffset(var2, var8);
                  this.glideScrollBoxTo(
                     var1,
                     var2,
                     var8,
                     var9.vertical ? var15[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 13)] : var13,
                     var9.vertical ? var13 : var15[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-1167772109, 23)]
                  );
               }

               return (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-1515210164, 15) != 0);
            }
         }

         return (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 24) != 0);
      }
   }

   public ScrollViewState.Bar hitScrollbar(ScrollViewState.Metrics var1, double var2, double var4) {
      if (((1406177911 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (var1.verticalBar != null && var1.verticalBar.hit(var2, var4)) {
         return var1.verticalBar;
      } else {
         return var1.horizontalBar != null && var1.horizontalBar.hit(var2, var4) ? var1.horizontalBar : null;
      }
   }

   public void updateScrollbarDrag(Player var1, EditorSession var2) {
      if ((-1624963512 * -1624963512 + -1624963512 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var2.scrollbarDragContainer;
         ScrollViewState.Metrics var4 = var3 == null ? null : var2.scrollViewState.metrics(var3);
         ScrollViewState.Bar var5 = var4 == null ? null : (var2.scrollbarDragVertical ? var4.verticalBar : var4.horizontalBar);
         if (var5 == null) {
            var2.scrollbarDragContainer = null;
         } else {
            double var6 = var5.vertical ? this.apiPageY(var2, this.apiHitY(var2)) : this.apiPageX(var2, this.apiHitX(var2));
            if (!(Math.abs(var6 - var2.scrollbarDragLastPosition) < Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_3lgkr7t1ru4tz(-3520453873571150363L, 38)))) {
               var2.scrollbarDragLastPosition = var6;
               double var8 = var5.offsetForThumbStart(var6 - var2.scrollbarDragGrab, var5.vertical ? var4.maxOffsetY : var4.maxOffsetX);
               double[] var10 = this.currentScrollOffset(var2, var4);
               this.applyScrollBoxOffset(
                  var1,
                  var2,
                  var3,
                  var5.vertical ? var10[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 12)] : var8,
                  var5.vertical ? var8 : var10[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1301081753, 5)],
                  (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 22) != 0)
               );
            }
         }
      }
   }

   public void beginApiPress(EditorSession var1) {
      if ((-1522154893 * (-1522154893 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = this.apiHitX(var1);
         double var4 = this.apiHitY(var1);
         var1.apiPressActive = (Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(909359717, 7) != 0);
         var1.apiDragActive = (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(1697479122, 10) != 0);
         var1.apiDragFollow = (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 29) != 0);
         var1.apiPressHitX = var2;
         var1.apiPressHitY = var4;
         var1.apiPressPageX = this.apiPageX(var1, var2);
         var1.apiPressPageY = this.apiPageY(var1, var4);
         var1.apiPressBlockId = this.apiBlockIdOf(this.findHoveredRuntimeElement(var1, var2, var4));
      }
   }

   @Override
   public boolean fireRuntimeClickEvent(Player var1, EditorSession var2, HoverElement var3, UltimateUIBlockClickEvent.ClickType var4) {
      if (((1608080382 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var4 == null) {
         return (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(762958437, 18) != 0);
      } else if (var4 == UltimateUIBlockClickEvent.ClickType.LEFT && var2.apiLeftRepeat) {
         return (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 31) != 0);
      } else {
         double var5 = this.apiHitX(var2);
         double var7 = this.apiHitY(var2);
         String[] var10004 = new String[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-1826001938, 5)];
         var10004[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 9)] = var2.pageName;
         UltimateUIBlockClickEvent var9 = new UltimateUIBlockClickEvent(
            var1,
            this.firstNonBlank(var10004),
            this.apiBlockIdOf(var3),
            var3 == null ? Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_3lgkr7t1ru4tz(-3520453804985891355L, 54)) : var3.z,
            var2.cursorX,
            var2.cursorY,
            this.apiPageX(var2, var5),
            this.apiPageY(var2, var7),
            var4
         );
         this.callApiEvent(var9);
         return var9.isCancelled();
      }
   }

   @Override
   public void onCursorMove(Player var1, double var2, double var4) {
      if ((1962090715 * (1962090715 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         super.onCursorMove(var1, var2, var4);
         EditorSession var6 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var6 != null && var6.scrollbarDragContainer != null && (this.isApiRuntimeSession(var6) || this.isEditorScrollbarSession(var6))) {
            if (this.isApiLeftHeld(var6)) {
               this.updateScrollbarDrag(var1, var6);
            } else {
               var6.scrollbarDragContainer = null;
            }
         }

         EditorSession var7 = this.apiRuntimeSession(var1);
         if (var7 != null) {
            this.dispatchApiPointer(var1, var7);
         }
      }
   }

   public void dispatchApiPointer(Player var1, EditorSession var2) {
      if (((-1967565735 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var3 = this.apiHitX(var2);
         double var5 = this.apiHitY(var2);
         double var7 = this.apiPageX(var2, var3);
         double var9 = this.apiPageY(var2, var5);
         String[] var10001 = new String[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1257248389, 21)];
         var10001[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(848739561, 9)] = var2.pageName;
         String var11 = this.firstNonBlank(var10001);
         boolean var12 = hasApiListeners(UltimateUIHoverEvent.getHandlerList());
         boolean var13 = hasApiListeners(UltimateUICursorMoveEvent.getHandlerList());
         String var14 = !var12 && !var13
            ? Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw==")
            : this.apiBlockIdOf(this.findHoveredRuntimeElement(var2, var3, var5));
         if (var12) {
            var10001 = new String[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(867853622, 15)];
            var10001[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-207304102, 27)] = var2.apiHoverBlockId;
            String var15 = this.firstNonBlank(var10001);
            if (!var15.equals(var14)) {
               var2.apiHoverBlockId = var14;
               if (!var15.isEmpty()) {
                  this.callApiEvent(
                     new UltimateUIHoverEvent(var1, var11, var15, var14, UltimateUIHoverEvent.Action.LEAVE, var2.cursorX, var2.cursorY, var7, var9)
                  );
                  if (!this.isApiSessionAlive(var1, var2)) {
                     return;
                  }
               }

               if (!var14.isEmpty()) {
                  this.callApiEvent(
                     new UltimateUIHoverEvent(var1, var11, var14, var15, UltimateUIHoverEvent.Action.ENTER, var2.cursorX, var2.cursorY, var7, var9)
                  );
                  if (!this.isApiSessionAlive(var1, var2)) {
                     return;
                  }
               }
            }
         }

         double var20 = var2.apiLastPageX;
         double var17 = var2.apiLastPageY;
         int var19 = Double.isFinite(var20)
               && Double.isFinite(var17)
               && !(Math.abs(var7 - var20) > Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_1lxgnzillacm4(-8302967280962726657L, 61)))
               && !(Math.abs(var9 - var17) > Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_3lgkr7t1ru4tz(2081841857799661145L, 56)))
            ? Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-898865293, 0)
            : Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-382560578, 1);
         var2.apiLastPageX = var7;
         var2.apiLastPageY = var9;
         if (var19 != 0 && var13) {
            this.callApiEvent(new UltimateUICursorMoveEvent(var1, var11, var14, var2.cursorX, var2.cursorY, var7, var9, var20, var17));
            if (!this.isApiSessionAlive(var1, var2)) {
               return;
            }
         }

         this.updateApiDrag(var1, var2, var3, var5, var7, var9);
      }
   }

   public void updateApiDrag(Player var1, EditorSession var2, double var3, double var5, double var7, double var9) {
      if ((425323580 * 425323580 + 425323580 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2.apiPressActive) {
         if (!this.isApiLeftHeld(var2)) {
            this.finishApiDrag(var1, var2);
         } else {
            String[] var10001 = new String[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-765121155, 2)];
            var10001[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 16)] = var2.pageName;
            String var11 = this.firstNonBlank(var10001);
            var10001 = new String[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1246762629, 23)];
            var10001[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 14)] = var2.apiPressBlockId;
            String var12 = this.firstNonBlank(var10001);
            if (!var2.apiDragActive) {
               double var13 = Math.hypot(var3 - var2.apiPressHitX, var5 - var2.apiPressHitY);
               if (var13 < Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_1lxgnzillacm4(2533180111631752346L, 61))) {
                  return;
               }

               boolean var15 = this.isApiElementDraggable(var2, var12);
               UltimateUIDragEvent var16 = new UltimateUIDragEvent(
                  var1,
                  var11,
                  var12,
                  UltimateUIDragEvent.Phase.START,
                  var2.cursorX,
                  var2.cursorY,
                  var7,
                  var9,
                  var2.apiPressPageX,
                  var2.apiPressPageY,
                  var7 - var2.apiPressPageX,
                  var9 - var2.apiPressPageY,
                  Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw=="),
                  var15
               );
               this.callApiEvent(var16);
               if (!this.isApiSessionAlive(var1, var2)) {
                  return;
               }

               if (var16.isCancelled()) {
                  var2.apiPressActive = (Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-823683880, 17) != 0);
                  return;
               }

               var2.apiDragActive = (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255413381, 18) != 0);
               var2.apiLastDragPageX = var2.apiPressPageX;
               var2.apiLastDragPageY = var2.apiPressPageY;
               var2.apiDragDetachedFrom = null;
               var2.apiDragHandled = (Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1735641708, 16) != 0);
               if (var15) {
                  this.detachApiDraggedListChild(var1, var2, var12);
               }

               double[] var17 = var15 ? this.readApiElementPosition(var2, var12) : null;
               var2.apiDragFollow = ((var17 != null
                  ? Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151493, 8)
                  : Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1301081721, 5)) != 0);
               if (var17 != null) {
                  var2.apiDragElementStartX = var17[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1942645863, 24)];
                  var2.apiDragElementStartY = var17[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 6)];
               }
            }

            double var18 = var7 - var2.apiLastDragPageX;
            double var19 = var9 - var2.apiLastDragPageY;
            if (!(Math.abs(var18) <= Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_13gwbz29c38ip(1844268985342477892L, 54)))
               || !(Math.abs(var19) <= Double.longBitsToDouble(Xqedii_1vnt7ty.Xqedii_1lxgnzillacm4(1897139363448159986L, 39)))) {
               var2.apiLastDragPageX = var7;
               var2.apiLastDragPageY = var9;
               UltimateUIDragEvent var20 = new UltimateUIDragEvent(
                  var1,
                  var11,
                  var12,
                  UltimateUIDragEvent.Phase.MOVE,
                  var2.cursorX,
                  var2.cursorY,
                  var7,
                  var9,
                  var2.apiPressPageX,
                  var2.apiPressPageY,
                  var18,
                  var19,
                  Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw=="),
                  var2.apiDragFollow
               );
               this.callApiEvent(var20);
               if (this.isApiSessionAlive(var1, var2)) {
                  if (var2.apiDragFollow && !var20.isCancelled()) {
                     this.setOpenUiElementPosition(
                        var1, var12, var2.apiDragElementStartX + (var7 - var2.apiPressPageX), var2.apiDragElementStartY + (var9 - var2.apiPressPageY)
                     );
                  }
               }
            }
         }
      }
   }

   public void finishApiDrag(Player var1, EditorSession var2) {
      if ((140823678 ^ 140823678) != 0) {
         throw new IllegalStateException();
      } else {
         boolean var3 = var2.apiDragActive;
         boolean var4 = var2.apiDragFollow;
         var2.apiPressActive = (Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 11) != 0);
         var2.apiDragActive = (Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-382560580, 1) != 0);
         var2.apiDragFollow = (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 31) != 0);
         if (var3) {
            double var5 = this.apiHitX(var2);
            double var7 = this.apiHitY(var2);
            double var9 = this.apiPageX(var2, var5);
            double var11 = this.apiPageY(var2, var7);
            String[] var10001 = new String[Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-146172747, 28)];
            var10001[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-819351139, 26)] = var2.apiPressBlockId;
            String var13 = this.firstNonBlank(var10001);
            String var14 = this.findApiBlockIdExcluding(var2, var5, var7, var13);
            String var15 = var14.isEmpty()
               ? Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw==")
               : this.apiListContainerIdOf(var2, var14);
            String[] var10004 = new String[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(-1722970898, 29)];
            var10004[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1255151237, 0)] = var2.pageName;
            UltimateUIDragEvent var16 = new UltimateUIDragEvent(
               var1,
               this.firstNonBlank(var10004),
               var13,
               UltimateUIDragEvent.Phase.END,
               var2.cursorX,
               var2.cursorY,
               var9,
               var11,
               var2.apiPressPageX,
               var2.apiPressPageY,
               var9 - var2.apiLastDragPageX,
               var11 - var2.apiLastDragPageY,
               var14,
               var15,
               var4
            );
            this.callApiEvent(var16);
            String var17 = var2.apiDragDetachedFrom;
            var2.apiDragDetachedFrom = null;
            if (this.isApiSessionAlive(var1, var2)) {
               if (var17 != null) {
                  if (!var2.apiDragHandled) {
                     this.reattachApiDraggedListChild(var1, var2, var13, var17, var2.apiDragDetachedIndex);
                  }
               } else {
                  if (var4 && var16.isCancelled()) {
                     this.setOpenUiElementPosition(var1, var13, var2.apiDragElementStartX, var2.apiDragElementStartY);
                  }
               }
            }
         }
      }
   }

   public void detachApiDraggedListChild(Player var1, EditorSession var2, String var3) {
      if (((1311410959 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var4 = this.resolveOpenUiElementTargetPath(var2, var3);
         if (!var4.isBlank() && this.apiIsInListLayout(var2, var4)) {
            ApiTree.ApiRawLocation var5 = this.apiLocationOf(var4);
            double[] var6 = this.apiAbsolutePosition(var2, var4);
            if (var5 != null && var6 != null) {
               Map var7 = this.apiRemoveRaw(var2, var4);
               if (var7 != null) {
                  this.apiWritePosition(
                     var7, var6[Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1735641708, 16)], var6[Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1254102661, 20)]
                  );
                  this.apiInsertRaw(
                     var2,
                     Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw=="),
                     Xqedii_1vnt7ty.Xqedii_2s9apjgnq2ifa(-2043831598, 26),
                     var7
                  );
                  var2.apiDragDetachedFrom = var5.containerPath();
                  var2.apiDragDetachedIndex = var5.index();
                  this.apiRebuild(var1, var2);
               }
            }
         }
      }
   }

   public void reattachApiDraggedListChild(Player var1, EditorSession var2, String var3, String var4, int var5) {
      if (((843861685 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var6 = this.resolveOpenUiElementTargetPath(var2, var3);
         ApiTree.ApiRawLocation var7 = this.apiLocationOf(var6);
         if (var7 != null && var7.containerPath().isEmpty()) {
            Map var8 = this.apiRemoveRaw(var2, var6);
            if (var8 != null) {
               String var9 = this.apiAdjustPathAfterRemoval(var4, var7);
               if (!this.apiInsertRaw(var2, var9, var5, var8)) {
                  this.apiInsertRaw(var2, Xqedii_1vnt7ty.Xqedii_13v5apgvaykhp("FaBcOOYOGRrAUO/UazZ6lxWAHKsVKTVbnYOYdw=="), var7.index(), var8);
               }

               this.apiRebuild(var1, var2);
            }
         }
      }
   }

   @Override
   public boolean handleRuntimeKeybind(Player var1, String var2) {
      if ((-1054726386 * -1054726386 - -1054726386 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         String var3 = normalizeKeybindId(var2);
         EditorSession var4 = this.apiRuntimeSession(var1);
         if (!var3.isBlank() && var4 != null && hasApiListeners(UltimateUIKeyEvent.getHandlerList())) {
            double var5 = this.apiHitX(var4);
            double var7 = this.apiHitY(var4);
            String[] var10004 = new String[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(1221943459, 5)];
            var10004[Xqedii_1vnt7ty.Xqedii_oqtqupt08ak5(-1221943460, 19)] = var4.pageName;
            UltimateUIKeyEvent var9 = new UltimateUIKeyEvent(
               var1,
               this.firstNonBlank(var10004),
               this.apiBlockIdOf(this.findHoveredRuntimeElement(var4, var5, var7)),
               var3,
               var4.cursorX,
               var4.cursorY,
               this.apiPageX(var4, var5),
               this.apiPageY(var4, var7)
            );
            this.callApiEvent(var9);
            if (var9.isCancelled() || !this.isApiSessionAlive(var1, var4)) {
               return (Xqedii_1vnt7ty.Xqedii_2lxhpelzhkkhp(1271928453, 24) != 0);
            }
         }

         return super.handleRuntimeKeybind(var1, var2);
      } else {
         return (Xqedii_1vnt7ty.Xqedii_3arhnoznnak6s(1017562743, 28) != 0);
      }
   }
}
