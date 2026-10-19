package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ennv92 {
   private static final ConcurrentHashMap<String, String> Xqedii_3usc2bwgfxcy5 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3kt1zbu2jjo4j = -986383514;
   private static volatile int Xqedii_pe1etlddbfwl = -1343611260;
   private static volatile int Xqedii_13ulhv1q7rpfp = -629753330;
   private static volatile int Xqedii_6yp6nuo2j5w = -1792113477;
   private static volatile long Xqedii_p9jenzfc20b0 = 6919272428961181834L;
   private static volatile long Xqedii_11geid8ag3r91 = 7367478885052832410L;
   private static volatile long Xqedii_38h6yis7aopop = -5428386873065098880L;
   private static volatile long Xqedii_3ujeyvrzdmogf = -4083236620964374644L;

   public static int Xqedii_23eqbr36nssuk(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3kt1zbu2jjo4j, var1);
   }

   public static int Xqedii_9aky99x6vx8g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_pe1etlddbfwl;
   }

   public static int Xqedii_6x3zcrub9zkr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_13ulhv1q7rpfp;
   }

   public static int Xqedii_fdl17q4p0w7i(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_6yp6nuo2j5w, var1);
   }

   public static long Xqedii_2ase8m2lwfkcp(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_p9jenzfc20b0, var2);
   }

   public static long Xqedii_3i4v7k00cx3c8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_11geid8ag3r91;
   }

   public static long Xqedii_iqp1kpv1rgy0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_38h6yis7aopop;
   }

   public static long Xqedii_12iqgt1ogq3i1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ujeyvrzdmogf, var2);
   }

   public static String Xqedii_jfst5gaiayhp(String var0) {
      String var1 = Xqedii_3usc2bwgfxcy5.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("SmKyl93E9fMz74IVuK1lcUFi5Pyx32ldWxHkLQq8QwI=");
            int var3 = -729146122;

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
            String var9 = Xqedii_3usc2bwgfxcy5.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_17yd0jalw8w01() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3oqmt4i41dgrz() {
   }

   private static int Xqedii_rwydk2vmyj2f(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3bw491sj4wm8x(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
