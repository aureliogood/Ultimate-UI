package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_n2yidbu;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public abstract class CameraCleanup extends CameraEquipmentMask {
   public static final String Xqedii_zd746yrcmrac = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public CameraCleanup(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public int Xqedii_2jfx1cj() {
      if ((-81102096 * -81102096 + -81102096 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_139042g();
      }
   }

   public void Xqedii_30tju32(Player var1) {
      if (((-9201035 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Entity var2 = this.Xqedii_1ilze2o.getHud(var1, Xqedii_n2yidbu.Xqedii_2upwzf3qrxfu9("sowAdMLH47y9ALvHPhk0QJcgn8ZuNICP7MzncMpRYAENHO3iZZr8YQ=="));
         if (var2 != null) {
            int var3 = Math.max(
               Xqedii_n2yidbu.Xqedii_3n2mrgnj30ywl(554531742, 29),
               Math.min(Xqedii_n2yidbu.Xqedii_3fdwuay78nekn(558012672, 11), this.Xqedii_1ilze2o.getHudOpacity(var2))
            );
            int var4 = var3 >= Xqedii_n2yidbu.Xqedii_2v4ns5806glbd(-1107375081, 19)
               ? Xqedii_n2yidbu.Xqedii_pj7z7gbht5gq(-1453595318, 2)
               : Math.min(Xqedii_n2yidbu.Xqedii_3fdwuay78nekn(558195199, 0), var3 + Xqedii_n2yidbu.Xqedii_2v4ns5806glbd(-1173435369, 27));
            if (var4 != var3) {
               this.Xqedii_1ilze2o.setOpacity(var2, var4);
               Xqedii_38o2zes.Xqedii_2sj63w1(
                  this.Xqedii_11is6fi,
                  var1,
                  () -> {
                     if (((-638355286 << 1 | 1) & 1) == 0) {
                        throw new IllegalStateException();
                     } else if (var1.isOnline()
                        && this.Xqedii_1npzu61.getOrDefault(var1.getUniqueId(), Boolean.valueOf((Xqedii_n2yidbu.Xqedii_3n2mrgnj30ywl(1942233519, 18) != 0)))) {
                        Entity var3x = this.Xqedii_1ilze2o
                           .getHud(var1, Xqedii_n2yidbu.Xqedii_2upwzf3qrxfu9("sowAdMLH47y9ALvHPhk0QJcgn8ZuNICP7MzncMpRYAENHO3iZZr8YQ=="));
                        if (var3x != null) {
                           this.Xqedii_1ilze2o.setOpacity(var3x, var3);
                        }
                     }
                  },
                  Xqedii_n2yidbu.Xqedii_zq5pxwtw8g27(-1051299381032876366L, 30)
               );
            }
         }
      }
   }

   public void Xqedii_3hes1gs(Player var1, Entity var2) {
      if ((1840159884 * 1840159884 + 1840159884 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.Xqedii_2wh7n06.computeIfAbsent(var1.getUniqueId(), var0 -> {
            if (((1562676598 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return new HashSet<>();
            }
         }).add(var2.getUniqueId());
      }
   }

   public void Xqedii_1aelgcz(Player var1) {
      if (((1402289297 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         Set var2 = this.Xqedii_2wh7n06.remove(var1.getUniqueId());
         if (var2 != null && !var2.isEmpty()) {
            for (UUID var4 : (Iterable<UUID>) (var2)) {

               Entity var5 = Bukkit.getEntity(var4);
               if (var5 != null && var5.isValid() && !var5.isDead()) {
                  var5.remove();
               }
            }
         }
      }
   }

   public void Xqedii_2xomr7i(Player var1, boolean var2) {
      if ((1576820180 * 1576820180 + 1576820180 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var3 = var1.getUniqueId();
         this.Xqedii_3lrjl61.merge(var3, Xqedii_n2yidbu.Xqedii_pj7z7gbht5gq(-690672772, 23), Integer::sum);
         this.Xqedii_1npzu61.put(var3, Boolean.valueOf((Xqedii_n2yidbu.Xqedii_pj7z7gbht5gq(1699919821, 27) != 0)));
         this.Xqedii_3gg2h5x(var1);
         if (this.Xqedii_2seki4b != null) {
            this.Xqedii_2seki4b.despawn(var1);
         }

         Entity var4 = var1.getVehicle();
         int var5 = var4 != null
               && var4.hasMetadata(
                  Xqedii_n2yidbu.Xqedii_2upwzf3qrxfu9("gWRO2xOuhnaQhyQTNY9sKUn1PaBjGCayzcq1BdDMMAitzeiTNFODKu3mf06JWlmn89ra1Y1kpf2XLS+/wnYczjwOOi754Q==")
               )
            ? Xqedii_n2yidbu.Xqedii_3fdwuay78nekn(558194960, 4)
            : Xqedii_n2yidbu.Xqedii_pj7z7gbht5gq(-1437140564, 0);
         if (var1.isInsideVehicle()) {
            var1.leaveVehicle();
         }

         if (var5 != 0) {
            this.Xqedii_6e16db9.put(var3, var1.getLocation().clone());
         }

         this.Xqedii_1aelgcz(var1);
         this.Xqedii_1ilze2o.setHudMountEntity(var1, null);
         this.Xqedii_1ilze2o.setHudAnchorOrigin(var1, null);
         Entity var6 = this.Xqedii_1ilze2o.getHud(var1, Xqedii_n2yidbu.Xqedii_2upwzf3qrxfu9("sowAdMLH47y9ALvHPhk0QJcgn8ZuNICP7MzncMpRYAENHO3iZZr8YQ=="));
         if (var6 != null) {
            this.Xqedii_1ilze2o.removeHudX(Collections.singletonList(var6), (Xqedii_n2yidbu.Xqedii_3n2mrgnj30ywl(-147045862, 14) != 0));
         }

         this.Xqedii_28k36d4.remove(var3);
         this.Xqedii_2ebsa64.remove(var3);
         this.Xqedii_sa0ugb8.remove(var3);
         Location var7 = this.Xqedii_20i24gg.remove(var3);
         if (var7 != null && var7.getWorld() != null) {
            this.Xqedii_n3z23ui.put(var3, var7.clone());
         }

         if (var5 != 0 && var1.isOnline()) {
            this.Xqedii_25mgpba(var1, var7);
         }

         if (var1.isOnline()) {
            this.Xqedii_2dp5ib3(var1);
            this.Xqedii_3mkxzpu(var1);
            var1.removePotionEffect(PotionEffectType.INVISIBILITY);
            this.Xqedii_331pq31(var1);
            if (var2) {
               this.spectate(var1, null);
            }
         } else {
            this.Xqedii_2dp5ib3(var1);
            this.Xqedii_25is3v9.remove(var3);
            this.Xqedii_338djp8.remove(var3);
            this.Xqedii_1zrugzw.remove(var3);
         }
      }
   }

   public void Xqedii_25mgpba(Player var1, Location var2) {
      if ((-1599796075 ^ -1599796075) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var2.getWorld() != null && var2.getWorld().equals(var1.getWorld())) {
         if (!(var2.distanceSquared(var1.getLocation()) <= Double.longBitsToDouble(Xqedii_n2yidbu.Xqedii_2oms7s6zjkyyr(4398318589471303176L, 30)))) {
            if (this.Xqedii_11is6fi.isEnabled()) {
               this.Xqedii_11is6fi.suppressEditorTeleportClose(var1, Xqedii_n2yidbu.Xqedii_zq5pxwtw8g27(-1051299380948990286L, 24));
            }

            Xqedii_38o2zes.Xqedii_fxq2htx(var1, var2.clone());
         }
      }
   }
}
