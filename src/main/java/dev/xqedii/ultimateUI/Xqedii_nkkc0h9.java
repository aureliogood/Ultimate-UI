package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_nkkc0h9 {
   private static final ConcurrentHashMap<String, String> Xqedii_3e9zfmqligd7d = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3jmdhpycvh53w = -1764129244;
   private static volatile int Xqedii_2x55wd9941gsm = 1054728769;
   private static volatile int Xqedii_3ldu9z6kllvgb = -2095634587;
   private static volatile int Xqedii_2mawf4imw5htr = -1075559749;
   private static volatile long Xqedii_1ljdpj0mhwb0u = -5523555640948563022L;
   private static volatile long Xqedii_1g6ad9bfzb30f = 1330805521632911515L;
   private static volatile long Xqedii_q64i5cf55mya = 1102647689341291311L;
   private static volatile long Xqedii_1cw6i7mtnhwni = -7187278780713687575L;

   public static int Xqedii_29bi1tzptdr9c(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3jmdhpycvh53w, var1);
   }

   public static int Xqedii_2rwl1ddpah451(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2x55wd9941gsm;
   }

   public static int Xqedii_2u3u7nzx59tbm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3ldu9z6kllvgb;
   }

   public static int Xqedii_16wpanvci9for(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2mawf4imw5htr, var1);
   }

   public static long Xqedii_u9md8e2cro2n(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ljdpj0mhwb0u, var2);
   }

   public static long Xqedii_1xu507exe01n4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1g6ad9bfzb30f;
   }

   public static long Xqedii_t5tdcd7kd4az(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_q64i5cf55mya;
   }

   public static long Xqedii_dw2b17lj1g82(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1cw6i7mtnhwni, var2);
   }

   public static String Xqedii_1k4kgr0mj9kqy(String var0) {
      String var1 = Xqedii_3e9zfmqligd7d.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("UR7NANfFsOJU7+MStgiRDbdIK8HTWAgWf9M8uqTcJ+o=");
            int var3 = -1466244741;

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
            String var9 = Xqedii_3e9zfmqligd7d.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2hbwtb5wzdqsx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2xtyvvbywthar() {
   }

   private static int Xqedii_2ib49jnanyjte(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_mp4me8d0w9qx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
