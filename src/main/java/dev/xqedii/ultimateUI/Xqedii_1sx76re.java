package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1sx76re {
   private static final ConcurrentHashMap<String, String> Xqedii_1953nymvq0gp3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_k39gcgyb3qlp = -772834930;
   private static volatile int Xqedii_3crcf67kac1vy = 1984503912;
   private static volatile int Xqedii_2p9zoh5boji36 = -1254220164;
   private static volatile int Xqedii_3esyzlqj0cp26 = 35388427;
   private static volatile long Xqedii_cy7ju8xqxnt4 = -3873675370168925527L;
   private static volatile long Xqedii_1bmmgx1hp6oy9 = 8083408849840463873L;
   private static volatile long Xqedii_wj9qec3htqxy = 6764512108519794117L;
   private static volatile long Xqedii_yf9gb9btbu2l = 2338026224991120277L;

   public static int Xqedii_3j3uijiyzdkb9(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_k39gcgyb3qlp, var1);
   }

   public static int Xqedii_2r1j872djjg81(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3crcf67kac1vy;
   }

   public static int Xqedii_zguak3eg5e62(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2p9zoh5boji36;
   }

   public static int Xqedii_omz98uk2tmfi(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3esyzlqj0cp26, var1);
   }

   public static long Xqedii_1pncbxpbrrzlm(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_cy7ju8xqxnt4, var2);
   }

   public static long Xqedii_2hr2qcxmvjqvx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1bmmgx1hp6oy9;
   }

   public static long Xqedii_3b9wh5sq40ad8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_wj9qec3htqxy;
   }

   public static long Xqedii_e2mkmvp2au8b(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_yf9gb9btbu2l, var2);
   }

   public static String Xqedii_o7xu6d8aes30(String var0) {
      String var1 = Xqedii_1953nymvq0gp3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3t1kvG7l82JmK2QFnID8aIDL5mOY1KjidstEKNJCDRc=");
            int var3 = 231149272;

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
            String var9 = Xqedii_1953nymvq0gp3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1y1zk0da5n09j() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ef72qlougbih() {
   }

   private static int Xqedii_r4ftdsphsxo5(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1mhyz1w6e3a9p(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
