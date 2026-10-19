package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1mfiolc {
   private static final ConcurrentHashMap<String, String> Xqedii_2w3x7zm14qxy9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2w69p2d7ck6gj = 484520035;
   private static volatile int Xqedii_2y6rcmvcuqbte = 501423198;
   private static volatile int Xqedii_2hq6h08uoo9kh = 889230196;
   private static volatile int Xqedii_3u0937ftk8h1l = 1977424907;
   private static volatile long Xqedii_3alou6g9q3mak = -1297616289006522561L;
   private static volatile long Xqedii_2ps98rqv4tszo = -2407905311357226426L;
   private static volatile long Xqedii_17juz9atpca9i = -1713386747525339469L;
   private static volatile long Xqedii_11z160th76q90 = 6109245317206181093L;

   public static int Xqedii_5ihgqrwpbs7j(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2w69p2d7ck6gj, var1);
   }

   public static int Xqedii_8lhqm6quielv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2y6rcmvcuqbte;
   }

   public static int Xqedii_lpm3yo7jokgf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2hq6h08uoo9kh;
   }

   public static int Xqedii_1hucaqm7npr7v(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3u0937ftk8h1l, var1);
   }

   public static long Xqedii_1gdbc3bmgaake(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3alou6g9q3mak, var2);
   }

   public static long Xqedii_2zp0hg3i8owlh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ps98rqv4tszo;
   }

   public static long Xqedii_2lyuydtp2d7px(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_17juz9atpca9i;
   }

   public static long Xqedii_39wbwcvpw6dof(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_11z160th76q90, var2);
   }

   public static String Xqedii_2n2ktmibpdj7r(String var0) {
      String var1 = Xqedii_2w3x7zm14qxy9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("yywZmjihm9TMpMVuG5V+mANGYzRvR0vIXpID+xknhfE=");
            int var3 = 1656397144;

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
            String var9 = Xqedii_2w3x7zm14qxy9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2lpwfxl6ni7x() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_49rmiw7aqur5() {
   }

   private static int Xqedii_kfue2cm985z6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_7x7357ukgvtc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
