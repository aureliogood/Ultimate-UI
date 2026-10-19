package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ubr9cv {
   private static final ConcurrentHashMap<String, String> Xqedii_1extra0lyvavs = new ConcurrentHashMap<>();
   private static volatile int Xqedii_15wu3pdzhy09v = -1596798714;
   private static volatile int Xqedii_3o3yul7g3hwfn = -1482900313;
   private static volatile int Xqedii_rym0ppi2fcx3 = 780411704;
   private static volatile int Xqedii_1ohxh22s5zl54 = -789157742;
   private static volatile long Xqedii_39oznv4o57yiz = -8731662425238556582L;
   private static volatile long Xqedii_2csvlbjyporwl = 5577232020552959276L;
   private static volatile long Xqedii_em0gz9um3oaz = -7743206500832016272L;
   private static volatile long Xqedii_3kuf8iaspdijg = 2887107189679780372L;

   public static int Xqedii_242zwx5h5gqkz(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_15wu3pdzhy09v, var1);
   }

   public static int Xqedii_2bypb9j5al5yh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3o3yul7g3hwfn;
   }

   public static int Xqedii_1pe62fl8e7ona(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_rym0ppi2fcx3;
   }

   public static int Xqedii_5azomk8wa63a(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1ohxh22s5zl54, var1);
   }

   public static long Xqedii_1neywgkohl6pt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_39oznv4o57yiz, var2);
   }

   public static long Xqedii_15yclnn23w33u(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2csvlbjyporwl;
   }

   public static long Xqedii_12zceebuho0uz(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_em0gz9um3oaz;
   }

   public static long Xqedii_163tsixmwsxzb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3kuf8iaspdijg, var2);
   }

   public static String Xqedii_tpjrh7zb3syu(String var0) {
      String var1 = Xqedii_1extra0lyvavs.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("zSzVuVHg1ro7ib6b+44CuzAC35hjIkDBCT5n/FuKXjA=");
            int var3 = -1508132546;

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
            String var9 = Xqedii_1extra0lyvavs.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_u1dns3lloit8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1pqvyrcy9qqn9() {
   }

   private static int Xqedii_2gas7c6o1tv97(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1dn16ujqtejqy(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
