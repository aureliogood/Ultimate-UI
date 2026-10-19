package dev.xqedii.ultimateUI.service.gui.render;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_101y7xo;
import dev.xqedii.ultimateUI.Xqedii_2jsmjrt;
import dev.xqedii.ultimateUI.Xqedii_2mql9fq;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.PreviewViewport;
import dev.xqedii.ultimateUI.service.gui.model.RoundedBox;
import dev.xqedii.ultimateUI.service.gui.model.RoundedCornerGlyphs;
import dev.xqedii.ultimateUI.service.gui.model.RoundedCornerOffsets;
import dev.xqedii.ultimateUI.service.gui.model.RoundedTransform;
import dev.xqedii.ultimateUI.service.gui.util.EditorRawWriterPart;
import dev.xqedii.ultimateUI.service.head.PlayerHeadFontService;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator.Placement;
import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;
import org.bukkit.entity.ItemDisplay.ItemDisplayTransform;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.util.Vector;

public abstract class EditorElementHudPart extends EditorRawWriterPart {
   public static final String Xqedii_36isl5obvwu3c = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final Map<String, PlayerProfile> Xqedii_38wikv5 = new ConcurrentHashMap<>();
   public final Set<String> Xqedii_24hmthh = ConcurrentHashMap.newKeySet();
   public static final String ITEM_DATA_KEY = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("EYIiT3qUuOR7LVfkWT7Np97DpeGCnEy79+mgsH3tnlUDAGSu9/ArDPQtelXHfg==");
   public static final String Xqedii_1cfjwyz = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("xKVmD/+vEpkF56ZdWoCbc3d6YH1nAIGuh+LJJvJ7vA0goicTGz7nYA==");
   public static final String Xqedii_3f41xkz = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G39qF7xp5ll40FDtc80fdnD5ullhOW02AmTzKGRYAkMCqY8yldWOcYNz");
   public final Map<String, ItemStack> Xqedii_2m8erqm = new ConcurrentHashMap<>();
   public static final String SKIN_PART_SUFFIX = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("5LWmIYO+RE6rp7p2oD1f7H9ruRKY0QSBgnw2Hm/PkZ52UIf+3b7w52s8");
   public static final String SKIN_ITEM_MODEL_ROOT = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("asnoHf9aN0KN0uyMJc+GM5OnQ1tkjHjIFOXf/neN3AkhplMKOwcxbZNWypALHkPh3P8=");
   public static final String[] SKIN_PART_NAMES;
   public static final int[] SKIN_PART_BANDS;
   public static final double[] SKIN_PART_ANCHOR_X;
   public static final double[] SKIN_PART_ANCHOR_Y;
   public static final double[] SKIN_PART_PIVOT_X;
   public static final double[] SKIN_PART_PIVOT_Y;
   public static final double[] SKIN_PART_MODEL_DX;
   public static final double[] SKIN_PART_MODEL_DY;
   public static final double SKIN_MODEL_HEIGHT_PX = 32.0;
   public static final double SKIN_MODEL_WIDTH_PX = 16.0;
   public static final double SKIN_MODEL_OVERLAY_PX = 0.5;
   public static final double SKIN_MODEL_VISUAL_HEIGHT_PX = 33.0;
   public static final double SKIN_MODEL_VISUAL_WIDTH_PX = 17.0;
   public static final double SKIN_MODEL_BOX_DROP_PX = 0.5;
   public static final double SKIN_PART_BOX_PX = 17.06667;
   public static final double SKIN_MODEL_CENTER_Y = 16.0;
   public static final double SKIN_DEPTH_LAYER_STEP = 0.05;
   public static final double SKIN_DEPTH_LAYER_MAX_OFFSET = 0.4;
   public static Method Xqedii_14ofmf1;
   public static boolean Xqedii_ppckroc;
   public final Set<UUID> Xqedii_3gvnwx7 = ConcurrentHashMap.newKeySet();
   public static final double SKIN_SPIN_DEFAULT_SPEED_TICKS = 100.0;
   public static final double SKIN_MOUSE_SPIN_DEGREES_PER_PIXEL = 0.5;
   public static final double SKIN_MOUSE_SPIN_MAX_PITCH = 60.0;
   public static final double SKIN_MOUSE_SPIN_EPSILON = 1.0E-4;
   public static final double SKIN_MOUSE_SPIN_FRICTION = 0.72;
   public static final int SKIN_MOUSE_SPIN_DECAY_TICKS = 10;
   public static final double SKIN_MOUSE_SPIN_MIN_VELOCITY = 0.05;
   public static final double SKIN_MOUSE_SPIN_MAX_VELOCITY = 60.0;
   public static final long SKIN_MOUSE_SPIN_RELEASE_GRACE_TICKS = 1L;

   public EditorElementHudPart(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public boolean isRenderableBlockType(String var1) {
      if ((-97018570 * (-97018570 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((!Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA=").equals(var1)
               && !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("utFYjmd+wFnBQ4CGR83rv/yK6YGRqaI3T1pSNsrKEZWrSpjb").equals(var1)
               && !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fuff3rZdnfKDD3OEQmIZTZ2FvvKRK9rZkngfAp8gpQhLyZea").equals(var1)
               && !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var1)
               && !this.isRoundedType(var1)
               && !this.isInputType(var1)
               && !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DZ/R56ZXey1RsbxUNc5H4IlXpgz1iZVI3SdxUqeosnrQhXMY6QqtYw==").equals(var1)
            ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 5)
            : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207928, 6)) != 0);
      }
   }

   public boolean isPlayerHeadTextSection(ConfigurationSection var1) {
      if ((1660831283 * 1660831283 + 1660831283 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && PlayerHeadFontService.containsPlaceholder(
                  var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw"))
               )
            ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507640463, 10)
            : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253061, 4)) != 0);
      }
   }

   public TextAlignment readTextAlignment(ConfigurationSection var1) {
      if ((-2117478474 ^ -2117478474) != 0) {
         throw new IllegalStateException();
      } else if (this.isPlayerHeadTextSection(var1)) {
         return TextAlignment.CENTER;
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588703606, 13)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 10)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("IjlUFqW5HPjzfesd0LDJrAVNSWLSIn4G3nhnJpkzTSx+X5YP5lk="));
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 18)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QUsNB1jDpnH+QyQgwqo0nqUuVj9T9rZNDS2u5GXSGJHMQgYU1w0xFU2Wh9bt7A=="));
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(841209463, 24)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GfiHW37/GGRg9vwvMapS8r85gG25Wcu2T8HWMD6/4k2WLXxp7zQmDM/AhXfs/j8A"));
         String var2 = this.firstNonBlank(var10001);
         if (var2.isBlank()) {
            return TextAlignment.CENTER;
         } else {
            String var3 = var2.toLowerCase(Locale.ROOT);
            int var4 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735586365, 12);
            switch (var3.hashCode()) {
               case 100571:
                  if (var3.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("TuU4i/jSj4AT46C6DUZ5+mUUxl/LTR6L3syqUg0A/SmtKQ=="))) {
                     var4 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(1558172964, 29);
                  }
                  break;
               case 3317767:
                  if (var3.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RFczcloBP+mb6kttPKMxxaBFofnpyRbuT8qKiSrMAv9PrG05"))) {
                     var4 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 24);
                  }
                  break;
               case 108511772:
                  if (var3.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("x8WPn5uCWceVNnbEBclj3hiT6ISaviJ44LijVaWUQpaT/JvUIgs="))) {
                     var4 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1860258887, 27);
                  }
                  break;
               case 109757538:
                  if (var3.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("sawVPEgORz5UCfwX+e+Rk0RPXu2uDtpThNF+rCy4nf3Os8wHHl8="))) {
                     var4 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578587608, 14);
                  }
            }
            return switch (var4) {
               case 0, 1 -> TextAlignment.LEFT;
               case 2, 3 -> TextAlignment.RIGHT;
               default -> TextAlignment.CENTER;
            };
         }
      }
   }

   public TextAlignment readHudAlignment(ConfigurationSection var1) {
      if (((-1753941247 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(478139684, 20)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1196506384, 25)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("xML3UuDJduSrmNQ3LAV39/KAkzihil0rRikabtG2n8ctNSWv6jMFJln4"));
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1521602934, 26)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("PExcClJnE7d5d9yTh9KErZbsFMg4iQzqSnXM2mPkygHXHfoQWd9jRQDA5wr4Z+vCHy6Hsr306j8="));
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(574449523, 28)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("pHV34VOqNBorKbRatRj5OUUN3ydLiGhWzWIgawpkVAIzjDSMpdymC0BJu0vhn+wA"));
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094937, 3)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("0r8I5WrUGa+tMvRNjnqtMeIRJEzqnZjBdxGxC+XZOpg+Mb5Bes1j2YT/tqQP7VweG1Y="));
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2054851049, 20)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/rMfcTq1ukAUlsBBhRwfX74QLRFYUmAXqhSmiP/7v7TJ8qOOx0oJivl5Fbrjh0m/HtnnDcBuxq0="));
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956110, 1)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("a/gfyxj0rchuvJpHiONM6qx3PhE077JqXJx/Nr8qhiZ9rylvJ0iO0KbNbTGfam7MpxumKTTiiaCEmzeGevE="));
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(189459503, 21)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("My/EkqLVfbiHRBQMyz9ugrHJ4AUNk8JFsuf9131TkC1US8iR1NgMqu633EnI7A3vBPwR0fBYXxi9XG3H1Hgliw=="));
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515566, 1)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("65H+RkIPZTga+4vHVQDOGido+ThhpaZBFsRAuYiG4sx0igMWDGHrWw=="));
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(618648868, 27)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("0bI91BjF2DUWqMdk7/ZLrYyUgnrDHWJUPEHddSu/k26SbQBiXTnVaWghskMCBHCp"));
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484433188, 8)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6SLFIEVZPUNvlduQSk8U3QjxaG5W7acb1kpXxje/442CrjWM+1XY+mJ1aN8cqQlOBoetcOQK"));
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(486266148, 18)] = var1 == null
            ? null
            : var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("z6G5yM4FIZqW44zdgBrOv6205Q8tfYGfUpPS1tt7lMooj9VgXZv7kgZMLyIN1iGVdLhuFTIIMC6nhrZ2x0k="));
         String var2 = this.firstNonBlank(var10001);
         return this.parseHudAlignment(var2);
      }
   }

   public TextAlignment readHudAlignment(Map<String, Object> var1) {
      if ((272514098 * (272514098 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(887084324, 26)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(193653807, 21)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("xML3UuDJduSrmNQ3LAV39/KAkzihil0rRikabtG2n8ctNSWv6jMFJln4")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024804085, 19)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("PExcClJnE7d5d9yTh9KErZbsFMg4iQzqSnXM2mPkygHXHfoQWd9jRQDA5wr4Z+vCHy6Hsr306j8=")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635278423, 8)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("pHV34VOqNBorKbRatRj5OUUN3ydLiGhWzWIgawpkVAIzjDSMpdymC0BJu0vhn+wA")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024409938, 9)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("0r8I5WrUGa+tMvRNjnqtMeIRJEzqnZjBdxGxC+XZOpg+Mb5Bes1j2YT/tqQP7VweG1Y=")
         );
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1592906102, 20)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/rMfcTq1ukAUlsBBhRwfX74QLRFYUmAXqhSmiP/7v7TJ8qOOx0oJivl5Fbrjh0m/HtnnDcBuxq0=")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1846854758, 31)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("a/gfyxj0rchuvJpHiONM6qx3PhE077JqXJx/Nr8qhiZ9rylvJ0iO0KbNbTGfam7MpxumKTTiiaCEmzeGevE=")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(509596964, 23)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("My/EkqLVfbiHRBQMyz9ugrHJ4AUNk8JFsuf9131TkC1US8iR1NgMqu633EnI7A3vBPwR0fBYXxi9XG3H1Hgliw==")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1936866663, 20)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("65H+RkIPZTga+4vHVQDOGido+ThhpaZBFsRAuYiG4sx0igMWDGHrWw==")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956120, 1)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("0bI91BjF2DUWqMdk7/ZLrYyUgnrDHWJUPEHddSu/k26SbQBiXTnVaWghskMCBHCp")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048830115, 10)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6SLFIEVZPUNvlduQSk8U3QjxaG5W7acb1kpXxje/442CrjWM+1XY+mJ1aN8cqQlOBoetcOQK")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696829405, 8)] = this.readRawMapString(
            var1, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("z6G5yM4FIZqW44zdgBrOv6205Q8tfYGfUpPS1tt7lMooj9VgXZv7kgZMLyIN1iGVdLhuFTIIMC6nhrZ2x0k=")
         );
         String var2 = this.firstNonBlank(var10001);
         return this.parseHudAlignment(var2);
      }
   }

   public TextAlignment parseHudAlignment(String var1) {
      if ((1092912293 * 1092912293 + 1092912293 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.isBlank()) {
         return TextAlignment.CENTER;
      } else {
         String var2 = var1.trim()
            .toLowerCase(Locale.ROOT)
            .replace((char)Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348403823, 7), (char)Xqedii_101y7xo.Xqedii_g54i57lr0mm1(472372516, 19))
            .replace((char)Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515642, 1), (char)Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1521602934, 21));
         if (var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RFczcloBP+mb6kttPKMxxaBFofnpyRbuT8qKiSrMAv9PrG05"))) {
            return TextAlignment.LEFT;
         } else if (var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("x8WPn5uCWceVNnbEBclj3hiT6ISaviJ44LijVaWUQpaT/JvUIgs="))) {
            return TextAlignment.RIGHT;
         } else if (!var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("P6PGJh+UfUHCcpSex3j7GZkW2wBGbdNX2/v3WLZ3liJROecZRNttSQ=="))
            && !var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("CTIFmntAYe8yo4mTUwnARhN9hW5OT/KQ7i3hPaBJbseMtcaszjHekw=="))) {
            try {
               int var3 = (int)Math.round(Double.parseDouble(var2));
               if (var3 == Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1580044662, 10)) {
                  return TextAlignment.LEFT;
               }

               if (var3 == Xqedii_101y7xo.Xqedii_x42dgjucv46g(558771491, 27)) {
                  return TextAlignment.RIGHT;
               }
            } catch (NumberFormatException var4) {
            }

            return TextAlignment.CENTER;
         } else {
            return TextAlignment.CENTER;
         }
      }
   }

   public TextAlignment resolveEffectiveHudAlignment(EditorSession var1, TextAlignment var2, String var3) {
      if (((-1273882887 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.editMode) {
         return TextAlignment.CENTER;
      } else if (this.hasLeftAlignedAncestor(var1, var3)) {
         return TextAlignment.LEFT;
      } else {
         return var2 == null ? TextAlignment.CENTER : var2;
      }
   }

   public boolean hasLeftAlignedAncestor(EditorSession var1, String var2) {
      if ((277318177 * 277318177 - 277318177 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.rawBlocks != null && !var1.rawBlocks.isEmpty()) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 11)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 5)] = var2;
         String var3 = this.firstNonBlank(var10001);

         while (!var3.isBlank()) {
            String var4 = this.resolveParentRawTargetPath(var1.rawBlocks, var3);
            if (var4.isBlank()) {
               return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 1) != 0);
            }

            Map var5 = this.resolveRawMapAtPath(var1.rawBlocks, var4);
            if (this.readHudAlignment(var5) == TextAlignment.LEFT) {
               return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29) != 0);
            }

            var3 = var4;
         }

         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 4) != 0);
      } else {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 9) != 0);
      }
   }

   public String resolveParentRawTargetPath(List<Map<String, Object>> var1, String var2) {
      if ((2047558250 * (2047558250 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461142, 5)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 23)] = var2;
         String var3 = this.firstNonBlank(var10001);

         while (!var3.isBlank()) {
            int var4 = var3.lastIndexOf(Xqedii_101y7xo.Xqedii_x42dgjucv46g(424554122, 26));
            if (var4 < 0) {
               return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            }

            var3 = var3.substring(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 26), var4);
            if (this.resolveRawMapAtPath(var1, var3) != null) {
               return var3;
            }
         }

         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      } else {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      }
   }

   public String readRawMapString(Map<String, Object> var1, String var2) {
      if (((520038529 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         Object var3 = var1.get(var2);
         if (var3 != null) {
            return var3.toString();
         } else {
            Object var4 = var1;
            String[] var5 = var2.split(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/HHZ3lVcwmnlrRTnFqURQ68OQ8iS0zTcx9Mdz8GujNI="));
            String[] var6 = var5;
            int var7 = var5.length;

            for (int var8 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1025328373, 19); var8 < var7; var8++) {
               String var9 = var6[var8];
               if (!(var4 instanceof Map var10)) {
                  return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
               }

               var4 = var10.get(var9);
               if (var4 == null) {
                  return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
               }
            }

            return var4.toString();
         }
      } else {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      }
   }

   public double resolveHudAlignmentOffsetX(double var1, TextAlignment var3) {
      if ((-955753014 * -955753014 + -955753014 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TextAlignment var4 = var3 == null ? TextAlignment.CENTER : var3;
         if (var4 == TextAlignment.LEFT) {
            return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 26));
         } else {
            return var4 == TextAlignment.RIGHT
               ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 38))
               : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 37));
         }
      }
   }

   public int readTextWrapLineWidth(ConfigurationSection var1) {
      if ((996541763 * (996541763 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.isPlayerHeadTextSection(var1)) {
         return Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588846966, 11);
      } else {
         String[] var10002 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1023755509, 19)];
         var10002[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 3)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "pW9/zknmV2ThHtuHcTwDWruSZz0ZgG0q36dXS829dbzNbtAKg+tg1bTMuigsuA=="
         );
         var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712822, 10)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "0GAbeEuSnfmHujSRLldPiRnDUHRtAtgRF6JEg1Lkd6QxbClb/s0NMM4GF+Q="
         );
         var10002[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-1663052508, 31)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "QWDmQ2u+Orxa52N1Nor9xBzrvOi9qj/FNlHMsOsye9w7cdbJ3y/KZ6urtfNtIA=="
         );
         Object var2 = this.Xqedii_105quyl(var1, var10002);
         return this.normalizeTextWrapLineWidth(var2);
      }
   }

   public int normalizeTextWrapLineWidth(Object var1) {
      if (((185175738 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_g54i57lr0mm1(482817316, 13);
      } else if (var1 instanceof Number var6) {
         int var7 = (int)Math.round(var6.doubleValue());
         return var7 > 0 ? var7 : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-16483634, 21);
      } else {
         String var2 = var1.toString().trim();
         if (var2.isEmpty()) {
            return Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484381220, 8);
         } else {
            double var3 = this.parseDouble(var2, Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571849398L, 19)));
            if (!Double.isFinite(var3)) {
               return Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588664694, 8);
            } else {
               int var5 = (int)Math.round(var3);
               return var5 > 0 ? var5 : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484429252, 5);
            }
         }
      }
   }

   public Object Xqedii_105quyl(ConfigurationSection var1, String... var2) {
      if (((1205087034 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647572747, 14); var5 < var4; var5++) {
            String var6 = var3[var5];
            if (var6 != null && !var6.isBlank() && var1.contains(var6)) {
               return var1.get(var6);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public double applyTextAlignmentOffset(double var1, double var3, TextAlignment var5) {
      if (((-1556933537 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         TextAlignment var6 = var5 == null ? TextAlignment.CENTER : var5;
         if (var6 == TextAlignment.LEFT) {
            return var1 + var3 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(2280184766224383889L, 19));
         } else {
            return var6 == TextAlignment.RIGHT ? var1 - var3 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8403999686535396574L, 2)) : var1;
         }
      }
   }

   public String runtimeElementId(EditorSession var1, String var2) {
      if (((31156917 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1.previewMode ? Xqedii_dwhjqjn02ctu(var2) : var2;
      }
   }

   public String resolveElementId(ConfigurationSection var1, int var2, Map<String, Integer> var3) {
      if ((-1193710312 * -1193710312 + -1193710312 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711542, 8)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 24)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y+AE5iFMME0IVq9lvP2vOjDPJMlZGC9idv+krHWjDME=")
         );
         String var4 = this.firstNonBlank(var10001);
         if (var4.isBlank()) {
            var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(197323451, 11)];
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-982116475, 28)] = var1.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("d7ssCiPLbqUyAxJteZGWmEc2JgIwbgemYCxoh3LCpCYk02yhwm9n6r2hrQ3IiamnC9WfXKYc/mu3PtUqge71v8kS")
            );
            String var5 = this.firstNonBlank(var10001);
            if (!var5.isBlank()) {
               var4 = Xqedii_35i4wvnmc5636(this.sanitizeGeneratedRuntimeId(var5));
            }
         }

         String var8 = var4.isBlank() ? Xqedii_34wf24jtdfvow(var2) : var4;
         Integer var6 = (Integer)var3.get(var8);
         if (var6 == null) {
            var3.put(var8, Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1589236086, 19));
            return var8;
         } else {
            int var7 = var6 + Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 4);
            var3.put(var8, var7);
            return Xqedii_3d2sspwsp0xhn(var8, var7);
         }
      }
   }

   public String sanitizeGeneratedRuntimeId(String var1) {
      if (((-367246665 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         StringBuilder var2 = new StringBuilder(var1.length() + Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1587663222, 17));
         char[] var3 = var1.toCharArray();
         int var4 = var3.length;

         for (int var5 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578571224, 14); var5 < var4; var5++) {
            char var6 = var3[var5];
            if (!Character.isLetterOrDigit(var6)
               && var6 != Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889935812, 2)
               && var6 != Xqedii_101y7xo.Xqedii_32yuti7slijjp(-383863878, 27)) {
               if (var2.length() == 0
                  || var2.charAt(var2.length() - Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 31)) != Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(28029116, 23)) {
                  var2.append((char)Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(56058232, 24));
               }
            } else {
               var2.append(var6);
            }
         }

         while (
            var2.length() > 0
               && var2.charAt(var2.length() - Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048821923, 10)) == Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588799862, 11)
         ) {
            var2.setLength(var2.length() - Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1566007672, 24));
         }

         return var2.toString();
      } else {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      }
   }

   public PreviewViewport resolvePreviewViewport(List<Map<String, Object>> var1, double var2) {
      if (((566802133 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         double var4 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8268020161212339131L, 9));
         double var6 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-1264334436855586217L, 17));

         for (Map var9 : var1) {
            ConfigurationSection var10 = this.mapToSection(var9);
            if (var10 != null) {
               String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831709, 8)];
               var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(387307614, 22)] = var10.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y+AE5iFMME0IVq9lvP2vOjDPJMlZGC9idv+krHWjDME=")
               );
               String var11 = this.firstNonBlank(var10001);
               if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("oEM3miabz3uR9ctVEP5OAsxClcs8qfdPk53EqJIQeSbF9qGOcIHzEkO2").equalsIgnoreCase(var11)) {
                  double var12 = this.readDouble(
                     var10,
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Wyex+NwFU1nwXdCAGsxrS3XQVBVVRafQz1i9eTp+48foCGjuZI1AfsyOY9+bVUF6"),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2IwCBU/RrDrcdyKy03lT6fFhSD8Sr3lCcsyfWryu"),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-845567966260156578L, 24))
                  );
                  double var14 = this.readDouble(
                     var10,
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("q79rxO0jAJKNXgALb1WYijvQhI8v5AfsO5pdv20xumdM5TaT9EFD0i1oTOlf4jFy"),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LWGhDESDghOy0sWbSqBnNVZ9D2TO7ZFaFX4YFvf/"),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(9082992111588728456L, 37))
                  );
                  double var16 = Math.max(
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-3147095097789085728L, 49)),
                     this.readDouble(
                        var10,
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Z5ox4W6OdaEvCSuKd/ZK01LI0aveVxgGz5N1BHpFLwHyWJgciR/bUZgr5RDFxqfM"),
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="),
                        this.readDouble(
                           var10,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("28J2/y7Zcb2jvBm6zftWGT27ZpMDd1ZT2Q1eoL2F5ZLN99+r8iFLz8sBF+FC2hmAKN4="),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="),
                           Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(7759554969299391697L, 7))
                        )
                     )
                  );
                  double var18 = Math.max(
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8003176307587032900L, 3)),
                     this.readDouble(
                        var10,
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("utqd2WNRHod3LdoqXbK5nC8QtiaJhi2Yg2xW5FdBHiTrgIxEgrOrL95Qlel6vAYjXoI="),
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="),
                        this.readDouble(
                           var10,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("l/BRSC7jaujlcrB3SaxcN+qvOr8Kfa7O2GoYT5tX19elhghMoXjndmpFLWi/3DyxEjb2aA=="),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="),
                           Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6755672056633552106L, 48))
                        )
                     )
                  );
                  double var20 = this.readDouble(
                     var10,
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
                     this.readDouble(
                        var10,
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QARXskH/TZF1Y4KHh6qGsEzHP+ut1FkjO2jmHAy3juizfqTdmrx49DFqvLMaUZ78"),
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("hcG0QT+HrvwkyqUna2c3mGKPrk7B4qY7YJ18L1DuUIXpvQVP8C4="),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(2906402433443305216L, 13))
                     )
                  );
                  double var22 = Math.min(var16 / var4, var18 / var6);
                  if (!(var22 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 3))) && Double.isFinite(var22)) {
                     double var24 = var2;
                     if (Double.isFinite(var2)) {
                        var24 = Math.max(
                           Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-8937574915455039866L, 40)),
                           Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347633468865340278L, 50)), var2)
                        );
                     }

                     return new PreviewViewport(
                        var12,
                        var14,
                        var16,
                        var18,
                        var4,
                        var6,
                        var22,
                        var20 + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3346227056054461302L, 52)),
                        var24
                     );
                  }

                  return null;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean isInsidePreviewArea(EditorSession var1, double var2, double var4) {
      if ((1727409490 * (1727409490 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasViewportTransform(var1)) {
         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936188, 2) != 0);
      } else {
         PreviewViewport var6 = var1.previewViewport;
         return ((var2 >= var6.previewX
               && var2 <= var6.previewX + var6.previewWidth
               && var4 >= var6.previewY
               && var4 <= var6.previewY + var6.previewHeight
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-256201022, 17)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 16)) != 0);
      }
   }

   public double toRenderX(EditorSession var1, double var2) {
      if (((-2087912264 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return !this.hasViewportTransform(var1) ? var2 : this.getPreviewOriginX(var1) + var2 * this.getPreviewScale(var1);
      }
   }

   public double toRenderY(EditorSession var1, double var2) {
      if ((-1036850523 * -1036850523 + -1036850523 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return !this.hasViewportTransform(var1) ? var2 : this.getPreviewOriginY(var1) + var2 * this.getPreviewScale(var1);
      }
   }

   public double toRenderSize(EditorSession var1, double var2) {
      if ((-1462369060 ^ -1462369060) != 0) {
         throw new IllegalStateException();
      } else {
         return !this.hasViewportTransform(var1) ? var2 : var2 * this.getPreviewScale(var1);
      }
   }

   public double toLogicalCursorX(EditorSession var1, double var2) {
      if (((-1534523548 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return !this.hasViewportTransform(var1) ? var2 : (var2 - this.getPreviewOriginX(var1)) / this.getPreviewScale(var1);
      }
   }

   public double toLogicalCursorY(EditorSession var1, double var2) {
      if ((-1697756718 * -1697756718 - -1697756718 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return !this.hasViewportTransform(var1) ? var2 : (var2 - this.getPreviewOriginY(var1)) / this.getPreviewScale(var1);
      }
   }

   public double toRuntimeLayer(EditorSession var1, double var2) {
      if ((-823540260 ^ -823540260) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.previewMode && var1.previewViewport != null) {
         double var4 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(2447764761500436858L, 31)) + var2;
         return !Double.isFinite(var4)
            ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351029643830134L, 41))
            : Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347349363120497526L, 43)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1205769502497841556L, 20)), var4)
            );
      } else {
         return var2;
      }
   }

   public double defaultRuntimeLayer(EditorSession var1, HoverElement var2) {
      if (((-388927946 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var2 == null ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 39)) : this.toRuntimeLayer(var1, var2.z);
      }
   }

   public double getPreviewScale(EditorSession var1) {
      if ((1442253369 * 1442253369 + 1442253369 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         PreviewViewport var2 = var1.previewViewport;
         return var2.baseScale * var2.zoom;
      }
   }

   public double getPreviewOriginX(EditorSession var1) {
      if ((53992480 * (53992480 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         PreviewViewport var2 = var1.previewViewport;
         double var3 = this.getPreviewScale(var1);
         double var5 = var2.previewX
            + (var2.previewWidth - var2.pageWidth * var3) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(90825076045103352L, 8));
         return var5 + var2.panX;
      }
   }

   public double getPreviewOriginY(EditorSession var1) {
      if (((872798576 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         PreviewViewport var2 = var1.previewViewport;
         double var3 = this.getPreviewScale(var1);
         double var5 = var2.previewY
            + (var2.previewHeight - var2.pageHeight * var3) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1255466932015450860L, 63));
         return var5 + var2.panY;
      }
   }

   public double[] clampPreviewPanToVisibleRange(EditorSession var1, double var2, double var4) {
      if ((996195726 * (996195726 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasViewportTransform(var1)) {
         double[] var27 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257778, 0)];
         var27[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-491058238, 27)] = var2;
         var27[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 12)] = var4;
         return var27;
      } else if (this.isRuntimeZoomActive(var1)) {
         return this.clampRuntimePanToConfiguredRange(var1, var2, var4);
      } else {
         PreviewViewport var6 = var1.previewViewport;
         double var7 = this.getPreviewScale(var1);
         double var9 = var6.previewX
            + (var6.previewWidth - var6.pageWidth * var7) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(2770890829268345718L, 61));
         double var11 = var6.previewY
            + (var6.previewHeight - var6.pageHeight * var7) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571900278L, 19));
         double var13 = var6.pageWidth * var7;
         double var15 = var6.pageHeight * var7;
         double var17 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351719792960374L, 39));
         double var19 = var6.previewX + var17 - var9 - var13;
         double var21 = var6.previewX + var6.previewWidth - var17 - var9;
         double var23 = var6.previewY + var17 - var11 - var15;
         double var25 = var6.previewY + var6.previewHeight - var17 - var11;
         double[] var10000 = new double[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431156, 4)];
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 4)] = Math.max(var19, Math.min(var21, var2));
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348415855, 7)] = Math.max(var23, Math.min(var25, var4));
         return var10000;
      }
   }

   public double softClampToBounds(double var1, double var3, double var5) {
      if (((2107262390 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Math.abs(var1 - var3) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-17106340821071218L, 11))
            ? var3
            : var1 + (var3 - var1) * var5;
      }
   }

   public boolean applyPreviewZoom(EditorSession var1, double var2, double var4, double var6) {
      if ((121099790 * 121099790 + 121099790 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasViewportTransform(var1)
         || var6 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 22))
         || !Double.isFinite(var6)) {
         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 23) != 0);
      } else if (!this.isInsidePreviewArea(var1, var2, var4)) {
         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663929, 9) != 0);
      } else {
         PreviewViewport var8 = var1.previewViewport;
         double var9 = this.getPreviewScale(var1);
         double var11 = this.getPreviewOriginX(var1);
         double var13 = this.getPreviewOriginY(var1);
         double var15 = (var2 - var11) / var9;
         double var17 = (var4 - var13) / var9;
         double var19 = var8.zoom * var6;
         var19 = Math.max(this.resolveZoomMin(var1), Math.min(this.resolveZoomMax(var1), var19));
         if (Double.isFinite(var19) && !(Math.abs(var19 - var8.zoom) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(871618004931771160L, 37)))) {
            var8.zoom = var19;
            double var21 = this.getPreviewScale(var1);
            double var23 = var8.previewX
               + (var8.previewWidth - var8.pageWidth * var21) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605992774L, 14));
            double var25 = var8.previewY
               + (var8.previewHeight - var8.pageHeight * var21) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4762407206239618482L, 17));
            double var27 = var2 - var15 * var21;
            double var29 = var4 - var17 * var21;
            var8.panX = var27 - var23;
            var8.panY = var29 - var25;
            return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(824432247, 24) != 0);
         } else {
            return (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253061, 4) != 0);
         }
      }
   }

   public boolean hasViewportTransform(EditorSession var1) {
      if ((1877013762 * 1877013762 + 1877013762 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.previewViewport != null) {
         return ((!var1.previewMode && (var1.editMode || !var1.runtimeZoomEnabled)
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005596, 0)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711794, 2)) != 0);
      } else {
         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295680084, 17) != 0);
      }
   }

   public boolean isRuntimeZoomActive(EditorSession var1) {
      if ((-1001068519 * -1001068519 + -1001068519 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && !var1.editMode && var1.runtimeZoomEnabled && var1.previewViewport != null
            ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 5)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 3)) != 0);
      }
   }

   public double resolveZoomMin(EditorSession var1) {
      if ((1465684977 * 1465684977 + 1465684977 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.isRuntimeZoomActive(var1) ? var1.runtimeZoomMin : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(5259009063081674000L, 54));
      }
   }

   public double resolveZoomMax(EditorSession var1) {
      if ((1926727448 ^ 1926727448) != 0) {
         throw new IllegalStateException();
      } else {
         return this.isRuntimeZoomActive(var1) ? var1.runtimeZoomMax : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4298663710353657157L, 61));
      }
   }

   public PreviewViewport configureRuntimeZoom(EditorSession var1, ConfigurationSection var2, double var3, double var5) {
      if ((1180879970 * 1180879970 + 1180879970 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (!var2.getBoolean(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("dSqEfjnlAv6K9TCinSOElbqOlclBtLCUYaeUXAXuKs5GDD3wlQFxlPX8z+gf7udcW5tbisNUxU73k5Vf9kEHimEr"),
            var2.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("uOE1vDn0E+taKePw6zm/Y4TXlsWTHVNw8UkfbWa7lsrrluBCmgGXk+IvQKtAffR1x8I="),
               (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(366501399, 30) != 0)
            )
         )) {
            return null;
         } else {
            double var7 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8042583903838152518L, 52)), var3);
            double var9 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6235510899452759117L, 42)), var5);
            double var11 = this.readDouble(
               var2,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("4AwBRmEAmmKdzdgrFsuaSbgSwr6Htl3eG4Qvkt5CHoU6q0+qlrg5mblz/bAuorKzVarEe3Hq42MlBg=="),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("t4bijf8ys9Zwxmo10Cwt3Zxp59UA3mLFSPlOcS03JRMJSrmwTt+3U1VmGXJsjfAbRyoti4OcpP2OpKqSfvZt7W+P"),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-5631824928356791704L, 6))
            );
            double var13 = this.readDouble(
               var2,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("4x2uEV+jCqqxgC2GvroPpv34za9JY2UNi9BI6XuXgJpNGFsgFbk4PPJGjwjiUHc0sKjgpougczTKcA=="),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zhk0hGdW/vhI0/VUhAlYneXFaD1lb8e8kMBT1zQLBHSAo8ejDXCDQfh4ed+ExrhdtOz9xH+eB+ivf1sQlYMY1M+N"),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571900214L, 19))
            );
            if (!Double.isFinite(var11)) {
               var11 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(7445274851034142055L, 35));
            }

            if (!Double.isFinite(var13)) {
               var13 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581569673078L, 23));
            }

            var11 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-6454306160961852535L, 59)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(7633321598643329197L, 5)), var11)
            );
            var13 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(717956459671470371L, 46)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104453527366L, 29)), var13)
            );
            if (var13 < var11) {
               double var15 = var11;
               var11 = var13;
               var13 = var15;
            }

            double var27 = this.readDouble(
               var2,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("NB/dzQbfpgqzg1Chkr3nr1UwpKOKU6EeLIdzOEdRBuLnAKLp9RIZtLR4eiipRnTw5liALfp2f2+uZUFmpPDoCdJx"),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("yVLCuMUzw8tyNBkrUat83b6BHkinp8JiIaT9k1ekjC3+7XBl4Ern3IHr/YqDjS96QCYlLxEd0Yaaj/SHJCcs1AhXQZwTWGT3IhY="),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2589711536120475995L, 52))
            );
            if (!Double.isFinite(var27)) {
               var27 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3824912243980116472L, 47));
            }

            var27 = Math.max(var11, Math.min(var13, var27));
            double var17 = this.readDouble(
               var2,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Y9IQN0F7nPKTocic5eobocv1RZ0/Pm28iatrtOjaVg4r95LpqwCuE3GSw70sah2IMsW4VtQ5G7loJzMt"),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Sp5C6L0ufVfwyG4XCgSZCuh86IOPSniqzlvkLwG0oVHiH2Cm4IFTbS/lJtTi5QkmjdmbbztLCPX99p9lFJ0="),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3438113329344192783L, 5))
            );
            if (!Double.isFinite(var17)) {
               var17 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(4502327957539469821L, 28));
            }

            double var19 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581705190262L, 29));
            if (!var2.isConfigurationSection(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("tOWXpLdC70wyDmKMRJhkF/R3r5UPu4tjRyEZzIrGulS0hEnyfbnRtQ7kXMds5ze50ZMxhGmvOQ34RLbfHtIfTwdmMHDl8Q==")
            )) {
               var19 = this.readDouble(
                  var2,
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("tOWXpLdC70wyDmKMRJhkF/R3r5UPu4tjRyEZzIrGulS0hEnyfbnRtQ7kXMds5ze50ZMxhGmvOQ34RLbfHtIfTwdmMHDl8Q=="),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("FeHurJ/0uY/4fPU2NmQT3XzixvWZ+Diz2oE+WD9QLYm5GJ9A+if6cM7seFDGdck5DDRvswkM4Oi4TLoZAg2k0DWOqW7lTg=="),
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3016643874413342826L, 56))
               );
            }

            if (!Double.isFinite(var19)) {
               var19 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8437067089767934119L, 2));
            }

            double var21 = this.readDouble(
               var2,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Zh7Ydardu82EkXAHYMN/ypIV9jU/31VIbybgHCG8LGNQxgmU5mqJuWRa8FD33+H2EwOzU3j+RY7uJnf0NKzF0paHpXue8Ltd"),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("e+w0rdc2Yfgjv/tGxexKBJuHrSkv0B5xmhXoyZY5LSr+YOEYHYQj6YUrqi5mOVNTeLfwKGIImt+TSf1NMtg3JNNLXbc="),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(5193293452112756875L, 12))
            );
            if (!Double.isFinite(var21)) {
               var21 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1434603525123958147L, 54));
            }

            double var23 = this.readDouble(
               var2,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                  "NCUkn6yVBx0fwWI6RJum0+fozhALuCVVuOFVRDfPdsfbv51OBDqJNkgnOctllemDL3KNDe3jSuZ7yHahhfqFLwH13WS1kS2hXXP+YKH2vDI="
               ),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2L+NUCOTcSItTY6Ez0NTdBnZhNq21WHk/RIbh9IgQDnN5yp6NlsBrK5pKv6wOoB4DNe21349fVbuz7+9TfpFV6qXbFKPCgGz1K16tNqQ"),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(4212042710026904374L, 8))
            );
            if (!Double.isFinite(var23)) {
               var23 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-561519563524572639L, 39));
            }

            var1.runtimeZoomEnabled = (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-664922283, 6) != 0);
            var1.runtimeZoomMin = var11;
            var1.runtimeZoomMax = var13;
            var1.runtimeZoomStep = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-8495849091290263617L, 11)), var17);
            var1.runtimeZoomPanEnabled = var2.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("3r7kZ8gqQRMYKcqbEhkrywYWCzAsGctNvw2R1gr+mBDRVw9Yl0RyIkpbZZMvZVslqNYAn/eg33FijCFI8+kyHKqiPODPufsg9Mo="),
               (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 23) != 0)
            );
            var1.runtimeZoomPanRequireSneak = var2.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                  "1y1IHQisA9mO+FhSJsBtLqrgIpWpGW9R1QHuvzdql8HkV8ZkNFhv0N0/gH1MABW0/wMZ28qmgIf0jC5+uXrLL7T2PL7trQbXFlKDDHR42tDAd3BWC3g="
               ),
               var2.getBoolean(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "LZO12aeAm4kYz87Rr6x5YBCuvt22Y4SM8UP6ZekNY4pK9ampo/bU1ARTuxun3UE2DQywcvITuBngFmxQPmnXi7uG6I4Tqozk9FluAlul1keFgBf3"
                  ),
                  (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253061, 4) != 0)
               )
            );
            var1.runtimeZoomPanFollowZoom = var2.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                  "vcXgATLXAlH4+XkZMEjQdVyGTb9odB6k+usPDooEnyBNDbYK/BGw5ORCBnfGrmsUOKeiMynI3v9tUYe1YzJAnDp8cftDx6KFLE3Bs78goS5BXw=="
               ),
               var2.getBoolean(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "ynal05Jrd0n7uP8DA7XSBtAiVAznF4yJCZdgZ5WsBVic2Pd4ZQdysVCCizHaAUWnWvZ6DxtTsW/vFtdf89CjwvixOmXgjyAUnW2smRZMkVg="
                  ),
                  (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 27) != 0)
               )
            );
            var1.runtimeZoomPanLimitLeft = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 19)),
               this.readDouble(
                  var2,
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "sxt8kshaWGRBH8KaV+ePVPgcZcn35EvPDDQdGLdX2dRXUqfEhlIQ9CfzURq8uAsOB3lxrUy+MWhIVAg+OoCAYiH08Mvi8EHLylKP2pHhGVE="
                  ),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("lQ7B4AnzK2SJ0oICEleoA7NhpswQpJnvRMMOqUw08emV1DC9S9h6rWM4TobZmvrYNalPV/vuX4uT4aBy1ob0dfezhgA="),
                  var19
               )
            );
            var1.runtimeZoomPanLimitRight = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 7)),
               this.readDouble(
                  var2,
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "oprGCOFdID2hsqQHiRvPUxm8mY6Im7mFWWwjZsbxgOPZrhAg5cGBgj396TR82Ir3R0ZBJCOosKcxO4669PKScWSy8BfkUilnMipAfO0QDypghw=="
                  ),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QqyqOyIfvL6IzD6EmOm5IckOd2foVibtFX+zBRM+xH6GfowjwA2aRimxOpGt3PwmVLiA6mx+2emRci/LzE496+VnSbqhrQ=="),
                  var19
               )
            );
            var1.runtimeZoomPanLimitUp = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4608847734800978427L, 3)),
               this.readDouble(
                  var2,
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "bw7psU8ABSTdvBFRj2DGN0SzeN1aBhWJ1gKAj+GTqb7sVoInXDG94SJxdiMHl9XtpeyJA/oZrsaHOtFB3sPm7qiI2QLP+RcveMzWXw=="
                  ),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zpcJ13HPkwbjxffof3JTyOyZIKM7u9C4qPKUWp4bi6NSPQj5/JiRNNcRfzqNpZHWQBraTEjIxdgw/TkVQfiPIavt"),
                  var19
               )
            );
            var1.runtimeZoomPanLimitDown = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 10)),
               this.readDouble(
                  var2,
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "r5HmvtQ9irpm5o1RX3ec5plPnufNmlYB2lkrUP/CoIZxrqdXNdPuBxOxknpl3UhKxDAD1Hw2JyJKUCyTGA+X1jn1+wxYk8f7fE1DZqnc7ek="
                  ),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("sJRoKtDINaDwjGPDDFvrgewa9XpgXBQGeqhTVNjIQBVQt9FvuH2chxnlmm9KmGD6anm7CwL+eXeTEf5XYZ00CtW7W6qfly6a"),
                  var19
               )
            );
            var1.runtimeZoomPanRubber = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-3561309941229144812L, 63)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605992770L, 14)), var21)
            );
            var1.runtimeZoomPanSnapTicks = (int)Math.max(
               Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4267890106024612011L, 30),
               Math.min(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3783001512900385313L, 60), Math.round(var23))
            );
            return new PreviewViewport(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 19)),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8083398727646788247L, 54)),
               var7,
               var9,
               var7,
               var9,
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-1123927876778600262L, 63)),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(2906402433443305216L, 13)),
               var27
            );
         }
      } else {
         return null;
      }
   }

   public double[] clampRuntimePanToConfiguredRange(EditorSession var1, double var2, double var4) {
      if ((-1165031099 * -1165031099 + -1165031099 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         PreviewViewport var6 = var1.previewViewport;
         double var7 = this.getPreviewScale(var1);
         double var9 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 51));
         double var11 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5320929365408254567L, 6));
         if (var1.runtimeZoomPanFollowZoom) {
            var9 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4559893236831950243L, 56)),
               (var6.pageWidth * var7 - var6.previewWidth) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606005062L, 15))
            );
            var11 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-5802287819987300717L, 15)),
               (var6.pageHeight * var7 - var6.previewHeight) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769204L, 3))
            );
         }

         double var13 = -(var9 + var1.runtimeZoomPanLimitRight);
         double var15 = var9 + var1.runtimeZoomPanLimitLeft;
         double var17 = -(var11 + var1.runtimeZoomPanLimitDown);
         double var19 = var11 + var1.runtimeZoomPanLimitUp;
         double[] var10000 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1780982249, 30)];
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394642806, 12)] = Math.max(var13, Math.min(var15, var2));
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1427362037, 29)] = Math.max(var17, Math.min(var19, var4));
         return var10000;
      }
   }

   public void clampRuntimePanIntoBounds(EditorSession var1) {
      if ((-484951849 * (-484951849 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.isRuntimeZoomActive(var1)) {
         PreviewViewport var2 = var1.previewViewport;
         double[] var3 = this.clampPreviewPanToVisibleRange(var1, var2.panX, var2.panY);
         var2.panX = var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 31)];
         var2.panY = var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-2125582710, 29)];
      }
   }

   public double resolveRotationVisualYOffset(double var1, double var3) {
      if (((-514200781 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6452359211001069144L, 58));
      } else {
         double var5 = this.normalizeRotationForComparison(var1);
         double var7 = Math.abs(var5);
         if (var7 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4745648552139534349L, 49))) {
            return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1123039402128378813L, 40));
         } else {
            double var9 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1637893690188058957L, 3)), var3);
            double var11 = Math.min(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039345704655398726L, 49)),
               var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4267890105220985003L, 30))
            );
            double var13 = -var9 * var11;
            double var15 = -var9 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(7940849294397809401L, 29)) * Math.sin(Math.toRadians(var5));
            return var13 + var15;
         }
      }
   }

   public double resolveRotationVisualXOffset(double var1, double var3) {
      if ((-1215086836 * (-1215086836 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6629476044216020704L, 63));
      } else {
         double var5 = this.normalizeRotationForComparison(var1);
         if (Math.abs(var5) <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1071700269697171562L, 52))) {
            return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1691135932520313155L, 25));
         } else {
            double var7 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7606718802890073926L, 59)), var3)
               * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(2426157664050394772L, 46));
            return -var7 * Math.sin(Math.toRadians(var5));
         }
      }
   }

   public double[] resolveItemDisplayRotationOffset(double var1, double var3, double var5) {
      if ((78372263 ^ 78372263) != 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         double[] var37 = new double[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431108, 5)];
         var37[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1196506384, 25)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1205769502498106763L, 20));
         var37[Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257777, 0)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3721358533120101701L, 61));
         return var37;
      } else {
         double var7 = var1 % Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3016657343430783082L, 56));
         if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3556194388787582258L, 36))) {
            var7 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347422407729963894L, 48));
         }

         double var9 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104706692934L, 27)), var3);
         double var11 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581540672374L, 27)), var5);
         double var13 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(45412538022551644L, 7));
         double var15 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 63));
         double var17 = var9 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571718262L, 19));
         double var19 = var11 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(9084933416031738895L, 4));
         double var21 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(828684505527002588L, 60));
         double var25 = -var9 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8036948906745800518L, 53));
         double var27 = var11 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606520134L, 21));
         if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3117755446287050279L, 41))) {
            double var33 = var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(374975827507241814L, 7));
            double[] var36 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253093, 4)];
            var36[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823786374, 13)] = this.lerp(var13, var17, var33);
            var36[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461142, 5)] = this.lerp(var15, var19, var33);
            return var36;
         } else if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6728989043188285690L, 52))) {
            double var32 = (var7 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205010559215430L, 38)))
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(8715642337397400374L, 8));
            double[] var35 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461110, 5)];
            var35[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295680084, 17)] = this.lerp(var17, var21, var32);
            var35[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461142, 5)] = this.lerp(var19, var11, var32);
            return var35;
         } else if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(7028713348668840109L, 5))) {
            double var31 = (var7 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351572997301110L, 35)))
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6230295978708839393L, 23));
            double[] var34 = new double[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1589236086, 18)];
            var34[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956104, 1)] = this.lerp(var21, var25, var31);
            var34[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1454494070, 27)] = this.lerp(var11, var27, var31);
            return var34;
         } else {
            double var29 = (var7 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104454058822L, 29)))
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351616087745398L, 37));
            double[] var10000 = new double[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588695414, 13)];
            var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 7)] = this.lerp(var25, var13, var29);
            var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 3)] = this.lerp(var27, var15, var29);
            return var10000;
         }
      }
   }

   public double[] resolveItemDisplayNonBlockRotationOffset(double var1, double var3, double var5) {
      if (((-2033389192 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         double[] var37 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735598653, 12)];
         var37[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279688418, 11)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2590836336515690843L, 52));
         var37[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1846854760, 31)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 22));
         return var37;
      } else {
         double var7 = var1 % Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(7927090190142497654L, 0));
         if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 12))) {
            var7 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8921929661230314823L, 18));
         }

         double var9 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(558316703351001838L, 59)), var3);
         double var11 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-132762053570217954L, 5)), var5);
         double var13 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 23));
         double var15 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5986152116296089278L, 24));
         double var17 = var9 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2233439011795241065L, 16));
         double var19 = var11 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-2310610284364303733L, 29));
         double var21 = var9 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(1920520703026514491L, 53));
         double var23 = var11 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-1510672883088179854L, 51));
         double var25 = var9 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7882657581109371568L, 3));
         double var27 = var11 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4466878023590482129L, 17));
         if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571246502L, 21))) {
            double var33 = var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4473746423086225264L, 62));
            double[] var36 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005598, 0)];
            var36[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 5)] = this.lerp(var13, var17, var33);
            var36[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348415855, 7)] = this.lerp(var15, var19, var33);
            return var36;
         } else if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(3456092206768838842L, 0))) {
            double var32 = (var7 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(374975827507241814L, 7)))
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(4949176220730513637L, 7));
            double[] var35 = new double[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 15)];
            var35[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7)] = this.lerp(var17, var21, var32);
            var35[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823778182, 13)] = this.lerp(var19, var23, var32);
            return var35;
         } else if (var7 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347633870444782454L, 50))) {
            double var31 = (var7 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-8837793286035738417L, 17)))
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4267890105220722859L, 30));
            double[] var34 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(841209463, 24)];
            var34[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 10)] = this.lerp(var21, var25, var31);
            var34[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005597, 0)] = this.lerp(var23, var27, var31);
            return var34;
         } else {
            double var29 = (var7 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(2270748036512479138L, 35)))
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3016692527802871914L, 56));
            double[] var10000 = new double[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711806, 2)];
            var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 6)] = this.lerp(var25, var13, var29);
            var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711806, 3)] = this.lerp(var27, var15, var29);
            return var10000;
         }
      }
   }

   public double lerp(double var1, double var3, double var5) {
      if ((-148031754 * -148031754 + -148031754 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 + (var3 - var1) * var5;
      }
   }

   public double normalizeRotationForComparison(double var1) {
      if ((604856504 * 604856504 - 604856504 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = var1 % Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1542315003276149694L, 19));
         if (var3 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-6950917291526334278L, 62))) {
            var3 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(5795852950676146046L, 15));
         }

         if (var3 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1581054143475003058L, 3))) {
            var3 -= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(7649888785768137712L, 48));
         }

         return var3;
      }
   }

   public double[] rotateTopLeftAroundPivot(double var1, double var3, double var5, double var7, double var9, double var11, double var13) {
      if (((490736252 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (Double.isFinite(var13) && !(Math.abs(var13) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8251753188576510605L, 24)))) {
         double var15 = var1 + var5 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7823032322492213062L, 58));
         double var17 = var3 + var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7606859540378429254L, 59));
         double var19 = Math.toRadians(var13);
         double var21 = Math.cos(var19);
         double var23 = Math.sin(var19);
         double var25 = var15 - var9;
         double var27 = var17 - var11;
         double var29 = var9 + var25 * var21 - var27 * var23;
         double var31 = var11 + var25 * var23 + var27 * var21;
         double[] var33 = new double[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 15)];
         var33[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663929, 9)] = var29
            - var5 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8043708704233367366L, 54));
         var33[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-256201022, 17)] = var31
            - var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4762407206239618482L, 17));
         return var33;
      } else {
         double[] var10000 = new double[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431141, 0)];
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 20)] = var1;
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 13)] = var3;
         return var10000;
      }
   }

   public double normalizeRenderRotation(double var1) {
      if ((-1036099682 ^ -1036099682) != 0) {
         throw new IllegalStateException();
      } else {
         return !Double.isFinite(var1) ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(2906402433443305216L, 13)) : -var1;
      }
   }

   public void clearOutlineHud(Player var1, String var2) {
      if (((-1440745377 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = Xqedii_wsi1dey81hxa(var2);
         this.removeBaseHud(var1, var3);
         this.removeRoundedParts(var1, var3);
      }
   }

   public void removeRoundedParts(Player var1, String var2) {
      if ((-294800763 * -294800763 + -294800763 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.removeHudById(var1, Xqedii_3d481hnvdv05k(var2));
         this.removeHudById(var1, Xqedii_1069p3eqq0e76(var2));
         this.removeHudById(var1, Xqedii_opl74kanj3uk(var2));
         this.removeHudById(var1, Xqedii_mjwfnzfp1rxy(var2));
         this.removeHudById(var1, Xqedii_3s8bcosgeac70(var2));
         this.removeHudById(var1, Xqedii_1tx6agtp580qp(var2));
         this.removeHudById(var1, Xqedii_2nwbjvuqzhdtw(var2));
         this.removeHudById(var1, Xqedii_odkg7ngqxwzg(var2));
         this.removeHudById(var1, Xqedii_3kb35y89cxs0w(var2));
      }
   }

   public void removeBaseHud(Player var1, String var2) {
      if (((-231884035 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.removeHudById(var1, var2);
      }
   }

   public void removeHudById(Player var1, String var2) {
      if ((1670606973 * 1670606973 - 1670606973 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Entity var3 = this.hudService.getHud(var1, var2);
         if (var3 != null) {
            this.hudService.removeHudX(Collections.singletonList(var3), (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279688418, 11) != 0));
         }

         var1.removeMetadata(Xqedii_30zbgtchnp16r(var2), this.plugin);
      }
   }

   public void setHudTextIfExists(Player var1, String var2, String var3) {
      if ((-557072966 * -557072966 + -557072966 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Entity var4 = this.hudService.getHud(var1, var2);
         if (var4 != null) {
            this.hudService.setHudText(var4, var3, null, (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 17) != 0));
         }
      }
   }

   public String applyPlaceholderApiIgnoringMode(Player var1, String var2) {
      if (((2111053418 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.resolvePlaceholders(var1, var2, (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647572747, 14) != 0));
      }
   }

   public String resolveBlockPlaceholders(Player var1, EditorSession var2, ConfigurationSection var3, String var4) {
      if ((-866928311 * (-866928311 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.shouldResolvePopupPlaceholderIn(var2, var3) ? this.applyPlaceholderApiIgnoringMode(var1, var4) : this.applyPlaceholderApi(var1, var4);
      }
   }

   public boolean shouldResolvePopupPlaceholderIn(EditorSession var1, ConfigurationSection var2) {
      if ((-1828019391 * -1828019391 + -1828019391 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var1 != null && var1.editMode) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1156857110, 3)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 29)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kEKhxK6rpWpU0ftM4Np6kxV2sZ6gUGiV8HdyPnD3PPOpnXDLujEve+qy81jDIyVTRp0AIk4UqDezj924pJqz1MRVxiFQ/SH6nno=")
         );
         String var3 = this.firstNonBlank(var10001);
         if (!var3.isBlank()
            && var3.toLowerCase(Locale.ROOT).contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jv7a/bFosphsPXn2D/GBBCT+NXs50gAnqTcD2YRj7NxxChz7oM0="))) {
            return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207928, 6) != 0);
         } else {
            var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2019448673, 16)];
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 21)] = var2.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y+AE5iFMME0IVq9lvP2vOjDPJMlZGC9idv+krHWjDME=")
            );
            var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094921, 3)] = var2.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("NCPGhwHa+F6GdlRVfgjlLS+lyQu5bLl2Jm6M5+aB8xfVzD+G/y4YSTKawZpiyNI6fi87KuXzfAzkESEU0t5IbQ==")
            );
            String var4 = this.firstNonBlank(var10001);
            return ((!var4.isBlank()
                  && var4.toLowerCase(Locale.ROOT).contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jv7a/bFosphsPXn2D/GBBCT+NXs50gAnqTcD2YRj7NxxChz7oM0="))
               ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 16)
               : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 22)) != 0);
         }
      } else {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 2) != 0);
      }
   }

   public double readRuntimeNumericValue(Player var1, EditorSession var2, ConfigurationSection var3, String var4, String var5, double var6) {
      if ((1108261502 * (1108261502 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 == null) {
         return var6;
      } else if (var3.contains(var4)) {
         return this.parseRuntimeNumericValue(var1, var2, var3.get(var4), var6);
      } else {
         return var3.contains(var5) ? this.parseRuntimeNumericValue(var1, var2, var3.get(var5), var6) : var6;
      }
   }

   public double parseRuntimeNumericValue(Player var1, EditorSession var2, Object var3, double var4) {
      if (((295136096 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var3 == null) {
         return var4;
      } else if (var3 instanceof Number var9) {
         return var9.doubleValue();
      } else {
         String var6 = var3.toString();
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279686370, 11)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1901954529, 26)] = var6;
         String var7 = this.firstNonBlank(var10001);
         if (var7.isBlank()) {
            return var4;
         } else {
            var7 = this.applyConstrainedNumericPlaceholder(var1, var2, var7);
            var7 = this.applyElementTextMetricPlaceholder(var1, var2, var7);
            if (var7.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1anGazytAqkFXd7mrqNXq2RIfGx2CBP+iW+j4rvr")) && var1 != null) {
               String var8 = this.isEditorContextSession(var2) ? this.applyPlaceholderApi(var1, var7) : this.applyPlaceholderApiIgnoringMode(var1, var7);
               var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735598653, 12)];
               var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628888, 31)] = var8;
               var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(391501918, 22)] = var7;
               var7 = this.firstNonBlank(var10001);
            }

            return this.parseDouble(var7, var4);
         }
      }
   }

   public String applyConstrainedNumericPlaceholder(Player var1, EditorSession var2, String var3) {
      if ((2048229525 * 2048229525 + 2048229525 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null && !var3.isBlank() && var3.indexOf(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588949366, 13)) >= 0) {
         Matcher var4 = Xqedii_2mql9fq.Xqedii_1zvnh9u.matcher(var3);
         StringBuffer var5 = new StringBuffer(var3.length());
         int var6 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591360167, 18);

         while (var4.find()) {
            String var7 = var4.group(Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-982116475, 28));
            RuntimeNumericPlaceholderConstraints var8 = this.parseNumericPlaceholderConstraints(var4.group(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 2)));
            if (var8 != null) {
               double var9 = this.resolveNumericPlaceholderWithConstraints(var1, var2, var8);
               if (Double.isFinite(var9)) {
                  var7 = this.toPlainNumericLiteral(var9);
                  var6 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591098023, 18);
               }
            }

            var4.appendReplacement(var5, Matcher.quoteReplacement(var7));
         }

         if (var6 == 0) {
            return var3;
         } else {
            var4.appendTail(var5);
            return var5.toString();
         }
      } else {
         return var3;
      }
   }

   public RuntimeNumericPlaceholderConstraints parseNumericPlaceholderConstraints(String var1) {
      if ((1440196394 * 1440196394 - 1440196394 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379684, 5)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 1)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            return null;
         } else {
            Matcher var3 = Xqedii_2mql9fq.Xqedii_3fsxtad.matcher(var2);
            if (!var3.find()) {
               return null;
            } else {
               int var4 = var3.start();
               String var5 = this.normalizeNumericPlaceholderId(var2.substring(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 28), var4));
               if (var5.isBlank()) {
                  return null;
               } else {
                  Matcher var6 = Xqedii_2mql9fq.Xqedii_koyr206.matcher(var2.substring(var4));
                  int var7 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(197321403, 11);
                  double var8 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581557429110L, 25));
                  double var10 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-7048707433773988190L, 60));
                  double var12 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(126041507867611886L, 59));

                  while (var6.find()) {
                     var7 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 17);
                     var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1427362037, 29)];
                     var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 10)] = var6.group(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588679030, 15));
                     String var14 = this.firstNonBlank(var10001).toUpperCase(Locale.ROOT);
                     double var15 = this.parseDouble(
                        var6.group(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711794, 1)),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606127974L, 18))
                     );
                     if (Double.isFinite(var15)) {
                        int var18 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431143, 1);
                        switch (var14.hashCode()) {
                           case -2032180703:
                              if (var14.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("JlclsEu2Clfz2C11owHHgYLznIN5F2iCyj8JjHYN+gvzpqIFCqReKrc7"))) {
                                 var18 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431141, 0);
                              }
                              break;
                           case 76100:
                              if (var14.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("wjeb0dZDZMGd4uTg4N9IJin1s3NVCGHSriuAKtpCCk3NzQ=="))) {
                                 var18 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1162951952, 25);
                              }
                              break;
                           case 76338:
                              if (var14.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("+g2dksKVY+K79rXyKCJzdJulxoftuFS2A42KdAkW+NhNHA=="))) {
                                 var18 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-982116475, 28);
                              }
                        }

                        switch (var18) {
                           case 0:
                              var8 = var15;
                              break;
                           case 1:
                              var10 = var15;
                              break;
                           case 2:
                              var12 = var15;
                        }
                     }
                  }

                  if (var7 == 0) {
                     return null;
                  } else {
                     if (Double.isFinite(var8) && Double.isFinite(var10) && var8 > var10) {
                        double var19 = var8;
                        var8 = var10;
                        var10 = var19;
                     }

                     return new RuntimeNumericPlaceholderConstraints(var5, var8, var10, var12);
                  }
               }
            }
         }
      }
   }

   public String normalizeNumericPlaceholderId(String var1) {
      if ((-1474674139 * -1474674139 - -1474674139 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-867633763, 22)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 14)] = var1;

         String var2;
         for (var2 = this.firstNonBlank(var10001).trim();
            !var2.isEmpty();
            var2 = var2.substring(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 17), var2.length() - Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1427362037, 29))
               .trim()
         ) {
            char var3 = var2.charAt(var2.length() - Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588713846, 11));
            if (var3 != Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578898904, 14) && var3 != Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1019561205, 19)) {
               break;
            }
         }

         return var2;
      }
   }

   public double resolveNumericPlaceholderWithConstraints(Player var1, EditorSession var2, RuntimeNumericPlaceholderConstraints var3) {
      if ((-273196566 * (-273196566 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null && var3.placeholderId() != null && !var3.placeholderId().isBlank()) {
         String var4 = Xqedii_2fjgvqvsv1kpr(var3.placeholderId());
         String var5 = var4;
         if (var1 != null) {
            var5 = this.isEditorContextSession(var2) ? this.applyPlaceholderApi(var1, var4) : this.applyPlaceholderApiIgnoringMode(var1, var4);
         }

         double var6 = this.parseDouble(var5, Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3335990265446046859L, 3)));
         if (!Double.isFinite(var6)) {
            var6 = var3.defaultValue();
         }

         if (!Double.isFinite(var6)) {
            return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2313431066655230208L, 2));
         } else {
            if (Double.isFinite(var3.minValue())) {
               var6 = Math.max(var6, var3.minValue());
            }

            if (Double.isFinite(var3.maxValue())) {
               var6 = Math.min(var6, var3.maxValue());
            }

            return var6;
         }
      } else {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606029646L, 16));
      }
   }

   public String toPlainNumericLiteral(double var1) {
      if ((1377275241 * (1377275241 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LSUPgkrjC0f0Cnuz0pHC6Htqn3djhrSERmLWV8jd");
      } else {
         BigDecimal var3 = BigDecimal.valueOf(var1).stripTrailingZeros();
         String var4 = var3.toPlainString();
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Hi+KbtEv86tsEgRmXN2hYV77WiPLDXAa7zJB1AroPkg=").equals(var4)
            ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LSUPgkrjC0f0Cnuz0pHC6Htqn3djhrSERmLWV8jd")
            : var4;
      }
   }

   public String applyElementTextMetricPlaceholder(Player var1, EditorSession var2, String var3) {
      if (((-1213365693 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var3 != null
         && !var3.isBlank()
         && var3.indexOf(Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2035769720, 24)) >= 0
         && var2 != null
         && var2.renderBlocks != null
         && !var2.renderBlocks.isEmpty()) {
         Matcher var4 = Xqedii_2mql9fq.Xqedii_2sskus6.matcher(var3);
         if (!var4.find()) {
            return var3;
         } else {
            StringBuffer var5 = new StringBuffer(var3.length());
            var4.reset();

            while (var4.find()) {
               String var6 = var4.group(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1320276342, 28));
               String var7 = var4.group(Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048820899, 10));
               String var8 = var4.group(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 11));
               String var9 = this.resolveElementDisplayTextById(var1, var2, var7);
               if (var9 != null) {
                  var8 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs=").equals(var6)
                     ? this.toPlainNumericLiteral(this.computeMinecraftTextPixelWidth(var9))
                     : this.toPlainNumericLiteral(var9.length());
               }

               var4.appendReplacement(var5, Matcher.quoteReplacement(var8));
            }

            var4.appendTail(var5);
            return var5.toString();
         }
      } else {
         return var3;
      }
   }

   public String resolveElementDisplayTextById(Player var1, EditorSession var2, String var3) {
      if (((-1183495864 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var3 != null && !var3.isBlank() && var2.renderBlocks != null) {
         HashMap var4 = new HashMap();
         int var5 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956104, 1);

         for (Map var7 : var2.renderBlocks) {
            var5++;
            if (var7 != null && !var7.isEmpty()) {
               ConfigurationSection var8 = this.mapToSection(var7);
               if (var8 != null) {
                  String var9 = this.resolveElementId(var8, var5, var4);
                  if (var3.equals(var9)) {
                     String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711926, 6)];
                     var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 18)] = var8.getString(
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kNpR/ulSy8FjmoVkepBFBvE1+rIVf6xwEqVNNMMFkh2QuV6R")
                     );
                     var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                        "Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA="
                     );
                     String var10 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                     if (!Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var10)) {
                        return null;
                     }

                     var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1555157366, 24)];
                     var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 21)] = var8.getString(
                        Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
                     );
                     var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647556363, 14)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                        "fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w=="
                     );
                     String var11 = this.firstNonBlank(var10001);
                     if (var11.indexOf(Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735742013, 12)) >= 0 && var1 != null) {
                        String var12 = this.isEditorContextSession(var2)
                           ? this.applyPlaceholderApi(var1, var11)
                           : this.applyPlaceholderApiIgnoringMode(var1, var11);
                        var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1129397520, 25)];
                        var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(807655031, 24)] = var12;
                        var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253077, 4)] = var11;
                        var11 = this.firstNonBlank(var10001);
                     }

                     return this.stripDisplayFormattingForMetrics(var11);
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public String stripDisplayFormattingForMetrics(String var1) {
      if ((740353675 ^ 740353675) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         String var2 = var1.replaceAll(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
               "EOOYsbNCb0AiEkafVa9HhrsKeKzpwi1uPoMIXOkX1WpvIHL5ApAjj/YwzEVvDFO3kT6Q+pIBEI+9WmIpxykLd4Jkx5ErXden6Xc5OyktAxQoEb1RmY4IW8Txf6Pg3JAgVuU="
            ),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
         );
         return var2.replaceAll(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kcwPf06OENpAzrBJ4DeNXqdoqpONeyV+SlulY6rrzyUxe+DPZZUB1cweajJVfOcz69ektBzeO558hJ3R+gThou0SXQ598M+Y4qY="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
         );
      } else {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      }
   }

   public double computeMinecraftTextPixelWidth(String var1) {
      if ((1547213864 ^ 1547213864) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         double var2 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1123039402128378813L, 40));

         for (int var4 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 22); var4 < var1.length(); var4++) {
            char var5 = var1.charAt(var4);
            String var6 = String.valueOf(var5);
            if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2gbkMdUDi5u/nojQJ0tde3IN4ayOwiN5Ucsh6EKfbmojeW1fKib9c4IJ").contains(var6)) {
               var2 += Character.isUpperCase(var5)
                  ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4895529522989326068L, 32))
                  : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6728990864254419194L, 52));
            } else if (var6.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("HIKSy86tXgx7oLwJhP9lqwKa61AdwxoUehDpbe7i"))) {
               var2 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(6826868280453780410L, 9));
            } else if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ym88Uy2hzJORatxi2bNiDKRTqsEu6qaooH6I0Xjt0nZe9sf/3kZIZMVu").contains(var6)) {
               var2 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104610697030L, 23));
            } else if (!var6.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("FRTJhCFQb/0A96u47QUzQH3BfvPWlqPP4Eq9X2Rf"))
               && !var6.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("PQuDNXXTXD7br7EG8rhVAjg3fHJX6rYAM+VzyXTy"))) {
               var2 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8984313014782549473L, 43));
            } else {
               var2 += Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581605348214L, 27));
            }
         }

         return var2;
      } else {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 19));
      }
   }

   public double resolveSkinModelUnit(double var1, double var3) {
      if (((-755617849 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var5 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-265524107140435907L, 6)), var1);
         double var7 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3544713492122627030L, 28)), var3);
         return Math.min(
            var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8469201653683127270L, 54)),
            var5 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581555009398L, 26))
         );
      }
   }

   public double[] resolveSkinModelBounds(HoverElement var1) {
      if (((-1622817209 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.baseLocation != null && var1.baseScale != null) {
         double var2 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347319627015086966L, 48)), var1.baseScale.getX());
         double var4 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8473322760702985190L, 54)), var1.baseScale.getY());
         double var6 = this.resolveSkinModelUnit(var2, var4);
         double var8 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581569678326L, 23)) * var6;
         double var10 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4492156504673365745L, 42)) * var6;
         double[] var12 = new double[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431138, 1)];
         var12[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 22)] = var1.baseLocation.getX()
            + (var2 - var8) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571770230L, 12));
         var12[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024804085, 19)] = var1.baseLocation.getY()
            + (var4 - var10) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5686140839783269201L, 59))
            + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5554692025659392849L, 59)) * var6;
         var12[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588695414, 13)] = var8;
         var12[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1488048502, 25)] = var10;
         return var12;
      } else {
         double[] var10000 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(999952875, 15)];
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 21)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 20));
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094921, 3)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1450571954996825180L, 13));
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1320276342, 27)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-5802287819987299989L, 15));
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431156, 3)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-9192126609212843910L, 8));
         return var10000;
      }
   }

   public double getInteractiveWidth(HoverElement var1) {
      if (((205942592 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.baseScale == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-580609566477492800L, 0));
      } else if (this.isSkinType(var1.type)) {
         return this.resolveSkinModelBounds(var1)[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-1663052508, 31)];
      } else {
         double var2 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104609141574L, 22)), var1.baseScale.getX());
         if (var1.itemDisplayBlock) {
            double var4 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039178707736995654L, 45)),
               var2 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-1404400818588483910L, 11))
            );
            double var6 = var4 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-2072510957142843526L, 8));
            return Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6235510899452759117L, 42)), var4 + var6);
         } else {
            return var2;
         }
      }
   }

   public double getInteractiveHeight(HoverElement var1) {
      if ((567029171 * 567029171 + 567029171 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.baseScale == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8040894504222074694L, 51));
      } else if (this.isSkinType(var1.type)) {
         return this.resolveSkinModelBounds(var1)[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1488048502, 25)];
      } else {
         double var2 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7174795451127572294L, 60)), var1.baseScale.getY());
         if (!var1.itemDisplay) {
            if (!Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var1.type)) {
               return var2;
            } else {
               return var1.playerHeadText ? this.getInteractiveWidth(var1) : this.Xqedii_10cqliw(var2);
            }
         } else if (var1.itemDisplayBlock) {
            double var4 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2322438265909971197L, 2)),
               var2 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6105281883184954489L, 57))
            );
            double var6 = var4 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(5492698800985488230L, 33));
            return Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(2233266813404007352L, 61)), var4 + var6);
         } else {
            return var2;
         }
      }
   }

   public double Xqedii_10cqliw(double var1) {
      if (((-1279165431 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605210182L, 20)),
            var1 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2378883381239681413L, 2))
         );
      }
   }

   public double getInteractiveLeftX(HoverElement var1) {
      if (((209796501 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.baseLocation == null || var1.baseScale == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 50));
      } else if (this.isSkinType(var1.type)) {
         return this.resolveSkinModelBounds(var1)[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(789285612, 13)] + var1.hitboxOffsetX;
      } else {
         double var2 = var1.baseLocation.getX();
         if (!var1.itemDisplay) {
            return var2 + var1.hitboxOffsetX;
         } else {
            double var4 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7931083529177016134L, 57)), var1.baseScale.getX());
            double var6 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606005070L, 15)), var1.baseScale.getY());
            double[] var8 = this.resolveItemDisplayRotationOffset(var1.rotationDeg, var4, var6);
            double var9 = var2 + var8[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 17)];
            double[] var11 = this.resolveItemDisplayNonBlockRotationOffset(var1.rotationDeg, var4, var6);
            var9 += var11[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663929, 9)];
            if (var1.itemDisplayBlock) {
               double var12 = Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-845567966259783842L, 24)),
                  var4 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-1153737563370253431L, 10))
               );
               var9 -= (var12 - var4) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581705986934L, 29));
               var9 -= var12 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-9044319172421198598L, 16));
            }

            return var9 + var1.hitboxOffsetX;
         }
      }
   }

   public double getInteractiveTopY(HoverElement var1) {
      if ((-1978218876 ^ -1978218876) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.baseLocation == null || var1.baseScale == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 29));
      } else if (this.isSkinType(var1.type)) {
         return this.resolveSkinModelBounds(var1)[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-256201022, 17)] + var1.hitboxOffsetY;
      } else {
         double var2 = var1.baseLocation.getY();
         double var4 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605992770L, 14)), var1.baseScale.getY());
         if (var1.itemDisplay) {
            double[] var12 = this.resolveItemDisplayRotationOffset(
               var1.rotationDeg, Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8003176307587032900L, 3)), var1.baseScale.getX()), var4
            );
            double var7 = var2 + var12[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831709, 8)];
            double[] var9 = this.resolveItemDisplayNonBlockRotationOffset(
               var1.rotationDeg, Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(1175159732994037947L, 1)), var1.baseScale.getX()), var4
            );
            var7 += var9[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 17)];
            if (var1.itemDisplayBlock) {
               double var10 = Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4895529522009956084L, 32)),
                  var4 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-7997896140905825095L, 32))
               );
               var7 -= (var10 - var4) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-602884751248922310L, 19));
               var7 -= var10 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-255906369324798990L, 24));
               var7 -= var10 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(1966756284940474664L, 34));
            }

            return var7 + var1.hitboxOffsetY;
         } else if (!Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var1.type)) {
            return var2 + var1.hitboxOffsetY;
         } else {
            double var6 = var1.playerHeadText ? this.Xqedii_10cqliw(var4) : this.getInteractiveHeight(var1);
            return var2 + (var4 - var6) + var1.hitboxOffsetY;
         }
      }
   }

   public double toInternalTextTopY(double var1, double var3) {
      if (((-1976499269 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var5 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606193414L, 18)), var3);
         double var7 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8043704306186856262L, 54)),
            var5 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-5601627261715219816L, 52))
         );
         return var1 - (var5 - var7);
      }
   }

   public boolean upsertHud(Player var1, String var2, Vector var3, Vector var4, String var5, int var6) {
      if ((1780135082 * (1780135082 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.upsertHud(var1, var2, var3, var4, var5, var6, TextAlignment.CENTER, Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1569837430, 18));
      }
   }

   public Vector resolveItemDisplayScale(Vector var1) {
      if ((-1857065760 * -1857065760 + -1857065760 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? null
            : new Vector(
               Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6850547760785008634L, 48)),
                  var1.getX() * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-8878898145119450660L, 52))
               ),
               Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4691784126334708707L, 61)),
                  var1.getY() * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(8868662791376483875L, 53))
               ),
               var1.getZ()
            );
      }
   }

   public boolean upsertItemHud(Player var1, String var2, Vector var3, Vector var4, ItemStack var5, int var6) {
      if ((1845324850 * 1845324850 + 1845324850 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.upsertItemHud(var1, var2, var3, var4, var5, var6, TextAlignment.CENTER);
      }
   }

   public boolean upsertItemHud(Player var1, String var2, Vector var3, Vector var4, ItemStack var5, int var6, TextAlignment var7) {
      if (((1758595743 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var5 == null) {
         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 2) != 0);
      } else {
         TextAlignment var8 = var7 == null ? TextAlignment.CENTER : var7;
         Vector var9 = this.resolveItemDisplayScale(var4);
         if (var9 == null) {
            return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 27) != 0);
         } else {
            EditorSession var10 = null;
            int var11 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628888, 31);
            int var12 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1137824848, 15);
            if (var1 != null) {
               var10 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
               var11 = this.resolveEditorHudTransitionTicks(var10);
               var12 = var10 != null && var10.suppressHudTransitionDuringStructureDeletion
                  ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279686370, 11)
                  : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2019317601, 16);
            }

            Entity var13 = this.hudService.getHud(var1, var2);
            if (var13 instanceof ItemDisplay var14) {
               int var20 = this.hudService.applyRenderClip(var14) ? 1 : 0;
               if (this.hudService.setHudAligned(var14, var8)) {
                  var20 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 19);
               }

               Vector var16 = this.hudService.getHudScale(var14);
               if (!this.sameVector(var16, var9)) {
                  this.hudService.setHudScale(var14, var9, var11, (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7) != 0));
                  var20 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048821923, 10);
               }

               Vector var17 = this.hudService.getHudLocation(var14);
               if (!this.sameVector(var17, var3)) {
                  this.hudService.moveHud(var14, var3, var11, var11);
                  var20 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(558771850, 31);
               }

               ItemStack var18 = var14.getItemStack();
               if (var18 == null || !var18.equals(var5)) {
                  var14.setItemStack(var5.clone());
                  var20 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(783003836, 23);
               }

               if (this.hudService.getHudOpacity(var14) != var6) {
                  this.hudService.setOpacity(var14, var6);
                  var20 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588719990, 13);
               }

               this.hudService.flushRenderClip(var14);
               return (var20 != 0);
            } else {
               if (var13 != null) {
                  this.removeBaseHud(var1, var2);
               }

               this.hudService
                  .addHud(var1, var2, var3, var9, var5.clone(), var8, TextAlignment.CENTER, (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20) != 0), var6);
               Entity var15 = this.hudService.getHud(var1, var2);
               if (var15 != null && var12 != 0) {
                  this.hudService.setHudNoTransition(var15);
                  this.hudService
                     .setHudScale(var15, var9, Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 6), (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1901954529, 26) != 0));
                  this.hudService.moveHud(var15, var3, Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 8), Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507639439, 10));
               }

               return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379684, 5) != 0);
            }
         }
      }
   }

   public boolean upsertHud(Player var1, String var2, Vector var3, Vector var4, String var5, int var6, TextAlignment var7) {
      if ((-403476509 * -403476509 + -403476509 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.upsertHud(var1, var2, var3, var4, var5, var6, TextAlignment.CENTER, var7, Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-1663052473, 31));
      }
   }

   public boolean upsertHud(Player var1, String var2, Vector var3, Vector var4, String var5, int var6, TextAlignment var7, int var8) {
      if (((600203113 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.upsertHud(var1, var2, var3, var4, var5, var6, TextAlignment.CENTER, var7, var8);
      }
   }

   public boolean upsertHud(Player var1, String var2, Vector var3, Vector var4, String var5, int var6, TextAlignment var7, TextAlignment var8, int var9) {
      if (((-476979067 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         TextAlignment var10 = var7 == null ? TextAlignment.CENTER : var7;
         EditorSession var11 = null;
         int var12 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 26);
         int var13 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 21);
         if (var1 != null) {
            var11 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
            var12 = this.resolveEditorHudTransitionTicks(var11);
            var13 = var11 != null && var11.suppressHudTransitionDuringStructureDeletion
               ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094921, 3)
               : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 27);
         }

         Entity var14 = this.hudService.getHud(var1, var2);
         if (var14 == null) {
            this.hudService.addHud(var1, var2, var3, var4, var5, var10, var8, (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-256332094, 17) != 0), var6);
            Entity var20 = this.hudService.getHud(var1, var2);
            if (var20 != null) {
               if (var13 != 0) {
                  this.hudService.setHudNoTransition(var20);
                  this.hudService
                     .setHudScale(var20, var4, Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 31), (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 25) != 0));
                  this.hudService.moveHud(var20, var3, Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(197321403, 11), Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 1));
               }

               this.hudService.setTextWrap(var20, var9);
            }

            return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 13) != 0);
         } else {
            int var15 = this.hudService.applyRenderClip(var14) ? 1 : 0;
            if (this.hudService.setHudAligned(var14, var10)) {
               var15 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1930575207, 20);
            }

            if (this.hudService.setTextAlignment(var14, var8)) {
               var15 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515554, 1);
            }

            if (this.hudService.setTextWrap(var14, var9)) {
               var15 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(789293804, 13);
            }

            Vector var16 = this.hudService.getHudScale(var14);
            if (!this.sameVector(var16, var4)) {
               this.hudService.setHudScale(var14, var4, var12, (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 11) != 0));
               var15 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-997238308, 26);
            }

            Vector var17 = this.hudService.getHudLocation(var14);
            if (!this.sameVector(var17, var3)) {
               this.hudService.moveHud(var14, var3, var12, var12);
               var15 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 7);
            }

            String var18 = this.hudService.getHudText(var14, null);
            if (!this.equalsNullable(var18, var5)) {
               this.hudService.setHudText(var14, var5, null);
               var15 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 17);
            }

            if (this.hudService.getHudOpacity(var14) != var6) {
               this.hudService.setOpacity(var14, var6);
               var15 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1454494070, 27);
            }

            this.hudService.flushRenderClip(var14);
            return (var15 != 0);
         }
      }
   }

   public Double getRoundedRotation(Entity var1) {
      if ((238473958 ^ 238473958) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null
               && var1.hasMetadata(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "cvvwHBMv1THikHwFznX1sdIkkveP/kqrCXfoc8F/55iemICwpsrB5AozNEKOxVES7DosIAZXSKR3LQT97Bl9WyOyC6fX68lElihaqg=="
                  )
               )
            ? ((MetadataValue)var1.getMetadata(
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                        "cvvwHBMv1THikHwFznX1sdIkkveP/kqrCXfoc8F/55iemICwpsrB5AozNEKOxVES7DosIAZXSKR3LQT97Bl9WyOyC6fX68lElihaqg=="
                     )
                  )
                  .get(Xqedii_101y7xo.Xqedii_32yuti7slijjp(-435914034, 21)))
               .asDouble()
            : null;
      }
   }

   public void applyElementTransformById(Player var1, String var2, double var3, boolean var5, boolean var6) {
      if ((-1544939631 * -1544939631 - -1544939631 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var7 = this.hudService.getHud(var1, var2);
         if (var7 != null) {
            this.applyElementTransform(var7, var3, var5, var6);
         }
      }
   }

   public void applyHudMirrorById(Player var1, String var2, boolean var3, boolean var4) {
      if (((-111094676 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         Entity var5 = this.hudService.getHud(var1, var2);
         if (var5 != null) {
            this.applyHudMirror(var5, var3, var4);
         }
      }
   }

   public void applyElementTransform(Entity var1, double var2, boolean var4, boolean var5) {
      if ((-1035729046 ^ -1035729046) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.applyHudMirror(var1, var4, var5);
         double var6 = this.normalizeRenderRotation(var2);
         Double var8 = this.getRoundedRotation(var1);
         if (var8 == null || Math.abs(var8 - var6) > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2058371550564573762L, 5))) {
            int var9 = var8 == null ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 3) : Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257777, 0);
            this.hudService
               .rotateHud(
                  var1,
                  new Vector(
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1657369011054005176L, 61)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 38)),
                     var6
                  ),
                  var9,
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RFczcloBP+mb6kttPKMxxaBFofnpyRbuT8qKiSrMAv9PrG05")
               );
            var1.setMetadata(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("cvvwHBMv1THikHwFznX1sdIkkveP/kqrCXfoc8F/55iemICwpsrB5AozNEKOxVES7DosIAZXSKR3LQT97Bl9WyOyC6fX68lElihaqg=="),
               new FixedMetadataValue(this.plugin, var6)
            );
         }
      }
   }

   public void applyHudMirror(Entity var1, boolean var2, boolean var3) {
      if (((612334996 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Vector var4 = this.hudService.getHudScale(var1);
         if (var4 != null) {
            double var5 = Math.abs(var4.getX());
            double var7 = Math.abs(var4.getY());
            double var9 = Math.abs(var4.getZ());
            Vector var11 = new Vector(var2 ? -var5 : var5, var3 ? -var7 : var7, var9);
            if (!this.sameVector(var4, var11)) {
               this.hudService
                  .setHudScale(var1, var11, Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 24), (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1196506384, 25) != 0));
            }
         }
      }
   }

   public boolean sameVector(Vector var1, Vector var2) {
      if ((-1289586584 ^ -1289586584) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         return ((Math.abs(var1.getX() - var2.getX()) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-320392431629283210L, 63))
               && Math.abs(var1.getY() - var2.getY()) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-6177031084917517528L, 25))
               && Math.abs(var1.getZ() - var2.getZ()) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3971566115342662548L, 51))
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711806, 3)
            : Xqedii_101y7xo.Xqedii_32yuti7slijjp(1929526631, 20)) != 0);
      } else {
         return ((var1 == null && var2 == null
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1605489014, 24)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 1)) != 0);
      }
   }

   public void setElementText(Player var1, HoverElement var2, String var3) {
      if (((-322978294 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.setElementText(var1, var2, var3, (Xqedii_101y7xo.Xqedii_32yuti7slijjp(999821803, 15) != 0));
      }
   }

   public void setElementText(Player var1, HoverElement var2, String var3, boolean var4) {
      if ((-1811394818 * -1811394818 + -1811394818 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DZ/R56ZXey1RsbxUNc5H4IlXpgz1iZVI3SdxUqeosnrQhXMY6QqtYw==").equals(var2.type)) {
            String[] var10002 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1599562104, 24)];
            var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1901954529, 26)] = var3;
            var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1969063393, 26)] = var2.text;
            var10002[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379716, 5)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            var2.text = this.firstNonBlank(var10002);
            this.clearOutlineHud(var1, var2.id);
            this.removeBaseHud(var1, var2.id);
            this.removeRoundedParts(var1, var2.id);
         } else {
            String var10001 = var2.text;
            String[] var10003 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(1558172964, 29)];
            var10003[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635277911, 8)] = var3;
            var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 26)] = var2.text;
            var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831453, 8)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            String var5 = this.preserveElementFontTag(var10001, this.firstNonBlank(var10003));
            if (!this.isRoundedElement(var2)) {
               Entity var20 = this.hudService.getHud(var1, var2.id);
               if (var20 != null) {
                  this.hudService.setHudText(var20, var5, null, (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 27) != 0));
               }

               if (var2.outlineSize > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8298407675524005182L, 5))) {
                  String var21 = this.applyOutlineColor(var5, var2.outlineColor);
                  var2.outlineText = var21;
                  this.setHudTextIfExists(var1, Xqedii_1vfeun3esbu36(var2.id), var21);
               }
            } else {
               this.setHudTextIfExists(var1, var2.id, var5);
               this.setHudTextIfExists(var1, Xqedii_2z7bu54k7uo8h(var2.id), var5);
               this.setHudTextIfExists(var1, Xqedii_2s3pm7huobuvf(var2.id), var5);
               this.setHudTextIfExists(var1, Xqedii_6y6df031y8om(var2.id), var5);
               this.setHudTextIfExists(var1, Xqedii_1jfpjafkptyu(var2.id), var5);
               this.setHudTextIfExists(var1, Xqedii_1g4g06t4b6lh(var2.id), var5);
               String[] var22 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431156, 4)];
               var22[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207992, 6)] = var2.roundedCornerUnicodeTopLeft;
               var22[Xqedii_101y7xo.Xqedii_32yuti7slijjp(306014067, 28)] = var2.roundedCornerUnicode;
               String var6 = this.firstNonBlank(var22);
               String[] var23 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711806, 2)];
               var23[Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628888, 31)] = var2.roundedCornerUnicodeTopRight;
               var23[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823778182, 13)] = var2.roundedCornerUnicode;
               String var7 = this.firstNonBlank(var23);
               String[] var24 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844437, 7)];
               var24[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 11)] = var2.roundedCornerUnicodeBottomLeft;
               var24[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-713681019, 28)] = var2.roundedCornerUnicode;
               String var8 = this.firstNonBlank(var24);
               String[] var25 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588973942, 17)];
               var25[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7)] = var2.roundedCornerUnicodeBottomRight;
               var25[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 11)] = var2.roundedCornerUnicode;
               String var9 = this.firstNonBlank(var25);
               String var10 = var4 ? this.withRoundedCornerBaseColor(var5, var6) : this.roundedCornerTextFromBody(var5, var6);
               String var11 = var4 ? this.withRoundedCornerBaseColor(var5, var7) : this.roundedCornerTextFromBody(var5, var7);
               String var12 = var4 ? this.withRoundedCornerBaseColor(var5, var8) : this.roundedCornerTextFromBody(var5, var8);
               String var13 = var4 ? this.withRoundedCornerBaseColor(var5, var9) : this.roundedCornerTextFromBody(var5, var9);
               this.setHudTextIfExists(var1, Xqedii_1jh5geouogx1m(var2.id), var10);
               this.setHudTextIfExists(var1, Xqedii_ejnz1iikl1l(var2.id), var11);
               this.setHudTextIfExists(var1, Xqedii_3vceuofqk216x(var2.id), var12);
               this.setHudTextIfExists(var1, Xqedii_32xhwkk2vv252(var2.id), var13);
               if (var2.outlineSize > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(168084861516798321L, 17))) {
                  String var14 = Xqedii_394enkwsykp6w(var2.id);
                  String var15 = this.applyOutlineColor(var5, var2.outlineColor);
                  var2.outlineText = var15;
                  this.setHudTextIfExists(var1, var14, var15);
                  this.setHudTextIfExists(var1, Xqedii_g5jusz92gh5n(var14), var15);
                  this.setHudTextIfExists(var1, Xqedii_766gm2638avf(var14), var15);
                  this.setHudTextIfExists(var1, Xqedii_1tk8ejn5uvek5(var14), var15);
                  this.setHudTextIfExists(var1, Xqedii_2r9fxrj3h46c1(var14), var15);
                  this.setHudTextIfExists(var1, Xqedii_2xab80atmuv2q(var14), var15);
                  String var16 = var4 ? this.withRoundedCornerBaseColor(var15, var6) : this.roundedCornerTextFromBody(var15, var6);
                  String var17 = var4 ? this.withRoundedCornerBaseColor(var15, var7) : this.roundedCornerTextFromBody(var15, var7);
                  String var18 = var4 ? this.withRoundedCornerBaseColor(var15, var8) : this.roundedCornerTextFromBody(var15, var8);
                  String var19 = var4 ? this.withRoundedCornerBaseColor(var15, var9) : this.roundedCornerTextFromBody(var15, var9);
                  this.setHudTextIfExists(var1, Xqedii_sx5ggz6039d6(var14), var16);
                  this.setHudTextIfExists(var1, Xqedii_ns60786b1gff(var14), var17);
                  this.setHudTextIfExists(var1, Xqedii_1tme9l2rr9s7s(var14), var18);
                  this.setHudTextIfExists(var1, Xqedii_1ksrz9kgwgo6m(var14), var19);
               }
            }
         }
      }
   }

   public String extractGlyphAtRC(String var1, int var2, int var3) {
      if ((1098114802 * 1098114802 - 1098114802 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1735267525, 23)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 4)] = var1;
         String var4 = this.firstNonBlank(var10001)
            .replace(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1+Mpqw3MIh8Oi5bxTs2tlolhFTRaZAkr4Pvymnkp2Nc="),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("TENBTf5UbVC1CvyclTEj2RpHPQHnZOkOHJkU+CU/")
            )
            .replace((char)Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1967453246, 27), (char)Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956116, 1));
         if (var4.isBlank()) {
            return null;
         } else {
            String[] var5 = var4.split(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("TENBTf5UbVC1CvyclTEj2RpHPQHnZOkOHJkU+CU/"), Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431205, 6)
            );
            ArrayList var6 = new ArrayList();
            int var7 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20);
            ArrayList var8 = new ArrayList();
            String[] var9 = var5;
            int var10 = var5.length;

            for (int var11 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 6); var11 < var10; var11++) {
               String var12 = var9[var11];
               if (var12 != null && !var12.isEmpty()) {
                  int var13 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 21);
                  int var14 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 30);

                  while (var14 < var12.length()) {
                     int var15 = var12.codePointAt(var14);
                     if (!new String(Character.toChars(var15)).isBlank()) {
                        var13 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 2);
                        break;
                     }

                     var14 += Character.charCount(var15);
                  }

                  if (var13 != 0) {
                     var6.addAll(var8);
                     var8.clear();
                     var6.add(var12);
                     var7 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 1);
                  } else if (var7 != 0) {
                     var8.add(var12);
                  }
               }
            }

            if (var2 >= var6.size()) {
               return null;
            } else {
               String var16 = (String)var6.get(var2);
               var10 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635277911, 8);
               int var18 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20);

               while (var18 < var16.length()) {
                  int var19 = var16.codePointAt(var18);
                  if (var10 == var3) {
                     String var20 = new String(Character.toChars(var19));
                     return var20.isBlank() ? null : var20;
                  }

                  var10++;
                  var18 += Character.charCount(var19);
               }

               return null;
            }
         }
      }
   }

   public String preserveElementFontTag(String var1, String var2) {
      if ((-796359164 * -796359164 - -796359164 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024410450, 9)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 6)] = var2;
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-997238308, 26)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         String var3 = this.firstNonBlank(var10001);
         if (!var3.isBlank() && !var3.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rKZX9zKkY72bZ5eZXTsovvpSgaLMeuzS6asEASiMCkManAQ24t9hXQ=="))) {
            var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 0)];
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 10)] = var1;
            String var4 = this.firstNonBlank(var10001);
            if (var4.isBlank()) {
               return var3;
            } else {
               Matcher var5 = Xqedii_2mql9fq.Xqedii_334czw8.matcher(var4);
               if (!var5.find()) {
                  return var3;
               } else {
                  String var6 = var5.group();
                  boolean var7 = var4.toLowerCase(Locale.ROOT)
                     .contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("I+Jzx9ha0rf4T2V3ItYr+AH1ii5Mr9X3k76M8bFfFLPioudyYQiQn9Bf"));
                  return var7 ? Xqedii_8qq5pvijxxkh(var6, var3) : Xqedii_3cup79eykm5hv(var6, var3);
               }
            }
         } else {
            return var3;
         }
      }
   }

   public boolean isRoundedElement(HoverElement var1) {
      if (((797464556 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 == null || !var1.roundedShape && !this.isRoundedType(var1.type)
            ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(1615310062, 25)
            : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936188, 2)) != 0);
      }
   }

   public void removeRenderedElementHud(Player var1, HoverElement var2) {
      if (((425106001 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         this.clearOutlineHud(var1, var2.id);
         if (this.isSkinType(var2.type)) {
            this.removeSkinParts(var1, var2.id);
            this.removeBaseHud(var1, var2.id);
         } else if (this.isInputType(var2.type)) {
            this.removeInputParts(var1, var2.id);
            this.removeBaseHud(var1, var2.id);
            this.removeRoundedParts(var1, var2.id);
         } else if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DZ/R56ZXey1RsbxUNc5H4IlXpgz1iZVI3SdxUqeosnrQhXMY6QqtYw==").equals(var2.type)) {
            this.removeBaseHud(var1, var2.id);
            this.removeRoundedParts(var1, var2.id);
         } else if (this.isRoundedType(var2.type)) {
            this.removeBaseHud(var1, var2.id);
            this.removeRoundedParts(var1, var2.id);
         } else {
            this.removeBaseHud(var1, var2.id);
         }
      }
   }

   public boolean shouldApplyRotationVisualShift(String var1) {
      if (((1395684404 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.isBlank()) {
         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647572747, 14) != 0);
      } else {
         return ((var1.endsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI="))
            ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831965, 8)
            : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578587608, 14)) != 0);
      }
   }

   public boolean shouldApplyShellRoundedTopShift(Player var1, String var2) {
      if ((-1727740294 * -1727740294 - -1727740294 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var2 != null
         && !var2.isBlank()
         && var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2hMnLfqQIneOZRHeRKyQ6bqXsB9TrvZbCRCsj1ad97+goK4+BYbjDTDLdYtByXgn2TtHAYe8"))) {
         EditorSession var3 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         return ((var3 != null && var3.editMode && var3.previewMode
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 16)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 14)) != 0);
      } else {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 18) != 0);
      }
   }

   public boolean isPreviewContentRuntimeId(String var1) {
      if ((1242811332 * 1242811332 + 1242811332 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !var1.isBlank()
            ? var1.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RALmDGbTjD6wCFRoO0uNUJxICh2+Vm2q7DQ1A2KyvcY3zp8stDOxMBdu4VdOTXM3A6f8ms5CiXW8t3uk"))
            : (Xqedii_101y7xo.Xqedii_32yuti7slijjp(75157222, 29) != 0);
      }
   }

   public double resolveRoundedRadiusScale(Player var1, String var2) {
      if ((1264642364 ^ 1264642364) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1691135932519567683L, 25));
      } else {
         EditorSession var3 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         if (var3 == null) {
            return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6764543730078270729L, 27));
         } else {
            if (this.isPreviewContentRuntimeId(var2)) {
               if (!var3.previewMode || var3.previewViewport == null) {
                  return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606003016L, 13));
               }
            } else if (!this.isRuntimeZoomActive(var3)) {
               return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205379215468358L, 40));
            }

            double var4 = this.getPreviewScale(var3);
            return Double.isFinite(var4) && !(var4 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 9)))
               ? var4
               : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8616228806862841670L, 61));
         }
      }
   }

   public double resolvePreviewCornerZoomOffset(double var1, double var3, double var5) {
      if (((1436787586 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var1)) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 38));
      } else if (var1 >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8655685029689639448L, 33))) {
         double var13 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(6486778008848902287L, 14)),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8469216084773241830L, 54))
         );
         double var14 = Math.min(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(7649824487960232944L, 48)),
            Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 10)),
               (var1 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4895529522009956084L, 32))) / var13
            )
         );
         return var3 * var14;
      } else {
         double var7 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7886288781021988362L, 4));
         double var9 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4424811548663940258L, 8)),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104609141574L, 22)) - var7
         );
         double var11 = Math.min(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205102994859846L, 31)),
            Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5320929365408254567L, 6)),
               (Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6169260013104594472L, 21)) - var1) / var9
            )
         );
         return var5 * var11;
      }
   }

   public boolean shouldSpawnOpacityVisual(String var1, int var2) {
      if ((-1043883635 * -1043883635 + -1043883635 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var2 > 0 ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711797, 0) : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 23)) != 0);
      }
   }

   public int applyVisibilityConditionOpacity(Player var1, EditorSession var2, ConfigurationSection var3, int var4) {
      if ((-1999317051 * -1999317051 + -1999317051 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null && var1 != null) {
         ConfigurationSection var5 = var3.getConfigurationSection(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("EMdJNCDIw97w/nHGZuFogJ308ymQxBVCS44hBfeFapgetFOuk+6kJi5VRgjkl14d")
         );
         if (var5 == null) {
            return var4;
         } else {
            String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1414480850, 31)];
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 4)] = var5.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("0nV2TfwcuKoMV4Yq8X2AmD/1gCP3YYxMO1KkjAZd4itLEOU90PNjNHLJoNuhrBRAhro=")
            );
            String var6 = this.firstNonBlank(var10001);
            if (var6.isEmpty()) {
               return var4;
            } else {
               boolean var7 = var5.getBoolean(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GI20q68aqDVJlTDINybtjWdPXkbNLYAUdO/TXxyKENUbXqkFxve4r7hp"),
                  (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 14) != 0)
               );
               int var8 = var6.lastIndexOf(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(408933668, 21));
               if (var8 >= 0 && var8 != var6.length() - Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999709142, 16)) {
                  String var9 = var6.substring(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 16), var8 + Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024410962, 9));
                  String var10 = var6.substring(var8 + Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956102, 1)).trim();
                  Matcher var11 = Xqedii_2mql9fq.Xqedii_cr845bn.matcher(var10);
                  if (!var11.matches()) {
                     return var4;
                  } else {
                     String var12 = var11.group(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711797, 0));
                     double var13 = this.parseDouble(
                        var11.group(Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(733002799, 31)),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3570177446069312887L, 10))
                     );
                     if (!Double.isFinite(var13)) {
                        return var4;
                     } else {
                        var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(824432247, 24)];
                        var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 5)] = var11.group(Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(399890526, 22));
                        String var15 = this.firstNonBlank(var10001);
                        double var16 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(771157501637877733L, 18));
                        double var18 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6293908583162507327L, 50));
                        double var20 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3317981426970616694L, 56));
                        if (!var15.isEmpty()) {
                           Matcher var22 = Xqedii_2mql9fq.Xqedii_koyr206.matcher(var15);

                           while (var22.find()) {
                              String var23 = var22.group(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 15)).toUpperCase(Locale.ROOT);
                              double var24 = this.parseDouble(
                                 var22.group(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711806, 2)),
                                 Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4988963555828596237L, 53))
                              );
                              if (Double.isFinite(var24)) {
                                 int var27 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484430885, 8);
                                 switch (var23.hashCode()) {
                                    case -2032180703:
                                       if (var23.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("JlclsEu2Clfz2C11owHHgYLznIN5F2iCyj8JjHYN+gvzpqIFCqReKrc7"))) {
                                          var27 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1156857102, 3);
                                       }
                                       break;
                                    case 76100:
                                       if (var23.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("wjeb0dZDZMGd4uTg4N9IJin1s3NVCGHSriuAKtpCCk3NzQ=="))) {
                                          var27 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588719990, 13);
                                       }
                                       break;
                                    case 76338:
                                       if (var23.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("+g2dksKVY+K79rXyKCJzdJulxoftuFS2A42KdAkW+NhNHA=="))) {
                                          var27 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 30);
                                       }
                                 }

                                 switch (var27) {
                                    case 0:
                                       var16 = var24;
                                       break;
                                    case 1:
                                       var18 = var24;
                                       break;
                                    case 2:
                                       var20 = var24;
                                 }
                              }
                           }
                        }

                        String var28 = this.applyConstrainedNumericPlaceholder(var1, var2, var9);
                        if (var28.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1anGazytAqkFXd7mrqNXq2RIfGx2CBP+iW+j4rvr"))) {
                           String var29 = this.isEditorContextSession(var2)
                              ? this.applyPlaceholderApi(var1, var28)
                              : this.applyPlaceholderApiIgnoringMode(var1, var28);
                           var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461110, 5)];
                           var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1137824848, 15)] = var29;
                           var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-433816882, 21)] = var28;
                           var28 = this.firstNonBlank(var10001);
                        }

                        double var30 = this.parseDouble(
                           var28, Double.isFinite(var20) ? var20 : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571751054L, 16))
                        );
                        if (!Double.isFinite(var30)) {
                           return var4;
                        } else {
                           if (Double.isFinite(var16) && var30 < var16) {
                              var30 = var16;
                           }

                           if (Double.isFinite(var18) && var30 > var18) {
                              var30 = var18;
                           }

                           int var31 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295811156, 17);
                           switch (var12.hashCode()) {
                              case 1921:
                                 if (var12.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("x/spKz4PRxQtUobIwejzliA/pjZV46Fb31dCYSY6NxQ="))) {
                                    var31 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(1558172964, 30);
                                 }
                                 break;
                              case 1951:
                                 if (var12.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("mtdQ/VdGpArQEuvzVzurXTKQGKL5cgAs1mBPbtlyAkc="))) {
                                    var31 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1585566070, 20);
                                 }
                                 break;
                              case 1953:
                                 if (var12.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("dbUUTkkjvc9Cy8HKY/4pbV5wvwYYwkCqDn9T4MXXWJc="))) {
                                    var31 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-664922283, 6);
                                 }
                                 break;
                              case 1983:
                                 if (var12.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Y+ZA4AHTb2qDAFp7KoqL9+k82iFUB3xHAYiKmjIxmaA="))) {
                                    var31 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2050656745, 20);
                                 }
                           }
                           int var26 = (var7 == ((switch (var31) {
                                    case 0, 1 -> var30 >= var13 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-9077811868344141571L, 34))
                                       ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711782, 4)
                                       : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 13);
                                    case 2, 3 -> var30 <= var13 + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4691784126334708707L, 61))
                                       ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 23)
                                       : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 1);
                                    default -> Math.abs(var30 - var13)
                                          < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-6584481461247221675L, 54))
                                       ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 18)
                                       : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 3);
                                 }) != 0))
                              ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094921, 3)
                              : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 13);
                           return var26 != 0 ? var4 : Xqedii_101y7xo.Xqedii_32yuti7slijjp(807655031, 24);
                        }
                     }
                  }
               } else {
                  return var4;
               }
            }
         }
      } else {
         return var4;
      }
   }

   public boolean isEditorToolShellBlockId(String var1) {
      if ((832445932 * 832445932 - 832445932 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2019317601, 16) != 0);
      }
   }

   public int resolveShellBlockInitialOpacity(EditorSession var1, String var2, ConfigurationSection var3, int var4) {
      if (((2082177332 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var4;
      }
   }

   public boolean shouldSkipShellBlockForSpawnRetoggle(EditorSession var1, String var2) {
      if ((-702076317 * -702076317 + -702076317 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 21) != 0);
      }
   }

   public boolean shouldRenderEditorShellBlock(EditorSession var1, String var2, ConfigurationSection var3) {
      if (((-1221801006 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1969063393, 26) != 0);
      }
   }

   public boolean shouldKeepHiddenShellBlockSpawned(EditorSession var1, String var2, ConfigurationSection var3, String var4) {
      if ((2031662558 ^ 2031662558) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 13) != 0);
      }
   }

   public boolean readHitboxShow(ConfigurationSection var1) {
      if (((-174207418 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("AMrU8rJtnxrh1oX2FgMQqigjOzGg9k+JEg5sjCEAWutP606A"))
            ? this.parseBooleanFlag(
               var1.get(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("AMrU8rJtnxrh1oX2FgMQqigjOzGg9k+JEg5sjCEAWutP606A")),
               (Xqedii_101y7xo.Xqedii_32yuti7slijjp(807655031, 24) != 0)
            )
            : (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207992, 6) != 0);
      }
   }

   public boolean parseBooleanFlag(Object var1, boolean var2) {
      if ((-455918056 * (-455918056 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else if (var1 instanceof Boolean var9) {
         return var9;
      } else if (var1 instanceof Number var8) {
         return ((var8.doubleValue() != Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 34))
            ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(1224056268, 30)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 26)) != 0);
      } else {
         String var3 = var1.toString().trim();
         if (var3.isEmpty()) {
            return var2;
         } else {
            String var4 = var3.toLowerCase(Locale.ROOT);
            int var5 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-480236837, 22);
            switch (var4.hashCode()) {
               case -1609594047:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("8kXtmoXC6AqlrashmuR0BsVlnOUdFLAXUZh2W8cCg73s9ToVHN0ls5Sq"))) {
                     var5 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-1663052508, 30);
                  }
                  break;
               case 3521:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("lnkTUVs3evjoHIiizYlA3t6t2MmLpfjfG95XmXCecKE="))) {
                     var5 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189906, 4);
                  }
                  break;
               case 3551:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rq8MBgbz9bD1FOVzkMByo3nftLbSKuY2J+OdbzazoO8="))) {
                     var5 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(480236836, 22);
                  }
                  break;
               case 109935:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("u5ycL5unMB9y9UyH0OwSAjo2Ip/t1j7+7P5YCYqve7o0FA=="))) {
                     var5 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-589787303, 18);
                  }
                  break;
               case 119527:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("vryg+IuPAomAee8aWk6EcSZ9UBcgEh9M2mJy91TwpM1bPg=="))) {
                     var5 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 12);
                  }
                  break;
               case 3387192:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DJ81UxGzJQq2JgmzWxnKXQu4hzHJ8STKpXcy1F2FZ5I0q+Kh"))) {
                     var5 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712310, 6);
                  }
                  break;
               case 3392903:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Cikb7P7SFTv7REF/5DyVKjDSJw5ThCBHafB1QChnUltW2Vjr"))) {
                     var5 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-514499195, 18);
                  }
                  break;
               case 3569038:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b/EK7uBZ8jXjxNtUaO3yrEi0sG8e7lbUxIvD/SoH0SrqD80V"))) {
                     var5 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1196506384, 25);
                  }
                  break;
               case 97196323:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QRmuTQFi1xwtmhJvUz6b7qH4dGcXTOgW42Lz1MNIzh7mOf/Zpys="))) {
                     var5 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257780, 0);
                  }
                  break;
               case 270940796:
                  if (var4.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("9L+vUkQ9cFR/RlG6Ckf5x3Pote+pfBKP4AznYcmxB/4TtYvmhPG/I0dXf30="))) {
                     var5 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(482333988, 20);
                  }
            }
            return switch (var5) {
               case 0, 1, 2, 3 -> Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711797, 0) != 0;
               case 4, 5, 6, 7, 8, 9 -> Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 12) != 0;
               default -> {
                  double var6 = this.parseDouble(var3, Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581373064054L, 32)));
                  yield Double.isFinite(var6)
                     ? (
                        var6 != Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 27))
                           ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29) != 0
                           : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16) != 0
                     )
                     : var2;
               }
            };
         }
      }
   }

   public boolean upsertRoundedPart(
      Player var1, String var2, double var3, double var5, double var7, double var9, double var11, String var13, int var14, boolean var15
   ) {
      if ((-963039097 * -963039097 + -963039097 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.upsertRoundedPart(var1, var2, var3, var5, var7, var9, var11, var13, var14, var15, TextAlignment.CENTER);
      }
   }

   public boolean upsertRoundedPart(
      Player var1, String var2, double var3, double var5, double var7, double var9, double var11, String var13, int var14, boolean var15, TextAlignment var16
   ) {
      if (((-1772936136 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!(var7 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7895089916530141002L, 4)))
         && !(var9 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-553754483292147651L, 6)))) {
         TextAlignment var17 = var16 == null ? TextAlignment.CENTER : var16;
         double var18 = var3;
         double var20 = var5;
         double var22 = var7;
         double var24 = var9;
         if (var15) {
            double var26 = Math.round(var3);
            double var28 = Math.round(var5);
            double var30 = Math.round(var3 + var7);
            double var32 = Math.round(var5 + var9);
            if (var30 <= var26) {
               var30 = var26 + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-9192126609212843910L, 8));
            }

            if (var32 <= var28) {
               var32 = var28 + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581557433206L, 26));
            }

            var18 = var26;
            var20 = var28;
            var22 = var30 - var26;
            var24 = var32 - var28;
         }

         Placement var34 = this.positionCalculator.calculateExactBoxPlacement(var18, var20, var11, var22, var24);
         return this.upsertHud(
            var1, var2, var34.location(), var34.scale(), var13, var14, var17, TextAlignment.CENTER, Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1644295947, 14)
         );
      } else {
         this.removeHudById(var1, var2);
         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588707702, 12) != 0);
      }
   }

   public void upsertRoundedCorner(
      Player var1, String var2, double var3, double var5, double var7, double var9, int var11, double var12, String var14, boolean var15
   ) {
      if (((1648610667 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.upsertRoundedCorner(var1, var2, var3, var5, var7, var9, var11, var12, var14, var15, TextAlignment.CENTER);
      }
   }

   public void upsertRoundedCorner(
      Player var1, String var2, double var3, double var5, double var7, double var9, int var11, double var12, String var14, boolean var15, TextAlignment var16
   ) {
      if ((-1135551126 * (-1135551126 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         boolean var17 = this.upsertRoundedPart(var1, var2, var3, var5, var7, var7, var9, var14, var11, var15, var16);
         Entity var18 = this.hudService.getHud(var1, var2);
         if (var18 != null) {
            Double var19 = this.getRoundedRotation(var18);
            if (var17 || var19 == null || Math.abs(var19 - var12) > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-6584481461247221675L, 54))) {
               int var20 = var19 == null ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 21) : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-997238308, 26);
               this.hudService
                  .rotateHud(
                     var18,
                     new Vector(
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4804475393836890113L, 16)),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 19)),
                        var12
                     ),
                     var20,
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RFczcloBP+mb6kttPKMxxaBFofnpyRbuT8qKiSrMAv9PrG05")
                  );
               var18.setMetadata(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "cvvwHBMv1THikHwFznX1sdIkkveP/kqrCXfoc8F/55iemICwpsrB5AozNEKOxVES7DosIAZXSKR3LQT97Bl9WyOyC6fX68lElihaqg=="
                  ),
                  new FixedMetadataValue(this.plugin, var12)
               );
            }
         }
      }
   }

   public void logRoundedCornerPosition(String var1, double var2, double var4) {
      if ((-2045197207 * (-2045197207 + 1) & 1) != 0) {
         throw new IllegalStateException();
      }
   }

   public void applyItemDisplayHeadOwner(ItemStack var1, String var2) {
      if ((-1095238043 ^ -1095238043) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.getType() == Material.PLAYER_HEAD) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 13)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 24)] = var2;
         String var3 = this.firstNonBlank(var10001);
         if (!var3.isBlank() && !var3.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1anGazytAqkFXd7mrqNXq2RIfGx2CBP+iW+j4rvr"))) {
            if (var1.getItemMeta() instanceof SkullMeta var5) {
               Player var6 = Bukkit.getPlayerExact(var3);
               if (var6 != null) {
                  PlayerProfile var8 = Xqedii_38o2zes.Xqedii_a93o0le(var6);
                  if (var8 != null) {
                     var5.setOwnerProfile(var8);
                  } else {
                     var5.setOwningPlayer(var6);
                  }

                  var1.setItemMeta(var5);
               } else {
                  PlayerProfile var7 = this.Xqedii_38wikv5.get(var3.toLowerCase(Locale.ROOT));
                  if (var7 != null) {
                     var5.setOwnerProfile(var7);
                     var1.setItemMeta(var5);
                  } else {
                     var5.setOwningPlayer(Bukkit.getOfflinePlayer(var3));
                     var1.setItemMeta(var5);
                     this.resolveHeadProfileAsync(var3);
                  }
               }
            }
         }
      }
   }

   public void resolveHeadProfileAsync(String var1) {
      if ((-1646549516 ^ -1646549516) != 0) {
         throw new IllegalStateException();
      } else if (this.plugin != null) {
         String var2 = var1.toLowerCase(Locale.ROOT);
         if (this.Xqedii_24hmthh.add(var2)) {
            Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
               if ((-431041705 * (-431041705 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  try {
                     PlayerProfile var3 = Bukkit.createPlayerProfile(var1);
                     PlayerProfile var4 = (PlayerProfile)var3.update().join();
                     if (var4 != null && var4.getTextures() != null && var4.getTextures().getSkin() != null) {
                        this.Xqedii_38wikv5.put(var2, var4);
                     }
                  } catch (Throwable var8) {
                  } finally {
                     this.Xqedii_24hmthh.remove(var2);
                  }
               }
            });
         }
      }
   }

   public void applyItemDisplayCustomModelData(ItemStack var1, Integer var2) {
      if ((2004492339 ^ 2004492339) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2 >= 0) {
         ItemMeta var3 = var1.getItemMeta();
         if (var3 != null) {
            var3.setCustomModelData(var2);
            var1.setItemMeta(var3);
         }
      }
   }

   public Integer parseItemDisplayEnchantmentLevel(Object var1) {
      if (((1092712326 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var2 = this.parseDouble(var1, Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581574210422L, 27)));
         if (!Double.isFinite(var2)) {
            return null;
         } else {
            int var4 = (int)Math.round(var2);
            return var4 <= 0 ? null : var4;
         }
      }
   }

   public Enchantment resolveItemDisplayEnchantment(String var1) {
      if ((-626057776 * -626057776 + -626057776 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 3)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 13)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isBlank()) {
            return null;
         } else {
            NamespacedKey var3 = NamespacedKey.fromString(var2.toLowerCase(Locale.ROOT));
            if (var3 == null && !var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ygz6lbE2txbOfRxAbj9+QX1K/7C8yXjFqRYBfKWv"))) {
               var3 = NamespacedKey.minecraft(var2.toLowerCase(Locale.ROOT));
            }

            Enchantment var4 = var3 == null ? null : Enchantment.getByKey(var3);
            if (var4 == null) {
               var4 = Enchantment.getByName(var2.toUpperCase(Locale.ROOT));
            }

            if (var4 == null && var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ygz6lbE2txbOfRxAbj9+QX1K/7C8yXjFqRYBfKWv"))) {
               String var5 = var2.substring(
                     var2.indexOf(Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060381508, 5)) + Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711766, 5)
                  )
                  .toUpperCase(Locale.ROOT);
               var4 = Enchantment.getByName(var5);
            }

            return var4;
         }
      }
   }

   public Map<Enchantment, Integer> parseItemDisplayEnchantments(Object var1) {
      if ((1064867431 ^ 1064867431) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Map var2) {
         LinkedHashMap var3 = new LinkedHashMap();

         for (Map.Entry<?, ?> var5 : ((Map<?, ?>) var2).entrySet()) {
            String var6 = var5.getKey() == null ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==") : var5.getKey().toString();
            Enchantment var7 = this.resolveItemDisplayEnchantment(var6);
            if (var7 != null) {
               Integer var8 = this.parseItemDisplayEnchantmentLevel(var5.getValue());
               if (var8 != null) {
                  var3.put(var7, var8);
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   public Map<Enchantment, Integer> readItemDisplayEnchantments(ConfigurationSection var1) {
      if (((2011486358 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptyMap();
      } else {
         String[] var10000 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 14)];
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 12)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "GLcr1rpwcgQEJl95ZdPYsKW1ZpbXUSV1Slj7hH9JKhAVVCC7j1/Bs5tguEdbJJ04oonBU2QU"
         );
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663417, 9)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "2hQl41ZdvESTV2ynHYeAPIG9OjKkYcNI9qyBAWuHYo4U/3oLHR0KH4hIADM="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(501208356, 24)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "ng7L3hJOns+0dLJ7ZEB7QHHe5uS/6t/sROpK9ndnZojGzEnC9rt4WNB/YNM3J9h6tjCBSH5OuOdAOfbU+NrpfmXl08E="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(501208356, 23)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "byHHWzSKGWHcMGaKgOPzrOmb/f+RJeOUc9kjqZ9u+Z6c2QmirXjPbZLfdqtwi5mcFaQA/sZihPAQyg=="
         );
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628890, 31)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "RBwDb6VjnOvvgNEuv15XlvtGOKx8TaB0LhcCIvA0Nf/4fHx8ihiiCgQD+iG4QdBdfKdYiqZbJrGrFldZCe8="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484439332, 11)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "D3+fWqvS6OMsHV3bPubdHoB08adymP+qZrhBc3dxFyNxThOUCCVFgS4/bQJa1Hi4HsMqDw=="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(486004004, 19)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "JyhOF594lovVuCT2htMrzCSjoZ5NOSQSbebGnSszZSylbcHLnM37K+015kb2YT5J3zngH8Sw6qZg0/4sDxUvFy1octSR0AA516vX7Q=="
         );
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-461713690, 29)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "H+sJ/jbzA2lAKE2yBXb5y5hFKZjz/j3uGQNBfdupCAKcW4q6P+eeE9NjXrCg7/KvGHhbkEhzwzAgQWeUjmAC98Zw"
         );
         String[] var2 = var10000;
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578571224, 14); var5 < var4; var5++) {
            String var6 = var3[var5];
            if (var1.contains(var6)) {
               Map var7 = this.parseItemDisplayEnchantments(var1.get(var6));
               if (var7 != null) {
                  return var7;
               }
            }
         }

         return Collections.emptyMap();
      }
   }

   public void applyItemDisplayEnchantments(ItemStack var1, Map<Enchantment, Integer> var2) {
      if (((1549362389 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         ItemMeta var3 = var1.getItemMeta();
         if (var3 != null) {
            int var4 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(733002798, 31);

            for (Entry var6 : var2.entrySet()) {
               Enchantment var7 = (Enchantment)var6.getKey();
               Integer var8 = (Integer)var6.getValue();
               if (var7 != null && var8 != null && var8 > 0) {
                  var3.addEnchant(var7, var8, (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578587608, 14) != 0));
                  var4 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-514969974, 30);
               }
            }

            if (var4 != 0) {
               var1.setItemMeta(var3);
            }
         }
      }
   }

   public boolean readItemDisplayGlowing(ConfigurationSection var1) {
      if ((-675439109 * -675439109 + -675439109 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 13) != 0);
      } else {
         String[] var10000 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(1289737508, 28)];
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831965, 8)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "E/KaKJAPCJwtidNQ2tpo3jwhEas3xRRj+8vr7eOHPOpETZgrUChc6rng"
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588719990, 13)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "F14jFD/vWMGXqOJtqfh1Qt4f4iDgXFiFjiRlGYOhKMBaKFAmeeFepwX+zwzMhdNvb3jkzg=="
         );
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628889, 31)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "bY4BOIo29Jlr6ka1B+d75zP5cTBViHothPUgHv1Cp8hERUIGVBoAERGAr4noVSnW"
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1589498230, 18)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "vBiqdbAMUUmAJ6NbK7r+XSqzQqcbSj7iWER1Zk1QP+5QZW2o8/qonDoFwgbW6oQc4ME/AkZpLeg="
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588973942, 16)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "r0e3YKyTV7nKkXcvCwlcHX2YcNH+KEZZMmmJ2lXW8gWPEmvFbr6YXp68UydlrrNq/kfNBlGiRf2FANKLyrIlc0+g"
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(1558172964, 28)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "q63yfi/ToYU4+vONKqnxnn4oMHzyaTPhqAkRoQ+9LcpeTjbChj6d7NCayxDF0Xim65ovQ33+V3cRp8RlO4o="
         );
         String[] var2 = var10000;
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(774615228, 23); var5 < var4; var5++) {
            String var6 = var3[var5];
            if (var1.contains(var6)) {
               return this.parseBooleanFlag(var1.get(var6), (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 28) != 0));
            }
         }

         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257776, 0) != 0);
      }
   }

   public boolean hasItemDisplayGlowingSetting(ConfigurationSection var1) {
      if (((-425369163 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 9) != 0);
      } else {
         String[] var10000 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-423331122, 21)];
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 12)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "E/KaKJAPCJwtidNQ2tpo3jwhEas3xRRj+8vr7eOHPOpETZgrUChc6rng"
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-356840510, 27)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "F14jFD/vWMGXqOJtqfh1Qt4f4iDgXFiFjiRlGYOhKMBaKFAmeeFepwX+zwzMhdNvb3jkzg=="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431268, 7)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "bY4BOIo29Jlr6ka1B+d75zP5cTBViHothPUgHv1Cp8hERUIGVBoAERGAr4noVSnW"
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588187510, 19)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "vBiqdbAMUUmAJ6NbK7r+XSqzQqcbSj7iWER1Zk1QP+5QZW2o8/qonDoFwgbW6oQc4ME/AkZpLeg="
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(558771850, 29)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "r0e3YKyTV7nKkXcvCwlcHX2YcNH+KEZZMmmJ2lXW8gWPEmvFbr6YXp68UydlrrNq/kfNBlGiRf2FANKLyrIlc0+g"
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711718, 4)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "q63yfi/ToYU4+vONKqnxnn4oMHzyaTPhqAkRoQ+9LcpeTjbChj6d7NCayxDF0Xim65ovQ33+V3cRp8RlO4o="
         );
         String[] var2 = var10000;
         int var3 = var2.length;

         for (int var4 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461174, 5); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (var1.contains(var5)) {
               return (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024804085, 19) != 0);
            }
         }

         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 25) != 0);
      }
   }

   public String readItemDisplayData(ConfigurationSection var1) {
      if ((-1578256600 * -1578256600 + -1578256600 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484365604, 15)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 26)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("EYIiT3qUuOR7LVfkWT7Np97DpeGCnEy79+mgsH3tnlUDAGSu9/ArDPQtelXHfg==")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253077, 4)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("buTzWGxWUyEhDkdLXVPvUxfyncdkV4bftkSJPeBmMLrFkunqsdxmYJ93b+5wDQ==")
         );
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711800, 0)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("l5O4Vu941WE8qeImZqFv/bmGdSc9PDPRQ55nzDjAkFeJfG6JDn3VhlE9diYNE3uAL6Yf6wrz3rHZrXLb")
         );
         return this.firstNonBlank(var10001).trim();
      }
   }

   public String serializeItemStackData(ItemStack var1) {
      if (((-820882374 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.getType() != Material.AIR) {
         ItemStack var2 = var1.clone();
         var2.setAmount(Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999709142, 16));

         try {
            if (ItemStack.class
                  .getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ulS687F+AQ8zJHTn3GfUu70CXRue1HcIbNtx/fpyUvGYddztw1U35IsPBI2ln4ZKTYBz0KCZxHejaTK2"))
                  .invoke(var2) instanceof byte[] var4
               && var4.length > 0) {
               return Xqedii_15eqtuac7d5y7(Base64.getEncoder().encodeToString(var4));
            }
         } catch (Throwable var7) {
         }

         try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            Class var9 = Class.forName(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                  "/thJJMEMSD2AfugrKVM+XBRUgiUsQV0/kHdIHV7II+KE1uhzS0KhBDddpLLu66IdHN4qTMnkbqn/m1fXDRGQ2VYcli5LlZelVSXp4CiUcw7QxUv1/XhGRGqlr2zpCcIT+6mhiNh4PAbxisDhw9ot7LB+"
               )
            );
            Class[] var10001 = new Class[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1440243223, 30)];
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 17)] = OutputStream.class;
            Constructor var10000 = var9.getConstructor(var10001);
            Object[] var11 = new Object[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588973942, 18)];
            var11[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189826, 4)] = var8;
            Object var5 = var10000.newInstance(var11);
            String var12 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("BEoHX7cg1j7EgQMzs/dJr7lTXO1VkZjAxHyepUWPqcYM5KtbeCyCh0t68ANg07QnH5M=");
            Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 16)];
            var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1196506384, 25)] = Object.class;
            Method var10 = var9.getMethod(var12, var10002);
            Object[] var13 = new Object[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 17)];
            var13[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 25)] = var2;
            var10.invoke(var5, var13);
            var9.getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("5sr/73WxCGnBoXfA+RFvshr92lzRncEzFYGxJpNiB4JtzAFCQRs=")).invoke(var5);
            return Xqedii_mzzcfe88z7g7(Base64.getEncoder().encodeToString(var8.toByteArray()));
         } catch (Throwable var6) {
            return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         }
      } else {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      }
   }

   public ItemStack deserializeItemStackData(String var1) {
      if (((2136165471 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         ItemStack var2 = this.Xqedii_2m8erqm.get(var1);
         if (var2 != null) {
            return var2.clone();
         } else {
            ItemStack var3 = null;

            try {
               if (var1.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("xKVmD/+vEpkF56ZdWoCbc3d6YH1nAIGuh+LJJvJ7vA0goicTGz7nYA=="))) {
                  byte[] var4 = Base64.getDecoder()
                     .decode(var1.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("xKVmD/+vEpkF56ZdWoCbc3d6YH1nAIGuh+LJJvJ7vA0goicTGz7nYA==").length()));
                  String var10001 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("d3MUAOPRIxn/9S5pWsG+jtNqLmobpjqhIzjoFvRBsVL0kiFD3cYP6/lFofe0uvGravc8L0yPMRS/nOx4");
                  Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 30)];
                  var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005596, 0)] = byte[].class;
                  Method var10000 = ItemStack.class.getMethod(var10001, var10002);
                  Object[] var18 = new Object[Xqedii_101y7xo.Xqedii_32yuti7slijjp(824432247, 24)];
                  var18[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 24)] = var4;
                  var3 = var10000.invoke(null, var18) instanceof ItemStack var6 ? var6 : null;
               } else if (var1.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G39qF7xp5ll40FDtc80fdnD5ullhOW02AmTzKGRYAkMCqY8yldWOcYNz"))) {
                  byte[] var10 = Base64.getDecoder()
                     .decode(var1.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G39qF7xp5ll40FDtc80fdnD5ullhOW02AmTzKGRYAkMCqY8yldWOcYNz").length()));
                  Class var11 = Class.forName(
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                        "k5g3fcg5WY3nevimpdhD1DYd7aIEqw5y6xDZS249hLLBNE8QcyJr1LNlAxeUzMsa9J+znTJdqt/GibUG0G4+f8bord+hKd5KlNuNeQt0+gvTU/f6O1u007NsViQtoLq5QdDEuHT2tsjIgSYn3usEAg=="
                     )
                  );
                  Class[] var16 = new Class[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515554, 1)];
                  var16[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 22)] = InputStream.class;
                  Constructor var14 = var11.getConstructor(var16);
                  Object[] var17 = new Object[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 10)];
                  var17[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647572747, 14)] = new ByteArrayInputStream(var10);
                  Object var12 = var14.newInstance(var17);
                  Object var7 = var11.getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("o6WHXGnOeEdO3XyHMBci7bm0GDjrW0WLnIaA72eIEEfe3US8MSM0k5uM9pTrExsd"))
                     .invoke(var12);
                  var11.getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("5sr/73WxCGnBoXfA+RFvshr92lzRncEzFYGxJpNiB4JtzAFCQRs=")).invoke(var12);
                  var3 = var7 instanceof ItemStack var8 ? var8 : null;
               }
            } catch (Throwable var9) {
               this.plugin.getLogger().warning(Xqedii_ux86d7ykvi8m(var9.getClass().getSimpleName()));
            }

            if (var3 != null && var3.getType() != Material.AIR) {
               if (this.Xqedii_2m8erqm.size() > Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484321828, 8)) {
                  this.Xqedii_2m8erqm.clear();
               }

               this.Xqedii_2m8erqm.put(var1, var3.clone());
               return var3;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public void applyItemDisplayGlowingState(ItemStack var1, boolean var2) {
      if ((-1846914045 ^ -1846914045) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.getType() != Material.AIR) {
         ItemMeta var3 = var1.getItemMeta();
         if (var3 != null) {
            try {
               var3.getClass().getMethod("setEnchantmentGlintOverride", Boolean.class).invoke(var3, var2 ? Boolean.TRUE : null);
            } catch (Throwable ignored) {
            }
            var1.setItemMeta(var3);
         }
      }
   }

   public double readPivotOffsetX(ConfigurationSection var1, double var2) {
      if ((-2003191129 * -2003191129 - -2003191129 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.readPivotOffset(var1, var2, (Xqedii_101y7xo.Xqedii_32yuti7slijjp(999854571, 15) != 0));
      }
   }

   public double readPivotOffsetY(ConfigurationSection var1, double var2) {
      if ((-1119384797 * -1119384797 + -1119384797 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.readPivotOffset(var1, var2, (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831965, 8) != 0));
      }
   }

   public double readPivotOffset(ConfigurationSection var1, double var2, boolean var4) {
      if ((-109903240 ^ -109903240) != 0) {
         throw new IllegalStateException();
      } else {
         double var5 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7606718802890073926L, 59)), var2);
         double var7 = var5
            * (
               var4
                  ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(185871257153832172L, 53))
                  : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1394161553660162882L, 42))
            );
         if (var1 == null) {
            return var7;
         } else {
            Object var9 = this.readPivotRawValue(var1, var4);
            double var10 = this.parseDouble(var9, var7);
            if (!Double.isFinite(var10)) {
               var10 = var7;
            }

            boolean var12 = this.hasPivotRawValue(var1, var4);
            Boolean var13 = this.readPivotNormalizedSetting(var1);
            boolean var14 = this.isPivotAxisNormalized(var10, var12, var13);
            return var14 ? var10 * var5 : var10;
         }
      }
   }

   public Object readPivotRawValue(ConfigurationSection var1, boolean var2) {
      if ((-988396775 * -988396775 + -988396775 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String[] var3 = var2 ? Xqedii_2mql9fq.Xqedii_3rxilqe : Xqedii_2mql9fq.Xqedii_1lechqc;
         String[] var4 = var3;
         int var5 = var3.length;

         for (int var6 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1743656133, 23); var6 < var5; var6++) {
            String var7 = var4[var6];
            if (var1.contains(var7)) {
               return var1.get(var7);
            }
         }

         return null;
      }
   }

   public boolean hasPivotRawValue(ConfigurationSection var1, boolean var2) {
      if (((342426584 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 3) != 0);
      } else {
         String[] var3 = var2 ? Xqedii_2mql9fq.Xqedii_3rxilqe : Xqedii_2mql9fq.Xqedii_1lechqc;
         String[] var4 = var3;
         int var5 = var3.length;

         for (int var6 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 11); var6 < var5; var6++) {
            String var7 = var4[var6];
            if (var1.contains(var7)) {
               return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 1) != 0);
            }
         }

         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999643606, 16) != 0);
      }
   }

   public Boolean readPivotNormalizedSetting(ConfigurationSection var1) {
      if (((890522989 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String[] var2 = Xqedii_2mql9fq.Xqedii_2atl4cx;
         int var3 = var2.length;

         for (int var4 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-491058238, 27); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (var1.contains(var5)) {
               return this.parseBooleanFlag(var1.get(var5), (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16) != 0));
            }
         }

         var2 = Xqedii_2mql9fq.Xqedii_q1ugm66;
         var3 = var2.length;

         for (int var9 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 17); var9 < var3; var9++) {
            String var10 = var2[var9];
            if (var1.contains(var10)) {
               String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711797, 0)];
               var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 26)] = var1.getString(var10);
               String var6 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
               if (!var6.isBlank()) {
                  if (var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zMtFC9GoqNXSTrX54KMS68Pwl0xo9AyPPjola0sFPV23YaVE"))
                     || var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jIpmphJ/IkAlcu29dDJI/dlE3czpdl1u6VhMPvtRlpYIknxgRMo="))
                     || var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("4PDQHdkwvyHAcjreOglRnhiNULgoW7rH85TLYO2NG0ftSZZViLccLYFt"))) {
                     return Boolean.valueOf((Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1414480850, 31) != 0));
                  }

                  if (var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("lpTiwS7sKnfuUfBZ3jnyJNeT0SlWk4m4fsRf66SgMgK1KA=="))
                     || var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("57sKD6zz4kuAnoIL3kE3tbArQpNq/ksOPgJBsMhDcL4="))
                     || var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("oUyDKSk6VpPDnemAXOCHsK9+6YwjDf/Ws2SGPUshGs3BVKPecYc="))
                     || var6.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/V3IAbt1mYKGPlsCz/FGU94xyL7GbNFhTaG/iBM5k6jGJ8tMHPTrPg=="))) {
                     return Boolean.valueOf((Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 15) != 0));
                  }
               }
            }
         }

         return null;
      }
   }

   public boolean isPivotAxisNormalized(double var1, boolean var3, Boolean var4) {
      if ((-2139651724 * -2139651724 + -2139651724 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var4 != null) {
         return var4;
      } else if (var3 && Double.isFinite(var1)) {
         return ((var1 >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 14))
               && var1 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205106755577670L, 33))
            ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 14)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16)) != 0);
      } else {
         return (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1569055089, 2) != 0);
      }
   }

   public double[] resolvePivotAwareTopLeft(double var1, double var3, double var5, double var7, double var9, double var11, double var13) {
      if (((-1220891683 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var15 = Double.isFinite(var9) ? var9 : var1 + var5 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347369173757813622L, 46));
         double var17 = Double.isFinite(var11) ? var11 : var3 + var7 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(3377836062676514421L, 47));
         return this.rotateTopLeftAroundPivot(var1, var3, var5, var7, var15, var17, this.normalizeRenderRotation(var13));
      }
   }

   public boolean isSkinType(String var1) {
      if ((2103445352 * 2103445352 - 2103445352 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fuff3rZdnfKDD3OEQmIZTZ2FvvKRK9rZkngfAp8gpQhLyZea").equals(var1);
      }
   }

   public String skinPartHudId(String var1, String var2) {
      if (((632330796 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2m0mr7sp4l62v(var1, var2);
      }
   }

   public void removeSkinParts(Player var1, String var2) {
      if (((1915651171 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String[] var3 = SKIN_PART_NAMES;
         int var4 = var3.length;

         for (int var5 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 25); var5 < var4; var5++) {
            String var6 = var3[var5];
            this.removeBaseHud(var1, this.skinPartHudId(var2, var6));
         }
      }
   }

   public boolean applySkinPartItemModel(ItemStack var1, String var2) {
      if ((-1653115394 * -1653115394 - -1653115394 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999643606, 16) != 0);
      } else {
         ItemMeta var3 = var1.getItemMeta();
         if (var3 == null) {
            return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295680084, 17) != 0);
         } else {
            try {
               if (!Xqedii_ppckroc) {
                  Xqedii_ppckroc = (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1580323190, 23) != 0);

                  try {
                     String var10001 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("h0ExkljaNS7d6luK10P2JyN/2FIYe+kRnbSLqw6j7SPpSYm8aioY6iG+QoeSSQUcJqIPhg==");
                     Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379684, 5)];
                     var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 7)] = NamespacedKey.class;
                     Xqedii_14ofmf1 = ItemMeta.class.getMethod(var10001, var10002);
                  } catch (NoSuchMethodException var5) {
                     Xqedii_14ofmf1 = null;
                  }
               }

               if (Xqedii_14ofmf1 == null) {
                  return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 30) != 0);
               } else {
                  Method var10000 = Xqedii_14ofmf1;
                  Object[] var7 = new Object[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999709142, 16)];
                  var7[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 30)] = NamespacedKey.minecraft(var2);
                  var10000.invoke(var3, var7);
                  var1.setItemMeta(var3);
                  return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207928, 6) != 0);
               }
            } catch (Throwable var6) {
               return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1182720333, 19) != 0);
            }
         }
      }
   }

   public ItemStack buildSkinPartItem(String var1, String var2, boolean var3) {
      if ((1201389005 * (1201389005 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ItemStack var4 = new ItemStack(Material.PLAYER_HEAD);
         this.applyItemDisplayHeadOwner(var4, var1);
         this.applySkinPartItemModel(var4, Xqedii_1vq1pox55xruw(var2));
         return var4;
      }
   }

   public double[] readSkinPartRotation(ConfigurationSection var1, String var2) {
      if (((-539775147 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double[] var3 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515558, 1)];
         if (var1 == null) {
            return var3;
         } else {
            String[] var10000 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295417940, 17)];
            var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-871828067, 22)] = Xqedii_1s6o2zw8ybsec(var2);
            var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 30)] = Xqedii_2offdw228oc7s(var2);
            String[] var4 = var10000;
            String[] var5 = var4;
            int var6 = var4.length;

            for (int var7 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 25); var7 < var6; var7++) {
               String var8 = var5[var7];
               if (var1.contains(var8)) {
                  var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 15)] = this.readDouble(
                     var1,
                     Xqedii_14lwbswnlzhuo(var8),
                     Xqedii_x0wyrbiv04yf(var8),
                     this.readDouble(
                        var1,
                        Xqedii_1oweck47qgfyx(var8),
                        Xqedii_k3nzls78cf52(var8),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6764543730081252617L, 27))
                     )
                  );
                  var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29)] = this.readDouble(
                     var1,
                     Xqedii_2kis1hczep0cx(var8),
                     Xqedii_2kectd5bfdu0v(var8),
                     this.readDouble(
                        var1,
                        Xqedii_1qo2k4cwad5rh(var8),
                        Xqedii_3pljonyxdiayf(var8),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 6))
                     )
                  );
                  var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711800, 0)] = this.readDouble(
                     var1,
                     Xqedii_2wimogqrfhnqr(var8),
                     Xqedii_16see1ipgpf23(var8),
                     this.readDouble(
                        var1,
                        Xqedii_xtoi7q6naash(var8),
                        Xqedii_2e89o78bjxeso(var8),
                        Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 14))
                     )
                  );
                  break;
               }
            }

            return var3;
         }
      }
   }

   public double[] rotateSkinVector(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (((578451501 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var13 = Math.sin(Math.toRadians(var7));
         double var15 = Math.cos(Math.toRadians(var7));
         double var17 = Math.sin(Math.toRadians(var9));
         double var19 = Math.cos(Math.toRadians(var9));
         double var21 = Math.sin(Math.toRadians(var11));
         double var23 = Math.cos(Math.toRadians(var11));
         double var25 = var3 * var15 - var5 * var13;
         double var27 = var3 * var13 + var5 * var15;
         double var29 = var1 * var19 + var27 * var17;
         double var31 = -var1 * var17 + var27 * var19;
         double var33 = var29 * var23 - var25 * var21;
         double var35 = var29 * var21 + var25 * var23;
         double[] var10000 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394655094, 12)];
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(75157222, 29)] = var33;
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588695414, 14)] = var35;
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(215995684, 28)] = var31;
         return var10000;
      }
   }

   public double[] readSkinPartRotations(ConfigurationSection var1) {
      if ((2021902458 * 2021902458 + 2021902458 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var2 = new double[SKIN_PART_NAMES.length * Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431156, 3)];

         for (int var3 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1025328373, 19); var3 < SKIN_PART_NAMES.length; var3++) {
            double[] var4 = this.readSkinPartRotation(var1, SKIN_PART_NAMES[var3]);
            var2[var3 * Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2103281121, 26)] = var4[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189826, 4)];
            var2[var3 * Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831197, 8) + Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 22)] = var4[Xqedii_101y7xo.Xqedii_x42dgjucv46g(
               -1588711766, 5
            )];
            var2[var3 * Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711802, 2) + Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431141, 0)] = var4[Xqedii_101y7xo.Xqedii_x42dgjucv46g(
               -1586614646, 20
            )];
         }

         return var2;
      }
   }

   public String resolveSkinOwner(Player var1, EditorSession var2, ConfigurationSection var3) {
      if ((-1876089679 * (-1876089679 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711750, 4)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 13)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fuff3rZdnfKDD3OEQmIZTZ2FvvKRK9rZkngfAp8gpQhLyZea")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 13)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jmEE/J6xAux9HYuCkxymMJK2637BE4TqOGHK3ivpuNVniei9CPQd3OHOapkaH/kVZdk=")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823769990, 13)] = var1.getName();
         String var4 = this.firstNonBlank(var10001);
         var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588707702, 11)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 22)] = this.resolveBlockPlaceholders(var1, var2, var3, var4);
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005597, 0)] = var1.getName();
         var4 = this.firstNonBlank(var10001);
         if (var1 != null) {
            var4 = var4.replace(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("mgW7bMclbZdtoIKARz20vOUNrHGFDueCqFhkd8eiiPP8DHcTkfHuK+uKnaY="), var1.getName());
            var4 = var4.replace(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("obXEbnrr/phbmW0+5EbB3cXkB1+dRWNC3uupLwsLEPCg1NqFycB5qCk2sfYhsXusdOmTVW70"), var1.getName());
         }

         if (var4.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1anGazytAqkFXd7mrqNXq2RIfGx2CBP+iW+j4rvr"))) {
            var4 = var1 == null ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==") : var1.getName();
         }

         return var4;
      }
   }

   public void renderSkinElementParts(
      Player var1,
      EditorSession var2,
      ConfigurationSection var3,
      String var4,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      int var15,
      TextAlignment var16,
      double var17,
      double var19
   ) {
      if ((-1424117628 * -1424117628 - -1424117628 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var3 != null) {
         this.renderSkinParts(
            var1,
            var4,
            this.resolveSkinOwner(var1, var2, var3),
            var3.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("KQfE7C36fMFZsvO4Vjf673aCnAvbA0ViHuev3TqHHb90dAh9"),
               var3.getBoolean(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ZwrMRNtOSygaYirTpNGBYFrY7KUzb7gNzf+Rxiypi2PiSOdL7ungAOdUdvonA3HZLvM="),
                  (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7) != 0)
               )
            ),
            this.readSkinPartRotations(var3),
            var5,
            var7,
            var9,
            var11,
            var13,
            var15,
            var16,
            var17,
            var19
         );
      }
   }

   public double readSkinSpinAngle(EditorSession var1, String var2) {
      if (((70702797 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findRenderedSkinElement(var1, var2);
         return var3 == null ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8443933037118445174L, 39)) : var3.skinSpinAngle;
      }
   }

   public HoverElement findRenderedSkinElement(EditorSession var1, String var2) {
      if (((626628117 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.elements != null && var2 != null) {
         for (HoverElement var4 : var1.elements) {
            if (var4 != null && var2.equals(var4.id) && this.isSkinType(var4.type)) {
               return var4;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public double readSkinSpinVelocityYaw(EditorSession var1, String var2) {
      if (((1868711173 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findRenderedSkinElement(var1, var2);
         return var3 == null ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1450571954996825180L, 13)) : var3.skinSpinVelocityYaw;
      }
   }

   public double readSkinSpinVelocityPitch(EditorSession var1, String var2) {
      if ((547818795 * 547818795 + 547818795 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findRenderedSkinElement(var1, var2);
         return var3 == null ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4762407206239651250L, 17)) : var3.skinSpinVelocityPitch;
      }
   }

   public int readSkinSpinMomentumTicks(EditorSession var1, String var2) {
      if ((771779444 ^ 771779444) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findRenderedSkinElement(var1, var2);
         return var3 == null ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16) : var3.skinSpinMomentumTicks;
      }
   }

   public double readSkinSpinPitch(EditorSession var1, String var2) {
      if ((-970121073 * -970121073 - -970121073 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var3 = this.findRenderedSkinElement(var1, var2);
         return var3 == null ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 40)) : var3.skinSpinPitch;
      }
   }

   public boolean readSkinSpinFlag(ConfigurationSection var1, String var2, boolean var3) {
      if ((1250531980 * 1250531980 + 1250531980 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? var3 : var1.getBoolean(Xqedii_uo6y1ut1o0db(var2), var1.getBoolean(Xqedii_1jzlf58gr347(var2), var3));
      }
   }

   public double readSkinSpinSpeed(ConfigurationSection var1) {
      if ((338550230 * 338550230 - 338550230 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = this.readDouble(
            var1,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ixcii+zMaNeHZsrTLRh3CO4ylx8qaVh6CPEzM8mGocmpuyYq+S88Cb4XdcHO3CXhChXHCC/92JBSSg=="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ixcii+zMaNeHZsrTLRh3CO4ylx8qaVh6CPEzM8mGocmpuyYq+S88Cb4XdcHO3CXhChXHCC/92JBSSg=="),
            this.readDouble(
               var1,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("KxTC8p3fCEsqGTrIs740SSgmKnjZNoY16DQ4bfjGKly7DHYqV563Nxs0atqLfTK6SLFnpnvmcmhppPJ+fDV5axWOQzvY0HmC"),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("KxTC8p3fCEsqGTrIs740SSgmKnjZNoY16DQ4bfjGKly7DHYqV563Nxs0atqLfTK6SLFnpnvmcmhppPJ+fDV5axWOQzvY0HmC"),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(7939052876652700534L, 0))
            )
         );
         return Double.isFinite(var2) && !(Math.abs(var2) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-1161219132954985599L, 1)))
            ? var2
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(6033412543396438228L, 57));
      }
   }

   public void ensureSkinSpinLoop(Player var1) {
      if (((947200708 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_3gvnwx7.add(var1.getUniqueId())) {
         this.scheduleSkinSpinTick(var1);
      }
   }

   public void scheduleSkinSpinTick(Player var1) {
      if ((719394633 * 719394633 + 719394633 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_38o2zes.Xqedii_2sj63w1(this.plugin, var1, () -> {
            if ((1820464262 * 1820464262 - 1820464262 & 1) != 0) {
               throw new IllegalStateException();
            } else if (var1 != null && var1.isOnline()) {
               if (!this.tickSkinSpin(var1)) {
                  this.Xqedii_3gvnwx7.remove(var1.getUniqueId());
               } else {
                  this.scheduleSkinSpinTick(var1);
               }
            } else {
               this.Xqedii_3gvnwx7.remove(var1 == null ? null : var1.getUniqueId());
            }
         }, Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769334L, 7));
      }
   }

   public boolean tickSkinSpin(Player var1) {
      if (((-1771198414 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var2 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         if (var2 != null && var2.elements != null) {
            int var3 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 0);

            for (HoverElement var5 : var2.elements) {
               if (var5 != null && this.isSkinType(var5.type) && var5.visible) {
                  int var6 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 14);
                  if (var5.skinSpinning) {
                     double var7 = var5.skinSpinSpeedTicks;
                     if (!Double.isFinite(var7) || Math.abs(var7) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8040049254658221894L, 50))) {
                        var7 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039489311181907782L, 50));
                     }

                     var5.skinSpinAngle = (var5.skinSpinAngle + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606074967L, 17)) / var7)
                        % Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351616020636534L, 37));
                     var6 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588719990, 13);
                  }

                  if (!this.isSkinMouseSpinDragElement(var2, var5) && this.applySkinSpinMomentum(var5)) {
                     var6 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(558771850, 31);
                  }

                  if (var6 != 0) {
                     var3 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936188, 2);
                     this.updateElementHud(var1, var5);
                  }
               }
            }

            return (var3 != 0);
         } else {
            return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16) != 0);
         }
      }
   }

   public boolean isSkinMouseSpinDragElement(EditorSession var1, HoverElement var2) {
      if ((-2131781311 ^ -2131781311) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.isSkinMouseSpinActive(var1) && var2 != null && var1.skinMouseSpinElementId.equals(var2.id)
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1586614646, 21)
            : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024411474, 9)) != 0);
      }
   }

   public boolean applySkinSpinDelta(HoverElement var1, double var2, double var4) {
      if (((-1870710336 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         var1.skinSpinAngle = (var1.skinSpinAngle + var2) % Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-2562827957723472570L, 11));
         double var6 = var1.skinSpinPitch + var4;
         if (var1.skinSpinUnlimited) {
            var1.skinSpinPitch = var6 % Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3016657343430783082L, 56));
            return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(1929526631, 20) != 0);
         } else {
            double var8 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1427829352750870558L, 6)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571802090L, 17)), var6)
            );
            var1.skinSpinPitch = var8;
            return ((Math.abs(var8 - var6) > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(2283339587590698739L, 25))
               ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1580323190, 23)
               : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 19)) != 0);
         }
      }
   }

   public boolean applySkinSpinMomentum(HoverElement var1) {
      if (((1579405194 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20) != 0);
      } else {
         double var2 = Double.isFinite(var1.skinSpinVelocityYaw)
            ? var1.skinSpinVelocityYaw
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 49));
         double var4 = Double.isFinite(var1.skinSpinVelocityPitch)
            ? var1.skinSpinVelocityPitch
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 47));
         if (Math.abs(var2) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4294067622931105107L, 20))
            && Math.abs(var4) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(717928404942572835L, 22))) {
            var1.skinSpinVelocityYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 61));
            var1.skinSpinVelocityPitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2279946618415975122L, 55));
            var1.skinSpinMomentumTicks = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279688418, 11);
            return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 17) != 0);
         } else {
            var1.skinSpinMomentumTicks = var1.skinSpinMomentumTicks + Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(789293804, 13);
            if (var1.skinSpinMomentumTicks > Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588722038, 10)) {
               var1.skinSpinVelocityYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 14));
               var1.skinSpinVelocityPitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 30));
               var1.skinSpinMomentumTicks = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 10);
               return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 29) != 0);
            } else {
               boolean var6 = this.applySkinSpinDelta(var1, var2, var4);
               var1.skinSpinVelocityYaw = var2 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7538026102212914374L, 30));
               var1.skinSpinVelocityPitch = var6
                  ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 13))
                  : var4 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5517812499505359877L, 20));
               return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1605489014, 24) != 0);
            }
         }
      }
   }

   public double clampSkinSpinVelocity(double var1) {
      if ((-1080651725 * -1080651725 + -1080651725 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return !Double.isFinite(var1)
            ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8800588053724697519L, 23))
            : Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(5456127483786403229L, 45)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(5291449792410671333L, 7)), var1)
            );
      }
   }

   public boolean isSkinMouseSpinTarget(HoverElement var1) {
      if (((-942456935 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.isSkinType(var1.type) && var1.skinSpinMouse && var1.visible
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635278167, 8)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 26)) != 0);
      }
   }

   public boolean isSkinMouseSpinActive(EditorSession var1) {
      if ((666481649 * 666481649 - 666481649 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.skinMouseSpinElementId != null && !var1.skinMouseSpinElementId.isBlank()
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1592906102, 22)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 15)) != 0);
      }
   }

   public boolean beginSkinMouseSpin(EditorSession var1, HoverElement var2, double var3, double var5) {
      if (((1777643552 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.isSkinMouseSpinTarget(var2)) {
         var1.skinMouseSpinElementId = var2.id;
         var1.skinMouseSpinLastHitX = var3;
         var1.skinMouseSpinLastHitY = var5;
         var1.skinMouseSpinTick = Xqedii_38o2zes.Xqedii_316oplq();
         var1.skinMouseSpinSampleYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-7122619882458289623L, 0));
         var1.skinMouseSpinSamplePitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(828684505527002588L, 60));
         var2.skinSpinVelocityYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1499298107838560309L, 55));
         var2.skinSpinVelocityPitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(726600608360826304L, 11));
         var2.skinSpinMomentumTicks = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 20);
         return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207928, 6) != 0);
      } else {
         return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 27) != 0);
      }
   }

   public void stopSkinMouseSpin(Player var1, EditorSession var2) {
      if (((-57115956 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         HoverElement var3 = this.findSkinMouseSpinElement(var2);
         int var4 = Xqedii_38o2zes.Xqedii_316oplq() - var2.skinMouseSpinTick > Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571900278L, 17)
            ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 6)
            : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394642806, 12);
         var2.skinMouseSpinElementId = null;
         var2.skinMouseSpinLastHitX = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347248777234572150L, 52));
         var2.skinMouseSpinLastHitY = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8984312821509021153L, 43));
         var2.skinMouseSpinSampleYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 0));
         var2.skinMouseSpinSamplePitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3544713492189670358L, 28));
         if (var3 != null) {
            if (var4 != 0) {
               var3.skinSpinVelocityYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 40));
               var3.skinSpinVelocityPitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6755601756608851178L, 48));
               var3.skinSpinMomentumTicks = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 19);
            } else {
               var3.skinSpinMomentumTicks = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735590461, 12);
               if (Math.abs(var3.skinSpinVelocityYaw) >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(5847675302089478210L, 1))
                  || Math.abs(var3.skinSpinVelocityPitch) >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-717928404945095489L, 12))) {
                  this.ensureSkinSpinLoop(var1);
               }
            }
         }
      }
   }

   public HoverElement findSkinMouseSpinElement(EditorSession var1) {
      if (((1460271396 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.isSkinMouseSpinActive(var1) && var1.elements != null) {
         for (HoverElement var3 : var1.elements) {
            if (var3 != null && var1.skinMouseSpinElementId.equals(var3.id) && this.isSkinType(var3.type)) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean updateSkinMouseSpinDrag(Player var1, EditorSession var2, double var3, double var5) {
      if ((118510116 ^ 118510116) != 0) {
         throw new IllegalStateException();
      } else {
         HoverElement var7 = this.findSkinMouseSpinElement(var2);
         if (var1 == null || var7 == null || !this.isSkinMouseSpinTarget(var7)) {
            this.stopSkinMouseSpin(var1, var2);
            return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 2) != 0);
         } else if (Double.isFinite(var3) && Double.isFinite(var5)) {
            long var8 = Xqedii_38o2zes.Xqedii_316oplq();
            if (var8 != var2.skinMouseSpinTick) {
               var7.skinSpinVelocityYaw = this.clampSkinSpinVelocity(var2.skinMouseSpinSampleYaw);
               var7.skinSpinVelocityPitch = this.clampSkinSpinVelocity(var2.skinMouseSpinSamplePitch);
               var2.skinMouseSpinTick = var8;
               var2.skinMouseSpinSampleYaw = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 18));
               var2.skinMouseSpinSamplePitch = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-1375183653906070868L, 32));
            }

            double var10 = var2.skinMouseSpinLastHitX;
            double var12 = var2.skinMouseSpinLastHitY;
            var2.skinMouseSpinLastHitX = var3;
            var2.skinMouseSpinLastHitY = var5;
            if (Double.isFinite(var10) && Double.isFinite(var12)) {
               double var14 = (var3 - var10) * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8535780210437562710L, 31));
               double var16 = var7.skinSpinUpDown
                  ? (var5 - var12) * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571767446L, 16))
                  : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(478113639655490623L, 44));
               if (Math.abs(var14) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8895526949190495833L, 32))
                  && Math.abs(var16) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7422635417832296009L, 20))) {
                  return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 0) != 0);
               } else {
                  var2.skinMouseSpinSampleYaw += var14;
                  var2.skinMouseSpinSamplePitch += var16;
                  this.applySkinSpinDelta(var7, var14, var16);
                  this.updateElementHud(var1, var7);
                  return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279686370, 11) != 0);
               }
            } else {
               return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712822, 10) != 0);
            }
         } else {
            return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 25) != 0);
         }
      }
   }

   public void renderSkinParts(
      Player var1,
      String var2,
      String var3,
      boolean var4,
      double[] var5,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      int var16,
      TextAlignment var17,
      double var18,
      double var20
   ) {
      if ((-78101668 ^ -78101668) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431148, 3)];
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(150314444, 30)] = var3;
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 13)] = var1.getName();
         String var22 = this.firstNonBlank(var10001);
         double[] var24 = var5 == null ? new double[SKIN_PART_NAMES.length * Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515558, 1)] : var5;
         double var25 = this.resolveSkinModelUnit(var10, var12);
         double var27 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3962224442425379542L, 7)) * var25;
         double var29 = var6 + var10 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8498086059356364242L, 12));
         double var31 = var8
            + (var12 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606074939L, 17)) * var25)
               / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6235510898379017293L, 42))
            + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-280759781545231088L, 38)) * var25;

         for (int var33 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578571224, 14); var33 < SKIN_PART_NAMES.length; var33++) {
            String var34 = SKIN_PART_NAMES[var33];
            String var35 = this.skinPartHudId(var2, var34);
            double[] var10000 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1846854759, 31)];
            var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-664922347, 6)] = var24[var33 * Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588662646, 14)];
            var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024410962, 9)] = var24[var33 * Xqedii_101y7xo.Xqedii_g54i57lr0mm1(483906852, 18)
               + Xqedii_101y7xo.Xqedii_32yuti7slijjp(1224056268, 30)];
            var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431652, 9)] = var24[var33 * Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588714870, 10)
               + Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-256069950, 17)];
            double[] var36 = var10000;
            double var37 = SKIN_PART_ANCHOR_X[var33] - SKIN_PART_PIVOT_X[var33] - SKIN_PART_MODEL_DX[var33];
            double var39 = SKIN_PART_ANCHOR_Y[var33] - SKIN_PART_PIVOT_Y[var33] - SKIN_PART_MODEL_DY[var33];
            double[] var41 = this.rotateSkinVector(
               var37,
               var39,
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-561519701064189407L, 39)),
               var36[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379652, 5)],
               var36[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253077, 4)],
               var36[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 15)]
            );
            double var42 = SKIN_PART_PIVOT_X[var33] + var41[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 27)];
            double var44 = SKIN_PART_PIVOT_Y[var33] + var41[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 15)];
            double var46 = var41[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 16)];
            double[] var48 = this.rotateSkinVector(
               var42,
               var44 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5500734611316733261L, 34)),
               var46,
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(7442717066240203402L, 62)),
               var18,
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8071160103154531201L, 1))
            );
            double[] var49 = this.rotateSkinVector(
               var48[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295680084, 17)],
               var48[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1969063393, 26)],
               var48[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711800, 0)],
               var20,
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 16)),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4762407206239651250L, 17))
            );
            var42 = var49[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1182720333, 19)];
            var44 = var49[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 28)]
               + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3824944267256275448L, 47));
            var46 = var49[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-512139899, 18)];
            double var50 = var14
               + Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8477883008826239039L, 52)),
                  Math.min(
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-6675353215560520823L, 47)),
                     var46 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(717928404945000931L, 18))
                  )
               );
            double var52 = var29 + var42 * var25;
            double var54 = var31 - var44 * var25;
            ItemStack var56 = new ItemStack(Material.PLAYER_HEAD);
            this.applyItemDisplayHeadOwner(var56, var22);
            this.applySkinPartItemModel(var56, Xqedii_3u801fp805rrh(var34));
            Vector var57 = new Vector(var52, var54, var50);
            double var58 = var27 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4823078009992334121L, 22));
            Vector var60 = new Vector(
               var58 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(5795852950676166842L, 0)),
               var58 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8611430846481241122L, 29)),
               var58
                  / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347914531525190518L, 51))
                  * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6289420813735645152L, 62))
            );
            this.upsertItemHud(var1, var35, var57, var60, var56, var16, var17);
            Entity var61 = this.hudService.getHud(var1, var35);
            if (var61 != null) {
               var61.setMetadata(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("qabCVaj5eECfmh870schVKMix7AG0DG+tExckKAcQkmxUhuzIna/99y7FaV7zBoSlMcDFF7a"),
                  new FixedMetadataValue(this.plugin, Boolean.valueOf((Xqedii_101y7xo.Xqedii_32yuti7slijjp(1648864494, 25) != 0)))
               );
               var61.setMetadata(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("mVtOz3tL63Halxa1jLRwsQDvZjGD08d0JmejbKGK97y3CNYTkun0sn0HNLu9TA1cSbm9l9u+Fec="),
                  new FixedMetadataValue(this.plugin, var46 * var25)
               );
               int var62 = SKIN_PART_BANDS[var33];
               if (var62 > 0) {
                  var61.setMetadata(
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GrA8cW8kxfKFg5Qf6mwAz+ieSSkw47ua3twjW9QT4Sxi3gAHewWi3h2knlo="),
                     new FixedMetadataValue(this.plugin, var62)
                  );
               } else {
                  var61.removeMetadata(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GrA8cW8kxfKFg5Qf6mwAz+ieSSkw47ua3twjW9QT4Sxi3gAHewWi3h2knlo="), this.plugin);
               }

               if (var61 instanceof ItemDisplay var63) {
                  var63.setItemDisplayTransform(ItemDisplayTransform.THIRDPERSON_RIGHTHAND);
               }

               this.hudService
                  .rotateHud(
                     var61,
                     new Vector(
                        -(var36[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20)] + var20),
                        var36[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461142, 5)] + var18,
                        -var36[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(480236836, 22)]
                     ),
                     Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 29),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RFczcloBP+mb6kttPKMxxaBFofnpyRbuT8qKiSrMAv9PrG05")
                  );
               this.hudService.moveHud(var61, var57, Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379652, 5), Xqedii_101y7xo.Xqedii_32yuti7slijjp(37578611, 28));
            }
         }
      }
   }

   public ItemStack resolveItemDisplayStack(Player var1, ConfigurationSection var2, String var3) {
      if ((-60072956 ^ -60072956) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null
         && (
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA=").equals(var3)
               || Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("utFYjmd+wFnBQ4CGR83rv/yK6YGRqaI3T1pSNsrKEZWrSpjb").equals(var3)
         )) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1051840886, 28)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 1)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("utFYjmd+wFnBQ4CGR83rv/yK6YGRqaI3T1pSNsrKEZWrSpjb")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 20)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("nP1yLBe3lpiHAqtP/4CZ8p2io74ME+4JXbCfoShTvmCAU4/Vf++bAPLGfjMM6fRCEmjoKYPW")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823769990, 13)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("KAvEeZ0wobLROEo97oXZxuHaUF2Weu253XUC+6DLMKyHv9rQxdgxV3abLDQ=")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-353620213, 29)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("P2HuLX+0qg5ai8poAuPyS/fQfWltpnLU6gYivOyYJVauha93+T3EBxCnWDu/q1QF8bk=")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048827043, 10)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fq1zFS926mGhHQuUAwrVkbicJi5pt74HZXNKwEMum7VHHz1nR5lBJiQiBaeQfOATVlwN/p9SSNqka5jUpGyS7N+daJk=")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431136, 0)] = var2.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ykqrhE+Gsm1b5a8HmLEJemVfr4ZHDVh8rxHprZIV/srTLlLNMhl0mTVRvAI+ccvKdB0YsDqxWUx7QQ==")
         );
         String var4 = this.firstNonBlank(var10001);
         if (var4.isBlank()) {
            return null;
         } else {
            ItemStack var5 = this.resolveInventorySlotStack(var1, var4);
            if (var5 != null) {
               return var5;
            } else {
               String var6 = this.resolveItemDisplayToken(var1, var4);
               String var7 = this.resolveItemDisplayMaterialToken(var6);
               if (this.isCustomItemToken(var7)) {
                  ItemStack var13 = this.resolveCustomItemStack(var7);
                  if (var13 == null) {
                     return null;
                  } else {
                     this.applyItemDisplayEnchantments(var13, this.readItemDisplayEnchantments(var2));
                     this.applyItemDisplayGlowingState(var13, this.readItemDisplayGlowing(var2));
                     return var13;
                  }
               } else {
                  Material var8 = this.resolveItemDisplayMaterial(var7);
                  if (var8 != null && var8 != Material.AIR) {
                     ItemStack var9 = this.deserializeItemStackData(this.readItemDisplayData(var2));
                     if (var9 != null && var9.getType() == var8) {
                        ItemMeta var14 = var9.getItemMeta();
                        if (var14 != null && !var14.getEnchants().isEmpty()) {
                           for (Enchantment var12 : new ArrayList<Enchantment>(var14.getEnchants().keySet())) {
                              var14.removeEnchant(var12);
                           }

                           var9.setItemMeta(var14);
                        }

                        this.applyItemDisplayEnchantments(var9, this.readItemDisplayEnchantments(var2));
                        if (this.hasItemDisplayGlowingSetting(var2)) {
                           this.applyItemDisplayGlowingState(var9, this.readItemDisplayGlowing(var2));
                        }

                        return var9;
                     } else {
                        ItemStack var10 = new ItemStack(var8);
                        if (var8 == Material.PLAYER_HEAD) {
                           this.applyItemDisplayHeadOwner(var10, this.resolvePlayerHeadOwnerToken(var6));
                        }

                        Integer var11 = this.resolveItemDisplayCustomModelData(var6);
                        if (var11 == null) {
                           var11 = this.readItemDisplayCustomModelData(var2);
                        }

                        this.applyItemDisplayCustomModelData(var10, var11);
                        this.applyItemDisplayEnchantments(var10, this.readItemDisplayEnchantments(var2));
                        this.applyItemDisplayGlowingState(var10, this.readItemDisplayGlowing(var2));
                        return var10;
                     }
                  } else {
                     return null;
                  }
               }
            }
         }
      } else {
         return null;
      }
   }

   public String resolveItemDisplayToken(Player var1, String var2) {
      if (((-289627200 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024804085, 19)];
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647572747, 14)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isBlank()) {
            return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            String var4 = this.resolveItemDisplayMaterialToken(var3);
            if (!this.isItemDisplayPlayerHeadToken(var4)) {
               var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831453, 8)];
               var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(75157222, 29)] = this.applyPlaceholderApi(var1, var3);
               var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348415855, 7)] = var3;
               return this.firstNonBlank(var10001).trim();
            } else {
               String var5 = var3;
               if (var1 != null && var3.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("mgW7bMclbZdtoIKARz20vOUNrHGFDueCqFhkd8eiiPP8DHcTkfHuK+uKnaY="))) {
                  var5 = var3.replace(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("mgW7bMclbZdtoIKARz20vOUNrHGFDueCqFhkd8eiiPP8DHcTkfHuK+uKnaY="), var1.getName());
               }

               String var6 = this.applyPlaceholderApiIgnoringMode(var1, var5);
               var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711926, 6)];
               var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7)] = var6;
               var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 10)] = var5;
               return this.firstNonBlank(var10001).trim();
            }
         }
      }
   }

   public int findItemDisplayCustomModelDataSeparator(String var1) {
      if (((290953207 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2050656744, 20);
      } else {
         String var2 = var1.trim();
         if (var2.isBlank()) {
            return Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1569055090, 2);
         } else {
            int var3 = var2.lastIndexOf(Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1646999307, 14));
            return var3 > 0 && var3 < var2.length() - Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 14)
               ? var3
               : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-461713691, 29);
         }
      }
   }

   public String resolveItemDisplayMaterialToken(String var1) {
      if ((-722981643 ^ -722981643) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      } else {
         String var2 = var1.trim();
         if (var2.isBlank()) {
            return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            int var3 = this.findItemDisplayCustomModelDataSeparator(var2);
            return var3 < 0 ? var2 : var2.substring(Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 18), var3).trim();
         }
      }
   }

   public Integer parseItemDisplayCustomModelDataValue(Object var1) {
      if ((1036087108 * 1036087108 - 1036087108 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         double var2 = this.parseDouble(var1, Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1450571954996822949L, 13)));
         if (!Double.isFinite(var2)) {
            return null;
         } else {
            long var4 = Math.round(var2);
            if (var4 >= Xqedii_101y7xo.Xqedii_aojlqzs452us(-5802287819987300717L, 15) && var4 <= Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3347249264514392951L, 51)
               )
             {
               return Math.abs(var2 - var4) > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4843643375234647155L, 15)) ? null : (int)var4;
            } else {
               return null;
            }
         }
      }
   }

   public Integer resolveItemDisplayCustomModelData(String var1) {
      if (((340393231 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         int var2 = this.findItemDisplayCustomModelDataSeparator(var1);
         if (var2 < 0) {
            return null;
         } else {
            String var3 = var1.trim();
            String var4 = var3.substring(var2 + Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348415855, 7)).trim();
            return this.parseItemDisplayCustomModelDataValue(var4);
         }
      }
   }

   public Integer readItemDisplayCustomModelData(ConfigurationSection var1) {
      if ((-680955164 * -680955164 - -680955164 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String[] var10000 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1464941840, 25)];
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-512664187, 18)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "emke+epu9NINlSI5hcKgZbNsHjcGPsA/smBXkEMauEXcaScLGu+8FA1H8cb/mw7/XJguxqymScaQasZUhHY="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 28)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "8Ke45DRHBLalFvzawuxVxTcr0b76MzA4DsHH5kChaub0UpnIX28SXXuYPmIVcYlJn2jJSpTAzzBMLg=="
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461110, 5)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "Z7WWE9cLOIn3fF6Qa4p4PNVhd9jC55Ue7Dicq34IuCstQ7KJ9V0UEBUIIbKTq+JBii0J1iTQFl1iX6ss6aN26GwRRMQ8GuVA"
         );
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(857986679, 24)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "swcUaVmblkm9JDOciURVyH6lpS9/OcC0jt8z1DjhRHnuCQ1nsOG64oiOFRwzgQNvuNz8rVRXuHo5NwW9ggrtzGYMElo="
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2019055457, 16)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "QiRS/7wBnD4cdBdv2BtLXecYHBwzGuEUrURREZ/P4t24uSAoQJjrTlAY4EXHV0L32MuiGKQcgdS3HQ0+ytYIVhLcMiOydG4o3ezKOg=="
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588687222, 13)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "Hxahm6FVxB+dBzHG75YBSdfNvba3EheZhmaDiGyawlNjR3h0pT2NU4cVqAPC1PM7Ud7cdlbavpCLxT4Tei3CPpLBqLadC6lD"
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956108, 1)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "WXKHIyhyrRDoHAr5x6WZrt4nN2C2SBfshCqMJUKwLQ/gg9dPRCvRLE9sgZ3MCm5FP9+q1ZrG/cAI6j/dUvrF8r3bZjNDzsxjKZaTXWR30OpKWzHW+x0="
         );
         var10000[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1504825718, 24)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "21gjh4uW9YCKBMKSm2WBRIg2/g0wgPNwfC0AJDnb9kJxUvVcoTAzyZJ3zZQLNDSiv1bFqgPxLf2ezJHVCJFJRzwjrA5fzm59bvQNI/KQatnYSQ=="
         );
         String[] var2 = var10000;
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379652, 5); var5 < var4; var5++) {
            String var6 = var3[var5];
            if (var1.contains(var6)) {
               Integer var7 = this.parseItemDisplayCustomModelDataValue(var1.get(var6));
               if (var7 != null) {
                  return var7;
               }
            }
         }

         return null;
      }
   }

   public boolean isItemDisplayPlayerHeadToken(String var1) {
      if ((1465966841 ^ 1465966841) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 13) != 0);
      } else {
         String var2 = var1.trim();
         if (var2.isBlank()) {
            return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936192, 2) != 0);
         } else if (var2.equalsIgnoreCase(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("x9NHtqy41IYbFLSz+6t9mhK8qsSPlpxgIo43Eeszloo9YZnoVB+wlXGEuQVnDATF1ns="))) {
            return (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17) != 0);
         } else {
            return ((!var2.regionMatches(
                     (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1580323190, 23) != 0),
                     Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G1q/JfbixURqG/EiskxrpgK4Rj9sLToZ0ZzPz1kroXGXdyYQhb/Tp72+iTY5zh9ibsB7Mg=="),
                     Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 11),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G1q/JfbixURqG/EiskxrpgK4Rj9sLToZ0ZzPz1kroXGXdyYQhb/Tp72+iTY5zh9ibsB7Mg==").length()
                  )
                  && !var2.regionMatches(
                     (Xqedii_101y7xo.Xqedii_32yuti7slijjp(999854571, 15) != 0),
                     Xqedii_101y7xo.Xqedii_32yuti7slijjp(1615310062, 25),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b0Jiz9tjnRG+L+CXKtdtG2BWy49ne1vrnLSPltv+1bq3mwkitxGWbIYMRAQFf6WCzu3JQw=="),
                     Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 4),
                     Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b0Jiz9tjnRG+L+CXKtdtG2BWy49ne1vrnLSPltv+1bq3mwkitxGWbIYMRAQFf6WCzu3JQw==").length()
                  )
               ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1964232949, 29)
               : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 23)) != 0);
         }
      }
   }

   public String resolvePlayerHeadOwnerToken(String var1) {
      if ((-1294209472 ^ -1294209472) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.resolveItemDisplayMaterialToken(var1);
         if (!this.isItemDisplayPlayerHeadToken(var2)) {
            return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else if (var2.regionMatches(
            (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 20) != 0),
            Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253061, 4),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G1q/JfbixURqG/EiskxrpgK4Rj9sLToZ0ZzPz1kroXGXdyYQhb/Tp72+iTY5zh9ibsB7Mg=="),
            Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 17),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G1q/JfbixURqG/EiskxrpgK4Rj9sLToZ0ZzPz1kroXGXdyYQhb/Tp72+iTY5zh9ibsB7Mg==").length()
         )) {
            return var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("G1q/JfbixURqG/EiskxrpgK4Rj9sLToZ0ZzPz1kroXGXdyYQhb/Tp72+iTY5zh9ibsB7Mg==").length())
               .trim();
         } else {
            return var2.regionMatches(
                  (Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999709142, 16) != 0),
                  Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591360167, 18),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b0Jiz9tjnRG+L+CXKtdtG2BWy49ne1vrnLSPltv+1bq3mwkitxGWbIYMRAQFf6WCzu3JQw=="),
                  Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1156857118, 3),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b0Jiz9tjnRG+L+CXKtdtG2BWy49ne1vrnLSPltv+1bq3mwkitxGWbIYMRAQFf6WCzu3JQw==").length()
               )
               ? var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b0Jiz9tjnRG+L+CXKtdtG2BWy49ne1vrnLSPltv+1bq3mwkitxGWbIYMRAQFf6WCzu3JQw==").length())
                  .trim()
               : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         }
      }
   }

   public boolean isCustomItemToken(String var1) {
      if ((1528090911 * 1528090911 - 1528090911 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         return ((!var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("++QRwi7OdCmCi+/J9aMnovIsuKlYv8rzjE9SdjjfWbqzqatKVR73Fwiy2w8+qA5TJK0="))
               && !var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("5In+Zj71JZoOMXzBvZnAmeDImSBvKbrPibUSEdlX/z9XEg=="))
               && !var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y6FBnLFBGX29HwgCHsWihZie9EFJoV/LHUPSpohs2YxVnk4UXUE="))
               && !var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("93SBR1hsol4UgpSK/sHEPKCxWuH24nXN47dmWXWZT7BjqsRzJ751Jk4W"))
               && !var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("B/X490ULm1FhC6jHFlfaGz2PPZYee37qiotbHlbarxdvi7b5sdVtJfw2ceN0kSyhX1StWw=="))
               && !var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("wlB4ST8LKzPY92SlbPKGLS9/CD0WYwgGKvHMuRK5yFNVSw=="))
            ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(37578611, 28)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 9)) != 0);
      } else {
         return (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-664922347, 6) != 0);
      }
   }

   public ItemStack resolveCustomItemStack(String var1) {
      if (((1688386514 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim();
         String var3 = var2.toLowerCase(Locale.ROOT);
         if (var3.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("++QRwi7OdCmCi+/J9aMnovIsuKlYv8rzjE9SdjjfWbqzqatKVR73Fwiy2w8+qA5TJK0="))) {
            return this.resolveItemsAdderItemStack(
               var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("++QRwi7OdCmCi+/J9aMnovIsuKlYv8rzjE9SdjjfWbqzqatKVR73Fwiy2w8+qA5TJK0=").length())
            );
         } else if (var3.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("5In+Zj71JZoOMXzBvZnAmeDImSBvKbrPibUSEdlX/z9XEg=="))) {
            return this.resolveItemsAdderItemStack(
               var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("5In+Zj71JZoOMXzBvZnAmeDImSBvKbrPibUSEdlX/z9XEg==").length())
            );
         } else if (var3.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y6FBnLFBGX29HwgCHsWihZie9EFJoV/LHUPSpohs2YxVnk4UXUE="))) {
            return this.resolveNexoItemStack(
               var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y6FBnLFBGX29HwgCHsWihZie9EFJoV/LHUPSpohs2YxVnk4UXUE=").length())
            );
         } else if (var3.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("93SBR1hsol4UgpSK/sHEPKCxWuH24nXN47dmWXWZT7BjqsRzJ751Jk4W"))) {
            return this.resolveOraxenItemStack(
               var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("93SBR1hsol4UgpSK/sHEPKCxWuH24nXN47dmWXWZT7BjqsRzJ751Jk4W").length())
            );
         } else if (var3.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("B/X490ULm1FhC6jHFlfaGz2PPZYee37qiotbHlbarxdvi7b5sdVtJfw2ceN0kSyhX1StWw=="))) {
            return this.resolveCraftEngineItemStack(
               var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("B/X490ULm1FhC6jHFlfaGz2PPZYee37qiotbHlbarxdvi7b5sdVtJfw2ceN0kSyhX1StWw==").length())
            );
         } else {
            return var3.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("wlB4ST8LKzPY92SlbPKGLS9/CD0WYwgGKvHMuRK5yFNVSw=="))
               ? this.resolveCraftEngineItemStack(
                  var2.substring(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("wlB4ST8LKzPY92SlbPKGLS9/CD0WYwgGKvHMuRK5yFNVSw==").length())
               )
               : null;
         }
      } else {
         return null;
      }
   }

   public ItemStack resolveItemsAdderItemStack(String var1) {
      if (((757070771 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Plugin var2 = Bukkit.getPluginManager()
            .getPlugin(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("bhReQtUDwDzwndibAsLZhvS5coMoKEYezIcnEokZD/mveeBO5EWCd4CtXS6bFSeV"));
         if (var2 != null && var2.isEnabled()) {
            try {
               Class var3 = Class.forName(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "Fe/Nv0eDqMImriTRZKQ6R674Ci9yFt1UIKxk9hHTwFU/nzP1Oypbo+JPNl5gh3DrimzzXIpssFr8V7SM3+KxvJX+3q6mRrcG3aXhxyYPBAseMl/GzhHFhSBgzkyhf+wsZro="
                  )
               );
               String var10001 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("tL+0ZGRl3Qg6nu4v8wDwuIvLdToCBzzynuYXjW83CRKj82Wn5RjnS5uVjr7c0NLu6UE=");
               Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024804085, 19)];
               var10002[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207992, 6)] = String.class;
               Method var4 = var3.getMethod(var10001, var10002);
               Object[] var10 = new Object[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17)];
               var10[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16)] = var1;
               Object var5 = var4.invoke(null, var10);
               if (var5 == null) {
                  return null;
               } else {
                  Method var6 = var3.getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("7CQSCXn5drPqziXo1RI7mWtFDFKV48pdaZWdiPAGS2DjNa/BuedwzxgwxO80aCZvfwGA+w=="));
                  return var6.invoke(var5) instanceof ItemStack var8 ? var8.clone() : null;
               }
            } catch (Throwable var9) {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public ItemStack resolveNexoItemStack(String var1) {
      if ((-1611881163 * (-1611881163 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Plugin var2 = Bukkit.getPluginManager().getPlugin(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Q5Ne1fbsuyfLyBI4CmcYBQ8coUp8ZlDOsohh5PLQ9kf9bJeT"));
         if (var2 != null && var2.isEnabled()) {
            try {
               Class var3 = Class.forName(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "3hED0WqngLNlPkALx56aHLvKWg5KGCo60E6iz6ZEsNsQddr8MeFT2H9M5d+oBbZ04wFuc54PCOxt10eubJlBhyJBw6MOfx/U0scPS2vJ8Rfl71iLlqo="
                  )
               );
               String var10001 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("agV2JuB9rAUzPePQwbh9692n46DNtEL1t2zTVTiQvIbcSdNy02xCT0B1+3e4i38k");
               Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17)];
               var10002[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591360167, 18)] = String.class;
               Method var4 = var3.getMethod(var10001, var10002);
               Object[] var10 = new Object[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663417, 9)];
               var10[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 16)] = var1;
               Object var5 = var4.invoke(null, var10);
               if (var5 == null) {
                  return null;
               } else {
                  Method var6 = var5.getClass().getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("EiUkTx+qYhr4Dk+88b3jf0eVgGmD8j/ZuPkg2hLH587kQd2N++M="));
                  return var6.invoke(var5) instanceof ItemStack var8 ? var8.clone() : null;
               }
            } catch (Throwable var9) {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public ItemStack resolveOraxenItemStack(String var1) {
      if ((-793351275 * (-793351275 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Plugin var2 = Bukkit.getPluginManager().getPlugin(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("r27N9kY8NAbp45hep+y+OvkJuxcYnQP8UypZ7/3ET8Y6q3M4QdGzCQ=="));
         if (var2 != null && var2.isEnabled()) {
            try {
               Class var3 = Class.forName(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "TOhXkuMOkhW+R3SQcDSiSXWypsAOx+Ewec97RVuT7pCN5/paHvnSn6hptixJ476g+CfkuYdKWmix6Hljfb3JmD3fOYy4mmnFnxwUD6IbgCYQXiWWzG+GR/Por0l9yw=="
                  )
               );
               String var10001 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("f7VcCb9fU4raaBfKORMNgZb6VFACLRSal9O3jCbYNKDpoIeh/ehdSyB1AUvYFND3/Ds=");
               Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936188, 2)];
               var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 3)] = String.class;
               Method var4 = var3.getMethod(var10001, var10002);
               Object[] var10 = new Object[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735594557, 12)];
               var10[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253061, 4)] = var1;
               Object var5 = var4.invoke(null, var10);
               if (var5 == null) {
                  return null;
               } else {
                  Method var6 = var5.getClass().getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("EiUkTx+qYhr4Dk+88b3jf0eVgGmD8j/ZuPkg2hLH587kQd2N++M="));
                  return var6.invoke(var5) instanceof ItemStack var8 ? var8.clone() : null;
               }
            } catch (Throwable var9) {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public ItemStack resolveCraftEngineItemStack(String var1) {
      if ((322513226 * (322513226 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Plugin var2 = Bukkit.getPluginManager()
            .getPlugin(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ElqG0RZYKGcJ3yxtlXkUFfSP0IochofS1Pez/AX7ZqteiRZ3uWcuoQ+/g7lPAbbtC+w="));
         if (var2 != null && var2.isEnabled()) {
            try {
               Class var3 = Class.forName(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                     "L08dD4rmjQRbXjutAhfY/UGOv+ACW9FZ5fu60KOymJLZHXwAFmmO/OHTDhgF9DhnVHPBtGpdLsSZNZIF6+H+QdhU5jf22NXl/Y6gsZJsbJfOvqt8ZgaBLYDp0u/+1sZ564p/iu06PYucYGqRiYxUWqa7PJFyCU7y7PTm1FqoKWTyj1HNWZk9Ow=="
                  )
               );
               String var10001 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("th57s0Y6k3LcREWmIDOyEHtUEFdPh68E7mi+Vs1ENVCICYN7");
               Class[] var10002 = new Class[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29)];
               var10002[Xqedii_101y7xo.Xqedii_32yuti7slijjp(150314444, 30)] = String.class;
               Method var4 = var3.getMethod(var10001, var10002);
               Object[] var10 = new Object[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 15)];
               var10[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461174, 5)] = var1.trim();
               Object var5 = var4.invoke(null, var10);
               if (var5 == null) {
                  return null;
               } else {
                  Method var6 = var5.getClass()
                     .getMethod(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("HtA4rgFHn0Om9vBu+BVunVGy8vAonZfvSUifzgm02SK33p7tMkztI19O7y2eHBHXDrMDvFbf9+3Isg=="));
                  var6.setAccessible((Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 4) != 0));
                  return var6.invoke(var5) instanceof ItemStack var8 ? var8.clone() : null;
               }
            } catch (Throwable var9) {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public Material resolveItemDisplayMaterial(String var1) {
      if ((-804726949 * (-804726949 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim();
         if (this.isItemDisplayPlayerHeadToken(var2)) {
            return Material.PLAYER_HEAD;
         } else {
            Material var3 = Material.matchMaterial(var2);
            if (var3 == null && var2.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ygz6lbE2txbOfRxAbj9+QX1K/7C8yXjFqRYBfKWv"))) {
               var3 = Material.matchMaterial(
                  var2.substring(var2.indexOf(Xqedii_101y7xo.Xqedii_x42dgjucv46g(1900949131, 27)) + Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 14))
               );
            }

            if (var3 == null) {
               var3 = Material.matchMaterial(var2.toUpperCase(Locale.ROOT));
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public void renderSimpleOutline(
      Player var1, RoundedBox var2, String var3, int var4, TextAlignment var5, TextAlignment var6, RoundedTransform var7, double var8, double var10
   ) {
      if ((650854032 * 650854032 + 650854032 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null && !var3.isBlank() && !(var8 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(2955665640084908268L, 48)))) {
         double var12 = var2.x();
         double var14 = var2.y();
         double var16 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104614377286L, 25)), var2.width());
         double var18 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4644876531819942393L, 3)), var2.height());
         if (this.hudService.getHud(var1, var2.baseId()) instanceof ItemDisplay var21) {
            ItemStack var22 = var21.getItemStack();
            if (var22 != null && var22.getType().isBlock()) {
               double var23 = Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3317975866936564873L, 3)),
                  var16 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3317115625580516201L, 3))
               );
               double var25 = Math.max(
                  Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7895089916530141022L, 5)),
                  var18 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-2562556614068191782L, 60))
               );
               double var27 = var23 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(7616751756415709892L, 29));
               double var29 = var25 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7952707876880416091L, 2));
               double var31 = var25 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-223981408359156039L, 11));
               var12 -= (var23 - var16) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1205769502497844619L, 20));
               var14 -= (var25 - var18) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606521158L, 21));
               var12 -= var27;
               var14 -= var29 + var31;
               var16 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606003016L, 13)), var23 + var27);
               var18 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581507150710L, 29)), var25 + var29);
            }
         }

         double var36 = var12 - var8;
         double var37 = var14 - var8;
         double var38 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3317972630877594486L, 57)),
            var16 + var8 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-5802287819987292525L, 15))
         );
         double var39 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8473322760702985190L, 54)),
            var18 + var8 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3338344382317028214L, 55))
         );
         double var40 = Double.isFinite(var10) ? var10 : var2.layer() - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8087893531181136535L, 54));
         double[] var41 = this.resolvePivotAwareTopLeft(var36, var37, var38, var39, var7.pivotX(), var7.pivotY(), var7.rotationDeg());
         Placement var32 = this.positionCalculator
            .calculateBoxPlacement(
               var41[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 7)], var41[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823778182, 13)], var40, var38, var39
            );
         String var33 = Xqedii_2jvo6d0vs0xkw(var2.baseId());
         this.upsertHud(var1, var33, var32.location(), var32.scale(), var3, var4, var5, var6, Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484435172, 6));
         this.applyElementTransformById(var1, var33, var7.rotationDeg(), var7.mirrorX(), var7.mirrorY());
      } else {
         this.clearOutlineHud(var1, var2.baseId());
      }
   }

   public void renderRoundedBlockForElement(Player var1, HoverElement var2) {
      if (((-296134123 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         if (var3 != null && var2 != null) {
            TextAlignment var4 = var2.hudAlignment == null ? TextAlignment.CENTER : var2.hudAlignment;
            double var5 = this.applyTextAlignmentOffset(
               this.toRenderX(var3, var2.baseLocation.getX()), this.toRenderSize(var3, var2.baseScale.getX()), var2.textAlignment
            );
            double var7 = this.toRenderY(var3, var2.baseLocation.getY());
            double var9 = this.toRenderSize(var3, var2.baseScale.getX());
            double var11 = this.toRenderSize(var3, var2.baseScale.getY());
            double var13 = var5 + this.toRenderSize(var3, var2.pivotOffsetX);
            double var15 = var7 + this.toRenderSize(var3, var2.pivotOffsetY);
            double var17 = Double.isFinite(var2.roundedRadius) ? var2.roundedRadius : this.readRoundedRadius(null, var9, var11);
            double var19 = this.toRenderSize(
               var3, Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4895529521914535668L, 32)), var2.outlineSize)
            );
            if (var19 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-2989991516215162333L, 12))) {
               String var21 = var2.outlineText;
               if (var21 == null || var21.isBlank()) {
                  var21 = this.applyOutlineColor(var2.text, var2.outlineColor);
               }

               double var22 = Double.isFinite(var2.outlineLayer)
                  ? this.toRuntimeLayer(var3, var2.outlineLayer)
                  : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571718294L, 18));
               this.renderRoundedOutline(
                  var1,
                  new RoundedBox(var2.id, var5, var7, var2.runtimeZ, var9, var11),
                  var21,
                  var2.opacity,
                  var17,
                  new RoundedCornerGlyphs(
                     var2.roundedCornerUnicode,
                     var2.roundedCornerUnicodeTopLeft,
                     var2.roundedCornerUnicodeTopRight,
                     var2.roundedCornerUnicodeBottomRight,
                     var2.roundedCornerUnicodeBottomLeft
                  ),
                  new RoundedCornerOffsets(
                     var2.roundedTopLeftOffsetX,
                     var2.roundedTopLeftOffsetY,
                     var2.roundedTopRightOffsetX,
                     var2.roundedTopRightOffsetY,
                     var2.roundedBottomRightOffsetX,
                     var2.roundedBottomRightOffsetY,
                     var2.roundedBottomLeftOffsetX,
                     var2.roundedBottomLeftOffsetY
                  ),
                  new RoundedTransform(var2.rotationDeg, var2.mirrorX, var2.mirrorY, var13, var15),
                  var19,
                  var4,
                  var22
               );
            } else {
               this.clearOutlineHud(var1, var2.id);
            }

            this.renderRoundedBlock(
               var1,
               new RoundedBox(var2.id, var5, var7, var2.runtimeZ, var9, var11),
               var2.text,
               var2.opacity,
               var17,
               new RoundedCornerGlyphs(
                  var2.roundedCornerUnicode,
                  var2.roundedCornerUnicodeTopLeft,
                  var2.roundedCornerUnicodeTopRight,
                  var2.roundedCornerUnicodeBottomRight,
                  var2.roundedCornerUnicodeBottomLeft
               ),
               new RoundedCornerOffsets(
                  var2.roundedTopLeftOffsetX,
                  var2.roundedTopLeftOffsetY,
                  var2.roundedTopRightOffsetX,
                  var2.roundedTopRightOffsetY,
                  var2.roundedBottomRightOffsetX,
                  var2.roundedBottomRightOffsetY,
                  var2.roundedBottomLeftOffsetX,
                  var2.roundedBottomLeftOffsetY
               ),
               new RoundedTransform(var2.rotationDeg, var2.mirrorX, var2.mirrorY, var13, var15),
               var4
            );
         }
      }
   }

   public void renderRoundedBlock(
      Player var1,
      RoundedBox var2,
      String var3,
      int var4,
      double var5,
      RoundedCornerGlyphs var7,
      RoundedCornerOffsets var8,
      RoundedTransform var9,
      TextAlignment var10
   ) {
      if ((1715234613 * (1715234613 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TextAlignment var11 = var10 == null ? TextAlignment.CENTER : var10;
         double var12 = this.resolveRoundedRadiusScale(var1, var2.baseId());
         double var14 = Math.min(
            Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-7804885342893042482L, 7)), var5 * var12),
            Math.min(var2.width(), var2.height()) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205113195931462L, 35))
         );
         double var16 = this.shouldApplyRotationVisualShift(var2.baseId())
            ? this.resolveRotationVisualXOffset(var9.rotationDeg(), var2.width())
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1912454558621962492L, 46));
         double var18 = this.shouldApplyRotationVisualShift(var2.baseId())
            ? this.resolveRotationVisualYOffset(var9.rotationDeg(), var2.height())
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 26));
         if (var14 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039099482770253638L, 47))) {
            this.removeRoundedParts(var1, var2.baseId());
            double var82 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-3426062257993456783L, 5)), var2.width());
            double var83 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(3377836028316776053L, 47)), var2.height());
            double[] var84 = this.resolvePivotAwareTopLeft(var2.x(), var2.y(), var82, var83, var9.pivotX(), var9.pivotY(), var9.rotationDeg());
            Placement var25 = this.positionCalculator
               .calculateBoxPlacement(
                  var84[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394642806, 12)] + var16,
                  var84[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712822, 10)] + var18,
                  var2.layer(),
                  var82,
                  var83
               );
            this.upsertHud(
               var1, var2.baseId(), var25.location(), var25.scale(), var3, var4, var11, TextAlignment.CENTER, Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005652, 0)
            );
            this.applyElementTransformById(var1, var2.baseId(), var9.rotationDeg(), var9.mirrorX(), var9.mirrorY());
         } else {
            this.removeBaseHud(var1, var2.baseId());
            double var20 = this.normalizeRenderRotation(var9.rotationDeg());
            double var22 = var12 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-2989991516215162333L, 12))
               ? var2.height() / var12
               : var2.height();
            double var24 = var22 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1135374018252635089L, 34))
               ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3117755449189508647L, 41))
               : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 61));
            double var26 = this.shouldApplyShellRoundedTopShift(var1, var2.baseId())
               ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(3377836028316776053L, 47))
               : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 33));
            double var28 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2304423867400489214L, 2)),
               var2.width() - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3383380378590733174L, 57)) * var14
            );
            double var30 = var2.y() + var14 + var24;
            double var32 = var2.y() + var2.height() - var14 + var24;
            double var34 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(9082992111588728456L, 37)), var32 - var30);
            double var36 = Double.isFinite(var9.pivotX())
               ? var9.pivotX()
               : var2.x() + var2.width() / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769174L, 7));
            double var38 = Double.isFinite(var9.pivotY())
               ? var9.pivotY()
               : var2.y() + var2.height() / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8021190706096514886L, 56));
            double[] var40 = this.rotateTopLeftAroundPivot(var2.x() + var14, var30, var28, var34, var36, var38, var20);
            double[] var41 = this.rotateTopLeftAroundPivot(var2.x() + var14, var2.y() + var24 + var26, var28, var14, var36, var38, var20);
            double[] var42 = this.rotateTopLeftAroundPivot(var2.x() + var14, var32, var28, var14, var36, var38, var20);
            double[] var43 = this.rotateTopLeftAroundPivot(var2.x(), var30, var14, var34, var36, var38, var20);
            double[] var44 = this.rotateTopLeftAroundPivot(var2.x() + var2.width() - var14, var30, var14, var34, var36, var38, var20);
            int var45 = Math.abs(var20) < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5845307327128147074L, 63))
               ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712310, 9)
               : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936192, 2);
            this.upsertRoundedPart(
               var1,
               Xqedii_pqwad18h7xl(var2.baseId()),
               var40[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-982116475, 28)] + var16,
               var40[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711766, 5)] + var18,
               var28,
               var4 >= Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005667, 0)
                  ? var34 + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3345003024734839670L, 55))
                  : var34,
               var2.layer(),
               var3,
               var4,
               (var45 != 0),
               var11
            );
            this.upsertRoundedPart(
               var1,
               Xqedii_13oq989eylnqn(var2.baseId()),
               var41[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(789285612, 13)] + var16,
               var41[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 31)] + var18,
               var28,
               var14,
               var2.layer(),
               var3,
               var4,
               (var45 != 0),
               var11
            );
            this.upsertRoundedPart(
               var1,
               Xqedii_17xylj7znmgo(var2.baseId()),
               var42[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1615310062, 25)] + var16,
               var42[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 26)] + var18,
               var28,
               var14,
               var2.layer(),
               var3,
               var4,
               (var45 != 0),
               var11
            );
            this.upsertRoundedPart(
               var1,
               Xqedii_3tccbuvlu4kxo(var2.baseId()),
               var43[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 17)] + var16,
               var43[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394646902, 12)] + var18,
               var14,
               var34,
               var2.layer(),
               var3,
               var4,
               (var45 != 0),
               var11
            );
            this.upsertRoundedPart(
               var1,
               Xqedii_1ev6ve056o3nl(var2.baseId()),
               var44[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207992, 6)] + var16,
               var44[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207928, 6)] + var18,
               var14,
               var34,
               var2.layer(),
               var3,
               var4,
               (var45 != 0),
               var11
            );
            this.applyElementTransformById(var1, Xqedii_3vujholljv8ty(var2.baseId()), var9.rotationDeg(), var9.mirrorX(), var9.mirrorY());
            this.applyElementTransformById(var1, Xqedii_2rbdo9ys22pw3(var2.baseId()), var9.rotationDeg(), var9.mirrorX(), var9.mirrorY());
            this.applyElementTransformById(var1, Xqedii_qq1s4jqbuan3(var2.baseId()), var9.rotationDeg(), var9.mirrorX(), var9.mirrorY());
            this.applyElementTransformById(var1, Xqedii_3l4wq0jzzpogi(var2.baseId()), var9.rotationDeg(), var9.mirrorX(), var9.mirrorY());
            this.applyElementTransformById(var1, Xqedii_3tm3orlgcz0u4(var2.baseId()), var9.rotationDeg(), var9.mirrorX(), var9.mirrorY());
            double var46 = var14 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205106757674822L, 33));
            String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(482333988, 21)];
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 28)] = var7.topLeft();
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394646902, 12)] = var7.topRight();
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431652, 9)] = var7.bottomRight();
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(399890526, 22)] = var7.bottomLeft();
            int var48 = !this.firstNonBlank(var10001).isBlank()
               ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588695414, 14)
               : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1182720333, 19);
            boolean var49 = this.isPreviewContentRuntimeId(var2.baseId());
            double var50;
            double var52;
            double var54;
            double var56;
            double var58;
            double var60;
            double var62;
            double var64;
            if (var48 != 0) {
               var50 = var2.x() + var8.topLeftX();
               var52 = var2.y() + var24 + var26 + var8.topLeftY();
               var54 = var2.x() + var2.width() - var14 + var8.topRightX();
               var56 = var2.y() + var24 + var26 + var8.topRightY();
               var58 = var2.x() + var2.width() - var14 + var8.bottomRightX();
               var60 = var32 + var8.bottomRightY();
               var62 = var2.x() + var8.bottomLeftX();
               var64 = var32 + var8.bottomLeftY();
            } else {
               var50 = var2.x() + var8.topLeftX();
               var52 = var2.y() + var24 + var26 + var8.topLeftY();
               var54 = var2.x()
                  + var2.width()
                  - var14
                  - var46
                  - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605865926L, 19))
                  + var8.topRightX();
               var56 = var2.y()
                  + var24
                  + var26
                  - var46
                  - (
                     var49
                        ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-845567966255962274L, 24))
                        : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(3377836028316776053L, 47))
                  )
                  + var8.topRightY();
               var58 = var2.x() + var2.width() - var14 + var8.bottomRightX();
               var60 = var32
                  - var14
                  - (
                     var49
                        ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7112388743198648931L, 37))
                        : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769334L, 9))
                  )
                  + var8.bottomRightY();
               var62 = var2.x()
                  + var46
                  + (
                     var49
                        ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205103800690502L, 30))
                        : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3772586978881441093L, 61))
                  )
                  + var8.bottomLeftX();
               var64 = var32 - var46 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6294190195578171455L, 50)) + var8.bottomLeftY();
               if (var49) {
                  var54 += this.resolvePreviewCornerZoomOffset(
                     var12,
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(5456127424730602909L, 45)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(5800356550303537338L, 0))
                  );
                  var56 += this.resolvePreviewCornerZoomOffset(
                     var12,
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7112388811968457315L, 37)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347347183525258102L, 44))
                  );
                  var58 += this.resolvePreviewCornerZoomOffset(
                     var12,
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1542315003276148362L, 19)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6108224047501410224L, 22))
                  );
                  var60 += this.resolvePreviewCornerZoomOffset(
                     var12,
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7089426984513689515L, 29)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205156162381638L, 36))
                  );
                  var62 += this.resolvePreviewCornerZoomOffset(
                     var12,
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8043699908140345158L, 54)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205096007673670L, 35))
                  );
                  var64 += this.resolvePreviewCornerZoomOffset(
                     var12,
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-3544713492256910294L, 28)),
                     Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-1558878274619003668L, 40))
                  );
               }
            }

            double[] var66 = this.rotateTopLeftAroundPivot(var50, var52, var14, var14, var36, var38, var20);
            double[] var67 = this.rotateTopLeftAroundPivot(var54, var56, var14, var14, var36, var38, var20);
            double[] var68 = this.rotateTopLeftAroundPivot(var58, var60, var14, var14, var36, var38, var20);
            double[] var69 = this.rotateTopLeftAroundPivot(var62, var64, var14, var14, var36, var38, var20);
            this.logRoundedCornerPosition(
               Xqedii_2yd07l78l69ds(var2.baseId()),
               var66[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 2)],
               var66[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647556363, 14)]
            );
            this.logRoundedCornerPosition(
               Xqedii_3u0rqz93gfryt(var2.baseId()),
               var67[Xqedii_101y7xo.Xqedii_32yuti7slijjp(37578611, 28)],
               var67[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189842, 4)]
            );
            this.logRoundedCornerPosition(
               Xqedii_3ul6cej1yzatr(var2.baseId()),
               var68[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 15)],
               var68[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711794, 2)]
            );
            this.logRoundedCornerPosition(
               Xqedii_1bet2mgff0vxh(var2.baseId()),
               var69[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 15)],
               var69[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 10)]
            );
            String[] var10003 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295417940, 17)];
            var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 25)] = var7.topLeft();
            var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 9)] = var7.all();
            String var70 = this.roundedCornerTextFromBody(var3, this.firstNonBlank(var10003));
            var10003 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1682418926, 25)];
            var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 28)] = var7.topRight();
            var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 26)] = var7.all();
            String var71 = this.roundedCornerTextFromBody(var3, this.firstNonBlank(var10003));
            var10003 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-222622782, 27)];
            var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 26)] = var7.bottomRight();
            var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 15)] = var7.all();
            String var72 = this.roundedCornerTextFromBody(var3, this.firstNonBlank(var10003));
            var10003 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(350213412, 27)];
            var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507639439, 10)] = var7.bottomLeft();
            var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29)] = var7.all();
            String var73 = this.roundedCornerTextFromBody(var3, this.firstNonBlank(var10003));
            double var74;
            double var76;
            double var78;
            double var80;
            if (var48 != 0) {
               var74 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 13));
               var76 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 28));
               var78 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 16));
               var80 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4608847734800978427L, 3));
            } else {
               var74 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 47)) + var20;
               var76 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(5795852950676162414L, 15)) + var20;
               var78 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581563399798L, 25)) + var20;
               var80 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104610702214L, 23)) + var20;
            }

            this.upsertRoundedCorner(
               var1,
               Xqedii_vsedf4kykyns(var2.baseId()),
               var66[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635277911, 8)] + var16,
               var66[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 31)] + var18,
               var14,
               var2.layer(),
               var4,
               var74,
               var70,
               (var45 != 0),
               var11
            );
            this.upsertRoundedCorner(
               var1,
               Xqedii_2wuhtpk497om7(var2.baseId()),
               var67[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16)] + var16,
               var67[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 30)] + var18,
               var14,
               var2.layer(),
               var4,
               var76,
               var71,
               (var45 != 0),
               var11
            );
            this.upsertRoundedCorner(
               var1,
               Xqedii_28z82jz3b8kct(var2.baseId()),
               var68[Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628888, 31)] + var16,
               var68[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(783003836, 23)] + var18,
               var14,
               var2.layer(),
               var4,
               var78,
               var72,
               (var45 != 0),
               var11
            );
            this.upsertRoundedCorner(
               var1,
               Xqedii_3jayotojthasn(var2.baseId()),
               var69[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 18)] + var16,
               var69[Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094921, 3)] + var18,
               var14,
               var2.layer(),
               var4,
               var80,
               var73,
               (var45 != 0),
               var11
            );
            this.applyHudMirrorById(var1, Xqedii_3o69pfbxlivqg(var2.baseId()), var9.mirrorX(), var9.mirrorY());
            this.applyHudMirrorById(var1, Xqedii_yqn3z6pqn16y(var2.baseId()), var9.mirrorX(), var9.mirrorY());
            this.applyHudMirrorById(var1, Xqedii_e2trh4wm6568(var2.baseId()), var9.mirrorX(), var9.mirrorY());
            this.applyHudMirrorById(var1, Xqedii_2si0g0u103l1v(var2.baseId()), var9.mirrorX(), var9.mirrorY());
         }
      }
   }

   public void renderRoundedOutline(
      Player var1,
      RoundedBox var2,
      String var3,
      int var4,
      double var5,
      RoundedCornerGlyphs var7,
      RoundedCornerOffsets var8,
      RoundedTransform var9,
      double var10,
      TextAlignment var12,
      double var13
   ) {
      if (((1442680709 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var3 != null && !var3.isBlank() && !(var10 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(738916410021227067L, 46)))) {
         double var15 = var2.x() - var10;
         double var17 = var2.y() - var10;
         double var19 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351570649801590L, 36)),
            var2.width() + var10 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5500734611329316173L, 34))
         );
         double var21 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8611430846603531298L, 29)),
            var2.height() + var10 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4249043029678182121L, 11))
         );
         double var23 = Double.isFinite(var13) ? var13 : var2.layer() - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-9083828045389114181L, 57));
         double var25 = this.resolveRoundedRadiusScale(var1, var2.baseId());
         double var27 = var5 + var10 / var25;
         String var29 = this.withRoundedCornerBaseColor(var3, var7.all());
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591098023, 18)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 10)] = var7.topLeft();
         String var30 = this.firstNonBlank(var10001).isBlank()
            ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
            : this.withRoundedCornerBaseColor(var3, var7.topLeft());
         var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635277911, 8)] = var7.topRight();
         String var31 = this.firstNonBlank(var10001).isBlank()
            ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
            : this.withRoundedCornerBaseColor(var3, var7.topRight());
         var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1427362037, 29)];
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1202515552, 1)] = var7.bottomRight();
         String var32 = this.firstNonBlank(var10001).isBlank()
            ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
            : this.withRoundedCornerBaseColor(var3, var7.bottomRight());
         var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635278167, 8)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20)] = var7.bottomLeft();
         String var33 = this.firstNonBlank(var10001).isBlank()
            ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
            : this.withRoundedCornerBaseColor(var3, var7.bottomLeft());
         this.renderRoundedBlock(
            var1,
            new RoundedBox(Xqedii_3kqjbuciqdwmw(var2.baseId()), var15, var17, var23, var19, var21),
            var3,
            var4,
            var27,
            new RoundedCornerGlyphs(var29, var30, var31, var32, var33),
            new RoundedCornerOffsets(
               var8.topLeftX(),
               var8.topLeftY(),
               var8.topRightX(),
               var8.topRightY(),
               var8.bottomRightX(),
               var8.bottomRightY(),
               var8.bottomLeftX(),
               var8.bottomLeftY()
            ),
            new RoundedTransform(var9.rotationDeg(), var9.mirrorX(), var9.mirrorY(), var9.pivotX(), var9.pivotY()),
            var12
         );
      } else {
         this.clearOutlineHud(var1, var2.baseId());
      }
   }

   public boolean isInputType(String var1) {
      if ((692902714 * (692902714 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635278167, 8)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 4)] = var1;
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         int var3 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(1588711797, 28);
         switch (var2.hashCode()) {
            case 100358090:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("3/DW+dxtYykqVzho3jNPj8L7qbEKi8dNDu0jMFeZ944H4A5xMQo="))) {
                  var3 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 16);
               }
               break;
            case 470718913:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("bQcys8HDaRfF7ZqLGqyBj/xoQBZzTKmKHBy4/Q58EjYml9D3ErdgIZPSBJ0="))) {
                  var3 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588662646, 14);
               }
               break;
            case 1705792840:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("A2eM45MBO/9srbkJxKktOZxs5SdCbNtR7CSoaJOVBLtEcO0YuajtVEEBUpdeFg=="))) {
                  var3 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 16);
               }
               break;
            case 1707282390:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("vZBnWo8iNOi3gdWKn44EWAxhrBH465BYU2bsM0LfeXP0QPdl1bft/rKxNCvcew=="))) {
                  var3 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-512139899, 18);
               }
         }
         return ((switch (var3) {
            case 0, 1, 2, 3 -> Xqedii_101y7xo.Xqedii_32yuti7slijjp(-997238308, 26);
            default -> Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005596, 0);
         }) != 0);
      }
   }

   public String resolveElementCornerUnicode(String var1, boolean var2) {
      if ((-1014051696 * -1014051696 - -1014051696 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var2 ? this.stripRoundedCornerColorTags(var1) : var1;
      }
   }

   public boolean readInputRounded(ConfigurationSection var1) {
      if (((407860134 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 21) != 0);
      } else if (var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("PSuiExpy3oSAesfoCo6BQwkUNhuY9hncOlj25xM6/e9x1hdE+Gu/YptQ"))) {
         return this.parseBooleanFlag(
            var1.get(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("PSuiExpy3oSAesfoCo6BQwkUNhuY9hncOlj25xM6/e9x1hdE+Gu/YptQ")),
            (Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999643606, 16) != 0)
         );
      } else if (var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zeZtY5dw0yCjDN1vqFFiBV805X5p4uROyGhQU9yCzizujG4rhFcXKQsTLtQ="))) {
         if (var1.isConfigurationSection(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zeZtY5dw0yCjDN1vqFFiBV805X5p4uROyGhQU9yCzizujG4rhFcXKQsTLtQ="))) {
            return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 27) != 0);
         } else {
            String var2 = this.normalizeRoundedMode(
               var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zeZtY5dw0yCjDN1vqFFiBV805X5p4uROyGhQU9yCzizujG4rhFcXKQsTLtQ="))
            );
            return ((!var2.isBlank() && !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DJ81UxGzJQq2JgmzWxnKXQu4hzHJ8STKpXcy1F2FZ5I0q+Kh").equals(var2)
               ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(195750959, 21)
               : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(193653807, 21)) != 0);
         }
      } else {
         return ((!var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GCDne0iZWk08+yHVfIakcndweC4dUd/LpenmzX21K1BGdjJ3YbRewQ=="))
               && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rT64wNHvmmEYaFJqLCznQOxHXIFh+pHqA7SbBkBzhfiL64XqK0YHbw=="))
               && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("KIzTVY2ZR2xgJF1aOJn5sWBU+oH/LwBazcumUmZit/a3fagJ2I1r1ldjZjWq+eFJRYNTcgOe"))
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 18)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 14)) != 0);
      }
   }

   public boolean hasDirectionalRoundedCorners(ConfigurationSection var1) {
      if ((-907602082 ^ -907602082) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 23) != 0);
      } else {
         String[] var2 = Xqedii_2mql9fq.Xqedii_3clru1j;
         int var3 = var2.length;

         for (int var4 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 31); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (!this.readRoundedCornerUnicodeByKey(var1, var5).isBlank()) {
               return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 31) != 0);
            }
         }

         String var6 = this.normalizeRoundedMode(
            var1.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zeZtY5dw0yCjDN1vqFFiBV805X5p4uROyGhQU9yCzizujG4rhFcXKQsTLtQ="))
         );
         return ((!var6.isBlank() && !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DJ81UxGzJQq2JgmzWxnKXQu4hzHJ8STKpXcy1F2FZ5I0q+Kh").equals(var6)
            ? Xqedii_101y7xo.Xqedii_x42dgjucv46g(558771850, 31)
            : Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628888, 31)) != 0);
      }
   }

   public String resolveInputId(ConfigurationSection var1, String var2) {
      if (((-1656580092 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         String[] var3 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1521602934, 26)];
         var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 11)] = var2;
         return this.firstNonBlank(var3);
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1000018411, 15)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 22)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Db/bja4T2MPXnCaUSZ340nEHLKv5HC55LrxjZIynmUmmNTn5bXIxCP1c88A=")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1648864494, 25)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("O2Qy7I7KAJLab29yY+cXWPvW39VmJo14UUNPTUGxAxiFKY0W6xO3l/1r")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844437, 7)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("y+AE5iFMME0IVq9lvP2vOjDPJMlZGC9idv+krHWjDME=")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(199945263, 21)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rLtugbClVXyE8Ki/QNylSdXXZdtLeaL7MfJaJ4wJMy1tzRqk80ffmCd9Ib8=")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1749527790, 25)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/M6aCh/i5Eb3aU323vkZjt46HetQdfb5wYsoUH088moVh2Rv")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(891541111, 24)] = var2;
         return this.firstNonBlank(var10001).trim();
      }
   }

   public String resolveInputVariable(ConfigurationSection var1, String var2) {
      if ((1707274649 ^ 1707274649) != 0) {
         throw new IllegalStateException();
      } else {
         String var10000;
         if (var1 == null) {
            var10000 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-997238308, 26)];
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 25)] = var1.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rLtugbClVXyE8Ki/QNylSdXXZdtLeaL7MfJaJ4wJMy1tzRqk80ffmCd9Ib8=")
            );
            var10000 = this.firstNonBlank(var10001).trim();
         }

         String var3 = var10000;
         return var3.isBlank() ? var2 : var3;
      }
   }

   public String readInputValue(Player var1, EditorSession var2, ConfigurationSection var3, String var4, String var5, String var6) {
      if ((-1793736175 * (-1793736175 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var2 != null) {
            if (this.isInputFocused(var2, var4, var5, var6)) {
               String var7 = (String)var2.runtimeVariables.get(Xqedii_2kc5iut4wwweo(this.focusedInputKey(var2)));
               if (var7 != null) {
                  return var7;
               }
            }

            String var8 = (String)var2.runtimeVariables.get(var5);
            if (var8 == null) {
               var8 = (String)var2.runtimeVariables.get(var4);
            }

            if (var8 != null) {
               return var8;
            }
         }

         String var10000;
         if (var3 == null) {
            var10000 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1682418926, 25)];
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 11)] = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("9qUBcsYYbzaZ9+uJ2U6yKNZNZmTw64ztrc2iPClxFr1KV3Jst8Vs0UDu")
            );
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-664922283, 6)] = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6gKO+juyRkV3khWdM6AU593MEGxMkLykUCg6t9ZbwbkHsmn0Iy4=")
            );
            var10000 = this.firstNonBlank(var10001);
         }

         String var9 = var10000;
         if (var9.isBlank()) {
            return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            String[] var10 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1137759312, 15)];
            var10[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024411474, 9)] = this.resolveBlockPlaceholders(var1, var2, var3, var9);
            var10[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 20)] = var9;
            return this.firstNonBlank(var10);
         }
      }
   }

   public String focusedInputKey(EditorSession var1) {
      if ((1719994684 * 1719994684 + 1719994684 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1715973358, 25)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2050656745, 20)] = var1.focusedInputRuntimeKey;
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823778182, 13)] = (String)var1.runtimeVariables
            .get(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LDKC2suvi3EkYMyFUDofcSIRrWfVcfVIrY4IKF4gXv/FE7GfEgVhZzMir0qdDQW9QiTBa0/qp6s="));
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1582784888, 24)] = var1.focusedInputElementId;
         return this.firstNonBlank(var10001).trim();
      }
   }

   public boolean isInputFocused(EditorSession var1, String var2, String var3, String var4) {
      if ((1329925263 ^ 1329925263) != 0) {
         throw new IllegalStateException();
      } else {
         String var5 = this.focusedInputKey(var1);
         if (var5.isBlank()) {
            return (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 17) != 0);
         } else {
            String[] var10002 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831709, 8)];
            var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 29)] = var4;
            if (var5.equals(this.firstNonBlank(var10002))) {
               return (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1320276342, 28) != 0);
            } else {
               Map var10000 = var1.runtimeVariables;
               var10002 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(783003836, 23)];
               var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7)] = var4;
               return ((var10000.containsKey(Xqedii_1bklz0qdpg282(this.firstNonBlank(var10002))) || !var5.equals(var2) && !var5.equals(var3)
                  ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(-2128694343, 27)
                  : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-512402043, 18)) != 0);
            }
         }
      }
   }

   public double readInputTextSize(ConfigurationSection var1) {
      if ((-1841330014 ^ -1841330014) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(4221966587681352507L, 38));
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581569665910L, 23));
         String[] var10003 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461270, 5)];
         var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 1)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "j40yd1a9LMhrc+gxiLeYSnqpBYPLLAzUBXEu6v9G8+BKp//SOEnzoKrj8OKXqg=="
         );
         var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 8)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "oluxZlJ345H3IjXE6gCjgqq1n6vjRyVPtjjo4YL4DhNWcQQNaUQlE+/wrL2jTA=="
         );
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735598653, 12)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "o6Cf+ytcS2faMX5n/1rjTt7PmdPQK98W32aiHXy2PtxVzSImwzcfgqjTjY0="
         );
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-863020580, 26)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "LuIagnwHHSjCY7ZEHtqFPXvYWg5zwnRp9bIxJn8r6TMkwBVJNUWy7xAni5HF6w=="
         );
         var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(471848228, 22)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "z5MGBPetlZL0lnzmre9jfqooP9uKujti3R4SO0J6uWZP1k2P+3rOZpPcO7U="
         );
         double var2 = this.firstPresentDouble(var1, var10002, var10003);
         return (
               var2 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 51))
                  ? var2
                  : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-3479310481893369670L, 63))
            )
            * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-1558877724594754324L, 40));
      }
   }

   public double readInputTextPadding(ConfigurationSection var1) {
      if ((-731477408 * -731477408 - -731477408 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(2447764761493090170L, 31));
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1712784432575590066L, 3));
         String[] var10003 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431144, 2)];
         var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 22)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "QpBXkP2aBuzFPi0yMboVAdvzYf/ItueNkWU6CHoQV3cnLuXu4LS0IYYowy9TygeBq17IpQ=="
         );
         var10003[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 0)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "EpAkS6IAUruYKQxx9mogHtNsv2lk5jK/tQx4FS1JKA5XF3X04Teum5tYAdzU8MMlYcMLQA=="
         );
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393662905, 9)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "ZDIhg/Fr+CWVinklew3zph9Qt6F3ZcPIXDDQ5+tFmxbrpcpgEHCXKIdaydn4xdpjD48="
         );
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-429622578, 21)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "xccG25CjW5Z5xbwNhHTfcBJGlIYYvgq14wgEluUbCsAB0VRIqTmb6IJc"
         );
         double var2 = this.firstPresentDouble(var1, var10002, var10003);
         return Double.isFinite(var2) && var2 >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 12))
            ? var2
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5500734611320927565L, 34));
      }
   }

   public TextAlignment readInputTextAlignment(ConfigurationSection var1) {
      if ((-688945169 * -688945169 + -688945169 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var10000;
         if (var1 == null) {
            var10000 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(483906852, 18)];
            var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207992, 6)] = var1.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GfiHW37/GGRg9vwvMapS8r85gG25Wcu2T8HWMD6/4k2WLXxp7zQmDM/AhXfs/j8A")
            );
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588713846, 11)] = var1.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/zeevRMDWhSfHZKLAZ9DHAjkzZtPJeMxWpmdDga05fuy5tMM1i4VjX5MfTLg0Ohr")
            );
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(733002799, 31)] = var1.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("IjlUFqW5HPjzfesd0LDJrAVNSWLSIn4G3nhnJpkzTSx+X5YP5lk=")
            );
            var10000 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         }

         String var2 = var10000;
         int var4 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(1588711797, 19);
         switch (var2.hashCode()) {
            case -1364013995:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("P6PGJh+UfUHCcpSex3j7GZkW2wBGbdNX2/v3WLZ3liJROecZRNttSQ=="))) {
                  var4 = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1025328373, 19);
               }
               break;
            case -1074341483:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("CTIFmntAYe8yo4mTUwnARhN9hW5OT/KQ7i3hPaBJbseMtcaszjHekw=="))) {
                  var4 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 28);
               }
               break;
            case 100571:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("TuU4i/jSj4AT46C6DUZ5+mUUxl/LTR6L3syqUg0A/SmtKQ=="))) {
                  var4 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1387385206, 26);
               }
               break;
            case 108511772:
               if (var2.equals(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("x8WPn5uCWceVNnbEBclj3hiT6ISaviJ44LijVaWUQpaT/JvUIgs="))) {
                  var4 = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1860258887, 27);
               }
         }
         return switch (var4) {
            case 0, 1 -> TextAlignment.CENTER;
            case 2, 3 -> TextAlignment.RIGHT;
            default -> TextAlignment.LEFT;
         };
      }
   }

   public String readInputFont(ConfigurationSection var1) {
      if ((1336659875 * (1336659875 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588719990, 12)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 6)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("qYqJSAvr7rXlTIRMzE/XvOpnnUVA+2sn+PcuJUn/YVyASPMDBOm4oUH8tol9sA==")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-867633763, 22)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("hU1y8SPIFaZO39QHB2/xa5/a8d+PdOo1E9sNdHU/SBntRI89")
         );
         return this.firstNonBlank(var10001).trim();
      }
   }

   public String readInputCaret(ConfigurationSection var1) {
      if (((535869104 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("UHQPPrTafDwtuFy3k/Jjd+vboCFBdJVPIxS8s80O");
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484398372, 15)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 27)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("TGVxNWT+L2y6k6UN3QHIOBRBu+jJxtFXe2OYLnCvjoPMEd7jQYs=")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 5)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("V3aJgVa8fB3uPGQyOjE9FpDo+Jnqs2g47ZmPn3nQIkZzeDfinDCNEezZd0Zwvf6O")
         );
         String var2 = this.firstNonBlank(var10001);
         return var2.isBlank() ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("UHQPPrTafDwtuFy3k/Jjd+vboCFBdJVPIxS8s80O") : var2;
      }
   }

   public int readInputMaxLength(ConfigurationSection var1) {
      if ((-1598084802 ^ -1598084802) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1589465462, 14);
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(9082992146097364616L, 37));
         String[] var10003 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-255938878, 17)];
         var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 15)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "ly+yJ/qsqpkJH/hkYNvxx4rxK66uUzOXBBHTVza/wYlucgklzMPlyMWr2rRrB4Uc"
         );
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348415855, 7)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "2+kpUzC7ZH6KRm9RFIWrP+dOg24dZRP95Uj5isXhy39JImEEStxXKqGbofiDUA=="
         );
         var10003[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(395696222, 22)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "bXAdkMNnLBRAIXo7s+F+oP1XmID5ER5WrCYho0wClYPEs9SG0SWnpg=="
         );
         double var2 = this.firstPresentDouble(var1, var10002, var10003);
         int var4 = (int)Math.round(var2);
         return Math.max(Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1994476615, 27), Math.min(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431328, 2), var4));
      }
   }

   public void applyInputBackgroundAlias(ConfigurationSection var1) {
      if (((1019528816 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("iwiRwjKzF9H8ww6P0hZbZ1X/yPTJM3XCIGGxsUBidXCqvmLzYBw="))) {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(185265199, 21)];
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 4)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("U1SdBS0KTe686Yms7GnJbd8TTYthvVwutd8sJUP8kzzi4KIr87LgLRHom+Opi1jnjQBy07cAER1WgjoE")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 9)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("dqwpweqWwOjwRvS/EY8QcA9yw6D9qgdhAgfG0Nl3qRUPOWLLViDNxj7u3Mf4mKlFeHWhfzX9nKwSKWS+")
         );
         var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507641487, 10)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ieP+W7RYS5i4PV8MOklIG10a1i2kv9QfAd0rjBl6KfDKYn96S87ajeHB+bp5KoqfRoRKZADJ3iSUNg==")
         );
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588703606, 13)] = var1.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("oaIPZrOZ/OU02WxJLvHA+qrDQYAOxhkwvMEo73B36rE3ked7yuF+ToeabjrJek7R")
         );
         String var2 = this.firstNonBlank(var10001).trim();
         if (!var2.isBlank()) {
            var1.set(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("iwiRwjKzF9H8ww6P0hZbZ1X/yPTJM3XCIGGxsUBidXCqvmLzYBw="),
               var2.startsWith(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("z+PPkLrWhyoRitJw01dt+4ZHJHaAB1YG+t0QtRwW"))
                  ? var2.substring(Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1137792080, 15))
                  : var2
            );
         }
      }
   }

   public double readInputFadeFactor(ConfigurationSection var1) {
      if ((2076309335 * 2076309335 + 2076309335 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("v34VQUEVGexNQ99Who02yZi15x6rA5Q30Nf4LzMfbJfwmY1rzrHMxTA3t1ltOVHW"))) {
         double var2 = var1.getDouble(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("v34VQUEVGexNQ99Who02yZi15x6rA5Q30Nf4LzMfbJfwmY1rzrHMxTA3t1ltOVHW"),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8655685029689639448L, 33))
         );
         return Double.isFinite(var2)
            ? Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 34)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-2993716693765889175L, 7)), var2)
            )
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(5878374572153987958L, 1));
      } else {
         return Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(2416232358612919158L, 62));
      }
   }

   public int readInputTextOpacity(ConfigurationSection var1, int var2) {
      if ((-318771919 * -318771919 + -318771919 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = this.readInputFadeFactor(var1);
         double var5;
         if (var1 != null
            && (
               var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jLWD1wBE4lA7IRiE37SQCQ5888cdL26LNGkMdDSbTofS0SPov0SxZWaMHv3H8ZuhIkHYOQ=="))
                  || var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QAUsXkX+bdxsF00SC8KGosVAqXtnkYl29G+OPnAW8l/z41seY9DdRgsQyP1UI0hOScPmkQ=="))
                  || var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("EwITm0HtJNqYOtjC5PEJlu9RDxv6Vdz9EraP4mXYt3bUEKZDYP+I+xz0poYdml8tyoQ="))
            )) {
            double var10002 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581840808822L, 30));
            String[] var10003 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1715973358, 25)];
            var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 19)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
               "jLWD1wBE4lA7IRiE37SQCQ5888cdL26LNGkMdDSbTofS0SPov0SxZWaMHv3H8ZuhIkHYOQ=="
            );
            var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711797, 0)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
               "QAUsXkX+bdxsF00SC8KGosVAqXtnkYl29G+OPnAW8l/z41seY9DdRgsQyP1UI0hOScPmkQ=="
            );
            var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1586614646, 20)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
               "EwITm0HtJNqYOtjC5PEJlu9RDxv6Vdz9EraP4mXYt3bUEKZDYP+I+xz0poYdml8tyoQ="
            );
            var5 = this.firstPresentDouble(var1, var10002, var10003);
            if (var5 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 32))
               && var5 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581909934966L, 31))) {
               var5 *= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-2246078253381064569L, 41));
            }

            var5 *= var3;
         } else if (var2 > 0) {
            var5 = var2;
         } else {
            var5 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8011743564751710022L, 56)) * var3;
         }

         return (int)Math.round(
            Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1205769502498106763L, 20)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5497864391457913718L, 26)), var5)
            )
         );
      }
   }

   public int readInputBackgroundOpacity(ConfigurationSection var1, int var2) {
      if ((2018551259 * 2018551259 - 2018551259 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else if (!var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6ra3Flo2/ooi6GjO+kvO73QCbEZ/4p5uF5QEUDJuydVAebSY9gHl5GovVLntsZa/lITxKljKFbGnHyPIC2a+eg=="))
         && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("YG3NMxyHNOuq37STHGLD6wupq3wlnVm+W7QOscEiNvFOoG2QUm8RTg3oMXBiNrs/bXhiJ09kWcv9gVaGlzqpvQ=="))
         && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ZPU99BVsvlxkwGbFeqCWzqIC9znbsXiU8lTxh3Eybuiw+4XkNDEqdelEYyp75pPtrPt5YQ5HcfNxrrfgL6s="))
         && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/pyk2EYdGIZ1fLeKjgtbpoHKz6wQk0J3hdx/Oh4quQRgClJhofztX26mVbjrzIEjzOE="))
         && !var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("s6zaSgCKZ8EI7ac6Mb4IBFulj1TeR+QITJtWHHyEJaMGXPAYLuz7sOpAX+1B9uzVF7QUWw=="))) {
         return var2;
      } else {
         double var10002 = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(7934162248932352886L, 0));
         String[] var10003 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711774, 3)];
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-823786374, 13)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "6ra3Flo2/ooi6GjO+kvO73QCbEZ/4p5uF5QEUDJuydVAebSY9gHl5GovVLntsZa/lITxKljKFbGnHyPIC2a+eg=="
         );
         var10003[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711800, 1)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "YG3NMxyHNOuq37STHGLD6wupq3wlnVm+W7QOscEiNvFOoG2QUm8RTg3oMXBiNrs/bXhiJ09kWcv9gVaGlzqpvQ=="
         );
         var10003[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1137759312, 15)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "ZPU99BVsvlxkwGbFeqCWzqIC9znbsXiU8lTxh3Eybuiw+4XkNDEqdelEYyp75pPtrPt5YQ5HcfNxrrfgL6s="
         );
         var10003[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1726041159, 27)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "/pyk2EYdGIZ1fLeKjgtbpoHKz6wQk0J3hdx/Oh4quQRgClJhofztX26mVbjrzIEjzOE="
         );
         var10003[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956112, 1)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "s6zaSgCKZ8EI7ac6Mb4IBFulj1TeR+QITJtWHHyEJaMGXPAYLuz7sOpAX+1B9uzVF7QUWw=="
         );
         double var3 = this.firstPresentDouble(var1, var10002, var10003);
         if (var3 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 62))
            && var3 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-580609566477492800L, 0))) {
            var3 *= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039103158993823558L, 47));
         }

         double var5 = var2
            * Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2304423867400489214L, 2)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-3131146039511833955L, 4)), var3)
            )
            / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205091960203078L, 34));
         return (int)Math.round(
            Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 20)),
               Math.min(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1135374018252307409L, 34)), var5)
            )
         );
      }
   }

   public String escapeInputMarkup(String var1) {
      if ((-2136243928 ^ -2136243928) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !var1.isEmpty()
            ? var1.replace(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("b9240MT6UCj7QfVDacZumSJrNP+rPYGUGGIgFYZa"),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ZoXZoZrZESW7C8V5tOrblTQAM4jvbM2w0eGRCt5HBlY=")
               )
               .replace(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LOa58wfdZaO9OaJBOa+v5Mzuq4hsE/Zc8Vv09/38"),
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("/FzLTNQiCJcSEoZWpHxPxPqsFcEQ6UlJsT08zcGef0s=")
               )
            : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
      }
   }

   public String fitInputValueToBox(String var1, String var2, double var3, double var5) {
      if ((1020819908 * 1020819908 - 1020819908 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.isEmpty()) {
         return var1;
      } else {
         double var7 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-6328031696005843634L, 49)),
            var5 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351855644369782L, 40))
         );
         double var9 = var3 / var7;
         if (var9 <= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7534471597702563014L, 46))) {
            return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         } else {
            double var11 = this.computeMinecraftTextPixelWidth(var2);
            String var13 = var1;

            while (!var13.isEmpty() && this.computeMinecraftTextPixelWidth(var13) + var11 > var9) {
               var13 = var13.substring(
                  var13.offsetByCodePoints(Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 19), Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591098023, 18))
               );
            }

            return var13;
         }
      }
   }

   public String resolveInputDisplayText(Player var1, EditorSession var2, ConfigurationSection var3, String var4, double var5) {
      if (((1939228066 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var7 = this.resolveInputId(var3, var4);
         String var8 = this.resolveInputVariable(var3, var7);
         String var9 = this.readInputValue(var1, var2, var3, var7, var8, var4);
         boolean var10 = this.isInputFocused(var2, var7, var8, var4);
         double var11 = this.readInputTextSize(var3);
         double var13 = this.readInputTextPadding(var3);
         double var15 = Math.max(
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(956227279310981246L, 45)),
            var5 - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(956236075404003454L, 45)) * var13
         );
         if (var9.isEmpty() && !var10) {
            String var10000;
            if (var3 == null) {
               var10000 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            } else {
               String[] var24 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1932672359, 20)];
               var24[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1156857118, 3)] = var3.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("0nV2TfwcuKoMV4Yq8X2AmD/1gCP3YYxMO1KkjAZd4itLEOU90PNjNHLJoNuhrBRAhro=")
               );
               var24[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17)] = var3.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("bwEz+gppKqKON+Y0c12C9YsLhvLdgScz9Dh1rot8HNGZT8iRBT+UMguwDnUFAJTZFds8nvux/4MmI727")
               );
               var24[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1726878917, 23)] = var3.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("9XKqeK0cZL7G5mFcaup/IWeA684DPagWsqGCX7pR9COk42Di")
               );
               var10000 = this.firstNonBlank(var24);
            }

            String var21 = var10000;
            if (var21.isBlank()) {
               return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            } else {
               String[] var25 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005592, 0)];
               var25[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 27)] = var3.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DG2/c0ftmOhDT4ohrZSilDF6raBsuQM5FffEgYqVePbyVlrmiaUCxAS0ilpQm7bJIsH73hXqvsKva9A8tFg=")
               );
               var25[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1427362037, 29)] = var3.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("8+Ll9NFAQIbpbFw/rHP6MLBBMfn28F6Rlwp9avXKdnyGzY8oTiaFYy+Qy3EvGJ6AaKiMaAiIhQKqjxdApNeyb3Hj/pW5eIW3")
               );
               var25[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1997169204, 30)] = var3.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("XjZDrRgJTAHnT7W7pIbzkoNBkLHxZPS7HkOZffeM566YQvmxgHTTRAXdKcbAjwOVlyeR4m+sAGs82rUG")
               );
               var25[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588709750, 11)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                  "AdDViZUesbhCM7ytaQpY5NHu+Qcil/SBLE7ICCwoQZPW+UfQogQdWw=="
               );
               String var22 = this.firstNonBlank(var25);
               var25 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024410450, 9)];
               var25[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 14)] = this.resolveBlockPlaceholders(var1, var2, var3, var21);
               var25[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711926, 7)] = var21;
               String var23 = this.firstNonBlank(var25);
               return this.withHexPrefix(var23, var22);
            }
         } else {
            String var17 = var10 ? this.readInputCaret(var3) : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            String var18 = this.fitInputValueToBox(var9, var17, var15, var11);
            String[] var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-174207736, 6)];
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 14)] = var3 == null
               ? null
               : var3.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("UTU4pEBHYRlXo5e+sB0Ky+/Zi7AlGv+4uAKTIphG49T71Y0If7qMx4SKnffy6DoT"));
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(789293804, 13)] = var3 == null
               ? null
               : var3.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("tIbCaOrM8lVycVQGCkzQLBKbNhyOdqsuliSMEJiVC4DdlFznDi9kZFR6QWUnRxcT"));
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431204, 6)] = var3 == null
               ? null
               : var3.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("dHs5BgY1F7GlakvmdglfdwBvBlnb/X2qR3aQT2xc+fHHfQ0fard4L7B0zyJ/Iw=="));
            var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2019514209, 16)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
               "ci0dyvQl66BJD6WyUm1kPtuxNqUFhftEMildwDhkcQX1HMenvEOuXg=="
            );
            String var19 = this.firstNonBlank(var10001);
            String var20 = Xqedii_i0oiv2xbmij7(this.escapeInputMarkup(var18), this.escapeInputMarkup(var17));
            return var20.isEmpty() ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==") : this.withHexPrefix(var20, var19);
         }
      }
   }

   public String inputValueHudId(String var1) {
      if (((1319307288 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1589236086, 19)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024411474, 9)] = var1;
         return Xqedii_2z45092g2o3db(this.firstNonBlank(var10001));
      }
   }

   public void removeInputParts(Player var1, String var2) {
      if ((-1223440557 * -1223440557 - -1223440557 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         this.removeBaseHud(var1, this.inputValueHudId(var2));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void renderInputValuePart(
      Player var1, EditorSession var2, ConfigurationSection var3, String var4, double var5, double var7, double var9, double var11, double var13, int var15
   ) {
      if ((-2085927424 ^ -2085927424) != 0) {
         throw new IllegalStateException();
      } else {
         String var16 = this.resolveInputDisplayText(var1, var2, var3, var4, var9);
         if (var16.isBlank()) {
            this.removeInputParts(var1, var4);
         } else {
            double var17 = this.readInputTextSize(var3);
            double var19 = this.readInputTextPadding(var3);
            TextAlignment var21 = this.readInputTextAlignment(var3);
            double var22 = Math.max(
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5179423072240951989L, 53)),
               var17 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-841240309797636354L, 61))
            );
            double var24 = var7 + (var11 - var22) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(5975722276951517031L, 43));

            double var26 = switch (Xqedii_2jsmjrt.Xqedii_3eo3h7q[var21.ordinal()]) {
               case 1 -> var5 + (var9 - var17) / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347316397199680374L, 47));
               case 2 -> var5 + var9 - var19;
               default -> var5 + var19;
            };
            LinkedHashMap var28 = new LinkedHashMap();
            var28.put(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kNpR/ulSy8FjmoVkepBFBvE1+rIVf6xwEqVNNMMFkh2QuV6R"),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
            );
            var28.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw"), var16);
            var28.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("zc7BHqWzJ4VxveiF4/An5DvH57tEFPL5fLoeqI2a0biIP2CXnh5ktC1X"), var15);
            var28.put(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
               var13 + Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8153945749837434049L, 44))
            );
            var28.put(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("IjlUFqW5HPjzfesd0LDJrAVNSWLSIn4G3nhnJpkzTSx+X5YP5lk="),
               var21 == TextAlignment.CENTER
                  ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("P6PGJh+UfUHCcpSex3j7GZkW2wBGbdNX2/v3WLZ3liJROecZRNttSQ==")
                  : (
                     var21 == TextAlignment.RIGHT
                        ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("x8WPn5uCWceVNnbEBclj3hiT6ISaviJ44LijVaWUQpaT/JvUIgs=")
                        : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("RFczcloBP+mb6kttPKMxxaBFofnpyRbuT8qKiSrMAv9PrG05")
                  )
            );
            var28.put(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("HCUtTcXPDTavCYtev9kahlCxZnZpRwbETPtQv8sr2L7I+WxCl2ZdKHgqHLM4el1uPd3SeAutwVg="),
               Boolean.valueOf((Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 11) != 0))
            );
            LinkedHashMap var29 = new LinkedHashMap();
            var29.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2IwCBU/RrDrcdyKy03lT6fFhSD8Sr3lCcsyfWryu"), var26);
            var29.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LWGhDESDghOy0sWbSqBnNVZ9D2TO7ZFaFX4YFvf/"), var24);
            var28.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("wVTkpzeKF1oRdcW9lfr8O4g+ch296fqUhC86TB99M9O7arYVRt/BQVqd7aQ="), var29);
            LinkedHashMap var30 = new LinkedHashMap();
            var30.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="), var17);
            var30.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="), var17);
            var28.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("FhOkR9dYfqN6PL0XuQoYCJgYB2k2CZbyZgaMs9w9J6ggmnpW"), var30);
            String var31 = this.readInputFont(var3);
            if (!var31.isBlank()) {
               var28.put(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("hU1y8SPIFaZO39QHB2/xa5/a8d+PdOo1E9sNdHU/SBntRI89"), var31);
            }

            this.renderResolvedElement(
               var1,
               var2,
               this.mapToSection(var28),
               this.inputValueHudId(var4),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
            );
         }
      }
   }

   public void setFocusedInputElement(Player var1, String var2) {
      if ((548922400 * 548922400 + 548922400 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         EditorSession var3 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         if (var3 != null) {
            var3.focusedInputElementId = var2 != null && !var2.isBlank() ? var2.trim() : null;
            var3.focusedInputLastChangeTick = Xqedii_38o2zes.Xqedii_316oplq();
         }
      }
   }

   public void clearFocusedInputElement(Player var1) {
      if ((-1012740066 * -1012740066 - -1012740066 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.setFocusedInputElement(var1, null);
      }
   }

   public String getFocusedInputElement(Player var1) {
      if ((-659016028 * (-659016028 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         EditorSession var2 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         return var2 == null ? null : var2.focusedInputElementId;
      }
   }

   public HoverElement renderResolvedElement(Player var1, EditorSession var2, ConfigurationSection var3, String var4, String var5) {
      if ((1781959931 * 1781959931 + 1781959931 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var6 = this.hudService.getRenderClip();
         this.hudService.setRenderClip(this.resolveScrollClip(var1, var2, var3, var6));

         HoverElement var7;
         try {
            var7 = this.renderClippedElement(var1, var2, var3, var4, var5);
         } finally {
            this.hudService.setRenderClip(var6);
         }

         return var7;
      }
   }

   public int resolveScrollClip(Player var1, EditorSession var2, ConfigurationSection var3, int var4) {
      if ((1921494135 * 1921494135 + 1921494135 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var5 = this.readScrollClipSpec(var3);
         return var5 == null ? var4 : this.encodeScrollClip(var1, var2, var5);
      }
   }

   public double[] readScrollClipSpec(ConfigurationSection var1) {
      if ((-368539907 * -368539907 + -368539907 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var1.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ZvJbjxxwWBnssuipHMhoIPXl8GlccxYwUrUaL6CTcEQFBp/wf5yTe/A9Darc84UzUKn1SciCe33ZWA=="))) {
         double[] var10000 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1330724112, 25)];
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(387307614, 22)] = var1.getInt(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ZvJbjxxwWBnssuipHMhoIPXl8GlccxYwUrUaL6CTcEQFBp/wf5yTe/A9Darc84UzUKn1SciCe33ZWA=="),
            Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2050656744, 20)
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 10)] = var1.getInt(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("eg3bBmYcdap+TECVt6lQpj+TMqkKl9LhQ3lLXl8+dJMMIxDXhrwvNty26GfqNh49FKusfFrWbIb5Rg=="),
            Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507638415, 10)
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(2036172257, 26)] = var1.getDouble(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("43ggP1l8F6Q1DaZ/fcoMx5GV8P/tr4ylQx47yEuombRXeanZI686V3BCZ0JsndouZMydvOnmfs1y9UWR"),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205035903297350L, 37))
         );
         var10000[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936180, 2)] = var1.getDouble(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kftHecQrm08FXyWIcWATW9sT1IpqH/7B6gmF6QL39j+q79E+Y1u0WXCHf0NyoLYzYoWjRu6nsL4="),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1008332062940895088L, 62))
         );
         return var10000;
      } else {
         return null;
      }
   }

   public int encodeScrollClip(Player var1, EditorSession var2, double[] var3) {
      if ((-1489709034 * (-1489709034 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null
         && var3.length >= Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1592906102, 20)
         && Double.isFinite(var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(480236836, 22)])
         && Double.isFinite(var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484398372, 14)])) {
         int var4 = (int)var3[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507639439, 10)];
         int var5 = var4 == Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735594557, 12)
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844565, 7)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 14);
         double[] var6 = this.hudService.resolveShaderHudDrift(var1);
         double var7 = var5 != 0 ? var6[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844693, 7)] : var6[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 22)];
         double var9 = (
               var5 != 0
                  ? this.toRenderX(var2, var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-514969974, 29)])
                  : this.toRenderY(var2, var3[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024410450, 9)])
            )
            - var7;
         double var11 = (
               var5 != 0
                  ? this.toRenderX(var2, var3[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578620376, 14)])
                  : this.toRenderY(var2, var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431141, 31)])
            )
            - var7;
         return HudPositionCalculator.encodeClip(var4, (int)var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711800, 1)], var9, var11);
      } else {
         return Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1743656133, 23);
      }
   }

   public HoverElement renderClippedElement(Player var1, EditorSession var2, ConfigurationSection var3, String var4, String var5) {
      if ((-789916409 * -789916409 - -789916409 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         boolean var6 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var5);
         boolean var7 = this.isInputType(var5);
         int var8 = !this.isDirectionalRoundedType(var5) && (!var7 || !this.hasDirectionalRoundedCorners(var3))
            ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 17)
            : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711794, 2);
         int var9 = (var7 ? this.readInputRounded(var3) : this.isRoundedType(var5)) ? 1 : 0;
         int var10 = var9 != 0 && var2 != null && var2.editMode && var2.optimizedEditor
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1427362037, 29)
            : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(193653807, 21);
         if (var10 != 0) {
            var9 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 18);
            var8 = Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 7);
         }

         boolean var11 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DZ/R56ZXey1RsbxUNc5H4IlXpgz1iZVI3SdxUqeosnrQhXMY6QqtYw==").equals(var5);
         boolean var12 = this.isSkinType(var5);
         ItemStack var13 = this.resolveItemDisplayStack(var1, var3, var5);
         int var14 = var13 != null && !var11 && !var6 && var9 == 0
            ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189842, 4)
            : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-2128694343, 27);
         double var15 = this.readRuntimeNumericValue(
            var1,
            var2,
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Wyex+NwFU1nwXdCAGsxrS3XQVBVVRafQz1i9eTp+48foCGjuZI1AfsyOY9+bVUF6"),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2IwCBU/RrDrcdyKy03lT6fFhSD8Sr3lCcsyfWryu"),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6764543730081252617L, 27))
         );
         double var17 = this.readRuntimeNumericValue(
            var1,
            var2,
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("q79rxO0jAJKNXgALb1WYijvQhI8v5AfsO5pdv20xumdM5TaT9EFD0i1oTOlf4jFy"),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LWGhDESDghOy0sWbSqBnNVZ9D2TO7ZFaFX4YFvf/"),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2590836336515690843L, 52))
         );
         double var19 = this.readRuntimeNumericValue(
            var1,
            var2,
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
            this.readRuntimeNumericValue(
               var1,
               var2,
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QARXskH/TZF1Y4KHh6qGsEzHP+ut1FkjO2jmHAy3juizfqTdmrx49DFqvLMaUZ78"),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("hcG0QT+HrvwkyqUna2c3mGKPrk7B4qY7YJ18L1DuUIXpvQVP8C4="),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 27))
            )
         );
         double var21 = this.readRuntimeNumericValue(
            var1,
            var2,
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Z5ox4W6OdaEvCSuKd/ZK01LI0aveVxgGz5N1BHpFLwHyWJgciR/bUZgr5RDFxqfM"),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="),
            this.readRuntimeNumericValue(
               var1,
               var2,
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("28J2/y7Zcb2jvBm6zftWGT27ZpMDd1ZT2Q1eoL2F5ZLN99+r8iFLz8sBF+FC2hmAKN4="),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-8181863464496701065L, 11))
            )
         );
         double var23 = this.readRuntimeNumericValue(
            var1,
            var2,
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("utqd2WNRHod3LdoqXbK5nC8QtiaJhi2Yg2xW5FdBHiTrgIxEgrOrL95Qlel6vAYjXoI="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="),
            this.readRuntimeNumericValue(
               var1,
               var2,
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("l/BRSC7jaujlcrB3SaxcN+qvOr8Kfa7O2GoYT5tX19elhghMoXjndmpFLWi/3DyxEjb2aA=="),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="),
               Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-4491754144489345529L, 3))
            )
         );
         int var25 = var21 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6230295978706731169L, 23))
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(783003836, 23)
            : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(387307614, 22);
         int var26 = var23 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 7))
            ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 7)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 7);
         double var27 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3354036612268647286L, 58)), Math.abs(var21));
         double var29 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351570649801590L, 36)), Math.abs(var23));
         if (this.isPlayerHeadTextSection(var3)) {
            var29 = var27;
         }

         double var31 = this.readRuntimeNumericValue(
            var1,
            var2,
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ebdx5PCmNALJ0hOZP0iyReMHA8RvGRFAUJMpgUIWsfZTjV7X62dB/7af+iw="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("g3SAI463bLsscG6mez2Z4LxhUd0py/OmUmijYsRA0yYBrCODLJjcpQ=="),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 61))
         );
         int var33 = this.readOpacity(var3, Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431322, 0));
         var33 = this.applyVisibilityConditionOpacity(var1, var2, var3, var33);
         int var34 = var33;
         if (var7) {
            this.applyInputBackgroundAlias(var3);
            var34 = this.readInputTextOpacity(var3, var33);
            var33 = this.readInputBackgroundOpacity(var3, var33);
         }

         boolean var35 = this.shouldSpawnOpacityVisual(var5, var7 ? Math.max(var33, var34) : var33);
         String[] var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1578571224, 14)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1wujkKjk/OeyIeJ51+HCexT83c7328zS9/2h0ImuBCHe5QtHskNmSF0QaUTWe3g+ISKTcAN0C0tElEKoZCjLpgshGdI=")
         );
         String var36 = this.firstNonBlank(var10001);
         TextAlignment var37 = this.readHudAlignment(var3);
         TextAlignment var38 = this.resolveEffectiveHudAlignment(var2, var37, var36);
         TextAlignment var39 = var6 ? this.readTextAlignment(var3) : TextAlignment.CENTER;
         int var40 = var6 ? this.readTextWrapLineWidth(var3) : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588121974, 13);
         double var41 = var6 ? this.toInternalTextTopY(var17, var29) : var17;
         double var43 = this.resolveHudAlignmentOffsetX(var27, var38);
         double var45 = var2 != null && !var2.editMode
            ? var2.pageOpenSpawnOffsetX
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 21));
         double var47 = var2 != null && !var2.editMode
            ? var2.pageOpenSpawnOffsetY
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-2901143909993650359L, 14));
         double var49 = this.toRenderX(var2, var15 + var45);
         double var51 = this.toRenderY(var2, var41 + var47);
         double var53 = this.toRuntimeLayer(var2, var19);
         double var55 = this.toRenderSize(var2, var27);
         double var57 = this.toRenderSize(var2, var29);
         double var59 = var6 ? this.applyTextAlignmentOffset(var49, var55, var39) : var49;
         double var61 = this.resolveHudAlignmentOffsetX(var55, var38);
         double var63 = var59 + var61;
         double var65 = this.readPivotOffsetX(var3, var27);
         double var67 = this.readPivotOffsetY(var3, var29);
         double var69 = var59 + this.toRenderSize(var2, var65);
         double var71 = var63 + this.toRenderSize(var2, var65);
         double var73 = var51 + this.toRenderSize(var2, var67);
         String var75;
         if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var5)) {
            var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(1021302052, 29)];
            var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 13)] = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
            );
            var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189842, 4)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
            var75 = this.firstNonBlank(var10001);
         } else if (var7) {
            var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588973942, 17)];
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 25)] = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("imioXuyNd47D5GcMpFImHUGJD3rxf1A6g38GPEVmKQB45zM9pi3HZETA")
            );
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711766, 5)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("lnd2+W1j2mJ9YuEdGQ1K+hdDn4s+Xs0VsXbziFCA");
            var75 = this.firstNonBlank(var10001);
         } else {
            var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393662393, 9)];
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 7)] = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("imioXuyNd47D5GcMpFImHUGJD3rxf1A6g38GPEVmKQB45zM9pi3HZETA")
            );
            var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17)] = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
            );
            var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1586614646, 20)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("lnd2+W1j2mJ9YuEdGQ1K+hdDn4s+Xs0VsXbziFCA");
            var75 = this.firstNonBlank(var10001);
         }

         var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(574449523, 28)];
         var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 19)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("iwiRwjKzF9H8ww6P0hZbZ1X/yPTJM3XCIGGxsUBidXCqvmLzYBw=")
         );
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362956102, 1)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Yhk8r3Wbx7zIuLytBTzWJo2rGNkzMYDbErsxG/sNTBKi8dd8o3DpjLnrNZ1oU45wMqw=")
         );
         String var76 = this.firstNonBlank(var10001);
         var75 = this.withHexPrefix(var75, var76);
         String var77 = this.resolveBlockPlaceholders(var1, var2, var3, var75);
         var77 = this.applyPreferredFont(
            var77,
            var3,
            ((!var6 ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 29) : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591360167, 18)) != 0),
            ((var6 && !this.isEditorContextSession(var2)
               ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 13)
               : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1587663222, 20)) != 0)
         );
         if (var11) {
            var77 = this.applyOutlineColor(var77, Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QAJoaHIjov8epvproS9tMOjly/Z+0fvCx6IZjsa5x5j38WKIrvQDkA=="));
         }

         double var78 = !var6 && !var11 && !var7
            ? this.readOutlineSize(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 50));
         double var80 = this.toRenderSize(var2, var78);
         String var82 = !var6 && !var11 && !var7
            ? this.readOutlineColor(var3)
            : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         String var83 = !var6 && !var11 && !var7 && var80 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(2347580114169306501L, 53))
            ? this.applyOutlineColor(var77, var82)
            : null;
         double var84 = !var6 && !var11 && !var7
            ? this.readOutlineLayer(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039206203849189190L, 41));
         double var86 = Double.isFinite(var84)
            ? this.toRuntimeLayer(var2, var84)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-1558878549362692884L, 40));
         int var88 = !var11 && var35 ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 30) : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 23);
         String var89 = var9 != 0 ? this.resolveElementCornerUnicode(this.readRoundedCornerUnicode(var3), var7) : null;
         String var90 = var9 != 0 && var8 != 0
            ? this.resolveElementCornerUnicode(this.readRoundedCornerUnicodeTopLeft(var3), var7)
            : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         String var91 = var9 != 0 && var8 != 0
            ? this.resolveElementCornerUnicode(this.readRoundedCornerUnicodeTopRight(var3), var7)
            : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         String var92 = var9 != 0 && var8 != 0
            ? this.resolveElementCornerUnicode(this.readRoundedCornerUnicodeBottomRight(var3), var7)
            : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         String var93 = var9 != 0 && var8 != 0
            ? this.resolveElementCornerUnicode(this.readRoundedCornerUnicodeBottomLeft(var3), var7)
            : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
         if (var9 != 0 && var88 != 0) {
            double var115 = this.readRoundedRadius(var3, var55, var57);
            double var96 = this.readRoundedTopLeftOffsetX(var3);
            double var98 = this.readRoundedTopLeftOffsetY(var3);
            double var100 = this.readRoundedTopRightOffsetX(var3);
            double var102 = this.readRoundedTopRightOffsetY(var3);
            double var128 = this.readRoundedBottomRightOffsetX(var3);
            double var106 = this.readRoundedBottomRightOffsetY(var3);
            double var108 = this.readRoundedBottomLeftOffsetX(var3);
            double var110 = this.readRoundedBottomLeftOffsetY(var3);
            this.renderRoundedOutline(
               var1,
               new RoundedBox(var4, var63, var51, var53, var55, var57),
               var83,
               var33,
               var115,
               new RoundedCornerGlyphs(var89, var90, var91, var92, var93),
               new RoundedCornerOffsets(var96, var98, var100, var102, var128, var106, var108, var110),
               new RoundedTransform(var31, (var25 != 0), (var26 != 0), var71, var73),
               var80,
               var38,
               var86
            );
            this.renderRoundedBlock(
               var1,
               new RoundedBox(var4, var63, var51, var53, var55, var57),
               var77,
               var33,
               var115,
               new RoundedCornerGlyphs(var89, var90, var91, var92, var93),
               new RoundedCornerOffsets(var96, var98, var100, var102, var128, var106, var108, var110),
               new RoundedTransform(var31, (var25 != 0), (var26 != 0), var71, var73),
               var38
            );
            if (var7) {
               this.renderInputValuePart(var1, var2, var3, var4, var15, var17, var27, var29, var19, var34);
            }
         } else if (var88 != 0) {
            this.removeRoundedParts(var1, var4);
            this.removeRoundedParts(var1, Xqedii_2wyy6o6ablu1q(var4));
            double[] var94 = this.resolvePivotAwareTopLeft(var59, var51, var55, var57, var69, var73, var31);
            double var95 = var6
               ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(478113639655490623L, 44))
               : this.resolveRotationVisualXOffset(var31, var55);
            double var97 = var6
               ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 24))
               : this.resolveRotationVisualYOffset(var31, var57);
            double var99 = var94[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 20)] + var95;
            double var101 = var94[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295549012, 17)] + var97;
            if (var14 != 0) {
               var101 -= var57 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-8436858529430227541L, 27));
               double[] var103 = this.resolveItemDisplayRotationOffset(var31, var55, var57);
               var99 += var103[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-491058238, 27)];
               var101 += var103[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1521602934, 26)];
               double[] var104 = this.resolveItemDisplayNonBlockRotationOffset(var31, var55, var57);
               var99 += var104[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(733002798, 31)];
               var101 += var104[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 27)];
            }

            Placement var127 = this.positionCalculator.calculateBoxPlacement(var99, var101, var53, var55, var57);
            if (var12) {
               this.removeBaseHud(var1, var4);
               this.renderSkinElementParts(
                  var1,
                  var2,
                  var3,
                  var4,
                  var59,
                  var51,
                  var55,
                  var57,
                  var53,
                  var33,
                  var38,
                  var31 + this.readSkinSpinAngle(var2, var4),
                  this.readSkinSpinPitch(var2, var4)
               );
            } else if (var14 != 0) {
               this.upsertItemHud(var1, var4, var127.location(), var127.scale(), var13, var33, var38);
            } else {
               this.upsertHud(var1, var4, var127.location(), var127.scale(), var77, var33, var38, var39, var40);
            }

            if (!var12) {
               this.applyElementTransformById(var1, var4, var31, (var25 != 0), (var26 != 0));
            }

            if (var7) {
               this.renderInputValuePart(var1, var2, var3, var4, var15, var17, var27, var29, var19, var34);
            }

            if (!var6 && !var12) {
               this.renderSimpleOutline(
                  var1,
                  new RoundedBox(var4, var59, var51, var53, var55, var57),
                  var83,
                  var33,
                  var38,
                  var39,
                  new RoundedTransform(var31, (var25 != 0), (var26 != 0), var69, var73),
                  var80,
                  var86
               );
            } else {
               this.clearOutlineHud(var1, var4);
            }
         } else {
            this.clearOutlineHud(var1, var4);
            this.removeBaseHud(var1, var4);
            this.removeSkinParts(var1, var4);
            this.removeInputParts(var1, var4);
            this.removeRoundedParts(var1, var4);
         }

         HoverElement var116 = new HoverElement();
         var116.id = var4;
         var116.type = var10 != 0 ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA=") : var5;
         var116.inputSection = var7 ? var3 : null;
         var116.inputTextOpacity = var34;
         var116.itemDisplay = (var14 != 0);
         var116.itemDisplayBlock = ((var14 != 0 && var13 != null && var13.getType().isBlock()
            ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-512402043, 18)
            : Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 25)) != 0);
         String[] var10002 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 15)];
         var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(193653807, 21)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("NCPGhwHa+F6GdlRVfgjlLS+lyQu5bLl2Jm6M5+aB8xfVzD+G/y4YSTKawZpiyNI6fi87KuXzfAzkESEU0t5IbQ==")
         );
         var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024410962, 9)] = var4;
         var116.targetId = this.firstNonBlank(var10002);
         var10002 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484398372, 15)];
         var10002[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 28)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("4X//7RAQAHWBKAlue8rMdVOSOyxyNTLtaaRzqe3F8ntDQOR6aPF4wHaoVbBzuvstNPPPeGWOQCuwYbmEZ6SwLG4RtRk=")
         );
         var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1605489014, 24)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA="
         );
         var116.targetKind = this.firstNonBlank(var10002);
         var116.targetPath = var36;
         var10002 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1030189842, 4)];
         var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 7)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kEKhxK6rpWpU0ftM4Np6kxV2sZ6gUGiV8HdyPnD3PPOpnXDLujEve+qy81jDIyVTRp0AIk4UqDezj924pJqz1MRVxiFQ/SH6nno=")
         );
         var116.componentName = this.firstNonBlank(var10002);
         var10002 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 9)];
         var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 1)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("f7eZa5sLuGVZXjAQF1e60DVJEeVrIhg1QnmqcCJl6TsUFOoyX3wWAuBcVcghQoKCZACoE00OOIjp4MnQt+XVkQ==")
         );
         var116.bindingX = this.firstNonBlank(var10002);
         var10002 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711794, 2)];
         var10002[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663929, 9)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Bf3+3FcGTVJQzx1IndhO8U9ayXD5H86GmEEHEecxhaqkcqHicjqk7pGY46CpVki+VCIX5Zfi01CSovpDo97+5g==")
         );
         var116.bindingY = this.firstNonBlank(var10002);
         var10002 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(195750959, 21)];
         var10002[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 13)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("aMIwWzxucTKX1dChU+FjHc25BCAtNHc4MQSUxxvuLtaR1njt/R8D9bGGj1a/ZTn3dVbLLlhH8C+kKrsMtXAnJguUStSx101H")
         );
         var116.bindingWidth = this.firstNonBlank(var10002);
         var10002 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588719990, 13)];
         var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1964232949, 29)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6MAr/X6rulcoHwHrJY3x6pbAqWeZN5BP7BdB7AEqiKscFlaOMCs5o/bPLN192PGSm1MOOJCilFDtXDf3xNBSCDKTX6IF+kU2ANs=")
         );
         var116.bindingHeight = this.firstNonBlank(var10002);
         var116.centerX = var15 + var43 + var27 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-5497864391458028278L, 26));
         var116.centerY = var41 + var29 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571900278L, 19));
         var116.z = var19;
         var116.runtimeZ = var53;
         var116.width = var27;
         var116.height = var29;
         var116.playerHeadText = this.isPlayerHeadTextSection(var3);
         if (var12) {
            var116.skinOwner = this.resolveSkinOwner(var1, var2, var3);
            var116.skinSlim = var3.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("KQfE7C36fMFZsvO4Vjf673aCnAvbA0ViHuev3TqHHb90dAh9"),
               var3.getBoolean(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ZwrMRNtOSygaYirTpNGBYFrY7KUzb7gNzf+Rxiypi2PiSOdL7ungAOdUdvonA3HZLvM="),
                  (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 23) != 0)
               )
            );
            var116.skinPartRotations = this.readSkinPartRotations(var3);
            var116.skinSpinning = this.readSkinSpinFlag(
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QUGb1UBtADpZbFbEPHCjb95Tj25AolvuYKxbWKNi6fqpq5dSAS6HRCstwhA="),
               (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 24) != 0)
            );
            var116.skinSpinMouse = this.readSkinSpinFlag(
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("oM7/Gz3NdAksM+Z8+esJOTQ5jsmDDITzX6qjsnM1LkegCTHYHZA="),
               (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 20) != 0)
            );
            var116.skinSpinUpDown = this.readSkinSpinFlag(
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("t/9UBCXnOBF/etVURzFH+fPoQokIoSmarDUk0mUvKBHyS6c++GG33nPp"),
               (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 6) != 0)
            );
            var116.skinSpinUnlimited = this.readSkinSpinFlag(
               var3,
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("tNIh098lSEGNshWGKl3IgXWWm9JWWTbeebEkevtxUKg3hiQw5x+0ld+cyD1GB2bFYUQjq7bL"),
               (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1743656133, 23) != 0)
            );
            var116.skinSpinSpeedTicks = this.readSkinSpinSpeed(var3);
            var116.skinSpinAngle = this.readSkinSpinAngle(var2, var4);
            var116.skinSpinPitch = this.readSkinSpinPitch(var2, var4);
            var116.skinSpinVelocityYaw = this.readSkinSpinVelocityYaw(var2, var4);
            var116.skinSpinVelocityPitch = this.readSkinSpinVelocityPitch(var2, var4);
            var116.skinSpinMomentumTicks = this.readSkinSpinMomentumTicks(var2, var4);
            if (Math.abs(var116.skinSpinVelocityYaw) >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-7864355056793883764L, 3))
               || Math.abs(var116.skinSpinVelocityPitch) >= Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(2547967281686703800L, 11))) {
               this.ensureSkinSpinLoop(var1);
            }

            if (var116.skinSpinning) {
               this.ensureSkinSpinLoop(var1);
            }
         }

         var116.rotationDeg = var31;
         var116.pivotOffsetX = var65;
         var116.pivotOffsetY = var67;
         var116.mirrorX = (var25 != 0);
         var116.mirrorY = (var26 != 0);
         var116.visible = (var88 != 0);
         var116.opacity = var33;
         var116.text = var77;
         String var117 = var3.getString(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("uaYUjJSZjpAl8uX14FE7rMVDZOwUI7E8AO7+lN8USYmuIiYNr7FdvawU7FYyqzsF"));
         if (var117 != null && !var117.isBlank()) {
            var116.hoverText = this.withHexPrefix(var117, var76);
         }

         if (var116.hoverText == null || var116.hoverText.isBlank()) {
            String var118 = var3.getString(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Np6Lu63moPsF6kWCAHTd1weD1kP7HH854Kl7prmAC9EhnRKyqNioQSi5Q/fc/f62lKDtYYJRaOJePiTKOCXbHg=="),
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
            );
            if (var118 != null && !var118.isBlank()) {
               int var120 = var3.getInt(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("XCcbvMzY9rK9LKOTjywXFXIzC6OOXEQpym3OPeX18tnMVtsRHShqR7xcBFI5Oyh66bCdaoeq1t/Zwg=="),
                  Xqedii_101y7xo.Xqedii_x42dgjucv46g(1588711797, 6)
               );
               int var121 = var3.getInt(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("GmCjJN+eVtZ0h4hQPh4Ns9h4HwBxU2nzEFiL93X2ru/Rm2Ci/Xn8+bZAQnCWbxMbK8jkxEHBzd/77g=="),
                  Xqedii_101y7xo.Xqedii_32yuti7slijjp(1581755630, 25)
               );
               if (var120 >= 0 && var121 >= 0) {
                  dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService.GeneratedImage var123 = this.plugin.resolveGeneratedUiImageForEditor(var118);
                  if (var123 != null) {
                     var10002 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712310, 9)];
                     var10002[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1635277911, 8)] = var123.glyphMatrix();
                     String var124 = this.extractGlyphAtRC(this.firstNonBlank(var10002), var120, var121);
                     if (var124 != null) {
                        var116.hoverText = this.withHexPrefix(Xqedii_2u6b4ftk3dn7e(var124), var76);
                     }
                  }
               }
            }
         }

         var116.outlineSize = var78;
         var116.outlineColor = var82;
         var116.outlineText = var83;
         var116.outlineLayer = var84;
         var116.baseLocation = new Vector(var15 + var43, var41, var19);
         var116.baseScale = new Vector(var27, var29, Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 18)));
         var116.roundedCornerUnicode = var89;
         var116.roundedRadius = var9 != 0
            ? this.readRoundedRadius(var3, var27, var29)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581570015094L, 23));
         var116.roundedShape = (var9 != 0);
         var116.scrollClip = this.hudService.getRenderClip();
         var116.scrollClipSpec = this.readScrollClipSpec(var3);
         var116.roundedCornerUnicodeTopLeft = var90;
         var116.roundedCornerUnicodeTopRight = var91;
         var116.roundedCornerUnicodeBottomRight = var92;
         var116.roundedCornerUnicodeBottomLeft = var93;
         var116.roundedTopLeftOffsetX = var9 != 0
            ? this.readRoundedTopLeftOffsetX(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 38));
         var116.roundedTopLeftOffsetY = var9 != 0
            ? this.readRoundedTopLeftOffsetY(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 32));
         var116.roundedTopRightOffsetX = var9 != 0
            ? this.readRoundedTopRightOffsetX(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(5542025651707413329L, 59));
         var116.roundedTopRightOffsetY = var9 != 0
            ? this.readRoundedTopRightOffsetY(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(7451015290759940629L, 27));
         var116.roundedBottomRightOffsetX = var9 != 0
            ? this.readRoundedBottomRightOffsetX(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 25));
         var116.roundedBottomRightOffsetY = var9 != 0
            ? this.readRoundedBottomRightOffsetY(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6629476044216020704L, 63));
         var116.roundedBottomLeftOffsetX = var9 != 0
            ? this.readRoundedBottomLeftOffsetX(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 2));
         var116.roundedBottomLeftOffsetY = var9 != 0
            ? this.readRoundedBottomLeftOffsetY(var3)
            : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 7));
         var116.hudAlignment = var38;
         var116.textAlignment = var39;
         var116.interactive = (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712310, 9) != 0);
         var116.onClickAction = var116.targetPath;
         var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484433188, 11)];
         var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048822947, 10)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("4MAXBWCL4SoT4KL9XU2OKZAlPN37W3N7tMwSYDxTPJ1BTMGT6iIWiDVewVu1/UVnsxrp8Q==")
         );
         var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 7)] = var3.getString(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("PMM+dN2NYgY6FiqFLhtc/8zeZJlU15q8JjHoK5oca8ED25zBc0jm5jSlEbAHTgO9xGY=")
         );
         String var119 = this.firstNonBlank(var10001).trim();
         if (!var119.isBlank()) {
            var116.clickEffect = var119;
         }

         var116.hitboxOffsetX = this.readDouble(
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("aUAZIXyOm/XbX4PnmXI23zcjOmCBfeI5p6m+rJRvI4lcDCwRo3DBCUnXTGg="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("aUAZIXyOm/XbX4PnmXI23zcjOmCBfeI5p6m+rJRvI4lcDCwRo3DBCUnXTGg="),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 10))
         );
         var116.hitboxOffsetY = this.readDouble(
            var3,
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("AUsI6GMl7aKRSaol7rjev6xrm8P1EriA5gmmZPPKM3QPLscDEUouSdROqGU="),
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("AUsI6GMl7aKRSaol7rjev6xrm8P1EriA5gmmZPPKM3QPLscDEUouSdROqGU="),
            Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 21))
         );
         var116.disableHitbox = var3.getBoolean(
            Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("HCUtTcXPDTavCYtev9kahlCxZnZpRwbETPtQv8sr2L7I+WxCl2ZdKHgqHLM4el1uPd3SeAutwVg="),
            var3.getBoolean(
               Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("IfeRAlUBO2F48YWqpbGWbnEzWfYGbpfL2VPP00iUV0bSLFMb81R8aykuhZ+Vtu7v65Q9RY20"),
               (Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-2048822947, 10) != 0)
            )
         );
         if (var11
            && var2 != null
            && var2.editMode
            && (
               var3.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("HI3240JAjtZ3s7MyHdVfo9GWsse8v6imoHj+ioa4YP4rsrrE5X0q9Fl5rdFMVqzzmVzEDw=="))
                  || var3.contains(Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("bB1js6r2KyKihlTx0le2E8MC988XXk0PNby+cNq9yAi0jialFazRQ2EQhC9q+9450dU="))
            )) {
            var116.hitboxOffsetX = var116.hitboxOffsetX - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205106996619078L, 33));
            var116.hitboxOffsetY = var116.hitboxOffsetY - Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(6169260013104598536L, 21));
         }

         return var116;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void renderEditorShell(Player var1, EditorSession var2) {
      if (((2123290223 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2.shellBlocks != null && !var2.shellBlocks.isEmpty()) {
         int var3 = !var2.shellRenderPassActive ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1393663417, 9) : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-591360167, 18);
         if (var3 != 0) {
            var2.shellRenderPassActive = (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 17) != 0);
            var2.shellRenderPassDesignPanelId = null;
            var2.shellRenderPassPropertiesPanelId = null;
            var2.shellRenderPassTextDesignMode = null;
         }

         boolean var6 = false /* VF: Semaphore variable */;

         try {
            var6 = true;
            this.renderEditorShellBlocks(var1, var2);
            var6 = false;
         } finally {
            if (var6) {
               if (var3 != 0) {
                  var2.shellRenderPassActive = (Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1279688418, 11) != 0);
                  var2.shellRenderPassDesignPanelId = null;
                  var2.shellRenderPassPropertiesPanelId = null;
                  var2.shellRenderPassTextDesignMode = null;
               }
            }
         }

         if (var3 != 0) {
            var2.shellRenderPassActive = (Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 2) != 0);
            var2.shellRenderPassDesignPanelId = null;
            var2.shellRenderPassPropertiesPanelId = null;
            var2.shellRenderPassTextDesignMode = null;
         }
      }
   }

   public void renderEditorShellBlocks(Player var1, EditorSession var2) {
      if ((1271569513 ^ 1271569513) != 0) {
         throw new IllegalStateException();
      } else {
         HashMap var3 = new HashMap();
         int var4 = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 13);

         for (Map var6 : var2.shellBlocks) {
            var4++;
            ConfigurationSection var7 = this.mapToSection(var6);
            if (var7 != null) {
               String[] var10001 = new String[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1329844437, 7)];
               var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 20)] = var7.getString(
                  Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("kNpR/ulSy8FjmoVkepBFBvE1+rIVf6xwEqVNNMMFkh2QuV6R")
               );
               var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711766, 5)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                  "Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA="
               );
               String var8 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
               if (this.isRoundedType(var8) && var2.optimizedEditor) {
                  var8 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Y+4DJMoEl/bRBarD8U8pozCUiTowORULtIDwy3SfkQa12k5YClA=");
               }

               if (this.isRenderableBlockType(var8)) {
                  String var9 = this.resolveElementId(var7, var4, var3);
                  if (!this.isEditorToolShellBlockId(var9)) {
                     String var10 = Xqedii_3lqwocoh4l002(var9);
                     if (this.shouldSkipShellBlockForSpawnRetoggle(var2, var9)) {
                        this.clearOutlineHud(var1, var10);
                        this.removeBaseHud(var1, var10);
                        this.removeRoundedParts(var1, var10);
                        if (var2.shellRuntimeRects != null) {
                           var2.shellRuntimeRects.remove(var9);
                        }
                     } else if (!this.shouldRenderEditorShellBlock(var2, var9, var7)) {
                        this.clearOutlineHud(var1, var10);
                        this.removeBaseHud(var1, var10);
                        this.removeRoundedParts(var1, var10);
                        if (var2.shellRuntimeRects != null) {
                           var2.shellRuntimeRects.remove(var9);
                        }
                     } else {
                        double var11 = this.readDouble(
                           var7,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Wyex+NwFU1nwXdCAGsxrS3XQVBVVRafQz1i9eTp+48foCGjuZI1AfsyOY9+bVUF6"),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("2IwCBU/RrDrcdyKy03lT6fFhSD8Sr3lCcsyfWryu"),
                           Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(22706269011275822L, 6))
                        );
                        double var13 = this.readDouble(
                           var7,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("q79rxO0jAJKNXgALb1WYijvQhI8v5AfsO5pdv20xumdM5TaT9EFD0i1oTOlf4jFy"),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("LWGhDESDghOy0sWbSqBnNVZ9D2TO7ZFaFX4YFvf/"),
                           Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1123039402128378813L, 40))
                        );
                        double var15 = this.readDouble(
                           var7,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("jMfiISYSIbRW5TK2SD1m0L2YSF9J8xzVF9P5JNUrwncpOUN8z+I="),
                           this.readDouble(
                              var7,
                              Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("QARXskH/TZF1Y4KHh6qGsEzHP+ut1FkjO2jmHAy3juizfqTdmrx49DFqvLMaUZ78"),
                              Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("hcG0QT+HrvwkyqUna2c3mGKPrk7B4qY7YJ18L1DuUIXpvQVP8C4="),
                              Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6730116764161261818L, 52))
                           )
                        );
                        double var17 = this.readDouble(
                           var7,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Z5ox4W6OdaEvCSuKd/ZK01LI0aveVxgGz5N1BHpFLwHyWJgciR/bUZgr5RDFxqfM"),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="),
                           this.readDouble(
                              var7,
                              Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("28J2/y7Zcb2jvBm6zftWGT27ZpMDd1ZT2Q1eoL2F5ZLN99+r8iFLz8sBF+FC2hmAKN4="),
                              Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("6BIfRCRd3fFqZ4Telo2159uMBaRYTfdeUJt9SJ+V67CF5Cb5jEs="),
                              Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205044619061062L, 37))
                           )
                        );
                        double var19 = this.readDouble(
                           var7,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("utqd2WNRHod3LdoqXbK5nC8QtiaJhi2Yg2xW5FdBHiTrgIxEgrOrL95Qlel6vAYjXoI="),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="),
                           this.readDouble(
                              var7,
                              Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("l/BRSC7jaujlcrB3SaxcN+qvOr8Kfa7O2GoYT5tX19elhghMoXjndmpFLWi/3DyxEjb2aA=="),
                              Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("rTWh08O7hFcWr9ZqxMfIyyd8ejmWPsyQEW5BJ4YpHsN01o1abGvlsw=="),
                              Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(2270748036476630946L, 35))
                           )
                        );
                        int var21 = var17 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 23))
                           ? Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 18)
                           : Xqedii_101y7xo.Xqedii_32yuti7slijjp(150314444, 30);
                        int var22 = var19 < Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-4492157608513515249L, 42))
                           ? Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1162951952, 25)
                           : Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 28);
                        double var23 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-2993716693765889175L, 7)), Math.abs(var17));
                        double var25 = Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351587812893558L, 38)), Math.abs(var19));
                        double var27 = this.readDouble(
                           var7,
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Ebdx5PCmNALJ0hOZP0iyReMHA8RvGRFAUJMpgUIWsfZTjV7X62dB/7af+iw="),
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("g3SAI463bLsscG6mez2Z4LxhUd0py/OmUmijYsRA0yYBrCODLJjcpQ=="),
                           Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 56))
                        );
                        int var29 = this.readOpacity(var7, Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1362955962, 1));
                        var29 = this.resolveShellBlockInitialOpacity(var2, var9, var7, var29);
                        var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711782, 4)];
                        var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 27)] = var7.getString(
                           Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("1wujkKjk/OeyIeJ51+HCexT83c7328zS9/2h0ImuBCHe5QtHskNmSF0QaUTWe3g+ISKTcAN0C0tElEKoZCjLpgshGdI=")
                        );
                        String var30 = this.firstNonBlank(var10001);
                        TextAlignment var31 = this.readHudAlignment(var7);
                        TextAlignment var32 = var31 == null ? TextAlignment.CENTER : var31;
                        TextAlignment var33 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                           ? this.readTextAlignment(var7)
                           : TextAlignment.CENTER;
                        int var34 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                           ? this.readTextWrapLineWidth(var7)
                           : Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628988, 31);
                        int var35 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                              && Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("OGhZU/7cUiD5iC31R0apfLYEt032nLpyk3CU3drsDiL0xbMcoz17YW3/q1a5ZyXyYeSWBFqu9cA=")
                                 .equals(var9)
                           ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257777, 0)
                           : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1025328373, 19);
                        double var36 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8) && var35 == 0
                           ? this.toInternalTextTopY(var13, var25)
                           : var13;
                        if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DZ/R56ZXey1RsbxUNc5H4IlXpgz1iZVI3SdxUqeosnrQhXMY6QqtYw==").equals(var8)) {
                           this.clearOutlineHud(var1, var10);
                           this.removeBaseHud(var1, var10);
                           this.removeRoundedParts(var1, var10);
                           if (var2.shellRuntimeRects != null) {
                              var2.shellRuntimeRects.put(var9, new EditorRect(var11, var13, var23, var25));
                           }
                        } else {
                           boolean var38 = this.shouldSpawnOpacityVisual(var8, var29);
                           int var39 = !var38 && this.shouldKeepHiddenShellBlockSpawned(var2, var9, var7, var8)
                              ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(1648864494, 25)
                              : Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1549230456, 24);
                           if (!var38 && var39 == 0) {
                              this.clearOutlineHud(var1, var10);
                              this.removeBaseHud(var1, var10);
                              this.removeRoundedParts(var1, var10);
                              if (var2.shellRuntimeRects != null) {
                                 var2.shellRuntimeRects.put(var9, new EditorRect(var11, var13, var23, var25));
                              }
                           } else {
                              double var40 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                                 ? this.applyTextAlignmentOffset(var11, var23, var33)
                                 : var11;
                              double var42 = this.resolveHudAlignmentOffsetX(var23, var32);
                              double var44 = var40 + var42;
                              double var46 = var40 + var23 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104606046022L, 16));
                              double var48 = var44 + var23 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581567574902L, 24));
                              double var50 = var36 + var25 / Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039152328047863622L, 46));
                              Placement var52 = this.positionCalculator.calculateBoxPlacement(var40, var36, var15, var23, var25);
                              Vector var53 = var52.location();
                              Vector var54 = var52.scale();
                              String var55;
                              if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)) {
                                 var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-348415727, 7)];
                                 var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1964232949, 29)] = var7.getString(
                                    Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
                                 );
                                 var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588713846, 11)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                                    "fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w=="
                                 );
                                 var55 = this.firstNonBlank(var10001);
                              } else {
                                 var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257779, 0)];
                                 var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 17)] = var7.getString(
                                    Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("imioXuyNd47D5GcMpFImHUGJD3rxf1A6g38GPEVmKQB45zM9pi3HZETA")
                                 );
                                 var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 17)] = var7.getString(
                                    Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw")
                                 );
                                 var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431268, 7)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
                                    "lnd2+W1j2mJ9YuEdGQ1K+hdDn4s+Xs0VsXbziFCA"
                                 );
                                 var55 = this.firstNonBlank(var10001);
                              }

                              var10001 = new String[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431204, 6)];
                              var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 10)] = var7.getString(
                                 Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("iwiRwjKzF9H8ww6P0hZbZ1X/yPTJM3XCIGGxsUBidXCqvmLzYBw=")
                              );
                              var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588695414, 14)] = var7.getString(
                                 Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Yhk8r3Wbx7zIuLytBTzWJo2rGNkzMYDbErsxG/sNTBKi8dd8o3DpjLnrNZ1oU45wMqw=")
                              );
                              String var56 = this.firstNonBlank(var10001);
                              if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("BTQLtRaevXZI0nUuB9qhk8C9qCeMKpEoT5F7BV7SvHXEILC0EQEm0XWcpyRWHl2Xs14D5b57iOg=")
                                 .equalsIgnoreCase(var9)) {
                                 var10001 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379716, 5)];
                                 var10001[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 15)] = var2.editorColor1;
                                 var10001[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1735594557, 12)] = var56;
                                 var56 = this.firstNonBlank(var10001);
                              } else if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("N4LiovW/13I78kAkyU/dTX6NqqRDbIGxJgagzdxuY7+oflt/8aNzjNnUt4kMc88KgXoJBPQQnSw=")
                                 .equalsIgnoreCase(var9)) {
                                 var10001 = new String[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1586614646, 20)];
                                 var10001[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024411474, 9)] = var2.editorColor2;
                                 var10001[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1592906102, 22)] = var56;
                                 var56 = this.firstNonBlank(var10001);
                              }

                              var55 = this.withHexPrefix(var55, var56);
                              String var57 = this.resolveBlockPlaceholders(var1, var2, var7, var55);
                              var57 = this.applyPreferredFont(
                                 var57,
                                 var7,
                                 ((!Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                                    ? Xqedii_101y7xo.Xqedii_32yuti7slijjp(1224056268, 30)
                                    : Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1889936192, 2)) != 0)
                              );
                              double var58 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                                 ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 55))
                                 : this.readOutlineSize(var7);
                              String var60 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                                 ? Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==")
                                 : this.readOutlineColor(var7);
                              String var61 = !Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                                    && var58 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8849623097327880516L, 9))
                                 ? this.applyOutlineColor(var57, var60)
                                 : null;
                              double var62 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)
                                 ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104608093510L, 22))
                                 : this.readOutlineLayer(var7);
                              if (this.isRoundedType(var8)) {
                                 boolean var64 = this.isDirectionalRoundedType(var8);
                                 double var65 = this.readRoundedRadius(var7, var23, var25);
                                 String var67 = this.readRoundedCornerUnicode(var7);
                                 String var68 = var64
                                    ? this.readRoundedCornerUnicodeTopLeft(var7)
                                    : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
                                 String var69 = var64
                                    ? this.readRoundedCornerUnicodeTopRight(var7)
                                    : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
                                 String var70 = var64
                                    ? this.readRoundedCornerUnicodeBottomRight(var7)
                                    : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
                                 String var71 = var64
                                    ? this.readRoundedCornerUnicodeBottomLeft(var7)
                                    : Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("fqkOv2b3YdDiPweMLYEtRB5zZcgug+1eAxX00w==");
                                 double var72 = this.readRoundedTopLeftOffsetX(var7);
                                 double var74 = this.readRoundedTopLeftOffsetY(var7);
                                 double var76 = this.readRoundedTopRightOffsetX(var7);
                                 double var78 = this.readRoundedTopRightOffsetY(var7);
                                 double var80 = this.readRoundedBottomRightOffsetX(var7);
                                 double var82 = this.readRoundedBottomRightOffsetY(var7);
                                 double var84 = this.readRoundedBottomLeftOffsetX(var7);
                                 double var86 = this.readRoundedBottomLeftOffsetY(var7);
                                 this.renderRoundedOutline(
                                    var1,
                                    new RoundedBox(var10, var44, var36, var15, var23, var25),
                                    var61,
                                    var29,
                                    var65,
                                    new RoundedCornerGlyphs(var67, var68, var69, var70, var71),
                                    new RoundedCornerOffsets(var72, var74, var76, var78, var80, var82, var84, var86),
                                    new RoundedTransform(var27, (var21 != 0), (var22 != 0), var48, var50),
                                    var58,
                                    var32,
                                    var62
                                 );
                                 this.renderRoundedBlock(
                                    var1,
                                    new RoundedBox(var10, var44, var36, var15, var23, var25),
                                    var57,
                                    var29,
                                    var65,
                                    new RoundedCornerGlyphs(var67, var68, var69, var70, var71),
                                    new RoundedCornerOffsets(var72, var74, var76, var78, var80, var82, var84, var86),
                                    new RoundedTransform(var27, (var21 != 0), (var22 != 0), var48, var50),
                                    var32
                                 );
                              } else {
                                 this.upsertHud(var1, var10, var53, var54, var57, var29, var32, var33, var34);
                                 this.applyElementTransformById(var1, var10, var27, (var21 != 0), (var22 != 0));
                                 if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var8)) {
                                    this.clearOutlineHud(var1, var10);
                                 } else {
                                    this.renderSimpleOutline(
                                       var1,
                                       new RoundedBox(var10, var40, var36, var15, var23, var25),
                                       var61,
                                       var29,
                                       var32,
                                       var33,
                                       new RoundedTransform(var27, (var21 != 0), (var22 != 0), var46, var50),
                                       var58,
                                       var62
                                    );
                                 }
                              }

                              if (var2.shellRuntimeRects != null) {
                                 var2.shellRuntimeRects.put(var9, new EditorRect(var11, var13, var23, var25));
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

   public void updateInputValueHud(Player var1, EditorSession var2, HoverElement var3) {
      if ((792071223 * (792071223 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 != null && var3.inputSection != null && var3.baseLocation != null && var3.baseScale != null) {
         double var4 = var3.baseScale.getX();
         double var6 = var3.baseScale.getY();
         double var8 = var3.baseLocation.getX() - this.resolveHudAlignmentOffsetX(var4, var3.hudAlignment);
         double var10 = var3.baseLocation.getY();
         int var12 = this.hudService.getRenderClip();
         this.hudService.setRenderClip(this.resolveScrollClip(var1, var2, var3.inputSection, var12));

         try {
            this.renderInputValuePart(var1, var2, var3.inputSection, var3.id, var8, var10, var4, var6, var3.z, var3.inputTextOpacity);
         } finally {
            this.hudService.setRenderClip(var12);
         }
      }
   }

   public void updateElementHud(Player var1, HoverElement var2) {
      if ((1925180911 * 1925180911 - 1925180911 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         int var3 = this.hudService.getRenderClip();
         EditorSession var4 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         this.hudService.setRenderClip(var2.scrollClipSpec != null ? this.encodeScrollClip(var1, var4, var2.scrollClipSpec) : var2.scrollClip);

         try {
            this.updateClippedElementHud(var1, var2);
         } finally {
            this.hudService.setRenderClip(var3);
         }
      }
   }

   public void updateClippedElementHud(Player var1, HoverElement var2) {
      if (((-1277005066 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var3 = (EditorSession)this.editorSessions.get(var1.getUniqueId());
         if (var3 != null) {
            if (Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("DZ/R56ZXey1RsbxUNc5H4IlXpgz1iZVI3SdxUqeosnrQhXMY6QqtYw==").equals(var2.type)) {
               this.clearOutlineHud(var1, var2.id);
               this.removeBaseHud(var1, var2.id);
               this.removeRoundedParts(var1, var2.id);
            } else if (!var2.visible) {
               if (var2 != null) {
                  this.clearOutlineHud(var1, var2.id);
                  this.removeBaseHud(var1, var2.id);
                  this.removeRoundedParts(var1, var2.id);
                  this.removeInputParts(var1, var2.id);
               }
            } else {
               if (var2.inputSection != null) {
                  this.updateInputValueHud(var1, var3, var2);
               }

               if (this.isRoundedElement(var2)) {
                  this.renderRoundedBlockForElement(var1, var2);
               } else {
                  double var4 = this.toRenderSize(var3, var2.baseScale.getX());
                  double var6 = this.toRenderSize(var3, var2.baseScale.getY());
                  double var8 = this.applyTextAlignmentOffset(this.toRenderX(var3, var2.baseLocation.getX()), var4, var2.textAlignment);
                  double var10 = this.toRenderY(var3, var2.baseLocation.getY());
                  double var12 = var8 + this.toRenderSize(var3, var2.pivotOffsetX);
                  double var14 = var10 + this.toRenderSize(var3, var2.pivotOffsetY);
                  double[] var16 = this.resolvePivotAwareTopLeft(var8, var10, var4, var6, var12, var14, var2.rotationDeg);
                  double var17 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var2.type)
                     ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 25))
                     : this.resolveRotationVisualXOffset(var2.rotationDeg, var4);
                  double var19 = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var2.type)
                     ? Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 49))
                     : this.resolveRotationVisualYOffset(var2.rotationDeg, var6);
                  if (this.isSkinType(var2.type)) {
                     this.renderSkinParts(
                        var1,
                        var2.id,
                        var2.skinOwner,
                        var2.skinSlim,
                        var2.skinPartRotations,
                        var8,
                        var10,
                        var4,
                        var6,
                        var2.runtimeZ,
                        var2.opacity,
                        var2.hudAlignment,
                        var2.rotationDeg + var2.skinSpinAngle,
                        var2.skinSpinPitch
                     );
                  } else {
                     Entity var21 = this.hudService.getHud(var1, var2.id);
                     boolean var22 = var21 instanceof ItemDisplay;
                     double var23 = var16[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-295680084, 17)] + var17;
                     double var25 = var16[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588679030, 15)] + var19;
                     if (var22) {
                        var25 -= var6 * Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-7627476295600380312L, 40));
                        double[] var27 = this.resolveItemDisplayRotationOffset(var2.rotationDeg, var4, var6);
                        var23 += var27[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1615310062, 25)];
                        var25 += var27[Xqedii_101y7xo.Xqedii_32yuti7slijjp(601257777, 0)];
                        double[] var28 = this.resolveItemDisplayNonBlockRotationOffset(var2.rotationDeg, var4, var6);
                        var23 += var28[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-696831965, 8)];
                        var25 += var28[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 27)];
                     }

                     Placement var37 = this.positionCalculator.calculateBoxPlacement(var23, var25, var2.runtimeZ, var4, var6);
                     int var38 = this.resolveEditorHudTransitionTicks(var3);
                     if (var21 != null) {
                        this.hudService.applyRenderClip(var21);
                        Vector var29 = var37.scale();
                        if (var22) {
                           var29 = this.resolveItemDisplayScale(var29);
                        }

                        this.hudService.moveHud(var21, var37.location(), var38, var38);
                        this.hudService.setHudScale(var21, var29, var38, (Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 31) != 0));
                        this.applyElementTransform(var21, var2.rotationDeg, var2.mirrorX, var2.mirrorY);
                        this.hudService.flushRenderClip(var21);
                     }

                     double var39 = this.toRenderSize(
                        var3, Math.max(Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 37)), var2.outlineSize)
                     );
                     if (!Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("ipYn7nJWUE0H67oX9/jzJYrr44DrJOWiru8bLW4T7f0LGCMw").equals(var2.type)
                        && var39 > Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-640784863258566419L, 0))) {
                        String var31 = var2.outlineText;
                        if (var31 == null || var31.isBlank()) {
                           var31 = this.applyOutlineColor(var2.text, var2.outlineColor);
                        }

                        double var32 = Double.isFinite(var2.outlineLayer)
                           ? this.toRuntimeLayer(var3, var2.outlineLayer)
                           : Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6821134339936347140L, 15));
                        this.renderSimpleOutline(
                           var1,
                           new RoundedBox(var2.id, var8, var10, var2.runtimeZ, var4, var6),
                           var31,
                           var2.opacity,
                           TextAlignment.CENTER,
                           var2.textAlignment,
                           new RoundedTransform(var2.rotationDeg, var2.mirrorX, var2.mirrorY, var12, var14),
                           var39,
                           var32
                        );
                     } else {
                        this.clearOutlineHud(var1, var2.id);
                     }
                  }
               }
            }
         }
      }
   }

   static {
      if ((1676122777 ^ 1676122777) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379844, 5)];
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 19)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8("Kkh+cARIW4aw6GAJiZRsPpSmMfaCQDE5roAUC+LOr2tezBTb");
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 2)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "CTIFmntAYe8yo4mTUwnARhN9hW5OT/KQ7i3hPaBJbseMtcaszjHekw=="
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1024279797, 19)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "9w346MFujsjlakuyVMB8dRTFXcbyYuwMdLBFVfdBgWfrc8jcodgFW3MY/qrkOw=="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(480236836, 21)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "IpwCT2sdI9BFw7AB9x6vLgK9cMSNobvu1XTWXsqcS/Q44SvdajBlX/r4rHg="
         );
         var10000[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484435236, 12)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "GtEzQAefr7BGf3WVKVTb+r4rWkKjqRDtTiNmn0gxNxKINnv4YGJVxfHdsQI/gQ=="
         );
         var10000[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1466005593, 0)] = Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8(
            "VC5r8Uk7A0N+lhgvqz6/8ux7vysQAkKYIBjY0/6uIS+5KFMtyt1h1GJBT0U="
         );
         SKIN_PART_NAMES = var10000;
         int[] var0 = new int[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484441380, 11)];
         var0[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 19)] = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1999643606, 16);
         var0[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 30)] = Xqedii_101y7xo.Xqedii_32yuti7slijjp(-863020580, 26);
         var0[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1521602934, 25)] = Xqedii_101y7xo.Xqedii_32yuti7slijjp(1648864494, 25);
         var0[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711670, 7)] = Xqedii_101y7xo.Xqedii_32yuti7slijjp(515094929, 3);
         var0[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461302, 5)] = Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1027425525, 19);
         var0[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1224056269, 30)] = Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1587925366, 18);
         SKIN_PART_BANDS = var0;
         double[] var1 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1693324485, 23)];
         var1[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(-484431141, 29)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 63));
         var1[Xqedii_101y7xo.Xqedii_32yuti7slijjp(2060379684, 5)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(22706269011275822L, 6));
         var1[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588712822, 9)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351582107853686L, 31));
         var1[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1186058614, 27)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039208128262973254L, 51));
         var1[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484422948, 13)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(3824944301616013816L, 47));
         var1[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(394630518, 12)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3333840782689657718L, 54));
         SKIN_PART_ANCHOR_X = var1;
         double[] var2 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(378919006, 22)];
         var2[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 0)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104637912902L, 26));
         var2[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588646262, 16)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-5907545652674600074L, 1));
         var2[Xqedii_101y7xo.Xqedii_32yuti7slijjp(574449523, 28)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581555000182L, 26));
         var2[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-923427380, 30)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3349597883827315574L, 53));
         var2[Xqedii_101y7xo.Xqedii_32yuti7slijjp(300628890, 31)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-7534453962566845638L, 46));
         var2[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1507644559, 10)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(4503087835945722742L, 62));
         SKIN_PART_ANCHOR_Y = var2;
         double[] var3 = new double[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484267300, 15)];
         var3[Xqedii_101y7xo.Xqedii_32yuti7slijjp(807655031, 24)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(1499298107838560309L, 55));
         var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431140, 13)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(4201504308792972371L, 1));
         var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588707702, 11)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205130606487366L, 36));
         var3[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588187510, 19)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347350481254835062L, 42));
         var3[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(81777956, 27)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-7985814102182803004L, 27));
         var3[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-332461270, 5)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(3728977504759350817L, 59));
         SKIN_PART_PIVOT_X = var3;
         double[] var4 = new double[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(-1263615248, 25)];
         var4[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1064347172, 26)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(515756292771133471L, 5));
         var4[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1566007672, 24)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3338357576456561526L, 55));
         var4[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711806, 2)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351572955620214L, 35));
         var4[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711802, 2)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(1542315003276149178L, 19));
         var4[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(450876708, 25)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-2750367305659415207L, 33));
         var4[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1440243222, 30)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205122016552774L, 35));
         SKIN_PART_PIVOT_Y = var4;
         double[] var5 = new double[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711702, 4)];
         var5[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1901954529, 26)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 56));
         var5[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711766, 5)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(3347351581571769206L, 56));
         var5[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(350213412, 27)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-1414180260786496258L, 28));
         var5[Xqedii_101y7xo.Xqedii_cz9vvmvpbj34(1981253109, 4)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3gnyuklf4fjt3(-2947657371193791398L, 52));
         var5[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(484431144, 2)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(3147374851848956085L, 14));
         var5[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-728802852, 26)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(-6739704652880169971L, 56));
         SKIN_PART_MODEL_DX = var5;
         double[] var6 = new double[Xqedii_101y7xo.Xqedii_32yuti7slijjp(1000018411, 15)];
         var6[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588711798, 18)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_wq6r027q3nwb(8087911123367180951L, 54));
         var6[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1647556363, 14)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-6764543730081252617L, 27));
         var6[Xqedii_101y7xo.Xqedii_32yuti7slijjp(-1860258887, 27)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-1691135932520313155L, 25));
         var6[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(215995684, 27)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(8498086059356363218L, 12));
         var6[Xqedii_101y7xo.Xqedii_x42dgjucv46g(-1588842870, 15)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_3rqo39zgfti7d(-8039205104605996870L, 19));
         var6[Xqedii_101y7xo.Xqedii_g54i57lr0mm1(517985572, 23)] = Double.longBitsToDouble(Xqedii_101y7xo.Xqedii_aojlqzs452us(-3561309941229144812L, 63));
         SKIN_PART_MODEL_DY = var6;
      }
   }

       private static /* synthetic */ String Xqedii_dwhjqjn02ctu(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"RALmDGbTjD6wCFRoO0uNUJxICh2+Vm2q7DQ1A2KyvcY3zp8stDOxMBdu4VdOTXM3A6f8ms5CiXW8t3uk") + string;
    }

    private static /* synthetic */ String Xqedii_35i4wvnmc5636(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"p35iJtKEYRHkErLpPd3UBWNieh/lChaiRGHupK1SajYh95CwxNg=") + string;
    }

    private static /* synthetic */ String Xqedii_34wf24jtdfvow(int n) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"VSs7vEdruzRk0BX5uWgdHZ2Spf/kdVE5Jq1yM94Z99MLAtGRRdv/Sg==") + n;
    }

    private static /* synthetic */ String Xqedii_3d2sspwsp0xhn(String string, int n) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"UHQPPrTafDwtuFy3k/Jjd+vboCFBdJVPIxS8s80O") + n;
    }

    private static /* synthetic */ String Xqedii_wsi1dey81hxa(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI=");
    }

    private static /* synthetic */ String Xqedii_3d481hnvdv05k(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"yFaFoBcjxRcgHM2WF/dgP5zPN10nwIfYUMcLwI6vOJfZUo4KvRhknZfY");
    }

    private static /* synthetic */ String Xqedii_1069p3eqq0e76(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"uBQKXLU/8UQ+VsmtXaQdlL+bd9Y9gQquQL938SSoYLJjaVce4dsh5g==");
    }

    private static /* synthetic */ String Xqedii_opl74kanj3uk(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"KvUYUBDztpx8gCPcAxg8vOSyjKy3EYCv37oHHdfWdIsato2AQM5vmI+Khc6Cnw==");
    }

    private static /* synthetic */ String Xqedii_mjwfnzfp1rxy(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"94OKZLNvKkO/0mvWYyIqtXimoxLDsjHDC+3b4kdwaihZO/wxi6i54qxS");
    }

    private static /* synthetic */ String Xqedii_3s8bcosgeac70(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"RL4owFNu96j053v0DB4Tvqn0h2ffBwRl5PeQ/6xrDjrernChINTsrYJ6UwQ=");
    }

    private static /* synthetic */ String Xqedii_1tx6agtp580qp(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"FahkutUtrEN7sMgGENB3KKD+gp7g+OsNE0ajy0odi09UZglVkhE=");
    }

    private static /* synthetic */ String Xqedii_2nwbjvuqzhdtw(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"LMwuJ507BwU4TIid3cAam8Mg0qk0Dncg3xHYoThy31+Gfypehcg=");
    }

    private static /* synthetic */ String Xqedii_odkg7ngqxwzg(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+Uw0u7a5tiarRmSJGRQlUG37M1XRnBQi/9SF1skNUjZOHgBeYgI=");
    }

    private static /* synthetic */ String Xqedii_3kb35y89cxs0w(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"sWW2JlXT3dN4rU61vq3KbZsJ706wwQPz7oJrE+5i+7XsH3uzZ1g=");
    }

    private static /* synthetic */ String Xqedii_30zbgtchnp16r(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"iNAYlbyueaL1NjTxH7tRTisf/GDaSiS3rZ/icspNc0J5hkaP") + string;
    }

    private static /* synthetic */ String Xqedii_2fjgvqvsv1kpr(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"1anGazytAqkFXd7mrqNXq2RIfGx2CBP+iW+j4rvr") + string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"1anGazytAqkFXd7mrqNXq2RIfGx2CBP+iW+j4rvr");
    }

    private static /* synthetic */ String Xqedii_1vfeun3esbu36(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI=");
    }

    private static /* synthetic */ String Xqedii_2z7bu54k7uo8h(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"yFaFoBcjxRcgHM2WF/dgP5zPN10nwIfYUMcLwI6vOJfZUo4KvRhknZfY");
    }

    private static /* synthetic */ String Xqedii_2s3pm7huobuvf(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"uBQKXLU/8UQ+VsmtXaQdlL+bd9Y9gQquQL938SSoYLJjaVce4dsh5g==");
    }

    private static /* synthetic */ String Xqedii_6y6df031y8om(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"KvUYUBDztpx8gCPcAxg8vOSyjKy3EYCv37oHHdfWdIsato2AQM5vmI+Khc6Cnw==");
    }

    private static /* synthetic */ String Xqedii_1jfpjafkptyu(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"94OKZLNvKkO/0mvWYyIqtXimoxLDsjHDC+3b4kdwaihZO/wxi6i54qxS");
    }

    private static /* synthetic */ String Xqedii_1g4g06t4b6lh(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"RL4owFNu96j053v0DB4Tvqn0h2ffBwRl5PeQ/6xrDjrernChINTsrYJ6UwQ=");
    }

    private static /* synthetic */ String Xqedii_1jh5geouogx1m(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"FahkutUtrEN7sMgGENB3KKD+gp7g+OsNE0ajy0odi09UZglVkhE=");
    }

    private static /* synthetic */ String Xqedii_ejnz1iikl1l(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"LMwuJ507BwU4TIid3cAam8Mg0qk0Dncg3xHYoThy31+Gfypehcg=");
    }

    private static /* synthetic */ String Xqedii_3vceuofqk216x(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+Uw0u7a5tiarRmSJGRQlUG37M1XRnBQi/9SF1skNUjZOHgBeYgI=");
    }

    private static /* synthetic */ String Xqedii_32xhwkk2vv252(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"sWW2JlXT3dN4rU61vq3KbZsJ706wwQPz7oJrE+5i+7XsH3uzZ1g=");
    }

    private static /* synthetic */ String Xqedii_394enkwsykp6w(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI=");
    }

    private static /* synthetic */ String Xqedii_g5jusz92gh5n(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"yFaFoBcjxRcgHM2WF/dgP5zPN10nwIfYUMcLwI6vOJfZUo4KvRhknZfY");
    }

    private static /* synthetic */ String Xqedii_766gm2638avf(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"uBQKXLU/8UQ+VsmtXaQdlL+bd9Y9gQquQL938SSoYLJjaVce4dsh5g==");
    }

    private static /* synthetic */ String Xqedii_1tk8ejn5uvek5(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"KvUYUBDztpx8gCPcAxg8vOSyjKy3EYCv37oHHdfWdIsato2AQM5vmI+Khc6Cnw==");
    }

    private static /* synthetic */ String Xqedii_2r9fxrj3h46c1(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"94OKZLNvKkO/0mvWYyIqtXimoxLDsjHDC+3b4kdwaihZO/wxi6i54qxS");
    }

    private static /* synthetic */ String Xqedii_2xab80atmuv2q(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"RL4owFNu96j053v0DB4Tvqn0h2ffBwRl5PeQ/6xrDjrernChINTsrYJ6UwQ=");
    }

    private static /* synthetic */ String Xqedii_sx5ggz6039d6(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"FahkutUtrEN7sMgGENB3KKD+gp7g+OsNE0ajy0odi09UZglVkhE=");
    }

    private static /* synthetic */ String Xqedii_ns60786b1gff(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"LMwuJ507BwU4TIid3cAam8Mg0qk0Dncg3xHYoThy31+Gfypehcg=");
    }

    private static /* synthetic */ String Xqedii_1tme9l2rr9s7s(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+Uw0u7a5tiarRmSJGRQlUG37M1XRnBQi/9SF1skNUjZOHgBeYgI=");
    }

    private static /* synthetic */ String Xqedii_1ksrz9kgwgo6m(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"sWW2JlXT3dN4rU61vq3KbZsJ706wwQPz7oJrE+5i+7XsH3uzZ1g=");
    }

    private static /* synthetic */ String Xqedii_8qq5pvijxxkh(String string, String string2) {
        return string + string2 + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"I+Jzx9ha0rf4T2V3ItYr+AH1ii5Mr9X3k76M8bFfFLPioudyYQiQn9Bf");
    }

    private static /* synthetic */ String Xqedii_3cup79eykm5hv(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_15eqtuac7d5y7(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"xKVmD/+vEpkF56ZdWoCbc3d6YH1nAIGuh+LJJvJ7vA0goicTGz7nYA==") + string;
    }

    private static /* synthetic */ String Xqedii_mzzcfe88z7g7(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"G39qF7xp5ll40FDtc80fdnD5ullhOW02AmTzKGRYAkMCqY8yldWOcYNz") + string;
    }

    private static /* synthetic */ String Xqedii_ux86d7ykvi8m(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"HQcartpjnUwZsF8mRpDKQNsIs619YmExBukAPXNDQdoWUqyEx20SmMYDeVau8No9rP0MhXDa3kICtXzSiiBXOrH0yzTXeIhOTSjAKEbUK7wzYd33fDZQrOLPK4WKtOKmADtx//XccNq9wf0ByRXO3Ows5J+23w==") + string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"Bj7qHgVsWXb5V1y25uKpBoRnPkYwYYpxgj7s4y12Mo6zWKmHIu79RFskCXBwsNv1VH8GVbFX1jk90x0felaSgykD9NbZyksUWEfmNXu+pf65HCoQCGcpdwaO7Bfa+hxYZ2mJtc6y8gQnzV5d51IsMVtjkUuR4rS6uEFjoA==");
    }

    private static /* synthetic */ String Xqedii_2m0mr7sp4l62v(String string, String string2) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"5LWmIYO+RE6rp7p2oD1f7H9ruRKY0QSBgnw2Hm/PkZ52UIf+3b7w52s8") + string2;
    }

    private static /* synthetic */ String Xqedii_1vq1pox55xruw(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"asnoHf9aN0KN0uyMJc+GM5OnQ1tkjHjIFOXf/neN3AkhplMKOwcxbZNWypALHkPh3P8=") + string;
    }

    private static /* synthetic */ String Xqedii_1s6o2zw8ybsec(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"pgK4SakZ+te/GQLboVeGyPCLv8u7y+1+R9r4nQxQibVsZQq9+Hqnuw==") + string;
    }

    private static /* synthetic */ String Xqedii_2offdw228oc7s(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+d61RZw/FJmy5ZTfcY+H6wjARR4YpDQGgi8h9R68PZ5JgSKou109mtg/Y9Ba+jp+qBLZnPRb") + string;
    }

    private static /* synthetic */ String Xqedii_14lwbswnlzhuo(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"8uQQ3eAAq8y+61UZxu7SGVPlPqfIiNv5aa67jN39CQF3IrSYsfjO9gdr0Zvl7kE7s1E=");
    }

    private static /* synthetic */ String Xqedii_x0wyrbiv04yf(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"8uQQ3eAAq8y+61UZxu7SGVPlPqfIiNv5aa67jN39CQF3IrSYsfjO9gdr0Zvl7kE7s1E=");
    }

    private static /* synthetic */ String Xqedii_1oweck47qgfyx(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"IIV2y3ZGsYqdEta6KVFS5DpxEFHeZdz5giydYxUVfnU=");
    }

    private static /* synthetic */ String Xqedii_k3nzls78cf52(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"IIV2y3ZGsYqdEta6KVFS5DpxEFHeZdz5giydYxUVfnU=");
    }

    private static /* synthetic */ String Xqedii_2kis1hczep0cx(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"n3MupNZDHJc6tTEjKm3511itwCL1a0OJlstQwz0+sZ+vxaM2Df3G5L9GJ9FlNz8Yzkg=");
    }

    private static /* synthetic */ String Xqedii_2kectd5bfdu0v(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"n3MupNZDHJc6tTEjKm3511itwCL1a0OJlstQwz0+sZ+vxaM2Df3G5L9GJ9FlNz8Yzkg=");
    }

    private static /* synthetic */ String Xqedii_1qo2k4cwad5rh(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"34BRQ7KStN/nB/i88vBZKPSPl6Etf1TEkmhD/7QdhHE=");
    }

    private static /* synthetic */ String Xqedii_3pljonyxdiayf(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"34BRQ7KStN/nB/i88vBZKPSPl6Etf1TEkmhD/7QdhHE=");
    }

    private static /* synthetic */ String Xqedii_2wimogqrfhnqr(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"8NuzwzGrZv6d2X08y8pUvujZ1HwzWHFNaHXlLf8yu4I6/Gpr6zPlKJYalqFvn1B1PDk=");
    }

    private static /* synthetic */ String Xqedii_16see1ipgpf23(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"8NuzwzGrZv6d2X08y8pUvujZ1HwzWHFNaHXlLf8yu4I6/Gpr6zPlKJYalqFvn1B1PDk=");
    }

    private static /* synthetic */ String Xqedii_xtoi7q6naash(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"t1SNf8YOfhQW6SoAnMKOZr9gelItoc2mdhBB+9gKT/M=");
    }

    private static /* synthetic */ String Xqedii_2e89o78bjxeso(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"t1SNf8YOfhQW6SoAnMKOZr9gelItoc2mdhBB+9gKT/M=");
    }

    private static /* synthetic */ String Xqedii_uo6y1ut1o0db(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"c4Hx4SpiihT7GR2/QiCMTpEvTi1/eh56dWgVv1CPCcNPUeixHDI=") + string;
    }

    private static /* synthetic */ String Xqedii_1jzlf58gr347(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"JNN3FzzlGEW+QqOZKumkMMOD0MRt4QbycxkzlIk560Kt1Ey5d0iGoxN6kHGeb2jY+RHlBw==") + string;
    }

    private static /* synthetic */ String Xqedii_3u801fp805rrh(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"asnoHf9aN0KN0uyMJc+GM5OnQ1tkjHjIFOXf/neN3AkhplMKOwcxbZNWypALHkPh3P8=") + string;
    }

    private static /* synthetic */ String Xqedii_2jvo6d0vs0xkw(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI=");
    }

    private static /* synthetic */ String Xqedii_pqwad18h7xl(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"yFaFoBcjxRcgHM2WF/dgP5zPN10nwIfYUMcLwI6vOJfZUo4KvRhknZfY");
    }

    private static /* synthetic */ String Xqedii_13oq989eylnqn(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"uBQKXLU/8UQ+VsmtXaQdlL+bd9Y9gQquQL938SSoYLJjaVce4dsh5g==");
    }

    private static /* synthetic */ String Xqedii_17xylj7znmgo(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"KvUYUBDztpx8gCPcAxg8vOSyjKy3EYCv37oHHdfWdIsato2AQM5vmI+Khc6Cnw==");
    }

    private static /* synthetic */ String Xqedii_3tccbuvlu4kxo(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"94OKZLNvKkO/0mvWYyIqtXimoxLDsjHDC+3b4kdwaihZO/wxi6i54qxS");
    }

    private static /* synthetic */ String Xqedii_1ev6ve056o3nl(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"RL4owFNu96j053v0DB4Tvqn0h2ffBwRl5PeQ/6xrDjrernChINTsrYJ6UwQ=");
    }

    private static /* synthetic */ String Xqedii_3vujholljv8ty(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"yFaFoBcjxRcgHM2WF/dgP5zPN10nwIfYUMcLwI6vOJfZUo4KvRhknZfY");
    }

    private static /* synthetic */ String Xqedii_2rbdo9ys22pw3(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"uBQKXLU/8UQ+VsmtXaQdlL+bd9Y9gQquQL938SSoYLJjaVce4dsh5g==");
    }

    private static /* synthetic */ String Xqedii_qq1s4jqbuan3(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"KvUYUBDztpx8gCPcAxg8vOSyjKy3EYCv37oHHdfWdIsato2AQM5vmI+Khc6Cnw==");
    }

    private static /* synthetic */ String Xqedii_3l4wq0jzzpogi(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"94OKZLNvKkO/0mvWYyIqtXimoxLDsjHDC+3b4kdwaihZO/wxi6i54qxS");
    }

    private static /* synthetic */ String Xqedii_3tm3orlgcz0u4(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"RL4owFNu96j053v0DB4Tvqn0h2ffBwRl5PeQ/6xrDjrernChINTsrYJ6UwQ=");
    }

    private static /* synthetic */ String Xqedii_2yd07l78l69ds(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"FahkutUtrEN7sMgGENB3KKD+gp7g+OsNE0ajy0odi09UZglVkhE=");
    }

    private static /* synthetic */ String Xqedii_3u0rqz93gfryt(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"LMwuJ507BwU4TIid3cAam8Mg0qk0Dncg3xHYoThy31+Gfypehcg=");
    }

    private static /* synthetic */ String Xqedii_3ul6cej1yzatr(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"sWW2JlXT3dN4rU61vq3KbZsJ706wwQPz7oJrE+5i+7XsH3uzZ1g=");
    }

    private static /* synthetic */ String Xqedii_1bet2mgff0vxh(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+Uw0u7a5tiarRmSJGRQlUG37M1XRnBQi/9SF1skNUjZOHgBeYgI=");
    }

    private static /* synthetic */ String Xqedii_vsedf4kykyns(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"FahkutUtrEN7sMgGENB3KKD+gp7g+OsNE0ajy0odi09UZglVkhE=");
    }

    private static /* synthetic */ String Xqedii_2wuhtpk497om7(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"LMwuJ507BwU4TIid3cAam8Mg0qk0Dncg3xHYoThy31+Gfypehcg=");
    }

    private static /* synthetic */ String Xqedii_28z82jz3b8kct(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"sWW2JlXT3dN4rU61vq3KbZsJ706wwQPz7oJrE+5i+7XsH3uzZ1g=");
    }

    private static /* synthetic */ String Xqedii_3jayotojthasn(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+Uw0u7a5tiarRmSJGRQlUG37M1XRnBQi/9SF1skNUjZOHgBeYgI=");
    }

    private static /* synthetic */ String Xqedii_3o69pfbxlivqg(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"FahkutUtrEN7sMgGENB3KKD+gp7g+OsNE0ajy0odi09UZglVkhE=");
    }

    private static /* synthetic */ String Xqedii_yqn3z6pqn16y(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"LMwuJ507BwU4TIid3cAam8Mg0qk0Dncg3xHYoThy31+Gfypehcg=");
    }

    private static /* synthetic */ String Xqedii_e2trh4wm6568(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"sWW2JlXT3dN4rU61vq3KbZsJ706wwQPz7oJrE+5i+7XsH3uzZ1g=");
    }

    private static /* synthetic */ String Xqedii_2si0g0u103l1v(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"+Uw0u7a5tiarRmSJGRQlUG37M1XRnBQi/9SF1skNUjZOHgBeYgI=");
    }

    private static /* synthetic */ String Xqedii_3kqjbuciqdwmw(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI=");
    }

    private static /* synthetic */ String Xqedii_2kc5iut4wwweo(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"6AfyyZQm4tnVo/HwiMp3fG4eAiojLDf0Dwk72RzCp0osPnAPdKOzM/gJsHv7p3K7QyiY7tzmJTc=") + string;
    }

    private static /* synthetic */ String Xqedii_1bklz0qdpg282(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"6AfyyZQm4tnVo/HwiMp3fG4eAiojLDf0Dwk72RzCp0osPnAPdKOzM/gJsHv7p3K7QyiY7tzmJTc=") + string;
    }

    private static /* synthetic */ String Xqedii_i0oiv2xbmij7(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_2z45092g2o3db(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"eWjk5zxnpPvboiR7Y6PBHbVxPAgb1EXTbwJFHpa4q1xej2hihXJHyn5w8w15LV9A21df2wH0");
    }

    private static /* synthetic */ String Xqedii_2wyy6o6ablu1q(String string) {
        return string + Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"V/2DUPeSUGd/vYkrgZRXpK3/U/Sam4yHhpZoumKAl/vigss5GL3JnSdyRcI=");
    }

    private static /* synthetic */ String Xqedii_2u6b4ftk3dn7e(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"hl9zCmxfwsAuI7mt7PEn6s5uSN6WUX30pxcwYxeFEqAxOTvgvFe8YSV62JtLyt4s25jg21MTocchmw==") + string;
    }

    private static /* synthetic */ String Xqedii_3lqwocoh4l002(String string) {
        return Xqedii_101y7xo.Xqedii_3fzcxfc08ewd8((String)"2hMnLfqQIneOZRHeRKyQ6bqXsB9TrvZbCRCsj1ad97+goK4+BYbjDTDLdYtByXgn2TtHAYe8") + string;
    }

   public static record RuntimeNumericPlaceholderConstraints(String placeholderId, double minValue, double maxValue, double defaultValue) {}
}
