package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3qzvdsv {
   private static final ConcurrentHashMap<String, String> Xqedii_19srl0i9kzhk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_akibo499ty0q = -168643523;
   private static volatile int Xqedii_1d9kjvmrvgbt7 = -137890697;
   private static volatile int Xqedii_yjry5i4xbwdc = -236294523;
   private static volatile int Xqedii_2qsq16el6gvlg = -72531333;
   private static volatile long Xqedii_2q3m367qs4d81 = -2374124801019672713L;
   private static volatile long Xqedii_3cjrt342ilefa = -8318141861739220608L;
   private static volatile long Xqedii_2ks6l8k14mlg3 = 1508867641863791511L;
   private static volatile long Xqedii_9sphmvas9qo0 = -8735173201956700728L;

   public static int Xqedii_1hz8c92y4elu4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_akibo499ty0q, var1);
   }

   public static int Xqedii_1lq1b9jc713yz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1d9kjvmrvgbt7;
   }

   public static int Xqedii_1mjofi4gktnga(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_yjry5i4xbwdc;
   }

   public static int Xqedii_1udvye2ug9wi7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2qsq16el6gvlg, var1);
   }

   public static long Xqedii_1wjyfi3hgc9y0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2q3m367qs4d81, var2);
   }

   public static long Xqedii_yerz6ozj51f6(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3cjrt342ilefa;
   }

   public static long Xqedii_2flx38a7i69l2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ks6l8k14mlg3;
   }

   public static long Xqedii_3k8le7wd66bqo(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_9sphmvas9qo0, var2);
   }

   public static String Xqedii_1k0dv5vodxd45(String var0) {
      String var1 = Xqedii_19srl0i9kzhk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uGDTjl8Unchv+8ys0+55jEMBnB//bv19AYb3T+ORriE=");
            int var3 = 80327394;

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
            String var9 = Xqedii_19srl0i9kzhk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1mkbkqow1ag60() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3s89lfcj9ska9() {
   }

   private static int Xqedii_2zb35nyzj9hlj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1zsxq8vq8on2t(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
