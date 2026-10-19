package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1opk26r;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_nd6rkr3;
import java.util.Objects;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;
import org.joml.Quaternionf;

public abstract class HudTransforms extends HudAlignment {
   public static final String Xqedii_3h54stc993qw0 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudTransforms(UltimateUI var1) {
      super(var1);
   }

   public void setHudScale(Entity var1, Vector var2, int var3, boolean var4) {
      if ((-83219967 * (-83219967 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var2 = this.Xqedii_3iy1c6h(var2);
         boolean var5 = this.Xqedii_3jt8515(var1);
         int var6 = var5 ? Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(-359012479, 16) : Math.max(Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(-818147500, 27), var3);
         int var7 = this.Xqedii_3u778qc(var6, var5);
         Xqedii_2t8d8j4 var8 = this.Xqedii_2jnbe8d(var1);
         if (var8 != null) {
            Vector var14 = (Vector)((MetadataValue)var1.getMetadata(
                     Xqedii_1opk26r.Xqedii_au9fp68tlkd4("DKW0dFIC2qLI/Fkq/KwSjCKOMuHNoKmIf9aJptN4oIlgvs34QbULNJVIuWQ=")
                  )
                  .get(Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(2044754598, 30)))
               .value();
            Vector var15 = (Vector)((MetadataValue)var1.getMetadata(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("bbl4fZ42j7arUiZuKCLYFx66PUHZF+f9gBQAVMCl5P2/iCBBoJQ="))
                  .get(Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(1100655965, 30)))
               .value();
            var1.setMetadata(
               Xqedii_1opk26r.Xqedii_au9fp68tlkd4("bbl4fZ42j7arUiZuKCLYFx66PUHZF+f9gBQAVMCl5P2/iCBBoJQ="), new FixedMetadataValue(this.Xqedii_rrdyomu, var2)
            );
            var8.Xqedii_1pjv5dx = var2.clone();
            if (!var4) {
               this.moveHud(var1, var14, var6);
            } else {
               Vector var16 = var15.clone()
                  .subtract(var2)
                  .multiply(Double.longBitsToDouble(Xqedii_1opk26r.Xqedii_20ppl3b63vi2q(-4620263942404793885L, 24)))
                  .add(var14);
               var1.setMetadata(
                  Xqedii_1opk26r.Xqedii_au9fp68tlkd4("DKW0dFIC2qLI/Fkq/KwSjCKOMuHNoKmIf9aJptN4oIlgvs34QbULNJVIuWQ="),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var16)
               );
               var8.Xqedii_2e2q47u = var16;
               var8.Xqedii_1d8vptj = Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(-528832903, 6);
               var8.Xqedii_1aoqfs7 = var6;
            }

            Player var17 = this.Xqedii_3u2qg5l(var1);
            if (var17 != null && var4) {
               this.Xqedii_19o8tyr(var17, var8);
            }
         } else {
            Display var9 = (Display)var1;
            this.Xqedii_1kixhzd(var9);
            Vector var10 = (Vector)((MetadataValue)var1.getMetadata(
                     Xqedii_1opk26r.Xqedii_au9fp68tlkd4("DKW0dFIC2qLI/Fkq/KwSjCKOMuHNoKmIf9aJptN4oIlgvs34QbULNJVIuWQ=")
                  )
                  .get(Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(1100655965, 28)))
               .value();
            Vector var11 = (Vector)((MetadataValue)var1.getMetadata(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("bbl4fZ42j7arUiZuKCLYFx66PUHZF+f9gBQAVMCl5P2/iCBBoJQ="))
                  .get(Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(959207875, 11)))
               .value();
            var9.setTransformation(
               new Transformation(
                  var9.getTransformation().getTranslation(),
                  var9.getTransformation().getLeftRotation(),
                  this.Xqedii_1iem95w(this.getScaleVector(var2), this.Xqedii_20ozntw(var1)),
                  var9.getTransformation().getRightRotation()
               )
            );
            var1.setMetadata(
               Xqedii_1opk26r.Xqedii_au9fp68tlkd4("bbl4fZ42j7arUiZuKCLYFx66PUHZF+f9gBQAVMCl5P2/iCBBoJQ="), new FixedMetadataValue(this.Xqedii_rrdyomu, var2)
            );
            if (!var4) {
               this.moveHud(var1, var10, var6);
            } else {
               Vector var12 = var11.clone()
                  .subtract(var2)
                  .multiply(Double.longBitsToDouble(Xqedii_1opk26r.Xqedii_1gq3zeap1delr(-7852520403365586186L, 47)))
                  .add(var10);
               var1.setMetadata(
                  Xqedii_1opk26r.Xqedii_au9fp68tlkd4("DKW0dFIC2qLI/Fkq/KwSjCKOMuHNoKmIf9aJptN4oIlgvs34QbULNJVIuWQ="),
                  new FixedMetadataValue(this.Xqedii_rrdyomu, var12)
               );
               var9.setInterpolationDelay(Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(1100655965, 28));
               var9.setInterpolationDuration(var6);
               this.Xqedii_1m1yjkp(var9, var7);
               this.Xqedii_38awrd9(var9);
            }
         }
      }
   }

   public String getHudText(Entity var1, Integer var2) {
      if (((-2146998968 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var3 = this.Xqedii_2jnbe8d(var1);
         if (var3 != null) {
            String var7 = var3.Xqedii_22p5vll == null ? Xqedii_1opk26r.Xqedii_au9fp68tlkd4("S/bGt9ohV88Xu+XWnXOFl3BK2Jz9jWY6FdbUhA==") : var3.Xqedii_22p5vll;
            if (var2 != null) {
               String[] var8 = var7.split(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("y0+DMPvF4AuPrxw/cR/BxEv1S2hSMort27N8EttG80o="));
               return var2 <= var8.length
                  ? var8[var2 - Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(-1100655966, 10)]
                  : Xqedii_1opk26r.Xqedii_au9fp68tlkd4("S/bGt9ohV88Xu+XWnXOFl3BK2Jz9jWY6FdbUhA==");
            } else {
               return var7;
            }
         } else if (var1 instanceof TextDisplay var4) {
            String var5 = this.Xqedii_3oiuki3(var4.getText());
            if (var2 != null) {
               String[] var6 = var5.split(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("vN9UlmuMIBBtVfT5wXW3ISAvhJTjaw18F4TRi791"));
               return var2 <= var6.length
                  ? var6[var2 - Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(432628494, 6)]
                  : Xqedii_1opk26r.Xqedii_au9fp68tlkd4("S/bGt9ohV88Xu+XWnXOFl3BK2Jz9jWY6FdbUhA==");
            } else {
               return var5;
            }
         } else {
            return Xqedii_1opk26r.Xqedii_au9fp68tlkd4("S/bGt9ohV88Xu+XWnXOFl3BK2Jz9jWY6FdbUhA==");
         }
      }
   }

   public void setHudText(Entity var1, String var2, Integer var3) {
      if ((2116975989 * 2116975989 + 2116975989 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.setHudText(var1, var2, var3, (Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(-1316549404, 21) != 0));
      }
   }

   public void setHudText(Entity var1, String var2, Integer var3, boolean var4) {
      if ((-234548450 * -234548450 - -234548450 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var5 = this.Xqedii_2jnbe8d(var1);
         if (var5 != null) {
            String var12;
            if (var3 != null) {
               String var13 = this.getHudText(var1, null);
               String[] var15 = var13.split(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("y0+DMPvF4AuPrxw/cR/BxEv1S2hSMort27N8EttG80o="));
               StringBuilder var16 = new StringBuilder();

               for (int var17 = Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(-2039326525, 4); var17 <= Math.max(var15.length, var3); var17++) {
                  if (var17 > Xqedii_1opk26r.Xqedii_1vjzntna7k51h(1329468447, 21)) {
                     var16.append(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("vN9UlmuMIBBtVfT5wXW3ISAvhJTjaw18F4TRi791"));
                  }

                  if (var17 == var3) {
                     var16.append(var2);
                  } else if (var17 <= var15.length) {
                     var16.append(var15[var17 - Xqedii_1opk26r.Xqedii_1vjzntna7k51h(1327371807, 9)]);
                  }
               }

               var12 = var16.toString();
            } else {
               var12 = var2 == null ? Xqedii_1opk26r.Xqedii_au9fp68tlkd4("S/bGt9ohV88Xu+XWnXOFl3BK2Jz9jWY6FdbUhA==") : var2;
            }

            if (Objects.equals(var5.Xqedii_22p5vll, var12)) {
               if (var4) {
                  this.moveHud(var1, var5.Xqedii_2e2q47u, Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(-1775443556, 18));
               }
            } else {
               var5.Xqedii_22p5vll = var12;
               Player var14 = this.Xqedii_3u2qg5l(var1);
               if (var14 != null) {
                  this.Xqedii_32k228o(var14, var5);
               }

               if (var4) {
                  this.moveHud(var1, var5.Xqedii_2e2q47u, Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(-1712881174, 24));
               }
            }
         } else if (var1 instanceof TextDisplay var6) {
            if (var3 != null) {
               String var7 = this.getHudText(var1, null);
               String[] var8 = var7.split(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("vN9UlmuMIBBtVfT5wXW3ISAvhJTjaw18F4TRi791"));
               StringBuilder var9 = new StringBuilder();
               int var10 = Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(1100655965, 23);

               for (int var11 = Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(-359078015, 16); var11 <= Math.max(var8.length, var3); var11++) {
                  if (var11 > Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(629946471, 16)) {
                     var9.append(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("vN9UlmuMIBBtVfT5wXW3ISAvhJTjaw18F4TRi791"));
                  }

                  if (var11 == var3) {
                     var9.append(var2);
                  } else if (var11 <= var8.length) {
                     var9.append(var8[var11 - Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(744604473, 19)]);
                  }

                  if (var11 > var8.length && var11 < var3) {
                     var9.append(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("S/bGt9ohV88Xu+XWnXOFl3BK2Jz9jWY6FdbUhA=="));
                  }

                  if (var11 == var3 && var11 > var8.length) {
                     var10 = Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(835650517, 25);
                  }
               }

               Xqedii_nd6rkr3.Xqedii_51phqp2(var6, MiniMessage.miniMessage().deserialize(this.Xqedii_wgkgkwo(var9.toString())));
               if (var10 != 0 && var4) {
                  this.moveHud(
                     var1,
                     (Vector)((MetadataValue)var1.getMetadata(
                              Xqedii_1opk26r.Xqedii_au9fp68tlkd4("DKW0dFIC2qLI/Fkq/KwSjCKOMuHNoKmIf9aJptN4oIlgvs34QbULNJVIuWQ=")
                           )
                           .get(Xqedii_1opk26r.Xqedii_1vjzntna7k51h(1327371295, 9)))
                        .value(),
                     Xqedii_1opk26r.Xqedii_1hmdbhhu1588k(946283915, 0)
                  );
               }
            } else {
               Xqedii_nd6rkr3.Xqedii_51phqp2(var6, MiniMessage.miniMessage().deserialize(this.Xqedii_wgkgkwo(var2)));
               if (var4) {
                  this.moveHud(
                     var1,
                     (Vector)((MetadataValue)var1.getMetadata(
                              Xqedii_1opk26r.Xqedii_au9fp68tlkd4("DKW0dFIC2qLI/Fkq/KwSjCKOMuHNoKmIf9aJptN4oIlgvs34QbULNJVIuWQ=")
                           )
                           .get(Xqedii_1opk26r.Xqedii_1vjzntna7k51h(1327371295, 7)))
                        .value(),
                     Xqedii_1opk26r.Xqedii_1vjzntna7k51h(1327371295, 3)
                  );
               }
            }
         }
      }
   }

   public void rotateHud(Entity var1, Vector var2, int var3, String var4) {
      if ((-1303660334 * -1303660334 - -1303660334 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         boolean var5 = this.Xqedii_3jt8515(var1);
         int var6 = var5 ? Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(1100655965, 14) : Math.max(Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(514432632, 12), var3);
         int var7 = this.Xqedii_3u778qc(var6, var5);
         Xqedii_2t8d8j4 var8 = this.Xqedii_2jnbe8d(var1);
         if (var8 != null) {
            double var17 = Math.toRadians(var2.getX());
            double var11 = Math.toRadians(var2.getY()) + Math.toRadians(Double.longBitsToDouble(Xqedii_1opk26r.Xqedii_1gq3zeap1delr(-934956122632932080L, 14)));
            double var13 = Math.toRadians(var2.getZ());
            Quaternionf var15 = new Quaternionf().rotationXYZ((float)var17, (float)var11, (float)var13);
            if (!var4.equalsIgnoreCase(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("LXIDTSHmzZM63v60j44g+uOAlXXXvw+SItexDOi/PIT0PXBr5MI="))
               && var8.Xqedii_6apav31 != null) {
               var15 = new Quaternionf(var8.Xqedii_6apav31).mul(var15);
            }

            if (var4.equalsIgnoreCase(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("LXIDTSHmzZM63v60j44g+uOAlXXXvw+SItexDOi/PIT0PXBr5MI="))) {
               var8.Xqedii_2cxxagp = var15;
            } else {
               var8.Xqedii_3uxvg68 = var15;
            }

            var8.Xqedii_1d8vptj = Xqedii_1opk26r.Xqedii_30c2deaqzb3vm(1007637711, 3);
            var8.Xqedii_1aoqfs7 = var6;
            Player var19 = this.Xqedii_3u2qg5l(var1);
            if (var19 != null) {
               this.Xqedii_19o8tyr(var19, var8);
            }
         } else if (var1 instanceof Display var9) {
            this.Xqedii_1kixhzd(var9);
            double var10 = Math.toRadians(var2.getX());
            double var12 = Math.toRadians(var2.getY());
            double var14 = Math.toRadians(var2.getZ());
            if (var1 instanceof TextDisplay) {
               var12 += Math.toRadians(Double.longBitsToDouble(Xqedii_1opk26r.Xqedii_39fkgq0j54s81(-2644084298166924791L, 27)));
            }

            Quaternionf var16 = new Quaternionf().rotationXYZ((float)var10, (float)var12, (float)var14);
            if (var4.equalsIgnoreCase(Xqedii_1opk26r.Xqedii_au9fp68tlkd4("LXIDTSHmzZM63v60j44g+uOAlXXXvw+SItexDOi/PIT0PXBr5MI="))) {
               var9.setTransformation(
                  new Transformation(
                     var9.getTransformation().getTranslation(), var9.getTransformation().getLeftRotation(), var9.getTransformation().getScale(), var16
                  )
               );
            } else {
               var16 = this.Xqedii_4zg6flq(this.Xqedii_20ozntw(var1)).mul(var16);
               var9.setTransformation(
                  new Transformation(
                     var9.getTransformation().getTranslation(), var16, var9.getTransformation().getScale(), var9.getTransformation().getRightRotation()
                  )
               );
            }

            var9.setInterpolationDelay(Xqedii_1opk26r.Xqedii_1hbpr0p7a6gwq(1100655965, 6));
            var9.setInterpolationDuration(var6);
            this.Xqedii_1m1yjkp(var9, var7);
            this.Xqedii_38awrd9(var9);
         }
      }
   }
}
