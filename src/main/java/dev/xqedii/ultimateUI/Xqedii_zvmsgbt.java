package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_zvmsgbt {
   private static final ConcurrentHashMap<String, String> Xqedii_2ls2jdtpnu80h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2h10wp7r10zyh = 1692923637;
   private static volatile int Xqedii_1mv4t3kh63ytc = 1929028231;
   private static volatile int Xqedii_3bvyfwwqqsb4l = 532571420;
   private static volatile int Xqedii_3c8pjicz52ttq = -855191974;
   private static volatile long Xqedii_36ldyoe9fr1y0 = -5587052148757949832L;
   private static volatile long Xqedii_4oqbm7jln3yg = 2836835978325639490L;
   private static volatile long Xqedii_d6dnt9qhyc2v = 4959017155478159544L;
   private static volatile long Xqedii_1ios3ok47azx3 = 7184661889749626471L;

   public static int Xqedii_31mesqkmpszat(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2h10wp7r10zyh, var1);
   }

   public static int Xqedii_21mk82jlipygz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1mv4t3kh63ytc;
   }

   public static int Xqedii_1uzw1su0tylxb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3bvyfwwqqsb4l;
   }

   public static int Xqedii_1dre13rp2m0gf(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3c8pjicz52ttq, var1);
   }

   public static long Xqedii_2am8nfr49ia85(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_36ldyoe9fr1y0, var2);
   }

   public static long Xqedii_1vtxhv17osgx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_4oqbm7jln3yg;
   }

   public static long Xqedii_q9vsf7nde5o3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_d6dnt9qhyc2v;
   }

   public static long Xqedii_13b89yu08g9m3(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1ios3ok47azx3, var2);
   }

   public static String Xqedii_17cnxmym3ayhx(String var0) {
      String var1 = Xqedii_2ls2jdtpnu80h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("UHF8vOdHpBRK7e3Xr29XtczPuxCvQrOaKffFg19jibg=");
            int var3 = -1339015140;

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
            String var9 = Xqedii_2ls2jdtpnu80h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1atbs4oed3m1x() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_29u9pwzydl6le() {
   }

   private static int Xqedii_wbnlb695r23h(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1gsmz92syqe4o(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
