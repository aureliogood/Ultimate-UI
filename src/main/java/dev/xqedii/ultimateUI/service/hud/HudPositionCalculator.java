package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.Xqedii_3t6vlza;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Vector;
import org.joml.Vector3f;

public class HudPositionCalculator {
   public static final String Xqedii_26jtkhlhnzsux = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final double YAML_TO_HUD_SIZE_FACTOR = 1.25;
   public static final double Xqedii_3l24xi4 = 1.0;
   public static final double Xqedii_34xhgsx = 1.0;
   public static final double Xqedii_26h3r2v = 1920.0;
   public static final double Xqedii_6ixosvs = 1080.0;
   public static final double Xqedii_1iynrne = 160.0;
   public static final double Xqedii_2mjxtiw = 36.0;
   public static final double Xqedii_3kjmqhg = 200.0;
   public static final double Xqedii_2qfkfrl = 0.0032;
   public static final double Xqedii_1evp8nr = 2876.0;
   public static final double Xqedii_2vt8ve8 = 1920.0;
   public static final double Xqedii_20rivmn = 1.0;
   public static final double Xqedii_2uu92up = 0.03125;
   public static final double UUI_PART_BAND = 1000000.0;
   public static final int UUI_PART_MAX = 5;
   public static final double HUD_VIEW_EYE_GAP = 0.178;
   public static final double UUI_CLIP_BAND = 16384.0;
   public static final int UUI_CLIP_AXIS_VERTICAL = 0;
   public static final int UUI_CLIP_AXIS_HORIZONTAL = 1;
   public static final int UUI_CLIP_SIDE_START = 0;
   public static final int UUI_CLIP_SIDE_END = 1;
   public static final int Xqedii_1beqfew = 2047;
   public static final int Xqedii_wuf04tj = 11;
   public static final int Xqedii_24gl96t = 12;
   public static final int Xqedii_7tu0c0d = 4095;
   public static final int Xqedii_2502b26 = 255;
   public static final int Xqedii_30vc9az = 15;
   public static final int Xqedii_3g7ay67 = 8;
   public static final int Xqedii_242z73b = 3;
   public static final int Xqedii_6yqt2wv = 10;
   public static final int Xqedii_1mm1hc0 = 11;
   public static final int Xqedii_40dhlbm = 4;
   public static final int Xqedii_1hg1i5d = 7;
   public static final int Xqedii_3xee1tv = 127;
   public static final double LEGACY_LAYER_Z_PIXEL_MULTIPLIER = 100.0;

