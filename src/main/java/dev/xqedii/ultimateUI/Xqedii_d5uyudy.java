package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_d5uyudy {
   private static final ConcurrentHashMap<String, String> Xqedii_1t1uw2pblbhfa = new ConcurrentHashMap<>();
   private static volatile int Xqedii_uby6heemiqb6 = 153629352;
   private static volatile int Xqedii_2o96wopa44kyy = -1799083318;
   private static volatile int Xqedii_1tp9uo4k2qhe9 = 795597885;
   private static volatile int Xqedii_2zjsvlj7r2sig = 938895414;
   private static volatile long Xqedii_3v3095xjesipe = 359618265244063694L;
   private static volatile long Xqedii_166rfc2vp9df = 2537320748439961345L;
   private static volatile long Xqedii_39igo5pm4ijpw = 8109351530666622181L;
   private static volatile long Xqedii_2v8dtasl7qi1u = 4602681705234164716L;

   public static int Xqedii_3lelij3rkidft(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_uby6heemiqb6, var1);
   }

   public static int Xqedii_2t6ti0iivyll8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2o96wopa44kyy;
   }

   public static int Xqedii_2w7w17ka6plxh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1tp9uo4k2qhe9;
   }

   public static int Xqedii_37kqfv36nxax1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2zjsvlj7r2sig, var1);
   }

   public static long Xqedii_1sb6qbqh4nbmg(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3v3095xjesipe, var2);
   }

   public static long Xqedii_2hps15yd62zfr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_166rfc2vp9df;
   }

   public static long Xqedii_2sg5i0e3d8yq4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_39igo5pm4ijpw;
   }

   public static long Xqedii_jaggsy1orxb9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2v8dtasl7qi1u, var2);
   }

   public static String Xqedii_vhgr3mv04ay6(String var0) {
      String var1 = Xqedii_1t1uw2pblbhfa.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("mhqD61KA1jzgDvIyLvs/scuxg8SxjW4RT85W7aFtdPk=");
            int var3 = -1493134898;

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
            String var9 = Xqedii_1t1uw2pblbhfa.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2xzicv0bbd06e() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_186noke82x4ll() {
   }

   private static int Xqedii_1gli1ay4418x0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3uw6kk9eessnq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
