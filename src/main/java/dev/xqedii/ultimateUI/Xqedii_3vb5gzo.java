package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.bedrock.BedrockUiService;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.bukkit.entity.Player;

public final class Xqedii_3vb5gzo implements Xqedii_1aatyko {
   public static final String Xqedii_23q6m6qbc395p = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final BedrockUiService Xqedii_107tkg3;

   public Xqedii_3vb5gzo(BedrockUiService var1) {
      this.Xqedii_107tkg3 = var1;
   }

   @Override
   public void Xqedii_m5xpibc(Player var1, String var2) {
      if ((748132761 * 748132761 + 748132761 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_107tkg3.openPage(var1, var2);
      }
   }

   @Override
   public void close(Player var1) {
      if (((622520152 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_107tkg3.closeScreen(var1);
      }
   }

   @Override
   public void input(Player var1, Map<String, Object> var2, Consumer<Boolean> var3) {
      if ((-1574337327 * -1574337327 - -1574337327 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_23ssj1h var4 = this.Xqedii_107tkg3.Xqedii_1ebrd9y.get(var1.getUniqueId());
         this.Xqedii_107tkg3
            .Xqedii_mqop2nv(
               var1, var4 == null ? Xqedii_33qqtix.Xqedii_325d6ce9o6kwu("aT8YTzZI2KQ7ZkY77bZQDaq1VzLpVtLbhhUQ9Q==") : var4.Xqedii_3fdq4vw, var2, null, var3
            );
      }
   }

   @Override
   public void Xqedii_1ob6onh(Player var1, List<String> var2, boolean var3) {
      if ((-46838341 * -46838341 + -46838341 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (String var5 : var2) {
            this.Xqedii_107tkg3.Xqedii_3k25vjd(var1, var5, var3);
         }
      }
   }

   @Override
   public void toggle(Player var1, List<String> var2, List<String> var3) {
      if ((-690693625 ^ -690693625) != 0) {
         throw new IllegalStateException();
      } else {
         for (String var5 : var2) {
            this.Xqedii_107tkg3.Xqedii_3k25vjd(var1, var5, (Xqedii_33qqtix.Xqedii_2oovq7xdl54gm(-564766807, 1) != 0));
         }

         for (String var7 : var3) {
            this.Xqedii_107tkg3.Xqedii_3k25vjd(var1, var7, (Xqedii_33qqtix.Xqedii_1e3cohup14f5w(801815839, 9) != 0));
         }
      }
   }

   @Override
   public Map<String, Object> Xqedii_69nk63w(Player var1, String var2) {
      if (((-1381982993 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_23ssj1h var3 = this.Xqedii_107tkg3.Xqedii_1ebrd9y.get(var1.getUniqueId());
         Xqedii_2kb1ns6 var4 = var3 == null ? null : this.Xqedii_107tkg3.Xqedii_2vtp3jf.get(var3.Xqedii_3fdq4vw);
         return var4 != null && var2 != null ? var4.Xqedii_p5zrifg.get(var2.trim()) : null;
      }
   }
}
