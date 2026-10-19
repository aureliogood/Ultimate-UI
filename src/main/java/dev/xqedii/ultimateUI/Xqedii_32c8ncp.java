package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_32c8ncp {
   private static final ConcurrentHashMap<String, String> Xqedii_p5mtzillkwb5 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2mktsrf1hfezn = -1335506907;
   private static volatile int Xqedii_2ycjfntifdz11 = 154149082;
   private static volatile int Xqedii_axermqkj1fha = -838555417;
   private static volatile int Xqedii_1882uawpvb64s = -1888423387;
   private static volatile long Xqedii_1wh4t66369hvb = -3921577348624187042L;
   private static volatile long Xqedii_iej2hsydboou = 7701980106672594327L;
   private static volatile long Xqedii_1czc8ojgo1my2 = 6467665257829452886L;
   private static volatile long Xqedii_1pkkvdv2sbhyo = 8255414812591465922L;

   public static int Xqedii_3smo8285lrj4c(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2mktsrf1hfezn, var1);
   }

   public static int Xqedii_nmdijh3973pt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ycjfntifdz11;
   }

   public static int Xqedii_2q79s43kjxrbi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_axermqkj1fha;
   }

   public static int Xqedii_pkadlb0um2ii(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1882uawpvb64s, var1);
   }

   public static long Xqedii_3bml1yp5t8tjv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1wh4t66369hvb, var2);
   }

   public static long Xqedii_2d9pyrjzpxi2j(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_iej2hsydboou;
   }

   public static long Xqedii_9a9zolrsn0sm(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1czc8ojgo1my2;
   }

   public static long Xqedii_1j1gzwb24iack(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1pkkvdv2sbhyo, var2);
   }

   public static String Xqedii_2dhnld5i1ys7c(String var0) {
      String var1 = Xqedii_p5mtzillkwb5.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("x0zNgcRv6WF5gPEGdeAhoY4SP9d6Be1Xrn2r6py1tVg=");
            int var3 = 1310647964;

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
            String var9 = Xqedii_p5mtzillkwb5.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2qjfvzfc5n0wc() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1s8z3ys83qwsz() {
   }

   private static int Xqedii_1hrxv426yzm2t(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1yzcrt969i7ja(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
