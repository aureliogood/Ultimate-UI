package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_m864cgd {
   private static final ConcurrentHashMap<String, String> Xqedii_1ikcmgdmwuhoc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_9x7pxael7wt8 = -347957782;
   private static volatile int Xqedii_28gt0y4o4thy3 = 1557869235;
   private static volatile int Xqedii_837r7t8j7kdh = -384638240;
   private static volatile int Xqedii_7w9f2ouned9w = 300017130;
   private static volatile long Xqedii_30aqj1b7slub9 = -6286744235161306370L;
   private static volatile long Xqedii_2plrm2ls262dc = -7110405542293327749L;
   private static volatile long Xqedii_jy3z8k2qbq2b = -4020231763117876355L;
   private static volatile long Xqedii_17vqq1j3h8f8q = -6604040127894615725L;

   public static int Xqedii_3p0p611htzmm4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_9x7pxael7wt8, var1);
   }

   public static int Xqedii_3oq976cofyi6o(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_28gt0y4o4thy3;
   }

   public static int Xqedii_2fr2okch7erh8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_837r7t8j7kdh;
   }

   public static int Xqedii_8fvdi8k3mnha(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_7w9f2ouned9w, var1);
   }

   public static long Xqedii_1z62rzsr942o3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_30aqj1b7slub9, var2);
   }

   public static long Xqedii_1y3fuo51uemtl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2plrm2ls262dc;
   }

   public static long Xqedii_1jxb3w9s8qrrz(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_jy3z8k2qbq2b;
   }

   public static long Xqedii_l1g9tt0dmg6r(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_17vqq1j3h8f8q, var2);
   }

   public static String Xqedii_3j0vwx036abna(String var0) {
      String var1 = Xqedii_1ikcmgdmwuhoc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ehgDJorfKAXpUkvIdX+2yj5snIoWfk9FkqmY9tNH2X0=");
            int var3 = -1523787630;

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
            String var9 = Xqedii_1ikcmgdmwuhoc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3gtdwf6tas0om() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_5p2rt6fz9kkz() {
   }

   private static int Xqedii_2w32e3vmbac5z(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3h5i6jvdyxlxd(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
