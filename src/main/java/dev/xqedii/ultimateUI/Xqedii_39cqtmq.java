package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_39cqtmq {
   private static final ConcurrentHashMap<String, String> Xqedii_1h2tsgkeqvgl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_4fusgefu5fay = -678851699;
   private static volatile int Xqedii_3l14bog100q63 = -1076117150;
   private static volatile int Xqedii_19yq5l67sfn0p = 703511783;
   private static volatile int Xqedii_21karzrhsu25h = -1394861584;
   private static volatile long Xqedii_8xa3vo20yhk8 = -8048507499116167180L;
   private static volatile long Xqedii_2nlf5oz28h8j5 = -6925852857286919412L;
   private static volatile long Xqedii_2i3xot6foy4kl = 6215136869691005913L;
   private static volatile long Xqedii_ezsr3oufupk0 = -6137312145936749922L;

   public static int Xqedii_3foyap9t207v(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_4fusgefu5fay, var1);
   }

   public static int Xqedii_1jdlpu3eywdpx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3l14bog100q63;
   }

   public static int Xqedii_7pw1g1riffzj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_19yq5l67sfn0p;
   }

   public static int Xqedii_3uikrtokjvks0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_21karzrhsu25h, var1);
   }

   public static long Xqedii_pglsybmy5r49(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_8xa3vo20yhk8, var2);
   }

   public static long Xqedii_2qeyba2a804c(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2nlf5oz28h8j5;
   }

   public static long Xqedii_36zyfou2rsdzx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2i3xot6foy4kl;
   }

   public static long Xqedii_o3y3j97y1h77(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ezsr3oufupk0, var2);
   }

   public static String Xqedii_1pn3z896rue8l(String var0) {
      String var1 = Xqedii_1h2tsgkeqvgl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("NCdqfGEStyR8Zb0cIy22gmFaGU7gtJyJrSqFRIrj7uw=");
            int var3 = 1779077322;

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
            String var9 = Xqedii_1h2tsgkeqvgl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_24k11bieq4chx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_17il1qbdve2g4() {
   }

   private static int Xqedii_3js7d7r9mx359(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_uysbxduparve(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
