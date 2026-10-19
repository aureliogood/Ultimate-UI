package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3f05is8 {
   private static final ConcurrentHashMap<String, String> Xqedii_k6dacqylrl7k = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2a1f17ocn0tl2 = 38872948;
   private static volatile int Xqedii_2lmhz366w08v = -1579627710;
   private static volatile int Xqedii_3oqyrscx2aj3h = 1274091682;
   private static volatile int Xqedii_2n2fjugna9f1l = 2055834573;
   private static volatile long Xqedii_35f0tx7ontk0t = 626227343863623233L;
   private static volatile long Xqedii_2fr84xlrkiu1q = -3610434804807710142L;
   private static volatile long Xqedii_569dlej37z7i = -1251484683153009798L;
   private static volatile long Xqedii_2y1qeukn5ijdx = 8442296698379400749L;

   public static int Xqedii_2ms0b87za5mgh(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2a1f17ocn0tl2, var1);
   }

   public static int Xqedii_28nmqasd4oszu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2lmhz366w08v;
   }

   public static int Xqedii_3b3s9esvcpfzi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3oqyrscx2aj3h;
   }

   public static int Xqedii_21bkyqfmjwf4w(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2n2fjugna9f1l, var1);
   }

   public static long Xqedii_bkalaxbzgqbt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_35f0tx7ontk0t, var2);
   }

   public static long Xqedii_kvunz9m7my2k(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2fr84xlrkiu1q;
   }

   public static long Xqedii_9ujrskwqlubv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_569dlej37z7i;
   }

   public static long Xqedii_fejsc1hd7sz8(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2y1qeukn5ijdx, var2);
   }

   public static String Xqedii_6e396ruxyg4o(String var0) {
      String var1 = Xqedii_k6dacqylrl7k.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("mrEK7F8Ek1ep1yz38qGJxuO6kQst5eMP+Vw1dHiHW6A=");
            int var3 = 524185914;

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
            String var9 = Xqedii_k6dacqylrl7k.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3a2lv9oa2tw8i() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_gk7gjekpkxug() {
   }

   private static int Xqedii_mbikn752hof4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1huct4zy79k85(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
