package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_29lx9uo {
   private static final ConcurrentHashMap<String, String> Xqedii_opgaschki4jo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_ppy9om1p8yor = 95979656;
   private static volatile int Xqedii_1ai91lx0pv5e4 = 1248024974;
   private static volatile int Xqedii_2fxxvi692mc7i = 1435112724;
   private static volatile int Xqedii_1hmgqwhosovoz = -1578088438;
   private static volatile long Xqedii_2yd3swr6wmyn8 = -5176130151137941530L;
   private static volatile long Xqedii_10n3e4w6z4b45 = -7040402127120654293L;
   private static volatile long Xqedii_3kkyn9f6pqxis = -8730995830295542629L;
   private static volatile long Xqedii_2btypi70oayv4 = 3666653385423998160L;

   public static int Xqedii_1jrhdh2j7itmb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_ppy9om1p8yor, var1);
   }

   public static int Xqedii_kjj9t7uyzc6u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ai91lx0pv5e4;
   }

   public static int Xqedii_3mffwhcmdlohk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2fxxvi692mc7i;
   }

   public static int Xqedii_31l8jgu0qzv8a(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1hmgqwhosovoz, var1);
   }

   public static long Xqedii_2a9a3ndzfl15a(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2yd3swr6wmyn8, var2);
   }

   public static long Xqedii_1dbt7zkulnsn1(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_10n3e4w6z4b45;
   }

   public static long Xqedii_220dyw1gxuwk6(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3kkyn9f6pqxis;
   }

   public static long Xqedii_3r2gbzseb79m0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2btypi70oayv4, var2);
   }

   public static String Xqedii_1yc4jyko93mlx(String var0) {
      String var1 = Xqedii_opgaschki4jo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("p40LnyDtI2GyKt/PoMCV8n66OLi/tTpQqZ7lsIY9fnE=");
            int var3 = -896048863;

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
            String var9 = Xqedii_opgaschki4jo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1notekx7ndun1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ovsye6hkjtfz() {
   }

   private static int Xqedii_m14fmb4wig8b(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3k31luivdb9o5(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
