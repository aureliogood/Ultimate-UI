package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3n9nzjt {
   private static final ConcurrentHashMap<String, String> Xqedii_26bt1pwrawrty = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3oexpl1qm4wgw = -707932076;
   private static volatile int Xqedii_hnnjd570q1ka = -700566432;
   private static volatile int Xqedii_e1g5fk9k25yb = 283383033;
   private static volatile int Xqedii_3o2mb5p0qmfb9 = 553159788;
   private static volatile long Xqedii_2nb13e5qx5gft = 2793341965970213676L;
   private static volatile long Xqedii_niwdeund4dzr = 5791890370978305681L;
   private static volatile long Xqedii_zji7fzk5lzmm = 593847531689517216L;
   private static volatile long Xqedii_2x9ffzsovf1t1 = 3986574588784509670L;

   public static int Xqedii_1u82u26xzslk8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3oexpl1qm4wgw, var1);
   }

   public static int Xqedii_1964sssol3uyd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_hnnjd570q1ka;
   }

   public static int Xqedii_3lkps5pplp7ec(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_e1g5fk9k25yb;
   }

   public static int Xqedii_32bherwlgr2d2(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3o2mb5p0qmfb9, var1);
   }

   public static long Xqedii_2rjfz43djnk6j(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2nb13e5qx5gft, var2);
   }

   public static long Xqedii_4b2287yxb6tb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_niwdeund4dzr;
   }

   public static long Xqedii_14mnlv0bkrnns(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_zji7fzk5lzmm;
   }

   public static long Xqedii_1l2lemi780prp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2x9ffzsovf1t1, var2);
   }

   public static String Xqedii_1ag86feebnnmm(String var0) {
      String var1 = Xqedii_26bt1pwrawrty.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("J+8svtvo83YoKb0DgxCh3aCMT8xdfVa9lCs78iWvidQ=");
            int var3 = 290090886;

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
            String var9 = Xqedii_26bt1pwrawrty.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_nor2quizn148() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2fu08xd10d1ap() {
   }

   private static int Xqedii_vssrdaeihox7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_4c8ibraydeh4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
