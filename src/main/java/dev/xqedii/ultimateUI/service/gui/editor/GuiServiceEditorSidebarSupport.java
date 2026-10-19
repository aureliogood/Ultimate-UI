package dev.xqedii.ultimateUI.service.gui.editor;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_e49t38l;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.gui.render.EditorElementHudPart;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay.TextAlignment;

public abstract class GuiServiceEditorSidebarSupport extends EditorElementHudPart {
   public static final String Xqedii_3rdk5243sz7we = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final double Xqedii_3ti893l = 9316.0;
   public static final double Xqedii_19nw7x8 = 9317.0;
   public static final String Xqedii_1lbrm8g = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI=");
   public static final String Xqedii_fzl8ihm = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("v/ZjLUdoDg1aj21CzoROLIi3BTvC3kK2dm2ViRwqA4fhbKsWhgY4odQo");
   public static final String Xqedii_29o4se2 = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+C0tMGxAKlmQNTs7wI3RPLXQKOiHZ3F8GKuJ4xZAlS7D3w==");
   public static final String Xqedii_1djrrdv = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jDimezJT78pc1AiEy6oafA4m1Hnd7AalI2mHk3+ZvTWtkV8xgcY=");
   public static final String Xqedii_2zaewv7 = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("wSyiTm0ScLQdW0LYTHhzEIQbLZj1364BK5m8Aslb");
   public static final String Xqedii_1pbtheb = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Dwww+Vo/qfeHBZx9BnSizpGqxJ3JwSgcOYnsP8fe");

