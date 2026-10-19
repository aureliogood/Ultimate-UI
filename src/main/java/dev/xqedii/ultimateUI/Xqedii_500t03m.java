package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.bossbar.BossbarEntityRect;
import dev.xqedii.ultimateUI.service.bossbar.BossbarHudSnapshot;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Xqedii_500t03m {
   public static final String Xqedii_e56hho9lxpa4 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int Xqedii_25ndeq5 = 48;

   public static Set<String> Xqedii_l2kdved(List<BossbarHudSnapshot> var0, List<Xqedii_1il8kkh> var1, Map<Integer, double[]> var2, List<BossbarEntityRect> var3) {
      if ((552435704 * 552435704 + 552435704 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isEmpty()) {
         int var4 = var0.size();
         double[][] var5 = new double[var4][];
         if (var1 != null) {
            for (Xqedii_1il8kkh var7 : var1) {
               if (var7.Xqedii_1177et8 >= 0 && var7.Xqedii_1177et8 < var4) {
                  double[] var8 = var5[var7.Xqedii_1177et8];
                  if (var8 == null) {
                     int var10001 = var7.Xqedii_1177et8;
                     double[] var10002 = new double[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474095600, 12)];
                     var10002[Xqedii_2t9igks.Xqedii_332oacil0nf1n(1180278341, 0)] = var7.Xqedii_edx81yn;
                     var10002[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(-1673371664, 31)] = var7.Xqedii_2wzxbdl;
                     var10002[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180278374, 5)] = var7.Xqedii_25pg3mz;
                     var10002[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(2084724720, 29)] = var7.Xqedii_yoez7kl;
                     var5[var10001] = var10002;
                  } else {
                     var8[Xqedii_2t9igks.Xqedii_332oacil0nf1n(1180278341, 3)] = Math.min(
                        var8[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1127629043, 13)], var7.Xqedii_edx81yn
                     );
                     var8[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111968, 4)] = Math.min(
                        var8[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(1004648345, 26)], var7.Xqedii_2wzxbdl
                     );
                     var8[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(460952574, 6)] = Math.max(
                        var8[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111968, 3)], var7.Xqedii_25pg3mz
                     );
                     var8[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1146723910, 24)] = Math.max(
                        var8[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1717149254, 28)], var7.Xqedii_yoez7kl
                     );
                  }
               }
            }
         }

         boolean[] var13 = new boolean[var4];
         ArrayDeque var14 = new ArrayDeque();
         if (var3 != null) {
            var14.addAll(var3);
         }

         for (int var15 = Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 14); var15 < var4; var15++) {
            BossbarHudSnapshot var9 = (BossbarHudSnapshot)var0.get(var15);
            double[] var10 = var2 == null ? null : (double[])var2.get(var15);
            int var11 = var2 != null && var2.containsKey(var15)
               ? Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474107888, 12)
               : Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-469178848, 29);
            if (var9.entityOnly || var11 != 0) {
               var13[var15] = (Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-2096094312, 23) != 0);
               double[] var12 = var5[var15] != null ? var5[var15] : var10;
               if (var12 != null) {
                  var14.add(Xqedii_3av9z0j(var12, var9.layer));
               }
            }
         }

         if (var14.isEmpty()) {
            return Collections.emptySet();
         } else {
            while (!var14.isEmpty()) {
               BossbarEntityRect var16 = (BossbarEntityRect)var14.poll();

               for (int var18 = Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-607347728, 9); var18 < var4; var18++) {
                  double[] var20 = var5[var18];
                  if (!var13[var18] && var20 != null) {
                     BossbarHudSnapshot var21 = (BossbarHudSnapshot)var0.get(var18);
                     if (!(var21.layer > var16.layer)
                        && var16.Xqedii_2m8wxtt(
                           var20[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(275907699, 20)],
                           var20[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(205676528, 28)],
                           var20[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1214693407, 10)],
                           var20[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-563802234, 12)]
                        )) {
                        var13[var18] = (Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(339894256, 27) != 0);
                        var14.add(
                           new BossbarEntityRect(
                              var20[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 27)],
                              var20[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180278342, 2)],
                              var20[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-106536518, 30)],
                              var20[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111216, 8)],
                              var21.layer
                           )
                        );
                     }
                  }
               }
            }

            HashSet var17 = new HashSet();

            for (int var19 = Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 17); var19 < var4; var19++) {
               if (var13[var19]) {
                  var17.add(((BossbarHudSnapshot)var0.get(var19)).id);
               }
            }

            return var17;
         }
      } else {
         return Collections.emptySet();
      }
   }

   public static Xqedii_2rmjlt7 Xqedii_2jtypg6(
      List<BossbarHudSnapshot> var0, List<Xqedii_1il8kkh> var1, Map<Integer, double[]> var2, List<BossbarEntityRect> var3, Set<String> var4
   ) {
      if ((1923946775 ^ 1923946775) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isEmpty() && var1 != null && var4 != null && !var4.isEmpty()) {
         int var5 = var0.size();
         HashSet var6 = new HashSet();

         for (int var7 = Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-254030693, 1); var7 < var5; var7++) {
            BossbarHudSnapshot var8 = (BossbarHudSnapshot)var0.get(var7);
            if (var4.contains(var8.id) && !var8.entityOnly && (var2 == null || !var2.containsKey(var7))) {
               var6.add(var7);
            }
         }

         if (var6.isEmpty()) {
            return new Xqedii_2rmjlt7(var4, var1);
         } else {
            for (Xqedii_1il8kkh var19 : var1) {
               if (var19.Xqedii_2d73yig != 0) {
                  var6.remove(var19.Xqedii_1177et8);
               }
            }

            if (var6.isEmpty()) {
               return new Xqedii_2rmjlt7(var4, var1);
            } else {
               ArrayList var18 = new ArrayList();
               if (var3 != null) {
                  var18.addAll(var3);
               }

               double[][] var20 = new double[var5][];

               for (Xqedii_1il8kkh var10 : var1) {
                  if (var10.Xqedii_1177et8 >= 0 && var10.Xqedii_1177et8 < var5) {
                     double[] var11 = var20[var10.Xqedii_1177et8];
                     if (var11 == null) {
                        int var10001 = var10.Xqedii_1177et8;
                        double[] var10002 = new double[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180282438, 12)];
                        var10002[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(482614401, 10)] = var10.Xqedii_edx81yn;
                        var10002[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(482613377, 10)] = var10.Xqedii_2wzxbdl;
                        var10002[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(273810547, 20)] = var10.Xqedii_25pg3mz;
                        var10002[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1176084038, 21)] = var10.Xqedii_yoez7kl;
                        var20[var10001] = var10002;
                     } else {
                        var11[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(1875078962, 27)] = Math.min(
                           var11[Xqedii_2t9igks.Xqedii_332oacil0nf1n(1180278341, 27)], var10.Xqedii_edx81yn
                        );
                        var11[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1016122761, 3)] = Math.min(
                           var11[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(230476255, 5)], var10.Xqedii_2wzxbdl
                        );
                        var11[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(298598728, 6)] = Math.max(
                           var11[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180409414, 17)], var10.Xqedii_25pg3mz
                        );
                        var11[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(1843810552, 8)] = Math.max(
                           var11[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111600, 7)], var10.Xqedii_yoez7kl
                        );
                     }
                  }
               }

               for (int var21 = Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 1); var21 < var5; var21++) {
                  if (!var6.contains(var21) && var4.contains(((BossbarHudSnapshot)var0.get(var21)).id)) {
                     double[] var23 = var20[var21];
                     if (var23 != null) {
                        var18.add(
                           new BossbarEntityRect(
                              var23[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 19)],
                              var23[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(1644458768, 28)],
                              var23[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180276294, 11)],
                              var23[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-607346192, 9)],
                              ((BossbarHudSnapshot)var0.get(var21)).layer
                           )
                        );
                     }
                  }
               }

               if (var18.isEmpty()) {
                  return new Xqedii_2rmjlt7(var4, var1);
               } else {
                  HashSet var22 = new HashSet();
                  HashMap var24 = new HashMap();

                  for (int var12 : (Iterable<Integer>) (var6)) {

                     BossbarHudSnapshot var13 = (BossbarHudSnapshot)var0.get(var12);
                     ArrayList var14 = new ArrayList();

                     for (Xqedii_1il8kkh var16 : var1) {
                        if (var16.Xqedii_1177et8 == var12) {
                           var14.add(var16);
                        }
                     }

                     List var32 = Xqedii_13u07rr(var14, var13, var18);
                     if (var32 != null) {
                        var22.add(var12);
                        var24.put(var12, var32);
                     }
                  }

                  if (var22.isEmpty()) {
                     return new Xqedii_2rmjlt7(var4, var1);
                  } else {
                     HashSet var26 = new HashSet(var4);

                     for (int var29 : (Iterable<Integer>) (var22)) {

                        var26.remove(((BossbarHudSnapshot)var0.get(var29)).id);
                     }

                     ArrayList var28 = new ArrayList(var1.size());
                     HashSet var30 = new HashSet();

                     for (Xqedii_1il8kkh var33 : var1) {
                        if (!var22.contains(var33.Xqedii_1177et8)) {
                           var28.add(var33);
                        } else if (var30.add(var33.Xqedii_1177et8)) {
                           var28.addAll((Collection)var24.get(var33.Xqedii_1177et8));
                        }
                     }

                     return new Xqedii_2rmjlt7(var26, var28);
                  }
               }
            }
         }
      } else {
         return new Xqedii_2rmjlt7(var4 == null ? Collections.emptySet() : var4, var1);
      }
   }

   public static List<Xqedii_1il8kkh> Xqedii_13u07rr(List<Xqedii_1il8kkh> var0, BossbarHudSnapshot var1, List<BossbarEntityRect> var2) {
      if (((2124711716 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();

         for (Xqedii_1il8kkh var5 : var0) {
            ArrayList var6 = new ArrayList();
            int[] var10001 = new int[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111920, 4)];
            var10001[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 24)] = var5.Xqedii_1t89g9g;
            var10001[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111856, 7)] = var5.Xqedii_qw73drj;
            var10001[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-434068472, 13)] = var5.Xqedii_1t89g9g + var5.Xqedii_3kc0ndq;
            var10001[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(472014832, 21)] = var5.Xqedii_qw73drj + var5.Xqedii_19an9ij;
            var6.add(var10001);

            for (BossbarEntityRect var8 : var2) {
               if (!(var8.layer < var1.layer)) {
                  ArrayList var9 = new ArrayList();

                  for (int[] var11 : (Iterable<int[]>) (var6)) {

                     Xqedii_1afw8s1(var11, var8, var9);
                  }

                  var6 = var9;
                  if (var9.size() > Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-938357683, 30)) {
                     return null;
                  }
               }
            }

            for (int[] var13 : (Iterable<int[]>) (var6)) {

               int var14 = var13[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(921905148, 7)] - var13[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(1865576387, 11)];
               int var15 = var13[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-2079791584, 29)] - var13[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1127620851, 13)];
               if (var14 > 0 && var15 > 0) {
                  var3.add(
                     Xqedii_1il8kkh.Xqedii_1jrrn9i(
                        var5.Xqedii_1177et8,
                        var5.Xqedii_25muecf,
                        var5.Xqedii_f5uv5g9,
                        var13[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(654063347, 23)],
                        var13[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1214694431, 10)],
                        var14,
                        var15,
                        var5.Xqedii_m3xyrif,
                        var5.Xqedii_2sb63xq,
                        var5.Xqedii_22jt9mc
                     )
                  );
               }
            }
         }

         return var3;
      }
   }

   public static void Xqedii_1afw8s1(int[] var0, BossbarEntityRect var1, List<int[]> var2) {
      if ((-198274647 * -198274647 - -198274647 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = (int)Math.floor(var1.left);
         int var4 = (int)Math.floor(var1.top);
         int var5 = (int)Math.ceil(var1.right);
         int var6 = (int)Math.ceil(var1.bottom);
         if (var5 > var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(149299428, 5)]
            && var3 < var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(86001457, 24)]
            && var6 > var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(274859123, 20)]
            && var4 < var0[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(499277808, 23)]) {
            if (var4 > var0[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180278342, 9)]) {
               int[] var10001 = new int[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474636272, 17)];
               var10001[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 20)] = var0[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1127629043, 13)];
               var10001[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(411114692, 26)] = var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(1099436492, 22)];
               var10001[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1179754054, 19)] = var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-868136943, 14)];
               var10001[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474046448, 16)] = var4;
               var2.add(var10001);
            }

            if (var6 < var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(270768258, 31)]) {
               int[] var9 = new int[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(469917680, 20)];
               var9[Xqedii_2t9igks.Xqedii_332oacil0nf1n(1180278341, 30)] = var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(478223556, 26)];
               var9[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(482500592, 23)] = var6;
               var9[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1723866697, 18)] = var0[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-906031684, 21)];
               var9[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(545523942, 21)] = var0[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1180278278, 5)];
               var2.add(var9);
            }

            int var7 = Math.max(var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(102778673, 24)], var4);
            int var8 = Math.min(var0[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474046448, 16)], var6);
            if (var8 > var7) {
               if (var3 > var0[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(1692370654, 20)]) {
                  int[] var10 = new int[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(1843810808, 8)];
                  var10[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-2128821220, 2)] = var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(1930457604, 12)];
                  var10[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-434060280, 13)] = var7;
                  var10[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474109936, 10)] = var3;
                  var10[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(499277808, 23)] = var8;
                  var2.add(var10);
               }

               if (var5 < var0[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-906031684, 21)]) {
                  int[] var11 = new int[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-254030685, 1)];
                  var11[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111984, 7)] = var5;
                  var11[Xqedii_2t9igks.Xqedii_3r3xl5ag0bu26(474111988, 2)] = var7;
                  var11[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-31753837, 30)] = var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-1736273885, 15)];
                  var11[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(-1214692383, 10)] = var8;
                  var2.add(var11);
               }
            }
         } else {
            var2.add(var0);
         }
      }
   }

   public static BossbarEntityRect Xqedii_3av9z0j(double[] var0, double var1) {
      if ((401392863 * 401392863 - 401392863 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = Math.hypot(
            var0[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1182375494, 21)] - var0[Xqedii_2t9igks.Xqedii_332oacil0nf1n(1180278341, 20)],
            var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(276896964, 26)] - var0[Xqedii_2t9igks.Xqedii_2mgngna4gh25c(230476255, 5)]
         );
         double var5 = (var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(-469178848, 29)] + var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(37324841, 3)])
            / Double.longBitsToDouble(Xqedii_2t9igks.Xqedii_3qgvigubcm609(-5368494067468456850L, 55));
         double var7 = (var0[Xqedii_2t9igks.Xqedii_42bvtdpmt4vp(1644970126, 17)] + var0[Xqedii_2t9igks.Xqedii_332oacil0nf1n(-1314496070, 26)])
            / Double.longBitsToDouble(Xqedii_2t9igks.Xqedii_2alv4la87qsfe(-4702451484808749832L, 21));
         return new BossbarEntityRect(var5 - var3, var7 - var3, var5 + var3, var7 + var3, var1);
      }
   }
}
