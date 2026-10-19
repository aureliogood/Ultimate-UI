package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1qgti9q {
   private static final ConcurrentHashMap<String, String> Xqedii_f66pd2s0lvv7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1kc9drxx8xlh7 = 310137016;
   private static volatile int Xqedii_1a8vcl9fmb0qf = 967147379;
   private static volatile int Xqedii_3m80idygedn3o = 1678062081;
   private static volatile int Xqedii_d2gmmwcg6fd4 = -1564283795;
   private static volatile long Xqedii_2zvktzs4wzol5 = 3095438543919858608L;
   private static volatile long Xqedii_21c5oi02qxje = -4107163934868003273L;
   private static volatile long Xqedii_45chajyr4bdr = -7705097651202643527L;
   private static volatile long Xqedii_5gqcduh5way0 = 8709775876636076655L;

   public static int Xqedii_1ydwke2xmunls(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1kc9drxx8xlh7, var1);
   }

   public static int Xqedii_3g9wgac9fmlm2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1a8vcl9fmb0qf;
   }

   public static int Xqedii_3sj5mjeoo345d(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3m80idygedn3o;
   }

   public static int Xqedii_1g4nphcpew4li(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_d2gmmwcg6fd4, var1);
   }

   public static long Xqedii_29ws3sclcko9p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2zvktzs4wzol5, var2);
   }

   public static long Xqedii_3mlmgnf8ffl0w(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_21c5oi02qxje;
   }

   public static long Xqedii_2bi0zi7p1f2lp(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_45chajyr4bdr;
   }

   public static long Xqedii_1hglx8kmqb6gb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_5gqcduh5way0, var2);
   }

   public static String Xqedii_2wpr66arhax4r(String var0) {
      String var1 = Xqedii_f66pd2s0lvv7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("K436JHpRtWHjUo61tHCyTndVFzy8KWGqfrPh/mFvrKI=");
            int var3 = 5640179;

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
            String var9 = Xqedii_f66pd2s0lvv7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_jh5jrksctpm5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_9700r5h82e1h() {
   }

   private static int Xqedii_f2rldfsqp9si(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_muqsyn84m0kj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
