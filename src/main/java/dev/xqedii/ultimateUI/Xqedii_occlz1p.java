package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_occlz1p {
   private static final ConcurrentHashMap<String, String> Xqedii_1yokcd20id6op = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1lsrbhwk5umxa = -1331144333;
   private static volatile int Xqedii_iozbtfzqtbqz = 1708201757;
   private static volatile int Xqedii_xbaxb4tyg8um = 247861122;
   private static volatile int Xqedii_1huz33bya04y8 = -202520859;
   private static volatile long Xqedii_zpcpjdvpb7x5 = 4503497009345541961L;
   private static volatile long Xqedii_15xhae3pdsgpj = 7619947910222758259L;
   private static volatile long Xqedii_41lnapk1akob = -541005708032931075L;
   private static volatile long Xqedii_8thfr72c98gr = 4571309693903597355L;

   public static int Xqedii_20vcjmn4bhpi8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1lsrbhwk5umxa, var1);
   }

   public static int Xqedii_2iu3unecavn0v(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_iozbtfzqtbqz;
   }

   public static int Xqedii_37rvufq3ldvgw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_xbaxb4tyg8um;
   }

   public static int Xqedii_2y2e8l9x2i96s(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1huz33bya04y8, var1);
   }

   public static long Xqedii_og8yvu71ezle(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_zpcpjdvpb7x5, var2);
   }

   public static long Xqedii_1pi3ma8wqaory(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_15xhae3pdsgpj;
   }

   public static long Xqedii_273uubk89xhns(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_41lnapk1akob;
   }

   public static long Xqedii_bydknokazppd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_8thfr72c98gr, var2);
   }

   public static String Xqedii_3i4yt85ngcryy(String var0) {
      String var1 = Xqedii_1yokcd20id6op.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("PKLVtj4iGFLaX1VIeN1P70jUajnIUv65VwffMYKzLok=");
            int var3 = 1930347948;

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
            String var9 = Xqedii_1yokcd20id6op.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_pw160ul0zver() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_mi9s58kroycm() {
   }

   private static int Xqedii_2vs9is1isxtbb(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_jkvlh2octutw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
