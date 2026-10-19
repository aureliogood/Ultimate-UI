package dev.xqedii.ultimateUI;

import java.lang.runtime.ObjectMethods;
import java.util.EnumSet;
import java.util.UUID;
import net.kyori.adventure.bossbar.BossBar.Color;
import net.kyori.adventure.bossbar.BossBar.Flag;
import net.kyori.adventure.bossbar.BossBar.Overlay;
import net.kyori.adventure.text.Component;

public record Xqedii_34z2igs(UUID barId, Xqedii_fwiw7cd action, Component title, float health, Color color, Overlay overlay, EnumSet<Flag> flags) {
   public static final String Xqedii_1k74bmn34zumm = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   @Override

   public Xqedii_fwiw7cd action() {
      if ((-820649825 * -820649825 + -820649825 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.action;
      }
   }

   public Component title() {
      if ((-771630115 * -771630115 - -771630115 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.title;
      }
   }

   public float health() {
      if ((-1119846357 * (-1119846357 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.health;
      }
   }

   public Color color() {
      if (((1097358882 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.color;
      }
   }

   public Overlay overlay() {
      if ((1083258184 ^ 1083258184) != 0) {
         throw new IllegalStateException();
      } else {
         return this.overlay;
      }
   }

   public EnumSet<Flag> flags() {
      if ((1924252316 * 1924252316 - 1924252316 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.flags;
      }
   }
}
