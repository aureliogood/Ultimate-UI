package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_36gau8e {
   private static final ConcurrentHashMap<String, String> Xqedii_14ie7y7424krj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3rackzdigyjxf = 1072540755;
   private static volatile int Xqedii_2irqdbeybut7f = -342877636;
   private static volatile int Xqedii_2nytlnahte87r = 1045522469;
   private static volatile int Xqedii_3pmv0d86xp663 = -575818519;
   private static volatile long Xqedii_1q6nds7brdp6x = -5248989334720708312L;
   private static volatile long Xqedii_2qlhyjijmt408 = -6705554589772344880L;
   private static volatile long Xqedii_3c1yw4alp1hn6 = 3614661464694195709L;
   private static volatile long Xqedii_fcdb0m2nf0i4 = 3350249621750386583L;

   public static int Xqedii_1t52egj39b6r2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3rackzdigyjxf, var1);
   }

   public static int Xqedii_k9tsn46edl1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2irqdbeybut7f;
   }

   public static int Xqedii_2bhwsg4q12k3z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2nytlnahte87r;
   }

   public static int Xqedii_28gdv332k7yf6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3pmv0d86xp663, var1);
   }

   public static long Xqedii_1z30a03pxqjzt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1q6nds7brdp6x, var2);
   }

   public static long Xqedii_1ra8dug8dnnms(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2qlhyjijmt408;
   }

   public static long Xqedii_1zhfytej6m74v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3c1yw4alp1hn6;
   }

   public static long Xqedii_2ztt7fag6zz9u(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_fcdb0m2nf0i4, var2);
   }

   public static String Xqedii_1621eri2f0w3x(String var0) {
      String var1 = Xqedii_14ie7y7424krj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("7OGu4id0lIPhWS6XDfVRWGu+7cqLUd5T1dTpw/5CfmM=");
            int var3 = 1263889353;

            for (int var4 = 0; var4 < var2.length; var4++) {
               var2[var4] ^= (byte)(var3 >>> (var4 & 3) * 8);
            }

            byte[] var11 = Base64.getDecoder().decode(var0);
            Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
            var5.init(2, new SecretKeySpec(var2, "AES"), new GCMParameterSpec(128, var11, 0, 12));
            byte[] var6 = var5.doFinal(var11, 12, var11.length - 12);
            char[] var7 = new char[var6.length / 2];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = (char)((var6[var8 * 2] & 255) << 8 | var6[var8 * 2 + 1] & 255);
            }

            String var12 = new String(var7).intern();
            Arrays.fill(var2, (byte)0);
            String var9 = Xqedii_14ie7y7424krj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1oglviilqnge2() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_13dlnxudpw0nv() {
   }

   private static int Xqedii_15ptsurnd93ai(byte[] var0, byte[] var1) {
      if (var1.length != 0 && var0.length >= var1.length) {
         label27:
         for (int var2 = 0; var2 + var1.length <= var0.length; var2++) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var0[var2 + var3] != var1[var3]) {
                  continue label27;
               }
            }

            return var2;
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static /* synthetic */ void Xqedii_2fnnwbzergrrz(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
