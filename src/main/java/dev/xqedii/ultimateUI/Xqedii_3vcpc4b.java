package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3vcpc4b {
   private static final ConcurrentHashMap<String, String> Xqedii_20dlk6hskarl0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1788dik685acd = 893680071;
   private static volatile int Xqedii_3aa71po0ewq1c = 484674095;
   private static volatile int Xqedii_j7opk41a96b7 = -1625442417;
   private static volatile int Xqedii_2ovny29nr87g8 = -1774043894;
   private static volatile long Xqedii_1bbrkd6ecs9fp = -553513128869620948L;
   private static volatile long Xqedii_3dyu86dpnhhqk = -6234521235872544411L;
   private static volatile long Xqedii_9bog8hy7ow79 = 5432440243929309390L;
   private static volatile long Xqedii_1lrm2chjtlwd7 = -3619159148367665277L;

   public static int Xqedii_ixkcnx8d88z9(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1788dik685acd, var1);
   }

   public static int Xqedii_17lk8bnxjreu3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3aa71po0ewq1c;
   }

   public static int Xqedii_2dk5evkisclgl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_j7opk41a96b7;
   }

   public static int Xqedii_2dqsalm8jsg0j(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ovny29nr87g8, var1);
   }

   public static long Xqedii_2lf007fp2cawx(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1bbrkd6ecs9fp, var2);
   }

   public static long Xqedii_1njnl0h57xirp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3dyu86dpnhhqk;
   }

   public static long Xqedii_314irilaqdmt2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_9bog8hy7ow79;
   }

   public static long Xqedii_1ndb0ivhyo859(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1lrm2chjtlwd7, var2);
   }

   public static String Xqedii_2nkzzxs672iuc(String var0) {
      String var1 = Xqedii_20dlk6hskarl0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("nhG4jhLYLVxvcJCMrxzz0mF95DKi9aObewJajIKy7nU=");
            int var3 = 1333741147;

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
            String var9 = Xqedii_20dlk6hskarl0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3ng6bipphc46p() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2z1ut8dc1iiqh() {
   }

   private static int Xqedii_2mynxl65jz7rm(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1akn0lbgh9802(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
