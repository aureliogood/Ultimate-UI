package dev.xqedii.ultimateUI.service.gui.editor.shell.managers;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_14y6uzm;
import dev.xqedii.ultimateUI.Xqedii_2eupooz;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_nkkc0h9;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.editor.interaction.EditorOverlayPreviewPart;
import dev.xqedii.ultimateUI.service.gui.model.EditorPropertyField;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorSidebarTab;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.logging.Logger;
import org.bukkit.entity.Player;

public abstract class EditorPreviewSidebarPart extends EditorTimelineKeyframePart {
   public static final String Xqedii_g8b7vl86he9v = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public EditorPreviewSidebarPart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public abstract boolean openEditorTextPrompt(Player var1, EditorSession var2, String var3, String var4);

   public abstract String readSidebarFieldRawValue(EditorSession var1, EditorPropertyField var2);

   public boolean isEditorTextPromptCoolingDown(EditorSession var1) {
      if (((1344497037 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 25) != 0;
      } else {
         long var2 = var1.editorTextPromptReopenTick - Xqedii_38o2zes.Xqedii_316oplq();
         return (var2 > Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(7719690778399307898L, 11)
               && var2 <= Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(7187384333829954070L, 45)
            ? Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 5)
            : Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-152104439, 3)) != 0;
      }
   }

   public void armEditorTextPromptCooldown(EditorSession var1) {
      if ((-2143929910 * -2143929910 - -2143929910 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.editorTextPromptReopenTick = Xqedii_38o2zes.Xqedii_316oplq() + Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(7187278780713916950L, 15);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void startSidebarInputPrompt(Player var1, EditorSession var2, EditorPropertyField var3) {
      if (((-600727597 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !this.isEditorTextPromptCoolingDown(var2)) {
         if (this.getSidebarEditableTargetId(var2) == null) {
            this.sendEditorError(
               var1,
               Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("I2pe0fEzSItra1F2L8Wo9DLe6mIXACzJHDYhgOv5VCp3Yhq0MMpX+03wvFZ1TTeGyPUo5vjCaYAJ9v/oa+CHxQpVgiyfO2rIkkwKeg=="),
               new Object[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 4)]
            );
         } else {
            var2.pendingPropertyField = var3;
            this.clearPendingItemDesignInventoryPick(var2);
            var2.pendingActionTargetId = null;
            var2.pendingActionIndex = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(103698121, 1);
            this.stopOpacitySliderDrag(var2, Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1878018184, 22) != 0);
            this.resetSidebarFieldDrag(var1, var2);
            this.updateEditorPropertiesSidebar(var1, var2);

            String var4 = switch (Xqedii_2eupooz.Xqedii_1zz5w99[var3.ordinal()]) {
               case 1 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("JDBOhfCUrYrYl8BsM9O17y/yEnNkZkulAKvKic4ErY6ge2P/");
               case 2 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("bcRb65ebCsWza7bKo1HDAUPtlrvSC9UrNIkknaeoY/o=");
               case 3 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("aGtV0SjgmuPdMjbovdsi81AvYuS5e/bJktgQxTF+OkO9H6Z7/yj6LrCiCJP1ZoPJ");
               case 4 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("W46XTE1QDF09Wf0/Zsl2LlzZd7+0rP/cDXkHK2mlXXiXmUVb41ns+x/D");
               case 5 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XzsxZR0UqDERXWMGKZEHlPcCqXeAV3jbQbY3xTzoz5xwMj9ddKMyuA==");
               case 6 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ATjZFQFDi2CrKUc0CuIVs6H3iV2IqYQ+1eruHlr4uPfFLo7iEII=");
               case 7 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("u5u7qgbVxTVI02Ln5Y9Rc2c4jU2jJhFkRFXxYJfwA602gKBChNLr9g==");
               case 8 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("lSDhrdtb8f6BaiK7Ig2A/KSRHCft60PqzRMuC56xGO5ipB2CJRQdfnIUQSgnIphP");
               case 9 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("3yiTAM33YwIpF5CoJphupiXxD9nBzoBhECmquI1VYph1HwiszaUGjKpaLmUqfQ8r");
               case 10 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("iN5Mmzy32P7ji5o10G6yH7OrmcKduIejytogRc/aQOMnTozIxNL7zzs9Ncw=");
               case 11 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("fMmgwdjUBYZvU92lDFyyQuQGWsgk89uSjPOzqbUBuC0HLIMeYUw=");
               case 12 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("iKDrQ4dHWafTwI4TZxQ3hEMBfmE1qWacnCCGhTqHWy8nR4aU4zdZOBN3");
               case 13 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Cwv5w9aE7ekuJ9fszpCyymcvNhB0oXp5NuSc521/kmECf4XDdIk=");
               case 14 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("4ju7vx5iVngKLVLNogB/+HI1zNp1GkOR4xMXBB8A9n0aSi5ZMhsm/gee9TMxZrMaVY54Lw==");
               case 15 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("yqt3Ke6nL9CLW8CiP0xgfBuTgIDia39jpBMYwCVH6BoOJaG1KVP5absfv1t5OpBJXB4=");
               case 16 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("BhqvccRmx3Ad46bMiab73NSzwSJp/LlkQBngSgbocs01VrEpQ7/Wgkmf+IIVtF5EfcZT0cIf");
               case 17 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("2axJhFgSdANQ1jH8ZLzBrTtcUStjnx6cRyknqIjQUoibxyWt");
               case 18 -> Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("r9PkaRFbiBBl/jToPC6i13x53yxqNQ46DIfZGB7WEcnwPP2pUoz4vS9P");
               default -> throw new MatchException(null, null);
            };
            String var5;
            if (var3 == EditorPropertyField.DESIGN_HOVER_COLOR) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "vNGC7bFfUqmwkeG3q8iGH1huIrBy+X4SpMLBS7XiolvoiacfWOOl94fjN4fgHAAyWOUPsPeUURRq36gJdesK6nhWIm4A7j20k2rBCeJyEZXT8ex3sA6MWYe7X4c="
               );
            } else if (var3 == EditorPropertyField.DESIGN_BORDER_COLOR) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "tyhYmu50uTaSVEek+pRXH47uSXVCBRCOGCYjDbsKFR8+e6ZHNXX1TwVYZnv5JdiDRk6rZmHMZOCYeYHUB87mdLStoJRA7UxK8hYnXGs1Y6w="
               );
            } else if (this.isSidebarHexField(var3)) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Z5qSg3q5KTeWWE1iuMAchcWg4UUlIC+e/8MHmTIwnChknWpszl1s06vIcpFdb2hhNVLwPDc8IGibHU0wm2gw+A==");
            } else if (var3 == EditorPropertyField.NAME) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("II1UFGEYoNtGMrGJQyP5e2HAv1FNCP9g7lhs7qkzUI5YZmnq3U8Uk9qCaXy2S+k7L9j+8pzM8ew9yN9r4JIfKA==");
            } else if (var3 == EditorPropertyField.ID) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "GIwLzqwPSxMOQqy1LroZM+sNlfLu7FBmF1x6+V/fkBI6GjOJoAENM/z8RKYMzHYhd1FwOWSR/beRo5g22JzDAD+8aajZvGr3v7pOKkKK"
               );
            } else if (var3 == EditorPropertyField.OPACITY) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Gl+3Pv5TbXv04KQZounxqidom/QRwg02jWnOa0OuxNwiV9GDX+rs2O5KiUcI2Elf/NA9jNeKl6bN5A==");
            } else if (var3 == EditorPropertyField.ITEM_DESIGN_ITEM) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "EBhSkszGXe2+DVBbkFK+lgpjiPJSsYSUrBpfzO4nE+LiUPINmgUxg/sakL4XxVDrowiSp6QuGuLAO8iNUh/bSHztA4uTva1yNfs55A+2b4LQxP7r5TFuC4Emy3LqNtrTkeezBCNf3hIxNgdTSL+eTfolN/TBlNhUXanQ+YJr5IDc/L4txwv/t3ceHx6pDCWrC9eXoz6VW9++tcWnaktvR9MNpzaIt7aF86/ApQbamaKsckgE8TCaexedtfh0Ex0rr89rFT//V+RSo5RUp/HI/DfLJDEXBiju2vBcImIIhSM+iDw6"
               );
            } else if (var3 == EditorPropertyField.ITEM_DESIGN_GLOWING) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("B7k2Eky8geNNfO5GceHOiWV6qdSA7W53JS9Mlc21VcBYFoavu6AK1OGKjaiCEkPxExyB9Fg1JO2zPE0N");
            } else if (var3 == EditorPropertyField.ANCHOR) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("3mVhDi9N783GJlcXtSZnqoNOrhwATFaYjwhHfeBIBcAMmxeI/6E51okw7xj9YQaM8M71TYKPD6zYVq8lmcU=");
            } else if (var3 == EditorPropertyField.DESIGN_TEXT_WRAP) {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "vXWN0p+yITJ/Q5H/+q53bV1Tm4GCRyMRV00TZpLNmE/s3C3IaQEfvdQb6dfI22CbZUUKOV4qSDPYrxw94FTxpelbLd8NldbBG6KQt82NeuLz1Q=="
               );
            } else {
               var5 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "nUim9GCr6ZC1sq70SqrvXsF6CldMCyRDdCezRVQWHcw/NPlHE601IlOCzthxj2Q94Qp0P9l00SZC5/1ifJFdSsftczZabpWVIg8s3XT9cYerJhxsxSo5kZzi"
               );
            }

            if (var3 == EditorPropertyField.ITEM_DESIGN_ITEM || !this.openEditorTextPrompt(var1, var2, var4, this.readSidebarFieldRawValue(var2, var3))) {
               String var10002 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "fD1CxREMgGc3h1WYMgQkgqdnBnQAs+qUgjR3lFFP4iqkN8mydr0+4av7vhzjWB1ia+gCKRvcxvYAeqWzuScBc8zDynJ3ktNlhNW/g8nKERGiYG0p7BI38fM69OJ0pnCqlm62rLyOLun3xrwkQ4ZcxejiJXjuRChsubrasSvpm6BRLg=="
               );
               Object[] var10003 = new Object[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-454225822, 13)];
               var10003[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1321928238, 17)] = var4;
               var10003[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-855232946, 25)] = var5;
               var10003[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1612430660, 29)] = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "P4zV44+K/DSwmqVEaFjjD05zgYWdnqgDV5IuZGOQO2+VLqGZMXxGpw=="
               );
               this.sendEditorInfo(var1, var10002, var10003);
            }
         }
      }
   }

   public boolean isSidebarHexField(EditorPropertyField var1) {
      if ((-559638791 * -559638791 - -559638791 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != EditorPropertyField.DESIGN_COLOR && var1 != EditorPropertyField.DESIGN_BORDER_COLOR
            ? Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 0)
            : Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-568065043, 12)) != 0;
      }
   }

   public String parseSidebarHexColorInput(String var1) {
      if ((-1755019321 * -1755019321 - -1755019321 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !var1.isBlank()
            ? this.normalizeHexColor(var1.trim())
            : Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ruGd/WOxrRQhiOQsUiNZ61KSZmI6bFDRru6OQA==");
      }
   }

   public boolean isSidebarAutoBorderColorInput(String var1) {
      if (((2079695797 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && var1.trim().equalsIgnoreCase(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("xJlnZoio993uQVO6Zfs39gEuxptrre/4nopjwNmJdKn2or6y"))
            ? Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-568065043, 12)
            : Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(739817787, 27)) != 0;
      }
   }

   public Double parseSidebarInputValue(String var1, EditorPropertyField var2) {
      if (((-1217118560 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var2 != null) {
         String var3 = var1.trim()
            .toLowerCase(Locale.ROOT)
            .replace(
               Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("fkRZttRedS3mEpsHwoGX3s7bCQAOp6ZBZ1GZGzO2"),
               Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ruGd/WOxrRQhiOQsUiNZ61KSZmI6bFDRru6OQA==")
            );
         if (var3.isBlank()) {
            return null;
         } else if (var2 == EditorPropertyField.OPACITY) {
            String var7 = var3.endsWith(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Ge/chzk8biQ1/WlREtXRJDNmkIg1/QW86PAy6gn6"))
               ? var3.substring(Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 18), var3.length() - Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1765177820, 20))
               : var3;
            double var8 = this.parseDouble(var7, Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187313973675710999L, 46)));
            return !Double.isFinite(var8) ? null : (double)this.opacityPercentToRaw(var8);
         } else {
            String var4;
            if (var2 == EditorPropertyField.ROTATION) {
               var4 = var3.replace(
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("3kd5gxTCw4VTw1Tkm4rE8XtjUP4iSDzIUgnbSG1RgCJzLA=="),
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ruGd/WOxrRQhiOQsUiNZ61KSZmI6bFDRru6OQA==")
                  )
                  .replace(
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("EUM/h/60iOLzu6uqszc//yj3OJ7kxwyyoBmj3tuR"),
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ruGd/WOxrRQhiOQsUiNZ61KSZmI6bFDRru6OQA==")
                  );
            } else {
               var4 = var3.replace(
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("9U1EH8eb8RuYPo/Xq8uqP9vKXWdHUndsl07/eStc7uA="),
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ruGd/WOxrRQhiOQsUiNZ61KSZmI6bFDRru6OQA==")
               );
            }

            double var5 = this.parseDouble(var4, Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187208429149379095L, 47)));
            return !Double.isFinite(var5) ? null : var5;
         }
      } else {
         return null;
      }
   }

   @Override
   public void resetSidebarFieldDrag(Player var1, EditorSession var2) {
      if ((-1480943095 * -1480943095 + -1480943095 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         this.finishSidebarFieldDragHistory(var2);
         this.cameraService.unlockCursorVisual(var1);
         var2.sidebarFieldDragActive = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 30) != 0;
         var2.sidebarFieldDragField = null;
         var2.sidebarFieldDragStartCursorX = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 60));
         var2.sidebarFieldDragStartValue = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 48));
         var2.sidebarFieldDragLastValue = null;
         var2.sidebarOpacityRefreshTriggered = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 28) != 0;
      }
   }

   public boolean applyTimelineFieldDeltaToSelectedKeyframes(EditorSession var1, EditorPropertyField var2, double var3) {
      if (((-316143445 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null
         || var2 == null
         || !Double.isFinite(var3)
         || Math.abs(var3) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7918108978228205355L, 4))) {
         return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-647969335, 22) != 0;
      } else if (!this.isTimelineKeyframeSelected(var1)) {
         return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 12) != 0;
      } else {
         String[] var10001 = new String[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(263682192, 30)];
         var10001[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(739817787, 27)] = var1.animationTimelineSelectedTargetId;
         String var5 = this.firstNonBlank(var10001);
         var10001 = new String[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 9)];
         var10001[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 2)] = var1.animationTimelineSelectedRow;
         String var6 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         String var7 = this.resolveTimelineRowForSidebarField(var2);
         if (!var5.isBlank() && !var6.isBlank() && !var7.isBlank() && this.equalsNullable(var6, var7)) {
            Map var8 = this.resolveRawTargetByTargetId(var1, var5);
            Map var9 = this.readAnimationTimelineRowMap(var8, var6);
            if (var9 != null && !var9.isEmpty()) {
               List<Integer> var10 = this.resolveTimelineSelectedTicks(var1, var5, var6);
               if (var10.size() <= Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-321887516, 21)) {
                  return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 11) != 0;
               } else {
                  int var11 = this.clampAnimationTimelineTick(var1.animationTimelineSelectedTick);
                  int var12 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-454250398, 13);

                  for (int var14 : var10) {
                     int var15 = this.clampAnimationTimelineTick(var14);
                     if (var15 != var11) {
                        Object var16 = this.readAnimationTimelineTickValue(var9, var15);
                        if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var6)
                           && var2 == EditorPropertyField.ROTATION
                           && var16 instanceof Number var23) {
                           double var24 = var23.doubleValue();
                           double var25 = this.snap1(this.normalizeSidebarRotation(var24 + var3));
                           if (!(Math.abs(var24 - var25) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(6546998975812421484L, 1)))) {
                              this.removeAnimationTimelineTickValue(var9, var15);
                              var9.put(Integer.toString(var15), var25);
                              var12 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1763867100, 18);
                           }
                        } else if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC").equals(var6)
                           && var2 == EditorPropertyField.OPACITY
                           && var16 instanceof Number var22) {
                           double var18 = var22.doubleValue();
                           int var20 = this.clampAnimationTimelineOpacityRaw(var18 + var3);
                           if (!(Math.abs(var18 - var20) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(3864214797205428465L, 35)))) {
                              this.removeAnimationTimelineTickValue(var9, var15);
                              var9.put(Integer.toString(var15), var20);
                              var12 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(604237278, 20);
                           }
                        } else if (var16 instanceof Map var17) {
                           var12 |= this.applyTimelineFieldDeltaToValueMap(var6, var17, var2, var3) ? 1 : 0;
                        }
                     }
                  }

                  if (var12 == 0) {
                     return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1623575001, 30) != 0;
                  } else {
                     var1.timelineRenderedSignature = null;
                     this.recordMutationForInteraction(var1);
                     return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(388458115, 8) != 0;
                  }
               }
            } else {
               return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1337424016, 30) != 0;
            }
         } else {
            return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(334356004, 28) != 0;
         }
      }
   }

   public boolean applyTimelineFieldDeltaToValueMap(String var1, Map<String, Object> var2, EditorPropertyField var3, double var4) {
      if (((-189309171 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var2 != null && !var2.isEmpty() && var3 != null && Double.isFinite(var4)) {
         if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var1)
            && var3 == EditorPropertyField.ROTATION) {
            int var18 = !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="))
                  && !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA="))
                  && (
                     var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q=="))
                        || var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("bc9XtX7VTExYCR76NuIjlwhdpWOh0oNm8w6D5o9oMgXnHUvcsEtbkVo7YEfKjsncvaY="))
                        || var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("AcO9uDGdQxZG/1B+WzZlqROH3BlszXtY5bmig9YASRf9eT295LrgHgMg7nstK7lFogs="))
                  )
               ? Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-499040547, 16)
               : Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129236, 3);
            if (var18 == 0) {
               String var23 = var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q=="))
                  ? Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q==")
                  : (
                     var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("bc9XtX7VTExYCR76NuIjlwhdpWOh0oNm8w6D5o9oMgXnHUvcsEtbkVo7YEfKjsncvaY="))
                        ? Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("bc9XtX7VTExYCR76NuIjlwhdpWOh0oNm8w6D5o9oMgXnHUvcsEtbkVo7YEfKjsncvaY=")
                        : Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("AcO9uDGdQxZG/1B+WzZlqROH3BlszXtY5bmig9YASRf9eT295LrgHgMg7nstK7lFogs=")
                  );
               double var28 = this.parseDouble(var2.get(var23), Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(3391014137319102411L, 56)));
               double var32 = this.snap1(var28 + var4);
               if (Math.abs(var28 - var32) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-5352746122084708648L, 2))) {
                  return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1144749443, 9) != 0;
               } else {
                  var2.put(var23, var32);
                  return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129228, 4) != 0;
               }
            } else {
               double var22 = this.readMapPathDouble(
                  var2,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="),
                  this.readMapPathDouble(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA="),
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(7083879717845195795L, 61))
                  )
               );
               double var31 = this.snap1(this.normalizeSidebarRotation(var22 + var4));
               if (!(Math.abs(var22 - var31) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(7100296288947070776L, 31)))
                  || !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="))
                     && !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA="))) {
                  var2.remove(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA="));
                  var2.put(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="), var31);
                  return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764127196, 11) != 0;
               } else {
                  return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1094639074, 24) != 0;
               }
            }
         } else if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC").equals(var1)
            && var3 == EditorPropertyField.OPACITY) {
            int var17 = !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="))
                  && !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC"))
                  && (
                     var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q=="))
                        || var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("qKZa6l84E56TVMjiLp9JqOPNM3rwlLrgsMGQfUPcojykG2BYr9sBzYmvp3zmqhEK"))
                        || var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("VFTW+WKS4+Jwbjxq89knGdQm+bl+m/gkwZdgfsRdZc6bav7oFqixT5Z/y/3Lt6mt"))
                  )
               ? Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 7)
               : Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 21);
            if (var17 == 0) {
               String var21 = var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q=="))
                  ? Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q==")
                  : (
                     var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("qKZa6l84E56TVMjiLp9JqOPNM3rwlLrgsMGQfUPcojykG2BYr9sBzYmvp3zmqhEK"))
                        ? Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("qKZa6l84E56TVMjiLp9JqOPNM3rwlLrgsMGQfUPcojykG2BYr9sBzYmvp3zmqhEK")
                        : Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("VFTW+WKS4+Jwbjxq89knGdQm+bl+m/gkwZdgfsRdZc6bav7oFqixT5Z/y/3Lt6mt")
                  );
               double var27 = this.parseDouble(var2.get(var21), Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 60)));
               double var10 = this.snap1(var27 + var4);
               if (Math.abs(var27 - var10) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-2629001826037704882L, 10))) {
                  return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 25) != 0;
               } else {
                  var2.put(var21, var10);
                  return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129228, 4) != 0;
               }
            } else {
               double var20 = this.readMapPathDouble(
                  var2,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="),
                  this.readMapPathDouble(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC"),
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187272233052822039L, 43))
                  )
               );
               int var30 = this.clampAnimationTimelineOpacityRaw(var20 + var4);
               if (!(Math.abs(var20 - var30) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-1324126566749361309L, 39)))
                  || !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="))
                     && !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC"))) {
                  var2.remove(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC"));
                  var2.put(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="), var30);
                  return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129248, 2) != 0;
               } else {
                  return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(167178002, 27) != 0;
               }
            }
         } else {
            if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("b6+tCxdOpsF9k6BYe6gFp0blaN5X7HXpxACymNq4NTajGk4eS5+PTpq6PDM=").equals(var1)) {
               if (var3 == EditorPropertyField.POSITION_X) {
                  if (var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G0G4hNw4xfnoLHFrCtCfcHlE3SamX2qXUME070RY"))
                     || !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("rvyStgSHff01AjukP07nDNbWPvz7nHgpRN33wDGJY4R6276w"))
                        && !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("mojjCAmg0iNng9EH+WKxwjDtOb2JPfxUQ8r6NdjcudUZSmWV"))) {
                     double var16 = this.parseDouble(
                        var2.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G0G4hNw4xfnoLHFrCtCfcHlE3SamX2qXUME070RY")),
                        Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 0))
                     );
                     double var26 = this.snap1(var16 + var4);
                     if (Math.abs(var16 - var26) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8330587581690252123L, 14))
                        && var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G0G4hNw4xfnoLHFrCtCfcHlE3SamX2qXUME070RY"))) {
                        return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 22) != 0;
                     }

                     var2.put(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G0G4hNw4xfnoLHFrCtCfcHlE3SamX2qXUME070RY"), var26);
                     return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129180, 6) != 0;
                  }

                  String var15 = var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("rvyStgSHff01AjukP07nDNbWPvz7nHgpRN33wDGJY4R6276w"))
                     ? Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("rvyStgSHff01AjukP07nDNbWPvz7nHgpRN33wDGJY4R6276w")
                     : Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("mojjCAmg0iNng9EH+WKxwjDtOb2JPfxUQ8r6NdjcudUZSmWV");
                  double var19 = this.parseDouble(var2.get(var15), Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 38)));
                  double var29 = this.snap1(var19 + var4);
                  if (Math.abs(var19 - var29) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(1412413702840058775L, 62))) {
                     return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 23) != 0;
                  }

                  var2.put(var15, var29);
                  return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(383354404, 31) != 0;
               }

               if (var3 == EditorPropertyField.POSITION_Y) {
                  if (var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("xrAU/WNJJYf1o6HWYOznUcBQzJFxsWmlh4vzVhhn"))
                     || !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("VFD3pjNg7HiAjG6vNKG9x5bT9gB46DriJGJuAd4ubckfXKLW"))
                        && !var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("HwGFMijmQmkFO/1CyIND4rTk6YeveFLxB8MNdjj5zFuVzs00"))) {
                     double var14 = this.parseDouble(
                        var2.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("xrAU/WNJJYf1o6HWYOznUcBQzJFxsWmlh4vzVhhn")),
                        Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-4524388162685608931L, 49))
                     );
                     double var25 = this.snap1(var14 + var4);
                     if (Math.abs(var14 - var25) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-8340009507816234849L, 0))
                        && var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("xrAU/WNJJYf1o6HWYOznUcBQzJFxsWmlh4vzVhhn"))) {
                        return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-908500795, 14) != 0;
                     }

                     var2.put(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("xrAU/WNJJYf1o6HWYOznUcBQzJFxsWmlh4vzVhhn"), var25);
                     return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-2095634586, 0) != 0;
                  }

                  String var13 = var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("VFD3pjNg7HiAjG6vNKG9x5bT9gB46DriJGJuAd4ubckfXKLW"))
                     ? Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("VFD3pjNg7HiAjG6vNKG9x5bT9gB46DriJGJuAd4ubckfXKLW")
                     : Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("HwGFMijmQmkFO/1CyIND4rTk6YeveFLxB8MNdjj5zFuVzs00");
                  double var7 = this.parseDouble(var2.get(var13), Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-4524388162685608931L, 49)));
                  double var9 = this.snap1(var7 + var4);
                  if (Math.abs(var7 - var9) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(1598908085716992359L, 31))) {
                     return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 12) != 0;
                  }

                  var2.put(var13, var9);
                  return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(388458115, 8) != 0;
               }
            }

            if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("t9em/KUMaGnCJZy6hs7BJvobbkSqTiJ+Q2SwmcUPb6eEAIOVuIU=").equals(var1)) {
               if (var3 == EditorPropertyField.WIDTH) {
                  double var12 = this.parseDouble(
                     var2.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YSRxmhjVBucuC3Lsig9bI9fwwZRvNRsSS+Enf+u736FNb1TVq70=")),
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523555640948563022L, 31))
                  );
                  double var24 = Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-1902903167518138933L, 47)), this.snap1(var12 + var4));
                  if (Math.abs(var12 - var24) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(7122122745635220027L, 60))
                     && var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YSRxmhjVBucuC3Lsig9bI9fwwZRvNRsSS+Enf+u736FNb1TVq70="))) {
                     return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1620119264, 31) != 0;
                  }

                  var2.put(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YSRxmhjVBucuC3Lsig9bI9fwwZRvNRsSS+Enf+u736FNb1TVq70="), var24);
                  return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-454242206, 13) != 0;
               }

               if (var3 == EditorPropertyField.HEIGHT) {
                  double var6 = this.parseDouble(
                     var2.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("vjsbO9QYJ2C67+uA8jQYvyQPs7zhoIW6E7+FNzRSd5kTf79pZIjB+g==")),
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523555640948563022L, 17))
                  );
                  double var8 = Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8103951382714762385L, 35)), this.snap1(var6 + var4));
                  if (Math.abs(var6 - var8) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(3908083686204546255L, 17))
                     && var2.containsKey(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("vjsbO9QYJ2C67+uA8jQYvyQPs7zhoIW6E7+FNzRSd5kTf79pZIjB+g=="))) {
                     return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 5) != 0;
                  }

                  var2.put(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("vjsbO9QYJ2C67+uA8jQYvyQPs7zhoIW6E7+FNzRSd5kTf79pZIjB+g=="), var8);
                  return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 4) != 0;
               }
            }

            return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 29) != 0;
         }
      } else {
         return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1553831436, 10) != 0;
      }
   }

   public double[] resolveTimelinePreviewState(EditorSession var1, String var2, double var3) {
      if ((-439340719 * (-439340719 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         EditorRect var5 = this.resolveTimelineStableBaseBounds(var1, var2);
         if (var5 == null) {
            return null;
         } else {
            TreeMap var6 = this.readTimelinePositionPoints(var1, var2);
            TreeMap var7 = this.readAnimationTimelineScalePoints(var1, var2);
            TreeMap var8 = this.readTimelineRotationPoints(var1, var2);
            TreeMap var9 = this.readTimelineOpacityPoints(var1, var2);
            Map var10 = this.readTimelineInterpModes(
               var1, var2, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("b6+tCxdOpsF9k6BYe6gFp0blaN5X7HXpxACymNq4NTajGk4eS5+PTpq6PDM=")
            );
            Map var11 = this.readTimelineInterpModes(var1, var2, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("t9em/KUMaGnCJZy6hs7BJvobbkSqTiJ+Q2SwmcUPb6eEAIOVuIU="));
            Map var12 = this.readTimelineInterpModes(
               var1, var2, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=")
            );
            Map var13 = this.readTimelineInterpModes(
               var1, var2, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC")
            );
            if (var6.isEmpty() && var7.isEmpty() && var8.isEmpty() && var9.isEmpty()) {
               return null;
            } else {
               int var14 = var6.isEmpty() && var7.isEmpty()
                  ? Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 12)
                  : Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 13);
               boolean var15 = this.isAnimationTimelineImageGroupRoot(var1, var2);
               double var16 = var15
                  ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(8158726388675432505L, 58))
                  : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(8536343941583108808L, 25));
               double var18 = var5.x;
               double var20 = var5.y;
               double var22 = this.resolveTimelineStableBaseRotation(var1, var2);
               double var24 = Math.max(var16, var5.width);
               double var26 = Math.max(var16, var5.height);
               double var28 = var22;
               double var30 = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-1680819682535709199L, 5));
               int var32 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-908500795, 14);
               HoverElement var33 = this.findFirstByTargetId(var1, var2);
               if (var33 != null) {
                  String[] var10001 = new String[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(776916230, 9)];
                  var10001[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 21)] = var33.type;
                  String var34 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  var32 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Kua/72A7nfResm2WFYM0PfnKQVuB8ckmERi/+8JoE5KU9DDt").equals(var34) ? 1 : 0;
               }

               if (var32 == 0) {
                  Map var49 = this.resolveRawTargetByTargetId(var1, var2);
                  String[] var57 = new String[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(604237278, 20)];
                  var57[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 21)] = this.stringValue(
                     this.readMapPathValue(var49, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("qVYjw5YuDGuBy1NG9JDe32fdDA/q5L3ZI7UepsjNRE6jySn8"))
                  );
                  String var35 = this.firstNonBlank(var57).toLowerCase(Locale.ROOT);
                  var32 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Kua/72A7nfResm2WFYM0PfnKQVuB8ckmERi/+8JoE5KU9DDt").equals(var35) ? 1 : 0;
               }

               if (var14 == 0) {
                  EditorRect var50 = this.resolveTimelineCurrentBoundsForPreview(var1, var2);
                  if (var50 != null) {
                     var18 = var50.x;
                     var20 = var50.y;
                     var24 = Math.max(var16, var50.width);
                     var26 = Math.max(var16, var50.height);
                  }
               }

               if (!var6.isEmpty()) {
                  double[] var51 = this.interpolateTimelineVector2(var6, var3, var5.x, var5.y, var10);
                  var18 = var51[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 31)];
                  var20 = var51[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(776916230, 9)];
               }

               double var52 = var18;
               double var36 = var20;
               if (!var7.isEmpty()) {
                  double var38 = Math.max(
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8330587581690252123L, 14)),
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-4984210833532711796L, 39))
                  );
                  TreeMap var40 = new TreeMap();
                  TreeMap var41 = new TreeMap();

                  for (Map.Entry var43 : ((Map<?, ?>)var7).entrySet()) {
                     if (var43 != null
                        && var43.getValue() != null
                        && ((double[])var43.getValue()).length >= Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-754569650, 25)) {
                        double var44 = Math.max(var16, Math.abs(((double[])var43.getValue())[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559749, 0)]));
                        double var46 = Math.max(var16, Math.abs(((double[])var43.getValue())[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(1457096228, 30)]));
                        if (var32 != 0) {
                           var46 = Math.max(var16, var46 * var38);
                        }

                        var40.put((Integer)var43.getKey(), var44);
                        var41.put((Integer)var43.getKey(), var46);
                     }
                  }

                  var24 = Math.max(var16, this.interpolateTimelineChannel(var40, var3, var5.width, var11));
                  var26 = Math.max(var16, this.interpolateTimelineChannel(var41, var3, var5.height, var11));
                  TreeMap var55 = this.extractTimelineScalePositionPoints(var7);
                  if (!var55.isEmpty()) {
                     double[] var56 = this.interpolateTimelineVector2(
                        var55,
                        var3,
                        Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(8588248345403377782L, 33)),
                        Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 59)),
                        var11
                     );
                     var52 = var18 + var56[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 10)];
                     var36 = var20 + var56[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 9)];
                  }
               }

               if (!var8.isEmpty()) {
                  var28 = this.normalizeSidebarRotation(this.interpolateTimelineChannel(var8, var3, var22, var12));
               }

               if (!var9.isEmpty()) {
                  double var53 = this.resolveTimelineStableBaseOpacity(var1, var2);
                  var30 = this.interpolateTimelineChannel(var9, var3, var53, var13);
                  var30 = this.clampAnimationTimelineOpacityRaw(var30);
               }

               double[] var10000 = new double[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1763080668, 19)];
               var10000[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 24)] = var52;
               var10000[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-2139243580, 25)] = var36;
               var10000[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075576132, 14)] = var24;
               var10000[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559492, 7)] = var26;
               var10000[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764162012, 13)] = var28;
               var10000[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1216835313, 6)] = var30;
               double[] var54 = var10000;
               if (this.shouldLogTimelineImageDebug(var1, var2) && this.isAnimationTimelineDebugTick(var1, var3)) {
                  EditorRect var39 = this.resolveTimelineCurrentBoundsForPreview(var1, var2);
                  this.logAnimationTimelineImageDebug(
                     var1,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("+TcmfgXmLzKi1AxFz3sKdUplBfsySs0f43fzaNaYrbn3xtg+wzA0A5MYHMVs1fk+l+XVUn6VBcj1/XNtpIZFCjvG+o0="),
                     var2,
                     var3,
                     null,
                     var5,
                     var39,
                     var54,
                     var6.size(),
                     var7.size()
                  );
               }

               return var54;
            }
         }
      } else {
         return null;
      }
   }

   @Override
   public EditorRect resolveTimelineStableBaseBounds(EditorSession var1, String var2) {
      if (((-984737428 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var2.isBlank()) {
         return null;
      } else if (this.equalsNullable(var1.animationPreviewTargetId, var2) && var1.animationPreviewBaseBounds != null) {
         EditorRect var4 = var1.animationPreviewBaseBounds;
         return new EditorRect(var4.x, var4.y, var4.width, var4.height);
      } else {
         EditorRect var3 = (EditorRect)var1.previewExtraBaseBoundsByTarget.get(var2);
         return var3 != null ? new EditorRect(var3.x, var3.y, var3.width, var3.height) : this.resolveTimelineImplicitBaseBounds(var1, var2);
      }
   }

   @Override
   public double resolveTimelineStableBaseRotation(EditorSession var1, String var2) {
      if ((-278736445 * -278736445 - -278736445 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var2.isBlank()) {
         return Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 40));
      } else if (this.equalsNullable(var1.animationPreviewTargetId, var2) && var1.animationPreviewBaseRotation != null) {
         return this.normalizeSidebarRotation(var1.animationPreviewBaseRotation);
      } else {
         Double var3 = (Double)var1.previewExtraBaseRotationByTarget.get(var2);
         return var3 != null ? this.normalizeSidebarRotation(var3) : this.normalizeSidebarRotation(this.readTargetRotation(var1, var2));
      }
   }

   @Override
   public double resolveTimelineStableBaseOpacity(EditorSession var1, String var2) {
      if ((-1534801837 * -1534801837 + -1534801837 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Double var3 = this.resolveTimelineExplicitTickZeroOpacity(var1, var2);
         return var3 != null
            ? this.clampAnimationTimelineOpacityRaw(var3)
            : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7197209501016283671L, 55));
      } else {
         return Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-6265619473520693171L, 63));
      }
   }

   @Override
   public Double resolveTimelineExplicitTickZeroOpacity(EditorSession var1, String var2) {
      if ((-1255238466 * -1255238466 + -1255238466 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Map var3 = this.resolveRawTargetByTargetId(var1, var2);
         Map var4 = this.readAnimationTimelineRowMap(var3, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC"));
         Object var5 = this.readAnimationTimelineTickValue(var4, Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 23));
         if (var5 == null) {
            return null;
         } else if (var5 instanceof Number var12) {
            return (double)this.clampAnimationTimelineOpacityRaw(var12.doubleValue());
         } else if (var5 instanceof Map var6) {
            if (var6.isEmpty()) {
               return null;
            } else {
               double var8 = this.readMapPathDouble(
                  var6,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="),
                  this.readMapPathDouble(
                     var6,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC"),
                     Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523492762627349582L, 49))
                  )
               );
               if (Double.isFinite(var8)) {
                  return (double)this.clampAnimationTimelineOpacityRaw(var8);
               } else {
                  double var10 = this.parseDouble(
                     var6.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("ncHtCfziqkDGKTmmn/rNArZeBmHwE3OV6C3rXALPN4s66Q==")),
                     this.parseDouble(
                        var6.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("qKZa6l84E56TVMjiLp9JqOPNM3rwlLrgsMGQfUPcojykG2BYr9sBzYmvp3zmqhEK")),
                        this.parseDouble(
                           var6.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("VFTW+WKS4+Jwbjxq89knGdQm+bl+m/gkwZdgfsRdZc6bav7oFqixT5Z/y/3Lt6mt")),
                           Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7186152605928938007L, 51))
                        )
                     )
                  );
                  return Double.isFinite(var10)
                     ? (double)this.clampAnimationTimelineOpacityRaw(
                        Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-6682326547415178318L, 62)) + var10
                     )
                     : null;
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public double readRenderedTargetRotation(EditorSession var1, String var2) {
      if ((2050324302 ^ 2050324302) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findFirstByTargetId(var1, var2);
         return var3 != null && Double.isFinite(var3.rotationDeg)
            ? this.normalizeSidebarRotation(var3.rotationDeg)
            : this.normalizeSidebarRotation(this.readTargetRotation(var1, var2));
      }
   }

   public int readRenderedTargetOpacity(EditorSession var1, String var2) {
      if ((2687321 ^ 2687321) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findFirstByTargetId(var1, var2);
         return var3 != null ? this.clampAnimationTimelineOpacityRaw(var3.opacity) : this.clampAnimationTimelineOpacityRaw(this.readTargetOpacity(var1, var2));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean applySidebarPropertyValue(Player var1, EditorSession var2, EditorPropertyField var3, double var4) {
      if ((-292910248 * -292910248 + -292910248 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && Double.isFinite(var4)) {
         List<String> var6 = this.getSidebarEditableTargetIds(var2);
         if (var6.isEmpty()) {
            return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 6) != 0;
         } else {
            String var7 = (String)var6.get(Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-888787378, 25));
            int var8 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 29);
            int var9 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-998081093, 17);
            switch (Xqedii_2eupooz.Xqedii_1zz5w99[var3.ordinal()]) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 15:
               case 17:
               case 18:
                  return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1553831436, 10) != 0;
               case 6:
                  double var29 = Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 30)), Math.abs(var4));
                  EditorRect var41 = this.resolveSidebarEditableBounds(var2, var7);
                  if (var41 != null) {
                     double var48 = var29 - var41.width;

                     for (String var62 : var6) {
                        EditorRect var65 = this.resolveSidebarEditableBounds(var2, var62);
                        if (var65 != null) {
                           EditorRect var68 = new EditorRect(
                              var65.x,
                              var65.y,
                              Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(8821181514730330488L, 3)), var65.width + var48),
                              var65.height
                           );
                           if (!this.sameRect(var65, var68)) {
                              if (var9 == 0) {
                                 this.recordMutationForInteraction(var2);
                                 var9 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-2139243580, 25);
                              }

                              this.applyBoundsToTarget(var2, var62, var68);
                              var8 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 27);
                           }
                        }
                     }
                  }
                  break;
               case 7:
                  double var28 = Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 43)), Math.abs(var4));
                  EditorRect var40 = this.resolveSidebarEditableBounds(var2, var7);
                  if (var40 != null) {
                     double var47 = var28 - var40.height;

                     for (String var61 : var6) {
                        EditorRect var64 = this.resolveSidebarEditableBounds(var2, var61);
                        if (var64 != null) {
                           EditorRect var67 = new EditorRect(
                              var64.x,
                              var64.y,
                              var64.width,
                              Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(8536343941574728392L, 25)), var64.height + var47)
                           );
                           if (!this.sameRect(var64, var67)) {
                              if (var9 == 0) {
                                 this.recordMutationForInteraction(var2);
                                 var9 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-304208893, 4);
                              }

                              this.applyBoundsToTarget(var2, var61, var67);
                              var8 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1077861858, 24);
                           }
                        }
                     }
                  }
                  break;
               case 8:
                  EditorRect var27 = this.resolveSidebarEditableBounds(var2, var7);
                  if (var27 != null) {
                     double var34 = var4 - var27.x;

                     for (String var52 : var6) {
                        EditorRect var54 = this.resolveSidebarEditableBounds(var2, var52);
                        if (var54 != null) {
                           EditorRect var60 = new EditorRect(var54.x + var34, var54.y, var54.width, var54.height);
                           if (!this.sameRect(var54, var60)) {
                              if (var9 == 0) {
                                 this.recordMutationForInteraction(var2);
                                 var9 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764121052, 13);
                              }

                              this.applyBoundsToTarget(var2, var52, var60);
                              var8 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(661029655, 16);
                           }
                        }
                     }
                  }
                  break;
               case 9:
                  EditorRect var26 = this.resolveSidebarEditableBounds(var2, var7);
                  if (var26 != null) {
                     double var33 = var4 - var26.y;

                     for (String var51 : var6) {
                        EditorRect var53 = this.resolveSidebarEditableBounds(var2, var51);
                        if (var53 != null) {
                           EditorRect var59 = new EditorRect(var53.x, var53.y + var33, var53.width, var53.height);
                           if (!this.sameRect(var53, var59)) {
                              if (var9 == 0) {
                                 this.recordMutationForInteraction(var2);
                                 var9 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1650848676, 18);
                              }

                              this.applyBoundsToTarget(var2, var51, var59);
                              var8 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764194780, 16);
                           }
                        }
                     }
                  }
                  break;
               case 10:
                  double var25 = this.normalizeSidebarRotation(var4);
                  double var39 = this.readTargetRotation(var2, var7);
                  double var50 = var25 - var39;

                  for (String var63 : var6) {
                     double var66 = this.equalsNullable(var63, var7) ? var25 : this.normalizeSidebarRotation(this.readTargetRotation(var2, var63) + var50);
                     int var69 = this.setTargetRotation(var2, var63, var66) ? 1 : 0;
                     if (var69 != 0 && var9 == 0) {
                        this.recordMutationForInteraction(var2);
                        var9 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 7);
                     }

                     var8 |= var69;
                  }
                  break;
               case 11:
                  double var24 = this.snap1(var4);
                  double var38 = this.readTargetLayer(var2, var7);
                  double var49 = var24 - var38;

                  for (String var17 : var6) {
                     double var18 = this.readTargetLayer(var2, var17);
                     int var20 = this.setTargetLayer(var2, var17, var18 + var49) ? 1 : 0;
                     if (var20 != 0 && var9 == 0) {
                        this.recordMutationForInteraction(var2);
                        var9 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129116, 7);
                     }

                     var8 |= var20;
                  }
                  break;
               case 12:
                  int var23 = this.isTimelineOpacitySidebarMode(var2) ? this.clampAnimationTimelineOpacityRaw(var4) : this.clampSidebarOpacityRaw(var4);

                  for (String var37 : var6) {
                     int var44 = this.setTargetOpacity(var2, var37, var23) ? 1 : 0;
                     if (var44 != 0 && var9 == 0) {
                        this.recordMutationForInteraction(var2);
                        var9 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1187302376, 11);
                     }

                     var8 |= var44;
                  }
                  break;
               case 13:
                  String var22 = this.rainbowHexFromHue(var4);

                  for (String var36 : var6) {
                     int var43 = this.setTargetColor(var2, var36, var22) ? 1 : 0;
                     if (var43 != 0 && var9 == 0) {
                        this.recordMutationForInteraction(var2);
                        var9 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 19);
                     }

                     var8 |= var43;
                  }
                  break;
               case 14:
                  String var21 = this.rainbowHexFromHue(var4);

                  for (String var35 : var6) {
                     int var42 = this.setTargetOutlineColor(var2, var35, var21) ? 1 : 0;
                     if (var42 != 0 && var9 == 0) {
                        this.recordMutationForInteraction(var2);
                        var9 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1986539890, 20);
                     }

                     var8 |= var42;
                  }
                  break;
               case 16:
                  int var10 = (int)Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523558737619983438L, 44)), (double)Math.round(var4));

                  for (String var12 : var6) {
                     Map var13 = this.resolveRawTargetByTargetId(var2, var12);
                     if (var13 != null) {
                        String var14 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("7wLysMq5LbWpzL3B87WCQjZr/1+4gOEHlttbEu08xhe387H4izt87JW2kmWRQw==");
                        if (this.hasMapPath(var13, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("etufD5cqErJ0JeTxSsx5icXpTiPLj0zflZL7g1Vv6Wni1Ks9u6XBI+W1GU4="))) {
                           var14 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("etufD5cqErJ0JeTxSsx5icXpTiPLj0zflZL7g1Vv6Wni1Ks9u6XBI+W1GU4=");
                        } else if (this.hasMapPath(
                           var13, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G5A0IKf+jtw+yRO4k/eb4jOZyus4Y46EkDWCkfM7N8ICj1Pl+yDnpLD9mIkF+g==")
                        )) {
                           var14 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G5A0IKf+jtw+yRO4k/eb4jOZyus4Y46EkDWCkfM7N8ICj1Pl+yDnpLD9mIkF+g==");
                        } else if (this.hasMapPath(
                           var13, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Z0YeRUIbmTaIDCbUpoWbX1uDi5tkaQOofxhfRkmDIHIY8mDPtPgkt2LvzqeHrd4AuL1YE+2RjvRJscKL")
                        )) {
                           var14 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Z0YeRUIbmTaIDCbUpoWbX1uDi5tkaQOofxhfRkmDIHIY8mDPtPgkt2LvzqeHrd4AuL1YE+2RjvRJscKL");
                        }

                        Object var15 = this.readMapPathValue(var13, var14);
                        int var16 = this.normalizeTextWrapLineWidth(var15);
                        if (var16 != var10) {
                           if (var9 == 0) {
                              this.recordMutationForInteraction(var2);
                              var9 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 19);
                           }

                           this.setMapPathValue(var13, var14, var10);
                           var8 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 12);
                        }
                     }
                  }
            }

            return var8 != 0;
         }
      } else {
         return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1479635574, 28) != 0;
      }
   }

   public boolean applySidebarHexPropertyValue(EditorSession var1, EditorPropertyField var2, String var3) {
      if ((1638185997 * 1638185997 + 1638185997 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && this.isSidebarHexField(var2)) {
         String var4 = this.normalizeHexColor(var3);
         if (var4.isBlank()) {
            return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1047817294, 31) != 0;
         } else {
            List<String> var5 = this.getSidebarEditableTargetIds(var1);
            if (var5.isEmpty()) {
               return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 11) != 0;
            } else {
               int var6 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-323984668, 21);
               int var7 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-152104439, 3);

               for (String var9 : var5) {
                  if (var2 == EditorPropertyField.DESIGN_COLOR) {
                     int var10 = this.setTargetColor(var1, var9, var4) ? 1 : 0;
                     if (var10 != 0 && var7 == 0) {
                        this.recordMutationForInteraction(var1);
                        var7 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-2095634586, 0);
                     }

                     var6 |= var10;
                  } else if (var2 == EditorPropertyField.DESIGN_BORDER_COLOR) {
                     int var11 = this.setTargetOutlineColor(var1, var9, var4) ? 1 : 0;
                     if (var11 != 0 && var7 == 0) {
                        this.recordMutationForInteraction(var1);
                        var7 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1227258332, 29);
                     }

                     var6 |= var11;
                  }
               }

               return var6 != 0;
            }
         }
      } else {
         return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1335696148, 29) != 0;
      }
   }

   public boolean applySidebarBorderColorAuto(EditorSession var1) {
      if (((464262049 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(388457859, 8) != 0;
      } else {
         List<String> var2 = this.getSidebarEditableTargetIds(var1);
         if (var2.isEmpty()) {
            return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 18) != 0;
         } else {
            int var3 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1047817294, 31);
            int var4 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1703089959, 24);

            for (String var6 : var2) {
               int var7 = this.setTargetOutlineColorAuto(var1, var6) ? 1 : 0;
               if (var7 != 0 && var4 == 0) {
                  this.recordMutationForInteraction(var1);
                  var4 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764653532, 19);
               }

               var3 |= var7;
            }

            return var3 != 0;
         }
      }
   }

   public void applyTimelinePreviewRotationDelta(Player var1, EditorSession var2, String var3, double var4, double var6) {
      if ((-1814400289 * -1814400289 + -1814400289 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && Double.isFinite(var4) && Double.isFinite(var6)) {
         double var8 = var6 - var4;
         if (!(Math.abs(var8) <= Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7246325954106735753L, 3)))) {
            List<HoverElement> var10 = this.findTargetElements(var2, var3);
            if (var10 != null && !var10.isEmpty()) {
               int var11 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 21);

               for (HoverElement var13 : var10) {
                  if (var13 != null) {
                     var13.rotationDeg = this.normalizeSidebarRotation(var13.rotationDeg + var8);
                     this.updateElementHud(var1, var13);
                     var11 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1797683676, 25);
                  }
               }

               if (var11 != 0 && this.isSelectedTarget(var2, var3) && var2.selectionOutlineVisible) {
                  this.renderSelectionOverlay(var1, var2);
               }
            }
         }
      }
   }

   public void applyTimelinePreviewRotation(Player var1, EditorSession var2, String var3, double var4) {
      if (((-918323104 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         if (!Double.isFinite(var4)) {
            this.clearTimelinePrimaryPreviewRotation(var1, var2, var3);
         } else {
            if (var2.animationPreviewBaseRotation == null || var2.animationPreviewAppliedRotation == null) {
               double var6 = this.readRenderedTargetRotation(var2, var3);
               var2.animationPreviewBaseRotation = var6;
               var2.animationPreviewAppliedRotation = var6;
            }

            double var10 = this.normalizeSidebarRotation(var4);
            double var8 = this.normalizeSidebarRotation(var2.animationPreviewAppliedRotation);
            if (!(Math.abs(var10 - var8) <= Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-4258582592717373211L, 60)))) {
               this.applyTimelinePreviewRotationDelta(var1, var2, var3, var8, var10);
               var2.animationPreviewAppliedRotation = var10;
            }
         }
      }
   }

   public void applyTimelineExtraPreviewRotation(Player var1, EditorSession var2, String var3, double var4) {
      if ((-917206552 ^ -917206552) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         if (!Double.isFinite(var4)) {
            this.clearTimelineExtraPreviewRotation(var1, var2, var3);
         } else {
            Double var6 = (Double)var2.previewExtraBaseRotationByTarget.get(var3);
            Double var7 = (Double)var2.previewExtraAppliedRotation.get(var3);
            if (var6 == null || var7 == null) {
               double var8 = this.readRenderedTargetRotation(var2, var3);
               var6 = var8;
               var7 = var8;
               var2.previewExtraBaseRotationByTarget.put(var3, var6);
               var2.previewExtraAppliedRotation.put(var3, var7);
            }

            double var13 = this.normalizeSidebarRotation(var4);
            double var10 = this.normalizeSidebarRotation(var7);
            if (!(Math.abs(var13 - var10) <= Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-1329868712858008408L, 54)))) {
               this.applyTimelinePreviewRotationDelta(var1, var2, var3, var10, var13);
               var2.previewExtraAppliedRotation.put(var3, var13);
            }
         }
      }
   }

   public void clearTimelinePrimaryPreviewRotation(Player var1, EditorSession var2, String var3) {
      if (((-1718060561 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         Double var4 = var2.animationPreviewBaseRotation;
         Double var5 = var2.animationPreviewAppliedRotation;
         if (var1 != null && var4 != null && var5 != null) {
            double var6 = this.normalizeSidebarRotation(var4);
            double var8 = this.normalizeSidebarRotation(var5);
            if (Math.abs(var6 - var8) > Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(4062960798502663911L, 23))) {
               this.applyTimelinePreviewRotationDelta(var1, var2, var3, var8, var6);
            }
         }

         var2.animationPreviewBaseRotation = null;
         var2.animationPreviewAppliedRotation = null;
      }
   }

   public void clearTimelineExtraPreviewRotation(Player var1, EditorSession var2, String var3) {
      if (((-2127994056 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         Double var4 = (Double)var2.previewExtraBaseRotationByTarget.get(var3);
         Double var5 = (Double)var2.previewExtraAppliedRotation.get(var3);
         if (var1 != null && var4 != null && var5 != null) {
            double var6 = this.normalizeSidebarRotation(var4);
            double var8 = this.normalizeSidebarRotation(var5);
            if (Math.abs(var6 - var8) > Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-1280171225913186962L, 29))) {
               this.applyTimelinePreviewRotationDelta(var1, var2, var3, var8, var6);
            }
         }

         var2.previewExtraBaseRotationByTarget.remove(var3);
         var2.previewExtraAppliedRotation.remove(var3);
      }
   }

   public void clearStaleTimelineExtraPreviewRotations(Player var1, EditorSession var2, Set<String> var3) {
      if (((1174525858 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         LinkedHashSet var4 = new LinkedHashSet(var2.previewExtraBaseRotationByTarget.keySet());
         var4.addAll(var2.previewExtraAppliedRotation.keySet());
         if (var3 != null && !var3.isEmpty()) {
            var4.removeAll(var3);
         }

         for (Object var6_obj : var4) { String var6 = (String) var6_obj;
            this.clearTimelineExtraPreviewRotation(var1, var2, var6);
         }
      }
   }

   public void applyTimelinePreviewOpacity(Player var1, EditorSession var2, String var3, double var4) {
      if (((-2084514546 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         if (!Double.isFinite(var4)) {
            this.clearTimelinePrimaryPreviewOpacity(var1, var2, var3);
         } else {
            if (var2.animationPreviewBaseOpacity == null || var2.animationPreviewAppliedOpacity == null) {
               int var6 = this.readRenderedTargetOpacity(var2, var3);
               var2.animationPreviewBaseOpacity = var6;
               var2.animationPreviewAppliedOpacity = var6;
            }

            int var8 = this.clampAnimationTimelineOpacityRaw(var4);
            int var7 = this.clampAnimationTimelineOpacityRaw(var2.animationPreviewAppliedOpacity.intValue());
            if (var8 != var7) {
               this.applyTargetOpacityToRenderedElements(var1, var2, var3, var8);
               var2.animationPreviewAppliedOpacity = var8;
            }
         }
      }
   }

   public void applyTimelineExtraPreviewOpacity(Player var1, EditorSession var2, String var3, double var4) {
      if ((1005327197 * (1005327197 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         if (!Double.isFinite(var4)) {
            this.clearTimelineExtraPreviewOpacity(var1, var2, var3);
         } else {
            Integer var6 = (Integer)var2.previewExtraBaseOpacityByTarget.get(var3);
            Integer var7 = (Integer)var2.previewExtraAppliedOpacity.get(var3);
            if (var6 == null || var7 == null) {
               int var8 = this.readRenderedTargetOpacity(var2, var3);
               var6 = var8;
               var7 = var8;
               var2.previewExtraBaseOpacityByTarget.put(var3, var6);
               var2.previewExtraAppliedOpacity.put(var3, var7);
            }

            int var11 = this.clampAnimationTimelineOpacityRaw(var4);
            int var9 = this.clampAnimationTimelineOpacityRaw(var7.intValue());
            if (var11 != var9) {
               this.applyTargetOpacityToRenderedElements(var1, var2, var3, var11);
               var2.previewExtraAppliedOpacity.put(var3, var11);
            }
         }
      }
   }

   public void clearTimelinePrimaryPreviewOpacity(Player var1, EditorSession var2, String var3) {
      if ((-1262309424 * -1262309424 - -1262309424 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         Integer var4 = var2.animationPreviewBaseOpacity;
         Integer var5 = var2.animationPreviewAppliedOpacity;
         if (var1 != null && var4 != null && var5 != null) {
            int var6 = this.clampAnimationTimelineOpacityRaw(var4.intValue());
            int var7 = this.clampAnimationTimelineOpacityRaw(var5.intValue());
            if (var6 != var7) {
               this.applyTargetOpacityToRenderedElements(var1, var2, var3, var6);
            }
         }

         var2.animationPreviewBaseOpacity = null;
         var2.animationPreviewAppliedOpacity = null;
      }
   }

   public void clearTimelineExtraPreviewOpacity(Player var1, EditorSession var2, String var3) {
      if ((815637504 * 815637504 + 815637504 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         Integer var4 = (Integer)var2.previewExtraBaseOpacityByTarget.get(var3);
         Integer var5 = (Integer)var2.previewExtraAppliedOpacity.get(var3);
         if (var1 != null && var4 != null && var5 != null) {
            int var6 = this.clampAnimationTimelineOpacityRaw(var4.intValue());
            int var7 = this.clampAnimationTimelineOpacityRaw(var5.intValue());
            if (var6 != var7) {
               this.applyTargetOpacityToRenderedElements(var1, var2, var3, var6);
            }
         }

         var2.previewExtraBaseOpacityByTarget.remove(var3);
         var2.previewExtraAppliedOpacity.remove(var3);
      }
   }

   public void clearStaleTimelineExtraPreviewOpacities(Player var1, EditorSession var2, Set<String> var3) {
      if ((-1568522832 * -1568522832 + -1568522832 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         LinkedHashSet var4 = new LinkedHashSet(var2.previewExtraBaseOpacityByTarget.keySet());
         var4.addAll(var2.previewExtraAppliedOpacity.keySet());
         if (var3 != null && !var3.isEmpty()) {
            var4.removeAll(var3);
         }

         for (Object var6_obj : var4) { String var6 = (String) var6_obj;
            this.clearTimelineExtraPreviewOpacity(var1, var2, var6);
         }
      }
   }

   public void startSidebarFieldDrag(Player var1, EditorSession var2, EditorPropertyField var3, double var4) {
      if (((614984052 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !this.isEditorTextPromptCoolingDown(var2)) {
         String var6 = this.getSidebarEditableTargetId(var2);
         if (var6 != null && !var6.isBlank()) {
            var2.sidebarFieldDragActive = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1747352028, 24) != 0;
            var2.sidebarFieldDragField = var3;
            var2.sidebarFieldDragStartCursorX = var4;
            var2.sidebarFieldDragStartValue = this.resolveSidebarFieldDragStartValue(var2, var6, var3);
            var2.sidebarFieldDragLastValue = null;
            var2.sidebarOpacityRefreshTriggered = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1210571708, 21) != 0;
            this.beginSidebarFieldDragHistory(var2);
            if (this.isDimensionSidebarField(var3)) {
               this.cameraService.lockCursorVisual(var1, var2.cursorX, var2.cursorY);
            } else {
               this.cameraService.unlockCursorVisual(var1);
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public double resolveSidebarFieldDragStartValue(EditorSession var1, String var2, EditorPropertyField var3) {
      if (((-1708286155 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var3 != null) {
         EditorRect var4 = this.resolveSidebarEditableBounds(var1, var2);

         return switch (Xqedii_2eupooz.Xqedii_1zz5w99[var3.ordinal()]) {
            case 1, 2, 3, 4, 5, 15, 17, 18 -> Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 14));
            case 6 -> var4 == null ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8576217719509389680L, 43)) : var4.width;
            case 7 -> var4 == null ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(1659418466026519625L, 31)) : var4.height;
            case 8 -> var4 == null ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713687575L, 52)) : var4.x;
            case 9 -> var4 == null ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-5177234538763089021L, 46)) : var4.y;
            case 10 -> this.readTargetRotation(var1, var2);
            case 11 -> this.readTargetLayer(var1, var2);
            case 12 -> this.isTimelineOpacitySidebarMode(var1)
               ? this.opacityRawToAnimationPercent(this.readTargetOpacity(var1, var2))
               : this.opacityRawToPercent(this.readTargetOpacity(var1, var2));
            case 13 -> this.hueFromHexColor(this.readTargetColor(var1, var2));
            case 14 -> this.hueFromHexColor(this.readTargetOutlineColor(var1, var2));
            case 16 -> {
               Map var5 = this.resolveRawTargetByTargetId(var1, var2);
               if (var5 == null) {
                  yield Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-8380275285129714199L, 61));
               } else {
                  Object var6 = this.readMapPathValue(
                     var5, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("7wLysMq5LbWpzL3B87WCQjZr/1+4gOEHlttbEu08xhe387H4izt87JW2kmWRQw==")
                  );
                  if (var6 == null) {
                     var6 = this.readMapPathValue(var5, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("etufD5cqErJ0JeTxSsx5icXpTiPLj0zflZL7g1Vv6Wni1Ks9u6XBI+W1GU4="));
                  }

                  if (var6 == null) {
                     var6 = this.readMapPathValue(var5, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("G5A0IKf+jtw+yRO4k/eb4jOZyus4Y46EkDWCkfM7N8ICj1Pl+yDnpLD9mIkF+g=="));
                  }

                  if (var6 == null) {
                     var6 = this.readMapPathValue(
                        var5, Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Z0YeRUIbmTaIDCbUpoWbX1uDi5tkaQOofxhfRkmDIHIY8mDPtPgkt2LvzqeHrd4AuL1YE+2RjvRJscKL")
                     );
                  }

                  yield this.normalizeTextWrapLineWidth(var6);
               }
            }
            default -> throw new MatchException(null, null);
         };
      } else {
         return Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523555640948563022L, 13));
      }
   }

   public void updateSidebarFieldDrag(Player var1, EditorSession var2, double var3) {
      if ((-384912393 ^ -384912393) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.sidebarFieldDragActive && var2.sidebarFieldDragField != null) {
         List var5 = this.getSidebarEditableTargetIds(var2);
         if (var5.isEmpty()) {
            this.resetSidebarFieldDrag(var1, var2);
         } else {
            double var6 = var3 - var2.sidebarFieldDragStartCursorX;
            if (!this.isSidebarColorField(var2.sidebarFieldDragField)
               || var2.sidebarFieldDragLastValue != null
               || !(Math.abs(var6) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8092310163375593223L, 47)))) {
               if (this.isSidebarColorField(var2.sidebarFieldDragField)
                  || var2.sidebarFieldDragLastValue != null
                  || !(Math.abs(var6) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-3754427968165634659L, 39)))) {
                  double var8 = this.sidebarFieldDragSensitivity(var2.sidebarFieldDragField);
                  double var10 = var2.sidebarFieldDragStartValue + var6 * var8;
                  var10 = this.normalizeSidebarFieldDragValue(var2.sidebarFieldDragField, var10);
                  if (var2.sidebarFieldDragField == EditorPropertyField.OPACITY) {
                     this.reanchorOpacityDragAtBounds(var2, var3, var10);
                  }

                  double var12 = var2.sidebarFieldDragLastValue == null ? var2.sidebarFieldDragStartValue : var2.sidebarFieldDragLastValue;
                  if (var2.sidebarFieldDragLastValue == null
                     || !(
                        Math.abs(var2.sidebarFieldDragLastValue - var10) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(258697055319853485L, 46))
                     )) {
                     var2.sidebarFieldDragLastValue = var10;
                     int var14 = var2.sidebarFieldDragField == EditorPropertyField.OPACITY && this.isTimelineOpacitySidebarMode(var2)
                        ? Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1996424329, 18)
                        : Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 7);
                     double var15 = var2.sidebarFieldDragField == EditorPropertyField.OPACITY
                        ? (var14 != 0 ? this.opacityPercentToAnimationRaw(var10) : this.opacityPercentToRaw(var10))
                        : var10;
                     boolean var17 = this.applySidebarPropertyValue(var1, var2, var2.sidebarFieldDragField, var15);
                     if (var2.sidebarFieldDragField == EditorPropertyField.OPACITY) {
                        double var25 = var14 != 0 ? this.opacityPercentToAnimationRaw(var12) : this.opacityPercentToRaw(var12);
                        int var26 = var14 != 0 ? this.clampAnimationTimelineOpacityRaw(var15) : this.clampSidebarOpacityRaw(var15);
                        if (var17) {
                           if (!var2.sidebarOpacityRefreshTriggered) {
                              var2.sidebarOpacityRefreshTriggered = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(2022707127, 14) != 0;
                              this.rerenderEditableSelection(var1, var2);
                           } else {
                              this.applySelectedOpacityToRenderedElements(var1, var2, var5, var26);
                           }
                        }

                        if (var2.activeTool == EditorTool.ANIMATION) {
                           this.trySelectTimelineKeyframeForField(var2, var2.sidebarFieldDragField);
                           if (this.isTimelineSelectedRowMatchingField(var2, var2.sidebarFieldDragField)) {
                              this.syncTimelineSelectedKeyframeValueFromTarget(var2);
                              this.applyTimelineFieldDeltaToSelectedKeyframes(var2, var2.sidebarFieldDragField, var15 - var25);
                              String[] var28 = new String[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(414792500, 3)];
                              var28[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 7)] = var2.animationTimelineTargetId;
                              this.renderAnimationTimelineKeyframes(var1, var2, this.firstNonBlank(var28));
                           }
                        }

                        this.updateEditorPropertiesSidebar(var1, var2);
                     } else if (!var17) {
                        this.updateEditorPropertiesSidebar(var1, var2);
                     } else if (this.isSidebarPositionField(var2.sidebarFieldDragField)) {
                        double var18 = var2.sidebarFieldDragField == EditorPropertyField.POSITION_X
                           ? var10 - var12
                           : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-7800299900646259496L, 3));
                        double var20 = var2.sidebarFieldDragField == EditorPropertyField.POSITION_Y
                           ? var10 - var12
                           : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-3805806335036277865L, 48));
                        if (Math.abs(var18) > Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-5617888003151283218L, 11))
                           || Math.abs(var20) > Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(2924276180895822726L, 35))) {
                           for (Object var23_obj : var5) { String var23 = (String) var23_obj;
                              this.translateTargetElements(var1, var2, var23, var18, var20);
                           }

                           this.translateAnimationPositionChildren(var1, var2, var5, var18, var20);
                           if (var2.selectedElementId != null && var2.selectionOutlineVisible) {
                              this.translateSelectionOutline(var1, var2, var18, var20);
                           }
                        }

                        if (var2.activeTool == EditorTool.ANIMATION) {
                           this.trySelectTimelineKeyframeForField(var2, var2.sidebarFieldDragField);
                           if (this.isTimelineSelectedRowMatchingField(var2, var2.sidebarFieldDragField)) {
                              this.syncTimelineSelectedKeyframeValueFromTarget(var2);
                              this.applyTimelineFieldDeltaToSelectedKeyframes(var2, var2.sidebarFieldDragField, var10 - var12);
                              String[] var27 = new String[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 15)];
                              var27[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(547319537, 23)] = var2.animationTimelineTargetId;
                              this.renderAnimationTimelineKeyframes(var1, var2, this.firstNonBlank(var27));
                           }

                           this.renderSelectionOverlay(var1, var2);
                        }

                        this.updateEditorPropertiesSidebar(var1, var2);
                     } else {
                        if (var2.activeTool == EditorTool.ANIMATION) {
                           this.trySelectTimelineKeyframeForField(var2, var2.sidebarFieldDragField);
                           if (this.isTimelineSelectedRowMatchingField(var2, var2.sidebarFieldDragField)) {
                              this.syncTimelineSelectedKeyframeValueFromTarget(var2);
                              this.applyTimelineFieldDeltaToSelectedKeyframes(var2, var2.sidebarFieldDragField, var10 - var12);
                              String[] var10004 = new String[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129228, 4)];
                              var10004[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 18)] = var2.animationTimelineTargetId;
                              this.renderAnimationTimelineKeyframes(var1, var2, this.firstNonBlank(var10004));
                           }
                        }

                        if (var2.sidebarFieldDragField != EditorPropertyField.LAYER && var2.sidebarFieldDragField != EditorPropertyField.DESIGN_TEXT_WRAP) {
                           this.rerenderEditableSelection(var1, var2);
                        } else {
                           this.rerenderEditableContent(var1, var2);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void translateAnimationPositionChildren(Player var1, EditorSession var2, List<String> var3, double var4, double var6) {
      if ((-1925630726 * (-1925630726 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var2 != null
         && var2.activeTool == EditorTool.ANIMATION
         && this.isTimelinePositionKeyframeSelected(var2)
         && var3 != null
         && !var3.isEmpty()) {
         if (!(Math.abs(var4) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-6455787474678813061L, 25)))
            || !(Math.abs(var6) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(2069576442558827880L, 49)))) {
            HashSet var8 = new HashSet(var3);
            HashSet var9 = new HashSet();

            for (String var11 : var3) {
               for (String var13 : this.resolveDescendantLayerTargetIds(var2, var11)) {
                  if (!var8.contains(var13) && var9.add(var13)) {
                     this.translateTargetElements(var1, var2, var13, var4, var6);
                  }
               }
            }
         }
      }
   }

   public void applyTimelineExtraPreviewOffset(Player var1, EditorSession var2, String var3, double var4, double var6, double var8, double var10) {
      if ((1931283307 * 1931283307 + 1931283307 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         boolean var12 = this.isAnimationTimelineImageGroupRoot(var2, var3);
         double var13 = var12
            ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-1646532934335603916L, 57))
            : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7043163592637831695L, 5));
         EditorRect var15 = (EditorRect)var2.previewExtraBaseBoundsByTarget.get(var3);
         EditorRect var16 = (EditorRect)var2.previewExtraAppliedBoundsByTarget.get(var3);
         if (var15 == null || var16 == null) {
            List var17 = this.resolveTimelinePreviewTransformElements(var2, var3);
            if (var17 == null || var17.isEmpty()) {
               this.clearTimelineExtraPreviewOffset(var1, var2, var3);
               return;
            }

            EditorRect var18 = this.resolveTimelineImplicitBaseBounds(var2, var3);
            EditorRect var19 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
            if (var19 == null) {
               var19 = this.getTargetBounds(var2, var3);
            }

            if (var19 == null) {
               return;
            }

            EditorRect var20 = var18 != null ? var18 : var19;
            var15 = new EditorRect(var20.x, var20.y, var20.width, var20.height);
            var16 = new EditorRect(var19.x, var19.y, var19.width, var19.height);
            var2.previewExtraBaseBoundsByTarget.put(var3, var15);
            var2.previewExtraAppliedBoundsByTarget.put(var3, var16);
         }

         EditorRect var22 = new EditorRect(var4, var6, Math.max(var13, var8), Math.max(var13, var10));
         if (!this.sameRect(var16, var22)) {
            this.transformTimelinePreviewBounds(var1, var2, var3, var16, var22);
            EditorRect var23 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
            if (var23 == null) {
               var23 = var12 ? var22 : this.getTargetBounds(var2, var3);
            }

            if (var23 == null) {
               var23 = var22;
            }

            var2.previewExtraAppliedBoundsByTarget.put(var3, var23);
         }
      }
   }

   public void clearStaleTimelineExtraPreviewOffsets(Player var1, EditorSession var2, Set<String> var3) {
      if ((-661330528 * -661330528 - -661330528 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         LinkedHashSet var4 = new LinkedHashSet(var2.previewExtraBaseBoundsByTarget.keySet());
         var4.addAll(var2.previewExtraAppliedBoundsByTarget.keySet());
         if (var3 != null && !var3.isEmpty()) {
            var4.removeAll(var3);
         }

         for (Object var6_obj : var4) { String var6 = (String) var6_obj;
            this.clearTimelineExtraPreviewOffset(var1, var2, var6);
         }
      }
   }

   public void clearTimelineExtraPreviewOffset(Player var1, EditorSession var2, String var3) {
      if (((187187083 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         EditorRect var4 = (EditorRect)var2.previewExtraBaseBoundsByTarget.get(var3);
         EditorRect var5 = this.resolveTimelineImplicitBaseBounds(var2, var3);
         EditorRect var6 = var5 != null ? var5 : var4;
         EditorRect var7 = (EditorRect)var2.previewExtraAppliedBoundsByTarget.get(var3);
         EditorRect var8 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
         if (var8 != null) {
            var7 = var8;
         }

         if (var1 != null && var6 != null && var7 != null && !this.sameRect(var6, var7)) {
            this.transformTimelinePreviewBounds(var1, var2, var3, var7, var6);
         }

         this.clearTimelineExtraPreviewRotation(var1, var2, var3);
         this.clearTimelineExtraPreviewOpacity(var1, var2, var3);
         var2.previewExtraBaseBoundsByTarget.remove(var3);
         var2.previewExtraAppliedBoundsByTarget.remove(var3);
      }
   }

   public boolean isTimelineTransformInteractionActive(EditorSession var1) {
      if ((-14048715 ^ -14048715) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.activeTool != EditorTool.ANIMATION) {
         return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-304208877, 4) != 0;
      } else if (!var1.animationTimelineSliderDragActive && !var1.timelineKeyframeDragActive) {
         EditorTool var2 = this.resolveTimelineSelectedTool(var1);
         if (var2 != EditorTool.CURSOR && var2 != EditorTool.SCALE) {
            return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 31) != 0;
         } else if (var1.moveDragActive || var1.sidebarFieldDragActive) {
            return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1878018184, 22) != 0;
         } else if (var2 != EditorTool.SCALE) {
            return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1817001589, 15) != 0;
         } else {
            int var3 = Xqedii_38o2zes.Xqedii_316oplq() - var1.lastLeftClickTick <= Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-8393662805988999644L, 30)
               ? Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 27)
               : Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 10);
            return (var3 != 0 && var1.activeHandle != null
               ? Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-2095634586, 0)
               : Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(605285854, 20)) != 0;
         }
      } else {
         return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1295938669, 23) != 0;
      }
   }

   public void applyTimelinePreviewOffset(Player var1, EditorSession var2, String var3, double var4, double var6, double var8, double var10) {
      if ((1667145688 * 1667145688 + 1667145688 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         boolean var12 = this.isAnimationTimelineImageGroupRoot(var2, var3);
         double var13 = var12
            ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-1250550933754622967L, 7))
            : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5717491899902205006L, 60));
         if (!this.equalsNullable(var2.animationPreviewTargetId, var3)) {
            this.clearTimelinePrimaryPreviewOffset(var1, var2);
            var2.animationPreviewTargetId = var3;
         }

         if (var2.animationPreviewBaseBounds == null || var2.animationPreviewAppliedBounds == null) {
            List var15 = this.resolveTimelinePreviewTransformElements(var2, var3);
            if (var15 == null || var15.isEmpty()) {
               this.clearTimelinePrimaryPreviewOffset(var1, var2);
               return;
            }

            EditorRect var16 = this.resolveTimelineImplicitBaseBounds(var2, var3);
            EditorRect var17 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
            if (var17 == null) {
               var17 = this.getTargetBounds(var2, var3);
            }

            if (var17 == null) {
               return;
            }

            EditorRect var18 = var16 != null ? var16 : var17;
            var2.animationPreviewBaseBounds = new EditorRect(var18.x, var18.y, var18.width, var18.height);
            var2.animationPreviewAppliedBounds = new EditorRect(var17.x, var17.y, var17.width, var17.height);
         }

         EditorRect var19 = var2.animationPreviewAppliedBounds;
         if (var19 != null) {
            EditorRect var20 = new EditorRect(var4, var6, Math.max(var13, var8), Math.max(var13, var10));
            if (!this.sameRect(var19, var20)) {
               this.transformTimelinePreviewBounds(var1, var2, var3, var19, var20);
               EditorRect var21 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
               if (var21 == null) {
                  var21 = var12 ? var20 : this.getTargetBounds(var2, var3);
               }

               if (var21 == null) {
                  var21 = var20;
               }

               var2.animationPreviewAppliedBounds = var21;
               EditorRect var22 = var2.animationPreviewBaseBounds;
               if (var22 != null) {
                  var2.animationPreviewOffsetX = var21.x - var22.x;
                  var2.animationPreviewOffsetY = var21.y - var22.y;
               }
            }
         }
      }
   }

   public void transformTimelinePreviewBounds(Player var1, EditorSession var2, String var3, EditorRect var4, EditorRect var5) {
      if ((-393705155 * -393705155 + -393705155 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && var4 != null && var5 != null && !this.sameRect(var4, var5)) {
         EditorRect var6 = var4;
         EditorRect var7 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
         if (var7 == null) {
            var7 = this.getTargetBounds(var2, var3);
         }

         if (var7 != null) {
            var6 = var7;
         }

         double var8 = var6.width < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-7560530132955714301L, 54))
            ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187349080738388503L, 48))
            : var5.width / var6.width;
         double var10 = var6.height < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(7122122745635220027L, 60))
            ? Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-7265001122204610848L, 56))
            : var5.height / var6.height;
         int var12 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 15);

         for (HoverElement var14 : this.resolveTimelinePreviewTransformElements(var2, var3)) {
            if (var14 != null && var14.baseLocation != null && var14.baseScale != null) {
               double var15 = var14.baseLocation.getX();
               double var17 = var14.baseLocation.getY();
               double var19 = var14.baseScale.getX();
               double var21 = var14.baseScale.getY();
               double var23 = var6.width < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-7031112311918464711L, 10))
                  ? var5.x + (var15 - var6.x)
                  : var5.x + (var15 - var6.x) / var6.width * var5.width;
               double var25 = var6.height < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-908666274219062836L, 13))
                  ? var5.y + (var17 - var6.y)
                  : var5.y + (var17 - var6.y) / var6.height * var5.height;
               double var27 = var6.width < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-4617140695484051517L, 50)) ? var19 : var19 * var8;
               double var29 = var6.height < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-6237906030993027443L, 8)) ? var21 : var21 * var10;
               var14.baseLocation.setX(var23);
               var14.baseLocation.setY(var25);
               var14.baseScale.setX(var27);
               var14.baseScale.setY(var29);
               var14.width = Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7185589381097609751L, 51)), Math.abs(var27));
               var14.height = Math.max(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-8649002357849285843L, 8)), Math.abs(var29));
               var14.centerX = var23 + var27 / Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278782861171223L, 33));
               var14.centerY = var25 + var29 / Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523555572229086286L, 38));
               this.updateElementHud(var1, var14);
               var12++;
            }
         }

         this.reanchorAnimationGroupGlyphTiles(var1, var2, var3);
         if (var12 == 0 && this.plugin != null && this.shouldLogTimelineImageDebug(var2, var3)) {
            Logger var10000 = this.plugin.getLogger();
            String[] var10002 = new String[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-152104423, 3)];
            var10002[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 25)] = var3;
            var10002[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1077861858, 24)] = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
               "l7QuxdmddtIoBJ6xyiannoMfvSsCwuYajNOJ1pmxmzvxV9zmYKq6ARVJ"
            );
            var10000.info(Xqedii_293zx0sd9p0t6(this.firstNonBlank(var10002), this.formatTimelineDebugBounds(var6), this.formatTimelineDebugBounds(var5)));
         }

         if (this.isSelectedTarget(var2, var3) && var2.selectionOutlineVisible) {
            int var31 = Math.abs(var5.width - var6.width) <= Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8330587581690252123L, 14))
                  && Math.abs(var5.height - var6.height) <= Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(4151875171731388785L, 2))
               ? Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1144749955, 9)
               : Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 14);
            if (var31 != 0) {
               double var32 = var5.x - var6.x;
               double var16 = var5.y - var6.y;
               if (Math.abs(var32) > Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-5243945799178594123L, 10))
                  || Math.abs(var16) > Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-3280198073107139528L, 36))) {
                  this.translateSelectionOutline(var1, var2, var32, var16);
               }
            } else {
               this.renderSelectionOverlay(var1, var2);
            }
         }
      }
   }

   public void reanchorAnimationGroupGlyphTiles(Player var1, EditorSession var2, String var3) {
      if (((1213782216 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         if (this.isAnimationTimelineImageGroupRoot(var2, var3)) {
            List<HoverElement> var4 = this.resolveTimelinePreviewTransformElements(var2, var3);
            if (var4 != null && !var4.isEmpty()) {
               HoverElement var5 = null;

               for (HoverElement var7 : var4) {
                  if (var7 != null && var7.baseLocation != null && var7.baseScale != null && this.isBetterImageGroupRootCandidate(var7, var5)) {
                     var5 = var7;
                  }
               }

               if (var5 != null) {
                  double var35 = var5.baseLocation.getX() - Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780713723350L, 16));
                  double var8 = var5.baseLocation.getY();
                  double var10 = Math.abs(var5.baseScale.getX());
                  ArrayList<HoverElement> var12 = new ArrayList<HoverElement>();
                  double var13 = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5528274744854977614L, 54));
                  double var15 = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278780730460695L, 25));
                  double var17 = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-5692811313158548627L, 5));
                  double var19 = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523555640948556724L, 14));

                  for (HoverElement var22 : var4) {
                     if (var22 != null
                        && var22 != var5
                        && var22.baseLocation != null
                        && var22.baseScale != null
                        && !Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Q5w5s/GmqfrpamYfNn1Lksh5KcMtp2xe5OaMfwU7xr+336Ia/gMDfw==").equals(var22.type)) {
                        var12.add(var22);
                        double var23 = var22.baseLocation.getY();
                        double var25 = var22.baseLocation.getX();
                        if (var23 < var13) {
                           var13 = var23;
                           var15 = Math.abs(var22.baseScale.getY());
                        }

                        if (var25 < var17) {
                           var17 = var25;
                           var19 = Math.abs(var22.baseScale.getX());
                        }
                     }
                  }

                  if (!var12.isEmpty() && Double.isFinite(var13) && Double.isFinite(var17) && Double.isFinite(var15) && Double.isFinite(var19)) {
                     double var36 = var8
                        + Xqedii_14y6uzm.Xqedii_2j0x561 * (var15 - Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7187278782254570007L, 31)))
                        - var15 * Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_dw2b17lj1g82(-7201459309594195174L, 2));
                     double var37 = var35
                        + var19 * Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-4561048601430191283L, 10))
                        - EditorOverlayPreviewPart.imageGroupSingleTilePartialShiftX(var10, var19);
                     double var38 = var36 - var13;
                     double var27 = var37 - var17;
                     if (Double.isFinite(var27) && !(Math.abs(var27) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-1330696950210615386L, 40)))
                        || Double.isFinite(var38) && !(Math.abs(var38) < Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-805699790870698839L, 51)))
                        )
                      {
                        for (HoverElement var30 : var12) {
                           double var31 = var30.baseLocation.getX()
                              + (Double.isFinite(var27) ? var27 : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-1877214052735185202L, 38)));
                           double var33 = var30.baseLocation.getY()
                              + (Double.isFinite(var38) ? var38 : Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(8103951382714762385L, 35)));
                           var30.baseLocation.setX(var31);
                           var30.baseLocation.setY(var33);
                           var30.centerX = var31
                              + var30.baseScale.getX() / Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-1157103651202713948L, 9));
                           var30.centerY = var33
                              + var30.baseScale.getY() / Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-7062166984041421100L, 6));
                           this.updateElementHud(var1, var30);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void clearTimelinePrimaryPreviewOffset(Player var1, EditorSession var2) {
      if (((-2147181560 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         String[] var10001 = new String[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1136130085, 13)];
         var10001[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1144749443, 9)] = var2.animationPreviewTargetId;
         String var3 = this.firstNonBlank(var10001);
         EditorRect var4 = var2.animationPreviewBaseBounds;
         int var5 = var2.animationTimelinePanelVisible && var2.activeTool == EditorTool.ANIMATION
            ? Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(16480137, 26)
            : Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 13);
         EditorRect var6 = !var3.isBlank() && var5 != 0 ? this.resolveTimelineImplicitBaseBounds(var2, var3) : null;
         EditorRect var7 = var4 != null ? var4 : var6;
         EditorRect var8 = var2.animationPreviewAppliedBounds;
         if (!var3.isBlank()) {
            EditorRect var9 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
            if (var9 != null) {
               var8 = var9;
            }
         }

         if (var8 == null && !var3.isBlank()) {
            var8 = this.resolveTimelineCurrentBoundsForPreview(var2, var3);
         }

         if (var1 != null && !var3.isBlank() && var7 != null && var8 != null && !this.sameRect(var7, var8)) {
            this.transformTimelinePreviewBounds(var1, var2, var3, var8, var7);
         }

         if (!var3.isBlank()) {
            this.clearTimelinePrimaryPreviewRotation(var1, var2, var3);
            this.clearTimelinePrimaryPreviewOpacity(var1, var2, var3);
         } else {
            var2.animationPreviewBaseRotation = null;
            var2.animationPreviewAppliedRotation = null;
            var2.animationPreviewBaseOpacity = null;
            var2.animationPreviewAppliedOpacity = null;
         }

         var2.animationPreviewTargetId = null;
         var2.animationPreviewOffsetX = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-2314207302405428151L, 10));
         var2.animationPreviewOffsetY = Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_1xu507exe01n4(-8393662803841515996L, 30));
         var2.animationPreviewBaseBounds = null;
         var2.animationPreviewAppliedBounds = null;
      }
   }

   @Override
   public void clearTimelinePreviewOffset(Player var1, EditorSession var2) {
      if ((-1153265270 * -1153265270 + -1153265270 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         this.clearTimelinePrimaryPreviewOffset(var1, var2);
         LinkedHashSet var3 = new LinkedHashSet(var2.previewExtraBaseBoundsByTarget.keySet());
         var3.addAll(var2.previewExtraAppliedBoundsByTarget.keySet());
         var3.addAll(var2.previewExtraBaseRotationByTarget.keySet());
         var3.addAll(var2.previewExtraAppliedRotation.keySet());
         var3.addAll(var2.previewExtraBaseOpacityByTarget.keySet());
         var3.addAll(var2.previewExtraAppliedOpacity.keySet());

         for (Object var5_obj : var3) { String var5 = (String) var5_obj;
            this.clearTimelineExtraPreviewOffset(var1, var2, var5);
         }

         var2.previewExtraBaseBoundsByTarget.clear();
         var2.previewExtraAppliedBoundsByTarget.clear();
         var2.previewExtraBaseRotationByTarget.clear();
         var2.previewExtraAppliedRotation.clear();
         var2.previewExtraBaseOpacityByTarget.clear();
         var2.previewExtraAppliedOpacity.clear();
      }
   }

   @Override
   public void applyTimelinePositionPreview(Player var1, EditorSession var2) {
      if (((-1536740622 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.animationTimelinePanelVisible) {
         String[] var10001 = new String[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1227258332, 29)];
         var10001[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-152104439, 3)] = var2.animationTimelineTargetId;
         String var3 = this.firstNonBlank(var10001);
         if (this.isTimelineTransformInteractionActive(var2)) {
            this.syncTimelinePreviewAppliedBoundsToCurrent(var2, var3);
         } else {
            double var4 = this.clampAnimationTimelineTick(var2.animationTimelineTick);
            if (var2.animationTimelineSliderDragActive && var2.animationTimelineSliderDragTick != null && Double.isFinite(var2.animationTimelineSliderDragTick)
               )
             {
               var4 = Math.max(
                  Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_t5tdcd7kd4az(-2168012048046032539L, 61)),
                  Math.min(Double.longBitsToDouble(Xqedii_nkkc0h9.Xqedii_u9md8e2cro2n(-5523414688711842894L, 49)), var2.animationTimelineSliderDragTick)
               );
            }

            LinkedHashSet var6 = this.resolveTimelinePreviewTargetIds(var2, var3);
            if (var6.isEmpty()) {
               this.clearTimelinePreviewOffset(var1, var2);
            } else {
               var10001 = new String[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-249454738, 15)];
               var10001[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 25)] = var3;
               var10001[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-643775031, 22)] = var2.animationPreviewTargetId;
               String var7 = this.firstNonBlank(var10001);
               if (var7.isBlank()) {
                  for (Object var9_obj : var6) { String var9 = (String) var9_obj;
                     var10001 = new String[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129276, 5)];
                     var10001[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1623575001, 30)] = var9;
                     String var10 = this.firstNonBlank(var10001);
                     if (!var10.isBlank()) {
                        var7 = var10;
                        break;
                     }
                  }
               }

               this.syncTimelinePreviewAppliedBoundsToCurrent(var2, var7);
               int var21 = Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-284030474, 11);
               LinkedHashSet var22 = new LinkedHashSet();

               for (Object var11_obj : var6) { String var11 = (String) var11_obj;
                  var10001 = new String[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1953254591, 7)];
                  var10001[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1335696148, 29)] = var11;
                  String var12 = this.firstNonBlank(var10001);
                  if (!var12.isBlank()) {
                     EditorRect var13 = null;
                     EditorRect var14 = null;
                     if (this.shouldLogTimelineImageDebug(var2, var12)) {
                        var13 = this.resolveTimelineStableBaseBounds(var2, var12);
                        var14 = this.resolveTimelineCurrentBoundsForPreview(var2, var12);
                     }

                     if (!this.isTargetVisible(var2, var12)) {
                        if (this.equalsNullable(var12, var7)) {
                           this.clearTimelinePrimaryPreviewOffset(var1, var2);
                        } else {
                           this.clearTimelineExtraPreviewOffset(var1, var2, var12);
                        }
                     } else {
                        double[] var15 = this.resolveTimelinePreviewState(var2, var12, var4);
                        if (var15 != null && var15.length >= Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1408097828, 28)) {
                           double var16 = var15.length >= Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764108764, 12)
                              ? var15[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(103698131, 1)]
                              : this.readTargetRotation(var2, var12);
                           double var18 = var15.length >= Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1763736028, 16)
                              ? var15[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1663465948, 25)]
                              : this.readTargetOpacity(var2, var12);
                           if (this.shouldLogTimelineImageDebug(var2, var12)) {
                              this.logAnimationTimelineImageDebug(
                                 var2,
                                 Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                                    "cTm7uHH4ZxU8pbZ8GQvxBmnkWF43GrocIT/sp/dV8XBhsWJzirXeh3UOc8ZZkthIcaBVCydh5IC9uAJ2DCxIq0nZj9kV4jdW1c9cRaM+VT3fxA=="
                                 ),
                                 var12,
                                 var4,
                                 null,
                                 var13,
                                 var14,
                                 var15,
                                 Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(1764129243, 21),
                                 Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(1764129243, 23)
                              );
                           }

                           if (this.equalsNullable(var12, var7)) {
                              this.applyTimelinePreviewOffset(
                                 var1,
                                 var2,
                                 var12,
                                 var15[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-323984668, 21)],
                                 var15[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(874035515, 27)],
                                 var15[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075576132, 14)],
                                 var15[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1270772845, 23)]
                              );
                              this.applyTimelinePreviewRotation(var1, var2, var12, var16);
                              this.applyTimelinePreviewOpacity(var1, var2, var12, var18);
                              var21 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 27);
                              if (this.shouldLogTimelineImageDebug(var2, var12)) {
                                 EditorRect var20 = this.resolveTimelineCurrentBoundsForPreview(var2, var12);
                                 this.logAnimationTimelineImageDebug(
                                    var2,
                                    Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                                       "7bA6fwxmpnzeIDLTpF5GXttbiZXe/+Zj0P+Rk+3K2mWWjv3Y98anp2IgWLT5JEEVMNgMnzg0ogXUJa+5rGjwbGS69qpZ0v6k+LyNeKqVI+o="
                                    ),
                                    var12,
                                    var4,
                                    null,
                                    var13,
                                    var20,
                                    var15,
                                    Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(1136121892, 13),
                                    Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075526981, 15)
                                 );
                              }
                           } else {
                              this.applyTimelineExtraPreviewOffset(
                                 var1,
                                 var2,
                                 var12,
                                 var15[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-998081093, 17)],
                                 var15[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1659170000, 5)],
                                 var15[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129228, 3)],
                                 var15[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-568056851, 12)]
                              );
                              this.applyTimelineExtraPreviewRotation(var1, var2, var12, var16);
                              this.applyTimelineExtraPreviewOpacity(var1, var2, var12, var18);
                              var22.add(var12);
                              if (this.shouldLogTimelineImageDebug(var2, var12)) {
                                 EditorRect var24 = this.resolveTimelineCurrentBoundsForPreview(var2, var12);
                                 this.logAnimationTimelineImageDebug(
                                    var2,
                                    Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                                       "7bA6fwxmpnzeIDLTpF5GXttbiZXe/+Zj0P+Rk+3K2mWWjv3Y98anp2IgWLT5JEEVMNgMnzg0ogXUJa+5rGjwbGS69qpZ0v6k+LyNeKqVI+o="
                                    ),
                                    var12,
                                    var4,
                                    null,
                                    var13,
                                    var24,
                                    var15,
                                    Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1920354353, 12),
                                    Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(1764129243, 10)
                                 );
                              }
                           }
                        } else if (this.equalsNullable(var12, var7)) {
                           this.clearTimelinePrimaryPreviewOffset(var1, var2);
                        } else {
                           this.clearTimelineExtraPreviewOffset(var1, var2, var12);
                        }
                     }
                  }
               }

               if (var21 == 0 && !var7.isBlank()) {
                  this.clearTimelinePrimaryPreviewOffset(var1, var2);
               }

               this.clearStaleTimelineExtraPreviewOffsets(var1, var2, var22);
               this.clearStaleTimelineExtraPreviewRotations(var1, var2, var22);
               this.clearStaleTimelineExtraPreviewOpacities(var1, var2, var22);
            }
         }
      } else {
         this.clearTimelinePreviewOffset(var1, var2);
      }
   }

   @Override
   public void syncTimelinePreviewAppliedBoundsToCurrent(EditorSession var1, String var2) {
      if ((2019924191 * (2019924191 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String[] var10001 = new String[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-249454738, 15)];
         var10001[Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1777574755, 26)] = var1.animationPreviewTargetId;
         var10001[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-572374978, 8)] = var2;
         String var3 = this.firstNonBlank(var10001);
         if (!var3.isBlank() && this.equalsNullable(var1.animationPreviewTargetId, var3)) {
            EditorRect var4 = this.resolveTimelineCurrentBoundsForPreview(var1, var3);
            if (var4 != null) {
               var1.animationPreviewAppliedBounds = var4;
               EditorRect var5 = var1.animationPreviewBaseBounds;
               if (var5 != null) {
                  var1.animationPreviewOffsetX = var4.x - var5.x;
                  var1.animationPreviewOffsetY = var4.y - var5.y;
               }
            }
         }

         if (!var1.previewExtraAppliedBoundsByTarget.isEmpty()) {
            for (String var6 : new LinkedHashSet<String>(var1.previewExtraAppliedBoundsByTarget.keySet())) {
               EditorRect var7 = this.resolveTimelineCurrentBoundsForPreview(var1, var6);
               if (var7 != null) {
                  var1.previewExtraAppliedBoundsByTarget.put(var6, var7);
               }
            }
         }
      }
   }

   public EditorPropertyField resolveSidebarValueHitboxField(EditorSession var1, double var2, double var4) {
      if ((-2126305938 * (-2126305938 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.rightSidebarTab == null) {
         return null;
      } else if (var1.rightSidebarTab == EditorSidebarTab.PROPERTIES) {
         if (this.isKeyframePropertiesSidebarMode(var1)) {
            if (this.isTimelineOpacityKeyframeSelected(var1)) {
               return !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                           "035kk4SejIJr9qUkY8TxkcULv71X4bTeQCLTLclCQshVtqMZo+zhfMHfEI04AsWY8VxXQ3v+Dv2shZXvCs7G+4ERaGw+1KinHhm9dQmqujefnJxcb/LRVxvnsoHmbCv0"
                        ),
                        var2,
                        var4
                     )
                     && !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                           "qcJEMfh8BYF5l0N9LbN7V6aqEyiK/dmdX7g4y5Xr/YJRyjf1iLToX3zgq4bXW2ROhtmqt5QOVtzCeV7ndbp5hP/ZBWQD/NOoaZc="
                        ),
                        var2,
                        var4
                     )
                     && !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                           "a4+1sHlaytAnx1Fj8qxFGMBLpb6EClSJ2swMSj97ZvXYe3wuUKSzY5LCn+gTvT0uFagv1NhadbiIKzf9ifH37pQ3gq+ziGqzLHtETrM6MGG/nA=="
                        ),
                        var2,
                        var4
                     )
                     && !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("n470/QQ//DYOfXFMWL+CGLRztK36IW1WNIYJVp6CL26Ga9rlln5dCpuaPxIPxpg+Itt5FZk3RBQioiiV"),
                        var2,
                        var4
                     )
                  ? null
                  : EditorPropertyField.OPACITY;
            } else if (this.isTimelineRotationKeyframeSelected(var1)) {
               return !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                           "NteLTjY2Oq5LWUk0oYLfCTHk+KBlmAkt+dwdnFoFfFcGA89/nFA0RXL7oFtHIDvkbR7pHLxL6PQZQj7+Yq/Cgaox7+ERwkH5K/fxRz8Bht/CX1Kr+zqoqMxZIew70QYHH6c="
                        ),
                        var2,
                        var4
                     )
                     && !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                           "VzOY9qBdSNqaeURgEjBkccTvjyJ6owTZk8y8IOFxdeX1dSD1hZD+eFQh8tScEr4NelIj284sTyb2u/91p4lnpwvURqUsHoHOQcXfJA=="
                        ),
                        var2,
                        var4
                     )
                     && !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                           "uzcb9h2EGAAu0Ql97OA3dtUVXNRijbHp381SkaESRIyrNSZ0ZMcdH56ruJyL/qc/7m6r2WaTji1BjaBsJCgnVbLP9OQDrlCt6YMS4GS3JiUvBM6N"
                        ),
                        var2,
                        var4
                     )
                     && !this.isInsideShellBlock(
                        var1,
                        Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Ne7QBHLPL9m0p9c7tlENGFKli4PboE6FR7Fal2KoTgetFtAfvH9Lo438xktbI0vy9CRPU56CCcL8/LMUiUI="),
                        var2,
                        var4
                     )
                  ? null
                  : EditorPropertyField.ROTATION;
            } else {
               EditorPropertyField var6 = this.isTimelineScaleKeyframeSelected(var1) ? EditorPropertyField.WIDTH : EditorPropertyField.POSITION_X;
               EditorPropertyField var7 = this.isTimelineScaleKeyframeSelected(var1) ? EditorPropertyField.HEIGHT : EditorPropertyField.POSITION_Y;
               if (this.isInsideShellBlock(
                     var1,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "qV401LQdwSOYYwEQipQENeUHEOatH2mtnbEoBuaoE1ynEqZK9CFx8lSrGd/QnxkW/0sokPzbH9WSjmpQic82HuxlsKTnE5kRdaQQrs8Xf8BNAnPe"
                     ),
                     var2,
                     var4
                  )
                  || this.isInsideShellBlock(
                     var1,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("iUc6oERGKliiidO0BrE28je7PYIwxu3DTbNDOWDMIKLKIICfm/XlWJmSnJXRxUvWIkCOiMEeGi1P0sDiiTg="),
                     var2,
                     var4
                  )) {
                  return var6;
               } else {
                  return !this.isInsideShellBlock(
                           var1,
                           Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                              "pQTBTA+GtIeywJ5Py7euIZkOmK2RnnFScESUu6cEAI54JXZvJkF7Q5EQ3b9ahs5SRUhXiqBIwZSCitzOZqN4HD3kPa7ev04gar4zLQs4G81PvOsq"
                           ),
                           var2,
                           var4
                        )
                        && !this.isInsideShellBlock(
                           var1,
                           Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("+MfOVEvspuTY06qDYUOmHiLVhlJ9SgrWHVIoIM/v+7Z5YFzUpf7AABu6vWC694tmf1Jnc/4Qz0lvSn6PGB4="),
                           var2,
                           var4
                        )
                     ? null
                     : var7;
               }
            }
         } else {
            if (!this.isActionsSidebarMode(var1)) {
               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("tQMn7HVml6YhvDr3FBxc4lhSQd02vOLeTb0YKx5ZZ+aibBShfhVUBPPWiFfiK+EF77uoxJp+5xnhRvfQca0lcr78/ManbgicyvU="),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.WIDTH;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "EXpwSd/3NqKTeD4UpC9GmXbrEJ54EhY/9N+rMkPZxgsqgEejBRouvmm4LHBeC8WL5FDAv2gQn3JUEEP4OSAjbQM9V0Mxz/EydO3ANQ=="
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.HEIGHT;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("DasDUx4HGvddO9I2pE6YjX/whGF3O5D9G6T9/cQgHJofpA9jGyQJwQCjAPI5uIidMjTWa+S6mMHMhCwG32jZJUHP"),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.POSITION_X;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("mUzUQ/Nscy2RRPu7eNmlnqngmNw77SZwxlzxDDK+7Z7e6xXPddMcalj72x9WM8OeNksLJyDnF2dib91j/cDPC3C6"),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.POSITION_Y;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "G+s6qYwjJZUGHjcN9Frbj/gP3TsuKdJvgfZZLDFjrUyzoLUaxRbP/C9CHMu64h9jFKZm4YRr5Oed+fhdz0Juyfvi3/tJlu2rmmbK+w53DzQ="
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.ROTATION;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eHfryTxJxG0RMbkUvZqh4DtNHOpLqwmY9Hg5bSBjlfXNgkPMXdvImRaK8ZOl8YUDYK7/RWyJePt89H98JR5EXF7UqFgOb9GyN7U="),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.LAYER;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Qa1Zn18nm/3Cg8DoihSFdlwG77UlXMLknrSkWkV6dWW4ppKg+TVJutwWE1COl3uYnVdMGrW61ZhT7xm3kTrv4Cr4DbO3wNft"),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.NAME;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("gIrIDnxbADzHw7qdKW5XxNABT2I8CRrVa2bmJAJknQRSEuiJa9mmstWzSP6YPvIA/+IEgLI0riE0mxcOj2UoogT/miI="),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.ID;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "cT/mLYz9dohWV2kDEbRLOxptETC4qUlnRtucwiGgee40dnv2Mi2VnXR9IfrwSP5WbbIy3/SozbeqTheXGWjUzweRJCMdCeMypten4+ej"
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.VISIBLE;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "77zfpkgwLE1ZzJG8E4h9GBBwZw8yVxXwEN2GgN03m1TctJQWol2m0q49z2GF456G+LL2tiy5/2g9hgbkaxC/08C12gASfs8+G/K3Mw=="
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.LOCKED;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "9s2ZdWIUZ639UclWn9D/WAudZuzK3CqCIHjMh/7np6gmvbGCo57miMKzdwoCp1KX5zLSSgZ9l1wgw6gnnqg850xrq+AqvUNckm9ztA=="
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.ANCHOR;
               }
            }

            return null;
         }
      } else {
         if (var1.rightSidebarTab == EditorSidebarTab.DESIGN) {
            if (this.isItemDesignSidebarMode(var1)) {
               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "ZL3OyVb4D79y2i1Nw30PLyJML8+BzXHUL45DE6dIAwAjJnAWteO/aoHEh2Al0FjcDtr6+zkGH6yNYLzsAb+5S9C0GIQGQ08bFjR3b/v9DhK4aBDniQHpAVy0yMsnboggph0K964YuopsWc7L60M="
                  ),
                  var2,
                  var4
               )) {
                  return null;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "J5CdotUNY5Xyw/WAbUI2PLqrWqqHXtPRDyuOKbEdhbsWjS3Rfglsggp8uAcprp41RLAUDz+DZLmqpzm1Evb1eBwsDaiBVtmZelmnHqA7lyYQ8x/XHfmo33/FCwjQSAp3"
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.ITEM_DESIGN_ITEM;
               }

               if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "xK7/LnXXHMlkWccPvuEV0TazHEdRb56dVyLbN+vjr8dQwJfdQPqu5oYcKJ5xPPfg6Yi9jDX+NviTFAjR93uBUwgYxVV1W4c0hIgTm7qWURtp+FvzW8E9R+oh1ctZBnDAunJES5EW"
                  ),
                  var2,
                  var4
               )) {
                  return EditorPropertyField.ITEM_DESIGN_GLOWING;
               }

               return null;
            }

            if (this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "GAs0mH2JQb4wS8HUl13/hBeO0y580CmMGfa0Odeo4uN7FBDoB2Gp/Bv6437+HprFZmasWa8O86KK9izi0XbLfBur7P8aForLGQP724xdqit0HpH2zKrWXZFA+4WhR27wuwA="
                  ),
                  var2,
                  var4
               )
               || this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "EwBAS69jDJ3pzvcamj3LMQrI+TBO111ZlSnye72BgCvpsKxcyQ/GwknXJwOLEwTcAgUlVxQkavkAO7Ofr0NOq5iIK/hOJqBHqkQF9sePYGfJM4f7NKPNXhWC5AdfAgQQY2Iwckw/Yb0="
                  ),
                  var2,
                  var4
               )
               || this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "wfRYLEW93ZL/1y/Iq2XFW3NHdXDe6gwkgq76ff2ofjH6rh6n5zE4sxUFG3h5C7SOVAK2KZZVeQ2R368fTbp/FNR65Np6+bwVRnNzh1F5DSpSd3KkYQYCEB35iNn7LaygNB5Z4g=="
                  ),
                  var2,
                  var4
               )
               || this.isInsideShellBlock(
                  var1,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "jXI2J3sd2q+YH2vRAR1nsUplcIZI/lhu+XiQSOepUUSE9V39S5qMYEGdxzzSs1Y6aGEHfJlXsuIOOLx4/omywtlZl67Fxp3Cy1nX42knRsD1DeBk4qVs7Hxfib/AAoSuOo2s6KQR"
                  ),
                  var2,
                  var4
               )) {
               return null;
            }

            if (this.isInsideShellBlock(
               var1,
               Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "DEMsR3MPNTvnau0IMgb8pCIsDUiSQxRk+m5jnNx7tv2pytMKurL+jtv7GL8Fv9DXUH+nnDr68Tam2ZRtulQdFq7u0jEBH2ZZFUk132iW+vS7ja6WmM5oWyrX2p4m2Z2/kms="
               ),
               var2,
               var4
            )) {
               return EditorPropertyField.DESIGN_COLOR;
            }

            if (this.isInsideShellBlock(
               var1,
               Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "RKiIsLEMlBWtuRwc2aQcTrpCxGgjT4iDh/95yxLfvTubCMxfq+GPBDJ6EyTxLWf8GB0osGzTxEdjR3GcrobnPQQLtMZQdxS2X1xF+FdOg4A03SjOrc+AplZUvhqOV2gIbRv/5pnI"
               ),
               var2,
               var4
            )) {
               return EditorPropertyField.OPACITY;
            }

            if (this.isInsideShellBlock(
               var1,
               Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                  "B3DRQ0n2AXQr11T92I7qcuJCb6skdXg1qWxet2OXHc/amaKuwLnVYxw0cwCCiQkQojGiCKdGLEPbvhPXaK3sxe/oypPC1H+sBTzMmGWZ2fpwQbDTWCAQ0jva2Xsc9uB+mVU/BPpo"
               ),
               var2,
               var4
            )) {
               return EditorPropertyField.DESIGN_BORDER_COLOR;
            }
         }

         return null;
      }
   }

   public boolean handleKeyframeInterpSidebarClick(Player var1, EditorSession var2, double var3, double var5) {
      if (((905326653 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && this.isKeyframePropertiesSidebarMode(var2)) {
         boolean var7 = this.isTimelineRotationKeyframeSelected(var2);
         boolean var8 = this.isTimelineOpacityKeyframeSelected(var2);
         int var9 = !this.isInsideShellBlock(
                  var2,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "mDWHdXKXfMzeVbb1DyslhCQf/WPXn9hU0OsP2W42X5pQWarGxABdrQWkw/Xyej2lkRAjj4N59GSOswQzrPYxtW0W6oBM55mdsF04y07GLv8pVB6olGp9D5t22SsaAwEuHAK2poR8rT4JE3Me"
                  ),
                  var3,
                  var5
               )
               && !this.isInsideShellBlock(
                  var2,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "ZwlGP4E6B6ROav5i3GmcOmEMnKEMN1wx+zvWie/svFPRcPvqldJcsNeGaAJ7yhWAwrNRwYPs1AI/vfTEsNOS+tlD3cuGI0KTl8kzo8bXPYgsGSzXFH8="
                  ),
                  var3,
                  var5
               )
               && !this.isInsideShellBlock(
                  var2,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                     "oKlSlWpKMtKHenTNKOkk2gbRVorJV6IyNZ09+XK3X2TKEdlfNYYTxJKm/L0VHZYqqLhgM+vVy6DdSxsTzdT1QFKMbIBxcCjyWXbmzx8Bdc/PmLwYvPOSmM/RHvmb3g=="
                  ),
                  var3,
                  var5
               )
               && !this.isInsideShellBlock(
                  var2,
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("9ZQUByjtX4KBXGs5Rqh1FRrEVGRVFamRuqKWqYqR2sSYFraRf5H9JG4M6aLMq1e5Bz+jAX21yT1Ummfc05erQVvs5wWoUFGm"),
                  var3,
                  var5
               )
            ? Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-1335696148, 29)
            : Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-568065043, 12);
         if (var7) {
            var9 = var9 == 0
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "7rRTowA4/4R2Bk4eju3xgw9ITx6pS5X4A0rV0Q/HCBYSDFX52MJtI1GB2NdqtRWXFWHgBy8mYIAIB5fsEpHEuWYiXZk69OWQWNzDKDBd+JaDz++/Il5sewdPGQjZ01iRhelU1S/FiPhcMPO4NuLLgaAkJ9KZ4Tr/wTGHkZIx"
                     ),
                     var3,
                     var5
                  )
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "svP5JpktumaocWfX50yvCw7HTE+dVJzMwZlBictM7Vlqy1FZkTy4uV8CTCTsTpMyeAd7lJ3iuy4prPiMNPyoIRDYEago6p0fBJGuqjNhF5HN8ysDbc6+UoF7H9tmyMb4ox+u7DbNbvA="
                     ),
                     var3,
                     var5
                  )
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "5Muj2uyeaTDU7GiVg8X11boD8xOzmkeGHBejbH4O9jCNk/FUNweL3lPbdV0lXmuZF9ED/fePWhmVkyMXLQn3J6PjwTCFRp5tEDgXrkBTaTm9oz9bs7jWxhChqlLTqG0zYGqnKg9/mY+FHnTI2j/lXg=="
                     ),
                     var3,
                     var5
                  )
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "5h4HUvNZqXJ0qEpEBa2bOnue5gr87WOqo8GdN5wzbwMdMmn8iuNL1GSTyV70y1TaUg//hcwr/Yu3MTmco6oas/IMDMSNHBWsmyaA/8AOX5zJqkUDMtBeaEhi"
                     ),
                     var3,
                     var5
                  )
               ? Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(668712008, 29)
               : Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 11);
         }

         if (var8) {
            var9 = var9 == 0
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "N0C2Pkux2suwOYDEJ7CaZSIzFAlfI/4amCXWTT/PakVvMujfCe+//2gG6ygsW29iwOt63yT8vSW5lyBolbfVu3q2fMvfdZiM7A7Gw7OB4hiKCWgNOTomMXbpEbynNO/DQOVjKvAJjgEr0zPee4ifkC0JI7qmweXGSiGe/g=="
                     ),
                     var3,
                     var5
                  )
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "2BRnpKlypsSTRkjVwfhjD/T8i4u2fB5JyJ0HcP6KYYgf93fcKRajLd4Dg/UJpMjSRsZDiGwHs9Z6/LIrv7ACMqQQhT3loYDL7Bv6w6hyChjw4+C3rCkL8v/d1OXdNVGSzmmnHcT4"
                     ),
                     var3,
                     var5
                  )
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "5EklmuJWbqdb2X6eEkOZhpPKvenFl24Bw6dRd48UorvK4mIKfW81WfnxNPkf1Njo0jkdQ0ToKbvHNlmaFwIfhr2IGscM1etjRuqFTrrGkvfFiBtxRvGg2QtRHJ5giqAaJXViQLYqv90cBL0ye8c="
                     ),
                     var3,
                     var5
                  )
                  && !this.isInsideShellBlock(
                     var2,
                     Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy(
                        "Vl8AA+JQagX2F9KoEYHPVD3DbcfTy2a3OU3k8ZXrffNo7/CwnMS6wxKy96Rni/m5x2gfENWxbD0BrejCZhus5byzPQ5TSmEg/pLYhPb+gyFkOTwd/Wcr6g=="
                     ),
                     var3,
                     var5
                  )
               ? Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 7)
               : Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1748071030, 28);
         }

         if (var9 == 0) {
            return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 11) != 0;
         } else if (!this.isTimelineKeyframeSelected(var2)) {
            return Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(-2095634586, 0) != 0;
         } else {
            String[] var10001 = new String[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 30)];
            var10001[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 18)] = var2.animationTimelineSelectedTargetId;
            String var10 = this.firstNonBlank(var10001);
            var10001 = new String[Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 21)];
            var10001[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-568060947, 12)] = var2.animationTimelineSelectedRow;
            String var11 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            int var12 = this.clampAnimationTimelineTick(var2.animationTimelineSelectedTick);
            if (!var10.isBlank()
               && (
                  Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("b6+tCxdOpsF9k6BYe6gFp0blaN5X7HXpxACymNq4NTajGk4eS5+PTpq6PDM=").equals(var11)
                     || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("t9em/KUMaGnCJZy6hs7BJvobbkSqTiJ+Q2SwmcUPb6eEAIOVuIU=").equals(var11)
                     || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var11)
                     || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC").equals(var11)
               )) {
               Map var13 = this.resolveRawTargetByTargetId(var2, var10);
               Map var14 = this.readAnimationTimelineRowMap(var13, var11);
               Object var15 = this.readAnimationTimelineTickValue(var14, var12);
               String var16;
               if (var15 instanceof Map var17) {
                  var16 = this.normalizeTimelineInterpMode(
                     this.stringValue(
                        var17.get(Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YrL5bUzioUt6jYu1EC2GhvEDrRonrgETgYjYmPyrY/r645DOyyEqz7Mu5WEQIz1zTtZ/zk3I"))
                     )
                  );
               } else {
                  if (!Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var11)
                        && !Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC").equals(var11)
                     || !(var15 instanceof Number)) {
                     return Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1996424329, 18) != 0;
                  }

                  var16 = Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("fBXMhgmm+3prVjGBNLaB6x7h9CeF66FipDgzL9iIU2UX76u3UJiViQ==");
               }

               String var30 = this.nextTimelineInterpMode(var16);
               LinkedHashMap var18 = this.resolveTimelineSelectedTicksByRow(var2, var10);
               if (var18.isEmpty()) {
                  var18.put(var11, List.of(var12));
               }

               int var19 = Xqedii_nkkc0h9.Xqedii_16wpanvci9for(-1075559749, 6);

               for (Map.Entry var21 : ((Map<?, ?>)var18).entrySet()) {
                  if (var21 != null && var21.getKey() != null && var21.getValue() != null && !((List)var21.getValue()).isEmpty()) {
                     var10001 = new String[Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129180, 6)];
                     var10001[Xqedii_nkkc0h9.Xqedii_2rwl1ddpah451(-1144749443, 9)] = (String)var21.getKey();
                     String var22 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                     if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("b6+tCxdOpsF9k6BYe6gFp0blaN5X7HXpxACymNq4NTajGk4eS5+PTpq6PDM=").equals(var22)
                        || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("t9em/KUMaGnCJZy6hs7BJvobbkSqTiJ+Q2SwmcUPb6eEAIOVuIU=").equals(var22)
                        || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var22)
                        || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC").equals(var22)) {
                        Map var23 = this.readAnimationTimelineRowMap(var13, var22);
                        if (var23 != null && !var23.isEmpty()) {
                           for (Object var25_obj : (List)var21.getValue()) {
                              int var25 = (Integer) var25_obj;
                              Object var26 = this.readAnimationTimelineTickValue(var23, var25);
                              if ((
                                    Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var22)
                                       || Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("eejvUiUjnQiou58nXMdXMi3DVuYcl7w+Uz08vwlQ2CLRxYdIbYySpdsC").equals(var22)
                                 )
                                 && var26 instanceof Number var31) {
                                 if (!Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("fBXMhgmm+3prVjGBNLaB6x7h9CeF66FipDgzL9iIU2UX76u3UJiViQ==").equals(var30)) {
                                    LinkedHashMap var28 = new LinkedHashMap();
                                    if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("5KHg9I8xB2udK6Zp0i3DkOq/HX1fp4R531o7tlqSURJHclty3sf459MkXRA=").equals(var22)) {
                                       var28.put(
                                          Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="),
                                          this.normalizeSidebarRotation(var31.doubleValue())
                                       );
                                    } else {
                                       var28.put(
                                          Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("XDhWDwjqP97GqMJq8lx0UO4I9RmBoFc1lW++EkHt636lapjaWg0="),
                                          this.clampAnimationTimelineOpacityRaw(var31.doubleValue())
                                       );
                                    }

                                    var28.put(
                                       Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YrL5bUzioUt6jYu1EC2GhvEDrRonrgETgYjYmPyrY/r645DOyyEqz7Mu5WEQIz1zTtZ/zk3I"), var30
                                    );
                                    this.removeAnimationTimelineTickValue(var23, var25);
                                    var23.put(Integer.toString(this.clampAnimationTimelineTick(var25)), var28);
                                    var19 = Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764162012, 15);
                                 }
                              } else if (var26 instanceof Map var27) {
                                 String var29 = this.normalizeTimelineInterpMode(
                                    this.stringValue(
                                       var27.get(
                                          Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YrL5bUzioUt6jYu1EC2GhvEDrRonrgETgYjYmPyrY/r645DOyyEqz7Mu5WEQIz1zTtZ/zk3I")
                                       )
                                    )
                                 );
                                 if (!this.equalsNullable(var29, var30)) {
                                    if (Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("fBXMhgmm+3prVjGBNLaB6x7h9CeF66FipDgzL9iIU2UX76u3UJiViQ==").equals(var30)) {
                                       var27.remove(
                                          Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YrL5bUzioUt6jYu1EC2GhvEDrRonrgETgYjYmPyrY/r645DOyyEqz7Mu5WEQIz1zTtZ/zk3I")
                                       );
                                    } else {
                                       var27.put(
                                          Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("YrL5bUzioUt6jYu1EC2GhvEDrRonrgETgYjYmPyrY/r645DOyyEqz7Mu5WEQIz1zTtZ/zk3I"),
                                          var30
                                       );
                                    }

                                    var19 = Xqedii_nkkc0h9.Xqedii_2u3u7nzx59tbm(1920362545, 12);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var19 == 0) {
                  return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129236, 3) != 0;
               } else {
                  var2.timelineRenderedSignature = null;
                  this.recordEditorMutation(var2);
                  this.renderAnimationTimelineKeyframes(var1, var2, var10);
                  this.applyTimelinePositionPreview(var1, var2);
                  this.refreshAfterTimelineSelectionChange(var1, var2);
                  return Xqedii_nkkc0h9.Xqedii_16wpanvci9for(1075559748, 17) != 0;
               }
            } else {
               return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1765177820, 20) != 0;
            }
         }
      } else {
         return Xqedii_nkkc0h9.Xqedii_29bi1tzptdr9c(-1764129244, 1) != 0;
      }
   }

   private static String Xqedii_293zx0sd9p0t6(String string, String string2, String string3) {
      return Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("bIH9WCgVk5FQ+WxZTcMonh+FNddFsYm75LidtIa8RBCLqn8OxoV/BdQX1hKsTh19wSbH0RLE+9s+j5qALH5UGoZ0bIZELDOGk7nTUS3eiHx9Oy9nxZWKYsBg+f9hoJmyb7HHPMpBfA2HlsHh3FaLJM0UEKPKwG4uCJVRJ3fRpg0h3hm16WlcmFR/C0B90BhetKox4bcGGXQdT5H5gw35yhsyjGA3YLj2eQAO0XJ6mknlxw==") + string + Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("Ji9ayleoAkpD67VDDZND1gwNs6vsKxZj7KiuqmJH0q3bbB9gsGZ6eA==") + string2 + Xqedii_nkkc0h9.Xqedii_1k4kgr0mj9kqy("xIhJCtaHUGa0g5OD511YbjbrLy9d9N/kit+WxFR8UjEbrHls") + string3;
   }
}