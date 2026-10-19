package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3qzvdsv;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public abstract class CameraEquipmentMask extends AnvilScreenMask {
   public static final String Xqedii_278ufibnc9m0b = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final EquipmentSlot[] Xqedii_3enko7o;
   public static final long Xqedii_1i7v3yr = 10L;
   public final Set<UUID> Xqedii_25is3v9 = ConcurrentHashMap.newKeySet();

   public CameraEquipmentMask(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public void Xqedii_3q5471n(Player var1) {
      if ((280991960 * (280991960 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         UUID var2 = var1.getUniqueId();
         int var3 = !this.Xqedii_25is3v9.add(var2) ? Xqedii_3qzvdsv.Xqedii_1lq1b9jc713yz(-96764957, 15) : Xqedii_3qzvdsv.Xqedii_1mjofi4gktnga(398961082, 26);
         this.Xqedii_3k4t68r(var1, this.Xqedii_38rcyn7());
         if (var3 == 0) {
            Xqedii_38o2zes.Xqedii_j3mggbv(
               this.Xqedii_11is6fi,
               var1,
               Xqedii_3qzvdsv.Xqedii_1wjyfi3hgc9y0(-2374124801019673993L, 7),
               Xqedii_3qzvdsv.Xqedii_3k8le7wd66bqo(8735173198198604343L, 29),
               var3x -> {
                  if ((1741311131 * (1741311131 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else if (var1.isOnline() && this.Xqedii_25is3v9.contains(var2)) {
                     this.Xqedii_3k4t68r(var1, this.Xqedii_38rcyn7());
                  } else {
                     var3x.cancel();
                  }
               }
            );
         }
      }
   }

   public void Xqedii_331pq31(Player var1) {
      if (((-67652814 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_25is3v9.remove(var1.getUniqueId()) && var1.isOnline()) {
         EntityEquipment var2 = var1.getEquipment();
         if (var2 != null) {
            EnumMap var3 = new EnumMap(EquipmentSlot.class);
            EquipmentSlot[] var4 = Xqedii_3enko7o;
            int var5 = var4.length;

            for (int var6 = Xqedii_3qzvdsv.Xqedii_1hz8c92y4elu4(-168643523, 3); var6 < var5; var6++) {
               EquipmentSlot var7 = var4[var6];
               ItemStack var8 = var2.getItem(var7);
               var3.put(var7, var8 == null ? new ItemStack(Material.AIR) : var8.clone());
            }

            this.Xqedii_3k4t68r(var1, var3);
         }
      }
   }

   public Map<EquipmentSlot, ItemStack> Xqedii_38rcyn7() {
      if ((1115133055 * 1115133055 + 1115133055 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         EnumMap var1 = new EnumMap(EquipmentSlot.class);
         EquipmentSlot[] var2 = Xqedii_3enko7o;
         int var3 = var2.length;

         for (int var4 = Xqedii_3qzvdsv.Xqedii_1hz8c92y4elu4(-168643523, 6); var4 < var3; var4++) {
            EquipmentSlot var5 = var2[var4];
            var1.put(var5, new ItemStack(Material.AIR));
         }

         return var1;
      }
   }

   public void Xqedii_3k4t68r(Player var1, Map<EquipmentSlot, ItemStack> var2) {
      if (((1964802954 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1.getWorld() != null) {
         double var3 = Math.max(
            Double.longBitsToDouble(Xqedii_3qzvdsv.Xqedii_3k8le7wd66bqo(-8735173201957745720L, 21)),
            Bukkit.getViewDistance() * Double.longBitsToDouble(Xqedii_3qzvdsv.Xqedii_2flx38a7i69l2(-4030836183648614364L, 22))
         );
         double var5 = var3 * var3;

         for (Player var8 : var1.getWorld().getPlayers()) {
            if (var8 != null && !var8.equals(var1) && var8.isOnline() && var8.canSee(var1) && !(var8.getLocation().distanceSquared(var1.getLocation()) > var5)) {
               try {
                  var8.sendEquipmentChange(var1, var2);
               } catch (RuntimeException var10) {
               }
            }
         }
      }
   }

   static {
      if (((-2102749606 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         EquipmentSlot[] var10000 = new EquipmentSlot[Xqedii_3qzvdsv.Xqedii_1hz8c92y4elu4(905098301, 29)];
         var10000[Xqedii_3qzvdsv.Xqedii_1mjofi4gktnga(1123611959, 23)] = EquipmentSlot.HEAD;
         var10000[Xqedii_3qzvdsv.Xqedii_1mjofi4gktnga(233034973, 25)] = EquipmentSlot.CHEST;
         var10000[Xqedii_3qzvdsv.Xqedii_1udvye2ug9wi7(72531844, 9)] = EquipmentSlot.LEGS;
         var10000[Xqedii_3qzvdsv.Xqedii_1udvye2ug9wi7(72547716, 13)] = EquipmentSlot.FEET;
         var10000[Xqedii_3qzvdsv.Xqedii_1lq1b9jc713yz(-940280841, 8)] = EquipmentSlot.HAND;
         var10000[Xqedii_3qzvdsv.Xqedii_1udvye2ug9wi7(-2074952316, 29)] = EquipmentSlot.OFF_HAND;
         Xqedii_3enko7o = var10000;
      }
   }
}
