package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1i3f212 {
   private static final ConcurrentHashMap<String, String> Xqedii_1o5d82m2w9k0v = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1i38hburfeq94 = 1762881599;
   private static volatile int Xqedii_2gtbo9ho3i4np = -290504293;
   private static volatile int Xqedii_eit0i3qt5jvd = -453563684;
   private static volatile int Xqedii_1mbgy51sf7ivq = 539485852;
   private static volatile long Xqedii_3uimkm9itqxq6 = 9138310194430337615L;
   private static volatile long Xqedii_3qcrkhtt8z1mn = -2863691607333140714L;
   private static volatile long Xqedii_13jz1x64q0mc9 = -634426860606558842L;
   private static volatile long Xqedii_3p3hx3gd61q6l = -2682601910974013699L;

   public static int Xqedii_kw24jje291zn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1i38hburfeq94, var1);
   }

   public static int Xqedii_2rn9pe42rfd8o(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2gtbo9ho3i4np;
   }

   public static int Xqedii_1a3mghwn6zfo7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_eit0i3qt5jvd;
   }

   public static int Xqedii_24ljicv1g0g11(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1mbgy51sf7ivq, var1);
   }

   public static long Xqedii_1zca5kkms9n2p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3uimkm9itqxq6, var2);
   }

   public static long Xqedii_2m3o3csml0572(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3qcrkhtt8z1mn;
   }

   public static long Xqedii_2lynz8smskwxo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_13jz1x64q0mc9;
   }

   public static long Xqedii_28xydmtviiei1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3p3hx3gd61q6l, var2);
   }

   public static String Xqedii_1h80rfyddyrrq(String var0) {
      String var1 = Xqedii_1o5d82m2w9k0v.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("BoaysKCyty1V6OAzevaGVgJDnlBDH+3CBz8Entb9d0Y=");
            int var3 = -2079015759;

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
            String var9 = Xqedii_1o5d82m2w9k0v.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1kieftxw0f64h() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3epjmowrj9bqw() {
   }

   private static int Xqedii_3ld5shpn9ng8x(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1u3yekcn7u4h2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
