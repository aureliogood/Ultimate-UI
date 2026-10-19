package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_p5lwf4c {
   private static final ConcurrentHashMap<String, String> Xqedii_kqwlwlpqejui = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1k1hijv9vt6pm = -1062094120;
   private static volatile int Xqedii_3gu9ims3lyjrm = -699161909;
   private static volatile int Xqedii_e2gpp1f73wzz = 597319847;
   private static volatile int Xqedii_18l5c27hh4ga5 = 488576963;
   private static volatile long Xqedii_2ntdy50mejxn7 = -6415887981629758230L;
   private static volatile long Xqedii_31wvqtxqbbcsu = 4652860520087231564L;
   private static volatile long Xqedii_3e0mvt63vm6mo = -5461513262394363320L;
   private static volatile long Xqedii_lupjbx6p5ku8 = 9187601719863764365L;

   public static int Xqedii_3pxk1b91srwl3(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1k1hijv9vt6pm, var1);
   }

   public static int Xqedii_1sbe8lvn2cp68(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3gu9ims3lyjrm;
   }

   public static int Xqedii_1zsf7kqflaseo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_e2gpp1f73wzz;
   }

   public static int Xqedii_14z32hrm40lwq(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_18l5c27hh4ga5, var1);
   }

   public static long Xqedii_27vhjrmbct898(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ntdy50mejxn7, var2);
   }

   public static long Xqedii_14bcem39aw1fj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_31wvqtxqbbcsu;
   }

   public static long Xqedii_2s2c31qmd5phx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3e0mvt63vm6mo;
   }

   public static long Xqedii_fhjqfsxfatgd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_lupjbx6p5ku8, var2);
   }

   public static String Xqedii_1b2c1j0j7snzn(String var0) {
      String var1 = Xqedii_kqwlwlpqejui.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("puUQgNQbTgvsuspU/mqyp6pxV59O/O9nNzrH23TLi5I=");
            int var3 = -1162826633;

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
            String var9 = Xqedii_kqwlwlpqejui.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2jcjoahfsytl0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3gwaawf6firer() {
   }

   private static int Xqedii_1kpd3fchby3x5(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3txd0nlvj4pb9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
