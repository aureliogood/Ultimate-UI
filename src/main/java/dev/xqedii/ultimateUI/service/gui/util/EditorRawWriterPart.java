package dev.xqedii.ultimateUI.service.gui.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.bukkit.configuration.ConfigurationSection;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2lsn7i5;
import dev.xqedii.ultimateUI.Xqedii_3uxgwyg;
import dev.xqedii.ultimateUI.Xqedii_dfny1vz;
import dev.xqedii.ultimateUI.Xqedii_ntttel8;
import dev.xqedii.ultimateUI.gui.model.YamlIssue;
import dev.xqedii.ultimateUI.gui.parser.ScrollViewState;
import dev.xqedii.ultimateUI.gui.parser.TemplateScroll;
import dev.xqedii.ultimateUI.gui.parser.ScrollViewState.Metrics;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.base.GuiServiceBaseSupport;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.head.PlayerHeadFontService;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;

public abstract class EditorRawWriterPart extends GuiServiceBaseSupport {
   public static final String Xqedii_232j8piyvdgrr = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Pattern Xqedii_3crgivd;
   public static final Pattern Xqedii_3ukwtz9;
   public static final Pattern Xqedii_31qcpyp;
   public static final long Xqedii_zut5s4v = 1000L;
   public final Map<String, Map<String, Xqedii_dfny1vz>> Xqedii_1dp01q2 = new HashMap<>();
   public final Map<String, Long> Xqedii_cid7pf7 = new HashMap<>();
   public final Set<String> Xqedii_3t1c32w = new HashSet<>();
   public static final String[] Xqedii_29qvign;
   public static final String[] Xqedii_2fplvqv;
   public static final String[] Xqedii_1a0mzl3;
   public static final String[] Xqedii_pgm4udd;

