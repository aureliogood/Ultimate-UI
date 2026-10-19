package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_5rk5h3b {
   private static final ConcurrentHashMap<String, String> Xqedii_21h52h4jv2j0c = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3rwhhwlwl2aus = -435100465;
   private static volatile int Xqedii_3aon6pv8vjvrb = 487996779;
   private static volatile int Xqedii_788ysbt9yt5i = 728631267;
   private static volatile int Xqedii_1fcxf5zkce9lf = -323577319;
   private static volatile long Xqedii_22nuylke1slr0 = 2785716797805235449L;
   private static volatile long Xqedii_1hqfnegua7hun = -2707550626718378892L;
   private static volatile long Xqedii_32zpq38wxb7fp = 5436960811751445949L;
   private static volatile long Xqedii_n808obzjwmnv = -182216913994746003L;

   public static int Xqedii_17j0cui6dhu5e(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3rwhhwlwl2aus, var1);
   }

   public static int Xqedii_1w1rncrndsf09(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3aon6pv8vjvrb;
   }

   public static int Xqedii_276k358rx0c1h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_788ysbt9yt5i;
   }

   public static int Xqedii_4t1emhin8tos(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1fcxf5zkce9lf, var1);
   }

   public static long Xqedii_fl8lmm7nj1pv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_22nuylke1slr0, var2);
   }

   public static long Xqedii_2xphw6j8b4xod(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1hqfnegua7hun;
   }

   public static long Xqedii_391sjxx3bp8ps(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_32zpq38wxb7fp;
   }

   public static long Xqedii_wed7zzru0rw6(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_n808obzjwmnv, var2);
   }

   public static String Xqedii_1hbjoi2t94f06(String var0) {
      String var1 = Xqedii_21h52h4jv2j0c.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("foBKZk8szus2vcPF+mvRHYvmAOpdad2MD0r/FD61sUM=");
            int var3 = -1283313882;

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
            String var9 = Xqedii_21h52h4jv2j0c.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_lb971smidks7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_10rtby6cagqm1() {
   }

   private static int Xqedii_2lkj0asqnin63(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_8ousys5ju5l4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
