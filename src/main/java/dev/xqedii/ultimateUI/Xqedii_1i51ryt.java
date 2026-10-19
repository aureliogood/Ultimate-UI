package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1i51ryt {
   private static final ConcurrentHashMap<String, String> Xqedii_3gynsn19sx1sa = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1ks2x49qy9s3i = 216719786;
   private static volatile int Xqedii_3dkshb9rw2jjx = 1405942269;
   private static volatile int Xqedii_2nvnykrqth05s = -1324133522;
   private static volatile int Xqedii_1xyqsaqwbne1p = -150927489;
   private static volatile long Xqedii_2o79dpf6dfu3m = -4485977743586860539L;
   private static volatile long Xqedii_2630ym8ywav5j = -6472106093308064855L;
   private static volatile long Xqedii_2eo39exwt27p8 = -5334770926834858582L;
   private static volatile long Xqedii_l3s31bi4mrfo = 3009418172188047312L;

   public static int Xqedii_2h5hkcpn7mudx(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1ks2x49qy9s3i, var1);
   }

   public static int Xqedii_1ou8bpy88hbza(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3dkshb9rw2jjx;
   }

   public static int Xqedii_1qn1zxo52fxbi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2nvnykrqth05s;
   }

   public static int Xqedii_bfs5enz0qc5r(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1xyqsaqwbne1p, var1);
   }

   public static long Xqedii_canrdjywxyfs(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2o79dpf6dfu3m, var2);
   }

   public static long Xqedii_nyjh5kfayv3x(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2630ym8ywav5j;
   }

   public static long Xqedii_1hw16va2qa4qs(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2eo39exwt27p8;
   }

   public static long Xqedii_wd147ewa463m(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_l3s31bi4mrfo, var2);
   }

   public static String Xqedii_1l0so7k6cwkif(String var0) {
      String var1 = Xqedii_3gynsn19sx1sa.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("4nXXqOyDOCpSLscOHpjF2yXHo4IaBxxSBAOVX1zaxyI=");
            int var3 = -1992404486;

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
            String var9 = Xqedii_3gynsn19sx1sa.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3lzb6qpqsdwr0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3165emkcs8nr6() {
   }

   private static int Xqedii_2dwtbtvsmgcgi(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_16ami51r7bets(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
