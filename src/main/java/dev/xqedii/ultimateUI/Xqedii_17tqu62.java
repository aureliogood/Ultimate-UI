package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_17tqu62 {
   private static final ConcurrentHashMap<String, String> Xqedii_oi70m33ka28w = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1fa48s7bbtmhr = -1862566182;
   private static volatile int Xqedii_2xvb37c8zzicr = 409222492;
   private static volatile int Xqedii_b9we771omoyc = 249229747;
   private static volatile int Xqedii_8bcjtsp22i7o = 1319711786;
   private static volatile long Xqedii_1u2kiz8qzd0lw = -6272965671935079112L;
   private static volatile long Xqedii_1pe0qrabioyj3 = -14635763777666971L;
   private static volatile long Xqedii_1mmnmo538qf3b = 8745498981471184005L;
   private static volatile long Xqedii_1hdx1qf7ujisp = 4024398119028021964L;

   public static int Xqedii_1u1sx3mwwep3n(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1fa48s7bbtmhr, var1);
   }

   public static int Xqedii_1ht0qpj19rmnc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2xvb37c8zzicr;
   }

   public static int Xqedii_3rqhgn7pq6ncm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_b9we771omoyc;
   }

   public static int Xqedii_2nl3g8lbgsyb9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_8bcjtsp22i7o, var1);
   }

   public static long Xqedii_tovt2v2ch773(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1u2kiz8qzd0lw, var2);
   }

   public static long Xqedii_z8pelhaiojm4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1pe0qrabioyj3;
   }

   public static long Xqedii_18w2ctj69jk50(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1mmnmo538qf3b;
   }

   public static long Xqedii_115zy0jzolakb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1hdx1qf7ujisp, var2);
   }

   public static String Xqedii_9jwv9oj4w0xi(String var0) {
      String var1 = Xqedii_oi70m33ka28w.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("fRPCx+Jrh2ADMDKMO+SNWba+247ftEmYhVhcBSzhkjk=");
            int var3 = 1622142002;

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
            String var9 = Xqedii_oi70m33ka28w.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_37xz0vx5l94mk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_pt6xubl1auih() {
   }

   private static int Xqedii_7y4w2mtd4l29(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1y5izwwybjyee(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
