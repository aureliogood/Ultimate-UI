package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_bkk5m48 {
   private static final ConcurrentHashMap<String, String> Xqedii_2pl12kz7ryipa = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2w2o50mguu0wu = 471342711;
   private static volatile int Xqedii_35zd4c419xwwr = 672906727;
   private static volatile int Xqedii_1616hwps9i47g = -1635355100;
   private static volatile int Xqedii_les1d1mgrxf7 = 1071756383;
   private static volatile long Xqedii_3pf813s1zwgw1 = -978532560973105910L;
   private static volatile long Xqedii_17sksxk68gfdi = 4016373559154245605L;
   private static volatile long Xqedii_2r85z2oclpx6h = 321868946020871341L;
   private static volatile long Xqedii_2rc3f9clg5pzd = -3122929114533601991L;

   public static int Xqedii_5poablr2x67b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2w2o50mguu0wu, var1);
   }

   public static int Xqedii_3kjhfsrtvzxrd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_35zd4c419xwwr;
   }

   public static int Xqedii_2gzmjy5rrogaa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1616hwps9i47g;
   }

   public static int Xqedii_21ctca2ngyesc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_les1d1mgrxf7, var1);
   }

   public static long Xqedii_2k48lpbdfe00t(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3pf813s1zwgw1, var2);
   }

   public static long Xqedii_b0nwjicd53qi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_17sksxk68gfdi;
   }

   public static long Xqedii_2qptac3fy8i01(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2r85z2oclpx6h;
   }

   public static long Xqedii_3ga36ph6ni855(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2rc3f9clg5pzd, var2);
   }

   public static String Xqedii_3vqczt146o7bm(String var0) {
      String var1 = Xqedii_2pl12kz7ryipa.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("PD8tDkM2YSNGj1YM3kyW4yRUxtKnkhOhqYSqleD33tw=");
            int var3 = 853235564;

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
            String var9 = Xqedii_2pl12kz7ryipa.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2v1nrv2h6g8rd() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3q5mpcs3f6iac() {
   }

   private static int Xqedii_1qg5n2odhphgd(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_38l0j3wcwuwwe(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
