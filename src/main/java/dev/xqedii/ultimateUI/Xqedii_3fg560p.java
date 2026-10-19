package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3fg560p {
   private static final ConcurrentHashMap<String, String> Xqedii_3g87urc7cet9p = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1kb02lt9rdsh1 = -704996075;
   private static volatile int Xqedii_1z5lywvia5hbd = -951117365;
   private static volatile int Xqedii_8s0quz9klc8a = 1863382674;
   private static volatile int Xqedii_1njkl1nah52go = -94291264;
   private static volatile long Xqedii_2ooeu5hlxlke5 = 7875954920426958272L;
   private static volatile long Xqedii_80rta88tjpe1 = 3624222166302598229L;
   private static volatile long Xqedii_2lczfgni0cic8 = 3384052766237264726L;
   private static volatile long Xqedii_11lxu2pdz5mjp = -7095604391206641226L;

   public static int Xqedii_2elwh5vtzszj3(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1kb02lt9rdsh1, var1);
   }

   public static int Xqedii_xgr0nkekpheo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1z5lywvia5hbd;
   }

   public static int Xqedii_1j219bly2h8vj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_8s0quz9klc8a;
   }

   public static int Xqedii_2vtx6s49qrnww(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1njkl1nah52go, var1);
   }

   public static long Xqedii_3nvuouhg0cemj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ooeu5hlxlke5, var2);
   }

   public static long Xqedii_2jesmtvkptylp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_80rta88tjpe1;
   }

   public static long Xqedii_4xlcoxmf3e3n(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2lczfgni0cic8;
   }

   public static long Xqedii_2674i012xemcy(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_11lxu2pdz5mjp, var2);
   }

   public static String Xqedii_otm6tff6cmz7(String var0) {
      String var1 = Xqedii_3g87urc7cet9p.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("8J5MrGLqaGb7c+0JucVakE1c3pcA3jXTrqTWb2PYB0U=");
            int var3 = 1096503014;

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
            String var9 = Xqedii_3g87urc7cet9p.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_tvpxt6998d17() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1o9utcm89l9p8() {
   }

   private static int Xqedii_25b4fmktn4rq3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_vq8lby0mpuc6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