   public EditorRawWriterPart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public double parseDouble(Object var1, double var2) {
      if (((-1616169718 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else if (var1 instanceof Number var8) {
         return var8.doubleValue();
      } else {
         String var4 = var1.toString().trim();
         if (var4.isEmpty()) {
            return var2;
         } else {
            String var5 = this.normalizeNumericExpressionSeparators(var4);

            try {
               return Double.parseDouble(var5);
            } catch (Exception var7) {
               return this.evaluateNumericExpression(var5, var2);
            }
         }
      }
   }

   public String normalizeNumericExpressionSeparators(String var1) {
      if (((-1537546500 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var1.indexOf(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(181868277, 14)) >= 0) {
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 22); var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 != Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425388540, 4)) {
               var2.append(var4);
            } else {
               int var5 = var3 - Xqedii_ntttel8.Xqedii_2d77kqauxzceu(290738115, 9);

               while (var5 >= 0 && Character.isWhitespace(var1.charAt(var5))) {
                  var5--;
               }

               int var6 = var3 + Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 7);

               while (var6 < var1.length() && Character.isWhitespace(var1.charAt(var6))) {
                  var6++;
               }

               int var7 = var5 >= 0 && var6 < var1.length() && Character.isDigit(var1.charAt(var5)) && Character.isDigit(var1.charAt(var6))
                  ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 14)
                  : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1847102114, 28);
               var2.append((char)(var7 != 0 ? Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1613661139, 7) : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1473542622, 18)));
            }
         }

         return var2.toString();
      } else {
         return var1;
      }
   }

   public double evaluateNumericExpression(String var1, double var2) {
      if (((1941790540 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            int[] var10000 = new int[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1358278972, 26)];
            var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(205869367, 3)] = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 4);
            int[] var4 = var10000;
            double var5 = this.parseExpression(var1, var4);
            this.skipWhitespace(var1, var4);
            return var4[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 30)] == var1.length() && Double.isFinite(var5) ? var5 : var2;
         } catch (Exception var7) {
            return var2;
         }
      }
   }

   public double parseExpression(String var1, int[] var2) {
      if ((-695154233 ^ -695154233) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = this.parseTerm(var1, var2);

         while (true) {
            this.skipWhitespace(var1, var2);
            if (var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 2)] >= var1.length()) {
               return var3;
            }

            char var5 = var1.charAt(var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 18)]);
            if (var5 != Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425068348, 13) && var5 != Xqedii_ntttel8.Xqedii_b04l01r82a2w(-345508770, 29)) {
               return var3;
            }

            var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 28)] += Xqedii_ntttel8.Xqedii_b04l01r82a2w(1500211188, 21);
            double var6 = this.parseTerm(var1, var2);
            var3 = var5 == Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(49656124, 25) ? var3 + var6 : var3 - var6;
         }
      }
   }

   public double parseTerm(String var1, int[] var2) {
      if ((-7762899 * -7762899 - -7762899 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = this.parseFactor(var1, var2);

         while (true) {
            this.skipWhitespace(var1, var2);
            if (var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1984404950, 22)] >= var1.length()) {
               return var3;
            }

            char var5 = var1.charAt(var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-97737293, 12)]);
            if (var5 != Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387880, 1) && var5 != Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387874, 1)) {
               return var3;
            }

            var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1613667027, 7)] += Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1001057296, 7);
            double var6 = this.parseFactor(var1, var2);
            if (var5 == Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2093456854, 22)) {
               var3 *= var6;
            } else {
               if (var6 == Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(3255169475523599834L, 22))) {
                  throw new IllegalArgumentException(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("g/Ap48WXtGaVdFA5lk2wUxihsTSlorNtSQya8xMeSUBHOyYXWRqtiovq0dtRHT8H0+PMSzb98IJ4Sj4f")
                  );
               }

               var3 /= var6;
            }
         }
      }
   }

   public double parseFactor(String var1, int[] var2) {
      if (((817352719 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.skipWhitespace(var1, var2);
         if (var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1697488849, 23)] >= var1.length()) {
            throw new IllegalArgumentException(
               Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                  "xvODcwXlq9l04ucnP9wncbhEILX+BqWuFfAkBBRiYq4N0kfr4sMm/yZuHqQ2cf7E1C9wYdWEjnIDhrTi79/zQ1m94nAV9ZD9zi0QOcs5EEjd/dXj"
               )
            );
         } else {
            char var3 = var1.charAt(var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1390017814, 27)]);
            if (var3 == Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-1965172993, 30)) {
               var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1799979195, 25)] += Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425518908, 17);
               return this.parseFactor(var1, var2);
            } else if (var3 == Xqedii_ntttel8.Xqedii_b04l01r82a2w(398121469, 19)) {
               var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1414382353, 17)] += Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 10);
               return -this.parseFactor(var1, var2);
            } else if (var3 == Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310587, 1)) {
               var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1697488849, 23)] += Xqedii_ntttel8.Xqedii_2d77kqauxzceu(581476230, 10);
               double var4 = this.parseExpression(var1, var2);
               this.skipWhitespace(var1, var2);
               if (var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 9)] < var1.length()
                  && var1.charAt(var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1764759374, 30)]) == Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1001060368, 7)) {
                  var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833514, 6)] += Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425125692, 18);
                  return var4;
               } else {
                  throw new IllegalArgumentException(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                        "dw+mhFO6/9qA7TP8BcR2P54reitOCl0EEZvZe+2P1cBuYKOqL5GcKBCWTjgf7EhedJSCMT8WwOghfKnySGOnN6Oc1PKzpRxhEfSOuT70ASbXZg=="
                     )
                  );
               }
            } else {
               return this.parseNumber(var1, var2);
            }
         }
      }
   }

   public double parseNumber(String var1, int[] var2) {
      if ((-1208255262 * -1208255262 + -1208255262 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = var2[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1233173100, 1)];
         int var4 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(1828621097, 2);

         while (var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1155281173, 21)] < var1.length()) {
            char var5 = var1.charAt(var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1646954936, 6)]);
            if (Character.isDigit(var5)) {
               var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 1)] += Xqedii_ntttel8.Xqedii_2d77kqauxzceu(823477500, 5);
            } else {
               if (var5 != Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182320117, 8) || var4 != 0) {
                  break;
               }

               var4 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1618599256, 26);
               var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1466202590, 18)] += Xqedii_ntttel8.Xqedii_b04l01r82a2w(-24433300, 10);
            }
         }

         if (var3 == var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 26)]) {
            throw new IllegalArgumentException(
               Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QqbLTRtKztpeBq0eXG9q7SpR1wkn/t3NZpkqyXVrZUxthG4SsfK6ZpKWkTLu8tHerJ8EGB9LuNpTjQ==")
            );
         } else {
            return Double.parseDouble(var1.substring(var3, var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(290737603, 9)]));
         }
      }
   }

   public void skipWhitespace(String var1, int[] var2) {
      if ((-1330281738 * (-1330281738 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         while (
            var2[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 16)] < var1.length()
               && Character.isWhitespace(var1.charAt(var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2044548965, 2)]))
         ) {
            var2[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1440292472, 16)] += Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425355068, 15);
         }
      }
   }

   public String firstNonBlank(String... var1) {
      if ((1465326503 ^ 1465326503) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      } else {
         String[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 6); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (var5 != null && !var5.isBlank()) {
               return var5.trim();
            }
         }

         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      }
   }

   public String applyPlaceholderApi(Player var1, String var2) {
      if ((2071686829 ^ 2071686829) != 0) {
         throw new IllegalStateException();
      } else {
         return this.resolvePlaceholders(var1, var2, Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425389884, 11) != 0);
      }
   }

   public String applyPageVariables(Player var1, String var2) {
      if (((-1378965548 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.indexOf(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-1428302094, 28)) >= 0) {
         EditorSession var3 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         Map var4 = var3 == null ? Map.of() : var3.runtimeVariables;
         Map var5 = this.persistentVariables.getOrDefault(var1.getUniqueId(), Map.of());
         if (var4.isEmpty() && var5.isEmpty()) {
            if (this.isScriptDebugEnabled() && var2.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("zLr7n9S9jEs1VZuFn4S8xgpPlRvs4+VDHPo7WwMK"))) {
               this.debugScript(
                  Xqedii_1v4geiho3v7wi(
                     var2,
                     var3 == null
                        ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4wV1dfy6MvaDHViOCaW3PbCZ2o7360Hl/T6CWT+8w8gFq0yu")
                        : Xqedii_22x9uqb94m2qm(var3.editMode)
                  )
               );
            }

            return var2;
         } else {
            String var6 = var2;

            for (Map var8 : List.of(var4, var5)) {
               for (Map.Entry<?, ?> var10 : ((Map<?, ?>) var8).entrySet()) {
                  String var11 = var10.getValue() == null
                     ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
                     : (String)var10.getValue();
                  String var12 = Xqedii_tqqsazdqd52g((String)var10.getKey());
                  if (var6.contains(var12)) {
                     var6 = var6.replace(var12, var11);
                  }

                  String var13 = Xqedii_1go00xde63ta9((String)var10.getKey());
                  if (var6.contains(var13)) {
                     var6 = var6.replace(var13, var11);
                  }
               }
            }

            if (!var6.equals(var2)) {
               this.debugScript(Xqedii_3lsq3todd0to1(var2, var6));
            } else if (this.isScriptDebugEnabled() && var2.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("zLr7n9S9jEs1VZuFn4S8xgpPlRvs4+VDHPo7WwMK"))) {
               this.debugScript(Xqedii_1t9zg7otj9pfk(var2, String.valueOf(var4.keySet()), String.valueOf(var5.keySet())));
            }

            return var6;
         }
      } else {
         return var2;
      }
   }

   public boolean isScriptDebugEnabled() {
      if (((-119534354 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (this.plugin != null
               && this.plugin
                  .getConfig()
                  .getBoolean(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wzSZ+qU+8XFHPvLIQdEeacMYL3/xKDiNwkS06sZzvU1AN5LRCprTM/voTlL98q9BxNRLJlRIugKB/JFzO19m6FOqOwyvAeMV"),
                     Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 7) != 0
                  )
            ? Xqedii_ntttel8.Xqedii_2d77kqauxzceu(356842545, 13)
            : Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833514, 6)) != 0;
      }
   }

   public void debugScript(String var1) {
      if ((738631684 * (738631684 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.isScriptDebugEnabled()) {
            this.plugin.getLogger().info(Xqedii_v4jduijawxlh(var1));
         }
      }
   }

   public boolean isPlaceholderResolutionEnabled() {
      if ((1367018887 * 1367018887 - 1367018887 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (this.plugin != null
               && this.plugin
                  .getConfig()
                  .getBoolean(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                        "FOiw+SkkQupsjO4YOz696fVDl0JdHEiCn/3VyvdrZmFaW/AMIGPEXx+5Bu5lLvMkx/C0sOvwM2czOjaf97CM8aYNIbN54xOLMpvIm7dOqVQ0QysPj7KrQCqIJc9eXdWvVwRX0ntT"
                     ),
                     Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 27) != 0
                  )
            ? Xqedii_ntttel8.Xqedii_b04l01r82a2w(1530897099, 0)
            : Xqedii_ntttel8.Xqedii_b04l01r82a2w(1744066891, 5)) != 0;
      }
   }

   public String resolvePlaceholders(Player var1, String var2, boolean var3) {
      if ((-184261398 * -184261398 + -184261398 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && !var2.isBlank()) {
         String var4 = this.resolveInventorySlotPlaceholders(var1, this.resolvePlayerHeadFont(var1, this.applyPageVariables(var1, var2)));
         if (var3 && var1 != null && !this.isPlaceholderResolutionEnabled()) {
            EditorSession var5 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
            if (var5 != null && var5.editMode) {
               return var4;
            }
         }

         String var7 = this.normalizeDoublePercentPlaceholder(this.applyPlayerPreferencePlaceholders(var1, var4));
         String var6 = var7;
         if (var7.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("iwpkJyCMl6iVli7MOHmm/YNWddR45juP0gujBSMG"))) {
            var6 = this.applyPlaceholderApiWithPapi(var1, var7);
            if (var1 != null && var6.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vSrIBYPCXvJi9NUchuBRsmzPPekOPvo/RmaSMNU2knuQY1SZH9L+MWjT3CE="))) {
               var6 = var6.replace(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vSrIBYPCXvJi9NUchuBRsmzPPekOPvo/RmaSMNU2knuQY1SZH9L+MWjT3CE="), var1.getName());
            }
         }

         return this.applyCraftEngineFontImages(this.applyItemsAdderFontImages(var6));
      } else {
         return var2;
      }
   }

   public String applyPlayerPreferencePlaceholders(Player var1, String var2) {
      if ((-907701035 ^ -907701035) != 0) {
         throw new IllegalStateException();
      } else {
         return var2;
      }
   }

   public boolean containsInventorySlotPlaceholder(String var1) {
      if ((940299109 * 940299109 - 940299109 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && var1.indexOf(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182425333, 12)) >= 0 && Xqedii_3ukwtz9.matcher(var1).find()
            ? Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1423290684, 21)
            : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1362562117, 19)) != 0;
      }
   }

   public String resolveInventorySlotPlaceholders(Player var1, String var2) {
      if ((-273931758 * -273931758 - -273931758 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.containsInventorySlotPlaceholder(var2)) {
         return var2;
      } else {
         Matcher var3 = Xqedii_3ukwtz9.matcher(var2);
         StringBuilder var4 = new StringBuilder();

         while (var3.find()) {
            ItemStack var5 = this.resolveInventorySlotStack(var1, Xqedii_1bmcrab9wv6jj(var3.group(Xqedii_ntttel8.Xqedii_b04l01r82a2w(1828621105, 2))));
            String var6;
            if (var5 == null) {
               var6 = var3.group();
            } else {
               int var7 = var5.getType().isAir() ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 3) : var5.getAmount();
               boolean var8 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("fDMd/pds/+Pk0OYXIhF/4zVUpVFymJ5xSfBNvmIJJbZ8wgSwuzE=")
                  .equalsIgnoreCase(var3.group(Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 1)));
               var6 = var8 && var7 <= Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425389884, 11)
                  ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
                  : Integer.toString(var7);
            }

            var3.appendReplacement(var4, Matcher.quoteReplacement(var6));
         }

         var3.appendTail(var4);
         return var4.toString();
      }
   }

   public int resolveInventorySlotIndex(String var1) {
      if (((-2000284218 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1338184020, 25)];
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1984404950, 22)] = var1;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         String var3 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("GG2Z+OxNM4E7zXnqeA96DL84frgO2qUmPLfWh0jC1DE0QA51j5c=");
         if (!var2.startsWith(var3)) {
            return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1425387837, 25);
         } else {
            String var4 = var2.substring(var3.length()).trim();
            int var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310642, 2);
            switch (var4.hashCode()) {
               case -1548738978:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("1lmfrPuWVuXnLSZUofkoW/TVjTeEj61ihNg4Gx7gmKnooineyYdwaV27"))) {
                     var6 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(1744066987, 5);
                  }
                  break;
               case -1220934547:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("PcdUFZBLkMFtCNPH3pWD15Av4ep6kvaAxsTGKXmlFlmTO8X1V+jAEA=="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1646954744, 6);
                  }
                  break;
               case -774383297:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Xdf5lRHspK2duRJKe0MZDkhoJEkhHdox61BqXutiF8yzS4QyieTyvL1Rju0="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182308597, 11);
                  }
                  break;
               case -251388107:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("l1zwRomjMXdTQILcaZ2rcqEZLFzpYLTQFnKR9x+bnbbTyhjga4qneiZqw2bxCg=="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425355068, 14);
                  }
                  break;
               case -7847512:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("07/+fqkW7N51esrP7bSZoi3Uufw649a6f6v+gJvhCVm/X3JPS+ZQXdxKTO8="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 20);
                  }
                  break;
               case 3138990:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("oU7hXpGTV6+o2M8SsKqQ2xyEYTy0fhSxX0hQ122gZSMdw8zK"))) {
                     var6 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1275450011, 4);
                  }
                  break;
               case 3194991:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/hMkUbEhEhskhSQdr8ddJFmaLKatYc5MiV0/ogXyvXoRgu0o"))) {
                     var6 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-899989598, 24);
                  }
                  break;
               case 3198432:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("36/SNnjG1hZPLsEJPHmrco1N2mXOFpfEYczjKizAyG1hyb9d"))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-722095811, 30);
                  }
                  break;
               case 3317797:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("91iPgGYeY5vxpsGpy9SYFMUazopKhCax8Gw70mXzuzcnnaCM"))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2002113311, 8);
                  }
                  break;
               case 93922241:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("tzanS9HoOQkLndyfuUndSafhwYVwHtkbLhMWefJi5p3qnsKiJE0="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1439833720, 16);
                  }
                  break;
               case 94627585:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("+zCaQyTc6zTiXUVqR9tHexgz+urXjYu0bg22vVdysTcdzF8FxMQ="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(157144821, 23);
                  }
                  break;
               case 1069952181:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZaEWRrMGyX0uo8VB6xxNBzC/Ck5wAqRjNXt7TpgI1HOPf5SLmo5q4w/yRgMfBr/O"))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310646, 31);
                  }
                  break;
               case 1735676010:
                  if (var4.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Ju+D/Q9WM0SccDeb1o5CL4CgpBeFPkzZ4asY96czTpKhyqa5Mirx4FrdTj8="))) {
                     var6 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(1298988683, 26);
                  }
            }

            switch (var6) {
               case 0:
               case 1:
               case 2:
                  return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310485, 2);
               case 3:
               case 4:
                  return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387816, 31);
               case 5:
               case 6:
                  return Xqedii_ntttel8.Xqedii_2d77kqauxzceu(411738142, 4);
               case 7:
               case 8:
                  return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1561306305, 16);
               case 9:
               case 10:
                  return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(181393141, 15);
               case 11:
               case 12:
                  return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1440067900, 19);
               default:
                  try {
                     int var7 = Integer.parseInt(var4);
                     return var7 >= 0 && var7 <= Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(145610485, 20)
                        ? var7
                        : Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1425387837, 14);
                  } catch (NumberFormatException var8) {
                     return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1425387837, 12);
                  }
            }
         }
      }
   }

   public ItemStack resolveInventorySlotStack(Player var1, String var2) {
      if ((-2124591067 * -2124591067 - -2124591067 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = this.resolveInventorySlotIndex(var2);
         if (var3 < 0) {
            return null;
         } else if (var1 == null) {
            return new ItemStack(Material.AIR);
         } else {
            PlayerInventory var4 = var1.getInventory();
            int var5 = var3 == Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(266196725, 21) ? var4.getHeldItemSlot() : var3;
            ItemStack var6 = var4.getItem(var5);
            return var6 != null && !var6.getType().isAir() ? var6.clone() : new ItemStack(Material.AIR);
         }
      }
   }

   public String resolvePlayerHeadFont(Player var1, String var2) {
      if ((74193525 * 74193525 - 74193525 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!PlayerHeadFontService.containsPlaceholder(var2)) {
         return var2;
      } else {
         PlayerHeadFontService var3 = this.playerHeadFontService();
         return var3 == null
            ? var2
            : var3.apply(
               var1,
               var2,
               var2x -> {
                  if ((820379712 * (820379712 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     String var3x = this.applyPlaceholderApiWithPapi(var1, var2x);
                     if (var1 != null && var3x != null) {
                        var3x = var3x.replaceAll(
                           Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QjVIqxW9caxs6EiRGOwcJBaLeo/TQgBy3yDxvanc8UJIby30JVXf3u4O2VYUPyHzmLg1yQ=="),
                           Matcher.quoteReplacement(var1.getName())
                        );
                     }

                     return var3x;
                  }
               }
            );
      }
   }

   public String normalizeDoublePercentPlaceholder(String var1) {
      if (((1294901408 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var1.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("+VVIpn0K4a9Aj0c3zETlDwPUU0NrFjMhgfOP8vRKFjo="))) {
         Matcher var2 = Xqedii_3crgivd.matcher(var1);
         StringBuffer var3 = new StringBuffer();
         int var4 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 19);

         while (var2.find()) {
            var4 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(375052797, 19);
            String var5 = var2.group(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 8));
            var2.appendReplacement(var3, Matcher.quoteReplacement(Xqedii_2uvm2tb15ho9u(var5)));
         }

         if (var4 == 0) {
            return var1;
         } else {
            var2.appendTail(var3);
            return var3.toString();
         }
      } else {
         return var1;
      }
   }

   public String applyPlaceholderApiWithPapi(Player var1, String var2) {
      if (((-569237187 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && !var2.isBlank() && var2.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("iwpkJyCMl6iVli7MOHmm/YNWddR45juP0gujBSMG"))) {
         Plugin var3 = Bukkit.getPluginManager()
            .getPlugin(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("badNEMOACItGvP7OEwWuBilZQKgT9h2NGfMn+QG+ryYKqHEoN82m9tb0Q8WAW2wfqq6O9v8wbKQ="));
         if (var3 != null && var3.isEnabled()) {
            try {
               Class var4 = Class.forName(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                     "Romwq3pUzgYVo+AVVGwTiQNmSrCCs6SOqRDjycJ4tspCOX0wSpXmUg2UxGDUS2UWtplVhawv/e1wbko9T9Iagmr5orCBd6ZiPYXN0TP6XlaagWNBPeTrkXHmlCQFd4ZDaELaRSOK"
                  )
               );
               String var10001 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("MmYsQLQiX7xAzfS9hm9g5+4vQNAC8dRZHYLuaQPmJQugIJMnZa9MmHXKnTYX8j+QmnDh3/84rfBagg==");
               Class[] var10002 = new Class[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1613666771, 7)];
               var10002[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1498114036, 21)] = Player.class;
               var10002[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387832, 2)] = String.class;
               Method var5 = var4.getMethod(var10001, var10002);
               Object[] var8 = new Object[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1962258748, 28)];
               var8[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 13)] = var1;
               var8[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387964, 7)] = var2;
               Object var6 = var5.invoke(null, var8);
               return var6 == null ? var2 : var6.toString();
            } catch (Throwable var7) {
               return var2;
            }
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public String applyItemsAdderFontImages(String var1) {
      if (((-972190630 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.toLowerCase(Locale.ROOT);
         if (!var1.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("G/7z5NiB0Grj+AdajREHhiC3LPJIKYohZJoFWfqI"))
            && !var2.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("lnYItxoCorfW2Lo9pV2BdV1YZ5/RXIKWggQX6DAq6dIhuGcuc9Y="))) {
            return var1;
         } else {
            Plugin var3 = Bukkit.getPluginManager()
               .getPlugin(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("1Dqk4Vtv/tdI9XYt5NRgVKFsNroGEvo0BoMOTmLUGTi2oLldM3lBqyhrzOKP4rd8"));
            if (var3 != null && var3.isEnabled()) {
               try {
                  Class var4 = Class.forName(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                        "f1o5VzPumdC6YmfKu5zXE3AGhFwvWv4lBghIWpeMDyOw/b5q7UdvOGfgxwJTuuP2dAKhIR5h9vSWB/zc9LVtCxt9JkxR3Nk9jjZtgkAhy7aNyFrlNFxQbstSviQbOJiuFPAULX0l+zD0jVvQMOssElE1FWFuw7U8vBMv5S/AeUK9kw=="
                     )
                  );
                  String var10001 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("bFYQ4tY2Xcfqv5s0JhSDpzaKuax4T52YuaRv0OpIeTLG0rsIcel8m6MCXmN1PvJKwaku92h+zgGQ1z5yXnc=");
                  Class[] var10002 = new Class[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1801974873, 29)];
                  var10002[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 19)] = String.class;
                  Method var5 = var4.getMethod(var10001, var10002);
                  Object[] var8 = new Object[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833450, 6)];
                  var8[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 2)] = var1;
                  Object var6 = var5.invoke(null, var8);
                  return var6 == null ? var1 : var6.toString();
               } catch (Throwable var7) {
                  return var1;
               }
            } else {
               return var1;
            }
         }
      } else {
         return var1;
      }
   }

   public String applyCraftEngineFontImages(String var1) {
      if ((392948773 ^ 392948773) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && !var1.isBlank()
         && var1.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("uawjkHYahQQD4w4nqx0AQJ1Ojt3fsuL9o4TbcpO3UfXa1sx+L1NeZhEm"))) {
         Plugin var2 = Bukkit.getPluginManager()
            .getPlugin(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("0dJJ8TK3iL4bh6PTgo0+Onpn3Hwxb4EonIG/oRr/W12MOla0c/Kv3cQU+fdX4cmFMv8="));
         if (var2 != null && var2.isEnabled()) {
            try {
               Class var3 = Class.forName(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                     "KYYGK+/5PswVYobRCqnmPY39fe1RFIjtM2qX8Au+TyfdGZ1sVXraMIwukd5qmlYTr3gszULJEwEw2acLf0UQXeFgCR8E5EKZ/cyH81NC//F49rJ7/kTMelm0kmKPNgvi9dPH/7y25nt0gLdx"
                  )
               );
               String var10001 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("AO6nZTcnUVBO7ItVEStKQrILtDRKe1sEKWZWUqo2IWY=");
               Class[] var10002 = new Class[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-390932785, 14)];
               var10002[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 13)] = String.class;
               Method var4 = var3.getMethod(var10001, var10002);
               Class var5 = Class.forName(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                     "xAIf+spzWibLnlEhZbzhnMX4bEcvxRM3GRelxOxgj3PG1l/Fj9tVyjCecJ88jc854wlL2HFmr3KyYlx4tQb66eQCgtPiEj3c8iAB4idVqBULYt83z9trANnWZ9uqiyGuddT9ugzKSD++OMY9lPRtV7ni9BtjUQ7zB1+1MbWIGGXjzvo2Fc+Ia0pY"
                  )
               );
               var10001 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("qsAl1HiH5MJ5Ta1iX4DS2+8P/ShsJEr3RExLgZAhas7ukF3x");
               var10002 = new Class[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1766424763, 25)];
               var10002[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 8)] = var3;
               Method var6 = var5.getMethod(var10001, var10002);
               Matcher var7 = Xqedii_31qcpyp.matcher(var1);
               StringBuffer var8 = new StringBuffer(var1.length());
               int var9 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1891915027, 31);

               while (var7.find()) {
                  String var10 = var7.group(Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1155281173, 21));
                  String var11 = this.Xqedii_18rf9ga(var7.group(Xqedii_ntttel8.Xqedii_b04l01r82a2w(-390932785, 14)), var4, var6);
                  if (var11 != null) {
                     var10 = var11;
                     var9 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387828, 3);
                  }

                  var7.appendReplacement(var8, Matcher.quoteReplacement(var10));
               }

               if (var9 == 0) {
                  return var1;
               } else {
                  var7.appendTail(var8);
                  return var8.toString();
               }
            } catch (Throwable var12) {
               return var1;
            }
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public String Xqedii_18rf9ga(String var1, Method var2, Method var3) {
      if (((1223739408 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         try {
            String[] var4 = var1.trim().split(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("G/7z5NiB0Grj+AdajREHhiC3LPJIKYohZJoFWfqI"));
            if (var4.length < Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-511137244, 0)) {
               return null;
            } else {
               String var5 = Xqedii_1p6uu68j48kv7(
                  var4[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 28)], var4[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1744066923, 5)]
               );
               int var6 = var4.length >= Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387839, 0)
                  ? this.Xqedii_2nezg7u(var4[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387832, 1)], Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 24))
                  : Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 20);
               int var7 = var4.length >= Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425388860, 8)
                  ? this.Xqedii_2nezg7u(var4[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182318837, 12)], Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1440292472, 16))
                  : Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 31);
               Object[] var10002 = new Object[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1618599256, 26)];
               var10002[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 11)] = var5;
               Object var8 = var2.invoke(null, var10002);
               var10002 = new Object[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1338184020, 25)];
               var10002[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1162950412, 11)] = var8;
               Object var9 = var3.invoke(null, var10002);
               if (var9 == null) {
                  return null;
               } else {
                  Class var10000 = var9.getClass();
                  String var10001 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("0iMTd7l52tJUfp1BT8OZKz/Pv1gWJiRKxAmctd+ziuG/Ptdnn2b/kVWwLQuR8my/8G2SYtsC");
                  Class[] var14 = new Class[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(178116341, 22)];
                  var14[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 19)] = int.class;
                  var14[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1465940446, 18)] = int.class;
                  Method var10 = var10000.getMethod(var10001, var14);
                  var10.setAccessible(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 19) != 0);
                  var10002 = new Object[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1466726878, 18)];
                  var10002[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 1)] = var6;
                  var10002[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833450, 6)] = var7;
                  Object var11 = var10.invoke(var9, var10002);
                  return var11 == null ? null : var11.toString();
               }
            }
         } catch (Throwable var12) {
            return null;
         }
      } else {
         return null;
      }
   }

   public int Xqedii_2nezg7u(String var1, int var2) {
      if ((774191990 * 774191990 - 774191990 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            return Integer.parseInt(var1.trim());
         } catch (Throwable var4) {
            return var2;
         }
      }
   }

   public String normalizeHexColor(String var1) {
      if ((782607497 ^ 782607497) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      } else {
         String var2 = var1.trim();
         if (var2.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("761zXkbCjkFuL2RMj5XTnLVuuG772FTPcX1edKpYPRs="))
            && var2.endsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("xZF7uFphEolhJNldTnJ8s+gd9+7ci0URgQN6mGMA"))
            && var2.length() == Xqedii_ntttel8.Xqedii_2d77kqauxzceu(205869415, 3)) {
            var2 = var2.substring(Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1646954808, 6), Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425912124, 16));
         } else if (var2.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("HoaDH/vYvnoRg+gyalgdHGEg9U118zSjg9wlJ3V5Pk4="))
            && var2.length() == Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387837, 29)) {
            var2 = var2.substring(Xqedii_ntttel8.Xqedii_b04l01r82a2w(-390916401, 14));
         } else if (var2.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("pK/J6jNFqM1Rq7Vjnn5HKr4abe9TG7ugom+3l/VY"))
            && var2.length() == Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425391932, 12)) {
            var2 = var2.substring(Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 1));
         }

         if (this.Xqedii_3tjgwmg(var2)) {
            return var2.toLowerCase(Locale.ROOT);
         } else {
            if (this.Xqedii_higbh02(var2)) {
               try {
                  long var3 = Long.parseLong(var2);
                  if (var3 < Xqedii_ntttel8.Xqedii_3qlw24zzq0fs5(-907658365117084566L, 58)) {
                     return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
                  }

                  if (var3 <= Xqedii_ntttel8.Xqedii_3qlw24zzq0fs5(8473639369767825142L, 6)) {
                     String var5 = Long.toOctalString(var3);
                     if (var5.length() <= Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425389372, 8)) {
                        Locale var7 = Locale.ROOT;
                        String var8 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("UzbuC2ptC9bbGn4V7OJoNeF3tfG3J3V4N3zh7BJ2OvbLXA==");
                        Object[] var9 = new Object[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 15)];
                        var9[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-899989598, 24)] = var5;
                        return String.format(var7, var8, var9)
                           .replace((char)Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(170252021, 19), (char)Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425375548, 8));
                     }
                  }

                  if (var3 <= Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(8642244779283809531L, 51)) {
                     Locale var10000 = Locale.ROOT;
                     String var10001 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("IdUpHXFy1O8Iox3AetGj0GgGi1wawaPiljqQ99VWyvntDj/I");
                     Object[] var10002 = new Object[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1294544920, 22)];
                     var10002[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-600763068, 29)] = var3;
                     return String.format(var10000, var10001, var10002);
                  }
               } catch (NumberFormatException var6) {
                  return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
               }
            }

            return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
         }
      }
   }

   public boolean Xqedii_3tjgwmg(String var1) {
      if (((941329009 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.length() == Xqedii_ntttel8.Xqedii_b04l01r82a2w(-799326302, 24)) {
         for (int var2 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-390949169, 14); var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            int var4 = var3 >= Xqedii_ntttel8.Xqedii_b04l01r82a2w(1265103967, 29) && var3 <= Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2044548993, 2)
               ? Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1980210646, 22)
               : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1891915027, 31);
            int var5 = var3 >= Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(215865077, 20) && var3 <= Xqedii_ntttel8.Xqedii_b04l01r82a2w(-24329876, 10)
               ? Xqedii_ntttel8.Xqedii_b04l01r82a2w(-48866599, 11)
               : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-511137242, 0);
            int var6 = var3 >= Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-1965173003, 25) && var3 <= Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182312533, 5)
               ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 2)
               : Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1764759374, 30);
            if (var4 == 0 && var5 == 0 && var6 == 0) {
               return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 16) != 0;
            }
         }

         return Xqedii_ntttel8.Xqedii_2d77kqauxzceu(205869375, 3) != 0;
      } else {
         return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 28) != 0;
      }
   }

   public boolean Xqedii_higbh02(String var1) {
      if ((-1437331572 * -1437331572 - -1437331572 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (int var2 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(695008907, 26); var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            if (var3 < Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182396661, 12) || var3 > Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1326075588, 26)) {
               return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 26) != 0;
            }
         }

         return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 9) != 0;
      } else {
         return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 12) != 0;
      }
   }

   public Map<String, Object> toStringObjectMap(Object var1) {
      if ((1575962918 ^ 1575962918) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         Map var2;
         if (var1 instanceof Map var4) {
            var2 = var4;
         } else {
            if (!(var1 instanceof ConfigurationSection var3)) {
               return null;
            }

            var2 = var3.getValues(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 18) != 0);
         }

         LinkedHashMap var7 = new LinkedHashMap();

         for (Map.Entry<?, ?> var6 : ((Map<?, ?>) var2).entrySet()) {
            if (var6.getKey() != null) {
               var7.put(var6.getKey().toString(), var6.getValue());
            }
         }

         return var7;
      }
   }

   public ConfigurationSection mapToSection(Map<?, ?> var1) {
      if ((-1766067192 * -1766067192 + -1766067192 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         YamlConfiguration var2 = new YamlConfiguration();
         this.writeMapToSection(var2, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg=="), var1);
         return var2;
      }
   }

   public void writeMapToSection(YamlConfiguration var1, String var2, Map<?, ?> var3) {
      if ((-519285177 * (-519285177 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (Entry var5 : var3.entrySet()) {
            if (var5.getKey() != null) {
               String var6 = var5.getKey().toString();
               String var7 = var2.isEmpty() ? var6 : Xqedii_1w5yd7cl9fkh5(var2, var6);
               Object var8 = var5.getValue();
               if (var8 instanceof Map var9) {
                  this.writeMapToSection(var1, var7, var9);
               } else {
                  var1.set(var7, var8);
               }
            }
         }
      }
   }

   public void setBindingValue(Map<String, Object> var1, String var2, double var3) {
      if ((-165747644 * -165747644 + -165747644 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         this.setMapPathValue(var1, var2, var3);
      }
   }

   public Map<String, Object> resolveRawMapAtPath(List<Map<String, Object>> var1, String var2) {
      if ((-1612691654 * -1612691654 + -1612691654 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Object var3 = var1;
         String[] var4 = var2.split(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("EMerxqzEoMXlsHBWayPbOp3n3s+GAP2sAggkdeV8t2U="));
         String[] var5 = var4;
         int var6 = var4.length;

         for (int var7 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1298739224, 22); var7 < var6; var7++) {
            String var8 = var5[var7];
            if (var3 instanceof List var9) {
               int var10 = this.parsePathIndex(var8);
               if (var10 < 0 || var10 >= var9.size()) {
                  return null;
               }

               var3 = var9.get(var10);
            } else {
               if (!(var3 instanceof Map var12)) {
                  return null;
               }

               var3 = var12.get(var8);
            }
         }

         return var3 instanceof Map var11 ? var11 : null;
      } else {
         return null;
      }
   }

   public int parsePathIndex(String var1) {
      if (((733368081 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            return Integer.parseInt(var1);
         } catch (Exception var3) {
            return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1425387837, 22);
         }
      }
   }

   public void setMapPathValue(Map<String, Object> var1, String var2, Object var3) {
      if ((-404145569 * -404145569 - -404145569 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String[] var4 = var2.split(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("EMerxqzEoMXlsHBWayPbOp3n3s+GAP2sAggkdeV8t2U="));
         Map<String, Object> var5 = var1;

         for (int var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 10); var6 < var4.length - Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713685090, 14); var6++) {
            String var7 = var4[var6];
            if (var5.get(var7) instanceof Map var9) {
               var5 = (Map<String, Object>) var9;
            } else {
               LinkedHashMap<String, Object> var11 = new LinkedHashMap<>();
               var5.put(var7, var11);
               var5 = var11;
            }
         }

         var5.put(var4[var4.length - Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 1)], var3);
      }
   }

   public void saveDefaultResource(String var1) {
      if ((-2131328465 * -2131328465 - -2131328465 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var2 = new File(this.plugin.getDataFolder(), var1);
         if (!var2.exists()) {
            File var3 = var2.getParentFile();
            if (var3 != null && !var3.exists()) {
               var3.mkdirs();
            }

            try {
               if (this.plugin.getResource(var1) != null) {
                  this.plugin.saveResource(var1, Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1362562117, 19) != 0);
               } else {
                  String var4 = this.resolveLegacyDefaultResourcePath(var1);
                  if (var4 != null && !var4.isBlank()) {
                     try (InputStream var5 = this.plugin.getResource(var4)) {
                        if (var5 != null) {
                           Path var10001 = var2.toPath();
                           CopyOption[] var10002 = new CopyOption[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713685090, 14)];
                           var10002[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(923551057, 27)] = StandardCopyOption.REPLACE_EXISTING;
                           Files.copy(var5, var10001, var10002);
                           return;
                        }
                     }
                  }
               }
            } catch (IOException var10) {
               this.plugin.getLogger().warning(Xqedii_2ijugu92d8tc(var1, var10.getMessage()));
            }
         }
      }
   }

   public String resolveLegacyDefaultResourcePath(String var1) {
      if ((-1427160414 * -1427160414 - -1427160414 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.replace((char)Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067656795, 8), (char)Xqedii_ntttel8.Xqedii_2d77kqauxzceu(2019699330, 30));
         return var2.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("iP/FUl8zXzppL7CIczc0Gh+72Dz5OV70sk0YASssSxydTVpXswKRVg6lUFQWkQ=="))
            ? var2.substring(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("iP/FUl8zXzppL7CIczc0Gh+72Dz5OV70sk0YASssSxydTVpXswKRVg6lUFQWkQ==").length())
            : null;
      } else {
         return null;
      }
   }

   public Map<String, YamlConfiguration> loadYamlFolder(String var1, List<YamlIssue> var2) {
      if ((1970971538 * 1970971538 - 1970971538 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var3 = this.Xqedii_tmblrtj(var1, var2);
         String var4 = this.Xqedii_g5m5p3m(var1);
         if (var4 == null) {
            return var3;
         } else {
            Map var5 = this.Xqedii_tmblrtj(var4, var2);
            if (var5.isEmpty()) {
               return var3;
            } else {
               HashMap var6 = var3.isEmpty() ? new HashMap(var5) : new HashMap(var3);
               if (!var3.isEmpty()) {
                  for (Map.Entry<?, ?> var8 : ((Map<?, ?>) var5).entrySet()) {
                     var6.putIfAbsent((String)var8.getKey(), (YamlConfiguration)var8.getValue());
                  }
               }

               return var6;
            }
         }
      }
   }

   public String Xqedii_g5m5p3m(String var1) {
      if (((1608771063 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (var1.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("jBVDbCmkrFxZ8QOitzW6BvaBGg+tzpiW+snYe5xtscfbX0nXMb87HxXcj9YuP/LrS4n9abkwkqw="))) {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("NMULs+8aUvO8V/Wy63DMXHZriZrn1Tv6SzYY+iPkkdk7v0x2TCKtQLs0/8pdYowjvUrtLbiGv6Xd7b1J+cGEybrw6UCmTg==");
      } else {
         return var1.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("tzEGE6lZwSEiNkfEvawmCBo7cNS2lEWukGeb32F12FFHLBTl7OOI5cmmJiZmY38pTqV3v2YK8fY0wKv/i0NV7G85"))
            ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("T8DzsQfuaWMlEaqp0vO/n2vZdNJhXmxLPMA+/0k5FvWFXlR9AcHBq06jjHT5CDy0NLQnmW3yQOnAUH5xwA3r9o5TDc/sopAjsCXqApxMeZ0=")
            : null;
      }
   }

   public Map<String, YamlConfiguration> Xqedii_tmblrtj(String var1, List<YamlIssue> var2) {
      if (((1045482899 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var3 = new File(this.plugin.getDataFolder(), var1);
         String var4 = this.Xqedii_33li7xq(var3);
         Map var5 = this.Xqedii_1dp01q2.get(var4);
         long var6 = System.currentTimeMillis();
         long var8 = this.Xqedii_cid7pf7.getOrDefault(var4, Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444534213325806L, 24));
         boolean var10 = this.Xqedii_3t1c32w.remove(var4);
         int var11 = var5 != null && !var5.isEmpty() && !var10 && var6 - var8 < Xqedii_ntttel8.Xqedii_g28b6aytxs56(6439806157073396826L, 31)
            ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 31)
            : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2044548965, 2);
         if (var11 != 0) {
            return this.Xqedii_1us8aai(var3, var5, var2);
         } else if (var3.exists() && var3.isDirectory()) {
            if (var5 == null) {
               var5 = this.Xqedii_1dp01q2.computeIfAbsent(var4, var0 -> {
                  if ((-1326539125 * -1326539125 - -1326539125 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return new HashMap<>();
                  }
               });
            }

            int var12 = !var5.isEmpty() && !var10 && var6 - var8 < Xqedii_ntttel8.Xqedii_1czyztif8jmqg(-3072452866441491439L, 34)
               ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 8)
               : Xqedii_ntttel8.Xqedii_b04l01r82a2w(1524235542, 27);
            if (var12 == 0) {
               return this.Xqedii_1us8aai(var3, var5, var2);
            } else {
               File[] var13 = var3.listFiles((var0, var1x) -> {
                  if ((1689966699 * 1689966699 + 1689966699 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return var1x.toLowerCase(Locale.ROOT).endsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("rpZCFaUzlePRXgjzbz5VA9ar2C8ynn0Iik+HF4fwikiffgnE"));
                  }
               });
               this.Xqedii_cid7pf7.put(var4, var6);
               if (var13 == null) {
                  var5.clear();
                  return Collections.emptyMap();
               } else {
                  HashSet var14 = new HashSet();
                  HashMap var15 = new HashMap();
                  File[] var16 = var13;
                  int var17 = var13.length;

                  for (int var18 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1984404950, 22); var18 < var17; var18++) {
                     File var19 = var16[var18];
                     String var20 = this.Xqedii_1e31hwz(var19);
                     var14.add(var20);
                     Xqedii_dfny1vz var21 = (Xqedii_dfny1vz) var5.computeIfAbsent(var20, var0 -> {
                        if ((-4412836 * -4412836 - -4412836 & 1) != 0) {
                           throw new IllegalStateException();
                        } else {
                           return new Xqedii_dfny1vz();
                        }
                     });
                     var21.Xqedii_1yix98m = var19.getName();
                     var21.Xqedii_r1c2azi = this.Xqedii_2f1xx65(var21.Xqedii_1yix98m);
                     YamlConfiguration var22 = this.Xqedii_20p8v9b(var19, var2, var21);
                     if (var22 != null) {
                        var15.put(var21.Xqedii_r1c2azi, var22);
                     }
                  }

                  var5.keySet()
                     .removeIf(
                        var1x -> {
                           if (((-1297800210 << 1 | 1) & 1) == 0) {
                              throw new IllegalStateException();
                           } else {
                              return (!var14.contains(var1x)
                                 ? Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425355068, 15)
                                 : Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833514, 6)) != 0;
                           }
                        }
                     );
                  if (var5.isEmpty()) {
                     this.Xqedii_1dp01q2.remove(var4);
                  }

                  return var15;
               }
            }
         } else {
            this.Xqedii_1dp01q2.remove(var4);
            this.Xqedii_cid7pf7.remove(var4);
            this.Xqedii_3t1c32w.remove(var4);
            return Collections.emptyMap();
         }
      }
   }

   public Map<String, YamlConfiguration> Xqedii_1us8aai(File var1, Map<String, Xqedii_dfny1vz> var2, List<YamlIssue> var3) {
      if (((1784908103 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2.isEmpty()) {
         return Collections.emptyMap();
      } else {
         HashMap var4 = new HashMap();

         for (Xqedii_dfny1vz var6 : var2.values()) {
            if (var6 != null) {
               String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1568794486, 20)];
               var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 15)] = var6.Xqedii_r1c2azi;
               String var7 = this.firstNonBlank(var10001).trim();
               if (!var7.isBlank()) {
                  if (var6.Xqedii_wxf1reg) {
                     String[] var10006 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182318837, 13)];
                     var10006[Xqedii_ntttel8.Xqedii_b04l01r82a2w(749057018, 20)] = var6.Xqedii_1yix98m;
                     var10006[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 20)] = Xqedii_2j4u0j4b3oouy(var7);
                     this.Xqedii_wgkhnqo(var3, new File(var1, this.firstNonBlank(var10006)), var6.Xqedii_19ad1dw);
                  } else if (var6.Xqedii_q2hauwb != null) {
                     var4.put(var7, var6.Xqedii_q2hauwb);
                  }
               }
            }
         }

         return var4;
      }
   }

   public YamlConfiguration loadYamlFile(File var1, List<YamlIssue> var2) {
      if (((1292094001 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         File var3 = var1.getParentFile();
         if (var3 == null) {
            return this.Xqedii_20p8v9b(var1, var2, null);
         } else {
            String var4 = this.Xqedii_33li7xq(var3);
            Map var5 = this.Xqedii_1dp01q2.computeIfAbsent(var4, var0 -> {
               if ((246416470 * 246416470 + 246416470 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  return new HashMap<>();
               }
            });
            String var6 = this.Xqedii_1e31hwz(var1);
            Xqedii_dfny1vz var7 = (Xqedii_dfny1vz) var5.computeIfAbsent(var6, var0 -> {
               if (((-935450935 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  return new Xqedii_dfny1vz();
               }
            });
            return this.Xqedii_20p8v9b(var1, var2, var7);
         }
      }
   }

   public YamlConfiguration Xqedii_20p8v9b(File var1, List<YamlIssue> var2, Xqedii_dfny1vz var3) {
      if ((-250825856 ^ -250825856) != 0) {
         throw new IllegalStateException();
      } else {
         if (var3 != null) {
            String[] var10002 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(205869351, 3)];
            var10002[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1440292472, 16)] = var3.Xqedii_1yix98m;
            var10002[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-781865569, 15)] = var1.getName();
            var3.Xqedii_1yix98m = this.firstNonBlank(var10002);
            var10002 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-195458201, 13)];
            var10002[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 15)] = var3.Xqedii_r1c2azi;
            var10002[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 1)] = this.Xqedii_2f1xx65(var3.Xqedii_1yix98m);
            var3.Xqedii_r1c2azi = this.firstNonBlank(var10002);
         }

         long var4 = var1.lastModified();
         long var6 = var1.length();
         if (var3 == null || var3.Xqedii_14rpo40 != var4 || var3.Xqedii_8y54azp != var6) {
            YamlConfiguration var8 = new YamlConfiguration();

            try {
               var8.load(var1);
               if (var3 != null) {
                  var3.Xqedii_14rpo40 = var4;
                  var3.Xqedii_8y54azp = var6;
                  var3.Xqedii_wxf1reg = Xqedii_ntttel8.Xqedii_b04l01r82a2w(1390017814, 27) != 0;
                  var3.Xqedii_19ad1dw = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
                  var3.Xqedii_q2hauwb = var8;
               }

               return var8;
            } catch (Exception var11) {
               String var10 = var11.getMessage() == null
                  ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                     "kiQcyGEBzZufp3ufVvM4U6eIpO4ckc0hxpE8quSfv77z/akRK+0CL/Tn8BsFydJVaEwxhestmDkg/L54G4Ha7i8SSUu9N101hXS1vg=="
                  )
                  : var11.getMessage();
               if (var3 != null) {
                  var3.Xqedii_14rpo40 = var4;
                  var3.Xqedii_8y54azp = var6;
                  var3.Xqedii_wxf1reg = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1416999228, 23) != 0;
                  var3.Xqedii_19ad1dw = var10;
                  var3.Xqedii_q2hauwb = null;
               }

               this.Xqedii_wgkhnqo(var2, var1, var10);
               return null;
            }
         } else if (var3.Xqedii_wxf1reg) {
            this.Xqedii_wgkhnqo(var2, var1, var3.Xqedii_19ad1dw);
            return null;
         } else {
            return var3.Xqedii_q2hauwb;
         }
      }
   }

   public void Xqedii_wgkhnqo(List<YamlIssue> var1, File var2, String var3) {
      if ((308519723 * 308519723 + 308519723 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         YamlIssue var4 = new YamlIssue();
         var4.file = this.toDataRelativePath(var2);
         String[] var10002 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1416999228, 22)];
         var10002[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 7)] = var3;
         var10002[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1233173098, 1)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "kiQcyGEBzZufp3ufVvM4U6eIpO4ckc0hxpE8quSfv77z/akRK+0CL/Tn8BsFydJVaEwxhestmDkg/L54G4Ha7i8SSUu9N101hXS1vg=="
         );
         var4.details = this.firstNonBlank(var10002);
         var1.add(var4);
      }
   }

   public String Xqedii_33li7xq(File var1) {
      if (((-665849115 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==") : var1.getAbsolutePath();
      }
   }

   public String Xqedii_1e31hwz(File var1) {
      if ((1417857010 ^ 1417857010) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==") : var1.getName().toLowerCase(Locale.ROOT);
      }
   }

   public String Xqedii_2f1xx65(String var1) {
      if ((6058203 * 6058203 + 6058203 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 17)];
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 14)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         return var2.toLowerCase(Locale.ROOT).endsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("rpZCFaUzlePRXgjzbz5VA9ar2C8ynn0Iik+HF4fwikiffgnE"))
               && var2.length() > Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310773, 7)
            ? var2.substring(Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 27), var2.length() - Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(181524213, 18))
            : var2;
      }
   }

   public void invalidateYamlFileCache(File var1) {
      if (((-665977507 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         File var2 = var1.getParentFile();
         if (var2 != null) {
            String var3 = this.Xqedii_33li7xq(var2);
            this.Xqedii_3t1c32w.add(var3);
            this.Xqedii_cid7pf7.remove(var3);
            if (this.plugin != null
               && var2.equals(
                  new File(
                     this.plugin.getDataFolder(),
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("jBVDbCmkrFxZ8QOitzW6BvaBGg+tzpiW+snYe5xtscfbX0nXMb87HxXcj9YuP/LrS4n9abkwkqw=")
                  )
               )) {
               this.plugin.scheduleUiCommandRefresh();
               this.onPageFileInvalidated(var1);
            }

            Map var4 = this.Xqedii_1dp01q2.get(var3);
            if (var4 != null && !var4.isEmpty()) {
               var4.remove(this.Xqedii_1e31hwz(var1));
               if (var4.isEmpty()) {
                  this.Xqedii_1dp01q2.remove(var3);
               }
            }
         }
      }
   }

   public void onPageFileInvalidated(File var1) {
      if (((-2080799296 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      }
   }

   public void reportYamlIssues(List<YamlIssue> var1) {
      if ((1224595727 * (1224595727 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.plugin.getLogger().severe(Xqedii_2hu56jlqelqxe(var1.size()));

         for (YamlIssue var3 : var1) {
            this.plugin.getLogger().severe(Xqedii_13j9px9y3a0nn(var3.file, var3.details));
         }
      }
   }

   public String toDataRelativePath(File var1) {
      if (((-1497133992 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.plugin.getDataFolder().getAbsolutePath();
         String var3 = var1.getAbsolutePath();
         if (var3.startsWith(var2)) {
            var3 = var3.substring(var2.length());
            if (var3.startsWith(File.separator)) {
               var3 = var3.substring(Xqedii_ntttel8.Xqedii_b04l01r82a2w(-97733197, 12));
            }
         }

         return var3.replace((char)Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1423683900, 15), (char)Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1443213628, 20));
      }
   }

   public void sanitizeYamlTabs(String var1) {
      if ((566175486 ^ 566175486) != 0) {
         throw new IllegalStateException();
      } else {
         File var2 = new File(this.plugin.getDataFolder(), var1);
         if (var2.exists() && var2.isDirectory()) {
            File[] var3 = var2.listFiles((var0, var1x) -> {
               if ((-1026467565 ^ -1026467565) != 0) {
                  throw new IllegalStateException();
               } else {
                  return var1x.toLowerCase().endsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("rpZCFaUzlePRXgjzbz5VA9ar2C8ynn0Iik+HF4fwikiffgnE"));
               }
            });
            if (var3 != null) {
               File[] var4 = var3;
               int var5 = var3.length;

               for (int var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(652314794, 24); var6 < var5; var6++) {
                  File var7 = var4[var6];

                  try {
                     String var8 = Files.readString(var7.toPath(), StandardCharsets.UTF_8);
                     if (var8.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("abuxezyGUAE1AHocDPKas7GuhD1rC6t/VfcapQC/"))) {
                        Files.writeString(
                           var7.toPath(),
                           var8.replace(
                              Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("abuxezyGUAE1AHocDPKas7GuhD1rC6t/VfcapQC/"),
                              Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("9gt6igkEf+OlSHxB+TBfXvkI+UhzuctnBNeQwnYL+IY=")
                           ),
                           StandardCharsets.UTF_8
                        );
                        this.invalidateYamlFileCache(var7);
                        this.plugin.getLogger().warning(Xqedii_1x8yeuqt8s4p9(this.toDataRelativePath(var7)));
                     }
                  } catch (IOException var9) {
                     this.plugin.getLogger().warning(Xqedii_q8jwklzyat8w(this.toDataRelativePath(var7), var9.getMessage()));
                  }
               }
            }
         }
      }
   }

   public String withHexPrefix(String var1, String var2) {
      if (((-771797829 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Matcher var3 = Xqedii_3uxgwyg.Xqedii_35sor6d.matcher(var1);
         if (var3.find()) {
            return var1;
         } else {
            Matcher var4 = Pattern.compile(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
                     "QTW/modDcRdj6I/XvqRhCK5JxUIL/f5FTtIhA9oSJZfzM5pAwCxNb4+6Gr07F48tNS1qy96hdNM9mBCDXhGaowS4CvglF+qfTKqY8B743lEOAJ0EwYBAdkZWPmNbyWpdlmA1Y/7YA0yJ3hF2+LA="
                  )
               )
               .matcher(var1);
            if (var4.find()) {
               return var1;
            } else {
               String var5 = this.normalizeHexColor(var2);
               return var5.isBlank() ? var1 : Xqedii_30hadcxdg5sl5(var5, var1);
            }
         }
      } else {
         return var1;
      }
   }

   public String applyOutlineColor(String var1, String var2) {
      if ((-1734959532 * -1734959532 + -1734959532 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var3 = this.normalizeHexColor(var2);
         if (var3.isBlank()) {
            var3 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vEILukA2P1NJbUVHurHQfGox5+YR+e4pt6J3r1SdnhBTYHT/MU50Mw==");
         }

         Matcher var4 = Xqedii_2lsn7i5.Xqedii_2jop5g5.matcher(var1);
         return var4.find() ? var4.replaceFirst(Xqedii_18msjli80em2o(var3)) : Xqedii_347d1mx4pk6l0(var3, var1);
      } else {
         return var1;
      }
   }

   public String withFont(String var1, String var2) {
      if (((1794108737 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.isBlank()) {
         return var1;
      } else if (var2 == null || var2.isBlank()) {
         return var1;
      } else {
         return var1.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("WQUujvBH0/XgPCUbTPboaxTpdJ9QVMQrncVtrNn6fAUwVDuAH3VXfw=="))
            ? var1
            : Xqedii_2kd13zimjzxfc(var2, var1);
      }
   }

   public String withEditorUiFont(String var1) {
      if ((663768367 * 663768367 - 663768367 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.withFont(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7Ej/cVBPr018Vot5XACHCtOxt+avL8HWZcyPcez930YoxJsL/R7gxA=="));
      }
   }

   public String withDefaultFont(String var1) {
      if ((881947814 * 881947814 - 881947814 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.withFont(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZFTGOicXApkcVNHkLD7qwzUwVRSAqx7Mq5ZbtgfSJMfLj6oF3IYkKh7Q"));
      }
   }

   public String applyPreferredFont(String var1, ConfigurationSection var2, boolean var3) {
      if (((1554971227 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.applyPreferredFont(var1, var2, var3, Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 21) != 0);
      }
   }

   public String applyPreferredFont(String var1, ConfigurationSection var2, boolean var3, boolean var4) {
      if ((-1918400903 * -1918400903 - -1918400903 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && !var1.isBlank()
         && !var1.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("WQUujvBH0/XgPCUbTPboaxTpdJ9QVMQrncVtrNn6fAUwVDuAH3VXfw=="))) {
         String var5 = this.resolvePreferredFont(var2, var3, var1, var4);
         return this.withFont(var1, var5);
      } else {
         return var1;
      }
   }

   public String resolvePreferredFont(ConfigurationSection var1, boolean var2, String var3) {
      if ((-627504793 * -627504793 - -627504793 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.resolvePreferredFont(var1, var2, var3, Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1618599256, 26) != 0);
      }
   }

   public String resolvePreferredFont(ConfigurationSection var1, boolean var2, String var3, boolean var4) {
      if ((660048453 ^ 660048453) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1504405492, 21)];
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 16)] = var1 == null
            ? null
            : var1.getString(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("NkdFQA0sscCB+TLL6YKu67hzM0cM2zDdKPERxZ0gM0brRlRF"));
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-722095812, 31)] = var1 == null
            ? null
            : var1.getString(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("zdPgcjftaqOUd6jEoZ9G7M0hku9kTdA6H5sdK27cXqLYhJ50ey9s0TW83vXTtFQL"));
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 0)] = var1 == null
            ? null
            : var1.getString(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("bDK3sYyH2Ypp/5eqOj8Ej0bbvuIm81rE6COkBZK9UzOejuosUqNCTXLFzRLZ9g=="));
         String var5 = this.firstNonBlank(var10001);
         if (!var5.isBlank()) {
            return this.normalizeFontKey(var5);
         } else {
            return var4
               ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7Ej/cVBPr018Vot5XACHCtOxt+avL8HWZcyPcez930YoxJsL/R7gxA==")
               : Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZFTGOicXApkcVNHkLD7qwzUwVRSAqx7Mq5ZbtgfSJMfLj6oF3IYkKh7Q");
         }
      }
   }

   public boolean isEditorContextSession(EditorSession var1) {
      if ((2037199797 * 2037199797 - 2037199797 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 22) != 0;
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-127784311, 30)];
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 13)] = var1.pageName;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (var2.isEmpty()) {
            return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 20) != 0;
         } else {
            return (!Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7Ej/cVBPr018Vot5XACHCtOxt+avL8HWZcyPcez930YoxJsL/R7gxA==").equals(var2)
                  && !Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5zbijA1+3p+MTcSQ9x+HVezV6sHP91+4myCygezswreATV9uikisEwMhaM19anP4tmw=").equals(var2)
                  && !Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("v6dyCf+SKbP2Nvg7zTrgc23sN9mMSG9TmiVp9tYBXDz79wZX02KiAfqBDzB43MirHEcfuQ==").equals(var2)
               ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 9)
               : Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2002114591, 8)) != 0;
         }
      }
   }

   public String normalizeFontKey(String var1) {
      if ((1418648828 * 1418648828 - 1418648828 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1338184020, 25)];
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 22)] = var1;
         String var2 = this.firstNonBlank(var10001);
         if (var2.isBlank()) {
            return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZFTGOicXApkcVNHkLD7qwzUwVRSAqx7Mq5ZbtgfSJMfLj6oF3IYkKh7Q");
         } else {
            String var3 = var2.toLowerCase(Locale.ROOT);
            if (Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZFTGOicXApkcVNHkLD7qwzUwVRSAqx7Mq5ZbtgfSJMfLj6oF3IYkKh7Q").equals(var3)
               || Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("haFpYl90EtrOdgXdEf5Ucjbcpu4DU5Do77O4tBoY94tp1T+OGhKqJ8HBdIUS+J8xeCNeQ6Yg9+FooqiIRP8=").equals(var3)) {
               return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZFTGOicXApkcVNHkLD7qwzUwVRSAqx7Mq5ZbtgfSJMfLj6oF3IYkKh7Q");
            } else {
               return !Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7Ej/cVBPr018Vot5XACHCtOxt+avL8HWZcyPcez930YoxJsL/R7gxA==").equals(var3)
                     && !Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("dHd0X/P1wqY1L/41W6toXMD/g10kiZnlalrUH+itNdn0Vefy2+UkeZ7ci7ivPN9r54uQs3FKvb8emNJj").equals(var3)
                  ? var2
                  : Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7Ej/cVBPr018Vot5XACHCtOxt+avL8HWZcyPcez930YoxJsL/R7gxA==");
            }
         }
      }
   }

   public boolean containsPrivateUseGlyph(String var1) {
      if ((1961333109 * 1961333109 - 1961333109 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         int var2 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(581475206, 10);

         while (var2 < var1.length()) {
            int var3 = var1.codePointAt(var2);
            if (var3 >= Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1685708504, 26) && var3 <= Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-255579796, 31)) {
               return Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067633499, 8) != 0;
            }

            var2 += Character.charCount(var3);
         }

         return Xqedii_ntttel8.Xqedii_b04l01r82a2w(1744066891, 5) != 0;
      } else {
         return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1563796673, 16) != 0;
      }
   }

   public String roundedCornerTextFromBody(String var1, String var2) {
      if ((-247497938 * (-247497938 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.firstHexColorPrefix(var1);
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425388860, 10)];
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(290737603, 9)] = var2;
         String var4 = this.firstNonBlank(var10001);
         String var5 = Xqedii_2lsn7i5.Xqedii_2jop5g5
            .matcher(var4)
            .replaceAll(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg=="))
            .trim();
         if (var5.isBlank()) {
            var5 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("nvwoBErY8SRY8o2Vp59HvPoXsYXnA10KkU2OhvV4");
         }

         String var6 = this.firstHexColorPrefix(var4);
         String var7;
         if (!var6.isBlank()) {
            var7 = Xqedii_2jy4ygxbsnrla(var6, var5);
         } else if (!var3.isBlank()) {
            var7 = Xqedii_24wctnjh9ciry(var3, var5);
         } else if (!var4.isBlank()) {
            var7 = var4;
         } else {
            var7 = var5;
         }

         return this.ensureRoundedCornerEditorFont(var7);
      }
   }

   public String firstHexColorPrefix(String var1) {
      if ((1009786711 * (1009786711 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Matcher var2 = Xqedii_2lsn7i5.Xqedii_2jop5g5.matcher(var1);
         return !var2.find() ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==") : var2.group();
      } else {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      }
   }

   public String withRoundedCornerBaseColor(String var1, String var2) {
      if (((312765482 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.firstHexColorPrefix(var1);
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(290738115, 9)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1697488849, 23)] = var2;
         String var4 = this.firstNonBlank(var10001);
         String var5 = Xqedii_2lsn7i5.Xqedii_2jop5g5
            .matcher(var4)
            .replaceAll(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg=="))
            .trim();
         if (var5.isBlank()) {
            var5 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("nvwoBErY8SRY8o2Vp59HvPoXsYXnA10KkU2OhvV4");
         }

         String var6;
         if (var3.isBlank()) {
            var6 = var4.isBlank() ? var5 : var4;
         } else {
            var6 = Xqedii_22pnhcwia2rb2(var3, var5);
         }

         return this.ensureRoundedCornerEditorFont(var6);
      }
   }

   public String stripRoundedCornerColorTags(String var1) {
      if ((1011137005 ^ 1011137005) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1962258748, 29)];
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713668706, 14)] = var1;
         String var2 = this.firstNonBlank(var10001);
         return var2.isBlank()
            ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
            : var2.replaceAll(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("AC3E4t6pJvdnY3koyvLVe4ZejKb27TLsFYAjZpUh4g7XNWszqXxT52eMyNStA/6sWmlQNttkqCS90Xu14Ig30Q=="),
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
               )
               .trim();
      }
   }

   public String ensureRoundedCornerEditorFont(String var1) {
      if ((-1775552352 ^ -1775552352) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.isEmpty()) {
         return var1;
      } else {
         return var1.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("WQUujvBH0/XgPCUbTPboaxTpdJ9QVMQrncVtrNn6fAUwVDuAH3VXfw=="))
            ? var1
            : Xqedii_vmav0oesyrna(var1);
      }
   }

   public String readRoundedCornerUnicode(ConfigurationSection var1) {
      if ((-1219125540 ^ -1219125540) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1233173084, 1)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1275450203, 4)] = this.readRoundedCornerUnicodeByMode(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(356842545, 13)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("lfv88Ef9jVe+MUruLhwNT/K6awYI4UWN2lXXFFh2JT2sc/d+JjfMNg0WJ8+KnWrpStAgB70nrZjP2BYv")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387964, 6)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("8wo/YwyrQHGZ2c4M01yt/2kKU5vLjtGp3tpegvULwXWqpDoauzCx0cCxJ/2DRuBpc7TZ2U++lctyRb5KZ7f94iPeVPnfb3uc")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310517, 6)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("h9jX7e2OfUc1km1dmlfQg+E/KL00btO7oHElTR+H4vuvvncgeZ4taHyduJ0H7FUsJN059OxqYfsV/vmVmpJCwQI/PU1EDA==")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182302453, 13)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2eRwIaPwtb2hTb75VPU5uNLvuJjqet+dW7siAXQ88vmi5SlnpN4WhuRVv20RxZlUTkN67g9THNP1BYFWNFZ0V8eadDKJ4Hei")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713619554, 14)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("+jSZeIeqW863tLN22yZSAh0LjZxII32MDnYX2a4lVwxg73xeWGrBC4XENWlOAw02j3SZWAXAlTW2nQ==")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387788, 3)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5LeqX4SV/WOvxBxLgU3fObS3swIqXIqN/EhtyFdFzck6HkBvAkS51nk6XOLF1owIZO/XswPU+3CCJA==")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-1965173004, 30)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5FustcVVV/lAIvxRDXsrrEMkYKxxehfaY4njoX0R3i3aFIj+FlJDdJBmaA7gN4Q4Af/v5LQ3")
         );
         return this.firstNonBlank(var10001);
      }
   }

   public String readRoundedCornerUnicodeTopLeft(ConfigurationSection var1) {
      if ((-1183169748 * (-1183169748 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310549, 4)];
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 22)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo=")
         );
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1500211188, 21)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("n9FoaJcPNU8NvuEsqFs1yquBbGBVVjBp2BKWnuMq3tSYKSU0/iyrU+594J0=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310653, 3)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("zUI8pjAd89fVzAPzSKveaB/vCOoSSEmAd285c9dYC5yGR3TbEPfcb9cD")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1475719484, 24)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Y/ggJhLgTU/PMyiE+9M+2DB+xMDze2TVaMx9KE6zLRBmvNOiGYZoVbWI1eM=")
         );
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(376625661, 19)] = this.readRoundedCornerUnicodeByMode(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(181786357, 17)] = this.readRoundedCornerUnicode(var1);
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1492496700, 25)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("beY4IWeVo3murmQ/3f+/5OxqWc2rzbuJBAtWBt/x");
         return this.firstNonBlank(var10001);
      }
   }

   public String readRoundedCornerUnicodeTopRight(ConfigurationSection var1) {
      if (((-800265723 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1526051132, 25)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-637725102, 3)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B1VTMX+MOaYyjLJQE5RlRayIElpC4j6ODV5EuJQjU24=")
         );
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1294544920, 22)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vGLsbUyfZAohR37bIdLW2Yn7hmh9BM3HfSyE7+OkCY/eRsABzRjakMwxlG0Xbg==")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(945957513, 30)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7ZShME7iYXhIyBMB1pKYinnAUd2co+4R1fGzvXY+ZaWIUSSganE1T4xdLzA=")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-722095811, 31)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wL2clpLFZ8QVvekCLHTj3fogbuKfuDBECGVUIXeqTitSEo9EGwL0nFdkiYiy9g==")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182314741, 12)] = this.readRoundedCornerUnicodeByMode(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B1VTMX+MOaYyjLJQE5RlRayIElpC4j6ODV5EuJQjU24=")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425486140, 15)] = this.readRoundedCornerUnicode(var1);
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425390908, 9)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("N4Zi98WnbaKBYNixFE6OHB12WJn83tTSZT+DQ4f5");
         return this.firstNonBlank(var10001);
      }
   }

   public String readRoundedCornerUnicodeBottomRight(ConfigurationSection var1) {
      if ((-82571534 * -82571534 - -82571534 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310549, 4)];
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 27)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2peE2iJiezyrmbTrU3lp1NTtwQCi0dCa4WiGbjiWZCQ=")
         );
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(2135266998, 9)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Gh3TzDMJsMRADwZufmBCM20Ollvapyudvbzo50p//Mp3nbCeHNHiWeU0zWPVe3Y/XoNOhg==")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(309380181, 23)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("MoD6LMXuPw/nSxZF37905DNapGEUoRyPFRhYDNrEml6YxyNvqa7LIyKx0nIdY1Uvw1E=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(581474182, 10)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("tQNeN95963gMr479oiKOb2jb8aSjSmrHwC7fZ9NN7SQrhMvWSq1dcU6YsP6neqxwQXm+Lw==")
         );
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1764759373, 30)] = this.readRoundedCornerUnicodeByMode(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2peE2iJiezyrmbTrU3lp1NTtwQCi0dCa4WiGbjiWZCQ=")
         );
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067634523, 8)] = this.readRoundedCornerUnicode(var1);
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713570402, 14)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("dXJlvS7aeVCCa8QnKVUNms8BwJCvNjscfHsYopJe");
         return this.firstNonBlank(var10001);
      }
   }

   public String readRoundedCornerUnicodeBottomLeft(ConfigurationSection var1) {
      if (((1803246654 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1744067115, 5)];
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1414382353, 17)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uu1a3Y38+JFN20MbfjfMvyIHt9w4wsTDrSNbgcIoCMI=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(823477500, 5)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/9osDkdjMYva9azhsCOaJ3BNz1Jg1nawyD8vBNj52novzUl3b/HM9QSgYqTLYmz1mLY=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310517, 7)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("c7C0pKQASQs72lLPoUQgaYNlUI0d6O5SkaFcmhAX7IOrnZ9D+vu9draZ01VoTHVL")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1693823292, 28)] = this.readRoundedCornerUnicodeByKey(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("kxwBro9xwKQbp3vv37ySVQRKte8WOL/v+FWHYIMVkI8WeFizYBOk8MnCkkXyuoYmSrk=")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387900, 4)] = this.readRoundedCornerUnicodeByMode(
            var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uu1a3Y38+JFN20MbfjfMvyIHt9w4wsTDrSNbgcIoCMI=")
         );
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-255568623, 31)] = this.readRoundedCornerUnicode(var1);
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1747820497, 23)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("W5d81aKUDgkrD4lo7j0+iDsF4bSBNehbWBVvoTxN");
         return this.firstNonBlank(var10001);
      }
   }

   public String readRoundedCornerUnicodeByMode(ConfigurationSection var1, String var2) {
      if ((4292950 * (4292950 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = this.normalizeRoundedMode(
            var1.getString(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vP2hnFlEmYF8sY3MwvNsoj2MnVWWXOgWVBQBpMpm5zk4ML+HQ6EUYQfrz6w="))
         );
         if (!var3.isBlank() && !Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("9Gf84ERDYFG61z9vTk3Wq05nQQnXyZacLkYOaPsyQvP0UE5x").equals(var3)) {
            String var5 = var2.trim().toLowerCase(Locale.ROOT);
            int var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-326157398, 23);
            switch (var5.hashCode()) {
               case -1699597560:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Gh3TzDMJsMRADwZufmBCM20Ollvapyudvbzo50p//Mp3nbCeHNHiWeU0zWPVe3Y/XoNOhg=="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-255568617, 31);
                  }
                  break;
               case -1681838926:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5RK/S33YmUrh0L9N8AnhY5H/GG4eyc7FW+myjhcO3q7GGBgbaPcvDUGnOeEWvyRt"))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182257397, 12);
                  }
                  break;
               case -1314880604:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wL2clpLFZ8QVvekCLHTj3fogbuKfuDBECGVUIXeqTitSEo9EGwL0nFdkiYiy9g=="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387808, 2);
                  }
                  break;
               case -1139167524:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("OT0ZFrCmlKCAwA23+iHvTnoWVfpVpPnQSqfYhpWvQ49vk1XReC5jrq9z"))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2044548973, 2);
                  }
                  break;
               case -1012429441:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Y/ggJhLgTU/PMyiE+9M+2DB+xMDze2TVaMx9KE6zLRBmvNOiGYZoVbWI1eM="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1693823292, 28);
                  }
                  break;
               case -966253391:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("n9FoaJcPNU8NvuEsqFs1yquBbGBVVjBp2BKWnuMq3tSYKSU0/iyrU+594J0="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 31);
                  }
                  break;
               case -948793881:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("aC9Ehw/kikiwEnzJ38zZtraOcUOwlovi6OTNF9R3mD9xKEik8CL8H/+ohPA="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1422242108, 19);
                  }
                  break;
               case -655373719:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("kxwBro9xwKQbp3vv37ySVQRKte8WOL/v+FWHYIMVkI8WeFizYBOk8MnCkkXyuoYmSrk="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310642, 31);
                  }
                  break;
               case -609197669:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/9osDkdjMYva9azhsCOaJ3BNz1Jg1nawyD8vBNj52novzUl3b/HM9QSgYqTLYmz1mLY="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425388012, 4);
                  }
                  break;
               case -591738159:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Qtn2CtvcNp8ut0fsS7Pf+Awe4yI+3n1eza8/2stgS1+tqEtVPSkhWRuFlGmmg4N1nw8="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310631, 1);
                  }
                  break;
               case 3146:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uu1a3Y38+JFN20MbfjfMvyIHt9w4wsTDrSNbgcIoCMI="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1414906641, 17);
                  }
                  break;
               case 3152:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2peE2iJiezyrmbTrU3lp1NTtwQCi0dCa4WiGbjiWZCQ="))) {
                     var6 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1172058389, 21);
                  }
                  break;
               case 3704:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo="))) {
                     var6 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(1530897098, 0);
                  }
                  break;
               case 3710:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B1VTMX+MOaYyjLJQE5RlRayIElpC4j6ODV5EuJQjU24="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425383740, 10);
                  }
                  break;
               case 116576946:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vGLsbUyfZAohR37bIdLW2Yn7hmh9BM3HfSyE7+OkCY/eRsABzRjakMwxlG0Xbg=="))) {
                     var6 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1233173090, 1);
                  }
                  break;
               case 1163912186:
                  if (var5.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("tQNeN95963gMr479oiKOb2jb8aSjSmrHwC7fZ9NN7SQrhMvWSq1dcU6YsP6neqxwQXm+Lw=="))) {
                     var6 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1420669244, 19);
                  }
            }
            int var4 = switch (var6) {
               case 0, 1, 2, 3 -> Xqedii_ntttel8.Xqedii_2d77kqauxzceu(411738734, 4);
               case 4, 5, 6, 7 -> Xqedii_ntttel8.Xqedii_b04l01r82a2w(1530897099, 0);
               case 8, 9, 10, 11 -> Xqedii_ntttel8.Xqedii_b04l01r82a2w(1744066955, 5);
               case 12, 13, 14, 15 -> Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1563600065, 16);
               default -> Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1833533627, 25);
            };
            if (var4 < 0) {
               return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
            } else {
               int var7 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1425387837, 24);
               switch (var3.hashCode()) {
                  case -1078030475:
                     if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("az7Ruv2jO8m/xxH0kw5GEuDbhXOTqVF44Voph3S9o4CO/nu/cdJT8Q=="))) {
                        var7 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 20);
                     }
                     break;
                  case 102742843:
                     if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("PLA+zssnFMjEGIW7dsLJTau0hodTf+0HA84MOalfg6mpWolKfyw="))) {
                        var7 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1992793558, 22);
                     }
                     break;
                  case 109548807:
                     if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("eIKzSHjlAXECOUkp5eixRTtc8AFTyGIudlK9F9EZGdHyUGOmYPM="))) {
                        var7 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1514931668, 28);
                     }
               }
               String[] var8 = switch (var7) {
                  case 0 -> Xqedii_29qvign;
                  case 1 -> Xqedii_1a0mzl3;
                  case 2 -> Xqedii_pgm4udd;
                  default -> Xqedii_2fplvqv;
               };
               String var10;
               if (var4 < var8.length) {
                  String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 1)];
                  var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1569843062, 20)] = var8[var4];
                  var10 = this.firstNonBlank(var10001);
               } else {
                  var10 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
               }

               return var10;
            }
         } else {
            return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
         }
      } else {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      }
   }

   public String normalizeRoundedMode(String var1) {
      if ((-1736318099 ^ -1736318099) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713685090, 14)];
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(713668706, 14)] = var1;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (var2.isBlank()) {
            return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
         } else {
            int var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182048502, 18);
            switch (var2.hashCode()) {
               case -1078030475:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("az7Ruv2jO8m/xxH0kw5GEuDbhXOTqVF44Voph3S9o4CO/nu/cdJT8Q=="))) {
                     var4 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-441189844, 28);
                  }
                  break;
               case -1039745817:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/tZRCPrhLqrjBvO0cR8yczYC7ivSVfVXEf/EchFuoTpOLu+oLTAzsg=="))) {
                     var4 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1699315899, 25);
                  }
                  break;
               case 48:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QhpuBfopNYTMem8o5k6NAAUHEc4YBcH1JxSx40jG"))) {
                     var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182312949, 8);
                  }
                  break;
               case 109935:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("XEthSSqKY/NGNFNoJWAkHt6IIe00VFkE1+8v9fiECCsvmw=="))) {
                     var4 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1965425386, 27);
                  }
                  break;
               case 3387192:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("9Gf84ERDYFG61z9vTk3Wq05nQQnXyZacLkYOaPsyQvP0UE5x"))) {
                     var4 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1419096380, 20);
                  }
                  break;
               case 97196323:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Jqwt2bFovMtcFehZfnRTyWYFA5TnEXi9lm2GiYN2o+3FoehJ+Jc="))) {
                     var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(181262069, 17);
                  }
                  break;
               case 102742843:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("PLA+zssnFMjEGIW7dsLJTau0hodTf+0HA84MOalfg6mpWolKfyw="))) {
                     var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182245109, 14);
                  }
                  break;
               case 109548807:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("eIKzSHjlAXECOUkp5eixRTtc8AFTyGIudlK9F9EZGdHyUGOmYPM="))) {
                     var4 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 9);
                  }
                  break;
               case 270940796:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("gkS4lj0v3UB9ymkzg5Bzz4/lBChx95kgYKOnR1tVGdsC/6trBLQj5hWtjzY="))) {
                     var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310651, 1);
                  }
                  break;
               case 1086463900:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("LhUvcSc0lCmw0Bc6Noj6fBIjQUM792rRo1Z/j8ncg+cKUr7evtVmix84"))) {
                     var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 12);
                  }
                  break;
               case 1544803905:
                  if (var2.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ZFTGOicXApkcVNHkLD7qwzUwVRSAqx7Mq5ZbtgfSJMfLj6oF3IYkKh7Q"))) {
                     var4 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(1167636095, 17);
                  }
            }
            return switch (var4) {
               case 0 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("eIKzSHjlAXECOUkp5eixRTtc8AFTyGIudlK9F9EZGdHyUGOmYPM=");
               case 1, 2, 3 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("LhUvcSc0lCmw0Bc6Noj6fBIjQUM792rRo1Z/j8ncg+cKUr7evtVmix84");
               case 4 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("az7Ruv2jO8m/xxH0kw5GEuDbhXOTqVF44Voph3S9o4CO/nu/cdJT8Q==");
               case 5 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("PLA+zssnFMjEGIW7dsLJTau0hodTf+0HA84MOalfg6mpWolKfyw=");
               case 6, 7, 8, 9, 10 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("9Gf84ERDYFG61z9vTk3Wq05nQQnXyZacLkYOaPsyQvP0UE5x");
               default -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
            };
         }
      }
   }

   public String readRoundedCornerUnicodeByKey(ConfigurationSection var1, String var2) {
      if ((127193941 * 127193941 + 127193941 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1464105438, 18)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(765448549, 31)] = var1.getString(Xqedii_2xfidcg0u094d(var2));
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1294544920, 22)] = var1.getString(Xqedii_1wn2yn7ixfuf2(var2));
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425355068, 14)] = var1.getString(Xqedii_18a7rkuts3onz(var2));
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182318837, 12)] = var1.getString(Xqedii_3p6ycy3uh5c8w(var2));
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425322300, 14)] = var1.getString(Xqedii_18pttisj8m17y(var2));
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1632207035, 25)] = var1.getString(Xqedii_2qipcmxxlaqrp(var2));
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833130, 6)] = var1.getString(Xqedii_2ywu2tygvrr4z(var2));
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425363260, 13)] = var1.getString(Xqedii_263woxhb55k0u(var2));
         return this.firstNonBlank(var10001);
      } else {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      }
   }

   public boolean isRoundedType(String var1) {
      if ((1835938042 * (1835938042 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 7)];
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 9)] = var1;
         String var2 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         return (!Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("uSAqMozK4+PkNydzLCAeblq6H4IzssQ1q+kR9wFi6f2pAGabWRLfSnCrFUnh3k5BLogNc1cn").equals(var2)
               && !Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("OG4i70pafRC7LeKyhMGTBl91yy78+sS6ZaJly4jdGkSUi54glOUUExn3").equals(var2)
            ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 24)
            : Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 0)) != 0;
      }
   }

   public boolean isDirectionalRoundedType(String var1) {
      if ((134310391 * (134310391 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1294544920, 22)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-48868647, 11)] = var1;
         String var2 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("OG4i70pafRC7LeKyhMGTBl91yy78+sS6ZaJly4jdGkSUi54glOUUExn3").equals(var2);
      }
   }

   public double readRoundedTopRightOffsetX(ConfigurationSection var1) {
      if (((1106054423 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetX(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B1VTMX+MOaYyjLJQE5RlRayIElpC4j6ODV5EuJQjU24="));
      }
   }

   public double readRoundedTopRightOffsetY(ConfigurationSection var1) {
      if ((-1959432772 * (-1959432772 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetY(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B1VTMX+MOaYyjLJQE5RlRayIElpC4j6ODV5EuJQjU24="));
      }
   }

   public double readRoundedTopLeftOffsetX(ConfigurationSection var1) {
      if ((-1667988718 * -1667988718 + -1667988718 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetX(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo="));
      }
   }

   public double readRoundedTopLeftOffsetY(ConfigurationSection var1) {
      if (((1930221160 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetY(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo="));
      }
   }

   public double readRoundedBottomRightOffsetX(ConfigurationSection var1) {
      if ((1070056982 * 1070056982 - 1070056982 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetX(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2peE2iJiezyrmbTrU3lp1NTtwQCi0dCa4WiGbjiWZCQ="));
      }
   }

   public double readRoundedBottomRightOffsetY(ConfigurationSection var1) {
      if ((-430453078 ^ -430453078) != 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetY(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2peE2iJiezyrmbTrU3lp1NTtwQCi0dCa4WiGbjiWZCQ="));
      }
   }

   public double readRoundedBottomLeftOffsetX(ConfigurationSection var1) {
      if (((480286043 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetX(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uu1a3Y38+JFN20MbfjfMvyIHt9w4wsTDrSNbgcIoCMI="));
      }
   }

   public double readRoundedBottomLeftOffsetY(ConfigurationSection var1) {
      if (((-626561837 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.readRoundedCornerOffsetY(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uu1a3Y38+JFN20MbfjfMvyIHt9w4wsTDrSNbgcIoCMI="));
      }
   }

   public double readRoundedCornerOffsetX(ConfigurationSection var1, String var2) {
      if ((1273320633 * 1273320633 - 1273320633 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_3qlw24zzq0fs5(-5821336170854052666L, 54))
            : this.firstPresentDouble(
               var1,
               Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(-8640318790750469372L, 42)),
               this.roundedCornerOffsetPathCandidates(var2, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("y7VEJdJZF61A1apJ+7NrCtplQWlCEbdKDeRlpZzi"))
            );
      }
   }

   public double readRoundedCornerOffsetY(ConfigurationSection var1, String var2) {
      if ((1140600684 * 1140600684 + 1140600684 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(6510338951047199668L, 23))
            : this.firstPresentDouble(
               var1,
               Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(-8640318790750469372L, 42)),
               this.roundedCornerOffsetPathCandidates(var2, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ERe9i/vv5irwhB1yqJB3taS+DzJHFFi9OZFUvJeQ"))
            );
      }
   }

   public String[] roundedCornerOffsetPathCandidates(String var1, String var2) {
      if ((1263137575 * 1263137575 + 1263137575 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 10)];
         var10001[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1155281173, 21)] = var1;
         String var3 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1465940446, 18)];
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 17)] = var2;
         String var4 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         int var7 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-178116342, 22);
         switch (var3.hashCode()) {
            case 3146:
               if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uu1a3Y38+JFN20MbfjfMvyIHt9w4wsTDrSNbgcIoCMI="))) {
                  var7 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-255568622, 31);
               }
               break;
            case 3152:
               if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("2peE2iJiezyrmbTrU3lp1NTtwQCi0dCa4WiGbjiWZCQ="))) {
                  var7 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310644, 0);
               }
               break;
            case 3704:
               if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("QdNbp1vVaZPs5fdTxmOmJKMr6j3yJMPsZhvO6+5GPPo="))) {
                  var7 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 12);
               }
               break;
            case 3710:
               if (var3.equals(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B1VTMX+MOaYyjLJQE5RlRayIElpC4j6ODV5EuJQjU24="))) {
                  var7 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1246496212, 28);
               }
         }
         String var5 = switch (var7) {
            case 0 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("zUI8pjAd89fVzAPzSKveaB/vCOoSSEmAd285c9dYC5yGR3TbEPfcb9cD");
            case 1 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("7ZShME7iYXhIyBMB1pKYinnAUd2co+4R1fGzvXY+ZaWIUSSganE1T4xdLzA=");
            case 2 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("MoD6LMXuPw/nSxZF37905DNapGEUoRyPFRhYDNrEml6YxyNvqa7LIyKx0nIdY1Uvw1E=");
            case 3 -> Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("c7C0pKQASQs72lLPoUQgaYNlUI0d6O5SkaFcmhAX7IOrnZ9D+vu9draZ01VoTHVL");
            default -> var3;
         };
         String var6 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("y7VEJdJZF61A1apJ+7NrCtplQWlCEbdKDeRlpZzi").equals(var4)
            ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("F0svfzWy8E/V0TogZSP+6lPGOugQ7X/kexwWKuBwQKO7mVDNqLbFm4TX")
            : Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4PjpqslRIf5YkgUlVjsMabHoHP38CUyjBndD7Ug37DWlk1F5DfkoqfOe");
         String[] var8 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310565, 4)];
         var8[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 18)] = Xqedii_3oszr7lmu9k5i(var3, var4);
         var8[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 31)] = Xqedii_3cue72e3g4hv9(var3, var4);
         var8[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1167636095, 17)] = Xqedii_x692zzas9y4n(var5, var4);
         var8[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-255568622, 31)] = Xqedii_3q88gxo9e6011(var3, var6);
         var8[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1156952380, 26)] = Xqedii_3a2lctinq03yf(var3, var4);
         var8[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1277767704, 22)] = Xqedii_3ae32l1ftd7ye(var5, var4);
         return var8;
      }
   }

   public double firstPresentDouble(ConfigurationSection var1, double var2, String... var4) {
      if (((-137266576 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var4 != null && var4.length != 0) {
         String[] var5 = var4;
         int var6 = var4.length;

         for (int var7 = Xqedii_ntttel8.Xqedii_b04l01r82a2w(749057018, 20); var7 < var6; var7++) {
            String var8 = var5[var7];
            if (var8 != null && !var8.isBlank() && var1.contains(var8)) {
               return this.parseDouble(var1.get(var8), var2);
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public String reconstructFlowMappingPlaceholder(Object var1) {
      if ((-173960005 * (-173960005 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Map var2 && !var2.isEmpty()) {
         StringBuilder var3 = new StringBuilder();

         for (Map.Entry<?, ?> var5 : ((Map<?, ?>) var2).entrySet()) {
            if (var5.getValue() != null || var5.getKey() == null) {
               return null;
            }

            if (var3.length() > 0) {
               var3.append(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("h1M5irTXlAYsDJxGbfyvrUFGMvyGf44oaFzQcnZot4E="));
            }

            var3.append(var5.getKey());
         }

         return Xqedii_2rjuazcvknm3d(String.valueOf(var3));
      } else {
         return null;
      }
   }

   public Map<String, Object> deepCopyMap(Map<String, Object> var1) {
      if (((-1050294838 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (Map.Entry<?, ?> var4 : ((Map<?, ?>) var1).entrySet()) {
            var2.put((String)var4.getKey(), this.deepCopyValue(var4.getValue()));
         }

         return var2;
      }
   }

   public Object deepCopyValue(Object var1) {
      if ((-258135351 * -258135351 + -258135351 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.reconstructFlowMappingPlaceholder(var1);
         if (var2 != null) {
            return var2;
         } else if (var1 instanceof Map var7) {
            LinkedHashMap var8 = new LinkedHashMap();

            for (Map.Entry<?, ?> var10 : ((Map<?, ?>) var7).entrySet()) {
               if (var10.getKey() != null) {
                  var8.put(var10.getKey().toString(), this.deepCopyValue(var10.getValue()));
               }
            }

            return this.deepCopyMap(var8);
         } else if (!(var1 instanceof List var3)) {
            return var1;
         } else {
            ArrayList var4 = new ArrayList();

            for (Object var6 : var3) {
               var4.add(this.deepCopyValue(var6));
            }

            return var4;
         }
      }
   }

   public YamlConfiguration cloneYamlConfiguration(YamlConfiguration var1) {
      if ((-1740207344 * -1740207344 + -1740207344 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         YamlConfiguration var2 = new YamlConfiguration();
         if (var1 == null) {
            return var2;
         } else {
            for (String var4 : var1.getKeys(Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1298739224, 22) != 0)) {
               var2.set(var4, this.deepCopyValue(var1.get(var4)));
            }

            return var2;
         }
      }
   }

   public double findMaxLayer(List<Map<String, Object>> var1) {
      if ((958201970 * 958201970 - 958201970 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         double var2 = Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444534204937198L, 43));

         for (Map var5 : var1) {
            var2 = Math.max(var2, this.Xqedii_aa6dsg7(var5));
         }

         return var2;
      } else {
         return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_3qlw24zzq0fs5(-3716890917231746616L, 42));
      }
   }

   public double Xqedii_aa6dsg7(Map<String, Object> var1) {
      if ((1855253541 ^ 1855253541) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         double var2 = Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444534204937198L, 45));
         Object var4 = this.Xqedii_8clt2d3(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("YyZhHRL3KZIPorvUmReLEfMq9m6h3x7/Hm/lhSxc2k/zCIEv"));
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(618760362, 24)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067633243, 8)] = var4 == null
            ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
            : var4.toString();
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1424339260, 20)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "e7IpjpUn0CTbUHEamEArNaiHUpKIPCpWBYsS99HTY1Ir/ZwURJU="
         );
         String var5 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         if (Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("e7IpjpUn0CTbUHEamEArNaiHUpKIPCpWBYsS99HTY1Ir/ZwURJU=").equals(var5)
            || Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("e8wBjFzBpdoQZiHcM5O/aIALbg9fal0X1rmbeo5Q/3QTQa8g").equals(var5)
            || this.isRoundedType(var5)
            || Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5Ln2UxLZm6naiFGN1XB4jYUzmWsufuqJYn9HtUtYIWibA76lPyioXg==").equals(var5)) {
            double var10002 = Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(-8640318790750469372L, 50));
            String[] var10003 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182277877, 14)];
            var10003[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1969066472, 12)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
               "DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="
            );
            var10003[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387900, 6)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
               "SnqogoDKIlXz20BPiQF2GSlEdCueSaZEmlq0fG7FHkLrXVIuH9Ywikxz5qtuWXQJ"
            );
            var10003[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1646954808, 6)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
               "4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="
            );
            double var6 = this.Xqedii_y08r4w0(var1, var10002, var10003);
            if (var6 > var2) {
               var2 = var6;
            }
         }

         Object var11 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("UvN8meckWS8qOvIV6utmsWovN/xYN4jy0cu66V/HPnqN8webvuiGEDTU2uw="));
         if (var11 instanceof List) {
            for (Object var9 : (List)var11) {
               Map var10 = this.toStringObjectMap(var9);
               if (var10 != null) {
                  var2 = Math.max(var2, this.Xqedii_aa6dsg7(var10));
               }
            }
         }

         return var2;
      } else {
         return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(2571253118542524952L, 61));
      }
   }

   public Object Xqedii_8clt2d3(Map<String, Object> var1, String var2) {
      if ((-240875866 * -240875866 - -240875866 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Object var3 = var1;
         String[] var4 = var2.split(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("EMerxqzEoMXlsHBWayPbOp3n3s+GAP2sAggkdeV8t2U="));
         String[] var5 = var4;
         int var6 = var4.length;

         for (int var7 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 14); var7 < var6; var7++) {
            String var8 = var5[var7];
            if (!(var3 instanceof Map var9)) {
               return null;
            }

            var3 = var9.get(var8);
            if (var3 == null) {
               return null;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   public double Xqedii_y08r4w0(Map<String, Object> var1, double var2, String... var4) {
      if ((-698775368 ^ -698775368) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var4 != null && var4.length != 0) {
         String[] var5 = var4;
         int var6 = var4.length;

         for (int var7 = Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 22); var7 < var6; var7++) {
            String var8 = var5[var7];
            Object var9 = this.Xqedii_8clt2d3(var1, var8);
            if (var9 != null) {
               double var10 = this.parseDouble(var9, Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(2495983781901513582L, 8)));
               if (Double.isFinite(var10)) {
                  return var10;
               }
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public boolean equalsNullable(String var1, String var2) {
      if (((640454304 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null && var2 == null) {
         return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 26) != 0;
      } else {
         return (var1 != null && var2 != null ? var1.equals(var2) : (Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1799979195, 25) != 0));
      }
   }

   public void saveBlocksPreservingYamlComments(File var1, List<Map<String, Object>> var2) throws IOException {
      if ((-2014000272 ^ -2014000272) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = Files.readString(var1.toPath(), StandardCharsets.UTF_8);
         List var4 = var2 == null ? Collections.emptyList() : var2;
         YamlConfiguration var5 = new YamlConfiguration();
         var5.set(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("f0RYROoTCwYbQYdNmZXFkqO9kNKOYmy2djEZA9OxXvufmMjkwCT7Xw=="), var4);
         String var6 = var5.saveToString();
         String var7 = var3.replace(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("TN7kYB2ioA1CSd8ljhJ/ofsbFvR6l4F3XJwomLZDXm8="),
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto")
         );
         String var8 = var6.replace(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("TN7kYB2ioA1CSd8ljhJ/ofsbFvR6l4F3XJwomLZDXm8="),
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto")
         );
         int var9 = this.findTopLevelKeyStart(var7, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ByV9c1yj62XHZHsxh20b1H4VRMP12/Yd3rOeG4LpjMyXVDLGV6neb22+"));
         String var10 = this.extractBlocksSection(var8);
         if (var10 != null && !var10.isBlank()) {
            String var11;
            if (var9 < 0) {
               String var12 = var7;
               if (!var7.endsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto")) && !var7.isEmpty()) {
                  var12 = Xqedii_29j6cpgz7ex73(var7);
               }

               var11 = Xqedii_pmsiigrr365k(var12, var10);
            } else {
               int var16 = this.findNextTopLevelKeyStart(
                  var7, var9 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ByV9c1yj62XHZHsxh20b1H4VRMP12/Yd3rOeG4LpjMyXVDLGV6neb22+").length()
               );
               if (var16 < 0) {
                  var16 = var7.length();
               }

               String var13 = var7.substring(Xqedii_ntttel8.Xqedii_b04l01r82a2w(1498114036, 21), var9);
               String var14 = var7.substring(var16);
               if (!var13.isEmpty() && !var13.endsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto"))) {
                  var13 = Xqedii_h15nfh2c943o(var13);
               }

               if (!var14.isEmpty() && !var14.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto"))) {
                  var14 = Xqedii_22ccv47qpvavj(var14);
               }

               var11 = Xqedii_2uu83uv5yeuxj(var13, var10, var14);
            }

            if (!var4.isEmpty()) {
               YamlConfiguration var17 = new YamlConfiguration();

               try {
                  var17.loadFromString(var11);
               } catch (InvalidConfigurationException var15) {
                  this.writeBlocksWithFullYamlFallback(var1, var3, var4);
                  return;
               }

               List var18 = var17.getList(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("f0RYROoTCwYbQYdNmZXFkqO9kNKOYmy2djEZA9OxXvufmMjkwCT7Xw=="));
               if (var18 == null || var18.isEmpty()) {
                  this.writeBlocksWithFullYamlFallback(var1, var3, var4);
                  return;
               }
            }

            Files.writeString(
               var1.toPath(),
               var11.replace(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto"), System.lineSeparator()),
               StandardCharsets.UTF_8
            );
            this.invalidateYamlFileCache(var1);
         } else {
            this.writeBlocksWithFullYamlFallback(var1, var3, var4);
         }
      }
   }

   public void writeBlocksWithFullYamlFallback(File var1, String var2, List<Map<String, Object>> var3) throws IOException {
      if ((-1100835077 * (-1100835077 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         YamlConfiguration var4 = new YamlConfiguration();
         if (var2 != null && !var2.isBlank()) {
            try {
               var4.loadFromString(var2);
            } catch (InvalidConfigurationException var6) {
            }
         }

         var4.set(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("f0RYROoTCwYbQYdNmZXFkqO9kNKOYmy2djEZA9OxXvufmMjkwCT7Xw=="), var3 == null ? Collections.emptyList() : var3);
         String var5 = var4.saveToString();
         Files.writeString(
            var1.toPath(),
            var5.replace(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto"), System.lineSeparator()),
            StandardCharsets.UTF_8
         );
         this.invalidateYamlFileCache(var1);
      }
   }

   public int findTopLevelKeyStart(String var1, String var2) {
      if ((689221821 * 689221821 + 689221821 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var3 = var1.split(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto"), Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067632987, 8)
         );
         int var4 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(356834353, 13);
         String[] var5 = var3;
         int var6 = var3.length;

         for (int var7 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 10); var7 < var6; var7++) {
            String var8 = var5[var7];
            String var9 = var8.trim();
            if (!var8.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("JWGxta+a0tZEMm2aqmbXddnUzYV5vzMpsz3QWT/2"))
               && !var8.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("abuxezyGUAE1AHocDPKas7GuhD1rC6t/VfcapQC/"))
               && var9.startsWith(var2)) {
               return var4;
            }

            var4 += var8.length() + Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1969062376, 12);
         }

         return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(-1425387837, 18);
      }
   }

   public int findNextTopLevelKeyStart(String var1, int var2) {
      if ((860582668 * (860582668 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = Math.max(Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 25), var2);
         if (var3 > var1.length()) {
            return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1613667155, 7);
         } else {
            int var4 = var1.lastIndexOf(Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425390396, 8), var3);
            var4 = var4 < 0 ? Xqedii_ntttel8.Xqedii_b04l01r82a2w(695008907, 26) : var4 + Xqedii_ntttel8.Xqedii_b04l01r82a2w(-637725094, 3);
            if (var4 <= var3) {
               int var5 = var1.indexOf(Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(201185013, 21), var4);
               if (var5 < 0) {
                  return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-178116342, 22);
               }

               var4 = var5 + Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 1);
            }

            while (var4 < var1.length()) {
               int var9 = var1.indexOf(Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-2002113311, 8), var4);
               if (var9 < 0) {
                  var9 = var1.length();
               }

               String var6 = var1.substring(var4, var9);
               String var7 = var6.trim();
               if (!var7.isEmpty()
                  && !var7.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("pK/J6jNFqM1Rq7Vjnn5HKr4abe9TG7ugom+3l/VY"))
                  && !var6.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("JWGxta+a0tZEMm2aqmbXddnUzYV5vzMpsz3QWT/2"))
                  && !var6.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("abuxezyGUAE1AHocDPKas7GuhD1rC6t/VfcapQC/"))
                  && var6.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("G/7z5NiB0Grj+AdajREHhiC3LPJIKYohZJoFWfqI"))) {
                  return var4;
               }

               var4 = var9 + Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067633499, 8);
            }

            return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-637725110, 3);
         }
      }
   }

   public String extractBlocksSection(String var1) {
      if ((502702139 * (502702139 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = this.findTopLevelKeyStart(var1, Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ByV9c1yj62XHZHsxh20b1H4VRMP12/Yd3rOeG4LpjMyXVDLGV6neb22+"));
         if (var2 < 0) {
            return null;
         } else {
            int var3 = this.findNextTopLevelKeyStart(
               var1, var2 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("ByV9c1yj62XHZHsxh20b1H4VRMP12/Yd3rOeG4LpjMyXVDLGV6neb22+").length()
            );
            if (var3 < 0) {
               var3 = var1.length();
            }

            String var4 = var1.substring(var2, var3).trim();
            return Xqedii_2nymrl32daxtx(var4);
         }
      }
   }

   public double readDouble(YamlConfiguration var1, String var2, String var3, double var4) {
      if (((-136398156 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1.contains(var2)) {
         return this.parseDouble(var1.get(var2), var4);
      } else {
         return var1.contains(var3) ? this.parseDouble(var1.get(var3), var4) : var4;
      }
   }

   public double snap1(double var1) {
      if ((-1142256972 * -1142256972 + -1142256972 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Math.round(var1);
      }
   }

   public int readOpacity(ConfigurationSection var1, int var2) {
      if (((1827961479 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var3 = (int)Math.round(
            this.readDouble(
               var1,
               Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("BihZfB+9PnM6N1qUR2vNh0hZ/QSUas3eXk36V8vU+hnuii2DnhczHbHy"),
               Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("BihZfB+9PnM6N1qUR2vNh0hZ/QSUas3eXk36V8vU+hnuii2DnhczHbHy"),
               (double)var2
            )
         );
         return Math.max(Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1847102114, 28), Math.min(Xqedii_ntttel8.Xqedii_2d77kqauxzceu(358300721, 13), var3));
      }
   }

   public double readOutlineSize(ConfigurationSection var1) {
      if ((-1205640619 * -1205640619 - -1205640619 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444534204937198L, 31));
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444534204937198L, 52));
         String[] var10003 = new String[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1969091048, 12)];
         var10003[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 27)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "i6hawNLw5oBGwlHz2/K+a7HmEYT3zskEDiGR8tv03zGBQxAz59qxa6Vsy3Zix6PuF2MJIg=="
         );
         var10003[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1358278972, 26)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "XMax0yc3JbEjqPthhNDpwlUJ4l+hpWKVPm1K+EQx53KhKP5LMZYj6jSiBjK8GCQENbRQ2myz"
         );
         var10003[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1361513541, 19)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "En6ayXRUzsOoiwatrD62qeRNB0Nf7Mul42qCHG+BFqB38ibOMob2cXJo3htq5gwf2OpAEpZSDUdq4ttjvEo="
         );
         var10003[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1419096380, 21)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "cF7R1ZgRXEK0PdNsNM0rJN3jprxVupSGbmIH33i6wlH3xniCHVeBtLmVMY7zLlWgWV5U0qNXSxc="
         );
         var10003[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(190699253, 23)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "3sc2/jIohcTpiQL2lQ4UOfm3ohUY4vKvok1dM15dFdA5vgmxarwdlLCjpqnSiPysmiU="
         );
         var10003[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1162944268, 11)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "1pQbPaLniapIYn4Mh7AwZS4fst/i1dfTDCyjs4Yks1iqGPEB4sWKqkNQ4C5tiVv6etQn5Q=="
         );
         double var2 = this.firstPresentDouble(var1, var10002, var10003);
         return !Double.isFinite(var2)
            ? Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(-8640318790750469372L, 46))
            : Math.max(Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(-5567134405262612300L, 32)), var2);
      }
   }

   public String readOutlineColor(ConfigurationSection var1) {
      if ((-1725502049 ^ -1725502049) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vEILukA2P1NJbUVHurHQfGox5+YR+e4pt6J3r1SdnhBTYHT/MU50Mw==");
      } else {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425256764, 17)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1960219394, 18)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("etXGurHoGnlbIcQvpxsm+EyW91l7uo3UyXqrnuXOi2QfqY9y8O9oLZB8jDDmHj5mUvCBdZdq")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1559605564, 27)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("9+mx/OQnPEq36rqvlwo1R+ybeaRp11iWvNSJLx68Ua7IyEwKdmnvc1+LhmmXFuTDoWA=")
         );
         var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1442165052, 23)] = var1.getString(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("jEGASkTK5EASDF/BPRhnj1klebdP3LxKO2hUldMvsTpET4FTdkXVlFPN2ISr6BIsneCjoIkKCN13Ag38HSjwgMOe")
         );
         String var2 = this.firstNonBlank(var10001);
         String var3 = this.normalizeHexColor(var2);
         return var3.isBlank() ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("vEILukA2P1NJbUVHurHQfGox5+YR+e4pt6J3r1SdnhBTYHT/MU50Mw==") : var3;
      }
   }

   public double readOutlineLayer(ConfigurationSection var1) {
      if (((-1465092029 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(7312475265502728553L, 33));
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(-8113036048930389662L, 8));
         String[] var10003 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310629, 4)];
         var10003[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 11)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "ziiKkTi510aWtXxhAzmHw9QgxLLkfX3Foc0L0mIiaCIiOi16nrMrX+pLUQ9pFuleoqmEXW26"
         );
         var10003[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 1)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "TEydkjtKDvyy5JzBSSlkEV1yVatzUKsXXX8uhwqP4ZzwKSTxBLdntJIORgy7Ig=="
         );
         return this.firstPresentDouble(var1, var10002, var10003);
      }
   }

   public double readRoundedRadius(ConfigurationSection var1, double var2, double var4) {
      if ((-1068980337 * -1068980337 - -1068980337 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(-7290930437157715270L, 9));
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(7500582273745388283L, 10));
         String[] var10003 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425355068, 13)];
         var10003[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1275450203, 4)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "NWhggfnomv9QTOJvvEl1Cos1zIUIkoz1/Oq2+aq/iOs9fpmRWS1oOw=="
         );
         var10003[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1067633499, 8)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "zsHl1L5IpQUy1hQtrOGdaXIw6j6Rxkjnb9v6Dq/frl/NLFiEJ8I7k9BsI1EQG8U8xQRwEgab3YkEVg=="
         );
         var10003[Xqedii_ntttel8.Xqedii_b04l01r82a2w(751154170, 20)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "c1zHuXVer28JZqRDECJgZEPVmeXWUtyilieWZfyhO1TPB1GPYs4VkTSI7hB00ERAAuCilw=="
         );
         var10003[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-97725005, 12)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "mVwA7G4irL8v9z84iW09rQKJxwndzJTJYVt/hZzLoOH92dU9ITsdcFIAP/OZEY7jPaOkYhea"
         );
         double var6 = this.firstPresentDouble(var1, var10002, var10003);
         return Double.isFinite(var6) && var6 >= Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_3qlw24zzq0fs5(2057237585636726890L, 30))
            ? var6
            : Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_3qlw24zzq0fs5(1911535263084028166L, 20));
      }
   }

   public double readDouble(ConfigurationSection var1, String var2, String var3, double var4) {
      if ((2056933984 * 2056933984 - 2056933984 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.contains(var2)) {
         return this.parseDouble(var1.get(var2), var4);
      } else {
         return var1.contains(var3) ? this.parseDouble(var1.get(var3), var4) : var4;
      }
   }

   public List<Map<String, Object>> readChildRawNodes(Map<String, Object> var1) {
      if ((33152013 * 33152013 - 33152013 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("UvN8meckWS8qOvIV6utmsWovN/xYN4jy0cu66V/HPnqN8webvuiGEDTU2uw=")) instanceof List var3
            && !var3.isEmpty()) {
            ArrayList var4 = new ArrayList();

            for (Object var6 : var3) {
               Map var7 = this.toStringObjectMap(var6);
               if (var7 != null && !var7.isEmpty()) {
                  var4.add(var7);
               }
            }

            return var4;
         } else {
            return Collections.emptyList();
         }
      } else {
         return Collections.emptyList();
      }
   }

   public boolean isImageGroupRootNode(Map<String, Object> var1, List<Map<String, Object>> var2) {
      if ((-1809974651 * -1809974651 - -1809974651 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isEmpty()) {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425518908, 16)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(374528509, 19)] = var1.get(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wv+Ok50mCh2Iow9ufg/kpxckpgyFottIcNEUIL1PNsI=")
               )
               == null
            ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
            : var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wv+Ok50mCh2Iow9ufg/kpxckpgyFottIcNEUIL1PNsI=")).toString();
         var10001[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 11)] = this.readNestedId(var1);
         String var3 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         if (!var3.isBlank() && var3.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("aoaEw6pXfYhSmA8Z7w6GexgQnnTQLtfGyfNQvcVwV0Yhx/Ad"))) {
            return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 26) != 0;
         } else {
            var10001 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-24433300, 10)];
            var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 3)] = var1.get(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("YyZhHRL3KZIPorvUmReLEfMq9m6h3x7/Hm/lhSxc2k/zCIEv")
                  )
                  == null
               ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
               : var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("YyZhHRL3KZIPorvUmReLEfMq9m6h3x7/Hm/lhSxc2k/zCIEv")).toString();
            String var4 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            if (Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5Ln2UxLZm6naiFGN1XB4jYUzmWsufuqJYn9HtUtYIWibA76lPyioXg==").equals(var4)) {
               return this.hasDirectUiImageGlyphChildNode(var2);
            } else {
               return (!Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("UIRjDSL46Xr4nE61zyYIUIyvV/N3rprdMe0cNskKJ+NN9nnylWU=").equals(var4)
                     || !var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("WFeh5QPswOoL73EDdl9qGSHzuoImGZcLrOyDFkTRSWl0P0M4w3IRVQWo8lBVHDJ0B+MyIA=="))
                        && !var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("H575nRgJQuOXbLUoKHlIMeHJMRlCgPlCuq1krC1V0/NnH7s1y77GQp01iMsQl0zfIQo="))
                        && !var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("UIRjDSL46Xr4nE61zyYIUIyvV/N3rprdMe0cNskKJ+NN9nnylWU="))
                  ? Xqedii_ntttel8.Xqedii_b04l01r82a2w(1167373951, 17)
                  : Xqedii_ntttel8.Xqedii_b04l01r82a2w(1801974873, 29)) != 0;
            }
         }
      } else {
         return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 25) != 0;
      }
   }

   public boolean hasDirectUiImageGlyphChildNode(List<Map<String, Object>> var1) {
      if ((-1715374492 * -1715374492 - -1715374492 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var3 : var1) {
            if (this.isUiImageGlyphNode(var3)) {
               return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-24433300, 10) != 0;
            }
         }

         return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 11) != 0;
      } else {
         return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 1) != 0;
      }
   }

   public boolean isUiImageGlyphNode(Map<String, Object> var1) {
      if ((-1716208343 * -1716208343 + -1716208343 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387580, 8)];
         var10001[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-637725102, 3)] = var1.get(
                  Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("e8wBjFzBpdoQZiHcM5O/aIALbg9fal0X1rmbeo5Q/3QTQa8g")
               )
               == null
            ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
            : var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("e8wBjFzBpdoQZiHcM5O/aIALbg9fal0X1rmbeo5Q/3QTQa8g")).toString();
         String var2 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         if (var2.isBlank()
            || !var2.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("I9B5ltFKX3fLiSlsUK6Do2Hpb7+OAaJolFZOly47hbjL/i4jLTox7eNaHDK4cJ+tMZpYx6k2XxwkKA=="))
               && !var2.contains(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("lnYItxoCorfW2Lo9pV2BdV1YZ5/RXIKWggQX6DAq6dIhuGcuc9Y="))) {
            var10001 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425388348, 8)];
            var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 13)] = var1.get(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wv+Ok50mCh2Iow9ufg/kpxckpgyFottIcNEUIL1PNsI=")
                  )
                  == null
               ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
               : var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wv+Ok50mCh2Iow9ufg/kpxckpgyFottIcNEUIL1PNsI=")).toString();
            var10001[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387838, 1)] = this.readNestedId(var1);
            String var3 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
            return (!var3.isBlank() && var3.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("aoaEw6pXfYhSmA8Z7w6GexgQnnTQLtfGyfNQvcVwV0Yhx/Ad"))
               ? Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 26)
               : Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 30)) != 0;
         } else {
            return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-24433300, 10) != 0;
         }
      } else {
         return Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1001057424, 7) != 0;
      }
   }

   public String readNestedId(Map<String, Object> var1) {
      if ((82808485 * (82808485 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         Object var2 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/OtmsyvF8H/zbQSnDvkVhnhmPxt297UxIpXEORtnXspVRhTnKbXqyg=="));
         Map var3 = this.toStringObjectMap(var2);
         if (var3 != null && !var3.isEmpty()) {
            Object var4 = var3.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("wv+Ok50mCh2Iow9ufg/kpxckpgyFottIcNEUIL1PNsI="));
            return var4 == null ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==") : var4.toString();
         } else {
            return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
         }
      } else {
         return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==");
      }
   }

   public double readRawNodeLayer(Map<String, Object> var1) {
      if (((1492512379 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.isEmpty()) {
         return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444536352945134L, 32));
      } else if (var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="))) {
         return this.parseDouble(
            var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI=")),
            Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(2414709086377043323L, 49))
         );
      } else {
         Object var2 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("KAqGBFMvHSm1doORWsH3OHjTp91/ZBOUzvkxXSQny+nUmToP"));
         Map var3 = this.toStringObjectMap(var2);
         if (var3 != null && var3.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="))) {
            return this.parseDouble(
               var3.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA=")),
               Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(7500582273745388283L, 10))
            );
         } else if (var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="))) {
            return this.parseDouble(
               var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA=")),
               Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_g28b6aytxs56(6319139805786347158L, 37))
            );
         } else {
            Object var4 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/OtmsyvF8H/zbQSnDvkVhnhmPxt297UxIpXEORtnXspVRhTnKbXqyg=="));
            Map var5 = this.toStringObjectMap(var4);
            if (var5 != null) {
               if (var5.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="))) {
                  return this.parseDouble(
                     var5.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI=")),
                     Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(2928329346129081294L, 6))
                  );
               }

               if (var5.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="))) {
                  return this.parseDouble(
                     var5.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA=")),
                     Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_1czyztif8jmqg(3072444534202839534L, 22))
                  );
               }
            }

            return Double.longBitsToDouble(Xqedii_ntttel8.Xqedii_vf5x7ee2i72b(-581127257570966780L, 0));
         }
      }
   }

   public void applyLayerRecursively(Map<String, Object> var1, double var2) {
      if ((1905730424 ^ 1905730424) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && Double.isFinite(var2)) {
         if (var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="))) {
            var1.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="), var2);
         } else {
            Object var4 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("KAqGBFMvHSm1doORWsH3OHjTp91/ZBOUzvkxXSQny+nUmToP"));
            Map var5 = this.toStringObjectMap(var4);
            if (var5 != null && var5.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="))) {
               var5.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="), var2);
               var1.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("KAqGBFMvHSm1doORWsH3OHjTp91/ZBOUzvkxXSQny+nUmToP"), var5);
            } else if (var1.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="))) {
               var1.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="), var2);
            } else {
               Object var6 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/OtmsyvF8H/zbQSnDvkVhnhmPxt297UxIpXEORtnXspVRhTnKbXqyg=="));
               Map var7 = this.toStringObjectMap(var6);
               if (var7 != null && var7.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="))) {
                  var7.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="), var2);
                  var1.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/OtmsyvF8H/zbQSnDvkVhnhmPxt297UxIpXEORtnXspVRhTnKbXqyg=="), var7);
               } else if (var7 != null && var7.containsKey(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="))) {
                  var7.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("4AF2jvs8DxLYiRwe8Jr4/zYfJvxuk6ABRukJg1hkHfUQHRNz4hA="), var2);
                  var1.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("/OtmsyvF8H/zbQSnDvkVhnhmPxt297UxIpXEORtnXspVRhTnKbXqyg=="), var7);
               } else {
                  var1.put(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("DguE7U7qLyC78I7ZFWE5Qu5H8fU0wWGObFchDTw25EJ/pRQl6QI="), var2);
               }
            }
         }

         for (Map var10 : this.readChildRawNodes(var1)) {
            this.applyLayerRecursively(var10, var2);
         }
      }
   }

   public void setNested(Map<String, Object> var1, String var2, String var3, double var4) {
      if ((967651362 * 967651362 - 967651362 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map<String, Object> var7;
         if (var1.get(var2) instanceof Map var8) {
            var7 = (Map<String, Object>) var8;
         } else {
            var7 = new LinkedHashMap<>();
            var1.put(var2, var7);
         }

         var7.put(var3, var4);
      }
   }

   public List<Map<String, Object>> copyBlocks(List<?> var1) {
      if (((744231011 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else {
            for (Object var4 : var1) {
               Map var5 = this.toStringObjectMap(var4);
               if (var5 != null) {
                  var2.add(this.deepCopyMap(var5));
               }
            }

            return var2;
         }
      }
   }

   public List<Map<String, Object>> resolveRenderableBlocks(List<Map<String, Object>> var1, Map<String, YamlConfiguration> var2) {
      if ((1100265012 ^ 1100265012) != 0) {
         throw new IllegalStateException();
      } else {
         List var3 = this.copyBlocks(var1);
         this.synchronizeImageGroupLayers(var3);
         List var4 = this.templateResolver.resolveBlocks(var3, var2);
         this.propagateRuntimeHudStackPage(var3, var4);
         return var4;
      }
   }

   public void propagateRuntimeHudStackPage(List<Map<String, Object>> var1, List<Map<String, Object>> var2) {
      if ((-650610138 ^ -650610138) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isEmpty()) {
         String var3 = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
            "j084fRObpjbQBPglmGCrlDvYr8RWdu3mR8afyN4miM4hwEcPt6EUfRmVYe9UNScpqusUQsBivJzyf+DvVt8x6Vm4U9leT/xqWD22YGVHpNxq+LbC"
         );
         int var4 = Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 24);

         for (Map var6 : var1) {
            if (var6 != null && var6.get(var3) != null) {
               var4 = Xqedii_ntttel8.Xqedii_2d77kqauxzceu(669092010, 24);
               break;
            }
         }

         if (var4 != 0) {
            for (Map var14 : var2) {
               if (var14 != null && var14.get(var3) == null) {
                  String var7 = String.valueOf(
                     var14.getOrDefault(
                        Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5tMznuh3Xti+AurZR9MAiQBi6NpXpESbKHg5a5xpp8w626e2IIMzxB2yWOuyBmnDG4XDTZrxgfvnTYahncfEUokr"),
                        Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==")
                     )
                  );
                  int var8 = var7.indexOf(Xqedii_ntttel8.Xqedii_b04l01r82a2w(1173403263, 17));
                  String var9 = var8 < 0 ? var7 : var7.substring(Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833514, 6), var8);

                  int var10;
                  try {
                     var10 = Integer.parseInt(var9);
                  } catch (NumberFormatException var12) {
                     continue;
                  }

                  if (var10 >= 0 && var10 < var1.size() && var1.get(var10) != null) {
                     Object var11 = ((Map)var1.get(var10)).get(var3);
                     if (var11 != null) {
                        var14.put(var3, var11);
                     }
                  }
               }
            }
         }
      }
   }

   public List<Map<String, Object>> resolveRenderableBlocks(List<Map<String, Object>> var1, Map<String, YamlConfiguration> var2, EditorSession var3) {
      if ((1359534309 * 1359534309 + 1359534309 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 == null) {
         return this.resolveRenderableBlocks(var1, var2);
      } else {
         this.prepareScrollViewState(var3);
         List var4 = this.copyBlocks(var1);
         this.synchronizeImageGroupLayers(var4);
         List var5 = this.templateResolver.resolveBlocks(var4, var2, var3.scrollViewState);
         this.propagateRuntimeHudStackPage(var4, var5);
         this.syncScrollOffsetsFromState(var3);
         this.collectComponentHoverCapableTargets(var3, var5);
         return var5;
      }
   }

   public void collectComponentHoverCapableTargets(EditorSession var1, List<Map<String, Object>> var2) {
      if (((1823943774 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         var1.componentHoverCapableTargets.clear();
         if (var2 != null) {
            for (Map var4 : var2) {
               if (var4 != null
                  && Boolean.TRUE
                     .equals(
                        var4.get(
                           Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("bvfHGfvit2GBoE9dVAPiC56tH+KxaLz9SXlU6UZVdgacNk9x+GEmVgCFiws/vyfyWY8KafDZ3WneKwkJTQuIoV9B7dI=")
                        )
                     )) {
                  Object var5 = var4.get(
                     Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("Uf46FOTx/yR0VNQywnODLr9lTdbSeo3jFDG7n1VGXl/U5K/tytggsyGiFc2Xgsa5kPq3DuAEtkVVBOJqAex1oQ==")
                  );
                  String var6 = var5 == null ? Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("33Clcl8DJrRRU0VhG4hQ/P/9GKK5neY0UUitUg==") : String.valueOf(var5).trim();
                  if (!var6.isBlank()) {
                     var1.componentHoverCapableTargets.add(var6);
                  }
               }
            }
         }
      }
   }

   public void prepareScrollViewState(EditorSession var1) {
      if ((-1660324025 * -1660324025 - -1660324025 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ScrollViewState var2 = var1.scrollViewState;
         var2.clearFilterValues();
         var2.setHoveredTargets(var1.editMode ? null : var1.componentHoverTargets);

         for (Entry var4 : var1.runtimeVariables.entrySet()) {
            String var5 = (String)var4.getKey();
            if (var5 != null && !var5.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("e5qXev4yFZuTH6c+MQBJZQSWoA5LI1V1sGPUFVAaDww="))) {
               var2.putFilterValue(var5, (String)var4.getValue());
            }
         }

         for (Entry var8 : var1.runtimeVariables.entrySet()) {
            String var10 = (String)var8.getKey();
            if (var10 != null
               && var10.startsWith(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5JLIhrqJI9OCyBbj4xMJJSUvMJ07xHQapszhlF/eRK4YcU4WwCovWAQ9lxk+/veKEZhztXzpLZI="))) {
               var2.putFilterValue(
                  var10.substring(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("5JLIhrqJI9OCyBbj4xMJJSUvMJ07xHQapszhlF/eRK4YcU4WwCovWAQ9lxk+/veKEZhztXzpLZI=").length()),
                  (String)var8.getValue()
               );
            }
         }

         for (Entry var9 : var1.scrollOffsets.entrySet()) {
            double[] var11 = (double[])var9.getValue();
            if (var11 != null && var11.length == Xqedii_ntttel8.Xqedii_b04l01r82a2w(-195458201, 13)) {
               var2.putOffset(
                  (String)var9.getKey(), var11[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 8)], var11[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387832, 2)]
               );
            }
         }
      }
   }

   public boolean pageUsesViewFeatures(List<Map<String, Object>> var1) {
      if (((1784060677 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var3 : var1) {
            if (this.blockUsesViewFeatures(var3, Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 30))) {
               return Xqedii_ntttel8.Xqedii_2d77kqauxzceu(411738750, 4) != 0;
            }
         }

         return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 26) != 0;
      } else {
         return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(-182310646, 7) != 0;
      }
   }

   public boolean blockUsesViewFeatures(Map<String, Object> var1, int var2) {
      if (((-2003939853 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 <= Xqedii_ntttel8.Xqedii_b04l01r82a2w(1706293805, 28)) {
         Object var3 = var1.get(Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("UvN8meckWS8qOvIV6utmsWovN/xYN4jy0cu66V/HPnqN8webvuiGEDTU2uw="));
         if (var3 == null || !TemplateScroll.hasScroll(var1) && !TemplateScroll.hasFilter(var1)) {
            if (var3 instanceof List) {
               for (Object var6 : (List)var3) {
                  if (var6 instanceof Map var7
                     && this.blockUsesViewFeatures(this.castBlockMap(var7), var2 + Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387900, 6))) {
                     return Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182310645, 6) != 0;
                  }
               }
            }

            return Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 25) != 0;
         } else {
            return Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1363086405, 19) != 0;
         }
      } else {
         return Xqedii_ntttel8.Xqedii_b04l01r82a2w(-806833514, 6) != 0;
      }
   }

   public Map<String, Object> castBlockMap(Map<?, ?> var1) {
      if (((293026523 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Map<String, Object>) (Map<?, ?>) var1;
      }
   }

   public void syncScrollOffsetsFromState(EditorSession var1) {
      if (((-957270710 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         for (Metrics var3 : var1.scrollViewState.allMetrics().values()) {
            Map var10000 = var1.scrollOffsets;
            String var10001 = var3.containerId;
            double[] var10002 = new double[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(351646012, 29)];
            var10002[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 6)] = var3.offsetX;
            var10002[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1167505023, 17)] = var3.offsetY;
            var10000.put(var10001, var10002);
         }
      }
   }

   public List<Map<String, Object>> resolveRenderableBlocksNoCopy(List<Map<String, Object>> var1, Map<String, YamlConfiguration> var2) {
      if ((1436017921 * 1436017921 - 1436017921 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? Collections.emptyList() : this.templateResolver.resolveBlocks(var1, var2);
      }
   }

   public void synchronizeImageGroupLayers(List<Map<String, Object>> var1) {
      if ((-456769869 * -456769869 + -456769869 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (Map var3 : var1) {
            this.synchronizeImageGroupLayerNode(var3);
         }
      }
   }

   public void synchronizeImageGroupLayerNode(Map<String, Object> var1) {
      if ((1788004926 * (1788004926 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         List<Map<String, Object>> var2 = this.readChildRawNodes(var1);
         if (!var2.isEmpty()) {
            if (this.isImageGroupRootNode(var1, var2)) {
               double var3 = this.readRawNodeLayer(var1);
               if (Double.isFinite(var3)) {
                  for (Map var6 : var2) {
                     this.applyLayerRecursively(var6, var3);
                  }
               }
            }

            for (Map var4 : var2) {
               this.synchronizeImageGroupLayerNode(var4);
            }
         }
      }
   }

   static {
      if ((1575102261 * (1575102261 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3crgivd = Pattern.compile(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("53//NQsIKZy8iiRN93XoICA7YfA2+OmFptqE/rHtz/iT8X++ugwmo3k7J5omph108SLs8+vlg8rT9/mlYZ+oJ35L4iagSMNP6Yk=")
         );
         Xqedii_3ukwtz9 = Pattern.compile(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x(
               "8hOdUNuyqBEuhaPY2aoBXYljO/7yYCIGTwfZiQStP1ZcuQUZLt9ZdS2lpz5rVHnslwFlbcYsXVFohOGW/vHvttjHs11flMYTyKiFtN5P0FJnlgN2CqEy1bRoowxqUgHV5PB72k4OGLo="
            )
         );
         Xqedii_31qcpyp = Pattern.compile(
            Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("zeexHie+AAgEvPcGjXbn6ttCYTU/9p688OGMpkhC6SXx0JBTXlWy6Hzf3YJWfL2aiEX2nQlWJVjO4FEA"),
            Xqedii_ntttel8.Xqedii_2d77kqauxzceu(581473158, 10)
         );
         String[] var10000 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425404220, 12)];
         var10000[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 17)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("mEGw3c2ex6mCBLaIsayo1D5zMmUkU67ecnAntL+I");
         var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1414513425, 17)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("JDm0bgEcHp4DVMZ4DlVSzTnfjSCnLAo9S+BCQrrj");
         var10000[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387832, 1)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("B63FBr45zxrsd8qCO7XB1KLQj3UaUDMk7Pymmuve");
         var10000[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425649980, 18)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("xjbnEFHkV3rCfKkhhMDsIwRPSx4USmEGRq22PizK");
         Xqedii_29qvign = var10000;
         var10000 = new String[Xqedii_ntttel8.Xqedii_b04l01r82a2w(1828621113, 2)];
         var10000[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1960219394, 18)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("beY4IWeVo3murmQ/3f+/5OxqWc2rzbuJBAtWBt/x");
         var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-511137241, 0)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("N4Zi98WnbaKBYNixFE6OHB12WJn83tTSZT+DQ4f5");
         var10000[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(181262069, 20)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("dXJlvS7aeVCCa8QnKVUNms8BwJCvNjscfHsYopJe");
         var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(317768789, 23)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("W5d81aKUDgkrD4lo7j0+iDsF4bSBNehbWBVvoTxN");
         Xqedii_2fplvqv = var10000;
         var10000 = new String[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1458942268, 23)];
         var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(-1440292472, 16)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("a4s38ic9eEmhB3VNWuzKP+vEIqQQXCytYeQ3xWjp");
         var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1414513425, 17)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("51BLT+Ifx9mlbtjKpMkh6pQT01JMfcyWsLOj9I3I");
         var10000[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(199087861, 24)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("AtI1DG7z8MeFY4otUPmWZ7nId/5f277pvan64yBm");
         var10000[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-1286156312, 22)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("0C/rnsUEe6y+cgy3TVBLgF88y5S+3MbC9izKvBOe");
         Xqedii_1a0mzl3 = var10000;
         var10000 = new String[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(183359221, 20)];
         var10000[Xqedii_ntttel8.Xqedii_34ayrbfd0brsl(1425387836, 20)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("9ffxcZMxJ5D5EZi+U1VZ9w4ClZiP/9GVurMdhtzh");
         var10000[Xqedii_ntttel8.Xqedii_2d77kqauxzceu(1646955000, 6)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("PtrfBHJbFYLpqmDmHfNKBsfQDeSznJ2hHcVe5Phw");
         var10000[Xqedii_ntttel8.Xqedii_2zfwg8zmzer91(182245109, 16)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("1w8yNGqHc0uyn0vnMchiKY0+5Z8BTnWE8Ju4cdrV");
         var10000[Xqedii_ntttel8.Xqedii_b04l01r82a2w(-390900017, 14)] = Xqedii_ntttel8.Xqedii_3y0j7qsxes8x("kOlCUWjx4f7Qa7zIzRx158m+EOq7VaV7VZG4lMrL");
         Xqedii_pgm4udd = var10000;
      }
   }

    private static /* synthetic */ String Xqedii_22x9uqb94m2qm(boolean bl) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"ELCbJxbeJ+KPBCM7JhFMTTK4/kUzsbw77lnEf/UrbVoWvYMjW2UebM2fZuoqxA==") + bl;
    }

    private static /* synthetic */ String Xqedii_1v4geiho3v7wi(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"9xrInLByj8Ep7MsZ4AwGyWtqYNaYigDyCPcsVjF3NxjddMIeKtWGgDhzRxIy37Eu/yXIR0OydOdFZrvi9SAK8r7QAsOysnWVJWnh5J1SlOb7wek+u4pNYzst5yE=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"fD++4fz5VvjYI8gsz/O9Sm/wMGBzwd/mwFnzbMok6rGWCKTcgA6lDOhVGSmeJB4fOBI=") + string2 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"pHScUs//wk2gHwJZqd5iqCJGpTWn/H0xdSNz9Wxg");
    }

    private static /* synthetic */ String Xqedii_tqqsazdqd52g(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"Hxp9noToOiNaLj47dKKlosH8/dJbbfkNLDWniR9r7ug=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"QbX8SqQJzJN5wA/LelbAWIqWguTk028AcVJ8qtuC");
    }

    private static /* synthetic */ String Xqedii_1go00xde63ta9(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"zLr7n9S9jEs1VZuFn4S8xgpPlRvs4+VDHPo7WwMK") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"QbX8SqQJzJN5wA/LelbAWIqWguTk028AcVJ8qtuC");
    }

    private static /* synthetic */ String Xqedii_3lsq3todd0to1(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"n1y5xUtiCkGeiCLs8XoW3i0h8kMJdq8vha4OgECAo+M2Ge16ZAgEk+P9hXE7ynNS8XRaZg==") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"V8h/AxfiYl6YR3+FIWmuioOj8YYfvKhGBsZ/Ekj3yOYvPZ9aRNm4WQ==") + string2 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"Pl2JYoY+GPBhqsuIkbjwkBBqVmowDctNnCsdMCEF");
    }

    private static /* synthetic */ String Xqedii_1t9zg7otj9pfk(String string, String string2, String string3) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"n1y5xUtiCkGeiCLs8XoW3i0h8kMJdq8vha4OgECAo+M2Ge16ZAgEk+P9hXE7ynNS8XRaZg==") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"/OTHaPMcf0Fspe56aQMxIBn8jDrdMkmwh3A0Jqo1UDFYjqBsldqzkfn0Ecg/9T6u/X9+vKqGK6r9PaKQZaWfWpY2WtcRSw==") + string2 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"n6gYcNmewRLtaLXE2ntVj9XO/jNsaC6jD2SruZuMmceEIC7BwnalKZjmmWJAht/u5wkU4A==") + string3 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"pHScUs//wk2gHwJZqd5iqCJGpTWn/H0xdSNz9Wxg");
    }

    private static /* synthetic */ String Xqedii_v4jduijawxlh(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"jxwP9PpStdhTggtKg37uv3CXpqGkRFxUiHZYrtfa5uLcYo2I4WMbCRsGo79TSgt/mr6vXQE0QvPtL1M+P7aZaBLa0URGCA==") + string;
    }

    private static /* synthetic */ String Xqedii_1bmcrab9wv6jj(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"GG2Z+OxNM4E7zXnqeA96DL84frgO2qUmPLfWh0jC1DE0QA51j5c=") + string;
    }

    private static /* synthetic */ String Xqedii_2uvm2tb15ho9u(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"iwpkJyCMl6iVli7MOHmm/YNWddR45juP0gujBSMG") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"iwpkJyCMl6iVli7MOHmm/YNWddR45juP0gujBSMG");
    }

    private static /* synthetic */ String Xqedii_1p6uu68j48kv7(String string, String string2) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"G/7z5NiB0Grj+AdajREHhiC3LPJIKYohZJoFWfqI") + string2;
    }

    private static /* synthetic */ String Xqedii_1w5yd7cl9fkh5(String string, String string2) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4V/V2Q9FE33jZE2AbEl7TG4E++VvWRDE/scAufTz") + string2;
    }

    private static /* synthetic */ String Xqedii_2ijugu92d8tc(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"G7y46xgkKUnIBKvgJf4EVrz6ysJma5rJA7EXLA0ogh2GGGFh4AfXpX8agTShKX+bpndkrpZAQrdWFj9jHimr5Gh+trAjNTFdWjhC6ygc6NGbQKODGv/wlgCcNo6AqhwbOvpmxtor8RcKXUws1OkbgHgWL6s6tC/J") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"FJC6QJPRz+UNBOh9kgchYSMqPju5fBkxixKr3C7GghCXWg==") + string2;
    }

    private static /* synthetic */ String Xqedii_2j4u0j4b3oouy(String string) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"rpZCFaUzlePRXgjzbz5VA9ar2C8ynn0Iik+HF4fwikiffgnE");
    }

    private static /* synthetic */ String Xqedii_2hu56jlqelqxe(int n) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"ubNNlzjLfk0OfnORtprTGIW5MCnIH7UGdcPbRIZz6qCM3/FhayB9u7RobhcESdALFHxNTl0C5iZHu8BLcQX3gS1ugSIRwxEeKnMm2Bj9R74tHjWf1+kyiik0/Hkpz4V00P7sqn0c") + n + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"TyH1SN4QG6S/ZtoSurJIprPHx/nsahHm69rFOFzMDeZxvxYVEbMOEu1gQ0VYx4YSqGiIBCCUhHj0poU3");
    }

    private static /* synthetic */ String Xqedii_13j9px9y3a0nn(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"1D6xTAqgtVraN+kOWMPtH7WluxPS8jI1wCS/iAQqXTI61FTvsJLgwZ+HOrg45ECYF17CZsEv") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"qIHhivxqTVcey2I5R8tMfgtgVP1rzGpFDbK7zCVWUF9u0UMm") + string2;
    }

    private static /* synthetic */ String Xqedii_1x8yeuqt8s4p9(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"y1EzP0aDt/IkzjsTgD7n2wtyzxT65we1r7ueABSqykcXNbmQDFPi2cALuUw9ADhaDv0glFpixBPVY9Y0Oj8a8jtH8cjAWn25TwBpU7ipK9vXjqhYsFOLPeawdn9YQtcvx4lPupq9yKqcJgIEnG4=") + string;
    }

    private static /* synthetic */ String Xqedii_q8jwklzyat8w(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"RM/pjI4cqgUTNgfSqIz7l5Y3bHCxxxT3LORb0JjeEzghuxFUCzFbMPtErAdwxue5Dd1J6D3ffBzHxbPz4wk+z7PP+xD03hJtYX7sZMenBuQn4qsIrQI=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"nxS9GPEMgEZaUTnIgvRdG3/nNvcquFHtN29XCqgoxbo=") + string2;
    }

    private static /* synthetic */ String Xqedii_30hadcxdg5sl5(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"761zXkbCjkFuL2RMj5XTnLVuuG772FTPcX1edKpYPRs=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"xZF7uFphEolhJNldTnJ8s+gd9+7ci0URgQN6mGMA") + string2;
    }

    private static /* synthetic */ String Xqedii_18msjli80em2o(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"761zXkbCjkFuL2RMj5XTnLVuuG772FTPcX1edKpYPRs=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"xZF7uFphEolhJNldTnJ8s+gd9+7ci0URgQN6mGMA");
    }

    private static /* synthetic */ String Xqedii_347d1mx4pk6l0(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"761zXkbCjkFuL2RMj5XTnLVuuG772FTPcX1edKpYPRs=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"xZF7uFphEolhJNldTnJ8s+gd9+7ci0URgQN6mGMA") + string2;
    }

    private static /* synthetic */ String Xqedii_2kd13zimjzxfc(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"WQUujvBH0/XgPCUbTPboaxTpdJ9QVMQrncVtrNn6fAUwVDuAH3VXfw==") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"xZF7uFphEolhJNldTnJ8s+gd9+7ci0URgQN6mGMA") + string2 + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"1detoA//o0ecPnykmTrKHSrjSPCpvtBWtAaiVvYqpbT4dmAG+OIzjx7F");
    }

    private static /* synthetic */ String Xqedii_2jy4ygxbsnrla(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_24wctnjh9ciry(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_22pnhcwia2rb2(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_vmav0oesyrna(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"LToQGpoUKjPuwVR2mB6IDnb3FiJl8i8VWDAraozdJl9rQIQdOATQzPXown0DvdO4JCCFC/uy") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"1detoA//o0ecPnykmTrKHSrjSPCpvtBWtAaiVvYqpbT4dmAG+OIzjx7F");
    }

    private static /* synthetic */ String Xqedii_2xfidcg0u094d(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"Xryv6JS1xoleodP84k2vHEySxa4omokPCcMHffKiPc8W0lzo2IDhtNHF9X4utZzqnFoMDre66QuLsVW5hL4=") + string;
    }

    private static /* synthetic */ String Xqedii_1wn2yn7ixfuf2(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"Di34XXqavrYoVN+sEy4h3ZcjA+TZB2aTI9YwUn8hT6MqtVuXRsE+k05IHgEoXKPSyyF20+1yiYVhnaKh") + string;
    }

    private static /* synthetic */ String Xqedii_18a7rkuts3onz(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"B0bnxhy82AQa5VKbQNAtwGRMm7jlAuf/lslwlm7MaktbqSRUso9co81Q1LHASM9OoPYEc/CIRVT96OE+Gj8=") + string;
    }

    private static /* synthetic */ String Xqedii_3p6ycy3uh5c8w(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"yy/7+DD/d2hwxdhgOMO9K+klM2zB6DBu9lV6UgNmRPx0Qnx3q/oDL9M5ExE+JCPZBkMFo2rHrLfv3XXI") + string;
    }

    private static /* synthetic */ String Xqedii_18pttisj8m17y(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"CbH5GWPVim/K3Z50EzC5Hc5uWSN1aeSjwRA09rXVnkM8xmR1vnZgtQdluLbvTyW+2wOeUeQBXGAMYlCl") + string;
    }

    private static /* synthetic */ String Xqedii_2qipcmxxlaqrp(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"IQLt3gynD+FTiILDNP3mg3FPSfxBrs73qsRCvjiiUrYWe1hSddbkVQNuzUQ/cSUv9+Tiin0FoEKPFQ==") + string;
    }

    private static /* synthetic */ String Xqedii_2ywu2tygvrr4z(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"MyJflqrfmbXPKSTE9MRtu7bSoNuCLG2iW3ZXjZ2sOhXCOVyQQ/x81PRscOPeOxGLytgKNqT42LA9O9S0") + string;
    }

    private static /* synthetic */ String Xqedii_263woxhb55k0u(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"8yoxtpncP/KFayU3lL5e8pONO+uhx/JNMi5TxqCXDE7OLzYjkp8RkUtS96MVRYZyE8+ixVUwOFY=") + string;
    }

    private static /* synthetic */ String Xqedii_3oszr7lmu9k5i(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"Xryv6JS1xoleodP84k2vHEySxa4omokPCcMHffKiPc8W0lzo2IDhtNHF9X4utZzqnFoMDre66QuLsVW5hL4=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4V/V2Q9FE33jZE2AbEl7TG4E++VvWRDE/scAufTz") + string2;
    }

    private static /* synthetic */ String Xqedii_3cue72e3g4hv9(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"pK8xn1OygihffUyF/aXseeBS3b/V+bt82PFdisBNDyiEjqy6CMyECcYhf7E1LQ==") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4V/V2Q9FE33jZE2AbEl7TG4E++VvWRDE/scAufTz") + string2;
    }

    private static /* synthetic */ String Xqedii_x692zzas9y4n(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"pK8xn1OygihffUyF/aXseeBS3b/V+bt82PFdisBNDyiEjqy6CMyECcYhf7E1LQ==") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4V/V2Q9FE33jZE2AbEl7TG4E++VvWRDE/scAufTz") + string2;
    }

    private static /* synthetic */ String Xqedii_3q88gxo9e6011(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"pK8xn1OygihffUyF/aXseeBS3b/V+bt82PFdisBNDyiEjqy6CMyECcYhf7E1LQ==") + string + string2;
    }

    private static /* synthetic */ String Xqedii_3a2lctinq03yf(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4pUn1xOUQEXZDm2e4XuHRs5C56IGsiRER3EUs/CpUwZ0Qj+VC4gmBu7I3xg=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4V/V2Q9FE33jZE2AbEl7TG4E++VvWRDE/scAufTz") + string2;
    }

    private static /* synthetic */ String Xqedii_3ae32l1ftd7ye(String string, String string2) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4pUn1xOUQEXZDm2e4XuHRs5C56IGsiRER3EUs/CpUwZ0Qj+VC4gmBu7I3xg=") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"4V/V2Q9FE33jZE2AbEl7TG4E++VvWRDE/scAufTz") + string2;
    }

    private static /* synthetic */ String Xqedii_2rjuazcvknm3d(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"zLr7n9S9jEs1VZuFn4S8xgpPlRvs4+VDHPo7WwMK") + string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"QbX8SqQJzJN5wA/LelbAWIqWguTk028AcVJ8qtuC");
    }

    private static /* synthetic */ String Xqedii_29j6cpgz7ex73(String string) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto");
    }

    private static /* synthetic */ String Xqedii_pmsiigrr365k(String string, String string2) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto") + string2;
    }

    private static /* synthetic */ String Xqedii_h15nfh2c943o(String string) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto");
    }

    private static /* synthetic */ String Xqedii_22ccv47qpvavj(String string) {
        return Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto") + string;
    }

    private static /* synthetic */ String Xqedii_2uu83uv5yeuxj(String string, String string2, String string3) {
        return string + string2 + string3;
    }

    private static /* synthetic */ String Xqedii_2nymrl32daxtx(String string) {
        return string + Xqedii_ntttel8.Xqedii_3y0j7qsxes8x((String)"hGsKORrNryVqOAbWASdHZQqKRnc9TzPlhFMXdLto");
    }

}
