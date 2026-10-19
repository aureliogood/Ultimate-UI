package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1019iyu;
import dev.xqedii.ultimateUI.Xqedii_1iy6b4g;
import dev.xqedii.ultimateUI.Xqedii_3ktetqb;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class ScrollViewState {
   public static final String Xqedii_2i5mrximue0nh = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final Map<String, double[]> Xqedii_11fr84j = new LinkedHashMap<>();
   public final Map<String, double[]> Xqedii_35k47go = new LinkedHashMap<>();
   public final Map<String, String> Xqedii_1vhwpp5 = new LinkedHashMap<>();
   public final Map<String, ScrollViewState.Metrics> Xqedii_3gndcnb = new LinkedHashMap<>();
   public final Set<String> Xqedii_336i8fu = new LinkedHashSet<>();
   public final Set<String> Xqedii_1eht3m2 = new LinkedHashSet<>();
   public boolean Xqedii_33azqx1;

   public void setHoveredTargets(Collection<String> var1) {
      if ((468169120 ^ 468169120) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1eht3m2.clear();
         if (var1 != null) {
            this.Xqedii_1eht3m2.addAll(var1);
         }
      }
   }

   public boolean isHoveredTarget(String var1) {
      if ((-1128959029 ^ -1128959029) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && !var1.isBlank() && this.Xqedii_1eht3m2.contains(var1)
            ? Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-386573964, 21)
            : Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-2106737795, 22)) != 0);
      }
   }

   public static ScrollViewState exportAll() {
      if ((143418281 * 143418281 + 143418281 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ScrollViewState var0 = new ScrollViewState();
         var0.Xqedii_33azqx1 = (Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-386573964, 21) != 0);
         return var0;
      }
   }

   public boolean isExportAll() {
      if ((488296277 * 488296277 + 488296277 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_33azqx1;
      }
   }

   public void markFilterUsed(String var1) {
      if (((-1624677466 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && !var1.isBlank()) {
            this.Xqedii_336i8fu.add(var1.trim());
         }
      }
   }

   public boolean usesFilter(String var1) {
      if (((-1580919149 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_336i8fu.contains(var1.trim())
            ? Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-1488475445, 16)
            : Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-473372795, 25)) != 0);
      }
   }

   public boolean hasFilters() {
      if ((1269071515 * (1269071515 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((!this.Xqedii_336i8fu.isEmpty()
            ? Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-178686744, 29)
            : Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-473372795, 31)) != 0);
      }
   }

   public double[] Xqedii_2nms0jn(String var1, double var2, double var4) {
      if ((200086537 * 200086537 - 200086537 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         double[] var6 = this.Xqedii_35k47go.get(var1);
         double[] var12;
         if (var6 == null) {
            var12 = new double[Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-473241723, 16)];
            var12[Xqedii_1019iyu.Xqedii_3gzb6g7f2isku(-1903467761, 6)] = Double.longBitsToDouble(Xqedii_1019iyu.Xqedii_1i6lyl5vinqcz(5616339878317695544L, 46));
            var12[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-1225918966, 0)] = Double.longBitsToDouble(Xqedii_1019iyu.Xqedii_2w0dnuupia291(-8685903476185475747L, 56));
         } else {
            var12 = new double[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-1049174594, 21)];
            var12[Xqedii_1019iyu.Xqedii_3gzb6g7f2isku(-1903467761, 10)] = Math.max(
               Math.abs(var2 - var6[Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-388671116, 21)]),
               Math.abs(var2 - var6[Xqedii_1019iyu.Xqedii_3gzb6g7f2isku(1903467764, 2)])
            );
            var12[Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-473405563, 15)] = Math.max(
               Math.abs(var4 - var6[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-1149402451, 6)]),
               Math.abs(var4 - var6[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-302641994, 8)])
            );
         }

         double[] var7 = var12;
         double var8 = var6 == null ? var2 : var6[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-2106737795, 22)];
         double var10 = var6 == null ? var4 : var6[Xqedii_1019iyu.Xqedii_3gzb6g7f2isku(1903467760, 4)];
         Map var13 = this.Xqedii_35k47go;
         double[] var10002 = new double[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-83436682, 15)];
         var10002[Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-744270491, 15)] = var2;
         var10002[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(1438085040, 27)] = var4;
         var10002[Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-339155067, 26)] = var8;
         var10002[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-1149402323, 6)] = var10;
         var13.put(var1, var10002);
         return var7;
      } else {
         double[] var10000 = new double[Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-473373307, 8)];
         var10000[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-83567754, 15)] = Double.longBitsToDouble(Xqedii_1019iyu.Xqedii_2w0dnuupia291(6185825306103695909L, 44));
         var10000[Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(1564097878, 11)] = Double.longBitsToDouble(Xqedii_1019iyu.Xqedii_2pxaxmj62fyal(-5605042057367407319L, 11));
         return var10000;
      }
   }

   public void putOffset(String var1, double var2, double var4) {
      if (((-1805840427 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Map var10000 = this.Xqedii_11fr84j;
         double[] var10002 = new double[Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-1990879410, 25)];
         var10002[Xqedii_1019iyu.Xqedii_3ci69x92tvmm1(-473372795, 14)] = var2;
         var10002[Xqedii_1019iyu.Xqedii_1ndyeq6xlchef(-1166771540, 12)] = var4;
         var10000.put(var1, var10002);
      }
   }

   public double offsetX(String var1) {
      if ((-1497637225 * (-1497637225 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var2 = var1 == null ? null : this.Xqedii_11fr84j.get(var1);
         return var2 == null
            ? Double.longBitsToDouble(Xqedii_1019iyu.Xqedii_2pxaxmj62fyal(-5605042057367407319L, 7))
            : var2[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(325966828, 25)];
      }
   }

   public double offsetY(String var1) {
      if ((-1519139612 ^ -1519139612) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var2 = var1 == null ? null : this.Xqedii_11fr84j.get(var1);
         return var2 == null
            ? Double.longBitsToDouble(Xqedii_1019iyu.Xqedii_2tlt4yrv5mrai(4156272918038453415L, 23))
            : var2[Xqedii_1019iyu.Xqedii_2mfne2y896ulb(-1418797216, 28)];
      }
   }

   public void putFilterValue(String var1, String var2) {
      if ((1065321768 ^ 1065321768) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         this.Xqedii_1vhwpp5.put(var1, var2 == null ? Xqedii_1019iyu.Xqedii_yegp40fedzhm("/3/vZ07PSucK8DHuyD12YLCCEq7daaiW+AsBEA==") : var2);
      }
   }

   public String filterValue(String var1) {
      if (((1586912135 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1019iyu.Xqedii_yegp40fedzhm("/3/vZ07PSucK8DHuyD12YLCCEq7daaiW+AsBEA==");
      } else {
         String var2 = this.Xqedii_1vhwpp5.get(var1);
         return var2 == null ? Xqedii_1019iyu.Xqedii_yegp40fedzhm("/3/vZ07PSucK8DHuyD12YLCCEq7daaiW+AsBEA==") : var2;
      }
   }

   public void putMetrics(String var1, ScrollViewState.Metrics var2) {
      if ((1548605740 ^ 1548605740) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var2 != null) {
         this.Xqedii_3gndcnb.put(var1, var2);
      }
   }

   public ScrollViewState.Metrics metrics(String var1) {
      if ((-2139839889 * (-2139839889 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? null : this.Xqedii_3gndcnb.get(var1);
      }
   }

   public Map<String, ScrollViewState.Metrics> allMetrics() {
      if (((631211775 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Collections.unmodifiableMap(this.Xqedii_3gndcnb);
      }
   }

   public void clearMetrics() {
      if (((1895164916 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3gndcnb.clear();
         this.Xqedii_336i8fu.clear();
      }
   }

   public void clearFilterValues() {
      if ((378158022 * (378158022 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1vhwpp5.clear();
      }
   }

   public ScrollViewState.Metrics Xqedii_2xqb9v7(
      String var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      boolean var26,
      boolean var27,
      int var28,
      int var29,
      int var30,
      ScrollViewState.Bar var31,
      ScrollViewState.Bar var32
   ) {
      if ((-2135214533 * (-2135214533 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new ScrollViewState.Metrics(
            var1, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22, var24, var26, var27, var28, var29, var30, var31, var32
         );
      }
   }

   public ScrollViewState.Bar Xqedii_2z4uqla(boolean var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14) {
      if ((-1554437440 * (-1554437440 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new ScrollViewState.Bar(var1, var2, var4, var6, var8, var10, var12, var14);
      }
   }

   public static final class Bar {
      public static final String Xqedii_1jdnn2lll6krt = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final boolean vertical;
      public final double trackX;
      public final double trackY;
      public final double trackWidth;
      public final double trackHeight;
      public final double thumbStart;
      public final double thumbLength;
      public final double hitPadding;

      public Bar(boolean var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14) {
         this.vertical = var1;
         this.trackX = var2;
         this.trackY = var4;
         this.trackWidth = var6;
         this.trackHeight = var8;
         this.thumbStart = var10;
         this.thumbLength = var12;
         this.hitPadding = Math.max(Double.longBitsToDouble(Xqedii_3ktetqb.Xqedii_224hfom97gdrm(-6676539260649951785L, 25)), var14);
      }

      public boolean hit(double var1, double var3) {
         if ((-1228748620 * (-1228748620 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else if (this.vertical) {
            return ((var1 >= this.trackX - this.hitPadding
                  && var1 <= this.trackX + this.trackWidth + this.hitPadding
                  && var3 >= this.trackY
                  && var3 <= this.trackY + this.trackHeight
               ? Xqedii_3ktetqb.Xqedii_f9mstm2kr9uu(-362739563, 6)
               : Xqedii_3ktetqb.Xqedii_fqro98j37s23(-1731007314, 15)) != 0);
         } else {
            return ((var3 >= this.trackY - this.hitPadding
                  && var3 <= this.trackY + this.trackHeight + this.hitPadding
                  && var1 >= this.trackX
                  && var1 <= this.trackX + this.trackWidth
               ? Xqedii_3ktetqb.Xqedii_f9mstm2kr9uu(-362739500, 0)
               : Xqedii_3ktetqb.Xqedii_fqro98j37s23(-1731007314, 20)) != 0);
         }
      }

      public double trackStart() {
         if ((-948321952 * -948321952 - -948321952 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.vertical ? this.trackY : this.trackX;
         }
      }

      public double trackLength() {
         if ((435566211 * 435566211 + 435566211 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.vertical ? this.trackHeight : this.trackWidth;
         }
      }

      public boolean onThumb(double var1) {
         if ((-2139705468 ^ -2139705468) != 0) {
            throw new IllegalStateException();
         } else {
            return ((var1 >= this.thumbStart && var1 <= this.thumbStart + this.thumbLength
               ? Xqedii_3ktetqb.Xqedii_3fmvcal9jhrh2(-1679540306, 8)
               : Xqedii_3ktetqb.Xqedii_3fmvcal9jhrh2(-465654117, 16)) != 0);
         }
      }

      public double offsetForThumbStart(double var1, double var3) {
         if ((-353926722 ^ -353926722) != 0) {
            throw new IllegalStateException();
         } else {
            double var5 = this.trackLength() - this.thumbLength;
            if (!(var5 <= Double.longBitsToDouble(Xqedii_3ktetqb.Xqedii_4ys2x4ltjf3(1901706437910688725L, 6)))
               && !(var3 <= Double.longBitsToDouble(Xqedii_3ktetqb.Xqedii_4ys2x4ltjf3(-6064310952339996961L, 42)))) {
               double var7 = Math.max(
                  Double.longBitsToDouble(Xqedii_3ktetqb.Xqedii_4ys2x4ltjf3(1007538233291392665L, 20)),
                  Math.min(Double.longBitsToDouble(Xqedii_3ktetqb.Xqedii_224hfom97gdrm(-5811566657218105897L, 60)), (var1 - this.trackStart()) / var5)
               );
               return var7 * var3;
            } else {
               return Double.longBitsToDouble(Xqedii_3ktetqb.Xqedii_224hfom97gdrm(-6676539260649951785L, 45));
            }
         }
      }
   }

   public static final class Metrics {
      public static final String Xqedii_3gwnib6rl0yi = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final String containerId;
      public final double boxX;
      public final double boxY;
      public final double viewWidth;
      public final double viewHeight;
      public final double contentWidth;
      public final double contentHeight;
      public final double offsetX;
      public final double offsetY;
      public final double maxOffsetX;
      public final double maxOffsetY;
      public final double stepX;
      public final double stepY;
      public final boolean horizontal;
      public final boolean vertical;
      public final int totalChildren;
      public final int visibleChildren;
      public final int smoothTicks;
      public final ScrollViewState.Bar verticalBar;
      public final ScrollViewState.Bar horizontalBar;

      public Metrics(
         String var1,
         double var2,
         double var4,
         double var6,
         double var8,
         double var10,
         double var12,
         double var14,
         double var16,
         double var18,
         double var20,
         double var22,
         double var24,
         boolean var26,
         boolean var27,
         int var28,
         int var29,
         int var30,
         ScrollViewState.Bar var31,
         ScrollViewState.Bar var32
      ) {
         this.containerId = var1;
         this.boxX = var2;
         this.boxY = var4;
         this.viewWidth = var6;
         this.viewHeight = var8;
         this.contentWidth = var10;
         this.contentHeight = var12;
         this.offsetX = var14;
         this.offsetY = var16;
         this.maxOffsetX = var18;
         this.maxOffsetY = var20;
         this.stepX = var22;
         this.stepY = var24;
         this.horizontal = var26;
         this.vertical = var27;
         this.totalChildren = var28;
         this.visibleChildren = var29;
         this.smoothTicks = Math.max(Xqedii_1iy6b4g.Xqedii_3cityyn7gvhcq(-744250091, 29), var30);
         this.verticalBar = var31;
         this.horizontalBar = var32;
      }

      public boolean contains(double var1, double var3) {
         if ((-1618930386 * (-1618930386 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return ((var1 >= this.boxX && var1 <= this.boxX + this.viewWidth && var3 >= this.boxY && var3 <= this.boxY + this.viewHeight
               ? Xqedii_1iy6b4g.Xqedii_3cityyn7gvhcq(-743987947, 18)
               : Xqedii_1iy6b4g.Xqedii_23xia8l8oc4fn(571327070, 31)) != 0);
         }
      }

      public boolean scrollable() {
         if ((274108665 * (274108665 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return (((!this.vertical || !(this.maxOffsetY > Double.longBitsToDouble(Xqedii_1iy6b4g.Xqedii_3jjd05sfj3vtf(8152951996318876116L, 57))))
                  && (!this.horizontal || !(this.maxOffsetX > Double.longBitsToDouble(Xqedii_1iy6b4g.Xqedii_3jjd05sfj3vtf(1320023425135156551L, 61))))
               ? Xqedii_1iy6b4g.Xqedii_23xia8l8oc4fn(635576540, 19)
               : Xqedii_1iy6b4g.Xqedii_1gvem58crlq3s(-79647554, 25)) != 0);
         }
      }
   }
}
