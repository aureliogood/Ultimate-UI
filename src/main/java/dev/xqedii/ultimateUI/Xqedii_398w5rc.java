package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_398w5rc {
   private static final ConcurrentHashMap<String, String> Xqedii_2y3c4bvz45x8s = new ConcurrentHashMap<>();
   private static volatile int Xqedii_35acfr6aa8c6b = -1562445757;
   private static volatile int Xqedii_3bz6qe7xn3uqi = 314942313;
   private static volatile int Xqedii_2rfwoa2tdsaei = 761879887;
   private static volatile int Xqedii_3cnd2f7qaw000 = 301747611;
   private static volatile long Xqedii_3voyq6zyfdebj = 4477115031039224608L;
   private static volatile long Xqedii_7xg52v7fulxj = -701633685674749744L;
   private static volatile long Xqedii_3ve7o9k4eowl4 = 7164722863311003924L;
   private static volatile long Xqedii_1iugjpfb7zt3h = -6768414368199624095L;

   public static int Xqedii_cc4s7hpd9ifw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_35acfr6aa8c6b, var1);
   }

   public static int Xqedii_1nm2kalltea88(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3bz6qe7xn3uqi;
   }

   public static int Xqedii_2mkrc5s9rwev7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2rfwoa2tdsaei;
   }

   public static int Xqedii_144nlzs36riw1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3cnd2f7qaw000, var1);
   }

   public static long Xqedii_fd0u61dh61g0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3voyq6zyfdebj, var2);
   }

   public static long Xqedii_1y6irlqrn0tp8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_7xg52v7fulxj;
   }

   public static long Xqedii_1etlft4k7nh1l(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3ve7o9k4eowl4;
   }

   public static long Xqedii_2gqpbk4spsp71(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1iugjpfb7zt3h, var2);
   }

   public static String Xqedii_8z4etu28lpph(String var0) {
      String var1 = Xqedii_2y3c4bvz45x8s.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("dWXYZp3/dchXhmj8lldjmfWZLP/nw+gBcSRkLq/mcLk=");
            int var3 = 1511164461;

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
            String var9 = Xqedii_2y3c4bvz45x8s.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3e9ia5rf2mf8n() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2w4jy7j21u7cr() {
   }

   private static int Xqedii_2df623u6yypau(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1zhg8zuht0j0c(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
