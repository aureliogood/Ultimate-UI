package dev.xqedii.ultimateUI.service.gui;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.hud.HudService;
import org.bukkit.entity.Player;

public class GuiService extends WorldUiPart {
   public static final String Xqedii_37wb1oe0yaeqw = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public GuiService(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public void reapplyClientHotbarAir(Player var1) {
      if ((-1521749625 * (-1521749625 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.applyEditorDisplayPreferences(var1);
      }
   }

   public void setPlayerHeldToolAir(Player var1) {
      if (((-1724569433 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.applyEditorHeldToolMask(var1);
      }
   }

   public static enum ClickType {
      LEFT,
      RIGHT;
      public static final String Xqedii_16nkbhna2319d = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   }
}
