package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

public final class Xqedii_2t253qr {
   public static final String Xqedii_34l0ep5dqefrr = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int Xqedii_iv9vf5i = 256;
   public static final int Xqedii_3et65s7 = 8;
   public static final int Xqedii_2opok8n = 57344;
   public static final int Xqedii_1wm1jgv = 63743;
   public static final int Xqedii_v420h8w = 32;
   public static final String Xqedii_32tkywz = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("CrGbHRS9nAG0gubOnR5Z2z0aaK38tWPh+sqxl+gQUVDhZN7j6OGlj5+uogs=");
   public static final String Xqedii_1fba608 = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("BK9VZfHneS3fWxuWqGdMlmrYhkXLzWvkWS6h1DGA22ZD7DzkUsi8SQ==");
   public static final String Xqedii_3287heg = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
      "Z7Pop4O0XkVIVKJPi5vXgHVKeNELp8BKydL78F0Y/nCciHDia07Y4RZjEypYab7i+G/iw5b4g/no04dOE+dvZxvthv8vjBtWaXf1xxkZ1OGlJx+jRhXlGeBxJlCQ2Nc1PP14TEG+ECt9eIogCatnt4sJGZ97XNkO1oVXxJaUNfmxU4Ly4UiysmEk"
   );
   public static final String Xqedii_2grproe = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
      "TubJFeF0amPpCaKKbA9vWiqPH8tOhKsdyxavWQ7bhKZyWzbNyXa0jx0tIcnw28Cl7jvOop04z/jNNmoK+l+wpMyBV/H5Z05pnuHbtxfa8ul2v7g0Wks4Og4tE/tVKOg5LJVIwJ9h3TLAjUpQTZHoj8NGJt7t8amva25VU1MwKljlN8R0I/g="
   );
   public static final String Xqedii_qkamv9f = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
      "Z8fpjEqP3EUEmYK6g2rxJkzYRhi215Lx5Oa46pMepNRtiEBLu8Ci/F7i+BHXZxAwGXCAX+xzpuYT0RYu/dL/TwVnEaIPQkvZU6nGXc/TxazVplUZHKnrQsKd3YQ0GOcaD28N/4BKKbPbr2tHzr7Midx7ZEq4f32lUIB2EWTCUkpqAEYKq50="
   );
   public static final Pattern Xqedii_2jae8sc;
   public static final Set<String> Xqedii_pi7q4dz;
   public String Xqedii_1woh7lz;
   public Xqedii_2ittm45 Xqedii_r5cqo88;

   public String Xqedii_3rv9moh(List<File> var1) {
      if ((131149044 * (131149044 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var2 = new StringBuilder();
         if (var1 != null) {
            for (File var4 : var1) {
               if (var4 != null) {
                  var2.append(var4.getAbsolutePath())
                     .append((char)Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901467808, 12))
                     .append(var4.length())
                     .append((char)Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1891477664, 18))
                     .append(var4.lastModified())
                     .append((char)Xqedii_2itpe68.Xqedii_rvkchjyukg36(-827435166, 30));
               }
            }
         }

         return var2.toString();
      }
   }

   public void Xqedii_a33f2m6() {
      if ((682609327 * 682609327 - 682609327 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1woh7lz = null;
         this.Xqedii_r5cqo88 = null;
      }
   }

   public Xqedii_2ittm45 Xqedii_1hvwbjh(File var1, Logger var2) {
      if ((1218310137 * 1218310137 - 1218310137 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return new Xqedii_2ittm45(Collections.emptyMap(), Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 9));
      } else {
         File var3 = new File(
            new File(var1, Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("CrGbHRS9nAG0gubOnR5Z2z0aaK38tWPh+sqxl+gQUVDhZN7j6OGlj5+uogs=")),
            Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("BK9VZfHneS3fWxuWqGdMlmrYhkXLzWvkWS6h1DGA22ZD7DzkUsi8SQ==")
         );
         if (!var3.exists()) {
            var3.mkdirs();
         }

         File var4 = new File(
            var1,
            Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
               "Z7Pop4O0XkVIVKJPi5vXgHVKeNELp8BKydL78F0Y/nCciHDia07Y4RZjEypYab7i+G/iw5b4g/no04dOE+dvZxvthv8vjBtWaXf1xxkZ1OGlJx+jRhXlGeBxJlCQ2Nc1PP14TEG+ECt9eIogCatnt4sJGZ97XNkO1oVXxJaUNfmxU4Ly4UiysmEk"
            )
         );
         if (!var4.exists()) {
            var4.mkdirs();
         }

         File var5 = new File(
            var1,
            Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
               "TubJFeF0amPpCaKKbA9vWiqPH8tOhKsdyxavWQ7bhKZyWzbNyXa0jx0tIcnw28Cl7jvOop04z/jNNmoK+l+wpMyBV/H5Z05pnuHbtxfa8ul2v7g0Wks4Og4tE/tVKOg5LJVIwJ9h3TLAjUpQTZHoj8NGJt7t8amva25VU1MwKljlN8R0I/g="
            )
         );
         File var6 = var5.getParentFile();
         if (var6 != null && !var6.exists()) {
            var6.mkdirs();
         }

         List var7 = this.Xqedii_uickl93(var3);
         String var8 = this.Xqedii_3rv9moh(var7);
         if (this.Xqedii_r5cqo88 != null && var8.equals(this.Xqedii_1woh7lz) && var5.isFile() && var4.isDirectory()) {
            return this.Xqedii_r5cqo88;
         } else {
            this.Xqedii_380zhrl(var4, var2);
            LinkedHashMap var9 = new LinkedHashMap();
            ArrayList var10 = new ArrayList();
            HashSet var11 = new HashSet();
            File var12 = new File(
               var1,
               Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
                  "Z8fpjEqP3EUEmYK6g2rxJkzYRhi215Lx5Oa46pMepNRtiEBLu8Ci/F7i+BHXZxAwGXCAX+xzpuYT0RYu/dL/TwVnEaIPQkvZU6nGXc/TxazVplUZHKnrQsKd3YQ0GOcaD28N/4BKKbPbr2tHzr7Midx7ZEq4f32lUIB2EWTCUkpqAEYKq50="
               )
            );
            LinkedHashMap var13 = this.Xqedii_1owjnro(var12, var5, var2);
            LinkedHashSet var14 = new LinkedHashSet(var13.values());
            int var15 = Xqedii_2itpe68.Xqedii_2qndzss3kq924(45513359, 30);
            int var16 = Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(478803841, 5);

            for (File var18 : (Iterable<File>) (var7)) {

               if (var18 != null && var18.isFile()) {
                  File var19 = this.Xqedii_yju3bt4(var18, var2);
                  if (var19 != null) {
                     var19 = this.Xqedii_2uw1jty(var19, var2);
                     if (var19 != null) {
                        BufferedImage var20;
                        try {
                           var20 = ImageIO.read(var19);
                        } catch (IOException var41) {
                           if (var2 != null) {
                              var2.warning(Xqedii_26v0bzknu4t8h(var19.getName(), var41.getMessage()));
                           }
                           continue;
                        }

                        if (var20 == null) {
                           if (var2 != null) {
                              var2.warning(Xqedii_3pnhqoz3u9s3c(var19.getName()));
                           }
                        } else {
                           int var21 = Math.max(Xqedii_2itpe68.Xqedii_2qndzss3kq924(-182549140, 15), var20.getWidth());
                           int var22 = Math.max(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420303137, 12), var20.getHeight());
                           int var23 = Math.max(
                              Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(428687649, 23),
                              (int)Math.ceil(var21 / Double.longBitsToDouble(Xqedii_2itpe68.Xqedii_2j0a2anvxqa5v(2886307434282345829L, 17)))
                           );
                           int var24 = Math.max(
                              Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(478803873, 5),
                              (int)Math.ceil(var22 / Double.longBitsToDouble(Xqedii_2itpe68.Xqedii_3a8ffzri11joh(-205530471516082317L, 63)))
                           );
                           String var25 = this.Xqedii_3kqaz8t(var3, var19, var11, var2);
                           StringBuilder var26 = new StringBuilder();
                           int var27 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 27);
                           ArrayList var28 = new ArrayList(var23 * var24);

                           label142:
                           for (int var29 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 2); var29 < var24; var29++) {
                              if (var29 > 0) {
                                 var26.append((char)Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1382112160, 4));
                              }

                              for (int var30 = Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-464536568, 8); var30 < var23; var30++) {
                                 int var31 = var30 * Xqedii_2itpe68.Xqedii_2qndzss3kq924(-174193300, 15);
                                 int var32 = var29 * Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1990830240, 19);
                                 int var33 = Math.min(Xqedii_2itpe68.Xqedii_rvkchjyukg36(1924028259, 26), var21 - var31);
                                 int var34 = Math.min(Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(37295023, 30), var22 - var32);
                                 if (var33 > 0 && var34 > 0) {
                                    String var35 = Xqedii_3uic2k4nmo67k(Xqedii_376339b(var25), ++var27);
                                    File var36 = new File(var4, var35);
                                    String var37 = var35.toLowerCase(Locale.ROOT);
                                    Integer var38 = (Integer)var13.get(var37);
                                    int var39;
                                    if (var38 != null
                                       && var38 >= Xqedii_2itpe68.Xqedii_rvkchjyukg36(1903056727, 22)
                                       && var38 <= Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1124656311, 24)) {
                                       var39 = var38;
                                    } else {
                                       Integer var40 = this.Xqedii_2nwjwe8(var14);
                                       if (var40 == null) {
                                          var16 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299553, 9);
                                          break label142;
                                       }

                                       var39 = var40;
                                       var13.put(var37, var39);
                                       var14.add(var39);
                                    }

                                    String var44 = new String(Character.toChars(var39));
                                    var26.append(var44);
                                    var10.add(new Xqedii_9fm8ycl(var35, var39));
                                    var28.add(new Xqedii_117zh3y(var20, var31, var32, var33, var34, var36));
                                 }
                              }
                           }

                           if (!var28.isEmpty()) {
                              var15 += this.Xqedii_2zmj771(var28, var2);
                           }

                           if (var26.length() > 0) {
                              var9.put(
                                 var25.toLowerCase(Locale.ROOT), new UiImageAtlasService.GeneratedImage(var25, var21, var22, var23, var24, var26.toString())
                              );
                           }

                           if (var16 != 0) {
                              break;
                           }
                        }
                     }
                  }
               }
            }

            if (var16 != 0 && var2 != null) {
               var2.warning(
                  Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
                     "p40M0vKMktLf9QJTK3XTnQHPVZZL7H01qOOVT79GemvaEv5U9+LCzEc+ObBHiJwTSt3SMj1xx0SABCDelmmDrjCgZwBu4NKFZCQXfZnPSFN0pMsYibDI3ZDsFoy2jkNIKDY+/+xs4sXwu88Vd/KYnRQDnVwLi8HwaNv7QySF5FkukCtvmDIinwumPYc3Up/nc+fNWgVQowMirh0C4kY1ykOh+7AFAqjiMuUlfvyD1Fb1A5zsVzYa0PyZJS3zZ65nD8ZeVz8ErLc67bFs0Rn2GyToXX9uViL0yQE="
                  )
               );
            }

            this.Xqedii_1pslcum(var5, var10, var2);
            this.Xqedii_188508q(var12, var13, var2);
            Xqedii_2ittm45 var42 = new Xqedii_2ittm45(Collections.unmodifiableMap(new LinkedHashMap<>(var9)), var15);
            this.Xqedii_1woh7lz = var16 != 0 ? null : var8;
            this.Xqedii_r5cqo88 = var16 != 0 ? null : var42;
            return var42;
         }
      }
   }

   public UiImageAtlasService.GeneratedImage Xqedii_1jkbht0(File var1, String var2, Logger var3) {
      if ((1856217521 ^ 1856217521) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && !var2.isBlank()) {
         File var4 = new File(
            var1,
            Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
               "Z8fpjEqP3EUEmYK6g2rxJkzYRhi215Lx5Oa46pMepNRtiEBLu8Ci/F7i+BHXZxAwGXCAX+xzpuYT0RYu/dL/TwVnEaIPQkvZU6nGXc/TxazVplUZHKnrQsKd3YQ0GOcaD28N/4BKKbPbr2tHzr7Midx7ZEq4f32lUIB2EWTCUkpqAEYKq50="
            )
         );
         if (!var4.exists()) {
            return null;
         } else {
            LinkedHashMap var5 = this.Xqedii_1owjnro(var4, null, var3);
            if (var5 != null && !var5.isEmpty()) {
               String var6 = Xqedii_376339b(var2);
               File var7 = new File(
                  new File(var1, Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("CrGbHRS9nAG0gubOnR5Z2z0aaK38tWPh+sqxl+gQUVDhZN7j6OGlj5+uogs=")),
                  Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("BK9VZfHneS3fWxuWqGdMlmrYhkXLzWvkWS6h1DGA22ZD7DzkUsi8SQ==")
               );
               File var8 = null;

               for (File var10 : this.Xqedii_uickl93(var7)) {
                  if (var10 != null && var10.isFile() && Xqedii_376339b(this.Xqedii_1lwws2m(var10.getName())).equals(var6)) {
                     var8 = var10;
                     break;
                  }
               }

               if (var8 == null) {
                  return null;
               } else {
                  BufferedImage var21;
                  try {
                     var21 = ImageIO.read(var8);
                  } catch (IOException var20) {
                     return null;
                  }

                  if (var21 == null) {
                     return null;
                  } else {
                     int var22 = Math.max(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299169, 7), var21.getWidth());
                     int var11 = Math.max(Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 15), var21.getHeight());
                     int var12 = Math.max(
                        Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(421347617, 20),
                        (int)Math.ceil(var22 / Double.longBitsToDouble(Xqedii_2itpe68.Xqedii_3a8ffzri11joh(8342920169355280201L, 13)))
                     );
                     int var13 = Math.max(
                        Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-198995650, 26),
                        (int)Math.ceil(var11 / Double.longBitsToDouble(Xqedii_2itpe68.Xqedii_3a8ffzri11joh(60937058266692068L, 28)))
                     );
                     StringBuilder var14 = new StringBuilder();
                     int var15 = Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-464536568, 8);

                     for (int var16 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 31); var16 < var13; var16++) {
                        if (var16 > 0) {
                           var14.append((char)Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(470630689, 23));
                        }

                        for (int var17 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 16); var17 < var12; var17++) {
                           String var18 = Xqedii_2qt4fvnh3isk5(var6, ++var15).toLowerCase(Locale.ROOT);
                           Integer var19 = (Integer)var5.get(var18);
                           if (var19 == null) {
                              return null;
                           }

                           var14.append(new String(Character.toChars(var19)));
                        }
                     }

                     return new UiImageAtlasService.GeneratedImage(var6, var22, var11, var12, var13, var14.toString());
                  }
               }
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public Integer Xqedii_2nwjwe8(LinkedHashSet<Integer> var1) {
      if ((2130385015 ^ 2130385015) != 0) {
         throw new IllegalStateException();
      } else {
         for (int var2 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(445464865, 10); var2 <= Xqedii_2itpe68.Xqedii_rvkchjyukg36(1230919527, 19); var2++) {
            if (!var1.contains(var2)) {
               return var2;
            }
         }

         return null;
      }
   }

   public LinkedHashMap<String, Integer> Xqedii_1owjnro(File var1, File var2, Logger var3) {
      if ((-156718260 * -156718260 - -156718260 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var4 = new LinkedHashMap();
         if (var1 != null && var1.exists() && var1.isFile()) {
            Properties var5 = new Properties();

            try (InputStream var6 = Files.newInputStream(var1.toPath())) {
               var5.load(var6);
            } catch (Exception var16) {
               if (var3 != null) {
                  var3.warning(Xqedii_2s7pw19rius57(var16.getMessage()));
               }

               return var4;
            }

            ArrayList var17 = new ArrayList<>(var5.stringPropertyNames());
            var17.sort(String.CASE_INSENSITIVE_ORDER);
            LinkedHashSet var7 = new LinkedHashSet();

            for (String var9 : (Iterable<String>) (var17)) {

               if (var9 != null && !var9.isBlank()) {
                  String var10 = var5.getProperty(var9);
                  if (var10 != null && !var10.isBlank()) {
                     int var11;
                     try {
                        var11 = Integer.parseInt(var10.trim());
                     } catch (NumberFormatException var15) {
                        continue;
                     }

                     if (var11 >= Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1899910944, 7)
                        && var11 <= Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(116212030, 21)
                        && var7.add(var11)) {
                        var4.put(var9, var11);
                     }
                  }
               }
            }

            if (var4.isEmpty()) {
               var4.putAll(this.Xqedii_1ib56zk(var2, var3));
            }

            return var4;
         } else {
            var4.putAll(this.Xqedii_1ib56zk(var2, var3));
            return var4;
         }
      }
   }

   public LinkedHashMap<String, Integer> Xqedii_1ib56zk(File var1, Logger var2) {
      if ((37128759 * (37128759 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap();
         if (var1 != null && var1.exists() && var1.isFile()) {
            String var4;
            try {
               var4 = Files.readString(var1.toPath(), StandardCharsets.UTF_8);
            } catch (IOException var9) {
               if (var2 != null) {
                  var2.warning(Xqedii_276ulliianf8n(var9.getMessage()));
               }

               return var3;
            }

            LinkedHashSet var5 = new LinkedHashSet();
            Matcher var6 = Xqedii_2jae8sc.matcher(var4);

            while (var6.find()) {
               String[] var10001 = new String[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299169, 7)];
               var10001[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 3)] = var6.group(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(419774753, 19));
               String var7 = this.Xqedii_1dcr7gg(var10001).trim().toLowerCase(Locale.ROOT);
               if (!var7.isBlank()) {
                  String[] var10002 = new String[Xqedii_2itpe68.Xqedii_2qndzss3kq924(-365098279, 16)];
                  var10002[Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(2111850274, 19)] = var6.group(Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-1055094281, 29));
                  Integer var8 = this.Xqedii_3ib5sdb(this.Xqedii_1dcr7gg(var10002));
                  if (var8 != null
                     && var8 >= Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(-653442784, 17)
                     && var8 <= Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1193654808, 3)
                     && var5.add(var8)) {
                     var3.put(var7, var8);
                  }
               }
            }

            return var3;
         } else {
            return var3;
         }
      }
   }

   public Integer Xqedii_3ib5sdb(String var1) {
      if ((1748686729 * 1748686729 - 1748686729 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(2047985823, 25)];
         var10001[Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1547653730, 20)] = var1;
         String var2 = this.Xqedii_1dcr7gg(var10001);
         if (var2.isBlank()) {
            return null;
         } else {
            StringBuilder var3 = new StringBuilder(var2.length());

            for (int var4 = Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 28); var4 < var2.length(); var4++) {
               char var5 = var2.charAt(var4);
               if (var5 == Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(431309089, 17)
                  && var4 + Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1884399776, 22) < var2.length()
                  && var2.charAt(var4 + Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1111036911, 30)) == Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176952, 1)) {
                  String var6 = var2.substring(
                     var4 + Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176988, 2), var4 + Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1895934112, 20)
                  );

                  try {
                     int var7 = Integer.parseInt(var6, Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1915213316, 7));
                     var3.append((char)var7);
                     var4 += 5;
                     continue;
                  } catch (NumberFormatException var8) {
                  }
               }

               var3.append(var5);
            }

            return var3.length() == 0 ? null : var3.codePointAt(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 30));
         }
      }
   }

   public String Xqedii_1dcr7gg(String... var1) {
      if ((-1472578618 * -1472578618 + -1472578618 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.length != 0) {
         String[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = Xqedii_2itpe68.Xqedii_2qndzss3kq924(1828003333, 7); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (var5 != null && !var5.isBlank()) {
               return var5;
            }
         }

         return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
      } else {
         return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
      }
   }

   public void Xqedii_188508q(File var1, Map<String, Integer> var2, Logger var3) {
      if ((406546571 * (406546571 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         File var4 = var1.getParentFile();
         if (var4 != null && !var4.exists()) {
            var4.mkdirs();
         }

         Properties var5 = new Properties();
         ArrayList var6 = new ArrayList(var2.keySet());
         var6.sort(String.CASE_INSENSITIVE_ORDER);

         for (String var8 : (Iterable<String>) (var6)) {

            if (var8 != null && !var8.isBlank()) {
               Integer var9 = (Integer)var2.get(var8);
               if (var9 != null) {
                  var5.setProperty(var8, Integer.toString(var9));
               }
            }
         }

         try (OutputStream var13 = Files.newOutputStream(var1.toPath())) {
            var5.store(
               var13,
               Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
                  "7XVioM7JZKeh6pXUaKHItyF15aTI1hW2F2wZfMH5xW7qeRZ9+mhEuiVQc6CIQ9QXAI60znByh3SxAc7kP13hTNFy/J3zLX8mrNc3VMHjOkEShMolICPBdVe3l/3NdIhYxDGHV5+aPWgMj4vRWIM="
               )
            );
         } catch (Exception var12) {
            if (var3 != null) {
               var3.warning(Xqedii_qbfmparc9pmj(var12.getMessage()));
            }
         }
      }
   }

   public List<File> Xqedii_uickl93(File var1) {
      if (((-2146906379 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         this.Xqedii_2jk852a(var1, var2, Xqedii_2itpe68.Xqedii_2qndzss3kq924(1530742657, 5));
         var2.sort(Comparator.comparing(File::getAbsolutePath, String.CASE_INSENSITIVE_ORDER));
         return var2;
      }
   }

   public void Xqedii_2jk852a(File var1, List<File> var2, int var3) {
      if ((-1563651820 * -1563651820 + -1563651820 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 <= Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(668599410, 15) && var1.isDirectory()) {
         File[] var4 = var1.listFiles();
         if (var4 != null && var4.length != 0) {
            ArrayList var5 = new ArrayList();
            File[] var6 = var4;
            int var7 = var4.length;

            for (int var8 = Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 8); var8 < var7; var8++) {
               File var9 = var6[var8];
               if (var9 != null) {
                  if (var9.isDirectory()) {
                     if (!var9.isHidden() && !var9.getName().startsWith(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("9SMnY/5NmnjREqB/CctuNotJkJj/+T1R+2Po2vxz"))) {
                        var5.add(var9);
                     }
                  } else if (var9.isFile() && this.Xqedii_1yty2s4(var9)) {
                     var2.add(var9);
                  }
               }
            }

            var5.sort(Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

            for (File var11 : (Iterable<File>) (var5)) {

               this.Xqedii_2jk852a(var11, var2, var3 + Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 19));
            }
         }
      }
   }

   public boolean Xqedii_1yty2s4(File var1) {
      if (((519217725 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1633435475, 12) != 0);
      } else {
         String var2 = var1.getName().toLowerCase(Locale.ROOT);
         int var3 = var2.lastIndexOf(Xqedii_2itpe68.Xqedii_2qndzss3kq924(-362149159, 16));
         return var3 > 0 && var3 < var2.length() - Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1056187281, 18) && Xqedii_pi7q4dz.contains(var2.substring(var3 + Xqedii_2itpe68.Xqedii_2qndzss3kq924(-816715690, 11)));
      }
   }

   public static String Xqedii_32qc6t2(File var0, File var1) {
      if ((-1666306159 * -1666306159 + -1666306159 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         File var2 = var1.getParentFile();
         if (var2 == null) {
            return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
         } else {
            String var3 = var0.getAbsolutePath();
            String var4 = var2.getAbsolutePath();
            if (var4.equalsIgnoreCase(var3)) {
               return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
            } else {
               return var4.length() > var3.length() + Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-2072893474, 31)
                     && var4.substring(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 1), var3.length()).equalsIgnoreCase(var3)
                  ? var4.substring(var3.length() + Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(578676807, 11))
                     .replace((char)Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1960945824, 20), (char)Xqedii_2itpe68.Xqedii_2qndzss3kq924(728213932, 2))
                  : Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
            }
         }
      } else {
         return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
      }
   }

   public String Xqedii_3kqaz8t(File var1, File var2, Set<String> var3, Logger var4) {
      if (((827350355 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var5 = Xqedii_376339b(this.Xqedii_1lwws2m(var2.getName()));
         if (var3.add(var5.toLowerCase(Locale.ROOT))) {
            return var5;
         } else {
            String var6 = Xqedii_32qc6t2(var1, var2);
            String var7 = var6.isBlank()
               ? var5
               : Xqedii_376339b(
                  Xqedii_ai78xbs9iq9l(
                     var6.replace((char)Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1629260274, 29), (char)Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299985, 4)), var5
                  )
               );
            if (var3.add(var7.toLowerCase(Locale.ROOT))) {
               if (var4 != null) {
                  var4.warning(Xqedii_258r0mb47rmib(var5, var7, var2.getPath()));
               }

               return var7;
            } else {
               int var8 = Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(298360700, 1);
               String var9 = Xqedii_8q8noy3zr1k3(var7, var8);

               while (!var3.add(var9.toLowerCase(Locale.ROOT))) {
                  var9 = Xqedii_1421ikqj10oct(var7, ++var8);
               }

               if (var4 != null) {
                  var4.warning(Xqedii_2lwdi6stw6j4g(var5, var9, var2.getPath()));
               }

               return var9;
            }
         }
      }
   }

   public File Xqedii_yju3bt4(File var1, Logger var2) {
      if (((-293486449 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isFile()) {
         String var3 = var1.getName();
         int var4 = var3.lastIndexOf(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(421151009, 15));
         String var5 = var4 > 0
            ? var3.substring(var4 + Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420282657, 14)).toLowerCase(Locale.ROOT)
            : Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
         if (var5.equals(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Xx2jnwSkE8mcrLQN/6r6wwm4Eqg8XgqNM/hxUeOITj4F5Q=="))) {
            return var1;
         } else {
            BufferedImage var6;
            try {
               var6 = ImageIO.read(var1);
            } catch (IOException var17) {
               if (var2 != null) {
                  var2.warning(Xqedii_1sg8akn48hfdf(var3, var17.getMessage()));
               }

               return null;
            }

            if (var6 == null) {
               if (var2 != null) {
                  var2.warning(Xqedii_1xky3184ayo26(var3));
               }

               return null;
            } else {
               String var7 = var4 > 0 ? var3.substring(Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 10), var4) : var3;
               File var8 = new File(var1.getParentFile(), Xqedii_1oxis0ciolfxi(var7));
               BufferedImage var9;
               if (var6.getType() == Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1900128416, 20)) {
                  var9 = var6;
               } else {
                  var9 = new BufferedImage(var6.getWidth(), var6.getHeight(), Xqedii_2itpe68.Xqedii_2qndzss3kq924(1456427504, 3));
                  Graphics2D var10 = var9.createGraphics();

                  try {
                     var10.setComposite(AlphaComposite.Src);
                     var10.drawImage(var6, Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 25), Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 31), null);
                  } finally {
                     var10.dispose();
                  }
               }

               try {
                  ImageIO.write(var9, Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Xx2jnwSkE8mcrLQN/6r6wwm4Eqg8XgqNM/hxUeOITj4F5Q=="), var8);
               } catch (IOException var16) {
                  if (var2 != null) {
                     var2.warning(Xqedii_rgok6a4z7hk5(var8.getName(), var16.getMessage()));
                  }

                  return null;
               }

               if (!var1.delete() && var2 != null) {
                  var2.warning(Xqedii_2l1s8ebl2pmfw(var3));
               }

               if (var2 != null) {
                  var2.info(Xqedii_aoyt7f6y1jaj(var3, var8.getName()));
               }

               return var8;
            }
         }
      } else {
         return null;
      }
   }

   public File Xqedii_2uw1jty(File var1, Logger var2) {
      if (((-1729713640 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isFile()) {
         String[] var10001 = new String[Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-1908081712, 4)];
         var10001[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 3)] = var1.getName();
         String var3 = this.Xqedii_1dcr7gg(var10001);
         if (var3.isBlank()) {
            return var1;
         } else {
            int var4 = var3.lastIndexOf(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(1762476320, 27));
            String var5 = var4 > 0 ? var3.substring(Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(596721392, 2), var4) : var3;
            String var6 = var4 > 0 && var4 < var3.length() - Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 5)
               ? var3.substring(var4 + Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 13)).toLowerCase(Locale.ROOT)
               : Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Xx2jnwSkE8mcrLQN/6r6wwm4Eqg8XgqNM/hxUeOITj4F5Q==");
            String var7 = Xqedii_376339b(var5);
            File var8 = this.Xqedii_2kw0xer(var1.getParentFile(), var7, var6, var1);
            if (var8 == null) {
               return var1;
            } else if (var8.getAbsolutePath().equalsIgnoreCase(var1.getAbsolutePath())) {
               return var1;
            } else {
               try {
                  Files.move(var1.toPath(), var8.toPath());
                  if (var2 != null) {
                     var2.info(Xqedii_98lx2t4ot9xk(var1.getName(), var8.getName()));
                  }

                  return var8;
               } catch (IOException var10) {
                  if (var2 != null) {
                     var2.warning(Xqedii_4a7xmad7xsvb(var1.getName(), var10.getMessage()));
                  }

                  return var1;
               }
            }
         }
      } else {
         return null;
      }
   }

   public File Xqedii_2kw0xer(File var1, String var2, String var3, File var4) {
      if ((-24337398 * -24337398 + -24337398 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var4;
      } else {
         String[] var10001 = new String[Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 0)];
         var10001[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 20)] = var3;
         String var5 = this.Xqedii_1dcr7gg(var10001).toLowerCase(Locale.ROOT);
         if (var5.isBlank()) {
            var5 = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Xx2jnwSkE8mcrLQN/6r6wwm4Eqg8XgqNM/hxUeOITj4F5Q==");
         }

         String var6 = Xqedii_376339b(var2);
         File var7 = new File(var1, Xqedii_38ztl35dkkdrl(var6, var5));

         for (int var8 = Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901168800, 13);
            var7.exists() && !var7.getAbsolutePath().equalsIgnoreCase(var4.getAbsolutePath());
            var8++
         ) {
            var7 = new File(var1, Xqedii_1cqb4mpe5nrbu(var6, var8, var5));
         }

         return var7;
      }
   }

   public int Xqedii_2zmj771(List<Xqedii_117zh3y> var1, Logger var2) {
      if ((-1169570043 * -1169570043 - -1169570043 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         AtomicInteger var3 = new AtomicInteger(Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-1619521080, 17));
         var1.parallelStream().forEach(var3x -> {
            if ((-1568438478 * -1568438478 + -1568438478 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               if (this.Xqedii_1kaqubp(var3x.source(), var3x.sourceX(), var3x.sourceY(), var3x.copyWidth(), var3x.copyHeight(), var3x.destination(), var2)) {
                  var3.incrementAndGet();
               }
            }
         });
         return var3.get();
      } else {
         return Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 27);
      }
   }

   public void Xqedii_380zhrl(File var1, Logger var2) {
      if ((193053136 ^ 193053136) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (!var1.exists()) {
            var1.mkdirs();
         } else {
            File[] var3 = var1.listFiles();
            if (var3 != null) {
               File[] var4 = var3;
               int var5 = var3.length;

               for (int var6 = Xqedii_2itpe68.Xqedii_2qndzss3kq924(-182581908, 15); var6 < var5; var6++) {
                  File var7 = var4[var6];
                  if (var7 != null) {
                     if (var7.isDirectory()) {
                        this.Xqedii_380zhrl(var7, var2);
                     }

                     if (!var7.delete() && var2 != null) {
                        var2.warning(Xqedii_33afhzhtidchh(var7.getAbsolutePath()));
                     }
                  }
               }
            }
         }
      }
   }

   public boolean Xqedii_1kaqubp(BufferedImage var1, int var2, int var3, int var4, int var5, File var6, Logger var7) {
      if ((-1666930721 ^ -1666930721) != 0) {
         throw new IllegalStateException();
      } else {
         int[] var8 = new int[var4 * var5];
         var1.getRGB(var2, var3, var4, var5, var8, Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 25), var4);
         BufferedImage var9 = new BufferedImage(
            Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1632386899, 12),
            Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-679404407, 21),
            Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(2081540255, 25)
         );
         var9.setRGB(
            Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 23),
            Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 9),
            var4,
            var5,
            var8,
            Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(298360696, 1),
            var4
         );
         int var10 = Math.max(
            Xqedii_2itpe68.Xqedii_rvkchjyukg36(1901176991, 16),
            Math.min(Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1990305952, 19), var4 - Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-1591965193, 29))
         );
         int var11 = Math.max(
            Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 6),
            Math.min(Xqedii_2itpe68.Xqedii_2qndzss3kq924(-665399463, 27), var5 - Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(151863585, 28))
         );
         int var12 = var9.getRGB(var10, var11);
         int var13 = var12 & Xqedii_2itpe68.Xqedii_rvkchjyukg36(1903052959, 21);
         int var14 = var12 >>> Xqedii_2itpe68.Xqedii_2qndzss3kq924(-2124726966, 29) & Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420306625, 5);
         int var15 = Math.max(var14, Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1206537260, 25));
         var9.setRGB(var10, var11, var15 << Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(149180324, 0) | var13);

         try {
            ImageIO.write(var9, Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Xx2jnwSkE8mcrLQN/6r6wwm4Eqg8XgqNM/hxUeOITj4F5Q=="), var6);
            return (Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420430113, 17) != 0);
         } catch (IOException var17) {
            if (var7 != null) {
               var7.warning(Xqedii_epp9yhdp0hwo(var6.getName(), var17.getMessage()));
            }

            return (Xqedii_2itpe68.Xqedii_2qndzss3kq924(364106872, 1) != 0);
         }
      }
   }

   public void Xqedii_1pslcum(File var1, List<Xqedii_9fm8ycl> var2, Logger var3) {
      if ((-888873023 ^ -888873023) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var4 = new StringBuilder();
         var4.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("nJvMKnmZWmAF/lN/81CyUem0CfBaTo5lZeLaULC9Plo="));
         var4.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("SvgmHdRC/Q1GBE8hGunJ76fu+c4UTpyVadyD9CzLzWl/OoNsN/ePC5M5bCwh3GGgyunFL4Iw23poQ119UJw="));
         if (var2 != null) {
            for (int var5 = Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-1980268260, 13); var5 < var2.size(); var5++) {
               Xqedii_9fm8ycl var6 = (Xqedii_9fm8ycl)var2.get(var5);
               var4.append(
                     Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
                        "DNHsWW+C2LFJ4Hgt9z7iCFkr6MdM3bfR6kzmntEWKDNPkvfB8vCl8LjNKo0fXcSoMz4+Oqc5n8hewVdmx/2HjY06OYTt+W7BDLqMqUIGCV1orp2ntXmNF7UiR8Ix87xeaONGSUiAZEvjLrQFVfOnqBa1xztuXYBGjleDY0cX9ube/9w7JifjRw=="
                     )
                  )
                  .append(this.Xqedii_253p1ce(var6.fileName()))
                  .append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("ppeH7j5MuV8Sju3R9CPCBqMmehxKCpTvceAyp74A6Ds61Mu8fg7ZTw/UrbgP/6SUsKKGr86u"))
                  .append(Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176688, 4))
                  .append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("lA016Fy1Lg6RPwhn8o4vWxNh3PXNx1cfaV0/TmKHakST3EPtIkjGqnT3dtM8mSimruskag=="))
                  .append(Xqedii_2itpe68.Xqedii_2qndzss3kq924(1530750849, 5))
                  .append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("dPWQ6TMZjh5+SUbJH7TPqQot3yEjVVAF3kOdvDvoMlRpxO3FP0KMwxhvKPnFnUY5jOkfSxDx"))
                  .append(this.Xqedii_2zo5t1v(var6.codepoint()))
                  .append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("oeVyRYRu2/coXeyfOCipCgACI5izhyxTKPIzsJ7FfaxB4g=="));
               if (var5 < var2.size() - Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 7)) {
                  var4.append((char)Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-469616365, 22));
               }

               var4.append((char)Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(149180342, 0));
            }
         }

         var4.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("EOBLd6QCV0xOeRljWasGfxclFgQZ6gxtMNhb0rAdxj2JoCzl"));
         var4.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("i4C+s8zVVxyy3sa2Qe37Ctir9yPO8kxSvAbETZAYxAg="));

         try {
            Files.writeString(var1.toPath(), var4.toString(), StandardCharsets.UTF_8);
         } catch (IOException var7) {
            if (var3 != null) {
               var3.warning(Xqedii_1x3ecg2wj70z2(var7.getMessage()));
            }
         }
      }
   }

   public String Xqedii_1lwws2m(String var1) {
      if ((-1295694471 * -1295694471 - -1295694471 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         int var2 = var1.lastIndexOf(Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(-1727184598, 30));
         return var2 <= 0 ? var1 : var1.substring(Xqedii_2itpe68.Xqedii_2qndzss3kq924(728213744, 2), var2);
      } else {
         return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("c0eF2AKJgpk6j6ISy87nnyq052ZLdkLuFtfNs3VGYvtaGPnkPDQ=");
      }
   }

   public static String Xqedii_376339b(String var0) {
      if ((-1723167498 * (-1723167498 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isBlank()) {
         StringBuilder var1 = new StringBuilder(var0.length());
         int var2 = Xqedii_2itpe68.Xqedii_2qndzss3kq924(364106872, 1);
         char[] var3 = var0.toCharArray();
         int var4 = var3.length;

         for (int var5 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 21); var5 < var4; var5++) {
            char var6 = var3[var5];
            if (!Character.isWhitespace(var6)
               && var6 != Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901349024, 12)
               && var6 != Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1882302624, 19)) {
               char var7 = Character.toLowerCase(var6);
               if (var7 >= Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(411648289, 18) && var7 <= Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1277858795, 9)
                  || Character.isDigit(var7)) {
                  var1.append(var7);
                  var2 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 26);
               }
            } else if (var2 == 0) {
               var1.append((char)Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1233475902, 6));
               var2 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299057, 4);
            }
         }

         String var8 = var1.toString();

         while (var8.startsWith(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc"))) {
            var8 = var8.substring(Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 22));
         }

         while (var8.endsWith(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc"))) {
            var8 = var8.substring(Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(-2128836105, 29), var8.length() - Xqedii_2itpe68.Xqedii_rvkchjyukg36(-1901176992, 12));
         }

         return var8.isBlank() ? Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("c0eF2AKJgpk6j6ISy87nnyq052ZLdkLuFtfNs3VGYvtaGPnkPDQ=") : var8;
      } else {
         return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("c0eF2AKJgpk6j6ISy87nnyq052ZLdkLuFtfNs3VGYvtaGPnkPDQ=");
      }
   }

   public String Xqedii_253p1ce(String var1) {
      if ((-1645304781 * -1645304781 - -1645304781 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         StringBuilder var2 = new StringBuilder(var1.length() + Xqedii_2itpe68.Xqedii_2qndzss3kq924(-2011843628, 25));
         char[] var3 = var1.toCharArray();
         int var4 = var3.length;

         for (int var5 = Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(74590174, 31); var5 < var4; var5++) {
            char var6 = var3[var5];
            switch (var6) {
               case '\b':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("fNcl+6sSLJBddOPnwoslNWsXW8XjUpfUkMv485/esHo="));
                  break;
               case '\t':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("lVs456v1cc1rAFvJC94frvoD24+8MTyuXa1dJa+yabA="));
                  break;
               case '\n':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("mO3TZNcLq8Re7OVLkqhkH7ihSgQPaucH8WANMLQU7R8="));
                  break;
               case '\f':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("HaBWaieX+ZjtkGQUX5cIz7Tn4/VbYwurwyuQ0xt6uvE="));
                  break;
               case '\r':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("UEjvfxCEcVIgtwfMIt77LYCHukL0eXysbbVZD797alk="));
                  break;
               case '"':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vEgZCjvyPpeKDnEawtAz6qFZEaTjBO2xrkDSEQTthZk="));
                  break;
               case '\\':
                  var2.append(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("1uWpuHuDOL/gVZXNASOemRDp6hjGC1arVoBzowaVJpk="));
                  break;
               default:
                  if (var6 < Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(428687649, 18)) {
                     String var10001 = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("uaHFes2MwKt6/h0ggjG0RDtLKusuGoxHc5AFd5CeNVpekwxb+soFIw==");
                     Object[] var10002 = new Object[Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1915215492, 7)];
                     var10002[Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(1157349518, 12)] = Integer.valueOf(var6);
                     var2.append(String.format(var10001, var10002));
                  } else {
                     var2.append(var6);
                  }
            }
         }

         return var2.toString();
      } else {
         return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("vK6Ow4A5jlZ/cWLs2b0IhXMrd58/dPIbftA1Cg==");
      }
   }

   public String Xqedii_2zo5t1v(int var1) {
      if ((1265500044 * (1265500044 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (Character.isBmpCodePoint(var1)) {
         String var3 = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("uaHFes2MwKt6/h0ggjG0RDtLKusuGoxHc5AFd5CeNVpekwxb+soFIw==");
         Object[] var4 = new Object[Xqedii_2itpe68.Xqedii_2qndzss3kq924(1024121322, 24)];
         var4[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 4)] = var1;
         return String.format(var3, var4);
      } else {
         char[] var2 = Character.toChars(var1);
         String var10000 = Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Yg7m6Z256fp95pndInRGn9r7tpDmIhdccx8BPGUEdPJI5pWJExwFZ0808N5MBCCU1eRYFg==");
         Object[] var10001 = new Object[Xqedii_2itpe68.Xqedii_3iugeeeo59kwm(478803905, 5)];
         var10001[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 20)] = Integer.valueOf(var2[Xqedii_2itpe68.Xqedii_2qndzss3kq924(-1460655257, 18)]);
         var10001[Xqedii_2itpe68.Xqedii_2qndzss3kq924(182053437, 0)] = Integer.valueOf(var2[Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(428687649, 23)]);
         return String.format(var10000, var10001);
      }
   }

   static {
      if ((-2032513965 ^ -2032513965) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2jae8sc = Pattern.compile(
            Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp(
               "79NIWyXmdroHlyPS4agwv0ihTKUJts6ITbebs+PkvoR3GFhMv1WuzLcob+fylRoxk8yEXMCxkyLCvTC7p+WsOZ3DytgU2jci4leNOJp/4+R4J7JGgnO2J4dcwgffArn5q1WcWarBhBVlcFZ1+AxkGVulWPiepuFIfi9vUeBOH7XuRkxULbLBRaQuu5DhtQVWpxJbiQ+bVlG0scOH2IRaIT/ajvl3s1/l73PS2f88oYQ7GM73nU05joBjm9M="
            )
         );
         HashSet var0 = new HashSet();
         var0.add(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Xx2jnwSkE8mcrLQN/6r6wwm4Eqg8XgqNM/hxUeOITj4F5Q=="));
         var0.add(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("1AsvV9wKu+sd73hao729EXNRzeGH+VBIkvHIMAhoWIxYjg=="));
         var0.add(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("RUf5VzT6jrHZCNMaM1+Jkp/S3aftaVEP7YSQKDULKClH4RTk"));
         var0.add(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("EYflpZb34AfTJ1pH7CQKe9g8lEKeJPK/7/TxvBjBbyWYuw=="));
         var0.add(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("6uOuXerUfPHicJFR7YTYf+2i5bBdGDhCzGQ4Km10WAD3TA=="));
         var0.add(Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("KL+LR7/jfvdLmThjxZbCw5N9VkKmFmtJ1oeVz1LrSRpxn18Z"));
         String[] var1 = ImageIO.getReaderFileSuffixes();
         int var2 = var1.length;

         for (int var3 = Xqedii_2itpe68.Xqedii_kjqvpq2ldafx(420299041, 16); var3 < var2; var3++) {
            String var4 = var1[var3];
            if (var4 != null && !var4.isBlank()) {
               var0.add(var4.toLowerCase(Locale.ROOT));
            }
         }

         Xqedii_pi7q4dz = Collections.unmodifiableSet(var0);
      }
   }

   private static /* synthetic */ String Xqedii_26v0bzknu4t8h(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("ha4N2ywqMupJp7VoNyEVFHm71ZV+tgUuaDO9rfNFZUuxofoWpzGtG2WrsZonuZjE+hW/TVBjk7V2DdZhTlDqgOqaIjwzbqoNDud1QYnibnPja1ZtN9JisXVL316VEpV8jMg=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("EKs6ke47rdRDvSlpNXPeJ0cIyp3AthBWnsJ4SFKGPPS86A==") + string2;
    }

    private static /* synthetic */ String Xqedii_3pnhqoz3u9s3c(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("ZAkK3LgZRlfP83drpJS/R7egWXSrZ9b8cILd+Nge1sbRImq31O5XueZrxjGY1UPEW76ghUq91kjuWDMhfows9cNwbSPHOZ+wikLHrUEyKnQPAcEreKASAsy58zPpFOJSikE/Drfs9fzUDJysvZZaXs/M") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("sVkTFfHWJqFIDZvqcQ25tyozwQ04/gq2Wnc6HFyFWHM=");
    }

    private static /* synthetic */ String Xqedii_3uic2k4nmo67k(String string, int n) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc") + n + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("aZgGygq/14N3X+2jXgqtf7TnZpD9mura8vaKnnkiIF0G8cus");
    }

    private static /* synthetic */ String Xqedii_2qt4fvnh3isk5(String string, int n) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc") + n + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("aZgGygq/14N3X+2jXgqtf7TnZpD9mura8vaKnnkiIF0G8cus");
    }

    private static /* synthetic */ String Xqedii_2s7pw19rius57(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Gb4TCAbXQJ11srgzd9uVMuA8T2xqZThfwKARHCwFHEl7uWWaBr/QrunTzeWDakAi1r1qm6X3Klvej8TG7KNr8Ip5aUtbjshoxxFqubnknF43GYb9Emj+Vu0BJmYWgGIRikWUvvr+4lGaRpQ8ExDcYJYFMbL1obOIFCxnNoNwcHW4Aqu2") + string;
    }

    private static /* synthetic */ String Xqedii_276ulliianf8n(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("0MR+CV3mJdoX2IUhMfUuHVMjEXkktVE48+kT8PvIUYAN5pcn2F9lN3tabSOThyA4DgI2FcxCwskYGINJgNOUVk+k8jJP22V2w2TqI8zHQzf4T9+hi0utU4KAEULbZM+vIRV8sC7pLycvf5qa0AgckMoH54eFlqRfT1CfP4NOqkhrbkNn+rxM6Imqtyp36w==") + string;
    }

    private static /* synthetic */ String Xqedii_qbfmparc9pmj(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("/xBHPw3FASCUtsHDFTaog7Oj52LAEY65eLcDKZkyCm6mw85zX5HJyGXPPtFMTvi40wLwV1oMjcPWpAY8MtFjfpDEzkqhCwxxPRQ1PO1j0/Xtq7RoSxJiHeFnfIUIBikDYZ/iGTr1neXVrFiDLFEM2am5HpHiiicBEopemV+BQ1BjSUz+X+Y=") + string;
    }

    private static /* synthetic */ String Xqedii_ai78xbs9iq9l(String string, String string2) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc") + string2;
    }

    private static /* synthetic */ String Xqedii_258r0mb47rmib(String string, String string2, String string3) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("blKKZYf2umJ0DhxJmcBCIf9zbTiyuaWZb8K16rlTMnM6HjXV3Any7WSLQV5cwsp3xfPtaYx3Fvw+rW1edJpyDGw74hdVyqiIyLrSUMEtwFVeAqcAFSe6eeXBmUff8gdpQPjSF+3+aaU=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("voU5UE7jHle0pkyFSc8rscwt6dJcXEEWzqGyC8Fts7UGSnfmORDcTRGXYCpIBMtm") + string2 + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("LzwokB5UGgTp5X1evGGCK4a10jDIzjMTKJ5C3RnhmPxLAtS5tMDD1A==") + string3 + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("9SMnY/5NmnjREqB/CctuNotJkJj/+T1R+2Po2vxz");
    }

    private static /* synthetic */ String Xqedii_8q8noy3zr1k3(String string, int n) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc") + n;
    }

    private static /* synthetic */ String Xqedii_1421ikqj10oct(String string, int n) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc") + n;
    }

    private static /* synthetic */ String Xqedii_2lwdi6stw6j4g(String string, String string2, String string3) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("blKKZYf2umJ0DhxJmcBCIf9zbTiyuaWZb8K16rlTMnM6HjXV3Any7WSLQV5cwsp3xfPtaYx3Fvw+rW1edJpyDGw74hdVyqiIyLrSUMEtwFVeAqcAFSe6eeXBmUff8gdpQPjSF+3+aaU=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("voU5UE7jHle0pkyFSc8rscwt6dJcXEEWzqGyC8Fts7UGSnfmORDcTRGXYCpIBMtm") + string2 + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("LzwokB5UGgTp5X1evGGCK4a10jDIzjMTKJ5C3RnhmPxLAtS5tMDD1A==") + string3 + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("9SMnY/5NmnjREqB/CctuNotJkJj/+T1R+2Po2vxz");
    }

    private static /* synthetic */ String Xqedii_1sg8akn48hfdf(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("TdbqfdwoaiofgFfQ79+51HCNcydBhzo4GN/VD50m5eFRNXxJ0LI8N5ZlVFq9RZWlDMXEO70oq20erF+GB0EsFhsmpJ0sQHY0JXrvTuxp9jKgjrd82gXPPaWUqXX6webuW/okdHN1") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("C1UIIsvA8NvLvqoTiv74u5asaQRTtTb595insPTjPEjgoSJMJi3pKGLArIf0/VOk0sdG4oG8taNVNIKOu24WmI1NtyI3B68k") + string2;
    }

    private static /* synthetic */ String Xqedii_1xky3184ayo26(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("d9ZTTaEEbYXDLP7w9cuSknb9kWO59ZF2BS/24ejP7xnxLe/e7sfawVZhLmFL6y2HGVn5xd4PWrq3GbwJuuVB+yVUYfZoMKjAnm9WL8PGbqqRo6pDK9fe/AWfjFpcjUGKxfJa/3NUFXxHUf0xHvS3uqtm215qkeUc") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("m/lBuhh2W+OLN9HTgRdKyJFyOE56iBczj8i8zUPDhqK1QpGbXnEw4/IZ5s4J8D6Y8W62BnPx0ufnLQb7eAAALW/1aw8DuvWOvJJUyoW2cRI2UuiNRrHJCpzixbXtDg==");
    }

    private static /* synthetic */ String Xqedii_1oxis0ciolfxi(String string) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("aZgGygq/14N3X+2jXgqtf7TnZpD9mura8vaKnnkiIF0G8cus");
    }

    private static /* synthetic */ String Xqedii_rgok6a4z7hk5(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("Da8uwlPfc2MGPyT8hbJ39kGjD8+XfsKxarThsi5wQAIW1SHiPAOAnSnkRBlwIUOIsa3yRZTNYahWwFYZRpGpg8PzrrZSWpWJIMnqKLJrMxHf0No2BrHX246AHD1r0pL82VLnJrRrrRctnmYkdXEeECdfecA=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("EKs6ke47rdRDvSlpNXPeJ0cIyp3AthBWnsJ4SFKGPPS86A==") + string2;
    }

    private static /* synthetic */ String Xqedii_2l1s8ebl2pmfw(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("aUNE7cdVp0hR3uo1AhG0ifJuUbl9dfWX2F+TtkTWD0IdP6SxXta0lsBsyfz/DtQwM9GaWYhi+t0zZjt5z2rF9yEoKc/BwkTnZBUw7A==") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("yfoYKyP+Q1l6vVHjcO4EaTIC0EPQPu51Pf+cPr1wGxbfSTfTMQBOUJdE/T1ni4s5YJJKeBaXpfCkypiU0z4aSOVVAjvqwhJmGFwyy1QiG3Myi6AD61I9R/JiJjxEq36k5aAotyFxl9A65mX03Udx0s0+kNqYjOwm2HzaOw==");
    }

    private static /* synthetic */ String Xqedii_aoyt7f6y1jaj(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("2ftgikJ4zEfiq8MEHgw/tteAyXB/TSSRYV+vcT0Zv6s1QVDS6rjw6inP6q8MVwVvGlZg6pkVdkPEvEqjvBho+Yvc0G9lNmI3vjizcywk1OoQ3+jc/YM=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("+NwcdONm2ovBlCMlMRjt7rHOQOrkWV1Jq293fDTGMe8FNVQaMcZAqQ==") + string2 + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("sVkTFfHWJqFIDZvqcQ25tyozwQ04/gq2Wnc6HFyFWHM=");
    }

    private static /* synthetic */ String Xqedii_98lx2t4ot9xk(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("35zITnbVQdQOxqEIrM+ct4SHMaKKVW4We9G2rkNHA4yofDabDrJZG3X8tolhmu6aDgvKt7Y+yvOJqBCBTBZBkNGWHuB3ClZX95XkoA4yhxWCMwvQELCUE3kVuyrlQUvZ4yDxZCjaORpJ8J3B6h4=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("+NwcdONm2ovBlCMlMRjt7rHOQOrkWV1Jq293fDTGMe8FNVQaMcZAqQ==") + string2 + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("sVkTFfHWJqFIDZvqcQ25tyozwQ04/gq2Wnc6HFyFWHM=");
    }

    private static /* synthetic */ String Xqedii_4a7xmad7xsvb(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("pVuATD6lIu4WEHp8PLqvaK9tXuvF41Hil4JE1pBb5o78kIG7OJcrK5YTQ5pSbR80tKJ+AiciFo6SZmSiuPXGTylpz6JDa7KC+YiVaD9AWZmBIlU6HIMdJVjUy9ep/DDzu9dlrJP0LEWai/CDKNS0xw1/XM/m+btM7yBu0qZhoAs=") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("EKs6ke47rdRDvSlpNXPeJ0cIyp3AthBWnsJ4SFKGPPS86A==") + string2;
    }

    private static /* synthetic */ String Xqedii_38ztl35dkkdrl(String string, String string2) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("9SMnY/5NmnjREqB/CctuNotJkJj/+T1R+2Po2vxz") + string2;
    }

    private static /* synthetic */ String Xqedii_1cqb4mpe5nrbu(String string, int n, String string2) {
        return string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("NSSj1IbggiIaNtxZ/LU0ZpGzd/562tMmARIekpPc") + n + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("9SMnY/5NmnjREqB/CctuNotJkJj/+T1R+2Po2vxz") + string2;
    }

    private static /* synthetic */ String Xqedii_33afhzhtidchh(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("r6HcioqGkrOpdVgETlqvIkwH50JxyRmqR7+M+24qE0UQf1Kg6rqfM/kRdPN4xXC0TcSmSNZlRopPQa3dhwQ97h50AQomMARoV3JjpRuZlKvhCQgIv4ppHqwAk/DjE8D0sAeIfr0Sm6uWtAluVhMhZA2dxAS5FrOAZlfqNe5X+xchFRGTs8R7lIYD3T4=") + string;
    }

    private static /* synthetic */ String Xqedii_epp9yhdp0hwo(String string, String string2) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("DnOkmm+AFk99Z6lDWugtEaJfz5+kGosmr2HGa8a6zXv2snocduyd7AtDugqFiqvvA148Rng62WZXlFA6Nar/rE5uFANuqm6hIo+1SJrqcqafcNY7P84m188hoXTlWHK1qOc0Pfs31fcDO47jj4pPImWjXbyjIw==") + string + Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("EKs6ke47rdRDvSlpNXPeJ0cIyp3AthBWnsJ4SFKGPPS86A==") + string2;
    }

    private static /* synthetic */ String Xqedii_1x3ecg2wj70z2(String string) {
        return Xqedii_2itpe68.Xqedii_2a46zfnvqsfcp("52Gh/AyT0zsxyASlT2MjLDGYKb4KVPdk8ATRurLOEstjC7tEdkMCq+VouhgYE54QiJz0PGYIeK1rQZOY35Ct5SaQZeBWjkGCEi3FzWED+2+d7f0Fcn3dxjvitTA9GZWeVBkXRVvohrmHAJcLp3K9Y8XpNL2ethNZx6WwvEjy") + string;
    }
}
