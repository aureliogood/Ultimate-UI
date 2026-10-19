package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1jvccks {
   private static final ConcurrentHashMap<String, String> Xqedii_3bdscmq3haklq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3sx4n36c139rp = -815091917;
   private static volatile int Xqedii_21x7muli3256q = 1357349947;
   private static volatile int Xqedii_195ufmir2164f = -1214455072;
   private static volatile int Xqedii_27dn7fuum7xa8 = 1940743188;
   private static volatile long Xqedii_337fwko55ewn2 = 8553450258558767991L;
   private static volatile long Xqedii_1ef9r9qxw3xap = 1722971472491345331L;
   private static volatile long Xqedii_1ddic25fa5dej = 5678084794356744206L;
   private static volatile long Xqedii_2avtndo61bu02 = -3210376962431170155L;

   public static int Xqedii_5bxb10eqwfwb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3sx4n36c139rp, var1);
   }

   public static int Xqedii_3vy317mim8n3v(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_21x7muli3256q;
   }

   public static int Xqedii_3g52fb6ozijaq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_195ufmir2164f;
   }

   public static int Xqedii_1f5b86i97hcd9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_27dn7fuum7xa8, var1);
   }

   public static long Xqedii_3o7mlrhdcpg7a(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_337fwko55ewn2, var2);
   }

   public static long Xqedii_2hdm84bj1wfpw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1ef9r9qxw3xap;
   }

   public static long Xqedii_2n7oqwxknvbx4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ddic25fa5dej;
   }

   public static long Xqedii_z28lvbolvasb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2avtndo61bu02, var2);
   }

   public static String Xqedii_2z40gh4fajlrs(String var0) {
      String var1 = Xqedii_3bdscmq3haklq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Dgbey64nYdqzpRzcuYGUtc2HHrprBnzUqen2GrfB0nU=");
            int var3 = 143540619;

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
            String var9 = Xqedii_3bdscmq3haklq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1jfqtdkqeq07q() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ji1z35m2841b() {
   }

   private static int Xqedii_3kutchc1qhj62(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2y7yije83j6g(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
