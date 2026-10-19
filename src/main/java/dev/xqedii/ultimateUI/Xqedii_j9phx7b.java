package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_j9phx7b {
   private static final ConcurrentHashMap<String, String> Xqedii_2nued3vnaof5j = new ConcurrentHashMap<>();
   private static volatile int Xqedii_gz5a5s9a9eur = -1572530159;
   private static volatile int Xqedii_rp4pprmph57j = 1650465821;
   private static volatile int Xqedii_cd3jtn8pgu1n = -449709305;
   private static volatile int Xqedii_2anm9pnsmge5k = -1699919130;
   private static volatile long Xqedii_8adqjlbvgnao = 3854624543892856825L;
   private static volatile long Xqedii_12y06cz2tj8eg = 4755403644016999191L;
   private static volatile long Xqedii_3dm5jpvkyp81j = -8608088051583934661L;
   private static volatile long Xqedii_u2zxp4daua6n = 9152056659127546731L;

   public static int Xqedii_16kugrkdo0q7e(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_gz5a5s9a9eur, var1);
   }

   public static int Xqedii_ar3tio945bmp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_rp4pprmph57j;
   }

   public static int Xqedii_1bf038et8v68o(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_cd3jtn8pgu1n;
   }

   public static int Xqedii_2j7bvmyr1yhuj(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2anm9pnsmge5k, var1);
   }

   public static long Xqedii_2j7i3equ8k3uk(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_8adqjlbvgnao, var2);
   }

   public static long Xqedii_1pfjheoc9wb32(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_12y06cz2tj8eg;
   }

   public static long Xqedii_3cqoi5kj10iq4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3dm5jpvkyp81j;
   }

   public static long Xqedii_26jt5qdxuuv8u(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_u2zxp4daua6n, var2);
   }

   public static String Xqedii_266ohtu8zxb58(String var0) {
      String var1 = Xqedii_2nued3vnaof5j.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("CJOJEFnLE/EBVTxoYN6zeNsXOoLYeBGu2+2LLr3Bv3s=");
            int var3 = 751095943;

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
            String var9 = Xqedii_2nued3vnaof5j.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1o19q3yt307n4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_e234skl3x5gm() {
   }

   private static int Xqedii_19slp49jueruk(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_p498pr1dnvdm(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
