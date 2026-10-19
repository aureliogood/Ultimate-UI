package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_21041al;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;
import org.joml.Vector3f;

public abstract class HudMovement extends HudEntities {
   public static final String Xqedii_18x125ab62m5k = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudMovement(UltimateUI var1) {
      super(var1);
   }

   public void moveHud(Player var1, String var2, Vector var3, int var4) {
      if ((465220737 * 465220737 - 465220737 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.moveHud(this.getHud(var1, var2), var3, var4);
      }
   }

   @Override
   public void moveHud(Entity var1, Vector var2, int var3) {
      if ((1080696714 * 1080696714 + 1080696714 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.moveHud(var1, var2, var3, var3);
      }
   }

   @Override
   public void moveHud(Entity var1, Vector var2, int var3, int var4) {
      if ((-193817599 * (-193817599 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.moveHud(var1, var2, var3, var4, (Xqedii_21041al.Xqedii_9jlfcfataent(-2008989751, 2) != 0));
      }
   }

   @Override
   public void moveHud(Entity var1, Vector var2, int var3, int var4, boolean var5) {
      if ((-835533130 * -835533130 - -835533130 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         int var6 = !var5 && !this.Xqedii_3jt8515(var1)
            ? Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 1)
            : Xqedii_21041al.Xqedii_2nm5x2oggzojj(299202416, 12);
         int var7 = var6 != 0 ? Xqedii_21041al.Xqedii_2nm5x2oggzojj(-1207375181, 3) : Math.max(Xqedii_21041al.Xqedii_eitt3ntm1tu6(-2078323788, 21), var3);
         int var8 = this.Xqedii_3u778qc(var7, (var6 != 0));
         Xqedii_2t8d8j4 var9 = this.Xqedii_2jnbe8d(var1);
         if (var9 != null) {
            var9.Xqedii_2e2q47u = var2.clone();
            var9.Xqedii_1aoqfs7 = var7;
            var9.Xqedii_1d8vptj = Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 10);
            var1.setMetadata(
               Xqedii_21041al.Xqedii_ejzoe2a2k223("F1dmX3GZ2nmSG9SzpgIArCEq65jflcKTsckU+ZNVI7p1uPqgdOw/d4rPSms="),
               new FixedMetadataValue(this.Xqedii_rrdyomu, var2)
            );
            Player var17 = this.Xqedii_3u2qg5l(var1);
            if (var17 != null) {
               this.Xqedii_19o8tyr(var17, var9);
            }
         } else if (var1 instanceof Display var10) {
            if (this.Xqedii_1savrat(var10)) {
               var7 = Xqedii_21041al.Xqedii_3gyl85wlb28gp(-1098193266, 18);
               var8 = this.Xqedii_3u778qc(Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 5), (Xqedii_21041al.Xqedii_9jlfcfataent(1107951212, 5) != 0));
            }

            var10.removeMetadata(
               Xqedii_21041al.Xqedii_ejzoe2a2k223("vPkiJua7sKd8PRYkJeV1Wk8IA3CLbZtJ9kkjmFP39yT7ceJ6dXHALY9mMFFOLozPpEelYEaGGoQBKPdC"), this.Xqedii_rrdyomu
            );
            this.Xqedii_1kixhzd(var10);
            var10.setInterpolationDuration(var7);
            var10.setInterpolationDelay(Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 30));
            this.Xqedii_1m1yjkp(var10, var8);
            int var11 = ((MetadataValue)var1.getMetadata(Xqedii_21041al.Xqedii_ejzoe2a2k223("KTps4q8m1dysb7m4Cx/eYxzpX7O9Cwe7AQa10wUxSnztVWGSySOyCiCS"))
                  .get(Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 17)))
               .asInt();
            Player var12 = this.Xqedii_20ozntw(var1);
            Vector3f var13 = this.getLocationVector(
               var2,
               (Vector)((MetadataValue)var1.getMetadata(Xqedii_21041al.Xqedii_ejzoe2a2k223("mTn2ZFxfrejj7wXouu5iTe5s8DvVVwdnE+0leh/9AxDiXxgN17M="))
                     .get(Xqedii_21041al.Xqedii_2nm5x2oggzojj(598396640, 13)))
                  .value(),
               var1,
               var11,
               var12
            );
            int var14 = HudPositionCalculator.itemClipBand(this.Xqedii_106ocht(var10));
            if (var14 > 0) {
               var13.x = var13.x + (float)(var14 * Double.longBitsToDouble(Xqedii_21041al.Xqedii_11nnwti2q61lq(8397798730881706259L, 20)));
            }

            Vector3f var15 = this.Xqedii_4zg6flq(var12).transform(this.Xqedii_1iem95w(var13, var12));
            Vector3f var16 = this.Xqedii_2vzkbbo(var12);
            var15 = new Vector3f(var15.x + var16.x, var15.y + var16.y, var15.z + var16.z);
            var10.setTransformation(
               new Transformation(
                  var15, var10.getTransformation().getLeftRotation(), var10.getTransformation().getScale(), var10.getTransformation().getRightRotation()
               )
            );
            var1.setMetadata(
               Xqedii_21041al.Xqedii_ejzoe2a2k223("F1dmX3GZ2nmSG9SzpgIArCEq65jflcKTsckU+ZNVI7p1uPqgdOw/d4rPSms="),
               new FixedMetadataValue(this.Xqedii_rrdyomu, var2)
            );
            this.Xqedii_38awrd9(var10);
         }
      }
   }

