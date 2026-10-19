package dev.xqedii.ultimateUI.service.gui.editor.shell.managers;

import dev.xqedii.ultimateUI.Xqedii_1orqt7n;
import dev.xqedii.ultimateUI.Xqedii_2ntqrxd;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Function;

public final class AnimationTimelineManager {
   public static final String Xqedii_1dkuhtljw81b8 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public String resolveSegmentInterpolationMode(Map<Integer, String> var1, Integer var2, Integer var3, Function<String, String> var4, String var5) {
      if ((-955056133 * -955056133 - -955056133 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var6 = var5 != null && !var5.isBlank() ? var5 : Xqedii_1orqt7n.Xqedii_22qj1ag3xo9rr("hv9CEM8zx5+66J8DApibtcHNd5JmszuhCRvCUJ2QIwqgCwY+Po5oHw==");
         if (var1 != null && !var1.isEmpty() && var3 != null) {
            String var7 = (String)var1.get(var3);
            if (var4 == null) {
               return var7 != null && !var7.isBlank() ? var7 : var6;
            } else {
               String var8 = (String)var4.apply(var7);
               return var8 != null && !var8.isBlank() ? var8 : var6;
            }
         } else {
            return var6;
         }
      }
   }

   public double interpolateChannel(
      TreeMap<Integer, Double> var1, double var2, double var4, Map<Integer, String> var6, Function<String, String> var7, String var8, int var9
   ) {
      if ((1648097583 ^ 1648097583) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         int var10 = Math.max(Xqedii_1orqt7n.Xqedii_1c13z6xgnk4hb(1630861044, 30), (int)Math.floor(var2));
         int var11 = Math.min(
            Math.max(Xqedii_1orqt7n.Xqedii_11pz5x0f8rnck(-790529981, 19), var9),
            Math.max(Xqedii_1orqt7n.Xqedii_3ns545cu9s93f(931942661, 9), (int)Math.ceil(var2))
         );
         Entry var12 = var1.floorEntry(var10);
         Entry var13 = var1.ceilingEntry(var11);
         if (var12 == null && var13 == null) {
            return var4;
         } else if (var12 == null && var13 != null) {
            int var21 = Math.max(Xqedii_1orqt7n.Xqedii_11pz5x0f8rnck(-790529981, 29), (Integer)var13.getKey());
            if (var21 <= 0) {
               return (Double)var13.getValue();
            } else {
               double var15 = var2 / var21;
               String var17 = this.resolveSegmentInterpolationMode(var6, null, var21, var7, var8);
               double var22 = Xqedii_2ntqrxd.Xqedii_388ntc2(var17, var15);
               return var4 + ((Double)var13.getValue() - var4) * var22;
            }
         } else if (var12 != null && var13 == null) {
            return (Double)var12.getValue();
         } else if (var12 != null && var13 != null && (Integer)var12.getKey() == (Integer)var13.getKey()) {
            return (Double)var12.getValue();
         } else if (var12 != null && var13 != null) {
            double var14 = Math.max(
               Double.longBitsToDouble(Xqedii_1orqt7n.Xqedii_231mv7qno0ds1(7364491361514915965L, 24)),
               (double)((Integer)var13.getKey() - (Integer)var12.getKey())
            );
            double var16 = (var2 - ((Integer)var12.getKey()).intValue()) / var14;
            String var18 = this.resolveSegmentInterpolationMode(var6, (Integer)var12.getKey(), (Integer)var13.getKey(), var7, var8);
            double var19 = Xqedii_2ntqrxd.Xqedii_388ntc2(var18, var16);
            return (Double)var12.getValue() + ((Double)var13.getValue() - (Double)var12.getValue()) * var19;
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public double[] interpolateVector2(
      TreeMap<Integer, double[]> var1, double var2, double var4, double var6, Map<Integer, String> var8, Function<String, String> var9, String var10, int var11
   ) {
      if ((-1741937690 * (-1741937690 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         TreeMap var12 = new TreeMap();
         TreeMap var13 = new TreeMap();

         for (Entry var15 : var1.entrySet()) {
            if (var15 != null && var15.getValue() != null && ((double[])var15.getValue()).length >= Xqedii_1orqt7n.Xqedii_3ns545cu9s93f(-931942406, 8)) {
               var12.put((Integer)var15.getKey(), ((double[])var15.getValue())[Xqedii_1orqt7n.Xqedii_1bzrknuqoni3p(-369810763, 25)]);
               var13.put((Integer)var15.getKey(), ((double[])var15.getValue())[Xqedii_1orqt7n.Xqedii_1c13z6xgnk4hb(-560716130, 19)]);
            }
         }

         double[] var16 = new double[Xqedii_1orqt7n.Xqedii_11pz5x0f8rnck(-790532029, 10)];
         var16[Xqedii_1orqt7n.Xqedii_3ns545cu9s93f(931942661, 11)] = this.interpolateChannel(var12, var2, var4, var8, var9, var10, var11);
         var16[Xqedii_1orqt7n.Xqedii_11pz5x0f8rnck(-253659069, 29)] = this.interpolateChannel(var13, var2, var6, var8, var9, var10, var11);
         return var16;
      } else {
         double[] var10000 = new double[Xqedii_1orqt7n.Xqedii_3ns545cu9s93f(-932008198, 16)];
         var10000[Xqedii_1orqt7n.Xqedii_1c13z6xgnk4hb(-1214051929, 17)] = var4;
         var10000[Xqedii_1orqt7n.Xqedii_11pz5x0f8rnck(-790529853, 7)] = var6;
         return var10000;
      }
   }
}
