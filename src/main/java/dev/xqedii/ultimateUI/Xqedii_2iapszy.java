package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2iapszy {
   private static final ConcurrentHashMap<String, String> Xqedii_3eoh8wkcohw09 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_j1b5eger2ysr = -1259133343;
   private static volatile int Xqedii_32fef9ew7u2md = 234614456;
   private static volatile int Xqedii_xrg9is6u3k0k = 1611301516;
   private static volatile int Xqedii_iul842o2s8p4 = -840333401;
   private static volatile long Xqedii_3ht34i6qz6hav = -882335170118952807L;
   private static volatile long Xqedii_2900c6t0bjz5i = 7237983143335949629L;
   private static volatile long Xqedii_2z8yw8k20bta0 = -5495753538487730602L;
   private static volatile long Xqedii_1hbxvfdjcb103 = 4841869648363059078L;

   public static int Xqedii_3pcgzpvdrciqp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_j1b5eger2ysr, var1);
   }

   public static int Xqedii_3j5vyletcm0to(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_32fef9ew7u2md;
   }

   public static int Xqedii_230ajyhmx64zr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_xrg9is6u3k0k;
   }

   public static int Xqedii_1sgsr59085m2c(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_iul842o2s8p4, var1);
   }

   public static long Xqedii_2gx5v401c25kb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3ht34i6qz6hav, var2);
   }

   public static long Xqedii_3dt1hss66xlje(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2900c6t0bjz5i;
   }

   public static long Xqedii_1t8zn5ycrceks(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2z8yw8k20bta0;
   }

   public static long Xqedii_2oop6wc0y7nn1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1hbxvfdjcb103, var2);
   }

   public static String Xqedii_2bjzsz33wwtnk(String var0) {
      String var1 = Xqedii_3eoh8wkcohw09.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ewxe0mw+ffceggsuLSYHHDD32pgHxCNvsVyf3Sh1V3o=");
            int var3 = -1962761312;

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
            String var9 = Xqedii_3eoh8wkcohw09.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_19guko5mqntmv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3hwlalr8wo0p5() {
   }

   private static int Xqedii_n80utl3u7rni(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2vyq96ozptwsm(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
