package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1pg98y7 {
   private static final ConcurrentHashMap<String, String> Xqedii_1ib19hpnkq8ze = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3v9dpb62q9coh = -781119825;
   private static volatile int Xqedii_ytvoqnhdfz67 = -1748646742;
   private static volatile int Xqedii_kpb1mgdogfl4 = 1291089221;
   private static volatile int Xqedii_2bga3aeoc3kft = -1438505097;
   private static volatile long Xqedii_21wri2i0fhzm7 = 4159764637403620722L;
   private static volatile long Xqedii_3lbwlo4kleh3o = 5063964922832016216L;
   private static volatile long Xqedii_1p69kn8zg76gm = -6781890845122026645L;
   private static volatile long Xqedii_1f2a212a1r4u9 = 451501890126869626L;

   public static int Xqedii_3boxiavk3txo6(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3v9dpb62q9coh, var1);
   }

   public static int Xqedii_mc4o1nt0h7i1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ytvoqnhdfz67;
   }

   public static int Xqedii_1kgb30li26e5f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_kpb1mgdogfl4;
   }

   public static int Xqedii_1o07nw8wuwkp6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2bga3aeoc3kft, var1);
   }

   public static long Xqedii_3eogj809uc84g(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_21wri2i0fhzm7, var2);
   }

   public static long Xqedii_1xhygpjwgcvsq(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3lbwlo4kleh3o;
   }

   public static long Xqedii_3i7bd9vr8vd5g(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1p69kn8zg76gm;
   }

   public static long Xqedii_1mnrp3iibqo78(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1f2a212a1r4u9, var2);
   }

   public static String Xqedii_2ea1z6psrudog(String var0) {
      String var1 = Xqedii_1ib19hpnkq8ze.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("5zNG8Azmy9/gHI+odIQueKNcKr5boVkZ/k5A+11yepY=");
            int var3 = -1593273495;

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
            String var9 = Xqedii_1ib19hpnkq8ze.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2cls8yvepl0tl() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2716qhm70ca26() {
   }

   private static int Xqedii_p49eymt8q3bf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2hpojn8ihu82y(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
