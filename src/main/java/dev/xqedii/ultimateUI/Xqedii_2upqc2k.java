package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2upqc2k {
   private static final ConcurrentHashMap<String, String> Xqedii_knaulkc8wmia = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2a398bfj2fyn8 = -1829364015;
   private static volatile int Xqedii_j94zccz39dqj = -1655874286;
   private static volatile int Xqedii_223tp6mo3ruus = 898843155;
   private static volatile int Xqedii_38227tr1waa2l = 176983460;
   private static volatile long Xqedii_2h4nza9ojuota = -7509868367405232575L;
   private static volatile long Xqedii_337t3utedz9na = -5690407351323286574L;
   private static volatile long Xqedii_32qdbss71x7gh = 4446378611979464168L;
   private static volatile long Xqedii_dn3bxizusp0q = -1061430651136498973L;

   public static int Xqedii_2eeaocq0um97l(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2a398bfj2fyn8, var1);
   }

   public static int Xqedii_ymfvks3ceucd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_j94zccz39dqj;
   }

   public static int Xqedii_35oxk96h3iqps(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_223tp6mo3ruus;
   }

   public static int Xqedii_3hq56qbwfl24s(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_38227tr1waa2l, var1);
   }

   public static long Xqedii_1j34ih082ejjb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2h4nza9ojuota, var2);
   }

   public static long Xqedii_rjxelm76vv17(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_337t3utedz9na;
   }

   public static long Xqedii_3t5d0w9g1az7z(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_32qdbss71x7gh;
   }

   public static long Xqedii_2bwgeahfz3jm1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_dn3bxizusp0q, var2);
   }

   public static String Xqedii_3nh7c9jfcm3ga(String var0) {
      String var1 = Xqedii_knaulkc8wmia.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uRATLZW/USVnyrIf5uG9dPnTgQlinq5/i+RJK2kKmWM=");
            int var3 = 577984912;

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
            String var9 = Xqedii_knaulkc8wmia.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2hpuh3wuz3m3m() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1in9xvi9iunij() {
   }

   private static int Xqedii_1zbrio5dvocds(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_18gcsxrtra4i9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
