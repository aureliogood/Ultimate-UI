package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3kpvqee {
   private static final ConcurrentHashMap<String, String> Xqedii_2vkea1r1r05pl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2d15aps3sm8yh = -913796150;
   private static volatile int Xqedii_3ryr5ulmcofs = 2084988657;
   private static volatile int Xqedii_ea6f551gqait = -604521305;
   private static volatile int Xqedii_18d4ednjoygkp = -1506548012;
   private static volatile long Xqedii_3g59mfm57b6mv = -4026109381445404694L;
   private static volatile long Xqedii_3h4bt10llqx26 = 2552978741997600457L;
   private static volatile long Xqedii_2ujecve7raq8w = -7588567413391705218L;
   private static volatile long Xqedii_mv8qe41f0bpb = 5865991430264092288L;

   public static int Xqedii_3pcmpk7l79w3h(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2d15aps3sm8yh, var1);
   }

   public static int Xqedii_tbcmkr56nltf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ryr5ulmcofs;
   }

   public static int Xqedii_1fsxc10ivrk0q(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_ea6f551gqait;
   }

   public static int Xqedii_25ft6lmir3fes(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_18d4ednjoygkp, var1);
   }

   public static long Xqedii_1pnbq026ph38d(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3g59mfm57b6mv, var2);
   }

   public static long Xqedii_exxsiao2o613(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3h4bt10llqx26;
   }

   public static long Xqedii_y75r82kpdbxx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ujecve7raq8w;
   }

   public static long Xqedii_2t5wok0w0zjda(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_mv8qe41f0bpb, var2);
   }

   public static String Xqedii_3pl8o3140hd1z(String var0) {
      String var1 = Xqedii_2vkea1r1r05pl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("nJsP9kbGpPjAbK9n6lR1lRfXcTtQZeOEsAMx7pmolIo=");
            int var3 = 1335134707;

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
            String var9 = Xqedii_2vkea1r1r05pl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1moyizis4jdmh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3l8enc3le2a8q() {
   }

   private static int Xqedii_3jpsbsdt24sdj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_32ubykn9u785e(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
