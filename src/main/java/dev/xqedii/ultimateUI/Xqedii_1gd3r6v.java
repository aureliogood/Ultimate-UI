package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1gd3r6v {
   private static final ConcurrentHashMap<String, String> Xqedii_2p3mfxt3yb8k2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3h0hxgoxfd673 = 1377247765;
   private static volatile int Xqedii_3p0yb3d6n7p8o = 15856216;
   private static volatile int Xqedii_3m99or7g49jhf = 195608693;
   private static volatile int Xqedii_3pkf27q3vuxe8 = -532801510;
   private static volatile long Xqedii_1jv867iuar2pi = 6881635221737340921L;
   private static volatile long Xqedii_m9m4q4rb250m = 2113232190074311144L;
   private static volatile long Xqedii_2splo99c42cim = 560046509442625806L;
   private static volatile long Xqedii_8y02b5xxok6x = -6214287834823859204L;

   public static int Xqedii_27ououxf4fj3j(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3h0hxgoxfd673, var1);
   }

   public static int Xqedii_120ce21n6oyam(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3p0yb3d6n7p8o;
   }

   public static int Xqedii_39vp00i7dh8ns(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3m99or7g49jhf;
   }

   public static int Xqedii_25rgl8s52hvhq(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3pkf27q3vuxe8, var1);
   }

   public static long Xqedii_2awamoygfptgv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1jv867iuar2pi, var2);
   }

   public static long Xqedii_1x7lbul1xdvbk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_m9m4q4rb250m;
   }

   public static long Xqedii_2mp7wg9n3du9t(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2splo99c42cim;
   }

   public static long Xqedii_1ewj4l44rbe65(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_8y02b5xxok6x, var2);
   }

   public static String Xqedii_22igwehvowkyu(String var0) {
      String var1 = Xqedii_2p3mfxt3yb8k2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+5Of/dcydWetsdHqo3mcAz5goet3Wi5vXOrxSRQ+ROk=");
            int var3 = 1227529445;

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
            String var9 = Xqedii_2p3mfxt3yb8k2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3cohcasfktjl3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_12kw8oz76ipm9() {
   }

   private static int Xqedii_1uejomatc7y6m(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3uu3o2msqk82q(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
