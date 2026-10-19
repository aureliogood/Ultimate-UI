package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3dj3z3q {
   private static final ConcurrentHashMap<String, String> Xqedii_29pf3rn0hf6i2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_17fzyunvmoqb1 = -247896009;
   private static volatile int Xqedii_2mftsg0l26tw1 = -1954904625;
   private static volatile int Xqedii_198uxo8ig27dq = -1104488417;
   private static volatile int Xqedii_3cwnmn3p20467 = 743525984;
   private static volatile long Xqedii_3o50vokorbsir = 8274935701110585767L;
   private static volatile long Xqedii_1wd61gr9l3swt = 1441086572275175738L;
   private static volatile long Xqedii_2q8gme82beytm = -5222449844223196321L;
   private static volatile long Xqedii_38aik4w1bikso = -5208574573556129836L;

   public static int Xqedii_2h8jvv5aifsn3(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_17fzyunvmoqb1, var1);
   }

   public static int Xqedii_1yr71dpwnftzn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2mftsg0l26tw1;
   }

   public static int Xqedii_35k2czek5p5c5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_198uxo8ig27dq;
   }

   public static int Xqedii_2ms0a5hsloi0n(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3cwnmn3p20467, var1);
   }

   public static long Xqedii_22zgtemf1oj43(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3o50vokorbsir, var2);
   }

   public static long Xqedii_2j3eide3sikr1(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1wd61gr9l3swt;
   }

   public static long Xqedii_whw1ma180uc1(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2q8gme82beytm;
   }

   public static long Xqedii_g3q1sq3izjsy(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_38aik4w1bikso, var2);
   }

   public static String Xqedii_359l33l2q8i0m(String var0) {
      String var1 = Xqedii_29pf3rn0hf6i2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+pLxPOpG7hLtHhk4KYH4Vu6R+m7aMBqNkd5oFWGXjU0=");
            int var3 = -256756034;

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
            String var9 = Xqedii_29pf3rn0hf6i2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2m38zii9m7sxr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_rotx22quiyfr() {
   }

   private static int Xqedii_1r8jy8w0mrdfm(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3jkk0bwt57isp(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