   public static int encodeClip(int var0, int var1, double var2, double var4) {
      if ((1939221597 ^ 1939221597) != 0) {
         throw new IllegalStateException();
      } else if ((var0 == 0 || var0 == Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815362821, 18))
         && (var1 == 0 || var1 == Xqedii_3t6vlza.Xqedii_ethiau02zycv(-1282259346, 11))
         && Double.isFinite(var2)
         && Double.isFinite(var4)) {
         int var6 = Xqedii_8a2kute(var1 == 0 ? var2 : var4);
         return (var0 << Xqedii_3t6vlza.Xqedii_9qvslkckynxi(-780256828, 10) | var1 << Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1818508549, 19) | var6)
            + Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815362821, 15);
      } else {
         return Xqedii_3t6vlza.Xqedii_9qvslkckynxi(2114569425, 18);
      }
   }

   public static int Xqedii_8a2kute(double var0) {
      if ((1584278513 ^ 1584278513) != 0) {
         throw new IllegalStateException();
      } else {
         return (int)Math.max(
            Xqedii_3t6vlza.Xqedii_pricapbt38ig(-5228858168401353382L, 43),
            Math.min(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727858821478125413L, 31), Math.round(var0))
         );
      }
   }

   public static int Xqedii_10zfbnx(int var0) {
      if ((-1062416440 * (-1062416440 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 <= 0
            ? Xqedii_3t6vlza.Xqedii_yhod2053suah(934308983, 6)
            : var0 - Xqedii_3t6vlza.Xqedii_yhod2053suah(-1213174665, 31) & Xqedii_3t6vlza.Xqedii_9qvslkckynxi(1548557280, 30);
      }
   }

   public static int clipBand(int var0) {
      if (((-1740526061 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var0 <= 0
            ? Xqedii_3t6vlza.Xqedii_9qvslkckynxi(81946815, 25)
            : (var0 - Xqedii_3t6vlza.Xqedii_yhod2053suah(934292599, 14) >> Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815362857, 2))
               + Xqedii_3t6vlza.Xqedii_yhod2053suah(867200119, 26);
      }
   }

   public static int clipPackedLight(int var0) {
      if ((-881391211 ^ -881391211) != 0) {
         throw new IllegalStateException();
      } else {
         int var1 = Xqedii_10zfbnx(var0) & Xqedii_3t6vlza.Xqedii_yhod2053suah(934308751, 3);
         int var2 = var1 & Xqedii_3t6vlza.Xqedii_9qvslkckynxi(-231856501, 21);
         int var3 = var1 >> Xqedii_3t6vlza.Xqedii_9qvslkckynxi(-1947152858, 13) & Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815362820, 31);
         return var2 << Xqedii_3t6vlza.Xqedii_yhod2053suah(933260407, 18) | var3 << Xqedii_3t6vlza.Xqedii_9qvslkckynxi(1173972755, 12);
      }
   }

   public static int clipOpacity(int var0, int var1) {
      if (((-1789135493 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 <= 0) {
         return var0;
      } else {
         int var2 = Xqedii_10zfbnx(var1) >> Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815348485, 11) & Xqedii_3t6vlza.Xqedii_9qvslkckynxi(801290394, 15);
         int var3 = Math.max(Xqedii_3t6vlza.Xqedii_yhod2053suah(900754551, 23), var0 & Xqedii_3t6vlza.Xqedii_yhod2053suah(-934309368, 7));
         return Math.min(Xqedii_3t6vlza.Xqedii_yhod2053suah(934777975, 11), var3 | var2);
      }
   }

   public static int itemClipBand(int var0) {
      if ((2062726028 * (2062726028 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 <= 0) {
         return Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(1815362820, 16);
      } else {
         int var1 = var0 - Xqedii_3t6vlza.Xqedii_ethiau02zycv(613211495, 20) >> Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815361029, 8)
            & Xqedii_3t6vlza.Xqedii_9qvslkckynxi(2114831569, 18);
         int var2 = Xqedii_10zfbnx(var0) & Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(1816904442, 22);
         return Xqedii_3t6vlza.Xqedii_9qvslkckynxi(323352631, 4)
            + var1
            + (var2 >> Xqedii_3t6vlza.Xqedii_ethiau02zycv(661056313, 23) << Xqedii_3t6vlza.Xqedii_9qvslkckynxi(231002494, 26));
      }
   }

   public static int Xqedii_150op69(int var0) {
      if ((1583800342 * 1583800342 + 1583800342 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var1 = Xqedii_10zfbnx(var0);
         int var2 = var1 >> Xqedii_3t6vlza.Xqedii_ethiau02zycv(752707364, 28) & Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815362821, 26);
         int var3 = var1 & Xqedii_3t6vlza.Xqedii_ethiau02zycv(-348464282, 7);
         return var2 << Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1817459973, 20) | var3 & Xqedii_3t6vlza.Xqedii_ethiau02zycv(-697157939, 8);
      }
   }

   public static int itemClipBlockLight(int var0) {
      if ((-1478045543 * -1478045543 - -1478045543 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_150op69(var0) & Xqedii_3t6vlza.Xqedii_yhod2053suah(934308999, 4);
      }
   }

   public static int itemClipSkyLight(int var0) {
      if (((1350521148 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_150op69(var0) >> Xqedii_3t6vlza.Xqedii_9qvslkckynxi(-1708145864, 7) & Xqedii_3t6vlza.Xqedii_ethiau02zycv(-920963239, 18);
      }
   }

   public static int clipRedBit(int var0) {
      if (((-629900631 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var0 <= 0
            ? Xqedii_3t6vlza.Xqedii_yhod2053suah(-934308984, 1)
            : Xqedii_10zfbnx(var0) >> Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(-1815353605, 10) & Xqedii_3t6vlza.Xqedii_ethiau02zycv(-1160885991, 5);
      }
   }

   public static int clipGreenBit(int var0) {
      if (((-1632919871 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var0 <= 0
            ? Xqedii_3t6vlza.Xqedii_9qvslkckynxi(2114307281, 18)
            : Xqedii_10zfbnx(var0) >> Xqedii_3t6vlza.Xqedii_yhod2053suah(896560247, 22) & Xqedii_3t6vlza.Xqedii_yhod2053suah(934308919, 6);
      }
   }

   public HudPositionCalculator.Placement calculateBoxPlacement(double var1, double var3, double var5, double var7, double var9) {
      if (((1780687955 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.calculateBoxPlacement(var1, var3, var5, var7, var9, (Xqedii_3t6vlza.Xqedii_yhod2053suah(934308981, 1) != 0));
      }
   }

   public HudPositionCalculator.Placement calculateBoxPlacement(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      if ((-864171481 ^ -864171481) != 0) {
         throw new IllegalStateException();
      } else {
         double var12 = Math.max(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(7598863060726313781L, 30)), var7);
         double var14 = Math.max(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-5262004588595455813L, 5)), var9);
         double var16 = var12 * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-6580449843236721845L, 41));
         double var18 = var14 * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-7299004265434204295L, 21));
         double var20 = var16 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(2696633505299651165L, 44));
         double var22 = var18 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-3051801902344959540L, 24));
         double var24 = var11
            ? Math.max(
               Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(3795222690850562673L, 24)),
               (var14 - Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-8344266957543591561L, 6)))
                  * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-4285328085480796131L, 27))
            )
            : Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(4496471693517532398L, 11));
         double var26 = this.Xqedii_13e8tm9(var12);
         double var28 = var1 + var12 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760569769829L, 26)) - var20 + var26;
         double var30 = var3 + var14 + var22 - var24;
         Vector var32 = new Vector(var28, var30, var5);
         Vector var33 = new Vector(
            var16 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(-4119861878331162428L, 3)),
            var18 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760594935653L, 25)),
            Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3730071376028143461L, 57))
         );
         return new HudPositionCalculator.Placement(var32, var33);
      }
   }

   public HudPositionCalculator.Placement calculateExactBoxPlacement(double var1, double var3, double var5, double var7, double var9) {
      if ((-1526223067 * -1526223067 - -1526223067 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var11 = Math.max(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3765572407465774949L, 61)), var7);
         double var13 = Math.max(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-3686858397115359817L, 16)), var9);
         double var15 = var11 * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(884957495808921445L, 0));
         double var17 = var13 * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(8571982638969673131L, 47));
         double var19 = var1
            + var11 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(-4119861878331162431L, 2))
            - var15 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(3842502262859874517L, 5))
            + this.Xqedii_13e8tm9(var11);
         double var21 = var3 + var13 + var13 * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760586555589L, 16));
         return new HudPositionCalculator.Placement(
            new Vector(var19, var21, var5),
            new Vector(
               var15 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(-4119861878331156286L, 13)),
               var17 / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(3381708980914918070L, 59)),
               Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(-7184038733124278684L, 14))
            )
         );
      }
   }

   public double Xqedii_13e8tm9(double var1) {
      if ((-67605914 * (-67605914 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 <= Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-7660209981140670092L, 46))) {
         return Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-2024813528368848178L, 7));
      } else {
         double var3 = Math.floor(
               (var1 - Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-1645112459312076078L, 39)))
                  / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(-2337888733373809284L, 5))
            )
            + Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760586571909L, 17));
         return Math.max(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(-4119861878331162430L, 48)), var3);
      }
   }

   public Vector3f toDisplayTranslation(Vector var1, Vector var2, Entity var3, int var4) {
      if ((1773635537 ^ 1773635537) != 0) {
         throw new IllegalStateException();
      } else {
         return this.toDisplayTranslation(
            var1,
            var2,
            var3,
            var4,
            Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(-5954964117454469934L, 34)),
            (Xqedii_3t6vlza.Xqedii_ethiau02zycv(613211495, 20) != 0)
         );
      }
   }

   public Vector3f toDisplayTranslation(Vector var1, Vector var2, Entity var3, int var4, double var5, boolean var7) {
      if (((1960812410 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         float var8 = Float.intBitsToFloat(Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(1815362820, 20));
         int var9 = !var7
               && var3 != null
               && var3.hasMetadata(Xqedii_3t6vlza.Xqedii_zzhg8u0gh3fy("xdQI/aumFywyIxC1tXxzeNudCrvxk+peAn/tiyZpJ+6c+gDtZ4VxW35J1Lm7TI7cdrPxZ2R+"))
            ? Xqedii_3t6vlza.Xqedii_yhod2053suah(925920375, 23)
            : Xqedii_3t6vlza.Xqedii_9qvslkckynxi(-1090198936, 17);
         if (var3 instanceof ItemDisplay var10 && var9 == 0) {
            if (var10.getItemStack() != null && var10.getItemStack().getType().isBlock()) {
               var8 = (float)(var2.getZ() / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3655797166548619109L, 58)));
            } else {
               var8 = (float)(var2.getZ() / Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(-4119861878332968766L, 22)));
            }
         }

         float var13 = (float)(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3746025289747173221L, 56)) - var1.getX())
            * Float.intBitsToFloat(Xqedii_3t6vlza.Xqedii_ethiau02zycv(-1624938716, 28));
         float var14;
         if (var7) {
            var14 = (float)(
               Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-6693037543186519086L, 13))
                  + (Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760588660501L, 23)) - var1.getY())
                     * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(-3705466725111206052L, 3))
                  - var4
            );
            var14 -= (float)(this.Xqedii_1v9ob2y(var3) * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-5581458372630794505L, 11)));
         } else {
            var14 = (float)(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_2id3f7fcimwg(1068284892399660829L, 14)) - var1.getY())
               * Float.intBitsToFloat(Xqedii_3t6vlza.Xqedii_ethiau02zycv(-229215671, 0));
         }

         float var12 = (float)(Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(-3249017952256924054L, 31)) * var8 - var1.getZ() * var5);
         if (var9 != 0) {
            var12 -= (float)(this.Xqedii_2wnd0ti(var3) * Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_pricapbt38ig(7590445381699445986L, 25)));
         }

         return new Vector3f(var13, var14, var12);
      }
   }

   public double Xqedii_2wnd0ti(Entity var1) {
      if ((1103880174 ^ 1103880174) != 0) {
         throw new IllegalStateException();
      } else if (!var1.hasMetadata(Xqedii_3t6vlza.Xqedii_zzhg8u0gh3fy("QKnAlvw9usXhD2kItQUUvh2YsEDWsOHJ3K/F6/hAEba4ZlAUlZ5aXdTEC0nbxLgMQQCnId3jGuE="))) {
         return Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_xkwfeo4dxtfl(5450672262536468907L, 33));
      } else {
         try {
            double var2 = ((MetadataValue)var1.getMetadata(
                     Xqedii_3t6vlza.Xqedii_zzhg8u0gh3fy("QKnAlvw9usXhD2kItQUUvh2YsEDWsOHJ3K/F6/hAEba4ZlAUlZ5aXdTEC0nbxLgMQQCnId3jGuE=")
                  )
                  .get(Xqedii_3t6vlza.Xqedii_9qvslkckynxi(81946815, 25)))
               .asDouble();
            return Double.isFinite(var2) ? var2 : Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760586547045L, 53));
         } catch (Exception var4) {
            return Double.longBitsToDouble(Xqedii_3t6vlza.Xqedii_tfdonci6bu5l(3727854760586547045L, 0));
         }
      }
   }

   public int Xqedii_1v9ob2y(Entity var1) {
      if ((-1390044469 * (-1390044469 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.hasMetadata(Xqedii_3t6vlza.Xqedii_zzhg8u0gh3fy("JpkGhHwsNsM2ZjActGCmg1q7gViiKlSsjEggYOwFp7XwJ7LGhOEDDqHBMSI="))) {
         try {
            int var2 = ((MetadataValue)var1.getMetadata(Xqedii_3t6vlza.Xqedii_zzhg8u0gh3fy("JpkGhHwsNsM2ZjActGCmg1q7gViiKlSsjEggYOwFp7XwJ7LGhOEDDqHBMSI="))
                  .get(Xqedii_3t6vlza.Xqedii_yhod2053suah(934308983, 24)))
               .asInt();
            return var2 >= Xqedii_3t6vlza.Xqedii_yhod2053suah(934309239, 8) && var2 <= Xqedii_3t6vlza.Xqedii_ethiau02zycv(859265481, 26)
               ? var2
               : Xqedii_3t6vlza.Xqedii_ethiau02zycv(-1663211740, 28);
         } catch (Exception var3) {
            return Xqedii_3t6vlza.Xqedii_yhod2053suah(934308983, 8);
         }
      } else {
         return Xqedii_3t6vlza.Xqedii_28lexfnl53tlu(1815362820, 11);
      }
   }

   public static final class Placement {
      public static final String Xqedii_2uhgvd4tli712 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final Vector Xqedii_ufth71j;
      public final Vector Xqedii_3k7oxm6;

      public Placement(Vector var1, Vector var2) {
         this.Xqedii_ufth71j = var1;
         this.Xqedii_3k7oxm6 = var2;
      }

      public Vector location() {
         if ((-206405516 * -206405516 - -206405516 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.Xqedii_ufth71j;
         }
      }

      public Vector scale() {
         if (((-1383990841 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.Xqedii_3k7oxm6;
         }
      }
   }
}
