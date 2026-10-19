package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_g6wlwta {
   private static final ConcurrentHashMap<String, String> Xqedii_37a2bkxsaejkw = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1et2oxk5x7ppo = -723935451;
   private static volatile int Xqedii_20x57wmmkrf4u = 184656243;
   private static volatile int Xqedii_2f9anoi40vxja = 143147450;
   private static volatile int Xqedii_fxg13hcqxun6 = -475290222;
   private static volatile long Xqedii_2e3qv34h5viaf = 2739059382186852131L;
   private static volatile long Xqedii_156j0sgf0c6yu = -5731987322245443873L;
   private static volatile long Xqedii_1dfk24l3x1ags = 3013374603870398031L;
   private static volatile long Xqedii_26j1ol9xtx8cj = 1369808515386676361L;

   public static int Xqedii_1788mmas7qhir(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1et2oxk5x7ppo, var1);
   }

   public static int Xqedii_1n03m0q1ygkgz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_20x57wmmkrf4u;
   }

   public static int Xqedii_2mv1rp1vq7338(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2f9anoi40vxja;
   }

   public static int Xqedii_849ro2ukckjx(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_fxg13hcqxun6, var1);
   }

   public static long Xqedii_ilrreoykveyy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2e3qv34h5viaf, var2);
   }

   public static long Xqedii_1i6n7jykyha53(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_156j0sgf0c6yu;
   }

   public static long Xqedii_1nxog4ywif2nu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1dfk24l3x1ags;
   }

   public static long Xqedii_1xblowia7lheq(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_26j1ol9xtx8cj, var2);
   }

   public static String Xqedii_14lwniokqlf7z(String var0) {
      String var1 = Xqedii_37a2bkxsaejkw.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("4VE353jRer477BC0+8UuExfD8cfWTbz5IHQf1buVDpo=");
            int var3 = 1513432102;

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
            String var9 = Xqedii_37a2bkxsaejkw.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_118o5wggnuquv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_pbebxjbp34zh() {
   }

   private static int Xqedii_noh9e8fqt0je(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1j7pcirjyoaau(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
