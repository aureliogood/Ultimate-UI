package dev.xqedii.ultimateUI;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.kyori.adventure.text.Component;
import org.bukkit.configuration.file.YamlConfiguration;

public abstract class LangMessages extends EditorAutosave {
   public static final String Xqedii_yekzbcqk1u2o = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public void saveDefaultLangFile() {
      if ((-565635185 * -565635185 + -565635185 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var1 = new File(this.getDataFolder(), Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("ecD9LN2C4tf9AHRgF8cF5hIQ29WzD6Liyd+6enAE+PK7mXMqhFmiy4yDAVY="));
         if (!var1.exists()) {
            this.saveResource(
               Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("ecD9LN2C4tf9AHRgF8cF5hIQ29WzD6Liyd+6enAE+PK7mXMqhFmiy4yDAVY="),
               (Xqedii_3tsww8g.Xqedii_2lvza0zqgbwq6(-92774842, 24) != 0)
            );
         }
      }
   }

   public void reloadLangConfigFile() {
      if (((-127470219 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.saveDefaultLangFile();
         File var1 = new File(this.getDataFolder(), Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("ecD9LN2C4tf9AHRgF8cF5hIQ29WzD6Liyd+6enAE+PK7mXMqhFmiy4yDAVY="));
         this.Xqedii_389zivo = YamlConfiguration.loadConfiguration(var1);
      }
   }

   public List<String> getLangStringList(String var1) {
      if ((419573546 ^ 419573546) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && this.Xqedii_389zivo != null) {
         List var2 = this.Xqedii_389zivo.getStringList(var1);
         if (var2 != null && !var2.isEmpty()) {
            return this.expandLangMessageLines(var2);
         } else {
            String var3 = this.Xqedii_389zivo.getString(var1, Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("fzstt0Y5e8FqQwLtaq2mqqY+E0u31kJq1SK9ig=="));
            return var3 != null && !var3.isBlank() ? this.expandLangMessageLines(Collections.singletonList(var3)) : Collections.emptyList();
         }
      } else {
         return Collections.emptyList();
      }
   }

   public List<String> expandLangMessageLines(List<String> var1) {
      if ((-933810651 * -933810651 + -933810651 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (String var4 : var1) {
            if (var4 != null) {
               String var5 = var4.replace(
                     Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("Y84CvvATsVFKCSAiBfzuLFnLwaWJgMi0m9+1RFH8IuY="),
                     Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("IcufDfK/GcXiNF9mlhpEnSNQlfu+rUBpc5unePqy")
                  )
                  .replace(
                     Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("GORrVab40+WGoRAhB0YL9SU4pAs6w9SKRg4cs7Gd"),
                     Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("IcufDfK/GcXiNF9mlhpEnSNQlfu+rUBpc5unePqy")
                  )
                  .replace(
                     Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("9A19EC1qBzKwbFK8+p9Z2rA6LiV7Cp2ratrh+ww7hac="),
                     Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("IcufDfK/GcXiNF9mlhpEnSNQlfu+rUBpc5unePqy")
                  );
               String[] var6 = var5.split(
                  Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("IcufDfK/GcXiNF9mlhpEnSNQlfu+rUBpc5unePqy"), Xqedii_3tsww8g.Xqedii_1li5zldk5jwsp(1002941969, 13)
               );
               Collections.addAll(var2, var6);
            }
         }

         return var2;
      } else {
         return Collections.emptyList();
      }
   }

   public Component getLangMessage(String var1, String var2) {
      if ((-1949589428 ^ -1949589428) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var2;
         if (this.Xqedii_389zivo != null && var1 != null && !var1.isBlank()) {
            var3 = this.Xqedii_389zivo.getString(var1, var2);
         }

         return this.deserializeConfiguredMessage(var3);
      }
   }

   public Component getLangMessageWithPlaceholders(String var1, String var2, Map<String, String> var3) {
      if (((681996692 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var4 = var2;
         if (this.Xqedii_389zivo != null && var1 != null && !var1.isBlank()) {
            var4 = this.Xqedii_389zivo.getString(var1, var2);
         }

         if (var4 != null && !var4.isBlank() && var3 != null && !var3.isEmpty()) {
            String var5 = var4;

            for (Entry var7 : var3.entrySet()) {
               if (var7 != null) {
                  String var8 = (String)var7.getKey();
                  if (var8 != null && !var8.isBlank()) {
                     String var9 = var7.getValue() == null
                        ? Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("fzstt0Y5e8FqQwLtaq2mqqY+E0u31kJq1SK9ig==")
                        : (String)var7.getValue();
                     var5 = var5.replace(Xqedii_2pmhip7oljcds(var8), var9);
                  }
               }
            }

            var4 = var5;
         }

         return this.deserializeConfiguredMessage(var4);
      }
   }

   public Component deserializeConfiguredMessage(String var1) {
      if ((-1091330502 * -1091330502 + -1091330502 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var1 == null ? Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("fzstt0Y5e8FqQwLtaq2mqqY+E0u31kJq1SK9ig==") : var1;
         if (var2.contains(Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("lJZuvFGEI25AasNBTrBwS/FJPPM7neVvU9rid+4i"))
            && var2.contains(Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("6slWbLtLSWSuW6c3UqStu0dXy3y5iFu4FyeLIyrZ"))) {
            try {
               return Xqedii_1df0pdx.deserialize(Xqedii_3ul4hqj.Xqedii_2emodor(var2));
            } catch (Throwable var4) {
            }
         }

         return Xqedii_1gc2hbe.deserialize(var2);
      }
   }

   private static /* synthetic */ String Xqedii_2pmhip7oljcds(String string) {
        return Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("RVgcRD7rFFHsR+PVXe7QRp7yXlobFIhaKbG2AEs2") + string + Xqedii_3tsww8g.Xqedii_2kd4fkcq3e1k5("n0cU9Dn7i57wgafrsp8C4hKUwOKsL+1tnEt4t2bg");
    }
}
