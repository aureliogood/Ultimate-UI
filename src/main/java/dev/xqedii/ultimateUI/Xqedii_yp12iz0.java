package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_yp12iz0 {
   private static final ConcurrentHashMap<String, String> Xqedii_1f18zf6sjuncr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1brtoks7wjohb = 911139102;
   private static volatile int Xqedii_btd0akxmaam1 = 291933906;
   private static volatile int Xqedii_300hrgahtmbtz = 292264312;
   private static volatile int Xqedii_2cr21g7zloeyx = 1714753513;
   private static volatile long Xqedii_72sat7vwq4ru = 5217635594261396602L;
   private static volatile long Xqedii_lz365oaxsq4x = 6308758425093773726L;
   private static volatile long Xqedii_1nvule4oq4ecg = 1823252134755543276L;
   private static volatile long Xqedii_irlgvqifzgcm = 4397091117645148178L;

   public static int Xqedii_38076oheu1krt(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1brtoks7wjohb, var1);
   }

   public static int Xqedii_35l4uqxul72dj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_btd0akxmaam1;
   }

   public static int Xqedii_3ekywfqzdh6hq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_300hrgahtmbtz;
   }

   public static int Xqedii_2yzw9x8fxfdex(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2cr21g7zloeyx, var1);
   }

   public static long Xqedii_3acgm3uupz46n(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_72sat7vwq4ru, var2);
   }

   public static long Xqedii_8sy2u3uh2ey7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_lz365oaxsq4x;
   }

   public static long Xqedii_1hdn7q9m99fqg(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1nvule4oq4ecg;
   }

   public static long Xqedii_uq8eyn3tpt3o(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_irlgvqifzgcm, var2);
   }

   public static String Xqedii_gww1z0gwk8uv(String var0) {
      String var1 = Xqedii_1f18zf6sjuncr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("OpVeMvZ7Bta0n8zxda7cqoftYeRr328xd7tKr9mXRRk=");
            int var3 = -1450668937;

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
            String var9 = Xqedii_1f18zf6sjuncr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_292wwnjobnqnc() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_33nxkx2586vya() {
   }

   private static int Xqedii_g04gstqkikte(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_j9i9d0zxme2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
