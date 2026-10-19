package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_24oxiik {
   private static final ConcurrentHashMap<String, String> Xqedii_3kyagu6jfi0ks = new ConcurrentHashMap<>();
   private static volatile int Xqedii_377ysh5hodiqr = -1711596240;
   private static volatile int Xqedii_3o1au72jsyood = -83692347;
   private static volatile int Xqedii_35kbm0tnv52c0 = -615530230;
   private static volatile int Xqedii_43946wd5iks3 = 1782350750;
   private static volatile long Xqedii_2kr2ygkw1h69p = -6082825423767411584L;
   private static volatile long Xqedii_1i3fjmm1g1862 = -5870366358209139711L;
   private static volatile long Xqedii_3k3kbv7ove5ny = 2967454082477205473L;
   private static volatile long Xqedii_1yqcuok4f8h9y = 3673842154682110793L;

   public static int Xqedii_whmlp88fa7wj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_377ysh5hodiqr, var1);
   }

   public static int Xqedii_1sh5rph9zmqu4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3o1au72jsyood;
   }

   public static int Xqedii_3a5hzg3ed9jjx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_35kbm0tnv52c0;
   }

   public static int Xqedii_vonyq3y4mvdy(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_43946wd5iks3, var1);
   }

   public static long Xqedii_24gploww5lker(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2kr2ygkw1h69p, var2);
   }

   public static long Xqedii_31bziz4iorx5e(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1i3fjmm1g1862;
   }

   public static long Xqedii_3an2ezfj4vdat(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3k3kbv7ove5ny;
   }

   public static long Xqedii_3no6mfdzn2ky6(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1yqcuok4f8h9y, var2);
   }

   public static String Xqedii_3vonxnss8q32m(String var0) {
      String var1 = Xqedii_3kyagu6jfi0ks.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ARrIoT0ofEn0UypA9BDu4huUe3Qo6d+m996/9lk6AMA=");
            int var3 = -572030403;

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
            String var9 = Xqedii_3kyagu6jfi0ks.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2mhhr8eq9isud() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_64aquqdoca1h() {
   }

   private static int Xqedii_1s36s034o4osw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1arg6line4rc2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
