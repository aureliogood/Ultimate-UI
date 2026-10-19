package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3vytxmo;
import java.util.Collections;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import org.bukkit.entity.Display.Brightness;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public abstract class HudEntities extends HudScaleAnimation {
   public static final String Xqedii_3fe6mha55mtp4 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudEntities(UltimateUI var1) {
      super(var1);
   }

   public Entity addHud(Player var1, String var2, Vector var3, Vector var4, Object var5, TextAlignment var6, TextAlignment var7, boolean var8, int var9) {
      if ((642838703 ^ 642838703) != 0) {
         throw new IllegalStateException();
      } else {
         Entity var10 = this.getHud(var1, var2);
         if (var10 != null) {
            this.removeHudX(Collections.singletonList(var10), (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 30) != 0));
         }

         TextAlignment var11 = this.Xqedii_3r2d8xo(var6);
         TextAlignment var12 = this.Xqedii_3r2d8xo(var7);
         int var13 = this.Xqedii_189lv5i(var11);
         if (var5 instanceof String var24) {
            int var26 = this.Xqedii_3clos9k(var9);
            Vector var28 = this.Xqedii_3iy1c6h(var4);
            Entity var29 = this.Xqedii_3lomkmt(var1, var2, var3, var28, var13, var26, var12);
            Quaternionf var19 = this.Xqedii_4zg6flq(var1);
            Quaternionf var20 = var19.mul(Xqedii_3au2gcd, new Quaternionf());
            Quaternionf var21 = new Quaternionf(
               Float.intBitsToFloat(Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-1620201576, 1)),
               Float.intBitsToFloat(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 27)),
               Float.intBitsToFloat(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 1)),
               Float.intBitsToFloat(Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(1325548639, 24))
            );
            Xqedii_2t8d8j4 var22 = new Xqedii_2t8d8j4(
               this.Xqedii_1lphdnr(),
               UUID.randomUUID(),
               var29,
               var2,
               var3.clone(),
               var28.clone(),
               var24 == null ? Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("hQUcwZrY1F06RMMQJYtw6wwVsmwM4WOiCa+xwQ==") : var24,
               var12,
               var13,
               var26,
               Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-883427582, 21),
               var20,
               var21,
               var19,
               this.Xqedii_1h50evl(var1),
               Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 0)
            );
            var22.Xqedii_g4y6hze = this.Xqedii_13ynr1u(var1);
            this.Xqedii_1gcmu53(var1, var22);
            this.Xqedii_32cmird(var1, var22);
            this.Xqedii_2ebi45u(var1);
            if (var8) {
               Vector3f var23 = this.getScaleVector(var28);
               this.animScale(var29, var23.x, var23.y, var23.z, (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 10) != 0));
            }

            return var29;
         } else {
            ItemDisplay var16 = (ItemDisplay)var1.getWorld().spawn(this.Xqedii_1ew3c3r(var1), ItemDisplay.class);
            var16.setItemStack((ItemStack)var5);
            ItemDisplay var14 = var16;
            Entity var15 = this.Xqedii_2ey5s6p(var1);
            if (var15 != null) {
               var15.addPassenger(var16);
            } else {
               this.Xqedii_ba8rzww(var1, var16);
            }

            var16.setRotation(
               Float.intBitsToFloat(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 17)),
               Float.intBitsToFloat(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 2))
            );
            Transformation var25 = var16.getTransformation();
            var16.setTransformation(new Transformation(var25.getTranslation(), this.Xqedii_4zg6flq(var1), var25.getScale(), var25.getRightRotation()));
            var16.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("mhU+gchi4E+K7FDJ0fa0G2884Bzge+C6q3j4eoM95bU="), new FixedMetadataValue(this.Xqedii_rrdyomu, var2)
            );
            var16.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("NROwMdSwbxOHWV9ib0gCtm9ZhAfC06baolLiyDIZz4QS2g=="),
               new FixedMetadataValue(this.Xqedii_rrdyomu, Boolean.valueOf((Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097451, 1) != 0)))
            );
            var16.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("SEZxfS7A5m+7ztitm5ChZPElrEMgzbNrqMqtRaKhe/QAAf/0B91rBH7EHI1K+A=="),
               new FixedMetadataValue(this.Xqedii_rrdyomu, var1.getUniqueId().toString())
            );
            var16.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("gqPC1UXhZsK09Ykcxok4EPaEijZ+qOFO+LtrCJ8OFgGCmtJ6QiBfRT19CRU="),
               new FixedMetadataValue(this.Xqedii_rrdyomu, var3)
            );
            var16.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("R2VfXgvLKD6VLJj6v3rGsbuTuggBDRKd9UqZPrpNYQqtAAd7MZE="), new FixedMetadataValue(this.Xqedii_rrdyomu, var4)
            );
            var16.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"),
               new FixedMetadataValue(this.Xqedii_rrdyomu, this.Xqedii_3clos9k(var9))
            );
            var1.setMetadata(Xqedii_1r0fcqkzdk7f2(var2), new FixedMetadataValue(this.Xqedii_rrdyomu, var16));

            for (Player var18 : Bukkit.getOnlinePlayers()) {
               if (!var18.equals(var1)) {
                  var18.hideEntity(this.Xqedii_rrdyomu, var14);
               }
            }

            var14.setMetadata(
               Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("sLGge1yCYRCrBV5HiGlxBloZlm1tI9lr4ZAlhHkJxy9oStZ39dqg4UBi"),
               new FixedMetadataValue(this.Xqedii_rrdyomu, var13)
            );
            this.Xqedii_laiitq7(var14, this.Xqedii_13ynr1u(var1), (Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 4) != 0));
            this.Xqedii_1kixhzd(var14);
            Vector3f var27 = this.getScaleVector(var4);
            this.moveHud(
               var14,
               var3,
               Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-742918398, 3),
               Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-1204839273, 30),
               ((this.Xqedii_1h50evl(var1) == 0
                  ? Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(816912340, 30)
                  : Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 18)) != 0)
            );
            if (var8) {
               this.animScale(var14, var27.x, var27.y, var27.z, (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 0) != 0));
            } else {
               var14.setTransformation(
                  new Transformation(
                     var14.getTransformation().getTranslation(),
                     var14.getTransformation().getLeftRotation(),
                     this.Xqedii_1iem95w(var27, var1),
                     var14.getTransformation().getRightRotation()
                  )
               );
            }

            this.setOpacity(var14, var9);
            this.Xqedii_2ebi45u(var1);
            this.Xqedii_c9jj34a(var1, var14);
            return var14;
         }
      }
   }

   public int getRenderClip() {
      if ((-2060308979 ^ -2060308979) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1fkakfc.get()[Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 17)];
      }
   }

   public void setRenderClip(int var1) {
      if ((-1216668653 * -1216668653 + -1216668653 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1fkakfc.get()[Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 15)] = Math.max(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 19), var1);
      }
   }

   public int Xqedii_13ynr1u(Player var1) {
      if ((-146608114 * -146608114 + -146608114 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !this.isFixShadersEnabled(var1) ? this.getRenderClip() : Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 25);
      }
   }

   public boolean applyRenderClip(Entity var1) {
      if (((1413126445 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         if (var2 == null) {
            if (!(var1 instanceof ItemDisplay var6 && var6.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("NROwMdSwbxOHWV9ib0gCtm9ZhAfC06baolLiyDIZz4QS2g==")))
               )
             {
               return (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 29) != 0);
            } else if (!this.Xqedii_laiitq7(var6, this.Xqedii_13ynr1u(this.Xqedii_20ozntw(var6)), (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-742918398, 12) != 0))
               )
             {
               return (Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 9) != 0);
            } else {
               var6.setMetadata(
                  Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("EhfReldPemTDRvpV9r+cs8gIKOBaUDarOBDZnDlqHW+0CbgyEWQ3/JXjyfIvC4tO0RehKuE5b/68Tzkn"),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, Boolean.valueOf((Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131081065, 14) != 0)))
               );
               return (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-742918398, 21) != 0);
            }
         } else {
            Player var3 = this.Xqedii_3u2qg5l(var1);
            int var4 = this.Xqedii_13ynr1u(var3);
            if (var2.Xqedii_g4y6hze == var4) {
               return (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 21) != 0);
            } else {
               int var5 = HudPositionCalculator.clipBand(var2.Xqedii_g4y6hze) != HudPositionCalculator.clipBand(var4)
                  ? Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(1647290465, 7)
                  : Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(826202975, 26);
               var2.Xqedii_g4y6hze = var4;
               var2.Xqedii_bl9xu45 = (Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(1597325019, 18) != 0);
               if (var5 != 0) {
                  var2.Xqedii_k1vor1v = Xqedii_38o2zes.Xqedii_316oplq() + Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(799662434, 15);
               }

               return (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-742918398, 17) != 0);
            }
         }
      }
   }

   public void flushRenderClip(Entity var1) {
      if ((-1741486382 * -1741486382 + -1741486382 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         if (var2 == null) {
            if (var1 instanceof ItemDisplay var7
               && var7.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("EhfReldPemTDRvpV9r+cs8gIKOBaUDarOBDZnDlqHW+0CbgyEWQ3/JXjyfIvC4tO0RehKuE5b/68Tzkn"))
               && var7.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("gqPC1UXhZsK09Ykcxok4EPaEijZ+qOFO+LtrCJ8OFgGCmtJ6QiBfRT19CRU="))) {
               if (((MetadataValue)var7.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("gqPC1UXhZsK09Ykcxok4EPaEijZ+qOFO+LtrCJ8OFgGCmtJ6QiBfRT19CRU="))
                     .get(Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(371391102, 3)))
                  .value() instanceof Vector var5) {
                  int var6 = var7.getInterpolationDuration();
                  this.moveHud(
                     var7,
                     var5,
                     var6,
                     var6,
                     ((var6 <= 0 ? Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(1337382861, 0) : Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 6)) != 0)
                  );
               }

               var7.removeMetadata(
                  Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("EhfReldPemTDRvpV9r+cs8gIKOBaUDarOBDZnDlqHW+0CbgyEWQ3/JXjyfIvC4tO0RehKuE5b/68Tzkn"), this.Xqedii_rrdyomu
               );
            }
         } else if (var2.Xqedii_bl9xu45) {
            Player var3 = this.Xqedii_3u2qg5l(var1);
            if (var3 == null) {
               var2.Xqedii_bl9xu45 = (Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 13) != 0);
            } else {
               this.Xqedii_19o8tyr(var3, var2);
            }
         }
      }
   }

   public void setTextWrap(TextDisplay var1, boolean var2, int var3) {
      if (((-1941708054 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2) {
         var1.setLineWidth(Math.max(Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-742918398, 13), var3));
      } else {
         var1.setLineWidth(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131367273, 4));
      }
   }

   public boolean setTextWrap(Entity var1, int var2) {
      if ((-1139280786 ^ -1139280786) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 20) != 0);
      } else {
         int var3 = var2 > 0 ? var2 : Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(-883427582, 21);
         Xqedii_2t8d8j4 var4 = this.Xqedii_2jnbe8d(var1);
         if (var4 != null) {
            if (var4.Xqedii_1rxjdzu == var3) {
               return (Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-1620201576, 1) != 0);
            } else {
               var4.Xqedii_1rxjdzu = var3;
               Player var6 = this.Xqedii_3u2qg5l(var1);
               if (var6 != null) {
                  this.Xqedii_2d84u6r(var6, var4);
               }

               return (Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-265315177, 27) != 0);
            }
         } else if (var1 instanceof TextDisplay var5) {
            if (var5.getLineWidth() == var3) {
               return (Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 5) != 0);
            } else {
               var5.setLineWidth(var3);
               return (Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-1947592616, 13) != 0);
            }
         } else {
            return (Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(185695551, 2) != 0);
         }
      }
   }

   public void setOpacity(Entity var1, int var2) {
      if (((-269557439 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         int var3 = this.Xqedii_3clos9k(var2);
         Xqedii_2t8d8j4 var4 = this.Xqedii_2jnbe8d(var1);
         if (var4 != null) {
            if (this.Xqedii_3clos9k(var4.Xqedii_n6wcxc4) != var3) {
               var1.setMetadata(
                  Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var3)
               );
               var4.Xqedii_n6wcxc4 = var3;
               Player var8 = this.Xqedii_3u2qg5l(var1);
               if (var8 != null) {
                  this.Xqedii_3un4hkd(var8, var4);
               }
            }
         } else {
            int var5 = Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-153426327, 5);
            if (var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"))) {
               var5 = this.Xqedii_3clos9k(
                  ((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"))
                        .get(Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-1000386622, 8)))
                     .asInt()
               );
            } else if (var1 instanceof TextDisplay var6) {
               short var7 = var6.getTextOpacity();
               if (var7 < 0) {
                  var7 += 256;
               }

               var5 = this.Xqedii_3clos9k(var7);
            }

            if (var5 != var3) {
               var1.setMetadata(
                  Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var3)
               );
               if (var1 instanceof TextDisplay var9) {
                  var9.setTextOpacity((byte)var3);
               }
            }
         }
      }
   }

   public int getHudOpacity(Entity var1) {
      if ((-38829215 * -38829215 + -38829215 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"))) {
         return this.Xqedii_3clos9k(
            ((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("0VeHh8P0eikjbMRPrUD8jw2rCVTfjUyeX8TPGdDm1gdnAxKxl+ioSJKF"))
                  .get(Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-621180426, 13)))
               .asInt()
         );
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         return var2 == null ? Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(3120272, 27) : this.Xqedii_3clos9k(var2.Xqedii_n6wcxc4);
      }
   }

   public Vector getHudLocation(Entity var1) {
      if ((401514219 * 401514219 - 401514219 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         if (var2 != null) {
            return var2.Xqedii_2e2q47u.clone();
         } else {
            return var1 != null && var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("gqPC1UXhZsK09Ykcxok4EPaEijZ+qOFO+LtrCJ8OFgGCmtJ6QiBfRT19CRU="))
               ? ((Vector)((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("gqPC1UXhZsK09Ykcxok4EPaEijZ+qOFO+LtrCJ8OFgGCmtJ6QiBfRT19CRU="))
                        .get(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 13)))
                     .value())
                  .clone()
               : null;
         }
      }
   }

   public Vector getHudScale(Entity var1) {
      if (((-456222346 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         if (var2 != null) {
            return var2.Xqedii_1pjv5dx.clone();
         } else {
            return var1 != null && var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("R2VfXgvLKD6VLJj6v3rGsbuTuggBDRKd9UqZPrpNYQqtAAd7MZE="))
               ? ((Vector)((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("R2VfXgvLKD6VLJj6v3rGsbuTuggBDRKd9UqZPrpNYQqtAAd7MZE="))
                        .get(Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-739200745, 22)))
                     .value())
                  .clone()
               : null;
         }
      }
   }

   public void Xqedii_1kixhzd(Display var1) {
      if ((-1159605279 * -1159605279 + -1159605279 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.setBrightness(this.Xqedii_2gqint3(var1));
      }
   }

   public Brightness Xqedii_2gqint3(Display var1) {
      if ((1999050490 * 1999050490 + 1999050490 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = this.Xqedii_2pcg278(var1);
         if (var2 > 0) {
            return new Brightness(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131098473, 10), var2);
         } else {
            int var3 = this.Xqedii_106ocht(var1);
            return var3 > 0 ? new Brightness(HudPositionCalculator.itemClipBlockLight(var3), HudPositionCalculator.itemClipSkyLight(var3)) : Xqedii_2sd94th;
         }
      }
   }

   public int Xqedii_106ocht(Entity var1) {
      if ((1370097842 ^ 1370097842) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("XQ4jMkb4HTsqI511cjk19SAwNyZupXLB+3G3bN32oe6Udn7TedB4qwhsYbk="))) {
         try {
            return Math.max(
               Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 13),
               ((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("XQ4jMkb4HTsqI511cjk19SAwNyZupXLB+3G3bN32oe6Udn7TedB4qwhsYbk="))
                     .get(Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-621180426, 13)))
                  .asInt()
            );
         } catch (Exception var3) {
            return Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-153421431, 5);
         }
      } else {
         return Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 5);
      }
   }

   public boolean Xqedii_laiitq7(Display var1, int var2, boolean var3) {
      if (((1350950794 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var4 = this.Xqedii_106ocht(var1);
         if (var4 == var2) {
            return (Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 12) != 0);
         } else {
            if (var2 > 0) {
               var1.setMetadata(
                  Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("XQ4jMkb4HTsqI511cjk19SAwNyZupXLB+3G3bN32oe6Udn7TedB4qwhsYbk="),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var2)
               );
            } else {
               var1.removeMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("XQ4jMkb4HTsqI511cjk19SAwNyZupXLB+3G3bN32oe6Udn7TedB4qwhsYbk="), this.Xqedii_rrdyomu);
            }

            if (var3 && HudPositionCalculator.itemClipBand(var4) != HudPositionCalculator.itemClipBand(var2)) {
               var1.setMetadata(
                  Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("ICrI4Zw34GsP9U89IytMvju9mOBae0TWPIlOJFby5a0xPccysCYpRyq4h3aZdz0eC5XXPRCD"),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, Xqedii_38o2zes.Xqedii_316oplq() + Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(742782268, 4))
               );
            }

            return (Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-1470012881, 23) != 0);
         }
      }
   }

   public boolean Xqedii_1savrat(Entity var1) {
      if (((-953834022 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("ICrI4Zw34GsP9U89IytMvju9mOBae0TWPIlOJFby5a0xPccysCYpRyq4h3aZdz0eC5XXPRCD"))) {
         try {
            return ((Xqedii_38o2zes.Xqedii_316oplq()
                  <= ((MetadataValue)var1.getMetadata(
                           Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("ICrI4Zw34GsP9U89IytMvju9mOBae0TWPIlOJFby5a0xPccysCYpRyq4h3aZdz0eC5XXPRCD")
                        )
                        .get(Xqedii_3vytxmo.Xqedii_3dhvcdyscx08i(742918397, 20)))
                     .asInt()
               ? Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-1947592616, 13)
               : Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 26)) != 0);
         } catch (Exception var3) {
            return (Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-1100841546, 19) != 0);
         }
      } else {
         return (Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(293420811, 10) != 0);
      }
   }

   public int Xqedii_2pcg278(Display var1) {
      if ((-1253083889 ^ -1253083889) != 0) {
         throw new IllegalStateException();
      } else if (var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("asrrgzj8N/LUjciHTcyC1mlURD+NaBNmJ+CC597K/ditZmF3EjtFjsn23hs="))
         && this.isFixShadersEnabled(this.Xqedii_20ozntw(var1))) {
         try {
            int var2 = ((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("asrrgzj8N/LUjciHTcyC1mlURD+NaBNmJ+CC597K/ditZmF3EjtFjsn23hs="))
                  .get(Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131097449, 11)))
               .asInt();
            return var2 >= Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(-721719940, 28) && var2 <= Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(799695202, 15)
               ? var2
               : Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-184800187, 20);
         } catch (Exception var3) {
            return Xqedii_3vytxmo.Xqedii_2o5jvy7o7d59l(1337382860, 0);
         }
      } else {
         return Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-1096841848, 17);
      }
   }

   public void enforceFullBrightness(Entity var1) {
      if ((-733274309 * -733274309 - -733274309 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 instanceof Display var2) {
            this.Xqedii_1kixhzd(var2);
         }
      }
   }

   public int Xqedii_189lv5i(TextAlignment var1) {
      if ((1444592937 * 1444592937 - 1444592937 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TextAlignment var2 = this.Xqedii_3r2d8xo(var1);
         if (var2 == TextAlignment.LEFT) {
            return Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(371471102, 3);
         } else {
            return var2 == TextAlignment.RIGHT ? Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(185815551, 2) : Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-115925865, 10);
         }
      }
   }

   public int Xqedii_2vu4y2r(Entity var1) {
      if (((819195031 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var1.hasMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("sLGge1yCYRCrBV5HiGlxBloZlm1tI9lr4ZAlhHkJxy9oStZ39dqg4UBi"))
         && !var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("sLGge1yCYRCrBV5HiGlxBloZlm1tI9lr4ZAlhHkJxy9oStZ39dqg4UBi")).isEmpty()) {
         return ((MetadataValue)var1.getMetadata(Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("sLGge1yCYRCrBV5HiGlxBloZlm1tI9lr4ZAlhHkJxy9oStZ39dqg4UBi"))
               .get(Xqedii_3vytxmo.Xqedii_qoh5lomn3ea1(-1478401489, 23)))
            .asInt();
      } else {
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         return var2 != null ? var2.Xqedii_1wwp4eo : Xqedii_3vytxmo.Xqedii_b1oztc41ds5o(-131100897, 30);
      }
   }

   private static /* synthetic */ String Xqedii_1r0fcqkzdk7f2(String string) {
        return Xqedii_3vytxmo.Xqedii_3cvcix2fpj4g6("yqVSvmObT1s1RFqSAUtp+R6oKhuMuQvr5ZLwsa8YGdSJc/U4") + string;
    }
}
