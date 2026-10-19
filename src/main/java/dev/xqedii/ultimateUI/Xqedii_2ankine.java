package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ankine {
   private static final ConcurrentHashMap<String, String> Xqedii_zvpck7z2yiu3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1cz54mm71njv1 = -1010460541;
   private static volatile int Xqedii_399kvjq45fjh8 = 2109518740;
   private static volatile int Xqedii_307yfv3xitgtf = -1749294723;
   private static volatile int Xqedii_nmawul4uaeje = -1215162878;
   private static volatile long Xqedii_2obkxbnbg3uu8 = 3308354789349259346L;
   private static volatile long Xqedii_3eoymiefcmx1r = 5976742411959919056L;
   private static volatile long Xqedii_xkuz0fmr5pqq = 7265280650902719542L;
   private static volatile long Xqedii_b52raf0bzhpc = -4456538332469732833L;

   public static int Xqedii_qxnhy8ajuajr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1cz54mm71njv1, var1);
   }

   public static int Xqedii_1yrdj00nnc98t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_399kvjq45fjh8;
   }

   public static int Xqedii_1ndt2t2yqpd9g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_307yfv3xitgtf;
   }

   public static int Xqedii_2fcmao9j2zkxs(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_nmawul4uaeje, var1);
   }

   public static long Xqedii_3ivukcdlxr2p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2obkxbnbg3uu8, var2);
   }

   public static long Xqedii_otbe8owaj7eq(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3eoymiefcmx1r;
   }

   public static long Xqedii_1dojrd5giw7p9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_xkuz0fmr5pqq;
   }

   public static long Xqedii_tp34qqmnidfv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_b52raf0bzhpc, var2);
   }

   public static String Xqedii_1mtdapu2aw162(String var0) {
      String var1 = Xqedii_zvpck7z2yiu3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("q1TakxLbUwhTz8OdoD0CCfOgEPRZ/4BJ5rEy1z87yXc=");
            int var3 = 806894255;

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
            String var9 = Xqedii_zvpck7z2yiu3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1646a91hc5fv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_8i28czl81aji() {
   }

   private static int Xqedii_2b9b7i6aacaty(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1eqc8sh5i88mz(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
