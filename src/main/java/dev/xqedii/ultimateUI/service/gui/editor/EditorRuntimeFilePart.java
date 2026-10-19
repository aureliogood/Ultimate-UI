package dev.xqedii.ultimateUI.service.gui.editor;

import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService.GeneratedImage;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1hxci1i;
import dev.xqedii.ultimateUI.Xqedii_2dpt1g6;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.api.event.UltimateUIBlockClickEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIInputSubmitEvent;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.gui.parser.ScrollViewState;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.input.AnvilInputRequest;
import dev.xqedii.ultimateUI.service.input.InputCloseReason;
import dev.xqedii.ultimateUI.service.input.InputFilter;
import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public abstract class EditorRuntimeFilePart extends EditorImageDragPart {
   public static final String Xqedii_2ynudmcpnlccw = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Set<String> Xqedii_32wtmt4;
   public static final String Xqedii_31vkccl = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
      "znr/g6wf0tZLoaaw4+Yqust52ZP8c8pxwnA4i1Mp0tJdLWv6eDkLxzcyBvtZzh3t/G3YQpt/0qP31sjj/Kqr7msc"
   );

   public EditorRuntimeFilePart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public long beginRuntimeActionChain(EditorSession var1) {
      if ((757895457 * (757895457 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-8620600783611295905L, 26);
      } else {
         long var2 = var1.runtimeActionChainToken + Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(4502314043539939700L, 42);
         if (var2 <= Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(6705753032290475224L, 32)) {
            var2 = Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489190L, 3);
         }

         var1.runtimeActionChainToken = var2;
         var1.runtimeActionChainLocked = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-152159312, 22) != 0);
         return var2;
      }
   }

   public boolean isRuntimeActionChainActive(EditorSession var1, long var2) {
      if ((-1475576380 * -1475576380 + -1475576380 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && var2 > Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-3886959349797321284L, 3)
               && var1.runtimeActionChainLocked
               && var1.runtimeActionChainToken == var2
            ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-526608348, 8)
            : Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 2)) != 0);
      }
   }

   public void finishRuntimeActionChain(EditorSession var1, long var2) {
      if (((-118697179 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 > Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(4818399733674958201L, 50)) {
         if (var1.runtimeActionChainToken == var2) {
            var1.runtimeActionChainLocked = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 24) != 0);
         }
      }
   }

   public void executeRuntimeTargetActions(Player var1, List<Map<String, Object>> var2, int var3) {
      if ((1193287103 * (1193287103 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.executeRuntimeTargetActions(var1, null, Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(519628387425627211L, 14), var2, var3);
      }
   }

   @Override
   public void executeRuntimeTargetActions(Player var1, EditorSession var2, long var3, List<Map<String, Object>> var5, int var6) {
      if ((880855002 * (880855002 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 == null || this.isRuntimeActionChainActive(var2, var3)) {
         if (var1 != null && var1.isOnline() && var5 != null && var6 >= 0 && var6 < var5.size()) {
            try {
               Map var7 = (Map)var5.get(var6);
               String var8 = this.normalizeActionType(
                  this.stringValue(var7 == null ? null : var7.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5fZ6YJ9DnetXPf36MNJ6U1/oUxZosdLRrGuACACpyiBVNOFP")))
               );
               String var9 = this.resolveRuntimeActionValue(var1, this.resolveActionDisplayValue(var7, var8));
               this.debugScript(Xqedii_3c3txvpa7xnns(var6, var5.size(), var8, var9, String.valueOf(var7)));
               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GN0iKYkjeM282eYVtYxIAOju+scaeww/efmmOUAy5cPOQvUgZRU=").equals(var8)) {
                  long var15 = this.parseRuntimeActionDelayTicks(var9);
                  if (var15 <= Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-5217066297865052592L, 56)) {
                     this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 26));
                     return;
                  }

                  Xqedii_38o2zes.Xqedii_2sj63w1(this.plugin, var1, () -> {
                     if ((2128809511 ^ 2128809511) != 0) {
                        throw new IllegalStateException();
                     } else if (!var1.isOnline()) {
                        this.finishRuntimeActionChain(var2, var3);
                     } else {
                        this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1642978423, 15));
                     }
                  }, var15);
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("WYXdNX3HCcoADSOOpN+0tVN4P2KxzkGrmZdsIBgjggGMxIOjd9w=").equals(var8)) {
                  this.openRuntimeTextInput(
                     var1,
                     var2,
                     var3,
                     var7,
                     () -> {
                        if (((442240891 << 1 | 1) & 1) == 0) {
                           throw new IllegalStateException();
                        } else {
                           this.spliceRuntimeBranch(
                              var1,
                              var2,
                              var3,
                              var5,
                              var6,
                              this.readActionBranch(
                                 var7, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Vg1Ysuy0Brgyrm0bv7rgAaXWXFBY4o2JfNW8CA8iMtflMgQT/thO5CzRRiI72Q==")
                              )
                           );
                        }
                     }
                  );
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("jUc+VsaF0rhsyLIeKd769EZLVeLkjJTzZg5qHjML1+VjXALwwacBB3pD").equals(var8)) {
                  this.executeRuntimeCommandAction(var1, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(164201038, 12));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("TbUiSa78h/AFhUU1j9kYGepvPvnWz1n57U414F6mKTWaJLyB9r8QAdGq").equals(var8)) {
                  this.executeRuntimeConsoleAction(var1, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(154674982, 30));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("tdRTHTY1EB+Gy+VdsdnF21pEcEiqp5snNAgZpuFgYJuZia3rXjhH5BMH").equals(var8)) {
                  this.executeRuntimeMessageAction(var1, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 17));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GR2wHfT07OuPlRF9N+K3i52MGW+EHw+ATwN5WXaWbdPpZMCa3fQ=").equals(var8)) {
                  this.executeRuntimeSoundAction(var1, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574057, 6));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("o9g8K9dAEkil0E/IH9BABIHz70FyFrNgautyS15NFytGWSTHAt2vzMuSyVA=").equals(var8)) {
                  this.executeRuntimeTeleportAction(var1, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2071403992, 21));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("VKGDeR5rRGVy0imRj631jmHM04QL6ZSoOmSx5ZqVdL3mOelCRLlRgw==").equals(var8)) {
                  this.executeRuntimeToggleAction(var1, var7);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106433389, 10));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("plnQTQMkxlirMui8DfqWYlRoaAGp3PZFPQcyc4DA95SctVUJ71L1mXpG1PFVPkbS").equals(var8)) {
                  this.executeRuntimeVisibilityAction(var1, var7, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(309349964, 31));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ZQn50aATjXmsbBDOFp0QbL1pxAGmNnBUm8NXw2xWjCns1Xt7izUyw6mnf+g=").equals(var8)) {
                  this.executeRuntimeVariableAction(var1, var7, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 5));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ryhxx8ZNJQrOtjG6OaF0wEXbu3vFMDA/1wer7iKlNyCnfmdb").equals(var8)) {
                  this.executeRuntimeGiveAction(var1, var7, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(925671273, 21));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("gA0jQjmT5jZk1YnRC1c+JkaSGi0lAlIqHOZhERIqMf3/RV4duyxjBNs0hM+SeQ==").equals(var8)) {
                  String[] var17 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923582313, 12)];
                  var17[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 25)] = this.stringValue(
                     var7.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("gA0jQjmT5jZk1YnRC1c+JkaSGi0lAlIqHOZhERIqMf3/RV4duyxjBNs0hM+SeQ=="))
                  );
                  var17[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(810139961, 25)] = this.stringValue(
                     var7.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Rj399dBd2x9tnxEBI6azUN6KvDlJajFjoIAexcx97I9oLvxs1AY="))
                  );
                  String var14 = this.resolveRuntimeActionValue(var1, this.firstNonBlank(var17));
                  boolean var16 = this.evaluateRuntimeCondition(var14);
                  this.spliceRuntimeBranch(
                     var1,
                     var2,
                     var3,
                     var5,
                     var6,
                     this.readActionBranch(
                        var7,
                        var16
                           ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Yxy55TZAyhA5Ml0IB/8hDd0JnPG6zCLYK0XSHCAPowcXuL/r")
                           : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("0QlX0JoaffMmq9kfz1myU0Dl7Za9qMBrrzao9PzAEanXLR0r")
                     )
                  );
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9g5n4d0hBrw50pAmyi9IXvYRSheesIcdqiK9nhgEdC/CZ6JDvDE+0TaZ5phBheoo").equals(var8)) {
                  String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192591, 1)];
                  var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106434413, 10)] = this.stringValue(
                     var7.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9g5n4d0hBrw50pAmyi9IXvYRSheesIcdqiK9nhgEdC/CZ6JDvDE+0TaZ5phBheoo"))
                  );
                  var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1156616477, 10)] = this.stringValue(
                     var7.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Rj399dBd2x9tnxEBI6azUN6KvDlJajFjoIAexcx97I9oLvxs1AY="))
                  );
                  String var13 = this.resolveRuntimeActionValue(var1, this.firstNonBlank(var10003)).trim();
                  int var11 = !var13.isBlank() && var1.hasPermission(var13)
                     ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2108814903, 28)
                     : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-578308751, 9);
                  this.spliceRuntimeBranch(
                     var1,
                     var2,
                     var3,
                     var5,
                     var6,
                     this.readActionBranch(
                        var7,
                        var11 != 0
                           ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Yxy55TZAyhA5Ml0IB/8hDd0JnPG6zCLYK0XSHCAPowcXuL/r")
                           : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("0QlX0JoaffMmq9kfz1myU0Dl7Za9qMBrrzao9PzAEanXLR0r")
                     )
                  );
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Jup6sVaBFIDn/RQGYBe2jQTi0s8gLB6xa/wHolArNzeckJqdTqhJDrd3K4I=").equals(var8)) {
                  this.spliceRuntimeBranch(var1, var2, var3, var5, var6, this.resolveRuntimeFunctionBody(var1, var2, var7, var9));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8QE2OojNN0gJINDm16ObPrYdVcroRTV0NcFZReKfmt4EndL1c74fo0sGKy4NaQ==").equals(var8)) {
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1742413668, 24));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("SWM290uIVGBnFOJ9YBNiHtOcS1b+pN/JN+aG5P9Bubz2Iue2hfNUJYDWPH0=").equals(var8)) {
                  boolean var10 = this.executeRuntimeRedirectAction(var1, var9);
                  if (!var10) {
                     this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(638138407, 22));
                  } else {
                     this.finishRuntimeActionChain(var2, var3);
                  }

                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("vQPjqIpNZU2hD8HiLBsF0PxEMhABruakjQobGkNMHBlZeHsKhjc=").equals(var8)) {
                  this.executeRuntimeCloseAction(var1);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 21));
                  return;
               }

               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("EcDGbrFloewh+PqxifC0R5q9BRfx5FB30MIZmLr/5CWoxos8hOiFldaR").equals(var8)
                  || Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("R4hmJkBomRk4/5oF0EtmRc1dz6QKStdoEgAloVg279NVHOnK4KW4Fw==").equals(var8)) {
                  this.applyRuntimePlayerToggleAction(var1, var2, var8, var9);
                  this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 6));
                  return;
               }

               this.executeRuntimeTargetActions(var1, var2, var3, var5, var6 + Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1620279922, 26));
            } catch (RuntimeException var12) {
               this.finishRuntimeActionChain(var2, var3);
            }
         } else {
            this.finishRuntimeActionChain(var2, var3);
         }
      }
   }

   public void applyRuntimePlayerToggleAction(Player var1, EditorSession var2, String var3, String var4) {
      if (((2021753113 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      }
   }

   @Override
   public String resolveRuntimeActionValue(Player var1, String var2) {
      if ((1920816303 * 1920816303 + 1920816303 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 10)];
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 15)] = var2;
         String var3 = this.firstNonBlank(var10001);
         if (!var3.isBlank() && var1 != null) {
            try {
               var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2065112536, 21)];
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1250828921, 25)] = this.resolvePlaceholders(
                  var1, var3, (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053217207, 9) != 0)
               );
               var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1918931842, 18)] = var3;
               return this.firstNonBlank(var10001);
            } catch (Exception var5) {
               return var3;
            }
         } else {
            return var3;
         }
      }
   }

   public void spliceRuntimeBranch(Player var1, EditorSession var2, long var3, List<Map<String, Object>> var5, int var6, List<Map<String, Object>> var7) {
      if ((-2010135702 * -2010135702 + -2010135702 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var8 = new ArrayList();
         if (var7 != null) {
            var8.addAll(var7);
         }

         for (int var9 = var6 + Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(517850998, 19); var9 < var5.size(); var9++) {
            var8.add((Map)var5.get(var9));
         }

         this.executeRuntimeTargetActions(var1, var2, var3, var8, Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-919066843, 30));
      }
   }

   public List<Map<String, Object>> readActionBranch(Map<String, Object> var1, String var2) {
      if ((-1884479470 * -1884479470 + -1884479470 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyList();
      } else {
         Object var3 = var1.get(var2);
         if (var3 instanceof ConfigurationSection var4) {
            var3 = var4.getList(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"));
         } else if (var3 instanceof Map var5) {
            var3 = var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"));
         }

         List var6 = this.copyBlocks(var3 instanceof List var7 ? var7 : null);
         return var6 == null ? Collections.emptyList() : var6;
      }
   }

   public List<Map<String, Object>> resolveRuntimeFunctionBody(Player var1, EditorSession var2, Map<String, Object> var3, String var4) {
      if ((-1459706820 ^ -1459706820) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null) {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1237399860, 1)];
         var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1917716937, 28)] = this.stringValue(
            var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Jup6sVaBFIDn/RQGYBe2jQTi0s8gLB6xa/wHolArNzeckJqdTqhJDrd3K4I="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923590505, 14)] = this.stringValue(
            var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7uWEmAzB0TJXuPQ7yioCxiYc431trfs+VC+xBjrg5C5/H1Wl"))
         );
         var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192653, 6)] = var4;
         String var5 = this.firstNonBlank(var10001).trim();
         Map var6 = var2.runtimeFunctions.get(var5);
         if (var6 == null) {
            this.plugin
               .getLogger()
               .warning(
                  Xqedii_7oiky383frl5(
                     var5,
                     var2.pageName,
                     var2.runtimeFunctions.isEmpty()
                        ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                           "NyoWDdkigMkVVKgvflY9OB3ENb/PYjLPeC5t5sFOWh2fRZA3wgzTQJvJVriZzjiXolWxy4uTzLeJLGnA3AbNdhR8ZKOuChOVbkml5SRyKT8KvJmvLwPrN6R2AgRaFJ10ZjnlaFbn9TbenV6AmRvmD5qX8MMCjaYfQVuChMHy1N8Ra8KgNxtg6xz3a0tVqVy8ggYKUfoWdedngBRAsi1pKJB53pd4nyJGHFoDnCHCUct0SLRxKCLJ+g0y"
                        )
                        : Xqedii_3jpofqxzbh0x5(String.valueOf(var2.runtimeFunctions.keySet()))
                  )
               );
            return Collections.emptyList();
         } else {
            List var7 = this.copyBlocks(
               var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B")) instanceof List var8 ? var8 : null
            );
            if (var7 != null && !var7.isEmpty()) {
               LinkedHashMap var15 = new LinkedHashMap();
               Object var16 = var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sz96n1iR2wnFedxq7RaFj/LCkY5pJF8mHMj5Os8A5v2ObKgmQguDWg=="));
               if (var16 instanceof Map var10) {
                  for (Entry var13 : (Iterable<Entry>) (var10.entrySet())) {

                     var15.put(String.valueOf(var13.getKey()), this.resolveRuntimeActionValue(var1, this.stringValue(var13.getValue())));
                  }
               } else if (var16 instanceof List) {
                  for (Object var22 : (List)var16) {
                     var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-608637245, 24)];
                     var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1676438812, 5)] = this.stringValue(var22);
                     String var14 = this.firstNonBlank(var10001).trim();
                     if (!var14.isBlank()) {
                        var15.put(var14, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
                     }
                  }
               }

               if ((
                  var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("I3RXY/TmDXT1L4Hg3NiRQQJ9nG0irBpAC8FGj0n1btvcur2uCA+OS+3aXTeNPA==")) == null
                     ? var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("PG6zhkjOAkHP/yNmAwlHOCOEl8t4KxFWtifrAxrpCbozdqyx"))
                     : var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("I3RXY/TmDXT1L4Hg3NiRQQJ9nG0irBpAC8FGj0n1btvcur2uCA+OS+3aXTeNPA=="))
               ) instanceof Map var18) {
                  for (Entry var23 : (Iterable<Entry>) (var18.entrySet())) {

                     var15.put(String.valueOf(var23.getKey()), this.resolveRuntimeActionValue(var1, this.stringValue(var23.getValue())));
                  }
               }

               List var19 = var15.isEmpty() ? var7 : this.Xqedii_1xfimqc(var7, var15);
               this.debugScript(Xqedii_3aftphwxpwze4(var5, String.valueOf(var15), String.valueOf(var19)));
               return var19;
            } else {
               this.debugScript(Xqedii_z27mmwy22ke0(var5));
               return Collections.emptyList();
            }
         }
      } else {
         return Collections.emptyList();
      }
   }

   public List<Map<String, Object>> Xqedii_1xfimqc(List<Map<String, Object>> var1, Map<String, String> var2) {
      if ((577758822 * 577758822 - 577758822 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList(var1.size());

         for (Map var5 : var1) {
            var3.add(this.Xqedii_3aat2oy(var5, var2));
         }

         return var3;
      }
   }

   public Map<String, Object> Xqedii_3aat2oy(Map<String, Object> var1, Map<String, String> var2) {
      if ((-787602815 * -787602815 - -787602815 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap();
         if (var1 == null) {
            return var3;
         } else {
            for (Entry var5 : var1.entrySet()) {
               Object var6 = var5.getValue();
               if (var6 instanceof String var7) {
                  var3.put((String)var5.getKey(), this.Xqedii_uvouuxx(var7, var2));
               } else if (var6 instanceof Map var8) {
                  var3.put((String)var5.getKey(), this.Xqedii_3aat2oy(var8, var2));
               } else if (!(var6 instanceof List var9)) {
                  var3.put((String)var5.getKey(), var6);
               } else {
                  ArrayList var10 = new ArrayList(var9.size());

                  for (Object var12 : var9) {
                     if (var12 instanceof String var13) {
                        var10.add(this.Xqedii_uvouuxx(var13, var2));
                     } else if (var12 instanceof Map var14) {
                        var10.add(this.Xqedii_3aat2oy(var14, var2));
                     } else {
                        var10.add(var12);
                     }
                  }

                  var3.put((String)var5.getKey(), var10);
               }
            }

            return var3;
         }
      }
   }

   public String Xqedii_uvouuxx(String var1, Map<String, String> var2) {
      if ((1602495207 * 1602495207 + 1602495207 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.indexOf(Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1828139405, 16)) >= 0) {
         String var3 = var1;

         for (Entry var5 : var2.entrySet()) {
            String var6 = Xqedii_216bna7p9dd98((String)var5.getKey());
            if (var3.contains(var6)) {
               var3 = var3.replace(
                  var6,
                  (CharSequence)(var5.getValue() == null
                     ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==")
                     : (CharSequence)var5.getValue())
               );
            }
         }

         return var3;
      } else {
         return var1;
      }
   }

   public HoverElement findHoveredRuntimeElement(EditorSession var1, double var2, double var4) {
      if ((861857740 * (861857740 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.elements != null && !var1.elements.isEmpty()) {
         HoverElement var6 = null;

         for (HoverElement var8 : var1.elements) {
            if (var8 != null && var8.baseLocation != null && !var8.disableHitbox) {
               EditorRect var9 = this.getHoverBounds(var1, var8);
               if (var9 != null) {
                  double var10 = var9.x;
                  double var12 = var9.y;
                  double var14 = var9.maxX();
                  double var16 = var9.maxY();
                  if (var2 >= var10 && var2 <= var14 && var4 >= var12 && var4 <= var16 && (var6 == null || var8.runtimeZ >= var6.runtimeZ)) {
                     var6 = var8;
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   public List<String> resolveActionTargetCandidates(EditorSession var1, HoverElement var2) {
      if (((-450061002 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         if (var2 == null) {
            return new ArrayList<>();
         } else {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(747450765, 30)];
            var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 17)] = this.targetIdOf(var2);
            var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 16)] = var2.targetId;
            String var4 = this.firstNonBlank(var10001);
            if (!var4.isBlank()) {
               var3.add(var4);
            }

            var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053216695, 9)];
            var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1838133685, 31)] = var2.targetPath;
            String var5 = this.firstNonBlank(var10001);
            this.collectActionTargetIdsForPath(var1, var5, var3);
            String var6 = var5;

            while (!var6.isBlank()) {
               var6 = this.trimTrailingChildrenPathSegment(var6);
               if (var6.isBlank()) {
                  break;
               }

               this.collectActionTargetIdsForPath(var1, var6, var3);
            }

            return new ArrayList<>(var3);
         }
      }
   }

   public List<String> resolveActionTargetPathCandidates(HoverElement var1) {
      if (((-1801595758 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1 == null) {
            return new ArrayList<>();
         } else {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 24)];
            var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(959334849, 17)] = var1.targetPath;

            for (String var3 = this.firstNonBlank(var10001); !var3.isBlank(); var3 = this.trimTrailingChildrenPathSegment(var3)) {
               var2.add(var3);
            }

            return new ArrayList<>(var2);
         }
      }
   }

   public List<Map<String, Object>> resolveRuntimeActionsByTargetPath(EditorSession var1, String var2) {
      if ((-2050988837 * -2050988837 + -2050988837 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Map var3 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         if (var3 == null) {
            return Collections.emptyList();
         } else if (var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B")) instanceof List var5) {
            ArrayList var6 = new ArrayList();

            for (Object var8 : var5) {
               Map var9 = this.toStringObjectMap(var8);
               if (var9 != null && !var9.isEmpty()) {
                  this.normalizeActionMapForEditor(var9);
                  var6.add(var9);
               }
            }

            var3.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"), var6);
            return var6;
         } else {
            return Collections.emptyList();
         }
      } else {
         return Collections.emptyList();
      }
   }

   public void collectActionTargetIdsForPath(EditorSession var1, String var2, LinkedHashSet<String> var3) {
      if (((1917301244 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var3 != null && var2 != null && !var2.isBlank() && var1.elements != null) {
         for (HoverElement var5 : var1.elements) {
            if (var5 != null) {
               String[] var10002 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 4)];
               var10002[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1910343605, 1)] = var5.targetPath;
               if (var2.equals(this.firstNonBlank(var10002))) {
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821127053, 16)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 20)] = this.targetIdOf(var5);
                  var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(517850998, 19)] = var5.targetId;
                  String var6 = this.firstNonBlank(var10001);
                  if (!var6.isBlank()) {
                     var3.add(var6);
                  }
               }
            }
         }
      }
   }

   public String trimTrailingChildrenPathSegment(String var1) {
      if (((-837473139 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1918931842, 18)];
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 17)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         } else {
            int var3 = var2.lastIndexOf(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("XKIpAALq2ontxrKZHCjCwuWssL3KNAeq4banqhhuroMseBHu00gIHa6fj0ltBcW8"));
            if (var3 < 0) {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            } else {
               String var4 = var2.substring(
                  var3 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("XKIpAALq2ontxrKZHCjCwuWssL3KNAeq4banqhhuroMseBHu00gIHa6fj0ltBcW8").length()
               );
               if (var4.isBlank()) {
                  return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
               } else {
                  for (int var5 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001453230, 6); var5 < var4.length(); var5++) {
                     if (!Character.isDigit(var4.charAt(var5))) {
                        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
                     }
                  }

                  return var2.substring(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-663005411, 13), var3);
               }
            }
         }
      }
   }

   public static String normalizeKeybindId(String var0) {
      if ((867086009 ^ 867086009) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0 == null ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==") : var0.trim().toUpperCase(Locale.ROOT);
         if (var1.isEmpty()) {
            return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         } else {
            var1 = var1.replace((char)Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923584873, 9), (char)Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923690857, 11))
               .replace((char)Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-526597084, 8), (char)Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(164586062, 12))
               .replace((char)Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1820167460, 2), (char)Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-326291046, 30));

            while (var1.contains(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("uqf/NdIIFCnzbrNxeAXMDnYOQshnKpBqBorK93aHXg4="))) {
               var1 = var1.replace(
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("uqf/NdIIFCnzbrNxeAXMDnYOQshnKpBqBorK93aHXg4="),
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("m/4ursGbUHmNQcpLk5065l8MKV021z9fYUKlic8C")
               );
            }

            int var2 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(618699927, 0);
            if (var1.startsWith(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("2LHzXfg8svzfAaua5jg6RF1PWUMpP3SMazuh/beKcky5MwEr8WP50w=="))) {
               var2 = Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923590505, 14);
               var1 = var1.substring(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("2LHzXfg8svzfAaua5jg6RF1PWUMpP3SMazuh/beKcky5MwEr8WP50w==").length());
            }

            if (!var1.isEmpty() && Xqedii_32wtmt4.contains(var1)) {
               return var2 != 0 ? Xqedii_1f01m2zv8v9ni(var1) : var1;
            } else {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            }
         }
      }
   }

   public Map<String, List<Map<String, Object>>> parsePageKeybinds(YamlConfiguration var1) {
      if ((436801269 * 436801269 - 436801269 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap<String, List<Map<String, Object>>> var2 = new LinkedHashMap<>();
         if (var1 == null) {
            return var2;
         } else {
            List var3 = var1.getList(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8dyXT3tMTrGOPT+XbWZ+DGU5UscialTG7XQ3HGBwFQTGy6vhuAomHHOvAR8="));
            if (var3 != null) {
               for (Object var12 : var3) {
                  if (var12 instanceof Map var13) {
                     String var14 = normalizeKeybindId(
                        this.stringValue(var13.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("DoU/IXKu2AHd1r3tr1EKVrDqnqw504Pvxn2GKIdq7itAWg==")))
                     );
                     if (!var14.isBlank()) {
                        List var15 = this.copyBlocks(
                           var13.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B")) instanceof List var17
                              ? var17
                              : null
                        );
                        if (var15 != null && !var15.isEmpty()) {
                           var2.computeIfAbsent(var14, var0 -> {
                              if (((2019220177 | 1) & 1) == 0) {
                                 throw new IllegalStateException();
                              } else {
                                 return new ArrayList();
                              }
                           }).addAll(var15);
                        }
                     }
                  }
               }

               return var2;
            } else {
               ConfigurationSection var4 = var1.getConfigurationSection(
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8dyXT3tMTrGOPT+XbWZ+DGU5UscialTG7XQ3HGBwFQTGy6vhuAomHHOvAR8=")
               );
               if (var4 == null) {
                  return var2;
               } else {
                  for (String var6 : var4.getKeys((Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1918669698, 18) != 0))) {
                     String var7 = normalizeKeybindId(var6);
                     if (!var7.isBlank()) {
                        Object var8 = var4.get(var6);
                        if (var8 instanceof Map var9) {
                           var8 = var9.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"));
                        } else if (var8 instanceof ConfigurationSection var10) {
                           var8 = var10.getList(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"));
                        }

                        List var16 = this.copyBlocks(var8 instanceof List var18 ? var18 : null);
                        if (var16 != null && !var16.isEmpty()) {
                           var2.computeIfAbsent(var7, var0 -> {
                              if (((-1170338001 << 1 | 1) & 1) == 0) {
                                 throw new IllegalStateException();
                              } else {
                                 return new ArrayList();
                              }
                           }).addAll(var16);
                        }
                     }
                  }

                  return var2;
               }
            }
         }
      }
   }

   public boolean hasRuntimeKeybinds(Player var1) {
      if ((918943769 * 918943769 + 918943769 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(618699927, 0) != 0);
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         return ((var2 != null && !var2.editMode && !var2.runtimeKeybinds.isEmpty()
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 11)
            : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 27)) != 0);
      }
   }

   public boolean handleRuntimeKeybind(Player var1, String var2) {
      if ((354869737 ^ 354869737) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         String var3 = normalizeKeybindId(var2);
         if (var3.isBlank()) {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1309264242, 4) != 0);
         } else {
            EditorSession var4 = this.editorSessions.get(var1.getUniqueId());
            if (var4 != null && !var4.editMode) {
               List var5 = var4.runtimeKeybinds.get(var3);
               if (var5 != null && !var5.isEmpty()) {
                  long var6 = this.beginRuntimeActionChain(var4);
                  this.executeRuntimeTargetActions(var1, var4, var6, var5, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 24));
                  return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(890019689, 25) != 0);
               } else {
                  return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 21) != 0);
               }
            } else {
               return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 22) != 0);
            }
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 11) != 0);
      }
   }

   @Override
   public boolean clickHoveredElement(Player var1, GuiService.ClickType var2) {
      if ((-1179683227 * -1179683227 + -1179683227 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1250828921, 25) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && !var3.editMode && this.isEditorMenuSession(var3)) {
            return this.handleEditorMenuClick(var1, var3, var2);
         } else if (var3 != null && !var3.editMode) {
            return this.handleRuntimeGuiActionClick(var1, var3, var2);
         } else {
            if (var3 != null && var3.editMode && var3.previewMode) {
               double var4 = var3.cursorX + var3.hitboxOffsetX;
               double var6 = var3.cursorY + var3.hitboxOffsetY;
               if (this.handleCursorPageDropdownClick(var1, var3, var2, var4, var6)) {
                  return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-662997219, 13) != 0);
               }

               if (this.handleCursorLayersDropdownClick(var1, var3, var2, var4, var6)) {
                  return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923541353, 15) != 0);
               }

               if (this.handleActivePagesClick(var1, var3, var2, var4, var6)) {
                  return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 27) != 0);
               }
            }

            return super.clickHoveredElement(var1, var2);
         }
      }
   }

   public boolean handleRuntimeGuiActionClick(Player var1, EditorSession var2, GuiService.ClickType var3) {
      if (((-2024298046 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null) {
         long var4 = Xqedii_38o2zes.Xqedii_316oplq();
         if (var3 == GuiService.ClickType.LEFT && var2.previewPanActive) {
            if (var4 - var2.lastLeftClickTick <= Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-8805441006732264718L, 51)) {
               var2.lastLeftClickTick = var4;
               return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923705193, 17) != 0);
            }

            var2.previewPanActive = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 27) != 0);
            this.animatePreviewPanBackToBounds(var1, var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
         }

         if (var3 == GuiService.ClickType.LEFT
            && var2.runtimeZoomPanRequireSneak
            && this.isRuntimeZoomPanAllowed(var1, var2)
            && this.beginRuntimeZoomPan(var1, var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY, var4)) {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(942089737, 6) != 0);
         } else {
            if (var3 == GuiService.ClickType.LEFT) {
               int var6 = var4 - var2.lastLeftClickTick <= Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721335577244578030L, 44)
                  ? Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573865, 8)
                  : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-625414461, 24);
               if (var2.runtimeActionAwaitingLeftRelease) {
                  if (var6 != 0) {
                     var2.lastLeftClickTick = var4;
                     return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573097, 10) != 0);
                  }

                  var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 10) != 0);
               }
            }

            if (var2.runtimeActionChainLocked) {
               return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 22) != 0);
            } else {
               double var19 = var2.cursorX + var2.hitboxOffsetX;
               double var8 = var2.cursorY + var2.hitboxOffsetY;
               HoverElement var10 = this.findHoveredRuntimeElement(var2, var19, var8);
               if (var3 == GuiService.ClickType.LEFT) {
                  int var11 = var4 - var2.lastLeftClickTick <= Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-7000650817726817009L, 48)
                     ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 14)
                     : Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-915255799, 20);
                  if (this.isSkinMouseSpinActive(var2) && var11 == 0) {
                     this.stopSkinMouseSpin(var1, var2);
                  }

                  if (this.isSkinMouseSpinActive(var2)) {
                     var2.lastLeftClickTick = var4;
                     this.updateSkinMouseSpinDrag(var1, var2, var19, var8);
                     return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1884179474, 7) != 0);
                  }

                  if (this.beginSkinMouseSpin(var2, var10, var19, var8)) {
                     var2.lastLeftClickTick = var4;
                     return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 30) != 0);
                  }
               }

               UltimateUIBlockClickEvent.ClickType var20 = var3 == GuiService.ClickType.LEFT
                  ? UltimateUIBlockClickEvent.ClickType.LEFT
                  : UltimateUIBlockClickEvent.ClickType.RIGHT;
               if (this.fireRuntimeClickEvent(var1, var2, var10, var20)) {
                  if (var3 == GuiService.ClickType.LEFT) {
                     var2.lastLeftClickTick = var4;
                     var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1998444667, 29) != 0);
                  }

                  return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2108814903, 28) != 0);
               } else if (var10 == null) {
                  this.debugScript(Xqedii_26ju2ua3qi1uf(var19, var8));
                  return ((var3 == GuiService.ClickType.LEFT && this.beginRuntimeZoomPan(var1, var2, var19, var8, var4)
                     ? Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(655138665, 28)
                     : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1034653420, 20)) != 0);
               } else {
                  if (var10.clickEffect != null && !var10.clickEffect.isBlank()) {
                     String[] var10004 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 23)];
                     var10004[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 6)] = var10.targetId;
                     this.applyClickEffectForTarget(var1, var2, this.firstNonBlank(var10004), var10.clickEffect);
                  }

                  if (var3 == GuiService.ClickType.LEFT && this.handleRuntimeInputClick(var1, var2, var10, var4)) {
                     return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(959465921, 17) != 0);
                  } else {
                     List var12 = this.resolveActionTargetPathCandidates(var10);
                     this.debugScript(Xqedii_1z4h83tk8kjbu(var10.targetId, var10.id, String.valueOf(var12)));

                     for (String var14 : (Iterable<String>) (var12)) {

                        List var15 = this.resolveRuntimeActionsByTargetPath(var2, var14);
                        if (var15 != null && !var15.isEmpty()) {
                           this.debugScript(Xqedii_pn9bg82hxi4d(var14, var15.size()));
                           long var16 = this.beginRuntimeActionChain(var2);
                           if (var3 == GuiService.ClickType.LEFT) {
                              var2.lastLeftClickTick = var4;
                              var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1325994437, 14) != 0);
                           }

                           this.executeRuntimeTargetActions(var1, var2, var16, var15, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 9));
                           return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 6) != 0);
                        }
                     }

                     List var21 = this.resolveActionTargetCandidates(var2, var10);
                     this.debugScript(Xqedii_2jms8e9x143zg(String.valueOf(var21)));

                     for (String var23 : (Iterable<String>) (var21)) {

                        List var24 = this.resolveTargetActionsRawList(var2, var23, (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 12) != 0));
                        if (var24 != null && !var24.isEmpty()) {
                           this.debugScript(Xqedii_3g6jmuouml4zy(var23, var24.size()));
                           long var17 = this.beginRuntimeActionChain(var2);
                           if (var3 == GuiService.ClickType.LEFT) {
                              var2.lastLeftClickTick = var4;
                              var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1860418319, 26) != 0);
                           }

                           this.executeRuntimeTargetActions(var1, var2, var17, var24, Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1820167588, 2));
                           return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 26) != 0);
                        }
                     }

                     return ((var3 == GuiService.ClickType.LEFT && this.beginRuntimeZoomPan(var1, var2, var19, var8, var4)
                        ? Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2071403992, 21)
                        : Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-526608604, 8)) != 0);
                  }
               }
            }
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311846, 0) != 0);
      }
   }

   public boolean handleRuntimeInputClick(Player var1, EditorSession var2, HoverElement var3, long var4) {
      if (((1259647209 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         for (String var7 : this.resolveActionTargetPathCandidates(var3)) {
            Map var8Raw = this.resolveRuntimeInputDefinition(var2, var7, var3.id);
            if (var8Raw != null) {
               Map var8 = this.withRuntimeInputId(var8Raw, var3.id);
               long var10 = this.beginRuntimeActionChain(var2);
               var2.lastLeftClickTick = var4;
               var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2071403992, 21) != 0);
               this.openRuntimeTextInput(
                  var1,
                  var2,
                  var10,
                  var8,
                  () -> {
                     if ((841038306 * 841038306 - 841038306 & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        ArrayList var6 = new ArrayList<>(
                           this.readActionBranch(var8, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Vg1Ysuy0Brgyrm0bv7rgAaXWXFBY4o2JfNW8CA8iMtflMgQT/thO5CzRRiI72Q=="))
                        );
                        var6.addAll(
                           this.readActionBranch(var8, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"))
                        );
                        this.executeRuntimeTargetActions(var1, var2, var10, var6, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 17));
                     }
                  }
               );
               return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923311977, 18) != 0);
            }
         }

         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 0) != 0);
      }
   }

   public Map<String, Object> resolveRuntimeInputDefinition(EditorSession var1, String var2, String var3) {
      if (((-1845450 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var4 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         if (var4 != null
            && this.isRuntimeInputType(this.stringValue(var4.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5fZ6YJ9DnetXPf36MNJ6U1/oUxZosdLRrGuACACpyiBVNOFP"))))) {
            return var4;
         } else {
            for (Map var6 : var1.renderBlocks) {
               if (this.isRuntimeInputType(this.stringValue(var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5fZ6YJ9DnetXPf36MNJ6U1/oUxZosdLRrGuACACpyiBVNOFP"))))
                  )
                {
                  String var7 = this.stringValue(
                     var6.get(
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NspoE7CEqwyPkT7z+htrfxq4kg6ghjcGb5jGpWdDVv2b/rN/GlYr4OQusqyxDib5G22RPRq1XT/ccJFJS/AVHR+pQ4I=")
                     )
                  );
                  if (var2.equals(var7)
                     && (
                        var3 == null
                           || var3.equals(this.stringValue(var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))))
                     )) {
                     return var6;
                  }
               }
            }

            return null;
         }
      }
   }

   public boolean isRuntimeInputType(String var1) {
      if ((-1294731106 * (-1294731106 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(654632129, 3)];
         var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 26)] = var1;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         int var3 = Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-923574122, 24);
         switch (var2.hashCode()) {
            case 100358090:
               if (var2.equals(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("WYXdNX3HCcoADSOOpN+0tVN4P2KxzkGrmZdsIBgjggGMxIOjd9w="))) {
                  var3 = Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 5);
               }
               break;
            case 470718913:
               if (var2.equals(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("KzmApYhojAzaEXQjYT4pjayNjSj4ak+YPCanclb08DzGE9HG4RJh2CXQRb0="))) {
                  var3 = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1837969805, 23);
               }
               break;
            case 1705792840:
               if (var2.equals(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+eE1Q7dDONiI3SjNEfa1LVfipbPizW63c34OTBinwr/0M229n7HVS6CZDbzhLQ=="))) {
                  var3 = 2;
               }
               break;
            case 1707282390:
               if (var2.equals(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("x/oH4+TzABhLP6x2KyuCxTOR3sHsqutPEQTT7AVNwB5+68DhIhMA/iXrVTneEg=="))) {
                  var3 = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821193613, 10);
               }
         }
         return (switch (var3) {
            case 0, 1, 2, 3 -> true;
            default -> false;
         });
      }
   }

   public String runtimeInputId(Map<String, Object> var1, String var2) {
      if (((-417666772 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(929865577, 20)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906460, 7)] = this.stringValue(
            var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("TIf/K66uYB/glXzb+xSf/43zhx1LlW1kuq1mR/uV9lpIdoPq8q8UJ/h1m1c="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574249, 7)] = this.stringValue(
            var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Ma/FCecjHekRQXsoKs4A6XbXxUvM/dUj9I/JSzpyd9Uh3JIkLr9daEh3"))
         );
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1032556268, 20)] = this.stringValue(
            var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192621, 4)] = this.stringValue(
            var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ZQn50aATjXmsbBDOFp0QbL1pxAGmNnBUm8NXw2xWjCns1Xt7izUyw6mnf+g="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573609, 7)] = this.stringValue(
            var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7uWEmAzB0TJXuPQ7yioCxiYc431trfs+VC+xBjrg5C5/H1Wl"))
         );
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-135382096, 22)] = var2;
         return this.firstNonBlank(var10001).trim();
      }
   }

   public Map<String, Object> withRuntimeInputId(Map<String, Object> var1, String var2) {
      if ((2131157122 * 2131157122 - 2131157122 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap(var1);
         var3.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("TIf/K66uYB/glXzb+xSf/43zhx1LlW1kuq1mR/uV9lpIdoPq8q8UJ/h1m1c="), this.runtimeInputId(var1, var2));
         String var10001 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("znr/g6wf0tZLoaaw4+Yqust52ZP8c8pxwnA4i1Mp0tJdLWv6eDkLxzcyBvtZzh3t/G3YQpt/0qP31sjj/Kqr7msc");
         String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(656804152, 14)];
         var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-919066843, 30)] = var2;
         var3.put(var10001, this.firstNonBlank(var10003).trim());
         return var3;
      }
   }

   public String runtimeInputElementKey(Map<String, Object> var1, String var2) {
      if ((1671376386 ^ 1671376386) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1822241165, 20)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-625414461, 24)] = this.stringValue(
            var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("znr/g6wf0tZLoaaw4+Yqust52ZP8c8pxwnA4i1Mp0tJdLWv6eDkLxzcyBvtZzh3t/G3YQpt/0qP31sjj/Kqr7msc"))
         );
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560163, 3)] = var2;
         return this.firstNonBlank(var10001).trim();
      }
   }

   public void openRuntimeTextInput(Player var1, EditorSession var2, long var3, Map<String, Object> var5, Runnable var6) {
      if ((1050936603 * (1050936603 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var5 != null && this.plugin.anvilInput() != null) {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-574130658, 27)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-312707231, 23)] = var2.pageName;
         String var7 = this.firstNonBlank(var10001);
         String var8 = this.runtimeInputId(var5, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("WYXdNX3HCcoADSOOpN+0tVN4P2KxzkGrmZdsIBgjggGMxIOjd9w="));
         var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-456579324, 19)];
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 2)] = this.stringValue(
            var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ZQn50aATjXmsbBDOFp0QbL1pxAGmNnBUm8NXw2xWjCns1Xt7izUyw6mnf+g="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(309349964, 31)] = var8;
         String var9 = this.firstNonBlank(var10001).trim();
         String var10 = this.runtimeInputElementKey(var5, var8);
         String var10000;
         if (var2.runtimeVariables.containsKey(var9)) {
            var10000 = var2.runtimeVariables.get(var9);
         } else if (var2.runtimeVariables.containsKey(var8)) {
            var10000 = var2.runtimeVariables.get(var8);
         } else {
            String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-663021795, 13)];
            var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 6)] = this.stringValue(
               var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("W8KV+RToCsk4iORh/Mrfouq309sDjhYxsovNkdvoXaPx5p7N9jt0urdS"))
            );
            var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 13)] = this.stringValue(
               var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Rj399dBd2x9tnxEBI6azUN6KvDlJajFjoIAexcx97I9oLvxs1AY="))
            );
            var10000 = this.resolveRuntimeActionValue(var1, this.firstNonBlank(var10003));
         }

         String var11 = var10000;
         String[] var20 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(789356393, 27)];
         var20[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(633944103, 22)] = this.stringValue(
            var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mrjrj07vGtY4hTaEjNexdBtFxkzkoNQwFLGej5GBmLnHwpmtt54="))
         );
         var20[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(82100519, 11)] = this.stringValue(
            var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sEvkVbZoOkoXFl8RxltJDON/MNUl1O4rnPRDpJE58O+8wMLpqbIcEw=="))
         );
         var20[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(906796905, 23)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
            "CZ3c+UirbnRtBERf/kiiK3Y3HzZUcnsGTPqCqtJQnDxqbmELgaComz/p0PoWlkHe"
         );
         String var12 = this.resolveRuntimeActionValue(var1, this.firstNonBlank(var20));
         int var13 = this.runtimeInputLength(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+SWqH3iXMllRjO688Ag9cS1c/LYyggEWQLu8LtAKVCz9IfqJ6da+8LUqts7e4oM3")));
         boolean var14 = !Boolean.FALSE
                  .equals(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mLQLaZs8G4vHOuAUhvCJlVv0o+WWRqp8lRzUU4pCwrycYLDuyYHqAeMN4uSEkj/vuL0=")))
               && !Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7nWA+IsAXuFHoWkwVlyH1zZbGp3eiskZ2FOOXoI8nHvGQe+UpxI=")
                  .equalsIgnoreCase(
                     this.stringValue(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mLQLaZs8G4vHOuAUhvCJlVv0o+WWRqp8lRzUU4pCwrycYLDuyYHqAeMN4uSEkj/vuL0=")))
                  );
         Runnable var15 = () -> {
            if (((1957328602 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               if (this.isRuntimeInputSessionCurrent(var1, var2, var3, var7)) {
                  this.clearRuntimeInputDraft(var2, var10);
                  this.renderPage(var1, var2, this.inputDrivesFilter(var2, var8, var9));
                  List var10x = this.readActionBranch(
                     var5, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7/4+jsmsl6vOHHTGlOJbEZU7vl6I7AwJOgffb8H88ypU6ukBe65/LccGk95g4g==")
                  );
                  this.executeRuntimeTargetActions(var1, var2, var3, var10x, Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 17));
               } else {
                  this.finishRuntimeActionChain(var2, var3);
               }
            }
         };
         var2.runtimeVariables.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("YbplH4C9AU4fHcPl3pw1qnW9VWHqg4XfIeKaOyqE5wQETfZ/akGpSzsXhvyEu74wRpX9nHQ0zZM="), var10);
         var2.runtimeVariables
            .put(Xqedii_11oypl9zfw6e9(var10), var11 == null ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==") : var11);
         var2.focusedInputElementId = var8;
         var2.focusedInputRuntimeKey = var10;
         var2.focusedInputLastChangeTick = Xqedii_38o2zes.Xqedii_316oplq();
         this.renderPage(var1, var2, this.inputDrivesFilter(var2, var8, var9));
         AnvilInputRequest var16 = AnvilInputRequest.builder()
            .title(var12)
            .initial(var11)
            .maxLength(var13)
            .filter(this.stringValue(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("nsaiKrDnlfjHVgko7s/k3a9Xb7Mai5nZunGW69MW9og/pL0rlhvzpQ=="))))
            .allowEmpty(var14)
            .closeOnClick(
               ((!Boolean.FALSE
                     .equals(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("iuRNvsnlCKYmMx7mKcEAovV1Kbb5wTF/j0w6FpXRKMXCRSvPxUpaKDfgXscT3tG+nfDx0dVAy2I=")))
                  ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(942089737, 6)
                  : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 1)) != 0)
            )
            .closeOnMax(
               Boolean.TRUE.equals(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("i/7pSBQPJ0IiaxKnSklPphmyMSkO470gGkXGpiHvMZUwnBHGVX8iSLUR9useTgT6rIWYtg==")))
            )
            .idleTimeoutTicks(
               this.runtimeInputTimeout(
                  var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ej+GBNETYzqMd+w171cArKXdkFDqUdM8Pdj2PMnPA6Dv02orAUjnJjCY3tbYHAuXpdpA7Cxc2xs1l7O6i9Ctqg=="))
               )
            )
            .commitEditsOnEscape((Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1620279922, 26) != 0))
            .onChange(var10x -> {
               if ((22316036 * 22316036 - 22316036 & 1) != 0) {
                  throw new IllegalStateException();
               } else if (this.isRuntimeInputSessionCurrent(var1, var2, var3, var7)) {
                  String var11x = this.limitRuntimeInputText(var10x, var13);
                  var2.runtimeVariables.put(Xqedii_2lwjt0d5o2jwo(var10), var11x);
                  var2.focusedInputLastChangeTick = Xqedii_38o2zes.Xqedii_316oplq();
                  this.renderPage(var1, var2, this.inputDrivesFilter(var2, var8, var9));
               }
            })
            .onCommit(
               var15x -> {
                  if ((-486542044 * -486542044 - -486542044 & 1) != 0) {
                     throw new IllegalStateException();
                  } else if (!this.isRuntimeInputSessionCurrent(var1, var2, var3, var7)) {
                     this.finishRuntimeActionChain(var2, var3);
                  } else {
                     String var16x = this.limitRuntimeInputText(var15x, var13);
                     if (!var14 && var16x.isBlank()) {
                        var15.run();
                     } else {
                        var2.lastLeftClickTick = Xqedii_38o2zes.Xqedii_316oplq();
                        var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 0) != 0);
                        UltimateUIInputSubmitEvent var17 = new UltimateUIInputSubmitEvent(var1, var7, var8, var9, var11, var16x);
                        Bukkit.getPluginManager().callEvent(var17);
                        if (!this.isRuntimeInputSessionCurrent(var1, var2, var3, var7)) {
                           this.finishRuntimeActionChain(var2, var3);
                        } else {
                           var16x = this.limitRuntimeInputText(
                              InputFilter.fromId(
                                    this.stringValue(var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("nsaiKrDnlfjHVgko7s/k3a9Xb7Mai5nZunGW69MW9og/pL0rlhvzpQ==")))
                                 )
                                 .sanitize(var17.getValue()),
                              var13
                           );
                           if (!var17.isCancelled() && (var14 || !var16x.isBlank())) {
                              var2.runtimeVariables.put(var8, var16x);
                              var2.runtimeVariables.put(var9, var16x);
                              this.clearRuntimeInputDraft(var2, var10);
                              this.renderPage(var1, var2, this.inputDrivesFilter(var2, var8, var9));
                              if (this.isRuntimeInputSessionCurrent(var1, var2, var3, var7)) {
                                 var6.run();
                              } else {
                                 this.finishRuntimeActionChain(var2, var3);
                              }
                           } else {
                              this.clearRuntimeInputDraft(var2, var10);
                              this.renderPage(var1, var2, this.inputDrivesFilter(var2, var8, var9));
                              this.finishRuntimeActionChain(var2, var3);
                           }
                        }
                     }
                  }
               }
            )
            .onCancel((var8x, var9x, var10x) -> {
               if ((1525576819 * 1525576819 + 1525576819 & 1) != 0) {
                  throw new IllegalStateException();
               } else if (var10x != InputCloseReason.PROGRAMMATIC && var10x != InputCloseReason.DISCONNECT) {
                  if (var10x == InputCloseReason.CLICK && this.isRuntimeInputSessionCurrent(var1, var2, var3, var7)) {
                     var2.lastLeftClickTick = Xqedii_38o2zes.Xqedii_316oplq();
                     var2.runtimeActionAwaitingLeftRelease = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574123, 1) != 0);
                  }

                  var15.run();
               } else {
                  if (var2.runtimeActionChainToken == var3) {
                     this.clearRuntimeInputDraft(var2, var10);
                  }

                  this.finishRuntimeActionChain(var2, var3);
               }
            })
            .build();

         try {
            if (this.plugin.anvilInput().open(var1, var16) != null) {
               return;
            }
         } catch (RuntimeException var18) {
            this.plugin.getLogger().warning(Xqedii_14yoau2ljvw71(var8, var18.getMessage()));
         }

         this.clearRuntimeInputDraft(var2, var10);
         this.renderPage(var1, var2, this.inputDrivesFilter(var2, var8, var9));
         this.finishRuntimeActionChain(var2, var3);
      } else {
         this.finishRuntimeActionChain(var2, var3);
      }
   }

   public boolean inputDrivesFilter(EditorSession var1, String var2, String var3) {
      if ((636715841 * 636715841 - 636715841 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 == null || !var1.scrollViewState.usesFilter(var2) && !var1.scrollViewState.usesFilter(var3)
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 10)
            : Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(890019689, 25)) != 0);
      }
   }

   public void clearRuntimeInputDraft(EditorSession var1, String var2) {
      if ((-1193943402 ^ -1193943402) != 0) {
         throw new IllegalStateException();
      } else {
         if (var2.equals(
            var1.runtimeVariables.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("YbplH4C9AU4fHcPl3pw1qnW9VWHqg4XfIeKaOyqE5wQETfZ/akGpSzsXhvyEu74wRpX9nHQ0zZM="))
         )) {
            var1.runtimeVariables.remove(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("YbplH4C9AU4fHcPl3pw1qnW9VWHqg4XfIeKaOyqE5wQETfZ/akGpSzsXhvyEu74wRpX9nHQ0zZM="));
         }

         if (var2.equals(var1.focusedInputRuntimeKey)) {
            var1.focusedInputRuntimeKey = null;
            var1.focusedInputElementId = null;
         }

         if (var2.equals(var1.focusedInputElementId)) {
            var1.focusedInputElementId = null;
         }

         var1.runtimeVariables.remove(Xqedii_2khr8os0ogdqe(var2));
      }
   }

   public String limitRuntimeInputText(String var1, int var2) {
      if ((796120434 * 796120434 + 796120434 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var1 == null ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==") : var1;
         return var3.codePointCount(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1009075986, 16), var3.length()) <= var2
            ? var3
            : var3.substring(
               Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1416696771, 28), var3.offsetByCodePoints(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 6), var2)
            );
      }
   }

   public String getOpenUiInputValue(Player var1, String var2) {
      if ((1922618990 * 1922618990 + 1922618990 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && var2 != null) {
            String var4 = var2.trim();
            if (var3.runtimeVariables.containsKey(var4)) {
               return var3.runtimeVariables.get(var4);
            } else {
               String var5 = this.resolveOpenUiElementTargetPath(var3, var4);
               Map var6 = this.resolveRuntimeInputDefinition(var3, var5, var4);
               if (var6 == null) {
                  return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
               } else {
                  String var7 = this.runtimeInputId(var6, var4);
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331510898, 12)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 13)] = this.stringValue(
                     var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ZQn50aATjXmsbBDOFp0QbL1pxAGmNnBUm8NXw2xWjCns1Xt7izUyw6mnf+g="))
                  );
                  var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1998444667, 29)] = var7;
                  String var8 = this.firstNonBlank(var10001).trim();
                  String var10000;
                  if (var3.runtimeVariables.containsKey(var8)) {
                     var10000 = var3.runtimeVariables.get(var8);
                  } else if (var3.runtimeVariables.containsKey(var7)) {
                     var10000 = var3.runtimeVariables.get(var7);
                  } else {
                     String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1820668301, 19)];
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1416696771, 28)] = this.stringValue(
                        var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("W8KV+RToCsk4iORh/Mrfouq309sDjhYxsovNkdvoXaPx5p7N9jt0urdS"))
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 5)] = this.stringValue(
                        var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Rj399dBd2x9tnxEBI6azUN6KvDlJajFjoIAexcx97I9oLvxs1AY="))
                     );
                     var10000 = this.resolveRuntimeActionValue(var1, this.firstNonBlank(var10003));
                  }

                  return var10000;
               }
            }
         } else {
            return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         }
      }
   }

   public boolean setOpenUiInputValue(Player var1, String var2, String var3) {
      if ((-1502879297 ^ -1502879297) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var4 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var4 != null && !var4.editMode && var2 != null && !var2.isBlank()) {
            String var5 = this.resolveOpenUiElementTargetPath(var4, var2.trim());
            Map var6 = this.resolveRuntimeInputDefinition(var4, var5, var2.trim());
            if (var6 == null) {
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1250828921, 25) != 0);
            } else {
               String var7 = this.runtimeInputId(var6, var2);
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574249, 6)];
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311846, 0)] = this.stringValue(
                  var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ZQn50aATjXmsbBDOFp0QbL1pxAGmNnBUm8NXw2xWjCns1Xt7izUyw6mnf+g="))
               );
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23)] = var7;
               String var8 = this.firstNonBlank(var10001).trim();
               String var9 = this.limitRuntimeInputText(
                  InputFilter.fromId(
                        this.stringValue(var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("nsaiKrDnlfjHVgko7s/k3a9Xb7Mai5nZunGW69MW9og/pL0rlhvzpQ==")))
                     )
                     .sanitize(var3),
                  this.runtimeInputLength(var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+SWqH3iXMllRjO688Ag9cS1c/LYyggEWQLu8LtAKVCz9IfqJ6da+8LUqts7e4oM3")))
               );
               if (Boolean.FALSE.equals(var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mLQLaZs8G4vHOuAUhvCJlVv0o+WWRqp8lRzUU4pCwrycYLDuyYHqAeMN4uSEkj/vuL0=")))
                  && var9.isBlank()) {
                  return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 26) != 0);
               } else {
                  var4.runtimeVariables.put(var7, var9);
                  var4.runtimeVariables.put(var8, var9);
                  if (var7.equals(var4.focusedInputElementId) && this.plugin.anvilInput() != null) {
                     this.plugin.anvilInput().setText(var1, var9);
                  }

                  this.renderPage(var1, var4, this.inputDrivesFilter(var4, var7, var8));
                  return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574123, 1) != 0);
               }
            }
         } else {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(633944103, 22) != 0);
         }
      }
   }

   public boolean openOpenUiInput(Player var1, String var2) {
      if ((-1139218327 * (-1139218327 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && !var3.editMode && !var3.runtimeActionChainLocked && var2 != null && !var2.isBlank()) {
            String var4 = this.resolveOpenUiElementTargetPath(var3, var2.trim());
            Map var5 = this.resolveRuntimeInputDefinition(var3, var4, var2.trim());
            if (var5 == null) {
               return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 16) != 0);
            } else {
               Map var6 = this.withRuntimeInputId(var5, var2.trim());
               long var7 = this.beginRuntimeActionChain(var3);
               this.openRuntimeTextInput(
                  var1,
                  var3,
                  var7,
                  var6,
                  () -> {
                     if ((801251290 * (801251290 + 1) & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        ArrayList var6x = new ArrayList<>(
                           this.readActionBranch(var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Vg1Ysuy0Brgyrm0bv7rgAaXWXFBY4o2JfNW8CA8iMtflMgQT/thO5CzRRiI72Q=="))
                        );
                        var6x.addAll(
                           this.readActionBranch(var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GaUthDLa441WCbHYDVKC/XCsHdTjaLAdk8V7likozaE72N81DTjHDT7B"))
                        );
                        this.executeRuntimeTargetActions(var1, var3, var7, var6x, Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311846, 0));
                     }
                  }
               );
               return this.isRuntimeActionChainActive(var3, var7);
            }
         } else {
            return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 30) != 0);
         }
      }
   }

   public boolean isRuntimeInputSessionCurrent(Player var1, EditorSession var2, long var3, String var5) {
      if ((-1833338462 ^ -1833338462) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1.isOnline() && !var2.editMode && this.editorSessions.get(var1.getUniqueId()) == var2) {
            String[] var10002 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-474280082, 2)];
            var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 25)] = var2.pageName;
            if (var5.equals(this.firstNonBlank(var10002)) && this.isRuntimeActionChainActive(var2, var3)) {
               return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 5) != 0);
            }
         }

         return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 14) != 0);
      }
   }

   public int runtimeInputLength(Object var1) {
      if (((815714448 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            return Math.max(
               Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1742413668, 24),
               Math.min(Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192521, 2), Integer.parseInt(this.stringValue(var1)))
            );
         } catch (NumberFormatException var3) {
            return Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923459433, 13);
         }
      }
   }

   public int runtimeInputTimeout(Object var1) {
      if (((2125656285 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            return Math.max(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 4), Integer.parseInt(this.stringValue(var1)));
         } catch (NumberFormatException var3) {
            return Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1553171058, 26);
         }
      }
   }

   public boolean isRuntimeZoomPanAllowed(Player var1, EditorSession var2) {
      if ((2119602611 ^ 2119602611) != 0) {
         throw new IllegalStateException();
      } else if (this.isRuntimeZoomActive(var2) && var2.runtimeZoomPanEnabled) {
         return ((var2.runtimeZoomPanRequireSneak && (var1 == null || !var1.isSneaking())
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 10)
            : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(258925499, 18)) != 0);
      } else {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(959334849, 17) != 0);
      }
   }

   public boolean beginRuntimeZoomPan(Player var1, EditorSession var2, double var3, double var5, long var7) {
      if ((-176792983 * (-176792983 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.isRuntimeZoomPanAllowed(var1, var2)) {
         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 20) != 0);
      } else {
         var2.previewPanActive = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574113, 3) != 0);
         var2.previewPanStartCursorX = var3;
         var2.previewPanStartCursorY = var5;
         var2.previewPanStartX = var2.previewViewport.panX;
         var2.previewPanStartY = var2.previewViewport.panY;
         var2.lastLeftClickTick = var7;
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(517850998, 19) != 0);
      }
   }

   public double clampToViewportAxis(double var1, double var3, double var5) {
      if (((809326849 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Math.max(var3, Math.min(var3 + var5, var1));
      }
   }

   public boolean applyRuntimeZoomScroll(Player var1, EditorSession var2, int var3) {
      if ((1286169614 * (1286169614 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var3 != 0 && this.isRuntimeZoomActive(var2)) {
         double var4 = Math.pow(var2.runtimeZoomStep, Math.abs(var3));
         if (var3 > 0) {
            var4 = Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035297190218064L, 36)) / var4;
         }

         double var6 = var2.cursorX + var2.hitboxOffsetX;
         double var8 = var2.cursorY + var2.hitboxOffsetY;
         Entity var10 = this.hudService.getHud(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("R4hmJkBomRk4/5oF0EtmRc1dz6QKStdoEgAloVg279NVHOnK4KW4Fw=="));
         if (var10 != null) {
            Vector var11 = this.hudService.getHudLocation(var10);
            if (var11 != null) {
               var6 = var11.getX() + var2.hitboxOffsetX;
               var8 = var11.getY() + var2.hitboxOffsetY;
               var2.cursorX = var11.getX();
               var2.cursorY = var11.getY();
            }
         }

         var6 = this.clampToViewportAxis(var6, var2.previewViewport.previewX, var2.previewViewport.previewWidth);
         var8 = this.clampToViewportAxis(var8, var2.previewViewport.previewY, var2.previewViewport.previewHeight);
         if (!this.applyPreviewZoom(var2, var6, var8, var4)) {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-312707231, 23) != 0);
         } else {
            this.clampRuntimePanIntoBounds(var2);
            this.refreshPreviewProjection(var1, var2);
            HoverElement var15 = this.findHoveredRuntimeElement(var2, var2.cursorX + var2.hitboxOffsetX, var2.cursorY + var2.hitboxOffsetY);
            String var10000;
            if (var15 == null) {
               var10000 = null;
            } else {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923570025, 11)];
               var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 28)] = this.targetIdOf(var15);
               var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 18)] = var15.targetId;
               var10000 = this.firstNonBlank(var10001);
            }

            String var12 = var10000;
            if (!this.equalsNullable(var2.hoveredElementId, var12)) {
               this.updateHoveredHighlight(var1, var2, var2.hoveredElementId, var12);
               var2.hoveredElementId = var12;
            }

            return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 26) != 0);
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 10) != 0);
      }
   }

   @Override
   public void refreshRuntimeZoomProjection(Player var1, EditorSession var2) {
      if ((1553142733 * (1553142733 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.isRuntimeZoomActive(var2) && this.pageUsesViewFeatures(var2.rawBlocks)) {
         this.renderPage(var1, var2, (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1313608304, 15) != 0));
      } else {
         super.refreshRuntimeZoomProjection(var1, var2);
      }
   }

   public boolean fireRuntimeClickEvent(Player var1, EditorSession var2, HoverElement var3, UltimateUIBlockClickEvent.ClickType var4) {
      if (((778379643 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var4 != null) {
         String var10000;
         if (var3 == null) {
            var10000 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         } else {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1284383353, 25)];
            var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 24)] = var3.id;
            var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1009010450, 16)] = var3.targetId;
            var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821193613, 10)] = this.targetIdOf(var3);
            var10000 = this.firstNonBlank(var10001);
         }

         String var5 = var10000;
         double var6 = var3 == null ? Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 20)) : var3.z;
         String[] var10004 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 5)];
         var10004[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 5)] = var2.pageName;
         UltimateUIBlockClickEvent var8 = new UltimateUIBlockClickEvent(var1, this.firstNonBlank(var10004), var5, var6, var2.cursorX, var2.cursorY, var4);
         Bukkit.getPluginManager().callEvent(var8);
         return var8.isCancelled();
      } else {
         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 28) != 0);
      }
   }

   public boolean handleRuntimeScrollClick(Player var1, int var2) {
      if (((-573329799 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != 0) {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && !var3.editMode) {
            double var4 = var3.cursorX + var3.hitboxOffsetX;
            double var6 = var3.cursorY + var3.hitboxOffsetY;
            HoverElement var8 = this.findHoveredRuntimeElement(var3, var4, var6);
            UltimateUIBlockClickEvent.ClickType var9 = var2 < 0
               ? UltimateUIBlockClickEvent.ClickType.SCROLL_UP
               : UltimateUIBlockClickEvent.ClickType.SCROLL_DOWN;
            boolean var10 = this.fireRuntimeClickEvent(var1, var3, var8, var9);
            if (var10) {
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23) != 0);
            } else if (this.handleRuntimeScrollBox(var1, var3, var2, var4, var6)) {
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560163, 3) != 0);
            } else {
               this.applyRuntimeZoomScroll(var1, var3, var2);
               return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1667750688, 16) != 0);
            }
         } else {
            return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 17) != 0);
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906460, 7) != 0);
      }
   }

   public boolean handleRuntimeScrollBox(Player var1, EditorSession var2, int var3, double var4, double var6) {
      if ((5523804 * (5523804 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != 0) {
         ScrollViewState.Metrics var8 = this.findScrollBoxAt(var2, this.toLogicalCursorX(var2, var4), this.toLogicalCursorY(var2, var6));
         if (var8 == null) {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(959334849, 17) != 0);
         } else {
            int var9 = !var8.horizontal || var8.vertical && !var1.isSneaking()
               ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1188625180, 27)
               : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-574130658, 27);
            double var10 = var9 != 0 ? var3 * var8.stepX : Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-3886959349797321284L, 3));
            double var12 = var9 != 0 ? Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 17)) : var3 * var8.stepY;
            return this.glideScrollBoxOffset(var1, var2, var8, var10, var12);
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-289154376, 8) != 0);
      }
   }

   public boolean glideScrollBoxOffset(Player var1, EditorSession var2, ScrollViewState.Metrics var3, double var4, double var6) {
      if ((594593914 ^ 594593914) != 0) {
         throw new IllegalStateException();
      } else if (var3.smoothTicks <= 0) {
         return this.applyScrollBoxOffset(var1, var2, var3.containerId, var4, var6, (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 23) != 0));
      } else {
         double[] var8 = var2.scrollOffsets.get(var3.containerId);
         double var9 = var8 != null && var8.length >= Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1326043589, 14)
            ? var8[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1034653420, 20)]
            : var3.offsetX;
         double var11 = var8 != null && var8.length >= Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-329484447, 23)
            ? var8[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053216695, 9)]
            : var3.offsetY;
         double[] var13 = var2.scrollGlides.get(var3.containerId);
         double var14 = var13 == null ? var9 : var13[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574089, 4)];
         double var16 = var13 == null ? var11 : var13[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192591, 0)];
         double var18 = this.clampScrollOffset(var14 + var4, var3.maxOffsetX);
         double var20 = this.clampScrollOffset(var16 + var6, var3.maxOffsetY);
         if (Math.abs(var18 - var9) < Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(4296383630196837358L, 18))
            && Math.abs(var20 - var11) < Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(3082360163194079669L, 58))) {
            var2.scrollGlides.remove(var3.containerId);
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311845, 0) != 0);
         } else {
            Map var10000 = var2.scrollGlides;
            String var10001 = var3.containerId;
            double[] var10002 = new double[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-383318812, 27)];
            var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 16)] = var9;
            var10002[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-608637245, 24)] = var11;
            var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192333, 8)] = var18;
            var10002[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574122, 0)] = var20;
            var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821716877, 19)] = Double.longBitsToDouble(
               Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 34)
            );
            var10002[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1919980418, 18)] = var3.smoothTicks;
            var10000.put(var10001, var10002);
            this.advanceScrollGlides(var1, var2);
            this.startScrollGlideTicker(var1, var2);
            return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(856465257, 26) != 0);
         }
      }
   }

   public boolean glideScrollBoxTo(Player var1, EditorSession var2, ScrollViewState.Metrics var3, double var4, double var6) {
      if ((-1783304169 * -1783304169 - -1783304169 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var8 = var2.scrollGlides.get(var3.containerId);
         double[] var9 = this.currentScrollOffset(var2, var3);
         double var10 = var8 == null ? var9[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 3)] : var8[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(942089801, 6)];
         double var12 = var8 == null ? var9[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573609, 9)] : var8[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574185, 6)];
         return this.glideScrollBoxOffset(var1, var2, var3, var4 - var10, var6 - var12);
      }
   }

   public double[] currentScrollOffset(EditorSession var1, ScrollViewState.Metrics var2) {
      if (((612508127 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double[] var3 = var1.scrollOffsets.get(var2.containerId);
         if (var3 != null && var3.length >= Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1953567683, 28)) {
            double[] var4 = new double[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1725636452, 24)];
            var4[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 25)] = var3[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 26)];
            var4[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311845, 0)] = var3[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 30)];
            return var4;
         } else {
            double[] var10000 = new double[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(655138665, 27)];
            var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 12)] = var2.offsetX;
            var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1035701996, 20)] = var2.offsetY;
            return var10000;
         }
      }
   }

   public void startScrollGlideTicker(Player var1, EditorSession var2) {
      if ((2034957492 * (2034957492 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!var2.scrollGlideRunning && !var2.scrollGlides.isEmpty()) {
         var2.scrollGlideRunning = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-662997219, 13) != 0);
         Xqedii_38o2zes.Xqedii_j3mggbv(
            this.plugin,
            var1,
            Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-1420033328605304906L, 62),
            Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(1039256774851287190L, 15),
            var3 -> {
               if ((-990131603 ^ -990131603) != 0) {
                  throw new IllegalStateException();
               } else {
                  int var4 = var1.isOnline() && this.editorSessions.get(var1.getUniqueId()) == var2
                     ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 5)
                     : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 28);
                  if (var4 != 0 && !var2.scrollGlides.isEmpty()) {
                     this.advanceScrollGlides(var1, var2);
                  } else {
                     if (var4 == 0) {
                        var2.scrollGlides.clear();
                     }

                     var2.scrollGlideRunning = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 1) != 0);
                     var3.cancel();
                  }
               }
            }
         );
      }
   }

   public void advanceScrollGlides(Player var1, EditorSession var2) {
      if (((1757534385 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!var2.scrollGlides.isEmpty()) {
         Iterator var3 = var2.scrollGlides.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            double[] var5 = (double[])var4.getValue();
            double var6 = Math.max(
               Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(7183175635691466674L, 9)), var5[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(519948150, 19)]
            );
            var5[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(328426652, 13)] = Math.min(
               var6,
               var5[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1237399862, 1)] + Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5571347048608598352L, 51))
            );
            double var8 = var5[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-1223909527, 29)] / var6;
            double var10 = Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-8152609509847621926L, 0))
               - Math.pow(
                  Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-3500062797383061881L, 47)) - var8,
                  Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5582378998525888848L, 54))
               );
            double var12 = var5[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001453230, 6)]
               + (var5[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821323661, 17)] - var5[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2069306840, 21)]) * var10;
            double var14 = var5[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2071403992, 21)]
               + (var5[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923770729, 16)] - var5[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 18)]) * var10;
            ScrollViewState.Metrics var16 = var2.scrollViewState.metrics((String)var4.getKey());
            if (var16 != null) {
               var12 = this.clampScrollOffset(var12, var16.maxOffsetX);
               var14 = this.clampScrollOffset(var14, var16.maxOffsetY);
            }

            Map var10000 = var2.scrollOffsets;
            String var10001 = (String)var4.getKey();
            double[] var10002 = new double[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(642332711, 22)];
            var10002[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120341, 4)] = var12;
            var10002[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120325, 4)] = var14;
            var10000.put(var10001, var10002);
            if (var8 >= Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721370143141376238L, 48))) {
               var3.remove();
            }
         }

         this.renderScrollChange(var1, var2);
      }
   }

   public void renderScrollChange(Player var1, EditorSession var2) {
      if (((111691315 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!var2.editMode) {
         this.renderPage(var1, var2, (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574113, 3) != 0));
      } else {
         var2.renderBlocks = this.resolveRenderableBlocks(var2.rawBlocks, var2.components, var2);
         this.renderResolvedContent(var1, var2);
         if (var2.selectedElementId != null && var2.selectionOutlineVisible) {
            this.renderSelectionOverlay(var1, var2);
         }
      }
   }

   public ScrollViewState.Metrics findScrollBoxAt(EditorSession var1, double var2, double var4) {
      if ((1760035509 * 1760035509 - 1760035509 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ScrollViewState.Metrics var6 = null;

         for (ScrollViewState.Metrics var8 : var1.scrollViewState.allMetrics().values()) {
            if (var8.scrollable() && var8.contains(var2, var4) && (var6 == null || var8.viewWidth * var8.viewHeight < var6.viewWidth * var6.viewHeight)) {
               var6 = var8;
            }
         }

         return var6;
      }
   }

   public boolean applyScrollBoxOffset(Player var1, EditorSession var2, String var3, double var4, double var6, boolean var8) {
      if ((1419689137 * 1419689137 + 1419689137 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ScrollViewState.Metrics var9 = var2.scrollViewState.metrics(var3);
         if (var9 == null) {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(258663355, 18) != 0);
         } else {
            var2.scrollGlides.remove(var3);
            double[] var10 = var2.scrollOffsets.get(var3);
            double var11 = var10 != null && var10.length >= Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2065112536, 21)
               ? var10[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 3)]
               : var9.offsetX;
            double var13 = var10 != null && var10.length >= Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574137, 3)
               ? var10[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1860418319, 26)]
               : var9.offsetY;
            double var15 = this.clampScrollOffset(var8 ? var11 + var4 : var4, var9.maxOffsetX);
            double var17 = this.clampScrollOffset(var8 ? var13 + var6 : var6, var9.maxOffsetY);
            if (Math.abs(var15 - var11) < Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(2469484911364516929L, 57))
               && Math.abs(var17 - var13) < Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-1420572218724188839L, 63))) {
               return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923590505, 14) != 0);
            } else {
               Map var10000 = var2.scrollOffsets;
               double[] var10002 = new double[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001453102, 6)];
               var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 10)] = var15;
               var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 16)] = var17;
               var10000.put(var3, var10002);
               this.renderScrollChange(var1, var2);
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331498610, 12) != 0);
            }
         }
      }
   }

   public double clampScrollOffset(double var1, double var3) {
      if ((295599094 * (295599094 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return !Double.isFinite(var1)
            ? Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-5217066297865052592L, 56))
            : Math.max(
               Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-8809944606359635214L, 51)),
               Math.min(Math.max(Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035348713048400L, 33)), var3), var1)
            );
      }
   }

   public boolean scrollOpenUiBox(Player var1, String var2, double var3, double var5) {
      if ((1990868899 * 1990868899 - 1990868899 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var7 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var7 != null && !var7.editMode && var2 != null && !var2.isBlank()) {
            ScrollViewState.Metrics var8 = var7.scrollViewState.metrics(var2.trim());
            return var8 != null && this.glideScrollBoxOffset(var1, var7, var8, var3, var5);
         } else {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906460, 7) != 0);
         }
      }
   }

   public boolean setOpenUiScroll(Player var1, String var2, double var3, double var5) {
      if ((-314374653 * (-314374653 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var7 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         return var7 != null && !var7.editMode && var2 != null && !var2.isBlank()
            && this.applyScrollBoxOffset(var1, var7, var2.trim(), var3, var5, (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 5) != 0));
      }
   }

   public double[] getOpenUiScroll(Player var1, String var2) {
      if (((-680355782 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && var2 != null && !var2.isBlank()) {
            ScrollViewState.Metrics var4 = var3.scrollViewState.metrics(var2.trim());
            if (var4 == null) {
               return null;
            } else {
               double[] var10000 = new double[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573865, 5)];
               var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 2)] = var4.offsetX;
               var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 4)] = var4.offsetY;
               var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923311977, 17)] = var4.maxOffsetX;
               var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923443049, 17)] = var4.maxOffsetY;
               var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1643076727, 15)] = var4.contentWidth;
               var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(520920937, 27)] = var4.contentHeight;
               var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-439912930, 27)] = var4.viewWidth;
               var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-611390403, 28)] = var4.viewHeight;
               return var10000;
            }
         } else {
            return null;
         }
      }
   }

   public boolean scrollOpenUiBoxToElement(Player var1, String var2, String var3) {
      if ((-849419807 * -849419807 - -849419807 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var4 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         if (var4 != null && !var4.editMode && var2 != null && !var2.isBlank() && var3 != null && !var3.isBlank()) {
            ScrollViewState.Metrics var5 = var4.scrollViewState.metrics(var2.trim());
            if (var5 != null && var4.renderBlocks != null) {
               String var6 = var3.trim();

               for (Map var8 : var4.renderBlocks) {
                  if (var8 != null
                     && var6.equals(this.stringValue(var8.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))))) {
                     double var9 = this.readBlockPositionX(var8);
                     double var11 = this.readBlockPositionY(var8);
                     double var13 = var5.horizontal ? var5.offsetX + (var9 - var5.boxX) : var5.offsetX;
                     double var15 = var5.vertical ? var5.offsetY + (var11 - var5.boxY) : var5.offsetY;
                     return this.applyScrollBoxOffset(var1, var4, var5.containerId, var13, var15, (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(656787768, 14) != 0));
                  }
               }

               return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 15) != 0);
            } else {
               return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1759190884, 24) != 0);
            }
         } else {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1793309455, 26) != 0);
         }
      }
   }

   public double readBlockPositionX(Map<String, Object> var1) {
      if ((563114081 * 563114081 - 563114081 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")) instanceof Map var3
            ? this.parseDoubleValue(var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/")))
            : this.parseDoubleValue(var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/")));
      }
   }

   public double readBlockPositionY(Map<String, Object> var1) {
      if ((2039560869 ^ 2039560869) != 0) {
         throw new IllegalStateException();
      } else {
         return var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")) instanceof Map var3
            ? this.parseDoubleValue(var3.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")))
            : this.parseDoubleValue(var1.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")));
      }
   }

   public double parseDoubleValue(Object var1) {
      if ((-1651374275 ^ -1651374275) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Number var2) {
         return var2.doubleValue();
      } else {
         try {
            return Double.parseDouble(this.stringValue(var1));
         } catch (NumberFormatException var3) {
            return Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035348713048400L, 58));
         }
      }
   }

   public boolean hasActiveRuntimeHudSession(Player var1) {
      if (((-627070151 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 16) != 0);
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         return ((var2 != null && !var2.editMode && !this.isEditorMenuSession(var2)
            ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(810139961, 25)
            : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1250828921, 25)) != 0);
      }
   }

   public boolean setOpenUiElementValue(Player var1, String var2, String var3, Object var4) {
      if (((-1957250974 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1054407452, 27)];
         var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1838133685, 31)] = var3;
         String var5 = this.firstNonBlank(var10001).trim();
         if (var5.isBlank()) {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001453230, 6) != 0);
         } else {
            Object var6 = this.normalizeOpenUiElementValue(var4);
            return var6 != null && this.applyOpenUiElementMutation(var1, var2, (var3x, var4x) -> {
               if ((-1737369103 * -1737369103 - -1737369103 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  Object var5x = this.readMapPathValue(var4x, var5);
                  if (this.areOpenUiMutationValuesEqual(var5x, var6)) {
                     return Boolean.valueOf(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 12) != 0);
                  } else {
                     this.setMapPathValue(var4x, var5, var6);
                     return Boolean.valueOf(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-574130658, 27) != 0);
                  }
               }
            });
         }
      }
   }

   public boolean setOpenUiElementText(Player var1, String var2, String var3) {
      if (((-1694522065 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var4 = var3 == null ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==") : var3;
         return this.applyOpenUiElementMutation(
            var1,
            var2,
            (var2x, var3x) -> {
               if ((-1248649416 ^ -1248649416) != 0) {
                  throw new IllegalStateException();
               } else {
                  String var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("vOK6lgO+gpZUQm0kzmLc8O/H50IcPSAoFyUBjzaEc5OhrKM7");
                  String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-919066842, 30)];
                  var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120341, 4)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "vOK6lgO+gpZUQm0kzmLc8O/H50IcPSAoFyUBjzaEc5OhrKM7"
                  );
                  var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(931962729, 23)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "jW083zpUjxkkPMXG1wPv6zO06+x+p1rUct/Rn2S3D134ZKkqqm1OPOIaEnXdLz/eos8="
                  );
                  var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1981728199, 11)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "rtlOvnuhIYuhXOmazgJ2WKmKQWOEFZ012Vq25LyINLRbFT4Umtr1JGf8"
                  );
                  var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1284383353, 25)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "cWyEU7gpjy11lWCSmcG3Ms4QmoCMxg5LGuRwlg9rfwqqGH7tSh4UOLDOegutsmy2hU/A2cmhMEE="
                  );
                  String var4x = this.resolvePreferredOpenUiWritePath(var3x, var10002, var10003);
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(386703209, 29)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 8)] = this.stringValue(this.readMapPathValue(var3x, var4x));
                  String var5 = this.firstNonBlank(var10001);
                  if (var5.equals(var4)) {
                     return Boolean.valueOf((Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 20) != 0));
                  } else {
                     this.setMapPathValue(var3x, var4x, var4);
                     return Boolean.valueOf((Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(656804152, 14) != 0));
                  }
               }
            }
         );
      }
   }

   public boolean setOpenUiElementColor(Player var1, String var2, String var3) {
      if (((-1866975614 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var4 = this.normalizeHexColor(var3);
         return !var4.isBlank() && this.applyOpenUiElementMutation(
               var1,
               var2,
               (var2x, var3x) -> {
                  if (((945091317 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     String var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("nsgmCckGJVTxqU8T5FBGkYtyxXjbWDSdVlowFoHjjcnedVYA7yM=");
                     String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1910343613, 1)];
                     var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-919066843, 30)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "nsgmCckGJVTxqU8T5FBGkYtyxXjbWDSdVlowFoHjjcnedVYA7yM="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(655138665, 28)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "rKhNq1Gd8iBCcwaONWhDJtFaUySCl1TTaPBcN1ugGkyWnR8ag3agtYipAaTM1XyGDnY="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1820930445, 18)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "VvcfaSZBHrzGdm9wsoicsQQlAzeArHEOUucB151vOpBq4vTB9rcFi2zJBzJynd1Vh9xcnw=="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574129, 3)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "sj62lJ6Pa4pHYWpZkm7HjnLffgJ6igQbviuM6KHmV1MF8X+St84YwXyqacb4K6eS9Em4t3X6uqW0NkmjX2wF9Q=="
                     );
                     String var4x = this.resolvePreferredOpenUiWritePath(var3x, var10002, var10003);
                     String var5 = this.normalizeHexColor(this.stringValue(this.readMapPathValue(var3x, var4x)));
                     if (var4.equalsIgnoreCase(var5)) {
                        return Boolean.valueOf(Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(633944103, 22) != 0);
                     } else {
                        this.setMapPathValue(var3x, var4x, var4);
                        return Boolean.valueOf(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574249, 7) != 0);
                     }
                  }
               }
            );
      }
   }

   public boolean setOpenUiElementPosition(Player var1, String var2, double var3, double var5) {
      if ((1355355172 ^ 1355355172) != 0) {
         throw new IllegalStateException();
      } else {
         return Double.isFinite(var3) && Double.isFinite(var5)
            && this.applyOpenUiElementMutation(
               var1,
               var2,
               (var5x, var6) -> {
                  if ((1079664259 * 1079664259 + 1079664259 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     String var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6HwU4TcF7KCcn5Cf8P5QiyRj6ZhC+3gtQs9eOQdwANAZPMLz79j6yoqk/118ToMF");
                     String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(906796905, 22)];
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 22)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "6HwU4TcF7KCcn5Cf8P5QiyRj6ZhC+3gtQs9eOQdwANAZPMLz79j6yoqk/118ToMF"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-474280082, 2)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574057, 5)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "6kIp4sFha7iSxhQQLyYmhHS2mNl68t0I8MeHcM0aIY39iTMyIXBvZRavbE6vTQkeMBNzw1OjPAe6+7InVBM="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-526607836, 8)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "mebRoyh8wl2rzfqDXsG6w4wzU/qQ2jMUZBbkUTX+WmjhFB2W+9hqn0opIpE="
                     );
                     String var7 = this.resolvePreferredOpenUiWritePath(var6, var10002, var10003);
                     var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5cHjS94Vo02Hw4hIKN9TkMjYZbE2wjvCTJoEZ+3BapSjzPJ0jgdfUZUL8fQ1K7gc");
                     var10003 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-558305597, 24)];
                     var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1830511597, 21)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "5cHjS94Vo02Hw4hIKN9TkMjYZbE2wjvCTJoEZ+3BapSjzPJ0jgdfUZUL8fQ1K7gc"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923570025, 12)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(931962729, 22)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "a8uaFyW7l78l3Rzwu5xN1KlLIeO62zulUywPvGNJqvFD6SXN7d69n6nQhKLWTQ99oyVnjQRL8eTSvj2Y6Nk="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-642191677, 24)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "iKScahg1ZYJx23Eo6KLbcBDsQ+26BQgp0k3FsBr4IjbYHLFShCmuwozXpBo="
                     );
                     String var8 = this.resolvePreferredOpenUiWritePath(var6, var10002, var10003);
                     boolean var9 = this.writeOpenUiDoubleIfChanged(var6, var7, var3);
                     boolean var10 = this.writeOpenUiDoubleIfChanged(var6, var8, var5);
                     return Boolean.valueOf(var9 || var10);
                  }
               }
            );
      }
   }

   public boolean setOpenUiElementScale(Player var1, String var2, double var3, double var5) {
      if ((-1409391694 * (-1409391694 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Double.isFinite(var3) && Double.isFinite(var5)
            && this.applyOpenUiElementMutation(
               var1,
               var2,
               (var5x, var6) -> {
                  if ((-1770551941 * (-1770551941 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     String var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5n+dxwXW4+ziaY+bL2hCb3g2OGk4cKBVyDv9UqVn1TgA2IKafOXMR4rAbzj1Xg4f");
                     String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192669, 4)];
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-289154376, 8)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "5n+dxwXW4+ziaY+bL2hCb3g2OGk4cKBVyDv9UqVn1TgA2IKafOXMR4rAbzj1Xg4f"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 9)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "12rOp0dJsw23cpdryNzLI7VPRX6KhgSFmFJDudrtu6ICN5lmuUI="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(931962729, 22)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "D428GZTOnMQHdFm7jbt1Dq7klqDMkK4FOTBlNbltsO6Q3fT8c1A/rwDLe5YszpZdh4E="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-321095839, 23)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "4WE+UbMQbk/Vlq0Sxu+W8MGfSwYIa82gCXwCmHarFEWHzlYAaxepILjbTqOxgJu1wBPNiiqAgB/VnCeiXNs="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192577, 2)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "3b2wT8WacxHxhuOUn3q+iYxNlc0xKELG7Z7QLzG5iHnmh2ysOuDdDZmJ+iZ82FnBdJBomA=="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1325928901, 14)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "g8e20jhuvRZk8Ld4Pnywkya9bWMqwzuPG0RQaUxgoZfhMANQGESqwJw41YC9T0D3B5v4hX066yRB4u8dk3R2eg=="
                     );
                     String var7 = this.resolvePreferredOpenUiWritePath(var6, var10002, var10003);
                     var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("SdGxjji9y4NcbFwES4T5HjT/xnPV2Vvd4iMfKrv3GDD6NQNPGUrLaph87X7snJ+ctw8=");
                     var10003 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331494514, 12)];
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 24)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "SdGxjji9y4NcbFwES4T5HjT/xnPV2Vvd4iMfKrv3GDD6NQNPGUrLaph87X7snJ+ctw8="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1828414445, 21)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "owq+EUq6W/FzM8bowqRiStOgzkKF2W9MafTl+6UioAEOacj6hv/qsA=="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192581, 3)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "nZZMiKPGZPvE36R5Y+CLmENp9OXcfMKl+BkW5KqHPVFvOAPGOq9RieyHKXkO8JbPG9e7ng=="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(2089628045, 27)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "Mdn1RK2e1QNQFCgie0ndQtx/AZjpuQpWcveAdpATPbBMerEe+hL+QgINyYRGCIukrC26YXgKT3VEIRKC0WSxtQ=="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1676438684, 5)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "z/z3ykfHEfaT64RT/eaKLNfW3i08NXQrJ8nrJWKPehIbsBr2nFbf8yn6SOxcMMJ7QX2MBzU6"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1981742535, 11)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "gpVYqIfxEvjXiEwy9Ow1UbUDoBPVqrKOCiCJJee2ETxVEwkofv1hdlIUB57q759qhoo5CZ7iQ+Hu64A2C4MSvjJc"
                     );
                     String var8 = this.resolvePreferredOpenUiWritePath(var6, var10002, var10003);
                     boolean var9 = this.writeOpenUiDoubleIfChanged(var6, var7, var3);
                     boolean var10 = this.writeOpenUiDoubleIfChanged(var6, var8, var5);
                     return Boolean.valueOf(var9 || var10);
                  }
               }
            );
      }
   }

   public boolean setOpenUiElementItem(Player var1, String var2, String var3) {
      if (((-2142849977 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1276276814, 23)];
         var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 15)] = var3;
         String var4 = this.firstNonBlank(var10001).trim();
         return !var4.isBlank() && this.applyOpenUiElementMutation(
               var1,
               var2,
               (var2x, var3x) -> {
                  if (((-376014792 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     String var10002 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("771k90j1Sm+7qisax1imCAc6hoQLpkwwu93yApdGlyLU8ML4");
                     String[] var10003 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(518375286, 19)];
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(517326710, 19)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "771k90j1Sm+7qisax1imCAc6hoQLpkwwu93yApdGlyLU8ML4"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1054407452, 27)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "fnv0OUHjn92CUuTP5V6DrBJ5voUp60h1D6TSFZxJsmx10u9dOhndvje599CYVX/++/uQOD1M"
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573097, 9)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "sywlNVyrCy5eb2gi9BeM3hOaF06KyOK7ViswawDamacpRohs7qvzS1hy6XY="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(822910825, 25)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "iNgfpgGSV3SQp42c2lhLMePrGJ4dYmbSUhHM7s8mEFldKyd1TBN/yPzFsAfVvY/o4Y8="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1829581197, 23)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "NmfDpzcelZhITD1AIX2xbViUCGAF+ttZ5kAV2WrvRlA/B/+9d+DsOnhoqy/0i9MFLe2y0ksA59JmJ69cAc87fh/6iGk="
                     );
                     var10003[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-662964451, 13)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "AcjkuLhrKWQUQMvPsKG2aVhDQRGKc3xDCXgVVkOJEqGdmGr55P/LaVyWxuS5371JaC9SwoHq6gY8fg=="
                     );
                     String var4x = this.resolvePreferredOpenUiWritePath(var3x, var10002, var10003);
                     String[] var10001x = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 28)];
                     var10001x[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 31)] = this.stringValue(this.readMapPathValue(var3x, var4x));
                     String var5 = this.firstNonBlank(var10001x).trim();
                     if (var5.equalsIgnoreCase(var4)) {
                        return Boolean.valueOf(Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 8) != 0);
                     } else {
                        this.setMapPathValue(var3x, var4x, var4);
                        return Boolean.valueOf(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(386703209, 29) != 0);
                     }
                  }
               }
            );
      }
   }

   public boolean setOpenUiElementItem(Player var1, String var2, Material var3) {
      if ((1050091986 ^ 1050091986) != 0) {
         throw new IllegalStateException();
      } else {
         return var3 != null && var3 != Material.AIR
            && this.setOpenUiElementItem(var1, var2, var3.name());
      }
   }

   public boolean applyOpenUiElementMutation(Player var1, String var2, BiFunction<EditorSession, Map<String, Object>, Boolean> var3) {
      if ((1207557797 * (1207557797 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var3 != null && this.hasActiveRuntimeHudSession(var1)) {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(942089737, 6)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-156353616, 22)] = var2;
         String var4 = this.firstNonBlank(var10001).trim();
         if (var4.isBlank()) {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053217207, 9) != 0);
         } else {
            EditorSession var5 = this.editorSessions.get(var1.getUniqueId());
            if (var5 != null && var5.rawBlocks != null && !var5.rawBlocks.isEmpty()) {
               String var6 = this.resolveOpenUiElementTargetPath(var5, var4);
               Map var7 = var6.isBlank() ? null : this.resolveRawMapAtPath(var5.rawBlocks, var6);
               if (var7 == null) {
                  return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 6) != 0);
               } else {
                  boolean var8 = Boolean.TRUE.equals(var3.apply(var5, var7));
                  if (!var8) {
                     return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 16) != 0);
                  } else {
                     var5.renderBlocks = this.resolveRenderableBlocks(var5.rawBlocks, var5.components, var5);
                     var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(642332711, 22)];
                     var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 22)] = this.findTargetIdByPath(var5, var6);
                     var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1667750688, 16)] = var6;
                     String var9 = this.firstNonBlank(var10001);
                     this.rerenderEditableContentForTargets(
                        var1,
                        var5,
                        List.of(var9),
                        (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23) != 0),
                        (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106434413, 10) != 0)
                     );
                     return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 30) != 0);
                  }
               }
            } else {
               return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 6) != 0);
            }
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1416696771, 28) != 0);
      }
   }

   public String resolveOpenUiElementTargetPath(EditorSession var1, String var2) {
      if ((1656435088 * (1656435088 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1820167584, 2)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1981732295, 11)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var1 != null && !var3.isBlank()) {
            String var4 = this.resolveRawTargetPathByTargetId(var1, var3);
            if (!var4.isBlank() && this.resolveRawMapAtPath(var1.rawBlocks, var4) != null) {
               return var4;
            } else if (this.resolveRawMapAtPath(var1.rawBlocks, var3) != null) {
               return var3;
            } else {
               List var5 = var1.renderBlocks;
               if (var5 == null || var5.isEmpty()) {
                  var5 = this.resolveRenderableBlocks(var1.rawBlocks, var1.components, var1);
               }

               HashMap var6 = new HashMap();
               int var7 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1313575536, 15);

               for (Map var9 : (Iterable<Map>) (var5)) {

                  var7++;
                  ConfigurationSection var10 = this.mapToSection(var9);
                  if (var10 != null) {
                     String var11 = this.resolveElementId(var10, var7, var6);
                     var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574113, 3)];
                     var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1267888206, 23)] = var10.getString(
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw=")
                     );
                     String var12 = this.firstNonBlank(var10001);
                     if (var3.equals(var11) || var3.equals(var12)) {
                        var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560163, 3)];
                        var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 12)] = var10.getString(
                           Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NspoE7CEqwyPkT7z+htrfxq4kg6ghjcGb5jGpWdDVv2b/rN/GlYr4OQusqyxDib5G22RPRq1XT/ccJFJS/AVHR+pQ4I=")
                        );
                        String var13 = this.firstNonBlank(var10001);
                        if (!var13.isBlank() && this.resolveRawMapAtPath(var1.rawBlocks, var13) != null) {
                           return var13;
                        }
                     }
                  }
               }

               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            }
         } else {
            return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         }
      }
   }

   public String resolvePreferredOpenUiWritePath(Map<String, Object> var1, String var2, String... var3) {
      if ((-682542206 ^ -682542206) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else {
         if (var3 != null) {
            String[] var4 = var3;
            int var5 = var3.length;

            for (int var6 = Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 3); var6 < var5; var6++) {
               String var7 = var4[var6];
               if (var7 != null && !var7.isBlank() && this.hasMapPath(var1, var7)) {
                  return var7;
               }
            }
         }

         return var2;
      }
   }

   public boolean writeOpenUiDoubleIfChanged(Map<String, Object> var1, String var2, double var3) {
      if ((-1910316133 * -1910316133 + -1910316133 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         double var5 = this.parseDouble(
            this.readMapPathValue(var1, var2), Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(8184058112915137803L, 60))
         );
         if (Double.isFinite(var5) && Math.abs(var5 - var3) <= Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(2368001064737197008L, 39))) {
            return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 28) != 0);
         } else {
            this.setMapPathValue(var1, var2, var3);
            return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 21) != 0);
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 3) != 0);
      }
   }

   public Object normalizeOpenUiElementValue(Object var1) {
      if ((-1309082608 * -1309082608 + -1309082608 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (var1 instanceof Material var3) {
         return var3.name();
      } else {
         return var1 instanceof ItemStack var2 ? var2.getType().name() : var1;
      }
   }

   public boolean areOpenUiMutationValuesEqual(Object var1, Object var2) {
      if ((1414545151 * (1414545151 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == var2) {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1918931842, 18) != 0);
      } else if (var1 == null || var2 == null) {
         return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 20) != 0);
      } else if (var1 instanceof Number || var2 instanceof Number) {
         double var7 = this.parseDouble(var1, Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-2890722316969895623L, 16)));
         double var5 = this.parseDouble(var2, Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(7451784391237816173L, 63)));
         return ((Double.isFinite(var7)
               && Double.isFinite(var5)
               && Math.abs(var7 - var5) <= Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(4522540076946472492L, 8))
            ? Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923311977, 18)
            : Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 22)) != 0);
      } else if (!(var1 instanceof Boolean) && !(var2 instanceof Boolean)) {
         return var1.equals(var2);
      } else {
         boolean var3 = this.parseBooleanFlag(var1, (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 21) != 0));
         boolean var4 = this.parseBooleanFlag(var2, (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 11) != 0));
         return ((var3 == var4 ? Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574120, 0) : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 11)) != 0);
      }
   }

   public boolean hasActiveEditorSelectionSession(Player var1) {
      if ((1491322519 ^ 1491322519) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(618699927, 0) != 0);
      } else {
         EditorSession var2 = this.editorSessions.get(var1.getUniqueId());
         if (var2 != null && var2.editMode && var2.previewMode && !this.isEditorMenuSession(var2)) {
            return ((!this.getSelectedTargetIds(var2).isEmpty()
               ? Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906588, 7)
               : Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1759190884, 24)) != 0);
         } else {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(633944103, 22) != 0);
         }
      }
   }

   public boolean alignSelectedEditorHudElement(Player var1, boolean var2) {
      if ((-1860479743 * (-1860479743 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(82098471, 11) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && var3.editMode && var3.previewMode && !this.isEditorMenuSession(var3)) {
            List var4 = this.getSelectedTargetIds(var3);
            if (var4.isEmpty()) {
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-578308751, 9) != 0);
            } else {
               TextAlignment var5 = var2 ? TextAlignment.RIGHT : TextAlignment.LEFT;
               String var6 = var2
                  ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("3mHpuHHVGv4GXWia4l8VmGNswjknhxmm8IC9Hi4UuUDPbditdfs=")
                  : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("LXCiOEE8ppq4JDi6sus3ZQ4qvB3ctjWLL/Edd6Huop9wJzTG");
               LinkedHashSet var7 = new LinkedHashSet();
               LinkedHashSet var8 = new LinkedHashSet();
               int var9 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1313575536, 15);

               for (String var11 : (Iterable<String>) (var4)) {

                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053216695, 9)];
                  var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331502706, 12)] = var11;
                  String var12 = this.firstNonBlank(var10001);
                  if (!var12.isBlank()) {
                     LinkedHashSet var13 = this.collectRawTargetCandidatePathsByTargetId(var3, var12);
                     if (var13.isEmpty()) {
                        String var14 = this.resolveRawTargetPathByTargetId(var3, var12);
                        if (!var14.isBlank()) {
                           var13.add(var14);
                        }
                     }

                     if (!var13.isEmpty()) {
                        for (String var15 : (Iterable<String>) (var13)) {

                           var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 13)];
                           var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-312707231, 23)] = var15;
                           String var16 = this.firstNonBlank(var10001);
                           if (!var16.isBlank()) {
                              Map var17 = this.resolveRawMapAtPath(var3.rawBlocks, var16);
                              if (var17 != null && !var17.isEmpty()) {
                                 var8.add(var16);
                                 String[] var10002 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-663021795, 13)];
                                 var10002[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 1)] = this.findTargetIdByPath(var3, var16);
                                 var10002[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1148261315, 28)] = var12;
                                 var7.add(this.firstNonBlank(var10002));
                                 if (this.Xqedii_qb2urru(var17) != var5) {
                                    if (var9 == 0) {
                                       this.recordEditorMutation(var3);
                                    }

                                    this.setMapPathValue(var17, this.Xqedii_ftg8eep(var17), var6);
                                    var9 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106433389, 10);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var7.isEmpty() && var8.isEmpty()) {
                  return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 31) != 0);
               } else {
                  if (var9 != 0) {
                     var3.renderBlocks = this.resolveRenderableBlocks(var3.rawBlocks, var3.components, var3);
                     ArrayList var18 = new ArrayList(var8);
                     if (var18.isEmpty()) {
                        var18.addAll(var7);
                     }

                     this.rerenderEditableContentForTargets(var1, var3, var18, (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906588, 7) != 0));
                     this.rerenderEditableSelection(var1, var3);
                     this.renderLayersPanel(var1, var3);
                  }

                  return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23) != 0);
               }
            }
         } else {
            return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-457627900, 19) != 0);
         }
      }
   }

   public String Xqedii_ftg8eep(Map<String, Object> var1) {
      if (((1017705509 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9XKsMpFqbWVxH1EenEsgjhfJDn8DNnt5db2IckkCkvXz7OKDZ05SVzus");
      } else if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9XKsMpFqbWVxH1EenEsgjhfJDn8DNnt5db2IckkCkvXz7OKDZ05SVzus"))) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9XKsMpFqbWVxH1EenEsgjhfJDn8DNnt5db2IckkCkvXz7OKDZ05SVzus");
      } else if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("PZEaKVF5sYZff2Mbi/thDpRST8t4zHOSt7snmMxbeYu5djhWdw6t0jE1hIOMOAbW7Io="))) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("PZEaKVF5sYZff2Mbi/thDpRST8t4zHOSt7snmMxbeYu5djhWdw6t0jE1hIOMOAbW7Io=");
      } else if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("DP6bUXsM+o8kWRyPdumuQMSTEVtV4Kw6fMmERKT1g9k8/83YyZYewtGRWmTOs1b6"))) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("DP6bUXsM+o8kWRyPdumuQMSTEVtV4Kw6fMmERKT1g9k8/83YyZYewtGRWmTOs1b6");
      } else if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("EgOuImguIXQ1hD1blkJWBOYNFUYLaO5zbRzFw0yiixNdgDfci9+J2olgJsb+kp+RljoK/nTpX1w="))) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("EgOuImguIXQ1hD1blkJWBOYNFUYLaO5zbRzFw0yiixNdgDfci9+J2olgJsb+kp+RljoK/nTpX1w=");
      } else if (this.hasMapPath(
         var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("i8nyz0Zgwn4nsOI+RfanIxLxSBRQQ7P8GSYtY9H4X+ZeoDwd0bKCpRGPbFC9iAOWLg7RqwwgSJNlar2lE/+UoA==")
      )) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("i8nyz0Zgwn4nsOI+RfanIxLxSBRQQ7P8GSYtY9H4X+ZeoDwd0bKCpRGPbFC9iAOWLg7RqwwgSJNlar2lE/+UoA==");
      } else if (this.hasMapPath(
         var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("X2KI5A+Wubs7PcF2+n9sOW4LzQx+NWkiSeIGGwebBQQWGs2AvN7qLQuvtQEfuVqE/a5Ak3YKRzj4KCQvrv0=")
      )) {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("X2KI5A+Wubs7PcF2+n9sOW4LzQx+NWkiSeIGGwebBQQWGs2AvN7qLQuvtQEfuVqE/a5Ak3YKRzj4KCQvrv0=");
      } else {
         return var1.containsKey(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sz96n1iR2wnFedxq7RaFj/LCkY5pJF8mHMj5Os8A5v2ObKgmQguDWg=="))
            ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("EgOuImguIXQ1hD1blkJWBOYNFUYLaO5zbRzFw0yiixNdgDfci9+J2olgJsb+kp+RljoK/nTpX1w=")
            : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9XKsMpFqbWVxH1EenEsgjhfJDn8DNnt5db2IckkCkvXz7OKDZ05SVzus");
      }
   }

   public TextAlignment Xqedii_qb2urru(Map<String, Object> var1) {
      if (((1795420779 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1008944914, 16)];
         var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 22)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("9XKsMpFqbWVxH1EenEsgjhfJDn8DNnt5db2IckkCkvXz7OKDZ05SVzus"))
         );
         var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 17)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("PZEaKVF5sYZff2Mbi/thDpRST8t4zHOSt7snmMxbeYu5djhWdw6t0jE1hIOMOAbW7Io="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(516278134, 19)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("DP6bUXsM+o8kWRyPdumuQMSTEVtV4Kw6fMmERKT1g9k8/83YyZYewtGRWmTOs1b6"))
         );
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(936157033, 22)] = this.stringValue(
            this.readMapPathValue(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("EgOuImguIXQ1hD1blkJWBOYNFUYLaO5zbRzFw0yiixNdgDfci9+J2olgJsb+kp+RljoK/nTpX1w="))
         );
         var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-919066842, 30)] = this.stringValue(
            this.readMapPathValue(
               var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("i8nyz0Zgwn4nsOI+RfanIxLxSBRQQ7P8GSYtY9H4X+ZeoDwd0bKCpRGPbFC9iAOWLg7RqwwgSJNlar2lE/+UoA==")
            )
         );
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923549545, 13)] = this.stringValue(
            this.readMapPathValue(
               var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("X2KI5A+Wubs7PcF2+n9sOW4LzQx+NWkiSeIGGwebBQQWGs2AvN7qLQuvtQEfuVqE/a5Ak3YKRzj4KCQvrv0=")
            )
         );
         String var2 = this.firstNonBlank(var10001);
         if (var2.isBlank()) {
            return TextAlignment.CENTER;
         } else {
            String var3 = var2.trim()
               .toLowerCase(Locale.ROOT)
               .replace((char)Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1631282157, 21), (char)Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821231501, 11))
               .replace((char)Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1822503309, 16), (char)Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(856465257, 21));
            if (var3.contains(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("LXCiOEE8ppq4JDi6sus3ZQ4qvB3ctjWLL/Edd6Huop9wJzTG"))) {
               return TextAlignment.LEFT;
            } else if (var3.contains(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("3mHpuHHVGv4GXWia4l8VmGNswjknhxmm8IC9Hi4UuUDPbditdfs="))) {
               return TextAlignment.RIGHT;
            } else if (!var3.contains(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("0sISpp3HT4QMG6ZFgszyykNI61dqUj7HTx0b/N3VNls2sS0+cHec+A=="))
               && !var3.contains(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8DGnDOynpIBH3hATOlduvpLc9iwiBK9UbqrufyatP2CoQVZEfyRT8g=="))) {
               try {
                  int var4 = (int)Math.round(Double.parseDouble(var3));
                  if (var4 == Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(932241257, 10)) {
                     return TextAlignment.LEFT;
                  }

                  if (var4 == Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-1358127277, 23)) {
                     return TextAlignment.RIGHT;
                  }
               } catch (NumberFormatException var5) {
               }

               return TextAlignment.CENTER;
            } else {
               return TextAlignment.CENTER;
            }
         }
      } else {
         return TextAlignment.CENTER;
      }
   }

   public boolean setSelectedTextElementLineWidth(Player var1, int var2) {
      if ((-1294033344 * -1294033344 + -1294033344 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 > 0) {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && var3.editMode && var3.previewMode && !this.isEditorMenuSession(var3)) {
            List var4 = this.getSelectedTargetIds(var3);
            if (var4.isEmpty()) {
               return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 9) != 0);
            } else {
               int var5 = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 4);

               for (String var7 : (Iterable<String>) (var4)) {

                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23)];
                  var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 6)] = var7;
                  String var8 = this.firstNonBlank(var10001);
                  if (!var8.isBlank() && this.isTextTarget(var3, var8)) {
                     Map var9 = this.resolveRawTargetByTargetId(var3, var8);
                     if (var9 != null) {
                        if (var5 == 0) {
                           this.recordEditorMutation(var3);
                        }

                        this.setMapPathValue(var9, this.Xqedii_3db0b6n(var9), var2);
                        var5 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-574130658, 27);
                     }
                  }
               }

               if (var5 == 0) {
                  return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053217207, 9) != 0);
               } else {
                  var3.renderBlocks = this.resolveRenderableBlocks(var3.rawBlocks, var3.components, var3);
                  this.rerenderEditableContentForTargets(var1, var3, new ArrayList<>(var4), (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1035701996, 20) != 0));
                  this.rerenderEditableSelection(var1, var3);
                  this.renderLayersPanel(var1, var3);
                  return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(924622697, 20) != 0);
               }
            }
         } else {
            return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 11) != 0);
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-2018151971, 17) != 0);
      }
   }

   public String Xqedii_3db0b6n(Map<String, Object> var1) {
      if ((-1812318961 * -1812318961 + -1812318961 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null) {
            if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("yUFwJQ+dgWBHuTjkEDRuvLLDA8oAs6tvN5uUFCezoDkbELyL0M9nhUgBSzc/mg=="))) {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("yUFwJQ+dgWBHuTjkEDRuvLLDA8oAs6tvN5uUFCezoDkbELyL0M9nhUgBSzc/mg==");
            }

            if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("RuyIqLhSHQhEUbM1JMFzM852Se1VvYzQzVJYJNLRwBKCktd4EUJIlfPw/Ew="))) {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("RuyIqLhSHQhEUbM1JMFzM852Se1VvYzQzVJYJNLRwBKCktd4EUJIlfPw/Ew=");
            }

            if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1DgY53Pl2zJgzolKVE25tBgsATA5BBUsvHAGQEO3pfPTgjovH9t4W0+yIzYS2w=="))) {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1DgY53Pl2zJgzolKVE25tBgsATA5BBUsvHAGQEO3pfPTgjovH9t4W0+yIzYS2w==");
            }

            if (this.hasMapPath(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("oaX3A6q+ACtOIfnPjDcMPJAKAd06hNDpbZ6Eo2brNFtpl+9gRENPKi0z2uDpCNkdLBRcDkcX/JuXz9yY"))) {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("oaX3A6q+ACtOIfnPjDcMPJAKAd06hNDpbZ6Eo2brNFtpl+9gRENPKi0z2uDpCNkdLBRcDkcX/JuXz9yY");
            }
         }

         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("yUFwJQ+dgWBHuTjkEDRuvLLDA8oAs6tvN5uUFCezoDkbELyL0M9nhUgBSzc/mg==");
      }
   }

   public boolean alignHoveredRuntimeHudElement(Player var1, boolean var2) {
      if ((-1202298226 * -1202298226 + -1202298226 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasActiveRuntimeHudSession(var1)) {
         return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 17) != 0);
      } else {
         EditorSession var3 = this.editorSessions.get(var1.getUniqueId());
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726551, 5)];
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 2)] = var3.hoveredElementId;
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-298077962, 30)] = var3.selectedElementId;
         String var4 = this.firstNonBlank(var10001);
         if (!var4.isBlank() && this.findFirstByTargetId(var3, var4) == null) {
            var4 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         }

         if (var4.isBlank()) {
            double var5 = var3.cursorX + var3.hitboxOffsetX;
            double var7 = var3.cursorY + var3.hitboxOffsetY;
            HoverElement var9 = this.findHoveredRuntimeElement(var3, var5, var7);
            String var10000;
            if (var9 == null) {
               var10000 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            } else {
               var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192585, 2)];
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726615, 5)] = this.targetIdOf(var9);
               var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 3)] = var9.targetId;
               var10000 = this.firstNonBlank(var10001);
            }

            var4 = var10000;
         }

         if (var4.isBlank()) {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1461573755, 29) != 0);
         } else {
            TextAlignment var12 = var2 ? TextAlignment.RIGHT : TextAlignment.LEFT;
            int var6 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311846, 0);
            LinkedHashSet var13 = new LinkedHashSet();

            for (HoverElement var14 : this.findTargetElements(var3, var4)) {
               var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053216695, 9)];
               var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 16)] = var14 == null ? null : var14.id;
               String var10 = this.firstNonBlank(var10001);
               if (!var10.isBlank() && var13.add(var10)) {
                  Entity var11 = this.hudService.getHud(var1, var10);
                  if (var11 != null) {
                     var6 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1676438780, 5);
                     this.hudService.setHudAligned(var11, var12);
                  }
               }
            }

            return (var6 != 0);
         }
      }
   }

   public double resolveAnimationOpacityValue(Object var1, double var2) {
      if ((-1239315032 ^ -1239315032) != 0) {
         throw new IllegalStateException();
      } else {
         double var4 = this.clampAnimationTimelineOpacityRaw(var2);
         if (var1 == null) {
            return var4;
         } else if (var1 instanceof Number var11) {
            return this.clampAnimationTimelineOpacityRaw(var11.doubleValue());
         } else {
            Map var6 = this.toStringObjectMap(var1);
            if (var6 != null && !var6.isEmpty()) {
               double var7 = this.readMapPathDouble(
                  var6,
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Rj399dBd2x9tnxEBI6azUN6KvDlJajFjoIAexcx97I9oLvxs1AY="),
                  this.readMapPathDouble(
                     var6,
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7Wf8/0SpE3grypOuZuEUYgFirwzeJ7/+xO4WoIVTQOJmKpbsL7CC76q0"),
                     Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(4157027099405032872L, 17))
                  )
               );
               if (Double.isFinite(var7)) {
                  return this.clampAnimationTimelineOpacityRaw(var7);
               } else {
                  double var9 = this.parseDouble(
                     var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("fb0KzSEx+eqEVwLDR81HYEvTxCFevkDUECxR2R9jKuAlIg==")),
                     this.parseDouble(
                        var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("K5n1AeeMD6mW5wVBsE6wufQX/hwSvmLV1bd6C19fWY7fq7VmgnmSIRpyGXWO9G4b")),
                        this.parseDouble(
                           var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("TyM6N/CDGAcKtxcBjYBqDcnN/C1NUUACsbNb+VnwnJix+9ddVLvTSKpctcazSW07")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573033150226663760L, 42))
                        )
                     )
                  );
                  return Double.isFinite(var9) ? this.clampAnimationTimelineOpacityRaw(var4 + var9) : var4;
               }
            } else {
               return var4;
            }
         }
      }
   }

   public List<Integer> readAnimationTimelineTicks(Map<String, Object> var1) {
      if (((-759202944 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         TreeMap<Integer, Boolean> var2 = new TreeMap<>();

         for (String var4 : var1.keySet()) {
            double var5 = this.parseDouble(var4, Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(4502310154983924084L, 42)));
            if (Double.isFinite(var5)) {
               var2.put(this.clampAnimationTimelineTick((int)Math.round(var5)), Boolean.TRUE);
            }
         }

         return (List<Integer>)(var2.isEmpty() ? Collections.emptyList() : new ArrayList<>(var2.keySet()));
      } else {
         return Collections.emptyList();
      }
   }

   public Map<Integer, String> readTimelineInterpModes(Map<String, Object> var1) {
      if ((1060183219 * 1060183219 - 1060183219 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         TreeMap<Integer, String> var2 = new TreeMap<>();

         for (Entry var4 : var1.entrySet()) {
            if (var4 != null && var4.getKey() != null && var4.getValue() != null) {
               double var5 = this.parseDouble(var4.getKey(), Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5284734603817158992L, 59)));
               if (Double.isFinite(var5)) {
                  int var7 = this.clampAnimationTimelineTick((int)Math.round(var5));
                  Map var8 = this.toStringObjectMap(var4.getValue());
                  if (var8 != null && !var8.isEmpty()) {
                     String var9 = this.normalizeTimelineInterpMode(
                        this.stringValue(
                           var8.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("JaaNuNNSu4mHtIV6yPz3ZgPnHc2QHs0vCRzdyn4XgQbCYxwv2YfUsOV6JrU9zyT9MhcBuY9d"))
                        )
                     );
                     if (!Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("rX+dDSmOeIcCCW71vK0Eg6WWemkIqzQ/dvm7SFDghmBVTm6+cFhb6A==").equals(var9)) {
                        var2.put(var7, var9);
                     }
                  }
               }
            }
         }

         return (Map<Integer, String>)(var2.isEmpty() ? Collections.emptyMap() : var2);
      } else {
         return Collections.emptyMap();
      }
   }

   public TreeMap<Integer, double[]> readTimelinePositionPoints(Map<String, Object> var1, double var2, double var4) {
      if ((2132149312 * 2132149312 - 2132149312 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TreeMap var6 = new TreeMap();
         if (var1 != null && !var1.isEmpty()) {
            Map var7 = this.readAnimationTimelineRowMap(
               var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
            );
            if (var7 != null && !var7.isEmpty()) {
               TreeMap var8 = new TreeMap();

               for (Entry var10 : (Iterable<Entry>) (var7.entrySet())) {

                  if (var10 != null && var10.getValue() != null) {
                     double var11 = this.parseDouble(var10.getKey(), Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-7098199172451700333L, 12)));
                     if (Double.isFinite(var11)) {
                        Map var13 = this.toStringObjectMap(var10.getValue());
                        if (var13 != null && !var13.isEmpty()) {
                           int var14 = this.clampAnimationTimelineTick((int)Math.round(var11));
                           var8.put(var14, var13);
                        }
                     }
                  }
               }

               if (var8.isEmpty()) {
                  return var6;
               } else {
                  for (Entry var27 : (Iterable<Entry>) (var8.entrySet())) {

                     int var28 = this.clampAnimationTimelineTick((Integer)var27.getKey());
                     Map var12 = (Map)var27.getValue();
                     if (var12 != null && !var12.isEmpty()) {
                        double[] var29 = this.interpolateTimelineVector2(var6, var28, var2, var4);
                        double var30 = this.parseDouble(
                           var12.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(1205542506419834559L, 27))
                        );
                        double var16 = this.parseDouble(
                           var12.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(4822170025679338236L, 29))
                        );
                        double var18 = this.parseDouble(
                           var12.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6uDY1sm+AuUksaaw9BNsJWwteWLjTL1HFMKd1R+7rIhZ26IS")),
                           this.parseDouble(
                              var12.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sxBisjkfyC2m7fqOvJOMlPSvIL6i7lYwD0JOXqUQA2JRCwbd")),
                              Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-1320419723849641735L, 52))
                           )
                        );
                        double var20 = this.parseDouble(
                           var12.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("m/YVxwgJEuC94Z2sXxu0nwNPDpaV+YHItc6GZUh2qwb0FnLH")),
                           this.parseDouble(
                              var12.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("k3xDPdBn5qSHRa+IGKOmg/EzB5/SJgo+4ZMnoj+Zxx62Os+g")),
                              Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(2723551556618440466L, 1))
                           )
                        );
                        double var22 = var29[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 31)];
                        if (Double.isFinite(var30)) {
                           var22 = var30;
                        } else if (Double.isFinite(var18)) {
                           var22 = var29[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560171, 3)] + var18;
                        }

                        double var24 = var29[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 23)];
                        if (Double.isFinite(var16)) {
                           var24 = var16;
                        } else if (Double.isFinite(var20)) {
                           var24 = var29[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 21)] + var20;
                        }

                        Integer var10001 = var28;
                        double[] var10002 = new double[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821193613, 10)];
                        var10002[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 4)] = var22;
                        var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 31)] = var24;
                        var6.put(var10001, var10002);
                     }
                  }

                  return var6;
               }
            } else {
               return var6;
            }
         } else {
            return var6;
         }
      }
   }

   public TreeMap<Integer, double[]> readAnimationTimelineScalePoints(Map<String, Object> var1, double var2, double var4, double var6, double var8) {
      if ((-153028040 * (-153028040 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TreeMap var10 = new TreeMap();
         if (var1 != null && !var1.isEmpty()) {
            Map var11 = this.readAnimationTimelineRowMap(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU="));
            if (var11 != null && !var11.isEmpty()) {
               TreeMap var12 = this.readTimelinePositionPoints(var1, var2, var4);
               Map var13 = this.readAnimationTimelineRowMap(
                  var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
               );
               Map var14 = this.readTimelineInterpModes(var13);

               for (Entry var16 : (Iterable<Entry>) (var11.entrySet())) {

                  if (var16 != null && var16.getValue() != null) {
                     double var17 = this.parseDouble(var16.getKey(), Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(-3650336688141729456L, 12)));
                     if (Double.isFinite(var17)) {
                        int var19 = this.clampAnimationTimelineTick((int)Math.round(var17));
                        Map var20 = this.toStringObjectMap(var16.getValue());
                        if (var20 != null && !var20.isEmpty()) {
                           double var21 = this.parseDouble(
                              var20.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("12rOp0dJsw23cpdryNzLI7VPRX6KhgSFmFJDudrtu6ICN5lmuUI=")),
                              Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(2719047956991069973L, 4))
                           );
                           double var23 = this.parseDouble(
                              var20.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("owq+EUq6W/FzM8bowqRiStOgzkKF2W9MafTl+6UioAEOacj6hv/qsA==")),
                              Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(2251155077491962042L, 41))
                           );
                           if (Double.isFinite(var21) && Double.isFinite(var23)) {
                              double var25 = this.parseDouble(
                                 var20.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8HArtIOcl/csSOrGq2gEeFqPlNT2UHqYCnSiPqMkE6MBGoJ3GHkJrngJ")),
                                 Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5717150536788904304L, 6))
                              );
                              double var27 = this.parseDouble(
                                 var20.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ca+dF+2HTqoDrJ5T87/6mxluBtRDBskns4EACsntgluFtcHR1gzDQo00")),
                                 Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035348711999568L, 21))
                              );
                              if (!Double.isFinite(var25) || !Double.isFinite(var27)) {
                                 double var29 = this.parseDouble(
                                    var20.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/")),
                                    Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573176051841665360L, 48))
                                 );
                                 double var31 = this.parseDouble(
                                    var20.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")),
                                    Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(7883386282912417743L, 55))
                                 );
                                 if (Double.isFinite(var29) && Double.isFinite(var31)) {
                                    double[] var33 = this.interpolateTimelineVector2(var12, var19, var2, var4, var14);
                                    var25 = var29 - var33[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 7)];
                                    var27 = var31 - var33[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574125, 2)];
                                 }
                              }

                              if (Double.isFinite(var25) && Double.isFinite(var27)) {
                                 double[] var34 = this.interpolateTimelineVector2(var12, var19, var2, var4, var14);
                                 double var30 = var34[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 28)];
                                 double var32 = var34[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 12)];
                                 Integer var10001 = var19;
                                 double[] var10002 = new double[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821061517, 17)];
                                 var10002[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120341, 4)] = var30 + var25;
                                 var10002[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1237399856, 1)] = var32 + var27;
                                 var10002[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923582313, 12)] = var21;
                                 var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192581, 2)] = var23;
                                 var10.put(var10001, var10002);
                              }
                           }
                        }
                     }
                  }
               }

               return var10;
            } else {
               return var10;
            }
         } else {
            return var10;
         }
      }
   }

   public Map<String, Object> toDeepStringObjectMap(ConfigurationSection var1) {
      if ((2019081142 * 2019081142 - 2019081142 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (String var4 : var1.getKeys((Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106434413, 10) != 0))) {
            if (var4 != null && !var4.isBlank()) {
               var2.put(var4, this.toDeepStringObjectValue(var1.get(var4)));
            }
         }

         return var2;
      }
   }

   public Object toDeepStringObjectValue(Object var1) {
      if (((-1539741858 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof ConfigurationSection var7) {
         return this.toDeepStringObjectMap(var7);
      } else if (var1 instanceof Map var6) {
         LinkedHashMap var8 = new LinkedHashMap();

         for (Entry var10 : (Iterable<Entry>) (var6.entrySet())) {

            if (var10 != null && var10.getKey() != null) {
               var8.put(var10.getKey().toString(), this.toDeepStringObjectValue(var10.getValue()));
            }
         }

         return var8;
      } else if (!(var1 instanceof List var2)) {
         return var1;
      } else {
         ArrayList var3 = new ArrayList(var2.size());

         for (Object var5 : var2) {
            var3.add(this.toDeepStringObjectValue(var5));
         }

         return var3;
      }
   }

   public void applyOpenInitialZeroTickPose(EditorSession var1) {
      if ((-1626950734 * -1626950734 + -1626950734 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.editMode && var1.rawBlocks != null && !var1.rawBlocks.isEmpty()) {
         LinkedHashSet var2 = this.resolveTimelinePreviewTargetIds(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         if (!var2.isEmpty()) {
            boolean var3 = false;

            for (String var5 : (Iterable<String>) (var2)) {

               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(931962729, 23)];
               var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 0)] = var5;
               String var6 = this.firstNonBlank(var10001);
               if (!var6.isBlank() && this.resolveOpenAnimationDelayTicks(var1, var6) <= 0) {
                  Map var7 = this.resolveRawTargetByTargetId(var1, var6);
                  if (var7 != null && !var7.isEmpty()) {
                     boolean var8 = this.isAnimationTimelineImageGroupRoot(var1, var6);
                     double var9 = this.readMapPathDouble(
                        var7,
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6HwU4TcF7KCcn5Cf8P5QiyRj6ZhC+3gtQs9eOQdwANAZPMLz79j6yoqk/118ToMF"),
                        this.readMapPathDouble(
                           var7,
                           Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/"),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(6705753032290475224L, 32))
                        )
                     );
                     double var11 = this.readMapPathDouble(
                        var7,
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5cHjS94Vo02Hw4hIKN9TkMjYZbE2wjvCTJoEZ+3BapSjzPJ0jgdfUZUL8fQ1K7gc"),
                        this.readMapPathDouble(
                           var7,
                           Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh"),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(7022306418770620531L, 26))
                        )
                     );
                     int var13 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906460, 7);
                     int var14 = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 4);
                     Map var15 = this.readAnimationTimelineRowMap(
                        var7, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
                     );
                     if (this.readAnimationTimelineTickValue(var15, Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 21)) instanceof Map var17) {
                        double var19 = this.parseDouble(
                           var17.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392457253102L, 35))
                        );
                        double var21 = this.parseDouble(
                           var17.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035348711999568L, 21))
                        );
                        double var23 = this.parseDouble(
                           var17.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6uDY1sm+AuUksaaw9BNsJWwteWLjTL1HFMKd1R+7rIhZ26IS")),
                           this.parseDouble(
                              var17.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sxBisjkfyC2m7fqOvJOMlPSvIL6i7lYwD0JOXqUQA2JRCwbd")),
                              Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-4402131236152762138L, 27))
                           )
                        );
                        double var25 = this.parseDouble(
                           var17.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("m/YVxwgJEuC94Z2sXxu0nwNPDpaV+YHItc6GZUh2qwb0FnLH")),
                           this.parseDouble(
                              var17.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("k3xDPdBn5qSHRa+IGKOmg/EzB5/SJgo+4ZMnoj+Zxx62Os+g")),
                              Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-2993027989368177418L, 59))
                           )
                        );
                        if (!Double.isFinite(var19) && Double.isFinite(var23)) {
                           var19 = var9 + var23;
                        }

                        if (!Double.isFinite(var21) && Double.isFinite(var25)) {
                           var21 = var11 + var25;
                        }

                        if (Double.isFinite(var19)) {
                           var9 = var19;
                           var3 = (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 17) != 0);
                           var13 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560163, 3);
                        }

                        if (Double.isFinite(var21)) {
                           var11 = var21;
                           var3 = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(655138665, 28) != 0);
                           var14 = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 27);
                        }
                     }

                     Map var33 = this.readAnimationTimelineRowMap(
                        var7, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU=")
                     );
                     if (this.readAnimationTimelineTickValue(var33, Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1371819786, 30)) instanceof Map var34) {
                        double var36 = this.parseDouble(
                           var34.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("12rOp0dJsw23cpdryNzLI7VPRX6KhgSFmFJDudrtu6ICN5lmuUI=")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-2993027989368177418L, 59))
                        );
                        double var38 = this.parseDouble(
                           var34.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("owq+EUq6W/FzM8bowqRiStOgzkKF2W9MafTl+6UioAEOacj6hv/qsA==")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(2078513549702516436L, 16))
                        );
                        if (Double.isFinite(var36)) {
                           this.setNested(
                              var7,
                              Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("u3X1dum/8HRR9rVSU61e9HXPUobnaW5OPEkkeObNAU677R9k"),
                              Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("12rOp0dJsw23cpdryNzLI7VPRX6KhgSFmFJDudrtu6ICN5lmuUI="),
                              var36
                           );
                           var3 = true;
                        }

                        if (Double.isFinite(var38)) {
                           this.setNested(
                              var7,
                              Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("u3X1dum/8HRR9rVSU61e9HXPUobnaW5OPEkkeObNAU677R9k"),
                              Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("owq+EUq6W/FzM8bowqRiStOgzkKF2W9MafTl+6UioAEOacj6hv/qsA=="),
                              var38
                           );
                           var3 = true;
                        }

                        double var40 = this.parseDouble(
                           var34.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(7451784391237816173L, 63))
                        );
                        double var27 = this.parseDouble(
                           var34.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-5781444633939791245L, 17))
                        );
                        double var29 = this.parseDouble(
                           var34.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8HArtIOcl/csSOrGq2gEeFqPlNT2UHqYCnSiPqMkE6MBGoJ3GHkJrngJ")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-5825305458517479157L, 39))
                        );
                        double var31 = this.parseDouble(
                           var34.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ca+dF+2HTqoDrJ5T87/6mxluBtRDBskns4EACsntgluFtcHR1gzDQo00")),
                           Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-3904973748306803272L, 3))
                        );
                        if (var8 && var13 != 0) {
                           var40 = Double.isFinite(var29)
                              ? var9 + var29
                              : Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721440477525815534L, 48));
                        } else if (!Double.isFinite(var40) && Double.isFinite(var29)) {
                           var40 = var9 + var29;
                        }

                        if (var8 && var14 != 0) {
                           var27 = Double.isFinite(var31)
                              ? var11 + var31
                              : Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2466706276437700846L, 60));
                        } else if (!Double.isFinite(var27) && Double.isFinite(var31)) {
                           var27 = var11 + var31;
                        }

                        if (Double.isFinite(var40)) {
                           var9 = var40;
                           var3 = true;
                        }

                        if (Double.isFinite(var27)) {
                           var11 = var27;
                           var3 = true;
                        }
                     }

                     Map var35 = this.readAnimationTimelineRowMap(
                        var7, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7Wf8/0SpE3grypOuZuEUYgFirwzeJ7/+xO4WoIVTQOJmKpbsL7CC76q0")
                     );
                     Object var20 = this.readAnimationTimelineTickValue(var35, Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 29));
                     double var37 = this.readTargetOpacity(var1, var6);
                     double var39 = this.resolveAnimationOpacityValue(var20, var37);
                     if (Double.isFinite(var39)) {
                        var3 |= this.setTargetOpacity(var1, var6, this.clampAnimationTimelineOpacityRaw(var39));
                     }

                     this.setNested(
                        var7,
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ="),
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("667OLoWzG+pU4acUNqFsGg0HSIZFQ+gBCVOy1Vi/"),
                        var9
                     );
                     this.setNested(
                        var7,
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ="),
                        Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh"),
                        var11
                     );
                  }
               }
            }

            if (var3) {
               var1.renderBlocks = this.resolveRenderableBlocks(var1.rawBlocks, var1.components, var1);
            }
         }
      }
   }

   public void startEditorShellOpenAnimations(Player var1, EditorSession var2) {
      if ((-413754648 ^ -413754648) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         if (var2.shellBlocks != null && !var2.shellBlocks.isEmpty()) {
            LinkedHashMap var3 = this.collectShellOpenAnimationTargets(var2);
            if (!var3.isEmpty()) {
               LinkedHashMap var4 = new LinkedHashMap();
               LinkedHashMap var5 = new LinkedHashMap();

               for (Entry var7 : (Iterable<Entry>) (var3.entrySet())) {

                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(154674982, 30)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 10)] = (String)var7.getKey();
                  String var8 = this.firstNonBlank(var10001);
                  if (!var8.isBlank() && var7.getValue() != null && !((Map)var7.getValue()).isEmpty()) {
                     EditorRect var9 = this.findShellBlockRect(var2, var8);
                     if (var9 != null) {
                        var4.put(var8, (Map)var7.getValue());
                        var5.put(var8, new EditorRect(var9.x, var9.y, var9.width, var9.height));
                     }
                  }
               }

               if (!var4.isEmpty() && !var5.isEmpty()) {
                  LinkedHashMap var13 = this.collectShellOpenAnimationFollowerRects(var2, var4.keySet());
                  int var14 = this.resolveShellOpenAnimationMaxTick(var4);
                  if (var14 >= 0) {
                     this.applyEditorShellOpenAnimationTick(
                        var1, var2, var4, var5, var13, Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 50))
                     );
                     if (var14 > 0) {
                        LinkedHashMap var15 = new LinkedHashMap(var4);
                        LinkedHashMap var10 = new LinkedHashMap(var5);
                        LinkedHashMap var11 = new LinkedHashMap(var13);
                        int[] var10000 = new int[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-152159312, 22)];
                        var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 17)] = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(656804152, 14);
                        int[] var12 = var10000;
                        Xqedii_38o2zes.Xqedii_j3mggbv(
                           this.plugin,
                           var1,
                           Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2865415580948345070L, 57),
                           Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-4679034462048826866L, 19),
                           var8x -> {
                              if (((1398523382 | 1) & 1) == 0) {
                                 throw new IllegalStateException();
                              } else if (!var1.isOnline()) {
                                 var8x.cancel();
                              } else {
                                 EditorSession var9x = this.editorSessions.get(var1.getUniqueId());
                                 if (var9x != null && var9x == var2 && var9x.editMode && var9x.previewMode) {
                                    if (var12[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 19)] > var14) {
                                       var8x.cancel();
                                    } else {
                                       this.applyEditorShellOpenAnimationTick(
                                          var1, var9x, var15, var10, var11, var12[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1917716937, 28)]
                                       );
                                       var12[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1910343605, 1)] += Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923049833, 19);
                                    }
                                 } else {
                                    var8x.cancel();
                                 }
                              }
                           }
                        );
                     }
                  }
               }
            }
         }
      }
   }

   public LinkedHashMap<String, Map<String, Object>> collectShellOpenAnimationTargets(EditorSession var1) {
      if ((-1593160222 * (-1593160222 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var2 = new LinkedHashMap();
         if (var1 != null && var1.shellBlocks != null && !var1.shellBlocks.isEmpty()) {
            this.ensureShellBlockCache(var1);
            if (var1.shellSectionCache.isEmpty()) {
               return var2;
            } else {
               for (Entry var4 : var1.shellSectionCache.entrySet()) {
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-1223909527, 31)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 14)] = (String)var4.getKey();
                  String var5 = this.firstNonBlank(var10001);
                  ConfigurationSection var6 = (ConfigurationSection)var4.getValue();
                  if (!var5.isBlank() && var6 != null) {
                     Map var7 = this.toDeepStringObjectMap(var6);
                     if (var7 != null && !var7.isEmpty()) {
                        Map var8 = this.readAnimationTimelineRowMap(
                           var7, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
                        );
                        Map var9 = this.readAnimationTimelineRowMap(
                           var7, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU=")
                        );
                        int var10 = var8 != null && !var8.isEmpty()
                           ? Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-596155923, 31)
                           : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906460, 7);
                        int var11 = var9 != null && !var9.isEmpty()
                           ? Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560163, 3)
                           : Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(82098471, 11);
                        if (var10 != 0 || var11 != 0) {
                           var2.put(var5, var7);
                        }
                     }
                  }
               }

               return var2;
            }
         } else {
            return var2;
         }
      }
   }

   public int resolveShellOpenAnimationMaxTick(Map<String, Map<String, Object>> var1) {
      if ((-84774414 * (-84774414 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         int var2 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-916304375, 20);

         for (Map var4 : var1.values()) {
            if (var4 != null && !var4.isEmpty()) {
               int var5 = this.resolveShellOpenAnimationDelayTicks(var4);
               Map var6 = this.readAnimationTimelineRowMap(
                  var4, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
               );
               Map var7 = this.readAnimationTimelineRowMap(var4, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU="));

               for (int var9 : (Iterable<Integer>) (this.readAnimationTimelineTicks(var6))) {

                  var2 = Math.max(var2, var5 + this.clampAnimationTimelineTick(var9));
               }

               for (int var11 : (Iterable<Integer>) (this.readAnimationTimelineTicks(var7))) {

                  var2 = Math.max(var2, var5 + this.clampAnimationTimelineTick(var11));
               }
            }
         }

         return var2;
      } else {
         return Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(618699926, 0);
      }
   }

   public int resolveShellOpenAnimationDelayTicks(Map<String, Object> var1) {
      if ((-279356652 * -279356652 - -279356652 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Object var2 = this.readMapPathValue(
            var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("o9A6UDXZl8D2IYK5m14i4/OgKdLLmczch5DJLT8TIr/mfCsYpptik8myctAhEublt5/kxerrzfD5sCrrDq+ea3zjt3dlDWjP")
         );
         return this.parseOpenAnimationDelayTicks(var2);
      }
   }

   public LinkedHashMap<String, LinkedHashMap<String, EditorRect>> collectShellOpenAnimationFollowerRects(EditorSession var1, Set<String> var2) {
      if ((353357969 * (353357969 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap();
         if (var1 != null && var2 != null && !var2.isEmpty()) {
            LinkedHashSet var4 = new LinkedHashSet();

            for (String var6 : var2) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560163, 3)];
               var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 26)] = var6;
               String var7 = this.firstNonBlank(var10001);
               if (!var7.isBlank()) {
                  var4.add(var7);
               }
            }

            if (var4.isEmpty()) {
               return var3;
            } else {
               for (String var14 : (Iterable<String>) (var4)) {

                  LinkedHashSet var15 = this.resolveShellAnimationMemberIds(var1, var14);
                  if (!var15.isEmpty()) {
                     LinkedHashMap var8 = new LinkedHashMap();

                     for (String var10 : (Iterable<String>) (var15)) {

                        String[] var16 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1054407452, 27)];
                        var16[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 5)] = var10;
                        String var11 = this.firstNonBlank(var16);
                        if (!var11.isBlank() && !var11.equals(var14) && !var4.contains(var11)) {
                           EditorRect var12 = this.findShellBlockRect(var1, var11);
                           if (var12 != null) {
                              var8.put(var11, new EditorRect(var12.x, var12.y, var12.width, var12.height));
                           }
                        }
                     }

                     if (!var8.isEmpty()) {
                        var3.put(var14, var8);
                     }
                  }
               }

               return var3;
            }
         } else {
            return var3;
         }
      }
   }

   public LinkedHashSet<String> resolveShellAnimationMemberIds(EditorSession var1, String var2) {
      if ((-2146681160 ^ -2146681160) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         if (var1 != null && var1.shellBlocks != null && !var1.shellBlocks.isEmpty()) {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-298077962, 30)];
            var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 25)] = var2;
            String var4 = this.firstNonBlank(var10001);
            if (var4.isBlank()) {
               return var3;
            } else {
               ConfigurationSection var5 = this.findShellBlockSection(var1, var4);
               if (var5 == null) {
                  var3.add(var4);
                  return var3;
               } else {
                  var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(924622697, 20)];
                  var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 22)] = var5.getString(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NspoE7CEqwyPkT7z+htrfxq4kg6ghjcGb5jGpWdDVv2b/rN/GlYr4OQusqyxDib5G22RPRq1XT/ccJFJS/AVHR+pQ4I=")
                  );
                  String var6 = this.firstNonBlank(var10001);
                  if (var6.isBlank()) {
                     var3.add(var4);
                     return var3;
                  } else {
                     HashMap var7 = new HashMap();
                     int var8 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-474280086, 2);

                     for (Map var10 : var1.shellBlocks) {
                        var8++;
                        ConfigurationSection var11 = this.mapToSection(var10);
                        if (var11 != null) {
                           var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573097, 10)];
                           var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 28)] = var11.getString(
                              Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                                 "NspoE7CEqwyPkT7z+htrfxq4kg6ghjcGb5jGpWdDVv2b/rN/GlYr4OQusqyxDib5G22RPRq1XT/ccJFJS/AVHR+pQ4I="
                              )
                           );
                           String var12 = this.firstNonBlank(var10001);
                           if (this.belongsToSidebarPanel(var6, var12)) {
                              String var13 = this.resolveElementId(var11, var8, var7);
                              var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1667750688, 16)];
                              var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1461573755, 29)] = var13;
                              String var14 = this.firstNonBlank(var10001);
                              if (!var14.isBlank()) {
                                 var3.add(var14);
                              }
                           }
                        }
                     }

                     if (var3.isEmpty() || !var3.contains(var4)) {
                        var3.add(var4);
                     }

                     return var3;
                  }
               }
            }
         } else {
            return var3;
         }
      }
   }

   public void applyEditorShellOpenAnimationTick(
      Player var1,
      EditorSession var2,
      Map<String, Map<String, Object>> var3,
      Map<String, EditorRect> var4,
      Map<String, LinkedHashMap<String, EditorRect>> var5,
      double var6
   ) {
      if ((-2004106418 * -2004106418 + -2004106418 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isEmpty() && var4 != null && !var4.isEmpty()) {
         for (Entry var9 : var3.entrySet()) {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 10)];
            var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 31)] = (String)var9.getKey();
            String var10 = this.firstNonBlank(var10001);
            if (!var10.isBlank()) {
               Map var11 = (Map)var9.getValue();
               EditorRect var12 = (EditorRect)var4.get(var10);
               if (var11 != null && !var11.isEmpty() && var12 != null) {
                  int var13 = this.resolveShellOpenAnimationDelayTicks(var11);
                  double var14 = var6 - var13;
                  if (!(var14 < Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 10)))) {
                     double[] var16 = this.resolveShellOpenAnimationState(var11, var12, var14);
                     if (var16 != null && var16.length >= Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-2017627683, 17)) {
                        this.moveShellElement(
                           var1,
                           var2,
                           var10,
                           var16[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 31)],
                           var16[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(517850998, 19)],
                           var16[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573097, 9)],
                           var16[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574185, 6)]
                        );
                        if (var5 != null && !var5.isEmpty()) {
                           Map var17 = (Map)var5.get(var10);
                           if (var17 != null && !var17.isEmpty()) {
                              double var18 = var16[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 29)] - var12.x;
                              double var20 = var16[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(890019689, 25)] - var12.y;
                              if (Double.isFinite(var18) && Double.isFinite(var20)) {
                                 for (Entry var23 : (Iterable<Entry>) (var17.entrySet())) {

                                    var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120325, 4)];
                                    var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 24)] = (String)var23.getKey();
                                    String var24 = this.firstNonBlank(var10001);
                                    EditorRect var25 = (EditorRect)var23.getValue();
                                    if (!var24.isBlank() && var25 != null) {
                                       this.moveShellElement(var1, var2, var24, var25.x + var18, var25.y + var20, var25.width, var25.height);
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

   public double[] resolveShellOpenAnimationState(Map<String, Object> var1, EditorRect var2, double var3) {
      if (((-422224999 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null) {
         TreeMap var5 = this.readTimelinePositionPoints(var1, var2.x, var2.y);
         TreeMap var6 = this.readAnimationTimelineScalePoints(var1, var2.x, var2.y, var2.width, var2.height);
         if (var5.isEmpty() && var6.isEmpty()) {
            return null;
         } else {
            Map var7 = this.readAnimationTimelineRowMap(
               var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
            );
            Map var8 = this.readAnimationTimelineRowMap(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU="));
            Map var9 = this.readTimelineInterpModes(var7);
            Map var10 = this.readTimelineInterpModes(var8);
            double var11 = var2.x;
            double var13 = var2.y;
            if (!var5.isEmpty()) {
               double[] var15 = this.interpolateTimelineVector2(var5, var3, var2.x, var2.y, var9);
               var11 = var15[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053217207, 9)];
               var13 = var15[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(386703209, 29)];
            }

            double var26 = Math.max(Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(6148933151063050576L, 61)), var2.width);
            double var17 = Math.max(Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(1205542506520481471L, 27)), var2.height);
            if (!var6.isEmpty()) {
               TreeMap var19 = new TreeMap();
               TreeMap var20 = new TreeMap();
               TreeMap var21 = new TreeMap();

               for (Entry var23 : (Iterable<Entry>) (var6.entrySet())) {

                  if (var23 != null
                     && var23.getKey() != null
                     && var23.getValue() != null
                     && ((double[])var23.getValue()).length >= Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1552757133, 28)) {
                     int var24 = this.clampAnimationTimelineTick((Integer)var23.getKey());
                     double[] var25 = (double[])var23.getValue();
                     Integer var10001 = var24;
                     double[] var10002 = new double[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821194637, 11)];
                     var10002[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 27)] = var25[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 29)];
                     var10002[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 4)] = var25[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 29)];
                     var19.put(var10001, var10002);
                     var20.put(var24, var25[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331510898, 12)]);
                     var21.put(var24, var25[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053215671, 9)]);
                  }
               }

               var26 = Math.max(
                  Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872464174L, 18)),
                  this.interpolateTimelineChannel(
                     var20, var3, Math.max(Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573036998517360976L, 41)), var2.width), var10
                  )
               );
               var17 = Math.max(
                  Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035348713060692L, 14)),
                  this.interpolateTimelineChannel(
                     var21, var3, Math.max(Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(1125577264002291805L, 40)), var2.height), var10
                  )
               );
               if (!var19.isEmpty()) {
                  double[] var27 = this.interpolateTimelineVector2(var19, var3, var11, var13, var10);
                  var11 = var27[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1326010821, 14)];
                  var13 = var27[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 14)];
               }
            }

            double[] var10000 = new double[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923590505, 12)];
            var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 13)] = var11;
            var10000[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1620279922, 26)] = var13;
            var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1820930445, 18)] = var26;
            var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821127053, 15)] = var17;
            return var10000;
         }
      } else {
         return null;
      }
   }

   public abstract boolean createNewUiInEditor(Player var1, EditorSession var2);

   public abstract EditorRect getEditorMenuHitboxBounds(EditorSession var1, String var2);

   public abstract boolean isEditorMenuHitboxHovered(EditorSession var1, String var2, double var3, double var5);

   public abstract String normalizeCustomCommandToken(String var1);

   public abstract void refreshCursorVisualState(Player var1, EditorSession var2, double var3, double var5);

   public abstract void rerenderShellAfterWindowToggle(Player var1, EditorSession var2);

   public abstract void updateMenuFilePopupActionIcons(Player var1, EditorSession var2, String var3);

   public abstract void updateEditorMenuHoverIcons(Player var1, EditorSession var2, double var3, double var5);

   public abstract void populateSavePopupDefaults(EditorSession var1);

   public abstract boolean isRuntimeHudStackPageMatch(Map<String, Object> var1, String var2);

   public abstract void updateCursorPageDropdownHover(Player var1, EditorSession var2, double var3, double var5);

   public abstract void updateCursorLayersDropdownHover(Player var1, EditorSession var2, double var3, double var5);

   public abstract boolean handleActivePagesCursorMove(Player var1, EditorSession var2, double var3, double var5);

   public abstract List<String> resolveOpenEditorPagesForPlayer(UUID var1, String var2);

   public abstract List<Map<String, Object>> buildShellBlocksWithActivePages(
      List<Map<String, Object>> var1, Map<String, YamlConfiguration> var2, List<String> var3, int var4, String var5
   );

   public abstract boolean isActivePagesShellLogicalId(String var1);

   public abstract void clearActivePagesRuntimeSlots(Player var1, Set<String> var2);

   public abstract void syncActivePagesRenderedSlotStates(EditorSession var1);

   public abstract void applyRuntimeHudNoTransition(Player var1, String var2);

   public abstract void applyRuntimeHudTransitionTicks(Player var1, String var2, int var3, int var4);

   public abstract void resetActivePagesDragState(EditorSession var1);

   public abstract void clearActivePagesDragPreview(Player var1);

   public abstract String resolveNextUntitledPageKey(Player var1, EditorSession var2);

   public abstract String formatUntitledPageDisplayName(String var1);

   public abstract void snapshotCurrentEditorPage(UUID var1, EditorSession var2);

   public abstract void resetTransientPanelsForPageSwitch(Player var1, EditorSession var2);

   public abstract void rememberEditorWorkingPage(UUID var1, String var2, List<Map<String, Object>> var3);

   @Override
   public abstract void rememberOpenedEditorPage(UUID var1, String var2);

   public abstract int resolveInitialActivePagesScrollOffset(List<String> var1, String var2);

   public abstract void rerenderActivePagesShell(Player var1, EditorSession var2);

   public abstract void rerenderActivePagesShell(Player var1, EditorSession var2, boolean var3);

   public abstract void rerenderActivePagesShell(Player var1, EditorSession var2, boolean var3, boolean var4);

   public abstract void rerenderEditorShellForPageSwitch(Player var1, EditorSession var2);

   public abstract void applyEditorDisplayPreferences(Player var1);

   public abstract void applyEditorDisplayPreferences(Player var1, EditorSession var2);

   public abstract void savePlayerColorPrefs(Player var1, EditorSession var2);

   public abstract ItemStack resolveInventoryPickSource(ItemStack... var1);

   public abstract Map<String, Integer> serializeItemSelectionEnchantments(ItemStack var1);

   public void startRuntimeOpenAnimations(Player var1, EditorSession var2, boolean var3) {
      if ((182529227 * (182529227 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.startRuntimeOpenAnimations(
            var1, var2, var3, var2 == null ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==") : var2.pageName
         );
      }
   }

   public void startRuntimeOpenAnimations(Player var1, EditorSession var2, boolean var3, String var4) {
      if ((-1116218638 * -1116218638 + -1116218638 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.editMode) {
         String var5 = this.normalizePageKey(var4, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         LinkedHashSet var6 = this.resolveTimelinePreviewTargetIds(var2, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         if (var2.hudTextOnlyMode && !var5.isBlank()) {
            var6 = this.filterOpenAnimationTargetsByStackPage(var2, var6, var5);
         } else if (var2.hudTextOnlyMode && var5.isBlank()) {
            var6 = this.filterUnscopedOpenAnimationTargets(var6);
         }

         String var7 = var2.hudTextOnlyMode ? var5 : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         LinkedHashSet var8 = this.scopeRuntimeOpenAnimationTargets(var6, var7);
         if (var8.isEmpty()) {
            if (var3) {
               this.closeRuntimeUiAfterAutoplay(var1, var2, var5);
            }
         } else {
            int var9 = this.resolveOpenAnimationMaxTick(var2, var8);
            if (var9 < 0) {
               if (var3) {
                  this.closeRuntimeUiAfterAutoplay(var1, var2, var5);
               }
            } else {
               String var10 = this.normalizeRuntimeAnimationPageKey(var7);
               long var11 = this.reserveRuntimeOpenAnimationToken(var2, var10);
               if (this.isOpenAnimationScopedPlayback(var8)) {
                  this.clearRuntimeOpenPreviewOffsets(var1, var2, var8);
               } else {
                  this.clearTimelinePreviewOffset(var1, var2);
               }

               this.applyRuntimeOpenAnimationTick(var1, var2, var8, Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_2r0o9fibdx8mg(5573035348713048400L, 57)));
               Xqedii_38o2zes.Xqedii_2sj63w1(
                  this.plugin,
                  var1,
                  () -> {
                     if (((-1796944880 | 1) & 1) == 0) {
                        throw new IllegalStateException();
                     } else if (var1.isOnline()) {
                        EditorSession var7x = this.editorSessions.get(var1.getUniqueId());
                        if (var7x != null && var7x == var2 && !var7x.editMode && this.isRuntimeOpenAnimationTokenActive(var7x, var11, var10)) {
                           this.applyRuntimeOpenAnimationTick(
                              var1, var7x, var8, Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 58))
                           );
                        }
                     }
                  },
                  Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-5035238000538666576L, 33)
               );
               int[] var10000 = new int[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(931962729, 23)];
               var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-578308751, 9)] = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-457103612, 19);
               int[] var13 = var10000;
               Xqedii_38o2zes.Xqedii_j3mggbv(
                  this.plugin,
                  var1,
                  Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-4679034462048826866L, 19),
                  Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-4402131236034092826L, 27),
                  var11x -> {
                     if ((762488809 * (762488809 + 1) & 1) != 0) {
                        throw new IllegalStateException();
                     } else if (!var1.isOnline()) {
                        var11x.cancel();
                     } else {
                        EditorSession var12 = this.editorSessions.get(var1.getUniqueId());
                        if (var12 != null && var12 == var2 && !var12.editMode && this.isRuntimeOpenAnimationTokenActive(var12, var11, var10)) {
                           if (var13[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1918669698, 18)] > var9) {
                              var11x.cancel();
                              if (var12.runtimeAnimationLoop) {
                                 this.startRuntimeOpenAnimations(var1, var12, var3, var5);
                              } else {
                                 if (var3) {
                                    this.closeRuntimeUiAfterAutoplay(var1, var12, var5);
                                 }
                              }
                           } else {
                              this.applyRuntimeOpenAnimationTick(var1, var12, var8, var13[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 6)]);
                              var13[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1309264242, 4)] += Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726647, 5);
                           }
                        } else {
                           var11x.cancel();
                        }
                     }
                  }
               );
            }
         }
      }
   }

   public LinkedHashSet<String> filterOpenAnimationTargetsByStackPage(EditorSession var1, LinkedHashSet<String> var2, String var3) {
      if (((1882214974 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var4 = new LinkedHashSet();
         if (var1 != null && var2 != null && !var2.isEmpty()) {
            String var5 = this.normalizePageKey(var3, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
            if (var5.isBlank()) {
               var4.addAll(var2);
               return var4;
            } else if (var1.renderBlocks != null && !var1.renderBlocks.isEmpty()) {
               LinkedHashSet var6 = new LinkedHashSet();

               for (Map var8 : var1.renderBlocks) {
                  if (var8 != null && !var8.isEmpty() && this.isRuntimeHudStackPageMatch(var8, var5)) {
                     String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574123, 1)];
                     var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 11)] = this.stringValue(
                        this.readMapPathValue(
                           var8,
                           Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("DvFZFOXvtxuJd3TkL1kAHaMuhC71c44c9q49nrrzzwhLugqe6QqRtmaVVI6azxsyfukpgaetoumGhggppCdy3g==")
                        )
                     );
                     String var9 = this.firstNonBlank(var10001);
                     if (!var9.isBlank()) {
                        var6.add(var9);
                     }
                  }
               }

               if (var6.isEmpty()) {
                  var4.addAll(var2);
                  return var4;
               } else {
                  for (String var14 : var2) {
                     String[] var18 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23)];
                     var18[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 30)] = var14;
                     String var16 = this.firstNonBlank(var18);
                     if (!var16.isBlank() && var6.contains(var16)) {
                        var4.add(var16);
                     }
                  }

                  if (!var4.isEmpty()) {
                     return var4;
                  } else {
                     for (String var15 : var2) {
                        String[] var19 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574137, 4)];
                        var19[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1009075986, 16)] = var15;
                        String var17 = this.firstNonBlank(var19);
                        if (!var17.isBlank()) {
                           String var10 = this.composeAnimationScopedTargetId(var17, var5);
                           String var11 = this.resolveRawTargetPathByTargetId(var1, var10);
                           if (!var11.isBlank() && this.doesTargetPathMatchAnimationScope(var1, var11, var10)) {
                              var4.add(var17);
                           }
                        }
                     }

                     return var4;
                  }
               }
            } else {
               var4.addAll(var2);
               return var4;
            }
         } else {
            return var4;
         }
      }
   }

   public LinkedHashSet<String> filterUnscopedOpenAnimationTargets(LinkedHashSet<String> var1) {
      if (((1957340273 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1 != null && !var1.isEmpty()) {
            for (String var4 : var1) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1742413668, 24)];
               var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-457627900, 19)] = var4;
               String var5 = this.firstNonBlank(var10001);
               if (!var5.isBlank() && this.resolveAnimationTargetScopePageKey(var5).isBlank()) {
                  var2.add(var5);
               }
            }

            return var2;
         } else {
            return var2;
         }
      }
   }

   public long reserveRuntimeOpenAnimationToken(EditorSession var1, String var2) {
      if (((1962105862 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-6696076607488984595L, 60);
      } else {
         String var3 = this.normalizeRuntimeAnimationPageKey(var2);
         if (!var3.isBlank()) {
            long var4 = var1.runtimeOpenAnimationTokensByPage.getOrDefault(var3, Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 54));
            long var6 = var4 + Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489194L, 2);
            var1.runtimeOpenAnimationTokensByPage.put(var3, var6);
            return var6;
         } else {
            return var1.runtimeOpenAnimationToken = var1.runtimeOpenAnimationToken + Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2865415580948345070L, 57);
         }
      }
   }

   public boolean isRuntimeOpenAnimationTokenActive(EditorSession var1, long var2, String var4) {
      if ((-1724775386 * (-1724775386 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 30) != 0);
      } else {
         String var5 = this.normalizeRuntimeAnimationPageKey(var4);
         if (var5.isBlank()) {
            return ((var1.runtimeOpenAnimationToken == var2
               ? Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574113, 3)
               : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1461573755, 29)) != 0);
         } else {
            Long var6 = var1.runtimeOpenAnimationTokensByPage.get(var5);
            return ((var6 != null && var6 == var2
               ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 13)
               : Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 4)) != 0);
         }
      }
   }

   public void invalidateOpenAnimationToken(EditorSession var1, String var2) {
      if ((-2072263011 * -2072263011 - -2072263011 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String var3 = this.normalizeRuntimeAnimationPageKey(var2);
         if (!var3.isBlank()) {
            var1.runtimeOpenAnimationTokensByPage.remove(var3);
         } else {
            var1.runtimeOpenAnimationToken = var1.runtimeOpenAnimationToken + Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872423662L, 16);
         }
      }
   }

   public LinkedHashSet<String> scopeRuntimeOpenAnimationTargets(LinkedHashSet<String> var1, String var2) {
      if (((-1949753077 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         if (var1 != null && !var1.isEmpty()) {
            String var4 = this.normalizeRuntimeAnimationPageKey(var2);

            for (String var6 : var1) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 10)];
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-312707231, 23)] = var6;
               String var7 = this.firstNonBlank(var10001);
               if (!var7.isBlank()) {
                  if (var4.isBlank()) {
                     var3.add(var7);
                  } else {
                     var3.add(this.composeAnimationScopedTargetId(var7, var4));
                  }
               }
            }

            return var3;
         } else {
            return var3;
         }
      }
   }

   public boolean isOpenAnimationScopedPlayback(Set<String> var1) {
      if ((673413443 * 673413443 + 673413443 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (String var3 : var1) {
            if (!this.resolveAnimationTargetScopePageKey(var3).isBlank()) {
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311845, 0) != 0);
            }
         }

         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 28) != 0);
      } else {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(82098471, 11) != 0);
      }
   }

   public String resolveOpenAnimationScopePageKey(Set<String> var1) {
      if (((-562449099 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (String var3 : var1) {
            String var4 = this.resolveAnimationTargetScopePageKey(var3);
            if (!var4.isBlank()) {
               return var4;
            }
         }

         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
      } else {
         return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
      }
   }

   public void clearRuntimeOpenPreviewOffsets(Player var1, EditorSession var2, Set<String> var3) {
      if ((938353521 * 938353521 - 938353521 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isEmpty()) {
         String var4 = this.resolveOpenAnimationScopePageKey(var3);
         if (var4.isBlank()) {
            this.clearTimelinePreviewOffset(var1, var2);
         } else {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106433389, 10)];
            var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1053217207, 9)] = var2.animationPreviewTargetId;
            String var5 = this.firstNonBlank(var10001);
            if (!var5.isBlank() && var4.equals(this.resolveAnimationTargetScopePageKey(var5))) {
               this.clearTimelinePrimaryPreviewOffset(var1, var2);
            }

            LinkedHashSet var6 = new LinkedHashSet(var3);
            var6.addAll(var2.previewExtraBaseBoundsByTarget.keySet());
            var6.addAll(var2.previewExtraAppliedBoundsByTarget.keySet());
            var6.addAll(var2.previewExtraBaseRotationByTarget.keySet());
            var6.addAll(var2.previewExtraAppliedRotation.keySet());
            var6.addAll(var2.previewExtraBaseOpacityByTarget.keySet());
            var6.addAll(var2.previewExtraAppliedOpacity.keySet());

            for (String var8 : (Iterable<String>) (var6)) {

               var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1981734343, 11)];
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-474280086, 2)] = var8;
               String var9 = this.firstNonBlank(var10001);
               if (!var9.isBlank() && var4.equals(this.resolveAnimationTargetScopePageKey(var9))) {
                  this.clearTimelineExtraPreviewOffset(var1, var2, var9);
               }
            }
         }
      }
   }

   public void clearStaleScopedPreviewOffsets(Player var1, EditorSession var2, String var3, Set<String> var4) {
      if ((1629518143 ^ 1629518143) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank()) {
         LinkedHashSet var5 = new LinkedHashSet();
         var5.addAll(var2.previewExtraBaseBoundsByTarget.keySet());
         var5.addAll(var2.previewExtraAppliedBoundsByTarget.keySet());
         var5.addAll(var2.previewExtraBaseRotationByTarget.keySet());
         var5.addAll(var2.previewExtraAppliedRotation.keySet());
         var5.addAll(var2.previewExtraBaseOpacityByTarget.keySet());
         var5.addAll(var2.previewExtraAppliedOpacity.keySet());
         var5.removeIf(
            var2x -> !var3.equals(this.resolveAnimationTargetScopePageKey((String) var2x))
         );
         if (var4 != null && !var4.isEmpty()) {
            var5.removeAll(var4);
         }

         for (String var7 : (Iterable<String>) (var5)) {

            this.clearTimelineExtraPreviewOffset(var1, var2, var7);
         }

         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 7)];
         var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 21)] = var2.animationPreviewTargetId;
         String var8 = this.firstNonBlank(var10001);
         if (!var8.isBlank() && var3.equals(this.resolveAnimationTargetScopePageKey(var8)) && (var4 == null || !var4.contains(var8))) {
            this.clearTimelinePrimaryPreviewOffset(var1, var2);
         }
      }
   }

   public void closeRuntimeUiAfterAutoplay(Player var1) {
      if ((-129731765 * -129731765 + -129731765 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.closeRuntimeUiAfterAutoplay(var1, null, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
      }
   }

   public void closeRuntimeUiAfterAutoplay(Player var1, EditorSession var2, String var3) {
      if (((-968338857 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String var4 = this.normalizePageKey(var3, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         int var5 = var2 != null && var2.hudTextOnlyMode && !var2.editMode && !var4.isBlank()
            ? Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1035701996, 20)
            : Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(618699927, 0);
         if (this.plugin != null) {
            if (var5 != 0) {
               this.plugin.closeUiForPlayer(var1, var4);
            } else {
               this.plugin.closeUiForPlayer(var1);
            }
         } else if (var5 != 0) {
            this.closeGui(var1, var4);
         } else {
            this.closeGui(var1);
         }
      }
   }

   public int resolveOpenAnimationMaxTick(EditorSession var1, LinkedHashSet<String> var2) {
      if ((1368758314 * (1368758314 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         int var3 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1897120340, 4);

         for (String var5 : var2) {
            String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726647, 5)];
            var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 6)] = var5;
            String var6 = this.firstNonBlank(var10001);
            if (!var6.isBlank()) {
               int var7 = this.resolveOpenAnimationDelayTicks(var1, var6);

               for (int var9 : this.readAnimationTimelineTicks(
                  var1, var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ=")
               )) {
                  var3 = Math.max(var3, var7 + this.clampAnimationTimelineTick(var9));
               }

               for (int var13 : this.readAnimationTimelineTicks(
                  var1, var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU=")
               )) {
                  var3 = Math.max(var3, var7 + this.clampAnimationTimelineTick(var13));
               }

               for (int var14 : this.readAnimationTimelineTicks(
                  var1, var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("yHs7svWs4197ydenHdBBP9UiZapK+PhKl2krLPW6k2UwQgqt91+tgzq3umQ=")
               )) {
                  var3 = Math.max(var3, var7 + this.clampAnimationTimelineTick(var14));
               }

               for (int var15 : this.readAnimationTimelineTicks(
                  var1, var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7Wf8/0SpE3grypOuZuEUYgFirwzeJ7/+xO4WoIVTQOJmKpbsL7CC76q0")
               )) {
                  var3 = Math.max(var3, var7 + this.clampAnimationTimelineTick(var15));
               }
            }
         }

         return var3;
      } else {
         return Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-923574122, 8);
      }
   }

   public void applyRuntimeOpenAnimationTick(Player var1, EditorSession var2, LinkedHashSet<String> var3, double var4) {
      if ((450926841 * 450926841 - 450926841 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isEmpty()) {
         boolean var6 = this.isOpenAnimationScopedPlayback(var3);
         String var7 = var6 ? this.resolveOpenAnimationScopePageKey(var3) : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         String var8 = var2.runtimeAnimationScopePageKey;
         if (var6) {
            var2.runtimeAnimationScopePageKey = var7;
         }

         try {
            String var10000;
            if (var6) {
               var10000 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            } else {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1918931842, 18)];
               var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 19)] = var2.animationPreviewTargetId;
               var10000 = this.firstNonBlank(var10001);
            }

            String var9 = var10000;
            if (!var6 && (var9.isBlank() || !var3.contains(var9))) {
               for (String var11 : var3) {
                  String[] var35 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923705193, 17)];
                  var35[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(618699927, 0)] = var11;
                  var9 = this.firstNonBlank(var35);
                  if (!var9.isBlank()) {
                     break;
                  }
               }
            }

            int var30 = Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 23);
            LinkedHashSet var31 = new LinkedHashSet();

            for (String var13 : var3) {
               String[] var36 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1642978423, 15)];
               var36[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-459533422, 29)] = var13;
               String var14 = this.firstNonBlank(var36);
               if (!var14.isBlank()) {
                  EditorRect var15 = null;
                  EditorRect var16 = null;
                  if (this.shouldLogTimelineImageDebug(var2, var14)) {
                     var15 = this.resolveTimelineStableBaseBounds(var2, var14);
                     var16 = this.resolveTimelineCurrentBoundsForPreview(var2, var14);
                  }

                  var36 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(927768425, 21)];
                  var36[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-2018151971, 17)] = this.resolveAnimationBaseTargetId(var14);
                  var36[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1217274489, 25)] = var14;
                  String var17 = this.firstNonBlank(var36);
                  if (!this.isTargetVisible(var2, var17)) {
                     if (!var6 && this.equalsNullable(var14, var9)) {
                        this.clearTimelinePrimaryPreviewOffset(var1, var2);
                     } else {
                        this.clearTimelineExtraPreviewOffset(var1, var2, var14);
                     }
                  } else {
                     int var18 = this.resolveOpenAnimationDelayTicks(var2, var14);
                     double var19 = var4 - var18;
                     if (var19 < Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-4402131236168310554L, 27))) {
                        if (this.shouldLogTimelineImageDebug(var2, var14)) {
                           this.logAnimationTimelineImageDebug(
                              var2,
                              Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                                 "atDSM24qdG11rY0DHoNWxBClZdNhGrFLqukicAq1qot7eDf+O8H58Cd+yk9CnELZTwGA5dhNKVSk6mOLMpJ22h6OFgqMxYtkf4g="
                              ),
                              var14,
                              var4,
                              var19,
                              var15,
                              var16,
                              null,
                              Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-923574122, 24),
                              Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(289154375, 8)
                           );
                        }

                        if (!var6 && this.equalsNullable(var14, var9)) {
                           this.clearTimelinePrimaryPreviewOffset(var1, var2);
                        } else {
                           this.clearTimelineExtraPreviewOffset(var1, var2, var14);
                        }
                     } else {
                        double[] var21 = this.resolveTimelinePreviewState(var2, var14, var19);
                        if (var21 != null && var21.length >= Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574120, 30)) {
                           if (this.shouldLogTimelineImageDebug(var2, var14)) {
                              this.logAnimationTimelineImageDebug(
                                 var2,
                                 Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                                    "7/Rh2n64C3MSKJKfMkTG+lADUMTlr4j8YnrNPt5YOryKzyJ2evMVvArXkbbQwLA1WXEez9p65xN2/XXGdMXjPCv8JL2wCWW9cfZD65AZ"
                                 ),
                                 var14,
                                 var4,
                                 var19,
                                 var15,
                                 var16,
                                 var21,
                                 Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-458152188, 19),
                                 Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-923574122, 13)
                              );
                           }

                           if (!var6 && this.equalsNullable(var14, var9)) {
                              this.applyTimelinePreviewOffset(
                                 var1,
                                 var2,
                                 var14,
                                 var21[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331502706, 12)],
                                 var21[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574249, 7)],
                                 var21[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311848, 0)],
                                 var21[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-526607836, 8)]
                              );
                              double var32 = var21.length >= Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1884179986, 7)
                                 ? var21[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-139576400, 22)]
                                 : this.readTargetRotation(var2, var14);
                              double var33 = var21.length >= Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821193357, 8)
                                 ? var21[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(259974075, 18)]
                                 : this.readTargetOpacity(var2, var14);
                              this.applyTimelinePreviewRotation(var1, var2, var14, var32);
                              this.applyTimelinePreviewOpacity(var1, var2, var14, var33);
                              var30 = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(82100519, 11);
                              if (this.shouldLogTimelineImageDebug(var2, var14)) {
                                 EditorRect var34 = this.resolveTimelineCurrentBoundsForPreview(var2, var14);
                                 this.logAnimationTimelineImageDebug(
                                    var2,
                                    Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                                       "LwH4izfuphNrsv2CQImPgpFsIevYpiro+0oWDrn8ce/rvFXtQWKnFZXZiF/Z3KD2rXcy0Wfwx9Jh16NFIZKVo8HfAgYvPdiaF6F1EQ=="
                                    ),
                                    var14,
                                    var4,
                                    var19,
                                    var15,
                                    var34,
                                    var21,
                                    Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(663005410, 13),
                                    Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1820668302, 19)
                                 );
                              }
                           } else {
                              this.applyTimelineExtraPreviewOffset(
                                 var1,
                                 var2,
                                 var14,
                                 var21[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(517326710, 19)],
                                 var21[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1217274489, 25)],
                                 var21[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1667685152, 16)],
                                 var21[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923567977, 11)]
                              );
                              double var22 = var21.length >= Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1667488544, 16)
                                 ? var21[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821190541, 11)]
                                 : this.readTargetRotation(var2, var14);
                              double var24 = var21.length >= Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1770860941, 24)
                                 ? var21[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-2106429293, 10)]
                                 : this.readTargetOpacity(var2, var14);
                              this.applyTimelineExtraPreviewRotation(var1, var2, var14, var22);
                              this.applyTimelineExtraPreviewOpacity(var1, var2, var14, var24);
                              var31.add(var14);
                              if (this.shouldLogTimelineImageDebug(var2, var14)) {
                                 EditorRect var26 = this.resolveTimelineCurrentBoundsForPreview(var2, var14);
                                 this.logAnimationTimelineImageDebug(
                                    var2,
                                    Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                                       "LwH4izfuphNrsv2CQImPgpFsIevYpiro+0oWDrn8ce/rvFXtQWKnFZXZiF/Z3KD2rXcy0Wfwx9Jh16NFIZKVo8HfAgYvPdiaF6F1EQ=="
                                    ),
                                    var14,
                                    var4,
                                    var19,
                                    var15,
                                    var26,
                                    var21,
                                    Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192582, 3),
                                    Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-923574122, 7)
                                 );
                              }
                           }
                        } else if (!var6 && this.equalsNullable(var14, var9)) {
                           this.clearTimelinePrimaryPreviewOffset(var1, var2);
                        } else {
                           this.clearTimelineExtraPreviewOffset(var1, var2, var14);
                        }
                     }
                  }
               }
            }

            if (var6) {
               this.clearStaleScopedPreviewOffsets(var1, var2, var7, var31);
               return;
            }

            if (var30 == 0 && !var9.isBlank()) {
               this.clearTimelinePrimaryPreviewOffset(var1, var2);
            }

            this.clearStaleTimelineExtraPreviewOffsets(var1, var2, var31);
            this.clearStaleTimelineExtraPreviewRotations(var1, var2, var31);
            this.clearStaleTimelineExtraPreviewOpacities(var1, var2, var31);
         } finally {
            var2.runtimeAnimationScopePageKey = var8;
         }
      }
   }

   public boolean isEditorImageFilePopupMode(EditorSession var1) {
      if (((-777290845 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.editMode && var1.previewMode && var1.menuFilePopupImageMode
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 13)
            : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2069306840, 21)) != 0);
      }
   }

   public boolean isEditorImageFilePopupVisible(EditorSession var1) {
      if ((-540071692 * -540071692 + -540071692 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.isEditorImageFilePopupMode(var1) && var1.menuFilePopupVisible
            ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(77337491, 29)
            : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 29)) != 0);
      }
   }

   public boolean isMenuFilePopupRenderContext(EditorSession var1) {
      if ((1518989575 * 1518989575 + 1518989575 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1156617501, 10) != 0);
      } else if (this.isEditorImageFilePopupMode(var1)) {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(654632129, 3) != 0);
      } else {
         return ((!var1.editMode && this.isEditorMenuSession(var1)
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 27)
            : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 4)) != 0);
      }
   }

   public int resolveMenuFilePopupMaxVisible(EditorSession var1) {
      if (((-270344346 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.isEditorImageFilePopupMode(var1) ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-526606556, 8) : Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(164221518, 12);
      }
   }

   public int resolveMenuFilePopupElementHeight(EditorSession var1) {
      if ((2032003328 ^ 2032003328) != 0) {
         throw new IllegalStateException();
      } else {
         return this.isEditorImageFilePopupMode(var1)
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1839542669, 18)
            : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-474280238, 2);
      }
   }

   public int resolveMenuFilePopupElementGap(EditorSession var1) {
      if ((-1168002591 * -1168002591 + -1168002591 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.isEditorImageFilePopupMode(var1)
            ? Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192606, 0)
            : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-326291068, 31);
      }
   }

   public boolean hasEditorMenuFilePopupSelection(EditorSession var1) {
      if (((1154471959 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.menuFilePopupPageKeys.isEmpty()) {
         String var2 = this.normalizePageKey(var1.menuFilePopupSelectedPage, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         return ((!var2.isBlank() && var1.menuFilePopupPageKeys.contains(var2)
            ? Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(309349964, 31)
            : Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 18)) != 0);
      } else {
         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 9) != 0);
      }
   }

   public String buildMenuFilePopupEntryHitboxId(int var1) {
      if ((1452042209 * (1452042209 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = Math.max(Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 13), var1);
         return Xqedii_qk385q5y7pea(var2);
      }
   }

   public int resolveMenuFilePopupVisibleCount(EditorSession var1) {
      if (((721758416 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.menuFilePopupPageKeys.isEmpty()) {
         int var2 = this.resolveMenuFilePopupMaxVisible(var1);
         int var3 = var1.menuFilePopupPageKeys.size() - Math.max(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 30), var1.menuFilePopupScrollOffset);
         return Math.max(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120341, 4), Math.min(var2, var3));
      } else {
         return Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-312707231, 23);
      }
   }

   public String resolveMenuFilePopupPageAtSlot(EditorSession var1, int var2) {
      if ((-503363866 * -503363866 - -503363866 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 > 0 && !var1.menuFilePopupPageKeys.isEmpty()) {
         int var3 = var1.menuFilePopupScrollOffset + var2 - Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923049833, 19);
         return var3 >= 0 && var3 < var1.menuFilePopupPageKeys.size() ? var1.menuFilePopupPageKeys.get(var3) : null;
      } else {
         return null;
      }
   }

   public int resolveMenuFilePopupMaxOffset(EditorSession var1) {
      if (((1807966791 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.menuFilePopupPageKeys.isEmpty()) {
         int var2 = Math.max(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574113, 3), Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(655138665, 27));
         int var3 = this.resolveMenuFilePopupMaxVisible(var1);
         int var4 = (var1.menuFilePopupPageKeys.size() + var2 - Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 0)) / var2;
         int var5 = Math.max(Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1828414445, 21), var3 / var2);
         int var6 = Math.max(Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1237399854, 1), var4 - var5);
         return var6 * var2;
      } else {
         return Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2002906460, 7);
      }
   }

   public int normalizeMenuFilePopupOffset(int var1, int var2) {
      if (((-1170991277 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 <= 0) {
         return Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 4);
      } else {
         int var3 = Math.max(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 27), Math.min(var2, var1));
         int var4 = Math.max(Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1237399856, 1), Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1313641072, 15));
         int var5 = (int)Math.round((double)var3 / var4) * var4;
         return Math.max(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1009075986, 16), Math.min(var2, var5));
      }
   }

   public int clampMenuFilePopupScrollbarY(int var1) {
      if (((1484855872 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Math.max(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001453230, 6), Math.min(Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821118861, 8), var1));
      }
   }

   public boolean isMenuFilePopupScrollbarVisible(EditorSession var1) {
      if ((-1649583092 * -1649583092 - -1649583092 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.menuFilePopupPageKeys.size() > this.resolveMenuFilePopupMaxVisible(var1)
            ? Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(258925499, 18)
            : Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1793309455, 26)) != 0);
      }
   }

   public int resolveMenuFilePopupOffsetFromScrollbarY(EditorSession var1, double var2) {
      if ((-841430185 * -841430185 + -841430185 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 0);
      } else {
         int var4 = this.resolveMenuFilePopupMaxOffset(var1);
         if (var4 <= 0) {
            return Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(959334849, 17);
         } else {
            double var5 = Math.max(
               Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-2721300392872489198L, 37)),
               Math.min(Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_ni38fzvlhqc3(-5834857320109085320L, 7)), var2)
            );
            double var7 = var5 / Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-2759607188407299913L, 0));
            int var9 = (int)Math.round(var7 * var4);
            return this.normalizeMenuFilePopupOffset(var9, var4);
         }
      }
   }

   public int resolveMenuFilePopupScrollbarYFromOffset(EditorSession var1) {
      if ((-1084024318 * -1084024318 - -1084024318 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1192311846, 0);
      } else {
         int var2 = this.resolveMenuFilePopupMaxOffset(var1);
         if (var2 <= 0) {
            return Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(164196942, 12);
         } else {
            int var3 = this.normalizeMenuFilePopupOffset(var1.menuFilePopupScrollOffset, var2);
            double var4 = (double)var3 / var2;
            return (int)Math.round(var4 * Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_3n5xnl192v9yu(-3874221897479352480L, 16)));
         }
      }
   }

   public String resolveMenuFilePopupHoveredHitboxId(EditorSession var1, double var2, double var4) {
      if ((803555050 * (803555050 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.menuFilePopupVisible) {
         if (this.isEditorMenuHitboxHovered(
            var1,
            Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
               "m+Z1Q4TZ1oFPW6L97qm91mQKzvNpW6OnMfyiFl410yyVOf5efDuoYEigv77H3V0AKce6yOJH1th2moAhdK5MSj2fZ6UbKodA9nu5pg4CwO1FApIFwM9VKkjBPxjJ/Q=="
            ),
            var2,
            var4
         )) {
            return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
               "m+Z1Q4TZ1oFPW6L97qm91mQKzvNpW6OnMfyiFl410yyVOf5efDuoYEigv77H3V0AKce6yOJH1th2moAhdK5MSj2fZ6UbKodA9nu5pg4CwO1FApIFwM9VKkjBPxjJ/Q=="
            );
         } else if (this.hasEditorMenuFilePopupSelection(var1)
            && this.isEditorMenuHitboxHovered(
               var1,
               Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                  "g30Wl4j/gQN4kRlIO+9rwAaMlzwAnvPBqNsTWWidIdm/7rktjYqdVXdY37qAgviWdbG1+I95YqDAmfY41UN9ETtSYwMFP/TIPmfr5LEu/xylcgIHOJ6NU8Q5PsZ+6gJ2"
               ),
               var2,
               var4
            )) {
            return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
               "g30Wl4j/gQN4kRlIO+9rwAaMlzwAnvPBqNsTWWidIdm/7rktjYqdVXdY37qAgviWdbG1+I95YqDAmfY41UN9ETtSYwMFP/TIPmfr5LEu/xylcgIHOJ6NU8Q5PsZ+6gJ2"
            );
         } else {
            int var6 = this.resolveMenuFilePopupVisibleCount(var1);

            for (int var7 = Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574113, 3); var7 <= var6; var7++) {
               String var8 = this.buildMenuFilePopupEntryHitboxId(var7);
               if (this.isEditorMenuHitboxHovered(var1, var8, var2, var4)) {
                  return var8;
               }
            }

            if (!this.isMenuFilePopupScrollbarVisible(var1)) {
               return null;
            } else if (this.isEditorMenuHitboxHovered(
               var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("cPabeKqHWnjR6CNKYKHgvalye3QUH9AAqGy8qsF23Zncuy6ovivQMUVMfsutDNxijliSxlMX"), var2, var4
            )) {
               return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("cPabeKqHWnjR6CNKYKHgvalye3QUH9AAqGy8qsF23Zncuy6ovivQMUVMfsutDNxijliSxlMX");
            } else {
               return this.isEditorMenuHitboxHovered(
                     var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("gdUF3Xt/OPJKsP4cvn+DKKFzZotTwxtkUAMBG2Cvnh9nofChml3mKG2isXPg20H2K6SNZQ=="), var2, var4
                  )
                  ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("gdUF3Xt/OPJKsP4cvn+DKKFzZotTwxtkUAMBG2Cvnh9nofChml3mKG2isXPg20H2K6SNZQ==")
                  : null;
            }
         }
      } else {
         return null;
      }
   }

   public boolean openBlankEditorFromMenu(Player var1, EditorSession var2) {
      if ((1461157698 * 1461157698 - 1461157698 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         boolean var3 = this.openGui(
            var1,
            Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("jUSAY0HWnf2JcSgpqrqpnSCbTLrQ1Ds1koYHooxPqjy6oVzWiO41cg=="),
            (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1676438780, 5) != 0),
            (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-574130658, 27) != 0)
         );
         if (!var3) {
            return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(2069306840, 21) != 0);
         } else {
            this.playEditorSfx(var1, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("fqrdPEWr2Qkan9/SA5vZR95O+bsC+YiUcWWKGaKbw9tMOckwyRPmNeid+Oe2gcuVHiD9zRFt"));
            EditorSession var4 = this.editorSessions.get(var1.getUniqueId());
            if (var4 != null && var4.editMode && var4.previewMode) {
               this.createNewUiInEditor(var1, var4);
               return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(309349964, 31) != 0);
            } else {
               return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726647, 5) != 0);
            }
         }
      } else {
         return (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(328393884, 13) != 0);
      }
   }

   public void initializeMenuFilePopupState(EditorSession var1, Map<String, YamlConfiguration> var2) {
      if (((976102730 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.editMode && this.isEditorMenuSession(var1)) {
         var1.menuTemplateBlocks = (List<Map<String, Object>>)(var1.rawBlocks == null ? new ArrayList<>() : this.copyBlocks(var1.rawBlocks));
         var1.menuFilePopupVisible = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-312707231, 23) != 0);
         var1.menuFilePopupImageMode = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 24) != 0);
         var1.menuFilePopupEditAction = (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1276276814, 23) != 0);
         var1.menuFilePopupSelectedPage = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         var1.menuFilePopupScrollOffset = Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1309264242, 4);
         var1.menuFilePopupScrollbarDragActive = (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 1) != 0);
         var1.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-2912652591786231675L, 38));
         var1.menuFilePopupScrollbarY = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 14);
         this.populateMenuFilePopupEntries(var1, var2);
         this.rebuildEditorMenuFilePopupBlocks(var1);
      }
   }

   public void populateMenuFilePopupEntries(EditorSession var1, Map<String, YamlConfiguration> var2) {
      if (((-615151019 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String var3 = this.normalizePageKey(var1.menuFilePopupSelectedPage, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         var1.menuFilePopupPageKeys.clear();
         var1.menuFilePopupNames.clear();
         var1.menuFilePopupDescriptions.clear();
         var1.menuFilePopupCommands.clear();
         if (var2 != null && !var2.isEmpty()) {
            LinkedHashMap var4 = new LinkedHashMap();

            for (Entry var6 : var2.entrySet()) {
               if (var6 != null) {
                  String var7 = this.normalizePageKey((String)var6.getKey(), Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
                  if (!var7.isBlank() && !this.isInternalEditorPageName(var7)) {
                     var4.putIfAbsent(var7, (YamlConfiguration)var6.getValue());
                  }
               }
            }

            ArrayList var13 = new ArrayList(var4.keySet());
            var13.sort(String.CASE_INSENSITIVE_ORDER);

            for (String var15 : (Iterable<String>) (var13)) {

               YamlConfiguration var8 = (YamlConfiguration)var4.get(var15);
               if (var8 == null
                  || !var8.getBoolean(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("VK7b8TP3FhkBVNlx0dargu7E/gPCoWYAuEx6R29pIls6XmcxGpE86MOKD+SHB/A+NYE="),
                     (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1759190884, 24) != 0)
                  )) {
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1820930445, 18)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 19)] = var8 == null
                     ? null
                     : var8.getString(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7uWEmAzB0TJXuPQ7yioCxiYc431trfs+VC+xBjrg5C5/H1Wl"));
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(890019689, 25)] = var15;
                  String var9 = this.firstNonBlank(var10001).trim();
                  if (var9.isBlank()) {
                     var9 = var15;
                  }

                  var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192581, 3)];
                  var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 17)] = var8 == null
                     ? null
                     : var8.getString(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("CoAy7UxPTNBH7KX0njGPdjcRNs0/YaNpKX29WJMznUHYZVAf"));
                  var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1860418319, 26)] = var8 == null
                     ? null
                     : var8.getString(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8Peb6QOrBqGN+a9K+S3rSYhNz9XeYKCIc3wFcMC1PcHdhGXUDdyVS3+tcpTM4vrwFQs="));
                  String var10 = this.firstNonBlank(var10001).trim();
                  if (var10.isBlank()) {
                     var10 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("E0ltx0SLyoa+Zjk4OPy4gNVDkadmwlEOsCz3/epu0/ShxlFf");
                  }

                  String var11 = this.normalizeCustomCommandToken(
                     var8 == null ? null : var8.getString(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("jUc+VsaF0rhsyLIeKd769EZLVeLkjJTzZg5qHjML1+VjXALwwacBB3pD"))
                  );
                  String var12 = var11.isBlank()
                     ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("E0ltx0SLyoa+Zjk4OPy4gNVDkadmwlEOsCz3/epu0/ShxlFf")
                     : Xqedii_2ji1fbz8sw4ja(var11);
                  var1.menuFilePopupPageKeys.add(var15);
                  var1.menuFilePopupNames.put(var15, var9);
                  var1.menuFilePopupDescriptions.put(var15, var10);
                  var1.menuFilePopupCommands.put(var15, var12);
               }
            }
         }

         if (!var3.isBlank() && var1.menuFilePopupPageKeys.contains(var3)) {
            var1.menuFilePopupSelectedPage = var3;
         }

         this.normalizeMenuFilePopupSelection(var1);
         this.normalizeMenuFilePopupScroll(var1);
      }
   }

   public void populateImageFilePopupEntries(EditorSession var1) {
      if (((1353956967 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String var2 = this.normalizePageKey(var1.menuFilePopupSelectedPage, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
         var1.menuFilePopupPageKeys.clear();
         var1.menuFilePopupNames.clear();
         var1.menuFilePopupDescriptions.clear();
         var1.menuFilePopupCommands.clear();
         List<UiImageAtlasService.GeneratedImage> var3 = this.plugin == null ? Collections.emptyList() : this.plugin.getGeneratedUiImagesForEditor();
         if (var3 != null && !var3.isEmpty()) {
            for (UiImageAtlasService.GeneratedImage var5 : var3) {
               if (var5 != null) {
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923573609, 9)];
                  var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(258663355, 18)] = var5.name();
                  String var6 = this.firstNonBlank(var10001).trim();
                  String var7 = this.normalizePageKey(var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
                  if (!var7.isBlank() && !var1.menuFilePopupNames.containsKey(var7)) {
                     String var8 = Xqedii_u0o294lke9oj(var6);
                     String var9 = Xqedii_fh400m22b9tx(var5.width(), var5.height());
                     var1.menuFilePopupPageKeys.add(var7);
                     var1.menuFilePopupNames.put(var7, var8);
                     var1.menuFilePopupDescriptions.put(var7, var9);
                     var1.menuFilePopupCommands.put(var7, var6);
                  }
               }
            }
         }

         if (!var2.isBlank() && var1.menuFilePopupPageKeys.contains(var2)) {
            var1.menuFilePopupSelectedPage = var2;
         }

         this.normalizeMenuFilePopupSelection(var1);
         this.normalizeMenuFilePopupScroll(var1);
      }
   }

   public void normalizeMenuFilePopupSelection(EditorSession var1) {
      if (((-579559750 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (var1.menuFilePopupPageKeys.isEmpty()) {
            var1.menuFilePopupSelectedPage = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         } else {
            String var2 = this.normalizePageKey(var1.menuFilePopupSelectedPage, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="));
            if (var2.isBlank()) {
               var1.menuFilePopupSelectedPage = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            } else if (!var1.menuFilePopupPageKeys.contains(var2)) {
               var1.menuFilePopupSelectedPage = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            } else {
               var1.menuFilePopupSelectedPage = var2;
            }
         }
      }
   }

   public void normalizeMenuFilePopupScroll(EditorSession var1) {
      if (((-1219024277 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         int var2 = this.resolveMenuFilePopupMaxOffset(var1);
         var1.menuFilePopupScrollOffset = this.normalizeMenuFilePopupOffset(var1.menuFilePopupScrollOffset, var2);
         var1.menuFilePopupScrollbarY = this.clampMenuFilePopupScrollbarY(var1.menuFilePopupScrollbarY);
      }
   }

   public List<Map<String, Object>> buildEditorMenuFilePopupChildren(EditorSession var1) {
      if ((-1427580334 * -1427580334 - -1427580334 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else if (this.isEditorImageFilePopupMode(var1)) {
            return this.buildEditorImageFilePopupChildren(var1);
         } else {
            int var3 = this.resolveMenuFilePopupVisibleCount(var1);

            for (int var4 = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 22); var4 <= var3; var4++) {
               String var5 = this.resolveMenuFilePopupPageAtSlot(var1, var4);
               if (var5 != null && !var5.isBlank()) {
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1009207058, 16)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 0)] = var1.menuFilePopupNames.get(var5);
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923705193, 17)] = var5;
                  String var6 = this.firstNonBlank(var10001);
                  var10001 = new String[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923639657, 15)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 18)] = var1.menuFilePopupDescriptions.get(var5);
                  var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 8)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "E0ltx0SLyoa+Zjk4OPy4gNVDkadmwlEOsCz3/epu0/ShxlFf"
                  );
                  String var7 = this.firstNonBlank(var10001);
                  String[] var8 = this.splitMenuFilePopupDescription(var7);
                  var10001 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821208973, 14)];
                  var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(942089673, 6)] = var1.menuFilePopupCommands.get(var5);
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(890019689, 25)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "E0ltx0SLyoa+Zjk4OPy4gNVDkadmwlEOsCz3/epu0/ShxlFf"
                  );
                  String var9 = this.firstNonBlank(var10001);
                  boolean var10 = this.normalizePageKey(var5, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="))
                     .equalsIgnoreCase(
                        this.normalizePageKey(var1.menuFilePopupSelectedPage, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="))
                     );
                  LinkedHashMap var11 = new LinkedHashMap();
                  var11.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("7uWEmAzB0TJXuPQ7yioCxiYc431trfs+VC+xBjrg5C5/H1Wl"),
                     this.truncateEditorMenuFilePopupValue(var6, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192593, 0))
                  );
                  var11.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("jpeXUpIzzcw0FNr+b/IWXceJzV6b7pc1lt5pzgTNph19XcX/l9bGzA=="),
                     var8[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1793309455, 26)]
                  );
                  var11.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("VUcHIZj6hJUhSAbxXj2o36Y7tX2cmdeNKdKd6jF2FVL3JacgTp7QmA=="),
                     var8[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923590505, 14)]
                  );
                  var11.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("jUc+VsaF0rhsyLIeKd769EZLVeLkjJTzZg5qHjML1+VjXALwwacBB3pD"),
                     this.truncateEditorMenuFilePopupValue(var9, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821282701, 13))
                  );
                  var11.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("taz9qXauE69ATWxJJuuza0BO/0pBulXy7VuJxNHE5OI="),
                     var10
                        ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("fwAW82kH+4FqHWPKuETi/BUJEIbS0/KisyK5bTKR7e8tJJsgE9i3eA==")
                        : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8shu9bC4fQ0RPQ/df2i4BB/fMTW5RGJwuntdHDtzImIjAzUF2qEEJQ==")
                  );
                  var11.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("wC8M/LukcPdiyK4GtLnJ8swoXKDH6zTuOKDpAzqTwzr/YwStDuN/qCQWfLg2SA=="),
                     this.buildMenuFilePopupEntryHitboxId(var4)
                  );
                  LinkedHashMap var12 = new LinkedHashMap();
                  var12.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("qZ6QCOowkNg1kEa0t3uNDRjp1sAWKnunpJ+rE5gKFAYyXDmUVOd86jKaB/0Acg=="),
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "pbUaGNIKtXVCxcfI+kKGiB4W65E8VVgXKgZLXWylFRuA9iwhYWv4feAxjTyZIphdQr8UYiB4d0Ml13+oacQW6mgbx7MMoUec2vrHNwkq"
                     )
                  );
                  var12.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sz96n1iR2wnFedxq7RaFj/LCkY5pJF8mHMj5Os8A5v2ObKgmQguDWg=="), var11);
                  var2.add(var12);
               }
            }

            return var2;
         }
      }
   }

   public List<Map<String, Object>> buildEditorImageFilePopupChildren(EditorSession var1) {
      if ((-678478908 ^ -678478908) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else {
            int var3 = this.resolveMenuFilePopupVisibleCount(var1);

            for (int var4 = Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-596155923, 31); var4 <= var3; var4++) {
               String var5 = this.resolveMenuFilePopupPageAtSlot(var1, var4);
               if (var5 != null && !var5.isBlank()) {
                  String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-331510898, 12)];
                  var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1461573755, 29)] = var1.menuFilePopupNames.get(var5);
                  var10001[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(656804152, 14)] = var5;
                  String var6 = this.firstNonBlank(var10001);
                  var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726551, 5)];
                  var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 18)] = var1.menuFilePopupDescriptions.get(var5);
                  var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 2)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "yL14xL86YEr3tXjAPNAl9bhusn9foZMXdcGN8Gi6i81V11/v8PRKcQ=="
                  );
                  String var7 = this.firstNonBlank(var10001);
                  boolean var8 = this.normalizePageKey(var5, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="))
                     .equalsIgnoreCase(
                        this.normalizePageKey(var1.menuFilePopupSelectedPage, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ=="))
                     );
                  LinkedHashMap var9 = new LinkedHashMap();
                  var9.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ddDkwdhi6H4W+KexACQEOq5nD2dzAwrJulnlK5yoaHXiScm682w="),
                     this.truncateEditorMenuFilePopupValue(var6, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821191565, 8))
                  );
                  var9.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("39loIBu3Sp3AuWHeE7UeG/9yIbEWsyQIxtA8iEzcYLQXKXmn/fU="),
                     this.truncateEditorMenuFilePopupValue(var7, Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-326291066, 31))
                  );
                  var9.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("taz9qXauE69ATWxJJuuza0BO/0pBulXy7VuJxNHE5OI="),
                     var8
                        ? Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("fwAW82kH+4FqHWPKuETi/BUJEIbS0/KisyK5bTKR7e8tJJsgE9i3eA==")
                        : Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("8shu9bC4fQ0RPQ/df2i4BB/fMTW5RGJwuntdHDtzImIjAzUF2qEEJQ==")
                  );
                  var9.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("wC8M/LukcPdiyK4GtLnJ8swoXKDH6zTuOKDpAzqTwzr/YwStDuN/qCQWfLg2SA=="),
                     this.buildMenuFilePopupEntryHitboxId(var4)
                  );
                  LinkedHashMap var10 = new LinkedHashMap();
                  var10.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("qZ6QCOowkNg1kEa0t3uNDRjp1sAWKnunpJ+rE5gKFAYyXDmUVOd86jKaB/0Acg=="),
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                        "UGfzjPSIPITTaDUVBTLeD3U4xiZ/6Cmfm6Q+52RpuYI44aOuSZ2gUBqP+e+zNmwAFvBC5Eb2Vs+yoMqKCvWOFJ4ifDaubLEYvzlcI/feekg="
                     )
                  );
                  var10.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("sz96n1iR2wnFedxq7RaFj/LCkY5pJF8mHMj5Os8A5v2ObKgmQguDWg=="), var9);
                  var2.add(var10);
               }
            }

            return var2;
         }
      }
   }

   public String[] splitMenuFilePopupDescription(String var1) {
      if (((511592364 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120325, 4)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1034653420, 20)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            var2 = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("E0ltx0SLyoa+Zjk4OPy4gNVDkadmwlEOsCz3/epu0/ShxlFf");
         }

         if (var2.length() <= Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948559875, 3)) {
            String[] var6 = new String[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(2089628045, 28)];
            var6[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 31)] = var2;
            var6[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 21)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
            return var6;
         } else {
            String var3 = var2.substring(Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(164196942, 12), Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001455598, 6));
            String var4 = var2.substring(Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-1223909509, 31)).trim();
            String var5 = this.truncateEditorMenuFilePopupValue(var4, Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(536725366, 19));
            String[] var10000 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-456579324, 19)];
            var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 6)] = var3;
            var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(258925499, 18)] = var5;
            return var10000;
         }
      }
   }

   public String truncateEditorMenuFilePopupValue(String var1, int var2) {
      if ((-1094791575 * (-1094791575 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-152159312, 22)];
         var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726615, 5)] = var1;
         String var3 = this.firstNonBlank(var10001).trim();
         return !var3.isBlank() && var2 > 0 && var3.length() > var2
            ? Xqedii_1vqaiu61p1ri4(var3.substring(Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1001453230, 6), var2))
            : var3;
      }
   }

   public void rebuildEditorMenuFilePopupBlocks(EditorSession var1) {
      if ((-1791964351 ^ -1791964351) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.isMenuFilePopupRenderContext(var1)) {
         if (this.isEditorImageFilePopupMode(var1)) {
            var1.menuTemplateBlocks = (List<Map<String, Object>>)(var1.rawBlocks == null ? new ArrayList<>() : this.copyBlocks(var1.rawBlocks));
         }

         if (var1.menuTemplateBlocks == null || var1.menuTemplateBlocks.isEmpty()) {
            var1.menuTemplateBlocks = (List<Map<String, Object>>)(var1.rawBlocks == null ? new ArrayList<>() : this.copyBlocks(var1.rawBlocks));
         }

         this.normalizeMenuFilePopupSelection(var1);
         this.normalizeMenuFilePopupScroll(var1);
         List var2 = this.copyBlocks(var1.menuTemplateBlocks);
         this.setMenuManageFilePopupEnabled(var2, var1.menuFilePopupVisible);
         Map<String, YamlConfiguration> var3 = var1.components;
         if (var1.menuFilePopupVisible && var1.components != null && !var1.components.isEmpty()) {
            YamlConfiguration var4 = var1.components
               .get(
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "q+P2OhlBbCSj+knuvtwMuLjB0YieG+m8fCIxI//MObICrpwkDMtHaFbktboi9izTKuLTTd7f852f9ne4lBD7lz1QJ4mwXI90xTt1XA=="
                  )
               );
            if (var4 != null) {
               YamlConfiguration var5 = this.cloneYamlConfiguration(var4);
               List var6 = this.copyBlocks(var5.getList(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("HlnqjANMu1mqAsTqr1CO4UXd4mPhch23KEgJgUbDcUneBSJPTgLbNQ==")));
               List var7 = this.buildEditorMenuFilePopupChildren(var1);
               this.replaceMenuFilePopupChildren(var6, var7);
               this.applyMenuFilePopupGridLayout(var6, var1);
               boolean var8 = this.isMenuFilePopupScrollbarVisible(var1);
               this.setMenuFilePopupBlockEnabledById(
                  var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("gdUF3Xt/OPJKsP4cvn+DKKFzZotTwxtkUAMBG2Cvnh9nofChml3mKG2isXPg20H2K6SNZQ=="), var8
               );
               this.setMenuFilePopupBlockEnabledById(
                  var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("cPabeKqHWnjR6CNKYKHgvalye3QUH9AAqGy8qsF23Zncuy6ovivQMUVMfsutDNxijliSxlMX"), var8
               );
               this.setMenuFilePopupBlockEnabledById(
                  var6,
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NHbDEuI+PGTKv1YDB279AVsRwPzYAZ07KPYadBRnZWANI4TQa7sKEh3HuguTL4H5v5GaEOPoM0DoRn42wN5+F0/48xGhpQ=="),
                  var1.menuFilePopupPageKeys.isEmpty()
               );
               int var9 = this.clampMenuFilePopupScrollbarY(var1.menuFilePopupScrollbarY);
               var1.menuFilePopupScrollbarY = var9;
               this.setEditorMenuFilePopupBlockYById(
                  var6, Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("cPabeKqHWnjR6CNKYKHgvalye3QUH9AAqGy8qsF23Zncuy6ovivQMUVMfsutDNxijliSxlMX"), var9
               );
               var5.set(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("HlnqjANMu1mqAsTqr1CO4UXd4mPhch23KEgJgUbDcUneBSJPTgLbNQ=="), var6);
               var3 = new HashMap<>(var1.components);
               var3.put(
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "q+P2OhlBbCSj+knuvtwMuLjB0YieG+m8fCIxI//MObICrpwkDMtHaFbktboi9izTKuLTTd7f852f9ne4lBD7lz1QJ4mwXI90xTt1XA=="
                  ),
                  var5
               );
            }
         }

         var1.rawBlocks = var2;
         var1.renderBlocks = this.resolveRenderableBlocks(var2, (Map<String, YamlConfiguration>)var3, var1);
      }
   }

   public void ensureManageFilePopupHiddenByDefault(EditorSession var1) {
      if ((-1979684669 ^ -1979684669) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.editMode) {
         var1.menuFilePopupVisible = (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-578308751, 9) != 0);
         var1.menuFilePopupImageMode = (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 22) != 0);
         var1.menuFilePopupSelectedPage = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OqW5mutt4J1G02f3uKAOrirsJK2RPrDBCurwOQ==");
         var1.menuFilePopupScrollOffset = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 16);
         var1.menuFilePopupScrollbarY = Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 27);
         var1.menuFilePopupScrollbarDragActive = (Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(942089673, 6) != 0);
         var1.menuFilePopupScrollbarDragOffsetY = Double.longBitsToDouble(Xqedii_1hxci1i.Xqedii_qd8q8zgeok1c(-7403398946365747017L, 0));
      }
   }

   public boolean setMenuManageFilePopupEnabled(List<Map<String, Object>> var1, boolean var2) {
      if (((205050463 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         boolean var3 = false;

         for (Map var5 : var1) {
            if (var5 != null && !var5.isEmpty()) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1820167580, 2)];
               var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 13)] = this.stringValue(
                  var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("qZ6QCOowkNg1kEa0t3uNDRjp1sAWKnunpJ+rE5gKFAYyXDmUVOd86jKaB/0Acg=="))
               );
               var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(925671273, 21)] = this.stringValue(
                  var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("FfXXv0EA6s6xnbFAkR302FOqDEHiKJHO15uQ1WiY32Hi9acLwz3erJQI"))
               );
               String var6 = this.firstNonBlank(var10001).trim();
               if (var6.equalsIgnoreCase(
                  Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug(
                     "q+P2OhlBbCSj+knuvtwMuLjB0YieG+m8fCIxI//MObICrpwkDMtHaFbktboi9izTKuLTTd7f852f9ne4lBD7lz1QJ4mwXI90xTt1XA=="
                  )
               )) {
                  boolean var7 = this.parseBooleanFlag(
                     var5.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1MgjP5kpoPvgkvrWQg/Av7y+Hybn9fn7XjzE3ZnGinSpzv4o5Wx6M50x")),
                     (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1325994437, 14) != 0)
                  );
                  if (var7 != var2 || !var5.containsKey(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1MgjP5kpoPvgkvrWQg/Av7y+Hybn9fn7XjzE3ZnGinSpzv4o5Wx6M50x"))) {
                     var5.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1MgjP5kpoPvgkvrWQg/Av7y+Hybn9fn7XjzE3ZnGinSpzv4o5Wx6M50x"), var2);
                     var3 = true;
                  }
               }

               List var8 = this.childBlocksOf(var5);
               if (var8 != null) {
                  var3 |= this.setMenuManageFilePopupEnabled(var8, var2);
               }
            }
         }

         return var3;
      } else {
         return false;
      }
   }

   public boolean replaceMenuFilePopupChildren(List<Map<String, Object>> var1, List<Map<String, Object>> var2) {
      if (((465937027 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var4 : var1) {
            if (var4 != null && !var4.isEmpty()) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1884179474, 7)];
               var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 10)] = this.stringValue(
                  var4.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))
               );
               String var5 = this.firstNonBlank(var10001).trim();
               if (Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+T86sDd7ikXufKvK+uBmnPIfjUu/0q0mXcckzCFH5web94bBun80z+68n3gA1StWoFjrvu+36q2xgSq/")
                  .equalsIgnoreCase(var5)) {
                  var4.put(
                     Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("grJyAfrhGclCjN3njhilP3EBt8U0dq7I79yCm1nj3g+WprABbt6nk65CZiA="),
                     var2 == null ? new ArrayList() : new ArrayList(var2)
                  );
                  return (Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(925671273, 21) != 0);
               }

               List var6 = this.childBlocksOf(var4);
               if (var6 != null && this.replaceMenuFilePopupChildren(var6, var2)) {
                  return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1910343607, 1) != 0);
               }
            }
         }

         return (Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 13) != 0);
      } else {
         return (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1009075986, 16) != 0);
      }
   }

   public boolean setMenuFilePopupBlockEnabledById(List<Map<String, Object>> var1, String var2, boolean var3) {
      if (((974408760 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         boolean var4 = false;

         for (Map var6 : var1) {
            if (var6 != null && !var6.isEmpty()) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-304318623, 23)];
               var10001[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-2018151971, 17)] = this.stringValue(
                  var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))
               );
               String var7 = this.firstNonBlank(var10001).trim();
               if (var2.equalsIgnoreCase(var7)) {
                  boolean var8 = this.parseBooleanFlag(
                     var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1MgjP5kpoPvgkvrWQg/Av7y+Hybn9fn7XjzE3ZnGinSpzv4o5Wx6M50x")),
                     (Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(500726647, 5) != 0)
                  );
                  if (var8 != var3 || !var6.containsKey(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1MgjP5kpoPvgkvrWQg/Av7y+Hybn9fn7XjzE3ZnGinSpzv4o5Wx6M50x"))) {
                     var6.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("1MgjP5kpoPvgkvrWQg/Av7y+Hybn9fn7XjzE3ZnGinSpzv4o5Wx6M50x"), var3);
                     var4 = true;
                  }
               }

               List var9 = this.childBlocksOf(var6);
               if (var9 != null) {
                  var4 |= this.setMenuFilePopupBlockEnabledById(var9, var2, var3);
               }
            }
         }

         return var4;
      } else {
         return false;
      }
   }

   public boolean setEditorMenuFilePopupBlockYById(List<Map<String, Object>> var1, String var2, int var3) {
      if (((2034486976 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         boolean var4 = false;

         for (Map var6 : var1) {
            if (var6 != null && !var6.isEmpty()) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(328402076, 13)];
               var10001[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 3)] = this.stringValue(
                  var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))
               );
               String var7 = this.firstNonBlank(var10001).trim();
               if (var2.equalsIgnoreCase(var7)) {
                  Map<String, Object> var8 = this.toStringObjectMap(
                     var6.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ="))
                  );
                  if (var8 == null) {
                     var8 = new LinkedHashMap<>();
                  }

                  if (!(
                     var8.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh")) instanceof Number var10
                        && Math.round(var10.doubleValue()) == var3
                  )) {
                     var8.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("mqeb8hsJasIUUFdMB6a3kB47sI/knSQ8Gbi5H2Oh"), var3);
                     var6.put(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("20Bt9syTpBQlzaVGUpyRlL3k1UxgavoidAnq/GtxHs326bQw9TWafEeEeKQ="), var8);
                     var4 = true;
                  }
               }

               List var11 = this.childBlocksOf(var6);
               if (var11 != null) {
                  var4 |= this.setEditorMenuFilePopupBlockYById(var11, var2, var3);
               }
            }
         }

         return var4;
      } else {
         return false;
      }
   }

   public void applyMenuFilePopupGridLayout(List<Map<String, Object>> var1, EditorSession var2) {
      if ((-463474483 * (-463474483 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null) {
         this.setMenuFilePopupBlockNumericValueById(
            var1,
            Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+T86sDd7ikXufKvK+uBmnPIfjUu/0q0mXcckzCFH5web94bBun80z+68n3gA1StWoFjrvu+36q2xgSq/"),
            Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GLdetvtblt5xjJDR/ZOf+9RZveIvtHVvurNz/M5emMR8z73vHl4VK30BxMhbaQ=="),
            this.resolveMenuFilePopupElementHeight(var2)
         );
         this.setMenuFilePopupBlockNumericValueById(
            var1,
            Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+T86sDd7ikXufKvK+uBmnPIfjUu/0q0mXcckzCFH5web94bBun80z+68n3gA1StWoFjrvu+36q2xgSq/"),
            Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6/9nXgtlCWL/60zD8Fdkg/yxNu50IguGtrEilEfAFGtxYg=="),
            this.resolveMenuFilePopupElementGap(var2)
         );
      }
   }

   public boolean setMenuFilePopupBlockNumericValueById(List<Map<String, Object>> var1, String var2, String var3, int var4) {
      if ((-690616298 ^ -690616298) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank() && var3 != null && !var3.isBlank()) {
         boolean var5 = false;

         for (Map var7 : var1) {
            if (var7 != null && !var7.isEmpty()) {
               String[] var10001 = new String[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1054407452, 27)];
               var10001[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923574121, 14)] = this.stringValue(
                  var7.get(Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("6JeYNdlEGSRiNnMeltQkRPi7xqY1T1cJIs7I4mZhTiw="))
               );
               String var8 = this.firstNonBlank(var10001).trim();
               if (var2.equalsIgnoreCase(var8) && !(var7.get(var3) instanceof Number var10 && Math.round(var10.doubleValue()) == var4)) {
                  var7.put(var3, var4);
                  var5 = true;
               }

               List var11 = this.childBlocksOf(var7);
               if (var11 != null) {
                  var5 |= this.setMenuFilePopupBlockNumericValueById(var11, var2, var3, var4);
               }
            }
         }

         return var5;
      } else {
         return false;
      }
   }

   static {
      if ((1311519067 * (1311519067 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1461573753, 29)];
         var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(-1821192590, 3)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Va5sdg1/rYdsF+sJAcGl4TOLZ7BPsOT9Q94TaXJi");
         var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1821192589, 26)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("VLihRLG3Y/hNUfCq79SNGJ7uYUcJKy7BiSRdEqM3");
         var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120373, 4)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("W6HF/IYixvV/N/KW+jZhWSVHMQHXbmKFP/klABc4");
         var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(-150167703, 30)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("JG7idK3RRqqlAWMee02MR3jfD7maycqBXSZLOZT/");
         var10000[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(1237399862, 1)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("fnf2v1JL413pA6SnEAZxNPfnPKajbeASbFIBGt4y");
         var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-1897120261, 4)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Kj6w927AIDzhc3YQ5O+CKYdVJ23IHq52kxTMncRM");
         var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(-948560155, 3)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("HeCb22LJY2coh2OFEBa/+w/7u95ZWF2eGuyFOzDB");
         var10000[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(328451228, 13)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("IK21lYWfvmrUDXjO6zo4yJ5MMy9IJX3X2XcNJydg");
         var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1551327721, 31)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("C/sP37jBA7oZoezPwEkCCds+qQo7GaRapJh39Wv0");
         var10000[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1667226400, 16)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("RIKuxX3tib+wzcipJTlLJ8/jwiQLObzTP08S07aU");
         var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(928817001, 19)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("OrsjK/O9WWtW6GIpfSE/iItBayGbZQLsttE/H5M4");
         var10000[Xqedii_1hxci1i.Xqedii_1jpxntclf4bv8(1150103949, 26)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("qMDK4hAcNW7dh+uHdwmmlK4rNS4arHQ9C97oITcb");
         var10000[Xqedii_1hxci1i.Xqedii_nsnj660oyo7u(-1936489870, 26)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+zvc3KjxG+zKuvR9y3mC+kYeDP1fyGOD0haX5UW+");
         var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923577193, 10)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Qd/MfQd/hJpBy2YiPE5ffZszfYAeCGKqLvbf1uBr");
         var10000[Xqedii_1hxci1i.Xqedii_3sxumdwfb5qpz(1267657789, 28)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5bKhUzdxiDcs7Rq90O3XabA5j6UVcdkiWTP1sHVr");
         var10000[Xqedii_1hxci1i.Xqedii_17w1sac0f8eur(923754345, 14)] = Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("ktU5TuDUcdkkeou/MvZM6MR56s47qcQm28nOnG9f");
         Xqedii_32wtmt4 = Set.of(var10000);
      }
   }


   private static /* synthetic */ String Xqedii_3c3txvpa7xnns(int n, int n2, String string, String string2, String string3) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("JBDHHBRUOzACtvFvIT4M/kOT01FJgO22i1tMvxfmwD8UrjvL4/zc/j2n") + n + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("2vNkbE8pb4F6l4ZpafMvaF3e+NNB6SNZ35ygCLaf") + n2 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("4T7SSy3of9S4G3n1tmBUe8JAygAzGUhfzp46EuClKffdkRWZ/5c5aQOP") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("B72eQ8hfl+MNgzCW3G2kpU+qWr7RTQH/i85PBQluFNa2o/JB+34uCvKb1rA=") + string2 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("hq9FhY76E6H1ZLVrYRS3vHnVAh+yzODSfucbvk5hpkFW2FIajHRSXA==") + string3;
    }

    private static /* synthetic */ String Xqedii_3jpofqxzbh0x5(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("F8RAAD3Iz0poBLuBgCtn7g4RHjUt6EloJQb3uDqfXOGW845pCfI=") + string;
    }

    private static /* synthetic */ String Xqedii_7oiky383frl5(String string, String string2, String string3) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("gpCtI7QLl+fgXDFIywISSTzsGBZPbMFoDe8aOxu5p1aDJ70YY05rBYgdcPy3LRBBAOf76P5u8EC0Qnqo1fmg9xnkn1p+5b0hlM/YyllsBhmephIL1FgjRXkltWK9YmKXpStrmGO+AaHLxLsp9FU=") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("IfmmObzdQfq0ZjuJcohtfWHvTy8ryzJVYVQxVXWE+h2bymDQUKuryR1bsPYOdWMLEBs=") + string2 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("LTW/4IuwO6kdwm7E4FaKShp4hiREh/wtYgd2fqzdfOin/d4/nVe+LoK02brcwV4yPgiQR5jWIYLRXZRwBeme+z92QWHYV4g7NFBtlbpu") + string3;
    }

    private static /* synthetic */ String Xqedii_z27mmwy22ke0(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("51jJrK6bFIk8fxlxMWZ1CygpNDEeVl0jTaq030fhAvWveaEKUil3AV1rKR87m/HEpJ0=") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("iXeNZYENOwvPgPVIoxll8jrzjXvl7UqYFmgYzrN6FPqNQ2ZjBDR7bYBH0nI5aEz10j5DOEv6LaM8ZZlE");
    }

    private static /* synthetic */ String Xqedii_3aftphwxpwze4(String string, String string2, String string3) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("51jJrK6bFIk8fxlxMWZ1CygpNDEeVl0jTaq030fhAvWveaEKUil3AV1rKR87m/HEpJ0=") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("+Ij/G4XZvi98i87iI3gMIhaDQQQwTfV2UQ/nOSD9Ftw5+lcSM3g4GKm8") + string2 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("5zbpB1CA0mXftX4ma9EPVIi9LrSeL9tG22l9pseblZX73MM53o0zkw==") + string3;
    }

    private static /* synthetic */ String Xqedii_216bna7p9dd98(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("pk4fwcdD/DbD+fzhi3s7fA0alxuvgl4OOSHLbHgW") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("kVXFxeSxa8LiS0p9hniVqar4aVSmpdP/76ozOezW");
    }

    private static /* synthetic */ String Xqedii_1f01m2zv8v9ni(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("2LHzXfg8svzfAaua5jg6RF1PWUMpP3SMazuh/beKcky5MwEr8WP50w==") + string;
    }

    private static /* synthetic */ String Xqedii_26ju2ua3qi1uf(double d, double d2) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("xv7Tzo2X3bNJZned4UoAeIzu+X/CNQJT7JvzGJKYtgbNyMUruf7d2uy6SHaie8OJas7K4DB43EGrFrr1FU3NT625mKbOgQ57uRpO37dOIR4=") + d + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("2vNkbE8pb4F6l4ZpafMvaF3e+NNB6SNZ35ygCLaf") + d2;
    }

    private static /* synthetic */ String Xqedii_1z4h83tk8kjbu(String string, String string2, String string3) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("p9x09hesSXhEYt+x/b0sOEVxE4NdG4oYsfnpnWmMk8fESRMnzaF90Emfgr77mFVUBsd+cXrzHJw=") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("54zbFqe/AngjciO9j/VHYfehNXSxb8h2jqB9wuCjtKGp8Ug6") + string2 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("dozKN0/CPkHw9YaSBZhjijXlF+Da9nTF+8ywMXQsC2Adi6FXKmRJUqAR") + string3;
    }

    private static /* synthetic */ String Xqedii_pn9bg82hxi4d(String string, int n) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("o+wljHJgqZDyfp/fHaijBsTw2MhaevYnROAj0AuPDdXXXtA1sEbBTF8D+nQyhEmTImVfGXMW+YIyP5bzgmaTlfB5Ks0kfw==") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Of1Von2jqiacb2ULrEBGBPNX8YjDhtrxlEfcvW8Lk0AqzIUkwlW/IKuR") + n + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NZxaXy3z+Zepx/IFPZhNWI+TsngDrTudLzLAzZe/a0nzH9Irbkie0DuhWXqH9tUa");
    }

    private static /* synthetic */ String Xqedii_2jms8e9x143zg(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("eweDqYQF/oftF+4l09bb6NAcTaEhF2ui6NRMv3OdESmoTl1V9KG1iqcLeErI6sZE2mY=") + string;
    }

    private static /* synthetic */ String Xqedii_3g6jmuouml4zy(String string, int n) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("wyKexK5l+eSi4Vs1EgF9WH21t3l5PV8zt5B4uMzmypNlE/c74zLJsVjo+kCkDQFVTkgAU5qj4/t+68/CemIk6apC") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Of1Von2jqiacb2ULrEBGBPNX8YjDhtrxlEfcvW8Lk0AqzIUkwlW/IKuR") + n + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NZxaXy3z+Zepx/IFPZhNWI+TsngDrTudLzLAzZe/a0nzH9Irbkie0DuhWXqH9tUa");
    }

    private static /* synthetic */ String Xqedii_11oypl9zfw6e9(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("xp54dmQxl3oPY7+aAe1uoC+K9gbvvWYhAPsloAuiLpFcvBYUx6gO54w2C3GXNmFwwWwi1frWUH4=") + string;
    }

    private static /* synthetic */ String Xqedii_14yoau2ljvw71(String string, String string2) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("kXTcmYMw+4JW61lwreiWnf3Kopv5E4ZmHibw4m0pUrSC8zeTA8+yJo5aUWU/WS6r9MmGoeIpl5N3Ld4XeZAWAg2HU53X/Zbu") + string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("stuh3brRtUgLZf/NXjdzESplt6MnV0qT94V2KOg7TcVjmg==") + string2;
    }

    private static /* synthetic */ String Xqedii_2khr8os0ogdqe(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("xp54dmQxl3oPY7+aAe1uoC+K9gbvvWYhAPsloAuiLpFcvBYUx6gO54w2C3GXNmFwwWwi1frWUH4=") + string;
    }

    private static /* synthetic */ String Xqedii_qk385q5y7pea(int n) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("lS9ealmrgg+dMULIR2cr/sH6DMTTvPVLxgTmLnTXTIJXY2/PUMexvu4Yb3jQLnS3nTj41kTp8calrpfSdk9uzT+B2UL9T3CRQOw6XANmzmY=") + n + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("NGUrqLvmS8sh2hu3qGyZElELB3+HxU18BWIbeBf2V99INaD3TEvcEJYA");
    }

    private static /* synthetic */ String Xqedii_2ji1fbz8sw4ja(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("2vNkbE8pb4F6l4ZpafMvaF3e+NNB6SNZ35ygCLaf") + string;
    }

    private static /* synthetic */ String Xqedii_u0o294lke9oj(String string) {
        return string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("GMq4SNIOqKFjSbYkhZidFeXYDJZVVWKAspwOlz9VCeKtOP5q");
    }

    private static /* synthetic */ String Xqedii_fh400m22b9tx(int n, int n2) {
        return n + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("VUYlvsYuC9oXR07bhTDvUv5QCqA6kpKtlr2JKK8rsTg=") + n2 + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("Hxol+/KQC//dS7vnEGcqmLRbUNj+1U/n73rYEMwJ/H0=");
    }

    private static /* synthetic */ String Xqedii_1vqaiu61p1ri4(String string) {
        return string + Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("h+D19OkDm8EWh4TFBDbN4u9iSq5gC3XyKkZJeMhxTDPY6g==");
    }

    private static /* synthetic */ String Xqedii_2lwjt0d5o2jwo(String string) {
        return Xqedii_1hxci1i.Xqedii_2cprjahvxz1ug("xp54dmQxl3oPY7+aAe1uoC+K9gbvvWYhAPsloAuiLpFcvBYUx6gO54w2C3GXNmFwwWwi1frWUH4=") + string;
    }

   public static final class EditorRawTargetIdentity {
      public static final String Xqedii_1de8c8peo4hl4 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final String Xqedii_2u6saa1;
      public final String Xqedii_3chp206;
      public final String Xqedii_3280458;
      public final String Xqedii_2by2ejj;

      public EditorRawTargetIdentity(String var1, String var2, String var3, String var4) {
         this.Xqedii_2u6saa1 = var1 == null ? Xqedii_2dpt1g6.Xqedii_38uxc0ptaj1v2("D7KtgCxm2hwN9PU2yKxVMgKlDhmbzvsqwL4NPg==") : var1.trim();
         this.Xqedii_3chp206 = var2 == null ? Xqedii_2dpt1g6.Xqedii_38uxc0ptaj1v2("D7KtgCxm2hwN9PU2yKxVMgKlDhmbzvsqwL4NPg==") : var2.trim();
         this.Xqedii_3280458 = var3 == null ? Xqedii_2dpt1g6.Xqedii_38uxc0ptaj1v2("D7KtgCxm2hwN9PU2yKxVMgKlDhmbzvsqwL4NPg==") : var3.trim();
         this.Xqedii_2by2ejj = var4 == null ? Xqedii_2dpt1g6.Xqedii_38uxc0ptaj1v2("D7KtgCxm2hwN9PU2yKxVMgKlDhmbzvsqwL4NPg==") : var4.trim();
      }
   }
}
