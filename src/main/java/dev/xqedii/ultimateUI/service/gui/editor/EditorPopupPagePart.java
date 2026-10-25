package dev.xqedii.ultimateUI.service.gui.editor;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1s34vun;
import dev.xqedii.ultimateUI.Xqedii_2mql9fq;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_8hah0r7;
import dev.xqedii.ultimateUI.Xqedii_l2une6g;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateUI.service.gui.model.EditorPropertyField;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSavePopupField;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorSidebarTab;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.input.AnvilInputRequest;
import dev.xqedii.ultimateUI.service.input.InputCloseReason;
import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService;
import dev.xqedii.ultimateUI.util.PlatformCompat;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Vector;

public abstract class EditorPopupPagePart extends EditorRuntimeFilePart {
   public static final String Xqedii_2vdsckz3ect37 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public EditorPopupPagePart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public boolean openEditorMenuFilePopup(Player var1, EditorSession var2, boolean var3) {
      if ((230998550 * (230998550 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.editMode && this.isEditorMenuSession(var2)) {
         ArrayList var4 = new ArrayList();
         Map var5 = this.loadYamlFolder(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU="), var4
         );
         if (!var4.isEmpty()) {
            this.reportYamlIssues(var4);
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "3vRJxoPw+G/fzxpWEoD1p/SRGjGwQ0imUyvWTgNJ9VS4p3pRuusYRj9E+hbBPQ25lJCYjmznlWTTaIzjNlwTyyiabT7uNjki2DgA+kptmrhfkDXWHCSwExvOPtRDkEQXFyv/KUES3S3kuBbSLSRNqa7+8jlu0Rp7Ohm0XX1E5KWqqIadKUF6I0/6YPSuU6fU"
               ),
               new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 8)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 21) != 0);
         } else {
            if (var2.menuTemplateBlocks == null || var2.menuTemplateBlocks.isEmpty()) {
               var2.menuTemplateBlocks = (List<Map<String, Object>>)(var2.rawBlocks == null ? new ArrayList<>() : this.copyBlocks(var2.rawBlocks));
            }

            var2.menuFilePopupImageMode = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26) != 0);
            var2.menuFilePopupEditAction = var3;
            var2.menuFilePopupVisible = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 4) != 0);
            var2.menuFilePopupSelectedPage = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
            var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1) != 0);
            var2.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-8058722103231471380L, 8));
            this.populateMenuFilePopupEntries(var2, var5);
            this.rerenderEditorMenuFilePopup(var1, var2);
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(945072121, 24) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855218125, 11) != 0);
      }
   }

   public boolean openEditorImageFilePopup(Player var1, EditorSession var2) {
      if ((-1513683183 * -1513683183 + -1513683183 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         var2.menuFilePopupImageMode = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18) != 0);
         var2.menuFilePopupEditAction = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12) != 0);
         var2.menuFilePopupVisible = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8) != 0);
         var2.menuFilePopupSelectedPage = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         var2.menuFilePopupScrollOffset = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 0);
         var2.menuFilePopupScrollbarY = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1420294457, 0);
         var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 24) != 0);
         var2.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773450166502L, 60));
         this.populateImageFilePopupEntries(var2);
         this.rerenderEditorMenuFilePopup(var1, var2);
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409063978, 7) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 2) != 0);
      }
   }

   @Override
   public boolean handleRuntimeScrollClick(Player var1, int var2) {
      if ((1263894290 * (1263894290 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != 0) {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && !var3.editMode && this.isEditorMenuSession(var3) && var3.menuFilePopupVisible) {
            double var4 = var3.cursorX + var3.hitboxOffsetX;
            double var6 = var3.cursorY + var3.hitboxOffsetY;
            return this.isEditorMenuHitboxHovered(
                  var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("I/VurlN/RINQdl9yky/gqwa4Wi8y69kag59wCrntsuNgJBRQw27IbrFyX1M4FY29u6OhTttgFcRwYGyy"), var4, var6
               ) && this.handleEditorMenuFilePopupScroll(var1, var3, var2);
         } else {
            return super.handleRuntimeScrollClick(var1, var2);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1666558980, 23) != 0);
      }
   }

   public boolean handleEditorImageFilePopupScroll(Player var1, EditorSession var2, int var3, double var4, double var6) {
      if ((-542810064 * -542810064 - -542810064 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != 0 && this.isEditorImageFilePopupVisible(var2)) {
         return this.isEditorMenuHitboxHovered(
               var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("I/VurlN/RINQdl9yky/gqwa4Wi8y69kag59wCrntsuNgJBRQw27IbrFyX1M4FY29u6OhTttgFcRwYGyy"), var4, var6
            ) && this.handleEditorMenuFilePopupScroll(var1, var2, var3);
      } else {
         return false;
      }
   }

   public boolean handleEditorMenuFilePopupScroll(Player var1, EditorSession var2, int var3) {
      if ((2045764634 ^ 2045764634) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != 0 && var2.menuFilePopupVisible) {
         int var4 = this.resolveMenuFilePopupMaxOffset(var2);
         if (var4 <= 0) {
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30) != 0);
         } else {
            int var5 = Math.max(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8), Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148653, 2));
            int var6 = var3 > 0 ? var5 : -var5;
            int var7 = this.normalizeMenuFilePopupOffset(var2.menuFilePopupScrollOffset + var6, var4);
            if (var7 == var2.menuFilePopupScrollOffset) {
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 14) != 0);
            } else {
               var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719874586, 10) != 0);
               var2.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701534L, 38));
               var2.menuFilePopupScrollOffset = var7;
               var2.menuFilePopupScrollbarY = this.resolveMenuFilePopupScrollbarYFromOffset(var2);
               this.rerenderEditorMenuFilePopup(var1, var2, Xqedii_1s34vun.Xqedii_r62pla0yle6a(211764121, 20));
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 17) != 0);
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 5) != 0);
      }
   }

   public void closeEditorMenuFilePopup(Player var1, EditorSession var2) {
      if ((-54130683 * (-54130683 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.menuFilePopupVisible) {
         boolean var3 = var2.menuFilePopupImageMode;
         var2.menuFilePopupVisible = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9) != 0);
         var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-859936361, 22) != 0);
         var2.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701534L, 9));
         this.rerenderEditorMenuFilePopup(var1, var2);
         if (var3) {
            var2.menuFilePopupImageMode = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-859936361, 22) != 0);
            var2.menuFilePopupSelectedPage = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         }
      }
   }

   public void rerenderEditorMenuFilePopup(Player var1, EditorSession var2) {
      if ((-1232884223 * (-1232884223 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.rerenderEditorMenuFilePopup(var1, var2, Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594625, 4));
      }
   }

   public void rerenderEditorMenuFilePopup(Player var1, EditorSession var2, int var3) {
      if ((1032568437 ^ 1032568437) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (var2.editMode && var2.previewMode && var2.menuFilePopupImageMode) {
            this.rerenderEditorImageFilePopup(var1, var2, var3);
         } else if (this.isMenuFilePopupRenderContext(var2)) {
            int var4 = var2.menuFilePopupTransitionTicksOverride;
            var2.menuFilePopupTransitionTicksOverride = Math.max(Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748159751, 27), var3);

            try {
               this.rebuildEditorMenuFilePopupBlocks(var2);
               var2.lastProcessedHitX = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007124685458801374L, 48));
               var2.lastProcessedHitY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9006702507353473758L, 50));
               this.rerenderEditableContentForTargets(
                  var1,
                  var2,
                  this.resolveMenuFilePopupRerenderTargetIds(var2),
                  (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074329, 1) != 0),
                  (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556030, 6) != 0)
               );
               double var5 = var2.cursorX + var2.hitboxOffsetX;
               double var7 = var2.cursorY + var2.hitboxOffsetY;
               this.updateEditorMenuHoverIcons(var1, var2, var5, var7);
               this.refreshCursorVisualState(var1, var2, var5, var7);
            } finally {
               var2.menuFilePopupTransitionTicksOverride = var4;
            }
         }
      }
   }

   public void rerenderEditorImageFilePopup(Player var1, EditorSession var2, int var3) {
      if ((-19000382 * (-19000382 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode && var2.menuFilePopupImageMode) {
         int var4 = var2.menuFilePopupTransitionTicksOverride;
         var2.menuFilePopupTransitionTicksOverride = Math.max(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29), var3);

         try {
            this.normalizeMenuFilePopupSelection(var2);
            this.normalizeMenuFilePopupScroll(var2);
            this.updateImageFilePopupComponent(var2);
            var2.lastProcessedHitX = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730498639368422L, 39));
            var2.lastProcessedHitY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1249788367488094454L, 5));
            this.rerenderShellAfterWindowToggle(var1, var2);
            double var5 = var2.cursorX + var2.hitboxOffsetX;
            double var7 = var2.cursorY + var2.hitboxOffsetY;
            String var9 = this.resolveMenuFilePopupHoveredHitboxId(var2, var5, var7);
            this.updateMenuFilePopupActionIcons(var1, var2, var9);
            this.refreshCursorVisualState(var1, var2, var5, var7);
         } finally {
            var2.menuFilePopupTransitionTicksOverride = var4;
         }
      }
   }

   public void updateImageFilePopupComponent(EditorSession var1) {
      if ((-940267586 ^ -940267586) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.editMode && var1.previewMode && var1.components != null && !var1.components.isEmpty()) {
         YamlConfiguration var2 = var1.components
            .get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("eyepsl0OydMFj6r2LFufEyrJrXNBKneQV8vD5v64zmJK6vsW8HQudKgijOt8DOngMV2568KDhIZ/ACOPsI+gV+FT/tLu0DL6kRzMlA=="));
         if (var2 != null) {
            YamlConfiguration var3 = this.cloneYamlConfiguration(var2);
            List var4 = this.copyBlocks(var3.getList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q==")));
            if (var4 != null && !var4.isEmpty()) {
               Object var5 = var1.menuFilePopupVisible ? this.buildEditorMenuFilePopupChildren(var1) : new ArrayList();
               this.replaceMenuFilePopupChildren(var4, (List<Map<String, Object>>)var5);
               this.applyMenuFilePopupGridLayout(var4, var1);
               int var6 = var1.menuFilePopupVisible && this.isMenuFilePopupScrollbarVisible(var1)
                  ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 26)
                  : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594641, 4);
               this.setMenuFilePopupBlockEnabledById(
                  var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("c7cIqNZDj0SaMw6Qz67rhtKTEulNcr0LpIWiAFR5rdmihATxFaqM5FnIjhOBe9NDf8lc5A=="), (var6 != 0)
               );
               this.setMenuFilePopupBlockEnabledById(
                  var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("DD8gcRgeojupv4D+OeneTyAgMPzc3JX567XEwRcQnR6F1AEcAZGuhb+VdOF35sOQEbrVXHUx"), (var6 != 0)
               );
               this.setMenuFilePopupBlockEnabledById(
                  var4,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("+tTBlFXDdi43IIjtPCKNaIiMJ8jDBfjkoEbA68dr7Q3VeIv/LpdNXoX6cDBaL+Qe9jvqKwtBjEyoZl1nh7DwUH2vEY7SaQ=="),
                  ((var1.menuFilePopupVisible && var1.menuFilePopupPageKeys.isEmpty()
                     ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 20)
                     : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1437336420, 31)) != 0)
               );
               int var7 = var1.menuFilePopupVisible
                  ? this.clampMenuFilePopupScrollbarY(var1.menuFilePopupScrollbarY)
                  : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2);
               var1.menuFilePopupScrollbarY = var7;
               this.setEditorMenuFilePopupBlockYById(
                  var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("DD8gcRgeojupv4D+OeneTyAgMPzc3JX567XEwRcQnR6F1AEcAZGuhb+VdOF35sOQEbrVXHUx"), var7
               );
               var3.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="), var4);
               var1.components
                  .put(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "eyepsl0OydMFj6r2LFufEyrJrXNBKneQV8vD5v64zmJK6vsW8HQudKgijOt8DOngMV2568KDhIZ/ACOPsI+gV+FT/tLu0DL6kRzMlA=="
                     ),
                     var3
                  );
            }
         }
      }
   }

   public List<String> resolveMenuFilePopupRerenderTargetIds(EditorSession var1) {
      if ((-211847498 ^ -211847498) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else {
            if (var1.renderBlocks != null) {
               for (Map var4 : var1.renderBlocks) {
                  if (var4 != null) {
                     Object var5 = var4.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZdDghZzZXaf+khU6WzJyuq6FQJFBQ7qo+6yAQeJW0Hg="));
                     if (Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "FNb++3jX2P/bxgQ4TXDWkUdTM4AAhkI5sbpKhnnx/V94JloqHvq5tGOQo1lSbAa+utEDaRWOXaxtcdL8hXV+8LS/MRbjzyNsbFIJ0A=="
                        )
                        .equals(var5)) {
                        if (var4.get(
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                           ) instanceof String var7
                           && !var7.isBlank()) {
                           var2.add(var7);
                        }
                        break;
                     }
                  }
               }
            }

            if (var2.isEmpty()) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 12)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454733153, 18)] = this.runtimeElementId(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("FNb++3jX2P/bxgQ4TXDWkUdTM4AAhkI5sbpKhnnx/V94JloqHvq5tGOQo1lSbAa+utEDaRWOXaxtcdL8hXV+8LS/MRbjzyNsbFIJ0A==")
               );
               String var8 = this.firstNonBlank(var10001);
               if (!var8.isBlank()) {
                  var2.add(var8);
               }
            }

            return var2;
         }
      }
   }

   public void handleEditorMenuFilePopupClick(Player var1, EditorSession var2, double var3, double var5) {
      if (((2021335377 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.menuFilePopupVisible) {
         if (this.isEditorMenuHitboxHovered(
            var2,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "PS0qO6Lo5alIOW8J4G432JsC/CZXOKOmgoZZ+55YU2XI9FW3lZJJx2qb1a4crJ3lxuS96+yVai6VADSjSMQH1UdC/Df0oSdLYOAD3qFPMAHrgwFy43JwqpFQeLr+6A=="
            ),
            var3,
            var5
         )) {
            this.closeEditorMenuFilePopup(var1, var2);
         } else if (!this.isEditorMenuHitboxHovered(
            var2,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "axMVvbYdiDVJfdBprennJBfACP3lch2S2m80GfVgHdSjBNxKeuKc4Xqd6mqz5PK+Yd+F/l9Dmza+VcroLs4gTk29FA3NNZomAqion7JeVoFBvG2nkd4Ligilyzu04t7z"
            ),
            var3,
            var5
         )) {
            int var7 = this.resolveMenuFilePopupVisibleCount(var2);

            for (int var8 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210453401, 18); var8 <= var7; var8++) {
               String var9 = this.buildMenuFilePopupEntryHitboxId(var8);
               if (this.isEditorMenuHitboxHovered(var2, var9, var3, var5)) {
                  String var10 = this.resolveMenuFilePopupPageAtSlot(var2, var8);
                  if (var10 != null && !var10.isBlank()) {
                     String var11 = this.normalizePageKey(var10, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
                     if (!var11.equalsIgnoreCase(
                        this.normalizePageKey(var2.menuFilePopupSelectedPage, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="))
                     )) {
                        var2.menuFilePopupSelectedPage = var11;
                        this.rerenderEditorMenuFilePopup(var1, var2);
                     }

                     return;
                  }

                  return;
               }
            }

            if (this.isMenuFilePopupScrollbarVisible(var2)) {
               if (this.isEditorMenuHitboxHovered(
                  var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("DD8gcRgeojupv4D+OeneTyAgMPzc3JX567XEwRcQnR6F1AEcAZGuhb+VdOF35sOQEbrVXHUx"), var3, var5
               )) {
                  EditorRect var21 = this.getEditorMenuHitboxBounds(
                     var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("DD8gcRgeojupv4D+OeneTyAgMPzc3JX567XEwRcQnR6F1AEcAZGuhb+VdOF35sOQEbrVXHUx")
                  );
                  if (var21 != null) {
                     double var23 = this.toLogicalCursorY(var2, var5);
                     var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24) != 0);
                     var2.menuFilePopupScrollbarDragOffsetY = var23 - var21.y;
                  }
               } else {
                  if (this.isEditorMenuHitboxHovered(
                     var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("c7cIqNZDj0SaMw6Qz67rhtKTEulNcr0LpIWiAFR5rdmihATxFaqM5FnIjhOBe9NDf8lc5A=="), var3, var5
                  )) {
                     EditorRect var20 = this.getEditorMenuHitboxBounds(
                        var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("c7cIqNZDj0SaMw6Qz67rhtKTEulNcr0LpIWiAFR5rdmihATxFaqM5FnIjhOBe9NDf8lc5A==")
                     );
                     EditorRect var22 = this.getEditorMenuHitboxBounds(
                        var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("DD8gcRgeojupv4D+OeneTyAgMPzc3JX567XEwRcQnR6F1AEcAZGuhb+VdOF35sOQEbrVXHUx")
                     );
                     if (var20 == null) {
                        return;
                     }

                     double var24 = this.toLogicalCursorY(var2, var5);
                     double var12 = var22 == null
                        ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(2329299867246608857L, 9))
                        : var22.height / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(216238933260074274L, 1));
                     double var14 = var24 - var20.y - var12;
                     int var16 = this.clampMenuFilePopupScrollbarY((int)Math.round(var14));
                     int var17 = this.resolveMenuFilePopupOffsetFromScrollbarY(var2, var16);
                     int var18 = var17 != var2.menuFilePopupScrollOffset
                        ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556094, 6)
                        : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 1);
                     int var19 = var16 != var2.menuFilePopupScrollbarY
                        ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3)
                        : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 2);
                     var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476839340, 8) != 0);
                     var2.menuFilePopupScrollbarDragOffsetY = var24 - var20.y - var16;
                     if (var18 != 0 || var19 != 0) {
                        var2.menuFilePopupScrollbarY = var16;
                        if (var18 != 0) {
                           var2.menuFilePopupScrollOffset = var17;
                        }

                        this.rerenderEditorMenuFilePopup(var1, var2);
                     }
                  }
               }
            }
         } else if (this.hasEditorMenuFilePopupSelection(var2)) {
            this.handleEditorMenuFilePopupConfirm(var1, var2);
         }
      }
   }

   public boolean handleEditorMenuFilePopupConfirm(Player var1, EditorSession var2) {
      if ((1078253822 * 1078253822 + 1078253822 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || !var2.menuFilePopupVisible) {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29) != 0);
      } else if (this.isEditorImageFilePopupMode(var2)) {
         return this.handleEditorImageFilePopupConfirm(var1, var2);
      } else {
         String var3 = this.normalizePageKey(var2.menuFilePopupSelectedPage, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         if (var3.isBlank()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("VqQGEUIO3HInO5XfqumJagQ+u0M82DfIYNbXDVsXQF0at2TIcbLR2b/b7aTtkbMduyVnqeUdwq5i/xYaXL4ORzRqrLM="),
               new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719872721, 23)]
            );
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20) != 0);
         } else {
            boolean var4 = var2.menuFilePopupEditAction
               ? this.openGui(
                  var1, var3, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 8) != 0), (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1310009854, 22) != 0)
               )
               : this.openGui(
                  var1, var3, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 14) != 0), (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 16) != 0)
               );
            if (!var4) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100376116, 30) != 0);
            } else {
               if (var2.menuFilePopupEditAction) {
                  this.playEditorSfx(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("+GdGN2EXO5/9QgNSnIq3GIOjiC/dt3CMfnJzwXyjqxce71+mfs9Cb5WkU3daMYHIRBJ5+8WY"));
               }

               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874821, 4) != 0);
            }
         }
      }
   }

   public boolean handleEditorImageFilePopupConfirm(Player var1, EditorSession var2) {
      if ((1928362918 ^ 1928362918) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && this.isEditorImageFilePopupMode(var2)) {
         String var3 = this.normalizePageKey(var2.menuFilePopupSelectedPage, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         if (var3.isBlank()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("TFuiYEnasbf/fbRXJTsWIib90ieaCMrfbQtNZdKWa56cdFBl39aArZsOEM4fmNx7i1SVvd1ScUCzV8w0djq1oO/RaQJm7Z0P"),
               new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 22) != 0);
         } else {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327643, 0)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217622, 5)] = var2.menuFilePopupCommands.get(var3);
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28437207, 14)] = var3;
            String var4 = this.firstNonBlank(var10001);
            UiImageAtlasService.GeneratedImage var5 = this.plugin == null ? null : this.plugin.resolveGeneratedUiImageForEditor(var4);
            if (var5 == null) {
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "MRk+2jmHgrrR8KWCGTzRJhnKZ0naNKkLV+h5TQsXIkdXY+juZWhytO1YW56p42PWBeOKyfMbJs82FijN8A7P8j1f6pcxD4C2V2FErtkv7cEVFKrZXTx5+2kssj0hvbrBF8VMiE9yXjGXTU/Eofu5hycm"
               );
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 19)];
               var10003[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476839084, 8)] = var4;
               this.sendEditorError(var1, var10002, var10003);
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 20) != 0);
            } else {
               boolean var6 = this.insertTemporaryImageElement(var1, var5.name(), var5.width(), var5.height(), var5.glyphMatrix());
               if (!var6) {
                  this.sendEditorError(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "nub2S9tE1wfWho1sT7YYLxaXHUGfAqMC56bvUR1/Q4vfZIJ7p7JLmP0N9xRrr5PKXqyrL42RjuD2nYUdvCkpA2EHdkhUNeCZCW2QuMJSW2rZrUzgmPEWSpNXNp3YjIwk754Y5PgSgFiUKw=="
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 30)]
                  );
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 25) != 0);
               } else {
                  this.closeEditorMenuFilePopup(var1, var2);
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0);
               }
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-429968181, 21) != 0);
      }
   }

   public void handleMenuFilePopupCursorMove(Player var1, EditorSession var2, double var3, double var5) {
      if ((125024405 * (125024405 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.menuFilePopupVisible) {
         if (var2.menuFilePopupScrollbarDragActive) {
            if (this.isLeftHeld(var2) && this.isMenuFilePopupScrollbarVisible(var2)) {
               EditorRect var7 = this.getEditorMenuHitboxBounds(
                  var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("c7cIqNZDj0SaMw6Qz67rhtKTEulNcr0LpIWiAFR5rdmihATxFaqM5FnIjhOBe9NDf8lc5A==")
               );
               if (var7 == null) {
                  var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2) != 0);
               } else {
                  double var8 = this.toLogicalCursorY(var2, var5);
                  double var10 = var8 - var7.y - var2.menuFilePopupScrollbarDragOffsetY;
                  int var12 = this.clampMenuFilePopupScrollbarY((int)Math.round(var10));
                  int var13 = this.resolveMenuFilePopupOffsetFromScrollbarY(var2, var12);
                  int var14 = var13 != var2.menuFilePopupScrollOffset
                     ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(211764121, 20)
                     : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 5);
                  int var15 = var12 != var2.menuFilePopupScrollbarY
                     ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22)
                     : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748189591, 14);
                  if (var14 != 0 || var15 != 0) {
                     var2.menuFilePopupScrollbarY = var12;
                     if (var14 != 0) {
                        var2.menuFilePopupScrollOffset = var13;
                     }

                     this.rerenderEditorMenuFilePopup(var1, var2);
                  }
               }
            } else {
               var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28420823, 14) != 0);
               var2.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773450166502L, 4));
            }
         }
      } else {
         if (var2 != null) {
            var2.menuFilePopupScrollbarDragActive = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597295590, 29) != 0);
         }
      }
   }

   @Override
   public boolean handleEditorMenuClick(Player var1, EditorSession var2, GuiService.ClickType var3) {
      if ((1061732417 * 1061732417 + 1061732417 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         double var4 = var2.cursorX + var2.hitboxOffsetX;
         double var6 = var2.cursorY + var2.hitboxOffsetY;
         long var8 = Xqedii_38o2zes.Xqedii_316oplq();
         int var10 = var8 - var2.lastLeftClickTick <= Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-5495125218807338350L, 50)
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1029357623, 27)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17);
         if (var2.menuFilePopupVisible) {
            if (var3 == GuiService.ClickType.LEFT) {
               var2.lastLeftClickTick = var8;
               if (var10 == 0) {
                  this.handleEditorMenuFilePopupClick(var1, var2, var4, var6);
               }

               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210529, 2) != 0);
            } else {
               return ((var3 == GuiService.ClickType.RIGHT
                  ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(798620883, 15)
                  : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1428815438, 30)) != 0);
            }
         } else if (var3 == GuiService.ClickType.LEFT
            && this.isEditorMenuHitboxHovered(
               var2,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("D02tx24lp2sjUz4hvxnbcb0f5Rb9VRP7DpWx48WSPK11C3Vzni8Yez143Ijdt2QinWYzTWBpMo/8FhfOzqdw/ShPocCRQah2plQ="),
               var4,
               var6
            )) {
            var2.lastLeftClickTick = var8;
            if (var10 != 0) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719873562, 10) != 0);
            } else {
               this.plugin.closeUiForPlayer(var1);
               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217654, 5) != 0);
            }
         } else if (var3 == GuiService.ClickType.LEFT
            && this.isEditorMenuHitboxHovered(
               var2,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "QWtQpAhMC8qjTcAbS8aVeKFfZ5t/u56ohB6QJYWlZQ11rYnXsDZToQMIsBijMvv0A98Mr6F/NT3yatJQ/xM7r9X7j9EeD11VaoS+EfFVcy03zXE0m0SZggFgBg8="
               ),
               var4,
               var6
            )) {
            var2.lastLeftClickTick = var8;
            return var10 == 0 && this.openBlankEditorFromMenu(var1, var2);
         } else if (var3 == GuiService.ClickType.LEFT
            && this.isEditorMenuHitboxHovered(
               var2,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "FxhgTveG4LYoZpQ5gsWfTU0hXS5orwLLFAup4mT3gT1LDAq+/TNUTsvyJnV3E6IYPcPdVwHG3LfvKQYFqPcClNTDsOJL5uHaInETwi77muOOUxXnCrMHBg=="
               ),
               var4,
               var6
            )) {
            var2.lastLeftClickTick = var8;
            return var10 == 0 && this.openEditorMenuFilePopup(var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210584473, 17) != 0));
         } else if (var3 == GuiService.ClickType.LEFT
            && this.isEditorMenuHitboxHovered(
               var2,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "Ilct8kzf7NtBBohMbkj1qDzZZan2PbRTxs9LdVt5iZ4oP6k95KRSfjYlQLTFzBCk2/zAEFjmfwOymkZD1UKm1bSr8ni2fFG7F79G4uq3cTyLS8Ft2YQb1Q=="
               ),
               var4,
               var6
            )) {
            var2.lastLeftClickTick = var8;
            return var10 == 0 && this.openEditorMenuFilePopup(var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 26) != 0));
         } else if (var3 != GuiService.ClickType.RIGHT) {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855218125, 11) != 0);
         } else {
            return ((!this.isEditorMenuHitboxHovered(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "FxhgTveG4LYoZpQ5gsWfTU0hXS5orwLLFAup4mT3gT1LDAq+/TNUTsvyJnV3E6IYPcPdVwHG3LfvKQYFqPcClNTDsOJL5uHaInETwi77muOOUxXnCrMHBg=="
                     ),
                     var4,
                     var6
                  )
                  && !this.isEditorMenuHitboxHovered(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "QWtQpAhMC8qjTcAbS8aVeKFfZ5t/u56ohB6QJYWlZQ11rYnXsDZToQMIsBijMvv0A98Mr6F/NT3yatJQ/xM7r9X7j9EeD11VaoS+EfFVcy03zXE0m0SZggFgBg8="
                     ),
                     var4,
                     var6
                  )
                  && !this.isEditorMenuHitboxHovered(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "Ilct8kzf7NtBBohMbkj1qDzZZan2PbRTxs9LdVt5iZ4oP6k95KRSfjYlQLTFzBCk2/zAEFjmfwOymkZD1UKm1bSr8ni2fFG7F79G4uq3cTyLS8Ft2YQb1Q=="
                     ),
                     var4,
                     var6
                  )
                  && !this.isEditorMenuHitboxHovered(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("D02tx24lp2sjUz4hvxnbcb0f5Rb9VRP7DpWx48WSPK11C3Vzni8Yez143Ijdt2QinWYzTWBpMo/8FhfOzqdw/ShPocCRQah2plQ="),
                     var4,
                     var6
                  )
               ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9)
               : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 31)) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-214984091, 20) != 0);
      }
   }

   @Override
   public void updateEditorMenuHoverIcons(Player var1, EditorSession var2, double var3, double var5) {
      if ((-789182518 * (-789182518 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var7 = this.resolveEditorMenuHoveredHitboxId(var2, var3, var5);
         this.updateMenuFilePopupActionIcons(var1, var2, var7);
         if (!this.equalsNullable(var2.hoveredElementId, var7)) {
            var2.hoveredElementId = var7;
            this.setHudTextIfExists(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("aDaKhm/3oI+eXKJnwvAv1svvw/K/oA97406zcpIy1zXlvyto3p0C/fHkPxG71rkiarVrUQ+yc6aaOIB0XB21bRyb6J206jfmCjM="),
               this.withEditorUiFont(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "FxhgTveG4LYoZpQ5gsWfTU0hXS5orwLLFAup4mT3gT1LDAq+/TNUTsvyJnV3E6IYPcPdVwHG3LfvKQYFqPcClNTDsOJL5uHaInETwi77muOOUxXnCrMHBg=="
                        )
                        .equals(var7)
                     ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("7d2KF9VBj+2l08mho+4AR18cxZFGvNwMpw0ccEeV")
                     : Xqedii_1s34vun.Xqedii_997tx7qg1fze("gBVVlNWyDrTFYYZYLrVW2uPR48Y2Fw8NvN/rG1iG")
               )
            );
            this.setHudTextIfExists(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("ELozt6SfcmzbVA+Qq5FU6mb0TuPZceFGW4r4ziNxrVXPqCi/VcSO2aBjtoBBuXDhRkab0wSGJoF+3Sh1pFZZEHJS+pKcsY2g/B4O0n+B"),
               this.withEditorUiFont(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "QWtQpAhMC8qjTcAbS8aVeKFfZ5t/u56ohB6QJYWlZQ11rYnXsDZToQMIsBijMvv0A98Mr6F/NT3yatJQ/xM7r9X7j9EeD11VaoS+EfFVcy03zXE0m0SZggFgBg8="
                        )
                        .equals(var7)
                     ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("DnfoT3Nb+RNXJ8/icxCwZVRDLaDg3KRMvj3mj3jY")
                     : Xqedii_1s34vun.Xqedii_997tx7qg1fze("wjZw5Q/rBceLAa1H4/DOwbZQH2YN73BIvRtTt+yq")
               )
            );
            this.setHudTextIfExists(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("M5HwNWFzmY0OhoSpmGvgso4lJ7JHgnbA2/j+/IUqLY7F9jXeOV9As1S0ufLW9Y55K7zrAVPB3Xr9SKg3NLvKCzkci8YmXQZJR70="),
               this.withEditorUiFont(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "Ilct8kzf7NtBBohMbkj1qDzZZan2PbRTxs9LdVt5iZ4oP6k95KRSfjYlQLTFzBCk2/zAEFjmfwOymkZD1UKm1bSr8ni2fFG7F79G4uq3cTyLS8Ft2YQb1Q=="
                        )
                        .equals(var7)
                     ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("SzNJsucjDHrQrWo7SzhEeYJYarFqYU9HM6HXLadb")
                     : Xqedii_1s34vun.Xqedii_997tx7qg1fze("i6tEEm8hmL+EOTDvnt3NqhkQlVz+MI2X7pKAIhxa")
               )
            );
         }
      }
   }

   @Override
   public void updateMenuFilePopupActionIcons(Player var1, EditorSession var2, String var3) {
      if (((-742097806 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.menuFilePopupVisible) {
         boolean var4 = this.hasEditorMenuFilePopupSelection(var2);
         int var5 = var4
               && Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "axMVvbYdiDVJfdBprennJBfACP3lch2S2m80GfVgHdSjBNxKeuKc4Xqd6mqz5PK+Yd+F/l9Dmza+VcroLs4gTk29FA3NNZomAqion7JeVoFBvG2nkd4Ligilyzu04t7z"
                  )
                  .equals(var3)
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28)
            : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 16);
         boolean var6 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "PS0qO6Lo5alIOW8J4G432JsC/CZXOKOmgoZZ+55YU2XI9FW3lZJJx2qb1a4crJ3lxuS96+yVai6VADSjSMQH1UdC/Df0oSdLYOAD3qFPMAHrgwFy43JwqpFQeLr+6A=="
            )
            .equals(var3);
         String var7 = var4
            ? (
               var5 != 0
                  ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("strKA4kFd/Ufg8PZz+aoVSt2t30VVB73vipKkbll")
                  : Xqedii_1s34vun.Xqedii_997tx7qg1fze("xeZCosMOEBhy2g5rGZm2OJ6Ei91uIPpkVegEEZt6")
            )
            : Xqedii_1s34vun.Xqedii_997tx7qg1fze("ff1MBmqATDPHHilvVHgCZqOlSk0uc4ujiwlbViJP");
         if (this.isEditorImageFilePopupMode(var2)) {
            this.setShellText(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "GynPWjb+dlSWWmzy7mgxtTuQuZU/nd1b3I3P+NgUQ4SQ8YTTRTc9t7FmnN2mnv39DJhuez5/guY8qDauxo6iUI44tGto46xmpXKRlg2XGt2HOw=="
               ),
               this.withEditorUiFont(var7)
            );
            this.setShellText(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "xQPaPl9jL+7pHyyROVdJaAFQvc3LKLeeVV3YYG9iJR4hjEQJUfsPlZj6Xl1BX9NCScZDtwl4rIpC8GgNjG0cYLNgyo4d5zydoacP28YO7ic="
               ),
               this.withEditorUiFont(
                  var6
                     ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("WcI0CwDj3dZz44GGKLk4BhJFLnF4sWg3hF/TMwa0")
                     : Xqedii_1s34vun.Xqedii_997tx7qg1fze("KPed1H642eEPB/l0uIoDwMW6XF7FIqyh4brjMhEq")
               )
            );
         } else {
            this.setHudTextIfExists(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "GynPWjb+dlSWWmzy7mgxtTuQuZU/nd1b3I3P+NgUQ4SQ8YTTRTc9t7FmnN2mnv39DJhuez5/guY8qDauxo6iUI44tGto46xmpXKRlg2XGt2HOw=="
               ),
               this.withEditorUiFont(var7)
            );
            this.setHudTextIfExists(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "xQPaPl9jL+7pHyyROVdJaAFQvc3LKLeeVV3YYG9iJR4hjEQJUfsPlZj6Xl1BX9NCScZDtwl4rIpC8GgNjG0cYLNgyo4d5zydoacP28YO7ic="
               ),
               this.withEditorUiFont(
                  var6
                     ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("WcI0CwDj3dZz44GGKLk4BhJFLnF4sWg3hF/TMwa0")
                     : Xqedii_1s34vun.Xqedii_997tx7qg1fze("KPed1H642eEPB/l0uIoDwMW6XF7FIqyh4brjMhEq")
               )
            );
         }
      }
   }

   public String resolveEditorMenuHoveredHitboxId(EditorSession var1, double var2, double var4) {
      if ((-1747569780 * -1747569780 + -1747569780 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.menuFilePopupVisible) {
         return this.resolveMenuFilePopupHoveredHitboxId(var1, var2, var4);
      } else if (this.isEditorMenuHitboxHovered(
         var1,
         Xqedii_1s34vun.Xqedii_997tx7qg1fze("D02tx24lp2sjUz4hvxnbcb0f5Rb9VRP7DpWx48WSPK11C3Vzni8Yez143Ijdt2QinWYzTWBpMo/8FhfOzqdw/ShPocCRQah2plQ="),
         var2,
         var4
      )) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("D02tx24lp2sjUz4hvxnbcb0f5Rb9VRP7DpWx48WSPK11C3Vzni8Yez143Ijdt2QinWYzTWBpMo/8FhfOzqdw/ShPocCRQah2plQ=");
      } else if (this.isEditorMenuHitboxHovered(
         var1,
         Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "FxhgTveG4LYoZpQ5gsWfTU0hXS5orwLLFAup4mT3gT1LDAq+/TNUTsvyJnV3E6IYPcPdVwHG3LfvKQYFqPcClNTDsOJL5uHaInETwi77muOOUxXnCrMHBg=="
         ),
         var2,
         var4
      )) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "FxhgTveG4LYoZpQ5gsWfTU0hXS5orwLLFAup4mT3gT1LDAq+/TNUTsvyJnV3E6IYPcPdVwHG3LfvKQYFqPcClNTDsOJL5uHaInETwi77muOOUxXnCrMHBg=="
         );
      } else if (this.isEditorMenuHitboxHovered(
         var1,
         Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "QWtQpAhMC8qjTcAbS8aVeKFfZ5t/u56ohB6QJYWlZQ11rYnXsDZToQMIsBijMvv0A98Mr6F/NT3yatJQ/xM7r9X7j9EeD11VaoS+EfFVcy03zXE0m0SZggFgBg8="
         ),
         var2,
         var4
      )) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "QWtQpAhMC8qjTcAbS8aVeKFfZ5t/u56ohB6QJYWlZQ11rYnXsDZToQMIsBijMvv0A98Mr6F/NT3yatJQ/xM7r9X7j9EeD11VaoS+EfFVcy03zXE0m0SZggFgBg8="
         );
      } else {
         return this.isEditorMenuHitboxHovered(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "Ilct8kzf7NtBBohMbkj1qDzZZan2PbRTxs9LdVt5iZ4oP6k95KRSfjYlQLTFzBCk2/zAEFjmfwOymkZD1UKm1bSr8ni2fFG7F79G4uq3cTyLS8Ft2YQb1Q=="
               ),
               var2,
               var4
            )
            ? Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "Ilct8kzf7NtBBohMbkj1qDzZZan2PbRTxs9LdVt5iZ4oP6k95KRSfjYlQLTFzBCk2/zAEFjmfwOymkZD1UKm1bSr8ni2fFG7F79G4uq3cTyLS8Ft2YQb1Q=="
            )
            : null;
      }
   }

   @Override
   public boolean isEditorMenuHitboxHovered(EditorSession var1, String var2, double var3, double var5) {
      if (((1813341017 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var2.isBlank()) {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597295590, 29) != 0);
      } else if (this.isEditorImageFilePopupVisible(var1)) {
         double var16 = var1.shellHitX(var3);
         double var9 = var1.shellHitY(var5);
         return ((!this.isInsideShellBlock(var1, var2, var3, var5) && !this.isInsideShellBlock(var1, var2, var16, var9)
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1790279789, 28)
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 31)) != 0);
      } else {
         EditorRect var7 = this.getEditorMenuHitboxBounds(var1, var2);
         if (var7 != null
            && !(var7.width <= Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701534L, 42)))
            && !(var7.height <= Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773450166502L, 14)))) {
            double var8 = this.toRenderX(var1, var7.x);
            double var10 = this.toRenderY(var1, var7.y);
            double var12 = var8 + this.toRenderSize(var1, var7.width);
            double var14 = var10 + this.toRenderSize(var1, var7.height);
            return ((var3 >= var8 && var3 <= var12 && var5 >= var10 && var5 <= var14
               ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(214909849, 22)
               : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 17)) != 0);
         } else {
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 9) != 0);
         }
      }
   }

   @Override
   public EditorRect getEditorMenuHitboxBounds(EditorSession var1, String var2) {
      if ((-1345311807 * -1345311807 + -1345311807 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         if (this.isEditorImageFilePopupVisible(var1)) {
            return this.findShellBlockRect(var1, var2);
         } else {
            EditorRect var3 = null;

            for (HoverElement var5 : var1.elements) {
               if (this.matchesEditorMenuHitbox(var1, var5, var2)) {
                  var3 = this.mergeBounds(var3, this.getElementBounds(var5));
               }
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public boolean matchesEditorMenuHitbox(EditorSession var1, HoverElement var2, String var3) {
      if (((-522056638 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10)];
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2)] = var2.id;
         String var4 = this.firstNonBlank(var10001);
         if (!var3.equals(var4) && !this.runtimeElementId(var1, var3).equals(var4)) {
            var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 23)];
            var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 15)] = this.targetIdOf(var2);
            String var5 = this.firstNonBlank(var10001);
            return var3.equals(var5);
         } else {
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 24) != 0);
      }
   }

   @Override
   public boolean isEditorMenuSession(EditorSession var1) {
      if ((804557987 * 804557987 - 804557987 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594641, 4) != 0);
      } else {
         String var10000 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("OysgjDmdul+cPvn8Ck8MsSn0JUSc6Ni6Oi+QOx9VLCygPU2s+VFv5q2xZ/TeitB1ts0=");
         String[] var10002 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 6)];
         var10002[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1)] = var1.pageName;
         return var10000.equalsIgnoreCase(this.firstNonBlank(var10002).trim());
      }
   }

   public void syncComponentHoverState(Player var1, EditorSession var2) {
      if (((-417773729 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.editMode) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476839340, 8)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4)] = var2.hoveredElementId;
         String var3 = this.firstNonBlank(var10001);
         int var4 = !var3.isBlank() && var2.componentHoverCapableTargets.contains(var3)
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113748825, 16)
            : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 14);
         int var5 = var4 != 0
            ? (
               var2.componentHoverTargets.size() == Xqedii_1s34vun.Xqedii_z5j381o3pwva(855220173, 11) && var2.componentHoverTargets.contains(var3)
                  ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 6)
                  : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 18)
            )
            : (var2.componentHoverTargets.isEmpty() ? 1 : 0);
         if (var5 == 0) {
            var2.componentHoverTargets.clear();
            if (var4 != 0) {
               var2.componentHoverTargets.add(var3);
            }

            this.renderPage(var1, var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-909990593, 19) != 0));
         }
      }
   }

   @Override
   public void onCursorMove(Player var1, double var2, double var4) {
      if ((998194142 * 998194142 - 998194142 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var6 = this.editorSessions.get(var1.getUniqueId());
         if (var6 != null && !var6.editMode) {
            var6.cursorX = var2;
            var6.cursorY = var4;
            if (!this.isEditorMenuSession(var6)) {
               double var7 = var2 + var6.hitboxOffsetX;
               double var9 = var4 + var6.hitboxOffsetY;
               if (this.isSkinMouseSpinActive(var6)) {
                  if (this.isLeftHeld(var6)) {
                     this.updateSkinMouseSpinDrag(var1, var6, var7, var9);
                  } else {
                     this.stopSkinMouseSpin(var1, var6);
                  }

                  this.refreshCursorVisualState(var1, var6, var7, var9);
                  return;
               }

               if (var6.previewPanActive) {
                  if (this.isLeftHeld(var6)) {
                     this.updatePreviewPan(var1, var6, var7, var9);
                  } else {
                     var6.previewPanActive = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 15) != 0);
                     this.animatePreviewPanBackToBounds(var1, var6, var7, var9);
                  }

                  this.refreshCursorVisualState(var1, var6, var7, var9);
                  return;
               }

               HoverElement var11 = this.findHoveredRuntimeElement(var6, var7, var9);
               String var10000;
               if (var11 == null) {
                  var10000 = null;
               } else {
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(212812697, 20)];
                  var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597295590, 29)] = this.targetIdOf(var11);
                  var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074329, 1)] = var11.targetId;
                  var10000 = this.firstNonBlank(var10001);
               }

               String var12 = var10000;
               if (!this.equalsNullable(var6.hoveredElementId, var12)) {
                  this.updateHoveredHighlight(var1, var6, var6.hoveredElementId, var12);
                  var6.hoveredElementId = var12;
               }

               this.syncComponentHoverState(var1, var6);
            }
         }

         if (var6 != null && !var6.editMode && this.isEditorMenuSession(var6)) {
            var6.cursorX = var2;
            var6.cursorY = var4;
            double var15 = var2 + var6.hitboxOffsetX;
            double var17 = var4 + var6.hitboxOffsetY;
            if (Double.isFinite(var6.lastProcessedHitX)
               && Double.isFinite(var6.lastProcessedHitY)
               && Math.abs(var15 - var6.lastProcessedHitX) < Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-1826245465171157334L, 53))
               && Math.abs(var17 - var6.lastProcessedHitY) < Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(3418567051608565417L, 34))) {
               this.refreshCursorVisualState(var1, var6, var15, var17);
            } else {
               var6.lastProcessedHitX = var15;
               var6.lastProcessedHitY = var17;
               this.handleMenuFilePopupCursorMove(var1, var6, var15, var17);
               this.updateEditorMenuHoverIcons(var1, var6, var15, var17);
               this.refreshCursorVisualState(var1, var6, var15, var17);
            }
         } else {
            if (var6 != null && var6.editMode && var6.previewMode) {
               var6.cursorX = var2;
               var6.cursorY = var4;
               double var13 = var2 + var6.hitboxOffsetX;
               double var16 = var4 + var6.hitboxOffsetY;
               int var18 = Double.isFinite(var6.lastProcessedHitX)
                     && Double.isFinite(var6.lastProcessedHitY)
                     && !(Math.abs(var13 - var6.lastProcessedHitX) >= Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(-1140880303896998257L, 63)))
                     && !(Math.abs(var16 - var6.lastProcessedHitY) >= Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(3577272565942943235L, 3)))
                  ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556030, 6)
                  : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719873562, 10);
               if (this.isEditorImageFilePopupVisible(var6)) {
                  if (var18 != 0) {
                     var6.lastProcessedHitX = var13;
                     var6.lastProcessedHitY = var16;
                     this.handleMenuFilePopupCursorMove(var1, var6, var13, var16);
                     String var19 = this.resolveMenuFilePopupHoveredHitboxId(var6, var13, var16);
                     this.updateMenuFilePopupActionIcons(var1, var6, var19);
                  }

                  this.refreshCursorVisualState(var1, var6, var13, var16);
                  return;
               }

               if (var18 != 0) {
                  this.updateCursorPageDropdownHover(var1, var6, var13, var16);
                  this.updateCursorLayersDropdownHover(var1, var6, var13, var16);
               }

               if (this.handleActivePagesCursorMove(var1, var6, var13, var16)) {
                  this.refreshCursorVisualState(var1, var6, var13, var16);
                  return;
               }
            }

            super.onCursorMove(var1, var2, var4);
            EditorSession var14 = this.editorSessions.get(var1.getUniqueId());
            if (var14 != null) {
               double var8 = var2 + var14.hitboxOffsetX;
               double var10 = var4 + var14.hitboxOffsetY;
               this.refreshCursorVisualState(var1, var14, var8, var10);
            }
         }
      }
   }

   @Override
   public void refreshCursorVisualState(Player var1, EditorSession var2, double var3, double var5) {
      if ((-1048543564 * (-1048543564 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         int var7 = this.resolveCursorVisualStateHash(var2);
         String var8;
         if (this.isCursorVisualCacheHit(var2, var3, var5, var7)) {
            var8 = this.cursorUnicodeValue(
               var2.lastCursorVisualDesiredUnicode,
               this.cursorUnicodeValue(var2.cursorDefaultUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78"))
            );
         } else {
            var8 = this.cursorUnicodeValue(
               this.resolveCursorVisualUnicode(var2, var3, var5),
               this.cursorUnicodeValue(var2.cursorDefaultUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78"))
            );
            var2.lastCursorVisualHitX = var3;
            var2.lastCursorVisualHitY = var5;
            var2.lastCursorVisualStateHash = var7;
            var2.lastCursorVisualDesiredUnicode = var8;
         }

         if (!this.equalsNullable(var2.cursorRuntimeUnicode, var8)) {
            var2.cursorRuntimeUnicode = var8;
         }

         // The cursor HUD may not exist on the first refresh after opening the editor.
         // Retry applying the visual on later pointer updates; applyCursorVisualUnicode
         // already avoids sending an update when the displayed text is unchanged.
         this.applyCursorVisualUnicode(var1, var2, var8);
      }
   }

   public boolean isCursorVisualCacheHit(EditorSession var1, double var2, double var4, int var6) {
      if (((-2014173472 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && Double.isFinite(var1.lastCursorVisualHitX)
         && Double.isFinite(var1.lastCursorVisualHitY)
         && var1.lastCursorVisualDesiredUnicode != null) {
         return ((Math.abs(var2 - var1.lastCursorVisualHitX) < Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(-8683969544320426011L, 10))
               && Math.abs(var4 - var1.lastCursorVisualHitY) < Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(8205418661519924355L, 41))
               && var1.lastCursorVisualStateHash == var6
            ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210719641, 12)
            : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 26)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 1) != 0);
      }
   }

   public int resolveCursorVisualStateHash(EditorSession var1) {
      if (((640433955 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29);
      } else {
         int var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537149, 0);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-459713889, 18) * var2 + Boolean.hashCode(var1.editMode);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715526, 0) * var2 + Boolean.hashCode(var1.previewMode);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1747681687, 14) * var2 + Boolean.hashCode(var1.welcomePopupVisible);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546382, 3) * var2 + Boolean.hashCode(var1.savePopupVisible);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537135, 0) * var2 + Boolean.hashCode(var1.preferencesPopupVisible);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715559, 1) * var2 + Boolean.hashCode(var1.menuFilePopupVisible);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(2130897831, 29) * var2 + Boolean.hashCode(var1.menuFilePopupImageMode);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1544336194, 25) * var2 + Boolean.hashCode(var1.menuFilePopupEditAction);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090163804, 14) * var2 + this.hashString(var1.menuFilePopupSelectedPage);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612408494, 10) * var2 + var1.menuFilePopupScrollOffset;
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(710147219, 31) * var2 + Boolean.hashCode(var1.menuFilePopupScrollbarDragActive);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1325591460, 27) * var2 + var1.menuFilePopupPageKeys.size();
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-919427777, 19) * var2
            + (var1.activeTool == null ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4) : var1.activeTool.hashCode());
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1089606748, 15) * var2 + this.hashString(var1.activeHandle);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-873840844, 13) * var2 + this.hashString(var1.hoveredHandle);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1199379548, 22) * var2 + this.hashString(var1.selectedElementId);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715559, 1) * var2 + Boolean.hashCode(var1.moveDragActive);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327588, 2) * var2 + Boolean.hashCode(var1.previewPanActive);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-229856945, 17) * var2 + Boolean.hashCode(var1.marqueeSelectActive);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715241, 4) * var2 + Boolean.hashCode(var1.layersReorderActive);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210678681, 12) * var2 + Boolean.hashCode(var1.actionsReorderActive);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074269, 1) * var2 + Boolean.hashCode(var1.activePagesReorderActive);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1882377478, 27) * var2 + Boolean.hashCode(this.isSkinMouseSpinActive(var1));
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1544336194, 25) * var2 + Boolean.hashCode(var1.opacitySliderDragActive);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327724, 3) * var2 + Boolean.hashCode(var1.sidebarFieldDragActive);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090329436, 7) * var2 + Boolean.hashCode(var1.colorPickerGradDragActive);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537135, 0) * var2 + Boolean.hashCode(var1.colorPickerHueDragActive);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327996, 4) * var2 + Boolean.hashCode(var1.animationTimelineSliderDragActive);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28732119, 14) * var2 + Boolean.hashCode(var1.timelineKeyframeDragActive);
         var2 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503702535, 8) * var2 + Boolean.hashCode(var1.alignToolbarVisible);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715241, 4) * var2 + var1.activePagesVisibleHoveredSlot;
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1325591460, 27) * var2 + this.hashString(var1.fileDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715241, 4) * var2 + this.hashString(var1.editDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-57464237, 15) * var2 + this.hashString(var1.selectionDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28732119, 14) * var2 + this.hashString(var1.layerDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(710147219, 31) * var2 + this.hashString(var1.windowDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210717721, 7) * var2 + this.hashString(var1.keyframeDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327637, 31) * var2 + this.hashString(var1.keyframeTimelineDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1092424796, 20) * var2 + this.hashString(var1.cursorPageDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210714521, 10) * var2 + this.hashString(var1.cursorLayersDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(848249753, 25) * var2 + this.hashString(var1.cursorActionsDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1234512382, 22) * var2 + this.hashString(var1.cursorActionsEditDropdownHoverTargetId);
         var2 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090332764, 9) * var2 + var1.elements.size();
         return Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378420, 1) * var2 + var1.shellRuntimeRects.size();
      }
   }

   public int hashString(String var1) {
      if (((-1304997817 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-447569948, 26) : var1.hashCode();
      }
   }

   public String resolveCursorVisualUnicode(EditorSession var1, double var2, double var4) {
      if ((-961411014 * -961411014 + -961411014 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78");
      } else if (var1.editMode && var1.previewMode) {
         return this.resolveEditorCursorVisualUnicode(var1, var2, var4);
      } else if (this.isEditorMenuSession(var1)) {
         String var6 = this.resolveEditorMenuHoveredHitboxId(var1, var2, var4);
         return var6 == null
            ? this.cursorUnicodeValue(var1.cursorDefaultUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78"))
            : this.cursorUnicodeValue(var1.cursorHoverUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("w9PGvkm9KVElEutSfUvkgCUHtwo9XpXH856COT4c"));
      } else if (this.isSkinMouseSpinActive(var1)) {
         return this.cursorUnicodeValue(var1.cursorDragUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("PLCEp2xOkk2/PqMwK5SS+7phGozhnK6EKR0VLqJ1"));
      } else if (this.isSkinMouseSpinTarget(this.findHoveredRuntimeElement(var1, var2, var4))) {
         return this.cursorUnicodeValue(var1.cursorHoverUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("w9PGvkm9KVElEutSfUvkgCUHtwo9XpXH856COT4c"));
      } else {
         return this.isRuntimeClickableHoverTarget(var1, var2, var4)
            ? this.cursorUnicodeValue(var1.cursorHoverUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("w9PGvkm9KVElEutSfUvkgCUHtwo9XpXH856COT4c"))
            : this.cursorUnicodeValue(var1.cursorDefaultUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78"));
      }
   }

   public String resolveEditorCursorVisualUnicode(EditorSession var1, double var2, double var4) {
      if ((1921707273 * 1921707273 - 1921707273 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78");
      } else if (this.isEditorSliderDragActive(var1)) {
         return this.cursorUnicodeValue(var1.cursorSliderDragUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("9cJASjzoKCRh3O1yrfsG/23tU22Y4CMxyWNHfhlS"));
      } else {
         int var11;
         label68: {
            if (var1.moveDragActive && var1.activeTool == EditorTool.SCALE) {
               String var10000 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("wDgpFMHEAK/hY0d7bOrCMiN75al/f64A2yiFpBY7/fYpFBNS");
               String[] var10002 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715417, 7)];
               var10002[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29)] = var1.activeHandle;
               if (var10000.equals(this.firstNonBlank(var10002))) {
                  var11 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113748825, 16);
                  break label68;
               }
            }

            var11 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 26);
         }

         int var6 = var11;
         int var7 = !var1.moveDragActive || var1.selectedElementId == null || var1.selectedElementId.isBlank() || var6 != 0 && !var1.moveDragMutated
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704532053, 6)
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 20);
         if (var7 == 0 && !var1.layersReorderActive && !var1.actionsReorderActive && !var1.activePagesReorderActive) {
            String var8 = this.resolveResizeHandleCursorUnicode(var1, var1.activeHandle);
            if (!var8.isBlank()) {
               return var8;
            } else {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-806971012, 26)];
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 28)] = var1.hoveredHandle;
               String var9 = this.firstNonBlank(var10001);
               if (var9.isBlank() && var1.activeTool == EditorTool.SCALE) {
                  var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22)];
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 8)] = this.findHoveredHandle(var1, var2, var4);
                  var9 = this.firstNonBlank(var10001);
               }

               String var10 = this.resolveResizeHandleCursorUnicode(var1, var9);
               if (!var10.isBlank()) {
                  return var10;
               } else {
                  return this.isEditorClickableHoverTarget(var1, var2, var4)
                     ? this.cursorUnicodeValue(var1.cursorHoverUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("w9PGvkm9KVElEutSfUvkgCUHtwo9XpXH856COT4c"))
                     : this.cursorUnicodeValue(var1.cursorDefaultUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78"));
               }
            }
         } else {
            return this.cursorUnicodeValue(var1.cursorDragUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("PLCEp2xOkk2/PqMwK5SS+7phGozhnK6EKR0VLqJ1"));
         }
      }
   }

   public boolean isEditorSliderDragActive(EditorSession var1) {
      if ((2044729054 * (2044729054 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 == null
               || !var1.opacitySliderDragActive && !var1.sidebarFieldDragActive && !var1.colorPickerGradDragActive && !var1.colorPickerHueDragActive
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612389038, 10)
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 17)) != 0);
      }
   }

   public String resolveResizeHandleCursorUnicode(EditorSession var1, String var2) {
      if ((2079355121 * 2079355121 + 2079355121 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24)];
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28)] = var2;
         String var3 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (var3.isBlank()) {
            return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         } else {
            int var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(-210715546, 8);
            switch (var3.hashCode()) {
               case 101:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("npCBD+ir4sD8RDl/aczHtU9496NlIveIqd46gPPB"))) {
                     var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751854212, 7);
                  }
                  break;
               case 110:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Wg48e+ITDMjLnymVap5gIPb8kFPCVVCxZL5JGK+2"))) {
                     var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710456730, 12);
                  }
                  break;
               case 115:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("GdhL1I0xxe1iU/PXmG5qOm7fQShoo6y8sTiyuc2H"))) {
                     var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1339369982, 22);
                  }
                  break;
               case 119:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("/P1jmtlsy+jYohxIFy3E9J0S0cAh9HGwQUZ7rNH9"))) {
                     var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1089541212, 17);
                  }
                  break;
               case 3146:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("7xzOrp2hlQTCRUUqT+MPjZDNI5F5JGVdpfibgjRVSyk="))) {
                     var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715529, 3);
                  }
                  break;
               case 3152:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("cof935tRmYhiQkgZqU2aN6oStNafc18H/ttgNzUGAKY="))) {
                     var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327660, 4);
                  }
                  break;
               case 3704:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("jMXMCqkGFseHNba01QlZOy7/rSSiHmdD4e/6aoz6+BU="))) {
                     var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210537, 2);
                  }
                  break;
               case 3710:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("88Y+uM1IzcHTCV4j3rOQInuFOZiHTIZ0b32fwGtMo08="))) {
                     var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8);
                  }
                  break;
               case 3357649:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("wDgpFMHEAK/hY0d7bOrCMiN75al/f64A2yiFpBY7/fYpFBNS"))) {
                     var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1);
                  }
            }
            return switch (var5) {
               case 0 -> this.cursorUnicodeValue(
                  var1 == null ? null : var1.cursorHoverUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("w9PGvkm9KVElEutSfUvkgCUHtwo9XpXH856COT4c")
               );
               case 1, 2 -> this.cursorUnicodeValue(
                  var1 == null ? null : var1.cursorResizeTrBlUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("yh45E2ntzJJ+u2HzkMY6eHFdv63cNg02/WkL8YI4")
               );
               case 3, 4 -> this.cursorUnicodeValue(
                  var1 == null ? null : var1.cursorResizeTlBrUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("XEeflXE5Y+LXMLajYzxkYt6yOscSOYNjRJqvgDLZ")
               );
               case 5, 6 -> this.cursorUnicodeValue(
                  var1 == null ? null : var1.cursorResizeVerticalUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("gwqSJcWlqVGYyvk8B6OLLJy/nseuZZeZ+FA4dOX+")
               );
               case 7, 8 -> this.cursorUnicodeValue(
                  var1 == null ? null : var1.cursorResizeHorizontalUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("QN9I+ktnsYjSB/aQiKd/nK6oQIqQkxDxQo/tfTIY")
               );
               default -> Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
            };
         }
      }
   }

   public boolean isEditorClickableHoverTarget(EditorSession var1, double var2, double var4) {
      if ((-944237841 * (-944237841 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || !var1.editMode || !var1.previewMode) {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(714407719, 29) != 0);
      } else if (this.isEditorImageFilePopupVisible(var1)) {
         return ((this.resolveMenuFilePopupHoveredHitboxId(var1, var2, var4) != null
            ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106967758, 19)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17)) != 0);
      } else if (var1.welcomePopupVisible) {
         return this.isWelcomePopupClickableTarget(var1, var2, var4);
      } else if (var1.savePopupVisible) {
         return this.isSavePopupClickableTarget(var1, var2, var4);
      } else if (var1.preferencesPopupVisible) {
         return this.isPreferencesPopupClickableTarget(var1, var2, var4);
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 20)] = var1.fileDropdownHoverTargetId;
         if (this.firstNonBlank(var10001).isBlank()) {
            var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28)];
            var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094215065, 31)] = var1.editDropdownHoverTargetId;
            if (this.firstNonBlank(var10001).isBlank()) {
               var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 20)];
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1)] = var1.selectionDropdownHoverTargetId;
               if (this.firstNonBlank(var10001).isBlank()) {
                  var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217654, 5)];
                  var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1420294457, 0)] = var1.layerDropdownHoverTargetId;
                  if (this.firstNonBlank(var10001).isBlank()) {
                     var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22)];
                     var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14210412, 13)] = var1.windowDropdownHoverTargetId;
                     if (this.firstNonBlank(var10001).isBlank()) {
                        var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-806971012, 26)];
                        var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1)] = var1.keyframeDropdownHoverTargetId;
                        if (this.firstNonBlank(var10001).isBlank()) {
                           var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 0)];
                           var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 1)] = var1.keyframeTimelineDropdownHoverTargetId;
                           if (this.firstNonBlank(var10001).isBlank()) {
                              var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778047, 5)];
                              var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 24)] = var1.cursorPageDropdownHoverTargetId;
                              if (this.firstNonBlank(var10001).isBlank()) {
                                 var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-2058715245, 28)];
                                 var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 0)] = var1.cursorLayersDropdownHoverTargetId;
                                 if (this.firstNonBlank(var10001).isBlank()) {
                                    var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113748825, 16)];
                                    var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719872721, 23)] = var1.cursorActionsDropdownHoverTargetId;
                                    if (this.firstNonBlank(var10001).isBlank()) {
                                       var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874821, 4)];
                                       var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22)] = var1.cursorActionsEditDropdownHoverTargetId;
                                       if (this.firstNonBlank(var10001).isBlank()) {
                                          if (var1.activePagesVisibleHoveredSlot > 0) {
                                             return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 6) != 0);
                                          }

                                          if (this.findHoveredToolbarTool(var1, var2, var4) != null) {
                                             return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(2140374346, 12) != 0);
                                          }

                                          if (var1.activeTool == EditorTool.ALIGN && this.resolveHoveredAlignToolbarActionId(var1, var2, var4) != null) {
                                             return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715544, 0) != 0);
                                          }

                                          if (this.isInsideAnyEditorShellHitbox(var1, var2, var4)) {
                                             return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874821, 4) != 0);
                                          }

                                          HoverElement var6 = this.findHoveredElement(var1, var2, var4);
                                          String var7 = var6 == null ? null : this.targetIdOf(var6);
                                          return ((var7 != null && !var7.isBlank() && this.isTargetInteractable(var1, var7)
                                             ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1029357623, 27)
                                             : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409064106, 7)) != 0);
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

         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(655004927, 21) != 0);
      }
   }

   public boolean isSavePopupClickableTarget(EditorSession var1, double var2, double var4) {
      if ((-491919403 ^ -491919403) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.savePopupVisible) {
         return ((!this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("X4YhwrhuQkO6TZBC3YDVJSzJh7UG0QM5t8luyGBzfD3YRP52B/koR6MPJwlUsE1+ccBiprckn81yeNMGm9MHfMzpfLCGHC5YSW0="),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("EmCsl9pQGuIcTYo1lVMFSykZpwL60sUgcDwhA/6XqiolsYmDqTJPX4BMr6M2Sbc6aRjPITuzpWcxe+QF6o8UJzFIkWSvLinuy7A="),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "iWCxa0IWkOqRCqDGRDhF1yUQgtv0oojwqgCewF7LTK7Bo061VXQR8iWWWxkRGP8dYzyvZ027Ps3V4dsI9hMXFTyqP9cLtSjSt8LTk0yq+7c="
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQ1cuL2lENFK7vshKgPnZbdVhhiseVoq97r0mDxTYX2JTKVSmJoAhIx/Wm0ARw4w52k2yGfaa7KtyHGwirJ6ZeCzkbxD/q3q+ofObaJK"),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("PF/98J0wnGtRISp0j2y5n3WsjYTb2SDmDaXhnctGX08rcSqAKXIgk94Fe2jx+nnLaS+TF2fWVYJHqD4CUQR1eL3qXkrsZhyz8wxjeQ=="),
                  var2,
                  var4
               )
            ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28)
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719874586, 10) != 0);
      }
   }

   public boolean isPreferencesPopupClickableTarget(EditorSession var1, double var2, double var4) {
      if ((-645651758 ^ -645651758) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.preferencesPopupVisible) {
         return ((!this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "A9MY5xJORFS6RUdSD0obLYUntyndev9pBKxLsDfMz2rf6Wg7ZLdswJG7NL4RqxFvYkSatDYwpQ1IbTBTCzcJzvuMhE3SAp3FouuKjW3wHQEFB+fMgek="
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "wjCVAodqV7V4MWt1dRyZLuRIw4wHmIhPM2M2oQS2mjLKwK0mseIKIknuG6CACTRhqh5j/0/KzJxof8hgfDHWutSAHhnSV4dXFegKwo8WgfKZGQ=="
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "1TMh1a/yBA+ConGlvzm2JW7lxbuP03mqLyHN0tcvIVfVVLAAqzofGx5Qe+DfjhpIHaahLtSwKJH16p/A7miyIFnTNO8NjtQeAO7Pxr/c0AVRPBacP1w52lRKcNI="
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "tFLr7UM4R72OOMoqao1ji9eFUvPQz2pBBAlCj30K0vj1phjYB4WE05QzRlISB1reC0/myXhOom3+l2Uy93T+Kg+YZOLEb4v5Q3wo2783BlCgG+C3"
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "jxr9Q8lTNVJMlwM0QbnIvJedC7z5QDGlHGEh7qlrSF0xFBWHvcOYasCQecou5Z6VBMiqil+d4yazPhOysHkL3w323VZ4PITE8Kok0KqSHsoUe76vcrfctEop1N8="
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "A1zht8LQOQafsj/L8kx9O4NwtObQ9KPnO97I+rlljmPoO86NKumu8AUa5hBmIdT+2SMx4XQ1BvbHrNWk3mtbUi38M9rErP2ucMFRuf/4NnWXr8AA7y83oWG2"
                  ),
                  var2,
                  var4
               )
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 9)
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 12)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 2) != 0);
      }
   }

   public boolean isWelcomePopupClickableTarget(EditorSession var1, double var2, double var4) {
      if ((-604993872 * -604993872 + -604993872 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.welcomePopupVisible) {
         return ((!this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "AfAdPlB2/13P3/cUkh0yKLGkmzIxijXEHxG9582AhfsimDyhvLKnVEPGsYNs1jR7fsAlnkKrVYweS/qc8dqXvujwJo8F69X5JhY/619609xr1vcR"
                  ),
                  var2,
                  var4
               )
               && !this.isInsideShellBlock(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("uBgmAzuWJABXfv8GmHDd1JNwtHGfdAKVx+z9DUOrfPnqGaQh2S/VZWlf3rc0xpGxmP1cyUlpcNt9QwI2brfSzs8Rut05xd8g5wnt64O0"),
                  var2,
                  var4
               )
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20)
            : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210584473, 17)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 23) != 0);
      }
   }

   public boolean isInsideAnyEditorShellHitbox(EditorSession var1, double var2, double var4) {
      if (((1817460269 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.shellRuntimeRects != null && !var1.shellRuntimeRects.isEmpty()) {
         for (String var7 : var1.shellRuntimeRects.keySet()) {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503710215, 8)];
            var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 1)] = var7;
            String var8 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            if (!var8.isBlank()
               && var8.contains(Xqedii_1s34vun.Xqedii_997tx7qg1fze("pQMDQO9JU4n4rBWtMDR4RXXT8XA7BcA0MiwmlLkn0Ly/F7cSLJs31g=="))
               && this.isInsideShellBlock(var1, var7, var2, var4)) {
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(212812697, 21) != 0);
            }
         }

         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 7) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 10) != 0);
      }
   }

   public boolean isRuntimeClickableHoverTarget(EditorSession var1, double var2, double var4) {
      if (((336333497 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.editMode) {
         HoverElement var6 = this.findHoveredRuntimeElement(var1, var2, var4);
         if (var6 == null) {
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 18) != 0);
         } else {
            for (String var9 : this.resolveActionTargetPathCandidates(var6)) {
               List var10 = this.resolveRuntimeActionsByTargetPath(var1, var9);
               if (var10 != null && !var10.isEmpty()) {
                  return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210699161, 14) != 0);
               }
            }

            for (String var14 : this.resolveActionTargetCandidates(var1, var6)) {
               List var11 = this.resolveTargetActionsRawList(var1, var14, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1) != 0));
               if (var11 != null && !var11.isEmpty()) {
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20) != 0);
               }
            }

            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 8) != 0);
      }
   }

   public void applyCursorVisualUnicode(Player var1, EditorSession var2, String var3) {
      if ((1202267017 * 1202267017 - 1202267017 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         Entity var4 = this.hudService.getHud(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("L1+h5aEW6zT4152SswrrXbwI0K/ZR93FV1+MF+wHdX99YJTB3A4JrQ=="));
         if (var4 != null) {
            String var5 = this.cursorUnicodeValue(
               var3, this.cursorUnicodeValue(var2.cursorDefaultUnicode, Xqedii_1s34vun.Xqedii_997tx7qg1fze("n9MpAfrdsMIb76b2LuI/5Wg+XFI5bQqUYK9PCv78"))
            );
            if (this.cameraService.isShaderCursorActive(var1)) {
               this.cameraService.setShaderCursorSprite(var1, CameraService.shaderCursorSpriteOf(var5));
            } else {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(212812697, 20)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 2)] = this.normalizeHexColor(var2.cursorColor);
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "bOFqF+lIVVp7WsKRDdHLA1WcsVOihKrkNrw/JVGFvZZFyskKt2yZZg=="
               );
               String var6 = this.firstNonBlank(var10001);
               String var7 = this.applyPreferredFont(this.withHexPrefix(var5, var6), null, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-56874413, 15) != 0));
               String var8 = this.hudService.getHudText(var4, null);
               if (!this.equalsNullable(var8, var7)) {
                  this.hudService.setHudText(var4, var7, null, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 24) != 0));
               }
            }
         }
      }
   }

   public String readCursorUnicodeConfig(YamlConfiguration var1, String var2, String... var3) {
      if (((-1345416973 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && var3 != null) {
            String[] var4 = var3;
            int var5 = var3.length;

            for (int var6 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1); var6 < var5; var6++) {
               String var7 = var4[var6];
               if (var7 != null && !var7.isBlank()) {
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18)];
                  var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-447569948, 26)] = var1.getString(var7);
                  String var8 = this.firstNonBlank(var10001);
                  if (!var8.isBlank()) {
                     return var8;
                  }
               }
            }
         }

         String[] var9 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210717593, 11)];
         var9[Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28)] = var2;
         return this.firstNonBlank(var9);
      }
   }

   public String cursorUnicodeValue(String var1, String var2) {
      if (((697946596 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751854980, 7)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 7)] = var1;
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546867, 9)] = var2;
         return this.firstNonBlank(var10001);
      }
   }

   public void syncSeamlessCursorHud(Player var1, double var2, double var4) {
      if ((-1985895855 * (-1985895855 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.cameraService.updateActiveCursorLayer(var1, var4);
         if (!this.cameraService.isShaderCursorActive(var1)) {
            Entity var6 = this.hudService.getHud(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("L1+h5aEW6zT4152SswrrXbwI0K/ZR93FV1+MF+wHdX99YJTB3A4JrQ=="));
            if (var6 != null) {
               double var7 = Double.isFinite(var2)
                  ? Math.max(Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773584253158L, 29)), var2)
                  : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133101566755550L, 33));
               Vector var9 = this.hudService.getHudScale(var6);
               if (var9 == null
                  || !(Math.abs(var9.getX() - var7) <= Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-7757206045735539563L, 27)))
                  || !(Math.abs(var9.getY() - var7) <= Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(3146433452082565069L, 0)))) {
                  this.hudService
                     .setHudScale(
                        var6,
                        new Vector(var7, var7, Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701470L, 8))),
                        Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597176230, 16),
                        (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 28) != 0)
                     );
               }
            }
         }
      }
   }

   public boolean toggleShellBlockGroupEnabled(Player var1, EditorSession var2, List<String> var3) {
      if ((1509540099 * 1509540099 + 1509540099 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isEmpty()) {
         int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25);
         int var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 20);

         for (String var7 : var3) {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 11)];
            var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778015, 5)] = var7;
            String var8 = this.firstNonBlank(var10001);
            if (!var8.isBlank()) {
               Boolean var9 = this.findShellBlockEnabledById(var2.editorShellTemplateBlocks, var8);
               if (var9 == null) {
                  var9 = this.findShellBlockEnabledById(var2.shellBlocks, var8);
               }

               if (var9 != null) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100483764, 17);
                  if (var9) {
                     var4 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1310009854, 22);
                  }
               }
            }
         }

         if (var5 == 0) {
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-514678812, 26) != 0);
         } else {
            int var11 = var4 == 0 ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719873562, 10) : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1666558980, 23);
            boolean var12 = false;

            for (String var15 : var3) {
               String[] var16 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(2140374346, 12)];
               var16[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-447569948, 26)] = var15;
               String var10 = this.firstNonBlank(var16);
               if (!var10.isBlank()) {
                  var12 |= this.setShellBlockEnabledById(var2.editorShellTemplateBlocks, var10, (var11 != 0));
                  var12 |= this.setShellBlockEnabledById(var2.shellBlocks, var10, (var11 != 0));
               }
            }

            if (!var12) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(798620883, 15) != 0);
            } else {
               this.rerenderShellAfterWindowToggle(var1, var2);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715033, 9) != 0);
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2) != 0);
      }
   }

   @Override
   public void rerenderShellAfterWindowToggle(Player var1, EditorSession var2) {
      if ((2060480615 * (2060480615 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         List var3 = var2.shellBlocks == null ? Collections.emptyList() : var2.shellBlocks;
         LinkedHashSet var4 = this.collectShellLogicalIds(var3);
         List var5 = this.resolveOpenEditorPagesForPlayer(var1.getUniqueId(), var2.pageName);
         var2.openEditorPages.clear();
         var2.openEditorPages.addAll(var5);
         int var6 = Math.max(
            Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 15), var2.openEditorPages.size() - Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1895634012, 27)
         );
         var2.activePagesScrollOffset = Math.max(Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1), Math.min(var6, var2.activePagesScrollOffset));
         var2.shellBlocks = this.buildShellBlocksWithActivePages(
            var2.editorShellTemplateBlocks, var2.components, var2.openEditorPages, var2.activePagesScrollOffset, var2.pageName
         );
         LinkedHashSet var7 = this.collectShellLogicalIds(var2.shellBlocks);
         var4.removeAll(var7);
         LinkedHashSet var8 = new LinkedHashSet();

         for (String var10 : (Iterable<String>) (var4)) {

            if (this.isActivePagesShellLogicalId(var10)) {
               var8.add(var10);
            }

            this.clearShellRuntimeHudByLogicalId(var1, var10);
         }

         this.clearActivePagesRuntimeSlots(var1, var8);
         var2.shellCacheBuilt = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 12) != 0);
         var2.shellSectionCache.clear();
         var2.shellBlockMapCache.clear();
         var2.shellStaticRectCache.clear();
         var2.shellRuntimeRects.clear();
         var2.sidebarPanelVisibilityStates.clear();
         var2.activePagesRenderedSlotStates.clear();
         this.renderEditorShell(var1, var2);
         this.renderEditorToolSidebar(var1, var2);
         this.updateEditorPropertiesSidebar(var1, var2);
         this.updateEditorNavbarHover(var1, var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
         this.updatePageInfoReadout(var1, var2);
         this.refreshSavePopupFields(var1, var2);
         this.syncActivePagesRenderedSlotStates(var2);
      }
   }

   public LinkedHashSet<String> collectShellLogicalIds(List<Map<String, Object>> var1) {
      if (((-1902373517 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1 != null && !var1.isEmpty()) {
            HashMap var3 = new HashMap();
            int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25);

            for (Map var6 : var1) {
               var4++;
               ConfigurationSection var7 = this.mapToSection(var6);
               if (var7 != null) {
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1816835457, 20)];
                  var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2)] = var7.getString(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG")
                  );
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 7)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
                  );
                  String var8 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  if (Xqedii_1s34vun.Xqedii_997tx7qg1fze("0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc=").equals(var8)
                     || Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T").equals(var8)
                     || this.isRoundedType(var8)) {
                     String var9 = this.resolveElementId(var7, var4, var3);
                     var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(2140374346, 12)];
                     var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 7)] = var9;
                     String var10 = this.firstNonBlank(var10001);
                     if (!var10.isBlank()) {
                        var2.add(var10);
                     }
                  }
               }
            }

            return var2;
         } else {
            return var2;
         }
      }
   }

   public void clearShellRuntimeHudByLogicalId(Player var1, String var2) {
      if ((-508559908 ^ -508559908) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = Xqedii_2233pwl15fzz7(var2);
         this.clearOutlineHud(var1, var3);
         this.removeBaseHud(var1, var3);
         this.removeRoundedParts(var1, var3);
         this.removeHudById(var1, var3);
         this.clearOutlineHud(var1, var2);
         this.removeBaseHud(var1, var2);
         this.removeRoundedParts(var1, var2);
         this.removeHudById(var1, var2);
      }
   }

   public Boolean findShellBlockEnabledById(List<Map<String, Object>> var1, String var2) {
      if ((1147076019 * 1147076019 - 1147076019 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         for (Map var4 : var1) {
            if (var4 != null && !var4.isEmpty()) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715544, 0)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9)] = this.stringValue(
                  var4.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZdDghZzZXaf+khU6WzJyuq6FQJFBQ7qo+6yAQeJW0Hg="))
               );
               String var5 = this.firstNonBlank(var10001);
               if (!var5.isBlank() && var2.equalsIgnoreCase(var5)) {
                  return this.parseBooleanFlag(
                     var4.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zJbNNAznYjzPZQ2s/B9vE5UGH+TH2u7LbKRuIvvZQo2JeYP5R4CuEa9k")),
                     (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715417, 7) != 0)
                  );
               }

               List var6 = this.childBlocksOf(var4);
               if (var6 != null) {
                  Boolean var7 = this.findShellBlockEnabledById(var6, var2);
                  if (var7 != null) {
                     return var7;
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean setShellBlockEnabledById(List<Map<String, Object>> var1, String var2, boolean var3) {
      if ((1479308493 ^ 1479308493) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         boolean var4 = false;

         for (Map var6 : var1) {
            if (var6 != null && !var6.isEmpty()) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 26)];
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26)] = this.stringValue(
                  var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZdDghZzZXaf+khU6WzJyuq6FQJFBQ7qo+6yAQeJW0Hg="))
               );
               String var7 = this.firstNonBlank(var10001);
               if (!var7.isBlank() && var2.equalsIgnoreCase(var7)) {
                  boolean var8 = this.parseBooleanFlag(
                     var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zJbNNAznYjzPZQ2s/B9vE5UGH+TH2u7LbKRuIvvZQo2JeYP5R4CuEa9k")),
                     (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715529, 4) != 0)
                  );
                  if (var8 != var3 || !var6.containsKey(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zJbNNAznYjzPZQ2s/B9vE5UGH+TH2u7LbKRuIvvZQo2JeYP5R4CuEa9k"))) {
                     var6.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zJbNNAznYjzPZQ2s/B9vE5UGH+TH2u7LbKRuIvvZQo2JeYP5R4CuEa9k"), var3);
                     var4 = true;
                  }
               }

               List var9 = this.childBlocksOf(var6);
               if (var9 != null && !var9.isEmpty()) {
                  var4 |= this.setShellBlockEnabledById(var9, var2, var3);
               }
            }
         }

         return var4;
      } else {
         return false;
      }
   }

   public List<String> resolveSelectedRootTargetPaths(EditorSession var1) {
      if ((-1279267909 ^ -1279267909) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyList();
      } else {
         ArrayList var2 = new ArrayList();

         for (String var4 : this.getSelectedTargetIds(var1)) {
            String var5 = this.resolveEditorTargetPath(var1, var4);
            if (!var5.isBlank()) {
               var2.add(var5);
            }
         }

         return this.normalizeRootTargetPaths(var2);
      }
   }

   public List<String> resolveEditorCutCopyTargetPaths(EditorSession var1, List<String> var2) {
      if ((560109850 * (560109850 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyList();
      } else {
         List var3 = this.resolveSelectedRenderableRootTargetPaths(var1);
         List var4 = this.normalizeRootTargetPaths(var2);
         if (!var4.isEmpty()) {
            ArrayList var5 = new ArrayList();

            for (String var7 : (Iterable<String>) (var4)) {

               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 9)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 15)] = var7;
               String var8 = this.firstNonBlank(var10001);
               if (!var8.isBlank() && this.resolveRawMapAtPath(var1.rawBlocks, var8) != null) {
                  var5.add(var8);
               }
            }

            if (!var5.isEmpty()) {
               if (!var3.isEmpty() && var3.size() > Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409063978, 7)) {
                  LinkedHashSet var10 = new LinkedHashSet(var3);
                  int var11 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113748825, 16);

                  for (String var9 : (Iterable<String>) (var5)) {

                     if (!var10.contains(var9)) {
                        var11 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31);
                        break;
                     }
                  }

                  if (var11 != 0) {
                     return var3;
                  }
               }

               return var5;
            }
         }

         return var3;
      }
   }

   public List<String> resolveSelectedRenderableRootTargetPaths(EditorSession var1) {
      if ((-1577364514 * -1577364514 + -1577364514 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyList();
      } else {
         List var2 = this.getSelectedTargetIds(var1);
         if (var2.isEmpty()) {
            return Collections.emptyList();
         } else {
            ArrayList var3 = new ArrayList();

            for (String var5 : (Iterable<String>) (var2)) {

               String var6 = this.resolveEditorTargetPath(var1, var5);
               if (var6.isBlank() && var1.renderBlocks != null) {
                  for (Map var8 : var1.renderBlocks) {
                     if (var8 != null && !var8.isEmpty()) {
                        String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 29)];
                        var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 0)] = this.stringValue(
                           this.readMapPathValue(
                              var8,
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                           )
                        );
                        String var9 = this.firstNonBlank(var10001);
                        if (var5.equals(var9)) {
                           var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503710215, 8)];
                           var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25)] = this.stringValue(
                              this.readMapPathValue(
                                 var8,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4="
                                 )
                              )
                           );
                           String var10 = this.firstNonBlank(var10001);
                           if (!var10.isBlank() && this.resolveRawMapAtPath(var1.rawBlocks, var10) != null) {
                              var6 = var10;
                              break;
                           }
                        }
                     }
                  }
               }

               if (!var6.isBlank() && this.resolveRawMapAtPath(var1.rawBlocks, var6) == null) {
                  var6 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
               }

               if (!var6.isBlank()) {
                  var3.add(var6);
               }
            }

            return this.normalizeRootTargetPaths(var3);
         }
      }
   }

   public String resolveEditorTargetPath(EditorSession var1, String var2) {
      if ((-1003719772 * -1003719772 + -1003719772 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         HoverElement var3 = this.findFirstByTargetId(var1, var2);
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546867, 9)];
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-859936361, 22)] = var3 == null ? null : var3.targetPath;
         String var4 = this.firstNonBlank(var10001);
         if (!var4.isBlank()) {
            return var4;
         } else {
            return this.resolveRawMapAtPath(var1.rawBlocks, var2) == null
               ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
               : var2;
         }
      } else {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      }
   }

   public List<String> resolveEditorTargetPathsByIds(EditorSession var1, List<String> var2) {
      if ((1819952516 ^ 1819952516) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         if (var1 != null && var2 != null && !var2.isEmpty()) {
            for (String var5 : var2) {
               String var6 = this.resolveEditorTargetPath(var1, var5);
               if (!var6.isBlank()) {
                  var3.add(var6);
               }
            }

            return var3;
         } else {
            return var3;
         }
      }
   }

   public void restoreSelectionAfterHistorySnapshot(EditorSession var1, List<String> var2, List<String> var3) {
      if (((-1260741919 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         LinkedHashSet var4 = new LinkedHashSet();
         if (var3 != null) {
            for (String var6 : var3) {
               String var7 = this.findTargetIdByPath(var1, var6);
               if (!var7.isBlank()) {
                  var4.add(var7);
               }
            }
         }

         if (var4.isEmpty() && var2 != null) {
            for (String var10 : var2) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 27)];
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597176230, 16)] = var10;
               String var12 = this.firstNonBlank(var10001);
               if (!var12.isBlank() && this.isKnownTargetId(var1, var12)) {
                  var4.add(var12);
               }
            }
         }

         var1.selectedElementId = null;
         var1.additionalSelectedElementIds.clear();

         for (String var11 : (Iterable<String>) (var4)) {

            this.appendSelectionTarget(var1, var11);
         }
      }
   }

   public List<Map<String, Object>> copyEditorTargetsByPath(EditorSession var1, List<String> var2) {
      if ((-1365416252 * -1365416252 + -1365416252 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         if (var1 != null && var2 != null && !var2.isEmpty()) {
            for (String var5 : this.normalizeRootTargetPaths(var2)) {
               Map var6 = this.resolveRawMapAtPath(var1.rawBlocks, var5);
               if (var6 != null && !var6.isEmpty()) {
                  var3.add(this.deepCopyMap(var6));
               }
            }

            return var3;
         } else {
            return var3;
         }
      }
   }

   public List<EditorRuntimeFilePart.EditorRawTargetIdentity> resolveSelectedRawTargetIdentities(EditorSession var1, List<String> var2) {
      if ((-1764015794 * -1764015794 + -1764015794 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         LinkedHashMap<String, EditorRuntimeFilePart.EditorRawTargetIdentity> var3 = new LinkedHashMap<>();

         for (String var5 : var2) {
            EditorRuntimeFilePart.EditorRawTargetIdentity var6 = this.resolveEditorRawTargetIdentity(var1, var5);
            if (var6 != null) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1358763100, 28)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 28)] = var6.Xqedii_3chp206;
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537165, 0)] = var6.Xqedii_2u6saa1;
               String var7 = Xqedii_l01ka1f4rnfl(this.firstNonBlank(var10001), var6.Xqedii_3280458, var6.Xqedii_2by2ejj);
               var3.putIfAbsent(var7, var6);
            }
         }

         return new ArrayList<>(var3.values());
      } else {
         return Collections.emptyList();
      }
   }

   public EditorRuntimeFilePart.EditorRawTargetIdentity resolveEditorRawTargetIdentity(EditorSession var1, String var2) {
      if ((1532183634 * 1532183634 - 1532183634 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = this.resolveEditorTargetPath(var1, var2);
         Map var4 = this.resolveRawMapAtPath(var1.rawBlocks, var3);
         if (var4 == null) {
            var4 = this.resolveRawTargetByTargetId(var1, var2);
            if (var4 == null) {
               return null;
            }
         }

         String var5 = this.readRawTargetLogicalId(var4);
         String var6 = this.readRawTargetDisplayName(var4);
         if (!var5.isBlank() && !var6.isBlank()) {
            if (var3.isBlank()) {
               HoverElement var7 = this.findFirstByTargetId(var1, var2);
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 5)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 19)] = var7 == null ? null : var7.targetPath;
               var3 = this.firstNonBlank(var10001);
            }

            return new EditorRuntimeFilePart.EditorRawTargetIdentity(var2, var3, var5, var6);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int removeEditorTargetsByIdentity(EditorSession var1, List<EditorRuntimeFilePart.EditorRawTargetIdentity> var2) {
      if (((-242951806 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.rawBlocks != null && !var1.rawBlocks.isEmpty() && var2 != null && !var2.isEmpty()) {
         int var3 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 2);

         for (EditorRuntimeFilePart.EditorRawTargetIdentity var5 : var2) {
            if (var5 != null) {
               Map var6 = this.removeRawTargetByIdentity(var1.rawBlocks, var5);
               if (var6 != null) {
                  var3++;
               }
            }
         }

         return var3;
      } else {
         return Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113683289, 16);
      }
   }

   public Map<String, Object> removeRawTargetByIdentity(List<Map<String, Object>> var1, EditorRuntimeFilePart.EditorRawTargetIdentity var2) {
      if (((-503216853 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null) {
         if (var2.Xqedii_3chp206 != null && !var2.Xqedii_3chp206.isBlank()) {
            Map var3 = this.resolveRawMapAtPath(var1, var2.Xqedii_3chp206);
            if (this.rawTargetMatchesIdentity(var3, var2)) {
               return this.removeRawTargetAtPath(var1, var2.Xqedii_3chp206);
            }
         }

         return var2.Xqedii_3280458 != null && !var2.Xqedii_3280458.isBlank() && var2.Xqedii_2by2ejj != null && !var2.Xqedii_2by2ejj.isBlank()
            ? this.removeFirstRawTargetByIdAndName(var1, var2.Xqedii_3280458, var2.Xqedii_2by2ejj)
            : null;
      } else {
         return null;
      }
   }

   public Map<String, Object> removeFirstRawTargetByIdAndName(List<?> var1, String var2, String var3) {
      if ((1827370137 * (1827370137 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank() && var3 != null && !var3.isBlank()) {
         for (int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546355, 9); var4 < var1.size(); var4++) {
            if (var1.get(var4) instanceof Map var6) {
               String var8 = this.readRawTargetLogicalId(var6);
               String var9 = this.readRawTargetDisplayName(var6);
               if (var2.equals(var8) && var3.equals(var9)) {
                  var1.remove(var4);
                  return var6;
               }

               if (var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("/nXFr31eyLvfai85ISdzkR7gXFJ+CwrSGn1vaFQD3OTAjw9wOnPFMwVlciA=")) instanceof List var11) {
                  Map var12 = this.removeFirstRawTargetByIdAndName(var11, var2, var3);
                  if (var12 != null) {
                     return var12;
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean rawTargetMatchesIdentity(Map<String, Object> var1, EditorRuntimeFilePart.EditorRawTargetIdentity var2) {
      if (((1574918256 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         return ((var2.Xqedii_3280458.equals(this.readRawTargetLogicalId(var1)) && var2.Xqedii_2by2ejj.equals(this.readRawTargetDisplayName(var1))
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 19)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 7) != 0);
      }
   }

   public String readRawTargetLogicalId(Map<String, Object> var1) {
      if ((177438590 * 177438590 - 177438590 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113552217, 16)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 1)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZdDghZzZXaf+khU6WzJyuq6FQJFBQ7qo+6yAQeJW0Hg="))
         );
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("hXOpo2azurt89Ot7flwLQbg15u0j6Xh/cw/zck3quWI02pEOnxWcbFmQvrve3g=="))
         );
         return this.firstNonBlank(var10001);
      } else {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      }
   }

   public String readRawTargetDisplayName(Map<String, Object> var1) {
      if (((-878322297 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(479151001, 27)];
         var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"))
         );
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 16)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("nC0REfDyelYgdE/xkXNtoHl3CT42jtZTvlIE+Egs02NYA6P1lBkmQezdBT2P8ciYLK4="))
         );
         return this.firstNonBlank(var10001);
      } else {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      }
   }

   public boolean removeEditorTargetsByPath(EditorSession var1, List<String> var2) {
      if (((1376488462 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.rawBlocks != null && !var1.rawBlocks.isEmpty() && var2 != null && !var2.isEmpty()) {
         ArrayList<String> var3 = new ArrayList<>(this.normalizeRootTargetPaths(var2));
         if (var3.isEmpty()) {
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546230, 3) != 0);
         } else {
            var3.sort((var1x, var2x) -> {
               if ((645241820 * (645241820 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  int var3x = Integer.compare(this.targetPathDepth(var2x), this.targetPathDepth(var1x));
                  if (var3x != 0) {
                     return var3x;
                  } else {
                     String[] var4x = var1x.split(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Rjvw0fHhOwb+HmKdIe58QW9OBqdVdB9jZNiqkzd1QTE="));
                     String[] var5 = var2x.split(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Rjvw0fHhOwb+HmKdIe58QW9OBqdVdB9jZNiqkzd1QTE="));
                     int var6x = Math.min(var4x.length, var5.length);

                     for (int var7x = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503710471, 8); var7x < var6x; var7x++) {
                        int var8 = this.parsePathIndex(var4x[var7x]);
                        int var9 = this.parsePathIndex(var5[var7x]);
                        if (var8 >= 0 && var9 >= 0 && var8 != var9) {
                           return Integer.compare(var9, var8);
                        }

                        int var10 = var5[var7x].compareTo(var4x[var7x]);
                        if (var10 != 0) {
                           return var10;
                        }
                     }

                     return var2x.compareTo(var1x);
                  }
               }
            });
            int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28);

            for (String var6 : (Iterable<String>) (var3)) {

               Map var7 = this.removeRawTargetAtPath(var1.rawBlocks, var6);
               if (var7 != null) {
                  var4 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 25);
               }
            }

            return (var4 != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 27) != 0);
      }
   }

   public Map<String, Object> removeRawTargetAtPath(List<Map<String, Object>> var1, String var2) {
      if (((1675612282 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         String[] var3 = var2.split(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Rjvw0fHhOwb+HmKdIe58QW9OBqdVdB9jZNiqkzd1QTE="));
         if (var3.length == 0) {
            return null;
         } else {
            Object var4 = var1;

            for (int var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217622, 5); var5 < var3.length - Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704531989, 6); var5++) {
               String var6 = var3[var5];
               if (var4 instanceof List var7) {
                  int var8 = this.parsePathIndex(var6);
                  if (var8 < 0 || var8 >= var7.size()) {
                     return null;
                  }

                  var4 = var7.get(var8);
               } else {
                  if (!(var4 instanceof Map var13)) {
                     return null;
                  }

                  var4 = var13.get(var6);
               }
            }

            String var10 = var3[var3.length - Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(710147228, 31)];
            if (var4 instanceof List var12) {
               int var14 = this.parsePathIndex(var10);
               if (var14 >= 0 && var14 < var12.size()) {
                  Object var9 = var12.remove(var14);
                  return this.toStringObjectMap(var9);
               } else {
                  return null;
               }
            } else if (var4 instanceof Map var11) {
               Object var15 = var11.remove(var10);
               return this.toStringObjectMap(var15);
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public List<String> normalizeRootTargetPaths(List<String> var1) {
      if ((-1217229803 ^ -1217229803) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         LinkedHashSet var2 = new LinkedHashSet();

         for (String var4 : var1) {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210723737, 13)];
            var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 19)] = var4;
            String var5 = this.firstNonBlank(var10001);
            if (!var5.isBlank()) {
               var2.add(var5);
            }
         }

         ArrayList<String> var10 = new ArrayList<>(var2);
         var10.sort((String var1x, String var2x) -> {
            if ((1072110690 * 1072110690 + 1072110690 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               int var3 = Integer.compare(this.targetPathDepth(var1x), this.targetPathDepth(var2x));
               return var3 != 0 ? var3 : var1x.compareTo(var2x);
            }
         });
         ArrayList var11 = new ArrayList();

         for (String var6 : (Iterable<String>) (var10)) {

            int var7 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 7);

            for (String var9 : (Iterable<String>) (var11)) {

               if (var6.equals(var9) || this.isDescendantTargetPath(var6, var9)) {
                  var7 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1674947588, 23);
                  break;
               }
            }

            if (var7 == 0) {
               var11.add(var6);
            }
         }

         return var11;
      } else {
         return Collections.emptyList();
      }
   }

   public boolean isDescendantTargetPath(String var1, String var2) {
      if ((-1976519482 * -1976519482 - -1976519482 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var2 != null && !var1.isBlank() && !var2.isBlank() && var1.startsWith(Xqedii_1xktq30f5x89v(var2));
      }
   }

   public int targetPathDepth(String var1) {
      if ((-71218603 * -71218603 - -71218603 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !var1.isBlank()
            ? var1.split(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Rjvw0fHhOwb+HmKdIe58QW9OBqdVdB9jZNiqkzd1QTE=")).length
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17);
      }
   }

   @Override
   public void pruneEditorLayerStateTargets(EditorSession var1) {
      if ((993782613 * (993782613 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1.renderBlocks != null) {
            for (Map var4 : var1.renderBlocks) {
               if (var4 != null && !var4.isEmpty()) {
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30)];
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 9)] = this.stringValue(
                     this.readMapPathValue(
                        var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                     )
                  );
                  String var5 = this.firstNonBlank(var10001);
                  if (!var5.isBlank()) {
                     var2.add(var5);
                  }
               }
            }
         }

         var1.hiddenLayerTargetIds.retainAll(var2);
         var1.lockedLayerTargetIds.retainAll(var2);
         var1.collapsedLayerTargetIds.retainAll(var2);
      }
   }

   @Override
   public void rerenderEditableContentForTargets(Player var1, EditorSession var2, List<String> var3, boolean var4) {
      if ((-1303363201 ^ -1303363201) != 0) {
         throw new IllegalStateException();
      } else {
         this.rerenderEditableContentForTargets(var1, var2, var3, var4, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597241766, 16) != 0));
      }
   }

   @Override
   public void rerenderEditableContentForTargets(Player var1, EditorSession var2, List<String> var3, boolean var4, boolean var5) {
      if ((60944026 ^ 60944026) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         LinkedHashSet var6 = new LinkedHashSet();
         LinkedHashSet var7 = new LinkedHashSet();
         if (var3 != null) {
            for (String var9 : var3) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715544, 0)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 18)] = var9;
               String var10 = this.firstNonBlank(var10001);
               if (!var10.isBlank()) {
                  var6.add(var10);
                  String var11 = this.resolveEditorTargetPath(var2, var10);
                  if (!var11.isBlank()) {
                     var7.add(var11);
                  }
               }
            }
         }

         if (var6.isEmpty() && var7.isEmpty()) {
            this.rerenderEditableContent(var1, var2);
         } else {
            if (!var4) {
               var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
            }

            ArrayList var24 = new ArrayList<>(var2.elements);
            HashMap var25 = new HashMap();

            for (HoverElement var28 : (Iterable<HoverElement>) (var24)) {

               if (var28 != null && var28.id != null && !var28.id.isBlank()) {
                  var25.put(var28.id, var28);
               }
            }

            HashSet var27 = new HashSet();
            ArrayList var29 = new ArrayList();
            HashMap var12 = new HashMap();
            int var13 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546355, 9);

            for (Map var15 : var2.renderBlocks) {
               var13++;
               ConfigurationSection var16 = this.mapToSection(var15);
               if (var16 != null) {
                  String[] var33 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327643, 0)];
                  var33[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748189591, 14)] = var16.getString(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG")
                  );
                  var33[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210717593, 11)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
                  );
                  String var17 = this.firstNonBlank(var33).toLowerCase(Locale.ROOT);
                  if (this.isRenderableBlockType(var17)) {
                     String var18 = this.resolveElementId(var16, var13, var12);
                     String var19 = this.runtimeElementId(var2, var18);
                     var33 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1089803356, 19)];
                     var33[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100614836, 17)] = var16.getString(
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                     );
                     var33[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1711484113, 23)] = var19;
                     String var20 = this.firstNonBlank(var33);
                     var33 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210716569, 10)];
                     var33[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719872721, 23)] = var16.getString(
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4=")
                     );
                     String var21 = this.firstNonBlank(var33);
                     if (!this.isTargetVisible(var2, var20)) {
                        HoverElement var32 = (HoverElement)var25.get(var19);
                        if (var32 != null) {
                           this.removeRenderedElementHud(var1, var32);
                        }
                     } else {
                        var27.add(var19);
                        int var22 = !var6.contains(var20) && !this.isDescendantOfAnyTargetPath(var21, var7)
                           ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1420294457, 0)
                           : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30);
                        HoverElement var23 = (HoverElement)var25.get(var19);
                        if (var22 == 0 && var23 != null) {
                           var29.add(var23);
                        } else {
                           var29.add(this.renderResolvedElement(var1, var2, var16, var19, var17));
                        }
                     }
                  }
               }
            }

            for (HoverElement var31 : (Iterable<HoverElement>) (var24)) {

               if (var31 != null && var31.id != null && !var31.id.isBlank() && !var27.contains(var31.id)) {
                  this.removeRenderedElementHud(var1, var31);
               }
            }

            var2.elements.clear();
            var2.elements.addAll(var29);
            this.normalizeSelectionState(var2);
            if (var2.previewMode) {
               this.renderEditorTransparencyOverlay(var1, var2);
            }

            this.clearEditorOverlaysOnly(var1, var2);
            if (var5) {
               this.updateEditorPropertiesSidebar(var1, var2);
               this.updatePageInfoReadout(var1, var2);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void rerenderEditableContentAfterDeletion(Player var1, EditorSession var2, List<String> var3) {
      if ((430327631 * (430327631 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         boolean var4 = var2.suppressHudTransitionDuringStructureDeletion;
         var2.suppressHudTransitionDuringStructureDeletion = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1613942023, 27) != 0);
         List var5 = this.normalizeRootTargetPaths(var3);
         LinkedHashSet var6 = new LinkedHashSet();

         for (HoverElement var8 : var2.elements) {
            if (var8 != null) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210584473, 17)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113683289, 16)] = var8.id;
               String var9 = this.firstNonBlank(var10001);
               if (!var9.isBlank() && var6.add(var9) && this.isElementAffectedByDeletedRoots(var8, var5)) {
                  this.applyRuntimeHudNoTransition(var1, var9);
               }
            }
         }

         boolean var17 = false /* VF: Semaphore variable */;

         try {
            var17 = true;
            this.rerenderEditableContent(var1, var2);
            var17 = false;
         } finally {
            if (var17) {
               var2.suppressHudTransitionDuringStructureDeletion = var4;
               int var12 = this.resolveEditorHudTransitionTicks(var2);
               if (var12 <= 0) {
                  var12 = this.resolveCursorInterpDurationTicks();
               }

               var12 = Math.max(Xqedii_1s34vun.Xqedii_r62pla0yle6a(212812697, 21), var12);
               var6.clear();
               Iterator var13 = var2.elements.iterator();

               while (true) {
                  if (!var13.hasNext()) {
                     ;
                  } else {
                     HoverElement var14 = (HoverElement)var13.next();
                     if (var14 != null) {
                        String[] var26 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210650009, 16)];
                        var26[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1437336420, 31)] = var14.id;
                        String var15 = this.firstNonBlank(var26);
                        if (!var15.isBlank() && var6.add(var15) && this.hasRuntimeHudNoTransition(var1, var15)) {
                           this.applyRuntimeHudTransitionTicks(var1, var15, var12, var12);
                        }
                     }
                  }
               }
            }
         }

         var2.suppressHudTransitionDuringStructureDeletion = var4;
         int var19 = this.resolveEditorHudTransitionTicks(var2);
         if (var19 <= 0) {
            var19 = this.resolveCursorInterpDurationTicks();
         }

         var19 = Math.max(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210650009, 16), var19);
         var6.clear();

         for (HoverElement var22 : var2.elements) {
            if (var22 != null) {
               String[] var27 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594625, 4)];
               var27[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094215065, 31)] = var22.id;
               String var10 = this.firstNonBlank(var27);
               if (!var10.isBlank() && var6.add(var10) && this.hasRuntimeHudNoTransition(var1, var10)) {
                  this.applyRuntimeHudTransitionTicks(var1, var10, var19, var19);
               }
            }
         }
      }
   }

   public boolean isElementAffectedByDeletedRoots(HoverElement var1, List<String> var2) {
      if ((-912855383 * -912855383 + -912855383 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 11) != 0);
      } else if (var2 != null && !var2.isEmpty()) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 23)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 4)] = var1.targetPath;
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-852297321, 3) != 0);
         } else {
            for (String var5 : var2) {
               var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106967758, 19)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2)] = var5;
               String var6 = this.firstNonBlank(var10001);
               if (!var6.isBlank() && (var3.equals(var6) || this.isDescendantTargetPath(var3, var6))) {
                  return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1890144242, 25) != 0);
               }
            }

            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 20) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210716569, 10) != 0);
      }
   }

   public boolean hasRuntimeHudNoTransition(Player var1, String var2) {
      if (((-1988164648 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || var2.isBlank()) {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1666558980, 23) != 0);
      } else if (!this.hasHudNoTransitionIfExists(var1, var2)
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_3e83hgx93ar3e(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_1yjesus3zp3q3(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_23zt21hc55ckz(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_mxkb500awks0(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_9vyw0ey6tp1x(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_34coe023cmnto(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_82ggdam8tlgy(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_1b416jsbr2kxn(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_2ew9m2p23f57u(var2))
         && !this.hasHudNoTransitionIfExists(var1, Xqedii_q9h6j6f5bqd5(var2))) {
         String var3 = Xqedii_39dfo0kwtwe1v(var2);
         return ((!this.hasHudNoTransitionIfExists(var1, Xqedii_3jzwp0pvx9o74(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_3qyy2vw8v2wmz(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_v80hk6mhc7yv(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_3bwb9y2qqcpqj(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_2cwyoxeq2xzvm(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_2rs74ns6mrhh8(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_1snllc5th7ywi(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_35s5jil5txndz(var3))
               && !this.hasHudNoTransitionIfExists(var1, Xqedii_1ed7j3fb11ob2(var3))
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4)
            : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22) != 0);
      }
   }

   public boolean hasHudNoTransitionIfExists(Player var1, String var2) {
      if ((2135999877 ^ 2135999877) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var3 = this.hudService.getHud(var1, var2);
         return ((var3 != null && this.hudService.hasHudNoTransition(var3)
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24)
            : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 7)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-429968181, 21) != 0);
      }
   }

   @Override
   public void clearSelectionForStructureEdit(Player var1, EditorSession var2) {
      if (((762603463 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         this.finishLayersReorderDrag(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 0) != 0));
         this.stopCursorToolDrag(var2);
         this.stopMarqueeSelection(var1, var2);
         this.resetSidebarFieldDrag(var1, var2);
         this.updateHoveredHighlight(var1, var2, var2.hoveredElementId, null);
         var2.hoveredElementId = null;
         var2.selectedElementId = null;
         var2.additionalSelectedElementIds.clear();
         var2.activeHandle = null;
         var2.resizeAnchorValid = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748159751, 27) != 0);
         var2.handlesCollapsed = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 20) != 0);
         var2.hoveredHandle = null;
         var2.selectionOutlineVisible = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 18) != 0);
         var2.pendingPropertyField = null;
         this.clearPendingTextToolEdit(var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210716569, 10) != 0));
         this.stopOpacitySliderDrag(var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 16) != 0));
         var2.colorPickerGradDragActive = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 30) != 0);
         var2.colorPickerHueDragActive = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1) != 0);
         this.clearAlignToolbarOverlay(var1, var2);
      }
   }

   public boolean handleEditorSelectionNewBlock(Player var1, EditorSession var2) {
      if ((2114105833 * (2114105833 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(
            var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 14) != 0), (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 15) != 0)
         );
      }
   }

   public boolean handleEditorSelectionNewText(Player var1, EditorSession var2) {
      if (((868566673 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(
            var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778047, 5) != 0), (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 23) != 0)
         );
      }
   }

   public boolean handleEditorSelectionNewItem(Player var1, EditorSession var2) {
      if (((-1144518566 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(
            var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26) != 0), (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 15) != 0)
         );
      }
   }

   public boolean handleEditorSelectionNewSkin(Player var1, EditorSession var2) {
      if ((-1175080825 * -1175080825 + -1175080825 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(
            var1,
            var2,
            (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 7) != 0),
            (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-859936361, 22) != 0),
            (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3) != 0)
         );
      }
   }

   public boolean handleEditorSelectionNewInput(Player var1, EditorSession var2) {
      if ((803683815 * (803683815 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(
            var1,
            var2,
            (Xqedii_1s34vun.Xqedii_z5j381o3pwva(798588115, 15) != 0),
            (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 13) != 0),
            (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612389038, 10) != 0),
            (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 9) != 0)
         );
      }
   }

   public boolean handleEditorSelectionDeleteLayer(Player var1, EditorSession var2) {
      if ((-87103576 * (-87103576 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var3 = this.getSelectedTargetIds(var2);
         List var4 = this.resolveSelectedRawTargetIdentities(var2, var3);
         List var5 = this.resolveSelectedRenderableRootTargetPaths(var2);
         if (var4.isEmpty() && var5.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "UfPQBYcOfFdAEOs7ubSRJC+h8eCFiZcihf4cNyjMiHZhLuwUU82g+4U9nSFPsYORIeXjSRWj0EMLyQ8ATeW9OTB+ad1EcdQwBxJ2Jvge4yywEEedPTUPxxJe"
               ),
               new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 21)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 1) != 0);
         } else {
            this.recordEditorMutation(var2);
            int var6 = this.removeEditorTargetsByIdentity(var2, var4);
            if (var6 <= 0 && !var5.isEmpty() && this.removeEditorTargetsByPath(var2, var5)) {
               var6 = var5.size();
            }

            if (var6 <= 0) {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "Xt0gMYz26OKLZsWnJF4X1+tLB+znSEww2e5Ge/c6jIAZ/mrsaLKS1rd4o6CqCHUvugZKTHHHj+mNhljZQAsazu53PLVzIyoCB/+4SUXLrR8Rlg=="
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 23)]
               );
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 7) != 0);
            } else {
               this.clearSelectionForStructureEdit(var1, var2);
               this.rerenderEditableContentAfterDeletion(var1, var2, var5);
               this.renderLayersPanel(var1, var2);
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("hMYLfxJhU3fijIPTK7uMyDDkL+cpuAgFBOA1mOGl57K0hILFgXFC6902kBjDc8AE3DdJTJ+txCnPEI0seZ7keqAw");
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106967758, 19)];
               var10003[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719874586, 10)] = var6;
               this.sendEditorRemoved(var1, var10002, var10003);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(1284457369, 30) != 0);
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31) != 0);
      }
   }

   public boolean handleEditorSelectionMoveLayer(Player var1, EditorSession var2, boolean var3) {
      if (((-1460933744 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var4 = this.getSelectedTargetIds(var2);
         if (var4.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("PCMQAX3hLr7/H1mIOXdzBCHNfUs6NY2+a0dKWbFeyydyHN2ZAxbRSveQlKVNZvl0RiePI1k/1ZpT2K1rXr4lTQgoIQ+yqQ=="),
               new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 2)]
            );
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
         } else {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-626704439, 27)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28420823, 14)] = var2.selectedElementId;
            var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 21)] = (String)var4.getFirst();
            String var5 = this.firstNonBlank(var10001);
            if (var5.isBlank()) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(2134166502, 29) != 0);
            } else {
               List var6 = this.collectLayerTreeRows(var2);
               if (var6.isEmpty()) {
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 5) != 0);
               } else {
                  String var7 = this.resolveDirectLayerParentTargetId(var5);
                  List var8 = this.collectDirectSiblingTargetOrder(var6, var7);
                  int var9 = var8.indexOf(var5);
                  if (var9 < 0) {
                     return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(2134166502, 29) != 0);
                  } else {
                     int var10 = var3 ? var9 - Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 26) : var9 + Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704531989, 6);
                     if (var10 >= 0 && var10 < var8.size()) {
                        ArrayList var11 = new ArrayList(var8);
                        var11.remove(var9);
                        var11.add(var10, var5);
                        Map var12 = this.captureRawTargetsById(var2, var11);
                        if (var12.isEmpty()) {
                           return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 2) != 0);
                        } else {
                           this.recordEditorMutation(var2);
                           boolean var13 = this.applySiblingLayerOrderingOnRawTargets(var2, var12, var11);
                           if (!var13) {
                              return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(945072121, 24) != 0);
                           } else {
                              List var14 = this.getSelectedTargetIds(var2);
                              List var15 = this.captureSelectionTargetPaths(var2, var14);
                              this.rerenderAfterLayersStructureChange(var1, var2, var14, var15);
                              this.renderLayersPanel(var1, var2);
                              return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093999769, 18) != 0);
                           }
                        }
                     } else {
                        return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(227492761, 24) != 0);
                     }
                  }
               }
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612389038, 10) != 0);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void rerenderAfterLayersStructureChange(Player var1, EditorSession var2, List<String> var3, List<String> var4) {
      if ((-212154361 ^ -212154361) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         LinkedHashSet var5 = new LinkedHashSet();

         for (HoverElement var7 : var2.elements) {
            if (var7 != null) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227497649, 17)];
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25)] = var7.id;
               String var8 = this.firstNonBlank(var10001);
               if (!var8.isBlank() && var5.add(var8)) {
                  this.applyRuntimeHudNoTransition(var1, var8);
               }
            }
         }

         boolean var14 = false /* VF: Semaphore variable */;

         try {
            var14 = true;
            super.rerenderAfterLayersStructureChange(var1, var2, var3, var4);
            var14 = false;
         } finally {
            if (var14) {
               int var10 = this.resolveEditorHudTransitionTicks(var2);
               if (var10 <= 0) {
                  var10 = this.resolveCursorInterpDurationTicks();
               }

               var10 = Math.max(Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 21), var10);
               Iterator var11 = var5.iterator();

               while (true) {
                  if (!var11.hasNext()) {
                     ;
                  } else {
                     String var12 = (String)var11.next();
                     if (this.hasRuntimeHudNoTransition(var1, var12)) {
                        this.applyRuntimeHudTransitionTicks(var1, var12, var10, var10);
                     }
                  }
               }
            }
         }

         int var16 = this.resolveEditorHudTransitionTicks(var2);
         if (var16 <= 0) {
            var16 = this.resolveCursorInterpDurationTicks();
         }

         var16 = Math.max(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210453401, 18), var16);

         for (String var19 : (Iterable<String>) (var5)) {

            if (this.hasRuntimeHudNoTransition(var1, var19)) {
               this.applyRuntimeHudTransitionTicks(var1, var19, var16, var16);
            }
         }
      }
   }

   public boolean handleSelectionCreateElement(Player var1, EditorSession var2, boolean var3, boolean var4) {
      if ((712133927 * (712133927 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(var1, var2, var3, var4, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11) != 0));
      }
   }

   public boolean handleSelectionCreateElement(Player var1, EditorSession var2, boolean var3, boolean var4, boolean var5) {
      if ((-162731628 * -162731628 + -162731628 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleSelectionCreateElement(var1, var2, var3, var4, var5, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11) != 0));
      }
   }

   public boolean handleSelectionCreateElement(Player var1, EditorSession var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (((-642251889 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null) {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28) != 0);
      } else if (var3 && var4) {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 29) != 0);
      } else if (!var5 || !var3 && !var4) {
         if (!var6 || !var3 && !var4 && !var5) {
            if (var2.rawBlocks == null) {
               var2.rawBlocks = new ArrayList<>();
            }

            double var7 = var2.previewViewport == null
               ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1175386339781841126L, 53))
               : var2.previewViewport.pageWidth;
            double var9 = var2.previewViewport == null
               ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-6128927073258102519L, 24))
               : var2.previewViewport.pageHeight;
            double var11 = var6
               ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-5829112803581980006L, 28))
               : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(-5780119544604716826L, 0));
            double var13 = var6
               ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(3074035754240419211L, 30))
               : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-7875752977332915542L, 42));
            double var15 = var7 / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(3629105636925069786L, 1))
               - var11 / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-3843177079867512478L, 28));
            double var17 = var9 / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730776671391974L, 32))
               - var13 / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(802778087122752296L, 62));
            double var19 = this.resolveSelectionCreateLayer(var2);
            String var21 = var6
               ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("2JEYvlmrPC4quRKCU0NZu4r93eh3rxTssMSonAKnXs2xKbx0FMc=")
               : (
                  var5
                     ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("td6MzRlLtsPGZxCE3Jehl2yGsA/mIux12eZb02TGfkZXWyzM")
                     : (
                        var3
                           ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T")
                           : (
                              var4
                                 ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("RgTviNPabyrCjnN3kxOuCnbgSRZptuRPa6AYTfdGsAbX/9yh")
                                 : Xqedii_1s34vun.Xqedii_997tx7qg1fze("0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc=")
                           )
                     )
               );
            String var22 = this.buildSelectionCreatedElementId(var2, var21);
            String var23 = this.buildUniqueTargetDisplayName(
               var2,
               var6
                  ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("cmoDrpyjTMzQf0jyZIzOyoDXC9qJOdWovPDvvVbrjaq+TjxHOdw=")
                  : (
                     var5
                        ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("4pCTNTl1nj4qYbuZs5/4ozvpCdo32Ya5AY0iG6xihDpYl/EY")
                        : (
                           var3
                              ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("o+4djZwPkWpW+XhPXEKYvXi5Aw69zNbw3S13eAiaK2j5gklnXBid5LPrjE93q8cc")
                              : (
                                 var4
                                    ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("sVc7l8ubPP4CfUFNX7lp48ybJP+uB21Eo3MSvZlzOqNGltHl")
                                    : Xqedii_1s34vun.Xqedii_997tx7qg1fze("u4fPTWHhrVhdYg57N7IyFIr/G1kh7+H+f1OZJ3rLOiz1R7ES9/k=")
                              )
                        )
                  ),
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
            );
            LinkedHashMap var24 = new LinkedHashMap();
            var24.put(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG"),
               var6
                  ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("2JEYvlmrPC4quRKCU0NZu4r93eh3rxTssMSonAKnXs2xKbx0FMc=")
                  : (
                     var5
                        ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("td6MzRlLtsPGZxCE3Jehl2yGsA/mIux12eZb02TGfkZXWyzM")
                        : (
                           var3
                              ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T")
                              : Xqedii_1s34vun.Xqedii_997tx7qg1fze("0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc=")
                        )
                  )
            );
            var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZdDghZzZXaf+khU6WzJyuq6FQJFBQ7qo+6yAQeJW0Hg="), var22);
            var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var23);
            var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("t7SBeUuHaDwVhxrO5LFMRRmBJuq5F6TXaI5t+29jp7JJonUGVAw="), var19);
            var24.put(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("WofidcUlKDlwcu6d57h53mwP5EKDg4pPNSCYYXZBOK+ENBQLYrQ8BWtx"),
               Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704590561, 4)
            );
            var24.put(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("HyRpV2KDooVtmbk273ZdNsMDVqMPIyNttC2IAdfZsUqIcVkkuB0="),
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("bOFqF+lIVVp7WsKRDdHLA1WcsVOihKrkNrw/JVGFvZZFyskKt2yZZg==")
            );
            if (var6) {
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("HyRpV2KDooVtmbk273ZdNsMDVqMPIyNttC2IAdfZsUqIcVkkuB0="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Kei5tqXVbrKLc5vu2ZcPuDIXWLm2mX8Fe0980NuIIbbTrykS5xfrqA==")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("SE+KZGOB4BYSBB3BXFOJwWdDNXD8cKaUeeWbwKIYII6rK2fxDxY="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("64Goa4apjhCVGOCAmG9clQMTptYqioiwH+d3F3Ui2IeF8z7Y")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("5ZEnBESX6BawG68zkzRTYRs/VeR9oRF9zV0XmWhyWlLrYfn0ShPb4s503aOBkfdqdoQ="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("vKGocheg2MFHYGU16yR/vF4xUZpIrGMmu7evZAVofQtqBUp/DDPIOwiT9pjBzvGwotoQDTHSG/3HXmLz")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("TO8HPM8cEfyotkmDebHHgoBn1CDowuF1hTpnb0Y8TK7PIfrciN3UqAbWcb3bgrfzqH+krPkVySGSu+Ah/PM="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("1Wes44GxXHnOjL9DOckV2h49qF0w6ik5nhTrQrIf8+LkzrzWc0Nz5A==")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("LSBum9C5kPttSAGAG1Btsn9ia007OrVWPGW4IXQoGf6wSvunSDek2Tjc6HcOkQ6+"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("bOFqF+lIVVp7WsKRDdHLA1WcsVOihKrkNrw/JVGFvZZFyskKt2yZZg==")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("BrL28ydLKoWFy6PA6h78n1BTCoJOzR4+qwzmNOoWuSfthcvYQ98="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("o+4djZwPkWpW+XhPXEKYvXi5Aw69zNbw3S13eAiaK2j5gklnXBid5LPrjE93q8cc")
               );
               var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("0QQN+4rYHnHyGnJiRw3Crx2K0D9v2SCBU/N8akHdDU5Ckltp5+Z8aGPItKw="), var22);
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("RrRDBnpUc6mnKeYp9GxElLDfUCRGPSjy8vgBuxfQwpMyH97D9A5AhLULZmY8++nR"),
                  Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1089557596, 14)
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Ht5EnClLo5i+pyv4OwOJ1oaONvVtKWOHJAvnyOJYCpEL8ig+DYQSs6RmycqaDM/hdwA="),
                  Boolean.valueOf((Xqedii_1s34vun.Xqedii_r62pla0yle6a(210723737, 13) != 0))
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("eBC+6OJHCLYXSIRCykLK1+CX/y2BKKaurOyyqGhWfoRg4G9hLsVZ8Ebu"),
                  Xqedii_1s34vun.Xqedii_z5j381o3pwva(-817993321, 22)
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("ooR1QzKIJ5fF73uXYH0blensAY9ih6usExhhfTAM+hgwrCuT6+Mh3qo8"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("NUP7ZyHLwBfVwGE7mHy4jfc1CP2LPRM9wC02FvJw")
               );
            } else if (var3) {
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("xk3STxAJ7Y+7iR3tpLZ/8xHoX/kzPu4NkR6fvdI90zpEENLw"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("1K7XbeVjEm+NGthl2SGxM/Gb6uzTUrt15kmtaYAMGojzy+mNZkvC1VBg")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("SE+KZGOB4BYSBB3BXFOJwWdDNXD8cKaUeeWbwKIYII6rK2fxDxY="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("64Goa4apjhCVGOCAmG9clQMTptYqioiwH+d3F3Ui2IeF8z7Y")
               );
               var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T"), var23);
            } else if (var4) {
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("RgTviNPabyrCjnN3kxOuCnbgSRZptuRPa6AYTfdGsAbX/9yh"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("FrosRis4HupdAf6KgO1+WguRHjQo2u2bx3z/vDgENAVqgS2gpWWgMZBl")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("ooR1QzKIJ5fF73uXYH0blensAY9ih6usExhhfTAM+hgwrCuT6+Mh3qo8"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("NUP7ZyHLwBfVwGE7mHy4jfc1CP2LPRM9wC02FvJw")
               );
            } else if (var5) {
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("td6MzRlLtsPGZxCE3Jehl2yGsA/mIux12eZb02TGfkZXWyzM"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("9bMgBlrKXHHGwAsFmhDRCCinv5LWpD/zfAjiYoQOnASLxFCIECLs7V/4b2c=")
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("xxgQi9XPEEYhIgRZNfMhEYHESHbQroJjeHlTAn5+GNl6uadU"),
                  Boolean.valueOf((Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11) != 0))
               );
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("MxThDF5FMWOGdHvokWVmLIweYnk0Uq9b5vPUMdq3j6vz3zK/KtWuHOAwLnQ="),
                  Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28)
               );
               LinkedHashMap var25 = new LinkedHashMap();
               String[] var26 = SKIN_PART_NAMES;
               int var27 = var26.length;

               for (int var28 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 22); var28 < var27; var28++) {
                  String var29 = var26[var28];
                  LinkedHashMap var30 = new LinkedHashMap();
                  var30.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("LEn//mi0M8N+GeOmB8WjeUMrEJPh2F+tKD5KsxWQ"), Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778015, 5));
                  var30.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zpHmi7Xogimjku7V9FsbYpLGgx944ZqTMeEwvfRK"), Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 20));
                  var30.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("TZzuthpCQbZ+NHJX7NnS9qzZnKSgXV3zhk6XLMF8"), Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29));
                  LinkedHashMap var31 = new LinkedHashMap();
                  var31.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("MxThDF5FMWOGdHvokWVmLIweYnk0Uq9b5vPUMdq3j6vz3zK/KtWuHOAwLnQ="), var30);
                  var25.put(var29, var31);
               }

               var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("kRXkNLNZ3OqsEmMIF+Gndm+hAxc1+xtIUPAh0NUX1VTkYKK5ra4="), var25);
               LinkedHashMap var33 = new LinkedHashMap();
               var33.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("3rh7vHCFQc1viDlYO93wl/HM44A68iPrAjN67N6AKYMtVBhas8RJ9Q/E1hE="),
                  Boolean.valueOf((Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 25) != 0))
               );
               var33.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("hxMyIg+8Lkoa3/YM5+0933qhWQ6bIRRNTDVshNOrWdWg3Rk2ELRdUNXQZKlCXrvH"),
                  Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715473, 1)
               );
               var33.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("K5Zo76WYuJgXmO7Cr/VKMT9sVZcZNSpiXS5OqvIfH4wcubBcBsM="),
                  Boolean.valueOf((Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 6) != 0))
               );
               var33.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("aGpZchxWe37Vit5JiXu80LYUWFAw7XdZLx2JpOSltG8FfQqpybon6I3x"),
                  Boolean.valueOf((Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11) != 0))
               );
               var33.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Dv0bBs7kd7pjLc9Cb3Gxomb1EQw6va5WkFRmra8JvphIgqb8Dhm8gX74SDJnNYHLc7929i0E"),
                  Boolean.valueOf((Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100376116, 30) != 0))
               );
               var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("hWhfupO9Hgemf0NUJReJK6dvR84FFxKINrCd8h2zOyzEjBD5"), var33);
            } else {
               var24.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("ooR1QzKIJ5fF73uXYH0blensAY9ih6usExhhfTAM+hgwrCuT6+Mh3qo8"),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("NUP7ZyHLwBfVwGE7mHy4jfc1CP2LPRM9wC02FvJw")
               );
            }

            LinkedHashMap var32 = new LinkedHashMap();
            var32.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("LEn//mi0M8N+GeOmB8WjeUMrEJPh2F+tKD5KsxWQ"), var15);
            var32.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zpHmi7Xogimjku7V9FsbYpLGgx944ZqTMeEwvfRK"), var17);
            var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vT3cdelnJZVB1q9R7PLU9kSODZEZ71UZSSAKO1GC3gDvQoB16LpyIlUVp+U="), var32);
            LinkedHashMap var34 = new LinkedHashMap();
            var34.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("/WtAglIkBrfpji+oWH48tI3yN+uQFTKlqNpaFquar4GKqcFtcWk="), var11);
            var34.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("q9TUTgzkJCjE2KZ69nYhnWWlicRU1VPTzwTR3RrDRFTYe/5kYmqQ9g=="), var13);
            var24.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("MzCWZMCNa41eyj2nNDijxKu+zbPiV0ARVvRUgcUMmsb+P3dg"), var34);
            int var35 = this.resolveMaxPageElements();
            if (var2.rawBlocks.size() >= var35) {
               this.sendEditorLimitReached(var1, var35);
               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454733153, 18) != 0);
            } else {
               this.recordEditorMutation(var2);
               int var36 = var2.rawBlocks.size();
               var2.rawBlocks.add(var24);
               String var37 = String.valueOf(var36);
               var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
               this.pruneEditorLayerStateTargets(var2);
               this.clearSelectionForStructureEdit(var1, var2);
               this.rerenderEditableContentForTargets(
                  var1,
                  var2,
                  List.of(var37),
                  (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0),
                  (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 24) != 0)
               );
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 25)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20)] = this.findTargetIdByPath(var2, var37);
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874821, 4)] = var37;
               String var38 = this.firstNonBlank(var10001);
               var2.selectedElementId = var38;
               var2.additionalSelectedElementIds.clear();
               var2.selectionOutlineVisible = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751855108, 7) != 0);
               this.normalizeSelectionState(var2);
               this.rerenderEditableSelection(var1, var2);
               this.renderLayersPanel(var1, var2);
               this.updatePageInfoReadout(var1, var2);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(214909849, 22) != 0);
            }
         } else {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597176230, 16) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12) != 0);
      }
   }

   public double resolveSelectionCreateLayer(EditorSession var1) {
      if ((2117388992 * 2117388992 - 2117388992 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-4832296249022251742L, 0));
      } else {
         double var2 = Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-9211643607838318356L, 8));
         List var4 = this.getSelectedTargetIds(var1);
         if (var4 != null && !var4.isEmpty()) {
            for (String var6 : (Iterable<String>) (var4)) {

               if (var6 != null && !var6.isBlank()) {
                  var2 = Math.max(var2, this.readTargetLayer(var1, var6));
               }
            }
         }

         if (!Double.isFinite(var2)) {
            for (String var8 : this.resolveAllSelectionTargetIds(var1)) {
               if (var8 != null && !var8.isBlank()) {
                  var2 = Math.max(var2, this.readTargetLayer(var1, var8));
               }
            }
         }

         return !Double.isFinite(var2)
            ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(8935207811849354529L, 4))
            : var2 + Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701091L, 12));
      }
   }

   @Override
   public String buildSelectionCreatedElementId(EditorSession var1, String var2) {
      if (((-137930100 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 26)];
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537166, 0)] = var2;
         String var3 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (var3.isBlank()) {
            var3 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc=");
         }

         String var4 = var3;

         for (int var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8);
            this.isReservedEditorTargetId(var1, var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="))
               || this.hasConflictingContentTargetId(var1, var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="))
               || this.hasConflictingRawBlockId(var1, var4);
            var5++
         ) {
            var4 = Xqedii_g413slj7hf2s(var3, var5);
         }

         return var4;
      }
   }

   public boolean hasConflictingRawBlockId(EditorSession var1, String var2) {
      if ((773113990 * 773113990 - 773113990 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 27)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 13)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isBlank()) {
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10) != 0);
         } else {
            return var1 != null && var1.rawBlocks != null && this.rawBlockIdInUse(var1.rawBlocks, var3, Xqedii_1s34vun.Xqedii_z5j381o3pwva(798588115, 15));
         }
      }
   }

   public boolean rawBlockIdInUse(List<?> var1, String var2, int var3) {
      if ((-1404898187 ^ -1404898187) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var3 <= Xqedii_1s34vun.Xqedii_z5j381o3pwva(-137547015, 27)) {
         for (Object var5 : var1) {
            if (var5 instanceof Map var6) {
               if (this.rawBlockValueMatches(var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZdDghZzZXaf+khU6WzJyuq6FQJFBQ7qo+6yAQeJW0Hg=")), var2)
                  || this.rawBlockValueMatches(
                     var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("0QQN+4rYHnHyGnJiRw3Crx2K0D9v2SCBU/N8akHdDU5Ckltp5+Z8aGPItKw=")), var2
                  )) {
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 10) != 0);
               }

               if (var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("/nXFr31eyLvfai85ISdzkR7gXFJ+CwrSGn1vaFQD3OTAjw9wOnPFMwVlciA=")) instanceof List var7
                  && this.rawBlockIdInUse(var7, var2, var3 + Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18))) {
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 0) != 0);
               }
            }
         }

         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 10) != 0);
      }
   }

   public boolean rawBlockValueMatches(Object var1, String var2) {
      if ((685108086 * (685108086 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var2.equalsIgnoreCase(var1.toString().trim())
            ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27)
            : Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25)) != 0);
      }
   }

   public boolean handleEditorSelectionSelectAll(Player var1, EditorSession var2) {
      if ((688311098 * (688311098 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var3 = this.resolveAllSelectionTargetIds(var2);
         if (var3.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "ZmcD1G/OlGniXTONnG39jgecTj4FOrhiJwVUMUmzvFLv5pu4/0Y1MLSSte+tGFMiRihul+sOOE0XIqDUdXXFoPXIp9kl3oEF0M3oFx7XzJX5W19qXk9PfaddVMs="
               ),
               new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751855236, 7)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0);
         } else {
            this.applySelectionTargetIds(var1, var2, var3);
            String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "ydma9hdR3AevrS/Bt3lxcv2AspYdmsZpnB3rPIEPknYpxZWAYKvtwruJDSvhlD7+iDhyGimNEzJHsGoLq4g/WFA5c0xYMLPa"
            );
            Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210529, 2)];
            var10003[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 3)] = var3.size();
            this.sendEditorSuccess(var1, var10002, var10003);
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210584473, 17) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855221855, 24) != 0);
      }
   }

   public boolean handleEditorSelectionClear(Player var1, EditorSession var2) {
      if (((-224007474 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.clearSelectionState(var1, var2);
         this.renderLayersPanel(var1, var2);
         this.sendEditorRemoved(
            var1,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("ErgC7aqaX2lNdHcBYFWF5T9jiYP93x2GrFnOXZCfYIXNqSDYmfs5X/5GDPLZV3iA2GiJtnJpCeW+6SB0yEem8sNgKfDHqaB/vrbhoA=="),
            new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 12)]
         );
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503710471, 8) != 0);
      }
   }

   public boolean handleEditorSelectionReverse(Player var1, EditorSession var2) {
      if ((-1468128746 ^ -1468128746) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var3 = this.resolveAllSelectionTargetIds(var2);
         if (var3.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "ZmcD1G/OlGniXTONnG39jgecTj4FOrhiJwVUMUmzvFLv5pu4/0Y1MLSSte+tGFMiRihul+sOOE0XIqDUdXXFoPXIp9kl3oEF0M3oFx7XzJX5W19qXk9PfaddVMs="
               ),
               new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 1)]
            );
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27) != 0);
         } else {
            LinkedHashSet var4 = new LinkedHashSet<>(this.getSelectedTargetIds(var2));
            ArrayList var5 = new ArrayList();

            for (String var7 : (Iterable<String>) (var3)) {

               if (!var4.contains(var7)) {
                  var5.add(var7);
               }
            }

            this.applySelectionTargetIds(var1, var2, var5);
            this.sendEditorSuccess(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("cUaYveb3IjVuDzIPtbxmaa/Niu5vrXXvRreS4RzuVMD9UL+o2+xP7kMtBchEFStJmla+LsY8udMFi6b2ZP/bAxGv"),
               new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 2)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 20) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 23) != 0);
      }
   }

   public boolean handleEditorSelectionVisibility(Player var1, EditorSession var2, boolean var3) {
      if (((1403681298 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var4 = this.getSelectedTargetIds(var2);
         if (var4.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("XJ61jaukVEwN1+oHR010Zmx0AnNe6frMHvrR4tyi3vlrSm4rZKQ7AMPlFoWC/tgp5jwVArIiRvQVS9KovWY0qZmiBHU="),
               new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 12)]
            );
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070187173, 11) != 0);
         } else {
            LinkedHashSet var5 = new LinkedHashSet();

            for (String var7 : (Iterable<String>) (var4)) {

               var5.addAll(this.resolveVisibilityCascadeTargetIds(var2, var7));
            }

            int var10 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778015, 5);

            for (String var8 : (Iterable<String>) (var5)) {

               boolean var9 = var2.hiddenLayerTargetIds.contains(var8);
               if (var3 && var9) {
                  var10 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715417, 7);
                  break;
               }

               if (!var3 && !var9) {
                  var10 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715549, 2);
                  break;
               }
            }

            if (var10 == 0) {
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(227492761, 24) != 0);
            } else {
               this.recordEditorMutation(var2);
               if (var3) {
                  var2.hiddenLayerTargetIds.removeAll(var5);
               } else {
                  var2.hiddenLayerTargetIds.addAll(var5);
               }

               if (var5.contains(var2.hoveredElementId)) {
                  this.updateHoveredHighlight(var1, var2, var2.hoveredElementId, null);
                  var2.hoveredElementId = null;
               }

               this.normalizeSelectionState(var2);
               this.rerenderEditableSelection(var1, var2);
               this.refreshSelectionOutlineColorOnly(var1, var2);
               this.updateEditorPropertiesSidebar(var1, var2);
               this.renderLayersPanel(var1, var2);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210748313, 15) != 0);
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22) != 0);
      }
   }

   public boolean handleEditorSelectionLock(Player var1, EditorSession var2, boolean var3) {
      if (((680559666 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var4 = this.getSelectedTargetIds(var2);
         if (var4.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("XJ61jaukVEwN1+oHR010Zmx0AnNe6frMHvrR4tyi3vlrSm4rZKQ7AMPlFoWC/tgp5jwVArIiRvQVS9KovWY0qZmiBHU="),
               new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 12)]
            );
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855220173, 11) != 0);
         } else {
            int var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 14);

            for (String var7 : (Iterable<String>) (var4)) {

               boolean var8 = var2.lockedLayerTargetIds.contains(var7);
               if (var3 != var8) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546867, 9);
                  break;
               }
            }

            if (var5 == 0) {
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 1) != 0);
            } else {
               this.recordEditorMutation(var2);

               for (String var10 : (Iterable<String>) (var4)) {

                  if (var3) {
                     var2.lockedLayerTargetIds.add(var10);
                  } else {
                     var2.lockedLayerTargetIds.remove(var10);
                  }
               }

               if (var3 && var4.contains(var2.hoveredElementId)) {
                  this.updateHoveredHighlight(var1, var2, var2.hoveredElementId, null);
                  var2.hoveredElementId = null;
               }

               this.refreshSelectionOutlineColorOnly(var1, var2);
               this.updateEditorPropertiesSidebar(var1, var2);
               this.renderLayersPanel(var1, var2);
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 14) != 0);
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094215065, 31) != 0);
      }
   }

   public List<String> resolveAllSelectionTargetIds(EditorSession var1) {
      if (((1073495213 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyList();
      } else {
         var1.renderBlocks = this.resolveRenderableBlocks(var1.rawBlocks, var1.components, var1);
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1.renderBlocks != null && !var1.renderBlocks.isEmpty()) {
            HashMap var3 = new HashMap();
            int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26);

            for (Map var6 : var1.renderBlocks) {
               var4++;
               if (var6 != null && !var6.isEmpty()) {
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(855222221, 11)];
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31)] = this.stringValue(
                     this.readMapPathValue(var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG"))
                  );
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
                  );
                  String var7 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  if (this.isRenderableBlockType(var7)) {
                     String var8 = this.resolveElementId(var6, var4, var3);
                     String var9 = this.runtimeElementId(var1, var8);
                     var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090335836, 13)];
                     var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(657102079, 21)] = this.stringValue(
                        this.readMapPathValue(
                           var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                        )
                     );
                     var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-56874413, 15)] = var9;
                     String var10 = this.firstNonBlank(var10001);
                     if (!var10.isBlank()) {
                        var2.add(var10);
                     }
                  }
               }
            }

            return new ArrayList<>(var2);
         } else {
            return new ArrayList<>(var2);
         }
      }
   }

   public void applySelectionTargetIds(Player var1, EditorSession var2, List<String> var3) {
      if (((-1020223253 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.finishLayersReorderDrag(var1, var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1) != 0));
         this.stopCursorToolDrag(var2);
         this.stopMarqueeSelection(var1, var2);
         this.resetSidebarFieldDrag(var1, var2);
         this.clearEditorOverlaysOnly(var1, var2);
         var2.activeHandle = null;
         var2.resizeAnchorValid = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-852297321, 3) != 0);
         var2.handlesCollapsed = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 6) != 0);
         var2.hoveredHandle = null;
         var2.selectedElementId = null;
         var2.additionalSelectedElementIds.clear();
         if (var3 != null) {
            for (String var5 : var3) {
               this.appendSelectionTarget(var2, var5);
            }
         }

         this.normalizeSelectionState(var2);
         var2.selectionOutlineVisible = ((var2.selectedElementId != null
            ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(479151001, 28)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(714407719, 29)) != 0);
         if (var2.selectionOutlineVisible) {
            this.showSelectionOverlay(var1, var2);
         }

         this.updateEditorPropertiesSidebar(var1, var2);
         this.renderLayersPanel(var1, var2);
      }
   }

   public boolean handleEditorEditCopy(Player var1, EditorSession var2) {
      if ((-1629316555 * -1629316555 - -1629316555 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleEditorEditCopy(var1, var2, null);
      }
   }

   public boolean handleEditorEditCopy(Player var1, EditorSession var2, List<String> var3) {
      if ((661087127 * (661087127 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var4 = this.resolveEditorCutCopyTargetPaths(var2, var3);
         if (var4.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "2r5i/Xo/tfdKiVfywhmfI/GkZyRZkWp4mR+bkgy4rG+alewR5mL6hPBp09QM043k8dT54dspRkT+4gcl+PcsAqiL8pxOE9SpYDVMkNPvkQnlj5y5auGAxeNgbDw="
               ),
               new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 2)]
            );
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1067083251, 28) != 0);
         } else {
            List var5 = this.copyEditorTargetsByPath(var2, var4);
            if (var5.isEmpty()) {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "R8PTGIAEi+0AgNbFA6r3Cv/+/L77EyQomo9umas+MgKdOESvGhU8Nx1Rphp875Cz3QrCyaIvwsUSLtGG8Jrza4Z027vzenTy5Gg1vSoE2wvFH1XNdiM="
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 24)]
               );
               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1674947588, 23) != 0);
            } else {
               var2.editClipboardBlocks.clear();
               var2.editClipboardBlocks.addAll(var5);
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "IJm0hMDBLIoTfGbAQGhDHnS29C3p4MPjU8yiEdZssGPto+/Vh88hUvqWHjryyWQEoTDNYbwTxh2D7eDccDiDilLU/sc="
               );
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20)];
               var10003[Xqedii_1s34vun.Xqedii_z5j381o3pwva(798588115, 15)] = var5.size();
               this.sendEditorSuccess(var1, var10002, var10003);
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1711484113, 23) != 0);
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(961849337, 24) != 0);
      }
   }

   public boolean handleEditorEditCut(Player var1, EditorSession var2) {
      if ((-1810876783 * (-1810876783 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleEditorEditCut(var1, var2, null);
      }
   }

   public boolean handleEditorEditCut(Player var1, EditorSession var2, List<String> var3) {
      if ((252533302 * 252533302 + 252533302 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         List var4 = this.resolveEditorCutCopyTargetPaths(var2, var3);
         if (var4.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "RoLZ31/81b98hmm5kkZVm3E2Ca3Jk/ZjkbLBpkmgwZGBhystm8Lgr2HuDd6s46ct6u/A9TIQVo2Lp5LZiJVA40eI4AAeFzkIGrHJh3wpX20Vgi9p4pvs1+yL"
               ),
               new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 9)]
            );
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29) != 0);
         } else {
            List var5 = this.copyEditorTargetsByPath(var2, var4);
            if (var5.isEmpty()) {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "lTtHe+bWjuLxp5iIpnQ1gshw300uCjBGiDDnt8eA6jqgHjIgb0dXWE8KOoRmq9hi1sR6dCuGtwnP1c/UIdRRdNjBDLXIc2Dv+Q3mFhBfzBqIpN4H"
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 26)]
               );
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(202326937, 23) != 0);
            } else {
               this.recordEditorMutation(var2);
               if (!this.removeEditorTargetsByPath(var2, var4)) {
                  this.sendEditorError(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "qqpBj0MlOuCa5vC+sQtDTm7OYhVaUtNACr9LLGvrLVzgbhBYcJ4hKlStq8EI3hyl+vtNLVVkD45AXuvK+rbvdPXmdz2HQKK7Y7SSQNmXi9xMSXhrN8FUTGuf"
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(855218125, 11)]
                  );
                  return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210650009, 16) != 0);
               } else {
                  var2.editClipboardBlocks.clear();
                  var2.editClipboardBlocks.addAll(var5);
                  this.clearSelectionForStructureEdit(var1, var2);
                  this.rerenderEditableContentAfterDeletion(var1, var2, var4);
                  this.renderLayersPanel(var1, var2);
                  String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("xY/AXh0HC8KrYuqMtUmsGSEhQXyliLa+KpW7elMxCwhQppy7iK8kQhB7uziXIyBPct8UESO2V5xZnHiie5A=");
                  Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(855220173, 11)];
                  var10003[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 3)] = var5.size();
                  this.sendEditorSuccess(var1, var10002, var10003);
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1067083251, 28) != 0);
               }
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594641, 4) != 0);
      }
   }

   public boolean handleEditorEditPaste(Player var1, EditorSession var2) {
      if (((170499531 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null) {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 0) != 0);
      } else if (var2.editClipboardBlocks != null && !var2.editClipboardBlocks.isEmpty()) {
         EditorRect var3 = this.getSelectedBounds(var2);
         double var4;
         double var6;
         if (var3 != null) {
            var4 = var3.x + var3.width / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-5497658493597734254L, 50));
            var6 = var3.y + var3.height / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-2979606046830176904L, 39));
         } else {
            double var8 = var2.previewViewport == null
               ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(3483573782663863056L, 12))
               : var2.previewViewport.pageWidth;
            double var10 = var2.previewViewport == null
               ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773449500180L, 20))
               : var2.previewViewport.pageHeight;
            var4 = var8 / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(6474542790055908681L, 49));
            var6 = var10 / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701526L, 5));
         }

         this.recordEditorMutation(var2);
         if (var2.rawBlocks == null) {
            var2.rawBlocks = new ArrayList<>();
         }

         int var24 = this.resolveMaxPageElements();
         if (var2.rawBlocks.size() >= var24) {
            this.sendEditorLimitReached(var1, var24);
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1711484113, 23) != 0);
         } else {
            int var9 = var2.rawBlocks.size();
            int var25 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 1);

            for (Map var12 : var2.editClipboardBlocks) {
               if (var12 != null && !var12.isEmpty()) {
                  var2.rawBlocks.add(this.deepCopyMap(var12));
                  var25++;
               }
            }

            if (var25 <= 0) {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "/cxgyPFKjnGr/qPZznRNYg/Sr1M0d2qu8WqEfW1ntfhhlecyPfAKnaZWhwy6mNventmi8YZQij67ruXMcOJhQvahlXUrNh6jCK+KJ1d01Jc="
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 21)]
               );
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29) != 0);
            } else {
               ArrayList var26 = new ArrayList(var25);

               for (int var27 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17); var27 < var25; var27++) {
                  var26.add(String.valueOf(var9 + var27));
               }

               var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
               this.pruneEditorLayerStateTargets(var2);
               EditorRect var28 = null;

               for (String var14 : (Iterable<String>) (var26)) {

                  var28 = this.mergeBounds(var28, this.getTargetBounds(var2, var14));
               }

               if (var28 != null) {
                  double var29 = var28.x + var28.width / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(2330652278057013478L, 62));
                  double var15 = var28.y + var28.height / Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(802778087122752296L, 62));
                  double var17 = var4 - var29;
                  double var19 = var6 - var15;
                  if (Math.abs(var17) > Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-7168760977091172031L, 25))
                     || Math.abs(var19) > Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(946225093481598039L, 39))) {
                     for (String var22 : (Iterable<String>) (var26)) {

                        EditorRect var23 = this.getTargetBounds(var2, var22);
                        if (var23 != null) {
                           this.applyBoundsToTarget(var2, var22, new EditorRect(var23.x + var17, var23.y + var19, var23.width, var23.height));
                        }
                     }

                     var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
                     this.pruneEditorLayerStateTargets(var2);
                  }
               }

               this.clearSelectionForStructureEdit(var1, var2);
               this.rerenderEditableContentForTargets(
                  var1, var2, var26, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(355073614, 30) != 0), (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9) != 0)
               );
               ArrayList var30 = new ArrayList(var26.size());

               for (String var33 : (Iterable<String>) (var26)) {

                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 5)];
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 9)] = this.findTargetIdByPath(var2, var33);
                  var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210191257, 19)] = var33;
                  String var16 = this.firstNonBlank(var10001);
                  if (!var16.isBlank() && !var30.contains(var16)) {
                     var30.add(var16);
                  }
               }

               if (var30.isEmpty()) {
                  var30.addAll(var26);
               }

               var2.selectedElementId = (String)var30.getFirst();
               var2.additionalSelectedElementIds.clear();

               for (int var32 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751855108, 7); var32 < var30.size(); var32++) {
                  var2.additionalSelectedElementIds.add((String)var30.get(var32));
               }

               var2.selectionOutlineVisible = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1743998142, 25) != 0);
               this.normalizeSelectionState(var2);
               var2.pasteSelectionClickGuardUntilTick = Xqedii_38o2zes.Xqedii_316oplq() + Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-4869707135520077206L, 30);
               this.rerenderEditableSelection(var1, var2);
               this.renderLayersPanel(var1, var2);
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "K866bxh9XnMMwkeZGgd4Arpg1fnDTlstitCdgo2Q3uqGhuagC9Uy2yFVKdp/g44GT1OdRNx6P0zq611R7okuwMgny18="
               );
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210584473, 17)];
               var10003[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748159751, 27)] = var30.size();
               this.sendEditorSuccess(var1, var10002, var10003);
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 0) != 0);
            }
         }
      } else {
         this.sendEditorError(
            var1,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("625cN2BqVlpO74SfSRsxX3qBO3ylvqCWflX/EAxzFm39v6Q7+PC8UWZaqh2JsGk5yELFteH8j6Bit9QQTS6BSV7jHbetXpPmi3c="),
            new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556030, 6)]
         );
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-427871029, 21) != 0);
      }
   }

   public boolean hasCurrentPageName(EditorSession var1) {
      if ((-750650906 * -750650906 - -750650906 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 10) != 0);
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(212812697, 21)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 28)] = var1.pageName;
         String var2 = this.firstNonBlank(var10001).trim();
         if (!var2.isEmpty() && !this.isInternalEditorPageName(var2)) {
            return ((!this.isInternalEditorFile(var1.pageFile)
               ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10)
               : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 9)) != 0);
         } else {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855221855, 24) != 0);
         }
      }
   }

   public boolean isShadersEditorEnabled() {
      if ((-1178042228 * (-1178042228 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.plugin
            .getConfig()
            .getBoolean(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "pOqdFUhCQuHz1pqcSmsaQwIZ1tWfwEgqWJmz5NRMvPcLNag5VPIdboTldYM3jdqEFi4PTLfmshfwy2/BqN3JEe5JwkgN7rtC4z13gYdH0qVjyQ=="
               ),
               (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2) != 0)
            );
      }
   }

   @Override
   public boolean isInternalEditorPageName(String var1) {
      if ((1940452525 ^ 1940452525) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.normalizePageKey(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         if (var2.isEmpty()) {
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9) != 0);
         } else {
            return ((!Xqedii_1s34vun.Xqedii_997tx7qg1fze("OLBJlAXf+FyGh6MaWDUC04l0h2qE0Oq1UmrL6giCN/NGP89M0g2YwQ==").equals(var2)
                  && !Xqedii_1s34vun.Xqedii_997tx7qg1fze("R6vvgp8Tk7AE08T9hHCML+ZOQNBXK1qQKcePEeftFyMcUdrmIx/De33gZvfE7IttQtED5A==").equals(var2)
                  && !Xqedii_1s34vun.Xqedii_997tx7qg1fze("OysgjDmdul+cPvn8Ck8MsSn0JUSc6Ni6Oi+QOx9VLCygPU2s+VFv5q2xZ/TeitB1ts0=").equals(var2)
               ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2)
               : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-26634292, 30)) != 0);
         }
      }
   }

   public boolean isInternalEditorFile(File var1) {
      if ((-693281489 ^ -693281489) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.isInternalEditorPageName(var1.getName());
      }
   }

   public boolean openEditorMenu(Player var1) {
      if (((1362399583 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 29) != 0);
      } else {
         this.normalizeEditorStartPitch(var1);
         boolean var2 = this.openGui(
            var1,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("OysgjDmdul+cPvn8Ck8MsSn0JUSc6Ni6Oi+QOx9VLCygPU2s+VFv5q2xZ/TeitB1ts0="),
            (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 0) != 0),
            (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3) != 0)
         );
         if (var2) {
            this.playEditorSfx(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("+GdGN2EXO5/9QgNSnIq3GIOjiC/dt3CMfnJzwXyjqxce71+mfs9Cb5WkU3daMYHIRBJ5+8WY"));
         }

         return var2;
      }
   }

   public boolean closeEditorAndOpenMenu(Player var1) {
      if ((1879820464 * 1879820464 + 1879820464 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2) != 0);
      } else {
         boolean var2 = this.openGui(
            var1,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("OysgjDmdul+cPvn8Ck8MsSn0JUSc6Ni6Oi+QOx9VLCygPU2s+VFv5q2xZ/TeitB1ts0="),
            (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2) != 0),
            (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 13) != 0)
         );
         if (!var2) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "PFC075g0N4Fa3KuBtld3FD5ysjt7IZfUmCicjc2/RvXDrbqGrpiRyTEBaHSDe26MFNSkvLnN/3vBXBkfUbdpOcylOZ58uEkzZJ+E0VSfR/a2ikidF8t98BX3"
               ),
               new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 1)]
            );
         }

         return var2;
      }
   }

   @Override
   public boolean createNewUiInEditor(Player var1, EditorSession var2) {
      if ((1878229854 * 1878229854 - 1878229854 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         String var3 = this.resolveNextUntitledPageKey(var1, var2);
         String var4 = this.formatUntitledPageDisplayName(var3);
         this.snapshotCurrentEditorPage(var1.getUniqueId(), var2);
         if (var2.elements != null && !var2.elements.isEmpty()) {
            for (HoverElement var7 : new ArrayList<>(var2.elements)) {
               this.removeRenderedElementHud(var1, var7);
            }

            var2.elements.clear();
         }

         this.clearSelectionState(var1, var2);
         this.finishLayersReorderDrag(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-214984091, 20) != 0));
         this.resetActivePagesDragState(var2);
         this.clearActivePagesDragPreview(var1);
         this.stopCursorToolDrag(var2);
         this.resetTransientPanelsForPageSwitch(var1, var2);
         var2.pageName = var3;
         var2.pageFile = null;
         var2.yaml = new YamlConfiguration();
         var2.yaml.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var4);
         var2.rawBlocks = new ArrayList<>();
         var2.renderBlocks = new ArrayList<>();
         var2.pendingPropertyField = null;
         var2.pendingSavePopupField = null;
         this.clearPendingTextToolEdit(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 13) != 0));
         var2.savePopupName = var4;
         var2.savePopupDescription = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         var2.savePopupCommand = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         var2.spawnOpacityRetoggledTargetIds.clear();
         var2.pendingSpawnOpacityRetoggleTargetIds.clear();
         var2.spawnOpacityRetoggleTaskQueued = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100614836, 17) != 0);
         this.rememberEditorWorkingPage(var1.getUniqueId(), var3, var2.rawBlocks);
         this.rememberOpenedEditorPage(var1.getUniqueId(), var3);
         List var10 = this.resolveOpenEditorPagesForPlayer(var1.getUniqueId(), var3);
         var2.openEditorPages.clear();
         var2.openEditorPages.addAll(var10);
         var2.activePagesScrollOffset = this.resolveInitialActivePagesScrollOffset(var10, var3);
         this.rerenderEditableContent(var1, var2);
         this.rerenderActivePagesShell(var1, var2);
         var2.rightSidebarTab = EditorSidebarTab.LAYERS;
         var2.rightSidebarHoverTab = null;
         this.rerenderEditorShellForPageSwitch(var1, var2);
         this.setRightSidebarTab(var1, var2, EditorSidebarTab.LAYERS, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 15) != 0));
         double var11 = var2.cursorX + var2.hitboxOffsetX;
         double var8 = var2.cursorY + var2.hitboxOffsetY;
         this.updateEditorNavbarHover(var1, var2, var11, var8);
         this.updateSidebarTabHover(var1, var2, var11, var8);
         this.updatePageInfoReadout(var1, var2);
         this.refreshSavePopupFields(var1, var2);
         String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "ChDyElBhfZ43VuKBaLJhINngLCWMhmA8b8C47LiV+VD0Ulgp7am1Vqo12CBNek+3unaZkXNp8W0crUSnhpbk0eHeIcLO2w=="
         );
         Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24)];
         var10003[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 13)] = var4;
         this.sendEditorSuccess(var1, var10002, var10003);
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715577, 5) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 5) != 0);
      }
   }

   public boolean openSavePopup(Player var1, EditorSession var2) {
      if ((-1131736590 * -1131736590 - -1131736590 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         var2.pendingPropertyField = null;
         var2.pendingSavePopupField = null;
         this.clearPendingTextToolEdit(var1, var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1890144242, 25) != 0));
         this.stopOpacitySliderDrag(var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18) != 0));
         this.resetSidebarFieldDrag(var1, var2);
         this.closeColorPicker(var1, var2);
         this.populateSavePopupDefaults(var2);
         this.refreshSavePopupFields(var1, var2);
         this.setWelcomePopupVisible(var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 3) != 0));
         this.setPreferencesPopupVisible(var1, var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14210412, 13) != 0));
         this.setSavePopupVisible(var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210650009, 16) != 0));
         double var3 = var2.cursorX + var2.hitboxOffsetX;
         double var5 = var2.cursorY + var2.hitboxOffsetY;
         this.updateSavePopupHover(var1, var2, var3, var5);
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719872721, 23) != 0);
      }
   }

   public boolean openPreferencesPopup(Player var1, EditorSession var2) {
      if (((1833580826 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         var2.pendingPropertyField = null;
         var2.pendingSavePopupField = null;
         this.clearPendingTextToolEdit(var1, var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210529, 2) != 0));
         this.stopOpacitySliderDrag(var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100483764, 17) != 0));
         this.resetSidebarFieldDrag(var1, var2);
         this.closeColorPicker(var1, var2);
         this.setWelcomePopupVisible(var1, var2, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-895139895, 27) != 0));
         this.setSavePopupVisible(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 19) != 0));
         this.setPreferencesPopupVisible(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556094, 6) != 0));
         this.refreshPreferencesPopupFields(var1, var2);
         double var3 = var2.cursorX + var2.hitboxOffsetX;
         double var5 = var2.cursorY + var2.hitboxOffsetY;
         this.updatePreferencesPopupHover(var1, var2, var3, var5);
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 19) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4) != 0);
      }
   }

   public List<Map<String, Object>> resolveBlocksToSave(EditorSession var1) {
      if (((-242482927 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyList();
      } else {
         List<Map<String, Object>> var2 = var1.rawBlocks == null ? new ArrayList<>() : this.copyBlocks(var1.rawBlocks);
         if (var2.isEmpty() && var1.elements != null && !var1.elements.isEmpty()) {
            List var3 = this.expandCompactImageBlocks(
               this.copyBlocks(
                  var1.yaml == null ? null : var1.yaml.getList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="))
               )
            );
            this.applyImageLayoutOffsetFormatToLoadedBlocks(var1.yaml, var3);
            if (!var3.isEmpty()) {
               this.plugin.getLogger().warning(Xqedii_8xupbxdxvlco(var1.pageName));
               var1.rawBlocks = var3;
               var2 = this.copyBlocks(var3);
            }
         }

         this.applyEditorLayerStateMetadata(var1, (List<Map<String, Object>>)var2);
         this.applyImageLayoutOffsetToBlocks(
            (List<Map<String, Object>>)var2,
            Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103393559262L, 28)),
            Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(3115196062743866025L, 46))
         );
         return this.compactImageBlocksForSave((List<Map<String, Object>>)var2);
      }
   }

   public void applyEditorLayerStateMetadata(EditorSession var1, List<Map<String, Object>> var2) {
      if (((-132217498 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty() && var1.components != null && !var1.components.isEmpty()) {
         for (Map var5 : this.resolveRenderableBlocks(var2, var1.components)) {
            if (var5 != null && !var5.isEmpty()) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1743998142, 25)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 7)] = this.stringValue(
                  this.readMapPathValue(
                     var5, Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                  )
               );
               String var6 = this.firstNonBlank(var10001);
               var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 26)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 25)] = this.stringValue(
                  this.readMapPathValue(
                     var5, Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4=")
                  )
               );
               String var7 = this.firstNonBlank(var10001);
               if (!var6.isBlank() && !var7.isBlank()) {
                  Map var8 = this.resolveRawMapAtPath(var2, var7);
                  if (var8 != null) {
                     var8.put(
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze("js28QysPZtmrJ3scC4X3QAjvN2nbLNbmUBL9o84FS1tSj6M8qLfsqiqH"),
                        Boolean.valueOf(
                           ((!var1.hiddenLayerTargetIds.contains(var6)
                              ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24)
                              : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 28)) != 0)
                        )
                     );
                     var8.put(
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze("VLxKLhGDdx+2aSmfJWprIN5dr8uhGr+gFmAnEFMXw3BIhwaxgy5iAQ=="),
                        var1.lockedLayerTargetIds.contains(var6)
                     );
                  }
               }
            }
         }
      }
   }

   public void restoreEditorLayerStateMetadata(EditorSession var1) {
      if ((-1137185884 * (-1137185884 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.hiddenLayerTargetIds.clear();
         var1.lockedLayerTargetIds.clear();
         if (var1.rawBlocks != null && !var1.rawBlocks.isEmpty() && var1.renderBlocks != null && !var1.renderBlocks.isEmpty()) {
            for (Map var3 : var1.renderBlocks) {
               if (var3 != null && !var3.isEmpty()) {
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30)];
                  var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748189591, 14)] = this.stringValue(
                     this.readMapPathValue(
                        var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
                     )
                  );
                  String var4 = this.firstNonBlank(var10001);
                  var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(655004927, 21)];
                  var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-852297321, 3)] = this.stringValue(
                     this.readMapPathValue(
                        var3,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4=")
                     )
                  );
                  String var5 = this.firstNonBlank(var10001);
                  if (!var4.isBlank() && !var5.isBlank()) {
                     Map var6 = this.resolveRawMapAtPath(var1.rawBlocks, var5);
                     if (var6 != null && !var6.isEmpty()) {
                        if (!this.parseEditorMetaBoolean(
                           var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("js28QysPZtmrJ3scC4X3QAjvN2nbLNbmUBL9o84FS1tSj6M8qLfsqiqH")),
                           (Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 26) != 0)
                        )) {
                           var1.hiddenLayerTargetIds.add(var4);
                        }

                        if (this.parseEditorMetaBoolean(
                           var6.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("VLxKLhGDdx+2aSmfJWprIN5dr8uhGr+gFmAnEFMXw3BIhwaxgy5iAQ==")),
                           (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719872721, 23) != 0)
                        )) {
                           var1.lockedLayerTargetIds.add(var4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean parseEditorMetaBoolean(Object var1, boolean var2) {
      if ((1514363036 * (1514363036 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else if (var1 instanceof Boolean var6) {
         return var6;
      } else {
         String var3 = var1.toString().trim().toLowerCase(Locale.ROOT);
         if (var3.isBlank()) {
            return var2;
         } else {
            int var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(-210715546, 7);
            switch (var3.hashCode()) {
               case 48:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("JlTtn87qyg8OPbSUk3+F4G7YV6hmok1cg76Pe5Y4"))) {
                     var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(277824409, 26);
                  }
                  break;
               case 49:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("T+U5He+YHMxSoa9Zt/iltuvJJIsGKR9T1qCNdqrr"))) {
                     var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327636, 2);
                  }
                  break;
               case 3521:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("yQWTzgxLTirbkdK2tR1daOX2TcHuzDcbP0ZJ8HpbI6Y="))) {
                     var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1677929681, 23);
                  }
                  break;
               case 3551:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("FJJMg15CcSr7oDnGstUq2mfGiC2FNWDxBFw3NVy1Y0I="))) {
                     var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14194028, 13);
                  }
                  break;
               case 109935:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("B6BNWScKu7fZuAvi+Isd314rnUgdT6j2aLnzcp3wH1Be/w=="))) {
                     var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327564, 4);
                  }
                  break;
               case 119527:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("5eqNb6uxMaeHwFbEzQYVWg7w6L+yuOk7Xn41ZoBMgMC4VA=="))) {
                     var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3);
                  }
                  break;
               case 3569038:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("SVennbCQ1LKnXNSzw5cwiwyo7pdRLSYBo1QMu400BQsdc/Hy"))) {
                     var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11);
                  }
                  break;
               case 97196323:
                  if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("OCtjVx82KvrykYXM+mM4kmtM4MOO8RFsjAbn99dMoafmlbLSfBo="))) {
                     var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874062028, 13);
                  }
            }
            return switch (var5) {
               case 0, 1, 2, 3 -> true;
               case 4, 5, 6, 7 -> false;
               default -> var2;
            };
         }
      }
   }

   public File ensureSessionPageFile(EditorSession var1) {
      if ((1699597774 ^ 1699597774) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (var1.pageFile != null) {
         return var1.pageFile;
      } else {
         String var2 = this.normalizePageKey(var1.pageName, var1.pageName);
         if (var2.isBlank()) {
            return null;
         } else {
            File var3 = new File(
               this.plugin.getDataFolder(), Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU=")
            );
            if (!var3.exists()) {
               var3.mkdirs();
            }

            File var4 = new File(var3, Xqedii_1o2x960h641bt(var2));
            var1.pageName = var2;
            var1.pageFile = var4;
            if (var1.yaml == null) {
               var1.yaml = new YamlConfiguration();
            }

            return var4;
         }
      }
   }

   public boolean saveEditorInPlace(Player var1) {
      if (((1087303049 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         if (var2 == null || !var2.editMode) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "UuDgRPCi3eXG50ToUYQckDQy/mosj/doMD5LY8RiXi8qrSTy1UpsEJ/p4J2HQpB1DUXB1wbLPpB4i11fPTlGBhfetuxr5IyFbwfDH4roSmw="
               ),
               new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 19) != 0);
         } else if (!this.hasCurrentPageName(var2)) {
            return this.openSavePopup(var1, var2);
         } else {
            try {
               File var3 = this.ensureSessionPageFile(var2);
               if (var3 == null) {
                  return this.openSavePopup(var1, var2);
               } else if (this.isInternalEditorFile(var3)) {
                  this.sendEditorError(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "bQ+/KzNHxJRj+naIgV3QcOFQSin61C7benzuvEFgWLe4jrlW++sqSx1ZWmCtBSiHNP4NMTiLicI21nl5YNhYvhoj3EN0iL95h6MiFAGqDpc/C/qdJOYQJrZi/CD23deXhS5TndwUdtBvSDSl+haQoAjEpKnDOmgCXlQ8UG3JRmNTET1YoW+QeztnzeeQQjJt3coygA=="
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1666558980, 23)]
                  );
                  return this.openSavePopup(var1, var2);
               } else {
                  List var4 = this.resolveBlocksToSave(var2);
                  var2.yaml.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="), var4);
                  String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 25)];
                  var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 0)] = var2.yaml
                     .getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"));
                  var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210191257, 19)] = var2.pageName;
                  String var5 = this.firstNonBlank(var10001);
                  if (!var5.isBlank()) {
                     var2.yaml.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var5);
                  }

                  this.markImageLayoutSaveFormats(var2.yaml);
                  String var6 = var2.yaml.saveToString();
                  Files.writeString(
                     var3.toPath(),
                     var6.replace(Xqedii_1s34vun.Xqedii_997tx7qg1fze("xcXX6tLbfqEiazNQFk/2I5Ea93YA6ptgr6E5jkLc"), System.lineSeparator()),
                     StandardCharsets.UTF_8
                  );
                  this.invalidateYamlFileCache(var3);
                  this.playEditorSfx(var1, var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("HZH9VI15elkCaNWUsJOalhrvv8c3zDn/hShtHT+oa3e5FEd+"));
                  String var8 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "NhA/gnQYE52hXszIkb/aAH7Tm0SGj3ICaL4Z1sh+adgeKCBR3MlLoRX1INWyVnvRdqHVQA7wH3fbvHhx3gnK1YLONh4S4Bs8"
                  );
                  Object[] var9 = new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-514678812, 26)];
                  var9[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1)] = var2.pageName;
                  this.sendEditorSuccess(var1, var8, var9);
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(871999071, 24) != 0);
               }
            } catch (Exception var7) {
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "ctxJ7tWCFg9lT/saC7nAquZKwLfVrC5rx2Hnvkamh7ld0xTfL1FiC3rD3G5BY73XAGvhWY3XSCIm7aOHkrHUzMEc388n31+0uI5mGZ/eK9M="
               );
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30)];
               var10003[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 21)] = String.valueOf(var7.getMessage());
               this.sendEditorError(var1, var10002, var10003);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 23) != 0);
            }
         }
      }
   }

   public boolean saveEditor(Player var1) {
      if (((-451837515 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         if (var2 != null && var2.editMode) {
            try {
               List var3 = this.resolveBlocksToSave(var2);
               var2.yaml.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="), var3);
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090328156, 9)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546230, 3)] = var2.yaml
                  .getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"));
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210723737, 13)] = var2.pageName;
               String var4 = this.firstNonBlank(var10001);
               if (!var4.isBlank()) {
                  var2.yaml.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var4);
               }

               this.markImageLayoutSaveFormats(var2.yaml);
               String var5 = var2.yaml.saveToString();
               Files.writeString(
                  var2.pageFile.toPath(),
                  var5.replace(Xqedii_1s34vun.Xqedii_997tx7qg1fze("xcXX6tLbfqEiazNQFk/2I5Ea93YA6ptgr6E5jkLc"), System.lineSeparator()),
                  StandardCharsets.UTF_8
               );
               this.invalidateYamlFileCache(var2.pageFile);
               String var7 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "NhA/gnQYE52hXszIkb/aAH7Tm0SGj3ICaL4Z1sh+adgeKCBR3MlLoRX1INWyVnvRdqHVQA7wH3fbvHhx3gnK1YLONh4S4Bs8"
               );
               Object[] var8 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24)];
               var8[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 12)] = var2.pageName;
               this.sendEditorSuccess(var1, var7, var8);
               this.cameraService.setCameraActive(var1, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 19) != 0));
               this.hudService.clearHuds(var1);
               this.closeGui(var1);
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710440346, 12) != 0);
            } catch (Exception var6) {
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "ctxJ7tWCFg9lT/saC7nAquZKwLfVrC5rx2Hnvkamh7ld0xTfL1FiC3rD3G5BY73XAGvhWY3XSCIm7aOHkrHUzMEc388n31+0uI5mGZ/eK9M="
               );
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778047, 5)];
               var10003[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22)] = String.valueOf(var6.getMessage());
               this.sendEditorError(var1, var10002, var10003);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 12) != 0);
            }
         } else {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "UuDgRPCi3eXG50ToUYQckDQy/mosj/doMD5LY8RiXi8qrSTy1UpsEJ/p4J2HQpB1DUXB1wbLPpB4i11fPTlGBhfetuxr5IyFbwfDH4roSmw="
               ),
               new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(855221855, 24)]
            );
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 8) != 0);
         }
      }
   }

   public void runEditorAutosave() {
      if (((-1054678746 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var1 = new File(this.plugin.getDataFolder(), Xqedii_1s34vun.Xqedii_997tx7qg1fze("TIkGTvCN0Y7OWdnnSUOvDEGd0SfnB1X/qnQjilip0Ta3KvRZUu7IX5GWCGM="));
         if (!var1.exists() && !var1.mkdirs()) {
            this.plugin.getLogger().warning(Xqedii_33uaic7utwvks(var1.getAbsolutePath()));
         } else {
            String var2 = Xqedii_l2une6g.Xqedii_1xkpxlr.format(LocalDateTime.now());

            for (Entry var4 : this.editorSessions.entrySet()) {
               if (var4 != null) {
                  UUID var5 = (UUID)var4.getKey();
                  EditorSession var6 = (EditorSession)var4.getValue();
                  if (var5 != null && var6 != null && var6.editMode && var6.previewMode) {
                     Player var7 = Bukkit.getPlayer(var5);
                     if (var7 != null && var7.isOnline()) {
                        this.writeEditorAutosaveSnapshot(var1, var6, var2);
                     }
                  }
               }
            }
         }
      }
   }

   public void writeEditorAutosaveSnapshot(File var1, EditorSession var2, String var3) {
      if ((-735178581 ^ -735178581) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         String var4 = this.normalizePageKey(var2.pageName, Xqedii_1s34vun.Xqedii_997tx7qg1fze("CJ5yGg6rVpE3ChC7TwSzsU/zwIuPbCGVBBm074PozTSIRFlhDsSpYgFH/hM="));
         if (var4.isBlank() || this.isInternalEditorPageName(var4)) {
            var4 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("CJ5yGg6rVpE3ChC7TwSzsU/zwIuPbCGVBBm074PozTSIRFlhDsSpYgFH/hM=");
         }

         try {
            YamlConfiguration var5 = this.cloneSessionYamlForAutosave(var2);
            List var6 = this.resolveBlocksToSave(var2);
            var5.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="), var6);
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546222, 3)];
            var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 11)] = var5.getString(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL")
            );
            var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715577, 5)] = var2.pageName;
            var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327636, 3)] = var4;
            String var7 = this.firstNonBlank(var10001).trim();
            if (!var7.isBlank()) {
               var5.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var7);
            }

            this.markImageLayoutSaveFormats(var5);
            File var8 = new File(var1, Xqedii_1j47quvfn80e7(var4, var3));

            for (int var9 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 21); var8.exists(); var9++) {
               var8 = new File(var1, Xqedii_2tx4urmv8kylw(var4, var3, var9));
            }

            String var10 = var5.saveToString();
            Files.writeString(
               var8.toPath(),
               var10.replace(Xqedii_1s34vun.Xqedii_997tx7qg1fze("xcXX6tLbfqEiazNQFk/2I5Ea93YA6ptgr6E5jkLc"), System.lineSeparator()),
               StandardCharsets.UTF_8
            );
            this.invalidateYamlFileCache(var8);
         } catch (Exception var11) {
            this.plugin.getLogger().warning(Xqedii_3k2jr4oycr2u6(var4, var11.getMessage()));
         }
      }
   }

   public YamlConfiguration cloneSessionYamlForAutosave(EditorSession var1) {
      if (((505614862 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         YamlConfiguration var2 = new YamlConfiguration();
         if (var1 != null && var1.yaml != null) {
            try {
               var2.loadFromString(var1.yaml.saveToString());
            } catch (Exception var4) {
            }

            return var2;
         } else {
            return var2;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void startSavePopupInputPrompt(Player var1, EditorSession var2, EditorSavePopupField var3) {
      if ((-1041651972 * -1041651972 + -1041651972 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !this.isEditorTextPromptCoolingDown(var2)) {
         if (var2.pendingSavePopupField != var3) {
            var2.pendingPropertyField = null;
            this.clearPendingItemDesignInventoryPick(var2);
            var2.pendingActionTargetId = null;
            var2.pendingActionIndex = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(113683288, 16);
            var2.pendingSavePopupField = var3;
            this.refreshSavePopupFields(var1, var2);

            String var4 = switch (dev.xqedii.ultimateUI.Xqedii_3pnuqh8.Xqedii_3epmsu8[var3.ordinal()]) {
               case 1 -> Xqedii_1s34vun.Xqedii_997tx7qg1fze("ek3B0emmroLnuQgfV6wZHwItPToqAbkU0qId2KqzX/pZvou9");
               case 2 -> Xqedii_1s34vun.Xqedii_997tx7qg1fze("rs+NqunauSspEmIY/UfXf95ByJZK2LzKq4TFAV2btOJAdhulYtl7GbohojmTfKFp9g0=");
               case 3 -> Xqedii_1s34vun.Xqedii_997tx7qg1fze("8b6DDDj0mEMIDxKAD/8grD5xqtyhIgPLah4qej4vjXVY5n4vufcFDr3C");
               default -> throw new MatchException(null, null);
            };

            String var5 = switch (dev.xqedii.ultimateUI.Xqedii_3pnuqh8.Xqedii_3epmsu8[var3.ordinal()]) {
               case 1 -> var2.savePopupName;
               case 2 -> var2.savePopupDescription;
               case 3 -> var2.savePopupCommand;
               default -> throw new MatchException(null, null);
            };
            if (!this.openEditorTextPrompt(var1, var2, var4, var5)) {
               String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "WyaYb8TpVBEcfjJ8fZh8U4x3/qDsM53pOydkkPYo58piwhp/VZoz9g4nLQRhHwGewDxItGW10fnjd7Zx3CbySHjFq7czqLn4z/aClGq8DbOBhCNZsEQ6fR9ol/SPhAb+e5h6XgVuTkJ+flzA8zAnHJMCUNh8dQ=="
               );
               Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327676, 5)];
               var10003[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-429968181, 21)] = var4;
               var10003[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 19)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
               );
               this.sendEditorInfo(var1, var10002, var10003);
            }
         }
      }
   }

   @Override
   public boolean handleSavePopupConfirm(Player var1, EditorSession var2) {
      if ((-326247175 * -326247175 + -326247175 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.saveEditorFromPopup(var1, var2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void refreshSavePopupFields(Player var1, EditorSession var2) {
      if ((1848801388 * 1848801388 + 1848801388 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = this.formatSavePopupValue(
            var2.savePopupName, Xqedii_1s34vun.Xqedii_997tx7qg1fze("CzgulYAATek2sYyFnz06fEgL7bFxE7A+F23Q2o6Sj3uGfJCn10QUMR3gXx3O7Fajf9q1+w==")
         );
         String var4 = this.formatSavePopupValue(
            var2.savePopupDescription,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("P+yZ3EEyCO6KUM0QfrsH0ht2YOXiETdXKAssxtRfll3IYLaEdO7Z6iY+V28ljovV46rQbW4fnHbUqW34W2+wSa2u")
         );
         String var5 = this.formatSavePopupValue(
            var2.savePopupCommand,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "/BCeNc/OIoJvrhQlaYweLmKOFvvl687BDNCklccTdHWsH2UwbElKHJ5eo7YIv6zN5JKy3xPDOpCra3dbwbK3FWU5+TINnUdbYSOFfOHE0TSjCrpZ3id0+6AF/BV618zZ/ns="
            )
         );
         if (var2.pendingSavePopupField != null) {
            String var6 = this.resolveEditorPromptDraft(
               var2, this.toSidebarDisplayValue(Xqedii_1s34vun.Xqedii_997tx7qg1fze("MN1Kp/uHPJ+gZZVsO/ZEPcuJ18sl2qQfOLAjlpUJCx3yVQ=="))
            );
            switch (dev.xqedii.ultimateUI.Xqedii_3pnuqh8.Xqedii_3epmsu8[var2.pendingSavePopupField.ordinal()]) {
               case 1:
                  var3 = this.highlightSidebarEditingText(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZK66XLkNFNrRLmTbOSFF5BWabt0/9tnJ9Actza1i3wkyQtFZIDLrlTxsmlrwylHMagn4DsKQVHwjNqRHQ5RFeaFNU8TV7g=="),
                     var6
                  );
                  break;
               case 2:
                  var4 = this.highlightSidebarEditingText(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("vEymIbNYC38EfP5Poluq6IedhCP8wGGDB8KB/fKqKMwFpum8ehEVa1l52TxmvF3i0iq78jJGm78vZL3H9dfyEiKqivez/w=="),
                     var6
                  );
                  break;
               case 3:
                  var5 = this.highlightSidebarEditingText(
                     var2,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "Y50xXyUSXfk4NH960xNgjQaTCE8+ek4+m9yvW3Y2gRiXb0E8C6RviG5n3Su8LheLPYrwSRVJTF1WfI5DeKg1NuZvGmIhnxUQ0AqCZw=="
                     ),
                     var6
                  );
            }
         }

         this.setShellText(
            var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZK66XLkNFNrRLmTbOSFF5BWabt0/9tnJ9Actza1i3wkyQtFZIDLrlTxsmlrwylHMagn4DsKQVHwjNqRHQ5RFeaFNU8TV7g=="), var3
         );
         this.setShellText(
            var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("vEymIbNYC38EfP5Poluq6IedhCP8wGGDB8KB/fKqKMwFpum8ehEVa1l52TxmvF3i0iq78jJGm78vZL3H9dfyEiKqivez/w=="), var4
         );
         this.setShellText(
            var1,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("Y50xXyUSXfk4NH960xNgjQaTCE8+ek4+m9yvW3Y2gRiXb0E8C6RviG5n3Su8LheLPYrwSRVJTF1WfI5DeKg1NuZvGmIhnxUQ0AqCZw=="),
            var5
         );
         double var10 = var2.cursorX + var2.hitboxOffsetX;
         double var8 = var2.cursorY + var2.hitboxOffsetY;
         this.updateSavePopupActionIcons(var1, var2, var10, var8);
      }
   }

   @Override
   public boolean handlePreferencesPopupConfirm(Player var1, EditorSession var2) {
      if ((1934642442 * (1934642442 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210529, 2) != 0);
      }
   }

   @Override
   public boolean handleWelcomePopupConfirm(Player var1, EditorSession var2) {
      if ((295836207 * 295836207 - 295836207 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         var2.welcomePopupAcknowledged = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 1) != 0);
         this.savePlayerColorPrefs(var1, var2);
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210453401, 18) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(798588115, 15) != 0);
      }
   }

   @Override
   public boolean handlePreferencesPopupToggle(Player var1, EditorSession var2, String var3) {
      if (((27340752 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         int var4 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 13);
         int var6 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(-210715546, 15);
         switch (var3.hashCode()) {
            case -868071875:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "1TMh1a/yBA+ConGlvzm2JW7lxbuP03mqLyHN0tcvIVfVVLAAqzofGx5Qe+DfjhpIHaahLtSwKJH16p/A7miyIFnTNO8NjtQeAO7Pxr/c0AVRPBacP1w52lRKcNI="
                  )
               )) {
                  var6 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874078412, 13);
               }
               break;
            case -614990550:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "A9MY5xJORFS6RUdSD0obLYUntyndev9pBKxLsDfMz2rf6Wg7ZLdswJG7NL4RqxFvYkSatDYwpQ1IbTBTCzcJzvuMhE3SAp3FouuKjW3wHQEFB+fMgek="
                  )
               )) {
                  var6 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 22);
               }
               break;
            case -51868543:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "wjCVAodqV7V4MWt1dRyZLuRIw4wHmIhPM2M2oQS2mjLKwK0mseIKIknuG6CACTRhqh5j/0/KzJxof8hgfDHWutSAHhnSV4dXFegKwo8WgfKZGQ=="
                  )
               )) {
                  var6 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(945072121, 24);
               }
               break;
            case 720376917:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "tFLr7UM4R72OOMoqao1ji9eFUvPQz2pBBAlCj30K0vj1phjYB4WE05QzRlISB1reC0/myXhOom3+l2Uy93T+Kg+YZOLEb4v5Q3wo2783BlCgG+C3"
                  )
               )) {
                  var6 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1694706897, 23);
               }
         }

         switch (var6) {
            case 0:
               var2.displayHotbar = ((!var2.displayHotbar
                  ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8)
                  : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 0)) != 0);
               break;
            case 1:
               var2.displayHand = ((!var2.displayHand
                  ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(244269977, 25)
                  : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 13)) != 0);
               break;
            case 2:
               var2.optimizedEditor = ((!var2.optimizedEditor
                  ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3)
                  : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 12)) != 0);
               var4 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(244269977, 25);
               break;
            case 3:
               var2.editorSounds = ((!var2.editorSounds
                  ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8)
                  : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 28)) != 0);
               break;
            default:
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11) != 0);
         }

         this.applyEditorDisplayPreferences(var1, var2);
         if (var4 != 0) {
            this.rerenderEditableContent(var1, var2);
         }

         this.savePlayerColorPrefs(var1, var2);
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 25) != 0);
      }
   }

   @Override
   public void refreshPreferencesPopupFields(Player var1, EditorSession var2) {
      if ((-947633657 * (-947633657 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.refreshPreferencesPopupToggleRow(
            var1,
            var2,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "4TmST9KS5QSNhn/jgyNFXPV5aXxjszVBZD2f+aetCgvUtiHv7KGukKB1ZMbfpXaCDt3/SaHGSFQjt0izwk98CV6L7ubZ8Em6By+HP/i4E6ajkEqYU1osDg=="
            ),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "p5lY2xEYnuh8c+vHxG5eLuJ8lYpMQhMyXrWuHnPnda/1y0cl+z5tTNb4JjP8Zoko2a/gYIXLQU9lJ3TPq9YpQBFq9fwJBDYYsBwL5gNDHU7NF0vdAK3fNjqm"
            ),
            var2.displayHotbar
         );
         this.refreshPreferencesPopupToggleRow(
            var1,
            var2,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "Ku0AABiE2wBt6co+266eqTRCpRMzO0LAg9KHt1lLoZYSKGGp0iqj/R0uYU5sTdOZFa5Q2K30nZ7GIBwXce3peqsmSGUVQWpSeTT0c0T+PwVqXl0t"
            ),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "Jtt9bkhKBmpr3DzRJOKrSdYRfCV1M3IQ/lVJ21jWCVapO6ljDc1Z7ARY2/e5OTzQtc+yjAx4fHbDp2VD7gRorDSipSZmtHXKDqdvYZtxZVQRgH6u5eg="
            ),
            var2.displayHand
         );
         this.refreshPreferencesPopupToggleRow(
            var1,
            var2,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "Yj3/yJr6EU+E5kZm4+jMHrHLJhuOXhto3/szJtObNLsts/QMTS3QYeagISrB/p85VOa9/bzwnUkaorppee/7SqRKdtkiwmrRvLYCnuUrsgOcE7ETVoN8rjUzKtr6IQ=="
            ),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "Z5ttWdDcEQc4AY9GD3B087s/lh3fUX3DFfgt/bydfJ2u06OQAobn9GbN+iW8UDNKP0jZwtFBBjUbvH+cIKUzktxtoFljWRpfvI/h4TD68P3hQHEZR+YLuSXjRoIxTrWI"
            ),
            var2.optimizedEditor
         );
         this.refreshPreferencesPopupToggleRow(
            var1,
            var2,
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "nA127roRhYliW3Ig5pM2MU4sw1PvRLEoXpTZdRLPVHdSDt0CkJbeHdIAHHIcwltdZjHsaCvNKTpDMLyaLoN4OKXk52uGqrhHYe7w0R2mVfFrGUTo7xs="
            ),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "R1GpOOXJkrP5LffvmIQme1/asraNftSrtA1fZMfR3gtMYsPT1QliquAi2Lj2MVB1hDDplTKfAZpJVTgs3pkSBP/uJovQISoW0qEEN+asr5nxL2brYxXiEA=="
            ),
            var2.editorSounds
         );
         double var3 = var2.cursorX + var2.hitboxOffsetX;
         double var5 = var2.cursorY + var2.hitboxOffsetY;
         this.updatePreferencesPopupActionIcons(var1, var2, var3, var5);
      }
   }

   public void refreshPreferencesPopupToggleRow(Player var1, EditorSession var2, String var3, String var4, boolean var5) {
      if ((-203708759 * -203708759 - -203708759 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && var4 != null && !var4.isBlank()) {
         String var6 = var5
            ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("IP5XHk3AnVQ5UDbl9A2m26/K1JpA31TVtCBsCmifqFr+db2jz//9mgl6")
            : Xqedii_1s34vun.Xqedii_997tx7qg1fze("dkLr1u336wHP35c9h65hpk4kygf2mFqY1FKB72N7QWeo9V/nNcCcIg5up1U=");
         String var7 = var5
            ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("YAAdAg3u78MVi8kgWlB5pgPmHKLHa2FRCRG6lympKPP2gCkVykwFwA==")
            : Xqedii_1s34vun.Xqedii_997tx7qg1fze("edmKgeFtBhZ5maX/US9aeFCxcBXcbJrF0BSi5xQ6rwepbp59BfoLIw==");
         String var8 = var5
            ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("X3wB0MSrgw2M73sqyBK0XmLFnwaztnAVgZzYrtkXYrTxS68uP9dUxw==")
            : Xqedii_1s34vun.Xqedii_997tx7qg1fze("Mkxs1hjZyGRMqkzbrer1v/9hrV28S4r1gS0VKI+ZOx7p6kmcFo8VYA==");
         this.setShellText(var1, var3, this.withHexPrefix(var6, var8));
         this.setShellColor(var1, var2, var4, var7);
      }
   }

   public boolean saveEditorFromPopup(Player var1, EditorSession var2) {
      if ((1973335521 * (1973335521 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 0)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31)] = var2.savePopupName;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isEmpty()) {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "0wz/9vS5O7sPQf+AuS+mCuxvBiDLC7FBbwlonRGaXiDXUssRMO+Kob0n2aTW2xpk84o/uQamggty8aYeFT64Gp3mBxsA7e6wCuW18IBaDW2jGmcX2K8kI9TQe4o="
               ),
               new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094215065, 31)]
            );
            this.refreshSavePopupFields(var1, var2);
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454733153, 18) != 0);
         } else {
            String var4 = this.normalizePageKey(var3, var2.pageName);
            if (var4.isBlank()) {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "Yn9Q3y1A7p15fmqrOXNmPaSjYGeAWjSdIoB9WuQR+5we+fBHXKlGtbq8a1URCYY+bfsNrpqAH+KE/wMGSW4fxApqjh4DGy0pVPMqzspg7qzO1FOoFrPVmocaYndGc7b3/j6l69hxEI38yhct"
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093737625, 18)]
               );
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 30) != 0);
            } else if (this.isInternalEditorPageName(var4)) {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "6o/yxYIpDM7o6w9P4wCtKjmeFKH9e0/96nuFteaGZsorpxmtfEKlRGdjrNvg1odEnIihweIe5jViTxGhA6OsN2rUbJ061rm0EkujURhlBPLXx3OwhlNFQqHvFROvZylFeH/SkfmD2lSUhOr4ymB2avrtisnUZym2"
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22)]
               );
               this.refreshSavePopupFields(var1, var2);
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 19) != 0);
            } else {
               var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715529, 4)];
               var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17)] = var2.savePopupDescription;
               String var5 = this.firstNonBlank(var10001).trim();
               String var6 = this.normalizeCustomCommandToken(var2.savePopupCommand);
               if (!var6.isBlank()) {
                  ArrayList var7 = new ArrayList();
                  Map var8 = this.loadYamlFolder(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU="), var7
                  );

                  for (Entry var10 : (Iterable<Entry>) (var8.entrySet())) {

                     String var11 = this.normalizePageKey(
                        (String)var10.getKey(), Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
                     );
                     if (!var11.equalsIgnoreCase(var4)) {
                        String var12 = this.normalizeCustomCommandToken(
                           var10.getValue() == null
                              ? null
                              : ((YamlConfiguration)var10.getValue())
                                 .getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("EBDl/W9OujeTRXB1WSvdkN4bXugGJYO43mjMY3ckDrMKMhbD4OuvBSNF"))
                        );
                        if (var6.equals(var12)) {
                           String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "gUhhgyAjFy26CGvarTETmGIH3qMjDmCIFq5BlUcmEqiY5W48eRnZmzsFh0E0DwROVYMhFul3HL+XJzY5sfRMOunDUMYYhRwYeVD94nGpVcAM4Ex/T+7lW2fqFfiYGRFgfGc="
                           );
                           Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287547379, 9)];
                           var10003[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17)] = Xqedii_c0ow2lpxehoq(var6);
                           var10003[Xqedii_1s34vun.Xqedii_r62pla0yle6a(143606681, 26)] = var10.getKey();
                           this.sendEditorError(var1, var10002, var10003);
                           this.refreshSavePopupFields(var1, var2);
                           return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1666558980, 23) != 0);
                        }
                     }
                  }
               }

               try {
                  List var14 = this.resolveBlocksToSave(var2);
                  YamlConfiguration var15 = this.cloneYamlConfiguration(var2.yaml);
                  var15.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var3);
                  var15.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("KHBhnM8w50Lnnf4GdAh0uHC4O0VHn8o21CGInJVGnszrRNX7"), var5.isBlank() ? null : var5);
                  var15.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("EBDl/W9OujeTRXB1WSvdkN4bXugGJYO43mjMY3ckDrMKMhbD4OuvBSNF"), var6.isBlank() ? null : var6);
                  var15.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="), var14);
                  this.markImageLayoutSaveFormats(var15);
                  File var16 = new File(
                     this.plugin.getDataFolder(),
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU=")
                  );
                  if (!var16.exists()) {
                     var16.mkdirs();
                  }

                  File var17 = new File(var16, Xqedii_2nj868rlpw3sp(var4));
                  String var18 = var15.saveToString();
                  Files.writeString(
                     var17.toPath(),
                     var18.replace(Xqedii_1s34vun.Xqedii_997tx7qg1fze("xcXX6tLbfqEiazNQFk/2I5Ea93YA6ptgr6E5jkLc"), System.lineSeparator()),
                     StandardCharsets.UTF_8
                  );
                  this.invalidateYamlFileCache(var17);
                  var2.pageName = var4;
                  var2.pageFile = var17;
                  var2.yaml = var15;
                  var2.pendingSavePopupField = null;
                  this.playEditorSfx(var1, var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("HZH9VI15elkCaNWUsJOalhrvv8c3zDn/hShtHT+oa3e5FEd+"));
                  String var22 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "NhA/gnQYE52hXszIkb/aAH7Tm0SGj3ICaL4Z1sh+adgeKCBR3MlLoRX1INWyVnvRdqHVQA7wH3fbvHhx3gnK1YLONh4S4Bs8"
                  );
                  Object[] var24 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594625, 4)];
                  var24[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-909466305, 19)] = var4;
                  this.sendEditorSuccess(var1, var22, var24);
                  boolean var19 = this.closeEditorAndOpenMenu(var1);
                  if (!var19) {
                     this.sendEditorError(
                        var1,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "PFC075g0N4Fa3KuBtld3FD5ysjt7IZfUmCicjc2/RvXDrbqGrpiRyTEBaHSDe26MFNSkvLnN/3vBXBkfUbdpOcylOZ58uEkzZJ+E0VSfR/a2ikidF8t98BX3"
                        ),
                        new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 30)]
                     );
                  }

                  return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(202326937, 23) != 0);
               } catch (Exception var13) {
                  String var21 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "ctxJ7tWCFg9lT/saC7nAquZKwLfVrC5rx2Hnvkamh7ld0xTfL1FiC3rD3G5BY73XAGvhWY3XSCIm7aOHkrHUzMEc388n31+0uI5mGZ/eK9M="
                  );
                  Object[] var23 = new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18)];
                  var23[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 3)] = String.valueOf(var13.getMessage());
                  this.sendEditorError(var1, var21, var23);
                  return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(714407719, 29) != 0);
               }
            }
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 7) != 0);
      }
   }

   @Override
   public void populateSavePopupDefaults(EditorSession var1) {
      if (((-120915262 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         boolean var2 = this.isInternalEditorPageName(var1.pageName);
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778079, 5)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 0)] = var1.yaml == null
            ? null
            : var1.yaml.getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"));
         var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704531989, 6)] = var1.pageName;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var2 || this.isInternalEditorPageName(var3)) {
            var3 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         }

         String var4 = this.formatUntitledPageDisplayName(var3);
         if (!var4.isBlank()) {
            var3 = var4;
         }

         var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1816835457, 20)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11)] = var1.yaml == null
            ? null
            : var1.yaml.getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("KHBhnM8w50Lnnf4GdAh0uHC4O0VHn8o21CGInJVGnszrRNX7"));
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 29)] = var1.yaml == null
            ? null
            : var1.yaml.getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("m5TvR4IBmLyVxkfhHL+unRGv4+Spgfbz36Y2VFuCH0O0+Zq8aDsPFHNlbPB+92Y1Oxw="));
         String var5 = this.firstNonBlank(var10001).trim();
         String var6 = this.normalizeCustomCommandToken(
            var1.yaml == null ? null : var1.yaml.getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("EBDl/W9OujeTRXB1WSvdkN4bXugGJYO43mjMY3ckDrMKMhbD4OuvBSNF"))
         );
         var1.savePopupName = var3;
         var1.savePopupDescription = var5;
         var1.savePopupCommand = var6.isBlank() ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : Xqedii_1ii05c8nuskr4(var6);
      }
   }

   public String formatSavePopupValue(String var1, String var2) {
      if (((-1534881664 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210719641, 12)];
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26)] = var1;
         String var3 = this.firstNonBlank(var10001).trim();
         return var3.isEmpty() ? var2 : Xqedii_1zbgriu0kammc(this.truncateSavePopupText(var3));
      }
   }

   public String truncateSavePopupText(String var1) {
      if ((1171651009 ^ 1171651009) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      } else {
         return var1.length() <= Xqedii_1s34vun.Xqedii_z5j381o3pwva(2101077657, 18)
            ? var1
            : Xqedii_2m0kgr0v7qw7l(var1.substring(Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778015, 5), Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1747730839, 14)));
      }
   }

   public String resolveExistingPageMapKey(Map<String, YamlConfiguration> var1, String var2) {
      if ((1962702338 * (1962702338 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String var3 = this.normalizePageKey(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         if (var3.isBlank()) {
            return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         } else if (var1.containsKey(var2)) {
            return var2;
         } else {
            for (String var5 : var1.keySet()) {
               if (var3.equalsIgnoreCase(this.normalizePageKey(var5, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")))) {
                  return var5;
               }
            }

            return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         }
      } else {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      }
   }

   @Override
   public String normalizePageKey(String var1, String var2) {
      if ((232454456 * 232454456 - 232454456 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327628, 4)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29)] = var1;
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.toLowerCase(Locale.ROOT).endsWith(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ej7mDQDZHpTt6GfGU3NEkvj+uOa4nTrUyRw+9v6fLEpmnGQm"))) {
            var3 = var3.substring(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 30), var3.length() - Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327640, 2));
         }

         var3 = var3.replace((char)Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704534869, 6), (char)Xqedii_1s34vun.Xqedii_r62pla0yle6a(210763161, 9))
            .replace((char)Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537119, 0), (char)Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1078006876, 17));
         var3 = var3.replaceAll(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("6tTQYoYxmH4R56qgr+xyHEn2+KnOD7/ZHKgBWEyzfVeBnw=="),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("TGeH7BIipyI6XsMVbpjwetuNkPERVZ4s0ujn134S")
         );
         var3 = var3.replaceAll(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("jG973Cr+ZT6wI4N9UVOSqYSO6N989yePc+abhzAPYlBpgmCM+CXzQ/RggljbdgFFme8PnwZn4dw="),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
         );
         var3 = var3.replaceAll(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("v//BNfcnL6IKTMyPVGhk69DzB3Je1GKTBFcMNDucBdk="),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("TGeH7BIipyI6XsMVbpjwetuNkPERVZ4s0ujn134S")
         );
         var3 = var3.replaceAll(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("B+5UHJXWVujozm6a0E9MHy90wv2Z23w+tPFsaiY1MWLIMQ=="),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
         );
         var3 = var3.replaceAll(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("n46Ch5qRfcpSuhuejEH+QANyeSaHuryIwZQ5OI+XW0j5cA=="),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
         );
         return var3.isBlank() ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var3.toLowerCase(Locale.ROOT);
      }
   }

   public String resolvePageOpenPermission(YamlConfiguration var1) {
      if (((-1005802157 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090328028, 7)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 27)] = var1.getString(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("SdOAvg8+LvnZqsDzpWN0ClOctvvkyRcby7EIM1NnXIMUGPFGsGFAEnDVb9/7B15s")
         );
         var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341288617, 9)] = var1.getString(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("7xu58FjtvX/RmWFwBA0CKCPiW8UhLlzHSXQxarhsjlK1w1f3BjwoI+B0t5TvpvwggOppBDJWvThThA==")
         );
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090323548, 12)] = var1.getString(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("qlwjn78tL2u5lGvRhlWOAQfm+Az3SQ6u8rPv3Hc0W+BsDScpkd6nSqEABigOxJmvGhh7rok/xIKTEg==")
         );
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1089279068, 19)] = var1.getString(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("3uvhpfFuUmYDNb2iae8BdVnMs+F+ZH5OrW8iuT+MBHhzN3hunbbtY0vA53fy1xzByNF/TwSgh3M=")
         );
         return this.firstNonBlank(var10001).trim();
      }
   }

   public boolean hasPageOpenPermission(Player var1, String var2) {
      if (((1478755939 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-852297321, 3) != 0);
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106967758, 19)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 22)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isBlank()) {
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715547, 1) != 0);
         } else {
            return ((!var1.hasPermission(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("qUHIVu3WAlsVVauAsEWqrFRFaYDj8rpn3D+s/WHtckzIoLIW8gBIDjzOt+CrvQJ/Az5NAIIO1eF4krK2")
                  )
                  && !var1.hasPermission(var3)
               ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(855218125, 11)
               : Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27)) != 0);
         }
      }
   }

   @Override
   public boolean onEditorNavbarUndoClick(Player var1, EditorSession var2) {
      if ((1472023533 * 1472023533 - 1472023533 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.performEditorHistoryUndo(var1, var2);
      }
   }

   @Override
   public boolean onEditorNavbarRedoClick(Player var1, EditorSession var2) {
      if ((755893649 * (755893649 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.performEditorHistoryRedo(var1, var2);
      }
   }

   @Override
   public boolean onEditorNavbarHomeClick(Player var1, EditorSession var2) {
      if ((-2038906481 * -2038906481 - -2038906481 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         boolean var3 = this.handleEditorNavbarHomeOrExport(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719874586, 10) != 0));
         if (var3 && (var2 == null || var2.pageFile == null || !this.hasCurrentPageName(var2))) {
            this.playEditorSfx(var1, var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("yV0sx3kkS0SnEx3UdqU/WRhJn6fzo29b4Ki6bwA5OAokaaWe"));
         }

         return var3;
      }
   }

   @Override
   public boolean onEditorNavbarExportClick(Player var1, EditorSession var2) {
      if ((-1349403940 * -1349403940 + -1349403940 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.handleEditorNavbarHomeOrExport(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 29) != 0));
      }
   }

   @Override
   public boolean canEditorNavbarUndo(EditorSession var1) {
      if (((-1683481527 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.hasEditorHistoryEntries(var1, var1 == null ? null : var1.pageUndoSnapshots);
      }
   }

   @Override
   public boolean canEditorNavbarRedo(EditorSession var1) {
      if ((-995895226 * -995895226 - -995895226 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.hasEditorHistoryEntries(var1, var1 == null ? null : var1.pageRedoSnapshots);
      }
   }

   @Override
   public void recordEditorMutation(EditorSession var1) {
      if (((-531103990 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.recordEditorMutationSnapshot(var1, this.captureEditorMutationSnapshot(var1));
      }
   }

   @Override
   public String captureEditorMutationSnapshot(EditorSession var1) {
      if (((1662506379 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.buildEditorHistorySnapshot(var1);
      }
   }

   @Override
   public void recordEditorMutationSnapshot(EditorSession var1, String var2) {
      if (((-1027966910 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.historyApplying && var1.editMode && var1.previewMode) {
         String var3 = this.resolveEditorHistoryPageKey(var1);
         if (!var3.isBlank() && !this.isInternalEditorPageName(var3)) {
            String var4 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2;
            if (!var4.isBlank()) {
               List var5 = var1.pageUndoSnapshots.computeIfAbsent(var3, var0 -> {
                  if ((1621241972 * 1621241972 + 1621241972 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return new ArrayList<>();
                  }
               });
               if (var5.isEmpty() || !this.equalsNullable((String)var5.get(var5.size() - Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 20)), var4)) {
                  var5.add(var4);
                  this.trimEditorHistoryList(var5);
                  var1.pageRedoSnapshots.remove(var3);
               }
            }
         }
      }
   }

   public boolean handleEditorNavbarHomeOrExport(Player var1, EditorSession var2, boolean var3) {
      if (((1229700323 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         int var4 = var2.pageFile == null ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751855108, 7) : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 3);
         if (var3 || var4 != 0 || !this.hasCurrentPageName(var2)) {
            return this.openSavePopup(var1, var2);
         } else {
            return this.saveEditorInPlace(var1) && this.closeEditorAndOpenMenu(var1);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 25) != 0);
      }
   }

   public String resolveEditorHistoryPageKey(EditorSession var1) {
      if ((-1538530768 ^ -1538530768) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
            : this.normalizePageKey(var1.pageName, var1.pageName);
      }
   }

   public String buildEditorHistorySnapshot(EditorSession var1) {
      if ((1200581085 * 1200581085 + 1200581085 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      } else {
         YamlConfiguration var2 = new YamlConfiguration();
         var2.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="), this.copyBlocks(var1.rawBlocks));
         var2.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("9oJLQ+wIrMHNFZmNtWZe/qFaCN2bLUdQF6FJ9AEw6Nii62skydMQnQ=="), new ArrayList<>(var1.hiddenLayerTargetIds));
         var2.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("VLxKLhGDdx+2aSmfJWprIN5dr8uhGr+gFmAnEFMXw3BIhwaxgy5iAQ=="), new ArrayList<>(var1.lockedLayerTargetIds));
         var2.set(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("hFYTpAY2ErlHsHzyUDLGq3QLItcE6yN49JlCVL8e+016hSfj0JQ6N2zjiZdhAQ=="),
            new ArrayList<>(var1.collapsedLayerTargetIds)
         );
         return var2.saveToString();
      }
   }

   public void trimEditorHistoryList(List<String> var1) {
      if ((1312751730 * 1312751730 - 1312751730 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         int var2 = this.resolveEditorHistoryLimit();

         while (var1.size() > var2) {
            var1.removeFirst();
         }
      }
   }

   public int resolveEditorHistoryLimit() {
      if ((16442131 * 16442131 + 16442131 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.plugin == null
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704529109, 6)
            : Math.max(
               Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1029357623, 27),
               this.plugin
                  .getConfig()
                  .getInt(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "Bgj1jTgUYreNHAETdeAkWwernYSM2JhZ/gR9SbRaFBH8lcj5MWdLhAXt6VdzsK2xK2MH/qtizQ5IHR7gT50l6U5NEbAWwk5ncDm8z5fm"
                     ),
                     Xqedii_1s34vun.Xqedii_r62pla0yle6a(210721433, 7)
                  )
            );
      }
   }

   public boolean hasEditorHistoryEntries(EditorSession var1, Map<String, List<String>> var2) {
      if ((-1462649998 ^ -1462649998) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = this.resolveEditorHistoryPageKey(var1);
         if (!var3.isBlank() && !this.isInternalEditorPageName(var3)) {
            List var4 = (List)var2.get(var3);
            return ((var4 != null && !var4.isEmpty()
               ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210716569, 10)
               : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 12)) != 0);
         } else {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748159751, 27) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 20) != 0);
      }
   }

   public boolean performEditorHistoryUndo(Player var1, EditorSession var2) {
      if ((-668189796 * -668189796 + -668189796 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = this.resolveEditorHistoryPageKey(var2);
         List var4 = var2.pageUndoSnapshots.get(var3);
         if (var4 != null && !var4.isEmpty()) {
            String var5 = this.buildEditorHistorySnapshot(var2);
            String var6 = (String)var4.remove(var4.size() - Xqedii_1s34vun.Xqedii_z5j381o3pwva(1743998142, 25));
            List var7 = var2.pageRedoSnapshots.computeIfAbsent(var3, var0 -> {
               if ((-1684497034 ^ -1684497034) != 0) {
                  throw new IllegalStateException();
               } else {
                  return new ArrayList<>();
               }
            });
            if (var7.isEmpty() || !this.equalsNullable((String)var7.get(var7.size() - Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715547, 1)), var5)) {
               var7.add(var5);
               this.trimEditorHistoryList(var7);
            }

            if (!this.applyEditorHistorySnapshot(var1, var2, var6)) {
               if (!var7.isEmpty() && this.equalsNullable((String)var7.get(var7.size() - Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 2)), var5)) {
                  var7.remove(var7.size() - Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704531989, 6));
               }

               var4.add(var6);
               this.trimEditorHistoryList(var4);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 30) != 0);
            } else {
               this.playEditorSfx(var1, var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("NuHJFxVruwGcjlepUYepcx0j1UhhHuMWCk89bckW9bkGA899"));
               this.sendEditorSuccess(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Jxp5M9sKguOU4PxO4+pj8Rbp1obin0O0kJBpXRtKwlhJUl+kxM8qehshhj5+BTfr/9d9Qc19xO/yUKwnlWO74BX+RtZGQFLv"),
                  new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874837, 4)]
               );
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210723737, 13) != 0);
            }
         } else {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("rXtLoJquLxbytOZy1hFMBR41bUR/PUXZ8OuT15DRaGfEXp61lhi2KzmkUg6pejUmKIEnfC8Ujx1Og0FjuBDU2q1AogiA04fwKv29ojcF"),
               new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 14)]
            );
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-2058715245, 28) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(657102079, 21) != 0);
      }
   }

   public boolean performEditorHistoryRedo(Player var1, EditorSession var2) {
      if (((846988114 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = this.resolveEditorHistoryPageKey(var2);
         List var4 = var2.pageRedoSnapshots.get(var3);
         if (var4 != null && !var4.isEmpty()) {
            String var5 = this.buildEditorHistorySnapshot(var2);
            String var6 = (String)var4.remove(var4.size() - Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476839340, 8));
            List var7 = var2.pageUndoSnapshots.computeIfAbsent(var3, var0 -> {
               if (((-1868310407 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  return new ArrayList<>();
               }
            });
            if (var7.isEmpty() || !this.equalsNullable((String)var7.get(var7.size() - Xqedii_1s34vun.Xqedii_z5j381o3pwva(798620883, 15)), var5)) {
               var7.add(var5);
               this.trimEditorHistoryList(var7);
            }

            if (!this.applyEditorHistorySnapshot(var1, var2, var6)) {
               if (!var7.isEmpty() && this.equalsNullable((String)var7.get(var7.size() - Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1029357623, 27)), var5)) {
                  var7.remove(var7.size() - Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594625, 4));
               }

               var4.add(var6);
               this.trimEditorHistoryList(var4);
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 15) != 0);
            } else {
               this.playEditorSfx(var1, var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("VHoMggxjxvSxHTlwESyIrv4FOHB15EG0WODuxFsdA+5erKSt"));
               this.sendEditorSuccess(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("DfdJvF7sb3PNDfEhnmftkwujqdYkffZHS2ITxZnlWPmNW5aRzC2ieZj9JTiJkZ0bfJLKMXQgQGfQO+RaTAFDExCobJRVVh09"),
                  new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(714407719, 29)]
               );
               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18) != 0);
            }
         } else {
            this.sendEditorError(
               var1,
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("rZ3kUPgdVKFNGwk+jrDWZZwE2r6iH474TOwid97Hl8FLp3yO88aFtONL0tC9SGWqdwGU3GrF5+Zkx+fvRlkhimNRQPNDG7Ju3PkZE5eU"),
               new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113683289, 16)]
            );
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 18) != 0);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean applyEditorHistorySnapshot(Player var1, EditorSession var2, String var3) {
      if ((-1712759282 * (-1712759282 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         YamlConfiguration var4 = new YamlConfiguration();

         try {
            var4.loadFromString(var3);
         } catch (Exception var12) {
            String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "VnEo1ifMb4FYgfBUU8wBbcomeh3OFNMs2s7AeFKjkc7XVHSQcxbAlgfEQYHvTBjKZPayC4FWTVvppG6Dz3GEEiIl51s6oSuBsK2hWYrNxCbb3xB8SXAmwGzetKqPFWqA"
            );
            Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093999769, 18)];
            var10003[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25)] = String.valueOf(var12.getMessage());
            this.sendEditorError(var1, var10002, var10003);
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 24) != 0);
         }

         ArrayList var5 = new ArrayList<>(this.getSelectedTargetIds(var2));
         List var6 = this.resolveEditorTargetPathsByIds(var2, var5);
         var2.historyApplying = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 17) != 0);
         boolean var11 = false /* VF: Semaphore variable */;

         int var7;
         try {
            var11 = true;
            this.finishLayersReorderDrag(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(798647795, 28) != 0));
            this.resetActivePagesDragState(var2);
            this.clearActivePagesDragPreview(var1);
            this.stopCursorToolDrag(var2);
            this.resetSidebarFieldDrag(var1, var2);
            var2.pendingPropertyField = null;
            var2.pendingSavePopupField = null;
            this.clearPendingTextToolEdit(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 15) != 0));
            this.stopOpacitySliderDrag(var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29) != 0));
            var2.colorPickerGradDragActive = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 8) != 0);
            var2.colorPickerHueDragActive = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2) != 0);
            var2.selectedElementId = null;
            var2.additionalSelectedElementIds.clear();
            var2.hoveredElementId = null;
            var2.rawBlocks = this.copyBlocks(var4.getList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q==")));
            var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
            var2.hiddenLayerTargetIds.clear();
            var2.hiddenLayerTargetIds
               .addAll(var4.getStringList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("9oJLQ+wIrMHNFZmNtWZe/qFaCN2bLUdQF6FJ9AEw6Nii62skydMQnQ==")));
            var2.lockedLayerTargetIds.clear();
            var2.lockedLayerTargetIds
               .addAll(var4.getStringList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("VLxKLhGDdx+2aSmfJWprIN5dr8uhGr+gFmAnEFMXw3BIhwaxgy5iAQ==")));
            var2.collapsedLayerTargetIds.clear();
            var2.collapsedLayerTargetIds
               .addAll(var4.getStringList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("hFYTpAY2ErlHsHzyUDLGq3QLItcE6yN49JlCVL8e+016hSfj0JQ6N2zjiZdhAQ==")));
            this.clearEditorOverlaysOnly(var1, var2);
            this.rerenderEditableContent(var1, var2);
            this.restoreSelectionAfterHistorySnapshot(var2, var5, var6);
            this.normalizeSelectionState(var2);
            var2.selectionOutlineVisible = ((var2.selectedElementId != null
               ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 27)
               : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22)) != 0);
            if (var2.selectionOutlineVisible) {
               this.showSelectionOverlay(var1, var2);
            }

            this.renderLayersPanel(var1, var2);
            this.updateEditorPropertiesSidebar(var1, var2);
            this.updatePageInfoReadout(var1, var2);
            var7 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1890144242, 25);
            var11 = false;
         } finally {
            if (var11) {
               var2.historyApplying = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 3) != 0);
            }
         }

         var2.historyApplying = (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 1) != 0);
         return (var7 != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9) != 0);
      }
   }

   public void openOnJoinForPlayer(Player var1) {
      if ((-2070230199 * -2070230199 + -2070230199 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         ArrayList var2 = new ArrayList();
         Map var3 = this.loadYamlFolder(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU="), var2
         );
         if (!var3.isEmpty()) {
            for (Entry var5 : (Iterable<Entry>) (var3.entrySet())) {

               YamlConfiguration var6 = (YamlConfiguration)var5.getValue();
               if (var6 != null
                  && (
                     var6.getBoolean(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("iw8CqsFZ4SvzfFIFyM+AaiC+epxi5WAtCxdYcGCbQ8QBql0oPuKf6Rf5wPLc/xfS3Jno9KrZ06aE5ga26GMfMtgt5bk="),
                           (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17) != 0)
                        )
                        || var6.getBoolean(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("8uI847CTE3mJoYGLqhx6Ep4zsYNwQVTVeI7pgQdfYSG+FSCW1YhslpzXuQ9cYWMkNFwBeNHNeMB6exdbjrBsjg=="),
                           (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29) != 0)
                        )
                  )) {
                  String var7 = this.normalizePageKey((String)var5.getKey(), Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
                  if (!var7.isBlank()) {
                     String var8 = this.resolvePageOpenPermission(var6);
                     if (var8.isBlank() || this.hasPageOpenPermission(var1, var8)) {
                        String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327648, 2)];
                        var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17)] = var6.getString(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("eRxs+7RMkeR/WUXVPrUe3Cqb2hVSONXEAn3OL2pB2jnrnmCLKBzEfHjmMKsSLsow5QH0/X1Xwde2wSNCNLw=")
                        );
                        var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 5)] = var6.getString(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("Lcyv0XkwoULnZtIQwmYQvSLcuM2/VGW/LUrUy3MoskbW4rOVQosbxTXwwY4PYy55x5vu3nIA1f1H6g==")
                        );
                        String var9 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
                        boolean var10 = var9.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("mZU8yLLW4hINjo8QtlDjf1TxkkYhlAKzkzGvzQ/wqQiV+w=="));
                        int var10000 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17);
                        int[] var14 = new int[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090262108, 16)];
                        var14[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 12)] = var6.getInt(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("TC5LVGJ1qct7PyFVlObr8UdkkcC7joM6GgJHz8LMSAxYzM4dmvCNDAQx+oGOErS1CPWcHbu0MH7PD3/GMMjtug=="),
                           Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 11)
                        );
                        var14[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719873562, 10)] = var6.getInt(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("jXgURPSztMUiXmi8+sYHixNvVT/2AsoBi+f59SHXFEJm99dfYdq3FZndPEDkJUhk93xwyV6rrsudYyvn"),
                           Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20)
                        );
                        int var11 = Math.max(var10000, Xqedii_1yuucel(var14));
                        if (var11 <= 0) {
                           if (var10) {
                              this.startGuiHud(var1, var7, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26) != 0));
                           } else {
                              this.startGui(var1, var7, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-852297321, 3) != 0));
                           }
                        } else {
                           Xqedii_38o2zes.Xqedii_2sj63w1(this.plugin, var1, () -> {
                              if ((2144413397 * (2144413397 + 1) & 1) != 0) {
                                 throw new IllegalStateException();
                              } else {
                                 if (var1.isOnline()) {
                                    if (var10) {
                                       this.startGuiHud(var1, var7, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217622, 5) != 0));
                                    } else {
                                       this.startGui(var1, var7, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-447569948, 26) != 0));
                                    }
                                 }
                              }
                           }, var11);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static int Xqedii_1yuucel(int... var0) {
      if ((2042374937 * 2042374937 + 2042374937 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int[] var1 = var0;
         int var2 = var0.length;

         for (int var3 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556030, 6); var3 < var2; var3++) {
            int var4 = var1[var3];
            if (var4 != 0) {
               return var4;
            }
         }

         return Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-447569948, 26);
      }
   }

   @Override
   public String normalizeCustomCommandToken(String var1) {
      if ((-1476824734 * -1476824734 + -1476824734 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093999769, 18)];
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 11)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.startsWith(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Ry4iPbpHos+q8vgveclPD9MzrlY/sLda0yCuSz4w"))) {
            var2 = var2.substring(Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704531989, 6)).trim();
         }

         int var3 = var2.indexOf(Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(849956850, 25));
         if (var3 >= 0) {
            var2 = var2.substring(Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1), var3);
         }

         var2 = var2.toLowerCase(Locale.ROOT);
         return var2.replaceAll(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("+JGE+eYN2fyHvTAO+0/R3q3d5oz9OBRVJcCpWUxXhXVhcbp0RT2MtujHq/cgH4q+1F+jSw=="),
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
         );
      }
   }

   public boolean hasDefinedPageBlocks(YamlConfiguration var1) {
      if ((-1634551491 ^ -1634551491) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 27) != 0);
      } else {
         List var2 = var1.getList(Xqedii_1s34vun.Xqedii_997tx7qg1fze("vYOjfGkdWWK/db1qthg9HNFkwX+rzD5zORdACa8aGtMbJDSnOVl40Q=="));
         return ((var2 != null && !var2.isEmpty()
            ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715529, 4)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476839084, 8)) != 0);
      }
   }

   public void ensurePageDisplayName(EditorSession var1) {
      if (((1089224692 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.yaml != null) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715033, 9)];
         var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28420823, 14)] = var1.yaml
            .getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"));
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597241766, 16)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2)] = var1.pageName;
            String var3 = this.firstNonBlank(var10001).trim();
            if (!var3.isBlank()) {
               var1.yaml.set(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var3);
            }
         }
      }
   }

   public Map<String, String[]> collectPageCommands() {
      if (((1987172235 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var1 = new LinkedHashMap();
         ArrayList var2 = new ArrayList();
         Map var3 = this.loadYamlFolder(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU="), var2
         );
         if (var3.isEmpty()) {
            return var1;
         } else {
            ArrayList var4 = new ArrayList(var3.keySet());
            var4.sort(String.CASE_INSENSITIVE_ORDER);

            for (String var6 : (Iterable<String>) (var4)) {

               if (!this.isInternalEditorPageName(var6)) {
                  YamlConfiguration var7 = (YamlConfiguration)var3.get(var6);
                  if (var7 != null) {
                     String var8 = this.normalizeCustomCommandToken(
                        var7.getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("EBDl/W9OujeTRXB1WSvdkN4bXugGJYO43mjMY3ckDrMKMhbD4OuvBSNF"))
                     );
                     int var9 = var8.indexOf(Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1233333457, 23));
                     if (var9 >= 0) {
                        var8 = var8.substring(var9 + Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29));
                     }

                     if (!var8.isBlank()
                        && !var8.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("OdpdXersTi00dlG6GGY209NnRlsIAY9udDehjCCOPBLVpw=="))
                        && !var8.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("xq++w0b1q6mDnuYg40q6tCminpEr8JmCIO+cOa+jHyzCIMlw5hsTcd9fyRVIc+UC"))
                        && !var8.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("MlhxqT3x5ik+53dE2r2/YXwVs+5lh6KmvY/fUXgJ9L1HUi7yNZfxmQ=="))
                        && !var1.containsKey(var8)) {
                        String[] var10002 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327648, 2)];
                        var10002[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22)] = var6;
                        var10002[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074329, 1)] = this.resolvePageOpenPermission(var7);
                        var1.put(var8, var10002);
                     }
                  }
               }
            }

            return var1;
         }
      }
   }

   public String resolveGuiByCustomCommand(String var1) {
      if ((-1463513829 * (-1463513829 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.normalizeCustomCommandToken(var1);
         if (!var2.isBlank()
            && !var2.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("OdpdXersTi00dlG6GGY209NnRlsIAY9udDehjCCOPBLVpw=="))
            && !var2.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("xq++w0b1q6mDnuYg40q6tCminpEr8JmCIO+cOa+jHyzCIMlw5hsTcd9fyRVIc+UC"))
            && !var2.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("IyC9kAvojBnA+5fBy9hH2HXSwtr+wB4ICuT15NiwLdhcyU/I0gD0EQhRy64IaTYF"))
            && !var2.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("MlhxqT3x5ik+53dE2r2/YXwVs+5lh6KmvY/fUXgJ9L1HUi7yNZfxmQ=="))) {
            ArrayList var3 = new ArrayList();
            Map var4 = this.loadYamlFolder(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("n1tilCAceRMrZi1FtnJo/uAw/CcxOdBhpQEJ72+p8ykzchUdOxibx63YxX2ZIGtF5K78KjfsJfU="), var3
            );
            if (var4.isEmpty()) {
               return null;
            } else {
               ArrayList var5 = new ArrayList(var4.keySet());
               var5.sort(String.CASE_INSENSITIVE_ORDER);
               String var6 = this.normalizePageKey(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
               String var7 = var2;
               int var8 = var2.indexOf(Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327420, 5));
               if (var8 >= 0 && var8 + Xqedii_1s34vun.Xqedii_z5j381o3pwva(-806971012, 26) < var2.length()) {
                  var7 = var2.substring(var8 + Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715033, 9));
               }

               String var9 = this.normalizePageKey(var7, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
               String var10 = null;
               String var11 = null;
               ArrayList var12 = new ArrayList();

               for (String var14 : (Iterable<String>) (var5)) {

                  if (!this.isInternalEditorPageName(var14)) {
                     YamlConfiguration var15 = (YamlConfiguration)var4.get(var14);
                     if (var15 != null) {
                        String var16 = this.normalizeCustomCommandToken(
                           var15.getString(Xqedii_1s34vun.Xqedii_997tx7qg1fze("EBDl/W9OujeTRXB1WSvdkN4bXugGJYO43mjMY3ckDrMKMhbD4OuvBSNF"))
                        );
                        if (!var16.isBlank() && var16.equals(var2)) {
                           var12.add(var14);
                           String var17 = this.normalizePageKey(var14, var14);
                           if (!var6.isBlank() && var17.equals(var6)) {
                              return var14;
                           }

                           if (!var9.isBlank() && var17.equals(var9)) {
                              return var14;
                           }

                           if (var11 == null && this.hasDefinedPageBlocks(var15)) {
                              var11 = var14;
                           }

                           if (var10 == null) {
                              var10 = var14;
                           }
                        }
                     }
                  }
               }

               if (var12.size() > Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 10)) {
                  this.plugin
                     .getLogger()
                     .warning(
                        Xqedii_3gd0ckbywarv3(var2, String.join(Xqedii_1s34vun.Xqedii_997tx7qg1fze("njlij6t8bbA1wLN6zpkDI1noUtA86WBK1/61a9k44EI="), var12))
                     );
               }

               return var11 != null ? var11 : var10;
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public int resolveEditorHudTransitionTicks(EditorSession var1) {
      if ((-351489108 * -351489108 - -351489108 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var1.menuFilePopupVisible && this.isMenuFilePopupRenderContext(var1) && var1.menuFilePopupTransitionTicksOverride >= 0
            ? var1.menuFilePopupTransitionTicksOverride
            : super.resolveEditorHudTransitionTicks(var1);
      }
   }

   @Override
   public boolean handleEditorFileDropdownAction(Player var1, EditorSession var2, String var3) {
      if ((2113489986 * 2113489986 + 2113489986 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         int var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(-210715546, 3);
         switch (var3.hashCode()) {
            case -1865790497:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("qpTEVEe6cBXyhTpFYamhmF8XqI1y97vBD5NWPrN8VEIsKNVrE7NO4lwVBCE+o6qHHTA3MonFJ7SwJjVURm+SqpDP6aNcAQ==")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537165, 0);
               }
               break;
            case 1159766219:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("WNmBE72KybHwKZ/Lki3vhTP22fuwrl39sIfx25SIRwcbW7kEz9xrvidVZVpV2f/iqf0Yb0ZpYPtzkx2CAQA="))) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-852297289, 3);
               }
               break;
            case 1593054335:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("BmdlJa2nf8+s54ahY44SRvbQpLohIM06FZ48yjeLhDgodoYePalF1U98SY0qGg9tyYsSVOH/4H5KAAovL1SJ6g=="))) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1969946841, 29);
               }
               break;
            case 1593159602:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Gjc/nn7thKsCxK1TwHx7g3BJc8CEZnWL1Th21Dd0Lzf0nrv+x1lVrD/gNH2hPahz7n0iy9s31vQyc4RKjDNfBw=="))) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1923698674, 25);
               }
               break;
            case 1605924293:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("1NlsvC8NhYIyu2cv3h18ZhpiwByZq5AZbU/uQuPV0HsE2om2M8OkNaagaa4wAThZy3ekeCSmHRA2LWueaBwRKOeyQopzyXEBPd0=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1358763100, 27);
               }
               break;
            case 2128852579:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("wij5VPQtGhpR/TAan8a/2SIy9qepQUcuee7qH5/rFpM57odPK+8g+N1mzW97SZQd3enaaTycozmjpdFC3smLNoOp"))) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327772, 7);
               }
         }
         return switch (var5) {
            case 0 -> this.hasCurrentPageName(var2) ? this.saveEditorInPlace(var1) : this.openSavePopup(var1, var2);
            case 1 -> this.openSavePopup(var1, var2);
            case 2, 3 -> this.closeEditorAndOpenMenu(var1);
            case 4 -> this.createNewUiInEditor(var1, var2);
            case 5 -> {
               boolean var6 = this.closeEditorAndOpenMenu(var1);
               if (var6) {
                  EditorSession var7 = this.editorSessions.get(var1.getUniqueId());
                  this.openEditorMenuFilePopup(var1, var7, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-895139895, 27) != 0));
               }

               yield var6;
            }
            default -> false;
         };
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 20) != 0);
      }
   }

   @Override
   public boolean handleEditorEditDropdownAction(Player var1, EditorSession var2, String var3) {
      if ((-2110503384 ^ -2110503384) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         int var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1157436507, 26);
         switch (var3.hashCode()) {
            case -2016391924:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("8MCBgAuHZpGjUt1ijS8SkDZV5x5yVkOM/TE/S7PazgxlGa2fk69zUb/m3kFpKYtQ4VI63uFdRAyl91lJgwvvdlKv"))) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094786201, 18);
               }
               break;
            case -797639941:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("eTlDDCx+JpFZSofGt3wFZgv6uO+kp0KQmF0Gbj1Jt3pJ1kPXt4VBCOL/x9m0HV3eMLLvhKquHCzP3yKWL+E="))) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378378, 1);
               }
               break;
            case 461371110:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("dqo6x5mZKl2A4b5mjDRHhYLH9Eqy2QhiXSGksAa8z3XpfbLeGTlKkgzO7OCZ0sPbvP7PgOlscvMSlngi0i0jU3xRO+cWnXz0bMI=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556414, 6);
               }
               break;
            case 1042959836:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("91vhseM07HVZsKLr+A58PjC2o6zQ8vUKof8gWXGtAqcmtpkY7STo4FDrvFjQQX3Bs1P1Zz+4z2FhPAEUXBXM2w=="))) {
                  var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(213861273, 20);
               }
               break;
            case 1043396709:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQsXf+Jg34w9KNBmiVqUgBbRIEhJ5sctkveyAj0q9VPW5SUp7otl5MVOOjoFYwbMWX47kEbMp5ORpsJRcScWhg=="))) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070187173, 11);
               }
               break;
            case 1043494731:
               if (var3.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("upFHWwyCEq72fE3TbrGvct2t/y8dbpRxpxhpyWB7D03++IOWTePGWhPDx61ORS3UdsrzAbCNkECIoUtq0HRUdA=="))) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26);
               }
               break;
            case 1569361585:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("/b26+8QIrRj4E9jF+qBch0v9MfM+0thHL26pw2HWe06FERSbZkTNM0NEmGU7Hn/48MlJ2hm4mQzH229NJkY7UlIkH98RgNWSFBe3AGn5")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719869466, 10);
               }
         }
         return switch (var5) {
            case 0 -> this.performEditorHistoryUndo(var1, var2);
            case 1 -> this.performEditorHistoryRedo(var1, var2);
            case 2 -> this.handleEditorEditCut(var1, var2);
            case 3 -> this.handleEditorEditCopy(var1, var2);
            case 4 -> this.handleEditorEditPaste(var1, var2);
            case 5 -> this.openPreferencesPopup(var1, var2);
            default -> false;
         };
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 10) != 0);
      }
   }

   @Override
   public boolean handleSelectionDropdownAction(Player var1, EditorSession var2, String var3) {
      if ((-1878269633 * -1878269633 - -1878269633 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         int var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(454733152, 18);
         switch (var3.hashCode()) {
            case -2027642365:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("mhosPC5vOtCMZubF0JP1dwbEJUXDPYpYUNJiCyJp3NyIgpxU/0hnQle+KEedrwey5jZ6gK49Le5FTxOwVlQ4mhNbcWLkZd70m/w=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148649, 2);
               }
               break;
            case -2027457543:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("9tG6RFXdXLJ0OC5OsFpg4DVuycbHluEJ1M9HKzk4ISZo2iRJtILp5IQ6Dg8kx5G1+a/rnYgSineBhV4rRRMj6wagsJweK3+uu+E=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(945072121, 24);
               }
               break;
            case -886322559:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "MlA3OMcHzOBcgqX9ErBf+6x0Bcte1gwEKeorrS+JCCdL6t+5pvNFsc93ae1RjIqGf93s0lnt28gug/SrnpB8FJ3u+hhPmblD+E9/e1soWHI="
                  )
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715417, 6);
               }
               break;
            case -619603776:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("XM9qRN0qdkvUSLy9i1HwwzAU8FlrDeoBfu7BPRdWFUGET3DrxaC8erQp3t7nz3aRm0hrGH37y0Aj0YLexzkAfgGI8XQh0RKU")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 30);
               }
               break;
            case 1562154988:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("p9AblSfH574+NnUx0+RVbTo/5WwdZRM6CiFnIZVmdwHBV98ZpaGByW6e2yyq8MnrLaJ4PyQcDK7D+0zh3Lh6O15U30XhV1bVSCA3Lw==")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327772, 5);
               }
               break;
            case 1727762396:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("1lCvNQSPkwYXQGa7gJoeLBcvvZc1GscS458BLbgSl8wUbLUKgDG8thsYc9WcsGlrllGaMv6WK0foohHdEQBgpk/0/2gtdhL1ipEW3Sls")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210748313, 13);
               }
               break;
            case 2015585587:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "q+zZnd/U3Otf6VNvzwEXoy7ssvxN9l299nrCXdBRMnGVroZHC/x1WiSHLbhsvr88YqhRznHr3pVZ4CATQJwo1ha/wkW9gTDKsrlqmeY1weA="
                  )
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(2125025266, 25);
               }
         }
         return switch (var5) {
            case 0 -> this.handleEditorSelectionSelectAll(var1, var2);
            case 1 -> this.handleEditorSelectionClear(var1, var2);
            case 2 -> this.handleEditorSelectionReverse(var1, var2);
            case 3 -> this.handleEditorSelectionVisibility(var1, var2, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 2) != 0));
            case 4 -> this.handleEditorSelectionVisibility(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 10) != 0));
            case 5 -> this.handleEditorSelectionLock(var1, var2, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0));
            case 6 -> this.handleEditorSelectionLock(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855221855, 24) != 0));
            default -> false;
         };
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26) != 0);
      }
   }

   @Override
   public boolean handleEditorLayerDropdownAction(Player var1, EditorSession var2, String var3) {
      if ((1172973821 ^ 1172973821) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         int var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-961849338, 24);
         switch (var3.hashCode()) {
            case -667140849:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("TC/covnnEDZIsquZPuJfeJvi3Q3M1mkZPfviUP+fLDUY3qmDx46iTR7L8SnNmTpCAZMWce1m1Ddl+bz6XCk82498stcwFPYdinM=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(-1936768102, 31);
               }
               break;
            case -389082089:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("eCDHHuHpBbElnxU4E6DHIKP+Izemig+jFwYVPK9KqDxgvVG5WhWMV79WQCQgM0+3kcWsccKjj9Wcds2jPgzCyflNOgLVL7rs")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1089279068, 20);
               }
               break;
            case -388792703:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("8ZCbxRysehxDGHTG49ihF+V/1K2jwm0nbB5VCgEt0jVhuWdqCazHY9AxANeNWnsNa1mh7gm51WulNEKEWN3x50QsDgRnSjTW")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210549, 2);
               }
               break;
            case -388768207:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("5I8poAhMWdxLU3ixNzIthRK58dpTrjFPcBB3UDNW9AiIqEOOoCIzVgrYLeh7VXxDicLk/Sx/JU5ghE1uICoOnUnBZY8PEOCH")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748173207, 14);
               }
               break;
            case 660758088:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("EV/a9ieD5dSr/PV0qaWW0hUNdjD7CuAsiBVZuL/x4Vfap3U37BLvXuob0pKdIThH1LQo4TGgs8x4mhR1osDOAOE0AkYM9g==")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409063082, 7);
               }
               break;
            case 816663561:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("AScNwnW5b1vRoxufmDnv1IBlS6eIZtelR5HX8EaxHsjpR+m7ZDpIQiZTiCpiK1IOKjStk2MV7tqO+P4d+99dzR7rREOV6wGnCkU=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14210412, 13);
               }
               break;
            case 823144663:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Q2huhyMZ0DYMv40fVkm+cuIdFHjQeEW1gu7AJj6mzuHRnuOGR22SKxyI5aKzO7YKKzAoq00+IXHIucZ2iUz6ysodgljslFJ/Occ=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556222, 6);
               }
               break;
            case 823189318:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("PV3fBbRLO19hPGOQdZD99er35KauDZcU8v3UdC78TIIGteAabQ/jK/B8/BSVKUftLPkg46FfaakbrGEvsu5EV5bgyIrgs6Gtqxs=")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751854596, 7);
               }
               break;
            case 891588586:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "I8KsDbKgq2xThRMO48aRiGT8OwvO1mQpgdaNA2sdIbRa/GkNs7B202tKxNtF3v1vYY2B2ZQNBj08SHlNX8JP4jQChFuDV23UFw6fzJTBkL0="
                  )
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090339932, 12);
               }
         }
         return switch (var5) {
            case 0 -> this.handleEditorSelectionNewBlock(var1, var2);
            case 1 -> this.handleEditorSelectionNewText(var1, var2);
            case 2 -> this.handleEditorSelectionNewItem(var1, var2);
            case 3 -> this.openEditorImageFilePopup(var1, var2);
            case 4 -> this.handleEditorSelectionNewSkin(var1, var2);
            case 5 -> this.handleEditorSelectionNewInput(var1, var2);
            case 6 -> this.handleEditorSelectionDeleteLayer(var1, var2);
            case 7 -> this.handleEditorSelectionMoveLayer(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100614836, 17) != 0));
            case 8 -> this.handleEditorSelectionMoveLayer(var1, var2, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-751855108, 7) != 0));
            default -> false;
         };
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 4) != 0);
      }
   }

   @Override
   public boolean handleEditorWindowDropdownAction(Player var1, EditorSession var2, String var3) {
      if (((2060867868 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank()) {
         int var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1923698675, 25);
         switch (var3.hashCode()) {
            case -1844291423:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("L64uD0n86xJeRoGC7DkfcS8MTJZgDDn7F+tS0OnNOy0OJahuhY+UTP+D4SsG8vrweXfbLyd9gp2JFum0JuwYtPDJkN6eFwFcjpkkrDi+")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1613942023, 27);
               }
               break;
            case -1840172360:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Zi2Mj6Fv5aPIHmN/uRlsy10QFGBIFN7VXj/RXQSjmKXrIMGQ48yq1kfU+ZW0wyA3d+/5flqXzoevbQwNztVqO4vW9cMWGyZCHGzmCy1e")
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11);
               }
               break;
            case -1611569058:
               if (var3.equals(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "yneJqbauSqvE8AUHjMcZ6016Jz2AYYMeFhNoEeLuq1wfyjf65ZQgJrTX0/na7jv3d/dE1oFiWPViT1dOGy6k1ygiosfInAiStW3V9HiA9xI="
                  )
               )) {
                  var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327772, 7);
               }
         }
         return (switch (var5) {
            case 0 -> this.toggleShellBlockGroupEnabled(
               var1,
               var2,
               List.of(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("Khs3dIrWuLZxD8WZIve4cLHi443bpu0x0tUb7pJ1NtkYVzNzWelTaMSsJFq1Q5Oe9cn8yw=="),
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("vRaG8KKrO8Xi6n6f7z/sMDfBmJBrMUIXeyH8Topy+Msg4HvFy+MI5aDAo3/G/9x6IDCbWuLP")
               )
            );
            case 1 -> this.toggleShellBlockGroupEnabled(
               var1, var2, List.of(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Rc4mrxKnqjulADcHzld9ZHMOZhXDp+e9xg30XKeQEMhIpuQeW18XaRrWTCpPXO07PudMjg=="))
            );
            case 2 -> this.toggleShellBlockGroupEnabled(
               var1, var2, List.of(Xqedii_1s34vun.Xqedii_997tx7qg1fze("T1M6Uw5xq0rECI/OIv7ccusr43dMyGdl7aQMdvQKNwmhUgcxgM8EIQ=="))
            );
            default -> (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31) != 0);
         });
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597176230, 16) != 0);
      }
   }

   @Override
   public boolean openEditorTextPrompt(Player var1, EditorSession var2, String var3, String var4) {
      if (((-585404608 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && this.plugin.anvilInput() != null) {
         String var5 = var4 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var4;
         if (var5.length() > Xqedii_1s34vun.Xqedii_z5j381o3pwva(-906801986, 25)) {
            return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17) != 0);
         } else {
            long var6 = var2.editorTextPromptToken = var2.editorTextPromptToken + Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(6230216162825098578L, 47);
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-739862148, 26)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11)] = var3;
            var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210723737, 13)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "o+4djZwPkWpW+XhPXEKYvXi5Aw69zNbw3S13eAiaK2j5gklnXBid5LPrjE93q8cc"
            );
            String var8 = this.firstNonBlank(var10001);
            var2.editorTextPromptDraft = var5;
            AnvilInputRequest var9 = AnvilInputRequest.builder()
               .title(var8)
               .initial(var5)
               .allowEmpty((Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 28) != 0))
               .onChange(var5x -> {
                  if ((-922614443 * (-922614443 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     this.previewEditorTextPrompt(var1, var2, var6, var5x);
                  }
               })
               .onCommit(var6x -> {
                  if ((-1413963233 * (-1413963233 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     this.finishEditorTextPrompt(var1, var2, var6, var8, var6x, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148657, 2) != 0));
                  }
               })
               .onCancel(
                  (var6x, var7, var8x) -> {
                     if ((1300635212 ^ 1300635212) != 0) {
                        throw new IllegalStateException();
                     } else {
                        this.finishEditorTextPrompt(
                           var1,
                           var2,
                           var6,
                           var8,
                           null,
                           ((var8x == InputCloseReason.CLICK
                              ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1674947588, 23)
                              : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20)) != 0)
                        );
                     }
                  }
               )
               .build();

            try {
               if (this.plugin.anvilInput().open(var1, var9) != null) {
                  this.refreshEditorTextPromptDraft(var1, var2);
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 11) != 0);
               }
            } catch (RuntimeException var11) {
               this.plugin.getLogger().warning(Xqedii_1dbo1ec74yk7s(var8, var11.getMessage()));
            }

            if (var2.editorTextPromptToken == var6) {
               var2.editorTextPromptDraft = null;
            }

            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(961849337, 24) != 0);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 25) != 0);
      }
   }

   public boolean swallowEditorPromptClick(Player var1, EditorSession var2) {
      if ((-1783530772 * -1783530772 - -1783530772 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = this.plugin.anvilInput() != null && this.plugin.anvilInput().isActive(var1)
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14218604, 13)
            : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 18);
         if (var3 == 0 && !this.isEditorTextPromptCoolingDown(var2)) {
            return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 13) != 0);
         } else {
            if (var3 == 0) {
               this.armEditorTextPromptCooldown(var2);
            }

            var2.lastLeftClickTick = Xqedii_38o2zes.Xqedii_316oplq();
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3) != 0);
         }
      }
   }

   public boolean isEditorTextPromptCurrent(Player var1, EditorSession var2, long var3) {
      if ((-303802002 ^ -303802002) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && var2 != null
               && var2.editorTextPromptToken == var3
               && var2.editMode
               && this.editorSessions.get(var1.getUniqueId()) == var2
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 21)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217622, 5)) != 0);
      }
   }

   public boolean isAwaitingEditorTextPrompt(EditorSession var1) {
      if (((-1681825942 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && var1.editMode) {
            if (var1.colorPickerHexInputPending) {
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
            }

            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-427871029, 21)];
            var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(855221855, 24)] = var1.pendingTextToolTargetId;
            if (!this.firstNonBlank(var10001).isBlank()) {
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
            }

            var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-514678812, 26)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1428815438, 30)] = var1.pendingActionTargetId;
            if (!this.firstNonBlank(var10001).isBlank() && var1.pendingActionIndex >= 0 || var1.pendingSavePopupField != null) {
               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
            }

            if (var1.pendingPropertyField != null && var1.pendingPropertyField != EditorPropertyField.ITEM_DESIGN_ITEM) {
               var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454995297, 18)];
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31)] = var1.pendingItemDesignInventoryTargetId;
               if (this.firstNonBlank(var10001).isBlank()) {
                  return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
               }
            }
         }

         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 29) != 0);
      }
   }

   public void previewEditorTextPrompt(Player var1, EditorSession var2, long var3, String var5) {
      if ((1394814661 * (1394814661 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.isEditorTextPromptCurrent(var1, var2, var3)) {
         var2.editorTextPromptDraft = var5 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var5;
         this.refreshEditorTextPromptDraft(var1, var2);
      }
   }

   public void refreshEditorTextPromptDraft(Player var1, EditorSession var2) {
      if ((1769116585 * (1769116585 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var2.editorTextPromptDraft == null
            ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
            : var2.editorTextPromptDraft;
         if (var2.colorPickerHexInputPending) {
            this.updateColorPickerDisplay(
               var1, var2, var2.colorPickerSlot == Xqedii_1s34vun.Xqedii_z5j381o3pwva(871999071, 24) ? var2.editorColor1 : var2.editorColor2
            );
         } else {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594625, 4)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(657102079, 21)] = var2.pendingTextToolTargetId;
            String var4 = this.firstNonBlank(var10001);
            if (!var4.isBlank()) {
               if (this.isTextTarget(var2, var4)
                  && this.setTargetText(
                     var2,
                     var4,
                     var3.isEmpty() ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("3ggwI31v0R7sTmjNY7Qo0GWi+UwdL9SgS1Bb61pv2N1holRdpKPBDI0oZ7LBaG4xxY9Fdan6") : var3
                  )) {
                  var2.pendingTextToolPlaceholderActive = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(177536807, 29) != 0);
                  this.rerenderEditableSelection(var1, var2);
               }
            } else {
               var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(202326937, 23)];
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 10)] = var2.pendingActionTargetId;
               if (!this.firstNonBlank(var10001).isBlank() && var2.pendingActionIndex >= 0) {
                  this.renderActionsPanel(var1, var2);
               } else if (var2.pendingSavePopupField != null) {
                  this.refreshSavePopupFields(var1, var2);
               } else {
                  if (var2.pendingPropertyField != null) {
                     this.applySidebarPendingInputIndicator(var1, var2);
                  }
               }
            }
         }
      }
   }

   public void finishEditorTextPrompt(Player var1, EditorSession var2, long var3, String var5, String var6, boolean var7) {
      if (((588754805 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.isEditorTextPromptCurrent(var1, var2, var3)) {
         var2.editorTextPromptDraft = null;
         this.armEditorTextPromptCooldown(var2);
         if (var7) {
            var2.lastLeftClickTick = Xqedii_38o2zes.Xqedii_316oplq();
         }

         if (this.isAwaitingSidebarInput(var1)) {
            if (var6 != null) {
               String[] var10 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 16)];
               var10[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 25)] = var2.pendingTextToolTargetId;
               String var9 = this.firstNonBlank(var10);
               if (!var9.isBlank() && var2.pendingTextToolPlaceholderActive) {
                  this.setTargetText(
                     var2,
                     var9,
                     var2.pendingTextToolOriginalText == null
                        ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
                        : var2.pendingTextToolOriginalText
                  );
               }

               this.handleSidebarChatInput(var1, var6);
               if (var2.editorTextPromptToken == var3 && this.isAwaitingEditorTextPrompt(var2)) {
                  Xqedii_38o2zes.Xqedii_2sj63w1(this.plugin, var1, () -> {
                     if ((-2022590939 * (-2022590939 + 1) & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        if (var1.isOnline() && this.isEditorTextPromptCurrent(var1, var2, var3) && this.isAwaitingEditorTextPrompt(var2)) {
                           this.openEditorTextPrompt(var1, var2, var5, var6);
                        }
                     }
                  }, Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701526L, 3));
               }
            } else {
               int var10000;
               label68: {
                  if (var2.pendingPropertyField == null) {
                     String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546867, 9)];
                     var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 19)] = var2.pendingActionTargetId;
                     if (this.firstNonBlank(var10001).isBlank() || var2.pendingActionIndex < 0) {
                        var10000 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 14);
                        break label68;
                     }
                  }

                  var10000 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27);
               }

               int var8 = var10000;
               this.handleSidebarChatInput(var1, Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="));
               if (var8 != 0) {
                  this.updateEditorPropertiesSidebar(var1, var2);
               }
            }
         }
      }
   }

   public boolean handleEditorTextCommand(Player var1, String var2) {
      if (((-1071309062 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874094796, 13) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 == null || !var3.editMode) {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874094796, 13) != 0);
         } else if (this.isAwaitingSidebarInput(var1)) {
            return this.handleSidebarChatInput(var1, var2);
         } else {
            String var4 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2;
            ArrayList var5 = new ArrayList();

            for (String var7 : this.getSidebarEditableTargetIds(var3)) {
               if (this.isTextTarget(var3, var7)) {
                  var5.add(var7);
               }
            }

            if (!var5.isEmpty() && !var4.isBlank()) {
               boolean var9 = false;

               for (String var8 : (Iterable<String>) (var5)) {

                  var9 |= this.setTargetText(var3, var8, var4);
               }

               if (!var9) {
                  this.sendEditorError(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 24)]
                  );
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 31) != 0);
               } else {
                  this.rerenderEditableSelection(var1, var3);
                  this.recordEditorMutation(var3);
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 7) != 0);
               }
            } else {
               this.sendEditorError(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "Ebvks4Oog/dGu59Nf3OAcMnDee+TOimozf/LWemFU1F6A6fxuZE1+rYkfaenu6NQrzl/cHhR29tTppwx2KaKLuwmq2j5GAaXMGQ/wb3Ny1Yuls17"
                  ),
                  new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 18)]
               );
               return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 8) != 0);
            }
         }
      }
   }

   public boolean isAwaitingSidebarInput(Player var1) {
      if ((1103478637 ^ 1103478637) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748159751, 27) != 0);
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         return ((var2 == null
               || !var2.editMode
               || var2.pendingPropertyField == null
                  && var2.pendingSavePopupField == null
                  && !var2.colorPickerHexInputPending
                  && (var2.pendingItemDesignInventoryTargetId == null || var2.pendingItemDesignInventoryTargetId.isBlank())
                  && (var2.pendingTextToolTargetId == null || var2.pendingTextToolTargetId.isBlank())
                  && (var2.pendingActionTargetId == null || var2.pendingActionTargetId.isBlank() || var2.pendingActionIndex < 0)
            ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094215065, 31)
            : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537165, 0)) != 0);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean handleSidebarChatInput(Player var1, String var2) {
      if (((-718800895 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(961849337, 24) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 == null || !var3.editMode) {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100376116, 30) != 0);
         } else if (var3.colorPickerHexInputPending) {
            String var23 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2.trim();
            if (var23.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="))) {
               var3.colorPickerHexInputPending = (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100376116, 30) != 0);
               String var28 = var3.colorPickerSlot == Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 8) ? var3.editorColor1 : var3.editorColor2;
               this.updateColorPickerDisplay(var1, var3, var28);
               this.sendEditorRemoved(
                  var1,
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("zN6VL14LQYOTsoBScTbQN9X19WWoRqEgH5tp2G4jZ2EsB6OC7jZvzp7udEdUhTMT2s+vtpj1Zt3gdQTd3b83Lc8NWPgM1062lHRrcA=="),
                  new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17)]
               );
               return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(655004927, 21) != 0);
            } else {
               String var27 = this.parseSidebarHexColorInput(var23);
               if (var27.isBlank()) {
                  String var111 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "lhU9nPZQW5mCozNrTxKYg2tXYhlIiXBG6XJOmFXQu8maIuLPkBpHZ1Rl5jU2SZc0tekqRQYrCLwB1q174RMhlyDLLu/3VBntHiYSxzMUEhj+aljckOwa2UXf4ToMv8DS48Ndmq11eTw2hfGD5RUX8qTzI4xYuKKCS1E="
                  );
                  Object[] var121 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710444442, 12)];
                  var121[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "LG74YGwRRPJr+jExSpWaksKrOODuVyeCCADHA1vVhWeGF8XCqhTs9+ia"
                  );
                  var121[Xqedii_1s34vun.Xqedii_r62pla0yle6a(211764121, 20)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                  );
                  this.sendEditorError(var1, var111, var121);
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20) != 0);
               } else {
                  var3.colorPickerHexInputPending = (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-909466305, 19) != 0);
                  if (var3.colorPickerSlot == Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409063978, 7)) {
                     var3.editorColor1 = var27;
                  } else {
                     var3.editorColor2 = var27;
                  }

                  this.setShellColor(
                     var1,
                     var3,
                     var3.colorPickerSlot == Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546238, 3)
                        ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("9jhHLAIWmzdZlBqXnauSAAlMo66GSy319EusUNV0yUvVdnoytlKSpiC9SDy18YRHXi8/rGcj3Lg=")
                        : Xqedii_1s34vun.Xqedii_997tx7qg1fze("5f9pQ4LCbMM9/JtQQlguQyiUq8eCJNy2ALOw9nUH0w58idaulkG/Lk/SjmBusRE59LEX+1ivshs="),
                     var27
                  );
                  this.syncColorPickerToColor(var1, var3, var27);
                  this.notifyColorPickerColorsChanged(var1, var3);
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20) != 0);
               }
            }
         } else {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074329, 1)];
            var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 2)] = var3.pendingTextToolTargetId;
            String var4 = this.firstNonBlank(var10001);
            if (!var4.isBlank()) {
               String var26 = var3.pendingTextToolOriginalText == null
                  ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
                  : var3.pendingTextToolOriginalText;
               String var32 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2;
               if (var32.trim().equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="))) {
                  this.clearPendingTextToolEdit(var1, var3, (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20) != 0));
                  this.sendEditorRemoved(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("RZz/jAysu+3/7vozsoKYR+of18ji0WGUuuDGjKZCfcaLS14+cy1pniYPKHLrHu5LElRvUKkLd3Tb+9b30PEL0Rq39ne2pXoxeZc="),
                     new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-113683289, 16)]
                  );
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(2134166502, 29) != 0);
               } else {
                  this.clearPendingTextToolEdit(var1, var3, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11) != 0));
                  if (!this.isTextTarget(var3, var4)) {
                     this.sendEditorError(
                        var1,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "kje2LvveXR8h9KBqoS02kOHaL9VjKQ0oO0Yl5AAqZMjaLgu+wMSG2OA88dKFJsZmhDXDLKT0mWGEVpIsGnvf4VBULiLFXibXpF2LSjLby2/7dX2FtXvYqX38DRCfSw=="
                        ),
                        new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 1)]
                     );
                     return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597241766, 16) != 0);
                  } else {
                     boolean var35 = this.setTargetText(var3, var4, var32);
                     if (!var35) {
                        this.sendEditorError(
                           var1,
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                           ),
                           new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 10)]
                        );
                        this.updateEditorPropertiesSidebar(var1, var3);
                        return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 15) != 0);
                     } else {
                        this.rerenderEditableSelection(var1, var3);
                        if (this.equalsNullable(var26, var32)) {
                           this.sendEditorError(
                              var1,
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                              ),
                              new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1719872721, 23)]
                           );
                           this.updateEditorPropertiesSidebar(var1, var3);
                           return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0);
                        } else {
                           this.recordEditorMutation(var3);
                           return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(227492761, 24) != 0);
                        }
                     }
                  }
               }
            } else if (var3.pendingActionTargetId != null && !var3.pendingActionTargetId.isBlank() && var3.pendingActionIndex >= 0) {
               String var25 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2.trim();
               if (var25.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="))) {
                  var3.pendingActionTargetId = null;
                  var3.pendingActionIndex = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1089279067, 20);
                  this.sendEditorRemoved(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "tcKKrFmSvGwm0tkXG/EmLO8RCJnAFm7rJDBaluTF/S9eAItcmpcv7z1gUicHmGyBGVuEp5RvJyrY5THDP+N5zIe1dApHYK16jujk/9eZ"
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093737625, 18)]
                  );
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 5) != 0);
               } else {
                  String var31 = var3.pendingActionTargetId;
                  int var34 = var3.pendingActionIndex;
                  var3.pendingActionTargetId = null;
                  var3.pendingActionIndex = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1437336419, 31);
                  List var46 = this.resolveTargetActionsRawList(var3, var31, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 1) != 0));
                  if (var46 != null && var34 >= 0 && var34 < var46.size()) {
                     Map var54 = (Map)var46.get(var34);
                     String var62 = this.normalizeActionType(
                        this.stringValue(var54.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG")))
                     );
                     if (!this.isEditableActionType(var62)) {
                        this.sendEditorError(
                           var1,
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "wsTcCPmadT/pdbIIw3fSTvVXo9NdjCpUsu6TVwuFEal69Cn6kjQ9pt3z/fqk3jyJFdV8yjnSrCIiuujnkY2BYMQSedSHDGtgEug4uzwiJJ+r2czLVXPnCdq4urNzcJiW"
                           ),
                           new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(855221855, 24)]
                        );
                        this.updateEditorPropertiesSidebar(var1, var3);
                        return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(871999071, 24) != 0);
                     } else {
                        String var71 = var25.isBlank() ? this.resolveDefaultActionValue(var62) : var25;
                        String var78 = this.resolveActionDisplayValue(var54, var62);
                        if (var78.equals(var71)) {
                           this.sendEditorError(
                              var1,
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                              ),
                              new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594641, 4)]
                           );
                           this.updateEditorPropertiesSidebar(var1, var3);
                           return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
                        } else {
                           this.recordEditorMutation(var3);
                           var54.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("PA2iCm++vHlW5DUQV3dLGTqdRc4eXHh4IDJtU77Mq0jD7/un6HA="), var71);
                           var54.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("avmz8R9QUtIADJUWGij3Y5/sBFo3O/ELpzDg5qacSKymROAL"), var71);
                           var3.actionsSelectedIndex = var34;
                           this.updateEditorPropertiesSidebar(var1, var3);
                           return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148657, 2) != 0);
                        }
                     }
                  } else {
                     this.sendEditorError(
                        var1,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "DulvKnSTB1lIcfvKsle/WQtfiV+IsCG9HPGAudM0D12roOJavAwpR8sXekpwuMkDSIGwC3gkOCRYrJGrSLF6s4fhTWPKTvAh7t4mpoyLUHEeaw=="
                        ),
                        new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 5)]
                     );
                     this.updateEditorPropertiesSidebar(var1, var3);
                     return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(202326937, 23) != 0);
                  }
               }
            } else if (var3.pendingSavePopupField != null) {
               String var24 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2.trim();
               if (var24.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="))) {
                  var3.pendingSavePopupField = null;
                  this.refreshSavePopupFields(var1, var3);
                  this.sendEditorRemoved(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "ENtT6a5d/3QCkBx4Tc6A85ZbyHjvNiIAM7zB/a2HvGnTqdfndgKx4xBg28Rr98djL0j0Q1lBwNwCYNoc1HJyNa4F2X0CXnETdaNQNg=="
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1420294457, 0)]
                  );
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22) != 0);
               } else {
                  EditorSavePopupField var30 = var3.pendingSavePopupField;
                  var3.pendingSavePopupField = null;
                  String var33 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2.trim();
                  switch (dev.xqedii.ultimateUI.Xqedii_3pnuqh8.Xqedii_3epmsu8[var30.ordinal()]) {
                     case 1:
                        var3.savePopupName = var33;
                        break;
                     case 2:
                        var3.savePopupDescription = var33;
                        break;
                     case 3:
                        var3.savePopupCommand = var33;
                  }

                  this.refreshSavePopupFields(var1, var3);
                  double var45 = var3.cursorX + var3.hitboxOffsetX;
                  double var61 = var3.cursorY + var3.hitboxOffsetY;
                  this.updateSavePopupHover(var1, var3, var45, var61);
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093999769, 18) != 0);
               }
            } else {
               var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 6)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 27)] = var3.pendingItemDesignInventoryTargetId;
               String var5 = this.firstNonBlank(var10001);
               if (!var5.isBlank()) {
                  String var29 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2.trim();
                  if (var29.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="))) {
                     this.clearPendingItemDesignInventoryPick(var3);
                     this.sendEditorRemoved(
                        var1,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "H8l0hfxuXMHTNtaXbDfQezqju2J/O2liCpgP6U59WwxWT6Sn9bncoMU0raH/bOxjoF3zfIV7FkpqF9ZQy08ibk+w2jxvrCU5rdQ="
                        ),
                        new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-895139895, 27)]
                     );
                     return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28) != 0);
                  } else {
                     String var110 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "Q+CGJmz3tsoE+wvNWP2Hszv6bhfQCa445NHWgU3YyLiaANV9GMKYyxn9eNOcjLMr/nHrDq1fJkp7uUtOYAVo5gR4EP97sAwwLF2bJAdA85PQXIyLalQYNVD/LnuA2t2HrDEuYs6t0LWSPGrm3V9Sn/64VtD76lnSwPseiVmtje8/vrqF"
                     );
                     Object[] var120 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 11)];
                     var120[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093737625, 18)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                     );
                     this.sendEditorInfo(var1, var110, var120);
                     return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874821, 4) != 0);
                  }
               } else if (var3.pendingPropertyField == null) {
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12) != 0);
               } else {
                  String var6 = var2 == null ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var2.trim();
                  if (var6.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="))) {
                     var3.pendingPropertyField = null;
                     this.clearPendingItemDesignInventoryPick(var3);
                     this.sendEditorRemoved(
                        var1,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "b6jUKmV80K3dvZobIMVtP8jtwXapXZVefEeokQ0KuMlh+O6KukVonQXrlWce5xdJBetDB1UNtkNF5ezmPxAr9jqaY9cDWSlsJRpydg=="
                        ),
                        new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 29)]
                     );
                     return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29) != 0);
                  } else {
                     EditorPropertyField var7 = var3.pendingPropertyField;
                     if (var7 == EditorPropertyField.ITEM_DESIGN_ITEM) {
                        if (var6.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("Yu7vE/IQEiuaqeCr/We7APXczPLFchkB2/b1k4UdJL1yQnSKHpFRBsH9rZhAmQ=="))) {
                           var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 6)];
                           var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2)] = this.getSidebarEditableTargetId(var3);
                           String var44 = this.firstNonBlank(var10001);
                           if (!var44.isBlank() && this.isSidebarItemDesignTarget(var3, var44)) {
                              var3.pendingPropertyField = null;
                              var3.pendingItemDesignInventoryTargetId = var44;
                              String var109 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "Q+CGJmz3tsoE+wvNWP2Hszv6bhfQCa445NHWgU3YyLiaANV9GMKYyxn9eNOcjLMr/nHrDq1fJkp7uUtOYAVo5gR4EP97sAwwLF2bJAdA85PQXIyLalQYNVD/LnuA2t2HrDEuYs6t0LWSPGrm3V9Sn/64VtD76lnSwPseiVmtje8/vrqF"
                              );
                              Object[] var119 = new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1674947588, 23)];
                              var119[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                              );
                              this.sendEditorInfo(var1, var109, var119);
                              return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 13) != 0);
                           } else {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "kX9yFeojg4t0oIwToewR5xoEB5NXe8431Mco275qx8e103xvAghWwbA2/HanL/MorvGHn9E9Gl7cHRtlcP3HE4rr0Aj2qaavRlZ4YH9YzRMGKtFcmfI="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148661, 2)]
                              );
                              return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715289, 8) != 0);
                           }
                        } else {
                           String var43 = this.normalizeSidebarItemTokenInput(var6);
                           if (var43.isBlank()) {
                              String var108 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "21i5MW7RE82qx6PTi8H9OPgQEb6vyronFc/nUzSPBl++OaJ1NCNxpY9dOYwcoNPuMxkqB+kaQnSEyXx466ki9814rlReESEkxE/W8ro2HXR/F+9lLhGYVFeCtla/+V2M"
                              );
                              Object[] var118 = new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210723737, 13)];
                              var118[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 3)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "ERtcGLB/YDohoc2eYx28aRSfAbTWJYIHT3LK2jumKtggJlN6QuKOZ0lL70kxN5Zf0fuzG2AKI3RZF8e261dCUPGiAzY69W0eEcMDLIPi+wlPlnS5kj8I0RT+8UHLwCpgm1ioXv/7Wa5hGP0MN7il+ASMtmeeC4Mg+1NWlXsLO/xCaTiQ4vetiSwcpnid1eRcigANTAyrVgo+lNqkpSADaaGoDxjvmsUEyrt8a9LeRU4="
                              );
                              this.sendEditorError(var1, var108, var118);
                              return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 6) != 0);
                           } else {
                              var3.pendingPropertyField = null;
                              this.clearPendingItemDesignInventoryPick(var3);
                              List var53 = this.getSidebarEditableTargetIds(var3);
                              if (var53.isEmpty()) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "97Ox9/ObsJD8lfq1cifBwf7amkeAQI9/saB+J9PSKwM309JY0c1pGyuTvc/UIjO9pwTsWT6C8wY+bPC30aWrdSebCaoQTPCMTS04BQ=="
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 5)]
                                 );
                                 return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778047, 5) != 0);
                              } else {
                                 int var60 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 8);
                                 int var70 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 22);
                                 int var77 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 30);

                                 for (String var87 : (Iterable<String>) (var53)) {

                                    if (this.isSidebarItemDesignTarget(var3, var87)) {
                                       var77 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 4);
                                       boolean var91 = this.setTargetItemToken(var3, var87, var43);
                                       if (var91 && var70 == 0) {
                                          this.recordEditorMutation(var3);
                                          var70 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1743998142, 25);
                                       }

                                       var60 |= var91 ? 1 : 0;
                                    }
                                 }

                                 if (var77 == 0) {
                                    this.sendEditorError(
                                       var1,
                                       Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                          "kX9yFeojg4t0oIwToewR5xoEB5NXe8431Mco275qx8e103xvAghWwbA2/HanL/MorvGHn9E9Gl7cHRtlcP3HE4rr0Aj2qaavRlZ4YH9YzRMGKtFcmfI="
                                       ),
                                       new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2)]
                                    );
                                    this.updateEditorPropertiesSidebar(var1, var3);
                                    return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715033, 9) != 0);
                                 } else if (var60 == 0) {
                                    this.sendEditorError(
                                       var1,
                                       Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                          "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                       ),
                                       new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(2140378442, 12)]
                                    );
                                    this.updateEditorPropertiesSidebar(var1, var3);
                                    return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(871999071, 24) != 0);
                                 } else {
                                    this.rerenderEditableSelection(var1, var3);
                                    return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
                                 }
                              }
                           }
                        }
                     } else if (var7 == EditorPropertyField.ITEM_DESIGN_GLOWING) {
                        String var42 = var6.toLowerCase(Locale.ROOT);
                        int var68 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(-210715546, 3);
                        switch (var42.hashCode()) {
                           case -1609594047:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("zJbNNAznYjzPZQ2s/B9vE5UGH+TH2u7LbKRuIvvZQo2JeYP5R4CuEa9k"))) {
                                 var68 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12);
                              }
                              break;
                           case -1298848381:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("819N+eicwpwV7P3fpsZRZZDr7YDWqIqAn+Qn1gtDWd8kn8MQceTNjw=="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 1);
                              }
                              break;
                           case 48:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("JlTtn87qyg8OPbSUk3+F4G7YV6hmok1cg76Pe5Y4"))) {
                                 var68 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090322524, 9);
                              }
                              break;
                           case 49:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("T+U5He+YHMxSoa9Zt/iltuvJJIsGKR9T1qCNdqrr"))) {
                                 var68 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090458716, 15);
                              }
                              break;
                           case 3521:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("yQWTzgxLTirbkdK2tR1daOX2TcHuzDcbP0ZJ8HpbI6Y="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874012876, 13);
                              }
                              break;
                           case 3551:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("FJJMg15CcSr7oDnGstUq2mfGiC2FNWDxBFw3NVy1Y0I="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-212886939, 20);
                              }
                              break;
                           case 109935:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("B6BNWScKu7fZuAvi+Isd314rnUgdT6j2aLnzcp3wH1Be/w=="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778271, 5);
                              }
                              break;
                           case 119527:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("5eqNb6uxMaeHwFbEzQYVWg7w6L+yuOk7Xn41ZoBMgMC4VA=="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476838060, 8);
                              }
                              break;
                           case 3569038:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("SVennbCQ1LKnXNSzw5cwiwyo7pdRLSYBo1QMu400BQsdc/Hy"))) {
                                 var68 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(659199231, 21);
                              }
                              break;
                           case 97196323:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("OCtjVx82KvrykYXM+mM4kmtM4MOO8RFsjAbn99dMoafmlbLSfBo="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327772, 4);
                              }
                              break;
                           case 270940796:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("tsagCB87N702Tm0Dpy70t3A9IFbvkE8497EH9G2Ytme9pbpOVZhwXgZNGEI="))) {
                                 var68 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715521, 2);
                              }
                              break;
                           case 1671308008:
                              if (var42.equals(Xqedii_1s34vun.Xqedii_997tx7qg1fze("D9yYoJG1wlUHMlkcUodGJYJCA75Y3LXH5kB7Yi20Py5sc2WfIhAHd8nx"))) {
                                 var68 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(42943385, 25);
                              }
                        }
                        Boolean var52 = switch (var68) {
                           case 0, 1, 2, 3, 4, 5 -> Boolean.valueOf((Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 12) != 0));
                           case 6, 7, 8, 9, 10, 11 -> Boolean.valueOf((Xqedii_1s34vun.Xqedii_z5j381o3pwva(855218125, 11) != 0));
                           default -> null;
                        };
                        if (var52 == null) {
                           String var107 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "U0qR7i9IYjTT/1a2buFAePJ+i3wKUbyQtQXR26szUAP9Ohb2O9WThrpzk69FBwAxmfAOwUg4XnEmRlTMEjguaFtEBNQBELe6oPXdMhqYv3cN6syxub0GNw=="
                           );
                           Object[] var117 = new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 28)];
                           var117[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 0)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "IP5XHk3AnVQ5UDbl9A2m26/K1JpA31TVtCBsCmifqFr+db2jz//9mgl6"
                           );
                           var117[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874086604, 13)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "dkLr1u336wHP35c9h65hpk4kygf2mFqY1FKB72N7QWeo9V/nNcCcIg5up1U="
                           );
                           this.sendEditorError(var1, var107, var117);
                           return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1249874821, 4) != 0);
                        } else {
                           var3.pendingPropertyField = null;
                           this.clearPendingItemDesignInventoryPick(var3);
                           List var59 = this.getSidebarEditableTargetIds(var3);
                           if (var59.isEmpty()) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "97Ox9/ObsJD8lfq1cifBwf7amkeAQI9/saB+J9PSKwM309JY0c1pGyuTvc/UIjO9pwTsWT6C8wY+bPC30aWrdSebCaoQTPCMTS04BQ=="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1428815438, 30)]
                              );
                              return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 29) != 0);
                           } else {
                              var68 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210533, 2);
                              int var76 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4);
                              int var81 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1818932609, 20);

                              for (String var90 : (Iterable<String>) (var59)) {

                                 if (this.isSidebarItemDesignTarget(var3, var90)) {
                                    var81 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(177536807, 29);
                                    boolean var94 = this.setTargetItemGlowing(var3, var90, var52);
                                    if (var94 && var76 == 0) {
                                       this.recordEditorMutation(var3);
                                       var76 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210719641, 12);
                                    }

                                    var68 |= var94 ? 1 : 0;
                                 }
                              }

                              if (var81 == 0) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "kX9yFeojg4t0oIwToewR5xoEB5NXe8431Mco275qx8e103xvAghWwbA2/HanL/MorvGHn9E9Gl7cHRtlcP3HE4rr0Aj2qaavRlZ4YH9YzRMGKtFcmfI="
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 24)]
                                 );
                                 this.updateEditorPropertiesSidebar(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 23) != 0);
                              } else if (var68 == 0) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14210412, 13)]
                                 );
                                 this.updateEditorPropertiesSidebar(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1067083251, 28) != 0);
                              } else {
                                 this.rerenderEditableSelection(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27) != 0);
                              }
                           }
                        }
                     } else if (var7 == EditorPropertyField.DESIGN_TEXT_WRAP) {
                        var3.pendingPropertyField = null;
                        this.clearPendingItemDesignInventoryPick(var3);

                        int var41;
                        try {
                           var41 = Integer.parseInt(var6.trim());
                        } catch (NumberFormatException var22) {
                           var41 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327641, 1);
                        }

                        if (var41 <= 0) {
                           String var106 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "c+f1LdKHkxtoVdkR5OG0SrvY4mEo8VChA4xPy4tmJrBR/zckU6ynEyPKMzdwxaMVxLjBuy8YbKSvyPaMcP28Z7XVxeUuIldmHMcF+B+Pfj1Zc5jAbiZzRhrCXyy7geNSIcPB7XGaWLegUcwS4X9NcDraSVYl6gg16pe2R5qmMh8fnz2V+Sarlw=="
                           );
                           Object[] var116 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1703095505, 23)];
                           var116[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "HmESnC+McKM+Gz9tYG1L/IRYA29WlJxjFx1PUYgWoFdMKQ=="
                           );
                           var116[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106967758, 19)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                           );
                           this.sendEditorError(var1, var106, var116);
                           return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30) != 0);
                        } else {
                           boolean var51 = this.setSelectedTextElementLineWidth(var1, var41);
                           if (!var51) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-454733153, 18)]
                              );
                              this.updateEditorPropertiesSidebar(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 23) != 0);
                           } else {
                              return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227497649, 17) != 0);
                           }
                        }
                     } else if (var7 == EditorPropertyField.DESIGN_HOVER_COLOR) {
                        var3.pendingPropertyField = null;
                        this.clearPendingItemDesignInventoryPick(var3);
                        List var40 = this.getSidebarEditableTargetIds(var3);
                        if (var40.isEmpty()) {
                           this.sendEditorError(
                              var1,
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "97Ox9/ObsJD8lfq1cifBwf7amkeAQI9/saB+J9PSKwM309JY0c1pGyuTvc/UIjO9pwTsWT6C8wY+bPC30aWrdSebCaoQTPCMTS04BQ=="
                              ),
                              new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 29)]
                           );
                           return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14218604, 13) != 0);
                        } else {
                           var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27)];
                           var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100614836, 17)] = var6;
                           String var50 = this.firstNonBlank(var10001).trim();
                           String var58;
                           if (var50.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("9+S7zn9u7h1sR9Fw7sJWd6eSyU6vM3YRhWICAE3pwxFUSmkr"))) {
                              var58 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("9+S7zn9u7h1sR9Fw7sJWd6eSyU6vM3YRhWICAE3pwxFUSmkr");
                           } else if (var50.equalsIgnoreCase(Xqedii_1s34vun.Xqedii_997tx7qg1fze("mK6d+U/9aK7QsyGDkZlSoD3GaOmiQCJpXPG66lCCIVvtK8E4"))) {
                              var58 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mK6d+U/9aK7QsyGDkZlSoD3GaOmiQCJpXPG66lCCIVvtK8E4");
                           } else {
                              String var66 = this.normalizeHexColor(var50);
                              if (var66.isBlank()) {
                                 String var105 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "rjbId50AkOLHj9J99kE5uaGJqimb6yxgG6ZgXuKYXUWgrMxksKWktzlsbhtNkb5KeccYYG4/yKDWFiPYF40x1+NLKw2t2ucJkcb5VKm+WsBrBD4xShgELkZVpDr2SXPTzLmJgXJ+A0i1T7ZZHsjGu667HZtwSIF1OyVnnp4UxV3wARGK"
                                 );
                                 Object[] var115 = new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(479151001, 26)];
                                 var115[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1454378382, 1)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "LG74YGwRRPJr+jExSpWaksKrOODuVyeCCADHA1vVhWeGF8XCqhTs9+ia"
                                 );
                                 var115[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1287546867, 9)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "snOaYMLPjU7gTTV6U1HItG+CWoRpiXbBCct21SCL85ykIyPl"
                                 );
                                 var115[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1386210541, 2)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "adNPYLK+fiJhy1wzLLZvW2OKDLApINCaEa2Da6TZAQaGEChw"
                                 );
                                 var115[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327648, 1)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                                 );
                                 this.sendEditorError(var1, var105, var115);
                                 return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 2) != 0);
                              }

                              var58 = var66;
                           }

                           int var67 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217622, 5);
                           int var75 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 27);

                           for (String var85 : (Iterable<String>) (var40)) {

                              boolean var89 = this.setTargetHoverColor(var3, var85, var58);
                              if (var89 && var75 == 0) {
                                 this.recordEditorMutation(var3);
                                 var75 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28);
                              }

                              var67 |= var89 ? 1 : 0;
                           }

                           if (var67 == 0) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4)]
                              );
                              this.updateEditorPropertiesSidebar(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20) != 0);
                           } else {
                              this.rerenderEditableSelection(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(212812697, 21) != 0);
                           }
                        }
                     } else if (this.isSidebarHexField(var7)) {
                        if (var7 == EditorPropertyField.DESIGN_BORDER_COLOR && this.isSidebarAutoBorderColorInput(var6)) {
                           var3.pendingPropertyField = null;
                           boolean var39 = this.applySidebarBorderColorAuto(var3);
                           if (!var39) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9)]
                              );
                              this.updateEditorPropertiesSidebar(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074329, 1) != 0);
                           } else {
                              this.rerenderEditableSelection(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074329, 1) != 0);
                           }
                        } else {
                           String var38 = this.parseSidebarHexColorInput(var6);
                           if (var38.isBlank()) {
                              if (var7 == EditorPropertyField.DESIGN_BORDER_COLOR) {
                                 String var103 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "6ge/5lFwdTvMAmfpLmTd54G0vgG8+5JWBKhVOzAkAbfqOqB8MMtHNfzQF3lQimN44mwb6/s2QXaXdQXwoggE4GKlLOLlIEYZ37wZNrVauuvFUlNUw7FvO6rFx+1R2lUuoHlgf1faaBmai0upOIEBs6Na0ITz60u5Rz4="
                                 );
                                 Object[] var113 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327648, 1)];
                                 var113[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14210412, 13)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "LG74YGwRRPJr+jExSpWaksKrOODuVyeCCADHA1vVhWeGF8XCqhTs9+ia"
                                 );
                                 var113[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 4)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "snOaYMLPjU7gTTV6U1HItG+CWoRpiXbBCct21SCL85ykIyPl"
                                 );
                                 var113[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1088230492, 21)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                                 );
                                 this.sendEditorError(var1, var103, var113);
                              } else {
                                 String var104 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "lhU9nPZQW5mCozNrTxKYg2tXYhlIiXBG6XJOmFXQu8maIuLPkBpHZ1Rl5jU2SZc0tekqRQYrCLwB1q174RMhlyDLLu/3VBntHiYSxzMUEhj+aljckOwa2UXf4ToMv8DS48Ndmq11eTw2hfGD5RUX8qTzI4xYuKKCS1E="
                                 );
                                 Object[] var114 = new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(798653651, 15)];
                                 var114[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "LG74YGwRRPJr+jExSpWaksKrOODuVyeCCADHA1vVhWeGF8XCqhTs9+ia"
                                 );
                                 var114[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 7)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                                 );
                                 this.sendEditorError(var1, var104, var114);
                              }

                              return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-426148657, 2) != 0);
                           } else {
                              var3.pendingPropertyField = null;
                              boolean var49 = this.applySidebarHexPropertyValue(var3, var7, var38);
                              if (!var49) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 19)]
                                 );
                                 this.updateEditorPropertiesSidebar(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556094, 6) != 0);
                              } else {
                                 this.rerenderEditableSelection(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(855220173, 11) != 0);
                              }
                           }
                        }
                     } else if (var7 == EditorPropertyField.NAME) {
                        String var37 = var6.trim();
                        if (var37.isEmpty()) {
                           this.sendEditorError(
                              var1,
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "B9bmhA/VeotdGgndtFU2jlNDBdo1gYTcYfOxRYrkMSVg5TId0guhb5Z4pCsLBeJfYlUtVF+zulB4tC8vV/5JOFcBzPce+XLOZSBNDwNp"
                              ),
                              new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26)]
                           );
                           return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 3) != 0);
                        } else {
                           var3.pendingPropertyField = null;
                           List var48 = this.getSidebarEditableTargetIds(var3);
                           if (var48.isEmpty()) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "97Ox9/ObsJD8lfq1cifBwf7amkeAQI9/saB+J9PSKwM309JY0c1pGyuTvc/UIjO9pwTsWT6C8wY+bPC30aWrdSebCaoQTPCMTS04BQ=="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 18)]
                              );
                              return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210719641, 12) != 0);
                           } else {
                              int var57 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 10);
                              int var65 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(-106537166, 0);

                              for (String var79 : (Iterable<String>) (var48)) {

                                 boolean var84 = this.setTargetName(var3, var79, var37);
                                 if (var84 && var65 == 0) {
                                    this.recordEditorMutation(var3);
                                    var65 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(704531989, 6);
                                 }

                                 var57 |= var84 ? 1 : 0;
                              }

                              if (var57 == 0) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 22)]
                                 );
                                 this.updateEditorPropertiesSidebar(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1819981185, 20) != 0);
                              } else {
                                 this.rerenderEditableSelection(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100483764, 17) != 0);
                              }
                           }
                        }
                     } else if (var7 == EditorPropertyField.ID) {
                        String var36 = var6.trim();
                        if (var36.isEmpty()) {
                           this.sendEditorError(
                              var1,
                              Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                 "TshoKojfJ4pYAszeudzmoEB1HFugx7YcjlXNWARo8aal7sB52WwoabX39xTM7IjqpwQAhDgdforfRJGmFu8yGfzqLVZh2NmTnOQ="
                              ),
                              new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1923698674, 25)]
                           );
                           return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 22) != 0);
                        } else if (!var36.matches(
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze("rocNQaVheBrBz17FrUyAWOo4DDdgU7+3om5OTaKZmrP6pJK0unbTRF6AW+DekbSd3liQH+LAkiLOHg==")
                        )) {
                           String var102 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "/l9rRZaTlzgFSt2VO/oPzqYOASc0tg8JfiEcr9bGscZv9p0RJJER3rH5b+vUWk5+oFaHhvYceJ7pb6h5EuyScMPx7Jzx+EGqwI51hkWA+9VWKFtrk/uI8AGeZGmkRGfVkjnHJhPwas0FDC94TJ/YkcxcXY6agg=="
                           );
                           Object[] var112 = new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10)];
                           var112[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409064106, 7)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "QiM9nT0KusPoLgSqGUbIEqTZO86oqUEWmcYK/NdJAp4aoEBFGgo="
                           );
                           this.sendEditorError(var1, var102, var112);
                           return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 19) != 0);
                        } else {
                           List var47 = this.getSidebarEditableTargetIds(var3);
                           if (var47.size() != Xqedii_1s34vun.Xqedii_r62pla0yle6a(210716569, 10)) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "W81pSdgwh1eo3KYgDGuTYRFrwjR9BCXLP+lUkcwX4oAt9gEo3mpCFy8gPfRKvC0/D3Cm2XrnoM37wDJY+zSVce1yZqxUDcmYOCTxG5pTXDYTfGwmKCtSK/N3AFkN4M4yr5GJKn76A+GOjAHeM2+vp0ImeL2kYueijdUZlUItrMUVIIrX"
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597176230, 16)]
                              );
                              return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1067083251, 28) != 0);
                           } else {
                              String var56 = (String)var47.get(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11));
                              if (this.isReservedEditorTargetId(var3, var36, var56)) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "a1YGn2iD9Jx2iuig9iBvtxiAlziSH43cTkV7XIVb68EoywD3zBg6haxkPQugbGY+1Iux0d8I11/49Z5kp+E+qqMZ7OhrE72NtnbyB9/4Hzub05gqLE2546JA45YIMrjw"
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 28)]
                                 );
                                 return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 13) != 0);
                              } else if (this.hasConflictingContentTargetId(var3, var36, var56)) {
                                 this.sendEditorError(
                                    var1,
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                       "/3diiD2p8/UlWOtKf2kXq2EMPTUZATGni1I2W6MeqZ7EgmWniIegLfrd7U3ttWhhtjAHCwXVT10L+0DN0Oq3XHbo0eFNjbM/ROk8XqWIYazsb1KewGu2HKapSdWVHXq5"
                                    ),
                                    new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(798588115, 15)]
                                 );
                                 return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-855742057, 22) != 0);
                              } else {
                                 HoverElement var64 = this.findFirstByTargetId(var3, var56);
                                 String var95;
                                 if (var64 == null) {
                                    var95 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
                                 } else {
                                    var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 14)];
                                    var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874079876, 26)] = var64.targetPath;
                                    var95 = this.firstNonBlank(var10001);
                                 }

                                 String var73 = var95;
                                 var3.pendingPropertyField = null;
                                 boolean var13 = this.setTargetLogicalId(var3, var56, var36);
                                 if (var13) {
                                    this.recordEditorMutation(var3);
                                 }

                                 if (!var13) {
                                    this.sendEditorError(
                                       var1,
                                       Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                          "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                       ),
                                       new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25)]
                                    );
                                    this.updateEditorPropertiesSidebar(var1, var3);
                                    return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217654, 5) != 0);
                                 } else {
                                    this.rerenderEditableSelection(var1, var3);
                                    if (!var73.isBlank()) {
                                       String var83 = this.findTargetIdByPath(var3, var73);
                                       if (!var83.isBlank()) {
                                          var3.selectedElementId = var83;
                                          var3.additionalSelectedElementIds.clear();
                                          this.normalizeSelectionState(var3);
                                          this.updateEditorPropertiesSidebar(var1, var3);
                                       }
                                    }

                                    return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 27) != 0);
                                 }
                              }
                           }
                        }
                     } else {
                        Double var8 = this.parseSidebarInputValue(var6, var7);
                        int var9 = var7 == EditorPropertyField.OPACITY
                              && var3.activeTool == EditorTool.ANIMATION
                              && this.isTimelineSelectedRowMatchingField(var3, var7)
                           ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070187173, 11)
                           : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 4);
                        if (var9 != 0) {
                           String var10 = var6 == null
                              ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
                              : var6.trim()
                                 .toLowerCase(Locale.ROOT)
                                 .replace(
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze("tS/wAc165SfQtvFW8OV9GqNAQPCBuKXPn3HWLCS8"),
                                    Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
                                 );
                           String var11 = var10.endsWith(Xqedii_1s34vun.Xqedii_997tx7qg1fze("mN0HG6MeKwRlubEhdsWW0AASR0ULXi/7nh+XSf3d"))
                              ? var10.substring(
                                 Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 9), var10.length() - Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 16)
                              )
                              : var10;
                           double var12 = this.parseDouble(var11, Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1466031518346055910L, 59)));
                           var8 = Double.isFinite(var12) ? (double)this.opacityPercentToAnimationRaw(var12) : null;
                        }

                        if (var8 == null) {
                           String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "NMOQK4XeQ1846b9IKxf8rqmeoK27LlOHQ5ffi8oMPm0on2/oTqp/eXxs1+WTZEcOfuz5z2WF9PnaVsxB0h09O4qCKmf4aHaCKBql7HZ+mOGtgwW/mpQK3SRwDYcAVetLTcJAkWY2"
                           );
                           Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 29)];
                           var10003[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597176230, 16)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                           );
                           this.sendEditorError(var1, var10002, var10003);
                           return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(355073614, 30) != 0);
                        } else {
                           List var55 = this.getSidebarEditableTargetIds(var3);
                           String var10000;
                           if (var55.isEmpty()) {
                              var10000 = null;
                           } else {
                              var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10)];
                              var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 21)] = (String)var55.get(
                                 Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 17)
                              );
                              var10000 = this.firstNonBlank(var10001);
                           }

                           String var63 = var10000;
                           if (this.isSidebarPositionField(var7)) {
                              var8 = this.toSidebarRawPositionValue(var3, var63, var7, var8);
                           }

                           var3.pendingPropertyField = null;
                           double var72 = var63 == null
                              ? Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(1933392270531402415L, 36))
                              : this.resolveSidebarFieldDragStartValue(var3, var63, var7);
                           boolean var14 = this.applySidebarPropertyValue(var1, var3, var7, var8);
                           if (!var14) {
                              this.sendEditorError(
                                 var1,
                                 Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                                    "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                                 ),
                                 new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1790279789, 28)]
                              );
                              this.updateEditorPropertiesSidebar(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715529, 4) != 0);
                           } else if (var7 == EditorPropertyField.OPACITY) {
                              int var88 = var9 != 0 ? this.clampAnimationTimelineOpacityRaw(var8) : this.clampSidebarOpacityRaw(var8);
                              this.applySelectedOpacityToRenderedElements(var1, var3, var55, var88);
                              if (var3.activeTool == EditorTool.ANIMATION) {
                                 this.trySelectTimelineKeyframeForField(var3, var7);
                                 if (this.isTimelineSelectedRowMatchingField(var3, var7)) {
                                    this.syncTimelineSelectedKeyframeValueFromTarget(var3, EditorPropertyField.OPACITY, var8);
                                    if (Double.isFinite(var72)) {
                                       double var93 = var9 != 0 ? this.opacityPercentToAnimationRaw(var72) : this.opacityPercentToRaw(var72);
                                       this.applyTimelineFieldDeltaToSelectedKeyframes(var3, var7, var8 - var93);
                                    }

                                    String[] var122 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1029357623, 27)];
                                    var122[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11)] = var3.animationTimelineTargetId;
                                    this.renderAnimationTimelineKeyframes(var1, var3, this.firstNonBlank(var122));
                                 }
                              }

                              this.updateEditorPropertiesSidebar(var1, var3);
                              return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-2058715245, 28) != 0);
                           } else {
                              boolean var15 = this.isSidebarPositionField(var7);
                              if (var15 && Double.isFinite(var72)) {
                                 double var16 = var7 == EditorPropertyField.POSITION_X
                                    ? var8 - var72
                                    : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701534L, 17));
                                 double var18 = var7 == EditorPropertyField.POSITION_Y
                                    ? var8 - var72
                                    : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(8551376141222761046L, 55));
                                 if (Math.abs(var16) > Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(-6013463272150924283L, 48))
                                    || Math.abs(var18) > Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(-7956820557623957183L, 1))) {
                                    for (String var21 : (Iterable<String>) (var55)) {

                                       this.translateTargetElements(var1, var3, var21, var16, var18);
                                    }

                                    this.translateAnimationPositionChildren(var1, var3, var55, var16, var18);
                                    if (var3.selectedElementId != null && var3.selectionOutlineVisible) {
                                       this.translateSelectionOutline(var1, var3, var16, var18);
                                    }
                                 }
                              }

                              if (var3.activeTool == EditorTool.ANIMATION) {
                                 this.trySelectTimelineKeyframeForField(var3, var7);
                                 if (this.isTimelineSelectedRowMatchingField(var3, var7)) {
                                    EditorPropertyField var92 = null;
                                    Double var17 = null;
                                    if (var7 == EditorPropertyField.POSITION_X
                                       || var7 == EditorPropertyField.POSITION_Y
                                       || var7 == EditorPropertyField.WIDTH
                                       || var7 == EditorPropertyField.HEIGHT
                                       || var7 == EditorPropertyField.ROTATION) {
                                       var92 = var7;
                                       var17 = var7 == EditorPropertyField.ROTATION ? this.normalizeSidebarRotation(var8) : var8;
                                    }

                                    this.syncTimelineSelectedKeyframeValueFromTarget(var3, var92, var17);
                                    if (Double.isFinite(var72)) {
                                       this.applyTimelineFieldDeltaToSelectedKeyframes(var3, var7, var8 - var72);
                                    }

                                    String[] var10004 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1795217654, 5)];
                                    var10004[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 14)] = var3.animationTimelineTargetId;
                                    this.renderAnimationTimelineKeyframes(var1, var3, this.firstNonBlank(var10004));
                                 }
                              }

                              if (var15) {
                                 if (var3.activeTool == EditorTool.ANIMATION && Double.isFinite(var72)) {
                                    this.renderAnimationPreviewMotionPath(var1, var3);
                                 }

                                 if (Double.isFinite(var72)) {
                                    this.updateEditorPropertiesSidebar(var1, var3);
                                 } else {
                                    this.rerenderEditableSelection(var1, var3);
                                 }

                                 return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(-1936768103, 31) != 0);
                              } else if (var7 == EditorPropertyField.LAYER) {
                                 this.rerenderEditableContent(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 7) != 0);
                              } else {
                                 this.rerenderEditableSelection(var1, var3);
                                 return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-514678812, 26) != 0);
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
   public boolean clickHoveredElement(Player var1, GuiService.ClickType var2) {
      if (((230438978 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 19) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var2 == GuiService.ClickType.LEFT && var3 != null && var3.editMode && this.swallowEditorPromptClick(var1, var3)) {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597241766, 16) != 0);
         } else if (this.isEditorImageFilePopupVisible(var3)) {
            if (var2 == GuiService.ClickType.LEFT) {
               long var4 = Xqedii_38o2zes.Xqedii_316oplq();
               int var6 = var4 - var3.lastLeftClickTick <= Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007137501641212638L, 41)
                  ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227497649, 17)
                  : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 8);
               var3.lastLeftClickTick = var4;
               if (var6 == 0) {
                  double var7 = var3.cursorX + var3.hitboxOffsetX;
                  double var9 = var3.cursorY + var3.hitboxOffsetY;
                  this.handleEditorMenuFilePopupClick(var1, var3, var7, var9);
               }

               return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715537, 3) != 0);
            } else {
               return ((var2 == GuiService.ClickType.RIGHT
                  ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 14)
                  : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 5)) != 0);
            }
         } else {
            return super.clickHoveredElement(var1, var2);
         }
      }
   }

   @Override
   public boolean isAnyEditorPopupVisible(EditorSession var1) {
      if (((2099662936 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((!super.isAnyEditorPopupVisible(var1) && !this.isEditorImageFilePopupVisible(var1)
            ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 12)
            : Xqedii_1s34vun.Xqedii_r62pla0yle6a(210191257, 19)) != 0);
      }
   }

   public boolean handleItemDesignInventoryClick(Player var1, ItemStack var2, ItemStack var3, ItemStack var4) {
      if (((1544440501 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 13) != 0);
      } else {
         EditorSession var5 = this.editorSessions.get(var1.getUniqueId());
         if (var5 != null && var5.editMode) {
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 27)];
            var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213074331, 1)] = var5.pendingItemDesignInventoryTargetId;
            String var6 = this.firstNonBlank(var10001);
            if (var6.isBlank() && var5.pendingPropertyField == EditorPropertyField.ITEM_DESIGN_ITEM) {
               var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 14)];
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 8)] = this.getSidebarEditableTargetId(var5);
               String var7 = this.firstNonBlank(var10001);
               if (var7.isBlank() || !this.isSidebarItemDesignTarget(var5, var7)) {
                  return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 25) != 0);
               }

               var5.pendingPropertyField = null;
               var5.pendingItemDesignInventoryTargetId = var7;
               var6 = var7;
            }

            if (var6.isBlank()) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12) != 0);
            } else {
               ItemStack[] var19 = new ItemStack[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-550188058, 29)];
               var19[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-859936361, 22)] = var2;
               var19[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(355073614, 30)] = var3;
               var19[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1157436508, 26)] = var4;
               var19[Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778111, 5)] = var1.getItemOnCursor();
               ItemStack var17 = this.resolveInventoryPickSource(var19);
               if (var17 == null || var17.getType() == Material.AIR) {
                  String var10002 = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "Q+CGJmz3tsoE+wvNWP2Hszv6bhfQCa445NHWgU3YyLiaANV9GMKYyxn9eNOcjLMr/nHrDq1fJkp7uUtOYAVo5gR4EP97sAwwLF2bJAdA85PQXIyLalQYNVD/LnuA2t2HrDEuYs6t0LWSPGrm3V9Sn/64VtD76lnSwPseiVmtje8/vrqF"
                  );
                  Object[] var10003 = new Object[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612390062, 10)];
                  var10003[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 25)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "ZvpGW9MN5eG8StoL/dN7lc41H2wSF/sd6TcYhJL/8Od+hK1ow1ZWIg=="
                  );
                  this.sendEditorInfo(var1, var10002, var10003);
                  return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100483764, 17) != 0);
               } else if (!this.isSidebarItemDesignTarget(var5, var6)) {
                  this.clearPendingItemDesignInventoryPick(var5);
                  this.sendEditorError(
                     var1,
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "aFNANjezEvXir2ea+Z+wJLkHdT6Vh6bc/7MmhtSgyiE/5RSLu8WWQjcxgHdoA8juW5Hzp9CUjf4Hybqlo8Cj91SiIDhDX1xfeMZ+ySU+BYEwvjYJ6bHkEpq+VtPXRwBt"
                     ),
                     new Object[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 24)]
                  );
                  this.updateEditorPropertiesSidebar(var1, var5);
                  return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14218604, 13) != 0);
               } else {
                  Material var8 = var17.getType();
                  ItemMeta var9 = var17.getItemMeta();
                  Integer var10 = null;
                  if (var9 != null && var9.hasCustomModelData()) {
                     var10 = var9.getCustomModelData();
                  }

                  Map var11 = this.serializeItemSelectionEnchantments(var17);
                  String var12 = this.buildSidebarItemToken(var8, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="), var10);
                  this.clearPendingItemDesignInventoryPick(var5);
                  Xqedii_38o2zes.Xqedii_2sj63w1(this.plugin, var1, () -> {
                     if ((1024130923 * 1024130923 - 1024130923 & 1) != 0) {
                        throw new IllegalStateException();
                     } else if (var1.isOnline()) {
                        var1.setItemOnCursor(new ItemStack(Material.AIR));
                        var1.closeInventory();
                     }
                  }, Xqedii_1s34vun.Xqedii_1qj3lixhkz252(-1177730773450166503L, 31));
                  boolean var13 = this.setTargetItemToken(var5, var6, var12);
                  boolean var14 = this.setTargetItemEnchantments(var5, var6, var11);
                  boolean var15 = this.setTargetItemData(var5, var6, this.serializeItemStackData(var17));
                  int var16 = !var13 && !var14 && !var15
                     ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 14)
                     : Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 2);
                  if (var16 == 0) {
                     this.sendEditorError(
                        var1,
                        Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                           "lUVCzbHM3ElzqLgREf1SjOYbabl/ONiWilbOn0ZYg6WIY9EpnPlz3QhxZuntZbSm7oJ2ejt5wwUvCgp+gcNTsoItK9NoYMT/WK9kDf1P6dbOT+cgCjItLQ=="
                        ),
                        new Object[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874094796, 13)]
                     );
                     this.updateEditorPropertiesSidebar(var1, var5);
                     return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 1) != 0);
                  } else {
                     this.recordEditorMutation(var5);
                     this.rerenderEditableSelection(var1, var5);
                     return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 24) != 0);
                  }
               }
            }
         } else {
            return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1771556030, 6) != 0);
         }
      }
   }

   @Override
   public ItemStack resolveInventoryPickSource(ItemStack... var1) {
      if ((1811146762 * 1811146762 + 1811146762 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.length != 0) {
         ItemStack[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710443710, 25); var4 < var3; var4++) {
            ItemStack var5 = var2[var4];
            if (var5 != null && var5.getType() != Material.AIR) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public Map<String, Integer> serializeItemSelectionEnchantments(ItemStack var1) {
      if ((2096119728 ^ 2096119728) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.getType() != Material.AIR) {
         Map var2 = var1.getEnchantments();
         if (var2 != null && !var2.isEmpty()) {
            LinkedHashMap<String, Integer> var3 = new LinkedHashMap<>();

            for (Entry var5 : (Iterable<Entry>) (var2.entrySet())) {

               Enchantment var6 = (Enchantment)var5.getKey();
               if (var6 != null) {
                  Integer var7 = (Integer)var5.getValue();
                  if (var7 != null && var7 > 0) {
                     String var8 = var6.getKey() == null
                        ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==")
                        : var6.getKey().toString();
                     String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1777552574, 25)];
                     var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 11)] = var8;
                     var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715609, 6)] = var6.getName();
                     var8 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                     if (!var8.isBlank()) {
                        var3.put(var8, var7);
                     }
                  }
               }
            }

            return (Map<String, Integer>)(var3.isEmpty() ? Collections.emptyMap() : var3);
         } else {
            return Collections.emptyMap();
         }
      } else {
         return Collections.emptyMap();
      }
   }

   public String buildUiImagesFontText(String var1) {
      if ((1422838230 ^ 1422838230) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503710215, 8)];
         var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 19)] = var1;
         String var2 = this.firstNonBlank(var10001)
            .replace(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("MkhpYsbcAbjbPLt2gbWJSubFCvxIE4obuHbTG8urStQ="),
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("xcXX6tLbfqEiazNQFk/2I5Ea93YA6ptgr6E5jkLc")
            )
            .replace((char)Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090393180, 14), (char)Xqedii_1s34vun.Xqedii_z5j381o3pwva(-102249166, 19));
         if (var2.isBlank()) {
            return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
         } else {
            String[] var3 = var2.split(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("xcXX6tLbfqEiazNQFk/2I5Ea93YA6ptgr6E5jkLc"), Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327641, 1)
            );
            StringBuilder var4 = new StringBuilder(var2.length() + var3.length * Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1074599004, 20));

            for (int var5 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 21); var5 < var3.length; var5++) {
               if (var5 > 0) {
                  var4.append((char)Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1437336423, 31));
               }

               var4.append(Xqedii_1s34vun.Xqedii_997tx7qg1fze("9C5tu9CylgCW0U5nwUh9l9eRLQk0HuJFNzTku0kh7DS/eO/iVZbmSXZ1N0wkoNJZe/ACZH9M2ccSFA=="))
                  .append(var3[var5]);
            }

            return var4.toString();
         }
      }
   }

   @Override
   public double resolveSessionPageWidth(EditorSession var1) {
      if (((746517075 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(2089736378246200674L, 8));
      } else if (var1.previewViewport != null) {
         return var1.previewViewport.pageWidth;
      } else {
         return var1.yaml != null
            ? Math.max(
               Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(1501238914106529344L, 15)),
               var1.yaml
                  .getDouble(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("u3pyN3sM2O/wuoLp4YC+4TPtGZKszzc6pXn622AA0DPk3V1bQgQGRqvPHOGv9rl/iePCkw=="),
                     Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(5758173069462671590L, 63))
                  )
            )
            : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133102529741534L, 32));
      }
   }

   @Override
   public double resolveSessionPageHeight(EditorSession var1) {
      if ((-250819767 ^ -250819767) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-5497656021844055406L, 50));
      } else if (var1.previewViewport != null) {
         return var1.previewViewport.pageHeight;
      } else {
         return var1.yaml != null
            ? Math.max(
               Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1qj3lixhkz252(601832971100164326L, 61)),
               var1.yaml
                  .getDouble(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze("rwWL/tEsLTyy2an7aN+RMu5uhEJpgwv1OaReM9pPJDBg9ImE3sZf1dHo1DGZ8vK69gw4L1FE"),
                     Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-4869707140617977238L, 30))
                  )
            )
            : Double.longBitsToDouble(Xqedii_1s34vun.Xqedii_1rms5y9kwi951(7666535491290617741L, 43));
      }
   }

   public EditorSession resolveStackableRuntimeHudSession(Player var1, boolean var2, boolean var3) {
      if (((-993443235 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var2 && var3) {
         EditorSession var4 = this.editorSessions.get(var1.getUniqueId());
         return var4 != null && !var4.editMode && var4.hudTextOnlyMode ? var4 : null;
      } else {
         return null;
      }
   }

   public void stackRuntimeHudSession(EditorSession var1, List<Map<String, Object>> var2, List<Map<String, Object>> var3, String var4) {
      if ((1857208843 * 1857208843 - 1857208843 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String var5 = this.normalizePageKey(var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         this.invalidateOpenAnimationToken(var1, var5);
         ArrayList var6 = new ArrayList();
         ArrayList var7 = new ArrayList();
         List var8 = this.copyBlocks(var1.rawBlocks);

         for (int var9 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1420294457, 0); var9 < var8.size(); var9++) {
            Map var10 = (Map)var8.get(var9);
            if (this.isRuntimeHudStackPageMatch(var10, var5)) {
               var7.add(var9);
            } else {
               var6.add(var10);
            }
         }

         int var15 = var6.size();
         List var16 = this.copyBlocks(var2);
         this.markRuntimeHudStackPage(var16, var5);
         var6.addAll(var16);
         var1.rawBlocks = var6;
         ArrayList var11 = new ArrayList();

         for (Map var13 : this.copyBlocks(var1.renderBlocks)) {
            if (!this.isRuntimeHudStackPageMatch(var13, var5) && !this.isRenderBlockFromRawIndices(var13, var7)) {
               var11.add(var13);
            }
         }

         this.reindexRuntimeHudStackAfterRawRemoval(var1, var11, var7);
         List var17 = this.copyBlocks(var3);
         this.markRuntimeHudStackPage(var17, var5);
         if (var15 > 0) {
            for (Map var14 : (Iterable<Map>) (var17)) {

               this.Xqedii_3s1x1ga(var14, var15);
            }
         }

         var11.addAll(var17);
         var1.renderBlocks = var11;
         var1.runtimeAutoCloseAfterAnimations = (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 2) != 0);
      }
   }

   public boolean isRenderBlockFromRawIndices(Map<String, Object> var1, List<Integer> var2) {
      if ((-705870209 ^ -705870209) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         int var3 = this.Xqedii_218f7xn(
            this.stringValue(
               var1.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("QJ5L3GULoypIo/IsRzjoA0uRO2yjzfKO4MT30Oeutw/RygII2gI5eUGOFFUb7kNLFupkSbiCqKOduRQ/fC9/J1GJ"))
            )
         );
         if (var3 < 0) {
            var3 = this.Xqedii_218f7xn(
               this.stringValue(
                  var1.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4="))
               )
            );
         }

         return ((var3 >= 0 && var2.contains(var3)
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 16)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1666558980, 23) != 0);
      }
   }

   public void reindexRuntimeHudStackAfterRawRemoval(EditorSession var1, List<Map<String, Object>> var2, List<Integer> var3) {
      if (((-1359750763 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var3 != null && !var3.isEmpty()) {
         String[] var10000 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-672753284, 26)];
         var10000[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 3)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ=="
         );
         var10000[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 30)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4="
         );
         var10000[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1420294459, 0)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
            "QJ5L3GULoypIo/IsRzjoA0uRO2yjzfKO4MT30Oeutw/RygII2gI5eUGOFFUb7kNLFupkSbiCqKOduRQ/fC9/J1GJ"
         );
         String[] var4 = var10000;
         if (var2 != null) {
            for (Map var6 : var2) {
               if (var6 != null) {
                  String[] var7 = var4;
                  int var8 = var4.length;

                  for (int var9 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-227366577, 17); var9 < var8; var9++) {
                     String var10 = var7[var9];
                     if (var6.get(var10) instanceof String var12) {
                        var6.put(var10, this.Xqedii_1q6ljcz(var12, var3));
                     }
                  }
               }
            }
         }

         if (var1 != null && var1.elements != null) {
            for (HoverElement var14 : var1.elements) {
               if (var14 != null) {
                  var14.targetId = this.Xqedii_1q6ljcz(var14.targetId, var3);
                  var14.targetPath = this.Xqedii_1q6ljcz(var14.targetPath, var3);
               }
            }
         }
      }
   }

   public String Xqedii_1q6ljcz(String var1, List<Integer> var2) {
      if ((940136254 * 940136254 - 940136254 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = this.Xqedii_218f7xn(var1);
         if (var3 < 0) {
            return var1;
         } else {
            int var4 = Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 24);

            for (int var6 : var2) {
               if (var6 < var3) {
                  var4++;
               }
            }

            return var4 == 0 ? var1 : this.Xqedii_2ycjc31(var1, -var4);
         }
      }
   }

   public int Xqedii_218f7xn(String var1) {
      if ((1343673021 * 1343673021 - 1343673021 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         int var2 = var1.indexOf(Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-28977879, 14));
         String var3 = var2 < 0 ? var1 : var1.substring(Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409064106, 7), var2);

         try {
            return Integer.parseInt(var3);
         } catch (NumberFormatException var5) {
            return Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594657, 4);
         }
      } else {
         return Xqedii_1s34vun.Xqedii_z5j381o3pwva(-216032667, 20);
      }
   }

   public void Xqedii_3s1x1ga(Map<String, Object> var1, int var2) {
      if ((1824711476 * (1824711476 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 > 0) {
         Object var3 = var1.get(
            Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4=")
         );
         if (var3 instanceof String) {
            String var4 = this.Xqedii_2ycjc31((String)var3, var2);
            if (var4 != null) {
               var1.put(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("cQbeTyYQ/3WHDF9r/SUflcg+bADYIx9tXonDuSjh6RjjClH9GbxOHSKjHVCK5aNxqtOhZJZQPSs/NpR1lNASv/5Cxu4="), var4
               );
            }

            Object var5 = var1.get(
               Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ==")
            );
            if (var5 instanceof String && var5.equals(var3) && var4 != null) {
               var1.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("h60/gE0Iqzv78oKU992MjQ6DsATDQt3wRYkPRz7bXRUbZKebLwSVTOM0WTo35m6bJzdnWqK8EU+8tlbS1ew7sQ=="), var4);
            }
         }

         Object var6 = var1.get(Xqedii_1s34vun.Xqedii_997tx7qg1fze("QJ5L3GULoypIo/IsRzjoA0uRO2yjzfKO4MT30Oeutw/RygII2gI5eUGOFFUb7kNLFupkSbiCqKOduRQ/fC9/J1GJ"));
         if (var6 instanceof String) {
            String var7 = this.Xqedii_2ycjc31((String)var6, var2);
            if (var7 != null) {
               var1.put(Xqedii_1s34vun.Xqedii_997tx7qg1fze("QJ5L3GULoypIo/IsRzjoA0uRO2yjzfKO4MT30Oeutw/RygII2gI5eUGOFFUb7kNLFupkSbiCqKOduRQ/fC9/J1GJ"), var7);
            }
         }
      }
   }

   public String Xqedii_2ycjc31(String var1, int var2) {
      if ((1714933356 * 1714933356 + 1714933356 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var2 != 0) {
         int var3 = var1.indexOf(Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327036, 5));
         String var4 = var3 < 0 ? var1 : var1.substring(Xqedii_1s34vun.Xqedii_z5j381o3pwva(-214984091, 20), var3);
         String var5 = var3 < 0 ? Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==") : var1.substring(var3);

         try {
            int var6 = Integer.parseInt(var4);
            return Xqedii_26not3x7wrh(var6 + var2, var5);
         } catch (NumberFormatException var7) {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public void markRuntimeHudStackPage(List<Map<String, Object>> var1, String var2) {
      if ((-704125528 * -704125528 + -704125528 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String var3 = this.normalizePageKey(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         if (!var3.isBlank()) {
            for (Map var5 : var1) {
               if (var5 != null && !var5.isEmpty()) {
                  var5.put(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "PHwzEshGE0kmWVma4bS+XgcMal8z5QDupHIJrZ2DTLIcFS9dCfGlPTmFl6rQoaFTJWVGotlV9S/BTwoPNziHvHMuEEPxFQo1fzX5J7UrXCpCFx1y"
                     ),
                     var3
                  );
               }
            }
         }
      }
   }

   @Override
   public boolean isRuntimeHudStackPageMatch(Map<String, Object> var1, String var2) {
      if ((-1736077943 * -1736077943 - -1736077943 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String var3 = this.normalizePageKey(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
         if (var3.isBlank()) {
            return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1314204158, 22) != 0);
         } else {
            String var4 = this.stringValue(
               var1.get(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "PHwzEshGE0kmWVma4bS+XgcMal8z5QDupHIJrZ2DTLIcFS9dCfGlPTmFl6rQoaFTJWVGotlV9S/BTwoPNziHvHMuEEPxFQo1fzX5J7UrXCpCFx1y"
                  )
               )
            );
            String var5 = this.normalizePageKey(var4, Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="));
            return !var5.isBlank() && var5.equalsIgnoreCase(var3);
         }
      } else {
         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 22) != 0);
      }
   }

   public List<Map<String, Object>> filterHudTextRenderableBlocks(List<Map<String, Object>> var1) {
      if ((-1980074072 * -1980074072 + -1980074072 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (Map var4 : var1) {
            ConfigurationSection var5 = this.mapToSection(var4);
            if (var5 != null) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715544, 31)];
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 14)] = var5.getString(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG")
               );
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 28)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
               );
               String var6 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
               if (Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T").equals(var6)) {
                  var2.add(this.deepCopyMap(var4));
               }
            }
         }

         return var2;
      } else {
         return Collections.emptyList();
      }
   }

   public void scheduleHudTextPlaceholderRefresh(Player var1, EditorSession var2) {
      if (((1860750726 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && (!var2.editMode || this.isPlaceholderResolutionEnabled())) {
         if (this.hasRuntimeTextPlaceholderBindings(var2.renderBlocks)) {
            long var3 = this.resolveHudTextRefreshTicks(var1);
            if (var3 <= Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-1629517282406378094L, 12)) {
               this.cancelHudTextPlaceholderRefresh(var2);
            } else if (var2.hudTextPlaceholderRefreshTask == null || var2.hudTextPlaceholderRefreshTicks != var3) {
               this.cancelHudTextPlaceholderRefresh(var2);
               var2.hudTextPlaceholderRefreshTicks = var3;
               var2.hudTextPlaceholderRefreshTask = Xqedii_38o2zes.Xqedii_j3mggbv(this.plugin, var1, var3, var3, var3x -> {
                  if (((-1226736975 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else if (!var1.isOnline()) {
                     var3x.cancel();
                  } else {
                     EditorSession var4 = this.editorSessions.get(var1.getUniqueId());
                     if (var4 != null && var4 == var2 && (!var4.editMode || this.isPlaceholderResolutionEnabled())) {
                        if (this.resolveHudTextRefreshTicks(var1) != var2.hudTextPlaceholderRefreshTicks) {
                           var3x.cancel();
                           this.Xqedii_3ltdwko(var2, var3x);
                           this.scheduleHudTextPlaceholderRefresh(var1, var4);
                        } else {
                           this.refreshHudTextPlaceholderContent(var1, var4);
                        }
                     } else {
                        var3x.cancel();
                        this.Xqedii_3ltdwko(var2, var3x);
                     }
                  }
               });
            }
         }
      }
   }

   public void cancelHudTextPlaceholderRefresh(EditorSession var1) {
      if (((-283756173 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         PlatformCompat.CancellableTask var2 = var1.hudTextPlaceholderRefreshTask;
         var1.hudTextPlaceholderRefreshTask = null;
         var1.hudTextPlaceholderRefreshTicks = Xqedii_1s34vun.Xqedii_1rms5y9kwi951(8707329794079462613L, 31);
         if (var2 != null) {
            var2.cancel();
         }
      }
   }

   public void Xqedii_3ltdwko(EditorSession var1, PlatformCompat.CancellableTask var2) {
      if ((-474129205 * -474129205 + -474129205 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.hudTextPlaceholderRefreshTask == var2) {
         var1.hudTextPlaceholderRefreshTask = null;
         var1.hudTextPlaceholderRefreshTicks = Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701534L, 46);
      }
   }

   public boolean hasRuntimeTextPlaceholderBindings(List<Map<String, Object>> var1) {
      if ((1681143009 ^ 1681143009) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var3 : var1) {
            if (var3 != null && !var3.isEmpty()) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(76497817, 26)];
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1100614836, 17)] = this.stringValue(
                  this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG"))
               );
               var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 6)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
               );
               String var4 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
               if (Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T").equals(var4)
                  && this.containsTextPlaceholderValue(
                     this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T"))
                  )) {
                  return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 27) != 0);
               }
            }
         }

         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(798588115, 15) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-14210412, 13) != 0);
      }
   }

   public boolean containsTextPlaceholderValue(Object var1) {
      if (((1622266449 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof String var2) {
         return ((var2.indexOf(Xqedii_1s34vun.Xqedii_z5j381o3pwva(1599601062, 16)) >= 0
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 14)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-56841645, 15)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1070189221, 11) != 0);
      }
   }

   public void scheduleInventorySlotItemRefresh(Player var1, EditorSession var2) {
      if (((-24240546 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && this.hasInventorySlotItemBindings(var2.renderBlocks)) {
         long var3 = Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(7301783496283485361L, 27);
         Xqedii_38o2zes.Xqedii_j3mggbv(this.plugin, var1, var3, var3, var3x -> {
            if (((-2082704286 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else if (!var1.isOnline()) {
               var3x.cancel();
            } else {
               EditorSession var4 = this.editorSessions.get(var1.getUniqueId());
               if (var4 != null && var4 == var2) {
                  this.refreshInventorySlotItems(var1, var4);
               } else {
                  var3x.cancel();
               }
            }
         });
      }
   }

   public boolean hasInventorySlotItemBindings(List<Map<String, Object>> var1) {
      if ((-952816783 ^ -952816783) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var3 : var1) {
            if (var3 != null
               && (
                  this.resolveInventorySlotIndex(this.readBlockItemToken(var3)) >= 0
                     || this.containsInventorySlotPlaceholder(
                        this.stringValue(this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T")))
                     )
               )) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1503710215, 8) != 0);
            }
         }

         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 26) != 0);
      }
   }

   public void refreshInventorySlotText(Player var1, EditorSession var2, Map<String, Object> var3, String var4) {
      if ((1930750395 * 1930750395 - 1930750395 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var5 = this.stringValue(this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T")));
         if (this.containsInventorySlotPlaceholder(var5)) {
            Entity var6 = this.hudService.getHud(var1, var4);
            if (var6 != null) {
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1522546214, 3)];
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(1710436250, 12)] = this.stringValue(
                  this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("HyRpV2KDooVtmbk273ZdNsMDVqMPIyNttC2IAdfZsUqIcVkkuB0="))
               );
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(2093999769, 18)] = this.stringValue(
                  this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("rNM+gedlgj3DofL0O0l+ty5RNbV8VOHkCgHybs90l6cNo6wW6/vZQC6ArfnhhD7uAFg="))
               );
               String var7 = this.firstNonBlank(var10001);
               String var8 = this.applyPreferredFontFromBlockMap(
                  this.applyPlaceholderApiIgnoringMode(var1, this.withHexPrefix(var5, var7)),
                  var3,
                  (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 31) != 0),
                  this.isEditorContextSession(var2)
               );

               for (HoverElement var10 : var2.elements) {
                  if (var10 != null && var4.equals(var10.id) && var8.equals(var10.text)) {
                     return;
                  }
               }

               this.hudService.setHudText(var6, var8, null, (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 29) != 0));
               this.syncRuntimeElementText(var2, var4, var8);
            }
         }
      }
   }

   public String readBlockItemToken(Map<String, Object> var1) {
      if ((678782665 * 678782665 + 678782665 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var2 = Xqedii_2mql9fq.Xqedii_32a19lc;
         int var3 = var2.length;

         for (int var4 = Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1476839084, 8); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (this.readMapPathValue(var1, var5) instanceof String var7 && !var7.isBlank()) {
               return var7;
            }
         }

         return Xqedii_1s34vun.Xqedii_997tx7qg1fze("mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg==");
      }
   }

   public void refreshInventorySlotItems(Player var1, EditorSession var2) {
      if ((-873965259 * -873965259 - -873965259 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2.renderBlocks != null && !var2.renderBlocks.isEmpty()) {
         HashMap var3 = new HashMap();
         int var4 = Xqedii_1s34vun.Xqedii_z5j381o3pwva(2094215065, 31);

         for (Map var6 : var2.renderBlocks) {
            var4++;
            String[] var10001 = new String[Xqedii_1s34vun.Xqedii_r62pla0yle6a(747586457, 28)];
            var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(714407719, 29)] = this.stringValue(
               this.readMapPathValue(var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG"))
            );
            var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 1)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
               "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
            );
            String var7 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            if (this.isRenderableBlockType(var7)) {
               String var8 = this.resolveElementId(var6, var4, var3);
               if (Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T").equals(var7)) {
                  this.refreshInventorySlotText(var1, var2, var6, this.runtimeElementId(var2, var8));
               } else {
                  ItemStack var9 = this.resolveInventorySlotStack(var1, this.readBlockItemToken(var6));
                  if (var9 != null) {
                     Entity var10 = this.hudService.getHud(var1, this.runtimeElementId(var2, var8));
                     if (var10 instanceof ItemDisplay var11) {
                        ItemStack var12 = var11.getItemStack();
                        if (!this.isSameDisplayedItem(var12, var9)) {
                           var11.setItemStack(var9);
                           if (var10.hasMetadata(Xqedii_1s34vun.Xqedii_997tx7qg1fze("enCXvePqONCEL684JDYiKjOwpH0LRvFXxCFkBiugZpp5P48xhOpPTEunXv8="))
                              && ((MetadataValue)var10.getMetadata(
                                       Xqedii_1s34vun.Xqedii_997tx7qg1fze("enCXvePqONCEL684JDYiKjOwpH0LRvFXxCFkBiugZpp5P48xhOpPTEunXv8=")
                                    )
                                    .get(Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341289129, 9)))
                                 .value() instanceof Vector var13) {
                              this.hudService
                                 .moveHud(var10, var13, Xqedii_1s34vun.Xqedii_z5j381o3pwva(-107492046, 19), Xqedii_1s34vun.Xqedii_z5j381o3pwva(1597295590, 29));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean isSameDisplayedItem(ItemStack var1, ItemStack var2) {
      if (((1722238928 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var3 = var1 != null && !var1.getType().isAir()
            ? Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1409064106, 7)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(710147228, 31);
         int var4 = var2 != null && !var2.getType().isAir()
            ? Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 3)
            : Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(1341288617, 9);
         if (var3 == 0 && var4 == 0) {
            return var1.isSimilar(var2);
         } else {
            return ((var3 == var4 ? Xqedii_1s34vun.Xqedii_z5j381o3pwva(-427871029, 21) : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1748189591, 14)) != 0);
         }
      }
   }

   public void scheduleNumericPlaceholderRefresh(Player var1, EditorSession var2) {
      if (((-810306445 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.hudTextOnlyMode && (!var2.editMode || this.isPlaceholderResolutionEnabled())) {
         if (this.hasNumericPlaceholderBindings(var2.renderBlocks)) {
            long var3 = this.resolveNumericPlaceholderRefreshTicks(var1);
            if (var3 <= Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-6128927073245556695L, 24)) {
               this.cancelNumericPlaceholderRefresh(var2);
            } else if (var2.numericPlaceholderRefreshTask == null || var2.numericPlaceholderRefreshTicks != var3) {
               this.cancelNumericPlaceholderRefresh(var2);
               var2.numericPlaceholderRefreshTicks = var3;
               var2.numericPlaceholderRefreshTask = Xqedii_38o2zes.Xqedii_j3mggbv(this.plugin, var1, var3, var3, var3x -> {
                  if (((-570575594 << 1 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else if (!var1.isOnline()) {
                     var3x.cancel();
                  } else {
                     EditorSession var4 = this.editorSessions.get(var1.getUniqueId());
                     if (var4 != null && var4 == var2 && !var4.hudTextOnlyMode && (!var4.editMode || this.isPlaceholderResolutionEnabled())) {
                        if (this.resolveNumericPlaceholderRefreshTicks(var1) != var2.numericPlaceholderRefreshTicks) {
                           var3x.cancel();
                           this.Xqedii_3ub8rc5(var2, var3x);
                           this.scheduleNumericPlaceholderRefresh(var1, var4);
                        } else {
                           this.refreshNumericPlaceholderContent(var1, var4);
                        }
                     } else {
                        var3x.cancel();
                        this.Xqedii_3ub8rc5(var2, var3x);
                     }
                  }
               });
            }
         }
      }
   }

   public void cancelNumericPlaceholderRefresh(EditorSession var1) {
      if ((596229494 * 596229494 + 596229494 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         PlatformCompat.CancellableTask var2 = var1.numericPlaceholderRefreshTask;
         var1.numericPlaceholderRefreshTask = null;
         var1.numericPlaceholderRefreshTicks = Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-8256675884405011113L, 35);
         if (var2 != null) {
            var2.cancel();
         }
      }
   }

   public void Xqedii_3ub8rc5(EditorSession var1, PlatformCompat.CancellableTask var2) {
      if ((-1794226063 * (-1794226063 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.numericPlaceholderRefreshTask == var2) {
         var1.numericPlaceholderRefreshTask = null;
         var1.numericPlaceholderRefreshTicks = Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773450166502L, 7);
      }
   }

   public long resolveNumericPlaceholderRefreshTicks(Player var1) {
      if ((2127014720 * 2127014720 - 2127014720 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         long var2 = this.resolveBossbarPlaceholderRefreshTicks(var1);
         return var2 > Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773450166502L, 55) ? var2 : this.resolveNumericPlaceholderRefreshTicks();
      }
   }

   public long resolveNumericPlaceholderRefreshTicks() {
      if ((1513800775 ^ 1513800775) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin == null) {
         return Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133082119865054L, 30);
      } else {
         return this.plugin
               .getConfig()
               .contains(
                  Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                     "a8Fgt6tczkwtTqUvP70l197aewiexHtRuivxVOBWHWkDJjhcGnm4fKmVtdCC1VhzdlAnBaVhyBzN4GDd+JJ/1EU9+EzHiDoljixsNa+AawSCx/e1tJlWS/Ksb6xAIgm6NKc="
                  )
               )
            ? Math.max(
               Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-3930321526009272470L, 3),
               this.plugin
                  .getConfig()
                  .getLong(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "a8Fgt6tczkwtTqUvP70l197aewiexHtRuivxVOBWHWkDJjhcGnm4fKmVtdCC1VhzdlAnBaVhyBzN4GDd+JJ/1EU9+EzHiDoljixsNa+AawSCx/e1tJlWS/Ksb6xAIgm6NKc="
                     ),
                     Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-7625532444791711442L, 16)
                  )
            )
            : this.resolveHudTextRefreshTicks();
      }
   }

   public boolean hasNumericPlaceholderBindings(List<Map<String, Object>> var1) {
      if ((-410273147 * -410273147 - -410273147 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var3 : var1) {
            if (var3 != null
               && !var3.isEmpty()
               && (
                  this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("wBkKNSrMRBZr65nHRe6jvyU65AguVHcanE8o3IQKGwTdreeFxPIJ7wA2+OZX3g5+"))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("LEn//mi0M8N+GeOmB8WjeUMrEJPh2F+tKD5KsxWQ"))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("yEyPN25oB8tNnkzvr2MH5I8ukKHvHi1a5IeyVNFkrsQcJ3cPfA6V7MKwgX7rzQew"))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("zpHmi7Xogimjku7V9FsbYpLGgx944ZqTMeEwvfRK"))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("t7SBeUuHaDwVhxrO5LFMRRmBJuq5F6TXaI5t+29jp7JJonUGVAw="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("CBXduAglP/aEoKqcdGZAEoza4bhn/5J7OvYcWORPO7PRf/CK07I/jSBDC2s87iky"))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("fyMegi1B7rQnNSWcf1/MhdVwHS6FgSHjvK1i0fe3LcHHliXX5Co="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("7GuDz9Qm9uN1xAFgfXsALzwleb8M0pQnyp/RluYriG0Q1EGPKDF9lYQ1nyrSGlg7"))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("/WtAglIkBrfpji+oWH48tI3yN+uQFTKlqNpaFquar4GKqcFtcWk="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("BGYBAMOGqfG+1oWSmuTI9N1d8XC3vyb3Hlj2MQsyYgR+khAbArCUCgrfGrFhI4Hl02k="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("ExSVQxofMMxJ/t4OeNSLTT494pwuOEWnRYb9Cbg0+4DtnFsv1mNdOYJU/6we6Vf9Jhk="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("q9TUTgzkJCjE2KZ69nYhnWWlicRU1VPTzwTR3RrDRFTYe/5kYmqQ9g=="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(
                           var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("NLs610+JKmni+dHyZTvXREuLHNCewGFNpRhaMkIFQpdi1CTvhFBTL1l7rtAdL+oVfjSaww==")
                        )
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("MxThDF5FMWOGdHvokWVmLIweYnk0Uq9b5vPUMdq3j6vz3zK/KtWuHOAwLnQ="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(var3, Xqedii_1s34vun.Xqedii_997tx7qg1fze("m532MOcZ8kaZfJr+JYTR2v5CiwxCqleRUWLJ14FbXVibKKAOTa8Z9A=="))
                     )
                     || this.containsNumericPlaceholderValue(
                        this.readMapPathValue(
                           var3,
                           Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "5Cm/zNej5VzIoAhrzm3/wAHN6AtDSkyeNjQWr5hVATqchs8JSAaFGZzIxZcX3RHoZ9jgB2O+6dvwKKOimp6hdYP3ZmTorkdS"
                           )
                        )
                     )
               )) {
               return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-213935515, 20) != 0);
            }
         }

         return (Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 19) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_z5j381o3pwva(-214984091, 20) != 0);
      }
   }

   public boolean containsNumericPlaceholderValue(Object var1) {
      if ((1852135777 * 1852135777 + 1852135777 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof String var2) {
         return ((var2.indexOf(Xqedii_1s34vun.Xqedii_r62pla0yle6a(229065625, 19)) >= 0
            ? Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 10)
            : Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594641, 4)) != 0);
      } else {
         return (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1437336420, 31) != 0);
      }
   }

   public void refreshNumericPlaceholderContent(Player var1, EditorSession var2) {
      if ((702756024 * (702756024 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.hudTextOnlyMode && (!var2.editMode || this.isPlaceholderResolutionEnabled())) {
         if (var2.renderBlocks != null && !var2.renderBlocks.isEmpty()) {
            this.renderResolvedContent(var1, var2);
         }
      }
   }

   public long resolveHudTextRefreshTicks() {
      if ((-1929304051 ^ -1929304051) != 0) {
         throw new IllegalStateException();
      } else {
         return this.plugin == null
            ? Xqedii_1s34vun.Xqedii_1rms5y9kwi951(-6068964217930497882L, 26)
            : Math.max(
               Xqedii_1s34vun.Xqedii_1qj3lixhkz252(1177730773450166502L, 34),
               this.plugin
                  .getConfig()
                  .getLong(
                     Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                        "970wmCX+R1cKGiswuY97isjQxFEvuos6Oowh7MqSHjv2W319zITNeZmnDDagraLZCSQLo6IZlXUHew4DtG7LZIWGGtBrukMEW0On/AchDYIs+G9aEN9NvBtNes4="
                     ),
                     Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9061176299123147486L, 52)
                  )
            );
      }
   }

   public long resolveHudTextRefreshTicks(Player var1) {
      if ((939688520 ^ 939688520) != 0) {
         throw new IllegalStateException();
      } else {
         long var2 = this.resolveBossbarPlaceholderRefreshTicks(var1);
         return var2 > Xqedii_1s34vun.Xqedii_30fkeo782twtu(-9007133103594701534L, 13) ? var2 : this.resolveHudTextRefreshTicks();
      }
   }

   public long resolveBossbarPlaceholderRefreshTicks(Player var1) {
      if ((-647005098 * -647005098 + -647005098 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.hudService != null && this.hudService.isBossbarSession(var1)
            ? Math.max(Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 5), this.hudService.bossbarUpdateTicks(var1))
            : Xqedii_1s34vun.Xqedii_s9zzz7zpmulb(-6518069129625512373L, 14);
      }
   }

   public void refreshHudTextPlaceholderContent(Player var1, EditorSession var2) {
      if (((-656573146 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && (!var2.editMode || this.isPlaceholderResolutionEnabled())) {
         if (var2.renderBlocks != null && !var2.renderBlocks.isEmpty() && this.hasRuntimeTextPlaceholderBindings(var2.renderBlocks)) {
            HashMap var3 = new HashMap();
            int var4 = Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 4);

            for (Map var6 : var2.renderBlocks) {
               var4++;
               String[] var10001 = new String[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327643, 0)];
               var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(210715545, 12)] = this.stringValue(
                  this.readMapPathValue(var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("dQtXqyWXtiXDTdxLt4rVcKkZyQvsyD7cSrV3a5UKA44VGhAG"))
               );
               var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-53268583, 31)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                  "0PbMPXsqzzLA3ypTL0fJN0qQ8G6NcQkwiCpRlj6VoyJoBeWfVWc="
               );
               String var7 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
               if (this.isRenderableBlockType(var7)) {
                  String var8 = this.resolveElementId(var6, var4, var3);
                  if (Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T").equals(var7)) {
                     Object var9 = this.readMapPathValue(var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("iib8svfausvVbe6Mu+tWtn50FkhbrUReZUZ+qsjxOIeQKd5T"));
                     if (this.containsTextPlaceholderValue(var9)) {
                        String var10 = this.runtimeElementId(var2, var8);
                        Entity var11 = this.hudService.getHud(var1, var10);
                        if (var11 != null) {
                           var10001 = new String[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-908417729, 19)];
                           var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-107492046, 19)] = this.stringValue(var9);
                           var10001[Xqedii_1s34vun.Xqedii_r62pla0yle6a(-1936768103, 31)] = Xqedii_1s34vun.Xqedii_997tx7qg1fze(
                              "mU0X4yCkBoDn1XbOZ6ZGoryt2Dq6HNkH1mOMzg=="
                           );
                           String var12 = this.firstNonBlank(var10001);
                           var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(885778079, 5)];
                           var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 21)] = this.stringValue(
                              this.readMapPathValue(var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("HyRpV2KDooVtmbk273ZdNsMDVqMPIyNttC2IAdfZsUqIcVkkuB0="))
                           );
                           var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(355073614, 30)] = this.stringValue(
                              this.readMapPathValue(
                                 var6, Xqedii_1s34vun.Xqedii_997tx7qg1fze("rNM+gedlgj3DofL0O0l+ty5RNbV8VOHkCgHybs90l6cNo6wW6/vZQC6ArfnhhD7uAFg=")
                              )
                           );
                           String var13 = this.firstNonBlank(var10001);
                           String var14 = this.withHexPrefix(var12, var13);
                           String var15 = this.applyPlaceholderApiIgnoringMode(var1, var14);
                           String var16 = this.applyPreferredFontFromBlockMap(
                              var15, var6, (Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-895139895, 27) != 0), this.isEditorContextSession(var2)
                           );
                           this.hudService.setHudText(var11, var16, null, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(1090327643, 6) != 0));
                           this.syncRuntimeElementText(var2, var10, var16);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public String applyPreferredFontFromBlockMap(String var1, Map<String, Object> var2, boolean var3) {
      if ((477823437 * 477823437 - 477823437 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.applyPreferredFontFromBlockMap(var1, var2, var3, (Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 5) != 0));
      }
   }

   public String applyPreferredFontFromBlockMap(String var1, Map<String, Object> var2, boolean var3, boolean var4) {
      if ((-1125874627 ^ -1125874627) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && !var1.isBlank()
         && !var1.contains(Xqedii_1s34vun.Xqedii_997tx7qg1fze("gynMP2/ylUre1IfW0Lmk4Q3AsDxwbRrs6xjuabUwPNNR7MCXSOrmog=="))) {
         String[] var10001 = new String[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-1704594593, 4)];
         var10001[Xqedii_1s34vun.Xqedii_z5j381o3pwva(-874094796, 13)] = this.stringValue(
            this.readMapPathValue(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("xk3STxAJ7Y+7iR3tpLZ/8xHoX/kzPu4NkR6fvdI90zpEENLw"))
         );
         var10001[Xqedii_1s34vun.Xqedii_gfphdsgui6xf(-1090327644, 7)] = this.stringValue(
            this.readMapPathValue(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("HD5uwhh8H01rsKVYPZ5lvAgkg5SaTlqLZr5V4fYvF5XylDbQTDwEcJYkB2Zs/c1P"))
         );
         var10001[Xqedii_1s34vun.Xqedii_2ezsq3zr460ef(-1612386990, 10)] = this.stringValue(
            this.readMapPathValue(var2, Xqedii_1s34vun.Xqedii_997tx7qg1fze("dAmup3bgR7SJAxAYxHRQ1OG0rLPC+dZT8jyFhbP5wvSkDxaIg1yeealIUaca0A=="))
         );
         String var5 = this.firstNonBlank(var10001);
         String var6;
         if (!var5.isBlank()) {
            var6 = this.normalizeFontKey(var5);
         } else if (var4) {
            var6 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("OLBJlAXf+FyGh6MaWDUC04l0h2qE0Oq1UmrL6giCN/NGP89M0g2YwQ==");
         } else {
            var6 = Xqedii_1s34vun.Xqedii_997tx7qg1fze("1K7XbeVjEm+NGthl2SGxM/Gb6uzTUrt15kmtaYAMGojzy+mNZkvC1VBg");
         }

         return this.withFont(var1, var6);
      } else {
         return var1;
      }
   }

   public void syncRuntimeElementText(EditorSession var1, String var2, String var3) {
      if ((1825956730 ^ 1825956730) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && var1.elements != null && !var1.elements.isEmpty()) {
         for (HoverElement var5 : var1.elements) {
            if (var5 != null && var2.equals(var5.id)) {
               var5.text = var3;
               return;
            }
         }
      }
   }

   @Override
   public void applyRuntimeHudNoTransition(Player var1, String var2) {
      if ((1284241925 ^ 1284241925) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         this.setHudTeleportDurationZero(var1, var2);
         this.setHudTeleportDurationZero(var1, Xqedii_229n4kak6x2ce(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_2tocojbhikqim(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_2z3tuiad1sgsc(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_2sjrul2dphxzt(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_f22r6xnajdzk(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_18q7wy7giivtn(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_23yz2nkparixg(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_4x4dfymfqex3(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_3nkr2gjny07sm(var2));
         this.setHudTeleportDurationZero(var1, Xqedii_cdkwfc6l2cgy(var2));
         String var3 = Xqedii_ta4r3rt3sxmz(var2);
         this.setHudTeleportDurationZero(var1, Xqedii_3tcn4b2gn56rx(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_1xcbgp0v2jeo4(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_m6o97xspqy51(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_1szfgk0ufm5a(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_2xoprnhfc59ca(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_203pcrt3lcdnj(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_14yzwneh4gx3i(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_1w2zg4sy8c3r2(var3));
         this.setHudTeleportDurationZero(var1, Xqedii_1wqwfpkiefijy(var3));
      }
   }

   @Override
   public void applyRuntimeHudTransitionTicks(Player var1, String var2, int var3, int var4) {
      if ((390247499 * 390247499 - 390247499 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         this.setHudTransitionTicksIfExists(var1, var2, var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_1quge71relth2(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_1p6a8huquxyvj(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_37rgx38w94zeo(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_25ko3hi71h3bx(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_2ytbd5znllwy6(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_2os3ijyxwsciy(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_3pnxa1jgjft09(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_brhync5ls0r5(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_13lvd1ieusjhl(var2), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_t0ws0r0ub42j(var2), var3, var4);
         String var5 = Xqedii_3847ac2avas9z(var2);
         this.setHudTransitionTicksIfExists(var1, Xqedii_1ggjnp3qme46t(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_3ce3qir7q4ltc(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_qhbiueanzmsj(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_lxscdxuty8h7(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_2809duu73hhh0(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_2n4fho9olrqal(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_9kxrc8ukuxfb(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_15gt7zrcdk1h7(var5), var3, var4);
         this.setHudTransitionTicksIfExists(var1, Xqedii_2nlm7ds4w21kd(var5), var3, var4);
      }
   }

   public void setHudTeleportDurationZero(Player var1, String var2) {
      if ((-862672123 ^ -862672123) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var3 = this.hudService.getHud(var1, var2);
         if (var3 != null) {
            this.hudService.setHudNoTransition(var3);
         }
      }
   }

   @Override
   public void setHudTransitionTicksIfExists(Player var1, String var2, int var3, int var4) {
      if (((937739458 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var5 = this.hudService.getHud(var1, var2);
         if (var5 != null) {
            this.hudService.setHudTransitionTicks(var5, var3, var4);
         }
      }
   }

   private static /* synthetic */ String Xqedii_2233pwl15fzz7(String string) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("gTsRndffDPH/FG4pLF5EYZo64orQHS+kEPA5Qe+cPLL0JfJoryvqNWHnytJn4z3w9bDxDDRP") + string;
    }

    private static /* synthetic */ String Xqedii_l01ka1f4rnfl(String string, String string2, String string3) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("SelNdi2t48KOidKV92mvxNhuLtFCHs/7G8JbBfk2") + string2 + Xqedii_1s34vun.Xqedii_997tx7qg1fze("SelNdi2t48KOidKV92mvxNhuLtFCHs/7G8JbBfk2") + string3;
    }

    private static /* synthetic */ String Xqedii_1xktq30f5x89v(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("guooxAPnRXUxTjbVG4ouAP6HQUj7sf6ExDb8kc5w8fmUfwzieDJ+SNdWz8qPn5BI");
    }

    private static /* synthetic */ String Xqedii_3e83hgx93ar3e(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("zwmysplW9F42XjixNhkTpyeL4xdTz+qL+yDkc1/7uQhSIh5wgz+dJWL6uDE=");
    }

    private static /* synthetic */ String Xqedii_1yjesus3zp3q3(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("vm2HbvZI8nCzKsHWajEpvch9kj5e33XfOrdsTxxVQGRaLHQHaq9mC3uK");
    }

    private static /* synthetic */ String Xqedii_23zt21hc55ckz(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("tqodB3yglw2mWLtHow5HSp+QMciY9m/tbHfLCiuiWcsbylVp+0LEBw==");
    }

    private static /* synthetic */ String Xqedii_mxkb500awks0(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("+1Km971kHZeRGuv9X823YDJRP2rQpRh+QwubmQ2zi7E/zaqPHWEc84y2v5xukw==");
    }

    private static /* synthetic */ String Xqedii_9vyw0ey6tp1x(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ftqCP2aXQ7TEr9gAFQFKWOEyaQQ4w1qTbro3c7i4zwoNRpTUFXo49xHu");
    }

    private static /* synthetic */ String Xqedii_34coe023cmnto(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("n+8pyhrehzfDZhWB/mTiNmwcqVFe/Vy3JmoBMVyOx8TfxS+awD4XyyQM59A=");
    }

    private static /* synthetic */ String Xqedii_82ggdam8tlgy(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("EOYzcX8x0/5E8U7vARIYuq+zq0Cxsh1/+SL+QiGFdALghMvUXSQ=");
    }

    private static /* synthetic */ String Xqedii_1b416jsbr2kxn(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("c/EW7mjKHVQ7n5XEHx0i7EstsFLOjnTPld2vPpoE/Uq7I6thokI=");
    }

    private static /* synthetic */ String Xqedii_2ew9m2p23f57u(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ORHh/qkAL5MDD7KvDy5S3nwyqUXpE6JUyWY6NIM6OZoZAQOxfpU=");
    }

    private static /* synthetic */ String Xqedii_q9h6j6f5bqd5(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("qY9L1xi0W34Kbzu8Ivsts34Piyf8hmLGJq60Khlubedh4TFK+qM=");
    }

    private static /* synthetic */ String Xqedii_39dfo0kwtwe1v(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("zwmysplW9F42XjixNhkTpyeL4xdTz+qL+yDkc1/7uQhSIh5wgz+dJWL6uDE=");
    }

    private static /* synthetic */ String Xqedii_3jzwp0pvx9o74(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("vm2HbvZI8nCzKsHWajEpvch9kj5e33XfOrdsTxxVQGRaLHQHaq9mC3uK");
    }

    private static /* synthetic */ String Xqedii_3qyy2vw8v2wmz(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("tqodB3yglw2mWLtHow5HSp+QMciY9m/tbHfLCiuiWcsbylVp+0LEBw==");
    }

    private static /* synthetic */ String Xqedii_v80hk6mhc7yv(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("+1Km971kHZeRGuv9X823YDJRP2rQpRh+QwubmQ2zi7E/zaqPHWEc84y2v5xukw==");
    }

    private static /* synthetic */ String Xqedii_3bwb9y2qqcpqj(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ftqCP2aXQ7TEr9gAFQFKWOEyaQQ4w1qTbro3c7i4zwoNRpTUFXo49xHu");
    }

    private static /* synthetic */ String Xqedii_2cwyoxeq2xzvm(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("n+8pyhrehzfDZhWB/mTiNmwcqVFe/Vy3JmoBMVyOx8TfxS+awD4XyyQM59A=");
    }

    private static /* synthetic */ String Xqedii_2rs74ns6mrhh8(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("EOYzcX8x0/5E8U7vARIYuq+zq0Cxsh1/+SL+QiGFdALghMvUXSQ=");
    }

    private static /* synthetic */ String Xqedii_1snllc5th7ywi(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("c/EW7mjKHVQ7n5XEHx0i7EstsFLOjnTPld2vPpoE/Uq7I6thokI=");
    }

    private static /* synthetic */ String Xqedii_35s5jil5txndz(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ORHh/qkAL5MDD7KvDy5S3nwyqUXpE6JUyWY6NIM6OZoZAQOxfpU=");
    }

    private static /* synthetic */ String Xqedii_1ed7j3fb11ob2(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("qY9L1xi0W34Kbzu8Ivsts34Piyf8hmLGJq60Khlubedh4TFK+qM=");
    }

    private static /* synthetic */ String Xqedii_g413slj7hf2s(String string, int n) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("TGeH7BIipyI6XsMVbpjwetuNkPERVZ4s0ujn134S") + n;
    }

    private static /* synthetic */ String Xqedii_8xupbxdxvlco(String string) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("LpO/lWDL6r9OgpqGb+wNlqmNJMHApVHtWGu1eGrxp5nfEKzvLaAdzkQpArjiBWwRNi4Byvtrv1nX+hd7ljdDVD4YQf4jv6XHx8GzI3y8LFF6z9ZQkgdVXFWqVATDAQEgPFhQwyg0YQQqJRpuu3xZUTm5LeI=") + string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("gqGyuImNpiaD7P+Lfql7DApBUc8wygmzfnUrYD6diPuHkepv33O+uqAVhYW5w+whLZx0YXOmTx3TUXtbJk+5pDJkockSQwACjRy4qvMc2hFRJ94DepRs8QU7Nnj1Dl6Sx1a2MCR9+7VG7jCW");
    }

    private static /* synthetic */ String Xqedii_1o2x960h641bt(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ej7mDQDZHpTt6GfGU3NEkvj+uOa4nTrUyRw+9v6fLEpmnGQm");
    }

    private static /* synthetic */ String Xqedii_33uaic7utwvks(String string) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("3VC08VT9lb5NiGRBd8UkKtedJCb6h1nxaM1IgRMWeJsHfogZOUJFb/m+msdg8DUamf8hJbYW96tGcGLOx/I0T28zSJtsQAXJbzbytSpzhcB4C2rOoRHl7i8alJcNXPcvQ0yn39SzmDz/eyuQaKW/V5fL2f6x2yko95g=") + string;
    }

    private static /* synthetic */ String Xqedii_1j47quvfn80e7(String string, String string2) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("3itqRp/Q9GPzg+sQgMSYlTLne3b6LQRI9UqpjIfB") + string2 + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ej7mDQDZHpTt6GfGU3NEkvj+uOa4nTrUyRw+9v6fLEpmnGQm");
    }

    private static /* synthetic */ String Xqedii_2tx4urmv8kylw(String string, String string2, int n) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("3itqRp/Q9GPzg+sQgMSYlTLne3b6LQRI9UqpjIfB") + string2 + Xqedii_1s34vun.Xqedii_997tx7qg1fze("3itqRp/Q9GPzg+sQgMSYlTLne3b6LQRI9UqpjIfB") + n + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ej7mDQDZHpTt6GfGU3NEkvj+uOa4nTrUyRw+9v6fLEpmnGQm");
    }

    private static /* synthetic */ String Xqedii_3k2jr4oycr2u6(String string, String string2) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("AVcVeelGNAIFwmMq9A2ctqsaI/ZIgjOkUfbSy1PUGsCThZFACnmkDgel8OzOe7u+Yruf7HAKC7lbzEGZFMNlGh6xnL7gCDEMor8+hXf30+T+DoviAGfD1FlHGdWt1h9238ArhmpPY3eL0lUizTbw69FcxOPA2Q==") + string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("Cz0+9g9hPDgD8b230OtGauMqVS7lpfk+Wx6VG1UW+CNFHQ==") + string2;
    }

    private static /* synthetic */ String Xqedii_c0ow2lpxehoq(String string) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("Ry4iPbpHos+q8vgveclPD9MzrlY/sLda0yCuSz4w") + string;
    }

    private static /* synthetic */ String Xqedii_2nj868rlpw3sp(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ej7mDQDZHpTt6GfGU3NEkvj+uOa4nTrUyRw+9v6fLEpmnGQm");
    }

    private static /* synthetic */ String Xqedii_1ii05c8nuskr4(String string) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("Ry4iPbpHos+q8vgveclPD9MzrlY/sLda0yCuSz4w") + string;
    }

    private static /* synthetic */ String Xqedii_1zbgriu0kammc(String string) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("fqx099AN7XNZ1SWB6Eq0/f1mwyKnmU9Pqks3F4fLgCETOMJ6Z+CE1rRdM9uEHA==") + string;
    }

    private static /* synthetic */ String Xqedii_2m0kgr0v7qw7l(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("MN1Kp/uHPJ+gZZVsO/ZEPcuJ18sl2qQfOLAjlpUJCx3yVQ==");
    }

    private static /* synthetic */ String Xqedii_3gd0ckbywarv3(String string, String string2) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("0kvjMX37+UbBqObzdHBDefSTpp0TsfNaunjZmOKfe5kWJetOv63iaWSpUrOAnn36qBKJLOqUJRYTt05srGI3Own34J1G74jXjfnvbF7DAdKd67Uo6v0bHY9YfA5GfVm+yAk4zzWk7/FOtn5c") + string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("jGRTBx+NlFQ679uw8kqimxh34y7ST6Lo3UwMY1V6A0Nv6ZBL1eotLYmqAfHNNVNxan7/mFY+sJPeOYctdWg=") + string2;
    }

    private static /* synthetic */ String Xqedii_1dbo1ec74yk7s(String string, String string2) {
        return Xqedii_1s34vun.Xqedii_997tx7qg1fze("9WDbPjc6+dmOWsOwc2tJJzmSjkFMfU3BX94DFkhnsAfswxZe+gclRD/e5/8m0PSNldCMYDg9bI+xfnwknR7yKAZPwP8bmKrv5TOXrEYGP9CBNLODaJY=") + string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("Cz0+9g9hPDgD8b230OtGauMqVS7lpfk+Wx6VG1UW+CNFHQ==") + string2;
    }

    private static /* synthetic */ String Xqedii_26not3x7wrh(int n, String string) {
        return n + string;
    }

    private static /* synthetic */ String Xqedii_229n4kak6x2ce(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("zwmysplW9F42XjixNhkTpyeL4xdTz+qL+yDkc1/7uQhSIh5wgz+dJWL6uDE=");
    }

    private static /* synthetic */ String Xqedii_2tocojbhikqim(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("vm2HbvZI8nCzKsHWajEpvch9kj5e33XfOrdsTxxVQGRaLHQHaq9mC3uK");
    }

    private static /* synthetic */ String Xqedii_2z3tuiad1sgsc(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("tqodB3yglw2mWLtHow5HSp+QMciY9m/tbHfLCiuiWcsbylVp+0LEBw==");
    }

    private static /* synthetic */ String Xqedii_2sjrul2dphxzt(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("+1Km971kHZeRGuv9X823YDJRP2rQpRh+QwubmQ2zi7E/zaqPHWEc84y2v5xukw==");
    }

    private static /* synthetic */ String Xqedii_f22r6xnajdzk(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ftqCP2aXQ7TEr9gAFQFKWOEyaQQ4w1qTbro3c7i4zwoNRpTUFXo49xHu");
    }

    private static /* synthetic */ String Xqedii_18q7wy7giivtn(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("n+8pyhrehzfDZhWB/mTiNmwcqVFe/Vy3JmoBMVyOx8TfxS+awD4XyyQM59A=");
    }

    private static /* synthetic */ String Xqedii_23yz2nkparixg(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("EOYzcX8x0/5E8U7vARIYuq+zq0Cxsh1/+SL+QiGFdALghMvUXSQ=");
    }

    private static /* synthetic */ String Xqedii_4x4dfymfqex3(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("c/EW7mjKHVQ7n5XEHx0i7EstsFLOjnTPld2vPpoE/Uq7I6thokI=");
    }

    private static /* synthetic */ String Xqedii_3nkr2gjny07sm(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ORHh/qkAL5MDD7KvDy5S3nwyqUXpE6JUyWY6NIM6OZoZAQOxfpU=");
    }

    private static /* synthetic */ String Xqedii_cdkwfc6l2cgy(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("qY9L1xi0W34Kbzu8Ivsts34Piyf8hmLGJq60Khlubedh4TFK+qM=");
    }

    private static /* synthetic */ String Xqedii_ta4r3rt3sxmz(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("zwmysplW9F42XjixNhkTpyeL4xdTz+qL+yDkc1/7uQhSIh5wgz+dJWL6uDE=");
    }

    private static /* synthetic */ String Xqedii_3tcn4b2gn56rx(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("vm2HbvZI8nCzKsHWajEpvch9kj5e33XfOrdsTxxVQGRaLHQHaq9mC3uK");
    }

    private static /* synthetic */ String Xqedii_1xcbgp0v2jeo4(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("tqodB3yglw2mWLtHow5HSp+QMciY9m/tbHfLCiuiWcsbylVp+0LEBw==");
    }

    private static /* synthetic */ String Xqedii_m6o97xspqy51(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("+1Km971kHZeRGuv9X823YDJRP2rQpRh+QwubmQ2zi7E/zaqPHWEc84y2v5xukw==");
    }

    private static /* synthetic */ String Xqedii_1szfgk0ufm5a(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ftqCP2aXQ7TEr9gAFQFKWOEyaQQ4w1qTbro3c7i4zwoNRpTUFXo49xHu");
    }

    private static /* synthetic */ String Xqedii_2xoprnhfc59ca(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("n+8pyhrehzfDZhWB/mTiNmwcqVFe/Vy3JmoBMVyOx8TfxS+awD4XyyQM59A=");
    }

    private static /* synthetic */ String Xqedii_203pcrt3lcdnj(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("EOYzcX8x0/5E8U7vARIYuq+zq0Cxsh1/+SL+QiGFdALghMvUXSQ=");
    }

    private static /* synthetic */ String Xqedii_14yzwneh4gx3i(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("c/EW7mjKHVQ7n5XEHx0i7EstsFLOjnTPld2vPpoE/Uq7I6thokI=");
    }

    private static /* synthetic */ String Xqedii_1w2zg4sy8c3r2(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ORHh/qkAL5MDD7KvDy5S3nwyqUXpE6JUyWY6NIM6OZoZAQOxfpU=");
    }

    private static /* synthetic */ String Xqedii_1wqwfpkiefijy(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("qY9L1xi0W34Kbzu8Ivsts34Piyf8hmLGJq60Khlubedh4TFK+qM=");
    }

    private static /* synthetic */ String Xqedii_1quge71relth2(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("zwmysplW9F42XjixNhkTpyeL4xdTz+qL+yDkc1/7uQhSIh5wgz+dJWL6uDE=");
    }

    private static /* synthetic */ String Xqedii_1p6a8huquxyvj(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("vm2HbvZI8nCzKsHWajEpvch9kj5e33XfOrdsTxxVQGRaLHQHaq9mC3uK");
    }

    private static /* synthetic */ String Xqedii_37rgx38w94zeo(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("tqodB3yglw2mWLtHow5HSp+QMciY9m/tbHfLCiuiWcsbylVp+0LEBw==");
    }

    private static /* synthetic */ String Xqedii_25ko3hi71h3bx(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("+1Km971kHZeRGuv9X823YDJRP2rQpRh+QwubmQ2zi7E/zaqPHWEc84y2v5xukw==");
    }

    private static /* synthetic */ String Xqedii_2ytbd5znllwy6(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ftqCP2aXQ7TEr9gAFQFKWOEyaQQ4w1qTbro3c7i4zwoNRpTUFXo49xHu");
    }

    private static /* synthetic */ String Xqedii_2os3ijyxwsciy(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("n+8pyhrehzfDZhWB/mTiNmwcqVFe/Vy3JmoBMVyOx8TfxS+awD4XyyQM59A=");
    }

    private static /* synthetic */ String Xqedii_3pnxa1jgjft09(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("EOYzcX8x0/5E8U7vARIYuq+zq0Cxsh1/+SL+QiGFdALghMvUXSQ=");
    }

    private static /* synthetic */ String Xqedii_brhync5ls0r5(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("c/EW7mjKHVQ7n5XEHx0i7EstsFLOjnTPld2vPpoE/Uq7I6thokI=");
    }

    private static /* synthetic */ String Xqedii_13lvd1ieusjhl(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ORHh/qkAL5MDD7KvDy5S3nwyqUXpE6JUyWY6NIM6OZoZAQOxfpU=");
    }

    private static /* synthetic */ String Xqedii_t0ws0r0ub42j(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("qY9L1xi0W34Kbzu8Ivsts34Piyf8hmLGJq60Khlubedh4TFK+qM=");
    }

    private static /* synthetic */ String Xqedii_3847ac2avas9z(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("zwmysplW9F42XjixNhkTpyeL4xdTz+qL+yDkc1/7uQhSIh5wgz+dJWL6uDE=");
    }

    private static /* synthetic */ String Xqedii_1ggjnp3qme46t(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("vm2HbvZI8nCzKsHWajEpvch9kj5e33XfOrdsTxxVQGRaLHQHaq9mC3uK");
    }

    private static /* synthetic */ String Xqedii_3ce3qir7q4ltc(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("tqodB3yglw2mWLtHow5HSp+QMciY9m/tbHfLCiuiWcsbylVp+0LEBw==");
    }

    private static /* synthetic */ String Xqedii_qhbiueanzmsj(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("+1Km971kHZeRGuv9X823YDJRP2rQpRh+QwubmQ2zi7E/zaqPHWEc84y2v5xukw==");
    }

    private static /* synthetic */ String Xqedii_lxscdxuty8h7(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ftqCP2aXQ7TEr9gAFQFKWOEyaQQ4w1qTbro3c7i4zwoNRpTUFXo49xHu");
    }

    private static /* synthetic */ String Xqedii_2809duu73hhh0(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("n+8pyhrehzfDZhWB/mTiNmwcqVFe/Vy3JmoBMVyOx8TfxS+awD4XyyQM59A=");
    }

    private static /* synthetic */ String Xqedii_2n4fho9olrqal(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("EOYzcX8x0/5E8U7vARIYuq+zq0Cxsh1/+SL+QiGFdALghMvUXSQ=");
    }

    private static /* synthetic */ String Xqedii_9kxrc8ukuxfb(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("c/EW7mjKHVQ7n5XEHx0i7EstsFLOjnTPld2vPpoE/Uq7I6thokI=");
    }

    private static /* synthetic */ String Xqedii_15gt7zrcdk1h7(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("ORHh/qkAL5MDD7KvDy5S3nwyqUXpE6JUyWY6NIM6OZoZAQOxfpU=");
    }

    private static /* synthetic */ String Xqedii_2nlm7ds4w21kd(String string) {
        return string + Xqedii_1s34vun.Xqedii_997tx7qg1fze("qY9L1xi0W34Kbzu8Ivsts34Piyf8hmLGJq60Khlubedh4TFK+qM=");
    }
}
