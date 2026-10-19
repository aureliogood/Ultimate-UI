package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1s34vun {
   private static final ConcurrentHashMap<String, String> Xqedii_36o0hxledem6y = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1br7bv4r6sdr4 = 210715545;
   private static volatile int Xqedii_rqdmoqej816c = 1420294457;
   private static volatile int Xqedii_dpz106sn32w7 = -106537166;
   private static volatile int Xqedii_3m1r3jntalftg = 1090327643;
   private static volatile long Xqedii_2gv1u3juznv3a = -9007133103594701534L;
   private static volatile long Xqedii_8u83jmdz69ne = 6426238836889922797L;
   private static volatile long Xqedii_1ithztnjyly4p = -1400573669936378720L;
   private static volatile long Xqedii_1mwsxrv20uiv1 = 1177730773450166502L;

   public static int Xqedii_r62pla0yle6a(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1br7bv4r6sdr4, var1);
   }

   public static int Xqedii_2ezsq3zr460ef(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_rqdmoqej816c;
   }

   public static int Xqedii_z5j381o3pwva(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_dpz106sn32w7;
   }

   public static int Xqedii_gfphdsgui6xf(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3m1r3jntalftg, var1);
   }

   public static long Xqedii_30fkeo782twtu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2gv1u3juznv3a, var2);
   }

   public static long Xqedii_s9zzz7zpmulb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_8u83jmdz69ne;
   }

   public static long Xqedii_1rms5y9kwi951(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ithztnjyly4p;
   }

   public static long Xqedii_1qj3lixhkz252(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1mwsxrv20uiv1, var2);
   }

   public static String Xqedii_997tx7qg1fze(String var0) {
      String var1 = Xqedii_36o0hxledem6y.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3017HQk8fyhOWomdJuUEOlzTupZ4SfzJoYaPH3Rb9go=");
            int var3 = 1058340125;

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
            String var9 = Xqedii_36o0hxledem6y.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_11dj6fk7gl2h1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2lv10nxjrod0() {
   }

   private static int Xqedii_3i0j7h2n47ktp(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1ql6t217xmd3e(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
