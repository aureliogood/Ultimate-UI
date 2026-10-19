package dev.xqedii.ultimateUI;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class Xqedii_3ul4hqj {
   public static final String Xqedii_2ck2nruvxk4il = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_3qsbcgb = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48(
      "cFdbBJkUa6S5dGJlat9+nQgfwwfaw0/8dnQau4vCfs6TvHlC31Nmx9wHWXAfqtoCqMVOcdp3n5oMu58IVoOCAsLvfEHhwZAnS8NyzvuvYhpZIlCVhJgTIuRNn78="
   );
   public static final String Xqedii_2cy65kl = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("W+UYC3DIeo3jdoWuN8O924Sb9lI/ATC6Sm8/6tmlV3l1RMaG51jpMg==");
   public static final String Xqedii_2xr5bac = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("QIIZWSPo1GsPm5KR0YshMVd5dkbDWV37Q0gWBcyaWedwnp3lfdcnxyWz");
   public static final String Xqedii_2qngjkz = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("CabkFSKnWRT4hoCahDnlwdh81/YaE8h+k85W1jV+MQTceOWY1ACNxx8bNDNteA==");
   public static final String Xqedii_captcr4 = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("fJREqzBWpSUhGTu6e8nTNzeILjDT6y6pjrluKbyP6POvbjd+l2hy5h/3BlSAcaWU");
   public static final String Xqedii_19v365c = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("6XxMGWqAtcvVV0VVJkUGNqD584ItlFHYdn3KNferqxnZUxl+5js=");
   public static final String Xqedii_1m0xcyu = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("GXlzYnOdNScxMSvakwmktiXAJj4lfETiAR8j4z37ASs4A7C4WLMJiF5LlqRJHQ==");
   public static final String Xqedii_30yr00v = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("umpz7upT4MSfb+bqK3E3yzVAYxX1nTGLJDifA7qafu8Lxnc1j0Gt0sMcGY2d1g==");
   public static final String Xqedii_3gbh8yk = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("KwWXgEBOHGcd9omwuy8yBzy8Q4jWZktCaOGdcD4E+av8Nf0Bg95vSM8ZuV3FYQ==");
   public static final String Xqedii_2givc6j = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("4AP9FfymWQZDdaUkQGJHNLMA+DSTOgxztEQYoPMTIUujRu2CfbZ1pTZE5PzPfA==");
   public static final String Xqedii_1bk481m = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("892F8Di7o+Nm88GtY31YZHxSRsjEmGcLlbtKc5mFZVEh2lLiskREOIYL2YehtA==");
   public static final String Xqedii_2ujfr0a = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("A3hw06ukjZDFv9Ymwb/+GjCysKrXCkL9NyoVyK2Wd4uuy0+8yAfNJj/PzGMd6w==");
   public static final String Xqedii_2t8y7jv = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("aIqWolcZsyF7CsWVmYsvctchE+XJ4pCJh8/HiEWOTixprtkBDHqyij+sgoo+gw==");
   public static final String Xqedii_sqxedp9 = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("6OhYzKd8nQDWQTPZzBlUoSXEEqTvAghs9k2y0uusga6j/y8nK1+pRZEKdGBcLA==");
   public static final String Xqedii_2eyrvx1 = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("1h/UiQZCLY2YJ7KPkVkMwqyN+GhoQw+C4A9pfKbBKY8Mwm60TeeoNi9Fb80=");
   public static final String Xqedii_35ze87k = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("TV4qyIiLwitQWdn9c8Ziz+bSM5WdMWWFJtKWHJ+4UIuA08uuBx2N9w==");
   public static final String Xqedii_3rdl2av = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("WekEpy1H/mIreRVbgkWjKgC3ip94JuPAoK89mQ3m/LLQURKUAjakQ2v1b3ZlKA==");
   public static final String Xqedii_132n5z4 = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("YkwhyycHrSivpvJerCiUim0cnP6h2kSjvESVkkvppIfyXlG8qYbjKT2DdzwCCg==");
   public static final String Xqedii_29evyik = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("uiA5npKj3v9sf/rWDA1eiMVSvPFF+O/sPOJnFQQwOvFDs/nYusHbLhN2gzMUow==");
   public static final String Xqedii_8iyi9im = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("RH/f+UoyfPKPAu6So9ctakx1YtWOegWrTJoqHfU2wHkbKKqCjVt/y3WjyunMFQ==");
   public static final String Xqedii_21u2t0l = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("fCBVbHAqAqKkf2Agwb6OPMVow+tRD05pUc3L2f1renGxFI+oNAa+QbPZSP63gw==");
   public static final String Xqedii_3fkc5er = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("sSUg2A0eM0jWquB3VOgn4ODOjs/wFIf4ZKRxKpXptsCyKLPrg+ALkNbc/d+H0eD7ifIniw==");
   public static final String Xqedii_2vwneop = Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("W+UYC3DIeo3jdoWuN8O924Sb9lI/ATC6Sm8/6tmlV3l1RMaG51jpMg==");
   public static final MiniMessage Xqedii_1xf01n6;
   public static final Pattern Xqedii_a6gwqw9;
   public static final Pattern Xqedii_a3rwliv;

   public static String Xqedii_1t2nnko(String var0, Object... var1) {
      if ((64802932 * 64802932 + 64802932 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_12ukznmnnhdw3(
            Xqedii_3ck0mct(
               var0,
               Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("umpz7upT4MSfb+bqK3E3yzVAYxX1nTGLJDifA7qafu8Lxnc1j0Gt0sMcGY2d1g=="),
               Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("6XxMGWqAtcvVV0VVJkUGNqD584ItlFHYdn3KNferqxnZUxl+5js="),
               var1
            )
         );
      }
   }

   public static String Xqedii_1wtk0rm(String var0, String var1) {
      if (((1142943804 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var1 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var1.trim();
         return Xqedii_gq77ff0nfkc2(
            Xqedii_1u4gly2(var0),
            var2.isEmpty() ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : Xqedii_3s5smxf8mz45e(Xqedii_1u4gly2(var2))
         );
      }
   }

   public static String Xqedii_33qmw8k(String var0, Object... var1) {
      if (((-1649051549 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1ytlef5gbxiji(Xqedii_2d5sc5r(var0, var1));
      }
   }

   public static String Xqedii_9qy68nj(String var0, Object... var1) {
      if ((-16572385 * -16572385 + -16572385 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1pmxym4lkd2o3(Xqedii_2d5sc5r(var0, var1));
      }
   }

   public static String Xqedii_2d5sc5r(String var0, Object... var1) {
      if ((-962993600 * -962993600 - -962993600 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3ck0mct(
            var0,
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("E94vviU8MqQtPHbYGiuF9CGY7nm6yfwBcRc5uLSuz3L2OrqC7qkTTfdfyCkKslT+rCVg8kM6OcZn7Q=="),
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("gtB+SjzdAm1qL5S0K4buKGtq2rnaSzQbnlzc30heaKZ4OUjniwK00qMCnA4ez/nlB6wCWvjG+3s14BAh"),
            var1
         );
      }
   }

   public static String Xqedii_2iiyx7k(String var0, Object... var1) {
      if ((1192519514 ^ 1192519514) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1btp05xrgfsq7(Xqedii_28d1izo(var0, var1));
      }
   }

   public static String Xqedii_28d1izo(String var0, Object... var1) {
      if ((407186423 * (407186423 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3ck0mct(
            var0,
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("6OhYzKd8nQDWQTPZzBlUoSXEEqTvAghs9k2y0uusga6j/y8nK1+pRZEKdGBcLA=="),
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("aIqWolcZsyF7CsWVmYsvctchE+XJ4pCJh8/HiEWOTixprtkBDHqyij+sgoo+gw=="),
            var1
         );
      }
   }

   public static String Xqedii_39ytrlf(String var0, Object... var1) {
      if ((-518548811 ^ -518548811) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2oeqyjzg2c24q(
            Xqedii_3ck0mct(
               var0,
               Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("TV4qyIiLwitQWdn9c8Ziz+bSM5WdMWWFJtKWHJ+4UIuA08uuBx2N9w=="),
               Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("1h/UiQZCLY2YJ7KPkVkMwqyN+GhoQw+C4A9pfKbBKY8Mwm60TeeoNi9Fb80="),
               var1
            )
         );
      }
   }

   public static String Xqedii_l0arb10(String var0, Object... var1) {
      if (((-1744030657 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3ck0mct(
            var0,
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("fCBVbHAqAqKkf2Agwb6OPMVow+tRD05pUc3L2f1renGxFI+oNAa+QbPZSP63gw=="),
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("RH/f+UoyfPKPAu6So9ctakx1YtWOegWrTJoqHfU2wHkbKKqCjVt/y3WjyunMFQ=="),
            var1
         );
      }
   }

   public static String Xqedii_1oxsv35(String var0, String var1) {
      if ((508271839 ^ 508271839) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_381q7nlq2p3il(Xqedii_1u4gly2(var0), var1 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var1);
      }
   }

   public static String Xqedii_15zzeiq(String var0, String var1, String var2) {
      if ((-1055231608 * -1055231608 - -1055231608 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var1 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var1.trim();
         return Xqedii_8tjdnpso8yf7(
            Xqedii_1u4gly2(var0),
            var3.isEmpty() ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : Xqedii_3tr45ird3s89c(Xqedii_1u4gly2(var3)),
            Xqedii_1u4gly2(var2)
         );
      }
   }

   public static String Xqedii_2133eaa(String var0) {
      if ((738959170 ^ 738959170) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_dinuxvlounm(var0 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var0);
      }
   }

   public static void Xqedii_2dtmver(CommandSender var0, String var1, Object... var2) {
      if ((900600284 * (900600284 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_uawesb0(var0, Xqedii_1t2nnko(var1, var2));
      }
   }

   public static void Xqedii_2olsc6h(CommandSender var0, String var1, String var2) {
      if ((834329004 * 834329004 - 834329004 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_uawesb0(var0, Xqedii_1wtk0rm(var1, var2));
      }
   }

   public static void Xqedii_2pfjv2g(CommandSender var0, String var1, Object... var2) {
      if ((1456745602 * 1456745602 + 1456745602 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_uawesb0(var0, Xqedii_33qmw8k(var1, var2));
      }
   }

   public static void Xqedii_3458djb(CommandSender var0, String var1, Object... var2) {
      if ((-513789858 * -513789858 - -513789858 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_uawesb0(var0, Xqedii_9qy68nj(var1, var2));
      }
   }

   public static void Xqedii_3m0zjou(CommandSender var0, String var1, Object... var2) {
      if ((-780281941 * (-780281941 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_uawesb0(var0, Xqedii_2iiyx7k(var1, var2));
      }
   }

   public static void Xqedii_1o0kice(CommandSender var0, String var1, Object... var2) {
      if (((-1184255079 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_uawesb0(var0, Xqedii_39ytrlf(var1, var2));
      }
   }

   public static void Xqedii_2g7xq9b(CommandSender var0, boolean var1, String var2, List<String> var3) {
      if ((-161064292 * -161064292 + -161064292 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var4 = new ArrayList();
         var4.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         var4.add(
            Xqedii_21smlc7tmfjrm(
               var1
                  ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("psXK4jyOvu4w2BGpeyoFwHbDlUisNQAtOMV/WVo/x4k=")
                  : Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("+GLoE2Ah0e/tuggCJu2Sa0xFpIMbPdTXHRIN5Qkkn0Y="),
               var2
            )
         );
         if (var3 != null) {
            for (String var6 : var3) {
               var4.add(Xqedii_3bxo4q2r6qdlp(var6));
            }
         }

         var4.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         Xqedii_28gzcxq(var0, var4);
      }
   }

   public static void Xqedii_wmipi15(CommandSender var0, String var1, List<String> var2) {
      if (((-1419324254 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         var3.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         var3.add(Xqedii_1ifzj8n5pkiiy(var1));
         if (var2 != null) {
            for (String var5 : var2) {
               var3.add(Xqedii_3e6hggsaawfk5(var5));
            }
         }

         var3.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         Xqedii_28gzcxq(var0, var3);
      }
   }

   public static void Xqedii_3crurrx(CommandSender var0, String var1, List<String> var2) {
      if ((385016083 * (385016083 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         var3.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         var3.add(Xqedii_2doybf64ejo1s(Xqedii_1u4gly2(var1)));
         var3.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         if (var2 != null) {
            var3.addAll(var2);
         }

         var3.add(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
         Xqedii_28gzcxq(var0, var3);
      }
   }

   public static void Xqedii_uawesb0(CommandSender var0, String var1) {
      if ((417131597 * 417131597 + 417131597 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1cxddb0(var0, Xqedii_1xf01n6.deserialize(var1 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var1));
      }
   }

   public static void Xqedii_1cxddb0(CommandSender var0, Component var1) {
      if ((-123576271 ^ -123576271) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         if (!(var0 instanceof Player)) {
            var0.sendMessage(PlainTextComponentSerializer.plainText().serialize(var1));
         } else {
            Xqedii_nd6rkr3.Xqedii_3s7zz34(var0, var1);
         }
      }
   }

   public static void send(CommandSender var0, Component var1) {
      if ((1714384416 * 1714384416 + 1714384416 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1cxddb0(var0, var1);
      }
   }

   public static void send(CommandSender var0, List<Component> var1) {
      if (((-1427167959 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null && !var1.isEmpty()) {
         if (var0 instanceof Player) {
            Xqedii_nd6rkr3.Xqedii_3s7zz34(var0, Component.empty());
            Xqedii_nd6rkr3.Xqedii_3s7zz34(
               var0,
               Xqedii_1xf01n6.deserialize(
                  Xqedii_2quc4wr.Xqedii_g5sua0kc5i48(
                     "x3n1nwj/O8We+mU6GH4Fxsf4WFmYjnR6InPIeWeC4LdeXZayxYgWaUVbSQntsuAzhSvna9JLETHY/0D7jiceo2DhcqOy3wMlE5tOnswHP0OiI03kqNMIUL75/cxd/A=="
                  )
               )
            );
            Xqedii_nd6rkr3.Xqedii_3s7zz34(var0, Component.empty());

            for (Component var5 : var1) {
               Xqedii_nd6rkr3.Xqedii_3s7zz34(
                  var0,
                  Component.text(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("KvbG6wgOlHrh7DpDi+zeh9FoO97ckH16+irLVpzb"))
                     .append((Component)(var5 == null ? Component.empty() : var5))
               );
            }

            Xqedii_nd6rkr3.Xqedii_3s7zz34(var0, Component.empty());
         } else {
            for (Component var3 : var1) {
               var0.sendMessage(PlainTextComponentSerializer.plainText().serialize(var3));
            }
         }
      }
   }

   public static void Xqedii_28gzcxq(CommandSender var0, List<String> var1) {
      if ((857715420 * 857715420 - 857715420 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         boolean var2 = var0 instanceof Player;

         for (String var4 : var1) {
            Component var5 = Xqedii_1xf01n6.deserialize(var4 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var4);
            if (var2) {
               Xqedii_nd6rkr3.Xqedii_3s7zz34(var0, var5);
            } else {
               String var6 = PlainTextComponentSerializer.plainText().serialize(var5);
               if (!var6.isBlank()) {
                  var0.sendMessage(var6.trim());
               }
            }
         }
      }
   }

   public static String Xqedii_3ck0mct(String var0, String var1, String var2, Object... var3) {
      if ((314206391 * 314206391 + 314206391 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var4 = var0 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : var0;
         if (var3 == null) {
            return var4;
         } else {
            for (int var5 = Xqedii_2quc4wr.Xqedii_xmq0ear5b8v2(566814689, 24); var5 < var3.length; var5++) {
               var4 = var4.replace(Xqedii_35euv518d4pug(var5), Xqedii_1yk7ezerwh4um(var1, Xqedii_1u4gly2(String.valueOf(var3[var5])), var2));
            }

            return var4;
         }
      }
   }

   public static String Xqedii_2emodor(String var0) {
      if (((-484415181 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isEmpty()) {
         Matcher var1 = Xqedii_a3rwliv.matcher(var0);
         StringBuilder var2 = new StringBuilder(var0.length() + Xqedii_2quc4wr.Xqedii_xmq0ear5b8v2(160319295, 19));

         while (var1.find()) {
            var1.appendReplacement(
               var2,
               Matcher.quoteReplacement(
                  Xqedii_y6c5i7x(
                     Character.toLowerCase(
                        var1.group(Xqedii_2quc4wr.Xqedii_xmq0ear5b8v2(2115120270, 12)).charAt(Xqedii_2quc4wr.Xqedii_29f3a9wyxfc9w(-109475518, 18))
                     )
                  )
               )
            );
         }

         var1.appendTail(var2);
         return var2.toString();
      } else {
         return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==");
      }
   }

   public static String Xqedii_y6c5i7x(char var0) {
      if (((-847671609 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return switch (var0) {
            case '0' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("AAbVT4XY00nNOEW4qolo8YqCj3uTEVLRau3X6mqqi2Bb0bYKlu473hVh4YVLT0fT6XP28pXw3vQ=");
            case '1' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("0cCsA6QK4U1F3UuN2HtnobKWwki3w+/OzbsPraEz8l4cfWiRoIahvynTEsN0ugu/lDvHRL3Ta0EZ7zaH2CZDjw==");
            case '2' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("3lMTw88bj8PCFabaAAL8okKV2LytR5sKJr/XyNg/SRMC8GVcQR8mYXdABx6FFtCYKsgcGodaZ2hEmHO5JwISUmzI");
            case '3' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("DbGI1M51LMAgtspDEtKr9IuqSI1q6am7QQwdVQvetFa2z82xl/Ok9cxviZgUzDsvypMafYCEcQtxHQzweumSpQ==");
            case '4' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("7vDvhy/UH09ylp3Jh/vIl7cJeHy2Fa15e2191VN7UNeDJi65LYIiJ8fT0EmBk5KU7oi8RFAOfNzDcWISYLE=");
            case '5' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("l0Z9MsoFpBS74OO4VPkM17X33MJejBw2UuuWhhS3/WAqhME3iXDz2T7GphKUrgYdVIy1Z9LqCG4mjqUGpoFHHJc8p3E=");
            case '6' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("LRqrp9wpjfEUs317YqQKF1agH35ffJdbhvw/+heuWFPg1z/i/qI5Q1Zhpc5eY7XDOdoeU801");
            case '7' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("eCpXGG4HsvhSDIEB2eFFOpwsBfE0+/mYUoGLWA5lEeHzjWvQHIHsdexZg6f90qOm7e3xPnYE");
            case '8' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("lQSNuX0a2ZkJk7zAibnhpdBgsvHbANMgNPdiZqQbKh7ZuFzHXZgzN+M5iFMvanyTKe5PR06+1W82w+fGfXic5g==");
            case '9' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("ZPzjCDm5bJ7RDIZ4XPToyv7QAXT/MJPpiDQ4vnhjfM6qxoX+h+bkXes/VW8HvdX7gwJ28SX9");
            default -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("21REoAelOXSyoX61lRg3aXyuFNmdCcAkjbHBb25ffVx2yPWZAyPST915");
            case 'a' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("0JH2AjHod1pGnoSO+ej0owPR77OLaGJeE2UV7F9JiBLUAKx24k8C/G8RPUn10ZZVO4+bali6iiE=");
            case 'b' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("kzrP2cWH0XK5eB7hrZiQOuZdQy0RRm9BBTaucnn2kD7HCOzuRdhUnA1f2jLFMnztunHLnt5H");
            case 'c' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("dgaPIMB4yRAP32JRnAaLynpbaf9ernj0EHOVawbk/pEPwfICUwHAgc9dq4cjPB79iWCuNg==");
            case 'd' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("uok3+Ufi9NM8tvzqObqYhKxrVIbdm9Te2CzlvRQnSRo41ozAbqxnIapU/0w3EfxjGFac/9VeioxEi8oUB9fUhLXLzqHjfQ==");
            case 'e' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("77sKLRWC7p+Mm9jDfh9EiwCV7sUBAlYOkGcvGnnxDhqdJ2LxWSoCEU0DBcq/ilZuhW8OawxJfuzPNw==");
            case 'f' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("/8kYuEZMPJj+OkkjLUxWNw7LbghIpO47kGWTiYTE2dMjhyUlO4tekci02oLiLBhchpSWqQX2eNs=");
            case 'k' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("hBytdKfvKl/PEQSmL3yhcRnJDYPQAz78JFU/l45Eb0iXEZR2Kb1713FmEzScnq8hsUUtTA==");
            case 'l' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("PfOS/pBop9pbtVXGrkKcS58Jpfh3/m7eINfaIGEgVpWuYa+AMKPw5w==");
            case 'm' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("BkSwbDXkbXlEOgXJw9eszMMhV0MywgW2stOgGykANq7x1NsylSZGIfiwDXLsfjl1k3uQxbwfctyt3Q==");
            case 'n' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("YyaLi69ZqyXabK2qC9D8/zsTyfIqTP13/jVx6D/7dni9MQlTAGji7XHkfbI2Uoj89p4S1g==");
            case 'o' -> Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("XchJH8LrqUZRZfIcLciouC3AlLj9NSWm8Kx6lCpXb8lqafpNcHOshmhis3g=");
         };
      }
   }

   public static String Xqedii_1u4gly2(String var0) {
      if ((58886832 * (58886832 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 == null ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==") : Xqedii_1xf01n6.escapeTags(var0);
      }
   }

   public static String Xqedii_2qnwa4c(String var0) {
      if ((-212728029 ^ -212728029) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 == null
            ? Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q==")
            : Xqedii_a6gwqw9.matcher(var0).replaceFirst(Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("yOCD2hn6nKNNNhiJt3KDbb+cXkgQc3I4uEoc2Q=="));
      }
   }

   static {
      if ((308396022 * 308396022 - 308396022 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1xf01n6 = MiniMessage.miniMessage();
         Xqedii_a6gwqw9 = Pattern.compile(
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48(
               "+dHCV+L79DTHIj2C6tTFcX4/E8w2JHoYO7OKX/rQJ2LCD2mnyipKDGBokFjECHx1lsn4impqj4TDTzNSls2NRzlw7TY+5acxrtr+AiuOVKjIpgkkUjRYJpOH/kvtX1ZdQP4B5gjAA/D6/dI58E6XQqGyLg8u3AxaN9o0DhsheaQ="
            ),
            Xqedii_2quc4wr.Xqedii_lvtadniowbg5(1553347290, 28)
         );
         Xqedii_a3rwliv = Pattern.compile(
            Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("6t0DYUoR4z/4qCU7DvZGSuoenr+KqHNV0yPP81smK3hBX7RWLD/pHhCeV5IXJk5eQDcXlno8aArR3FyVcpNqg0I8PEk1il5gneCEjHCs")
         );
      }
   }

   private static /* synthetic */ String Xqedii_12ukznmnnhdw3(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("6XxMGWqAtcvVV0VVJkUGNqD584ItlFHYdn3KNferqxnZUxl+5js=") + string;
    }

    private static /* synthetic */ String Xqedii_3s5smxf8mz45e(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("m7GYLEuzQvc9Lsq2sSZSMe6zOBO1CXb6tdBe6oQqaP8jK26cuLk4XY2/XcWd2Hij") + string;
    }

    private static /* synthetic */ String Xqedii_gq77ff0nfkc2(String string, String string2) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("aJMs0/98o6PnLIIuF3OPDgN11PlFBDBdm37q+mTltIwMHKi04KAbrxkHYNKKp+An0llyaXozDyqIevHqgo4LrShVd3Mi4snkCrfaFVfnACEibHWQJVQ=") + string + string2;
    }

    private static /* synthetic */ String Xqedii_1ytlef5gbxiji(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("Vge1fisfLyhxZG9N3a8QG74iLJ+znpNhRVQPZrF/O4u1Txv++tZ+XGxdKDg5IyW9XoUgfYBBh6xUF2Zg7xjp/wz+rdI=") + string;
    }

    private static /* synthetic */ String Xqedii_1pmxym4lkd2o3(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("wvWhT6K26CodxSQhdr0woRFLBEAEbQHVQ9Q5X9fI42BPnfyvABoGAoHuong8t2jA6WFYZfoy76ZVOvqY3sB1+c7tAtM=") + string;
    }

    private static /* synthetic */ String Xqedii_1btp05xrgfsq7(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("aIqWolcZsyF7CsWVmYsvctchE+XJ4pCJh8/HiEWOTixprtkBDHqyij+sgoo+gw==") + string;
    }

    private static /* synthetic */ String Xqedii_2oeqyjzg2c24q(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("1h/UiQZCLY2YJ7KPkVkMwqyN+GhoQw+C4A9pfKbBKY8Mwm60TeeoNi9Fb80=") + string;
    }

    private static /* synthetic */ String Xqedii_381q7nlq2p3il(String string, String string2) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("wS0Pjoaw+NmywLFco2EuMu9+pBdIPnxO02H8JElykaEKebiqSv4mn5XHegtf/Hls") + string + Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("tT8S1yta7ukIfDJlypnHDkX29L8bb7EaU199zeZU2elULK+Ojm95EZ1wQ+mfPyKM+yI=") + string2;
    }

    private static /* synthetic */ String Xqedii_3tr45ird3s89c(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("cYc3ejYQZOFeX8IxrwYBEuciVCjfXWcLC2SCbYNpgjVrYiJg/FQQ0BYf7zhXEwCb") + string;
    }

    private static /* synthetic */ String Xqedii_8tjdnpso8yf7(String string, String string2, String string3) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("wS0Pjoaw+NmywLFco2EuMu9+pBdIPnxO02H8JElykaEKebiqSv4mn5XHegtf/Hls") + string + string2 + Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("QqnoBN16MVqTTQC3aEfehj2FQ8RDECJfEY3QYlf7j52sEPAaO/K/DuHN8wgLPwIjT4wUVDRI1Di35grOS40w4cueoFQ=") + string3;
    }

    private static /* synthetic */ String Xqedii_dinuxvlounm(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("2/FBywmUY/CV7EDtq8YgwV60SMLM5KOWhndXml4NqAqN6tmbjuiQ+4UkZIFtHjcCU2nWZ0G94jedPYtIDus+OFxLOcnDiw==") + string;
    }

    private static /* synthetic */ String Xqedii_21smlc7tmfjrm(String string, String string2) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("gm8v3/Z1lfjlSr9kYWjo4sM4LRv0BTR4Jjvq2BTC5sK8O6M6H+KFGxdt7Rywxa68") + string + Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("4AP9FfymWQZDdaUkQGJHNLMA+DSTOgxztEQYoPMTIUujRu2CfbZ1pTZE5PzPfA==") + string2;
    }

    private static /* synthetic */ String Xqedii_3bxo4q2r6qdlp(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("uiVfPs9TzXwTufTkl42kposvgFflELUj8MXl6Ycv+lOTcfWFycZao7v51pYenOH2KJYLgqyqkeWt/PfMUItge7cGfaC3CG4O") + string;
    }

    private static /* synthetic */ String Xqedii_1ifzj8n5pkiiy(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("H3O4jO4n9RwecvpU+CeHIxhIA0qKI6R9VAwg3fQPOUgfO7f2UDUhWqQUWVUJCdscsXjvy21wIBEvaAg7HewAxKAInQ3HOQ==") + string;
    }

    private static /* synthetic */ String Xqedii_3e6hggsaawfk5(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("zG6XusQVvWX0PapZRxfg3QNLfZYqGxe+IRgizxBmC1rfeM82ClwCnKHg/Umcv7XG8gdGEBHTGjbJ7HwSsBTD0Yl+UX9OVhmP") + string;
    }

    private static /* synthetic */ String Xqedii_2doybf64ejo1s(String string) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("SL9OBSK5LOo1q1B0mdi1oEil4lMO9bEBAlRb0FQ4AZryD/x53HTJ0IYG5gD7mNMWD7nIUPtHWm7t84qA") + string + Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("Eh7HBQk95yMC8HNpEiXsgE+IpELxbEmpqXpvChwMfHYDL44O+UF8aIDv");
    }

    private static /* synthetic */ String Xqedii_35euv518d4pug(int n) {
        return Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("nJdrA02583vNZLgCCnfLtyI0QuCOZUGjDJ11ciar") + n + Xqedii_2quc4wr.Xqedii_g5sua0kc5i48("0jhvD7hnxdDOfF3PzVNglfy0Cv5JDR4iSIMkD5+W");
    }

    private static /* synthetic */ String Xqedii_1yk7ezerwh4um(String string, String string2, String string3) {
        return string + string2 + string3;
    }
}
