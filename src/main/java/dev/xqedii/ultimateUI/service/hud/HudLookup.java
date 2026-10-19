package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_2w8ozi0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

public abstract class HudLookup extends HudPassengerGuard {
   public static final String Xqedii_156akuo3ui16l = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudLookup(UltimateUI var1) {
      super(var1);
   }

   public Entity getHud(Player var1, String var2) {
      if ((1852769543 * 1852769543 + 1852769543 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!var1.hasMetadata(Xqedii_3tk13dgty6pps(var2))) {
         Xqedii_2t8d8j4 var4 = this.Xqedii_18xpusv(var1, var2);
         if (var4 != null && var4.Xqedii_216y0r3 != null && var4.Xqedii_216y0r3.isValid() && !var4.Xqedii_216y0r3.isDead()) {
            var1.setMetadata(Xqedii_73wz8sa4e79k(var2), new FixedMetadataValue(this.Xqedii_rrdyomu, var4.Xqedii_216y0r3));
            return var4.Xqedii_216y0r3;
         } else {
            return null;
         }
      } else {
         Entity var3 = (Entity)((MetadataValue)var1.getMetadata(Xqedii_3lrrbjd96ixgj(var2)).get(Xqedii_2w8ozi0.Xqedii_1ykcvb11up3td(-1868627103, 9))).value();
         if (var3 != null && var3.isValid() && !var3.isDead()) {
            return var3;
         } else {
            this.Xqedii_32sczwk(var1, var2, (Xqedii_2w8ozi0.Xqedii_8luskr55goo(-546757674, 0) != 0));
            var1.removeMetadata(Xqedii_1c7f5stwg0g75(var2), this.Xqedii_rrdyomu);
            return null;
         }
      }
   }

   public List<Entity> getAllHuds(Player var1) {
      if ((-969263014 ^ -969263014) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return new ArrayList<>();
      } else {
         LinkedHashSet var2 = new LinkedHashSet();

         for (Entity var4 : var1.getPassengers()) {
            if (var4 != null
               && var4.hasMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("W01De/oF0fINCGVZaixKvFQvtRfVSPrRBPqz4FnxEeNm4Q=="))
               && this.Xqedii_3tsw4zd(var4, var1)) {
               var2.add(var4);
            }
         }

         var2.addAll(this.Xqedii_xzc93q5(var1.getUniqueId()));

         for (Entity var6 : var1.getWorld().getEntities()) {
            if (var6 != null
               && var6.hasMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("W01De/oF0fINCGVZaixKvFQvtRfVSPrRBPqz4FnxEeNm4Q=="))
               && !var2.contains(var6)
               && this.Xqedii_3tsw4zd(var6, var1)) {
               var2.add(var6);
            }
         }

         return new ArrayList<>(var2);
      }
   }

   public boolean Xqedii_3tsw4zd(Entity var1, Player var2) {
      if ((2125127411 ^ 2125127411) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var1.hasMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("W01De/oF0fINCGVZaixKvFQvtRfVSPrRBPqz4FnxEeNm4Q=="))) {
         Player var3 = this.Xqedii_20ozntw(var1);
         if (var3 != null) {
            return var3.getUniqueId().equals(var2.getUniqueId());
         } else {
            String var4 = this.Xqedii_1qvlp81(var1);
            if (!var4.isBlank() && var2.hasMetadata(Xqedii_2lw8372ascwwh(var4))) {
               Entity var5 = this.Xqedii_2tqf4xh(var2, var4);
               return ((var5 != null && !var5.equals(var1)
                  ? Xqedii_2w8ozi0.Xqedii_2cbpg9psv7voj(1612229457, 7)
                  : Xqedii_2w8ozi0.Xqedii_1ykcvb11up3td(-1331756191, 29)) != 0);
            } else {
               return (Xqedii_2w8ozi0.Xqedii_8luskr55goo(-546757674, 6) != 0);
            }
         }
      } else {
         return (Xqedii_2w8ozi0.Xqedii_2cbpg9psv7voj(-1070508382, 8) != 0);
      }
   }

   public Entity Xqedii_2tqf4xh(Player var1, String var2) {
      if ((495105165 * 495105165 + 495105165 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank() && var1.hasMetadata(Xqedii_3ublchxojiyf3(var2))) {
         List var3 = var1.getMetadata(Xqedii_vj2ygn2conzf(var2));
         if (var3 != null && !var3.isEmpty() && var3.get(Xqedii_2w8ozi0.Xqedii_1ykcvb11up3td(-1868627103, 17)) != null) {
            return ((MetadataValue)var3.get(Xqedii_2w8ozi0.Xqedii_2cbpg9psv7voj(738399594, 4))).value() instanceof Entity var5 ? var5 : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public String Xqedii_1qvlp81(Entity var1) {
      if (((-996839417 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.hasMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("QF0NV9QloxAVzlOYLAm8KSyHAi55hUseaOmgYiZSh7M="))) {
         List var2 = var1.getMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("QF0NV9QloxAVzlOYLAm8KSyHAi55hUseaOmgYiZSh7M="));
         if (var2 != null && !var2.isEmpty() && var2.get(Xqedii_2w8ozi0.Xqedii_1ykcvb11up3td(-1868627103, 24)) != null) {
            String var3 = ((MetadataValue)var2.get(Xqedii_2w8ozi0.Xqedii_2cbpg9psv7voj(369199797, 3))).asString();
            return var3 == null ? Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("H/3Vsu52sCJTD6/tBhWbLUh/tLKLuh4R8V7dJg==") : var3.trim();
         } else {
            return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("H/3Vsu52sCJTD6/tBhWbLUh/tLKLuh4R8V7dJg==");
         }
      } else {
         return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("H/3Vsu52sCJTD6/tBhWbLUh/tLKLuh4R8V7dJg==");
      }
   }

   public Player Xqedii_20ozntw(Entity var1) {
      if ((427510098 ^ 427510098) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (var1.getVehicle() instanceof Player var8) {
         return var8;
      } else {
         if (var1.hasMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("zqypo780ozsnSY0TeO05amsgOawR1rtPNzFrCQ2+WyrSkZkwZGCFCEJmyV5KiA=="))) {
            List var2 = var1.getMetadata(Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("zqypo780ozsnSY0TeO05amsgOawR1rtPNzFrCQ2+WyrSkZkwZGCFCEJmyV5KiA=="));
            if (var2 != null && !var2.isEmpty() && var2.get(Xqedii_2w8ozi0.Xqedii_1ykcvb11up3td(-1868627103, 7)) != null) {
               String var9 = ((MetadataValue)var2.get(Xqedii_2w8ozi0.Xqedii_2cbpg9psv7voj(1365252267, 31))).asString();
               if (var9 != null && !var9.isBlank()) {
                  try {
                     Player var4 = Bukkit.getPlayer(UUID.fromString(var9));
                     if (var4 != null) {
                        return var4;
                     }
                  } catch (IllegalArgumentException var6) {
                  }
               }
            }
         }

         String var7 = this.Xqedii_1qvlp81(var1);
         if (var7.isBlank()) {
            return null;
         } else {
            for (Player var11 : Bukkit.getOnlinePlayers()) {
               if (var11.hasMetadata(Xqedii_37ufk41dshs9n(var7))) {
                  Entity var5 = this.Xqedii_2tqf4xh(var11, var7);
                  if (var5 == null || var5.equals(var1)) {
                     return var11;
                  }
               }
            }

            return null;
         }
      }
   }

   private static /* synthetic */ String Xqedii_3tk13dgty6pps(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_73wz8sa4e79k(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_3lrrbjd96ixgj(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_1c7f5stwg0g75(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_2lw8372ascwwh(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_3ublchxojiyf3(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_vj2ygn2conzf(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }

    private static /* synthetic */ String Xqedii_37ufk41dshs9n(String string) {
        return Xqedii_2w8ozi0.Xqedii_3fpu0lvvy8in3("cskL7MjIqagl0kgk4iBV3GTCnCuVCSoB0UG1DEcK4UqXh58/") + string;
    }
}
