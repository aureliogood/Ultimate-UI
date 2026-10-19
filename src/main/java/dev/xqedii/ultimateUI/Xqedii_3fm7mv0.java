package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3fm7mv0 {
   private static final ConcurrentHashMap<String, String> Xqedii_26y9kh5op81ut = new ConcurrentHashMap<>();
   private static volatile int Xqedii_14d2174w9ugh1 = -763823629;
   private static volatile int Xqedii_3v2ic0xisle92 = 2042036397;
   private static volatile int Xqedii_2oduvqacrkqy8 = -386545128;
   private static volatile int Xqedii_21n7fwcv65mob = -1450050486;
   private static volatile long Xqedii_18t2qhxg37fgt = -7808040843057028414L;
   private static volatile long Xqedii_2cgazfi8ugjps = -3663788354772632702L;
   private static volatile long Xqedii_2d3mztgup1vtd = -8691197513381585750L;
   private static volatile long Xqedii_3aa8jqmtxqayu = 4971886616048633948L;

   public static int Xqedii_1yol5pip3kd9n(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_14d2174w9ugh1, var1);
   }

   public static int Xqedii_1pgn27emo6meb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3v2ic0xisle92;
   }

   public static int Xqedii_2aeza7amzjlz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2oduvqacrkqy8;
   }

   public static int Xqedii_3aey70u9rrqjn(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_21n7fwcv65mob, var1);
   }

   public static long Xqedii_7ibyn3ggofzj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_18t2qhxg37fgt, var2);
   }

   public static long Xqedii_2lhj70dctxhu9(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2cgazfi8ugjps;
   }

   public static long Xqedii_36gwpxpbrhg9v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2d3mztgup1vtd;
   }

   public static long Xqedii_vk6tr7hfrwze(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3aa8jqmtxqayu, var2);
   }

   public static String Xqedii_3cmmjbl5u4fp7(String var0) {
      String var1 = Xqedii_26y9kh5op81ut.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Oo6Z1kfL5EX2huamOHwGNTronLfFaemnkWlkZGnhRoo=");
            int var3 = 84551761;

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
            String var9 = Xqedii_26y9kh5op81ut.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_346nlu0cq1g91() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ke7ta0jzq7qz() {
   }

   private static int Xqedii_33zl4caqwoii3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_pukyxsd2rbqi(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