   public GuiServiceEditorSidebarSupport(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean isEditorToolShellBlockId(String var1) {
      if ((751155497 * 751155497 + 751155497 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.resolveEditorToolFromBlockId(var1) != null
            ? Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1201441957, 20)
            : Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1494829200, 29)) != 0);
      }
   }

   public void renderEditorToolSidebar(Player var1, EditorSession var2) {
      if ((1581363554 * 1581363554 + 1581363554 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.editMode && var2.previewMode) {
         Map var3 = this.collectEditorToolShellDefinitions(var2);
         this.clearMissingEditorToolButtons(var1, var3);

         for (GuiServiceEditorSidebarSupport.EditorToolShellDefinition var5 : (Iterable<EditorToolShellDefinition>) (var3.values())) {

            if (var5.Xqedii_2l3vgdm != null || var5.Xqedii_sn06uof != null) {
               this.renderEditorToolButton(
                  var1,
                  var5,
                  ((var2.activeTool == var5.Xqedii_15sf8cr
                     ? Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989185, 28)
                     : Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-300622634, 18)) != 0)
               );
            }
         }
      }
   }

   public EditorTool findHoveredToolbarTool(EditorSession var1, double var2, double var4) {
      if ((-919000809 * (-919000809 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var6 = this.findHoveredToolbarHitboxId(var1, var2, var4);
         return var6 != null && !var6.isBlank() ? this.resolveEditorToolFromHitboxId(var6) : null;
      }
   }

   public String findHoveredToolbarHitboxId(EditorSession var1, double var2, double var4) {
      if (((467774475 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.editMode && var1.previewMode && var1.shellBlocks != null && !var1.shellBlocks.isEmpty()) {
         this.ensureSidebarShellBlockCache(var1);
         String var6 = null;
         double var7 = Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_14ytzophmjj62(3553042669253266926L, 3));

         for (Entry var10 : var1.shellSectionCache.entrySet()) {
            if (var10 != null && var10.getValue() != null) {
               ConfigurationSection var11 = (ConfigurationSection)var10.getValue();
               String[] var10001 = new String[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-120140887, 17)];
               var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-962175665, 20)] = var11.getString(
                  Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("PTeSzGB2t4JLkmz7HckurwawMkPlZIDztLNpbYaR/W4=")
               );
               String var12 = this.firstNonBlank(var10001);
               if (this.isToolHitboxBlockId(var12)) {
                  double var13 = this.readDouble(
                     var11,
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("rv9216haugtSkV2ikzNhl9KV7EWzexZekrQ1YZvD5nnXYb5/WDx3Xh0KCfG3CTP1"),
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("HoE81lLlud9j6t7gYjc9BzQl/Sw/F7gcJuZxX9Iq"),
                     Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_tzsn3xi6g2yx(-6299711778874637646L, 41))
                  );
                  double var15 = this.readDouble(
                     var11,
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("NO6UmttunIORp8SgW9PLmY3lHV00WKqoorlC1mFTd11h3vCvjA7Cu5FXD4VCg2vF"),
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Q1dnmowE1NEuwpcv3Cfl7a8TKMVQce8HtTwQ9HSx"),
                     Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_2aq1nzc057jyp(6471491337273921547L, 58))
                  );
                  double var17 = Math.max(
                     Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_2aq1nzc057jyp(6485006534202544139L, 54)),
                     Math.abs(
                        this.readDouble(
                           var11,
                           Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J5vSZg0bWBwsEV2qyY0+CEYl3I09f18a3eSk5cw5Vrlch5kxCXGx8FGsyO6WG4V5"),
                           Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J+7VZ1PL7Qe57jMMtRUnE9IBBuVYbsP25rI1/n9aYu5+SWCWH9g="),
                           this.readDouble(
                              var11,
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Wo1C9H5h5K3dn8l8VNQfSO3Ih52gFtELviwB9SK9YXW3JzVObFd5FVfXAnFa7LNKvMQ="),
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J+7VZ1PL7Qe57jMMtRUnE9IBBuVYbsP25rI1/n9aYu5+SWCWH9g="),
                              Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(4021652771388924918L, 56))
                           )
                        )
                     )
                  );
                  double var19 = Math.max(
                     Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(-3377785763784615292L, 35)),
                     Math.abs(
                        this.readDouble(
                           var11,
                           Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("lbxxjYb4up3BkhuLiR7ixiB9omTYzJ26Y0eMLTfILjvCaJ5nbq7zC0IFnc3dzkKOk4c="),
                           Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jHBbxCdiYdcDytiZyf3ZTj7IJVuIPsFNZSYa2cX/AIPiOrDNWvoO+w=="),
                           this.readDouble(
                              var11,
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("b7+kvd8ADSYi6nQyOieSxsKB5OkQpnMYcG/WjXhJy0+9/3dFbDRj1SgTvqukBs1nw5Zz+w=="),
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jHBbxCdiYdcDytiZyf3ZTj7IJVuIPsFNZSYa2cX/AIPiOrDNWvoO+w=="),
                              Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_14ytzophmjj62(-3544597907889615383L, 51))
                           )
                        )
                     )
                  );
                  if (this.Xqedii_9tanuia(var2, var4, var13, var15, var17, var19)) {
                     double var21 = this.readDouble(
                        var11,
                        Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+X85QkuernLnfQRHmpv0n/N5e+aHce60X2hJFvBdyNyFegFwrrU="),
                        Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+X85QkuernLnfQRHmpv0n/N5e+aHce60X2hJFvBdyNyFegFwrrU="),
                        Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(-8217901065959995139L, 54))
                     );
                     if (var21 >= var7) {
                        var6 = var12;
                        var7 = var21;
                     }
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean isToolHitboxBlockId(String var1) {
      if ((42267814 * (42267814 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         return ((var2.startsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI="))
               && var2.contains(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("v/ZjLUdoDg1aj21CzoROLIi3BTvC3kK2dm2ViRwqA4fhbKsWhgY4odQo"))
            ? Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(1529784291, 27)
            : Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(1304989184, 29)) != 0);
      } else {
         return (Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439988427, 31) != 0);
      }
   }

   public void renderEditorToolButton(Player var1, GuiServiceEditorSidebarSupport.EditorToolShellDefinition var2, boolean var3) {
      if (((2119242201 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var2.Xqedii_2l3vgdm != null) {
            ConfigurationSection var4 = var2.Xqedii_2l3vgdm;
            String[] var10001 = new String[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(437876031, 22)];
            var10001[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(1304989184, 28)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("PTeSzGB2t4JLkmz7HckurwawMkPlZIDztLNpbYaR/W4=")
            );
            var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1217345818, 13)] = this.editorToolBackgroundId(var2.Xqedii_15sf8cr);
            String var5 = this.firstNonBlank(var10001);
            var10001 = new String[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439987787, 7)];
            var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(854228533, 31)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("wTfj4Yqtxlcfn/zu6N4rlXY579MvqWLaGtotFck3pNDXNYcRYsds1JU3jPCHerktPxzJ9Ei4aI2ysz7FJhgd8fkGmHGhrA==")
            );
            var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-1756106323, 2)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("RMlKG8pUhRrcKlYdLzBw0v/6JGtR3BNX34ggYApRd89v1byldWIcivcNmzdZQEmQYNuEYZJA76tWrw==")
            );
            var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(1967069721, 6)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("j3sIHErR4k4wIMwfz3GX9IXh+LLfDYsFH4PZ6Jnp4CyuI9IM")
            );
            var10001[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1305120257, 16)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("SDZgW6VFyBZMBmWtz/f6B8sQ2fs6rggjZaPrI2eXB9gyo7U07Uu9N8y+")
            );
            var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1696742245, 7)] = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Dwww+Vo/qfeHBZx9BnSizpGqxJ3JwSgcOYnsP8fe");
            String var6 = this.firstNonBlank(var10001);
            var10001 = new String[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1440185035, 16)];
            var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-848371379, 6)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("H0a0gX8HPKVjUaBjqd8H5OI+Ulgw4x1TkphQDqd8MPZBCPKIAG3YlrDkaYQEtKvLqnpAriR0yLueKQ2l/otVi+D9")
            );
            var10001[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989185, 16)] = var4.getString(
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("yZgGJjuscGepF7s+Hbwo7+XzQ8We75a7SKlL6t1ZCllMePVFburHZnB8uMVFo/NStMnmolUv")
            );
            var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(427114266, 30)] = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("wSyiTm0ScLQdW0LYTHhzEIQbLZj1364BK5m8Aslb");
            String var7 = this.firstNonBlank(var10001);
            this.renderEditorToolTextSection(
               var1,
               var4,
               var5,
               var3 ? var7 : var6,
               Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(4021883883579122678L, 56)),
               Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_tzsn3xi6g2yx(441821728366208474L, 2)),
               Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_14ytzophmjj62(-3580835062362042903L, 57))
            );
         } else {
            this.clearEditorToolBackground(var1, this.editorToolBackgroundId(var2.Xqedii_15sf8cr));
         }

         this.renderEditorToolIcon(var1, var2, var3);
      }
   }

   public void renderEditorToolIcon(Player var1, GuiServiceEditorSidebarSupport.EditorToolShellDefinition var2, boolean var3) {
      if (((1845222272 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2.Xqedii_sn06uof == null) {
         this.removeHudById(var1, Xqedii_3ggx0mv8a644f(this.editorToolIconId(var2.Xqedii_15sf8cr)));
      } else {
         ConfigurationSection var4 = var2.Xqedii_sn06uof;
         String[] var10001 = new String[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439980235, 12)];
         var10001[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439988427, 26)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("PTeSzGB2t4JLkmz7HckurwawMkPlZIDztLNpbYaR/W4=")
         );
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1179788239, 3)] = this.editorToolIconId(var2.Xqedii_15sf8cr);
         String var5 = this.firstNonBlank(var10001);
         var10001 = new String[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304727041, 18)];
         var10001[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439988427, 2)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("wTfj4Yqtxlcfn/zu6N4rlXY579MvqWLaGtotFck3pNDXNYcRYsds1JU3jPCHerktPxzJ9Ei4aI2ysz7FJhgd8fkGmHGhrA==")
         );
         var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(450458943, 22)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("RMlKG8pUhRrcKlYdLzBw0v/6JGtR3BNX34ggYApRd89v1byldWIcivcNmzdZQEmQYNuEYZJA76tWrw==")
         );
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(1860292045, 14)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("j3sIHErR4k4wIMwfz3GX9IXh+LLfDYsFH4PZ6Jnp4CyuI9IM")
         );
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-848371187, 6)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("SDZgW6VFyBZMBmWtz/f6B8sQ2fs6rggjZaPrI2eXB9gyo7U07Uu9N8y+")
         );
         String var6 = this.firstNonBlank(var10001);
         var10001 = new String[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1305251329, 17)];
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-424185690, 5)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("H0a0gX8HPKVjUaBjqd8H5OI+Ulgw4x1TkphQDqd8MPZBCPKIAG3YlrDkaYQEtKvLqnpAriR0yLueKQ2l/otVi+D9")
         );
         var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-240281773, 18)] = var4.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("yZgGJjuscGepF7s+Hbwo7+XzQ8We75a7SKlL6t1ZCllMePVFburHZnB8uMVFo/NStMnmolUv")
         );
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(1860292045, 14)] = this.resolveActiveToolIconUnicode(var6);
         String var7 = this.firstNonBlank(var10001);
         this.renderEditorToolTextSection(
            var1,
            var4,
            var5,
            var3 ? var7 : var6,
            Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(693938113549919101L, 4)),
            Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_2aq1nzc057jyp(6471491565846712331L, 39)),
            Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(5553495912800842152L, 31))
         );
      }
   }

   public void renderEditorToolTextSection(Player var1, ConfigurationSection var2, String var3, String var4, double var5, double var7, double var9) {
      if ((-1997282889 * -1997282889 + -1997282889 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null && !var3.isBlank() && var4 != null && !var4.isBlank()) {
         String[] var10001 = new String[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439989451, 9)];
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1378080327, 11)] = var2.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("nmOHirXnyld9mJKBJsySgeL2YQFNzwgSzZK5BOFrN5BWR6PF")
         );
         var10001[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989185, 26)] = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy(
            "j3sIHErR4k4wIMwfz3GX9IXh+LLfDYsFH4PZ6Jnp4CyuI9IM"
         );
         String var11 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
         double var12 = this.readDouble(
            var2,
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("rv9216haugtSkV2ikzNhl9KV7EWzexZekrQ1YZvD5nnXYb5/WDx3Xh0KCfG3CTP1"),
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("HoE81lLlud9j6t7gYjc9BzQl/Sw/F7gcJuZxX9Iq"),
            Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(2591319726540148890L, 40))
         );
         double var14 = this.readDouble(
            var2,
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("NO6UmttunIORp8SgW9PLmY3lHV00WKqoorlC1mFTd11h3vCvjA7Cu5FXD4VCg2vF"),
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Q1dnmowE1NEuwpcv3Cfl7a8TKMVQce8HtTwQ9HSx"),
            Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_tzsn3xi6g2yx(-6159405516157417631L, 18))
         );
         double var16 = this.readDouble(
            var2,
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+X85QkuernLnfQRHmpv0n/N5e+aHce60X2hJFvBdyNyFegFwrrU="),
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+X85QkuernLnfQRHmpv0n/N5e+aHce60X2hJFvBdyNyFegFwrrU="),
            var5
         );
         double var18 = this.readDouble(
            var2,
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J5vSZg0bWBwsEV2qyY0+CEYl3I09f18a3eSk5cw5Vrlch5kxCXGx8FGsyO6WG4V5"),
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J+7VZ1PL7Qe57jMMtRUnE9IBBuVYbsP25rI1/n9aYu5+SWCWH9g="),
            var7
         );
         double var20 = this.readDouble(
            var2,
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("lbxxjYb4up3BkhuLiR7ixiB9omTYzJ26Y0eMLTfILjvCaJ5nbq7zC0IFnc3dzkKOk4c="),
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jHBbxCdiYdcDytiZyf3ZTj7IJVuIPsFNZSYa2cX/AIPiOrDNWvoO+w=="),
            var9
         );
         int var22 = var18 < Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_2aq1nzc057jyp(6471491337273921547L, 26))
            ? Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(1824169869, 29)
            : Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-1618129734, 13);
         int var23 = var20 < Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_14ytzophmjj62(-3544630343482634775L, 61))
            ? Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989185, 20)
            : Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-1478274258, 11);
         double var24 = Math.max(Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_14ytzophmjj62(-3544630374554038807L, 38)), Math.abs(var18));
         double var26 = Math.max(Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_2aq1nzc057jyp(6417430549559431179L, 56)), Math.abs(var20));
         int var28 = this.readOpacity(var2, Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439406795, 13));
         TextAlignment var29 = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("j3sIHErR4k4wIMwfz3GX9IXh+LLfDYsFH4PZ6Jnp4CyuI9IM").equals(var11)
            ? this.readTextAlignment(var2)
            : TextAlignment.CENTER;
         var10001 = new String[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(442070335, 22)];
         var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-360827598, 7)] = var2.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("4TFj/pEBP78EcjT8MrZJsgoZjYcSpOPUkPdjkbuqDBlsnXQiylA=")
         );
         var10001[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439987915, 9)] = var2.getString(
            Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("220T5ZRAlq2NuDAnBPWI8IWgyBXs/kK/agt9s8IOi9COURh4VV2DOtmh1kBB+P/RC4Y=")
         );
         var10001[Xqedii_e49t38l.Xqedii_qsys6atqw7a2(1860292045, 14)] = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy(
            "QNj3+Cs4W0gb1P94fbnaXfv83vcER6uQ5EkX1MIuTV4cxhzibjNEKw=="
         );
         String var30 = this.firstNonBlank(var10001);
         String var31 = this.applyPreferredFont(this.withHexPrefix(var4, var30), var2, (Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(900917886, 23) != 0));
         double var32 = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("j3sIHErR4k4wIMwfz3GX9IXh+LLfDYsFH4PZ6Jnp4CyuI9IM").equals(var11)
            ? this.toInternalTextTopY(var14, var26)
            : var14;
         double var34 = Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("j3sIHErR4k4wIMwfz3GX9IXh+LLfDYsFH4PZ6Jnp4CyuI9IM").equals(var11)
            ? this.applyTextAlignmentOffset(var12, var24, var29)
            : var12;
         HudPositionCalculator.Placement var36 = this.positionCalculator.calculateBoxPlacement(var34, var32, var16, var24, var26);
         String var37 = Xqedii_ecu20t4z7yjq(var3);
         this.upsertHud(var1, var37, var36.location(), var36.scale(), var31, var28, var29);
         this.applyElementTransformById(
            var1,
            var37,
            this.readDouble(
               var2,
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("VgKf1+VpWHcvUGvqfnwEq/ChFY1GJN7tZSDzTbQKSA64fMMKEUoXuP41Qpw="),
               Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("esv53nLJuagmmQeI9A0F179JoZpj//MIpw8xMBGx10/fH456Lc8fZQ=="),
               Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_tzsn3xi6g2yx(3110449326941998420L, 29))
            ),
            (var22 != 0),
            (var23 != 0)
         );
      }
   }

   public String resolveActiveToolIconUnicode(String var1) {
      if ((-1345704289 * (-1345704289 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(1338422877, 12)];
         var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-1924351329, 21)] = var1;
         String var2 = this.firstNonBlank(var10001);
         int var3 = Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-2031700112, 29);
         switch (var2.hashCode()) {
            case 58849:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("SudxUlXB6T9zV/X+u6DpPwMxDeqmSq8M0MW/Ijre"))) {
                  var3 = Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(1304989184, 6);
               }
               break;
            case 58850:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("ZXyytSYRYT/vBICYWkxZ3D2ptmz4QuEuRwZ1oQX2"))) {
                  var3 = Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-957958288, 29);
               }
               break;
            case 58851:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("VrsEVmXqu4aArKvOiIOTX0oeomGal4twZc0NEoeh"))) {
                  var3 = Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-1756106335, 2);
               }
               break;
            case 58852:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("HwqhmIH+xTxCcBBxNl9aZwaH6upn8WvbgoKLEDqm"))) {
                  var3 = Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304464897, 18);
               }
               break;
            case 58853:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("8TUtCxXCi7lFlXgqshf89tILekpW7CW82GIZVmPo"))) {
                  var3 = Xqedii_e49t38l.Xqedii_qsys6atqw7a2(-1684349500, 31);
               }
               break;
            case 58854:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("aYvYVD/4VEWfETrvdr4JWgFuG2G7ZBbbe188AINd"))) {
                  var3 = Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-323313779, 29);
               }
            case 58855:
            default:
               break;
            case 58856:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("QA4yw3itNEAbA5GfIRh+xm7sg04RnjmmRCzt1LwY"))) {
                  var3 = Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1330155009, 23);
               }
               break;
            case 58857:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("/BuHh4FE1XDz77UiEsSRNOarUY9ow695ji/vAjB+"))) {
                  var3 = Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1305013761, 12);
               }
               break;
            case 58858:
               if (var2.equals(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("iIPhVf9VhH6S7wwhVqX98aBoPAaz7ElLRlf2aUkF"))) {
                  var3 = Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1254657537, 24);
               }
         }
         return switch (var3) {
            case 0 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("JN14wXhiyqqhdECB2UGc0r5kojTSd9nHLU8PImSm");
            case 1 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("D+zWGvaKjolKFdp4JeeTzKnV7X0ABHyTMqgDhVcf");
            case 2 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Dnnr2HrxVKFk+LT/K5j33PRL94+OtKwdz9Kgb7lS");
            case 3 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("QQBlt6oVYApUumakr2PwVdFjdBboJpKKwnO6hXJo");
            case 4 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Mnl59c0MNaHfxY9Nl4I9tdDu9xW3F2VlQ1Q1BjAQ");
            case 5 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("BAIS0Vw/WaUx1WA1JD/N4cihTG3VPNgwEhQiks/Y");
            case 6 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("AUcOODz7QlREElon1z0oV5ZDtc/LZ1/7VBuaMYek");
            case 7 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("9SWCPORCnp3eycucGtUUfgKTyWDNwWTrS3J2Rv6E");
            case 8 -> Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("IA84r/k4uI7wRw06DGAHzzLizwrfvpz2Torbn3Iy");
            default -> {
               var10001 = new String[Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989185, 22)];
               var10001[Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439988427, 27)] = var1;
               yield this.firstNonBlank(var10001);
            }
         };
      }
   }

   public Map<EditorTool, GuiServiceEditorSidebarSupport.EditorToolShellDefinition> collectEditorToolShellDefinitions(EditorSession var1) {
      if ((2109767493 * 2109767493 - 2109767493 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap<EditorTool, GuiServiceEditorSidebarSupport.EditorToolShellDefinition> var2 = new LinkedHashMap<>();
         if (var1 != null && var1.shellBlocks != null) {
            this.ensureSidebarShellBlockCache(var1);

            for (Entry var4 : var1.shellSectionCache.entrySet()) {
               if (var4 != null && var4.getValue() != null) {
                  ConfigurationSection var5 = (ConfigurationSection)var4.getValue();
                  String[] var10001 = new String[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-60070444, 16)];
                  var10001[Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(1785058556, 24)] = var5.getString(
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("PTeSzGB2t4JLkmz7HckurwawMkPlZIDztLNpbYaR/W4=")
                  );
                  String var6 = this.firstNonBlank(var10001);
                  EditorTool var7 = this.resolveEditorToolFromBlockId(var6);
                  if (var7 != null) {
                     GuiServiceEditorSidebarSupport.EditorToolShellDefinition var8 = var2.computeIfAbsent(
                        var7, GuiServiceEditorSidebarSupport.EditorToolShellDefinition::new
                     );
                     String var9 = var6.toLowerCase(Locale.ROOT);
                     if (var9.contains(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("v/ZjLUdoDg1aj21CzoROLIi3BTvC3kK2dm2ViRwqA4fhbKsWhgY4odQo"))) {
                        var8.Xqedii_3sc4hgn = var5;
                     } else if (var9.endsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+C0tMGxAKlmQNTs7wI3RPLXQKOiHZ3F8GKuJ4xZAlS7D3w=="))) {
                        var8.Xqedii_2l3vgdm = var5;
                     } else if (var9.endsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jDimezJT78pc1AiEy6oafA4m1Hnd7AalI2mHk3+ZvTWtkV8xgcY="))) {
                        var8.Xqedii_sn06uof = var5;
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

   public void ensureSidebarShellBlockCache(EditorSession var1) {
      if (((-1690607736 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.shellCacheBuilt) {
         var1.shellSectionCache.clear();
         var1.shellBlockMapCache.clear();
         var1.shellStaticRectCache.clear();
         var1.sidebarPanelVisibilityStates.clear();
         if (var1.shellBlocks != null && !var1.shellBlocks.isEmpty()) {
            HashMap var2 = new HashMap();
            int var3 = Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1439988427, 2);

            for (Map var5 : var1.shellBlocks) {
               var3++;
               ConfigurationSection var6 = this.mapToSection(var5);
               if (var6 != null) {
                  String var7 = this.resolveElementId(var6, var3, var2);
                  if (!var7.isBlank() && !var1.shellSectionCache.containsKey(var7)) {
                     var1.shellSectionCache.put(var7, var6);
                     var1.shellBlockMapCache.put(var7, var5);
                     double var8 = this.readDouble(
                        var6,
                        Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("rv9216haugtSkV2ikzNhl9KV7EWzexZekrQ1YZvD5nnXYb5/WDx3Xh0KCfG3CTP1"),
                        Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("HoE81lLlud9j6t7gYjc9BzQl/Sw/F7gcJuZxX9Iq"),
                        Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(-176234164816435576L, 46))
                     );
                     double var10 = this.readDouble(
                        var6,
                        Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("NO6UmttunIORp8SgW9PLmY3lHV00WKqoorlC1mFTd11h3vCvjA7Cu5FXD4VCg2vF"),
                        Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Q1dnmowE1NEuwpcv3Cfl7a8TKMVQce8HtTwQ9HSx"),
                        Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(-722594478220800541L, 6))
                     );
                     double var12 = Math.max(
                        Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(-704866359241041373L, 48)),
                        Math.abs(
                           this.readDouble(
                              var6,
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J5vSZg0bWBwsEV2qyY0+CEYl3I09f18a3eSk5cw5Vrlch5kxCXGx8FGsyO6WG4V5"),
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J+7VZ1PL7Qe57jMMtRUnE9IBBuVYbsP25rI1/n9aYu5+SWCWH9g="),
                              this.readDouble(
                                 var6,
                                 Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("Wo1C9H5h5K3dn8l8VNQfSO3Ih52gFtELviwB9SK9YXW3JzVObFd5FVfXAnFa7LNKvMQ="),
                                 Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("J+7VZ1PL7Qe57jMMtRUnE9IBBuVYbsP25rI1/n9aYu5+SWCWH9g="),
                                 Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(694186989099712053L, 28))
                              )
                           )
                        )
                     );
                     double var14 = Math.max(
                        Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_wxkt9v2b0jve(-6949117304340222865L, 1)),
                        Math.abs(
                           this.readDouble(
                              var6,
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("lbxxjYb4up3BkhuLiR7ixiB9omTYzJ26Y0eMLTfILjvCaJ5nbq7zC0IFnc3dzkKOk4c="),
                              Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jHBbxCdiYdcDytiZyf3ZTj7IJVuIPsFNZSYa2cX/AIPiOrDNWvoO+w=="),
                              this.readDouble(
                                 var6,
                                 Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("b7+kvd8ADSYi6nQyOieSxsKB5OkQpnMYcG/WjXhJy0+9/3dFbDRj1SgTvqukBs1nw5Zz+w=="),
                                 Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jHBbxCdiYdcDytiZyf3ZTj7IJVuIPsFNZSYa2cX/AIPiOrDNWvoO+w=="),
                                 Double.longBitsToDouble(Xqedii_e49t38l.Xqedii_tzsn3xi6g2yx(-3079702758078677936L, 17))
                              )
                           )
                        )
                     );
                     var1.shellStaticRectCache.put(var7, new EditorRect(var8, var10, var12, var14));
                  }
               }
            }

            var1.shellCacheBuilt = (Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-721654939, 8) != 0);
         } else {
            var1.shellCacheBuilt = (Xqedii_e49t38l.Xqedii_3tb2me6sed285(-1431599819, 23) != 0);
         }
      }
   }

   public void clearMissingEditorToolButtons(Player var1, Map<EditorTool, GuiServiceEditorSidebarSupport.EditorToolShellDefinition> var2) {
      if ((-705168688 * -705168688 + -705168688 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EditorTool[] var3 = EditorTool.values();
         int var4 = var3.length;

         for (int var5 = Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(782754643, 3); var5 < var4; var5++) {
            EditorTool var6 = var3[var5];
            GuiServiceEditorSidebarSupport.EditorToolShellDefinition var7 = (GuiServiceEditorSidebarSupport.EditorToolShellDefinition)var2.get(var6);
            if (var7 == null || var7.Xqedii_2l3vgdm == null) {
               this.clearEditorToolBackground(var1, this.editorToolBackgroundId(var6));
            }

            if (var7 == null || var7.Xqedii_sn06uof == null) {
               this.removeHudById(var1, Xqedii_228hd00fy3e21(this.editorToolIconId(var6)));
            }
         }
      }
   }

   public void clearEditorToolBackground(Player var1, String var2) {
      if ((-138974439 ^ -138974439) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = Xqedii_3aqtji1mt3nn3(var2);
         this.removeBaseHud(var1, var3);
         this.removeRoundedParts(var1, var3);
         this.clearOutlineHud(var1, var3);
      }
   }

   public EditorTool resolveEditorToolFromHitboxId(String var1) {
      if ((-686604453 ^ -686604453) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         if (var2.startsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI="))
            && var2.contains(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("v/ZjLUdoDg1aj21CzoROLIi3BTvC3kK2dm2ViRwqA4fhbKsWhgY4odQo"))) {
            int var3 = var2.indexOf(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("v/ZjLUdoDg1aj21CzoROLIi3BTvC3kK2dm2ViRwqA4fhbKsWhgY4odQo"));
            if (var3 <= Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI=").length()) {
               return null;
            } else {
               String var4 = var2.substring(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI=").length(), var3);
               if (var4.isBlank()) {
                  return null;
               } else {
                  try {
                     return EditorTool.valueOf(
                        var4.replace((char)Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1212714497, 21), (char)Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-508875097, 19))
                           .toUpperCase(Locale.ROOT)
                     );
                  } catch (IllegalArgumentException var6) {
                     return null;
                  }
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public EditorTool resolveEditorToolFromBlockId(String var1) {
      if ((-434122335 * -434122335 - -434122335 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         EditorTool var2 = this.resolveEditorToolFromHitboxId(var1);
         if (var2 != null) {
            return var2;
         } else {
            String var3 = var1.trim().toLowerCase(Locale.ROOT);
            if (!var3.startsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI="))) {
               return null;
            } else {
               String var4;
               if (var3.endsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+C0tMGxAKlmQNTs7wI3RPLXQKOiHZ3F8GKuJ4xZAlS7D3w=="))) {
                  var4 = var3.substring(
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI=").length(),
                     var3.length() - Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+C0tMGxAKlmQNTs7wI3RPLXQKOiHZ3F8GKuJ4xZAlS7D3w==").length()
                  );
               } else {
                  if (!var3.endsWith(Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jDimezJT78pc1AiEy6oafA4m1Hnd7AalI2mHk3+ZvTWtkV8xgcY="))) {
                     return null;
                  }

                  var4 = var3.substring(
                     Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI=").length(),
                     var3.length() - Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jDimezJT78pc1AiEy6oafA4m1Hnd7AalI2mHk3+ZvTWtkV8xgcY=").length()
                  );
               }

               if (var4.isBlank()) {
                  return null;
               } else {
                  try {
                     return EditorTool.valueOf(
                        var4.replace((char)Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989196, 30), (char)Xqedii_e49t38l.Xqedii_qsys6atqw7a2(1539195763, 12))
                           .toUpperCase(Locale.ROOT)
                     );
                  } catch (IllegalArgumentException var6) {
                     return null;
                  }
               }
            }
         }
      } else {
         return null;
      }
   }

   public String editorToolBaseId(EditorTool var1) {
      if (((232892019 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2ycbrcms82djp(var1.name().toLowerCase(Locale.ROOT));
      }
   }

   public String editorToolBackgroundId(EditorTool var1) {
      if (((-274912031 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_9ncycv7txolr(this.editorToolBaseId(var1));
      }
   }

   public String editorToolIconId(EditorTool var1) {
      if (((1336390255 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2drvfgbneb2k8(this.editorToolBaseId(var1));
      }
   }

   public String editorToolHitboxId(EditorTool var1) {
      if ((1302547513 * 1302547513 + 1302547513 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_waja46jimksr(this.editorToolBaseId(var1));
      }
   }

   public boolean Xqedii_9tanuia(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (((-663648795 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 >= var5 && var1 <= var5 + var9 && var3 >= var7 && var3 <= var7 + var11
            ? Xqedii_e49t38l.Xqedii_1xuzwcon1arzc(-1304989185, 24)
            : Xqedii_e49t38l.Xqedii_2xc2cw2gjd0w1(-120271959, 17)) != 0);
      }
   }


   private static /* synthetic */ String Xqedii_3ggx0mv8a644f(String string) {
        return Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("3eEHIhGR4nLOp2q74fFPpzNvR7PcmxOun87MGwJda/LRiX4YqwAuxU3Jd1LTa3xfAGVipkss") + string;
    }

    private static /* synthetic */ String Xqedii_ecu20t4z7yjq(String string) {
        return Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("3eEHIhGR4nLOp2q74fFPpzNvR7PcmxOun87MGwJda/LRiX4YqwAuxU3Jd1LTa3xfAGVipkss") + string;
    }

    private static /* synthetic */ String Xqedii_228hd00fy3e21(String string) {
        return Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("3eEHIhGR4nLOp2q74fFPpzNvR7PcmxOun87MGwJda/LRiX4YqwAuxU3Jd1LTa3xfAGVipkss") + string;
    }

    private static /* synthetic */ String Xqedii_3aqtji1mt3nn3(String string) {
        return Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("3eEHIhGR4nLOp2q74fFPpzNvR7PcmxOun87MGwJda/LRiX4YqwAuxU3Jd1LTa3xfAGVipkss") + string;
    }

    private static /* synthetic */ String Xqedii_2ycbrcms82djp(String string) {
        return Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("dqCsFSusrHxT4MvKfVQxTHJebbF/QzvYwiVouPMp8NCtiAE1RzI=") + string;
    }

    private static /* synthetic */ String Xqedii_9ncycv7txolr(String string) {
        return string + Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("+C0tMGxAKlmQNTs7wI3RPLXQKOiHZ3F8GKuJ4xZAlS7D3w==");
    }

    private static /* synthetic */ String Xqedii_2drvfgbneb2k8(String string) {
        return string + Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("jDimezJT78pc1AiEy6oafA4m1Hnd7AalI2mHk3+ZvTWtkV8xgcY=");
    }

    private static /* synthetic */ String Xqedii_waja46jimksr(String string) {
        return string + Xqedii_e49t38l.Xqedii_27uz0iajqdwxy("v/ZjLUdoDg1aj21CzoROLIi3BTvC3kK2dm2ViRwqA4fhbKsWhgY4odQo");
    }

   public static final class EditorToolShellDefinition {
      public static final String Xqedii_u32eky2lbxvn = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final EditorTool Xqedii_15sf8cr;
      public ConfigurationSection Xqedii_3sc4hgn;
      public ConfigurationSection Xqedii_2l3vgdm;
      public ConfigurationSection Xqedii_sn06uof;

      public EditorToolShellDefinition(EditorTool var1) {
         this.Xqedii_15sf8cr = var1;
      }
   }
}
