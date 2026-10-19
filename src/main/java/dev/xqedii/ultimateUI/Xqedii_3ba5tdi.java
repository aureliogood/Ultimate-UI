package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ba5tdi {
   private static final ConcurrentHashMap<String, String> Xqedii_25dhn7f3syad1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3f6brma4hqyr6 = 1237486463;
   private static volatile int Xqedii_1dkopiykcqkc5 = -1877171814;
   private static volatile int Xqedii_2xf0cnrcdv4fw = -2143553215;
   private static volatile int Xqedii_2z0gwqjieu7jn = 1665954932;
   private static volatile long Xqedii_3e77dsoe9rhxg = -5443012222950578081L;
   private static volatile long Xqedii_qqlzz7wlro8g = 8267410273626252245L;
   private static volatile long Xqedii_nvosi2h0c887 = -2723691659859091685L;
   private static volatile long Xqedii_2guse50ybbl7r = -5679258582770879566L;

   public static int Xqedii_2e5h0mjiehcmb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3f6brma4hqyr6, var1);
   }

   public static int Xqedii_3qjghhkbqzhpn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1dkopiykcqkc5;
   }

   public static int Xqedii_19zgy3nk3km7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2xf0cnrcdv4fw;
   }

   public static int Xqedii_o0jehclcld7a(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2z0gwqjieu7jn, var1);
   }

   public static long Xqedii_39fw5bbl06hgq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3e77dsoe9rhxg, var2);
   }

   public static long Xqedii_qbwj642n4fnx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_qqlzz7wlro8g;
   }

   public static long Xqedii_3r9or4bwjfc50(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_nvosi2h0c887;
   }

   public static long Xqedii_229hmhvjgean1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2guse50ybbl7r, var2);
   }

   public static String Xqedii_37b7gkntwnjst(String var0) {
      String var1 = Xqedii_25dhn7f3syad1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("TShx1N7aLOxahcvhDMZXNWe6HGqEXTP06qCW5YregO0=");
            int var3 = 135392314;

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
            String var9 = Xqedii_25dhn7f3syad1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1u6f225w1mjrp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1v8txyi0eri9z() {
   }

   private static int Xqedii_3a0m10tcyym8p(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2w5fchvrxy3v0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
