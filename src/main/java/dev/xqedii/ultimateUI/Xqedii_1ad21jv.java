package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ad21jv {
   private static final ConcurrentHashMap<String, String> Xqedii_mllyo5xp8dhf = new ConcurrentHashMap<>();
   private static volatile int Xqedii_25sydfkf5dvvq = -678556075;
   private static volatile int Xqedii_2u5v2qdrl6mro = -1025308428;
   private static volatile int Xqedii_386dl1d5ymfs4 = -223093132;
   private static volatile int Xqedii_24b2xu4qa7oob = -80484834;
   private static volatile long Xqedii_mvzbx82r0r4b = 4366019253897085917L;
   private static volatile long Xqedii_2a7q462s2eb97 = -2962450197671525596L;
   private static volatile long Xqedii_f1ie5i9tzbir = -6774532788263694977L;
   private static volatile long Xqedii_303zsajkdkd2p = -6895526826215503666L;

   public static int Xqedii_3nkugl95x6mi0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_25sydfkf5dvvq, var1);
   }

   public static int Xqedii_3okz3tv90j087(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2u5v2qdrl6mro;
   }

   public static int Xqedii_35b9dq845x6pf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_386dl1d5ymfs4;
   }

   public static int Xqedii_3tmh54o84be9z(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_24b2xu4qa7oob, var1);
   }

   public static long Xqedii_fudv07ndasq9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_mvzbx82r0r4b, var2);
   }

   public static long Xqedii_1imoxk9yd48vi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2a7q462s2eb97;
   }

   public static long Xqedii_sq3zl0roeg35(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_f1ie5i9tzbir;
   }

   public static long Xqedii_2g423d76hc6z5(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_303zsajkdkd2p, var2);
   }

   public static String Xqedii_1waaayngsigk(String var0) {
      String var1 = Xqedii_mllyo5xp8dhf.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("f4bXfeUO0YJTQpHvHLI26g6bYWjqjSfDB/qvdfTRjj4=");
            int var3 = -1154269347;

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
            String var9 = Xqedii_mllyo5xp8dhf.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3e4wg915rqsdn() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3hwxwins52nj7() {
   }

   private static int Xqedii_3ahjuygktu30x(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3h38g1ftw2vgi(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
