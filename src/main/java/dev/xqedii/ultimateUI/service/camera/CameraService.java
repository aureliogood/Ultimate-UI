package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1gryrhw;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class CameraService extends CameraSessions {
   public static final String Xqedii_1os5w2orl3lxc = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public CameraService(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
      this.reloadConfiguration();
      this.registerShaderCursorTimeGuard();
      this.Xqedii_3ldoae7();
   }

   public void syncCursorNpc(Player var1, boolean var2) {
      if (((-1959793866 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2seki4b != null && this.isCameraActive(var1)) {
         boolean var3 = this.Xqedii_2seki4b.isSpawned(var1.getUniqueId());
         if (!var2) {
            if (var3) {
               this.Xqedii_2seki4b.despawn(var1);
            }
         } else if (!var3) {
            Location var4 = this.getCameraBaseLocation(var1);
            if (var4 != null && var4.getWorld() != null) {
               this.Xqedii_2seki4b.spawn(var1, var4);
            }
         }
      }
   }

   public void start(Player var1, double var2, double var4, double var6, double var8, double var10, double var12, String var14, double var15, boolean var17) {
      if ((2083689144 * 2083689144 - 2083689144 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.start(var1, var2, var4, var6, var8, var10, var12, var14, var15, var17, null);
      }
   }

   public void start(
      Player var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      String var14,
      double var15,
      boolean var17,
      DoubleSupplier var18
   ) {
      if ((1652103246 ^ 1652103246) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var19 = var1.getUniqueId();
         Location var20 = this.Xqedii_13w07gw(var1);
         Location var21 = this.isCameraActive(var1) ? this.getCameraBaseLocation(var1) : null;
         this.Xqedii_2xomr7i(var1, (Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662975545, 19) != 0));
         Location var22 = var1.getLocation().clone();
         if (var20 != null && var20.getWorld() != null && var20.getWorld().equals(var22.getWorld())) {
            if (var20.distanceSquared(var22) > Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(6482950830172643950L, 54))) {
               this.Xqedii_11is6fi.suppressEditorTeleportClose(var1, Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(8193993018776244184L, 30));
               Xqedii_38o2zes.Xqedii_fxq2htx(var1, var20);
               var22 = var1.getLocation().clone();
            }

            if (var22.getWorld() != null && var22.getWorld().equals(var20.getWorld())) {
               var20 = var22;
            }
         } else {
            var20 = var22;
         }

         if (var20 == null || var20.getWorld() == null) {
            var20 = var1.getLocation().clone();
         }

         if (var21 != null && var21.getWorld() != null && var21.getWorld().equals(var20.getWorld())) {
            var20 = var21.clone();
            if (var20.distanceSquared(var1.getLocation()) > Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(-5480842413364263716L, 55))) {
               this.Xqedii_11is6fi.suppressEditorTeleportClose(var1, Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-8366945331248696504L, 7));
               Xqedii_38o2zes.Xqedii_fxq2htx(var1, var20);
            }
         }

         boolean var23 = this.isShaderCursorWanted(var1);
         if (this.Xqedii_1ilze2o != null && this.Xqedii_1ilze2o.isFixShadersEnabled(var1)) {
            var20.setPitch(Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1600679081, 13)));
            if (Math.abs(var1.getLocation().getPitch()) > Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1664129608, 26))) {
               Xqedii_38o2zes.Xqedii_1clfsd0(var1, var1.getLocation().getYaw(), Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 10)));
            }
         }

         if (var23) {
            var20.setPitch(Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(302042562, 2)));
            Xqedii_38o2zes.Xqedii_1clfsd0(
               var1,
               Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 19)),
               Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1792283379, 2))
            );
         }

         Location var24 = var20.clone();
         this.Xqedii_1npzu61.put(var19, Boolean.valueOf((Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1125580345, 29) != 0)));
         this.Xqedii_13g85ac(var1);
         this.Xqedii_20i24gg.put(var19, var20.clone());
         this.Xqedii_1ilze2o
            .setHudAnchorOrigin(
               var1,
               var20.clone()
                  .add(
                     Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(8958910505684961553L, 12)),
                     Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-6825164043968862285L, 27)),
                     Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_26zz0vzoi15yf(4512820408481345827L, 29))
                  )
            );
         this.Xqedii_sa0ugb8.put(var19, var15);
         int var25 = this.Xqedii_3lrjl61.merge(var19, Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1600670889, 13), Integer::sum);
         Location var26 = var20.clone()
            .add(
               Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(1740619509946162580L, 5)),
               Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(-8235032194021425469L, 33)),
               Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_26zz0vzoi15yf(4512820408481345827L, 55))
            );
         Location var27 = var26.clone()
            .add(
               Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(653440123071068638L, 60)),
               Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(3484835793756607094L, 63)),
               Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-2447405696808803463L, 52))
            );
         if (var23) {
            var27.setY(this.Xqedii_axq4lm3(var27, var26.getY()));
         }

         TextDisplay var28 = (TextDisplay)var1.getWorld().spawn(var26, TextDisplay.class);
         TextDisplay var29 = (TextDisplay)var1.getWorld().spawn(var27, TextDisplay.class);
         this.Xqedii_1ilze2o.enforceFullBrightness(var28);
         this.Xqedii_1ilze2o.enforceFullBrightness(var29);
         var28.setPersistent((Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 16) != 0));
         var29.setPersistent((Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-2078015077, 27) != 0));
         var28.setMetadata(
            Xqedii_1gryrhw.Xqedii_1ls6n5izs316s("GgbFcWmYJdxEzI/hgzcsZBWzJgOy/DkGUfgLj6Yg9e2p665xiNrpJI1MTNjW4ADHmqfJXdCayoshg5riZX7uKhVet2EMuQ=="),
            new FixedMetadataValue(this.Xqedii_11is6fi, Boolean.valueOf((Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451385, 7) != 0)))
         );
         var29.setMetadata(
            Xqedii_1gryrhw.Xqedii_1ls6n5izs316s("GgbFcWmYJdxEzI/hgzcsZBWzJgOy/DkGUfgLj6Yg9e2p665xiNrpJI1MTNjW4ADHmqfJXdCayoshg5riZX7uKhVet2EMuQ=="),
            new FixedMetadataValue(this.Xqedii_11is6fi, Boolean.valueOf((Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451261, 2) != 0)))
         );
         var28.setGravity((Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-791063874, 22) != 0));
         var29.setGravity((Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 27) != 0));
         var29.addPassenger(var1);
         this.Xqedii_3hes1gs(var1, var28);
         this.Xqedii_3hes1gs(var1, var29);
         this.Xqedii_1ilze2o.setHudMountEntity(var1, var28);
         double var30 = var23
            ? Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(7885925668423818998L, 59))
            : Math.max(Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(3618631665414348934L, 32)), var10);
         double var32 = this.Xqedii_1484j9j(var12);
         String var34 = var23
            ? Xqedii_1gryrhw.Xqedii_1ls6n5izs316s("bbNMhvS29Z/HEaMgSF1jLvZKYfzYvrtdHh5vsA==")
            : (var14 != null && !var14.isBlank() ? var14 : Xqedii_1gryrhw.Xqedii_1ls6n5izs316s("d6vttvAI538te0jKh1Ql1EnqGB9hJDyfJ7GisfHe"));
         Xqedii_38o2zes.Xqedii_2sj63w1(
            this.Xqedii_11is6fi,
            var1,
            () -> {
               if ((-1314473589 ^ -1314473589) != 0) {
                  throw new IllegalStateException();
               } else if (!var1.isOnline()) {
                  this.Xqedii_2xomr7i(var1, (Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(1208170264, 4) != 0));
               } else {
                  Integer var24x = this.Xqedii_3lrjl61.get(var1.getUniqueId());
                  if (var24x != null && var24x == var25) {
                     if (!this.Xqedii_1npzu61.getOrDefault(var1.getUniqueId(), Boolean.valueOf((Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(604085124, 3) != 0)))) {
                        this.Xqedii_2xomr7i(var1, (Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1203770644, 18) != 0));
                     } else {
                        var1.addPotionEffect(
                           new PotionEffect(
                              PotionEffectType.INVISIBILITY,
                              Xqedii_1gryrhw.Xqedii_29328aje13k7b(1662451256, 20),
                              Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-842919424, 18),
                              (Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1792283379, 2) != 0),
                              (Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1751951711, 21) != 0)
                           )
                        );
                        this.Xqedii_3q5471n(var1);
                        if (var17 && this.Xqedii_2seki4b != null) {
                           this.Xqedii_2seki4b.spawn(var1, var24);
                        }

                        float var25x = var1.getLocation().getPitch();
                        if (this.Xqedii_1ilze2o.isFixShadersEnabled(var1)) {
                           if (Math.abs(var25x) > Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(351633736, 17))) {
                              Xqedii_38o2zes.Xqedii_1clfsd0(
                                 var1, var1.getLocation().getYaw(), Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-601808884, 22))
                              );
                           }

                           var25x = Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_221q1evxowsxf(736955797, 10));
                        }

                        this.spectate(var1, var28);
                        if (var23) {
                           Xqedii_38o2zes.Xqedii_1clfsd0(
                              var1,
                              Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 21)),
                              Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 24))
                           );
                           var25x = Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(53938248, 12));
                           this.Xqedii_29t98z3(var1, Xqedii_31s8nnd(var32 * Xqedii_1rcrg7y(var18)));
                        }

                        double[] var10000 = new double[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1666645561, 22)];
                        var10000[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 30)] = var23
                           ? Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(3654365793920000134L, 57))
                           : var2 / Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_26zz0vzoi15yf(4512820408548454691L, 28)) + var6;
                        double[] var26x = var10000;
                        var10000 = new double[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(849706401, 31)];
                        var10000[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 5)] = var23
                           ? Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-2416318336836756376L, 42))
                           : (var25x + Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(3620890269059162246L, 53)))
                                 / Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(5112636822625233123L, 37))
                                 * var4
                              + var8;
                        double[] var27x = var10000;
                        var10000 = new double[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662418489, 15)];
                        var10000[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-2071973008, 0)] = Double.longBitsToDouble(
                           Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(8193993012333793240L, 30)
                        );
                        double[] var28x = var10000;
                        var10000 = new double[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451321, 6)];
                        var10000[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 30)] = Double.longBitsToDouble(
                           Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(326720061535534319L, 59)
                        );
                        double[] var29x = var10000;
                        float[] var43 = new float[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1203770644, 12)];
                        var43[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1257980773, 8)] = var1.getLocation().getYaw();
                        float[] var30x = var43;
                        float[] var44 = new float[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-971898675, 26)];
                        var44[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 15)] = var25x;
                        float[] var31 = var44;
                        var10000 = new double[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451225, 5)];
                        var10000[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(227879917, 26)] = Double.longBitsToDouble(
                           Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(-3298897361623801351L, 9)
                        );
                        double[] var32x = var10000;
                        var10000 = new double[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1203770644, 2)];
                        var10000[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1582127747, 23)] = Double.longBitsToDouble(
                           Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(-7094270952292689036L, 53)
                        );
                        double[] var33 = var10000;
                        boolean[] var47 = new boolean[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(814745198, 29)];
                        var47[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 10)] = (Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1473911594, 11) != 0);
                        boolean[] var34x = var47;
                        int[] var48 = new int[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1699412802, 0)];
                        var48[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-1878626800, 5)] = Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(107876496, 13);
                        int[] var35 = var48;
                        double var36 = this.Xqedii_mokixov(var1.getUniqueId(), var15);
                        this.Xqedii_1ilze2o
                           .addHud(
                              var1,
                              Xqedii_1gryrhw.Xqedii_1ls6n5izs316s("zlkGnU9zb6ajNqOqVKIHUqqjNoI3PcAa58LrZn8PlgvQbMmSKliybw=="),
                              new Vector(
                                 var26x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-1203617767, 23)],
                                 var27x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 5)],
                                 var36
                              ),
                              new Vector(var30, var30, Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(3906862042168991878L, 60))),
                              var34,
                              TextAlignment.CENTER,
                              TextAlignment.CENTER,
                              (Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-158938475, 17) != 0),
                              Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1210062100, 20)
                           );
                        this.Xqedii_30tju32(var1);
                        this.refreshClientBarrierCube(var1);
                        int[] var49 = new int[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(2107716261, 15)];
                        var49[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1582127747, 23)] = Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 1);
                        int[] var38 = var49;
                        int[] var50 = new int[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-79534774, 16)];
                        var50[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 28)] = Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 19);
                        int[] var39 = var50;
                        this.Xqedii_3hb6nik(
                           var1,
                           () -> {
                              if ((184928393 * 184928393 + 184928393 & 1) != 0) {
                                 throw new IllegalStateException();
                              } else if (this.isShaderCursorActive(var1)) {
                                 Location var11 = var1.getLocation();
                                 float var12xx = var11.getYaw();
                                 float var13 = var11.getPitch();
                                 int var14xx = Xqedii_31s8nnd(var32 * Xqedii_1rcrg7y(var18));
                                 var28x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-158938475, 17)] = Xqedii_95gphhd(
                                    var28x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 0)],
                                    Xqedii_1pc3vv6(var12xx - var30x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 27)]),
                                    var14xx
                                 );
                                 var29x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(863011968, 16)] = Xqedii_2okyqdr(var13, var14xx);
                                 var30x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 1)] = var12xx;
                                 var31[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 9)] = var13;
                                 var26x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 8)] = Xqedii_3s259ju(
                                    var28x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 23)], var14xx
                                 );
                                 var27x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 16)] = Xqedii_2atcf61(
                                    var29x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1347144108, 12)], var14xx
                                 );
                                 if (this.Xqedii_2g25cps != null) {
                                    this.Xqedii_2g25cps
                                       .onCursor(
                                          var1,
                                          var26x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-1039007539, 26)],
                                          var27x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-896141690, 1)]
                                       );
                                 }
                              }
                           }
                        );
                        Xqedii_38o2zes.Xqedii_j3mggbv(
                           this.Xqedii_11is6fi,
                           var1,
                           Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-1767622970922908019L, 46),
                           Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(-5700591952616988513L, 23),
                           var28xx -> {
                              if ((1981756624 * 1981756624 + 1981756624 & 1) != 0) {
                                 throw new IllegalStateException();
                              } else if (!var1.isOnline()) {
                                 this.Xqedii_2xomr7i(var1, (Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(302042566, 2) != 0));
                                 var28xx.cancel();
                              } else {
                                 Integer var29xx = this.Xqedii_3lrjl61.get(var1.getUniqueId());
                                 if (var29xx != null && var29xx == var25) {
                                    if (!this.Xqedii_1npzu61
                                       .getOrDefault(var1.getUniqueId(), Boolean.valueOf((Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 5) != 0)))) {
                                       this.Xqedii_2xomr7i(var1, (Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1590516355, 23) != 0));
                                       var28xx.cancel();
                                    } else {
                                       if (!var1.isInsideVehicle()) {
                                          if (var38[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 7)] <= 0) {
                                             var38[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1779005750, 9)] = Xqedii_1gryrhw.Xqedii_29328aje13k7b(485032389, 31);
                                             if (var29.isValid() && !var29.isDead() && var28.isValid() && !var28.isDead()) {
                                                boolean var30xx = var29.addPassenger(var1);
                                                if (var30xx) {
                                                   this.spectate(var1, var28);
                                                   var39[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 1)] = Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(
                                                      1203770628, 3
                                                   );
                                                }
                                             }
                                          } else {
                                             var38[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 2)] -= Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451225, 5);
                                          }
                                       } else {
                                          var38[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(53938248, 12)] = Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 11);
                                       }

                                       Location var53 = var1.getLocation();
                                       double var31x = var32 * Xqedii_1rcrg7y(var18);
                                       boolean var33x = this.isShaderCursorActive(var1);
                                       int var34xx = Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 1);
                                       if (var33x) {
                                          var34xx = Xqedii_31s8nnd(var31x);
                                          this.Xqedii_1bh5wam(var1, var34xx);
                                          this.Xqedii_3siyzd1(var1);
                                          this.Xqedii_ma0sujh(var1);
                                          this.Xqedii_qd4x725(var1);
                                          this.Xqedii_239r2zk(var1, this.Xqedii_f9unzdz(var1), (Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1751951711, 21) != 0));
                                       }

                                       float var35x = var53.getYaw();
                                       float var36x = var35x - var30x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(1726023936, 17)];
                                       var30x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(863011968, 16)] = var35x;
                                       Vector var37 = this.Xqedii_28k36d4.get(var1.getUniqueId());
                                       int var38x = var37 != null
                                          ? Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1203770644, 8)
                                          : Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(302042562, 2);
                                       if (var36x > Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1259334377, 2))) {
                                          var36x -= Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(923566915, 20));
                                       } else if (var36x < Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(1751572623, 9))) {
                                          var36x += Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-68350821, 10));
                                       }

                                       int var39x = var39[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-896141690, 1)] > 0
                                          ? Xqedii_1gryrhw.Xqedii_29328aje13k7b(-588709433, 30)
                                          : Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 23);
                                       if (var39x != 0) {
                                          var39[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-519503770, 25)] -= Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-971898675, 26);
                                       }

                                       if (!var33x
                                          && var39x == 0
                                          && Math.abs(var36x) > Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(-2759887522923520361L, 18))) {
                                          var26x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-842919424, 18)] += var36x
                                             / Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(7009086572999860433L, 8))
                                             * var2
                                             * var31x;
                                       }

                                       float var40x = var53.getPitch();
                                       if (var38x != 0) {
                                          Float var41x = this.Xqedii_2ebsa64.get(var1.getUniqueId());
                                          if (var41x != null && Float.isFinite(var41x)) {
                                             if (Math.abs(var40x - var41x) > Float.intBitsToFloat(Xqedii_1gryrhw.Xqedii_29328aje13k7b(-855105665, 27))) {
                                                Xqedii_38o2zes.Xqedii_1clfsd0(var1, var35x, var41x);
                                             }

                                             var40x = var41x;
                                          }
                                       }

                                       float var54 = var40x - var31[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 6)];
                                       var31[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-2033543690, 25)] = var40x;
                                       if (!var33x
                                          && var39x == 0
                                          && var38x == 0
                                          && Math.abs(var54) > Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_26zz0vzoi15yf(274826880268961321L, 25))) {
                                          var27x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(1208170248, 4)] += var54
                                             / Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-3333526812771079624L, 35))
                                             * var4
                                             * var31x;
                                       }

                                       if (!var33x && var38x == 0 && var34x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-896141690, 1)]) {
                                          double var42x = var32x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(923289603, 20)];
                                          if (!Double.isFinite(var42x)
                                             || var42x < Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_3na9xzh18lsvy(3618631666017280134L, 30))) {
                                             var42x = var26x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 19)];
                                          }

                                          var26x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 11)] = var42x;
                                          double var44x = var33[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 3)];
                                          if (Double.isFinite(var44x)) {
                                             var27x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(923289603, 20)] = var44x;
                                          }
                                       }

                                       if (var33x) {
                                          if (var39x == 0) {
                                             var28x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 9)] = Xqedii_95gphhd(
                                                var28x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1518493262, 7)], var36x, var34xx
                                             );
                                          }

                                          var29x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 15)] = Xqedii_2okyqdr(var40x, var34xx);
                                          if (this.Xqedii_wnk0odx(
                                             var1,
                                             var35x,
                                             var40x,
                                             var28x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(53938248, 12)],
                                             var29x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 5)]
                                          )) {
                                             var30x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-519503770, 25)] = Xqedii_1pc3vv6(
                                                (float)var28x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 24)]
                                             );
                                             var31[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 7)] = (float)var29x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(
                                                431505984, 15
                                             )];
                                          }

                                          var26x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-317876949, 18)] = Xqedii_3s259ju(
                                             var28x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 16)], var34xx
                                          );
                                          var27x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 24)] = Xqedii_2atcf61(
                                             var29x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-791063874, 22)], var34xx
                                          );
                                       } else if (var38x == 0) {
                                          if (var26x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1271507793, 20)]
                                             < Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(870309754973081290L, 4))) {
                                             var26x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(13484562, 10)] = Double.longBitsToDouble(
                                                Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-2416319444896375704L, 42)
                                             );
                                          } else if (var26x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 13)] > var2) {
                                             var26x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 25)] = var2;
                                          }

                                          double var56 = var4 + var8;
                                          if (var27x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 19)] < var8) {
                                             var27x[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1420801078, 4)] = var8;
                                          } else if (var27x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 7)] > var56) {
                                             var27x[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 27)] = var56;
                                          }
                                       }

                                       double var55 = var37 == null ? var26x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-1039007539, 26)] : var37.getX();
                                       double var57 = var37 == null ? var27x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 22)] : var37.getY();
                                       int var46x = !(
                                                Math.abs(var55 - var32x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(1726023936, 17)])
                                                   > Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2o14tfl1vqtc9(-8699585914787406559L, 31))
                                             )
                                             && !(
                                                Math.abs(var57 - var33[Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-317876949, 18)])
                                                   > Double.longBitsToDouble(Xqedii_1gryrhw.Xqedii_2a8penmzb3osa(-8142902342440292679L, 10))
                                             )
                                          ? Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 27)
                                          : Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1203770644, 20);
                                       if (var46x != 0) {
                                          Entity var47x = this.Xqedii_1ilze2o
                                             .getHud(var1, Xqedii_1gryrhw.Xqedii_1ls6n5izs316s("zlkGnU9zb6ajNqOqVKIHUqqjNoI3PcAa58LrZn8PlgvQbMmSKliybw=="));
                                          if (var47x != null) {
                                             double var48x = this.Xqedii_mokixov(var1.getUniqueId(), var15);
                                             this.Xqedii_1ilze2o
                                                .moveHud(var47x, new Vector(var55, var57, var48x), this.Xqedii_139042g(), this.Xqedii_2jfx1cj());
                                          }

                                          var32x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(1075427394, 7)] = var55;
                                          var33[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 20)] = var57;
                                       }

                                       if (this.Xqedii_2g25cps != null) {
                                          int var58 = (var38x != 0) != var34x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 23)]
                                             ? Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662516793, 16)
                                             : Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(151021281, 1);
                                          int var59 = var46x == 0 && var58 == 0 && var38x == 0
                                             ? Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 18)
                                             : Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(1203770644, 12);
                                          if (var59 == 0) {
                                             var35[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 14)] += Xqedii_1gryrhw.Xqedii_221q1evxowsxf(1600670889, 13);
                                             var59 = var35[Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1662451257, 9)]
                                                   >= Xqedii_1gryrhw.Xqedii_29328aje13k7b(-1666645561, 21)
                                                ? Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-79534774, 16)
                                                : Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1779005750, 9);
                                          }

                                          if (var59 != 0) {
                                             double var49x = var38x != 0 ? var26x[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-2078015077, 27)] : var55;
                                             double var51 = var38x != 0 ? var27x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 7)] : var57;
                                             this.Xqedii_2g25cps.onCursor(var1, var49x, var51);
                                             var35[Xqedii_1gryrhw.Xqedii_259ldjk2o2pse(-842919424, 18)] = Xqedii_1gryrhw.Xqedii_221q1evxowsxf(-1518493262, 7);
                                          }
                                       }

                                       var34x[Xqedii_1gryrhw.Xqedii_2gjb9flxeaah1(-1203770645, 25)] = (var38x != 0);
                                    }
                                 } else {
                                    var28xx.cancel();
                                 }
                              }
                           }
                        );
                     }
                  }
               }
            },
            Xqedii_1gryrhw.Xqedii_26zz0vzoi15yf(-4512820408481345828L, 37)
         );
      }
   }
}
