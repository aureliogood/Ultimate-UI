package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2gjgld8 {
   private static final ConcurrentHashMap<String, String> Xqedii_253g3bgnn3mmk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1i3ud4wwkedlz = -348234826;
   private static volatile int Xqedii_18pcjxv0l2kl3 = -2121534084;
   private static volatile int Xqedii_1we0gatw6f7lj = -1906655205;
   private static volatile int Xqedii_172xsfnzbntaf = 223035910;
   private static volatile long Xqedii_195e0c1yae44e = 2396602371757701755L;
   private static volatile long Xqedii_3vt12866gije5 = -1136346795415760221L;
   private static volatile long Xqedii_1yuj160f5lk7b = -1345047149666834131L;
   private static volatile long Xqedii_3jhdts6zkfjer = 5825686664969276661L;

   public static int Xqedii_6zxoqtw4o9uf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1i3ud4wwkedlz, var1);
   }

   public static int Xqedii_2oi8z56fhjcui(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_18pcjxv0l2kl3;
   }

   public static int Xqedii_1237nmai0s7pt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1we0gatw6f7lj;
   }

   public static int Xqedii_1565emy6p3034(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_172xsfnzbntaf, var1);
   }

   public static long Xqedii_1visxfmltvr1n(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_195e0c1yae44e, var2);
   }

   public static long Xqedii_7mrbp9mj5i3s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3vt12866gije5;
   }

   public static long Xqedii_2hk2nwzbe7eh9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1yuj160f5lk7b;
   }

   public static long Xqedii_1tl60tegjr1od(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3jhdts6zkfjer, var2);
   }

   public static String Xqedii_2xg936d0q17lb(String var0) {
      String var1 = Xqedii_253g3bgnn3mmk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("OY1CTF8ksUoo4cmFwLB2PUjF9ZQVftDxett41RX5Pio=");
            int var3 = 687662937;

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
            String var9 = Xqedii_253g3bgnn3mmk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3gt1w88ug9aw8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2jh177ggb5h2h() {
   }

   private static int Xqedii_2pr307bjk3hvr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1i4lygt0ibjwq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
