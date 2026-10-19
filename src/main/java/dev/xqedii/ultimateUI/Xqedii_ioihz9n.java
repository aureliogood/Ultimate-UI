package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ioihz9n {
   private static final ConcurrentHashMap<String, String> Xqedii_e4std0fb7k31 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1ykkrjdea3qru = 439262818;
   private static volatile int Xqedii_1gl4tq89i4dg6 = -994269537;
   private static volatile int Xqedii_2q2sp9wzhw0p5 = -1559237005;
   private static volatile int Xqedii_2wcs98qlaxlhs = -2029512870;
   private static volatile long Xqedii_7pioxkseqgqa = -8829406142261141652L;
   private static volatile long Xqedii_1zkhgwb2octig = 1726889272740127457L;
   private static volatile long Xqedii_29qlfbwyvvm0r = -3009052224796551945L;
   private static volatile long Xqedii_2pz2by5apnlh = -2832267241028548778L;

   public static int Xqedii_25uno03d1yzdn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1ykkrjdea3qru, var1);
   }

   public static int Xqedii_3jsstpot5sk11(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1gl4tq89i4dg6;
   }

   public static int Xqedii_iszsc99wa0lv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2q2sp9wzhw0p5;
   }

   public static int Xqedii_1omscqgy7d8yo(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2wcs98qlaxlhs, var1);
   }

   public static long Xqedii_3h7w0dx0voe0l(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_7pioxkseqgqa, var2);
   }

   public static long Xqedii_4ofzn1b4afjv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1zkhgwb2octig;
   }

   public static long Xqedii_28su6agcg9lna(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_29qlfbwyvvm0r;
   }

   public static long Xqedii_st9g65h30hdc(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2pz2by5apnlh, var2);
   }

   public static String Xqedii_n0iruhxiawh8(String var0) {
      String var1 = Xqedii_e4std0fb7k31.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("F/doYPKz84pI4Fkjd0WlDsBoz9xAqKpqFg5bAxDChzM=");
            int var3 = 1163826348;

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
            String var9 = Xqedii_e4std0fb7k31.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1co4y7hlfhr2i() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2fxcrnrim32gt() {
   }

   private static int Xqedii_29b7gse1t6dmj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_w1krvcuxh72x(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
