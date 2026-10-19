package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ozmlu4z {
   private static final ConcurrentHashMap<String, String> Xqedii_2042vieopywgz = new ConcurrentHashMap<>();
   private static volatile int Xqedii_v5ge5gipys5w = 826517254;
   private static volatile int Xqedii_1hzubz47pe52z = -818005936;
   private static volatile int Xqedii_22qfnkebxk88v = -200762417;
   private static volatile int Xqedii_3gprmdz38ob3t = 1316299836;
   private static volatile long Xqedii_2be37mojw87vu = -6540869837325966370L;
   private static volatile long Xqedii_15q2h523i7dr2 = -5616461746965861228L;
   private static volatile long Xqedii_9urm0m2d4q1d = -8409952354733559642L;
   private static volatile long Xqedii_2lyykye9zaoes = -3594252660133523288L;

   public static int Xqedii_6xbx4e9nt51a(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_v5ge5gipys5w, var1);
   }

   public static int Xqedii_163ch6obe9cmf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1hzubz47pe52z;
   }

   public static int Xqedii_1burf4w0ken3p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_22qfnkebxk88v;
   }

   public static int Xqedii_5upcptc3o5s4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3gprmdz38ob3t, var1);
   }

   public static long Xqedii_2f4qfpevn94uc(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2be37mojw87vu, var2);
   }

   public static long Xqedii_1ho00q57jkob8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_15q2h523i7dr2;
   }

   public static long Xqedii_1mvfgc150pqxx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_9urm0m2d4q1d;
   }

   public static long Xqedii_1t1mom5xoiayb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2lyykye9zaoes, var2);
   }

   public static String Xqedii_1303z0iykjin2(String var0) {
      String var1 = Xqedii_2042vieopywgz.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("NoTVGAdPG56dLW/BZ4gDpx80gs8szs6M4JeIfIqAQsI=");
            int var3 = 1731869514;

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
            String var9 = Xqedii_2042vieopywgz.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2js915rdudhd4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2biv36nk43vtl() {
   }

   private static int Xqedii_23r5zn7lm8k2p(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1bdakdynfr8xf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
