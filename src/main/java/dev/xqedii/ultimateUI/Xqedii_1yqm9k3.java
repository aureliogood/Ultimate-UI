package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.api.UiElementCreate;
import dev.xqedii.ultimateUI.api.UiElementWrite;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class Xqedii_1yqm9k3 {
   public static final String Xqedii_2v3frex5ll1y8 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final Xqedii_2b3rrt2 Xqedii_2fi2lg1;
   public final Xqedii_1kffk3z Xqedii_2q97y6i;
   public final Player Xqedii_1v4ue4a;
   public final CommandSender Xqedii_3cp8md6;
   public final Xqedii_36oytze Xqedii_34yybpr;
   public final List<Object> Xqedii_1v9t8lx;
   public Map<String, Object> Xqedii_107f1nz = new HashMap<>();
   public boolean Xqedii_3dy3w3c;
   public final List<UiElementWrite> Xqedii_3rytfhb = new ArrayList<>();
   public final List<String> Xqedii_i9uy1th = new ArrayList<>();
   public final List<UiElementCreate> Xqedii_2jsr2jw = new ArrayList<>();

   public Xqedii_1yqm9k3(Xqedii_2b3rrt2 var1, Xqedii_1kffk3z var2, Player var3, CommandSender var4, Xqedii_36oytze var5, List<Object> var6) {
      this.Xqedii_2fi2lg1 = var1;
      this.Xqedii_2q97y6i = var2;
      this.Xqedii_1v4ue4a = var3;
      this.Xqedii_3cp8md6 = (CommandSender)(var4 != null ? var4 : var3);
      this.Xqedii_34yybpr = var5;
      this.Xqedii_1v9t8lx = var6;
   }

   public Player Xqedii_25ge4f1(int var1) {
      if ((566736983 * 566736983 + 566736983 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_1v4ue4a != null && this.Xqedii_1v4ue4a.isOnline()) {
         return this.Xqedii_1v4ue4a;
      } else {
         throw new Xqedii_3vsk7zm(
            Xqedii_knqxbmv.Xqedii_7v0p63le84h8(
               "foIYwWN8tzICry4lOdctLQ4mcWMapux4r6JC9PkrKWH1T2c44lSPblUH7BX3py9sydYl/xIeNFXWysBAdyWj+3s0VNLbf4PfiwlQgv41Kd+80iGz3d4GsxUxUv/EhZ/hHKKuRRG7fPFaV/nj6UV1NpFuiZ3U/XVVW11PnrKyK4RFpdziSJ3/bVT4Yis1cwgw/uuQkGUSo490lnEl/lrY7zQ6DjnOT0/d8kDCIbjIsSJCShcEZXdd3y9yU7ghUg2FQzG9FhfLL4rRe2MzYrPJaeOcSyI="
            ),
            var1
         );
      }
   }

   public void Xqedii_x5301uw(UiElementWrite var1) {
      if ((-1323245341 ^ -1323245341) != 0) {
         throw new IllegalStateException();
      } else {
         if (!this.Xqedii_3rytfhb.isEmpty()) {
            UiElementWrite var2 = this.Xqedii_3rytfhb.get(this.Xqedii_3rytfhb.size() - Xqedii_knqxbmv.Xqedii_uw7c9j0tr8bh(1710930696, 4));
            if (var2.elementId().equals(var1.elementId()) && var2.property().equals(var1.property())) {
               this.Xqedii_3rytfhb.set(this.Xqedii_3rytfhb.size() - Xqedii_knqxbmv.Xqedii_323c4ujoxn11t(1778721944, 19), var1);
               return;
            }
         }

         this.Xqedii_3rytfhb.add(var1);
      }
   }

   public void Xqedii_2504ge3(UiElementCreate var1) {
      if ((1799683484 * (1799683484 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2jsr2jw.add(var1);
      }
   }

   public void Xqedii_o19wdzr(String var1) {
      if ((-1735801706 * (-1735801706 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2jsr2jw.removeIf(var1x -> {
            if ((119538080 * 119538080 - 119538080 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return var1x.elementId().equals(var1);
            }
         });
         this.Xqedii_i9uy1th.add(var1);
      }
   }

   public void Xqedii_3u9m9cl() {
      if ((1634517732 * 1634517732 - 1634517732 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (!this.Xqedii_i9uy1th.isEmpty() || !this.Xqedii_2jsr2jw.isEmpty()) {
            ArrayList var1 = new ArrayList<>(this.Xqedii_i9uy1th);
            ArrayList var2 = new ArrayList<>(this.Xqedii_2jsr2jw);
            this.Xqedii_i9uy1th.clear();
            this.Xqedii_2jsr2jw.clear();
            if (this.Xqedii_1v4ue4a != null && this.Xqedii_1v4ue4a.isOnline() && UltimateUIAPI.isAvailable()) {
               UltimateUIAPI.get().applyElementStructure(this.Xqedii_1v4ue4a, var1, var2);
            }
         }

         if (!this.Xqedii_3rytfhb.isEmpty()) {
            ArrayList var3 = new ArrayList<>(this.Xqedii_3rytfhb);
            this.Xqedii_3rytfhb.clear();
            if (this.Xqedii_1v4ue4a != null && this.Xqedii_1v4ue4a.isOnline() && UltimateUIAPI.isAvailable()) {
               UltimateUIAPI.get().applyElementWrites(this.Xqedii_1v4ue4a, var3);
            }
         }
      }
   }

   public String Xqedii_1r9cm9n() {
      if (((-695567461 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_34yybpr != null && !this.Xqedii_34yybpr.Xqedii_3rt5h0f.isEmpty()) {
         return this.Xqedii_34yybpr.Xqedii_3rt5h0f;
      } else if (this.Xqedii_1v4ue4a != null && UltimateUIAPI.isAvailable()) {
         String var1 = UltimateUIAPI.get().getOpenGuiName(this.Xqedii_1v4ue4a);
         return var1 == null ? Xqedii_knqxbmv.Xqedii_7v0p63le84h8("rTbiuLJTaDd/dzDBom1MmPgwTKgYhzJChHR5xw==") : var1;
      } else {
         return Xqedii_knqxbmv.Xqedii_7v0p63le84h8("rTbiuLJTaDd/dzDBom1MmPgwTKgYhzJChHR5xw==");
      }
   }
}
