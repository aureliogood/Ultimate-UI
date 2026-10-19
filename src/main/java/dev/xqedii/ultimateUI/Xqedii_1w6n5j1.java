package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1w6n5j1 {
   private static final ConcurrentHashMap<String, String> Xqedii_16vo59ycyj8f9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_20u2pg2v64yx8 = 633650416;
   private static volatile int Xqedii_o8r5hpcofiyb = 575239355;
   private static volatile int Xqedii_3tj9yp32axtt2 = -1240759751;
   private static volatile int Xqedii_1g05zmpuorsn6 = 887151773;
   private static volatile long Xqedii_305bdw3np8dih = -7079977099811411434L;
   private static volatile long Xqedii_lub6sluk1fa = -5404554163170066170L;
   private static volatile long Xqedii_3re1rt7t3srqv = 6220267448621487672L;
   private static volatile long Xqedii_1p2thecuav0ku = 1953727267219210435L;

   public static int Xqedii_1g2mt7iekwbg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_20u2pg2v64yx8, var1);
   }

   public static int Xqedii_2b69yel06vnpw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_o8r5hpcofiyb;
   }

   public static int Xqedii_1v3aixhn2b0dd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3tj9yp32axtt2;
   }

   public static int Xqedii_1qr9rmf5ueigk(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1g05zmpuorsn6, var1);
   }

   public static long Xqedii_2150wyx1jr686(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_305bdw3np8dih, var2);
   }

   public static long Xqedii_2emsa0agbpwga(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_lub6sluk1fa;
   }

   public static long Xqedii_2can6ygkh8jct(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3re1rt7t3srqv;
   }

   public static long Xqedii_34szbdzk8rgp4(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1p2thecuav0ku, var2);
   }

   public static String Xqedii_x115bda9zlxo(String var0) {
      String var1 = Xqedii_16vo59ycyj8f9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("2fMO4vo7IEMYe3z6FM+279K0GzQ/KzIiCi9GRS/pkIk=");
            int var3 = -1830575786;

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
            String var9 = Xqedii_16vo59ycyj8f9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_13m2jtsl7pc7z() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ankq0dj32prs() {
   }

   private static int Xqedii_3fogzyj86aoex(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3c40wnn52n7r4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
