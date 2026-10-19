package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3c6skvl {
   private static final ConcurrentHashMap<String, String> Xqedii_2cq5t6u4vs6vj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_y6d7dm8vtjm0 = 1842127276;
   private static volatile int Xqedii_2k6dfdzd4zm90 = -316890131;
   private static volatile int Xqedii_jbiipjtc0ven = -1064697401;
   private static volatile int Xqedii_34xabcquyd4cr = -1374716078;
   private static volatile long Xqedii_3hlc1ux1vx9zl = -826282639521999961L;
   private static volatile long Xqedii_3ror1p8b4kvxj = -7567849684386820619L;
   private static volatile long Xqedii_19536tutxyzl4 = 8263419968497973095L;
   private static volatile long Xqedii_3ri0178lmy3s4 = 5502941870784038089L;

   public static int Xqedii_306hip527e6uo(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_y6d7dm8vtjm0, var1);
   }

   public static int Xqedii_2emr1d24zbwnp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2k6dfdzd4zm90;
   }

   public static int Xqedii_et1f9vygj64d(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_jbiipjtc0ven;
   }

   public static int Xqedii_15fmwl6bjb8a8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_34xabcquyd4cr, var1);
   }

   public static long Xqedii_4d486dpawhek(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3hlc1ux1vx9zl, var2);
   }

   public static long Xqedii_1hybwtk004yv2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3ror1p8b4kvxj;
   }

   public static long Xqedii_jv4kk5d55oex(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_19536tutxyzl4;
   }

   public static long Xqedii_34m2qw74vaapp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ri0178lmy3s4, var2);
   }

   public static String Xqedii_38ppq5cdt6k6n(String var0) {
      String var1 = Xqedii_2cq5t6u4vs6vj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("jDxR189fLjeYpKk99GYVHOrNADthQTCZPEuL37KWAoE=");
            int var3 = 1543042412;

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
            String var9 = Xqedii_2cq5t6u4vs6vj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_30060maf3wa7r() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2sa1chlzwledz() {
   }

   private static int Xqedii_29190rh7uoaj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ohohtw8g46jm(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
