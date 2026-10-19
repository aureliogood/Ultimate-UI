package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_25tca8j {
   private static final ConcurrentHashMap<String, String> Xqedii_1je80n9k8v2zx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3tsikhvxrauf3 = -105506550;
   private static volatile int Xqedii_3egguabt2y28o = -1005316005;
   private static volatile int Xqedii_31dab2vkxwif5 = -48237494;
   private static volatile int Xqedii_23t0znjpp7tci = 990941650;
   private static volatile long Xqedii_37xnat9drpzbj = -7764922328133647477L;
   private static volatile long Xqedii_350vtg816ti29 = -2375155807057556670L;
   private static volatile long Xqedii_2512knj8esdpe = -5009936703299992381L;
   private static volatile long Xqedii_2pw2izj0xqikd = 6799851993366015830L;

   public static int Xqedii_iu5dh1v30sdb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3tsikhvxrauf3, var1);
   }

   public static int Xqedii_3ssfo5o4b2vga(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3egguabt2y28o;
   }

   public static int Xqedii_3nv39lz36xrk8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_31dab2vkxwif5;
   }

   public static int Xqedii_23tempnk02tex(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_23t0znjpp7tci, var1);
   }

   public static long Xqedii_3idhahk7fvp9n(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_37xnat9drpzbj, var2);
   }

   public static long Xqedii_4s6bxdbqvnsb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_350vtg816ti29;
   }

   public static long Xqedii_220kzidk9syz2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2512knj8esdpe;
   }

   public static long Xqedii_gbysq0snie2g(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2pw2izj0xqikd, var2);
   }

   public static String Xqedii_36fpheu22m4ki(String var0) {
      String var1 = Xqedii_1je80n9k8v2zx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("PecBPz2SLrtIdQgI/jJdqtFCOw/n1wbFXaF/5lqbcik=");
            int var3 = -739303348;

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
            String var9 = Xqedii_1je80n9k8v2zx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_31dydk58kq2fb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_4ewmgf3dtugo() {
   }

   private static int Xqedii_3vcy04sjwed9b(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1qyoxk4xs601f(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