   public void setHudTransitionTicks(Entity var1, int var2, int var3) {
      if ((754110778 ^ 754110778) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.removeMetadata(
            Xqedii_21041al.Xqedii_ejzoe2a2k223("UG2b7MGOGvQX6GPXsFGJrrr98rg8l2eOaCH9dxScaW2bHlaPMl/RFQS6T/nrBMowsgyvFdSJchmo1vguYro="), this.Xqedii_rrdyomu
         );
         int var4 = Math.max(Xqedii_21041al.Xqedii_9jlfcfataent(-1693416833, 27), var2);
         Xqedii_2t8d8j4 var6 = this.Xqedii_2jnbe8d(var1);
         if (var6 != null) {
            if (var6.Xqedii_1d8vptj != 0 || var6.Xqedii_1aoqfs7 != var4 || var4 > Xqedii_21041al.Xqedii_9jlfcfataent(-2105566448, 11)) {
               var6.Xqedii_1d8vptj = Xqedii_21041al.Xqedii_2nm5x2oggzojj(-1901380736, 15);
               var6.Xqedii_1aoqfs7 = var4;
               Player var8 = this.Xqedii_3u2qg5l(var1);
               if (var8 != null) {
                  this.Xqedii_19o8tyr(var8, var6);
               }
            }
         } else {
            if (var1 instanceof Display var7) {
               this.Xqedii_1kixhzd(var7);
               var7.setInterpolationDelay(Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 21));
               var7.setInterpolationDuration(var4);
               this.Xqedii_1m1yjkp(var7, var4);
            }
         }
      }
   }

   public void setHudNoTransition(Entity var1) {
      if ((-1575906514 * -1575906514 - -1575906514 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.setMetadata(
            Xqedii_21041al.Xqedii_ejzoe2a2k223("UG2b7MGOGvQX6GPXsFGJrrr98rg8l2eOaCH9dxScaW2bHlaPMl/RFQS6T/nrBMowsgyvFdSJchmo1vguYro="),
            new FixedMetadataValue(this.Xqedii_rrdyomu, Boolean.valueOf((Xqedii_21041al.Xqedii_2nm5x2oggzojj(-1413775218, 23) != 0)))
         );
         Xqedii_2t8d8j4 var2 = this.Xqedii_2jnbe8d(var1);
         if (var2 != null) {
            if (var2.Xqedii_1d8vptj != 0 || var2.Xqedii_1aoqfs7 != 0) {
               var2.Xqedii_1d8vptj = Xqedii_21041al.Xqedii_9jlfcfataent(639698175, 28);
               var2.Xqedii_1aoqfs7 = Xqedii_21041al.Xqedii_2nm5x2oggzojj(1436401735, 22);
               Player var4 = this.Xqedii_3u2qg5l(var1);
               if (var4 != null) {
                  this.Xqedii_19o8tyr(var4, var2);
               }
            }
         } else {
            if (var1 instanceof Display var3) {
               this.Xqedii_1kixhzd(var3);
               var3.setInterpolationDelay(Xqedii_21041al.Xqedii_3gyl85wlb28gp(-1098193266, 19));
               var3.setInterpolationDuration(Xqedii_21041al.Xqedii_9jlfcfataent(276987795, 3));
               this.Xqedii_1m1yjkp(var3, Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 5));
            }
         }
      }
   }

   @Override
   public boolean Xqedii_3jt8515(Entity var1) {
      if ((964351185 * 964351185 - 964351185 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && var1.hasMetadata(Xqedii_21041al.Xqedii_ejzoe2a2k223("UG2b7MGOGvQX6GPXsFGJrrr98rg8l2eOaCH9dxScaW2bHlaPMl/RFQS6T/nrBMowsgyvFdSJchmo1vguYro="))
               && ((MetadataValue)var1.getMetadata(
                        Xqedii_21041al.Xqedii_ejzoe2a2k223("UG2b7MGOGvQX6GPXsFGJrrr98rg8l2eOaCH9dxScaW2bHlaPMl/RFQS6T/nrBMowsgyvFdSJchmo1vguYro=")
                     )
                     .get(Xqedii_21041al.Xqedii_3gyl85wlb28gp(-1098193266, 17)))
                  .asBoolean()
            ? Xqedii_21041al.Xqedii_9jlfcfataent(-423354209, 25)
            : Xqedii_21041al.Xqedii_3gyl85wlb28gp(-1098193266, 28)) != 0);
      }
   }

   @Override
   public int Xqedii_3u778qc(int var1, boolean var2) {
      if ((1290407750 ^ 1290407750) != 0) {
         throw new IllegalStateException();
      } else if (var2) {
         return Xqedii_21041al.Xqedii_9jlfcfataent(136837425, 7);
      } else {
         return var1 <= 0 ? Xqedii_21041al.Xqedii_2nm5x2oggzojj(-1429282781, 21) : Math.max(Xqedii_21041al.Xqedii_eitt3ntm1tu6(-2078323788, 23), var1);
      }
   }

   public boolean hasHudNoTransition(Entity var1) {
      if (((-1075297214 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3jt8515(var1);
      }
   }

   public void moveHuds(Entity var1, List<Entity> var2, Vector var3, int var4) {
      if ((1009335960 * 1009335960 - 1009335960 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Vector var5 = var3.clone()
            .subtract(
               (Vector)((MetadataValue)var1.getMetadata(Xqedii_21041al.Xqedii_ejzoe2a2k223("F1dmX3GZ2nmSG9SzpgIArCEq65jflcKTsckU+ZNVI7p1uPqgdOw/d4rPSms="))
                     .get(Xqedii_21041al.Xqedii_eitt3ntm1tu6(2078323787, 5)))
                  .value()
            );
         var5.setZ(Xqedii_21041al.Xqedii_2nm5x2oggzojj(1880216935, 4));
         ArrayList var6 = new ArrayList(var2);
         var6.add(var1);

         for (Entity var8 : (Iterable<Entity>) (var6)) {

            Vector var9 = ((Vector)((MetadataValue)var8.getMetadata(
                        Xqedii_21041al.Xqedii_ejzoe2a2k223("F1dmX3GZ2nmSG9SzpgIArCEq65jflcKTsckU+ZNVI7p1uPqgdOw/d4rPSms=")
                     )
                     .get(Xqedii_21041al.Xqedii_9jlfcfataent(-2105568496, 11)))
                  .value())
               .clone()
               .add(var5);
            this.moveHud(var8, var9, var4);
         }
      }
   }
}
