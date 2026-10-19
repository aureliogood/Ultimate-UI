package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_qrnc6o3 {
   private static final ConcurrentHashMap<String, String> Xqedii_3rakk1ond041d = new ConcurrentHashMap<>();
   private static volatile int Xqedii_5jnysfkp93lq = 1543134859;
   private static volatile int Xqedii_31luv9hvxn7up = -1969656014;
   private static volatile int Xqedii_kan7g923o70c = 1875741630;
   private static volatile int Xqedii_3hl3nm0wg2uam = -622169830;
   private static volatile long Xqedii_14xrc5hyvhh9a = 6658418781739709519L;
   private static volatile long Xqedii_11do4d9s3wg2j = -7412719125475405872L;
   private static volatile long Xqedii_2tmj4a6glq2mw = 200788226449852292L;
   private static volatile long Xqedii_105l6o7sjlfme = 7463695072384983928L;

   public static int Xqedii_1socdae1xl2fl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_5jnysfkp93lq, var1);
   }

   public static int Xqedii_24jz3lxjjd3nk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_31luv9hvxn7up;
   }

   public static int Xqedii_j3fuvs9i8ucv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_kan7g923o70c;
   }

   public static int Xqedii_x0hdfkhm21ww(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3hl3nm0wg2uam, var1);
   }

   public static long Xqedii_2y7wqykjdnwtq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_14xrc5hyvhh9a, var2);
   }

   public static long Xqedii_3o2mxz28ltm0n(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_11do4d9s3wg2j;
   }

   public static long Xqedii_2m0v8ac2f6sit(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2tmj4a6glq2mw;
   }

   public static long Xqedii_1fnljzoc9tekb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_105l6o7sjlfme, var2);
   }

   public static String Xqedii_30h8pkbxqbkbz(String var0) {
      String var1 = Xqedii_3rakk1ond041d.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3DKWYNi10P8xItjjg7lTa6n78PhiY5J/0yTLczwpQe0=");
            int var3 = 986173568;

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
            String var9 = Xqedii_3rakk1ond041d.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1g957n86omgvt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_22sxtwfsb8yxq() {
   }

   private static int Xqedii_hvzz8fibr21h(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_h9p9yuz4ey7j(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
