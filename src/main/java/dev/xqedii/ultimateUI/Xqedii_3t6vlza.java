package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3t6vlza {
   private static final ConcurrentHashMap<String, String> Xqedii_2xxme974viqcu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_d6ajyln1jrm7 = 934308983;
   private static volatile int Xqedii_2ykhjtn6oku7v = -841584055;
   private static volatile int Xqedii_16i5xdm2rebp1 = 1899257730;
   private static volatile int Xqedii_1j0t7fo9c3wti = 1815362820;
   private static volatile long Xqedii_39un5ccv6ah5t = 3727854760586547045L;
   private static volatile long Xqedii_36v3qpa073hvc = -6457474444669030933L;
   private static volatile long Xqedii_3ar9mer5sjokp = -7077463071407319355L;
   private static volatile long Xqedii_sm2saze3on6t = -4119861878331162430L;

   public static int Xqedii_yhod2053suah(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_d6ajyln1jrm7, var1);
   }

   public static int Xqedii_ethiau02zycv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ykhjtn6oku7v;
   }

   public static int Xqedii_9qvslkckynxi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_16i5xdm2rebp1;
   }

   public static int Xqedii_28lexfnl53tlu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1j0t7fo9c3wti, var1);
   }

   public static long Xqedii_tfdonci6bu5l(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_39un5ccv6ah5t, var2);
   }

   public static long Xqedii_pricapbt38ig(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_36v3qpa073hvc;
   }

   public static long Xqedii_xkwfeo4dxtfl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3ar9mer5sjokp;
   }

   public static long Xqedii_2id3f7fcimwg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_sm2saze3on6t, var2);
   }

   public static String Xqedii_zzhg8u0gh3fy(String var0) {
      String var1 = Xqedii_2xxme974viqcu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("aa2BhEnaOTCVF+POKP3rwdSU9inQylulxAg9+ASdYPQ=");
            int var3 = 548084746;

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
            String var9 = Xqedii_2xxme974viqcu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1hw8r6nya23p5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2qcql4d6w2cjs() {
   }

   private static int Xqedii_1lesr15x4221d(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3k3g2usstxc4y(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
