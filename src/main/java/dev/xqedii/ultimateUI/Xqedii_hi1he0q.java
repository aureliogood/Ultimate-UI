package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_hi1he0q {
   private static final ConcurrentHashMap<String, String> Xqedii_2r657z58a4zee = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3grut7dhrvqhg = 357432286;
   private static volatile int Xqedii_2cd51ucp54dbi = -1180444921;
   private static volatile int Xqedii_3s243nx45haz9 = 1877473474;
   private static volatile int Xqedii_2h8mly03gtnsr = -1434305111;
   private static volatile long Xqedii_hw4pveca0opy = 3175396449112598386L;
   private static volatile long Xqedii_29imfzy90py39 = -8070905366582700242L;
   private static volatile long Xqedii_15wltdhmkoyuu = -7864030570982758551L;
   private static volatile long Xqedii_28erqed57y2e6 = 1261543234252815205L;

   public static int Xqedii_27cgubcyeoxm4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3grut7dhrvqhg, var1);
   }

   public static int Xqedii_2dzcko1775q4m(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2cd51ucp54dbi;
   }

   public static int Xqedii_jf1xg7u7u4xj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3s243nx45haz9;
   }

   public static int Xqedii_1t8x19rz7kasm(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2h8mly03gtnsr, var1);
   }

   public static long Xqedii_1vjr3qtjfnhbv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_hw4pveca0opy, var2);
   }

   public static long Xqedii_2eqd3wnwuy0we(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_29imfzy90py39;
   }

   public static long Xqedii_2sam28ztjjru1(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_15wltdhmkoyuu;
   }

   public static long Xqedii_1ycc4nshxvalg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_28erqed57y2e6, var2);
   }

   public static String Xqedii_23sn21x2jhub2(String var0) {
      String var1 = Xqedii_2r657z58a4zee.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DHKy6Ey3HQ8DyHqaUCWqcOfUr9aWa3TWbNQcTXD2KVk=");
            int var3 = -1943294639;

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
            String var9 = Xqedii_2r657z58a4zee.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_x9yswojjd9kr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_y54cwo4uea7g() {
   }

   private static int Xqedii_gw509ps9y3xs(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2fytz7wv8lnzh(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
