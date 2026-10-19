package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1z6mkrh {
   private static final ConcurrentHashMap<String, String> Xqedii_38ga0nu9dl36o = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ulx9p0v83zle = -363862716;
   private static volatile int Xqedii_1ty21l1bc0cx4 = -1848153489;
   private static volatile int Xqedii_1ho6h95bb4rme = -356524500;
   private static volatile int Xqedii_24qcjvwy8xkdx = -1108222659;
   private static volatile long Xqedii_3px6k0qwd5m0 = 3371494759245420363L;
   private static volatile long Xqedii_1wtaxapdndrwx = -1132882494834529120L;
   private static volatile long Xqedii_3vzo7rvgs49kv = -1253807415698463306L;
   private static volatile long Xqedii_27ugzhukovicx = -4917263907518040815L;

   public static int Xqedii_14w5wqm5s0zqe(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ulx9p0v83zle, var1);
   }

   public static int Xqedii_3p3ukft3z83gq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ty21l1bc0cx4;
   }

   public static int Xqedii_14esvopnmgzkp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ho6h95bb4rme;
   }

   public static int Xqedii_53jvauomndon(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_24qcjvwy8xkdx, var1);
   }

   public static long Xqedii_1j8rtjnh7ukkr(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3px6k0qwd5m0, var2);
   }

   public static long Xqedii_344ezlqfl181c(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1wtaxapdndrwx;
   }

   public static long Xqedii_32g8tzvjkdxvd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3vzo7rvgs49kv;
   }

   public static long Xqedii_796pea8ox4o2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_27ugzhukovicx, var2);
   }

   public static String Xqedii_1gi4qwqdyn2d(String var0) {
      String var1 = Xqedii_38ga0nu9dl36o.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("TRqMr7d9Mk69BzN0m37goNXq/A+80KVxDJ845KF+fxY=");
            int var3 = -493131673;

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
            String var9 = Xqedii_38ga0nu9dl36o.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_rgdjvphxptf3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2u7j39vyt4g85() {
   }

   private static int Xqedii_2zpl33lrjk6i8(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1a14m1df4bupq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
